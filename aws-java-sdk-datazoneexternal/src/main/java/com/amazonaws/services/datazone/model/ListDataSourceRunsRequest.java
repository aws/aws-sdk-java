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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListDataSourceRuns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataSourceRunsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the data source.
     * </p>
     */
    private String dataSourceIdentifier;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which to invoke the <code>ListDataSourceRuns</code> action.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The maximum number of runs to return in a single call to <code>ListDataSourceRuns</code>. When the number of runs
     * to be listed is greater than the value of <code>MaxResults</code>, the response contains a <code>NextToken</code>
     * value that you can use in a subsequent call to <code>ListDataSourceRuns</code> to list the next set of runs.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When the number of runs is greater than the default value for the <code>MaxResults</code> parameter, or if you
     * explicitly specify a value for <code>MaxResults</code> that is less than the number of runs, the response
     * includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a
     * subsequent call to <code>ListDataSourceRuns</code> to list the next set of runs.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The status of the data source.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The identifier of the data source.
     * </p>
     * 
     * @param dataSourceIdentifier
     *        The identifier of the data source.
     */

    public void setDataSourceIdentifier(String dataSourceIdentifier) {
        this.dataSourceIdentifier = dataSourceIdentifier;
    }

    /**
     * <p>
     * The identifier of the data source.
     * </p>
     * 
     * @return The identifier of the data source.
     */

    public String getDataSourceIdentifier() {
        return this.dataSourceIdentifier;
    }

    /**
     * <p>
     * The identifier of the data source.
     * </p>
     * 
     * @param dataSourceIdentifier
     *        The identifier of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourceRunsRequest withDataSourceIdentifier(String dataSourceIdentifier) {
        setDataSourceIdentifier(dataSourceIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which to invoke the <code>ListDataSourceRuns</code> action.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which to invoke the <code>ListDataSourceRuns</code>
     *        action.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which to invoke the <code>ListDataSourceRuns</code> action.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which to invoke the <code>ListDataSourceRuns</code>
     *         action.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which to invoke the <code>ListDataSourceRuns</code> action.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which to invoke the <code>ListDataSourceRuns</code>
     *        action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourceRunsRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of runs to return in a single call to <code>ListDataSourceRuns</code>. When the number of runs
     * to be listed is greater than the value of <code>MaxResults</code>, the response contains a <code>NextToken</code>
     * value that you can use in a subsequent call to <code>ListDataSourceRuns</code> to list the next set of runs.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of runs to return in a single call to <code>ListDataSourceRuns</code>. When the number
     *        of runs to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     *        <code>NextToken</code> value that you can use in a subsequent call to <code>ListDataSourceRuns</code> to
     *        list the next set of runs.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of runs to return in a single call to <code>ListDataSourceRuns</code>. When the number of runs
     * to be listed is greater than the value of <code>MaxResults</code>, the response contains a <code>NextToken</code>
     * value that you can use in a subsequent call to <code>ListDataSourceRuns</code> to list the next set of runs.
     * </p>
     * 
     * @return The maximum number of runs to return in a single call to <code>ListDataSourceRuns</code>. When the number
     *         of runs to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     *         <code>NextToken</code> value that you can use in a subsequent call to <code>ListDataSourceRuns</code> to
     *         list the next set of runs.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of runs to return in a single call to <code>ListDataSourceRuns</code>. When the number of runs
     * to be listed is greater than the value of <code>MaxResults</code>, the response contains a <code>NextToken</code>
     * value that you can use in a subsequent call to <code>ListDataSourceRuns</code> to list the next set of runs.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of runs to return in a single call to <code>ListDataSourceRuns</code>. When the number
     *        of runs to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     *        <code>NextToken</code> value that you can use in a subsequent call to <code>ListDataSourceRuns</code> to
     *        list the next set of runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourceRunsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When the number of runs is greater than the default value for the <code>MaxResults</code> parameter, or if you
     * explicitly specify a value for <code>MaxResults</code> that is less than the number of runs, the response
     * includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a
     * subsequent call to <code>ListDataSourceRuns</code> to list the next set of runs.
     * </p>
     * 
     * @param nextToken
     *        When the number of runs is greater than the default value for the <code>MaxResults</code> parameter, or if
     *        you explicitly specify a value for <code>MaxResults</code> that is less than the number of runs, the
     *        response includes a pagination token named <code>NextToken</code>. You can specify this
     *        <code>NextToken</code> value in a subsequent call to <code>ListDataSourceRuns</code> to list the next set
     *        of runs.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of runs is greater than the default value for the <code>MaxResults</code> parameter, or if you
     * explicitly specify a value for <code>MaxResults</code> that is less than the number of runs, the response
     * includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a
     * subsequent call to <code>ListDataSourceRuns</code> to list the next set of runs.
     * </p>
     * 
     * @return When the number of runs is greater than the default value for the <code>MaxResults</code> parameter, or
     *         if you explicitly specify a value for <code>MaxResults</code> that is less than the number of runs, the
     *         response includes a pagination token named <code>NextToken</code>. You can specify this
     *         <code>NextToken</code> value in a subsequent call to <code>ListDataSourceRuns</code> to list the next set
     *         of runs.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of runs is greater than the default value for the <code>MaxResults</code> parameter, or if you
     * explicitly specify a value for <code>MaxResults</code> that is less than the number of runs, the response
     * includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a
     * subsequent call to <code>ListDataSourceRuns</code> to list the next set of runs.
     * </p>
     * 
     * @param nextToken
     *        When the number of runs is greater than the default value for the <code>MaxResults</code> parameter, or if
     *        you explicitly specify a value for <code>MaxResults</code> that is less than the number of runs, the
     *        response includes a pagination token named <code>NextToken</code>. You can specify this
     *        <code>NextToken</code> value in a subsequent call to <code>ListDataSourceRuns</code> to list the next set
     *        of runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourceRunsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The status of the data source.
     * </p>
     * 
     * @param status
     *        The status of the data source.
     * @see DataSourceRunStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the data source.
     * </p>
     * 
     * @return The status of the data source.
     * @see DataSourceRunStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the data source.
     * </p>
     * 
     * @param status
     *        The status of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceRunStatus
     */

    public ListDataSourceRunsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the data source.
     * </p>
     * 
     * @param status
     *        The status of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceRunStatus
     */

    public ListDataSourceRunsRequest withStatus(DataSourceRunStatus status) {
        this.status = status.toString();
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
        if (getDataSourceIdentifier() != null)
            sb.append("DataSourceIdentifier: ").append(getDataSourceIdentifier()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDataSourceRunsRequest == false)
            return false;
        ListDataSourceRunsRequest other = (ListDataSourceRunsRequest) obj;
        if (other.getDataSourceIdentifier() == null ^ this.getDataSourceIdentifier() == null)
            return false;
        if (other.getDataSourceIdentifier() != null && other.getDataSourceIdentifier().equals(this.getDataSourceIdentifier()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceIdentifier() == null) ? 0 : getDataSourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListDataSourceRunsRequest clone() {
        return (ListDataSourceRunsRequest) super.clone();
    }

}
