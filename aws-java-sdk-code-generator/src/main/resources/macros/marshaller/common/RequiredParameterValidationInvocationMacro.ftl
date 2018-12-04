<#macro content customConfig shape>
    <#if customConfig.requiredParamValidationEnabled && shape.required?has_content>
      validateRequiredParams(${shape.variable.variableName});
    </#if>
</#macro>