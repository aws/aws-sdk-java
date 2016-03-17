<#macro content dataModel>
<#local shapes = dataModel.shapes/>
<#local metadata = dataModel.metadata/>
<#local shapeName = dataModel.shapeName/>
<#local customConfig = dataModel.customConfig/>
<#local contentType = (metadata.jsonContentVersion)!""/>

<@LicenseCommentBlockMacro.content />

package ${metadata.packageName}.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import ${metadata.packageName}.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ${shapeName} Marshaller
 */
public class ${shapeName}Marshaller implements Marshaller<Request<${shapeName}>, ${shapeName}> {

    <#-- The empty content type seems to be working for all services. If the
         C2j model has the json version specified, we honor that; else
         default to empty string.
    -->
    private static final String DEFAULT_CONTENT_TYPE = "${contentType}";

    <#local shape = shapes[shapeName]/>
    public Request<${shapeName}> marshall(${shape.variable.variableType} ${shape.variable.variableName}) {

        if (${shape.variable.variableName} == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        <@RequiredParameterValidationInvocationMacro.content dataModel.customConfig shape/>

       <#assign serviceNameForRequest = customConfig.customServiceNameForRequest!metadata.syncInterface />

        Request<${shapeName}> request = new DefaultRequest<${shapeName}>(${shape.variable.variableName}, "${serviceNameForRequest}");

        <#local httpVerb = (shape.marshaller.verb)!POST/>
        request.setHttpMethod(HttpMethodName.${httpVerb});

        <@MarshalHeaderMembersMacro.content shape shape.variable.variableName/>
        <@UriMemberMarshallerMacro.content shape shape.variable.variableName/>
        <@QueryStringMemberMarshallerMacro.content shape shape.variable.variableName/>

        <#if shape.hasPayloadMember>
            <#list shape.members as member>
                <#if (member.http.isStreaming)>
                request.setContent(${shape.variable.variableName}.get${member.name}());
                if (!request.getHeaders().containsKey("Content-Type")) {
                    request.addHeader("Content-Type", DEFAULT_CONTENT_TYPE);
                }
                <#elseif (member.http.isPayload) && member.variable.variableType = "java.nio.ByteBuffer">
                request.setContent(BinaryUtils.toStream(${shape.variable.variableName}.get${member.name}()));
                if (!request.getHeaders().containsKey("Content-Type")) {
                    request.addHeader("Content-Type", DEFAULT_CONTENT_TYPE);
                }
                <#elseif (member.http.isPayload)>
                try {
                    final SdkJsonGenerator jsonGenerator = new SdkJsonGenerator();

                    ${member.variable.variableType} ${member.variable.variableName} = ${shape.variable.variableName}.get${member.name}();
                    if (${member.variable.variableName} != null) {
                        jsonGenerator.writeStartObject();
                        <@MemberMarshallerMacro.content customConfig member.c2jShape member.variable.variableName shapes/>
                        jsonGenerator.writeEndObject();
                    }

                    byte[] content = jsonGenerator.getBytes();
                    request.setContent(new ByteArrayInputStream(content));
                    request.addHeader("Content-Length", Integer.toString(content.length));
                    if (!request.getHeaders().containsKey("Content-Type")) {
                        request.addHeader("Content-Type", DEFAULT_CONTENT_TYPE);
                    }
                } catch(Throwable t) {
                    throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
                }
                <#break>
                </#if>
            </#list>
        <#elseif !shape.unboundMembers?has_content>
        <#-- rest-json requires a zero-byte content if there is no request member bound to the body -->
        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", DEFAULT_CONTENT_TYPE);
        }
        <#else>
        try {
            final SdkJsonGenerator jsonGenerator = new SdkJsonGenerator();

            jsonGenerator.writeStartObject();

            <@MemberMarshallerMacro.content customConfig shapeName shape.variable.variableName shapes/>

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", DEFAULT_CONTENT_TYPE);
            }
        } catch(Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        </#if>

        return request;
    }

    <@RequiredParameterValidationFunctionMacro.content dataModel.customConfig shape/>
}

</#macro>
