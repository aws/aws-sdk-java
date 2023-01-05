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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListWorkflows" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkflowsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     */
    private String workflowType;
    /**
     * <p>
     * Status of workflow execution.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Retrieve workflows started after timestamp.
     * </p>
     */
    private java.util.Date queryStartDate;
    /**
     * <p>
     * Retrieve workflows ended after timestamp.
     * </p>
     */
    private java.util.Date queryEndDate;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @return The unique name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     * 
     * @param workflowType
     *        The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * @see WorkflowType
     */

    public void setWorkflowType(String workflowType) {
        this.workflowType = workflowType;
    }

    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     * 
     * @return The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * @see WorkflowType
     */

    public String getWorkflowType() {
        return this.workflowType;
    }

    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     * 
     * @param workflowType
     *        The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public ListWorkflowsRequest withWorkflowType(String workflowType) {
        setWorkflowType(workflowType);
        return this;
    }

    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     * 
     * @param workflowType
     *        The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public ListWorkflowsRequest withWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType.toString();
        return this;
    }

    /**
     * <p>
     * Status of workflow execution.
     * </p>
     * 
     * @param status
     *        Status of workflow execution.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of workflow execution.
     * </p>
     * 
     * @return Status of workflow execution.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of workflow execution.
     * </p>
     * 
     * @param status
     *        Status of workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ListWorkflowsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of workflow execution.
     * </p>
     * 
     * @param status
     *        Status of workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ListWorkflowsRequest withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Retrieve workflows started after timestamp.
     * </p>
     * 
     * @param queryStartDate
     *        Retrieve workflows started after timestamp.
     */

    public void setQueryStartDate(java.util.Date queryStartDate) {
        this.queryStartDate = queryStartDate;
    }

    /**
     * <p>
     * Retrieve workflows started after timestamp.
     * </p>
     * 
     * @return Retrieve workflows started after timestamp.
     */

    public java.util.Date getQueryStartDate() {
        return this.queryStartDate;
    }

    /**
     * <p>
     * Retrieve workflows started after timestamp.
     * </p>
     * 
     * @param queryStartDate
     *        Retrieve workflows started after timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsRequest withQueryStartDate(java.util.Date queryStartDate) {
        setQueryStartDate(queryStartDate);
        return this;
    }

    /**
     * <p>
     * Retrieve workflows ended after timestamp.
     * </p>
     * 
     * @param queryEndDate
     *        Retrieve workflows ended after timestamp.
     */

    public void setQueryEndDate(java.util.Date queryEndDate) {
        this.queryEndDate = queryEndDate;
    }

    /**
     * <p>
     * Retrieve workflows ended after timestamp.
     * </p>
     * 
     * @return Retrieve workflows ended after timestamp.
     */

    public java.util.Date getQueryEndDate() {
        return this.queryEndDate;
    }

    /**
     * <p>
     * Retrieve workflows ended after timestamp.
     * </p>
     * 
     * @param queryEndDate
     *        Retrieve workflows ended after timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsRequest withQueryEndDate(java.util.Date queryEndDate) {
        setQueryEndDate(queryEndDate);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @return The maximum number of results to return per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getWorkflowType() != null)
            sb.append("WorkflowType: ").append(getWorkflowType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getQueryStartDate() != null)
            sb.append("QueryStartDate: ").append(getQueryStartDate()).append(",");
        if (getQueryEndDate() != null)
            sb.append("QueryEndDate: ").append(getQueryEndDate()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorkflowsRequest == false)
            return false;
        ListWorkflowsRequest other = (ListWorkflowsRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null)
            return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getQueryStartDate() == null ^ this.getQueryStartDate() == null)
            return false;
        if (other.getQueryStartDate() != null && other.getQueryStartDate().equals(this.getQueryStartDate()) == false)
            return false;
        if (other.getQueryEndDate() == null ^ this.getQueryEndDate() == null)
            return false;
        if (other.getQueryEndDate() != null && other.getQueryEndDate().equals(this.getQueryEndDate()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getQueryStartDate() == null) ? 0 : getQueryStartDate().hashCode());
        hashCode = prime * hashCode + ((getQueryEndDate() == null) ? 0 : getQueryEndDate().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkflowsRequest clone() {
        return (ListWorkflowsRequest) super.clone();
    }

}
