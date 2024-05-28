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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/GetAssetContract"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssetContractResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the blockchain address and network information about the contract.
     * </p>
     */
    private ContractIdentifier contractIdentifier;
    /**
     * <p>
     * The token standard of the contract requested.
     * </p>
     */
    private String tokenStandard;
    /**
     * <p>
     * The address of the deployer of contract.
     * </p>
     */
    private String deployerAddress;

    private ContractMetadata metadata;

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

    public GetAssetContractResult withContractIdentifier(ContractIdentifier contractIdentifier) {
        setContractIdentifier(contractIdentifier);
        return this;
    }

    /**
     * <p>
     * The token standard of the contract requested.
     * </p>
     * 
     * @param tokenStandard
     *        The token standard of the contract requested.
     * @see QueryTokenStandard
     */

    public void setTokenStandard(String tokenStandard) {
        this.tokenStandard = tokenStandard;
    }

    /**
     * <p>
     * The token standard of the contract requested.
     * </p>
     * 
     * @return The token standard of the contract requested.
     * @see QueryTokenStandard
     */

    public String getTokenStandard() {
        return this.tokenStandard;
    }

    /**
     * <p>
     * The token standard of the contract requested.
     * </p>
     * 
     * @param tokenStandard
     *        The token standard of the contract requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryTokenStandard
     */

    public GetAssetContractResult withTokenStandard(String tokenStandard) {
        setTokenStandard(tokenStandard);
        return this;
    }

    /**
     * <p>
     * The token standard of the contract requested.
     * </p>
     * 
     * @param tokenStandard
     *        The token standard of the contract requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryTokenStandard
     */

    public GetAssetContractResult withTokenStandard(QueryTokenStandard tokenStandard) {
        this.tokenStandard = tokenStandard.toString();
        return this;
    }

    /**
     * <p>
     * The address of the deployer of contract.
     * </p>
     * 
     * @param deployerAddress
     *        The address of the deployer of contract.
     */

    public void setDeployerAddress(String deployerAddress) {
        this.deployerAddress = deployerAddress;
    }

    /**
     * <p>
     * The address of the deployer of contract.
     * </p>
     * 
     * @return The address of the deployer of contract.
     */

    public String getDeployerAddress() {
        return this.deployerAddress;
    }

    /**
     * <p>
     * The address of the deployer of contract.
     * </p>
     * 
     * @param deployerAddress
     *        The address of the deployer of contract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetContractResult withDeployerAddress(String deployerAddress) {
        setDeployerAddress(deployerAddress);
        return this;
    }

    /**
     * @param metadata
     */

    public void setMetadata(ContractMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * @return
     */

    public ContractMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * @param metadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetContractResult withMetadata(ContractMetadata metadata) {
        setMetadata(metadata);
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
            sb.append("ContractIdentifier: ").append(getContractIdentifier()).append(",");
        if (getTokenStandard() != null)
            sb.append("TokenStandard: ").append(getTokenStandard()).append(",");
        if (getDeployerAddress() != null)
            sb.append("DeployerAddress: ").append(getDeployerAddress()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssetContractResult == false)
            return false;
        GetAssetContractResult other = (GetAssetContractResult) obj;
        if (other.getContractIdentifier() == null ^ this.getContractIdentifier() == null)
            return false;
        if (other.getContractIdentifier() != null && other.getContractIdentifier().equals(this.getContractIdentifier()) == false)
            return false;
        if (other.getTokenStandard() == null ^ this.getTokenStandard() == null)
            return false;
        if (other.getTokenStandard() != null && other.getTokenStandard().equals(this.getTokenStandard()) == false)
            return false;
        if (other.getDeployerAddress() == null ^ this.getDeployerAddress() == null)
            return false;
        if (other.getDeployerAddress() != null && other.getDeployerAddress().equals(this.getDeployerAddress()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContractIdentifier() == null) ? 0 : getContractIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTokenStandard() == null) ? 0 : getTokenStandard().hashCode());
        hashCode = prime * hashCode + ((getDeployerAddress() == null) ? 0 : getDeployerAddress().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        return hashCode;
    }

    @Override
    public GetAssetContractResult clone() {
        try {
            return (GetAssetContractResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
