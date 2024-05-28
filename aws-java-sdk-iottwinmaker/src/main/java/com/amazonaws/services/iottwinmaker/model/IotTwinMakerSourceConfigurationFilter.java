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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata transfer job AWS IoT TwinMaker source configuration filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/IotTwinMakerSourceConfigurationFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IotTwinMakerSourceConfigurationFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filter by component type.
     * </p>
     */
    private FilterByComponentType filterByComponentType;
    /**
     * <p>
     * Filter by entity.
     * </p>
     */
    private FilterByEntity filterByEntity;

    /**
     * <p>
     * Filter by component type.
     * </p>
     * 
     * @param filterByComponentType
     *        Filter by component type.
     */

    public void setFilterByComponentType(FilterByComponentType filterByComponentType) {
        this.filterByComponentType = filterByComponentType;
    }

    /**
     * <p>
     * Filter by component type.
     * </p>
     * 
     * @return Filter by component type.
     */

    public FilterByComponentType getFilterByComponentType() {
        return this.filterByComponentType;
    }

    /**
     * <p>
     * Filter by component type.
     * </p>
     * 
     * @param filterByComponentType
     *        Filter by component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotTwinMakerSourceConfigurationFilter withFilterByComponentType(FilterByComponentType filterByComponentType) {
        setFilterByComponentType(filterByComponentType);
        return this;
    }

    /**
     * <p>
     * Filter by entity.
     * </p>
     * 
     * @param filterByEntity
     *        Filter by entity.
     */

    public void setFilterByEntity(FilterByEntity filterByEntity) {
        this.filterByEntity = filterByEntity;
    }

    /**
     * <p>
     * Filter by entity.
     * </p>
     * 
     * @return Filter by entity.
     */

    public FilterByEntity getFilterByEntity() {
        return this.filterByEntity;
    }

    /**
     * <p>
     * Filter by entity.
     * </p>
     * 
     * @param filterByEntity
     *        Filter by entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotTwinMakerSourceConfigurationFilter withFilterByEntity(FilterByEntity filterByEntity) {
        setFilterByEntity(filterByEntity);
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
        if (getFilterByComponentType() != null)
            sb.append("FilterByComponentType: ").append(getFilterByComponentType()).append(",");
        if (getFilterByEntity() != null)
            sb.append("FilterByEntity: ").append(getFilterByEntity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IotTwinMakerSourceConfigurationFilter == false)
            return false;
        IotTwinMakerSourceConfigurationFilter other = (IotTwinMakerSourceConfigurationFilter) obj;
        if (other.getFilterByComponentType() == null ^ this.getFilterByComponentType() == null)
            return false;
        if (other.getFilterByComponentType() != null && other.getFilterByComponentType().equals(this.getFilterByComponentType()) == false)
            return false;
        if (other.getFilterByEntity() == null ^ this.getFilterByEntity() == null)
            return false;
        if (other.getFilterByEntity() != null && other.getFilterByEntity().equals(this.getFilterByEntity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterByComponentType() == null) ? 0 : getFilterByComponentType().hashCode());
        hashCode = prime * hashCode + ((getFilterByEntity() == null) ? 0 : getFilterByEntity().hashCode());
        return hashCode;
    }

    @Override
    public IotTwinMakerSourceConfigurationFilter clone() {
        try {
            return (IotTwinMakerSourceConfigurationFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.IotTwinMakerSourceConfigurationFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
