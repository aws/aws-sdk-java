${fileHeader}
package ${metadata.packageName}.model;

import javax.annotation.Generated;

/**
 * <#if shape.documentation?has_content>${shape.documentation}</#if>
 */
<#if shape.deprecated>
@Deprecated
</#if>
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ${shape.shapeName} {

<#assign enums = shape.enums/>

<#list enums as enum>
    ${enum.name}("${enum.value}")<#if enum_has_next>,<#else>;</#if>
</#list>

    private String value;

    private ${shape.shapeName}(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return ${shape.shapeName} corresponding to the value
     *
     * @throws IllegalArgumentException
     *             If the specified value does not map to one of the known values in this enum.
     */
    public static ${shape.shapeName} fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (${shape.shapeName} enumEntry : ${shape.shapeName}.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
