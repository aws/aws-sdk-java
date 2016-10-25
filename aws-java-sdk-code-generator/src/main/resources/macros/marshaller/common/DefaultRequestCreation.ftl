<#macro content shape serviceNameForRequest>
    Request<${shape.shapeName}> request = new DefaultRequest<${shape.shapeName}>(${shape.variable.variableName}, "${serviceNameForRequest}");
</#macro>
