<#macro content shape>
<#if shape.members?has_content>
<#list shape.members as member>
    <#local variable = member.variable/>
    <#if variable.documentation?has_content>/** ${variable.documentation} */</#if>
    <#if member.deprecated>
    @Deprecated
    </#if>
    private ${variable.variableDeclarationType} ${variable.variableName};
</#list>
</#if>
</#macro>