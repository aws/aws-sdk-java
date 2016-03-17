<#macro content member getterFunction>
<#if member.mapModel.valueSimple>
    jsonGenerator.writeValue(${getterFunction});
<#elseif member.mapModel.valueModel??>
    <#local mapValueMember = member.mapModel.valueModel/>

    <#if mapValueMember.list>
        <#local loopVariable = member.name?uncap_first +"MapValueList"/>
        jsonGenerator.writeStartArray();
        for (${mapValueMember.listModel.memberType} ${loopVariable} : ${getterFunction}) {
            if (${loopVariable} != null) {
                <#if mapValueMember.simple>
                    jsonGenerator.writeValue(${loopVariable});
                <#elseif mapValueMember.map>
                    TODO Handle map inside a list
                <#elseif mapValueMember.list>
                    <@ListMemberMacro.content mapValueMember loopVariable/>
                <#else>
                    ${mapValueMember.variable.variableType}JsonMarshaller.getInstance().marshall(${loopVariable}, jsonGenerator);
                </#if>
            }
        }
        jsonGenerator.writeEndArray();
    <#elseif mapValueMember.map>
        <#local loopVariable = member.name?uncap_first +"MapValueNestedMap"/>
        <#local mapModel = mapValueMember.mapModel />
        <#local mapVariable = mapValueMember + "Map"/>
        jsonGenerator.writeStartObject();
        for(Map.Entry<${mapModel.keyType},${mapModel.valueType}> ${loopVariable} : ${getterFunction}.entrySet()) {
              if (${loopVariable}.getValue() != null) {
                  jsonGenerator.writeFieldName(${loopVariable}.getKey());

                  <@MapMemberMacro.content mapValueMember loopVariable+".getValue()"/>
              }
        }
        jsonGenerator.writeEndObject();
    <#else>
        ${member.mapModel.valueType}JsonMarshaller.getInstance().marshall(${getterFunction}, jsonGenerator);
    </#if>
</#if>
</#macro>