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
 * The contract or wallet address by which to filter the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ContractFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContractFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The blockchain network of the contract.
     * </p>
     */
    private String network;
    /**
     * <p>
     * The container for the token standard.
     * </p>
     */
    private String tokenStandard;
    /**
     * <p>
     * The network address of the deployer.
     * </p>
     */
    private String deployerAddress;

    /**
     * <p>
     * The blockchain network of the contract.
     * </p>
     * 
     * @param network
     *        The blockchain network of the contract.
     * @see QueryNetwork
     */

    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * <p>
     * The blockchain network of the contract.
     * </p>
     * 
     * @return The blockchain network of the contract.
     * @see QueryNetwork
     */

    public String getNetwork() {
        return this.network;
    }

    /**
     * <p>
     * The blockchain network of the contract.
     * </p>
     * 
     * @param network
     *        The blockchain network of the contract.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryNetwork
     */

    public ContractFilter withNetwork(String network) {
        setNetwork(network);
        return this;
    }

    /**
     * <p>
     * The blockchain network of the contract.
     * </p>
     * 
     * @param network
     *        The blockchain network of the contract.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryNetwork
     */

    public ContractFilter withNetwork(QueryNetwork network) {
        this.network = network.toString();
        return this;
    }

    /**
     * <p>
     * The container for the token standard.
     * </p>
     * 
     * @param tokenStandard
     *        The container for the token standard.
     * @see QueryTokenStandard
     */

    public void setTokenStandard(String tokenStandard) {
        this.tokenStandard = tokenStandard;
    }

    /**
     * <p>
     * The container for the token standard.
     * </p>
     * 
     * @return The container for the token standard.
     * @see QueryTokenStandard
     */

    public String getTokenStandard() {
        return this.tokenStandard;
    }

    /**
     * <p>
     * The container for the token standard.
     * </p>
     * 
     * @param tokenStandard
     *        The container for the token standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryTokenStandard
     */

    public ContractFilter withTokenStandard(String tokenStandard) {
        setTokenStandard(tokenStandard);
        return this;
    }

    /**
     * <p>
     * The container for the token standard.
     * </p>
     * 
     * @param tokenStandard
     *        The container for the token standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryTokenStandard
     */

    public ContractFilter withTokenStandard(QueryTokenStandard tokenStandard) {
        this.tokenStandard = tokenStandard.toString();
        return this;
    }

    /**
     * <p>
     * The network address of the deployer.
     * </p>
     * 
     * @param deployerAddress
     *        The network address of the deployer.
     */

    public void setDeployerAddress(String deployerAddress) {
        this.deployerAddress = deployerAddress;
    }

    /**
     * <p>
     * The network address of the deployer.
     * </p>
     * 
     * @return The network address of the deployer.
     */

    public String getDeployerAddress() {
        return this.deployerAddress;
    }

    /**
     * <p>
     * The network address of the deployer.
     * </p>
     * 
     * @param deployerAddress
     *        The network address of the deployer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContractFilter withDeployerAddress(String deployerAddress) {
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
        if (getNetwork() != null)
            sb.append("Network: ").append(getNetwork()).append(",");
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

        if (obj instanceof ContractFilter == false)
            return false;
        ContractFilter other = (ContractFilter) obj;
        if (other.getNetwork() == null ^ this.getNetwork() == null)
            return false;
        if (other.getNetwork() != null && other.getNetwork().equals(this.getNetwork()) == false)
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

        hashCode = prime * hashCode + ((getNetwork() == null) ? 0 : getNetwork().hashCode());
        hashCode = prime * hashCode + ((getTokenStandard() == null) ? 0 : getTokenStandard().hashCode());
        hashCode = prime * hashCode + ((getDeployerAddress() == null) ? 0 : getDeployerAddress().hashCode());
        return hashCode;
    }

    @Override
    public ContractFilter clone() {
        try {
            return (ContractFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchainquery.model.transform.ContractFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
