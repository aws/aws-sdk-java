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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The unique values computation configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UniqueValuesComputation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UniqueValuesComputation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for a computation.
     * </p>
     */
    private String computationId;
    /**
     * <p>
     * The name of a computation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The category field that is used in a computation.
     * </p>
     */
    private DimensionField category;

    /**
     * <p>
     * The ID for a computation.
     * </p>
     * 
     * @param computationId
     *        The ID for a computation.
     */

    public void setComputationId(String computationId) {
        this.computationId = computationId;
    }

    /**
     * <p>
     * The ID for a computation.
     * </p>
     * 
     * @return The ID for a computation.
     */

    public String getComputationId() {
        return this.computationId;
    }

    /**
     * <p>
     * The ID for a computation.
     * </p>
     * 
     * @param computationId
     *        The ID for a computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UniqueValuesComputation withComputationId(String computationId) {
        setComputationId(computationId);
        return this;
    }

    /**
     * <p>
     * The name of a computation.
     * </p>
     * 
     * @param name
     *        The name of a computation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a computation.
     * </p>
     * 
     * @return The name of a computation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a computation.
     * </p>
     * 
     * @param name
     *        The name of a computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UniqueValuesComputation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The category field that is used in a computation.
     * </p>
     * 
     * @param category
     *        The category field that is used in a computation.
     */

    public void setCategory(DimensionField category) {
        this.category = category;
    }

    /**
     * <p>
     * The category field that is used in a computation.
     * </p>
     * 
     * @return The category field that is used in a computation.
     */

    public DimensionField getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category field that is used in a computation.
     * </p>
     * 
     * @param category
     *        The category field that is used in a computation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UniqueValuesComputation withCategory(DimensionField category) {
        setCategory(category);
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
        if (getComputationId() != null)
            sb.append("ComputationId: ").append(getComputationId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UniqueValuesComputation == false)
            return false;
        UniqueValuesComputation other = (UniqueValuesComputation) obj;
        if (other.getComputationId() == null ^ this.getComputationId() == null)
            return false;
        if (other.getComputationId() != null && other.getComputationId().equals(this.getComputationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComputationId() == null) ? 0 : getComputationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        return hashCode;
    }

    @Override
    public UniqueValuesComputation clone() {
        try {
            return (UniqueValuesComputation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.UniqueValuesComputationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
