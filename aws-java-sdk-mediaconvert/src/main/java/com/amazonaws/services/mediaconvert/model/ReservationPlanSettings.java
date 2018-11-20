/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand
 * queues.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ReservationPlanSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationPlanSettings implements Serializable, Cloneable, StructuredPojo {

    /** The length of time that you commit to when you set up a pricing plan contract for a reserved queue. */
    private String commitment;
    /**
     * Specifies whether the pricing plan contract for your reserved queue automatically renews (AUTO_RENEW) or expires
     * (EXPIRE) at the end of the contract period.
     */
    private String renewalType;
    /**
     * Specifies the number of reserved transcode slots (RTS) for this queue. The number of RTS determines how many jobs
     * the queue can process in parallel; each RTS can process one job at a time. To increase this number, create a
     * replacement contract through the AWS Elemental MediaConvert console.
     */
    private Integer reservedSlots;

    /**
     * The length of time that you commit to when you set up a pricing plan contract for a reserved queue.
     * 
     * @param commitment
     *        The length of time that you commit to when you set up a pricing plan contract for a reserved queue.
     * @see Commitment
     */

    public void setCommitment(String commitment) {
        this.commitment = commitment;
    }

    /**
     * The length of time that you commit to when you set up a pricing plan contract for a reserved queue.
     * 
     * @return The length of time that you commit to when you set up a pricing plan contract for a reserved queue.
     * @see Commitment
     */

    public String getCommitment() {
        return this.commitment;
    }

    /**
     * The length of time that you commit to when you set up a pricing plan contract for a reserved queue.
     * 
     * @param commitment
     *        The length of time that you commit to when you set up a pricing plan contract for a reserved queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Commitment
     */

    public ReservationPlanSettings withCommitment(String commitment) {
        setCommitment(commitment);
        return this;
    }

    /**
     * The length of time that you commit to when you set up a pricing plan contract for a reserved queue.
     * 
     * @param commitment
     *        The length of time that you commit to when you set up a pricing plan contract for a reserved queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Commitment
     */

    public ReservationPlanSettings withCommitment(Commitment commitment) {
        this.commitment = commitment.toString();
        return this;
    }

    /**
     * Specifies whether the pricing plan contract for your reserved queue automatically renews (AUTO_RENEW) or expires
     * (EXPIRE) at the end of the contract period.
     * 
     * @param renewalType
     *        Specifies whether the pricing plan contract for your reserved queue automatically renews (AUTO_RENEW) or
     *        expires (EXPIRE) at the end of the contract period.
     * @see RenewalType
     */

    public void setRenewalType(String renewalType) {
        this.renewalType = renewalType;
    }

    /**
     * Specifies whether the pricing plan contract for your reserved queue automatically renews (AUTO_RENEW) or expires
     * (EXPIRE) at the end of the contract period.
     * 
     * @return Specifies whether the pricing plan contract for your reserved queue automatically renews (AUTO_RENEW) or
     *         expires (EXPIRE) at the end of the contract period.
     * @see RenewalType
     */

    public String getRenewalType() {
        return this.renewalType;
    }

    /**
     * Specifies whether the pricing plan contract for your reserved queue automatically renews (AUTO_RENEW) or expires
     * (EXPIRE) at the end of the contract period.
     * 
     * @param renewalType
     *        Specifies whether the pricing plan contract for your reserved queue automatically renews (AUTO_RENEW) or
     *        expires (EXPIRE) at the end of the contract period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenewalType
     */

    public ReservationPlanSettings withRenewalType(String renewalType) {
        setRenewalType(renewalType);
        return this;
    }

    /**
     * Specifies whether the pricing plan contract for your reserved queue automatically renews (AUTO_RENEW) or expires
     * (EXPIRE) at the end of the contract period.
     * 
     * @param renewalType
     *        Specifies whether the pricing plan contract for your reserved queue automatically renews (AUTO_RENEW) or
     *        expires (EXPIRE) at the end of the contract period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenewalType
     */

    public ReservationPlanSettings withRenewalType(RenewalType renewalType) {
        this.renewalType = renewalType.toString();
        return this;
    }

    /**
     * Specifies the number of reserved transcode slots (RTS) for this queue. The number of RTS determines how many jobs
     * the queue can process in parallel; each RTS can process one job at a time. To increase this number, create a
     * replacement contract through the AWS Elemental MediaConvert console.
     * 
     * @param reservedSlots
     *        Specifies the number of reserved transcode slots (RTS) for this queue. The number of RTS determines how
     *        many jobs the queue can process in parallel; each RTS can process one job at a time. To increase this
     *        number, create a replacement contract through the AWS Elemental MediaConvert console.
     */

    public void setReservedSlots(Integer reservedSlots) {
        this.reservedSlots = reservedSlots;
    }

    /**
     * Specifies the number of reserved transcode slots (RTS) for this queue. The number of RTS determines how many jobs
     * the queue can process in parallel; each RTS can process one job at a time. To increase this number, create a
     * replacement contract through the AWS Elemental MediaConvert console.
     * 
     * @return Specifies the number of reserved transcode slots (RTS) for this queue. The number of RTS determines how
     *         many jobs the queue can process in parallel; each RTS can process one job at a time. To increase this
     *         number, create a replacement contract through the AWS Elemental MediaConvert console.
     */

    public Integer getReservedSlots() {
        return this.reservedSlots;
    }

    /**
     * Specifies the number of reserved transcode slots (RTS) for this queue. The number of RTS determines how many jobs
     * the queue can process in parallel; each RTS can process one job at a time. To increase this number, create a
     * replacement contract through the AWS Elemental MediaConvert console.
     * 
     * @param reservedSlots
     *        Specifies the number of reserved transcode slots (RTS) for this queue. The number of RTS determines how
     *        many jobs the queue can process in parallel; each RTS can process one job at a time. To increase this
     *        number, create a replacement contract through the AWS Elemental MediaConvert console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservationPlanSettings withReservedSlots(Integer reservedSlots) {
        setReservedSlots(reservedSlots);
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
        if (getCommitment() != null)
            sb.append("Commitment: ").append(getCommitment()).append(",");
        if (getRenewalType() != null)
            sb.append("RenewalType: ").append(getRenewalType()).append(",");
        if (getReservedSlots() != null)
            sb.append("ReservedSlots: ").append(getReservedSlots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservationPlanSettings == false)
            return false;
        ReservationPlanSettings other = (ReservationPlanSettings) obj;
        if (other.getCommitment() == null ^ this.getCommitment() == null)
            return false;
        if (other.getCommitment() != null && other.getCommitment().equals(this.getCommitment()) == false)
            return false;
        if (other.getRenewalType() == null ^ this.getRenewalType() == null)
            return false;
        if (other.getRenewalType() != null && other.getRenewalType().equals(this.getRenewalType()) == false)
            return false;
        if (other.getReservedSlots() == null ^ this.getReservedSlots() == null)
            return false;
        if (other.getReservedSlots() != null && other.getReservedSlots().equals(this.getReservedSlots()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitment() == null) ? 0 : getCommitment().hashCode());
        hashCode = prime * hashCode + ((getRenewalType() == null) ? 0 : getRenewalType().hashCode());
        hashCode = prime * hashCode + ((getReservedSlots() == null) ? 0 : getReservedSlots().hashCode());
        return hashCode;
    }

    @Override
    public ReservationPlanSettings clone() {
        try {
            return (ReservationPlanSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.ReservationPlanSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
