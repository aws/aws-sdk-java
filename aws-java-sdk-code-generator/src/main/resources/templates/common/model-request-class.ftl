${fileHeader}
package ${metadata.packageName}.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <#if shape.documentation?has_content>${shape.documentation}</#if>
 */
public class ${shape.shapeName} extends ${baseClassFqcn} implements Serializable, Cloneable {

    <@VariableDeclarationMacro.content shape/>

    <#if shape.additionalConstructors?has_content>
        <@ConstructorDefinitionMacro.content shape/>
    </#if>

    <@MethodDefinitionMacro.content customConfig shape shape.shapeName/>

    <#-- Injection point for adding custom code to request classes -->
    <#if CustomRequestClassMethodsMacro?has_content>
        <@CustomRequestClassMethodsMacro.content shape/>
    </#if>

    <@OverrideMethodsMacro.content shape />

    @Override
    public ${shape.shapeName} clone() {
        return (${shape.shapeName}) super.clone();
    }
}
