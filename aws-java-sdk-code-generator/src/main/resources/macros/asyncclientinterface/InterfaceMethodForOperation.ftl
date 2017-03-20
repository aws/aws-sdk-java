<#macro content metadata operationModel>

${operationModel.getAsyncDocumentation(metadata)}
<#if operationModel.deprecated>
  @Deprecated
</#if>
${operationModel.asyncFutureType} ${operationModel.methodName}Async(
    ${operationModel.input.variableType} ${operationModel.input.variableName});

${operationModel.getAsyncDocumentationWithHandler(metadata)}
<#if operationModel.deprecated>
  @Deprecated
</#if>
${operationModel.asyncFutureType} ${operationModel.methodName}Async(
    ${operationModel.input.variableType} ${operationModel.input.variableName},
    ${operationModel.asyncHandlerType} asyncHandler);
<#if operationModel.simpleMethodForms??>
  <#list operationModel.simpleMethodForms as form>

    /**
     * Simplified method form for invoking the ${operationModel.operationName} operation.
     *
     * @see #${operationModel.methodName}Async(${operationModel.input.variableType})
     */
    <#if operationModel.deprecated || form.deprecated>
      @Deprecated
    </#if>
    ${operationModel.asyncFutureType} ${operationModel.methodName}Async(${form.argumentsDeclaration});

    /**
     * Simplified method form for invoking the ${operationModel.operationName}
     * operation with an AsyncHandler.
     *
     * @see #${operationModel.methodName}Async(${operationModel.input.variableType}, com.amazonaws.handlers.AsyncHandler)
     */
    <#if operationModel.deprecated || form.deprecated>
    @Deprecated
    </#if>
    ${operationModel.asyncFutureType} ${operationModel.methodName}Async(
        <#if form.arguments?has_content>
          ${form.argumentsDeclaration},
        </#if>
        ${operationModel.asyncHandlerType} asyncHandler);
  </#list>
</#if>
</#macro>
