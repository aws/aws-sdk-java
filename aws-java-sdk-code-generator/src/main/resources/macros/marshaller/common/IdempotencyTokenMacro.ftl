<#macro content getMember simpleVariableType>
    IdempotentUtils.resolve${simpleVariableType}(${getMember}())
</#macro>