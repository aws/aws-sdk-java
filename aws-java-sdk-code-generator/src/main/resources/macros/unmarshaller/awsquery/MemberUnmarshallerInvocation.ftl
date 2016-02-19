<#macro content shapeVarName memberModel >

<#local unmarshallerLocationName = memberModel.http.unmarshallLocationName />
<#if memberModel.http.additionalUnmarshallingPath?has_content>
    <#local unmarshallerLocationName = unmarshallerLocationName + "/" + memberModel.http.additionalUnmarshallingPath />
</#if>

<#if memberModel.list>
    <#if memberModel.http.flattened>
        <#local listMemberPath = memberModel.listModel.memberLocationName!"member" />
    <#else>
        <#local listMemberPath = unmarshallerLocationName + "/" + memberModel.listModel.memberLocationName!"member" />
    </#if>

    <#if memberModel.listModel.memberAdditionalUnmarshallingPath?has_content>
        <#local listMemberPath = listMemberPath + "/" + memberModel.listModel.memberAdditionalUnmarshallingPath />
    </#if>
                if (context.testExpression("${listMemberPath}", targetDepth)) {
                    ${shapeVarName}.get${memberModel.name}().add(${memberModel.listModel.simpleType}StaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

<#elseif memberModel.map>
    <#local mapEntryPath = unmarshallerLocationName />

    <#if !memberModel.http.flattened>
        <#local mapEntryPath = "${unmarshallerLocationName}/entry" />
    </#if>
                if (context.testExpression("${mapEntryPath}", targetDepth)) {
                    Entry<${memberModel.mapModel.keyType}, ${memberModel.mapModel.valueType}> entry = ${memberModel.name}MapEntryUnmarshaller.getInstance().unmarshall(context);
                    ${shapeVarName}.get${memberModel.name}().put(entry.getKey(), entry.getValue());
                    continue;
                }

<#else>
                if (context.testExpression("${unmarshallerLocationName}", targetDepth)) {
                    ${shapeVarName}.set${memberModel.name}(${memberModel.variable.simpleType}StaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
</#if>
</#macro>
