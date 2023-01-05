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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ValidateE911Address" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateE911AddressResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Number indicating the result of address validation. <code>0</code> means the address was perfect as is and
     * successfully validated. <code>1</code> means the address was corrected. <code>2</code> means the address sent was
     * not close enough and was not validated.
     * </p>
     */
    private Integer validationResult;
    /**
     * <p>
     * The ID that represents the address.
     * </p>
     */
    private String addressExternalId;
    /**
     * <p>
     * The validated address.
     * </p>
     */
    private Address address;
    /**
     * <p>
     * The list of address suggestions.
     * </p>
     */
    private java.util.List<CandidateAddress> candidateAddressList;

    /**
     * <p>
     * Number indicating the result of address validation. <code>0</code> means the address was perfect as is and
     * successfully validated. <code>1</code> means the address was corrected. <code>2</code> means the address sent was
     * not close enough and was not validated.
     * </p>
     * 
     * @param validationResult
     *        Number indicating the result of address validation. <code>0</code> means the address was perfect as is and
     *        successfully validated. <code>1</code> means the address was corrected. <code>2</code> means the address
     *        sent was not close enough and was not validated.
     */

    public void setValidationResult(Integer validationResult) {
        this.validationResult = validationResult;
    }

    /**
     * <p>
     * Number indicating the result of address validation. <code>0</code> means the address was perfect as is and
     * successfully validated. <code>1</code> means the address was corrected. <code>2</code> means the address sent was
     * not close enough and was not validated.
     * </p>
     * 
     * @return Number indicating the result of address validation. <code>0</code> means the address was perfect as is
     *         and successfully validated. <code>1</code> means the address was corrected. <code>2</code> means the
     *         address sent was not close enough and was not validated.
     */

    public Integer getValidationResult() {
        return this.validationResult;
    }

    /**
     * <p>
     * Number indicating the result of address validation. <code>0</code> means the address was perfect as is and
     * successfully validated. <code>1</code> means the address was corrected. <code>2</code> means the address sent was
     * not close enough and was not validated.
     * </p>
     * 
     * @param validationResult
     *        Number indicating the result of address validation. <code>0</code> means the address was perfect as is and
     *        successfully validated. <code>1</code> means the address was corrected. <code>2</code> means the address
     *        sent was not close enough and was not validated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateE911AddressResult withValidationResult(Integer validationResult) {
        setValidationResult(validationResult);
        return this;
    }

    /**
     * <p>
     * The ID that represents the address.
     * </p>
     * 
     * @param addressExternalId
     *        The ID that represents the address.
     */

    public void setAddressExternalId(String addressExternalId) {
        this.addressExternalId = addressExternalId;
    }

    /**
     * <p>
     * The ID that represents the address.
     * </p>
     * 
     * @return The ID that represents the address.
     */

    public String getAddressExternalId() {
        return this.addressExternalId;
    }

    /**
     * <p>
     * The ID that represents the address.
     * </p>
     * 
     * @param addressExternalId
     *        The ID that represents the address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateE911AddressResult withAddressExternalId(String addressExternalId) {
        setAddressExternalId(addressExternalId);
        return this;
    }

    /**
     * <p>
     * The validated address.
     * </p>
     * 
     * @param address
     *        The validated address.
     */

    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * <p>
     * The validated address.
     * </p>
     * 
     * @return The validated address.
     */

    public Address getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The validated address.
     * </p>
     * 
     * @param address
     *        The validated address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateE911AddressResult withAddress(Address address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The list of address suggestions.
     * </p>
     * 
     * @return The list of address suggestions.
     */

    public java.util.List<CandidateAddress> getCandidateAddressList() {
        return candidateAddressList;
    }

    /**
     * <p>
     * The list of address suggestions.
     * </p>
     * 
     * @param candidateAddressList
     *        The list of address suggestions.
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
     * The list of address suggestions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCandidateAddressList(java.util.Collection)} or {@link #withCandidateAddressList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param candidateAddressList
     *        The list of address suggestions.
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
     * <p>
     * The list of address suggestions.
     * </p>
     * 
     * @param candidateAddressList
     *        The list of address suggestions.
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
