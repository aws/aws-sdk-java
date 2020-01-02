/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Attributes of Hyperledger Fabric for a network.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/NetworkFabricAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkFabricAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The endpoint of the ordering service for the network.
     * </p>
     */
    private String orderingServiceEndpoint;
    /**
     * <p>
     * The edition of Amazon Managed Blockchain that Hyperledger Fabric uses. For more information, see <a
     * href="https://aws.amazon.com/managed-blockchain/pricing/">Amazon Managed Blockchain Pricing</a>.
     * </p>
     */
    private String edition;

    /**
     * <p>
     * The endpoint of the ordering service for the network.
     * </p>
     * 
     * @param orderingServiceEndpoint
     *        The endpoint of the ordering service for the network.
     */

    public void setOrderingServiceEndpoint(String orderingServiceEndpoint) {
        this.orderingServiceEndpoint = orderingServiceEndpoint;
    }

    /**
     * <p>
     * The endpoint of the ordering service for the network.
     * </p>
     * 
     * @return The endpoint of the ordering service for the network.
     */

    public String getOrderingServiceEndpoint() {
        return this.orderingServiceEndpoint;
    }

    /**
     * <p>
     * The endpoint of the ordering service for the network.
     * </p>
     * 
     * @param orderingServiceEndpoint
     *        The endpoint of the ordering service for the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkFabricAttributes withOrderingServiceEndpoint(String orderingServiceEndpoint) {
        setOrderingServiceEndpoint(orderingServiceEndpoint);
        return this;
    }

    /**
     * <p>
     * The edition of Amazon Managed Blockchain that Hyperledger Fabric uses. For more information, see <a
     * href="https://aws.amazon.com/managed-blockchain/pricing/">Amazon Managed Blockchain Pricing</a>.
     * </p>
     * 
     * @param edition
     *        The edition of Amazon Managed Blockchain that Hyperledger Fabric uses. For more information, see <a
     *        href="https://aws.amazon.com/managed-blockchain/pricing/">Amazon Managed Blockchain Pricing</a>.
     * @see Edition
     */

    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * <p>
     * The edition of Amazon Managed Blockchain that Hyperledger Fabric uses. For more information, see <a
     * href="https://aws.amazon.com/managed-blockchain/pricing/">Amazon Managed Blockchain Pricing</a>.
     * </p>
     * 
     * @return The edition of Amazon Managed Blockchain that Hyperledger Fabric uses. For more information, see <a
     *         href="https://aws.amazon.com/managed-blockchain/pricing/">Amazon Managed Blockchain Pricing</a>.
     * @see Edition
     */

    public String getEdition() {
        return this.edition;
    }

    /**
     * <p>
     * The edition of Amazon Managed Blockchain that Hyperledger Fabric uses. For more information, see <a
     * href="https://aws.amazon.com/managed-blockchain/pricing/">Amazon Managed Blockchain Pricing</a>.
     * </p>
     * 
     * @param edition
     *        The edition of Amazon Managed Blockchain that Hyperledger Fabric uses. For more information, see <a
     *        href="https://aws.amazon.com/managed-blockchain/pricing/">Amazon Managed Blockchain Pricing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Edition
     */

    public NetworkFabricAttributes withEdition(String edition) {
        setEdition(edition);
        return this;
    }

    /**
     * <p>
     * The edition of Amazon Managed Blockchain that Hyperledger Fabric uses. For more information, see <a
     * href="https://aws.amazon.com/managed-blockchain/pricing/">Amazon Managed Blockchain Pricing</a>.
     * </p>
     * 
     * @param edition
     *        The edition of Amazon Managed Blockchain that Hyperledger Fabric uses. For more information, see <a
     *        href="https://aws.amazon.com/managed-blockchain/pricing/">Amazon Managed Blockchain Pricing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Edition
     */

    public NetworkFabricAttributes withEdition(Edition edition) {
        this.edition = edition.toString();
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
        if (getOrderingServiceEndpoint() != null)
            sb.append("OrderingServiceEndpoint: ").append(getOrderingServiceEndpoint()).append(",");
        if (getEdition() != null)
            sb.append("Edition: ").append(getEdition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkFabricAttributes == false)
            return false;
        NetworkFabricAttributes other = (NetworkFabricAttributes) obj;
        if (other.getOrderingServiceEndpoint() == null ^ this.getOrderingServiceEndpoint() == null)
            return false;
        if (other.getOrderingServiceEndpoint() != null && other.getOrderingServiceEndpoint().equals(this.getOrderingServiceEndpoint()) == false)
            return false;
        if (other.getEdition() == null ^ this.getEdition() == null)
            return false;
        if (other.getEdition() != null && other.getEdition().equals(this.getEdition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrderingServiceEndpoint() == null) ? 0 : getOrderingServiceEndpoint().hashCode());
        hashCode = prime * hashCode + ((getEdition() == null) ? 0 : getEdition().hashCode());
        return hashCode;
    }

    @Override
    public NetworkFabricAttributes clone() {
        try {
            return (NetworkFabricAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.NetworkFabricAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
