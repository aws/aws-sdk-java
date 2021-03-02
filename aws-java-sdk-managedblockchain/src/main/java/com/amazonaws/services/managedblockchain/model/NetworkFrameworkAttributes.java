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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Attributes relevant to the network for the blockchain framework that the network uses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/NetworkFrameworkAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkFrameworkAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Attributes of Hyperledger Fabric for a Managed Blockchain network that uses Hyperledger Fabric.
     * </p>
     */
    private NetworkFabricAttributes fabric;
    /**
     * <p>
     * Attributes of an Ethereum network for Managed Blockchain resources participating in an Ethereum network.
     * </p>
     */
    private NetworkEthereumAttributes ethereum;

    /**
     * <p>
     * Attributes of Hyperledger Fabric for a Managed Blockchain network that uses Hyperledger Fabric.
     * </p>
     * 
     * @param fabric
     *        Attributes of Hyperledger Fabric for a Managed Blockchain network that uses Hyperledger Fabric.
     */

    public void setFabric(NetworkFabricAttributes fabric) {
        this.fabric = fabric;
    }

    /**
     * <p>
     * Attributes of Hyperledger Fabric for a Managed Blockchain network that uses Hyperledger Fabric.
     * </p>
     * 
     * @return Attributes of Hyperledger Fabric for a Managed Blockchain network that uses Hyperledger Fabric.
     */

    public NetworkFabricAttributes getFabric() {
        return this.fabric;
    }

    /**
     * <p>
     * Attributes of Hyperledger Fabric for a Managed Blockchain network that uses Hyperledger Fabric.
     * </p>
     * 
     * @param fabric
     *        Attributes of Hyperledger Fabric for a Managed Blockchain network that uses Hyperledger Fabric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFrameworkAttributes withFabric(NetworkFabricAttributes fabric) {
        setFabric(fabric);
        return this;
    }

    /**
     * <p>
     * Attributes of an Ethereum network for Managed Blockchain resources participating in an Ethereum network.
     * </p>
     * 
     * @param ethereum
     *        Attributes of an Ethereum network for Managed Blockchain resources participating in an Ethereum network.
     */

    public void setEthereum(NetworkEthereumAttributes ethereum) {
        this.ethereum = ethereum;
    }

    /**
     * <p>
     * Attributes of an Ethereum network for Managed Blockchain resources participating in an Ethereum network.
     * </p>
     * 
     * @return Attributes of an Ethereum network for Managed Blockchain resources participating in an Ethereum network.
     */

    public NetworkEthereumAttributes getEthereum() {
        return this.ethereum;
    }

    /**
     * <p>
     * Attributes of an Ethereum network for Managed Blockchain resources participating in an Ethereum network.
     * </p>
     * 
     * @param ethereum
     *        Attributes of an Ethereum network for Managed Blockchain resources participating in an Ethereum network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFrameworkAttributes withEthereum(NetworkEthereumAttributes ethereum) {
        setEthereum(ethereum);
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
        if (getFabric() != null)
            sb.append("Fabric: ").append(getFabric()).append(",");
        if (getEthereum() != null)
            sb.append("Ethereum: ").append(getEthereum());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkFrameworkAttributes == false)
            return false;
        NetworkFrameworkAttributes other = (NetworkFrameworkAttributes) obj;
        if (other.getFabric() == null ^ this.getFabric() == null)
            return false;
        if (other.getFabric() != null && other.getFabric().equals(this.getFabric()) == false)
            return false;
        if (other.getEthereum() == null ^ this.getEthereum() == null)
            return false;
        if (other.getEthereum() != null && other.getEthereum().equals(this.getEthereum()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFabric() == null) ? 0 : getFabric().hashCode());
        hashCode = prime * hashCode + ((getEthereum() == null) ? 0 : getEthereum().hashCode());
        return hashCode;
    }

    @Override
    public NetworkFrameworkAttributes clone() {
        try {
            return (NetworkFrameworkAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.NetworkFrameworkAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
