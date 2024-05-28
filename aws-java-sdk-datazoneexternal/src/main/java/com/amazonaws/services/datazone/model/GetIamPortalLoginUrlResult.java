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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetIamPortalLoginUrl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIamPortalLoginUrlResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The data portal URL of the specified Amazon DataZone domain.
     * </p>
     */
    private String authCodeUrl;
    /**
     * <p>
     * The ID of the user profile.
     * </p>
     */
    private String userProfileId;

    /**
     * <p>
     * The data portal URL of the specified Amazon DataZone domain.
     * </p>
     * 
     * @param authCodeUrl
     *        The data portal URL of the specified Amazon DataZone domain.
     */

    public void setAuthCodeUrl(String authCodeUrl) {
        this.authCodeUrl = authCodeUrl;
    }

    /**
     * <p>
     * The data portal URL of the specified Amazon DataZone domain.
     * </p>
     * 
     * @return The data portal URL of the specified Amazon DataZone domain.
     */

    public String getAuthCodeUrl() {
        return this.authCodeUrl;
    }

    /**
     * <p>
     * The data portal URL of the specified Amazon DataZone domain.
     * </p>
     * 
     * @param authCodeUrl
     *        The data portal URL of the specified Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIamPortalLoginUrlResult withAuthCodeUrl(String authCodeUrl) {
        setAuthCodeUrl(authCodeUrl);
        return this;
    }

    /**
     * <p>
     * The ID of the user profile.
     * </p>
     * 
     * @param userProfileId
     *        The ID of the user profile.
     */

    public void setUserProfileId(String userProfileId) {
        this.userProfileId = userProfileId;
    }

    /**
     * <p>
     * The ID of the user profile.
     * </p>
     * 
     * @return The ID of the user profile.
     */

    public String getUserProfileId() {
        return this.userProfileId;
    }

    /**
     * <p>
     * The ID of the user profile.
     * </p>
     * 
     * @param userProfileId
     *        The ID of the user profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIamPortalLoginUrlResult withUserProfileId(String userProfileId) {
        setUserProfileId(userProfileId);
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
        if (getAuthCodeUrl() != null)
            sb.append("AuthCodeUrl: ").append(getAuthCodeUrl()).append(",");
        if (getUserProfileId() != null)
            sb.append("UserProfileId: ").append(getUserProfileId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIamPortalLoginUrlResult == false)
            return false;
        GetIamPortalLoginUrlResult other = (GetIamPortalLoginUrlResult) obj;
        if (other.getAuthCodeUrl() == null ^ this.getAuthCodeUrl() == null)
            return false;
        if (other.getAuthCodeUrl() != null && other.getAuthCodeUrl().equals(this.getAuthCodeUrl()) == false)
            return false;
        if (other.getUserProfileId() == null ^ this.getUserProfileId() == null)
            return false;
        if (other.getUserProfileId() != null && other.getUserProfileId().equals(this.getUserProfileId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthCodeUrl() == null) ? 0 : getAuthCodeUrl().hashCode());
        hashCode = prime * hashCode + ((getUserProfileId() == null) ? 0 : getUserProfileId().hashCode());
        return hashCode;
    }

    @Override
    public GetIamPortalLoginUrlResult clone() {
        try {
            return (GetIamPortalLoginUrlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
