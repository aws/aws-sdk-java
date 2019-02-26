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
        <#local member = shape.getMemberByVariableName(argument.name) />
        ${member.setterMethodName}(${argument.name}<#if argument.isEnumArg>.toString()</#if>);
    </#list>
    }

</#list>

</#macro>