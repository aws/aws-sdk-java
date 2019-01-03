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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a hardware security module (HSM) in an AWS CloudHSM cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/Hsm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Hsm implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Availability Zone that contains the HSM.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The identifier (ID) of the cluster that contains the HSM.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * The subnet that contains the HSM's elastic network interface (ENI).
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The identifier (ID) of the HSM's elastic network interface (ENI).
     * </p>
     */
    private String eniId;
    /**
     * <p>
     * The IP address of the HSM's elastic network interface (ENI).
     * </p>
     */
    private String eniIp;
    /**
     * <p>
     * The HSM's identifier (ID).
     * </p>
     */
    private String hsmId;
    /**
     * <p>
     * The HSM's state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * A description of the HSM's state.
     * </p>
     */
    private String stateMessage;

    /**
     * <p>
     * The Availability Zone that contains the HSM.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone that contains the HSM.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone that contains the HSM.
     * </p>
     * 
     * @return The Availability Zone that contains the HSM.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone that contains the HSM.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone that contains the HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hsm withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster that contains the HSM.
     * </p>
     * 
     * @param clusterId
     *        The identifier (ID) of the cluster that contains the HSM.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster that contains the HSM.
     * </p>
     * 
     * @return The identifier (ID) of the cluster that contains the HSM.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster that contains the HSM.
     * </p>
     * 
     * @param clusterId
     *        The identifier (ID) of the cluster that contains the HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hsm withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * The subnet that contains the HSM's elastic network interface (ENI).
     * </p>
     * 
     * @param subnetId
     *        The subnet that contains the HSM's elastic network interface (ENI).
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The subnet that contains the HSM's elastic network interface (ENI).
     * </p>
     * 
     * @return The subnet that contains the HSM's elastic network interface (ENI).
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The subnet that contains the HSM's elastic network interface (ENI).
     * </p>
     * 
     * @param subnetId
     *        The subnet that contains the HSM's elastic network interface (ENI).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hsm withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The identifier (ID) of the HSM's elastic network interface (ENI).
     * </p>
     * 
     * @param eniId
     *        The identifier (ID) of the HSM's elastic network interface (ENI).
     */

    public void setEniId(String eniId) {
        this.eniId = eniId;
    }

    /**
     * <p>
     * The identifier (ID) of the HSM's elastic network interface (ENI).
     * </p>
     * 
     * @return The identifier (ID) of the HSM's elastic network interface (ENI).
     */

    public String getEniId() {
        return this.eniId;
    }

    /**
     * <p>
     * The identifier (ID) of the HSM's elastic network interface (ENI).
     * </p>
     * 
     * @param eniId
     *        The identifier (ID) of the HSM's elastic network interface (ENI).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hsm withEniId(String eniId) {
        setEniId(eniId);
        return this;
    }

    /**
     * <p>
     * The IP address of the HSM's elastic network interface (ENI).
     * </p>
     * 
     * @param eniIp
     *        The IP address of the HSM's elastic network interface (ENI).
     */

    public void setEniIp(String eniIp) {
        this.eniIp = eniIp;
    }

    /**
     * <p>
     * The IP address of the HSM's elastic network interface (ENI).
     * </p>
     * 
     * @return The IP address of the HSM's elastic network interface (ENI).
     */

    public String getEniIp() {
        return this.eniIp;
    }

    /**
     * <p>
     * The IP address of the HSM's elastic network interface (ENI).
     * </p>
     * 
     * @param eniIp
     *        The IP address of the HSM's elastic network interface (ENI).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hsm withEniIp(String eniIp) {
        setEniIp(eniIp);
        return this;
    }

    /**
     * <p>
     * The HSM's identifier (ID).
     * </p>
     * 
     * @param hsmId
     *        The HSM's identifier (ID).
     */

    public void setHsmId(String hsmId) {
        this.hsmId = hsmId;
    }

    /**
     * <p>
     * The HSM's identifier (ID).
     * </p>
     * 
     * @return The HSM's identifier (ID).
     */

    public String getHsmId() {
        return this.hsmId;
    }

    /**
     * <p>
     * The HSM's identifier (ID).
     * </p>
     * 
     * @param hsmId
     *        The HSM's identifier (ID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hsm withHsmId(String hsmId) {
        setHsmId(hsmId);
        return this;
    }

    /**
     * <p>
     * The HSM's state.
     * </p>
     * 
     * @param state
     *        The HSM's state.
     * @see HsmState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The HSM's state.
     * </p>
     * 
     * @return The HSM's state.
     * @see HsmState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The HSM's state.
     * </p>
     * 
     * @param state
     *        The HSM's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HsmState
     */

    public Hsm withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The HSM's state.
     * </p>
     * 
     * @param state
     *        The HSM's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HsmState
     */

    public Hsm withState(HsmState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A description of the HSM's state.
     * </p>
     * 
     * @param stateMessage
     *        A description of the HSM's state.
     */

    public void setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
    }

    /**
     * <p>
     * A description of the HSM's state.
     * </p>
     * 
     * @return A description of the HSM's state.
     */

    public String getStateMessage() {
        return this.stateMessage;
    }

    /**
     * <p>
     * A description of the HSM's state.
     * </p>
     * 
     * @param stateMessage
     *        A description of the HSM's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hsm withStateMessage(String stateMessage) {
        setStateMessage(stateMessage);
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getEniId() != null)
            sb.append("EniId: ").append(getEniId()).append(",");
        if (getEniIp() != null)
            sb.append("EniIp: ").append(getEniIp()).append(",");
        if (getHsmId() != null)
            sb.append("HsmId: ").append(getHsmId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateMessage() != null)
            sb.append("StateMessage: ").append(getStateMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Hsm == false)
            return false;
        Hsm other = (Hsm) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getEniId() == null ^ this.getEniId() == null)
            return false;
        if (other.getEniId() != null && other.getEniId().equals(this.getEniId()) == false)
            return false;
        if (other.getEniIp() == null ^ this.getEniIp() == null)
            return false;
        if (other.getEniIp() != null && other.getEniIp().equals(this.getEniIp()) == false)
            return false;
        if (other.getHsmId() == null ^ this.getHsmId() == null)
            return false;
        if (other.getHsmId() != null && other.getHsmId().equals(this.getHsmId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateMessage() == null ^ this.getStateMessage() == null)
            return false;
        if (other.getStateMessage() != null && other.getStateMessage().equals(this.getStateMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getEniId() == null) ? 0 : getEniId().hashCode());
        hashCode = prime * hashCode + ((getEniIp() == null) ? 0 : getEniIp().hashCode());
        hashCode = prime * hashCode + ((getHsmId() == null) ? 0 : getHsmId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateMessage() == null) ? 0 : getStateMessage().hashCode());
        return hashCode;
    }

    @Override
    public Hsm clone() {
        try {
            return (Hsm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudhsmv2.model.transform.HsmMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
