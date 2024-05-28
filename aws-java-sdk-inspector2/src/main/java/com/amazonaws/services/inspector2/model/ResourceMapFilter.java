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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A resource map filter for a software bill of material report.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ResourceMapFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceMapFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The filter's comparison.
     * </p>
     */
    private String comparison;
    /**
     * <p>
     * The filter's key.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The filter's value.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The filter's comparison.
     * </p>
     * 
     * @param comparison
     *        The filter's comparison.
     * @see ResourceMapComparison
     */

    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    /**
     * <p>
     * The filter's comparison.
     * </p>
     * 
     * @return The filter's comparison.
     * @see ResourceMapComparison
     */

    public String getComparison() {
        return this.comparison;
    }

    /**
     * <p>
     * The filter's comparison.
     * </p>
     * 
     * @param comparison
     *        The filter's comparison.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceMapComparison
     */

    public ResourceMapFilter withComparison(String comparison) {
        setComparison(comparison);
        return this;
    }

    /**
     * <p>
     * The filter's comparison.
     * </p>
     * 
     * @param comparison
     *        The filter's comparison.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceMapComparison
     */

    public ResourceMapFilter withComparison(ResourceMapComparison comparison) {
        this.comparison = comparison.toString();
        return this;
    }

    /**
     * <p>
     * The filter's key.
     * </p>
     * 
     * @param key
     *        The filter's key.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The filter's key.
     * </p>
     * 
     * @return The filter's key.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The filter's key.
     * </p>
     * 
     * @param key
     *        The filter's key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMapFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The filter's value.
     * </p>
     * 
     * @param value
     *        The filter's value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The filter's value.
     * </p>
     * 
     * @return The filter's value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The filter's value.
     * </p>
     * 
     * @param value
     *        The filter's value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMapFilter withValue(String value) {
        setValue(value);
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
        if (getComparison() != null)
            sb.append("Comparison: ").append(getComparison()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceMapFilter == false)
            return false;
        ResourceMapFilter other = (ResourceMapFilter) obj;
        if (other.getComparison() == null ^ this.getComparison() == null)
            return false;
        if (other.getComparison() != null && other.getComparison().equals(this.getComparison()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComparison() == null) ? 0 : getComparison().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ResourceMapFilter clone() {
        try {
            return (ResourceMapFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.ResourceMapFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
