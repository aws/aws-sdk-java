<#macro content operation>

@Override
<#if operation.deprecated>
  @Deprecated
</#if>
public ${operation.asyncFutureType} ${operation.methodName}Async(
        ${operation.input.variableType} request) {

    return ${operation.methodName}Async(request, null);
}

@Override
<#if operation.deprecated>
  @Deprecated
</#if>
public ${operation.asyncFutureType} ${operation.methodName}Async(
    final ${operation.input.variableType} request,
    final ${operation.asyncHandlerType} asyncHandler) {
    final ${operation.input.variableType} finalRequest = beforeClientExecution(request);

    return executorService.submit(new ${operation.asyncCallableType}() {
        @Override
        public ${operation.asyncReturnType} call() throws Exception {
            ${operation.asyncReturnType} result = null;

            try {
              <#if operation.returnType??>
                result = execute${operation.methodName?cap_first}(finalRequest);
              <#else>
                execute${operation.methodName?cap_first}(finalRequest);
              </#if>
            } catch (Exception ex) {
                if (asyncHandler != null) {
                    asyncHandler.onError(ex);
                }
                throw ex;
            }

            if (asyncHandler != null) {
                asyncHandler.onSuccess(finalRequest, result);
            }
            return result;
        }
    });
}
</#macro>
