<#macro content shapeVarName memberModel >
if (context.testExpression("${memberModel.http.unmarshallLocationName}", targetDepth)) {
    context.nextToken();
    ${shapeVarName}.set${memberModel.name}(<@MemberUnmarshallerDeclarationMacro.content memberModel />.unmarshall(context));
}
</#macro>
