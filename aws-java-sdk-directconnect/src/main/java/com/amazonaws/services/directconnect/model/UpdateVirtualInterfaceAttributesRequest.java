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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateVirtualInterfaceAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVirtualInterfaceAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the virtual private interface.
     * </p>
     */
    private String virtualInterfaceId;
    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
     * </p>
     */
    private Integer mtu;

    /**
     * <p>
     * The ID of the virtual private interface.
     * </p>
     * 
     * @param virtualInterfaceId
     *        The ID of the virtual private interface.
     */

    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual private interface.
     * </p>
     * 
     * @return The ID of the virtual private interface.
     */

    public String getVirtualInterfaceId() {
        return this.virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual private interface.
     * </p>
     * 
     * @param virtualInterfaceId
     *        The ID of the virtual private interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesRequest withVirtualInterfaceId(String virtualInterfaceId) {
        setVirtualInterfaceId(virtualInterfaceId);
        return this;
    }

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
     * </p>
     * 
     * @param mtu
     *        The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value
     *        is 1500.
     */

    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
     * </p>
     * 
     * @return The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value
     *         is 1500.
     */

    public Integer getMtu() {
        return this.mtu;
    }

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
     * </p>
     * 
     * @param mtu
     *        The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value
     *        is 1500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVirtualInterfaceAttributesRequest withMtu(Integer mtu) {
        setMtu(mtu);
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
        if (getVirtualInterfaceId() != null)
            sb.append("VirtualInterfaceId: ").append(getVirtualInterfaceId()).append(",");
        if (getMtu() != null)
            sb.append("Mtu: ").append(getMtu());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVirtualInterfaceAttributesRequest == false)
            return false;
        UpdateVirtualInterfaceAttributesRequest other = (UpdateVirtualInterfaceAttributesRequest) obj;
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getMtu() == null ^ this.getMtu() == null)
            return false;
        if (other.getMtu() != null && other.getMtu().equals(this.getMtu()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getMtu() == null) ? 0 : getMtu().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVirtualInterfaceAttributesRequest clone() {
        return (UpdateVirtualInterfaceAttributesRequest) super.clone();
    }

}
