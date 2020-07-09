<#macro content shape packageName="">
    int originalDepth = context.getCurrentDepth();
    String currentParentElement = context.getCurrentParentElement();
    int targetDepth = originalDepth + 1;

    JsonToken token = context.getCurrentToken();
    if (token == null) token = context.nextToken();
    if (token == VALUE_NULL) {
     <#if shape.shapeType == "Response">
        return ${shape.variable.variableName};
    <#else>
        return null;
    </#if>
    }

    while (true) {
        if (token == null) break;

        <#-- When the payload is explicitly set to a member the entire payload is the serialized
        content of that member-->
        <#if shape.hasPayloadMember>
            ${shape.variable.variableName}.${shape.payloadMember.setterMethodName}(<@MemberUnmarshallerDeclarationMacro.content shape.payloadMember/>.unmarshall(context));
        <#-- When the payload is not explicitly set then every member which doesn't appear in the
        Headers or the status code will be serialized in the payload response (wrapped in an
        artificial container object) -->
        <#else>
            if (token == FIELD_NAME || token == START_OBJECT) {
                <#list shape.unboundMembers as payloadMember>
                    <@MemberUnmarshallerInvocationMacro.content shape.variable.variableName payloadMember packageName/>
                </#list>
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
        </#if>
        token = context.nextToken();
    }
</#macro>
