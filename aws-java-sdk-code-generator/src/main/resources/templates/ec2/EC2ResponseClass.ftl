${fileHeader}
package ${metadata.packageName}.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * <#if shape.documentation?has_content>${shape.documentation}</#if>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ${shape.shapeName} extends ${baseClassFqcn}
    implements Serializable, Cloneable {

    <@VariableDeclarationMacro.content shape/>

    <#if shape.additionalConstructors?has_content>
        <@ConstructorDefinitionMacro.content shape/>
    </#if>

    <@MethodDefinitionMacro.content customConfig shape shape.shapeName/>

    <#if shape.shapeName == "GetConsoleOutputResult">
    /**
     * The decoded console output.
     *
     * @return The decoded console output.
     */
    public String getDecodedOutput() {
        byte[] bytes = com.amazonaws.util.BinaryUtils.fromBase64(output);
        return bytes == null ? null : new String(bytes, com.amazonaws.util.StringUtils.UTF8);
    }
    </#if>

    <@OverrideMethodsMacro.content shape/>

    @Override
    public ${shape.shapeName} clone() {
        try {
            return (${shape.shapeName}) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
    }
}
