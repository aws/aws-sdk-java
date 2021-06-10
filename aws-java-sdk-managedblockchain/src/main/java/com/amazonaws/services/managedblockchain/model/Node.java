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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/Node" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Node implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the network that the node is on.
     * </p>
     */
    private String networkId;
    /**
     * <p>
     * The unique identifier of the member to which the node belongs.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     */
    private String memberId;
    /**
     * <p>
     * The unique identifier of the node.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The instance type of the node.
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
     * Attributes of the blockchain framework being used.
     * </p>
     */
    private NodeFrameworkAttributes frameworkAttributes;
    /**
     * <p>
     * Configuration properties for logging events associated with a peer node on a Hyperledger Fabric network on
     * Managed Blockchain.
     * </p>
     */
    private NodeLogPublishingConfiguration logPublishingConfiguration;
    /**
     * <p>
     * The state database that the node uses. Values are <code>LevelDB</code> or <code>CouchDB</code>.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     */
    private String stateDB;
    /**
     * <p>
     * The status of the node.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The AWS account is in the process of creating a node.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The node has been created and can participate in the network.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code> - The node is impaired and might not function as expected. Amazon Managed Blockchain
     * automatically finds nodes in this state and tries to recover them. If a node is recoverable, it returns to
     * <code>AVAILABLE</code>. Otherwise, it moves to <code>FAILED</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> - The AWS account attempted to create a node and creation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The node is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The node is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - The node can no longer participate on the network.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The node is no longer functional, cannot be recovered, and must be deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACCESSIBLE_ENCRYPTION_KEY</code> - The node is impaired and might not function as expected because it
     * cannot access the specified customer managed key in AWS KMS for encryption at rest. Either the KMS key was
     * disabled or deleted, or the grants on the key were revoked.
     * </p>
     * <p>
     * The effect of disabling or deleting a key, or revoking a grant is not immediate. The node resource might take
     * some time to find that the key is inaccessible. When a resource is in this state, we recommend deleting and
     * recreating the resource.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The date and time that the node was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * Tags assigned to the node. Each tag consists of a key and optional value.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     * >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the node. For more information about ARNs and their format, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) that the node
     * uses for encryption at rest. If the value of this parameter is <code>"AWS Owned KMS Key"</code>, the node uses an
     * AWS owned KMS key for encryption. The node inherits this parameter from the member that it belongs to.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The unique identifier of the network that the node is on.
     * </p>
     * 
     * @param networkId
     *        The unique identifier of the network that the node is on.
     */

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    /**
     * <p>
     * The unique identifier of the network that the node is on.
     * </p>
     * 
     * @return The unique identifier of the network that the node is on.
     */

    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * <p>
     * The unique identifier of the network that the node is on.
     * </p>
     * 
     * @param networkId
     *        The unique identifier of the network that the node is on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withNetworkId(String networkId) {
        setNetworkId(networkId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the member to which the node belongs.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param memberId
     *        The unique identifier of the member to which the node belongs.</p>
     *        <p>
     *        Applies only to Hyperledger Fabric.
     */

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * <p>
     * The unique identifier of the member to which the node belongs.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @return The unique identifier of the member to which the node belongs.</p>
     *         <p>
     *         Applies only to Hyperledger Fabric.
     */

    public String getMemberId() {
        return this.memberId;
    }

    /**
     * <p>
     * The unique identifier of the member to which the node belongs.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param memberId
     *        The unique identifier of the member to which the node belongs.</p>
     *        <p>
     *        Applies only to Hyperledger Fabric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withMemberId(String memberId) {
        setMemberId(memberId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the node.
     * </p>
     * 
     * @param id
     *        The unique identifier of the node.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the node.
     * </p>
     * 
     * @return The unique identifier of the node.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the node.
     * </p>
     * 
     * @param id
     *        The unique identifier of the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The instance type of the node.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the node.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type of the node.
     * </p>
     * 
     * @return The instance type of the node.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type of the node.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withInstanceType(String instanceType) {
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

    public Node withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * Attributes of the blockchain framework being used.
     * </p>
     * 
     * @param frameworkAttributes
     *        Attributes of the blockchain framework being used.
     */

    public void setFrameworkAttributes(NodeFrameworkAttributes frameworkAttributes) {
        this.frameworkAttributes = frameworkAttributes;
    }

    /**
     * <p>
     * Attributes of the blockchain framework being used.
     * </p>
     * 
     * @return Attributes of the blockchain framework being used.
     */

    public NodeFrameworkAttributes getFrameworkAttributes() {
        return this.frameworkAttributes;
    }

    /**
     * <p>
     * Attributes of the blockchain framework being used.
     * </p>
     * 
     * @param frameworkAttributes
     *        Attributes of the blockchain framework being used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withFrameworkAttributes(NodeFrameworkAttributes frameworkAttributes) {
        setFrameworkAttributes(frameworkAttributes);
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

    public Node withLogPublishingConfiguration(NodeLogPublishingConfiguration logPublishingConfiguration) {
        setLogPublishingConfiguration(logPublishingConfiguration);
        return this;
    }

    /**
     * <p>
     * The state database that the node uses. Values are <code>LevelDB</code> or <code>CouchDB</code>.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param stateDB
     *        The state database that the node uses. Values are <code>LevelDB</code> or <code>CouchDB</code>.</p>
     *        <p>
     *        Applies only to Hyperledger Fabric.
     * @see StateDBType
     */

    public void setStateDB(String stateDB) {
        this.stateDB = stateDB;
    }

    /**
     * <p>
     * The state database that the node uses. Values are <code>LevelDB</code> or <code>CouchDB</code>.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @return The state database that the node uses. Values are <code>LevelDB</code> or <code>CouchDB</code>.</p>
     *         <p>
     *         Applies only to Hyperledger Fabric.
     * @see StateDBType
     */

    public String getStateDB() {
        return this.stateDB;
    }

    /**
     * <p>
     * The state database that the node uses. Values are <code>LevelDB</code> or <code>CouchDB</code>.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param stateDB
     *        The state database that the node uses. Values are <code>LevelDB</code> or <code>CouchDB</code>.</p>
     *        <p>
     *        Applies only to Hyperledger Fabric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateDBType
     */

    public Node withStateDB(String stateDB) {
        setStateDB(stateDB);
        return this;
    }

    /**
     * <p>
     * The state database that the node uses. Values are <code>LevelDB</code> or <code>CouchDB</code>.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param stateDB
     *        The state database that the node uses. Values are <code>LevelDB</code> or <code>CouchDB</code>.</p>
     *        <p>
     *        Applies only to Hyperledger Fabric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateDBType
     */

    public Node withStateDB(StateDBType stateDB) {
        this.stateDB = stateDB.toString();
        return this;
    }

    /**
     * <p>
     * The status of the node.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The AWS account is in the process of creating a node.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The node has been created and can participate in the network.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code> - The node is impaired and might not function as expected. Amazon Managed Blockchain
     * automatically finds nodes in this state and tries to recover them. If a node is recoverable, it returns to
     * <code>AVAILABLE</code>. Otherwise, it moves to <code>FAILED</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> - The AWS account attempted to create a node and creation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The node is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The node is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - The node can no longer participate on the network.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The node is no longer functional, cannot be recovered, and must be deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACCESSIBLE_ENCRYPTION_KEY</code> - The node is impaired and might not function as expected because it
     * cannot access the specified customer managed key in AWS KMS for encryption at rest. Either the KMS key was
     * disabled or deleted, or the grants on the key were revoked.
     * </p>
     * <p>
     * The effect of disabling or deleting a key, or revoking a grant is not immediate. The node resource might take
     * some time to find that the key is inaccessible. When a resource is in this state, we recommend deleting and
     * recreating the resource.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the node.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The AWS account is in the process of creating a node.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The node has been created and can participate in the network.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNHEALTHY</code> - The node is impaired and might not function as expected. Amazon Managed
     *        Blockchain automatically finds nodes in this state and tries to recover them. If a node is recoverable, it
     *        returns to <code>AVAILABLE</code>. Otherwise, it moves to <code>FAILED</code> status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> - The AWS account attempted to create a node and creation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The node is in the process of being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The node is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - The node can no longer participate on the network.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The node is no longer functional, cannot be recovered, and must be deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACCESSIBLE_ENCRYPTION_KEY</code> - The node is impaired and might not function as expected because
     *        it cannot access the specified customer managed key in AWS KMS for encryption at rest. Either the KMS key
     *        was disabled or deleted, or the grants on the key were revoked.
     *        </p>
     *        <p>
     *        The effect of disabling or deleting a key, or revoking a grant is not immediate. The node resource might
     *        take some time to find that the key is inaccessible. When a resource is in this state, we recommend
     *        deleting and recreating the resource.
     *        </p>
     *        </li>
     * @see NodeStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the node.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The AWS account is in the process of creating a node.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The node has been created and can participate in the network.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code> - The node is impaired and might not function as expected. Amazon Managed Blockchain
     * automatically finds nodes in this state and tries to recover them. If a node is recoverable, it returns to
     * <code>AVAILABLE</code>. Otherwise, it moves to <code>FAILED</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> - The AWS account attempted to create a node and creation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The node is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The node is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - The node can no longer participate on the network.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The node is no longer functional, cannot be recovered, and must be deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACCESSIBLE_ENCRYPTION_KEY</code> - The node is impaired and might not function as expected because it
     * cannot access the specified customer managed key in AWS KMS for encryption at rest. Either the KMS key was
     * disabled or deleted, or the grants on the key were revoked.
     * </p>
     * <p>
     * The effect of disabling or deleting a key, or revoking a grant is not immediate. The node resource might take
     * some time to find that the key is inaccessible. When a resource is in this state, we recommend deleting and
     * recreating the resource.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the node.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The AWS account is in the process of creating a node.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AVAILABLE</code> - The node has been created and can participate in the network.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNHEALTHY</code> - The node is impaired and might not function as expected. Amazon Managed
     *         Blockchain automatically finds nodes in this state and tries to recover them. If a node is recoverable,
     *         it returns to <code>AVAILABLE</code>. Otherwise, it moves to <code>FAILED</code> status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_FAILED</code> - The AWS account attempted to create a node and creation failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The node is in the process of being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The node is in the process of being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETED</code> - The node can no longer participate on the network.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - The node is no longer functional, cannot be recovered, and must be deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INACCESSIBLE_ENCRYPTION_KEY</code> - The node is impaired and might not function as expected
     *         because it cannot access the specified customer managed key in AWS KMS for encryption at rest. Either the
     *         KMS key was disabled or deleted, or the grants on the key were revoked.
     *         </p>
     *         <p>
     *         The effect of disabling or deleting a key, or revoking a grant is not immediate. The node resource might
     *         take some time to find that the key is inaccessible. When a resource is in this state, we recommend
     *         deleting and recreating the resource.
     *         </p>
     *         </li>
     * @see NodeStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the node.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The AWS account is in the process of creating a node.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The node has been created and can participate in the network.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code> - The node is impaired and might not function as expected. Amazon Managed Blockchain
     * automatically finds nodes in this state and tries to recover them. If a node is recoverable, it returns to
     * <code>AVAILABLE</code>. Otherwise, it moves to <code>FAILED</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> - The AWS account attempted to create a node and creation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The node is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The node is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - The node can no longer participate on the network.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The node is no longer functional, cannot be recovered, and must be deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACCESSIBLE_ENCRYPTION_KEY</code> - The node is impaired and might not function as expected because it
     * cannot access the specified customer managed key in AWS KMS for encryption at rest. Either the KMS key was
     * disabled or deleted, or the grants on the key were revoked.
     * </p>
     * <p>
     * The effect of disabling or deleting a key, or revoking a grant is not immediate. The node resource might take
     * some time to find that the key is inaccessible. When a resource is in this state, we recommend deleting and
     * recreating the resource.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the node.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The AWS account is in the process of creating a node.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The node has been created and can participate in the network.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNHEALTHY</code> - The node is impaired and might not function as expected. Amazon Managed
     *        Blockchain automatically finds nodes in this state and tries to recover them. If a node is recoverable, it
     *        returns to <code>AVAILABLE</code>. Otherwise, it moves to <code>FAILED</code> status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> - The AWS account attempted to create a node and creation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The node is in the process of being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The node is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - The node can no longer participate on the network.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The node is no longer functional, cannot be recovered, and must be deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACCESSIBLE_ENCRYPTION_KEY</code> - The node is impaired and might not function as expected because
     *        it cannot access the specified customer managed key in AWS KMS for encryption at rest. Either the KMS key
     *        was disabled or deleted, or the grants on the key were revoked.
     *        </p>
     *        <p>
     *        The effect of disabling or deleting a key, or revoking a grant is not immediate. The node resource might
     *        take some time to find that the key is inaccessible. When a resource is in this state, we recommend
     *        deleting and recreating the resource.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeStatus
     */

    public Node withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the node.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The AWS account is in the process of creating a node.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The node has been created and can participate in the network.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code> - The node is impaired and might not function as expected. Amazon Managed Blockchain
     * automatically finds nodes in this state and tries to recover them. If a node is recoverable, it returns to
     * <code>AVAILABLE</code>. Otherwise, it moves to <code>FAILED</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> - The AWS account attempted to create a node and creation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The node is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The node is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - The node can no longer participate on the network.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The node is no longer functional, cannot be recovered, and must be deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACCESSIBLE_ENCRYPTION_KEY</code> - The node is impaired and might not function as expected because it
     * cannot access the specified customer managed key in AWS KMS for encryption at rest. Either the KMS key was
     * disabled or deleted, or the grants on the key were revoked.
     * </p>
     * <p>
     * The effect of disabling or deleting a key, or revoking a grant is not immediate. The node resource might take
     * some time to find that the key is inaccessible. When a resource is in this state, we recommend deleting and
     * recreating the resource.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the node.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The AWS account is in the process of creating a node.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The node has been created and can participate in the network.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNHEALTHY</code> - The node is impaired and might not function as expected. Amazon Managed
     *        Blockchain automatically finds nodes in this state and tries to recover them. If a node is recoverable, it
     *        returns to <code>AVAILABLE</code>. Otherwise, it moves to <code>FAILED</code> status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> - The AWS account attempted to create a node and creation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The node is in the process of being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The node is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - The node can no longer participate on the network.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The node is no longer functional, cannot be recovered, and must be deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACCESSIBLE_ENCRYPTION_KEY</code> - The node is impaired and might not function as expected because
     *        it cannot access the specified customer managed key in AWS KMS for encryption at rest. Either the KMS key
     *        was disabled or deleted, or the grants on the key were revoked.
     *        </p>
     *        <p>
     *        The effect of disabling or deleting a key, or revoking a grant is not immediate. The node resource might
     *        take some time to find that the key is inaccessible. When a resource is in this state, we recommend
     *        deleting and recreating the resource.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeStatus
     */

    public Node withStatus(NodeStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the node was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time that the node was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time that the node was created.
     * </p>
     * 
     * @return The date and time that the node was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time that the node was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time that the node was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * Tags assigned to the node. Each tag consists of a key and optional value.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     * >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     * 
     * @return Tags assigned to the node. Each tag consists of a key and optional value.</p>
     *         <p>
     *         For more information about tags, see <a
     *         href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     *         Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a href=
     *         "https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     *         >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags assigned to the node. Each tag consists of a key and optional value.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     * >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        Tags assigned to the node. Each tag consists of a key and optional value.</p>
     *        <p>
     *        For more information about tags, see <a
     *        href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     *        Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a href=
     *        "https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     *        >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags assigned to the node. Each tag consists of a key and optional value.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     * >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        Tags assigned to the node. Each tag consists of a key and optional value.</p>
     *        <p>
     *        For more information about tags, see <a
     *        href="https://docs.aws.amazon.com/managed-blockchain/latest/ethereum-dev/tagging-resources.html">Tagging
     *        Resources</a> in the <i>Amazon Managed Blockchain Ethereum Developer Guide</i>, or <a href=
     *        "https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     *        >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Node#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Node addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the node. For more information about ARNs and their format, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the node. For more information about ARNs and their format, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the node. For more information about ARNs and their format, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the node. For more information about ARNs and their format, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the node. For more information about ARNs and their format, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the node. For more information about ARNs and their format, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) that the node
     * uses for encryption at rest. If the value of this parameter is <code>"AWS Owned KMS Key"</code>, the node uses an
     * AWS owned KMS key for encryption. The node inherits this parameter from the member that it belongs to.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) that
     *        the node uses for encryption at rest. If the value of this parameter is <code>"AWS Owned KMS Key"</code>,
     *        the node uses an AWS owned KMS key for encryption. The node inherits this parameter from the member that
     *        it belongs to.</p>
     *        <p>
     *        Applies only to Hyperledger Fabric.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) that the node
     * uses for encryption at rest. If the value of this parameter is <code>"AWS Owned KMS Key"</code>, the node uses an
     * AWS owned KMS key for encryption. The node inherits this parameter from the member that it belongs to.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) that
     *         the node uses for encryption at rest. If the value of this parameter is <code>"AWS Owned KMS Key"</code>,
     *         the node uses an AWS owned KMS key for encryption. The node inherits this parameter from the member that
     *         it belongs to.</p>
     *         <p>
     *         Applies only to Hyperledger Fabric.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) that the node
     * uses for encryption at rest. If the value of this parameter is <code>"AWS Owned KMS Key"</code>, the node uses an
     * AWS owned KMS key for encryption. The node inherits this parameter from the member that it belongs to.
     * </p>
     * <p>
     * Applies only to Hyperledger Fabric.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) that
     *        the node uses for encryption at rest. If the value of this parameter is <code>"AWS Owned KMS Key"</code>,
     *        the node uses an AWS owned KMS key for encryption. The node inherits this parameter from the member that
     *        it belongs to.</p>
     *        <p>
     *        Applies only to Hyperledger Fabric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
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
        if (getNetworkId() != null)
            sb.append("NetworkId: ").append(getNetworkId()).append(",");
        if (getMemberId() != null)
            sb.append("MemberId: ").append(getMemberId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getFrameworkAttributes() != null)
            sb.append("FrameworkAttributes: ").append(getFrameworkAttributes()).append(",");
        if (getLogPublishingConfiguration() != null)
            sb.append("LogPublishingConfiguration: ").append(getLogPublishingConfiguration()).append(",");
        if (getStateDB() != null)
            sb.append("StateDB: ").append(getStateDB()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Node == false)
            return false;
        Node other = (Node) obj;
        if (other.getNetworkId() == null ^ this.getNetworkId() == null)
            return false;
        if (other.getNetworkId() != null && other.getNetworkId().equals(this.getNetworkId()) == false)
            return false;
        if (other.getMemberId() == null ^ this.getMemberId() == null)
            return false;
        if (other.getMemberId() != null && other.getMemberId().equals(this.getMemberId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getFrameworkAttributes() == null ^ this.getFrameworkAttributes() == null)
            return false;
        if (other.getFrameworkAttributes() != null && other.getFrameworkAttributes().equals(this.getFrameworkAttributes()) == false)
            return false;
        if (other.getLogPublishingConfiguration() == null ^ this.getLogPublishingConfiguration() == null)
            return false;
        if (other.getLogPublishingConfiguration() != null && other.getLogPublishingConfiguration().equals(this.getLogPublishingConfiguration()) == false)
            return false;
        if (other.getStateDB() == null ^ this.getStateDB() == null)
            return false;
        if (other.getStateDB() != null && other.getStateDB().equals(this.getStateDB()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkId() == null) ? 0 : getNetworkId().hashCode());
        hashCode = prime * hashCode + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getFrameworkAttributes() == null) ? 0 : getFrameworkAttributes().hashCode());
        hashCode = prime * hashCode + ((getLogPublishingConfiguration() == null) ? 0 : getLogPublishingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStateDB() == null) ? 0 : getStateDB().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public Node clone() {
        try {
            return (Node) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.NodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
