/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetLaunchProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLaunchProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The launch profile.
     * </p>
     */
    private LaunchProfile launchProfile;

    /**
     * <p>
     * The launch profile.
     * </p>
     * 
     * @param launchProfile
     *        The launch profile.
     */

    public void setLaunchProfile(LaunchProfile launchProfile) {
        this.launchProfile = launchProfile;
    }

    /**
     * <p>
     * The launch profile.
     * </p>
     * 
     * @return The launch profile.
     */

    public LaunchProfile getLaunchProfile() {
        return this.launchProfile;
    }

    /**
     * <p>
     * The launch profile.
     * </p>
     * 
     * @param launchProfile
     *        The launch profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLaunchProfileResult withLaunchProfile(LaunchProfile launchProfile) {
        setLaunchProfile(launchProfile);
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
        if (getLaunchProfile() != null)
            sb.append("LaunchProfile: ").append(getLaunchProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLaunchProfileResult == false)
            return false;
        GetLaunchProfileResult other = (GetLaunchProfileResult) obj;
        if (other.getLaunchProfile() == null ^ this.getLaunchProfile() == null)
            return false;
        if (other.getLaunchProfile() != null && other.getLaunchProfile().equals(this.getLaunchProfile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchProfile() == null) ? 0 : getLaunchProfile().hashCode());
        return hashCode;
    }

    @Override
    public GetLaunchProfileResult clone() {
        try {
            return (GetLaunchProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
