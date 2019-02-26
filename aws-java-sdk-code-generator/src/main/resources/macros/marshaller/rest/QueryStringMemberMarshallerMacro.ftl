<#macro content shape getterFunctionPrefix>
<#if shape.members?has_content>
    <#list shape.members as member>
    <#local getMember = getterFunctionPrefix + "." + member.getterMethodName />
    <#local variable = member.variable />

    <#if member.http.isQueryString() >
        <#if member.map>
            <#local mapModel = member.mapModel />

            ${mapModel.templateType} ${variable.variableName} = ${getMember}();
            if(${variable.variableName} != null) {
                for (Map.Entry<${mapModel.keyType},${mapModel.valueType}> entry : ${variable.variableName}.entrySet()) {
                    if (entry.getValue() != null) {
                        <#if mapModel.valueModel.list>
                            request.addParameters(StringUtils.from${mapModel.keyType}(entry.getKey()), entry.getValue());
                        <#else>
                            request.addParameter(StringUtils.from${mapModel.keyType}(entry.getKey()), StringUtils.from${mapModel.valueType}(entry.getValue()));
                        </#if>
                    }
                }
            }
        <#elseif member.list>
            if (${getMember}() != null && !(${getMember}().isEmpty())) {
                for(${member.listModel.simpleType} value : ${getMember}()) {
                    request.addParameter("${member.http.marshallLocationName}", StringUtils.from${member.listModel.simpleType}(value));
                }
            }
        <#else>
            <#if member.idempotencyToken>
                request.addParameter("${member.http.marshallLocationName}", <@IdempotencyTokenMacro.content getMember member.variable.simpleType/>);
            <#else>
                if(${getMember}() != null) {
                    request.addParameter("${member.http.marshallLocationName}", StringUtils.from${variable.simpleType}(${getMember}()));
                }
            </#if>
        </#if>
    </#if>
    </#list>
 </#if>
</#macro>
