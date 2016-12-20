<#macro content customConfig shapeName getterFunctionPrefix, shapes>
<#local shape = shapes[shapeName]/>
<#if shape.members??>
    <#list shape.members as member>
    <#--
      We enclose "member.http" in parenthesis in case "member" is null.
      See "has_content" section at http://freemarker.org/docs/ref_builtins_expert.html
      -->
    <#local http = (member.http) />
    <#if !(http.location)?? && !(http.isStreaming) && !(http.isPayload)>
        <#local getMember = getterFunctionPrefix + "." + member.getterMethodName />
        <#if member.simple>
            <#if member.idempotencyToken>
                jsonGenerator.writeFieldName("${http.marshallLocationName}").writeValue(<@IdempotencyTokenMacro.content getMember member.variable.simpleType/>);
            <#else>
                if(${getMember}() != null) {
                    jsonGenerator.writeFieldName("${http.marshallLocationName}").writeValue(${getMember}());
                }
            </#if>
        <#elseif member.list>
            <#local listModel = member.listModel />
            <#local listMemberType = listModel.memberType/>
            <#local memberVariableName = member.name?uncap_first/>
            <#local listVariable = memberVariableName + "List"/>
            <#local loopVariable = listVariable + "Value"/>

          <#if customConfig.useAutoConstructList>
              ${listModel.templateImplType} ${listVariable} = (${listModel.templateImplType})${getMember}();
              if (!${listVariable}.isEmpty() || !${listVariable}.isAutoConstruct()) {
          <#else>
              ${listModel.templateType} ${listVariable} = ${getMember}();
              if (${listVariable} != null) {
          </#if>
                  jsonGenerator.writeFieldName("${http.marshallLocationName}");
                  jsonGenerator.writeStartArray();
                  for (${listModel.memberType} ${loopVariable} : ${listVariable}) {
                      if (${loopVariable} != null) {
                      <@ListMemberMacro.content member loopVariable/>
                      }
                  }
                  jsonGenerator.writeEndArray();
              }
        <#elseif member.map>
            <#local mapModel = member.mapModel />
            <#local memberVariableName = member.name?uncap_first/>
            <#local mapVariable = memberVariableName + "Map"/>
            <#local loopVariable = mapVariable + "Value"/>

          <#if customConfig.useAutoConstructMap>
              ${mapModel.templateImplType} ${mapVariable} = (${mapModel.templateImplType})${getMember}();
              if (!${mapVariable}.isEmpty() || !${mapVariable}.isAutoConstruct()) {
          <#else>
              ${mapModel.templateType} ${mapVariable} = ${getMember}();
              if (${mapVariable} != null) {
          </#if>
                  jsonGenerator.writeFieldName("${http.marshallLocationName}");
                  jsonGenerator.writeStartObject();

                  for(Map.Entry<${mapModel.keyType},${mapModel.valueType}> ${loopVariable} : ${mapVariable}.entrySet()) {
                      if (${loopVariable}.getValue() != null) {
                          jsonGenerator.writeFieldName(${loopVariable}.getKey());

                          <@MapMemberMacro.content member loopVariable+".getValue()"/>
                      }
                  }
                  jsonGenerator.writeEndObject();
              }
        <#else>
              if (${getMember}() != null) {
                  jsonGenerator.writeFieldName("${http.marshallLocationName}");
                  ${member.variable.variableType}JsonMarshaller.getInstance().marshall(${getMember}(), jsonGenerator);
              }
        </#if>
    </#if>
    </#list>
</#if>
</#macro>
