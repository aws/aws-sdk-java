<#macro content dataModel>
<#local shapes = dataModel.shapes/>
<#local metadata = dataModel.metadata/>
<#local shapeName = dataModel.shapeName/>
<#local customConfig = dataModel.customConfig/>

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

    <#assign shape = shapes[shapeName]/>
    public Request<${shapeName}> marshall(${shape.variable.variableType} ${shape.variable.variableName}) {

        if (${shape.variable.variableName} == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        <@RequiredParameterValidationInvocationMacro.content dataModel.customConfig shape/>

        <#assign serviceNameForRequest = customConfig.customServiceNameForRequest!metadata.syncInterface />

        Request<${shapeName}> request = new DefaultRequest<${shapeName}>(${shape.variable.variableName}, "${serviceNameForRequest}");
        request.addHeader("X-Amz-Target", "${shape.marshaller.target}");

        <#assign httpVerb = (shape.marshaller.verb)!POST/>
        request.setHttpMethod(HttpMethodName.${httpVerb});

        request.setResourcePath("");

        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();

          <@MemberMarshallerMacro.content customConfig shapeName shape.variable.variableName shapes/>

          jsonWriter.endObject();

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes(UTF8);
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", "${metadata.jsonContentVersion}");
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

    <@RequiredParameterValidationFunctionMacro.content dataModel.customConfig shape/>
}

</#macro>