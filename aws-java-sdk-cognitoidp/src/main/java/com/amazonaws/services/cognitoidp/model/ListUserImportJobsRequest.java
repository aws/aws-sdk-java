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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to list the user import jobs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUserImportJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUserImportJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID for the user pool that the users are being imported into.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The maximum number of import jobs you want the request to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An identifier that was returned from the previous call to <code>ListUserImportJobs</code>, which can be used to
     * return the next set of import jobs in the list.
     * </p>
     */
    private String paginationToken;

    /**
     * <p>
     * The user pool ID for the user pool that the users are being imported into.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool that the users are being imported into.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool that the users are being imported into.
     * </p>
     * 
     * @return The user pool ID for the user pool that the users are being imported into.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool that the users are being imported into.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool that the users are being imported into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserImportJobsRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The maximum number of import jobs you want the request to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of import jobs you want the request to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of import jobs you want the request to return.
     * </p>
     * 
     * @return The maximum number of import jobs you want the request to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of import jobs you want the request to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of import jobs you want the request to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserImportJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to <code>ListUserImportJobs</code>, which can be used to
     * return the next set of import jobs in the list.
     * </p>
     * 
     * @param paginationToken
     *        An identifier that was returned from the previous call to <code>ListUserImportJobs</code>, which can be
     *        used to return the next set of import jobs in the list.
     */

    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to <code>ListUserImportJobs</code>, which can be used to
     * return the next set of import jobs in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to <code>ListUserImportJobs</code>, which can be
     *         used to return the next set of import jobs in the list.
     */

    public String getPaginationToken() {
        return this.paginationToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to <code>ListUserImportJobs</code>, which can be used to
     * return the next set of import jobs in the list.
     * </p>
     * 
     * @param paginationToken
     *        An identifier that was returned from the previous call to <code>ListUserImportJobs</code>, which can be
     *        used to return the next set of import jobs in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserImportJobsRequest withPaginationToken(String paginationToken) {
        setPaginationToken(paginationToken);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getPaginationToken() != null)
            sb.append("PaginationToken: ").append(getPaginationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUserImportJobsRequest == false)
            return false;
        ListUserImportJobsRequest other = (ListUserImportJobsRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        return hashCode;
    }

    @Override
    public ListUserImportJobsRequest clone() {
        return (ListUserImportJobsRequest) super.clone();
    }

}
