<#macro content memberModel >
    <#if memberModel.list >
        <#if memberModel.listModel.listMemberModel?has_content >
            <#local memberUnmarshaller >
                <#-- recursion -->
                <@content memberModel.listModel.listMemberModel />
            </#local>
        <#else>
            <#local memberUnmarshaller = "${memberModel.listModel.simpleType}JsonUnmarshaller.getInstance()" />
        </#if>
        new ListUnmarshaller<${memberModel.listModel.memberType}>(${memberUnmarshaller})
    <#elseif memberModel.map >
        <#local keyUnmarshaller = "${memberModel.mapModel.keyType}JsonUnmarshaller.getInstance()" />
        <#if memberModel.mapModel.valueModel?has_content >
            <#local valueUnmarshaller >
                <#-- recursion -->
                <@content memberModel.mapModel.valueModel />
            </#local>
        <#else>
            <#local valueUnmarshaller = "${memberModel.mapModel.valueType}JsonUnmarshaller.getInstance()" />
        </#if>
        new MapUnmarshaller<${memberModel.mapModel.keyType}, ${memberModel.mapModel.valueType}>(${keyUnmarshaller}, ${valueUnmarshaller})
    <#else>
        ${memberModel.variable.simpleType}JsonUnmarshaller.getInstance()
    </#if>
</#macro>