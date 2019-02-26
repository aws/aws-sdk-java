${fileHeader}
package ${transformPackage};

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import ${metadata.packageName}.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.XMLWriter;
import com.amazonaws.util.SdkHttpUtils;

/**
 * ${shapeName} Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ${shapeName}Marshaller implements Marshaller<Request<${shapeName}>, ${shapeName}> {

<#assign shape = shapes[shapeName]/>
    public Request<${shapeName}> marshall(${shape.variable.variableType} ${shape.variable.variableName}) {

        if (${shape.variable.variableName} == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        <@RequiredParameterValidationInvocationMacro.content customConfig shape/>

        <#assign serviceNameForRequest = customConfig.customServiceNameForRequest!metadata.syncInterface />

        Request<${shape.shapeName}> request = new DefaultRequest<${shape.shapeName}>(${shape.variable.variableName}, "${serviceNameForRequest}");

        <#assign httpVerb = (shape.marshaller.verb)!POST/>
        request.setHttpMethod(HttpMethodName.${httpVerb});

        <@MarshalHeaderMembersMacro.content shape shape.variable.variableName/>
        <@UriMemberMarshallerMacro.content shape shape.variable.variableName/>
        <@QueryStringMemberMarshallerMacro.content shape shape.variable.variableName/>

        <#if shape.hasPayloadMember>
            <#list shape.members as member>
                <#if (member.http.isStreaming)>
                request.setContent(${shape.variable.variableName}.${member.getterMethodName}());
                if (!request.getHeaders().containsKey("Content-Type")) {
                    request.addHeader("Content-Type", "binary/octet-stream");
                }
                <#elseif (member.http.isPayload) && member.variable.variableType = "java.nio.ByteBuffer">
                request.setContent(BinaryUtils.toStream(${shape.variable.variableName}.${member.getterMethodName}()));
                if (!request.getHeaders().containsKey("Content-Type")) {
                    request.addHeader("Content-Type", "binary/octet-stream");
                }
                <#elseif (member.http.isPayload)>
                try {
                    StringWriter stringWriter = new StringWriter();
                    <#-- xmlNameSpaceUri comes from the payload member reference -->
                    XMLWriter xmlWriter = new XMLWriter(stringWriter, "${member.xmlNameSpaceUri}");

                    ${member.variable.variableType} ${member.variable.variableName} = ${shape.variable.variableName}.${member.getterMethodName}();
                    if (${member.variable.variableName} != null) {
                        xmlWriter.startElement("${member.http.marshallLocationName}");
                        <@MemberMarshallerMacro.content customConfig member.c2jShape member.variable.variableName shapes/>
                        xmlWriter.endElement();
                    }

                    request.setContent(new StringInputStream(stringWriter.getBuffer().toString()));
                    request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes(UTF8).length));
                    if (!request.getHeaders().containsKey("Content-Type")) {
                        request.addHeader("Content-Type", "application/xml");
                    }
                } catch(Throwable t) {
                    throw new SdkClientException("Unable to marshall request to XML: " + t.getMessage(), t);
                }
                <#break>
                </#if>
            </#list>
        <#elseif shape.unboundMembers?has_content>
        try {
            StringWriter stringWriter = new StringWriter();
            <#-- xmlNameSpaceUri comes from the operation input reference -->
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "${shape.marshaller.xmlNameSpaceUri}");

            xmlWriter.startElement("${shape.marshaller.locationName}");
            if (${shape.variable.variableName} != null) {
            <@MemberMarshallerMacro.content customConfig shapeName shape.variable.variableName shapes/>
            }
            xmlWriter.endElement();

            request.setContent(new StringInputStream(stringWriter.getBuffer().toString()));
            request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes(UTF8).length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", "application/xml");
            }
        } catch(Throwable t) {
            throw new SdkClientException("Unable to marshall request to XML: " + t.getMessage(), t);
        }
        </#if>

        return request;
    }

    <@RequiredParameterValidationFunctionMacro.content customConfig shape/>
}
