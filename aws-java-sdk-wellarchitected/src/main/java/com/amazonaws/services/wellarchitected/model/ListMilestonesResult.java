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
 * Output of a list milestones call.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListMilestones" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMilestonesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String workloadId;

    private java.util.List<MilestoneSummary> milestoneSummaries;

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

    public ListMilestonesResult withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<MilestoneSummary> getMilestoneSummaries() {
        return milestoneSummaries;
    }

    /**
     * @param milestoneSummaries
     */

    public void setMilestoneSummaries(java.util.Collection<MilestoneSummary> milestoneSummaries) {
        if (milestoneSummaries == null) {
            this.milestoneSummaries = null;
            return;
        }

        this.milestoneSummaries = new java.util.ArrayList<MilestoneSummary>(milestoneSummaries);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMilestoneSummaries(java.util.Collection)} or {@link #withMilestoneSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param milestoneSummaries
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMilestonesResult withMilestoneSummaries(MilestoneSummary... milestoneSummaries) {
        if (this.milestoneSummaries == null) {
            setMilestoneSummaries(new java.util.ArrayList<MilestoneSummary>(milestoneSummaries.length));
        }
        for (MilestoneSummary ele : milestoneSummaries) {
            this.milestoneSummaries.add(ele);
        }
        return this;
    }

    /**
     * @param milestoneSummaries
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMilestonesResult withMilestoneSummaries(java.util.Collection<MilestoneSummary> milestoneSummaries) {
        setMilestoneSummaries(milestoneSummaries);
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

    public ListMilestonesResult withNextToken(String nextToken) {
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
        if (getMilestoneSummaries() != null)
            sb.append("MilestoneSummaries: ").append(getMilestoneSummaries()).append(",");
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

        if (obj instanceof ListMilestonesResult == false)
            return false;
        ListMilestonesResult other = (ListMilestonesResult) obj;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getMilestoneSummaries() == null ^ this.getMilestoneSummaries() == null)
            return false;
        if (other.getMilestoneSummaries() != null && other.getMilestoneSummaries().equals(this.getMilestoneSummaries()) == false)
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
        hashCode = prime * hashCode + ((getMilestoneSummaries() == null) ? 0 : getMilestoneSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMilestonesResult clone() {
        try {
            return (ListMilestonesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
