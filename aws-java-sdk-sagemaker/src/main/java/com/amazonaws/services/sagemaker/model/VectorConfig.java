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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration for your vector collection type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/VectorConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VectorConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of elements in your vector.
     * </p>
     */
    private Integer dimension;

    /**
     * <p>
     * The number of elements in your vector.
     * </p>
     * 
     * @param dimension
     *        The number of elements in your vector.
     */

    public void setDimension(Integer dimension) {
        this.dimension = dimension;
    }

    /**
     * <p>
     * The number of elements in your vector.
     * </p>
     * 
     * @return The number of elements in your vector.
     */

    public Integer getDimension() {
        return this.dimension;
    }

    /**
     * <p>
     * The number of elements in your vector.
     * </p>
     * 
     * @param dimension
     *        The number of elements in your vector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VectorConfig withDimension(Integer dimension) {
        setDimension(dimension);
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
        if (getDimension() != null)
            sb.append("Dimension: ").append(getDimension());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VectorConfig == false)
            return false;
        VectorConfig other = (VectorConfig) obj;
        if (other.getDimension() == null ^ this.getDimension() == null)
            return false;
        if (other.getDimension() != null && other.getDimension().equals(this.getDimension()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimension() == null) ? 0 : getDimension().hashCode());
        return hashCode;
    }

    @Override
    public VectorConfig clone() {
        try {
            return (VectorConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.VectorConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
