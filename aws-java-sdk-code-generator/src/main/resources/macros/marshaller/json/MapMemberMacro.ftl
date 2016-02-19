<#macro content member getterFunction>
<#if member.mapModel.valueSimple>
    jsonWriter.value(${getterFunction});
<#elseif member.mapModel.valueModel??>
    <#local mapValueMember = member.mapModel.valueModel/>

    <#if mapValueMember.list>
        <#local loopVariable = member.name?uncap_first +"MapValueList"/>
        jsonWriter.array();
        for (${mapValueMember.listModel.memberType} ${loopVariable} : ${getterFunction}) {
            if (${loopVariable} != null) {
                <#if mapValueMember.simple>
                    jsonWriter.value(${loopVariable});
                <#elseif mapValueMember.map>
                    TODO Handle map inside a list
                <#elseif mapValueMember.list>
                    <@ListMemberMacro.content mapValueMember loopVariable/>
                <#else>
                    ${mapValueMember.variable.variableType}JsonMarshaller.getInstance().marshall(${loopVariable}, jsonWriter);
                </#if>
            }
        }
        jsonWriter.endArray();
    <#elseif mapValueMember.map>
        <#local loopVariable = member.name?uncap_first +"MapValueNestedMap"/>
        <#local mapModel = mapValueMember.mapModel />
        <#local mapVariable = mapValueMember + "Map"/>
        jsonWriter.object();
        for(Map.Entry<${mapModel.keyType},${mapModel.valueType}> ${loopVariable} : ${getterFunction}.entrySet()) {
              if (${loopVariable}.getValue() != null) {
                  jsonWriter.key(${loopVariable}.getKey());

                  <@MapMemberMacro.content mapValueMember loopVariable+".getValue()"/>
              }
        }
        jsonWriter.endObject();
    <#else>
        ${member.mapModel.valueType}JsonMarshaller.getInstance().marshall(${getterFunction}, jsonWriter);
    </#if>
</#if>
</#macro>