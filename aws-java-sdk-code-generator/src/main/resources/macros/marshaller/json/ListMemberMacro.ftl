<#macro content member getterFunction>
<#if member.listModel.simple>
    jsonGenerator.writeValue(${getterFunction});
<#elseif member.listModel.listMemberModel??>
    <#local listMember = member.listModel.listMemberModel/>

    <#if listMember.list>
        TODO : Add support for list of lists
    <#elseif listMember.map>
        <#local loopVariable = member.name + "ListMapEntry"/>
        jsonGenerator.writeStartObject();
        for(Map.Entry<${listMember.mapModel.keyType},${listMember.mapModel.valueType}> ${loopVariable} : ${getterFunction}.entrySet()) {
            if (${loopVariable}.getValue() != null) {
              jsonGenerator.writeFieldName(${loopVariable}.getKey());
            <#if listMember.mapModel.valueSimple>
              jsonGenerator.writeValue(${loopVariable}.getValue());
            <#else>
            ${listMember.mapModel.valueType}JsonMarshaller.getInstance().marshall(${loopVariable}.getValue(), jsonGenerator);
            </#if>
            }
        }
        jsonGenerator.writeEndObject();
    <#else>
        ${member.listModel.memberType}JsonMarshaller.getInstance().marshall(${getterFunction}, jsonGenerator);
    </#if>
</#if>
</#macro>