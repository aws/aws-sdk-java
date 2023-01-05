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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/DisableProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the profile.
     * </p>
     */
    private String profileId;

    /**
     * <p>
     * The unique identifier of the profile.
     * </p>
     * 
     * @param profileId
     *        The unique identifier of the profile.
     */

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * The unique identifier of the profile.
     * </p>
     * 
     * @return The unique identifier of the profile.
     */

    public String getProfileId() {
        return this.profileId;
    }

    /**
     * <p>
     * The unique identifier of the profile.
     * </p>
     * 
     * @param profileId
     *        The unique identifier of the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableProfileRequest withProfileId(String profileId) {
        setProfileId(profileId);
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
        if (getProfileId() != null)
            sb.append("ProfileId: ").append(getProfileId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableProfileRequest == false)
            return false;
        DisableProfileRequest other = (DisableProfileRequest) obj;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null && other.getProfileId().equals(this.getProfileId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        return hashCode;
    }

    @Override
    public DisableProfileRequest clone() {
        return (DisableProfileRequest) super.clone();
    }

}
