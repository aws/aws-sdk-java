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
 * Configuration properties of a node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/NodeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Managed Blockchain instance type for the node.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The Availability Zone in which the node exists. Required for Ethereum nodes.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * Configuration properties for logging events associated with a peer node on a Hyperledger Fabric network on
     * Managed Blockchain.
     * </p>
     */
    private NodeLogPublishingConfiguration logPublishingConfiguration;
    /**
     * <p>
     * The state database that the node uses. Values are <code>LevelDB</code> or <code>CouchDB</code>. When using an
     * Amazon Managed Blockchain network with Hyperledger Fabric version 1.4 or later, the default is
     * <code>CouchDB</code>.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     */
    private String stateDB;

    /**
     * <p>
     * The Amazon Managed Blockchain instance type for the node.
     * </p>
     * 
     * @param instanceType
     *        The Amazon Managed Blockchain instance type for the node.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The Amazon Managed Blockchain instance type for the node.
     * </p>
     * 
     * @return The Amazon Managed Blockchain instance type for the node.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The Amazon Managed Blockchain instance type for the node.
     * </p>
     * 
     * @param instanceType
     *        The Amazon Managed Blockchain instance type for the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeConfiguration withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which the node exists. Required for Ethereum nodes.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the node exists. Required for Ethereum nodes.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the node exists. Required for Ethereum nodes.
     * </p>
     * 
     * @return The Availability Zone in which the node exists. Required for Ethereum nodes.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the node exists. Required for Ethereum nodes.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the node exists. Required for Ethereum nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeConfiguration withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * Configuration properties for logging events associated with a peer node on a Hyperledger Fabric network on
     * Managed Blockchain.
     * </p>
     * 
     * @param logPublishingConfiguration
     *        Configuration properties for logging events associated with a peer node on a Hyperledger Fabric network on
     *        Managed Blockchain.
     */

    public void setLogPublishingConfiguration(NodeLogPublishingConfiguration logPublishingConfiguration) {
        this.logPublishingConfiguration = logPublishingConfiguration;
    }

    /**
     * <p>
     * Configuration properties for logging events associated with a peer node on a Hyperledger Fabric network on
     * Managed Blockchain.
     * </p>
     * 
     * @return Configuration properties for logging events associated with a peer node on a Hyperledger Fabric network
     *         on Managed Blockchain.
     */

    public NodeLogPublishingConfiguration getLogPublishingConfiguration() {
        return this.logPublishingConfiguration;
    }

    /**
     * <p>
     * Configuration properties for logging events associated with a peer node on a Hyperledger Fabric network on
     * Managed Blockchain.
     * </p>
     * 
     * @param logPublishingConfiguration
     *        Configuration properties for logging events associated with a peer node on a Hyperledger Fabric network on
     *        Managed Blockchain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeConfiguration withLogPublishingConfiguration(NodeLogPublishingConfiguration logPublishingConfiguration) {
        setLogPublishingConfiguration(logPublishingConfiguration);
        return this;
    }

    /**
     * <p>
     * The state database that the node uses. Values are <code>LevelDB</code> or <code>CouchDB</code>. When using an
     * Amazon Managed Blockchain network with Hyperledger Fabric version 1.4 or later, the default is
     * <code>CouchDB</code>.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param stateDB
     *        The state database that the node uses. Values are <code>LevelDB</code> or <code>CouchDB</code>. When using
     *        an Amazon Managed Blockchain network with Hyperledger Fabric version 1.4 or later, the default is
     *        <code>CouchDB</code>.</p>
     *        <p>
     *        Applies only to Hyperledger Fabric.
     * @see StateDBType
     */

    public void setStateDB(String stateDB) {
        this.stateDB = stateDB;
    }

    /**
     * <p>
     * The state database that the node uses. Values are <code>LevelDB</code> or <code>CouchDB</code>. When using an
     * Amazon Managed Blockchain network with Hyperledger Fabric version 1.4 or later, the default is
     * <code>CouchDB</code>.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @return The state database that the node uses. Values are <code>LevelDB</code> or <code>CouchDB</code>. When
     *         using an Amazon Managed Blockchain network with Hyperledger Fabric version 1.4 or later, the default is
     *         <code>CouchDB</code>.</p>
     *         <p>
     *         Applies only to Hyperledger Fabric.
     * @see StateDBType
     */

    public String getStateDB() {
        return this.stateDB;
    }

    /**
     * <p>
     * The state database that the node uses. Values are <code>LevelDB</code> or <code>CouchDB</code>. When using an
     * Amazon Managed Blockchain network with Hyperledger Fabric version 1.4 or later, the default is
     * <code>CouchDB</code>.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param stateDB
     *        The state database that the node uses. Values are <code>LevelDB</code> or <code>CouchDB</code>. When using
     *        an Amazon Managed Blockchain network with Hyperledger Fabric version 1.4 or later, the default is
     *        <code>CouchDB</code>.</p>
     *        <p>
     *        Applies only to Hyperledger Fabric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateDBType
     */

    public NodeConfiguration withStateDB(String stateDB) {
        setStateDB(stateDB);
        return this;
    }

    /**
     * <p>
     * The state database that the node uses. Values are <code>LevelDB</code> or <code>CouchDB</code>. When using an
     * Amazon Managed Blockchain network with Hyperledger Fabric version 1.4 or later, the default is
     * <code>CouchDB</code>.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param stateDB
     *        The state database that the node uses. Values are <code>LevelDB</code> or <code>CouchDB</code>. When using
     *        an Amazon Managed Blockchain network with Hyperledger Fabric version 1.4 or later, the default is
     *        <code>CouchDB</code>.</p>
     *        <p>
     *        Applies only to Hyperledger Fabric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateDBType
     */

    public NodeConfiguration withStateDB(StateDBType stateDB) {
        this.stateDB = stateDB.toString();
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getLogPublishingConfiguration() != null)
            sb.append("LogPublishingConfiguration: ").append(getLogPublishingConfiguration()).append(",");
        if (getStateDB() != null)
            sb.append("StateDB: ").append(getStateDB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeConfiguration == false)
            return false;
        NodeConfiguration other = (NodeConfiguration) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getLogPublishingConfiguration() == null ^ this.getLogPublishingConfiguration() == null)
            return false;
        if (other.getLogPublishingConfiguration() != null && other.getLogPublishingConfiguration().equals(this.getLogPublishingConfiguration()) == false)
            return false;
        if (other.getStateDB() == null ^ this.getStateDB() == null)
            return false;
        if (other.getStateDB() != null && other.getStateDB().equals(this.getStateDB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getLogPublishingConfiguration() == null) ? 0 : getLogPublishingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStateDB() == null) ? 0 : getStateDB().hashCode());
        return hashCode;
    }

    @Override
    public NodeConfiguration clone() {
        try {
            return (NodeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.NodeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
