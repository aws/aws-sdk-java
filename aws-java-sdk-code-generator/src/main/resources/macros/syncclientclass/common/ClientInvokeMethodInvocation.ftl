<#macro content operationModel>
    <#if operationModel.authenticated>
        invoke(request, responseHandler, executionContext);
    <#else>
        anonymousInvoke(request, responseHandler, executionContext);
    </#if>
</#macro>
