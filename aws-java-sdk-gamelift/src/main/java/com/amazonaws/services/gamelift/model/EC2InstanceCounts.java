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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;

/**
 * <p>
 * Current status of fleet capacity. The number of active instances should match or be in the process of matching the
 * number of desired instances. Pending and terminating counts are non-zero only if fleet capacity is adjusting to an
 * <a>UpdateFleetCapacity</a> request, or if access to resources is temporarily affected.
 * </p>
 */
public class EC2InstanceCounts implements Serializable, Cloneable {

    /**
     * <p>
     * Ideal number of active instances in the fleet.
     * </p>
     */
    private Integer dESIRED;
    /**
     * <p>
     * Minimum value allowed for the fleet's instance count.
     * </p>
     */
    private Integer mINIMUM;
    /**
     * <p>
     * Maximum value allowed for the fleet's instance count.
     * </p>
     */
    private Integer mAXIMUM;
    /**
     * <p>
     * Number of instances in the fleet that are starting but not yet active.
     * </p>
     */
    private Integer pENDING;
    /**
     * <p>
     * Actual number of active instances in the fleet.
     * </p>
     */
    private Integer aCTIVE;
    /**
     * <p>
     * Number of active instances in the fleet that are not currently hosting a game session.
     * </p>
     */
    private Integer iDLE;
    /**
     * <p>
     * Number of instances in the fleet that are no longer active but haven't yet been terminated.
     * </p>
     */
    private Integer tERMINATING;

    /**
     * <p>
     * Ideal number of active instances in the fleet.
     * </p>
     * 
     * @param dESIRED
     *        Ideal number of active instances in the fleet.
     */

    public void setDESIRED(Integer dESIRED) {
        this.dESIRED = dESIRED;
    }

    /**
     * <p>
     * Ideal number of active instances in the fleet.
     * </p>
     * 
     * @return Ideal number of active instances in the fleet.
     */

    public Integer getDESIRED() {
        return this.dESIRED;
    }

    /**
     * <p>
     * Ideal number of active instances in the fleet.
     * </p>
     * 
     * @param dESIRED
     *        Ideal number of active instances in the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceCounts withDESIRED(Integer dESIRED) {
        setDESIRED(dESIRED);
        return this;
    }

    /**
     * <p>
     * Minimum value allowed for the fleet's instance count.
     * </p>
     * 
     * @param mINIMUM
     *        Minimum value allowed for the fleet's instance count.
     */

    public void setMINIMUM(Integer mINIMUM) {
        this.mINIMUM = mINIMUM;
    }

    /**
     * <p>
     * Minimum value allowed for the fleet's instance count.
     * </p>
     * 
     * @return Minimum value allowed for the fleet's instance count.
     */

    public Integer getMINIMUM() {
        return this.mINIMUM;
    }

    /**
     * <p>
     * Minimum value allowed for the fleet's instance count.
     * </p>
     * 
     * @param mINIMUM
     *        Minimum value allowed for the fleet's instance count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceCounts withMINIMUM(Integer mINIMUM) {
        setMINIMUM(mINIMUM);
        return this;
    }

    /**
     * <p>
     * Maximum value allowed for the fleet's instance count.
     * </p>
     * 
     * @param mAXIMUM
     *        Maximum value allowed for the fleet's instance count.
     */

    public void setMAXIMUM(Integer mAXIMUM) {
        this.mAXIMUM = mAXIMUM;
    }

    /**
     * <p>
     * Maximum value allowed for the fleet's instance count.
     * </p>
     * 
     * @return Maximum value allowed for the fleet's instance count.
     */

    public Integer getMAXIMUM() {
        return this.mAXIMUM;
    }

    /**
     * <p>
     * Maximum value allowed for the fleet's instance count.
     * </p>
     * 
     * @param mAXIMUM
     *        Maximum value allowed for the fleet's instance count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceCounts withMAXIMUM(Integer mAXIMUM) {
        setMAXIMUM(mAXIMUM);
        return this;
    }

    /**
     * <p>
     * Number of instances in the fleet that are starting but not yet active.
     * </p>
     * 
     * @param pENDING
     *        Number of instances in the fleet that are starting but not yet active.
     */

