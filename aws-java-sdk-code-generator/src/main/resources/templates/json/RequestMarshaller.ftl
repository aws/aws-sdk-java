<#assign shapes = shapes/>
<#assign metadata = metadata/>
<#assign shapeName = shapeName/>
<#assign customConfig = customConfig/>
<#assign shape = shapes[shapeName]/>
<#assign httpVerb = (shape.marshaller.verb)!POST/>
<#assign serviceNameForRequest = customConfig.customServiceNameForRequest!metadata.syncInterface />

${fileHeader}
package ${transformPackage};

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import ${metadata.packageName}.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.*;
import com.amazonaws.protocol.Protocol;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ${shapeName} Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ${className} implements Marshaller<Request<${shapeName}>, ${shapeName}> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder()
        .protocol(Protocol.${protocolEnum})
        .requestUri("${shape.marshaller.requestUri}")
        .httpMethodName(HttpMethodName.${httpVerb})
        .hasExplicitPayloadMember(${shape.hasPayloadMember?c})
        .hasPayloadMembers(${shape.hasPayloadMembers()?c})
        <#if shape.marshaller.target??>
        .operationIdentifier("${shape.marshaller.target}")
        </#if>
        .serviceName("${serviceNameForRequest}")
        .build();

    private final ${metadata.protocolFactory} protocolFactory;

    public ${className}(${metadata.protocolFactory} protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<${shapeName}> marshall(${shape.variable.variableType} ${shape.variable.variableName}) {

        if (${shape.variable.variableName} == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        <@RequiredParameterValidationInvocationMacro.content customConfig shape/>

        try {
            final ProtocolRequestMarshaller<${shapeName}> protocolMarshaller =
            protocolFactory.createProtocolMarshaller(SDK_OPERATION_BINDING, ${shape.variable.variableName});

            protocolMarshaller.startMarshalling();
            ${shapeName}Marshaller.getInstance().marshall(${shape.variable.variableName}, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch(Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

    <@RequiredParameterValidationFunctionMacro.content customConfig shape/>
}

