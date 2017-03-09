${fileHeader}
package ${metadata.packageName}.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import ${metadata.packageName}.model.transform.${shape.shapeName}Marshaller;

/**
 * <#if shape.documentation?has_content>${shape.documentation}</#if>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ${shape.shapeName} extends AmazonWebServiceRequest
        implements Serializable, Cloneable, DryRunSupportedRequest<${shape.shapeName}> {

    <@VariableDeclarationMacro.content shape/>

    <#if shape.additionalConstructors?has_content>
        <@ConstructorDefinitionMacro.content shape/>
    </#if>

    <@MethodDefinitionMacro.content customConfig shape shape.shapeName/>

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<${shape.shapeName}> getDryRunRequest() {
        Request<${shape.shapeName}> request = new ${shape.shapeName}Marshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    <@OverrideMethodsMacro.content shape />

    @Override
    public ${shape.shapeName} clone() {
        return (${shape.shapeName}) super.clone();
    }
}
