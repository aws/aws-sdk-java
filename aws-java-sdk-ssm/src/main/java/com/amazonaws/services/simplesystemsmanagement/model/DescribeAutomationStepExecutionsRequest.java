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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAutomationStepExecutions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAutomationStepExecutionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Automation execution ID for which you want step execution descriptions.
     * </p>
     */
    private String automationExecutionId;
    /**
     * <p>
     * One or more filters to limit the number of step executions returned by the request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StepExecutionFilter> filters;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A boolean that indicates whether to list step executions in reverse order by start time. The default value is
     * false.
     * </p>
     */
    private Boolean reverseOrder;

    /**
     * <p>
     * The Automation execution ID for which you want step execution descriptions.
     * </p>
     * 
     * @param automationExecutionId
     *        The Automation execution ID for which you want step execution descriptions.
     */

    public void setAutomationExecutionId(String automationExecutionId) {
        this.automationExecutionId = automationExecutionId;
    }

    /**
     * <p>
     * The Automation execution ID for which you want step execution descriptions.
     * </p>
     * 
     * @return The Automation execution ID for which you want step execution descriptions.
     */

    public String getAutomationExecutionId() {
        return this.automationExecutionId;
    }

    /**
     * <p>
     * The Automation execution ID for which you want step execution descriptions.
     * </p>
     * 
     * @param automationExecutionId
     *        The Automation execution ID for which you want step execution descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutomationStepExecutionsRequest withAutomationExecutionId(String automationExecutionId) {
        setAutomationExecutionId(automationExecutionId);
        return this;
    }

    /**
     * <p>
     * One or more filters to limit the number of step executions returned by the request.
     * </p>
     * 
     * @return One or more filters to limit the number of step executions returned by the request.
     */

    public java.util.List<StepExecutionFilter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<StepExecutionFilter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters to limit the number of step executions returned by the request.
     * </p>
     * 
     * @param filters
     *        One or more filters to limit the number of step executions returned by the request.
     */

    public void setFilters(java.util.Collection<StepExecutionFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<StepExecutionFilter>(filters);
    }

    /**
     * <p>
     * One or more filters to limit the number of step executions returned by the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters to limit the number of step executions returned by the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutomationStepExecutionsRequest withFilters(StepExecutionFilter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<StepExecutionFilter>(filters.length));
        }
        for (StepExecutionFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters to limit the number of step executions returned by the request.
     * </p>
     * 
     * @param filters
     *        One or more filters to limit the number of step executions returned by the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutomationStepExecutionsRequest withFilters(java.util.Collection<StepExecutionFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutomationStepExecutionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @return The maximum number of items to return for this call. The call also returns a token that you can specify
     *         in a subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutomationStepExecutionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A boolean that indicates whether to list step executions in reverse order by start time. The default value is
     * false.
     * </p>
     * 
     * @param reverseOrder
     *        A boolean that indicates whether to list step executions in reverse order by start time. The default value
     *        is false.
     */

    public void setReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
    }

    /**
     * <p>
     * A boolean that indicates whether to list step executions in reverse order by start time. The default value is
     * false.
     * </p>
     * 
     * @return A boolean that indicates whether to list step executions in reverse order by start time. The default
     *         value is false.
     */

    public Boolean getReverseOrder() {
        return this.reverseOrder;
    }

    /**
     * <p>
     * A boolean that indicates whether to list step executions in reverse order by start time. The default value is
     * false.
     * </p>
     * 
     * @param reverseOrder
     *        A boolean that indicates whether to list step executions in reverse order by start time. The default value
     *        is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutomationStepExecutionsRequest withReverseOrder(Boolean reverseOrder) {
        setReverseOrder(reverseOrder);
        return this;
    }

    /**
     * <p>
     * A boolean that indicates whether to list step executions in reverse order by start time. The default value is
     * false.
     * </p>
     * 
     * @return A boolean that indicates whether to list step executions in reverse order by start time. The default
     *         value is false.
     */

    public Boolean isReverseOrder() {
        return this.reverseOrder;
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
        if (getAutomationExecutionId() != null)
            sb.append("AutomationExecutionId: ").append(getAutomationExecutionId()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getReverseOrder() != null)
            sb.append("ReverseOrder: ").append(getReverseOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAutomationStepExecutionsRequest == false)
            return false;
        DescribeAutomationStepExecutionsRequest other = (DescribeAutomationStepExecutionsRequest) obj;
        if (other.getAutomationExecutionId() == null ^ this.getAutomationExecutionId() == null)
            return false;
        if (other.getAutomationExecutionId() != null && other.getAutomationExecutionId().equals(this.getAutomationExecutionId()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getReverseOrder() == null ^ this.getReverseOrder() == null)
            return false;
        if (other.getReverseOrder() != null && other.getReverseOrder().equals(this.getReverseOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomationExecutionId() == null) ? 0 : getAutomationExecutionId().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getReverseOrder() == null) ? 0 : getReverseOrder().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAutomationStepExecutionsRequest clone() {
        return (DescribeAutomationStepExecutionsRequest) super.clone();
    }

}
