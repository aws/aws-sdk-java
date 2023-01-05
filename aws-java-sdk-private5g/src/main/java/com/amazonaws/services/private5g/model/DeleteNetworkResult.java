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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/DeleteNetwork" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteNetworkResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the network.
     * </p>
     */
    private Network network;

    /**
     * <p>
     * Information about the network.
     * </p>
     * 
     * @param network
     *        Information about the network.
     */

    public void setNetwork(Network network) {
        this.network = network;
    }

    /**
     * <p>
     * Information about the network.
     * </p>
     * 
     * @return Information about the network.
     */

    public Network getNetwork() {
        return this.network;
    }

    /**
     * <p>
     * Information about the network.
     * </p>
     * 
     * @param network
     *        Information about the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteNetworkResult withNetwork(Network network) {
        setNetwork(network);
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
        if (getNetwork() != null)
            sb.append("Network: ").append(getNetwork());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteNetworkResult == false)
            return false;
        DeleteNetworkResult other = (DeleteNetworkResult) obj;
        if (other.getNetwork() == null ^ this.getNetwork() == null)
            return false;
        if (other.getNetwork() != null && other.getNetwork().equals(this.getNetwork()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetwork() == null) ? 0 : getNetwork().hashCode());
        return hashCode;
    }

    @Override
    public DeleteNetworkResult clone() {
        try {
            return (DeleteNetworkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
