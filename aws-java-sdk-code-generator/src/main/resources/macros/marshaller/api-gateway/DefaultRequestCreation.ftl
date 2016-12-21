<#macro content shape serviceNameForRequest>
    Request<${shape.shapeName}> request = new DefaultRequest<${shape.shapeName}>("${serviceNameForRequest}");
</#macro>
