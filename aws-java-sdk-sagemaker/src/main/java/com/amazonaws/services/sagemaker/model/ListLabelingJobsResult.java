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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListLabelingJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLabelingJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>LabelingJobSummary</code> objects, each describing a labeling job.
     * </p>
     */
    private java.util.List<LabelingJobSummary> labelingJobSummaryList;
    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of labeling jobs, use
     * it in the subsequent request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>LabelingJobSummary</code> objects, each describing a labeling job.
     * </p>
     * 
     * @return An array of <code>LabelingJobSummary</code> objects, each describing a labeling job.
     */

    public java.util.List<LabelingJobSummary> getLabelingJobSummaryList() {
        return labelingJobSummaryList;
    }

    /**
     * <p>
     * An array of <code>LabelingJobSummary</code> objects, each describing a labeling job.
     * </p>
     * 
     * @param labelingJobSummaryList
     *        An array of <code>LabelingJobSummary</code> objects, each describing a labeling job.
     */

    public void setLabelingJobSummaryList(java.util.Collection<LabelingJobSummary> labelingJobSummaryList) {
        if (labelingJobSummaryList == null) {
            this.labelingJobSummaryList = null;
            return;
        }

        this.labelingJobSummaryList = new java.util.ArrayList<LabelingJobSummary>(labelingJobSummaryList);
    }

    /**
     * <p>
     * An array of <code>LabelingJobSummary</code> objects, each describing a labeling job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabelingJobSummaryList(java.util.Collection)} or
     * {@link #withLabelingJobSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param labelingJobSummaryList
     *        An array of <code>LabelingJobSummary</code> objects, each describing a labeling job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLabelingJobsResult withLabelingJobSummaryList(LabelingJobSummary... labelingJobSummaryList) {
        if (this.labelingJobSummaryList == null) {
            setLabelingJobSummaryList(new java.util.ArrayList<LabelingJobSummary>(labelingJobSummaryList.length));
        }
        for (LabelingJobSummary ele : labelingJobSummaryList) {
            this.labelingJobSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>LabelingJobSummary</code> objects, each describing a labeling job.
     * </p>
     * 
     * @param labelingJobSummaryList
     *        An array of <code>LabelingJobSummary</code> objects, each describing a labeling job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLabelingJobsResult withLabelingJobSummaryList(java.util.Collection<LabelingJobSummary> labelingJobSummaryList) {
        setLabelingJobSummaryList(labelingJobSummaryList);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of labeling jobs, use
     * it in the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of labeling
     *        jobs, use it in the subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of labeling jobs, use
     * it in the subsequent request.
     * </p>
     * 
     * @return If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of labeling
     *         jobs, use it in the subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of labeling jobs, use
     * it in the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of labeling
     *        jobs, use it in the subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLabelingJobsResult withNextToken(String nextToken) {
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
        if (getLabelingJobSummaryList() != null)
            sb.append("LabelingJobSummaryList: ").append(getLabelingJobSummaryList()).append(",");
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

        if (obj instanceof ListLabelingJobsResult == false)
            return false;
        ListLabelingJobsResult other = (ListLabelingJobsResult) obj;
        if (other.getLabelingJobSummaryList() == null ^ this.getLabelingJobSummaryList() == null)
            return false;
        if (other.getLabelingJobSummaryList() != null && other.getLabelingJobSummaryList().equals(this.getLabelingJobSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getLabelingJobSummaryList() == null) ? 0 : getLabelingJobSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLabelingJobsResult clone() {
        try {
            return (ListLabelingJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
