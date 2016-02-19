<#macro content operationModel>

    @Override
    <#if operationModel.deprecated>
        @Deprecated
    </#if>
    public ${operationModel.syncReturnType} ${operationModel.methodName}(${operationModel.input.variableType} request) {
        throw new java.lang.UnsupportedOperationException();
    }
</#macro>