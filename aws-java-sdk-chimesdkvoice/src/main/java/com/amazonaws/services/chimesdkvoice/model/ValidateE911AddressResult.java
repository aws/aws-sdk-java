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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ValidateE911Address"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateE911AddressResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private Integer validationResult;

    private String addressExternalId;

    private Address address;

    private java.util.List<CandidateAddress> candidateAddressList;

    /**
     * @param validationResult
     */

    public void setValidationResult(Integer validationResult) {
        this.validationResult = validationResult;
    }

    /**
     * @return
     */

    public Integer getValidationResult() {
        return this.validationResult;
    }

    /**
     * @param validationResult
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateE911AddressResult withValidationResult(Integer validationResult) {
        setValidationResult(validationResult);
        return this;
    }

    /**
     * @param addressExternalId
     */

    public void setAddressExternalId(String addressExternalId) {
        this.addressExternalId = addressExternalId;
    }

    /**
     * @return
     */

    public String getAddressExternalId() {
        return this.addressExternalId;
    }

    /**
     * @param addressExternalId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateE911AddressResult withAddressExternalId(String addressExternalId) {
        setAddressExternalId(addressExternalId);
        return this;
    }

    /**
     * @param address
     */

    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * @return
     */

    public Address getAddress() {
        return this.address;
    }

    /**
     * @param address
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateE911AddressResult withAddress(Address address) {
        setAddress(address);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<CandidateAddress> getCandidateAddressList() {
        return candidateAddressList;
    }

    /**
     * @param candidateAddressList
     */

    public void setCandidateAddressList(java.util.Collection<CandidateAddress> candidateAddressList) {
        if (candidateAddressList == null) {
            this.candidateAddressList = null;
            return;
        }

        this.candidateAddressList = new java.util.ArrayList<CandidateAddress>(candidateAddressList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCandidateAddressList(java.util.Collection)} or {@link #withCandidateAddressList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param candidateAddressList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateE911AddressResult withCandidateAddressList(CandidateAddress... candidateAddressList) {
        if (this.candidateAddressList == null) {
            setCandidateAddressList(new java.util.ArrayList<CandidateAddress>(candidateAddressList.length));
        }
        for (CandidateAddress ele : candidateAddressList) {
            this.candidateAddressList.add(ele);
        }
        return this;
    }

    /**
     * @param candidateAddressList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateE911AddressResult withCandidateAddressList(java.util.Collection<CandidateAddress> candidateAddressList) {
        setCandidateAddressList(candidateAddressList);
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
        if (getValidationResult() != null)
            sb.append("ValidationResult: ").append(getValidationResult()).append(",");
        if (getAddressExternalId() != null)
            sb.append("AddressExternalId: ").append(getAddressExternalId()).append(",");
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getCandidateAddressList() != null)
            sb.append("CandidateAddressList: ").append(getCandidateAddressList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidateE911AddressResult == false)
            return false;
        ValidateE911AddressResult other = (ValidateE911AddressResult) obj;
        if (other.getValidationResult() == null ^ this.getValidationResult() == null)
            return false;
        if (other.getValidationResult() != null && other.getValidationResult().equals(this.getValidationResult()) == false)
            return false;
        if (other.getAddressExternalId() == null ^ this.getAddressExternalId() == null)
            return false;
        if (other.getAddressExternalId() != null && other.getAddressExternalId().equals(this.getAddressExternalId()) == false)
            return false;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getCandidateAddressList() == null ^ this.getCandidateAddressList() == null)
            return false;
        if (other.getCandidateAddressList() != null && other.getCandidateAddressList().equals(this.getCandidateAddressList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValidationResult() == null) ? 0 : getValidationResult().hashCode());
        hashCode = prime * hashCode + ((getAddressExternalId() == null) ? 0 : getAddressExternalId().hashCode());
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getCandidateAddressList() == null) ? 0 : getCandidateAddressList().hashCode());
        return hashCode;
    }

    @Override
    public ValidateE911AddressResult clone() {
        try {
            return (ValidateE911AddressResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
