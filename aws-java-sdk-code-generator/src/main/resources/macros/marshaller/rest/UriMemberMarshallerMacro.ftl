<#macro content shape getterFunctionPrefix>

    <#local resourcePath = (shape.marshaller.requestUri)!""/>

    String uriResourcePath = "${resourcePath}";

    <#if resourcePath?contains("?")>
        uriResourcePath = com.amazonaws.util.UriResourcePathUtils.addStaticQueryParamtersToRequest(request, uriResourcePath);
    </#if>

    <#if shape.members?has_content>
        <#list shape.members as member>
        <#if member.http.isUri() >
            uriResourcePath = ${member.pathMarshaller}.marshall(uriResourcePath, "${member.http.marshallLocationName}",
                <@UriGetMemberMarshallerMacro.content getterFunctionPrefix, member/>);
        </#if>
        </#list>
     </#if>
     request.setResourcePath(uriResourcePath);
</#macro>
