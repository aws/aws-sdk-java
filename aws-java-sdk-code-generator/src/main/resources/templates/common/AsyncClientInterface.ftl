${fileHeader}
package ${metadata.packageName};

import javax.annotation.Generated;

import ${metadata.packageName}.model.*;

/**
 * Interface for accessing ${metadata.serviceName} asynchronously. Each
 * asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can
 * be used to receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link ${metadata.packageName}.Abstract${metadata.asyncInterface}} instead.
 * </p>
<#if metadata.documentation??>
 * <p>
 * ${metadata.documentation}
</#if>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface ${metadata.asyncInterface} extends ${metadata.syncInterface} {
  <#list operations?values as operationModel>
    <#if !customizationConfig.skipClientMethodForOperations?seq_contains("${operationModel.operationName}")>
        <@AsyncInterfaceMethodForOperationMacro.content metadata operationModel />
    </#if>
  </#list>

  <#if AdditionalInterfaceMethodsMacro??>
    <@AdditionalInterfaceMethodsMacro.content .data_model />
  </#if>
}
