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
package com.amazonaws.services.cloud9.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an Cloud9 development environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/Environment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Environment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the environment.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description for the environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of environment. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ec2</code>: An Amazon Elastic Compute Cloud (Amazon EC2) instance connects to the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ssh</code>: Your own server connects to the environment.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The connection type used for connecting to an Amazon EC2 environment. <code>CONNECT_SSH</code> is selected by
     * default.
     * </p>
     */
    private String connectionType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment owner.
     * </p>
     */
    private String ownerArn;
    /**
     * <p>
     * The state of the environment in its creation or deletion lifecycle.
     * </p>
     */
    private EnvironmentLifecycle lifecycle;
    /**
     * <p>
     * Describes the status of Amazon Web Services managed temporary credentials for the Cloud9 environment. Available
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED_ON_CREATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED_BY_OWNER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_BY_DEFAULT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_BY_OWNER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_BY_COLLABORATOR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_REMOVAL_BY_COLLABORATOR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_REMOVAL_BY_OWNER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_REMOVAL_BY_COLLABORATOR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED_BY_OWNER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_BY_DEFAULT</code>
     * </p>
     * </li>
     * </ul>
     */
    private String managedCredentialsStatus;

    /**
     * <p>
     * The ID of the environment.
     * </p>
     * 
     * @param id
     *        The ID of the environment.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the environment.
     * </p>
     * 
     * @return The ID of the environment.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the environment.
     * </p>
     * 
     * @param id
     *        The ID of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @return The name of the environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description for the environment.
     * </p>
     * 
     * @param description
     *        The description for the environment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the environment.
     * </p>
     * 
     * @return The description for the environment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the environment.
     * </p>
     * 
     * @param description
     *        The description for the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of environment. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ec2</code>: An Amazon Elastic Compute Cloud (Amazon EC2) instance connects to the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ssh</code>: Your own server connects to the environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of environment. Valid values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ec2</code>: An Amazon Elastic Compute Cloud (Amazon EC2) instance connects to the environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ssh</code>: Your own server connects to the environment.
     *        </p>
     *        </li>
     * @see EnvironmentType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of environment. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ec2</code>: An Amazon Elastic Compute Cloud (Amazon EC2) instance connects to the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ssh</code>: Your own server connects to the environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of environment. Valid values include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ec2</code>: An Amazon Elastic Compute Cloud (Amazon EC2) instance connects to the environment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ssh</code>: Your own server connects to the environment.
     *         </p>
     *         </li>
     * @see EnvironmentType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of environment. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ec2</code>: An Amazon Elastic Compute Cloud (Amazon EC2) instance connects to the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ssh</code>: Your own server connects to the environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of environment. Valid values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ec2</code>: An Amazon Elastic Compute Cloud (Amazon EC2) instance connects to the environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ssh</code>: Your own server connects to the environment.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentType
     */

    public Environment withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of environment. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ec2</code>: An Amazon Elastic Compute Cloud (Amazon EC2) instance connects to the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ssh</code>: Your own server connects to the environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of environment. Valid values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ec2</code>: An Amazon Elastic Compute Cloud (Amazon EC2) instance connects to the environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ssh</code>: Your own server connects to the environment.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentType
     */

    public Environment withType(EnvironmentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The connection type used for connecting to an Amazon EC2 environment. <code>CONNECT_SSH</code> is selected by
     * default.
     * </p>
     * 
     * @param connectionType
     *        The connection type used for connecting to an Amazon EC2 environment. <code>CONNECT_SSH</code> is selected
     *        by default.
     * @see ConnectionType
     */

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * <p>
     * The connection type used for connecting to an Amazon EC2 environment. <code>CONNECT_SSH</code> is selected by
     * default.
     * </p>
     * 
     * @return The connection type used for connecting to an Amazon EC2 environment. <code>CONNECT_SSH</code> is
     *         selected by default.
     * @see ConnectionType
     */

    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * <p>
     * The connection type used for connecting to an Amazon EC2 environment. <code>CONNECT_SSH</code> is selected by
     * default.
     * </p>
     * 
     * @param connectionType
     *        The connection type used for connecting to an Amazon EC2 environment. <code>CONNECT_SSH</code> is selected
     *        by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public Environment withConnectionType(String connectionType) {
        setConnectionType(connectionType);
        return this;
    }

    /**
     * <p>
     * The connection type used for connecting to an Amazon EC2 environment. <code>CONNECT_SSH</code> is selected by
     * default.
     * </p>
     * 
     * @param connectionType
     *        The connection type used for connecting to an Amazon EC2 environment. <code>CONNECT_SSH</code> is selected
     *        by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public Environment withConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the environment.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the environment.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment owner.
     * </p>
     * 
     * @param ownerArn
     *        The Amazon Resource Name (ARN) of the environment owner.
     */

    public void setOwnerArn(String ownerArn) {
        this.ownerArn = ownerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment owner.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the environment owner.
     */

    public String getOwnerArn() {
        return this.ownerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment owner.
     * </p>
     * 
     * @param ownerArn
     *        The Amazon Resource Name (ARN) of the environment owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withOwnerArn(String ownerArn) {
        setOwnerArn(ownerArn);
        return this;
    }

    /**
     * <p>
     * The state of the environment in its creation or deletion lifecycle.
     * </p>
     * 
     * @param lifecycle
     *        The state of the environment in its creation or deletion lifecycle.
     */

    public void setLifecycle(EnvironmentLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The state of the environment in its creation or deletion lifecycle.
     * </p>
     * 
     * @return The state of the environment in its creation or deletion lifecycle.
     */

    public EnvironmentLifecycle getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * The state of the environment in its creation or deletion lifecycle.
     * </p>
     * 
     * @param lifecycle
     *        The state of the environment in its creation or deletion lifecycle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withLifecycle(EnvironmentLifecycle lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * Describes the status of Amazon Web Services managed temporary credentials for the Cloud9 environment. Available
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED_ON_CREATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED_BY_OWNER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_BY_DEFAULT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_BY_OWNER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_BY_COLLABORATOR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_REMOVAL_BY_COLLABORATOR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_REMOVAL_BY_OWNER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_REMOVAL_BY_COLLABORATOR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED_BY_OWNER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_BY_DEFAULT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param managedCredentialsStatus
     *        Describes the status of Amazon Web Services managed temporary credentials for the Cloud9 environment.
     *        Available values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED_ON_CREATE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED_BY_OWNER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED_BY_DEFAULT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED_BY_OWNER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED_BY_COLLABORATOR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_REMOVAL_BY_COLLABORATOR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_REMOVAL_BY_OWNER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED_REMOVAL_BY_COLLABORATOR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED_BY_OWNER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED_BY_DEFAULT</code>
     *        </p>
     *        </li>
     * @see ManagedCredentialsStatus
     */

    public void setManagedCredentialsStatus(String managedCredentialsStatus) {
        this.managedCredentialsStatus = managedCredentialsStatus;
    }

    /**
     * <p>
     * Describes the status of Amazon Web Services managed temporary credentials for the Cloud9 environment. Available
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED_ON_CREATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED_BY_OWNER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_BY_DEFAULT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_BY_OWNER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_BY_COLLABORATOR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_REMOVAL_BY_COLLABORATOR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_REMOVAL_BY_OWNER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_REMOVAL_BY_COLLABORATOR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED_BY_OWNER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_BY_DEFAULT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes the status of Amazon Web Services managed temporary credentials for the Cloud9 environment.
     *         Available values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLED_ON_CREATE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENABLED_BY_OWNER</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED_BY_DEFAULT</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED_BY_OWNER</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED_BY_COLLABORATOR</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING_REMOVAL_BY_COLLABORATOR</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING_REMOVAL_BY_OWNER</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED_REMOVAL_BY_COLLABORATOR</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENABLED_BY_OWNER</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED_BY_DEFAULT</code>
     *         </p>
     *         </li>
     * @see ManagedCredentialsStatus
     */

    public String getManagedCredentialsStatus() {
        return this.managedCredentialsStatus;
    }

    /**
     * <p>
     * Describes the status of Amazon Web Services managed temporary credentials for the Cloud9 environment. Available
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED_ON_CREATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED_BY_OWNER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_BY_DEFAULT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_BY_OWNER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_BY_COLLABORATOR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_REMOVAL_BY_COLLABORATOR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_REMOVAL_BY_OWNER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_REMOVAL_BY_COLLABORATOR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED_BY_OWNER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_BY_DEFAULT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param managedCredentialsStatus
     *        Describes the status of Amazon Web Services managed temporary credentials for the Cloud9 environment.
     *        Available values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED_ON_CREATE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED_BY_OWNER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED_BY_DEFAULT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED_BY_OWNER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED_BY_COLLABORATOR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_REMOVAL_BY_COLLABORATOR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_REMOVAL_BY_OWNER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED_REMOVAL_BY_COLLABORATOR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED_BY_OWNER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED_BY_DEFAULT</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManagedCredentialsStatus
     */

    public Environment withManagedCredentialsStatus(String managedCredentialsStatus) {
        setManagedCredentialsStatus(managedCredentialsStatus);
        return this;
    }

    /**
     * <p>
     * Describes the status of Amazon Web Services managed temporary credentials for the Cloud9 environment. Available
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED_ON_CREATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED_BY_OWNER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_BY_DEFAULT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_BY_OWNER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_BY_COLLABORATOR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_REMOVAL_BY_COLLABORATOR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_REMOVAL_BY_OWNER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_REMOVAL_BY_COLLABORATOR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED_BY_OWNER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED_BY_DEFAULT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param managedCredentialsStatus
     *        Describes the status of Amazon Web Services managed temporary credentials for the Cloud9 environment.
     *        Available values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED_ON_CREATE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED_BY_OWNER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED_BY_DEFAULT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED_BY_OWNER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED_BY_COLLABORATOR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_REMOVAL_BY_COLLABORATOR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_REMOVAL_BY_OWNER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED_REMOVAL_BY_COLLABORATOR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED_BY_OWNER</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED_BY_DEFAULT</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManagedCredentialsStatus
     */

    public Environment withManagedCredentialsStatus(ManagedCredentialsStatus managedCredentialsStatus) {
        this.managedCredentialsStatus = managedCredentialsStatus.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getConnectionType() != null)
            sb.append("ConnectionType: ").append(getConnectionType()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getOwnerArn() != null)
            sb.append("OwnerArn: ").append(getOwnerArn()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getManagedCredentialsStatus() != null)
            sb.append("ManagedCredentialsStatus: ").append(getManagedCredentialsStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Environment == false)
            return false;
        Environment other = (Environment) obj;
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
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getConnectionType() == null ^ this.getConnectionType() == null)
            return false;
        if (other.getConnectionType() != null && other.getConnectionType().equals(this.getConnectionType()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getOwnerArn() == null ^ this.getOwnerArn() == null)
            return false;
        if (other.getOwnerArn() != null && other.getOwnerArn().equals(this.getOwnerArn()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getManagedCredentialsStatus() == null ^ this.getManagedCredentialsStatus() == null)
            return false;
        if (other.getManagedCredentialsStatus() != null && other.getManagedCredentialsStatus().equals(this.getManagedCredentialsStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getConnectionType() == null) ? 0 : getConnectionType().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getOwnerArn() == null) ? 0 : getOwnerArn().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getManagedCredentialsStatus() == null) ? 0 : getManagedCredentialsStatus().hashCode());
        return hashCode;
    }

    @Override
    public Environment clone() {
        try {
            return (Environment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloud9.model.transform.EnvironmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
