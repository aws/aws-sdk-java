/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Details on the Elastic IP address transfer. For more information, see <a
 * href="https://docs.aws.amazon.com/vpc/latest/userguide/vpc-eips.html#transfer-EIPs-intro">Transfer Elastic IP
 * addresses</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AddressTransfer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddressTransfer implements Serializable, Cloneable {

    /**
     * <p>
     * The Elastic IP address being transferred.
     * </p>
     */
    private String publicIp;
    /**
     * <p>
     * The allocation ID of an Elastic IP address.
     * </p>
     */
    private String allocationId;
    /**
     * <p>
     * The ID of the account that you want to transfer the Elastic IP address to.
     * </p>
     */
    private String transferAccountId;
    /**
     * <p>
     * The timestamp when the Elastic IP address transfer expired. When the source account starts the transfer, the
     * transfer account has seven hours to allocate the Elastic IP address to complete the transfer, or the Elastic IP
     * address will return to its original owner.
     * </p>
     */
    private java.util.Date transferOfferExpirationTimestamp;
    /**
     * <p>
     * The timestamp when the Elastic IP address transfer was accepted.
     * </p>
     */
    private java.util.Date transferOfferAcceptedTimestamp;
    /**
     * <p>
     * The Elastic IP address transfer status.
     * </p>
     */
    private String addressTransferStatus;

    /**
     * <p>
     * The Elastic IP address being transferred.
     * </p>
     * 
     * @param publicIp
     *        The Elastic IP address being transferred.
     */

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The Elastic IP address being transferred.
     * </p>
     * 
     * @return The Elastic IP address being transferred.
     */

    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * <p>
     * The Elastic IP address being transferred.
     * </p>
     * 
     * @param publicIp
     *        The Elastic IP address being transferred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressTransfer withPublicIp(String publicIp) {
        setPublicIp(publicIp);
        return this;
    }

    /**
     * <p>
     * The allocation ID of an Elastic IP address.
     * </p>
     * 
     * @param allocationId
     *        The allocation ID of an Elastic IP address.
     */

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * The allocation ID of an Elastic IP address.
     * </p>
     * 
     * @return The allocation ID of an Elastic IP address.
     */

    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * <p>
     * The allocation ID of an Elastic IP address.
     * </p>
     * 
     * @param allocationId
     *        The allocation ID of an Elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressTransfer withAllocationId(String allocationId) {
        setAllocationId(allocationId);
        return this;
    }

    /**
     * <p>
     * The ID of the account that you want to transfer the Elastic IP address to.
     * </p>
     * 
     * @param transferAccountId
     *        The ID of the account that you want to transfer the Elastic IP address to.
     */

    public void setTransferAccountId(String transferAccountId) {
        this.transferAccountId = transferAccountId;
    }

    /**
     * <p>
     * The ID of the account that you want to transfer the Elastic IP address to.
     * </p>
     * 
     * @return The ID of the account that you want to transfer the Elastic IP address to.
     */

    public String getTransferAccountId() {
        return this.transferAccountId;
    }

    /**
     * <p>
     * The ID of the account that you want to transfer the Elastic IP address to.
     * </p>
     * 
     * @param transferAccountId
     *        The ID of the account that you want to transfer the Elastic IP address to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressTransfer withTransferAccountId(String transferAccountId) {
        setTransferAccountId(transferAccountId);
        return this;
    }

    /**
     * <p>
     * The timestamp when the Elastic IP address transfer expired. When the source account starts the transfer, the
     * transfer account has seven hours to allocate the Elastic IP address to complete the transfer, or the Elastic IP
     * address will return to its original owner.
     * </p>
     * 
     * @param transferOfferExpirationTimestamp
     *        The timestamp when the Elastic IP address transfer expired. When the source account starts the transfer,
     *        the transfer account has seven hours to allocate the Elastic IP address to complete the transfer, or the
     *        Elastic IP address will return to its original owner.
     */

    public void setTransferOfferExpirationTimestamp(java.util.Date transferOfferExpirationTimestamp) {
        this.transferOfferExpirationTimestamp = transferOfferExpirationTimestamp;
    }

    /**
     * <p>
     * The timestamp when the Elastic IP address transfer expired. When the source account starts the transfer, the
     * transfer account has seven hours to allocate the Elastic IP address to complete the transfer, or the Elastic IP
     * address will return to its original owner.
     * </p>
     * 
     * @return The timestamp when the Elastic IP address transfer expired. When the source account starts the transfer,
     *         the transfer account has seven hours to allocate the Elastic IP address to complete the transfer, or the
     *         Elastic IP address will return to its original owner.
     */

    public java.util.Date getTransferOfferExpirationTimestamp() {
        return this.transferOfferExpirationTimestamp;
    }

    /**
     * <p>
     * The timestamp when the Elastic IP address transfer expired. When the source account starts the transfer, the
     * transfer account has seven hours to allocate the Elastic IP address to complete the transfer, or the Elastic IP
     * address will return to its original owner.
     * </p>
     * 
     * @param transferOfferExpirationTimestamp
     *        The timestamp when the Elastic IP address transfer expired. When the source account starts the transfer,
     *        the transfer account has seven hours to allocate the Elastic IP address to complete the transfer, or the
     *        Elastic IP address will return to its original owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressTransfer withTransferOfferExpirationTimestamp(java.util.Date transferOfferExpirationTimestamp) {
        setTransferOfferExpirationTimestamp(transferOfferExpirationTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp when the Elastic IP address transfer was accepted.
     * </p>
     * 
     * @param transferOfferAcceptedTimestamp
     *        The timestamp when the Elastic IP address transfer was accepted.
     */

    public void setTransferOfferAcceptedTimestamp(java.util.Date transferOfferAcceptedTimestamp) {
        this.transferOfferAcceptedTimestamp = transferOfferAcceptedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the Elastic IP address transfer was accepted.
     * </p>
     * 
     * @return The timestamp when the Elastic IP address transfer was accepted.
     */

    public java.util.Date getTransferOfferAcceptedTimestamp() {
        return this.transferOfferAcceptedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the Elastic IP address transfer was accepted.
     * </p>
     * 
     * @param transferOfferAcceptedTimestamp
     *        The timestamp when the Elastic IP address transfer was accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddressTransfer withTransferOfferAcceptedTimestamp(java.util.Date transferOfferAcceptedTimestamp) {
        setTransferOfferAcceptedTimestamp(transferOfferAcceptedTimestamp);
        return this;
    }

    /**
     * <p>
     * The Elastic IP address transfer status.
     * </p>
     * 
     * @param addressTransferStatus
     *        The Elastic IP address transfer status.
     * @see AddressTransferStatus
     */

    public void setAddressTransferStatus(String addressTransferStatus) {
        this.addressTransferStatus = addressTransferStatus;
    }

    /**
     * <p>
     * The Elastic IP address transfer status.
     * </p>
     * 
     * @return The Elastic IP address transfer status.
     * @see AddressTransferStatus
     */

    public String getAddressTransferStatus() {
        return this.addressTransferStatus;
    }

    /**
     * <p>
     * The Elastic IP address transfer status.
     * </p>
     * 
     * @param addressTransferStatus
     *        The Elastic IP address transfer status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressTransferStatus
     */

    public AddressTransfer withAddressTransferStatus(String addressTransferStatus) {
        setAddressTransferStatus(addressTransferStatus);
        return this;
    }

    /**
     * <p>
     * The Elastic IP address transfer status.
     * </p>
     * 
     * @param addressTransferStatus
     *        The Elastic IP address transfer status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressTransferStatus
     */

    public AddressTransfer withAddressTransferStatus(AddressTransferStatus addressTransferStatus) {
        this.addressTransferStatus = addressTransferStatus.toString();
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
        if (getTransferAccountId() != null)
            sb.append("TransferAccountId: ").append(getTransferAccountId()).append(",");
        if (getTransferOfferExpirationTimestamp() != null)
            sb.append("TransferOfferExpirationTimestamp: ").append(getTransferOfferExpirationTimestamp()).append(",");
        if (getTransferOfferAcceptedTimestamp() != null)
            sb.append("TransferOfferAcceptedTimestamp: ").append(getTransferOfferAcceptedTimestamp()).append(",");
        if (getAddressTransferStatus() != null)
            sb.append("AddressTransferStatus: ").append(getAddressTransferStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddressTransfer == false)
            return false;
        AddressTransfer other = (AddressTransfer) obj;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getTransferAccountId() == null ^ this.getTransferAccountId() == null)
            return false;
        if (other.getTransferAccountId() != null && other.getTransferAccountId().equals(this.getTransferAccountId()) == false)
            return false;
        if (other.getTransferOfferExpirationTimestamp() == null ^ this.getTransferOfferExpirationTimestamp() == null)
            return false;
        if (other.getTransferOfferExpirationTimestamp() != null
                && other.getTransferOfferExpirationTimestamp().equals(this.getTransferOfferExpirationTimestamp()) == false)
            return false;
        if (other.getTransferOfferAcceptedTimestamp() == null ^ this.getTransferOfferAcceptedTimestamp() == null)
            return false;
        if (other.getTransferOfferAcceptedTimestamp() != null
                && other.getTransferOfferAcceptedTimestamp().equals(this.getTransferOfferAcceptedTimestamp()) == false)
            return false;
        if (other.getAddressTransferStatus() == null ^ this.getAddressTransferStatus() == null)
            return false;
        if (other.getAddressTransferStatus() != null && other.getAddressTransferStatus().equals(this.getAddressTransferStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode + ((getTransferAccountId() == null) ? 0 : getTransferAccountId().hashCode());
        hashCode = prime * hashCode + ((getTransferOfferExpirationTimestamp() == null) ? 0 : getTransferOfferExpirationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getTransferOfferAcceptedTimestamp() == null) ? 0 : getTransferOfferAcceptedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getAddressTransferStatus() == null) ? 0 : getAddressTransferStatus().hashCode());
        return hashCode;
    }

    @Override
    public AddressTransfer clone() {
        try {
            return (AddressTransfer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
