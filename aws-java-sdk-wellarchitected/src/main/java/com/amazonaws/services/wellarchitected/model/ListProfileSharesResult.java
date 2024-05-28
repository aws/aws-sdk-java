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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListProfileShares" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProfileSharesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Profile share summaries.
     * </p>
     */
    private java.util.List<ProfileShareSummary> profileShareSummaries;

    private String nextToken;

    /**
     * <p>
     * Profile share summaries.
     * </p>
     * 
     * @return Profile share summaries.
     */

    public java.util.List<ProfileShareSummary> getProfileShareSummaries() {
        return profileShareSummaries;
    }

    /**
     * <p>
     * Profile share summaries.
     * </p>
     * 
     * @param profileShareSummaries
     *        Profile share summaries.
     */

    public void setProfileShareSummaries(java.util.Collection<ProfileShareSummary> profileShareSummaries) {
        if (profileShareSummaries == null) {
            this.profileShareSummaries = null;
            return;
        }

        this.profileShareSummaries = new java.util.ArrayList<ProfileShareSummary>(profileShareSummaries);
    }

    /**
     * <p>
     * Profile share summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProfileShareSummaries(java.util.Collection)} or
     * {@link #withProfileShareSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param profileShareSummaries
     *        Profile share summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileSharesResult withProfileShareSummaries(ProfileShareSummary... profileShareSummaries) {
        if (this.profileShareSummaries == null) {
            setProfileShareSummaries(new java.util.ArrayList<ProfileShareSummary>(profileShareSummaries.length));
        }
        for (ProfileShareSummary ele : profileShareSummaries) {
            this.profileShareSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Profile share summaries.
     * </p>
     * 
     * @param profileShareSummaries
     *        Profile share summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileSharesResult withProfileShareSummaries(java.util.Collection<ProfileShareSummary> profileShareSummaries) {
        setProfileShareSummaries(profileShareSummaries);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileSharesResult withNextToken(String nextToken) {
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
        if (getProfileShareSummaries() != null)
            sb.append("ProfileShareSummaries: ").append(getProfileShareSummaries()).append(",");
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

        if (obj instanceof ListProfileSharesResult == false)
            return false;
        ListProfileSharesResult other = (ListProfileSharesResult) obj;
        if (other.getProfileShareSummaries() == null ^ this.getProfileShareSummaries() == null)
            return false;
        if (other.getProfileShareSummaries() != null && other.getProfileShareSummaries().equals(this.getProfileShareSummaries()) == false)
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

        hashCode = prime * hashCode + ((getProfileShareSummaries() == null) ? 0 : getProfileShareSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListProfileSharesResult clone() {
        try {
            return (ListProfileSharesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
