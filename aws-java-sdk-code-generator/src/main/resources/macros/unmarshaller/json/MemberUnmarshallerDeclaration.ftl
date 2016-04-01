<#macro content memberModel >
    <#if memberModel.simple>
        context.getUnmarshaller(${memberModel.variable.variableType}.class)
    <#elseif memberModel.list >
        <#if memberModel.listModel.listMemberModel?has_content >
            <#local memberUnmarshaller >
                <#-- recursion -->
                <@content memberModel.listModel.listMemberModel />
            </#local>
        <#else>
            <#local memberUnmarshaller = "context.getUnmarshaller(${memberModel.listModel.simpleType}.class)" />
        </#if>
        new ListUnmarshaller<${memberModel.listModel.memberType}>(${memberUnmarshaller})
    <#elseif memberModel.map >
        <#local keyUnmarshaller = "context.getUnmarshaller(${memberModel.mapModel.keyType}.class)" />
        <#if memberModel.mapModel.valueModel?has_content >
            <#local valueUnmarshaller >
                <#-- recursion -->
                <@content memberModel.mapModel.valueModel />
            </#local>
        <#else>
            <#local valueUnmarshaller = "context.getUnmarshaller
                 (${memberModel.mapModel.valueType}.class)" />
        </#if>
        new MapUnmarshaller<${memberModel.mapModel.keyType}, ${memberModel.mapModel.valueType}>(${keyUnmarshaller}, ${valueUnmarshaller})
    <#else>
        ${memberModel.variable.simpleType}JsonUnmarshaller.getInstance()
    </#if>
</#macro>