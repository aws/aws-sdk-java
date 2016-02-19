<#macro content shape>
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        <#if shape.members?has_content>
        <#list shape.members as member>
        <#local memberName = member.name>
        if (get${memberName}() != null) sb.append("${memberName}: " + get${memberName}() <#if member_has_next> + ","</#if>);
        </#list>
        </#if>
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ${shape.shapeName} == false) return false;
        ${shape.shapeName} other = (${shape.shapeName})obj;
        <#if shape.members?has_content>
        <#list  shape.members as member>
        <#local memberName = member.name>
        if (other.get${memberName}() == null ^ this.get${memberName}() == null) return false;
        if (other.get${memberName}() != null && other.get${memberName}().equals(this.get${memberName}()) == false) return false;
        </#list>
        </#if>
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        <#if shape.members?has_content>
        <#list  shape.members as member>
        <#local memberName = member.name>
        hashCode = prime * hashCode + ((get${memberName}() == null) ? 0 : get${memberName}().hashCode());
        </#list>
        </#if>
        return hashCode;
    }
</#macro>