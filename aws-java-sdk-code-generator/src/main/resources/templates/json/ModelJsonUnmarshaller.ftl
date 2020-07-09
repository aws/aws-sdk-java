<#assign shapeFqcn = shapeFqcn/>
<#assign packageName = packageName/>
${fileHeader}
package ${transformPackage};

import java.util.Map;
import java.math.*;
import java.nio.ByteBuffer;
import javax.annotation.Generated;

import ${metadata.packageName}.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ${shape.shapeName} JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ${shape.shapeName}JsonUnmarshaller implements Unmarshaller<${shapeFqcn}, JsonUnmarshallerContext> {

    public ${shapeFqcn} unmarshall(JsonUnmarshallerContext context) throws Exception {
        ${shapeFqcn} ${shape.variable.variableName} = new ${shapeFqcn}();

<#if shape.hasHeaderMember >
        if (context.isStartOfDocument()) {
    <#list shape.members as memberModel>
        <#if memberModel.http.isHeader() >
            if (context.getHeader("${memberModel.http.unmarshallLocationName}") != null) {
                context.setCurrentHeader("${memberModel.http.unmarshallLocationName}");
                 <#-- TODO: verify date marshalling/unmarshalling behavior with ion service, if we ever support one -->
                <#if memberModel.variable.variableType == "java.util.Date" && !metadata.ionProtocol && !metadata.cborProtocol>
                    ${shape.variable.variableName}.${memberModel.setterMethodName}(DateJsonUnmarshallerFactory.getInstance("${memberModel.variable.timestampFormat}").unmarshall(context));
                <#else>
                    ${shape.variable.variableName}.${memberModel.setterMethodName}(<@MemberUnmarshallerDeclarationMacro.content memberModel />.unmarshall(context));
                </#if>
            }
        </#if>
    </#list>
        }
</#if>

<#if shape.hasStatusCodeMember >
    <#list shape.members as memberModel>
        <#if memberModel.http.isStatusCode() >
        ${shape.variable.variableName}.${memberModel.setterMethodName}(context.getHttpResponse().getStatusCode());
        </#if>
    </#list>
</#if>

<#if shape.hasPayloadMember>
    <#assign explicitPayloadMember=shape.payloadMember />
    <#if explicitPayloadMember.http.isStreaming>
        ${shape.variable.variableName}.${explicitPayloadMember.setterMethodName}(context.getHttpResponse().getContent());
    <#elseif explicitPayloadMember.variable.variableType == "java.nio.ByteBuffer">
        java.io.InputStream is = context.getHttpResponse().getContent();
        if(is != null) {
            try {
                ${shape.variable.variableName}.${explicitPayloadMember.setterMethodName}(java.nio.ByteBuffer.wrap(com.amazonaws.util.IOUtils.toByteArray(is)));
            } finally {
                com.amazonaws.util.IOUtils.closeQuietly(is, null);
            }
        }
    <#else>
        <@PayloadUnmarshallerMacro.content shape />
     </#if>
<#elseif shape.unboundMembers?has_content || (shape.hasNoMembers() && shape.shapeType != "Response") >
    <@PayloadUnmarshallerMacro.content shape packageName/>
</#if>

        return ${shape.variable.variableName};
    }

    private static ${shape.shapeName}JsonUnmarshaller instance;
    public static ${shape.shapeName}JsonUnmarshaller getInstance() {
        if (instance == null) instance = new ${shape.shapeName}JsonUnmarshaller();
        return instance;
    }
}
