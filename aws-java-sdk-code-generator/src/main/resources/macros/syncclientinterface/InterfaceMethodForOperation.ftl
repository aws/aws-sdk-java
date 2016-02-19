<#macro content metadata operationModel>
${operationModel.getSyncDocumentation(metadata)}
<#if operationModel.deprecated>
  @Deprecated
</#if>
${operationModel.syncReturnType} ${operationModel.methodName}(${operationModel.input.variableType} ${operationModel.input.variableName});
<#if operationModel.simpleMethodForms??>
  <#list operationModel.simpleMethodForms as form>

    /**
     * Simplified method form for invoking the ${operationModel.operationName} operation.
     *
     * @see #${operationModel.methodName}(${operationModel.input.variableType})
     */
    <#if operationModel.deprecated>
      @Deprecated
    </#if>
    ${operationModel.syncReturnType} ${operationModel.methodName}(${form.argumentsDeclaration});
  </#list>
</#if>
</#macro>
