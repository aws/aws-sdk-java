<#macro content shapeVarName memberModel >
if (context.testExpression("${memberModel.http.unmarshallLocationName}", targetDepth)) {
    context.nextToken();
    ${shapeVarName}.${memberModel.setterMethodName}(<@MemberUnmarshallerDeclarationMacro.content memberModel />.unmarshall(context));
}
</#macro>
