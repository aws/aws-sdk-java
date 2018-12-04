<#macro content operationModel>
    new ${operationModel.input.variableType}Marshaller(protocolFactory)
</#macro>
