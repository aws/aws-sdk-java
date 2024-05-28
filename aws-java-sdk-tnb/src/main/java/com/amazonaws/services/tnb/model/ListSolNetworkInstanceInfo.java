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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Info about the specific network instance.
 * </p>
 * <p>
 * A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which
 * life-cycle operations (like terminate, update, and delete) can be performed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolNetworkInstanceInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSolNetworkInstanceInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Network instance ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * ID of the network instance.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The metadata of the network instance.
     * </p>
     */
    private ListSolNetworkInstanceMetadata metadata;
    /**
     * <p>
     * Human-readable description of the network instance.
     * </p>
     */
    private String nsInstanceDescription;
    /**
     * <p>
     * Human-readable name of the network instance.
     * </p>
     */
    private String nsInstanceName;
    /**
     * <p>
     * The state of the network instance.
     * </p>
     */
    private String nsState;
    /**
     * <p>
     * ID of the network service descriptor in the network package.
     * </p>
     */
    private String nsdId;
    /**
     * <p>
     * ID of the network service descriptor in the network package.
     * </p>
     */
    private String nsdInfoId;

    /**
     * <p>
     * Network instance ARN.
     * </p>
     * 
     * @param arn
     *        Network instance ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Network instance ARN.
     * </p>
     * 
     * @return Network instance ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Network instance ARN.
     * </p>
     * 
     * @param arn
     *        Network instance ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkInstanceInfo withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * ID of the network instance.
     * </p>
     * 
     * @param id
     *        ID of the network instance.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * ID of the network instance.
     * </p>
     * 
     * @return ID of the network instance.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * ID of the network instance.
     * </p>
     * 
     * @param id
     *        ID of the network instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkInstanceInfo withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The metadata of the network instance.
     * </p>
     * 
     * @param metadata
     *        The metadata of the network instance.
     */

    public void setMetadata(ListSolNetworkInstanceMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The metadata of the network instance.
     * </p>
     * 
     * @return The metadata of the network instance.
     */

    public ListSolNetworkInstanceMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The metadata of the network instance.
     * </p>
     * 
     * @param metadata
     *        The metadata of the network instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkInstanceInfo withMetadata(ListSolNetworkInstanceMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * Human-readable description of the network instance.
     * </p>
     * 
     * @param nsInstanceDescription
     *        Human-readable description of the network instance.
     */

    public void setNsInstanceDescription(String nsInstanceDescription) {
        this.nsInstanceDescription = nsInstanceDescription;
    }

    /**
     * <p>
     * Human-readable description of the network instance.
     * </p>
     * 
     * @return Human-readable description of the network instance.
     */

    public String getNsInstanceDescription() {
        return this.nsInstanceDescription;
    }

    /**
     * <p>
     * Human-readable description of the network instance.
     * </p>
     * 
     * @param nsInstanceDescription
     *        Human-readable description of the network instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkInstanceInfo withNsInstanceDescription(String nsInstanceDescription) {
        setNsInstanceDescription(nsInstanceDescription);
        return this;
    }

    /**
     * <p>
     * Human-readable name of the network instance.
     * </p>
     * 
     * @param nsInstanceName
     *        Human-readable name of the network instance.
     */

    public void setNsInstanceName(String nsInstanceName) {
        this.nsInstanceName = nsInstanceName;
    }

    /**
     * <p>
     * Human-readable name of the network instance.
     * </p>
     * 
     * @return Human-readable name of the network instance.
     */

    public String getNsInstanceName() {
        return this.nsInstanceName;
    }

    /**
     * <p>
     * Human-readable name of the network instance.
     * </p>
     * 
     * @param nsInstanceName
     *        Human-readable name of the network instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkInstanceInfo withNsInstanceName(String nsInstanceName) {
        setNsInstanceName(nsInstanceName);
        return this;
    }

    /**
     * <p>
     * The state of the network instance.
     * </p>
     * 
     * @param nsState
     *        The state of the network instance.
     * @see NsState
     */

    public void setNsState(String nsState) {
        this.nsState = nsState;
    }

    /**
     * <p>
     * The state of the network instance.
     * </p>
     * 
     * @return The state of the network instance.
     * @see NsState
     */

    public String getNsState() {
        return this.nsState;
    }

    /**
     * <p>
     * The state of the network instance.
     * </p>
     * 
     * @param nsState
     *        The state of the network instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsState
     */

    public ListSolNetworkInstanceInfo withNsState(String nsState) {
        setNsState(nsState);
        return this;
    }

    /**
     * <p>
     * The state of the network instance.
     * </p>
     * 
     * @param nsState
     *        The state of the network instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsState
     */

    public ListSolNetworkInstanceInfo withNsState(NsState nsState) {
        this.nsState = nsState.toString();
        return this;
    }

    /**
     * <p>
     * ID of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdId
     *        ID of the network service descriptor in the network package.
     */

    public void setNsdId(String nsdId) {
        this.nsdId = nsdId;
    }

    /**
     * <p>
     * ID of the network service descriptor in the network package.
     * </p>
     * 
     * @return ID of the network service descriptor in the network package.
     */

    public String getNsdId() {
        return this.nsdId;
    }

    /**
     * <p>
     * ID of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdId
     *        ID of the network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkInstanceInfo withNsdId(String nsdId) {
        setNsdId(nsdId);
        return this;
    }

    /**
     * <p>
     * ID of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdInfoId
     *        ID of the network service descriptor in the network package.
     */

    public void setNsdInfoId(String nsdInfoId) {
        this.nsdInfoId = nsdInfoId;
    }

    /**
     * <p>
     * ID of the network service descriptor in the network package.
     * </p>
     * 
     * @return ID of the network service descriptor in the network package.
     */

    public String getNsdInfoId() {
        return this.nsdInfoId;
    }

    /**
     * <p>
     * ID of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdInfoId
     *        ID of the network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolNetworkInstanceInfo withNsdInfoId(String nsdInfoId) {
        setNsdInfoId(nsdInfoId);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getNsInstanceDescription() != null)
            sb.append("NsInstanceDescription: ").append(getNsInstanceDescription()).append(",");
        if (getNsInstanceName() != null)
            sb.append("NsInstanceName: ").append(getNsInstanceName()).append(",");
        if (getNsState() != null)
            sb.append("NsState: ").append(getNsState()).append(",");
        if (getNsdId() != null)
            sb.append("NsdId: ").append(getNsdId()).append(",");
        if (getNsdInfoId() != null)
            sb.append("NsdInfoId: ").append(getNsdInfoId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSolNetworkInstanceInfo == false)
            return false;
        ListSolNetworkInstanceInfo other = (ListSolNetworkInstanceInfo) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getNsInstanceDescription() == null ^ this.getNsInstanceDescription() == null)
            return false;
        if (other.getNsInstanceDescription() != null && other.getNsInstanceDescription().equals(this.getNsInstanceDescription()) == false)
            return false;
        if (other.getNsInstanceName() == null ^ this.getNsInstanceName() == null)
            return false;
        if (other.getNsInstanceName() != null && other.getNsInstanceName().equals(this.getNsInstanceName()) == false)
            return false;
        if (other.getNsState() == null ^ this.getNsState() == null)
            return false;
        if (other.getNsState() != null && other.getNsState().equals(this.getNsState()) == false)
            return false;
        if (other.getNsdId() == null ^ this.getNsdId() == null)
            return false;
        if (other.getNsdId() != null && other.getNsdId().equals(this.getNsdId()) == false)
            return false;
        if (other.getNsdInfoId() == null ^ this.getNsdInfoId() == null)
            return false;
        if (other.getNsdInfoId() != null && other.getNsdInfoId().equals(this.getNsdInfoId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getNsInstanceDescription() == null) ? 0 : getNsInstanceDescription().hashCode());
        hashCode = prime * hashCode + ((getNsInstanceName() == null) ? 0 : getNsInstanceName().hashCode());
        hashCode = prime * hashCode + ((getNsState() == null) ? 0 : getNsState().hashCode());
        hashCode = prime * hashCode + ((getNsdId() == null) ? 0 : getNsdId().hashCode());
        hashCode = prime * hashCode + ((getNsdInfoId() == null) ? 0 : getNsdInfoId().hashCode());
        return hashCode;
    }

    @Override
    public ListSolNetworkInstanceInfo clone() {
        try {
            return (ListSolNetworkInstanceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.tnb.model.transform.ListSolNetworkInstanceInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
