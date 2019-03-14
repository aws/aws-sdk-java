/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * List of each of the failed remediations with specific reasons.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/FailedRemediationBatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailedRemediationBatch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Returns a failure message. For example, the resource is already compliant.
     * </p>
     */
    private String failureMessage;
    /**
     * <p>
     * Returns remediation configurations of the failed items.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RemediationConfiguration> failedItems;

    /**
     * <p>
     * Returns a failure message. For example, the resource is already compliant.
     * </p>
     * 
     * @param failureMessage
     *        Returns a failure message. For example, the resource is already compliant.
     */

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * Returns a failure message. For example, the resource is already compliant.
     * </p>
     * 
     * @return Returns a failure message. For example, the resource is already compliant.
     */

    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * <p>
     * Returns a failure message. For example, the resource is already compliant.
     * </p>
     * 
     * @param failureMessage
     *        Returns a failure message. For example, the resource is already compliant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedRemediationBatch withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
        return this;
    }

    /**
     * <p>
     * Returns remediation configurations of the failed items.
     * </p>
     * 
     * @return Returns remediation configurations of the failed items.
     */

    public java.util.List<RemediationConfiguration> getFailedItems() {
        if (failedItems == null) {
            failedItems = new com.amazonaws.internal.SdkInternalList<RemediationConfiguration>();
        }
        return failedItems;
    }

    /**
     * <p>
     * Returns remediation configurations of the failed items.
     * </p>
     * 
     * @param failedItems
     *        Returns remediation configurations of the failed items.
     */

    public void setFailedItems(java.util.Collection<RemediationConfiguration> failedItems) {
        if (failedItems == null) {
            this.failedItems = null;
            return;
        }

        this.failedItems = new com.amazonaws.internal.SdkInternalList<RemediationConfiguration>(failedItems);
    }

    /**
     * <p>
     * Returns remediation configurations of the failed items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedItems(java.util.Collection)} or {@link #withFailedItems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param failedItems
     *        Returns remediation configurations of the failed items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedRemediationBatch withFailedItems(RemediationConfiguration... failedItems) {
        if (this.failedItems == null) {
            setFailedItems(new com.amazonaws.internal.SdkInternalList<RemediationConfiguration>(failedItems.length));
        }
        for (RemediationConfiguration ele : failedItems) {
            this.failedItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns remediation configurations of the failed items.
     * </p>
     * 
     * @param failedItems
     *        Returns remediation configurations of the failed items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedRemediationBatch withFailedItems(java.util.Collection<RemediationConfiguration> failedItems) {
        setFailedItems(failedItems);
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
        if (getFailureMessage() != null)
            sb.append("FailureMessage: ").append(getFailureMessage()).append(",");
        if (getFailedItems() != null)
            sb.append("FailedItems: ").append(getFailedItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedRemediationBatch == false)
            return false;
        FailedRemediationBatch other = (FailedRemediationBatch) obj;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        if (other.getFailedItems() == null ^ this.getFailedItems() == null)
            return false;
        if (other.getFailedItems() != null && other.getFailedItems().equals(this.getFailedItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getFailedItems() == null) ? 0 : getFailedItems().hashCode());
        return hashCode;
    }

    @Override
    public FailedRemediationBatch clone() {
        try {
            return (FailedRemediationBatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.FailedRemediationBatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
