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

/**
 * <p>
 * Represents the response from the server to the request to list the user import jobs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUserImportJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUserImportJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The user import jobs.
     * </p>
     */
    private java.util.List<UserImportJobType> userImportJobs;
    /**
     * <p>
     * An identifier that can be used to return the next set of user import jobs in the list.
     * </p>
     */
    private String paginationToken;

    /**
     * <p>
     * The user import jobs.
     * </p>
     * 
     * @return The user import jobs.
     */

    public java.util.List<UserImportJobType> getUserImportJobs() {
        return userImportJobs;
    }

    /**
     * <p>
     * The user import jobs.
     * </p>
     * 
     * @param userImportJobs
     *        The user import jobs.
     */

    public void setUserImportJobs(java.util.Collection<UserImportJobType> userImportJobs) {
        if (userImportJobs == null) {
            this.userImportJobs = null;
            return;
        }

        this.userImportJobs = new java.util.ArrayList<UserImportJobType>(userImportJobs);
    }

    /**
     * <p>
     * The user import jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserImportJobs(java.util.Collection)} or {@link #withUserImportJobs(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userImportJobs
     *        The user import jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserImportJobsResult withUserImportJobs(UserImportJobType... userImportJobs) {
        if (this.userImportJobs == null) {
            setUserImportJobs(new java.util.ArrayList<UserImportJobType>(userImportJobs.length));
        }
        for (UserImportJobType ele : userImportJobs) {
            this.userImportJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user import jobs.
     * </p>
     * 
     * @param userImportJobs
     *        The user import jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserImportJobsResult withUserImportJobs(java.util.Collection<UserImportJobType> userImportJobs) {
        setUserImportJobs(userImportJobs);
        return this;
    }

    /**
     * <p>
     * An identifier that can be used to return the next set of user import jobs in the list.
     * </p>
     * 
     * @param paginationToken
     *        An identifier that can be used to return the next set of user import jobs in the list.
     */

    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * An identifier that can be used to return the next set of user import jobs in the list.
     * </p>
     * 
     * @return An identifier that can be used to return the next set of user import jobs in the list.
     */

    public String getPaginationToken() {
        return this.paginationToken;
    }

    /**
     * <p>
     * An identifier that can be used to return the next set of user import jobs in the list.
     * </p>
     * 
     * @param paginationToken
     *        An identifier that can be used to return the next set of user import jobs in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserImportJobsResult withPaginationToken(String paginationToken) {
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
        if (getUserImportJobs() != null)
            sb.append("UserImportJobs: ").append(getUserImportJobs()).append(",");
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

        if (obj instanceof ListUserImportJobsResult == false)
            return false;
        ListUserImportJobsResult other = (ListUserImportJobsResult) obj;
        if (other.getUserImportJobs() == null ^ this.getUserImportJobs() == null)
            return false;
        if (other.getUserImportJobs() != null && other.getUserImportJobs().equals(this.getUserImportJobs()) == false)
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

        hashCode = prime * hashCode + ((getUserImportJobs() == null) ? 0 : getUserImportJobs().hashCode());
        hashCode = prime * hashCode + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        return hashCode;
    }

    @Override
    public ListUserImportJobsResult clone() {
        try {
            return (ListUserImportJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
