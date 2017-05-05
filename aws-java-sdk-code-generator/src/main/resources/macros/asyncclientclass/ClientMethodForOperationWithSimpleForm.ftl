<#macro content operation>
<#if operation.simpleMethodForms??>
  <#list operation.simpleMethodForms as form>

    /**
     * Simplified method form for invoking the ${operation.operationName}
     * operation.
     *
     * @see #${operation.methodName}Async(${operation.input.variableType})
     */
    @Override
    <#if operation.deprecated || form.deprecated>
      @Deprecated
    </#if>
    public ${operation.asyncFutureType} ${operation.methodName}Async(
            ${form.argumentsDeclaration}) {

        return ${operation.methodName}Async(new ${operation.input.variableType}()
                ${form.withMethodCalls});
    }

    /**
     * Simplified method form for invoking the ${operation.operationName}
     * operation with an AsyncHandler.
     *
     * @see #${operation.methodName}Async(${operation.input.variableType}, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    <#if operation.deprecated || form.deprecated>
    @Deprecated
    </#if>
    public ${operation.asyncFutureType} ${operation.methodName}Async(
            <#if form.arguments?has_content>
              ${form.argumentsDeclaration},
            </#if>
            ${operation.asyncHandlerType} asyncHandler) {

        return ${operation.methodName}Async(new ${operation.input.variableType}()
                ${form.withMethodCalls},
                asyncHandler);
    }
  </#list>
</#if>
</#macro>
