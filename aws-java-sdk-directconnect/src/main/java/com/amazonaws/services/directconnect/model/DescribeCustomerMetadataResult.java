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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeCustomerMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCustomerMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of customer agreements.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CustomerAgreement> agreements;
    /**
     * <p>
     * The type of network-to-network interface (NNI) partner. The partner type will be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * V1: This partner can only allocate 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, or 500Mbps subgigabit connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * V2: This partner can only allocate 1GB, 2GB, 5GB, or 10GB hosted connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * nonPartner: The customer is not a partner.
     * </p>
     * </li>
     * </ul>
     */
    private String nniPartnerType;

    /**
     * <p>
     * The list of customer agreements.
     * </p>
     * 
     * @return The list of customer agreements.
     */

    public java.util.List<CustomerAgreement> getAgreements() {
        if (agreements == null) {
            agreements = new com.amazonaws.internal.SdkInternalList<CustomerAgreement>();
        }
        return agreements;
    }

    /**
     * <p>
     * The list of customer agreements.
     * </p>
     * 
     * @param agreements
     *        The list of customer agreements.
     */

    public void setAgreements(java.util.Collection<CustomerAgreement> agreements) {
        if (agreements == null) {
            this.agreements = null;
            return;
        }

        this.agreements = new com.amazonaws.internal.SdkInternalList<CustomerAgreement>(agreements);
    }

    /**
     * <p>
     * The list of customer agreements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgreements(java.util.Collection)} or {@link #withAgreements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agreements
     *        The list of customer agreements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomerMetadataResult withAgreements(CustomerAgreement... agreements) {
        if (this.agreements == null) {
            setAgreements(new com.amazonaws.internal.SdkInternalList<CustomerAgreement>(agreements.length));
        }
        for (CustomerAgreement ele : agreements) {
            this.agreements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of customer agreements.
     * </p>
     * 
     * @param agreements
     *        The list of customer agreements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomerMetadataResult withAgreements(java.util.Collection<CustomerAgreement> agreements) {
        setAgreements(agreements);
        return this;
    }

    /**
     * <p>
     * The type of network-to-network interface (NNI) partner. The partner type will be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * V1: This partner can only allocate 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, or 500Mbps subgigabit connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * V2: This partner can only allocate 1GB, 2GB, 5GB, or 10GB hosted connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * nonPartner: The customer is not a partner.
     * </p>
     * </li>
     * </ul>
     * 
     * @param nniPartnerType
     *        The type of network-to-network interface (NNI) partner. The partner type will be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        V1: This partner can only allocate 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, or 500Mbps subgigabit
     *        connections.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        V2: This partner can only allocate 1GB, 2GB, 5GB, or 10GB hosted connections.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        nonPartner: The customer is not a partner.
     *        </p>
     *        </li>
     * @see NniPartnerType
     */

    public void setNniPartnerType(String nniPartnerType) {
        this.nniPartnerType = nniPartnerType;
    }

    /**
     * <p>
     * The type of network-to-network interface (NNI) partner. The partner type will be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * V1: This partner can only allocate 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, or 500Mbps subgigabit connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * V2: This partner can only allocate 1GB, 2GB, 5GB, or 10GB hosted connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * nonPartner: The customer is not a partner.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of network-to-network interface (NNI) partner. The partner type will be one of the
     *         following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         V1: This partner can only allocate 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, or 500Mbps subgigabit
     *         connections.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         V2: This partner can only allocate 1GB, 2GB, 5GB, or 10GB hosted connections.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         nonPartner: The customer is not a partner.
     *         </p>
     *         </li>
     * @see NniPartnerType
     */

    public String getNniPartnerType() {
        return this.nniPartnerType;
    }

    /**
     * <p>
     * The type of network-to-network interface (NNI) partner. The partner type will be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * V1: This partner can only allocate 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, or 500Mbps subgigabit connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * V2: This partner can only allocate 1GB, 2GB, 5GB, or 10GB hosted connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * nonPartner: The customer is not a partner.
     * </p>
     * </li>
     * </ul>
     * 
     * @param nniPartnerType
     *        The type of network-to-network interface (NNI) partner. The partner type will be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        V1: This partner can only allocate 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, or 500Mbps subgigabit
     *        connections.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        V2: This partner can only allocate 1GB, 2GB, 5GB, or 10GB hosted connections.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        nonPartner: The customer is not a partner.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NniPartnerType
     */

    public DescribeCustomerMetadataResult withNniPartnerType(String nniPartnerType) {
        setNniPartnerType(nniPartnerType);
        return this;
    }

    /**
     * <p>
     * The type of network-to-network interface (NNI) partner. The partner type will be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * V1: This partner can only allocate 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, or 500Mbps subgigabit connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * V2: This partner can only allocate 1GB, 2GB, 5GB, or 10GB hosted connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * nonPartner: The customer is not a partner.
     * </p>
     * </li>
     * </ul>
     * 
     * @param nniPartnerType
     *        The type of network-to-network interface (NNI) partner. The partner type will be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        V1: This partner can only allocate 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, or 500Mbps subgigabit
     *        connections.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        V2: This partner can only allocate 1GB, 2GB, 5GB, or 10GB hosted connections.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        nonPartner: The customer is not a partner.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NniPartnerType
     */

    public DescribeCustomerMetadataResult withNniPartnerType(NniPartnerType nniPartnerType) {
        this.nniPartnerType = nniPartnerType.toString();
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
        if (getAgreements() != null)
            sb.append("Agreements: ").append(getAgreements()).append(",");
        if (getNniPartnerType() != null)
            sb.append("NniPartnerType: ").append(getNniPartnerType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCustomerMetadataResult == false)
            return false;
        DescribeCustomerMetadataResult other = (DescribeCustomerMetadataResult) obj;
        if (other.getAgreements() == null ^ this.getAgreements() == null)
            return false;
        if (other.getAgreements() != null && other.getAgreements().equals(this.getAgreements()) == false)
            return false;
        if (other.getNniPartnerType() == null ^ this.getNniPartnerType() == null)
            return false;
        if (other.getNniPartnerType() != null && other.getNniPartnerType().equals(this.getNniPartnerType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgreements() == null) ? 0 : getAgreements().hashCode());
        hashCode = prime * hashCode + ((getNniPartnerType() == null) ? 0 : getNniPartnerType().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCustomerMetadataResult clone() {
        try {
            return (DescribeCustomerMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
