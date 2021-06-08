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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The attributes associated with an Elastic IP address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AddressAttribute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddressAttribute implements Serializable, Cloneable {

    /**
     * <p>
     * The public IP address.
     * </p>
     */
    private String publicIp;
    /**
     * <p>
     * [EC2-VPC] The allocation ID.
     * </p>
     */
    private String allocationId;
    /**
     * <p>
     * The pointer (PTR) record for the IP address.
     * </p>
     */
    private String ptrRecord;
    /**
     * <p>
     * The updated PTR record for the IP address.
     * </p>
     */
    private PtrUpdateStatus ptrRecordUpdate;

    /**
     * <p>
     * The public IP address.
     * </p>
     * 
     * @param publicIp
     *        The public IP address.
     */

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The public IP address.
     * </p>
     * 
     * @return The public IP address.
     */

    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * <p>
     * The public IP address.
     * </p>
     * 
     * @param publicIp
     *        The public IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressAttribute withPublicIp(String publicIp) {
        setPublicIp(publicIp);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The allocation ID.
     * </p>
     * 
     * @param allocationId
     *        [EC2-VPC] The allocation ID.
     */

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * [EC2-VPC] The allocation ID.
     * </p>
     * 
     * @return [EC2-VPC] The allocation ID.
     */

    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * <p>
     * [EC2-VPC] The allocation ID.
     * </p>
     * 
     * @param allocationId
     *        [EC2-VPC] The allocation ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressAttribute withAllocationId(String allocationId) {
        setAllocationId(allocationId);
        return this;
    }

    /**
     * <p>
     * The pointer (PTR) record for the IP address.
     * </p>
     * 
     * @param ptrRecord
     *        The pointer (PTR) record for the IP address.
     */

    public void setPtrRecord(String ptrRecord) {
        this.ptrRecord = ptrRecord;
    }

    /**
     * <p>
     * The pointer (PTR) record for the IP address.
     * </p>
     * 
     * @return The pointer (PTR) record for the IP address.
     */

    public String getPtrRecord() {
        return this.ptrRecord;
    }

    /**
     * <p>
     * The pointer (PTR) record for the IP address.
     * </p>
     * 
     * @param ptrRecord
     *        The pointer (PTR) record for the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressAttribute withPtrRecord(String ptrRecord) {
        setPtrRecord(ptrRecord);
        return this;
    }

    /**
     * <p>
     * The updated PTR record for the IP address.
     * </p>
     * 
     * @param ptrRecordUpdate
     *        The updated PTR record for the IP address.
     */

    public void setPtrRecordUpdate(PtrUpdateStatus ptrRecordUpdate) {
        this.ptrRecordUpdate = ptrRecordUpdate;
    }

    /**
     * <p>
     * The updated PTR record for the IP address.
     * </p>
     * 
     * @return The updated PTR record for the IP address.
     */

    public PtrUpdateStatus getPtrRecordUpdate() {
        return this.ptrRecordUpdate;
    }

    /**
     * <p>
     * The updated PTR record for the IP address.
     * </p>
     * 
     * @param ptrRecordUpdate
     *        The updated PTR record for the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressAttribute withPtrRecordUpdate(PtrUpdateStatus ptrRecordUpdate) {
        setPtrRecordUpdate(ptrRecordUpdate);
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
        if (getPublicIp() != null)
            sb.append("PublicIp: ").append(getPublicIp()).append(",");
        if (getAllocationId() != null)
            sb.append("AllocationId: ").append(getAllocationId()).append(",");
        if (getPtrRecord() != null)
            sb.append("PtrRecord: ").append(getPtrRecord()).append(",");
        if (getPtrRecordUpdate() != null)
            sb.append("PtrRecordUpdate: ").append(getPtrRecordUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddressAttribute == false)
            return false;
        AddressAttribute other = (AddressAttribute) obj;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getPtrRecord() == null ^ this.getPtrRecord() == null)
            return false;
        if (other.getPtrRecord() != null && other.getPtrRecord().equals(this.getPtrRecord()) == false)
            return false;
        if (other.getPtrRecordUpdate() == null ^ this.getPtrRecordUpdate() == null)
            return false;
        if (other.getPtrRecordUpdate() != null && other.getPtrRecordUpdate().equals(this.getPtrRecordUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode + ((getPtrRecord() == null) ? 0 : getPtrRecord().hashCode());
        hashCode = prime * hashCode + ((getPtrRecordUpdate() == null) ? 0 : getPtrRecordUpdate().hashCode());
        return hashCode;
    }

    @Override
    public AddressAttribute clone() {
        try {
            return (AddressAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
