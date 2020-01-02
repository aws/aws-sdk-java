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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteRemediationExceptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRemediationExceptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a list of failed delete remediation exceptions batch objects. Each object in the batch consists of a list
     * of failed items and failure messages.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FailedDeleteRemediationExceptionsBatch> failedBatches;

    /**
     * <p>
     * Returns a list of failed delete remediation exceptions batch objects. Each object in the batch consists of a list
     * of failed items and failure messages.
     * </p>
     * 
     * @return Returns a list of failed delete remediation exceptions batch objects. Each object in the batch consists
     *         of a list of failed items and failure messages.
     */

    public java.util.List<FailedDeleteRemediationExceptionsBatch> getFailedBatches() {
        if (failedBatches == null) {
            failedBatches = new com.amazonaws.internal.SdkInternalList<FailedDeleteRemediationExceptionsBatch>();
        }
        return failedBatches;
    }

    /**
     * <p>
     * Returns a list of failed delete remediation exceptions batch objects. Each object in the batch consists of a list
     * of failed items and failure messages.
     * </p>
     * 
     * @param failedBatches
     *        Returns a list of failed delete remediation exceptions batch objects. Each object in the batch consists of
     *        a list of failed items and failure messages.
     */

    public void setFailedBatches(java.util.Collection<FailedDeleteRemediationExceptionsBatch> failedBatches) {
        if (failedBatches == null) {
            this.failedBatches = null;
            return;
        }

        this.failedBatches = new com.amazonaws.internal.SdkInternalList<FailedDeleteRemediationExceptionsBatch>(failedBatches);
    }

    /**
     * <p>
     * Returns a list of failed delete remediation exceptions batch objects. Each object in the batch consists of a list
     * of failed items and failure messages.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedBatches(java.util.Collection)} or {@link #withFailedBatches(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failedBatches
     *        Returns a list of failed delete remediation exceptions batch objects. Each object in the batch consists of
     *        a list of failed items and failure messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRemediationExceptionsResult withFailedBatches(FailedDeleteRemediationExceptionsBatch... failedBatches) {
        if (this.failedBatches == null) {
            setFailedBatches(new com.amazonaws.internal.SdkInternalList<FailedDeleteRemediationExceptionsBatch>(failedBatches.length));
        }
        for (FailedDeleteRemediationExceptionsBatch ele : failedBatches) {
            this.failedBatches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of failed delete remediation exceptions batch objects. Each object in the batch consists of a list
     * of failed items and failure messages.
     * </p>
     * 
     * @param failedBatches
     *        Returns a list of failed delete remediation exceptions batch objects. Each object in the batch consists of
     *        a list of failed items and failure messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRemediationExceptionsResult withFailedBatches(java.util.Collection<FailedDeleteRemediationExceptionsBatch> failedBatches) {
        setFailedBatches(failedBatches);
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
        if (getFailedBatches() != null)
            sb.append("FailedBatches: ").append(getFailedBatches());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRemediationExceptionsResult == false)
            return false;
        DeleteRemediationExceptionsResult other = (DeleteRemediationExceptionsResult) obj;
        if (other.getFailedBatches() == null ^ this.getFailedBatches() == null)
            return false;
        if (other.getFailedBatches() != null && other.getFailedBatches().equals(this.getFailedBatches()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedBatches() == null) ? 0 : getFailedBatches().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRemediationExceptionsResult clone() {
        try {
            return (DeleteRemediationExceptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
