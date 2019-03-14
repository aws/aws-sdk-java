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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StartRemediationExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartRemediationExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a failure message. For example, the resource is already compliant.
     * </p>
     */
    private String failureMessage;
    /**
     * <p>
     * For resources that have failed to start execution, the API returns a resource key object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceKey> failedItems;

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

    public StartRemediationExecutionResult withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
        return this;
    }

    /**
     * <p>
     * For resources that have failed to start execution, the API returns a resource key object.
     * </p>
     * 
     * @return For resources that have failed to start execution, the API returns a resource key object.
     */

    public java.util.List<ResourceKey> getFailedItems() {
        if (failedItems == null) {
            failedItems = new com.amazonaws.internal.SdkInternalList<ResourceKey>();
        }
        return failedItems;
    }

    /**
     * <p>
     * For resources that have failed to start execution, the API returns a resource key object.
     * </p>
     * 
     * @param failedItems
     *        For resources that have failed to start execution, the API returns a resource key object.
     */

    public void setFailedItems(java.util.Collection<ResourceKey> failedItems) {
        if (failedItems == null) {
            this.failedItems = null;
            return;
        }

        this.failedItems = new com.amazonaws.internal.SdkInternalList<ResourceKey>(failedItems);
    }

    /**
     * <p>
     * For resources that have failed to start execution, the API returns a resource key object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedItems(java.util.Collection)} or {@link #withFailedItems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param failedItems
     *        For resources that have failed to start execution, the API returns a resource key object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRemediationExecutionResult withFailedItems(ResourceKey... failedItems) {
        if (this.failedItems == null) {
            setFailedItems(new com.amazonaws.internal.SdkInternalList<ResourceKey>(failedItems.length));
        }
        for (ResourceKey ele : failedItems) {
            this.failedItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For resources that have failed to start execution, the API returns a resource key object.
     * </p>
     * 
     * @param failedItems
     *        For resources that have failed to start execution, the API returns a resource key object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRemediationExecutionResult withFailedItems(java.util.Collection<ResourceKey> failedItems) {
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

        if (obj instanceof StartRemediationExecutionResult == false)
            return false;
        StartRemediationExecutionResult other = (StartRemediationExecutionResult) obj;
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
    public StartRemediationExecutionResult clone() {
        try {
            return (StartRemediationExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
