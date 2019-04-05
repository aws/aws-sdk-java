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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutRemediationConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRemediationConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a list of failed remediation batch objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FailedRemediationBatch> failedBatches;

    /**
     * <p>
     * Returns a list of failed remediation batch objects.
     * </p>
     * 
     * @return Returns a list of failed remediation batch objects.
     */

    public java.util.List<FailedRemediationBatch> getFailedBatches() {
        if (failedBatches == null) {
            failedBatches = new com.amazonaws.internal.SdkInternalList<FailedRemediationBatch>();
        }
        return failedBatches;
    }

    /**
     * <p>
     * Returns a list of failed remediation batch objects.
     * </p>
     * 
     * @param failedBatches
     *        Returns a list of failed remediation batch objects.
     */

    public void setFailedBatches(java.util.Collection<FailedRemediationBatch> failedBatches) {
        if (failedBatches == null) {
            this.failedBatches = null;
            return;
        }

        this.failedBatches = new com.amazonaws.internal.SdkInternalList<FailedRemediationBatch>(failedBatches);
    }

    /**
     * <p>
     * Returns a list of failed remediation batch objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedBatches(java.util.Collection)} or {@link #withFailedBatches(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failedBatches
     *        Returns a list of failed remediation batch objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRemediationConfigurationsResult withFailedBatches(FailedRemediationBatch... failedBatches) {
        if (this.failedBatches == null) {
            setFailedBatches(new com.amazonaws.internal.SdkInternalList<FailedRemediationBatch>(failedBatches.length));
        }
        for (FailedRemediationBatch ele : failedBatches) {
            this.failedBatches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of failed remediation batch objects.
     * </p>
     * 
     * @param failedBatches
     *        Returns a list of failed remediation batch objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRemediationConfigurationsResult withFailedBatches(java.util.Collection<FailedRemediationBatch> failedBatches) {
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

        if (obj instanceof PutRemediationConfigurationsResult == false)
            return false;
        PutRemediationConfigurationsResult other = (PutRemediationConfigurationsResult) obj;
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
    public PutRemediationConfigurationsResult clone() {
        try {
            return (PutRemediationConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
