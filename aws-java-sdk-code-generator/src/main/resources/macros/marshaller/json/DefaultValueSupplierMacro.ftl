<#macro content member>
    <#if member.isIdempotencyToken()>
    .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator())
    </#if>
</#macro>
