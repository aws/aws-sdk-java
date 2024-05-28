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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This container contains information about an contract.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/AssetContract"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetContract implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The container for the contract identifier containing its blockchain network and address.
     * </p>
     */
    private ContractIdentifier contractIdentifier;
    /**
     * <p>
     * The token standard of the contract.
     * </p>
     */
    private String tokenStandard;
    /**
     * <p>
     * The address of the contract deployer.
     * </p>
     */
    private String deployerAddress;

    /**
     * <p>
     * The container for the contract identifier containing its blockchain network and address.
     * </p>
     * 
     * @param contractIdentifier
     *        The container for the contract identifier containing its blockchain network and address.
     */

    public void setContractIdentifier(ContractIdentifier contractIdentifier) {
        this.contractIdentifier = contractIdentifier;
    }

    /**
     * <p>
     * The container for the contract identifier containing its blockchain network and address.
     * </p>
     * 
     * @return The container for the contract identifier containing its blockchain network and address.
     */

    public ContractIdentifier getContractIdentifier() {
        return this.contractIdentifier;
    }

    /**
     * <p>
     * The container for the contract identifier containing its blockchain network and address.
     * </p>
     * 
     * @param contractIdentifier
     *        The container for the contract identifier containing its blockchain network and address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetContract withContractIdentifier(ContractIdentifier contractIdentifier) {
        setContractIdentifier(contractIdentifier);
        return this;
    }

    /**
     * <p>
     * The token standard of the contract.
     * </p>
     * 
     * @param tokenStandard
     *        The token standard of the contract.
     * @see QueryTokenStandard
     */

    public void setTokenStandard(String tokenStandard) {
        this.tokenStandard = tokenStandard;
    }

    /**
     * <p>
     * The token standard of the contract.
     * </p>
     * 
     * @return The token standard of the contract.
     * @see QueryTokenStandard
     */

    public String getTokenStandard() {
        return this.tokenStandard;
    }

    /**
     * <p>
     * The token standard of the contract.
     * </p>
     * 
     * @param tokenStandard
     *        The token standard of the contract.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryTokenStandard
     */

    public AssetContract withTokenStandard(String tokenStandard) {
        setTokenStandard(tokenStandard);
        return this;
    }

    /**
     * <p>
     * The token standard of the contract.
     * </p>
     * 
     * @param tokenStandard
     *        The token standard of the contract.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryTokenStandard
     */

    public AssetContract withTokenStandard(QueryTokenStandard tokenStandard) {
        this.tokenStandard = tokenStandard.toString();
        return this;
    }

    /**
     * <p>
     * The address of the contract deployer.
     * </p>
     * 
     * @param deployerAddress
     *        The address of the contract deployer.
     */

    public void setDeployerAddress(String deployerAddress) {
        this.deployerAddress = deployerAddress;
    }

    /**
     * <p>
     * The address of the contract deployer.
     * </p>
     * 
     * @return The address of the contract deployer.
     */

    public String getDeployerAddress() {
        return this.deployerAddress;
    }

    /**
     * <p>
     * The address of the contract deployer.
     * </p>
     * 
     * @param deployerAddress
     *        The address of the contract deployer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetContract withDeployerAddress(String deployerAddress) {
        setDeployerAddress(deployerAddress);
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
            sb.append("DeployerAddress: ").append(getDeployerAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetContract == false)
            return false;
        AssetContract other = (AssetContract) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContractIdentifier() == null) ? 0 : getContractIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTokenStandard() == null) ? 0 : getTokenStandard().hashCode());
        hashCode = prime * hashCode + ((getDeployerAddress() == null) ? 0 : getDeployerAddress().hashCode());
        return hashCode;
    }

    @Override
    public AssetContract clone() {
        try {
            return (AssetContract) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchainquery.model.transform.AssetContractMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
