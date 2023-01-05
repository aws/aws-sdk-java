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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure representing the filters supported by a RasterDataCollection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum value of the filter.
     * </p>
     */
    private Float maximum;
    /**
     * <p>
     * The minimum value of the filter.
     * </p>
     */
    private Float minimum;
    /**
     * <p>
     * The name of the filter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the filter being used.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The maximum value of the filter.
     * </p>
     * 
     * @param maximum
     *        The maximum value of the filter.
     */

    public void setMaximum(Float maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * The maximum value of the filter.
     * </p>
     * 
     * @return The maximum value of the filter.
     */

    public Float getMaximum() {
        return this.maximum;
    }

    /**
     * <p>
     * The maximum value of the filter.
     * </p>
     * 
     * @param maximum
     *        The maximum value of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withMaximum(Float maximum) {
        setMaximum(maximum);
        return this;
    }

    /**
     * <p>
     * The minimum value of the filter.
     * </p>
     * 
     * @param minimum
     *        The minimum value of the filter.
     */

    public void setMinimum(Float minimum) {
        this.minimum = minimum;
    }

    /**
     * <p>
     * The minimum value of the filter.
     * </p>
     * 
     * @return The minimum value of the filter.
     */

    public Float getMinimum() {
        return this.minimum;
    }

    /**
     * <p>
     * The minimum value of the filter.
     * </p>
     * 
     * @param minimum
     *        The minimum value of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withMinimum(Float minimum) {
        setMinimum(minimum);
        return this;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param name
     *        The name of the filter.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @return The name of the filter.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param name
     *        The name of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the filter being used.
     * </p>
     * 
     * @param type
     *        The type of the filter being used.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the filter being used.
     * </p>
     * 
     * @return The type of the filter being used.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the filter being used.
     * </p>
     * 
     * @param type
     *        The type of the filter being used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withType(String type) {
        setType(type);
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
        if (getMaximum() != null)
            sb.append("Maximum: ").append(getMaximum()).append(",");
        if (getMinimum() != null)
            sb.append("Minimum: ").append(getMinimum()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getMaximum() == null ^ this.getMaximum() == null)
            return false;
        if (other.getMaximum() != null && other.getMaximum().equals(this.getMaximum()) == false)
            return false;
        if (other.getMinimum() == null ^ this.getMinimum() == null)
            return false;
        if (other.getMinimum() != null && other.getMinimum().equals(this.getMinimum()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximum() == null) ? 0 : getMaximum().hashCode());
        hashCode = prime * hashCode + ((getMinimum() == null) ? 0 : getMinimum().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
