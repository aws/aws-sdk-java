<#macro content operationModel>
    <#if operationModel.inputShape?has_content && operationModel.inputShape.hasUriMember>
        <#list operationModel.inputShape.members as member>
            <#if (member.http.uri)>
                ValidationUtils.assertStringNotEmpty(StringUtils.from${member.variable.simpleType}(
                    ${operationModel.input.variableName}.get${member.name}()), "${member.name}");
            </#if>
        </#list>
    </#if>
</#macro>