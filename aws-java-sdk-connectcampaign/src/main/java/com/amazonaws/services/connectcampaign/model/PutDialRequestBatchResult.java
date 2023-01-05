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
package com.amazonaws.services.connectcampaign.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * PutDialRequestBatchResponse
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/PutDialRequestBatch"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDialRequestBatchResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.util.List<FailedRequest> failedRequests;

    private java.util.List<SuccessfulRequest> successfulRequests;

    /**
     * @return
     */

    public java.util.List<FailedRequest> getFailedRequests() {
        return failedRequests;
    }

    /**
     * @param failedRequests
     */

    public void setFailedRequests(java.util.Collection<FailedRequest> failedRequests) {
        if (failedRequests == null) {
            this.failedRequests = null;
            return;
        }

        this.failedRequests = new java.util.ArrayList<FailedRequest>(failedRequests);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedRequests(java.util.Collection)} or {@link #withFailedRequests(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failedRequests
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDialRequestBatchResult withFailedRequests(FailedRequest... failedRequests) {
        if (this.failedRequests == null) {
            setFailedRequests(new java.util.ArrayList<FailedRequest>(failedRequests.length));
        }
        for (FailedRequest ele : failedRequests) {
            this.failedRequests.add(ele);
        }
        return this;
    }

    /**
     * @param failedRequests
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDialRequestBatchResult withFailedRequests(java.util.Collection<FailedRequest> failedRequests) {
        setFailedRequests(failedRequests);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<SuccessfulRequest> getSuccessfulRequests() {
        return successfulRequests;
    }

    /**
     * @param successfulRequests
     */

    public void setSuccessfulRequests(java.util.Collection<SuccessfulRequest> successfulRequests) {
        if (successfulRequests == null) {
            this.successfulRequests = null;
            return;
        }

        this.successfulRequests = new java.util.ArrayList<SuccessfulRequest>(successfulRequests);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessfulRequests(java.util.Collection)} or {@link #withSuccessfulRequests(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param successfulRequests
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDialRequestBatchResult withSuccessfulRequests(SuccessfulRequest... successfulRequests) {
        if (this.successfulRequests == null) {
            setSuccessfulRequests(new java.util.ArrayList<SuccessfulRequest>(successfulRequests.length));
        }
        for (SuccessfulRequest ele : successfulRequests) {
            this.successfulRequests.add(ele);
        }
        return this;
    }

    /**
     * @param successfulRequests
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDialRequestBatchResult withSuccessfulRequests(java.util.Collection<SuccessfulRequest> successfulRequests) {
        setSuccessfulRequests(successfulRequests);
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
        if (getFailedRequests() != null)
            sb.append("FailedRequests: ").append(getFailedRequests()).append(",");
        if (getSuccessfulRequests() != null)
            sb.append("SuccessfulRequests: ").append(getSuccessfulRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDialRequestBatchResult == false)
            return false;
        PutDialRequestBatchResult other = (PutDialRequestBatchResult) obj;
        if (other.getFailedRequests() == null ^ this.getFailedRequests() == null)
            return false;
        if (other.getFailedRequests() != null && other.getFailedRequests().equals(this.getFailedRequests()) == false)
            return false;
        if (other.getSuccessfulRequests() == null ^ this.getSuccessfulRequests() == null)
            return false;
        if (other.getSuccessfulRequests() != null && other.getSuccessfulRequests().equals(this.getSuccessfulRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedRequests() == null) ? 0 : getFailedRequests().hashCode());
        hashCode = prime * hashCode + ((getSuccessfulRequests() == null) ? 0 : getSuccessfulRequests().hashCode());
        return hashCode;
    }

    @Override
    public PutDialRequestBatchResult clone() {
        try {
            return (PutDialRequestBatchResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
