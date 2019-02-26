${fileHeader}
package ${metadata.packageName};

import javax.annotation.Generated;

import ${metadata.packageName}.model.*;
import com.amazonaws.*;
<#if hasWaiters>
import ${metadata.packageName}.waiters.${metadata.syncInterface}Waiters;
</#if>

/**
 * Abstract implementation of {@code ${metadata.syncInterface}}. Convenient
 * method forms pass through to the corresponding overload that takes a
 * request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ${metadata.syncAbstractClass} implements ${metadata.syncInterface} {

    protected ${metadata.syncAbstractClass}() {
    }

<#if customizationConfig.emitClientMutationMethods() >
    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }
</#if>

  <#list operations?values as operationModel>
    <#if !customizationConfig.skipClientMethodForOperations?seq_contains("${operationModel.operationName}")>
        <@ClientMethodForUnsupportedOperation.content operationModel />
        <@ClientMethodForOperationWithSimpleForm.content operationModel/>
    </#if>
  </#list>

  <#if AdditionalClientMethodsMacro?has_content>
    <@AdditionalClientMethodsMacro.content .data_model />
  </#if>

  <#if customizationConfig.skipInterfaceAdditions == false>
    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    <#assign responseMetadataClassName=customizationConfig.customResponseMetadataClassName!"com.amazonaws.ResponseMetadata" />
    @Override
    public ${responseMetadataClassName} getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }
  </#if>

  <#if hasWaiters>
      @Override
      public ${metadata.syncInterface}Waiters waiters() {
           throw new java.lang.UnsupportedOperationException();
      }
  </#if>

    <#if customizationConfig.presignersFqcn??>
    @Override
    public ${customizationConfig.presignersFqcn} presigners() {
        throw new java.lang.UnsupportedOperationException();
    }
    </#if>
}
