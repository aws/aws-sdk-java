/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a header match type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/HeaderMatchType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HeaderMatchType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A contains type match.
     * </p>
     */
    private String contains;
    /**
     * <p>
     * An exact type match.
     * </p>
     */
    private String exact;
    /**
     * <p>
     * A prefix type match. Matches the value with the prefix.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * A contains type match.
     * </p>
     * 
     * @param contains
     *        A contains type match.
     */

    public void setContains(String contains) {
        this.contains = contains;
    }

    /**
     * <p>
     * A contains type match.
     * </p>
     * 
     * @return A contains type match.
     */

    public String getContains() {
        return this.contains;
    }

    /**
     * <p>
     * A contains type match.
     * </p>
     * 
     * @param contains
     *        A contains type match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeaderMatchType withContains(String contains) {
        setContains(contains);
        return this;
    }

    /**
     * <p>
     * An exact type match.
     * </p>
     * 
     * @param exact
     *        An exact type match.
     */

    public void setExact(String exact) {
        this.exact = exact;
    }

    /**
     * <p>
     * An exact type match.
     * </p>
     * 
     * @return An exact type match.
     */

    public String getExact() {
        return this.exact;
    }

    /**
     * <p>
     * An exact type match.
     * </p>
     * 
     * @param exact
     *        An exact type match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeaderMatchType withExact(String exact) {
        setExact(exact);
        return this;
    }

    /**
     * <p>
     * A prefix type match. Matches the value with the prefix.
     * </p>
     * 
     * @param prefix
     *        A prefix type match. Matches the value with the prefix.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * A prefix type match. Matches the value with the prefix.
     * </p>
     * 
     * @return A prefix type match. Matches the value with the prefix.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * A prefix type match. Matches the value with the prefix.
     * </p>
     * 
     * @param prefix
     *        A prefix type match. Matches the value with the prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeaderMatchType withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContains() != null)
            sb.append("Contains: ").append(getContains()).append(",");
        if (getExact() != null)
            sb.append("Exact: ").append(getExact()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HeaderMatchType == false)
            return false;
        HeaderMatchType other = (HeaderMatchType) obj;
        if (other.getContains() == null ^ this.getContains() == null)
            return false;
        if (other.getContains() != null && other.getContains().equals(this.getContains()) == false)
            return false;
        if (other.getExact() == null ^ this.getExact() == null)
            return false;
        if (other.getExact() != null && other.getExact().equals(this.getExact()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContains() == null) ? 0 : getContains().hashCode());
        hashCode = prime * hashCode + ((getExact() == null) ? 0 : getExact().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public HeaderMatchType clone() {
        try {
            return (HeaderMatchType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.vpclattice.model.transform.HeaderMatchTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
