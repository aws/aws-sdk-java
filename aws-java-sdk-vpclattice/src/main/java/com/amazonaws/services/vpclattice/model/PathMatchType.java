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
 * Describes a path match type. Each rule can include only one of the following types of paths.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/PathMatchType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PathMatchType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An exact match of the path.
     * </p>
     */
    private String exact;
    /**
     * <p>
     * A prefix match of the path.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * An exact match of the path.
     * </p>
     * 
     * @param exact
     *        An exact match of the path.
     */

    public void setExact(String exact) {
        this.exact = exact;
    }

    /**
     * <p>
     * An exact match of the path.
     * </p>
     * 
     * @return An exact match of the path.
     */

    public String getExact() {
        return this.exact;
    }

    /**
     * <p>
     * An exact match of the path.
     * </p>
     * 
     * @param exact
     *        An exact match of the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathMatchType withExact(String exact) {
        setExact(exact);
        return this;
    }

    /**
     * <p>
     * A prefix match of the path.
     * </p>
     * 
     * @param prefix
     *        A prefix match of the path.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * A prefix match of the path.
     * </p>
     * 
     * @return A prefix match of the path.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * A prefix match of the path.
     * </p>
     * 
     * @param prefix
     *        A prefix match of the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathMatchType withPrefix(String prefix) {
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

        if (obj instanceof PathMatchType == false)
            return false;
        PathMatchType other = (PathMatchType) obj;
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

        hashCode = prime * hashCode + ((getExact() == null) ? 0 : getExact().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public PathMatchType clone() {
        try {
            return (PathMatchType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.vpclattice.model.transform.PathMatchTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
