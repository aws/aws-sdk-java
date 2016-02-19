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
            uriResourcePath = uriResourcePath.replace("{${member.http.marshallLocationName}}", (${getMember}() == null ) ? "" : StringUtils.from${member.variable.simpleType}(${getMember}()));
        </#if>
        </#list>
     </#if>
     request.setResourcePath(uriResourcePath);
</#macro>