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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchProfiles" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchProfilesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The profiles that meet the specified set of filter criteria, in sort order.
     * </p>
     */
    private java.util.List<ProfileData> profiles;
    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The total number of room profiles returned.
     * </p>
     */
    private Integer totalCount;

    /**
     * <p>
     * The profiles that meet the specified set of filter criteria, in sort order.
     * </p>
     * 
     * @return The profiles that meet the specified set of filter criteria, in sort order.
     */

    public java.util.List<ProfileData> getProfiles() {
        return profiles;
    }

    /**
     * <p>
     * The profiles that meet the specified set of filter criteria, in sort order.
     * </p>
     * 
     * @param profiles
     *        The profiles that meet the specified set of filter criteria, in sort order.
     */

    public void setProfiles(java.util.Collection<ProfileData> profiles) {
        if (profiles == null) {
            this.profiles = null;
            return;
        }

        this.profiles = new java.util.ArrayList<ProfileData>(profiles);
    }

    /**
     * <p>
     * The profiles that meet the specified set of filter criteria, in sort order.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProfiles(java.util.Collection)} or {@link #withProfiles(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param profiles
     *        The profiles that meet the specified set of filter criteria, in sort order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProfilesResult withProfiles(ProfileData... profiles) {
        if (this.profiles == null) {
            setProfiles(new java.util.ArrayList<ProfileData>(profiles.length));
        }
        for (ProfileData ele : profiles) {
            this.profiles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The profiles that meet the specified set of filter criteria, in sort order.
     * </p>
     * 
     * @param profiles
     *        The profiles that meet the specified set of filter criteria, in sort order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProfilesResult withProfiles(java.util.Collection<ProfileData> profiles) {
        setProfiles(profiles);
        return this;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * 
     * @param nextToken
     *        The token returned to indicate that there is more data available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * 
     * @return The token returned to indicate that there is more data available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * 
     * @param nextToken
     *        The token returned to indicate that there is more data available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProfilesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The total number of room profiles returned.
     * </p>
     * 
     * @param totalCount
     *        The total number of room profiles returned.
     */

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of room profiles returned.
     * </p>
     * 
     * @return The total number of room profiles returned.
     */

    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * <p>
     * The total number of room profiles returned.
     * </p>
     * 
     * @param totalCount
     *        The total number of room profiles returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProfilesResult withTotalCount(Integer totalCount) {
        setTotalCount(totalCount);
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
        if (getProfiles() != null)
            sb.append("Profiles: ").append(getProfiles()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTotalCount() != null)
            sb.append("TotalCount: ").append(getTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchProfilesResult == false)
            return false;
        SearchProfilesResult other = (SearchProfilesResult) obj;
        if (other.getProfiles() == null ^ this.getProfiles() == null)
            return false;
        if (other.getProfiles() != null && other.getProfiles().equals(this.getProfiles()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfiles() == null) ? 0 : getProfiles().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public SearchProfilesResult clone() {
        try {
            return (SearchProfilesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
