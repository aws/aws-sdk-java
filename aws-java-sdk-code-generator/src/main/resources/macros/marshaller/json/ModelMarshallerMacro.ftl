<#macro content dataModel>
<#local shapes = dataModel.shapes/>
<#local metadata = dataModel.metadata/>
<#local shapeName = dataModel.shapeName/>
<#local customConfig = dataModel.customConfig/>

<@LicenseCommentBlockMacro.content />

package ${metadata.packageName}.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import ${metadata.packageName}.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ${shapeName}Marshaller
 */
public class ${shapeName}JsonMarshaller {

    <#assign shape = shapes[shapeName]/>
    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(${shapeName} ${shape.variable.variableName}, JSONWriter jsonWriter) {
        if (${shape.variable.variableName} == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        <@RequiredParameterValidationInvocationMacro.content dataModel.customConfig shape/>

        try {
            jsonWriter.object();

            <@MemberMarshallerMacro.content customConfig shapeName shape.variable.variableName shapes/>

            jsonWriter.endObject();
        } catch(Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
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