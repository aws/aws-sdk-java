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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListProfiles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProfilesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional string added to the beginning of each profile name returned in the results.
     * </p>
     */
    private String profileNamePrefix;
    /**
     * <p>
     * Profile owner type.
     * </p>
     */
    private String profileOwnerType;

    private String nextToken;

    private Integer maxResults;

    /**
     * <p>
     * An optional string added to the beginning of each profile name returned in the results.
     * </p>
     * 
     * @param profileNamePrefix
     *        An optional string added to the beginning of each profile name returned in the results.
     */

    public void setProfileNamePrefix(String profileNamePrefix) {
        this.profileNamePrefix = profileNamePrefix;
    }

    /**
     * <p>
     * An optional string added to the beginning of each profile name returned in the results.
     * </p>
     * 
     * @return An optional string added to the beginning of each profile name returned in the results.
     */

    public String getProfileNamePrefix() {
        return this.profileNamePrefix;
    }

    /**
     * <p>
     * An optional string added to the beginning of each profile name returned in the results.
     * </p>
     * 
     * @param profileNamePrefix
     *        An optional string added to the beginning of each profile name returned in the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilesRequest withProfileNamePrefix(String profileNamePrefix) {
        setProfileNamePrefix(profileNamePrefix);
        return this;
    }

    /**
     * <p>
     * Profile owner type.
     * </p>
     * 
     * @param profileOwnerType
     *        Profile owner type.
     * @see ProfileOwnerType
     */

    public void setProfileOwnerType(String profileOwnerType) {
        this.profileOwnerType = profileOwnerType;
    }

    /**
     * <p>
     * Profile owner type.
     * </p>
     * 
     * @return Profile owner type.
     * @see ProfileOwnerType
     */

    public String getProfileOwnerType() {
        return this.profileOwnerType;
    }

    /**
     * <p>
     * Profile owner type.
     * </p>
     * 
     * @param profileOwnerType
     *        Profile owner type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProfileOwnerType
     */

    public ListProfilesRequest withProfileOwnerType(String profileOwnerType) {
        setProfileOwnerType(profileOwnerType);
        return this;
    }

    /**
     * <p>
     * Profile owner type.
     * </p>
     * 
     * @param profileOwnerType
     *        Profile owner type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProfileOwnerType
     */

    public ListProfilesRequest withProfileOwnerType(ProfileOwnerType profileOwnerType) {
        this.profileOwnerType = profileOwnerType.toString();
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

    public ListProfilesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @param maxResults
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * @return
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @param maxResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilesRequest withMaxResults(Integer maxResults) {
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
        if (getProfileNamePrefix() != null)
            sb.append("ProfileNamePrefix: ").append(getProfileNamePrefix()).append(",");
        if (getProfileOwnerType() != null)
            sb.append("ProfileOwnerType: ").append(getProfileOwnerType()).append(",");
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

        if (obj instanceof ListProfilesRequest == false)
            return false;
        ListProfilesRequest other = (ListProfilesRequest) obj;
        if (other.getProfileNamePrefix() == null ^ this.getProfileNamePrefix() == null)
            return false;
        if (other.getProfileNamePrefix() != null && other.getProfileNamePrefix().equals(this.getProfileNamePrefix()) == false)
            return false;
        if (other.getProfileOwnerType() == null ^ this.getProfileOwnerType() == null)
            return false;
        if (other.getProfileOwnerType() != null && other.getProfileOwnerType().equals(this.getProfileOwnerType()) == false)
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

        hashCode = prime * hashCode + ((getProfileNamePrefix() == null) ? 0 : getProfileNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getProfileOwnerType() == null) ? 0 : getProfileOwnerType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListProfilesRequest clone() {
        return (ListProfilesRequest) super.clone();
    }

}
