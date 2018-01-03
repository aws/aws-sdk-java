/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Container for the parameters to the CreateBGPPeer operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateBGPPeer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBGPPeerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the virtual interface on which the BGP peer will be provisioned.
     * </p>
     * <p>
     * Example: dxvif-456abc78
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String virtualInterfaceId;
    /**
     * <p>
     * Detailed information for the BGP peer to be created.
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private NewBGPPeer newBGPPeer;

    /**
     * <p>
     * The ID of the virtual interface on which the BGP peer will be provisioned.
     * </p>
     * <p>
     * Example: dxvif-456abc78
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param virtualInterfaceId
     *        The ID of the virtual interface on which the BGP peer will be provisioned.</p>
     *        <p>
     *        Example: dxvif-456abc78
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface on which the BGP peer will be provisioned.
     * </p>
     * <p>
     * Example: dxvif-456abc78
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The ID of the virtual interface on which the BGP peer will be provisioned.</p>
     *         <p>
     *         Example: dxvif-456abc78
     *         </p>
     *         <p>
     *         Default: None
     */

    public String getVirtualInterfaceId() {
        return this.virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface on which the BGP peer will be provisioned.
     * </p>
     * <p>
     * Example: dxvif-456abc78
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param virtualInterfaceId
     *        The ID of the virtual interface on which the BGP peer will be provisioned.</p>
     *        <p>
     *        Example: dxvif-456abc78
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBGPPeerRequest withVirtualInterfaceId(String virtualInterfaceId) {
        setVirtualInterfaceId(virtualInterfaceId);
        return this;
    }

    /**
     * <p>
     * Detailed information for the BGP peer to be created.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param newBGPPeer
     *        Detailed information for the BGP peer to be created.</p>
     *        <p>
     *        Default: None
     */

    public void setNewBGPPeer(NewBGPPeer newBGPPeer) {
        this.newBGPPeer = newBGPPeer;
    }

    /**
     * <p>
     * Detailed information for the BGP peer to be created.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return Detailed information for the BGP peer to be created.</p>
     *         <p>
     *         Default: None
     */

    public NewBGPPeer getNewBGPPeer() {
        return this.newBGPPeer;
    }

    /**
     * <p>
     * Detailed information for the BGP peer to be created.
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param newBGPPeer
     *        Detailed information for the BGP peer to be created.</p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBGPPeerRequest withNewBGPPeer(NewBGPPeer newBGPPeer) {
        setNewBGPPeer(newBGPPeer);
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
        if (getVirtualInterfaceId() != null)
            sb.append("VirtualInterfaceId: ").append(getVirtualInterfaceId()).append(",");
        if (getNewBGPPeer() != null)
            sb.append("NewBGPPeer: ").append(getNewBGPPeer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBGPPeerRequest == false)
            return false;
        CreateBGPPeerRequest other = (CreateBGPPeerRequest) obj;
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getNewBGPPeer() == null ^ this.getNewBGPPeer() == null)
            return false;
        if (other.getNewBGPPeer() != null && other.getNewBGPPeer().equals(this.getNewBGPPeer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getNewBGPPeer() == null) ? 0 : getNewBGPPeer().hashCode());
        return hashCode;
    }

    @Override
    public CreateBGPPeerRequest clone() {
        return (CreateBGPPeerRequest) super.clone();
    }

}
