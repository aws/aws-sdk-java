<#macro content customConfig shape>

<#if customConfig.requiredParamValidationEnabled && shape.required?has_content>
  <#local requiredParams = shape.required/>

  private static void validateRequiredParams(${shape.variable.variableType} ${shape.variable.variableName}) {
  <#if shape.members?has_content>
    <#list shape.members as member>
      <#local c2jName = member.c2jName/>
      <#if requiredParams?seq_contains(c2jName)>
        if (${shape.variable.variableName}.${member.getterMethodName}() == null) {
          throw new IllegalArgumentException("Required Parameter ${member.name} missing in structure ${shape.variable.variableType}");
        }
      </#if>
    </#list>
  </#if>
  }
</#if>
</#macro>