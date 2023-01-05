/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ListProfiles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProfilesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous operation did not show all results.
     * To get the next results, call the operation again with this value.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of profiles.
     * </p>
     */
    private java.util.List<ProfileDetail> profiles;

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous operation did not show all results.
     * To get the next results, call the operation again with this value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where the output should continue from, if a previous operation did not show all
     *        results. To get the next results, call the operation again with this value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous operation did not show all results.
     * To get the next results, call the operation again with this value.
     * </p>
     * 
     * @return A token that indicates where the output should continue from, if a previous operation did not show all
     *         results. To get the next results, call the operation again with this value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous operation did not show all results.
     * To get the next results, call the operation again with this value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where the output should continue from, if a previous operation did not show all
     *        results. To get the next results, call the operation again with this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of profiles.
     * </p>
     * 
     * @return A list of profiles.
     */

    public java.util.List<ProfileDetail> getProfiles() {
        return profiles;
    }

    /**
     * <p>
     * A list of profiles.
     * </p>
     * 
     * @param profiles
     *        A list of profiles.
     */

    public void setProfiles(java.util.Collection<ProfileDetail> profiles) {
        if (profiles == null) {
            this.profiles = null;
            return;
        }

        this.profiles = new java.util.ArrayList<ProfileDetail>(profiles);
    }

    /**
     * <p>
     * A list of profiles.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProfiles(java.util.Collection)} or {@link #withProfiles(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param profiles
     *        A list of profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilesResult withProfiles(ProfileDetail... profiles) {
        if (this.profiles == null) {
            setProfiles(new java.util.ArrayList<ProfileDetail>(profiles.length));
        }
        for (ProfileDetail ele : profiles) {
            this.profiles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of profiles.
     * </p>
     * 
     * @param profiles
     *        A list of profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilesResult withProfiles(java.util.Collection<ProfileDetail> profiles) {
        setProfiles(profiles);
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
        if (getProfiles() != null)
            sb.append("Profiles: ").append(getProfiles());
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
        if (other.getProfiles() == null ^ this.getProfiles() == null)
            return false;
        if (other.getProfiles() != null && other.getProfiles().equals(this.getProfiles()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProfiles() == null) ? 0 : getProfiles().hashCode());
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
