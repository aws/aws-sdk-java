${fileHeader}
package ${metadata.packageName};

import javax.annotation.Generated;

import ${metadata.packageName}.model.*;

/**
 * Abstract implementation of {@code ${metadata.asyncInterface}}. Convenient
 * method forms pass through to the corresponding overload that takes a
 * request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ${metadata.asyncAbstractClass} extends ${metadata.syncAbstractClass}
        implements ${metadata.asyncInterface} {

    protected ${metadata.asyncAbstractClass}() {
    }
  <#list operations?values as operationModel>
    <#if !customizationConfig.skipClientMethodForOperations?seq_contains("${operationModel.operationName}")>
        <@AsyncClientMethodForUnsupportedOperation.content operationModel />
        <@AsyncClientMethodForOperationWithSimpleForm.content operationModel />
    </#if>
  </#list>

  <#if AdditionalClientMethodsMacro?has_content>
    <@AdditionalClientMethodsMacro.content .data_model />
  </#if>
}
