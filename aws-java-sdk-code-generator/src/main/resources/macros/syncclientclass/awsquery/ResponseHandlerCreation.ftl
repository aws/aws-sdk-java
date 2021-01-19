<#macro content customConfig, operationModel metadata unmarshallerReference outputType>
    <#-- Note we make a special case of Simple DB instead of using the customization for backwards compat -->
    <#if metadata.syncInterface == "AmazonSimpleDB">
        <#assign responseHandler="com.amazonaws.services.simpledb.internal.SimpleDBStaxResponseHandler" />
    <#elseif customConfig.customResponseHandlerFqcn??>
        <#assign responseHandler=customConfig.customResponseHandlerFqcn />
    <#else>
        <#assign responseHandler="StaxResponseHandler" />
    </#if>

    <#assign streamingMember = false />
    <#if operationModel.outputShape??>
        <#if operationModel.outputShape.hasStreamingMember>
            <#assign streamingMember =  true />
        </#if>
    </#if>

     <#if operationModel.hasBlobMemberAsPayload || streamingMember >
        StaxResponseHandler<${outputType}> responseHandler = new ${responseHandler}<${outputType}>(${unmarshallerReference},
                                                            ${streamingMember?c}, ${(!operationModel.hasBlobMemberAsPayload)?c} );
     <#else>
         StaxResponseHandler<${outputType}> responseHandler = new ${responseHandler}<${outputType}>(${unmarshallerReference});
     </#if>

</#macro>
