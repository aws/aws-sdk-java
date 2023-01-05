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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the private connection provisioning state.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/PrivateConnectionProvisioningState"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrivateConnectionProvisioningState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the private connection provisioning status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies the private connection provisioning failure reason.
     * </p>
     */
    private String failureMessage;
    /**
     * <p>
     * Specifies the private connection provisioning failure cause.
     * </p>
     */
    private String failureCause;

    /**
     * <p>
     * Specifies the private connection provisioning status.
     * </p>
     * 
     * @param status
     *        Specifies the private connection provisioning status.
     * @see PrivateConnectionProvisioningStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the private connection provisioning status.
     * </p>
     * 
     * @return Specifies the private connection provisioning status.
     * @see PrivateConnectionProvisioningStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the private connection provisioning status.
     * </p>
     * 
     * @param status
     *        Specifies the private connection provisioning status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivateConnectionProvisioningStatus
     */

    public PrivateConnectionProvisioningState withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies the private connection provisioning status.
     * </p>
     * 
     * @param status
     *        Specifies the private connection provisioning status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivateConnectionProvisioningStatus
     */

    public PrivateConnectionProvisioningState withStatus(PrivateConnectionProvisioningStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the private connection provisioning failure reason.
     * </p>
     * 
     * @param failureMessage
     *        Specifies the private connection provisioning failure reason.
     */

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * Specifies the private connection provisioning failure reason.
     * </p>
     * 
     * @return Specifies the private connection provisioning failure reason.
     */

    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * <p>
     * Specifies the private connection provisioning failure reason.
     * </p>
     * 
     * @param failureMessage
     *        Specifies the private connection provisioning failure reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateConnectionProvisioningState withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
        return this;
    }

    /**
     * <p>
     * Specifies the private connection provisioning failure cause.
     * </p>
     * 
     * @param failureCause
     *        Specifies the private connection provisioning failure cause.
     * @see PrivateConnectionProvisioningFailureCause
     */

    public void setFailureCause(String failureCause) {
        this.failureCause = failureCause;
    }

    /**
     * <p>
     * Specifies the private connection provisioning failure cause.
     * </p>
     * 
     * @return Specifies the private connection provisioning failure cause.
     * @see PrivateConnectionProvisioningFailureCause
     */

    public String getFailureCause() {
        return this.failureCause;
    }

    /**
     * <p>
     * Specifies the private connection provisioning failure cause.
     * </p>
     * 
     * @param failureCause
     *        Specifies the private connection provisioning failure cause.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivateConnectionProvisioningFailureCause
     */

    public PrivateConnectionProvisioningState withFailureCause(String failureCause) {
        setFailureCause(failureCause);
        return this;
    }

    /**
     * <p>
     * Specifies the private connection provisioning failure cause.
     * </p>
     * 
     * @param failureCause
     *        Specifies the private connection provisioning failure cause.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivateConnectionProvisioningFailureCause
     */

    public PrivateConnectionProvisioningState withFailureCause(PrivateConnectionProvisioningFailureCause failureCause) {
        this.failureCause = failureCause.toString();
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
        if (getFailureMessage() != null)
            sb.append("FailureMessage: ").append(getFailureMessage()).append(",");
        if (getFailureCause() != null)
            sb.append("FailureCause: ").append(getFailureCause());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrivateConnectionProvisioningState == false)
            return false;
        PrivateConnectionProvisioningState other = (PrivateConnectionProvisioningState) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        if (other.getFailureCause() == null ^ this.getFailureCause() == null)
            return false;
        if (other.getFailureCause() != null && other.getFailureCause().equals(this.getFailureCause()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getFailureCause() == null) ? 0 : getFailureCause().hashCode());
        return hashCode;
    }

    @Override
    public PrivateConnectionProvisioningState clone() {
        try {
            return (PrivateConnectionProvisioningState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.PrivateConnectionProvisioningStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
