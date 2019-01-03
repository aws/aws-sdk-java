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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of CreateNetworkInterface.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNetworkInterfaceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the network interface.
     * </p>
     */
    private NetworkInterface networkInterface;

    /**
     * <p>
     * Information about the network interface.
     * </p>
     * 
     * @param networkInterface
     *        Information about the network interface.
     */

    public void setNetworkInterface(NetworkInterface networkInterface) {
        this.networkInterface = networkInterface;
    }

    /**
     * <p>
     * Information about the network interface.
     * </p>
     * 
     * @return Information about the network interface.
     */

    public NetworkInterface getNetworkInterface() {
        return this.networkInterface;
    }

    /**
     * <p>
     * Information about the network interface.
     * </p>
     * 
     * @param networkInterface
     *        Information about the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInterfaceResult withNetworkInterface(NetworkInterface networkInterface) {
        setNetworkInterface(networkInterface);
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
        if (getNetworkInterface() != null)
            sb.append("NetworkInterface: ").append(getNetworkInterface());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNetworkInterfaceResult == false)
            return false;
        CreateNetworkInterfaceResult other = (CreateNetworkInterfaceResult) obj;
        if (other.getNetworkInterface() == null ^ this.getNetworkInterface() == null)
            return false;
        if (other.getNetworkInterface() != null && other.getNetworkInterface().equals(this.getNetworkInterface()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInterface() == null) ? 0 : getNetworkInterface().hashCode());
        return hashCode;
    }

    @Override
    public CreateNetworkInterfaceResult clone() {
        try {
            return (CreateNetworkInterfaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
