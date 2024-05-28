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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about compute hardware assets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ComputeAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputeAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The host ID of the Dedicated Host on the asset.
     * </p>
     */
    private String hostId;
    /**
     * <p>
     * The state.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACTIVE - The asset is available and can provide capacity for new compute resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * ISOLATED - The asset is undergoing maintenance and can't provide capacity for new compute resources. Existing
     * compute resources on the asset are not affected.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETIRING - The underlying hardware for the asset is degraded. Capacity for new compute resources is reduced.
     * Amazon Web Services sends notifications for resources that must be stopped before the asset can be replaced.
     * </p>
     * </li>
     * </ul>
     */
    private String state;
    /**
     * <p>
     * A list of the names of instance families that are currently associated with a given asset.
     * </p>
     */
    private java.util.List<String> instanceFamilies;

    /**
     * <p>
     * The host ID of the Dedicated Host on the asset.
     * </p>
     * 
     * @param hostId
     *        The host ID of the Dedicated Host on the asset.
     */

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    /**
     * <p>
     * The host ID of the Dedicated Host on the asset.
     * </p>
     * 
     * @return The host ID of the Dedicated Host on the asset.
     */

    public String getHostId() {
        return this.hostId;
    }

    /**
     * <p>
     * The host ID of the Dedicated Host on the asset.
     * </p>
     * 
     * @param hostId
     *        The host ID of the Dedicated Host on the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeAttributes withHostId(String hostId) {
        setHostId(hostId);
        return this;
    }

    /**
     * <p>
     * The state.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACTIVE - The asset is available and can provide capacity for new compute resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * ISOLATED - The asset is undergoing maintenance and can't provide capacity for new compute resources. Existing
     * compute resources on the asset are not affected.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETIRING - The underlying hardware for the asset is degraded. Capacity for new compute resources is reduced.
     * Amazon Web Services sends notifications for resources that must be stopped before the asset can be replaced.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ACTIVE - The asset is available and can provide capacity for new compute resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ISOLATED - The asset is undergoing maintenance and can't provide capacity for new compute resources.
     *        Existing compute resources on the asset are not affected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RETIRING - The underlying hardware for the asset is degraded. Capacity for new compute resources is
     *        reduced. Amazon Web Services sends notifications for resources that must be stopped before the asset can
     *        be replaced.
     *        </p>
     *        </li>
     * @see ComputeAssetState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACTIVE - The asset is available and can provide capacity for new compute resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * ISOLATED - The asset is undergoing maintenance and can't provide capacity for new compute resources. Existing
     * compute resources on the asset are not affected.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETIRING - The underlying hardware for the asset is degraded. Capacity for new compute resources is reduced.
     * Amazon Web Services sends notifications for resources that must be stopped before the asset can be replaced.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACTIVE - The asset is available and can provide capacity for new compute resources.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ISOLATED - The asset is undergoing maintenance and can't provide capacity for new compute resources.
     *         Existing compute resources on the asset are not affected.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RETIRING - The underlying hardware for the asset is degraded. Capacity for new compute resources is
     *         reduced. Amazon Web Services sends notifications for resources that must be stopped before the asset can
     *         be replaced.
     *         </p>
     *         </li>
     * @see ComputeAssetState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACTIVE - The asset is available and can provide capacity for new compute resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * ISOLATED - The asset is undergoing maintenance and can't provide capacity for new compute resources. Existing
     * compute resources on the asset are not affected.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETIRING - The underlying hardware for the asset is degraded. Capacity for new compute resources is reduced.
     * Amazon Web Services sends notifications for resources that must be stopped before the asset can be replaced.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ACTIVE - The asset is available and can provide capacity for new compute resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ISOLATED - The asset is undergoing maintenance and can't provide capacity for new compute resources.
     *        Existing compute resources on the asset are not affected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RETIRING - The underlying hardware for the asset is degraded. Capacity for new compute resources is
     *        reduced. Amazon Web Services sends notifications for resources that must be stopped before the asset can
     *        be replaced.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeAssetState
     */

    public ComputeAttributes withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACTIVE - The asset is available and can provide capacity for new compute resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * ISOLATED - The asset is undergoing maintenance and can't provide capacity for new compute resources. Existing
     * compute resources on the asset are not affected.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETIRING - The underlying hardware for the asset is degraded. Capacity for new compute resources is reduced.
     * Amazon Web Services sends notifications for resources that must be stopped before the asset can be replaced.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ACTIVE - The asset is available and can provide capacity for new compute resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ISOLATED - The asset is undergoing maintenance and can't provide capacity for new compute resources.
     *        Existing compute resources on the asset are not affected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RETIRING - The underlying hardware for the asset is degraded. Capacity for new compute resources is
     *        reduced. Amazon Web Services sends notifications for resources that must be stopped before the asset can
     *        be replaced.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeAssetState
     */

    public ComputeAttributes withState(ComputeAssetState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A list of the names of instance families that are currently associated with a given asset.
     * </p>
     * 
     * @return A list of the names of instance families that are currently associated with a given asset.
     */

    public java.util.List<String> getInstanceFamilies() {
        return instanceFamilies;
    }

    /**
     * <p>
     * A list of the names of instance families that are currently associated with a given asset.
     * </p>
     * 
     * @param instanceFamilies
     *        A list of the names of instance families that are currently associated with a given asset.
     */

    public void setInstanceFamilies(java.util.Collection<String> instanceFamilies) {
        if (instanceFamilies == null) {
            this.instanceFamilies = null;
            return;
        }

        this.instanceFamilies = new java.util.ArrayList<String>(instanceFamilies);
    }

    /**
     * <p>
     * A list of the names of instance families that are currently associated with a given asset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceFamilies(java.util.Collection)} or {@link #withInstanceFamilies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param instanceFamilies
     *        A list of the names of instance families that are currently associated with a given asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeAttributes withInstanceFamilies(String... instanceFamilies) {
        if (this.instanceFamilies == null) {
            setInstanceFamilies(new java.util.ArrayList<String>(instanceFamilies.length));
        }
        for (String ele : instanceFamilies) {
            this.instanceFamilies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the names of instance families that are currently associated with a given asset.
     * </p>
     * 
     * @param instanceFamilies
     *        A list of the names of instance families that are currently associated with a given asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeAttributes withInstanceFamilies(java.util.Collection<String> instanceFamilies) {
        setInstanceFamilies(instanceFamilies);
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
        if (getHostId() != null)
            sb.append("HostId: ").append(getHostId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getInstanceFamilies() != null)
            sb.append("InstanceFamilies: ").append(getInstanceFamilies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComputeAttributes == false)
            return false;
        ComputeAttributes other = (ComputeAttributes) obj;
        if (other.getHostId() == null ^ this.getHostId() == null)
            return false;
        if (other.getHostId() != null && other.getHostId().equals(this.getHostId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getInstanceFamilies() == null ^ this.getInstanceFamilies() == null)
            return false;
        if (other.getInstanceFamilies() != null && other.getInstanceFamilies().equals(this.getInstanceFamilies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostId() == null) ? 0 : getHostId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getInstanceFamilies() == null) ? 0 : getInstanceFamilies().hashCode());
        return hashCode;
    }

    @Override
    public ComputeAttributes clone() {
        try {
            return (ComputeAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.outposts.model.transform.ComputeAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
