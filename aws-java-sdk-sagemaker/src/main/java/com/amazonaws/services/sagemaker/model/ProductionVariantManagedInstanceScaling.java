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
 * Settings that control the range in the number of instances that the endpoint provisions as it scales up or down to
 * accommodate traffic.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ProductionVariantManagedInstanceScaling"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductionVariantManagedInstanceScaling implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether managed instance scaling is enabled.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The minimum number of instances that the endpoint must retain when it scales down to accommodate a decrease in
     * traffic.
     * </p>
     */
    private Integer minInstanceCount;
    /**
     * <p>
     * The maximum number of instances that the endpoint can provision when it scales up to accommodate an increase in
     * traffic.
     * </p>
     */
    private Integer maxInstanceCount;

    /**
     * <p>
     * Indicates whether managed instance scaling is enabled.
     * </p>
     * 
     * @param status
     *        Indicates whether managed instance scaling is enabled.
     * @see ManagedInstanceScalingStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates whether managed instance scaling is enabled.
     * </p>
     * 
     * @return Indicates whether managed instance scaling is enabled.
     * @see ManagedInstanceScalingStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates whether managed instance scaling is enabled.
     * </p>
     * 
     * @param status
     *        Indicates whether managed instance scaling is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManagedInstanceScalingStatus
     */

    public ProductionVariantManagedInstanceScaling withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates whether managed instance scaling is enabled.
     * </p>
     * 
     * @param status
     *        Indicates whether managed instance scaling is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManagedInstanceScalingStatus
     */

    public ProductionVariantManagedInstanceScaling withStatus(ManagedInstanceScalingStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The minimum number of instances that the endpoint must retain when it scales down to accommodate a decrease in
     * traffic.
     * </p>
     * 
     * @param minInstanceCount
     *        The minimum number of instances that the endpoint must retain when it scales down to accommodate a
     *        decrease in traffic.
     */

    public void setMinInstanceCount(Integer minInstanceCount) {
        this.minInstanceCount = minInstanceCount;
    }

    /**
     * <p>
     * The minimum number of instances that the endpoint must retain when it scales down to accommodate a decrease in
     * traffic.
     * </p>
     * 
     * @return The minimum number of instances that the endpoint must retain when it scales down to accommodate a
     *         decrease in traffic.
     */

    public Integer getMinInstanceCount() {
        return this.minInstanceCount;
    }

    /**
     * <p>
     * The minimum number of instances that the endpoint must retain when it scales down to accommodate a decrease in
     * traffic.
     * </p>
     * 
     * @param minInstanceCount
     *        The minimum number of instances that the endpoint must retain when it scales down to accommodate a
     *        decrease in traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariantManagedInstanceScaling withMinInstanceCount(Integer minInstanceCount) {
        setMinInstanceCount(minInstanceCount);
        return this;
    }

    /**
     * <p>
     * The maximum number of instances that the endpoint can provision when it scales up to accommodate an increase in
     * traffic.
     * </p>
     * 
     * @param maxInstanceCount
     *        The maximum number of instances that the endpoint can provision when it scales up to accommodate an
     *        increase in traffic.
     */

    public void setMaxInstanceCount(Integer maxInstanceCount) {
        this.maxInstanceCount = maxInstanceCount;
    }

    /**
     * <p>
     * The maximum number of instances that the endpoint can provision when it scales up to accommodate an increase in
     * traffic.
     * </p>
     * 
     * @return The maximum number of instances that the endpoint can provision when it scales up to accommodate an
     *         increase in traffic.
     */

    public Integer getMaxInstanceCount() {
        return this.maxInstanceCount;
    }

    /**
     * <p>
     * The maximum number of instances that the endpoint can provision when it scales up to accommodate an increase in
     * traffic.
     * </p>
     * 
     * @param maxInstanceCount
     *        The maximum number of instances that the endpoint can provision when it scales up to accommodate an
     *        increase in traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariantManagedInstanceScaling withMaxInstanceCount(Integer maxInstanceCount) {
        setMaxInstanceCount(maxInstanceCount);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMinInstanceCount() != null)
            sb.append("MinInstanceCount: ").append(getMinInstanceCount()).append(",");
        if (getMaxInstanceCount() != null)
            sb.append("MaxInstanceCount: ").append(getMaxInstanceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductionVariantManagedInstanceScaling == false)
            return false;
        ProductionVariantManagedInstanceScaling other = (ProductionVariantManagedInstanceScaling) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMinInstanceCount() == null ^ this.getMinInstanceCount() == null)
            return false;
        if (other.getMinInstanceCount() != null && other.getMinInstanceCount().equals(this.getMinInstanceCount()) == false)
            return false;
        if (other.getMaxInstanceCount() == null ^ this.getMaxInstanceCount() == null)
            return false;
        if (other.getMaxInstanceCount() != null && other.getMaxInstanceCount().equals(this.getMaxInstanceCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMinInstanceCount() == null) ? 0 : getMinInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getMaxInstanceCount() == null) ? 0 : getMaxInstanceCount().hashCode());
        return hashCode;
    }

    @Override
    public ProductionVariantManagedInstanceScaling clone() {
        try {
            return (ProductionVariantManagedInstanceScaling) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ProductionVariantManagedInstanceScalingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
