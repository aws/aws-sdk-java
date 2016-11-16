${fileHeader}
package ${metadata.packageName};

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
public interface ${metadata.asyncInterface} extends ${metadata.syncInterface} {
  <#list operations?values as operationModel>
    <@AsyncInterfaceMethodForOperationMacro.content metadata operationModel />
  </#list>

  <#if AdditionalInterfaceMethodsMacro??>
    <@AdditionalInterfaceMethodsMacro.content .data_model />
  </#if>
}
