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
package com.amazonaws.services.route53profiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ListProfiles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProfilesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If more than <code>MaxResults</code> resource associations match the specified criteria, you can submit another
     * <code>ListProfiles</code> request to get the next group of results. In the next request, specify the value of
     * <code>NextToken</code> from the previous response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Summary information about the Profiles.
     * </p>
     */
    private java.util.List<ProfileSummary> profileSummaries;

    /**
     * <p>
     * If more than <code>MaxResults</code> resource associations match the specified criteria, you can submit another
     * <code>ListProfiles</code> request to get the next group of results. In the next request, specify the value of
     * <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        If more than <code>MaxResults</code> resource associations match the specified criteria, you can submit
     *        another <code>ListProfiles</code> request to get the next group of results. In the next request, specify
     *        the value of <code>NextToken</code> from the previous response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> resource associations match the specified criteria, you can submit another
     * <code>ListProfiles</code> request to get the next group of results. In the next request, specify the value of
     * <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @return If more than <code>MaxResults</code> resource associations match the specified criteria, you can submit
     *         another <code>ListProfiles</code> request to get the next group of results. In the next request, specify
     *         the value of <code>NextToken</code> from the previous response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> resource associations match the specified criteria, you can submit another
     * <code>ListProfiles</code> request to get the next group of results. In the next request, specify the value of
     * <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        If more than <code>MaxResults</code> resource associations match the specified criteria, you can submit
     *        another <code>ListProfiles</code> request to get the next group of results. In the next request, specify
     *        the value of <code>NextToken</code> from the previous response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Summary information about the Profiles.
     * </p>
     * 
     * @return Summary information about the Profiles.
     */

    public java.util.List<ProfileSummary> getProfileSummaries() {
        return profileSummaries;
    }

    /**
     * <p>
     * Summary information about the Profiles.
     * </p>
     * 
     * @param profileSummaries
     *        Summary information about the Profiles.
     */

    public void setProfileSummaries(java.util.Collection<ProfileSummary> profileSummaries) {
        if (profileSummaries == null) {
            this.profileSummaries = null;
            return;
        }

        this.profileSummaries = new java.util.ArrayList<ProfileSummary>(profileSummaries);
    }

    /**
     * <p>
     * Summary information about the Profiles.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProfileSummaries(java.util.Collection)} or {@link #withProfileSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param profileSummaries
     *        Summary information about the Profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilesResult withProfileSummaries(ProfileSummary... profileSummaries) {
        if (this.profileSummaries == null) {
            setProfileSummaries(new java.util.ArrayList<ProfileSummary>(profileSummaries.length));
        }
        for (ProfileSummary ele : profileSummaries) {
            this.profileSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about the Profiles.
     * </p>
     * 
     * @param profileSummaries
     *        Summary information about the Profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilesResult withProfileSummaries(java.util.Collection<ProfileSummary> profileSummaries) {
        setProfileSummaries(profileSummaries);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getProfileSummaries() != null)
            sb.append("ProfileSummaries: ").append(getProfileSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProfilesResult == false)
            return false;
        ListProfilesResult other = (ListProfilesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProfileSummaries() == null ^ this.getProfileSummaries() == null)
            return false;
        if (other.getProfileSummaries() != null && other.getProfileSummaries().equals(this.getProfileSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProfileSummaries() == null) ? 0 : getProfileSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListProfilesResult clone() {
        try {
            return (ListProfilesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
