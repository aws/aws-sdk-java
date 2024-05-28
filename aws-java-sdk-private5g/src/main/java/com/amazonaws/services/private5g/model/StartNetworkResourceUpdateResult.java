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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/StartNetworkResourceUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartNetworkResourceUpdateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The network resource.
     * </p>
     */
    private NetworkResource networkResource;

    /**
     * <p>
     * The network resource.
     * </p>
     * 
     * @param networkResource
     *        The network resource.
     */

    public void setNetworkResource(NetworkResource networkResource) {
        this.networkResource = networkResource;
    }

    /**
     * <p>
     * The network resource.
     * </p>
     * 
     * @return The network resource.
     */

    public NetworkResource getNetworkResource() {
        return this.networkResource;
    }

    /**
     * <p>
     * The network resource.
     * </p>
     * 
     * @param networkResource
     *        The network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartNetworkResourceUpdateResult withNetworkResource(NetworkResource networkResource) {
        setNetworkResource(networkResource);
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
        if (getNetworkResource() != null)
            sb.append("NetworkResource: ").append(getNetworkResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartNetworkResourceUpdateResult == false)
            return false;
        StartNetworkResourceUpdateResult other = (StartNetworkResourceUpdateResult) obj;
        if (other.getNetworkResource() == null ^ this.getNetworkResource() == null)
            return false;
        if (other.getNetworkResource() != null && other.getNetworkResource().equals(this.getNetworkResource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkResource() == null) ? 0 : getNetworkResource().hashCode());
        return hashCode;
    }

    @Override
    public StartNetworkResourceUpdateResult clone() {
        try {
            return (StartNetworkResourceUpdateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
