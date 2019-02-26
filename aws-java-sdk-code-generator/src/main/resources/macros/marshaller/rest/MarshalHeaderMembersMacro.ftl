<#macro content shape getterFunctionPrefix>

<#if shape.members?has_content>
    <#list shape.members as member>
    <#if member.http.isHeader() >
        <#local getMember = getterFunctionPrefix + "." + member.getterMethodName />

        <#if member.list>
            if (${getMember}() != null && !(${getMember}().isEmpty())) {
                StringBuilder builder = new StringBuilder();

                ${member.listModel.templateType} ${member.variable.variableName} = ${getMember}();

                for(int i = 0; i < ${member.variable.variableName}.size() ; i++) {
                    builder.append(StringUtils.from${member.variable.simpleType}(${member.variable.variableName}.get(i));
                    if(i < ${member.variable.variableName}.size() - 1){
                        builder.append(COMMA_SEPARATOR);
                    }
                }

                request.addHeader("${member.http.marshallLocationName}", builder.toString());
            }
        <#else>
            <#if member.idempotencyToken>
                request.addHeader("${member.http.marshallLocationName}", <@IdempotencyTokenMacro.content getMember member.variable.simpleType/>);
            <#else>
                if(${getMember}() != null) {
                    request.addHeader("${member.http.marshallLocationName}", StringUtils.from${member.variable.simpleType}(${getMember}()));
                }
            </#if>
        </#if>
    </#if>
    </#list>
</#if>
</#macro>