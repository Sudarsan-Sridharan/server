package org.nasdanika.cdo.web.doc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.core.CoreUtil;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.LinkGroup;
import org.nasdanika.html.Tag;
import org.nasdanika.html.Tag.TagName;
import org.nasdanika.html.UIElement.Style;

public class EPackageDocumentationGenerator extends EModelElementDocumentationGenerator {

	public String generate(
			HTMLFactory htmlFactory,
			String docRoutePath,
			String registryPath,
			EPackage ePackage) {
		
		// TODO - path?
		Tag packageIcon = htmlFactory.tag(TagName.img)
				.attribute("src", docRoutePath+"/resources/images/EPackage.gif")
				.style("margin-right", "5px");
		
		Fragment ret = htmlFactory.fragment(htmlFactory.title("EPackage "+ePackage.getName()));
		ret.content(htmlFactory.tag(TagName.h2, packageIcon, ePackage.getName()));
		ret.content(htmlFactory.div("<B>Namespace URI:</B> "+ePackage.getNsURI()));
		String doc = getModelDocumentation(ePackage);
		if (!CoreUtil.isBlank(doc)) {
			ret.content(htmlFactory.div(doc)
					.addClass("markdown-body")
					.style("margin-top", "10px")
					.style("margin-bottom", "10px"));
		}		
				
		EPackage eSuperPackage = ePackage.getESuperPackage();
		if (eSuperPackage!=null) {
			ret.content(htmlFactory.div("<B>Parent:</B> ", htmlFactory.link("#"+registryPath+"/"+Hex.encodeHexString(eSuperPackage.getNsURI().getBytes(/* UTF-8? */)), packageIcon, eSuperPackage.getName())));			
		}
		
		// TODO - annotations
		// TODO - sub-packages
		
		String packagePath = "#router/doc-content/"+registryPath+"/"+Hex.encodeHexString(ePackage.getNsURI().getBytes(/* UTF-8? */));
		List<EClassifier> pClassifiers = new ArrayList<>(ePackage.getEClassifiers());
		Collections.sort(pClassifiers, new Comparator<EClassifier>() {

			@Override
			public int compare(EClassifier o1, EClassifier o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		LinkGroup classList = htmlFactory.linkGroup();
		LinkGroup enumList = htmlFactory.linkGroup();
		LinkGroup dataTypeList = htmlFactory.linkGroup();
		
		for (EClassifier eClassifier: pClassifiers) {
			if (eClassifier instanceof EClass) {
				classList.item(eClassifier.getName(), packagePath+"/"+eClassifier.getName(), Style.DEFAULT, false);
			} else if (eClassifier instanceof EEnum) {
				enumList.item(eClassifier.getName(), packagePath+"/"+eClassifier.getName(), Style.DEFAULT, false);				
			} else {
				dataTypeList.item(eClassifier.getName()+" ("+eClassifier.getInstanceTypeName()+")", packagePath+"/"+eClassifier.getName(), Style.DEFAULT, false);				
			}
		}
		
		Tag classIcon = htmlFactory.tag(TagName.img)
				.attribute("src", docRoutePath+"/resources/images/EClass.gif")
				.style("margin-right", "5px");
		
		Tag enumIcon = htmlFactory.tag(TagName.img)
				.attribute("src", docRoutePath+"/resources/images/EEnum.gif")
				.style("margin-right", "5px");
		
		Tag dataTypeIcon = htmlFactory.tag(TagName.img)
				.attribute("src", docRoutePath+"/resources/images/EDataType.gif")
				.style("margin-right", "5px");
				
		// TODO - group, icons, sort by name
		if (enumList.length()>0) {
			ret.content(htmlFactory.collapsible(Style.INFO, enumIcon+" Enumerations", false, enumList));
		}
		if (dataTypeList.length()>0) {
			ret.content(htmlFactory.collapsible(Style.INFO, dataTypeIcon+" Data types", false, dataTypeList));			
		}
		
		if (classList.length()>0) {
			ret.content(htmlFactory.collapsible(Style.INFO, classIcon+" Classes", false, classList));
		}				
		
		return ret.toString();		
		
	}

}
