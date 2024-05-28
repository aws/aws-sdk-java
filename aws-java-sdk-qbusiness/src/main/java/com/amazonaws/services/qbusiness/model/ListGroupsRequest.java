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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the application for getting a list of groups mapped to users.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of the index for getting a list of groups mapped to users.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The timestamp identifier used for the latest <code>PUT</code> or <code>DELETE</code> action for mapping users to
     * their groups.
     * </p>
     */
    private java.util.Date updatedEarlierThan;
    /**
     * <p>
     * The identifier of the data source for getting a list of groups mapped to users.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Q Business returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of groups that are
     * mapped to users.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of returned groups that are mapped to users.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identifier of the application for getting a list of groups mapped to users.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application for getting a list of groups mapped to users.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the application for getting a list of groups mapped to users.
     * </p>
     * 
     * @return The identifier of the application for getting a list of groups mapped to users.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the application for getting a list of groups mapped to users.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application for getting a list of groups mapped to users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the index for getting a list of groups mapped to users.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index for getting a list of groups mapped to users.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index for getting a list of groups mapped to users.
     * </p>
     * 
     * @return The identifier of the index for getting a list of groups mapped to users.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index for getting a list of groups mapped to users.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index for getting a list of groups mapped to users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The timestamp identifier used for the latest <code>PUT</code> or <code>DELETE</code> action for mapping users to
     * their groups.
     * </p>
     * 
     * @param updatedEarlierThan
     *        The timestamp identifier used for the latest <code>PUT</code> or <code>DELETE</code> action for mapping
     *        users to their groups.
     */

    public void setUpdatedEarlierThan(java.util.Date updatedEarlierThan) {
        this.updatedEarlierThan = updatedEarlierThan;
    }

    /**
     * <p>
     * The timestamp identifier used for the latest <code>PUT</code> or <code>DELETE</code> action for mapping users to
     * their groups.
     * </p>
     * 
     * @return The timestamp identifier used for the latest <code>PUT</code> or <code>DELETE</code> action for mapping
     *         users to their groups.
     */

    public java.util.Date getUpdatedEarlierThan() {
        return this.updatedEarlierThan;
    }

    /**
     * <p>
     * The timestamp identifier used for the latest <code>PUT</code> or <code>DELETE</code> action for mapping users to
     * their groups.
     * </p>
     * 
     * @param updatedEarlierThan
     *        The timestamp identifier used for the latest <code>PUT</code> or <code>DELETE</code> action for mapping
     *        users to their groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsRequest withUpdatedEarlierThan(java.util.Date updatedEarlierThan) {
        setUpdatedEarlierThan(updatedEarlierThan);
        return this;
    }

    /**
     * <p>
     * The identifier of the data source for getting a list of groups mapped to users.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source for getting a list of groups mapped to users.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source for getting a list of groups mapped to users.
     * </p>
     * 
     * @return The identifier of the data source for getting a list of groups mapped to users.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source for getting a list of groups mapped to users.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source for getting a list of groups mapped to users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsRequest withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Q Business returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of groups that are
     * mapped to users.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more data to retrieve), Amazon Q Business
     *        returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     *        groups that are mapped to users.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Q Business returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of groups that are
     * mapped to users.
     * </p>
     * 
     * @return If the previous response was incomplete (because there is more data to retrieve), Amazon Q Business
     *         returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     *         groups that are mapped to users.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Q Business returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of groups that are
     * mapped to users.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more data to retrieve), Amazon Q Business
     *        returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     *        groups that are mapped to users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of returned groups that are mapped to users.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of returned groups that are mapped to users.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of returned groups that are mapped to users.
     * </p>
     * 
     * @return The maximum number of returned groups that are mapped to users.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of returned groups that are mapped to users.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of returned groups that are mapped to users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsRequest withMaxResults(Integer maxResults) {
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getUpdatedEarlierThan() != null)
            sb.append("UpdatedEarlierThan: ").append(getUpdatedEarlierThan()).append(",");
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
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

        if (obj instanceof ListGroupsRequest == false)
            return false;
        ListGroupsRequest other = (ListGroupsRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getUpdatedEarlierThan() == null ^ this.getUpdatedEarlierThan() == null)
            return false;
        if (other.getUpdatedEarlierThan() != null && other.getUpdatedEarlierThan().equals(this.getUpdatedEarlierThan()) == false)
            return false;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
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

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getUpdatedEarlierThan() == null) ? 0 : getUpdatedEarlierThan().hashCode());
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListGroupsRequest clone() {
        return (ListGroupsRequest) super.clone();
    }

}
