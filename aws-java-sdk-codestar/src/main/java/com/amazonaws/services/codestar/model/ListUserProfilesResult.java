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
package com.amazonaws.services.codestar.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ListUserProfiles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUserProfilesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * All the user profiles configured in AWS CodeStar for an AWS account.
     * </p>
     */
    private java.util.List<UserProfileSummary> userProfiles;
    /**
     * <p>
     * The continuation token to use when requesting the next set of results, if there are more results to be returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * All the user profiles configured in AWS CodeStar for an AWS account.
     * </p>
     * 
     * @return All the user profiles configured in AWS CodeStar for an AWS account.
     */

    public java.util.List<UserProfileSummary> getUserProfiles() {
        return userProfiles;
    }

    /**
     * <p>
     * All the user profiles configured in AWS CodeStar for an AWS account.
     * </p>
     * 
     * @param userProfiles
     *        All the user profiles configured in AWS CodeStar for an AWS account.
     */

    public void setUserProfiles(java.util.Collection<UserProfileSummary> userProfiles) {
        if (userProfiles == null) {
            this.userProfiles = null;
            return;
        }

        this.userProfiles = new java.util.ArrayList<UserProfileSummary>(userProfiles);
    }

    /**
     * <p>
     * All the user profiles configured in AWS CodeStar for an AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserProfiles(java.util.Collection)} or {@link #withUserProfiles(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param userProfiles
     *        All the user profiles configured in AWS CodeStar for an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserProfilesResult withUserProfiles(UserProfileSummary... userProfiles) {
        if (this.userProfiles == null) {
            setUserProfiles(new java.util.ArrayList<UserProfileSummary>(userProfiles.length));
        }
        for (UserProfileSummary ele : userProfiles) {
            this.userProfiles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * All the user profiles configured in AWS CodeStar for an AWS account.
     * </p>
     * 
     * @param userProfiles
     *        All the user profiles configured in AWS CodeStar for an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserProfilesResult withUserProfiles(java.util.Collection<UserProfileSummary> userProfiles) {
        setUserProfiles(userProfiles);
        return this;
    }

    /**
     * <p>
     * The continuation token to use when requesting the next set of results, if there are more results to be returned.
     * </p>
     * 
     * @param nextToken
     *        The continuation token to use when requesting the next set of results, if there are more results to be
     *        returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The continuation token to use when requesting the next set of results, if there are more results to be returned.
     * </p>
     * 
     * @return The continuation token to use when requesting the next set of results, if there are more results to be
     *         returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The continuation token to use when requesting the next set of results, if there are more results to be returned.
     * </p>
     * 
     * @param nextToken
     *        The continuation token to use when requesting the next set of results, if there are more results to be
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserProfilesResult withNextToken(String nextToken) {
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
        if (getUserProfiles() != null)
            sb.append("UserProfiles: ").append(getUserProfiles()).append(",");
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

        if (obj instanceof ListUserProfilesResult == false)
            return false;
        ListUserProfilesResult other = (ListUserProfilesResult) obj;
        if (other.getUserProfiles() == null ^ this.getUserProfiles() == null)
            return false;
        if (other.getUserProfiles() != null && other.getUserProfiles().equals(this.getUserProfiles()) == false)
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

        hashCode = prime * hashCode + ((getUserProfiles() == null) ? 0 : getUserProfiles().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListUserProfilesResult clone() {
        try {
            return (ListUserProfilesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
