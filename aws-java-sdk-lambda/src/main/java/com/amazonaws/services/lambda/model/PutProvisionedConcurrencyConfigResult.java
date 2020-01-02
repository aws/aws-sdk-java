/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutProvisionedConcurrencyConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutProvisionedConcurrencyConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The amount of provisioned concurrency requested.
     * </p>
     */
    private Integer requestedProvisionedConcurrentExecutions;
    /**
     * <p>
     * The amount of provisioned concurrency available.
     * </p>
     */
    private Integer availableProvisionedConcurrentExecutions;
    /**
     * <p>
     * The amount of provisioned concurrency allocated.
     * </p>
     */
    private Integer allocatedProvisionedConcurrentExecutions;
    /**
     * <p>
     * The status of the allocation process.
     * </p>
     */
    private String status;
    /**
     * <p>
     * For failed allocations, the reason that provisioned concurrency could not be allocated.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The date and time that a user last updated the configuration, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>.
     * </p>
     */
    private String lastModified;

    /**
     * <p>
     * The amount of provisioned concurrency requested.
     * </p>
     * 
     * @param requestedProvisionedConcurrentExecutions
     *        The amount of provisioned concurrency requested.
     */

    public void setRequestedProvisionedConcurrentExecutions(Integer requestedProvisionedConcurrentExecutions) {
        this.requestedProvisionedConcurrentExecutions = requestedProvisionedConcurrentExecutions;
    }

    /**
     * <p>
     * The amount of provisioned concurrency requested.
     * </p>
     * 
     * @return The amount of provisioned concurrency requested.
     */

    public Integer getRequestedProvisionedConcurrentExecutions() {
        return this.requestedProvisionedConcurrentExecutions;
    }

    /**
     * <p>
     * The amount of provisioned concurrency requested.
     * </p>
     * 
     * @param requestedProvisionedConcurrentExecutions
     *        The amount of provisioned concurrency requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutProvisionedConcurrencyConfigResult withRequestedProvisionedConcurrentExecutions(Integer requestedProvisionedConcurrentExecutions) {
        setRequestedProvisionedConcurrentExecutions(requestedProvisionedConcurrentExecutions);
        return this;
    }

    /**
     * <p>
     * The amount of provisioned concurrency available.
     * </p>
     * 
     * @param availableProvisionedConcurrentExecutions
     *        The amount of provisioned concurrency available.
     */

    public void setAvailableProvisionedConcurrentExecutions(Integer availableProvisionedConcurrentExecutions) {
        this.availableProvisionedConcurrentExecutions = availableProvisionedConcurrentExecutions;
    }

    /**
     * <p>
     * The amount of provisioned concurrency available.
     * </p>
     * 
     * @return The amount of provisioned concurrency available.
     */

    public Integer getAvailableProvisionedConcurrentExecutions() {
        return this.availableProvisionedConcurrentExecutions;
    }

    /**
     * <p>
     * The amount of provisioned concurrency available.
     * </p>
     * 
     * @param availableProvisionedConcurrentExecutions
     *        The amount of provisioned concurrency available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutProvisionedConcurrencyConfigResult withAvailableProvisionedConcurrentExecutions(Integer availableProvisionedConcurrentExecutions) {
        setAvailableProvisionedConcurrentExecutions(availableProvisionedConcurrentExecutions);
        return this;
    }

    /**
     * <p>
     * The amount of provisioned concurrency allocated.
     * </p>
     * 
     * @param allocatedProvisionedConcurrentExecutions
     *        The amount of provisioned concurrency allocated.
     */

    public void setAllocatedProvisionedConcurrentExecutions(Integer allocatedProvisionedConcurrentExecutions) {
        this.allocatedProvisionedConcurrentExecutions = allocatedProvisionedConcurrentExecutions;
    }

    /**
     * <p>
     * The amount of provisioned concurrency allocated.
     * </p>
     * 
     * @return The amount of provisioned concurrency allocated.
     */

    public Integer getAllocatedProvisionedConcurrentExecutions() {
        return this.allocatedProvisionedConcurrentExecutions;
    }

    /**
     * <p>
     * The amount of provisioned concurrency allocated.
     * </p>
     * 
     * @param allocatedProvisionedConcurrentExecutions
     *        The amount of provisioned concurrency allocated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutProvisionedConcurrencyConfigResult withAllocatedProvisionedConcurrentExecutions(Integer allocatedProvisionedConcurrentExecutions) {
        setAllocatedProvisionedConcurrentExecutions(allocatedProvisionedConcurrentExecutions);
        return this;
    }

    /**
     * <p>
     * The status of the allocation process.
     * </p>
     * 
     * @param status
     *        The status of the allocation process.
     * @see ProvisionedConcurrencyStatusEnum
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the allocation process.
     * </p>
     * 
     * @return The status of the allocation process.
     * @see ProvisionedConcurrencyStatusEnum
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the allocation process.
     * </p>
     * 
     * @param status
     *        The status of the allocation process.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisionedConcurrencyStatusEnum
     */

    public PutProvisionedConcurrencyConfigResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the allocation process.
     * </p>
     * 
     * @param status
     *        The status of the allocation process.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisionedConcurrencyStatusEnum
     */

    public PutProvisionedConcurrencyConfigResult withStatus(ProvisionedConcurrencyStatusEnum status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * For failed allocations, the reason that provisioned concurrency could not be allocated.
     * </p>
     * 
     * @param statusReason
     *        For failed allocations, the reason that provisioned concurrency could not be allocated.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * For failed allocations, the reason that provisioned concurrency could not be allocated.
     * </p>
     * 
     * @return For failed allocations, the reason that provisioned concurrency could not be allocated.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * For failed allocations, the reason that provisioned concurrency could not be allocated.
     * </p>
     * 
     * @param statusReason
     *        For failed allocations, the reason that provisioned concurrency could not be allocated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutProvisionedConcurrencyConfigResult withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The date and time that a user last updated the configuration, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>.
     * </p>
     * 
     * @param lastModified
     *        The date and time that a user last updated the configuration, in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>.
     */

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time that a user last updated the configuration, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>.
     * </p>
     * 
     * @return The date and time that a user last updated the configuration, in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>.
     */

    public String getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The date and time that a user last updated the configuration, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>.
     * </p>
     * 
     * @param lastModified
     *        The date and time that a user last updated the configuration, in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutProvisionedConcurrencyConfigResult withLastModified(String lastModified) {
        setLastModified(lastModified);
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
        if (getRequestedProvisionedConcurrentExecutions() != null)
            sb.append("RequestedProvisionedConcurrentExecutions: ").append(getRequestedProvisionedConcurrentExecutions()).append(",");
        if (getAvailableProvisionedConcurrentExecutions() != null)
            sb.append("AvailableProvisionedConcurrentExecutions: ").append(getAvailableProvisionedConcurrentExecutions()).append(",");
        if (getAllocatedProvisionedConcurrentExecutions() != null)
            sb.append("AllocatedProvisionedConcurrentExecutions: ").append(getAllocatedProvisionedConcurrentExecutions()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutProvisionedConcurrencyConfigResult == false)
            return false;
        PutProvisionedConcurrencyConfigResult other = (PutProvisionedConcurrencyConfigResult) obj;
        if (other.getRequestedProvisionedConcurrentExecutions() == null ^ this.getRequestedProvisionedConcurrentExecutions() == null)
            return false;
        if (other.getRequestedProvisionedConcurrentExecutions() != null
                && other.getRequestedProvisionedConcurrentExecutions().equals(this.getRequestedProvisionedConcurrentExecutions()) == false)
            return false;
        if (other.getAvailableProvisionedConcurrentExecutions() == null ^ this.getAvailableProvisionedConcurrentExecutions() == null)
            return false;
        if (other.getAvailableProvisionedConcurrentExecutions() != null
                && other.getAvailableProvisionedConcurrentExecutions().equals(this.getAvailableProvisionedConcurrentExecutions()) == false)
            return false;
        if (other.getAllocatedProvisionedConcurrentExecutions() == null ^ this.getAllocatedProvisionedConcurrentExecutions() == null)
            return false;
        if (other.getAllocatedProvisionedConcurrentExecutions() != null
                && other.getAllocatedProvisionedConcurrentExecutions().equals(this.getAllocatedProvisionedConcurrentExecutions()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestedProvisionedConcurrentExecutions() == null) ? 0 : getRequestedProvisionedConcurrentExecutions().hashCode());
        hashCode = prime * hashCode + ((getAvailableProvisionedConcurrentExecutions() == null) ? 0 : getAvailableProvisionedConcurrentExecutions().hashCode());
        hashCode = prime * hashCode + ((getAllocatedProvisionedConcurrentExecutions() == null) ? 0 : getAllocatedProvisionedConcurrentExecutions().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        return hashCode;
    }

    @Override
    public PutProvisionedConcurrencyConfigResult clone() {
        try {
            return (PutProvisionedConcurrencyConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
