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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListCheckSummaries" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCheckSummariesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String workloadId;

    private String nextToken;

    private Integer maxResults;
    /**
     * <p>
     * Well-Architected Lens ARN.
     * </p>
     */
    private String lensArn;

    private String pillarId;

    private String questionId;

    private String choiceId;

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

    public ListCheckSummariesRequest withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
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

    public ListCheckSummariesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @param maxResults
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * @return
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @param maxResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCheckSummariesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Well-Architected Lens ARN.
     * </p>
     * 
     * @param lensArn
     *        Well-Architected Lens ARN.
     */

    public void setLensArn(String lensArn) {
        this.lensArn = lensArn;
    }

    /**
     * <p>
     * Well-Architected Lens ARN.
     * </p>
     * 
     * @return Well-Architected Lens ARN.
     */

    public String getLensArn() {
        return this.lensArn;
    }

    /**
     * <p>
     * Well-Architected Lens ARN.
     * </p>
     * 
     * @param lensArn
     *        Well-Architected Lens ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCheckSummariesRequest withLensArn(String lensArn) {
        setLensArn(lensArn);
        return this;
    }

    /**
     * @param pillarId
     */

    public void setPillarId(String pillarId) {
        this.pillarId = pillarId;
    }

    /**
     * @return
     */

    public String getPillarId() {
        return this.pillarId;
    }

    /**
     * @param pillarId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCheckSummariesRequest withPillarId(String pillarId) {
        setPillarId(pillarId);
        return this;
    }

    /**
     * @param questionId
     */

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    /**
     * @return
     */

    public String getQuestionId() {
        return this.questionId;
    }

    /**
     * @param questionId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCheckSummariesRequest withQuestionId(String questionId) {
        setQuestionId(questionId);
        return this;
    }

    /**
     * @param choiceId
     */

    public void setChoiceId(String choiceId) {
        this.choiceId = choiceId;
    }

    /**
     * @return
     */

    public String getChoiceId() {
        return this.choiceId;
    }

    /**
     * @param choiceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCheckSummariesRequest withChoiceId(String choiceId) {
        setChoiceId(choiceId);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getLensArn() != null)
            sb.append("LensArn: ").append(getLensArn()).append(",");
        if (getPillarId() != null)
            sb.append("PillarId: ").append(getPillarId()).append(",");
        if (getQuestionId() != null)
            sb.append("QuestionId: ").append(getQuestionId()).append(",");
        if (getChoiceId() != null)
            sb.append("ChoiceId: ").append(getChoiceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCheckSummariesRequest == false)
            return false;
        ListCheckSummariesRequest other = (ListCheckSummariesRequest) obj;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getLensArn() == null ^ this.getLensArn() == null)
            return false;
        if (other.getLensArn() != null && other.getLensArn().equals(this.getLensArn()) == false)
            return false;
        if (other.getPillarId() == null ^ this.getPillarId() == null)
            return false;
        if (other.getPillarId() != null && other.getPillarId().equals(this.getPillarId()) == false)
            return false;
        if (other.getQuestionId() == null ^ this.getQuestionId() == null)
            return false;
        if (other.getQuestionId() != null && other.getQuestionId().equals(this.getQuestionId()) == false)
            return false;
        if (other.getChoiceId() == null ^ this.getChoiceId() == null)
            return false;
        if (other.getChoiceId() != null && other.getChoiceId().equals(this.getChoiceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getLensArn() == null) ? 0 : getLensArn().hashCode());
        hashCode = prime * hashCode + ((getPillarId() == null) ? 0 : getPillarId().hashCode());
        hashCode = prime * hashCode + ((getQuestionId() == null) ? 0 : getQuestionId().hashCode());
        hashCode = prime * hashCode + ((getChoiceId() == null) ? 0 : getChoiceId().hashCode());
        return hashCode;
    }

    @Override
    public ListCheckSummariesRequest clone() {
        return (ListCheckSummariesRequest) super.clone();
    }

}
