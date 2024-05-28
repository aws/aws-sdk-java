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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListBatchJobRestartPoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBatchJobRestartPointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns all the batch job steps and related information for a batch job that previously ran.
     * </p>
     */
    private java.util.List<JobStep> batchJobSteps;

    /**
     * <p>
     * Returns all the batch job steps and related information for a batch job that previously ran.
     * </p>
     * 
     * @return Returns all the batch job steps and related information for a batch job that previously ran.
     */

    public java.util.List<JobStep> getBatchJobSteps() {
        return batchJobSteps;
    }

    /**
     * <p>
     * Returns all the batch job steps and related information for a batch job that previously ran.
     * </p>
     * 
     * @param batchJobSteps
     *        Returns all the batch job steps and related information for a batch job that previously ran.
     */

    public void setBatchJobSteps(java.util.Collection<JobStep> batchJobSteps) {
        if (batchJobSteps == null) {
            this.batchJobSteps = null;
            return;
        }

        this.batchJobSteps = new java.util.ArrayList<JobStep>(batchJobSteps);
    }

    /**
     * <p>
     * Returns all the batch job steps and related information for a batch job that previously ran.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBatchJobSteps(java.util.Collection)} or {@link #withBatchJobSteps(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param batchJobSteps
     *        Returns all the batch job steps and related information for a batch job that previously ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchJobRestartPointsResult withBatchJobSteps(JobStep... batchJobSteps) {
        if (this.batchJobSteps == null) {
            setBatchJobSteps(new java.util.ArrayList<JobStep>(batchJobSteps.length));
        }
        for (JobStep ele : batchJobSteps) {
            this.batchJobSteps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns all the batch job steps and related information for a batch job that previously ran.
     * </p>
     * 
     * @param batchJobSteps
     *        Returns all the batch job steps and related information for a batch job that previously ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchJobRestartPointsResult withBatchJobSteps(java.util.Collection<JobStep> batchJobSteps) {
        setBatchJobSteps(batchJobSteps);
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
        if (getBatchJobSteps() != null)
            sb.append("BatchJobSteps: ").append(getBatchJobSteps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBatchJobRestartPointsResult == false)
            return false;
        ListBatchJobRestartPointsResult other = (ListBatchJobRestartPointsResult) obj;
        if (other.getBatchJobSteps() == null ^ this.getBatchJobSteps() == null)
            return false;
        if (other.getBatchJobSteps() != null && other.getBatchJobSteps().equals(this.getBatchJobSteps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatchJobSteps() == null) ? 0 : getBatchJobSteps().hashCode());
        return hashCode;
    }

    @Override
    public ListBatchJobRestartPointsResult clone() {
        try {
            return (ListBatchJobRestartPointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
