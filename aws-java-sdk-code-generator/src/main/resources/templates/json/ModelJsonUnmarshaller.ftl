${fileHeader}
package ${metadata.packageName}.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import ${metadata.packageName}.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ${shape.shapeName} JSON Unmarshaller
 */
public class ${shape.shapeName}JsonUnmarshaller implements Unmarshaller<${shape.shapeName}, JsonUnmarshallerContext> {

    public ${shape.shapeName} unmarshall(JsonUnmarshallerContext context) throws Exception {
        ${shape.shapeName} ${shape.variable.variableName} = new ${shape.shapeName}();

<#if shape.hasHeaderMember >
        if (context.isStartOfDocument()) {
    <#list shape.members as memberModel>
        <#if memberModel.http.isHeader() >
            if (context.getHeader("${memberModel.http.unmarshallLocationName}") != null) {
                context.setCurrentHeader("${memberModel.http.unmarshallLocationName}");
                <#if memberModel.variable.simpleType == "Date">
                    ${shape.variable.variableName}.set${memberModel.name}(com.amazonaws.util.DateUtils.parseRFC822Date(context.readText()));
                <#else>
                    ${shape.variable.variableName}.set${memberModel.name}(<@MemberUnmarshallerDeclarationMacro.content memberModel />.unmarshall(context));
                </#if>
            }
        </#if>
    </#list>
        }
</#if>

<#if shape.hasStatusCodeMember >
    <#list shape.members as memberModel>
        <#if memberModel.http.isStatusCode() >
        ${shape.variable.variableName}.set${memberModel.name}(context.getHttpResponse().getStatusCode());
        </#if>
    </#list>
</#if>

<#if shape.hasPayloadMember>
    <#assign explicitPayloadMember=shape.payloadMember />
    <#if explicitPayloadMember.http.isStreaming>
        ${shape.variable.variableName}.set${explicitPayloadMember.name}(context.getHttpResponse().getContent());
    <#elseif explicitPayloadMember.variable.variableType == "java.nio.ByteBuffer">
        java.io.InputStream is = context.getHttpResponse().getContent();
        if(is != null) {
            try {
                ${shape.variable.variableName}.set${explicitPayloadMember.name}(java.nio.ByteBuffer.wrap(com.amazonaws.util.IOUtils.toByteArray(is)));
            } finally {
                com.amazonaws.util.IOUtils.closeQuietly(is, null);
            }
        }
    <#else>
        <@PayloadUnmarshallerMacro.content shape />
     </#if>
<#elseif shape.unboundMembers?has_content>
    <@PayloadUnmarshallerMacro.content shape />
</#if>

        return ${shape.variable.variableName};
    }

    private static ${shape.shapeName}JsonUnmarshaller instance;
    public static ${shape.shapeName}JsonUnmarshaller getInstance() {
        if (instance == null) instance = new ${shape.shapeName}JsonUnmarshaller();
        return instance;
    }
}
