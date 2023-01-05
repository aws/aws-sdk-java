/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An object that describes details of a map filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/MapFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MapFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operator to use when comparing values in the filter.
     * </p>
     */
    private String comparison;
    /**
     * <p>
     * The tag key used in the filter.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The tag value used in the filter.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The operator to use when comparing values in the filter.
     * </p>
     * 
     * @param comparison
     *        The operator to use when comparing values in the filter.
     * @see MapComparison
     */

    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    /**
     * <p>
     * The operator to use when comparing values in the filter.
     * </p>
     * 
     * @return The operator to use when comparing values in the filter.
     * @see MapComparison
     */

    public String getComparison() {
        return this.comparison;
    }

    /**
     * <p>
     * The operator to use when comparing values in the filter.
     * </p>
     * 
     * @param comparison
     *        The operator to use when comparing values in the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MapComparison
     */

    public MapFilter withComparison(String comparison) {
        setComparison(comparison);
        return this;
    }

    /**
     * <p>
     * The operator to use when comparing values in the filter.
     * </p>
     * 
     * @param comparison
     *        The operator to use when comparing values in the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MapComparison
     */

    public MapFilter withComparison(MapComparison comparison) {
        this.comparison = comparison.toString();
        return this;
    }

    /**
     * <p>
     * The tag key used in the filter.
     * </p>
     * 
     * @param key
     *        The tag key used in the filter.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The tag key used in the filter.
     * </p>
     * 
     * @return The tag key used in the filter.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The tag key used in the filter.
     * </p>
     * 
     * @param key
     *        The tag key used in the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The tag value used in the filter.
     * </p>
     * 
     * @param value
     *        The tag value used in the filter.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The tag value used in the filter.
     * </p>
     * 
     * @return The tag value used in the filter.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The tag value used in the filter.
     * </p>
     * 
     * @param value
     *        The tag value used in the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MapFilter withValue(String value) {
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

        if (obj instanceof MapFilter == false)
            return false;
        MapFilter other = (MapFilter) obj;
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
    public MapFilter clone() {
        try {
            return (MapFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.MapFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
