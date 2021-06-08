/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Resource capacity settings. Fleet capacity is measured in EC2 instances. Pending and terminating counts are non-zero
 * when the fleet capacity is adjusting to a scaling event or if access to resources is temporarily affected.
 * </p>
 * <p>
 * EC2 instance counts are part of <a>FleetCapacity</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/EC2InstanceCounts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2InstanceCounts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Ideal number of active instances. GameLift will always try to maintain the desired number of instances. Capacity
     * is scaled up or down by changing the desired instances.
     * </p>
     */
    private Integer dESIRED;
    /**
     * <p>
     * The minimum instance count value allowed.
     * </p>
     */
    private Integer mINIMUM;
    /**
     * <p>
     * The maximum instance count value allowed.
     * </p>
     */
    private Integer mAXIMUM;
    /**
     * <p>
     * Number of instances that are starting but not yet active.
     * </p>
     */
    private Integer pENDING;
    /**
     * <p>
     * Actual number of instances that are ready to host game sessions.
     * </p>
     */
    private Integer aCTIVE;
    /**
     * <p>
     * Number of active instances that are not currently hosting a game session.
     * </p>
     */
    private Integer iDLE;
    /**
     * <p>
     * Number of instances that are no longer active but haven't yet been terminated.
     * </p>
     */
    private Integer tERMINATING;

    /**
     * <p>
     * Ideal number of active instances. GameLift will always try to maintain the desired number of instances. Capacity
     * is scaled up or down by changing the desired instances.
     * </p>
     * 
     * @param dESIRED
     *        Ideal number of active instances. GameLift will always try to maintain the desired number of instances.
     *        Capacity is scaled up or down by changing the desired instances.
     */

    public void setDESIRED(Integer dESIRED) {
        this.dESIRED = dESIRED;
    }

    /**
     * <p>
     * Ideal number of active instances. GameLift will always try to maintain the desired number of instances. Capacity
     * is scaled up or down by changing the desired instances.
     * </p>
     * 
     * @return Ideal number of active instances. GameLift will always try to maintain the desired number of instances.
     *         Capacity is scaled up or down by changing the desired instances.
     */

    public Integer getDESIRED() {
        return this.dESIRED;
    }

    /**
     * <p>
     * Ideal number of active instances. GameLift will always try to maintain the desired number of instances. Capacity
     * is scaled up or down by changing the desired instances.
     * </p>
     * 
     * @param dESIRED
     *        Ideal number of active instances. GameLift will always try to maintain the desired number of instances.
     *        Capacity is scaled up or down by changing the desired instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceCounts withDESIRED(Integer dESIRED) {
        setDESIRED(dESIRED);
        return this;
    }

    /**
     * <p>
     * The minimum instance count value allowed.
     * </p>
     * 
     * @param mINIMUM
     *        The minimum instance count value allowed.
     */

    public void setMINIMUM(Integer mINIMUM) {
        this.mINIMUM = mINIMUM;
    }

    /**
     * <p>
     * The minimum instance count value allowed.
     * </p>
     * 
     * @return The minimum instance count value allowed.
     */

    public Integer getMINIMUM() {
        return this.mINIMUM;
    }

    /**
     * <p>
     * The minimum instance count value allowed.
     * </p>
     * 
     * @param mINIMUM
     *        The minimum instance count value allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceCounts withMINIMUM(Integer mINIMUM) {
        setMINIMUM(mINIMUM);
        return this;
    }

    /**
     * <p>
     * The maximum instance count value allowed.
     * </p>
     * 
     * @param mAXIMUM
     *        The maximum instance count value allowed.
     */

    public void setMAXIMUM(Integer mAXIMUM) {
        this.mAXIMUM = mAXIMUM;
    }

    /**
     * <p>
     * The maximum instance count value allowed.
     * </p>
     * 
     * @return The maximum instance count value allowed.
     */

    public Integer getMAXIMUM() {
        return this.mAXIMUM;
    }

    /**
     * <p>
     * The maximum instance count value allowed.
     * </p>
     * 
     * @param mAXIMUM
     *        The maximum instance count value allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceCounts withMAXIMUM(Integer mAXIMUM) {
        setMAXIMUM(mAXIMUM);
        return this;
    }

    /**
     * <p>
     * Number of instances that are starting but not yet active.
     * </p>
     * 
     * @param pENDING
     *        Number of instances that are starting but not yet active.
     */

    public void setPENDING(Integer pENDING) {
        this.pENDING = pENDING;
    }

    /**
     * <p>
     * Number of instances that are starting but not yet active.
     * </p>
     * 
     * @return Number of instances that are starting but not yet active.
     */

    public Integer getPENDING() {
        return this.pENDING;
    }

    /**
     * <p>
     * Number of instances that are starting but not yet active.
     * </p>
     * 
     * @param pENDING
     *        Number of instances that are starting but not yet active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceCounts withPENDING(Integer pENDING) {
        setPENDING(pENDING);
        return this;
    }

    /**
     * <p>
     * Actual number of instances that are ready to host game sessions.
     * </p>
     * 
     * @param aCTIVE
     *        Actual number of instances that are ready to host game sessions.
     */

    public void setACTIVE(Integer aCTIVE) {
        this.aCTIVE = aCTIVE;
    }

    /**
     * <p>
     * Actual number of instances that are ready to host game sessions.
     * </p>
     * 
     * @return Actual number of instances that are ready to host game sessions.
     */

    public Integer getACTIVE() {
        return this.aCTIVE;
    }

    /**
     * <p>
     * Actual number of instances that are ready to host game sessions.
     * </p>
     * 
     * @param aCTIVE
     *        Actual number of instances that are ready to host game sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceCounts withACTIVE(Integer aCTIVE) {
        setACTIVE(aCTIVE);
        return this;
    }

    /**
     * <p>
     * Number of active instances that are not currently hosting a game session.
     * </p>
     * 
     * @param iDLE
     *        Number of active instances that are not currently hosting a game session.
     */

    public void setIDLE(Integer iDLE) {
        this.iDLE = iDLE;
    }

    /**
     * <p>
     * Number of active instances that are not currently hosting a game session.
     * </p>
     * 
     * @return Number of active instances that are not currently hosting a game session.
     */

    public Integer getIDLE() {
        return this.iDLE;
    }

    /**
     * <p>
     * Number of active instances that are not currently hosting a game session.
     * </p>
     * 
     * @param iDLE
     *        Number of active instances that are not currently hosting a game session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceCounts withIDLE(Integer iDLE) {
        setIDLE(iDLE);
        return this;
    }

    /**
     * <p>
     * Number of instances that are no longer active but haven't yet been terminated.
     * </p>
     * 
     * @param tERMINATING
     *        Number of instances that are no longer active but haven't yet been terminated.
     */

    public void setTERMINATING(Integer tERMINATING) {
        this.tERMINATING = tERMINATING;
    }

    /**
     * <p>
     * Number of instances that are no longer active but haven't yet been terminated.
     * </p>
     * 
     * @return Number of instances that are no longer active but haven't yet been terminated.
     */

    public Integer getTERMINATING() {
        return this.tERMINATING;
    }

    /**
     * <p>
     * Number of instances that are no longer active but haven't yet been terminated.
     * </p>
     * 
     * @param tERMINATING
     *        Number of instances that are no longer active but haven't yet been terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceCounts withTERMINATING(Integer tERMINATING) {
        setTERMINATING(tERMINATING);
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
        if (getDESIRED() != null)
            sb.append("DESIRED: ").append(getDESIRED()).append(",");
        if (getMINIMUM() != null)
            sb.append("MINIMUM: ").append(getMINIMUM()).append(",");
        if (getMAXIMUM() != null)
            sb.append("MAXIMUM: ").append(getMAXIMUM()).append(",");
        if (getPENDING() != null)
            sb.append("PENDING: ").append(getPENDING()).append(",");
        if (getACTIVE() != null)
            sb.append("ACTIVE: ").append(getACTIVE()).append(",");
        if (getIDLE() != null)
            sb.append("IDLE: ").append(getIDLE()).append(",");
        if (getTERMINATING() != null)
            sb.append("TERMINATING: ").append(getTERMINATING());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EC2InstanceCounts == false)
            return false;
        EC2InstanceCounts other = (EC2InstanceCounts) obj;
        if (other.getDESIRED() == null ^ this.getDESIRED() == null)
            return false;
        if (other.getDESIRED() != null && other.getDESIRED().equals(this.getDESIRED()) == false)
            return false;
        if (other.getMINIMUM() == null ^ this.getMINIMUM() == null)
            return false;
        if (other.getMINIMUM() != null && other.getMINIMUM().equals(this.getMINIMUM()) == false)
            return false;
        if (other.getMAXIMUM() == null ^ this.getMAXIMUM() == null)
            return false;
        if (other.getMAXIMUM() != null && other.getMAXIMUM().equals(this.getMAXIMUM()) == false)
            return false;
        if (other.getPENDING() == null ^ this.getPENDING() == null)
            return false;
        if (other.getPENDING() != null && other.getPENDING().equals(this.getPENDING()) == false)
            return false;
        if (other.getACTIVE() == null ^ this.getACTIVE() == null)
            return false;
        if (other.getACTIVE() != null && other.getACTIVE().equals(this.getACTIVE()) == false)
            return false;
        if (other.getIDLE() == null ^ this.getIDLE() == null)
            return false;
        if (other.getIDLE() != null && other.getIDLE().equals(this.getIDLE()) == false)
            return false;
        if (other.getTERMINATING() == null ^ this.getTERMINATING() == null)
            return false;
        if (other.getTERMINATING() != null && other.getTERMINATING().equals(this.getTERMINATING()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDESIRED() == null) ? 0 : getDESIRED().hashCode());
        hashCode = prime * hashCode + ((getMINIMUM() == null) ? 0 : getMINIMUM().hashCode());
        hashCode = prime * hashCode + ((getMAXIMUM() == null) ? 0 : getMAXIMUM().hashCode());
        hashCode = prime * hashCode + ((getPENDING() == null) ? 0 : getPENDING().hashCode());
        hashCode = prime * hashCode + ((getACTIVE() == null) ? 0 : getACTIVE().hashCode());
        hashCode = prime * hashCode + ((getIDLE() == null) ? 0 : getIDLE().hashCode());
        hashCode = prime * hashCode + ((getTERMINATING() == null) ? 0 : getTERMINATING().hashCode());
        return hashCode;
    }

    @Override
    public EC2InstanceCounts clone() {
        try {
            return (EC2InstanceCounts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.EC2InstanceCountsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
