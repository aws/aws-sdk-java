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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentAccountConnections"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnvironmentAccountConnectionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The environment name that's associated with each listed environment account connection.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The maximum number of environment account connections to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to indicate the location of the next environment account connection in the array of environment account
     * connections, after the list of environment account connections that was previously requested.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The type of account making the <code>ListEnvironmentAccountConnections</code> request.
     * </p>
     */
    private String requestedBy;
    /**
     * <p>
     * The status details for each listed environment account connection.
     * </p>
     */
    private java.util.List<String> statuses;

    /**
     * <p>
     * The environment name that's associated with each listed environment account connection.
     * </p>
     * 
     * @param environmentName
     *        The environment name that's associated with each listed environment account connection.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The environment name that's associated with each listed environment account connection.
     * </p>
     * 
     * @return The environment name that's associated with each listed environment account connection.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The environment name that's associated with each listed environment account connection.
     * </p>
     * 
     * @param environmentName
     *        The environment name that's associated with each listed environment account connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentAccountConnectionsRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The maximum number of environment account connections to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of environment account connections to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of environment account connections to list.
     * </p>
     * 
     * @return The maximum number of environment account connections to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of environment account connections to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of environment account connections to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentAccountConnectionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to indicate the location of the next environment account connection in the array of environment account
     * connections, after the list of environment account connections that was previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token to indicate the location of the next environment account connection in the array of environment
     *        account connections, after the list of environment account connections that was previously requested.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to indicate the location of the next environment account connection in the array of environment account
     * connections, after the list of environment account connections that was previously requested.
     * </p>
     * 
     * @return A token to indicate the location of the next environment account connection in the array of environment
     *         account connections, after the list of environment account connections that was previously requested.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to indicate the location of the next environment account connection in the array of environment account
     * connections, after the list of environment account connections that was previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token to indicate the location of the next environment account connection in the array of environment
     *        account connections, after the list of environment account connections that was previously requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentAccountConnectionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The type of account making the <code>ListEnvironmentAccountConnections</code> request.
     * </p>
     * 
     * @param requestedBy
     *        The type of account making the <code>ListEnvironmentAccountConnections</code> request.
     * @see EnvironmentAccountConnectionRequesterAccountType
     */

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    /**
     * <p>
     * The type of account making the <code>ListEnvironmentAccountConnections</code> request.
     * </p>
     * 
     * @return The type of account making the <code>ListEnvironmentAccountConnections</code> request.
     * @see EnvironmentAccountConnectionRequesterAccountType
     */

    public String getRequestedBy() {
        return this.requestedBy;
    }

    /**
     * <p>
     * The type of account making the <code>ListEnvironmentAccountConnections</code> request.
     * </p>
     * 
     * @param requestedBy
     *        The type of account making the <code>ListEnvironmentAccountConnections</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentAccountConnectionRequesterAccountType
     */

    public ListEnvironmentAccountConnectionsRequest withRequestedBy(String requestedBy) {
        setRequestedBy(requestedBy);
        return this;
    }

    /**
     * <p>
     * The type of account making the <code>ListEnvironmentAccountConnections</code> request.
     * </p>
     * 
     * @param requestedBy
     *        The type of account making the <code>ListEnvironmentAccountConnections</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentAccountConnectionRequesterAccountType
     */

    public ListEnvironmentAccountConnectionsRequest withRequestedBy(EnvironmentAccountConnectionRequesterAccountType requestedBy) {
        this.requestedBy = requestedBy.toString();
        return this;
    }

    /**
     * <p>
     * The status details for each listed environment account connection.
     * </p>
     * 
     * @return The status details for each listed environment account connection.
     * @see EnvironmentAccountConnectionStatus
     */

    public java.util.List<String> getStatuses() {
        return statuses;
    }

    /**
     * <p>
     * The status details for each listed environment account connection.
     * </p>
     * 
     * @param statuses
     *        The status details for each listed environment account connection.
     * @see EnvironmentAccountConnectionStatus
     */

    public void setStatuses(java.util.Collection<String> statuses) {
        if (statuses == null) {
            this.statuses = null;
            return;
        }

        this.statuses = new java.util.ArrayList<String>(statuses);
    }

    /**
     * <p>
     * The status details for each listed environment account connection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatuses(java.util.Collection)} or {@link #withStatuses(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param statuses
     *        The status details for each listed environment account connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentAccountConnectionStatus
     */

    public ListEnvironmentAccountConnectionsRequest withStatuses(String... statuses) {
        if (this.statuses == null) {
            setStatuses(new java.util.ArrayList<String>(statuses.length));
        }
        for (String ele : statuses) {
            this.statuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status details for each listed environment account connection.
     * </p>
     * 
     * @param statuses
     *        The status details for each listed environment account connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentAccountConnectionStatus
     */

    public ListEnvironmentAccountConnectionsRequest withStatuses(java.util.Collection<String> statuses) {
        setStatuses(statuses);
        return this;
    }

    /**
     * <p>
     * The status details for each listed environment account connection.
     * </p>
     * 
     * @param statuses
     *        The status details for each listed environment account connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentAccountConnectionStatus
     */

    public ListEnvironmentAccountConnectionsRequest withStatuses(EnvironmentAccountConnectionStatus... statuses) {
        java.util.ArrayList<String> statusesCopy = new java.util.ArrayList<String>(statuses.length);
        for (EnvironmentAccountConnectionStatus value : statuses) {
            statusesCopy.add(value.toString());
        }
        if (getStatuses() == null) {
            setStatuses(statusesCopy);
        } else {
            getStatuses().addAll(statusesCopy);
        }
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRequestedBy() != null)
            sb.append("RequestedBy: ").append(getRequestedBy()).append(",");
        if (getStatuses() != null)
            sb.append("Statuses: ").append(getStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEnvironmentAccountConnectionsRequest == false)
            return false;
        ListEnvironmentAccountConnectionsRequest other = (ListEnvironmentAccountConnectionsRequest) obj;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRequestedBy() == null ^ this.getRequestedBy() == null)
            return false;
        if (other.getRequestedBy() != null && other.getRequestedBy().equals(this.getRequestedBy()) == false)
            return false;
        if (other.getStatuses() == null ^ this.getStatuses() == null)
            return false;
        if (other.getStatuses() != null && other.getStatuses().equals(this.getStatuses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRequestedBy() == null) ? 0 : getRequestedBy().hashCode());
        hashCode = prime * hashCode + ((getStatuses() == null) ? 0 : getStatuses().hashCode());
        return hashCode;
    }

    @Override
    public ListEnvironmentAccountConnectionsRequest clone() {
        return (ListEnvironmentAccountConnectionsRequest) super.clone();
    }

}
