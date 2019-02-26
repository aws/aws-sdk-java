<#macro content operationModel>
    new ${operationModel.input.variableType}ProtocolMarshaller(protocolFactory)
</#macro>
