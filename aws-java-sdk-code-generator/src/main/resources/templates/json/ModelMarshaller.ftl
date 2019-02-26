<#assign shapes = shapes/>
<#assign metadata = metadata/>
<#assign shapeName = shapeName/>
<#assign customConfig = customConfig/>
<#assign shape = shapes[shapeName]/>

${fileHeader}
package ${transformPackage};

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import ${metadata.packageName}.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ${shapeName}Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ${className} {

    <#if shape.members??>
        <#list shape.members as member>
            private static final MarshallingInfo<${member.marshallingTargetClass}> ${member.marshallerBindingFieldName} = MarshallingInfo.builder(MarshallingType.${member.marshallingType})
                 .marshallLocation(MarshallLocation.${member.http.marshallLocation})
                 <#if member.http.isPayload>
                 .isExplicitPayloadMember(true)
                 <#else>
                 .marshallLocationName("${member.http.marshallLocationName}")
                 </#if>
                 <#if member.isBinary>
                 .isBinary(true)
                 </#if>
                 <@DefaultValueSupplierMacro.content member />
                 <#if member.variable.timestampFormat??>
                 .timestampFormat("${member.variable.timestampFormat}")
                 </#if>
                 .build();
        </#list>
    </#if>

    private static final ${className} instance = new ${className}();

    public static ${className} getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(${shapeName} ${shape.variable.variableName}, ProtocolMarshaller protocolMarshaller) {

        if (${shape.variable.variableName} == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            <#if shape.members??>
                <#list shape.members as member>
                <#assign getter = shape.variable.variableName + "." + member.getterMethodName + "()" />
                protocolMarshaller.marshall(
                ${getter},
                ${member.marshallerBindingFieldName});
                </#list>
            </#if>
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

    <@RequiredParameterValidationFunctionMacro.content customConfig shape/>
}

