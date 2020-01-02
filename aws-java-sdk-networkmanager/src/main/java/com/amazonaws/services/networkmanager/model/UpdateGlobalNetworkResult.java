/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateGlobalNetwork" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGlobalNetworkResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the global network object.
     * </p>
     */
    private GlobalNetwork globalNetwork;

    /**
     * <p>
     * Information about the global network object.
     * </p>
     * 
     * @param globalNetwork
     *        Information about the global network object.
     */

    public void setGlobalNetwork(GlobalNetwork globalNetwork) {
        this.globalNetwork = globalNetwork;
    }

    /**
     * <p>
     * Information about the global network object.
     * </p>
     * 
     * @return Information about the global network object.
     */

    public GlobalNetwork getGlobalNetwork() {
        return this.globalNetwork;
    }

    /**
     * <p>
     * Information about the global network object.
     * </p>
     * 
     * @param globalNetwork
     *        Information about the global network object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlobalNetworkResult withGlobalNetwork(GlobalNetwork globalNetwork) {
        setGlobalNetwork(globalNetwork);
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
        if (getGlobalNetwork() != null)
            sb.append("GlobalNetwork: ").append(getGlobalNetwork());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGlobalNetworkResult == false)
            return false;
        UpdateGlobalNetworkResult other = (UpdateGlobalNetworkResult) obj;
        if (other.getGlobalNetwork() == null ^ this.getGlobalNetwork() == null)
            return false;
        if (other.getGlobalNetwork() != null && other.getGlobalNetwork().equals(this.getGlobalNetwork()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalNetwork() == null) ? 0 : getGlobalNetwork().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGlobalNetworkResult clone() {
        try {
            return (UpdateGlobalNetworkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
