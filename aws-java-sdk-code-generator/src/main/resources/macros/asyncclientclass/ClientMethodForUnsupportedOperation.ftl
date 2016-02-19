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
        ${operation.input.variableType} request,
        ${operation.asyncHandlerType} asyncHandler) {

    throw new java.lang.UnsupportedOperationException();
}
</#macro>
