<#macro content shape>

/**
 * Default constructor for ${shape.shapeName} object. Callers should use the setter or fluent setter (with...) methods to
 * initialize the object after creating it.
 */
public ${shape.shapeName}() { }

<#list shape.additionalConstructors as constructor>

    ${constructor.documentation}
    public ${shape.shapeName}(${constructor.argumentsDeclaration}) {
    <#list constructor.arguments as argument>
        <#local memberName = shape.getMemberByVariableName(argument.name).name />
        set${memberName}(${argument.name}<#if argument.isEnumArg>.toString()</#if>);
    </#list>
    }

</#list>

</#macro>