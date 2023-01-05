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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateCoreNetwork" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCoreNetworkResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns details about a core network.
     * </p>
     */
    private CoreNetwork coreNetwork;

    /**
     * <p>
     * Returns details about a core network.
     * </p>
     * 
     * @param coreNetwork
     *        Returns details about a core network.
     */

    public void setCoreNetwork(CoreNetwork coreNetwork) {
        this.coreNetwork = coreNetwork;
    }

    /**
     * <p>
     * Returns details about a core network.
     * </p>
     * 
     * @return Returns details about a core network.
     */

    public CoreNetwork getCoreNetwork() {
        return this.coreNetwork;
    }

    /**
     * <p>
     * Returns details about a core network.
     * </p>
     * 
     * @param coreNetwork
     *        Returns details about a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCoreNetworkResult withCoreNetwork(CoreNetwork coreNetwork) {
        setCoreNetwork(coreNetwork);
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
        if (getCoreNetwork() != null)
            sb.append("CoreNetwork: ").append(getCoreNetwork());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCoreNetworkResult == false)
            return false;
        CreateCoreNetworkResult other = (CreateCoreNetworkResult) obj;
        if (other.getCoreNetwork() == null ^ this.getCoreNetwork() == null)
            return false;
        if (other.getCoreNetwork() != null && other.getCoreNetwork().equals(this.getCoreNetwork()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreNetwork() == null) ? 0 : getCoreNetwork().hashCode());
        return hashCode;
    }

    @Override
    public CreateCoreNetworkResult clone() {
        try {
            return (CreateCoreNetworkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
