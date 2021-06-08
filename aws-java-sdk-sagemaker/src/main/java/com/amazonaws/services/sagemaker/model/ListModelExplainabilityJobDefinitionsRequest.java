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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelExplainabilityJobDefinitions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListModelExplainabilityJobDefinitionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the endpoint to monitor for model explainability.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * Whether to sort results by the <code>Name</code> or <code>CreationTime</code> field. The default is
     * <code>CreationTime</code>.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * Whether to sort the results in <code>Ascending</code> or <code>Descending</code> order. The default is
     * <code>Descending</code>.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The token returned if the response is truncated. To retrieve the next set of job executions, use it in the next
     * request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of jobs to return in the response. The default value is 10.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Filter for model explainability jobs whose name contains a specified string.
     * </p>
     */
    private String nameContains;
    /**
     * <p>
     * A filter that returns only model explainability jobs created before a specified time.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * A filter that returns only model explainability jobs created after a specified time.
     * </p>
     */
    private java.util.Date creationTimeAfter;

    /**
     * <p>
     * Name of the endpoint to monitor for model explainability.
     * </p>
     * 
     * @param endpointName
     *        Name of the endpoint to monitor for model explainability.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * Name of the endpoint to monitor for model explainability.
     * </p>
     * 
     * @return Name of the endpoint to monitor for model explainability.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * Name of the endpoint to monitor for model explainability.
     * </p>
     * 
     * @param endpointName
     *        Name of the endpoint to monitor for model explainability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelExplainabilityJobDefinitionsRequest withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * Whether to sort results by the <code>Name</code> or <code>CreationTime</code> field. The default is
     * <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        Whether to sort results by the <code>Name</code> or <code>CreationTime</code> field. The default is
     *        <code>CreationTime</code>.
     * @see MonitoringJobDefinitionSortKey
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Whether to sort results by the <code>Name</code> or <code>CreationTime</code> field. The default is
     * <code>CreationTime</code>.
     * </p>
     * 
     * @return Whether to sort results by the <code>Name</code> or <code>CreationTime</code> field. The default is
     *         <code>CreationTime</code>.
     * @see MonitoringJobDefinitionSortKey
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Whether to sort results by the <code>Name</code> or <code>CreationTime</code> field. The default is
     * <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        Whether to sort results by the <code>Name</code> or <code>CreationTime</code> field. The default is
     *        <code>CreationTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitoringJobDefinitionSortKey
     */

    public ListModelExplainabilityJobDefinitionsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Whether to sort results by the <code>Name</code> or <code>CreationTime</code> field. The default is
     * <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        Whether to sort results by the <code>Name</code> or <code>CreationTime</code> field. The default is
     *        <code>CreationTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitoringJobDefinitionSortKey
     */

    public ListModelExplainabilityJobDefinitionsRequest withSortBy(MonitoringJobDefinitionSortKey sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * Whether to sort the results in <code>Ascending</code> or <code>Descending</code> order. The default is
     * <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        Whether to sort the results in <code>Ascending</code> or <code>Descending</code> order. The default is
     *        <code>Descending</code>.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Whether to sort the results in <code>Ascending</code> or <code>Descending</code> order. The default is
     * <code>Descending</code>.
     * </p>
     * 
     * @return Whether to sort the results in <code>Ascending</code> or <code>Descending</code> order. The default is
     *         <code>Descending</code>.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Whether to sort the results in <code>Ascending</code> or <code>Descending</code> order. The default is
     * <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        Whether to sort the results in <code>Ascending</code> or <code>Descending</code> order. The default is
     *        <code>Descending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListModelExplainabilityJobDefinitionsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Whether to sort the results in <code>Ascending</code> or <code>Descending</code> order. The default is
     * <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        Whether to sort the results in <code>Ascending</code> or <code>Descending</code> order. The default is
     *        <code>Descending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListModelExplainabilityJobDefinitionsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The token returned if the response is truncated. To retrieve the next set of job executions, use it in the next
     * request.
     * </p>
     * 
     * @param nextToken
     *        The token returned if the response is truncated. To retrieve the next set of job executions, use it in the
     *        next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned if the response is truncated. To retrieve the next set of job executions, use it in the next
     * request.
     * </p>
     * 
     * @return The token returned if the response is truncated. To retrieve the next set of job executions, use it in
     *         the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned if the response is truncated. To retrieve the next set of job executions, use it in the next
     * request.
     * </p>
     * 
     * @param nextToken
     *        The token returned if the response is truncated. To retrieve the next set of job executions, use it in the
     *        next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelExplainabilityJobDefinitionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of jobs to return in the response. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of jobs to return in the response. The default value is 10.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of jobs to return in the response. The default value is 10.
     * </p>
     * 
     * @return The maximum number of jobs to return in the response. The default value is 10.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of jobs to return in the response. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of jobs to return in the response. The default value is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelExplainabilityJobDefinitionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Filter for model explainability jobs whose name contains a specified string.
     * </p>
     * 
     * @param nameContains
     *        Filter for model explainability jobs whose name contains a specified string.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * Filter for model explainability jobs whose name contains a specified string.
     * </p>
     * 
     * @return Filter for model explainability jobs whose name contains a specified string.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * Filter for model explainability jobs whose name contains a specified string.
     * </p>
     * 
     * @param nameContains
     *        Filter for model explainability jobs whose name contains a specified string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelExplainabilityJobDefinitionsRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
        return this;
    }

    /**
     * <p>
     * A filter that returns only model explainability jobs created before a specified time.
     * </p>
     * 
     * @param creationTimeBefore
     *        A filter that returns only model explainability jobs created before a specified time.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only model explainability jobs created before a specified time.
     * </p>
     * 
     * @return A filter that returns only model explainability jobs created before a specified time.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only model explainability jobs created before a specified time.
     * </p>
     * 
     * @param creationTimeBefore
     *        A filter that returns only model explainability jobs created before a specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelExplainabilityJobDefinitionsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * A filter that returns only model explainability jobs created after a specified time.
     * </p>
     * 
     * @param creationTimeAfter
     *        A filter that returns only model explainability jobs created after a specified time.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only model explainability jobs created after a specified time.
     * </p>
     * 
     * @return A filter that returns only model explainability jobs created after a specified time.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only model explainability jobs created after a specified time.
     * </p>
     * 
     * @param creationTimeAfter
     *        A filter that returns only model explainability jobs created after a specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelExplainabilityJobDefinitionsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
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
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListModelExplainabilityJobDefinitionsRequest == false)
            return false;
        ListModelExplainabilityJobDefinitionsRequest other = (ListModelExplainabilityJobDefinitionsRequest) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        return hashCode;
    }

    @Override
    public ListModelExplainabilityJobDefinitionsRequest clone() {
        return (ListModelExplainabilityJobDefinitionsRequest) super.clone();
    }

}
