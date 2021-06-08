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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListConnections" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConnectionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If specified, only this connection is returned. If not specified, the result isn't filtered by name.
     * </p>
     */
    private String connectionName;
    /**
     * <p>
     * The maximum number of results to include in each response (result page). Used for a paginated request.
     * </p>
     * <p>
     * If you don't specify <code>MaxResults</code>, the request retrieves all available results in a single response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token from a previous result page. Used for a paginated request. The request retrieves the next result page.
     * All other parameter values must be identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If you don't specify <code>NextToken</code>, the request retrieves the first result page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * If specified, only this connection is returned. If not specified, the result isn't filtered by name.
     * </p>
     * 
     * @param connectionName
     *        If specified, only this connection is returned. If not specified, the result isn't filtered by name.
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * If specified, only this connection is returned. If not specified, the result isn't filtered by name.
     * </p>
     * 
     * @return If specified, only this connection is returned. If not specified, the result isn't filtered by name.
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * If specified, only this connection is returned. If not specified, the result isn't filtered by name.
     * </p>
     * 
     * @param connectionName
     *        If specified, only this connection is returned. If not specified, the result isn't filtered by name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectionsRequest withConnectionName(String connectionName) {
        setConnectionName(connectionName);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to include in each response (result page). Used for a paginated request.
     * </p>
     * <p>
     * If you don't specify <code>MaxResults</code>, the request retrieves all available results in a single response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in each response (result page). Used for a paginated request.</p>
     *        <p>
     *        If you don't specify <code>MaxResults</code>, the request retrieves all available results in a single
     *        response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in each response (result page). Used for a paginated request.
     * </p>
     * <p>
     * If you don't specify <code>MaxResults</code>, the request retrieves all available results in a single response.
     * </p>
     * 
     * @return The maximum number of results to include in each response (result page). Used for a paginated
     *         request.</p>
     *         <p>
     *         If you don't specify <code>MaxResults</code>, the request retrieves all available results in a single
     *         response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in each response (result page). Used for a paginated request.
     * </p>
     * <p>
     * If you don't specify <code>MaxResults</code>, the request retrieves all available results in a single response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in each response (result page). Used for a paginated request.</p>
     *        <p>
     *        If you don't specify <code>MaxResults</code>, the request retrieves all available results in a single
     *        response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token from a previous result page. Used for a paginated request. The request retrieves the next result page.
     * All other parameter values must be identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If you don't specify <code>NextToken</code>, the request retrieves the first result page.
     * </p>
     * 
     * @param nextToken
     *        A token from a previous result page. Used for a paginated request. The request retrieves the next result
     *        page. All other parameter values must be identical to the ones specified in the initial request.</p>
     *        <p>
     *        If you don't specify <code>NextToken</code>, the request retrieves the first result page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token from a previous result page. Used for a paginated request. The request retrieves the next result page.
     * All other parameter values must be identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If you don't specify <code>NextToken</code>, the request retrieves the first result page.
     * </p>
     * 
     * @return A token from a previous result page. Used for a paginated request. The request retrieves the next result
     *         page. All other parameter values must be identical to the ones specified in the initial request.</p>
     *         <p>
     *         If you don't specify <code>NextToken</code>, the request retrieves the first result page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token from a previous result page. Used for a paginated request. The request retrieves the next result page.
     * All other parameter values must be identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If you don't specify <code>NextToken</code>, the request retrieves the first result page.
     * </p>
     * 
     * @param nextToken
     *        A token from a previous result page. Used for a paginated request. The request retrieves the next result
     *        page. All other parameter values must be identical to the ones specified in the initial request.</p>
     *        <p>
     *        If you don't specify <code>NextToken</code>, the request retrieves the first result page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectionsRequest withNextToken(String nextToken) {
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
        if (getConnectionName() != null)
            sb.append("ConnectionName: ").append(getConnectionName()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListConnectionsRequest == false)
            return false;
        ListConnectionsRequest other = (ListConnectionsRequest) obj;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListConnectionsRequest clone() {
        return (ListConnectionsRequest) super.clone();
    }

}
