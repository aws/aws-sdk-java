<#macro content member getterFunction>
<#if member.listModel.simple>
    jsonWriter.value(${getterFunction});
<#elseif member.listModel.listMemberModel??>
    <#local listMember = member.listModel.listMemberModel/>

    <#if listMember.list>
        TODO : Add support for list of lists
    <#elseif listMember.map>
        <#local loopVariable = member.name + "ListMapEntry"/>
        jsonWriter.object();
        for(Map.Entry<${listMember.mapModel.keyType},${listMember.mapModel.valueType}> ${loopVariable} : ${getterFunction}.entrySet()) {
            if (${loopVariable}.getValue() != null) {
              jsonWriter.key(${loopVariable}.getKey());
            <#if listMember.mapModel.valueSimple>
              jsonWriter.value(${loopVariable}.getValue());
            <#else>
            ${listMember.mapModel.valueType}JsonMarshaller.getInstance().marshall(${loopVariable}.getValue(), jsonWriter);
            </#if>
            }
        }
        jsonWriter.endObject();
    <#else>
        ${member.listModel.memberType}JsonMarshaller.getInstance().marshall(${getterFunction}, jsonWriter);
    </#if>
</#if>
</#macro>