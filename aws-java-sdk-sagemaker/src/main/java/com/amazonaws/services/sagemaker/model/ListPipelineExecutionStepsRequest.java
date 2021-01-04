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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListPipelineExecutionSteps"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPipelineExecutionStepsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline execution.
     * </p>
     */
    private String pipelineExecutionArn;
    /**
     * <p>
     * If the result of the previous <code>ListPipelineExecutionSteps</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of pipeline execution steps, use the token in the
     * next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of pipeline execution steps to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The field by which to sort results. The default is <code>CreatedTime</code>.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionArn
     *        The Amazon Resource Name (ARN) of the pipeline execution.
     */

    public void setPipelineExecutionArn(String pipelineExecutionArn) {
        this.pipelineExecutionArn = pipelineExecutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the pipeline execution.
     */

    public String getPipelineExecutionArn() {
        return this.pipelineExecutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionArn
     *        The Amazon Resource Name (ARN) of the pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelineExecutionStepsRequest withPipelineExecutionArn(String pipelineExecutionArn) {
        setPipelineExecutionArn(pipelineExecutionArn);
        return this;
    }

    /**
     * <p>
     * If the result of the previous <code>ListPipelineExecutionSteps</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of pipeline execution steps, use the token in the
     * next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListPipelineExecutionSteps</code> request was truncated, the response
     *        includes a <code>NextToken</code>. To retrieve the next set of pipeline execution steps, use the token in
     *        the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListPipelineExecutionSteps</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of pipeline execution steps, use the token in the
     * next request.
     * </p>
     * 
     * @return If the result of the previous <code>ListPipelineExecutionSteps</code> request was truncated, the response
     *         includes a <code>NextToken</code>. To retrieve the next set of pipeline execution steps, use the token in
     *         the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListPipelineExecutionSteps</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of pipeline execution steps, use the token in the
     * next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListPipelineExecutionSteps</code> request was truncated, the response
     *        includes a <code>NextToken</code>. To retrieve the next set of pipeline execution steps, use the token in
     *        the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelineExecutionStepsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of pipeline execution steps to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of pipeline execution steps to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of pipeline execution steps to return in the response.
     * </p>
     * 
     * @return The maximum number of pipeline execution steps to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of pipeline execution steps to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of pipeline execution steps to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelineExecutionStepsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The field by which to sort results. The default is <code>CreatedTime</code>.
     * </p>
     * 
     * @param sortOrder
     *        The field by which to sort results. The default is <code>CreatedTime</code>.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The field by which to sort results. The default is <code>CreatedTime</code>.
     * </p>
     * 
     * @return The field by which to sort results. The default is <code>CreatedTime</code>.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The field by which to sort results. The default is <code>CreatedTime</code>.
     * </p>
     * 
     * @param sortOrder
     *        The field by which to sort results. The default is <code>CreatedTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListPipelineExecutionStepsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The field by which to sort results. The default is <code>CreatedTime</code>.
     * </p>
     * 
     * @param sortOrder
     *        The field by which to sort results. The default is <code>CreatedTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListPipelineExecutionStepsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getPipelineExecutionArn() != null)
            sb.append("PipelineExecutionArn: ").append(getPipelineExecutionArn()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPipelineExecutionStepsRequest == false)
            return false;
        ListPipelineExecutionStepsRequest other = (ListPipelineExecutionStepsRequest) obj;
        if (other.getPipelineExecutionArn() == null ^ this.getPipelineExecutionArn() == null)
            return false;
        if (other.getPipelineExecutionArn() != null && other.getPipelineExecutionArn().equals(this.getPipelineExecutionArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineExecutionArn() == null) ? 0 : getPipelineExecutionArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListPipelineExecutionStepsRequest clone() {
        return (ListPipelineExecutionStepsRequest) super.clone();
    }

}
