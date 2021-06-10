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
 * Member configuration properties.
 * </p>
 * <p>
 * Applies only to Hyperledger Fabric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/Member" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Member implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the network to which the member belongs.
     * </p>
     */
    private String networkId;
    /**
     * <p>
     * The unique identifier of the member.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the member.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An optional description for the member.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Attributes relevant to a member for the blockchain framework that the Managed Blockchain network uses.
     * </p>
     */
    private MemberFrameworkAttributes frameworkAttributes;
    /**
     * <p>
     * Configuration properties for logging events associated with a member.
     * </p>
     */
    private MemberLogPublishingConfiguration logPublishingConfiguration;
    /**
     * <p>
     * The status of a member.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The AWS account is in the process of creating a member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The member has been created and can participate in the network.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> - The AWS account attempted to create a member and creation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The member is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The member and all associated resources are in the process of being deleted. Either the
     * AWS account that owns the member deleted it, or the member is being deleted as the result of an
     * <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - The member can no longer participate on the network and all associated resources are
     * deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the result of
     * an <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACCESSIBLE_ENCRYPTION_KEY</code> - The member is impaired and might not function as expected because it
     * cannot access the specified customer managed key in AWS KMS for encryption at rest. Either the KMS key was
     * disabled or deleted, or the grants on the key were revoked.
     * </p>
     * <p>
     * The effect of disabling or deleting a key, or revoking a grant is not immediate. The member resource might take
     * some time to find that the key is inaccessible. When a resource is in this state, we recommend deleting and
     * recreating the resource.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The date and time that the member was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * Tags assigned to the member. Tags consist of a key and optional value. For more information about tags, see <a
     * href
     * ="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the member. For more information about ARNs and their format, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) that the
     * member uses for encryption at rest. If the value of this parameter is <code>"AWS Owned KMS Key"</code>, the
     * member uses an AWS owned KMS key for encryption. This parameter is inherited by the nodes that this member owns.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The unique identifier of the network to which the member belongs.
     * </p>
     * 
     * @param networkId
     *        The unique identifier of the network to which the member belongs.
     */

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    /**
     * <p>
     * The unique identifier of the network to which the member belongs.
     * </p>
     * 
     * @return The unique identifier of the network to which the member belongs.
     */

    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * <p>
     * The unique identifier of the network to which the member belongs.
     * </p>
     * 
     * @param networkId
     *        The unique identifier of the network to which the member belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withNetworkId(String networkId) {
        setNetworkId(networkId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the member.
     * </p>
     * 
     * @param id
     *        The unique identifier of the member.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the member.
     * </p>
     * 
     * @return The unique identifier of the member.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the member.
     * </p>
     * 
     * @param id
     *        The unique identifier of the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the member.
     * </p>
     * 
     * @param name
     *        The name of the member.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the member.
     * </p>
     * 
     * @return The name of the member.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the member.
     * </p>
     * 
     * @param name
     *        The name of the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An optional description for the member.
     * </p>
     * 
     * @param description
     *        An optional description for the member.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the member.
     * </p>
     * 
     * @return An optional description for the member.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description for the member.
     * </p>
     * 
     * @param description
     *        An optional description for the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Attributes relevant to a member for the blockchain framework that the Managed Blockchain network uses.
     * </p>
     * 
     * @param frameworkAttributes
     *        Attributes relevant to a member for the blockchain framework that the Managed Blockchain network uses.
     */

    public void setFrameworkAttributes(MemberFrameworkAttributes frameworkAttributes) {
        this.frameworkAttributes = frameworkAttributes;
    }

    /**
     * <p>
     * Attributes relevant to a member for the blockchain framework that the Managed Blockchain network uses.
     * </p>
     * 
     * @return Attributes relevant to a member for the blockchain framework that the Managed Blockchain network uses.
     */

    public MemberFrameworkAttributes getFrameworkAttributes() {
        return this.frameworkAttributes;
    }

    /**
     * <p>
     * Attributes relevant to a member for the blockchain framework that the Managed Blockchain network uses.
     * </p>
     * 
     * @param frameworkAttributes
     *        Attributes relevant to a member for the blockchain framework that the Managed Blockchain network uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withFrameworkAttributes(MemberFrameworkAttributes frameworkAttributes) {
        setFrameworkAttributes(frameworkAttributes);
        return this;
    }

    /**
     * <p>
     * Configuration properties for logging events associated with a member.
     * </p>
     * 
     * @param logPublishingConfiguration
     *        Configuration properties for logging events associated with a member.
     */

    public void setLogPublishingConfiguration(MemberLogPublishingConfiguration logPublishingConfiguration) {
        this.logPublishingConfiguration = logPublishingConfiguration;
    }

    /**
     * <p>
     * Configuration properties for logging events associated with a member.
     * </p>
     * 
     * @return Configuration properties for logging events associated with a member.
     */

    public MemberLogPublishingConfiguration getLogPublishingConfiguration() {
        return this.logPublishingConfiguration;
    }

    /**
     * <p>
     * Configuration properties for logging events associated with a member.
     * </p>
     * 
     * @param logPublishingConfiguration
     *        Configuration properties for logging events associated with a member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withLogPublishingConfiguration(MemberLogPublishingConfiguration logPublishingConfiguration) {
        setLogPublishingConfiguration(logPublishingConfiguration);
        return this;
    }

    /**
     * <p>
     * The status of a member.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The AWS account is in the process of creating a member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The member has been created and can participate in the network.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> - The AWS account attempted to create a member and creation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The member is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The member and all associated resources are in the process of being deleted. Either the
     * AWS account that owns the member deleted it, or the member is being deleted as the result of an
     * <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - The member can no longer participate on the network and all associated resources are
     * deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the result of
     * an <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACCESSIBLE_ENCRYPTION_KEY</code> - The member is impaired and might not function as expected because it
     * cannot access the specified customer managed key in AWS KMS for encryption at rest. Either the KMS key was
     * disabled or deleted, or the grants on the key were revoked.
     * </p>
     * <p>
     * The effect of disabling or deleting a key, or revoking a grant is not immediate. The member resource might take
     * some time to find that the key is inaccessible. When a resource is in this state, we recommend deleting and
     * recreating the resource.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of a member.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The AWS account is in the process of creating a member.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The member has been created and can participate in the network.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> - The AWS account attempted to create a member and creation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The member is in the process of being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The member and all associated resources are in the process of being deleted.
     *        Either the AWS account that owns the member deleted it, or the member is being deleted as the result of an
     *        <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - The member can no longer participate on the network and all associated resources
     *        are deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the
     *        result of an <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACCESSIBLE_ENCRYPTION_KEY</code> - The member is impaired and might not function as expected
     *        because it cannot access the specified customer managed key in AWS KMS for encryption at rest. Either the
     *        KMS key was disabled or deleted, or the grants on the key were revoked.
     *        </p>
     *        <p>
     *        The effect of disabling or deleting a key, or revoking a grant is not immediate. The member resource might
     *        take some time to find that the key is inaccessible. When a resource is in this state, we recommend
     *        deleting and recreating the resource.
     *        </p>
     *        </li>
     * @see MemberStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a member.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The AWS account is in the process of creating a member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The member has been created and can participate in the network.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> - The AWS account attempted to create a member and creation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The member is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The member and all associated resources are in the process of being deleted. Either the
     * AWS account that owns the member deleted it, or the member is being deleted as the result of an
     * <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - The member can no longer participate on the network and all associated resources are
     * deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the result of
     * an <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACCESSIBLE_ENCRYPTION_KEY</code> - The member is impaired and might not function as expected because it
     * cannot access the specified customer managed key in AWS KMS for encryption at rest. Either the KMS key was
     * disabled or deleted, or the grants on the key were revoked.
     * </p>
     * <p>
     * The effect of disabling or deleting a key, or revoking a grant is not immediate. The member resource might take
     * some time to find that the key is inaccessible. When a resource is in this state, we recommend deleting and
     * recreating the resource.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of a member.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The AWS account is in the process of creating a member.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AVAILABLE</code> - The member has been created and can participate in the network.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_FAILED</code> - The AWS account attempted to create a member and creation failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The member is in the process of being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The member and all associated resources are in the process of being deleted.
     *         Either the AWS account that owns the member deleted it, or the member is being deleted as the result of
     *         an <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETED</code> - The member can no longer participate on the network and all associated resources
     *         are deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as
     *         the result of an <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INACCESSIBLE_ENCRYPTION_KEY</code> - The member is impaired and might not function as expected
     *         because it cannot access the specified customer managed key in AWS KMS for encryption at rest. Either the
     *         KMS key was disabled or deleted, or the grants on the key were revoked.
     *         </p>
     *         <p>
     *         The effect of disabling or deleting a key, or revoking a grant is not immediate. The member resource
     *         might take some time to find that the key is inaccessible. When a resource is in this state, we recommend
     *         deleting and recreating the resource.
     *         </p>
     *         </li>
     * @see MemberStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a member.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The AWS account is in the process of creating a member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The member has been created and can participate in the network.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> - The AWS account attempted to create a member and creation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The member is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The member and all associated resources are in the process of being deleted. Either the
     * AWS account that owns the member deleted it, or the member is being deleted as the result of an
     * <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - The member can no longer participate on the network and all associated resources are
     * deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the result of
     * an <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACCESSIBLE_ENCRYPTION_KEY</code> - The member is impaired and might not function as expected because it
     * cannot access the specified customer managed key in AWS KMS for encryption at rest. Either the KMS key was
     * disabled or deleted, or the grants on the key were revoked.
     * </p>
     * <p>
     * The effect of disabling or deleting a key, or revoking a grant is not immediate. The member resource might take
     * some time to find that the key is inaccessible. When a resource is in this state, we recommend deleting and
     * recreating the resource.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of a member.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The AWS account is in the process of creating a member.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The member has been created and can participate in the network.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> - The AWS account attempted to create a member and creation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The member is in the process of being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The member and all associated resources are in the process of being deleted.
     *        Either the AWS account that owns the member deleted it, or the member is being deleted as the result of an
     *        <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - The member can no longer participate on the network and all associated resources
     *        are deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the
     *        result of an <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACCESSIBLE_ENCRYPTION_KEY</code> - The member is impaired and might not function as expected
     *        because it cannot access the specified customer managed key in AWS KMS for encryption at rest. Either the
     *        KMS key was disabled or deleted, or the grants on the key were revoked.
     *        </p>
     *        <p>
     *        The effect of disabling or deleting a key, or revoking a grant is not immediate. The member resource might
     *        take some time to find that the key is inaccessible. When a resource is in this state, we recommend
     *        deleting and recreating the resource.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberStatus
     */

    public Member withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a member.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The AWS account is in the process of creating a member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The member has been created and can participate in the network.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> - The AWS account attempted to create a member and creation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The member is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The member and all associated resources are in the process of being deleted. Either the
     * AWS account that owns the member deleted it, or the member is being deleted as the result of an
     * <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - The member can no longer participate on the network and all associated resources are
     * deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the result of
     * an <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACCESSIBLE_ENCRYPTION_KEY</code> - The member is impaired and might not function as expected because it
     * cannot access the specified customer managed key in AWS KMS for encryption at rest. Either the KMS key was
     * disabled or deleted, or the grants on the key were revoked.
     * </p>
     * <p>
     * The effect of disabling or deleting a key, or revoking a grant is not immediate. The member resource might take
     * some time to find that the key is inaccessible. When a resource is in this state, we recommend deleting and
     * recreating the resource.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of a member.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The AWS account is in the process of creating a member.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The member has been created and can participate in the network.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> - The AWS account attempted to create a member and creation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The member is in the process of being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The member and all associated resources are in the process of being deleted.
     *        Either the AWS account that owns the member deleted it, or the member is being deleted as the result of an
     *        <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - The member can no longer participate on the network and all associated resources
     *        are deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the
     *        result of an <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACCESSIBLE_ENCRYPTION_KEY</code> - The member is impaired and might not function as expected
     *        because it cannot access the specified customer managed key in AWS KMS for encryption at rest. Either the
     *        KMS key was disabled or deleted, or the grants on the key were revoked.
     *        </p>
     *        <p>
     *        The effect of disabling or deleting a key, or revoking a grant is not immediate. The member resource might
     *        take some time to find that the key is inaccessible. When a resource is in this state, we recommend
     *        deleting and recreating the resource.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberStatus
     */

    public Member withStatus(MemberStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the member was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time that the member was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time that the member was created.
     * </p>
     * 
     * @return The date and time that the member was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time that the member was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time that the member was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * Tags assigned to the member. Tags consist of a key and optional value. For more information about tags, see <a
     * href
     * ="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     * 
     * @return Tags assigned to the member. Tags consist of a key and optional value. For more information about tags,
     *         see <a href=
     *         "https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     *         >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags assigned to the member. Tags consist of a key and optional value. For more information about tags, see <a
     * href
     * ="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        Tags assigned to the member. Tags consist of a key and optional value. For more information about tags,
     *        see <a href=
     *        "https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     *        >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags assigned to the member. Tags consist of a key and optional value. For more information about tags, see <a
     * href
     * ="https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html">Tagging
     * Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        Tags assigned to the member. Tags consist of a key and optional value. For more information about tags,
     *        see <a href=
     *        "https://docs.aws.amazon.com/managed-blockchain/latest/hyperledger-fabric-dev/tagging-resources.html"
     *        >Tagging Resources</a> in the <i>Amazon Managed Blockchain Hyperledger Fabric Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Member#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Member addTagsEntry(String key, String value) {
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

    public Member clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the member. For more information about ARNs and their format, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the member. For more information about ARNs and their format, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the member. For more information about ARNs and their format, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the member. For more information about ARNs and their format, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the member. For more information about ARNs and their format, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the member. For more information about ARNs and their format, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) that the
     * member uses for encryption at rest. If the value of this parameter is <code>"AWS Owned KMS Key"</code>, the
     * member uses an AWS owned KMS key for encryption. This parameter is inherited by the nodes that this member owns.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) that
     *        the member uses for encryption at rest. If the value of this parameter is <code>"AWS Owned KMS Key"</code>
     *        , the member uses an AWS owned KMS key for encryption. This parameter is inherited by the nodes that this
     *        member owns.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) that the
     * member uses for encryption at rest. If the value of this parameter is <code>"AWS Owned KMS Key"</code>, the
     * member uses an AWS owned KMS key for encryption. This parameter is inherited by the nodes that this member owns.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) that
     *         the member uses for encryption at rest. If the value of this parameter is
     *         <code>"AWS Owned KMS Key"</code>, the member uses an AWS owned KMS key for encryption. This parameter is
     *         inherited by the nodes that this member owns.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) that the
     * member uses for encryption at rest. If the value of this parameter is <code>"AWS Owned KMS Key"</code>, the
     * member uses an AWS owned KMS key for encryption. This parameter is inherited by the nodes that this member owns.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the customer managed key in AWS Key Management Service (AWS KMS) that
     *        the member uses for encryption at rest. If the value of this parameter is <code>"AWS Owned KMS Key"</code>
     *        , the member uses an AWS owned KMS key for encryption. This parameter is inherited by the nodes that this
     *        member owns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withKmsKeyArn(String kmsKeyArn) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFrameworkAttributes() != null)
            sb.append("FrameworkAttributes: ").append(getFrameworkAttributes()).append(",");
        if (getLogPublishingConfiguration() != null)
            sb.append("LogPublishingConfiguration: ").append(getLogPublishingConfiguration()).append(",");
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

        if (obj instanceof Member == false)
            return false;
        Member other = (Member) obj;
        if (other.getNetworkId() == null ^ this.getNetworkId() == null)
            return false;
        if (other.getNetworkId() != null && other.getNetworkId().equals(this.getNetworkId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFrameworkAttributes() == null ^ this.getFrameworkAttributes() == null)
            return false;
        if (other.getFrameworkAttributes() != null && other.getFrameworkAttributes().equals(this.getFrameworkAttributes()) == false)
            return false;
        if (other.getLogPublishingConfiguration() == null ^ this.getLogPublishingConfiguration() == null)
            return false;
        if (other.getLogPublishingConfiguration() != null && other.getLogPublishingConfiguration().equals(this.getLogPublishingConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFrameworkAttributes() == null) ? 0 : getFrameworkAttributes().hashCode());
        hashCode = prime * hashCode + ((getLogPublishingConfiguration() == null) ? 0 : getLogPublishingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public Member clone() {
        try {
            return (Member) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.MemberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
