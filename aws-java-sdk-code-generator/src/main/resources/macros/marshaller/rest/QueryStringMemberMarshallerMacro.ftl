<#macro content shape getterFunctionPrefix>
<#if shape.members?has_content>
    <#list shape.members as member>
    <#local getMember = getterFunctionPrefix + ".get" + member.name />
    <#local variable = member.variable />

    <#if member.http.isQueryString() >
        <#if member.map>
            <#local mapModel = member.mapModel />

            ${mapModel.templateType} ${variable.variableName} = ${getMember}();
            for (Map.Entry<${mapModel.keyType},${mapModel.valueType}> entry : ${variable.variableName}.entrySet()) {
                if (entry.getValue() != null) {
                    request.addParameter(StringUtils.from${mapModel.keyType}(entry.getKey()), StringUtils.from${mapModel.valueType}(entry.getValue()));
                }
            }
        <#elseif member.list>
            if (${getMember}() != null && !(${getMember}().isEmpty())) {
                for(${member.listModel.simpleType} value : ${getMember}()) {
                    request.addParameter("${member.http.marshallLocationName}", StringUtils.from${member.listModel.simpleType}(value));        
                }
            }
        <#else>
            String ${variable.variableName} = (${getMember}() == null ) ? null : StringUtils.from${variable.simpleType}(${getMember}());
            if (${variable.variableName} != null) {
                request.addParameter("${member.http.marshallLocationName}", ${variable.variableName});
            }
        </#if>
    </#if>
    </#list>
 </#if>
</#macro>
