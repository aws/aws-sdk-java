<#macro content customConfig shapeName getterFunctionPrefix shapes>
<#local shape = shapes[shapeName]/>

<#if shape.members?has_content>
<#list shape.members as member>
<#local getMember = getterFunctionPrefix + ".get" + member.name />
<#local http = member.http />

<#if !(http.location)?? && !(http.isStreaming) && !(http.isPayload)>
<#if member.simple>
    <#if member.idempotencyToken>
        xmlWriter.startElement("${http.marshallLocationName}").value(<@IdempotencyTokenMacro.content getMember member.variable.simpleType/>).endElement();
    <#else>
        if(${getMember}() != null) {
            xmlWriter.startElement("${http.marshallLocationName}").value(${getMember}()).endElement();
        }
    </#if>
<#elseif member.list>
    <#local listModel = member.listModel />
    <#-- More explicit name in order to avoid variable name collision -->
    <#local listVariable = shapeName?uncap_first + member.name + "List"/>
    <#local loopVariable = listVariable + "Value"/>

  <#if customConfig.useAutoConstructList>
      ${listModel.templateImplType} ${listVariable} = (${listModel.templateImplType})${getMember}();
      if (!${listVariable}.isEmpty() || !${listVariable}.isAutoConstruct()) {
  <#else>
      ${listModel.templateType} ${listVariable} = ${getMember}();
      if (${listVariable} != null) {
  </#if>
          xmlWriter.startElement("${http.marshallLocationName}");

          for (${listModel.memberType} ${loopVariable} : ${listVariable}) {
              xmlWriter.startElement("${listModel.memberLocationName}");
            <#if listModel.simple>
              xmlWriter.value(${loopVariable});
            <#else>
              <@MemberMarshallerMacro.content customConfig listModel.memberType loopVariable shapes/>
            </#if>
              xmlWriter.endElement();
          }
          xmlWriter.endElement();
      }
<#else>
    <#local variable = member.variable />
    ${variable.variableType} ${variable.variableName} = ${getMember}();
    if (${variable.variableName} != null) {
        xmlWriter.startElement("${http.marshallLocationName}");
        <@MemberMarshallerMacro.content customConfig variable.simpleType variable.variableName shapes/>
        xmlWriter.endElement();
    }
</#if>
</#if>
</#list>
</#if>
</#macro>
