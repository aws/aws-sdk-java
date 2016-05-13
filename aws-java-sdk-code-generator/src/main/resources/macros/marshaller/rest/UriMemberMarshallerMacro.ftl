<#macro content shape getterFunctionPrefix>

    <#local resourcePath = (shape.marshaller.requestUri)!""/>

    String uriResourcePath = "${resourcePath}";

    <#if resourcePath?contains("?")>
        uriResourcePath = com.amazonaws.util.UriResourcePathUtils.addStaticQueryParamtersToRequest(request, uriResourcePath);
    </#if>

    <#if shape.members?has_content>
        <#list shape.members as member>
        <#if member.http.isUri() >
            <#local getMember = getterFunctionPrefix + ".get" + member.name />
            <#if member.idempotencyToken>
                uriResourcePath = uriResourcePath.replace("{${member.http.marshallLocationName}}", <@IdempotencyTokenMacro.content getMember member.variable.simpleType/>);
            <#else>
                uriResourcePath = uriResourcePath.replace("{${member.http.marshallLocationName}}", (${getMember}() != null ) ? SdkHttpUtils.urlEncode(StringUtils.from${member.variable.simpleType}(${getMember}()), false) : "");
            </#if>
        </#if>
        </#list>
     </#if>
     request.setResourcePath(uriResourcePath);
</#macro>
