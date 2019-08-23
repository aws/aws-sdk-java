<#macro content serviceModelRoot>
   /**
    * List of exception unmarshallers for all modeled exceptions
    */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();


    <#if AdditionalServiceSyncClientFieldsMacro?has_content>
        <@AdditionalServiceSyncClientFieldsMacro.content .data_model />
    </#if>
</#macro>
