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

    return executorService.submit(new ${operation.asyncCallableType}() {
        @Override
        public ${operation.asyncReturnType} call() throws Exception {
            ${operation.asyncReturnType} result;

            try {
              <#if operation.returnType??>
                result = ${operation.methodName}(request);
              <#else>
                ${operation.methodName}(request);
                result = null;
              </#if>
            } catch (Exception ex) {
                if (asyncHandler != null) {
                    asyncHandler.onError(ex);
                }
                throw ex;
            }

            if (asyncHandler != null) {
                asyncHandler.onSuccess(request, result);
            }
            return result;
        }
    });
}
</#macro>
