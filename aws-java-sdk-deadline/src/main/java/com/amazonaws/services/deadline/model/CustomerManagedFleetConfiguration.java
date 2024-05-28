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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a customer managed fleet configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CustomerManagedFleetConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomerManagedFleetConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Auto Scaling mode for the customer managed fleet configuration.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * The storage profile ID.
     * </p>
     */
    private String storageProfileId;
    /**
     * <p>
     * The worker capabilities for a customer managed fleet configuration.
     * </p>
     */
    private CustomerManagedWorkerCapabilities workerCapabilities;

    /**
     * <p>
     * The Auto Scaling mode for the customer managed fleet configuration.
     * </p>
     * 
     * @param mode
     *        The Auto Scaling mode for the customer managed fleet configuration.
     * @see AutoScalingMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The Auto Scaling mode for the customer managed fleet configuration.
     * </p>
     * 
     * @return The Auto Scaling mode for the customer managed fleet configuration.
     * @see AutoScalingMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The Auto Scaling mode for the customer managed fleet configuration.
     * </p>
     * 
     * @param mode
     *        The Auto Scaling mode for the customer managed fleet configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoScalingMode
     */

    public CustomerManagedFleetConfiguration withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The Auto Scaling mode for the customer managed fleet configuration.
     * </p>
     * 
     * @param mode
     *        The Auto Scaling mode for the customer managed fleet configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoScalingMode
     */

    public CustomerManagedFleetConfiguration withMode(AutoScalingMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The storage profile ID.
     * </p>
     * 
     * @param storageProfileId
     *        The storage profile ID.
     */

    public void setStorageProfileId(String storageProfileId) {
        this.storageProfileId = storageProfileId;
    }

    /**
     * <p>
     * The storage profile ID.
     * </p>
     * 
     * @return The storage profile ID.
     */

    public String getStorageProfileId() {
        return this.storageProfileId;
    }

    /**
     * <p>
     * The storage profile ID.
     * </p>
     * 
     * @param storageProfileId
     *        The storage profile ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerManagedFleetConfiguration withStorageProfileId(String storageProfileId) {
        setStorageProfileId(storageProfileId);
        return this;
    }

    /**
     * <p>
     * The worker capabilities for a customer managed fleet configuration.
     * </p>
     * 
     * @param workerCapabilities
     *        The worker capabilities for a customer managed fleet configuration.
     */

    public void setWorkerCapabilities(CustomerManagedWorkerCapabilities workerCapabilities) {
        this.workerCapabilities = workerCapabilities;
    }

    /**
     * <p>
     * The worker capabilities for a customer managed fleet configuration.
     * </p>
     * 
     * @return The worker capabilities for a customer managed fleet configuration.
     */

    public CustomerManagedWorkerCapabilities getWorkerCapabilities() {
        return this.workerCapabilities;
    }

    /**
     * <p>
     * The worker capabilities for a customer managed fleet configuration.
     * </p>
     * 
     * @param workerCapabilities
     *        The worker capabilities for a customer managed fleet configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerManagedFleetConfiguration withWorkerCapabilities(CustomerManagedWorkerCapabilities workerCapabilities) {
        setWorkerCapabilities(workerCapabilities);
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
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getStorageProfileId() != null)
            sb.append("StorageProfileId: ").append(getStorageProfileId()).append(",");
        if (getWorkerCapabilities() != null)
            sb.append("WorkerCapabilities: ").append(getWorkerCapabilities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomerManagedFleetConfiguration == false)
            return false;
        CustomerManagedFleetConfiguration other = (CustomerManagedFleetConfiguration) obj;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getStorageProfileId() == null ^ this.getStorageProfileId() == null)
            return false;
        if (other.getStorageProfileId() != null && other.getStorageProfileId().equals(this.getStorageProfileId()) == false)
            return false;
        if (other.getWorkerCapabilities() == null ^ this.getWorkerCapabilities() == null)
            return false;
        if (other.getWorkerCapabilities() != null && other.getWorkerCapabilities().equals(this.getWorkerCapabilities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getStorageProfileId() == null) ? 0 : getStorageProfileId().hashCode());
        hashCode = prime * hashCode + ((getWorkerCapabilities() == null) ? 0 : getWorkerCapabilities().hashCode());
        return hashCode;
    }

    @Override
    public CustomerManagedFleetConfiguration clone() {
        try {
            return (CustomerManagedFleetConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.CustomerManagedFleetConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
