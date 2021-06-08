/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The list of processing statuses for Cost Management products for a specific cost category.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CostCategoryProcessingStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostCategoryProcessingStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Cost Management product name of the applied status.
     * </p>
     */
    private String component;
    /**
     * <p>
     * The process status for a specific cost category.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Cost Management product name of the applied status.
     * </p>
     * 
     * @param component
     *        The Cost Management product name of the applied status.
     * @see CostCategoryStatusComponent
     */

    public void setComponent(String component) {
        this.component = component;
    }

    /**
     * <p>
     * The Cost Management product name of the applied status.
     * </p>
     * 
     * @return The Cost Management product name of the applied status.
     * @see CostCategoryStatusComponent
     */

    public String getComponent() {
        return this.component;
    }

    /**
     * <p>
     * The Cost Management product name of the applied status.
     * </p>
     * 
     * @param component
     *        The Cost Management product name of the applied status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostCategoryStatusComponent
     */

    public CostCategoryProcessingStatus withComponent(String component) {
        setComponent(component);
        return this;
    }

    /**
     * <p>
     * The Cost Management product name of the applied status.
     * </p>
     * 
     * @param component
     *        The Cost Management product name of the applied status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostCategoryStatusComponent
     */

    public CostCategoryProcessingStatus withComponent(CostCategoryStatusComponent component) {
        this.component = component.toString();
        return this;
    }

    /**
     * <p>
     * The process status for a specific cost category.
     * </p>
     * 
     * @param status
     *        The process status for a specific cost category.
     * @see CostCategoryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The process status for a specific cost category.
     * </p>
     * 
     * @return The process status for a specific cost category.
     * @see CostCategoryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The process status for a specific cost category.
     * </p>
     * 
     * @param status
     *        The process status for a specific cost category.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostCategoryStatus
     */

    public CostCategoryProcessingStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The process status for a specific cost category.
     * </p>
     * 
     * @param status
     *        The process status for a specific cost category.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostCategoryStatus
     */

    public CostCategoryProcessingStatus withStatus(CostCategoryStatus status) {
        this.status = status.toString();
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
        if (getComponent() != null)
            sb.append("Component: ").append(getComponent()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CostCategoryProcessingStatus == false)
            return false;
        CostCategoryProcessingStatus other = (CostCategoryProcessingStatus) obj;
        if (other.getComponent() == null ^ this.getComponent() == null)
            return false;
        if (other.getComponent() != null && other.getComponent().equals(this.getComponent()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponent() == null) ? 0 : getComponent().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CostCategoryProcessingStatus clone() {
        try {
            return (CostCategoryProcessingStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.CostCategoryProcessingStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
