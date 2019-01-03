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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeVirtualInterfaces"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVirtualInterfacesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The virtual interfaces
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VirtualInterface> virtualInterfaces;

    /**
     * <p>
     * The virtual interfaces
     * </p>
     * 
     * @return The virtual interfaces
     */

    public java.util.List<VirtualInterface> getVirtualInterfaces() {
        if (virtualInterfaces == null) {
            virtualInterfaces = new com.amazonaws.internal.SdkInternalList<VirtualInterface>();
        }
        return virtualInterfaces;
    }

    /**
     * <p>
     * The virtual interfaces
     * </p>
     * 
     * @param virtualInterfaces
     *        The virtual interfaces
     */

    public void setVirtualInterfaces(java.util.Collection<VirtualInterface> virtualInterfaces) {
        if (virtualInterfaces == null) {
            this.virtualInterfaces = null;
            return;
        }

        this.virtualInterfaces = new com.amazonaws.internal.SdkInternalList<VirtualInterface>(virtualInterfaces);
    }

    /**
     * <p>
     * The virtual interfaces
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVirtualInterfaces(java.util.Collection)} or {@link #withVirtualInterfaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param virtualInterfaces
     *        The virtual interfaces
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVirtualInterfacesResult withVirtualInterfaces(VirtualInterface... virtualInterfaces) {
        if (this.virtualInterfaces == null) {
            setVirtualInterfaces(new com.amazonaws.internal.SdkInternalList<VirtualInterface>(virtualInterfaces.length));
        }
        for (VirtualInterface ele : virtualInterfaces) {
            this.virtualInterfaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The virtual interfaces
     * </p>
     * 
     * @param virtualInterfaces
     *        The virtual interfaces
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVirtualInterfacesResult withVirtualInterfaces(java.util.Collection<VirtualInterface> virtualInterfaces) {
        setVirtualInterfaces(virtualInterfaces);
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
        if (getVirtualInterfaces() != null)
            sb.append("VirtualInterfaces: ").append(getVirtualInterfaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVirtualInterfacesResult == false)
            return false;
        DescribeVirtualInterfacesResult other = (DescribeVirtualInterfacesResult) obj;
        if (other.getVirtualInterfaces() == null ^ this.getVirtualInterfaces() == null)
            return false;
        if (other.getVirtualInterfaces() != null && other.getVirtualInterfaces().equals(this.getVirtualInterfaces()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualInterfaces() == null) ? 0 : getVirtualInterfaces().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVirtualInterfacesResult clone() {
        try {
            return (DescribeVirtualInterfacesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
