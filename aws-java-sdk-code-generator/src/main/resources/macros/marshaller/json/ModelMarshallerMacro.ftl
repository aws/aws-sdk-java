<#macro content dataModel>
<#local shapes = dataModel.shapes/>
<#local metadata = dataModel.metadata/>
<#local shapeName = dataModel.shapeName/>
<#local customConfig = dataModel.customConfig/>

${dataModel.fileHeader}
package ${metadata.packageName}.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import ${metadata.packageName}.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ${shapeName}Marshaller
 */
public class ${shapeName}JsonMarshaller {

    <#assign shape = shapes[shapeName]/>
    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(${shapeName} ${shape.variable.variableName}, StructuredJsonGenerator jsonGenerator) {

        if (${shape.variable.variableName} == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        <@RequiredParameterValidationInvocationMacro.content dataModel.customConfig shape/>

        try {
            jsonGenerator.writeStartObject();

            <@MemberMarshallerMacro.content customConfig shapeName shape.variable.variableName shapes/>

            jsonGenerator.writeEndObject();
        } catch(Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ${shapeName}JsonMarshaller instance;
    public static ${shapeName}JsonMarshaller getInstance() {
        if (instance == null) instance = new ${shapeName}JsonMarshaller();
        return instance;
    }

    <@RequiredParameterValidationFunctionMacro.content dataModel.customConfig shape/>
}
</#macro>