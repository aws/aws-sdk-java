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
package com.amazonaws.services.managedblockchainquery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/GetAssetContract"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssetContractRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the blockchain address and network information about the contract.
     * </p>
     */
    private ContractIdentifier contractIdentifier;

    /**
     * <p>
     * Contains the blockchain address and network information about the contract.
     * </p>
     * 
     * @param contractIdentifier
     *        Contains the blockchain address and network information about the contract.
     */

    public void setContractIdentifier(ContractIdentifier contractIdentifier) {
        this.contractIdentifier = contractIdentifier;
    }

    /**
     * <p>
     * Contains the blockchain address and network information about the contract.
     * </p>
     * 
     * @return Contains the blockchain address and network information about the contract.
     */

    public ContractIdentifier getContractIdentifier() {
        return this.contractIdentifier;
    }

    /**
     * <p>
     * Contains the blockchain address and network information about the contract.
     * </p>
     * 
     * @param contractIdentifier
     *        Contains the blockchain address and network information about the contract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetContractRequest withContractIdentifier(ContractIdentifier contractIdentifier) {
        setContractIdentifier(contractIdentifier);
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
        if (getContractIdentifier() != null)
            sb.append("ContractIdentifier: ").append(getContractIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssetContractRequest == false)
            return false;
        GetAssetContractRequest other = (GetAssetContractRequest) obj;
        if (other.getContractIdentifier() == null ^ this.getContractIdentifier() == null)
            return false;
        if (other.getContractIdentifier() != null && other.getContractIdentifier().equals(this.getContractIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContractIdentifier() == null) ? 0 : getContractIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetAssetContractRequest clone() {
        return (GetAssetContractRequest) super.clone();
    }

}
