${fileHeader}
package ${metadata.packageName}.model;

/**
 * <#if shape.documentation?has_content>${shape.documentation}</#if>
 */
public class ${shape.shapeName} extends ${baseClassFqcn} {
    private static final long serialVersionUID = 1L;

    <@VariableDeclarationMacro.content shape/>

    /**
     * Constructs a new ${shape.shapeName} with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ${shape.shapeName}(String message) {
        super(message);
    }

    <#if MethodDefinitionMacro?has_content>
    <@MethodDefinitionMacro.content customConfig shape shape.shapeName/>
    </#if>

}
