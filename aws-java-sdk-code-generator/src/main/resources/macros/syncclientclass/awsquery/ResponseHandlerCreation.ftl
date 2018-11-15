<#macro content customConfig, operationModel metadata unmarshallerReference outputType>
    <#-- Note we make a special case of Simple DB instead of using the customization for backwards compat -->
    <#if metadata.syncInterface == "AmazonSimpleDB">
        <#assign responseHandler="com.amazonaws.services.simpledb.internal.SimpleDBStaxResponseHandler" />
    <#elseif customConfig.customResponseHandlerFqcn??>
        <#assign responseHandler=customConfig.customResponseHandlerFqcn />
    <#else>
        <#assign responseHandler="StaxResponseHandler" />
    </#if>

    StaxResponseHandler<${outputType}> responseHandler = new ${responseHandler}<${outputType}>(${unmarshallerReference});
</#macro>
