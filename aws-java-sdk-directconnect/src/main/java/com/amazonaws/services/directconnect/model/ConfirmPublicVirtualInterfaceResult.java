/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The response received when ConfirmPublicVirtualInterface is called.
 * </p>
 */
public class ConfirmPublicVirtualInterfaceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private String virtualInterfaceState;

    /**
     * @param virtualInterfaceState
     * @see VirtualInterfaceState
     */

    public void setVirtualInterfaceState(String virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState;
    }

    /**
     * @return
     * @see VirtualInterfaceState
     */

    public String getVirtualInterfaceState() {
        return this.virtualInterfaceState;
    }

    /**
     * @param virtualInterfaceState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualInterfaceState
     */

    public ConfirmPublicVirtualInterfaceResult withVirtualInterfaceState(String virtualInterfaceState) {
        setVirtualInterfaceState(virtualInterfaceState);
        return this;
    }

    /**
     * @param virtualInterfaceState
     * @see VirtualInterfaceState
     */

    public void setVirtualInterfaceState(VirtualInterfaceState virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState.toString();
    }

    /**
     * @param virtualInterfaceState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualInterfaceState
     */

    public ConfirmPublicVirtualInterfaceResult withVirtualInterfaceState(VirtualInterfaceState virtualInterfaceState) {
        setVirtualInterfaceState(virtualInterfaceState);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVirtualInterfaceState() != null)
            sb.append("VirtualInterfaceState: " + getVirtualInterfaceState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfirmPublicVirtualInterfaceResult == false)
            return false;
        ConfirmPublicVirtualInterfaceResult other = (ConfirmPublicVirtualInterfaceResult) obj;
        if (other.getVirtualInterfaceState() == null ^ this.getVirtualInterfaceState() == null)
            return false;
        if (other.getVirtualInterfaceState() != null && other.getVirtualInterfaceState().equals(this.getVirtualInterfaceState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualInterfaceState() == null) ? 0 : getVirtualInterfaceState().hashCode());
        return hashCode;
    }

    @Override
    public ConfirmPublicVirtualInterfaceResult clone() {
        try {
            return (ConfirmPublicVirtualInterfaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
