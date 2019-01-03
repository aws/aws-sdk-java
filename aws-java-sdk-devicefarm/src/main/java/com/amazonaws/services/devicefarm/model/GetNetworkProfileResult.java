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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetNetworkProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetNetworkProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The network profile.
     * </p>
     */
    private NetworkProfile networkProfile;

    /**
     * <p>
     * The network profile.
     * </p>
     * 
     * @param networkProfile
     *        The network profile.
     */

    public void setNetworkProfile(NetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
    }

    /**
     * <p>
     * The network profile.
     * </p>
     * 
     * @return The network profile.
     */

    public NetworkProfile getNetworkProfile() {
        return this.networkProfile;
    }

    /**
     * <p>
     * The network profile.
     * </p>
     * 
     * @param networkProfile
     *        The network profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkProfileResult withNetworkProfile(NetworkProfile networkProfile) {
        setNetworkProfile(networkProfile);
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
        if (getNetworkProfile() != null)
            sb.append("NetworkProfile: ").append(getNetworkProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetNetworkProfileResult == false)
            return false;
        GetNetworkProfileResult other = (GetNetworkProfileResult) obj;
        if (other.getNetworkProfile() == null ^ this.getNetworkProfile() == null)
            return false;
        if (other.getNetworkProfile() != null && other.getNetworkProfile().equals(this.getNetworkProfile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkProfile() == null) ? 0 : getNetworkProfile().hashCode());
        return hashCode;
    }

    @Override
    public GetNetworkProfileResult clone() {
        try {
            return (GetNetworkProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
