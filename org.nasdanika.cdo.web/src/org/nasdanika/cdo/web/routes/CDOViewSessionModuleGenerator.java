package org.nasdanika.cdo.web.routes;

public class CDOViewSessionModuleGenerator implements org.nasdanika.cdo.web.routes.Generator {


  protected static String nl;
  public static synchronized CDOViewSessionModuleGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    CDOViewSessionModuleGenerator result = new CDOViewSessionModuleGenerator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "define([\"q\"], function(Q) {" + NL + "" + NL + "\t";
  protected final String TEXT_2 = "/**" + NL + " * " + NL + " * @param original Original array" + NL + " * @param modified Modified array" + NL + " * @param oIdx Original array index" + NL + " * @param mIdx Modified array index" + NL + " * @param cIdx Command index" + NL + " * @param maxLength Maximum command array length" + NL + " * @return array of commands to apply to the original array in order to produce" + NL + " *         the modified array. Commands are add, remove, set, and move" + NL + " */" + NL + "function _arrayDelta(original, modified, oIdx, mIdx, cIdx, maxLength) {" + NL + "\tif (maxLength === undefined) {" + NL + "\t\tmaxLength = original.length < modified.length ? modified.length\t: original.length;" + NL + "\t}" + NL + "\tif (maxLength < 0) {" + NL + "\t\treturn undefined;" + NL + "\t}" + NL + "\t// Skip equal elements." + NL + "\twhile (oIdx < original.length && mIdx < modified.length\t&& original[oIdx] === modified[mIdx]) {" + NL + "\t\t++oIdx;" + NL + "\t\t++mIdx;" + NL + "\t\t++cIdx;" + NL + "\t}" + NL + "\t// If original has ended" + NL + "\tif (oIdx == original.length) {" + NL + "\t\tvar ret = [];" + NL + "\t\tfor (var i = mIdx; i < modified.length; ++i) {" + NL + "\t\t\tret.push({" + NL + "\t\t\t\ttype : \"add\"," + NL + "\t\t\t\tvalue : modified[i]" + NL + "\t\t\t});" + NL + "\t\t}" + NL + "\t\treturn ret.length > maxLength ? undefined : ret;" + NL + "\t}" + NL + "\t// If modified has ended" + NL + "\tif (mIdx == modified.length) {" + NL + "\t\tvar ret = [];" + NL + "\t\tfor (var i = oIdx; i < original.length; ++i) {" + NL + "\t\t\tret.push({" + NL + "\t\t\t\ttype : \"remove\"," + NL + "\t\t\t\tpos : cIdx," + NL + "\t\t\t\tinitialValue : original[i]" + NL + "\t\t\t});" + NL + "\t\t}" + NL + "\t\treturn ret.length > maxLength ? undefined : ret;" + NL + "\t}" + NL + "\t// set" + NL + "\tvar champion = _arrayDelta(original, modified, oIdx + 1, mIdx + 1, cIdx + 1,\tmaxLength - 1);" + NL + "\tif (champion !== undefined) {" + NL + "\t\tchampion.splice(0, 0, {" + NL + "\t\t\ttype : \"set\"," + NL + "\t\t\tpos : cIdx," + NL + "\t\t\tinitialValue : original[oIdx]," + NL + "\t\t\tvalue : modified[mIdx]" + NL + "\t\t});" + NL + "\t}" + NL + "\t" + NL + "\t// move - try to move value in the original back so it matches the modified" + NL + "\tvar idx = original.indexOf(modified[mIdx], oIdx);" + NL + "\tif (idx !== -1) {" + NL + "\t\tvar or = original.slice(oIdx);" + NL + "\t\tor.splice(idx - oIdx, 1);" + NL + "\t\tvar candidate = _arrayDelta(or, modified, 0, mIdx + 1, cIdx + 1,\t(champion === undefined ? maxLength : champion.length) - 1);" + NL + "\t\tif (candidate !== undefined) {" + NL + "\t\t\tcandidate.splice(0, 0, {" + NL + "\t\t\t\ttype : \"move\"," + NL + "\t\t\t\tpos : cIdx + idx - oIdx," + NL + "\t\t\t\tinitialValue : original[idx]," + NL + "\t\t\t\tnewPos : cIdx" + NL + "\t\t\t});" + NL + "\t\t\tchampion = candidate;" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t// move - try to move value in the original forward so it matches the modified" + NL + "\tvar idx = modified.indexOf(original[oIdx], mIdx);" + NL + "\tif (idx !== -1) {" + NL + "\t\tvar or = original.slice(oIdx+1);" + NL + "\t\tor.splice(idx - mIdx, 0, original[oIdx]);" + NL + "\t\tvar candidate = _arrayDelta(or, modified, 0, mIdx, cIdx,\t(champion === undefined ? maxLength : champion.length) - 1);" + NL + "\t\tif (candidate !== undefined) {" + NL + "\t\t\tcandidate.splice(0, 0, {" + NL + "\t\t\t\ttype : \"move\"," + NL + "\t\t\t\tpos : cIdx," + NL + "\t\t\t\tinitialValue : original[oIdx]," + NL + "\t\t\t\tnewPos : cIdx + idx - mIdx" + NL + "\t\t\t});" + NL + "\t\t\tchampion = candidate;" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t// add - try to add elements to the original at current position so the next" + NL + "\t// element matches the modified" + NL + "\tidx = modified.indexOf(original[oIdx], mIdx);" + NL + "\tif (idx !== -1) {" + NL + "\t\tvar candidate = _arrayDelta(original, modified, oIdx + 1, idx + 1, cIdx" + NL + "\t\t\t\t+ idx - mIdx + 1, (champion === undefined ? maxLength" + NL + "\t\t\t\t: champion.length)" + NL + "\t\t\t\t- idx + mIdx);" + NL + "\t\tif (candidate !== undefined) {" + NL + "\t\t\tfor (var i = mIdx; i < idx; ++i) {" + NL + "\t\t\t\tcandidate.splice(i - mIdx, 0, {" + NL + "\t\t\t\t\ttype : \"add\"," + NL + "\t\t\t\t\tpos : cIdx + i - mIdx," + NL + "\t\t\t\t\tvalue : modified[i]" + NL + "\t\t\t\t});" + NL + "\t\t\t}" + NL + "\t\t\tchampion = candidate;" + NL + "\t\t}" + NL + "\t}" + NL + "\t// remove - try to remove elements from the original at current position so" + NL + "\t// the remaining element matches the modified" + NL + "\tidx = original.indexOf(modified[mIdx], oIdx);" + NL + "\tif (idx !== -1) {" + NL + "\t\tvar candidate = _arrayDelta(original, modified, idx + 1, mIdx + 1," + NL + "\t\t\t\tcIdx + 1," + NL + "\t\t\t\t(champion === undefined ? maxLength : champion.length) - idx + oIdx);" + NL + "\t\tif (candidate !== undefined) {" + NL + "\t\t\tfor (var i = oIdx; i < idx; ++i) {" + NL + "\t\t\t\tcandidate.splice(i - oIdx, 0, {" + NL + "\t\t\t\t\ttype : \"remove\"," + NL + "\t\t\t\t\tpos : cIdx + i - oIdx," + NL + "\t\t\t\t\tinitialValue : original[i]" + NL + "\t\t\t\t});" + NL + "\t\t\t}" + NL + "\t\t\tchampion = candidate;" + NL + "\t\t}" + NL + "\t}" + NL + "\treturn champion;" + NL + "}" + NL + " " + NL + "\t" + NL + "\t// prepares object for sending to the server side by replacing model objects with paths" + NL + "\tfunction marshal(obj) {" + NL + "\t\tif (Array.isArray(obj)) {" + NL + "\t\t\tvar ret = [];" + NL + "\t\t\tfor (var i in obj) {" + NL + "\t\t\t\tret.push(marshal(obj[i]));" + NL + "\t\t\t}\t" + NL + "\t\t\treturn ret;\t\t" + NL + "\t\t} " + NL + "\t\t" + NL + "\t\tif (typeof obj === \"object\") {" + NL + "\t\t\tif (obj.hasOwnProperty(\"$path\")) {" + NL + "\t\t\t\treturn { $path : obj.$path };" + NL + "\t\t\t}" + NL + "\t\t\tvar ret = {};" + NL + "\t\t\tfor (var k in obj) {" + NL + "\t\t\t\tret[k] = marshal(obj[k]);" + NL + "\t\t\t}\t" + NL + "\t\t\treturn ret;\t\t" + NL + "\t\t}\t" + NL + "\t\t" + NL + "\t\treturn { value : obj };\t\t\t" + NL + "\t}" + NL + "\t" + NL + "\t// unmarshals by resolving paths to promises" + NL + "\tfunction unmarshal(obj, isValue) {" + NL + "\t\tif (obj === undefined) {" + NL + "\t\t\treturn obj;" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tif (Array.isArray(obj)) {" + NL + "\t\t\tvar ret = [];" + NL + "\t\t\tvar hasPromises = false;" + NL + "\t\t\tfor (var i in obj) {" + NL + "\t\t\t\tvar e = unmarshal(obj[i], false);" + NL + "\t\t\t\tif (Q.isPromise(e)) {" + NL + "\t\t\t\t\thasPromises = true;" + NL + "\t\t\t\t}" + NL + "\t\t\t\tret.push(e);" + NL + "\t\t\t}\t" + NL + "\t\t\treturn hasPromises ? Q.all(ret) : ret;\t\t" + NL + "\t\t} " + NL + "\t\t" + NL + "\t\tif (isValue) {" + NL + "\t\t\tif (typeof obj === \"object\") {" + NL + "\t\t\t\tvar pending = [];" + NL + "\t\t\t\tvar ret = {};" + NL + "\t\t\t\tfor (var k in obj) {" + NL + "\t\t\t\t\tvar e = unmarshal(obj[k], false);" + NL + "\t\t\t\t\tif (Q.isPromise(e)) {" + NL + "\t\t\t\t\t\tpending.push(e.then(function(k, v) { ret[k] = v; }.bind(this, k)));" + NL + "\t\t\t\t\t} else {" + NL + "\t\t\t\t\t\tret[k] = e;" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}\t" + NL + "\t\t\t\treturn pending.length==0 ? ret : Q.all(pending).thenResolve(ret);\t\t" + NL + "\t\t\t}" + NL + "\t\t\t\t\t\t" + NL + "\t\t\treturn obj;\t\t\t" + NL + "\t\t}" + NL + "\t\t\t\t" + NL + "\t\tif (obj.hasOwnProperty(\"$path\")) {" + NL + "\t\t\treturn Q.promise(function(resolve, reject, notify) {" + NL + "\t\t\t\trequire([obj.$path+\".js\"], function(mod) {" + NL + "\t\t\t\t\tresolve(mod);" + NL + "\t\t\t\t});\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        \t\t\t\t\t" + NL + "\t\t\t});" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\treturn unmarshal(obj.value, true);\t" + NL + "\t}" + NL + "\t" + NL + "\tvar deferredCounter = 0;" + NL + "\tvar deferreds = {};" + NL + "\t" + NL + "\tvar socketPromise = Q.Promise(function(resolve, reject, notify) {" + NL + "\t\tvar sessionSocket = new WebSocket(\"";
  protected final String TEXT_3 = "\");" + NL + "\t\tsessionSocket.onmessage = function(event) {" + NL + "\t\t\tvar response = JSON.parse(event.data);" + NL + "\t\t\tvar deferred = deferreds[response.id];" + NL + "\t\t\tif (deferred) {" + NL + "\t\t\t\tif (response.hasOwnProperty(\"progressNotification\")) {" + NL + "\t\t\t\t\tdeferred.notify(response.progressNotification);" + NL + "\t\t\t\t} else if (response.hasOwnProperty(\"rejectionReason\")) {" + NL + "\t\t\t\t\tdeferred.reject(response.rejectionReason); //reject(unmarshal(response.reason, false));" + NL + "\t\t\t\t\tdelete deferreds[response.id];" + NL + "\t\t    \t} else if (response.hasOwnProperty('validationResults')) { " + NL + "\t\t    \t\tdeferred.reject({ validationFailed:true, validationResults: unmarshal(response.validationResults, false) });" + NL + "\t\t    \t\tdelete deferreds[response.id];" + NL + "\t\t    \t} else { " + NL + "\t    \t \t\tvar deltaPromises = [];" + NL + "\t\t    \t \tif (response.hasOwnProperty('deltas')) {" + NL + "\t\t        \t\tfor (var k in response.deltas) {" + NL + "\t\t        \t\t\tif (session.sessionObjects.hasOwnProperty(k)) {" + NL + "\t\t        \t\t\t\tif (response.deltas[k] === 'detached') {" + NL + "\t\t        \t\t\t\t\tdelete session.sessionObjects[k];" + NL + "\t\t        \t\t\t\t} else {" + NL + "\t\t\t        \t\t\t\tvar deltaPromise = session.sessionObjects[k].applyDelta(response.deltas[k]);" + NL + "\t\t\t        \t\t\t\tif (Q.isPromise(deltaPromise)) {" + NL + "\t\t\t        \t\t\t\t\tdeltaPromises.push(deltaPromise);" + NL + "\t\t\t        \t\t\t\t}" + NL + "\t\t\t        \t\t\t}" + NL + "\t\t        \t\t\t}" + NL + "\t\t        \t\t}" + NL + "\t\t        \t}" + NL + "\t\t        \tif (deltaPromises.length===0) {" + NL + "\t\t        \t\tdeferred.resolve(unmarshal(response.result, false));" + NL + "\t\t        \t} else {" + NL + "\t\t    \t\t\tQ.all(deltaPromises).then(function(dfrd, result) { " + NL + "\t\t    \t\t\t\tdfrd.resolve(unmarshal(result, false)); " + NL + "\t\t    \t\t\t}.bind(this, deferred, response.result));" + NL + "\t\t    \t\t}" + NL + "\t\t    \t}" + NL + "\t\t\t} else {" + NL + "\t\t\t\tconsole.log(\"Invalid response id: \"+response);" + NL + "\t\t\t}" + NL + "\t\t};" + NL + "\t\t" + NL + "\t\tsessionSocket.onerror = function(error) {" + NL + "\t\t\tcosole.error(\"Session socket error: \"+error);" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tsessionSocket.onopen = function() {" + NL + "\t\t\tresolve(sessionSocket);" + NL + "\t\t};" + NL + "\t});" + NL + "\t" + NL + "\tvar session = {" + NL + "\t\tsessionObjects : {}," + NL + "\t\t" + NL + "\t\tarrayDelta : function(original, modified) {" + NL + "\t\t\treturn _arrayDelta(original, modified, 0, 0, 0);" + NL + "\t\t}," + NL + "\t\t" + NL + "\t\t// TODO - resources and resource folders - promise of resource content (lazy-ref)" + NL + "\t" + NL + "\t\t// Posts local changes to the server, including operation target, name, and arguments, if specified." + NL + "\t\t// Applies returned server-side changes to the model" + NL + "\t\t// Returns a promise which is fulfilled with the operation result or undefined when store operation completes." + NL + "\t\tapply : function(target, operation, opArgs, feature) {" + NL + "\t\t\tvar deferred = Q.defer();" + NL + "\t\t\tvar deferredId = deferredCounter++;" + NL + "\t\t\tdeferreds[deferredId] = deferred;" + NL + "\t\t\tvar applyData = { " + NL + "\t\t\t\tid: deferredId " + NL + "\t\t\t};\t\t\t" + NL + "\t\t\t" + NL + "\t\t\tif (target) {" + NL + "\t\t\t\tapplyData.target = target;" + NL + "\t\t\t\tapplyData.operation = operation;" + NL + "\t\t\t\tapplyData.feature = feature;" + NL + "\t\t\t\tapplyData.args = [];" + NL + "\t\t\t\tfor (var ak in opArgs) {" + NL + "\t\t\t\t\tapplyData.args.push(marshal(opArgs[ak]));" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\tapplyData.deltas = {};" + NL + "\t\t\tfor (var k in session.sessionObjects) {" + NL + "\t\t\t\tapplyData.deltas[k] = session.sessionObjects[k].delta;" + NL + "\t\t\t}" + NL + "\t\t\t" + NL + "\t\t\tsocketPromise.then(function(data, sessionSocket) { " + NL + "\t\t\t\tsessionSocket.send(JSON.stringify(data)); " + NL + "\t\t\t}.bind(this, applyData));" + NL + "\t\t\t" + NL + "\t\t\treturn deferred.promise;" + NL + "\t\t}," + NL + "\t\t\t" + NL + "\t\t// Updates model from the server if there are no local changes." + NL + "\t\t// Applies returned server-side changes to the model" + NL + "\t\t// Returns a boolean promise which is fulfilled with true if data was loaded from the server, and false if there were local changes and the model was not updated." + NL + "\t\trefresh : function() {" + NL + "\t\t\tfor (var k in session.sessionObjects) {" + NL + "\t\t\t\tfor (var l in session.sessionObjects[k].delta) {" + NL + "\t\t\t\t\treturn Q(false);" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\tvar deferred = Q.defer();" + NL + "\t\t\tvar deferredId = deferredCounter++;" + NL + "\t\t\tdeferreds[deferredId] = deferred;" + NL + "" + NL + "\t\t\tsocketPromise.then(function(data, sessionSocket) { " + NL + "\t\t\t\tsessionSocket.send(JSON.stringify(data)); " + NL + "\t\t\t}.bind(this, { id: deferredId }));" + NL + "\t\t\treturn deferred.promise;" + NL + "\t\t}\t\t" + NL + "\t};\t" + NL + "\t" + NL + "\treturn session;" + NL + "});";

public String generate(Object... args) throws Exception
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	org.nasdanika.web.HttpServletRequestContext context = (org.nasdanika.web.HttpServletRequestContext) args[0];
	org.eclipse.emf.cdo.view.CDOView cdoView = (org.eclipse.emf.cdo.view.CDOView) args[1]; 
	String webSocketUrl = (String) args[2];

    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(webSocketUrl);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}