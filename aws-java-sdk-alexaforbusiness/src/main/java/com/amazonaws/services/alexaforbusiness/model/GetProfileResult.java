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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details of the room profile requested. Required.
     * </p>
     */
    private Profile profile;

    /**
     * <p>
     * The details of the room profile requested. Required.
     * </p>
     * 
     * @param profile
     *        The details of the room profile requested. Required.
     */

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    /**
     * <p>
     * The details of the room profile requested. Required.
     * </p>
     * 
     * @return The details of the room profile requested. Required.
     */

    public Profile getProfile() {
        return this.profile;
    }

    /**
     * <p>
     * The details of the room profile requested. Required.
     * </p>
     * 
     * @param profile
     *        The details of the room profile requested. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileResult withProfile(Profile profile) {
        setProfile(profile);
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
        if (getProfile() != null)
            sb.append("Profile: ").append(getProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProfileResult == false)
            return false;
        GetProfileResult other = (GetProfileResult) obj;
        if (other.getProfile() == null ^ this.getProfile() == null)
            return false;
        if (other.getProfile() != null && other.getProfile().equals(this.getProfile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfile() == null) ? 0 : getProfile().hashCode());
        return hashCode;
    }

    @Override
    public GetProfileResult clone() {
        try {
            return (GetProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
