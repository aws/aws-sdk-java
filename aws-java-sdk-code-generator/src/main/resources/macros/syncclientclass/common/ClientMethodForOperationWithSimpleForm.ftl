<#macro content operationModel>
<#if operationModel.simpleMethodForms??>
    <#list operationModel.simpleMethodForms as form>

        @Override
        <#if operationModel.deprecated || form.deprecated>
          @Deprecated
        </#if>
        public ${operationModel.syncReturnType} ${operationModel.methodName}(${form.argumentsDeclaration}) {
            <#if operationModel.returnType??>return </#if>${operationModel.methodName}(new ${operationModel.input.variableType}()
                            ${form.withMethodCalls});
        }
    </#list>
</#if>
</#macro>