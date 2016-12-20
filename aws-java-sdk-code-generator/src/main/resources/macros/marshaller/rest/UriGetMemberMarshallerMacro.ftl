<#macro content getterFunctionPrefix, member>
    ${getterFunctionPrefix + "." + member.getterMethodName + "()"}
</#macro>
