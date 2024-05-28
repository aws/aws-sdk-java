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
 * Container for the blockchain address and network information about a contract.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ContractIdentifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContractIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The blockchain network of the contract.
     * </p>
     */
    private String network;
    /**
     * <p>
     * Container for the blockchain address about a contract.
     * </p>
     */
    private String contractAddress;

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

    public ContractIdentifier withNetwork(String network) {
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

    public ContractIdentifier withNetwork(QueryNetwork network) {
        this.network = network.toString();
        return this;
    }

    /**
     * <p>
     * Container for the blockchain address about a contract.
     * </p>
     * 
     * @param contractAddress
     *        Container for the blockchain address about a contract.
     */

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    /**
     * <p>
     * Container for the blockchain address about a contract.
     * </p>
     * 
     * @return Container for the blockchain address about a contract.
     */

    public String getContractAddress() {
        return this.contractAddress;
    }

    /**
     * <p>
     * Container for the blockchain address about a contract.
     * </p>
     * 
     * @param contractAddress
     *        Container for the blockchain address about a contract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContractIdentifier withContractAddress(String contractAddress) {
        setContractAddress(contractAddress);
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
        if (getContractAddress() != null)
            sb.append("ContractAddress: ").append(getContractAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContractIdentifier == false)
            return false;
        ContractIdentifier other = (ContractIdentifier) obj;
        if (other.getNetwork() == null ^ this.getNetwork() == null)
            return false;
        if (other.getNetwork() != null && other.getNetwork().equals(this.getNetwork()) == false)
            return false;
        if (other.getContractAddress() == null ^ this.getContractAddress() == null)
            return false;
        if (other.getContractAddress() != null && other.getContractAddress().equals(this.getContractAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetwork() == null) ? 0 : getNetwork().hashCode());
        hashCode = prime * hashCode + ((getContractAddress() == null) ? 0 : getContractAddress().hashCode());
        return hashCode;
    }

    @Override
    public ContractIdentifier clone() {
        try {
            return (ContractIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchainquery.model.transform.ContractIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
