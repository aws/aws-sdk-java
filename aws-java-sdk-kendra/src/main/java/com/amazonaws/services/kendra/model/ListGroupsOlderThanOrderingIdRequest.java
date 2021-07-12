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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListGroupsOlderThanOrderingId"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGroupsOlderThanOrderingIdRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index for getting a list of groups mapped to users before a given ordering or timestamp
     * identifier.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The identifier of the data source for getting a list of groups mapped to users before a given ordering timestamp
     * identifier.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * The timestamp identifier used for the latest <code>PUT</code> or <code>DELETE</code> action for mapping users to
     * their groups.
     * </p>
     */
    private Long orderingId;
    /**
     * <p>
     * The next items in the list of groups that go beyond the maximum.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum results shown for a list of groups that are mapped to users before a given ordering or timestamp
     * identifier.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identifier of the index for getting a list of groups mapped to users before a given ordering or timestamp
     * identifier.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index for getting a list of groups mapped to users before a given ordering or
     *        timestamp identifier.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index for getting a list of groups mapped to users before a given ordering or timestamp
     * identifier.
     * </p>
     * 
     * @return The identifier of the index for getting a list of groups mapped to users before a given ordering or
     *         timestamp identifier.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index for getting a list of groups mapped to users before a given ordering or timestamp
     * identifier.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index for getting a list of groups mapped to users before a given ordering or
     *        timestamp identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsOlderThanOrderingIdRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The identifier of the data source for getting a list of groups mapped to users before a given ordering timestamp
     * identifier.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source for getting a list of groups mapped to users before a given ordering
     *        timestamp identifier.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source for getting a list of groups mapped to users before a given ordering timestamp
     * identifier.
     * </p>
     * 
     * @return The identifier of the data source for getting a list of groups mapped to users before a given ordering
     *         timestamp identifier.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source for getting a list of groups mapped to users before a given ordering timestamp
     * identifier.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source for getting a list of groups mapped to users before a given ordering
     *        timestamp identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsOlderThanOrderingIdRequest withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * The timestamp identifier used for the latest <code>PUT</code> or <code>DELETE</code> action for mapping users to
     * their groups.
     * </p>
     * 
     * @param orderingId
     *        The timestamp identifier used for the latest <code>PUT</code> or <code>DELETE</code> action for mapping
     *        users to their groups.
     */

    public void setOrderingId(Long orderingId) {
        this.orderingId = orderingId;
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

    public Long getOrderingId() {
        return this.orderingId;
    }

    /**
     * <p>
     * The timestamp identifier used for the latest <code>PUT</code> or <code>DELETE</code> action for mapping users to
     * their groups.
     * </p>
     * 
     * @param orderingId
     *        The timestamp identifier used for the latest <code>PUT</code> or <code>DELETE</code> action for mapping
     *        users to their groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsOlderThanOrderingIdRequest withOrderingId(Long orderingId) {
        setOrderingId(orderingId);
        return this;
    }

    /**
     * <p>
     * The next items in the list of groups that go beyond the maximum.
     * </p>
     * 
     * @param nextToken
     *        The next items in the list of groups that go beyond the maximum.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next items in the list of groups that go beyond the maximum.
     * </p>
     * 
     * @return The next items in the list of groups that go beyond the maximum.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next items in the list of groups that go beyond the maximum.
     * </p>
     * 
     * @param nextToken
     *        The next items in the list of groups that go beyond the maximum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsOlderThanOrderingIdRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum results shown for a list of groups that are mapped to users before a given ordering or timestamp
     * identifier.
     * </p>
     * 
     * @param maxResults
     *        The maximum results shown for a list of groups that are mapped to users before a given ordering or
     *        timestamp identifier.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum results shown for a list of groups that are mapped to users before a given ordering or timestamp
     * identifier.
     * </p>
     * 
     * @return The maximum results shown for a list of groups that are mapped to users before a given ordering or
     *         timestamp identifier.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum results shown for a list of groups that are mapped to users before a given ordering or timestamp
     * identifier.
     * </p>
     * 
     * @param maxResults
     *        The maximum results shown for a list of groups that are mapped to users before a given ordering or
     *        timestamp identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsOlderThanOrderingIdRequest withMaxResults(Integer maxResults) {
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getOrderingId() != null)
            sb.append("OrderingId: ").append(getOrderingId()).append(",");
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

        if (obj instanceof ListGroupsOlderThanOrderingIdRequest == false)
            return false;
        ListGroupsOlderThanOrderingIdRequest other = (ListGroupsOlderThanOrderingIdRequest) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getOrderingId() == null ^ this.getOrderingId() == null)
            return false;
        if (other.getOrderingId() != null && other.getOrderingId().equals(this.getOrderingId()) == false)
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

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getOrderingId() == null) ? 0 : getOrderingId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListGroupsOlderThanOrderingIdRequest clone() {
        return (ListGroupsOlderThanOrderingIdRequest) super.clone();
    }

}
