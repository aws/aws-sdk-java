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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Output of a list lens reviews call.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListLensReviews" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLensReviewsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String workloadId;

    private Integer milestoneNumber;

    private java.util.List<LensReviewSummary> lensReviewSummaries;

    private String nextToken;

    /**
     * @param workloadId
     */

    public void setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
    }

    /**
     * @return
     */

    public String getWorkloadId() {
        return this.workloadId;
    }

    /**
     * @param workloadId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLensReviewsResult withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
        return this;
    }

    /**
     * @param milestoneNumber
     */

    public void setMilestoneNumber(Integer milestoneNumber) {
        this.milestoneNumber = milestoneNumber;
    }

    /**
     * @return
     */

    public Integer getMilestoneNumber() {
        return this.milestoneNumber;
    }

    /**
     * @param milestoneNumber
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLensReviewsResult withMilestoneNumber(Integer milestoneNumber) {
        setMilestoneNumber(milestoneNumber);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<LensReviewSummary> getLensReviewSummaries() {
        return lensReviewSummaries;
    }

    /**
     * @param lensReviewSummaries
     */

    public void setLensReviewSummaries(java.util.Collection<LensReviewSummary> lensReviewSummaries) {
        if (lensReviewSummaries == null) {
            this.lensReviewSummaries = null;
            return;
        }

        this.lensReviewSummaries = new java.util.ArrayList<LensReviewSummary>(lensReviewSummaries);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLensReviewSummaries(java.util.Collection)} or {@link #withLensReviewSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param lensReviewSummaries
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLensReviewsResult withLensReviewSummaries(LensReviewSummary... lensReviewSummaries) {
        if (this.lensReviewSummaries == null) {
            setLensReviewSummaries(new java.util.ArrayList<LensReviewSummary>(lensReviewSummaries.length));
        }
        for (LensReviewSummary ele : lensReviewSummaries) {
            this.lensReviewSummaries.add(ele);
        }
        return this;
    }

    /**
     * @param lensReviewSummaries
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLensReviewsResult withLensReviewSummaries(java.util.Collection<LensReviewSummary> lensReviewSummaries) {
        setLensReviewSummaries(lensReviewSummaries);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLensReviewsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getWorkloadId() != null)
            sb.append("WorkloadId: ").append(getWorkloadId()).append(",");
        if (getMilestoneNumber() != null)
            sb.append("MilestoneNumber: ").append(getMilestoneNumber()).append(",");
        if (getLensReviewSummaries() != null)
            sb.append("LensReviewSummaries: ").append(getLensReviewSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLensReviewsResult == false)
            return false;
        ListLensReviewsResult other = (ListLensReviewsResult) obj;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getMilestoneNumber() == null ^ this.getMilestoneNumber() == null)
            return false;
        if (other.getMilestoneNumber() != null && other.getMilestoneNumber().equals(this.getMilestoneNumber()) == false)
            return false;
        if (other.getLensReviewSummaries() == null ^ this.getLensReviewSummaries() == null)
            return false;
        if (other.getLensReviewSummaries() != null && other.getLensReviewSummaries().equals(this.getLensReviewSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getMilestoneNumber() == null) ? 0 : getMilestoneNumber().hashCode());
        hashCode = prime * hashCode + ((getLensReviewSummaries() == null) ? 0 : getLensReviewSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLensReviewsResult clone() {
        try {
            return (ListLensReviewsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
