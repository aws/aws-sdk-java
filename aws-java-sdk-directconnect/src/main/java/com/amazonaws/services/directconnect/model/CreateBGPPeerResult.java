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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateBGPPeer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBGPPeerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The virtual interface.
     * </p>
     */
    private VirtualInterface virtualInterface;

    /**
     * <p>
     * The virtual interface.
     * </p>
     * 
     * @param virtualInterface
     *        The virtual interface.
     */

    public void setVirtualInterface(VirtualInterface virtualInterface) {
        this.virtualInterface = virtualInterface;
    }

    /**
     * <p>
     * The virtual interface.
     * </p>
     * 
     * @return The virtual interface.
     */

    public VirtualInterface getVirtualInterface() {
        return this.virtualInterface;
    }

    /**
     * <p>
     * The virtual interface.
     * </p>
     * 
     * @param virtualInterface
     *        The virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBGPPeerResult withVirtualInterface(VirtualInterface virtualInterface) {
        setVirtualInterface(virtualInterface);
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
        if (getVirtualInterface() != null)
            sb.append("VirtualInterface: ").append(getVirtualInterface());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBGPPeerResult == false)
            return false;
        CreateBGPPeerResult other = (CreateBGPPeerResult) obj;
        if (other.getVirtualInterface() == null ^ this.getVirtualInterface() == null)
            return false;
        if (other.getVirtualInterface() != null && other.getVirtualInterface().equals(this.getVirtualInterface()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualInterface() == null) ? 0 : getVirtualInterface().hashCode());
        return hashCode;
    }

    @Override
    public CreateBGPPeerResult clone() {
        try {
            return (CreateBGPPeerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