    public void setPENDING(Integer pENDING) {
        this.pENDING = pENDING;
    }

    /**
     * <p>
     * Number of instances in the fleet that are starting but not yet active.
     * </p>
     * 
     * @return Number of instances in the fleet that are starting but not yet active.
     */

    public Integer getPENDING() {
        return this.pENDING;
    }

    /**
     * <p>
     * Number of instances in the fleet that are starting but not yet active.
     * </p>
     * 
     * @param pENDING
     *        Number of instances in the fleet that are starting but not yet active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceCounts withPENDING(Integer pENDING) {
        setPENDING(pENDING);
        return this;
    }

    /**
     * <p>
     * Actual number of active instances in the fleet.
     * </p>
     * 
     * @param aCTIVE
     *        Actual number of active instances in the fleet.
     */

    public void setACTIVE(Integer aCTIVE) {
        this.aCTIVE = aCTIVE;
    }

    /**
     * <p>
     * Actual number of active instances in the fleet.
     * </p>
     * 
     * @return Actual number of active instances in the fleet.
     */

    public Integer getACTIVE() {
        return this.aCTIVE;
    }

    /**
     * <p>
     * Actual number of active instances in the fleet.
     * </p>
     * 
     * @param aCTIVE
     *        Actual number of active instances in the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceCounts withACTIVE(Integer aCTIVE) {
        setACTIVE(aCTIVE);
        return this;
    }

    /**
     * <p>
     * Number of active instances in the fleet that are not currently hosting a game session.
     * </p>
     * 
     * @param iDLE
     *        Number of active instances in the fleet that are not currently hosting a game session.
     */

    public void setIDLE(Integer iDLE) {
        this.iDLE = iDLE;
    }

    /**
     * <p>
     * Number of active instances in the fleet that are not currently hosting a game session.
     * </p>
     * 
     * @return Number of active instances in the fleet that are not currently hosting a game session.
     */

    public Integer getIDLE() {
        return this.iDLE;
    }

    /**
     * <p>
     * Number of active instances in the fleet that are not currently hosting a game session.
     * </p>
     * 
     * @param iDLE
     *        Number of active instances in the fleet that are not currently hosting a game session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceCounts withIDLE(Integer iDLE) {
        setIDLE(iDLE);
        return this;
    }

    /**
     * <p>
     * Number of instances in the fleet that are no longer active but haven't yet been terminated.
     * </p>
     * 
     * @param tERMINATING
     *        Number of instances in the fleet that are no longer active but haven't yet been terminated.
     */

    public void setTERMINATING(Integer tERMINATING) {
        this.tERMINATING = tERMINATING;
    }

    /**
     * <p>
     * Number of instances in the fleet that are no longer active but haven't yet been terminated.
     * </p>
     * 
     * @return Number of instances in the fleet that are no longer active but haven't yet been terminated.
     */

    public Integer getTERMINATING() {
        return this.tERMINATING;
    }

    /**
     * <p>
     * Number of instances in the fleet that are no longer active but haven't yet been terminated.
     * </p>
     * 
     * @param tERMINATING
     *        Number of instances in the fleet that are no longer active but haven't yet been terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2InstanceCounts withTERMINATING(Integer tERMINATING) {
        setTERMINATING(tERMINATING);
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
        if (getDESIRED() != null)
            sb.append("DESIRED: " + getDESIRED() + ",");
        if (getMINIMUM() != null)
            sb.append("MINIMUM: " + getMINIMUM() + ",");
        if (getMAXIMUM() != null)
            sb.append("MAXIMUM: " + getMAXIMUM() + ",");
        if (getPENDING() != null)
            sb.append("PENDING: " + getPENDING() + ",");
        if (getACTIVE() != null)
            sb.append("ACTIVE: " + getACTIVE() + ",");
        if (getIDLE() != null)
            sb.append("IDLE: " + getIDLE() + ",");
        if (getTERMINATING() != null)
            sb.append("TERMINATING: " + getTERMINATING());
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
}
