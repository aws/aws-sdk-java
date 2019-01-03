/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Creates a broker using the specified properties.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateBroker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBrokerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The
     * automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * Required. The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must
     * contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard
     * characters, or special characters.
     */
    private String brokerName;
    /** A list of information about the configuration. */
    private ConfigurationId configuration;
    /**
     * The unique ID that the requester receives for the created broker. Amazon MQ passes your ID with the API action.
     * Note: We recommend using a Universally Unique Identifier (UUID) for the creatorRequestId. You may omit the
     * creatorRequestId if your application doesn't require idempotency.
     */
    private String creatorRequestId;
    /** Required. The deployment mode of the broker. */
    private String deploymentMode;
    /** Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ. */
    private String engineType;
    /**
     * Required. The version of the broker engine. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     */
    private String engineVersion;
    /** Required. The broker's instance type. */
    private String hostInstanceType;
    /** Enables Amazon CloudWatch logging for brokers. */
    private Logs logs;
    /** The parameters that determine the WeeklyStartTime. */
    private WeeklyStartTime maintenanceWindowStartTime;
    /** Required. Enables connections from applications outside of the VPC that hosts the broker's subnets. */
    private Boolean publiclyAccessible;
    /** The list of rules (1 minimum, 125 maximum) that authorize connections to brokers. */
    private java.util.List<String> securityGroups;
    /**
     * The list of groups (2 maximum) that define which subnets and IP ranges the broker can use from different
     * Availability Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An
     * ACTIVE_STANDBY_MULTI_AZ deployment requires two subnets.
     */
    private java.util.List<String> subnetIds;
    /** Create tags when creating the broker. */
    private java.util.Map<String, String> tags;
    /**
     * Required. The list of ActiveMQ users (persons or applications) who can access queues and topics. This value can
     * contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be
     * 2-100 characters long.
     */
    private java.util.List<User> users;

    /**
     * Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The
     * automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     * 
     * @param autoMinorVersionUpgrade
     *        Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
     *        The automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The
     * automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     * 
     * @return Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
     *         The automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The
     * automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     * 
     * @param autoMinorVersionUpgrade
     *        Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
     *        The automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The
     * automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     * 
     * @return Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
     *         The automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * Required. The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must
     * contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard
     * characters, or special characters.
     * 
     * @param brokerName
     *        Required. The name of the broker. This value must be unique in your AWS account, 1-50 characters long,
     *        must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets,
     *        wildcard characters, or special characters.
     */

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    /**
     * Required. The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must
     * contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard
     * characters, or special characters.
     * 
     * @return Required. The name of the broker. This value must be unique in your AWS account, 1-50 characters long,
     *         must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets,
     *         wildcard characters, or special characters.
     */

    public String getBrokerName() {
        return this.brokerName;
    }

    /**
     * Required. The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must
     * contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard
     * characters, or special characters.
     * 
     * @param brokerName
     *        Required. The name of the broker. This value must be unique in your AWS account, 1-50 characters long,
     *        must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets,
     *        wildcard characters, or special characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withBrokerName(String brokerName) {
        setBrokerName(brokerName);
        return this;
    }

    /**
     * A list of information about the configuration.
     * 
     * @param configuration
     *        A list of information about the configuration.
     */

    public void setConfiguration(ConfigurationId configuration) {
        this.configuration = configuration;
    }

    /**
     * A list of information about the configuration.
     * 
     * @return A list of information about the configuration.
     */

    public ConfigurationId getConfiguration() {
        return this.configuration;
    }

    /**
     * A list of information about the configuration.
     * 
     * @param configuration
     *        A list of information about the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withConfiguration(ConfigurationId configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * The unique ID that the requester receives for the created broker. Amazon MQ passes your ID with the API action.
     * Note: We recommend using a Universally Unique Identifier (UUID) for the creatorRequestId. You may omit the
     * creatorRequestId if your application doesn't require idempotency.
     * 
     * @param creatorRequestId
     *        The unique ID that the requester receives for the created broker. Amazon MQ passes your ID with the API
     *        action. Note: We recommend using a Universally Unique Identifier (UUID) for the creatorRequestId. You may
     *        omit the creatorRequestId if your application doesn't require idempotency.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * The unique ID that the requester receives for the created broker. Amazon MQ passes your ID with the API action.
     * Note: We recommend using a Universally Unique Identifier (UUID) for the creatorRequestId. You may omit the
     * creatorRequestId if your application doesn't require idempotency.
     * 
     * @return The unique ID that the requester receives for the created broker. Amazon MQ passes your ID with the API
     *         action. Note: We recommend using a Universally Unique Identifier (UUID) for the creatorRequestId. You may
     *         omit the creatorRequestId if your application doesn't require idempotency.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * The unique ID that the requester receives for the created broker. Amazon MQ passes your ID with the API action.
     * Note: We recommend using a Universally Unique Identifier (UUID) for the creatorRequestId. You may omit the
     * creatorRequestId if your application doesn't require idempotency.
     * 
     * @param creatorRequestId
     *        The unique ID that the requester receives for the created broker. Amazon MQ passes your ID with the API
     *        action. Note: We recommend using a Universally Unique Identifier (UUID) for the creatorRequestId. You may
     *        omit the creatorRequestId if your application doesn't require idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * Required. The deployment mode of the broker.
     * 
     * @param deploymentMode
     *        Required. The deployment mode of the broker.
     * @see DeploymentMode
     */

    public void setDeploymentMode(String deploymentMode) {
        this.deploymentMode = deploymentMode;
    }

    /**
     * Required. The deployment mode of the broker.
     * 
     * @return Required. The deployment mode of the broker.
     * @see DeploymentMode
     */

    public String getDeploymentMode() {
        return this.deploymentMode;
    }

    /**
     * Required. The deployment mode of the broker.
     * 
     * @param deploymentMode
     *        Required. The deployment mode of the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentMode
     */

    public CreateBrokerRequest withDeploymentMode(String deploymentMode) {
        setDeploymentMode(deploymentMode);
        return this;
    }

    /**
     * Required. The deployment mode of the broker.
     * 
     * @param deploymentMode
     *        Required. The deployment mode of the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentMode
     */

    public CreateBrokerRequest withDeploymentMode(DeploymentMode deploymentMode) {
        this.deploymentMode = deploymentMode.toString();
        return this;
    }

    /**
     * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * 
     * @param engineType
     *        Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * @see EngineType
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * 
     * @return Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * @see EngineType
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * 
     * @param engineType
     *        Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public CreateBrokerRequest withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * 
     * @param engineType
     *        Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public CreateBrokerRequest withEngineType(EngineType engineType) {
        this.engineType = engineType.toString();
        return this;
    }

    /**
     * Required. The version of the broker engine. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     * 
     * @param engineVersion
     *        Required. The version of the broker engine. For a list of supported engine versions, see
     *        https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * Required. The version of the broker engine. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     * 
     * @return Required. The version of the broker engine. For a list of supported engine versions, see
     *         https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * Required. The version of the broker engine. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     * 
     * @param engineVersion
     *        Required. The version of the broker engine. For a list of supported engine versions, see
     *        https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * Required. The broker's instance type.
     * 
     * @param hostInstanceType
     *        Required. The broker's instance type.
     */

    public void setHostInstanceType(String hostInstanceType) {
        this.hostInstanceType = hostInstanceType;
    }

    /**
     * Required. The broker's instance type.
     * 
     * @return Required. The broker's instance type.
     */

    public String getHostInstanceType() {
        return this.hostInstanceType;
    }

    /**
     * Required. The broker's instance type.
     * 
     * @param hostInstanceType
     *        Required. The broker's instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withHostInstanceType(String hostInstanceType) {
        setHostInstanceType(hostInstanceType);
        return this;
    }

    /**
     * Enables Amazon CloudWatch logging for brokers.
     * 
     * @param logs
     *        Enables Amazon CloudWatch logging for brokers.
     */

    public void setLogs(Logs logs) {
        this.logs = logs;
    }

    /**
     * Enables Amazon CloudWatch logging for brokers.
     * 
     * @return Enables Amazon CloudWatch logging for brokers.
     */

    public Logs getLogs() {
        return this.logs;
    }

    /**
     * Enables Amazon CloudWatch logging for brokers.
     * 
     * @param logs
     *        Enables Amazon CloudWatch logging for brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withLogs(Logs logs) {
        setLogs(logs);
        return this;
    }

    /**
     * The parameters that determine the WeeklyStartTime.
     * 
     * @param maintenanceWindowStartTime
     *        The parameters that determine the WeeklyStartTime.
     */

    public void setMaintenanceWindowStartTime(WeeklyStartTime maintenanceWindowStartTime) {
        this.maintenanceWindowStartTime = maintenanceWindowStartTime;
    }

    /**
     * The parameters that determine the WeeklyStartTime.
     * 
     * @return The parameters that determine the WeeklyStartTime.
     */

    public WeeklyStartTime getMaintenanceWindowStartTime() {
        return this.maintenanceWindowStartTime;
    }

    /**
     * The parameters that determine the WeeklyStartTime.
     * 
     * @param maintenanceWindowStartTime
     *        The parameters that determine the WeeklyStartTime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withMaintenanceWindowStartTime(WeeklyStartTime maintenanceWindowStartTime) {
        setMaintenanceWindowStartTime(maintenanceWindowStartTime);
        return this;
    }

    /**
     * Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
     * 
     * @param publiclyAccessible
     *        Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
     * 
     * @return Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
     * 
     * @param publiclyAccessible
     *        Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
     * 
     * @return Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     * 
     * @return The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     * 
     * @param securityGroups
     *        The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     * 
     * @param securityGroups
     *        The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * The list of groups (2 maximum) that define which subnets and IP ranges the broker can use from different
     * Availability Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An
     * ACTIVE_STANDBY_MULTI_AZ deployment requires two subnets.
     * 
     * @return The list of groups (2 maximum) that define which subnets and IP ranges the broker can use from different
     *         Availability Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet).
     *         An ACTIVE_STANDBY_MULTI_AZ deployment requires two subnets.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * The list of groups (2 maximum) that define which subnets and IP ranges the broker can use from different
     * Availability Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An
     * ACTIVE_STANDBY_MULTI_AZ deployment requires two subnets.
     * 
     * @param subnetIds
     *        The list of groups (2 maximum) that define which subnets and IP ranges the broker can use from different
     *        Availability Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An
     *        ACTIVE_STANDBY_MULTI_AZ deployment requires two subnets.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * The list of groups (2 maximum) that define which subnets and IP ranges the broker can use from different
     * Availability Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An
     * ACTIVE_STANDBY_MULTI_AZ deployment requires two subnets.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The list of groups (2 maximum) that define which subnets and IP ranges the broker can use from different
     *        Availability Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An
     *        ACTIVE_STANDBY_MULTI_AZ deployment requires two subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * The list of groups (2 maximum) that define which subnets and IP ranges the broker can use from different
     * Availability Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An
     * ACTIVE_STANDBY_MULTI_AZ deployment requires two subnets.
     * 
     * @param subnetIds
     *        The list of groups (2 maximum) that define which subnets and IP ranges the broker can use from different
     *        Availability Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An
     *        ACTIVE_STANDBY_MULTI_AZ deployment requires two subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * Create tags when creating the broker.
     * 
     * @return Create tags when creating the broker.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * Create tags when creating the broker.
     * 
     * @param tags
     *        Create tags when creating the broker.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * Create tags when creating the broker.
     * 
     * @param tags
     *        Create tags when creating the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateBrokerRequest addTagsEntry(String key, String value) {
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

    public CreateBrokerRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * Required. The list of ActiveMQ users (persons or applications) who can access queues and topics. This value can
     * contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be
     * 2-100 characters long.
     * 
     * @return Required. The list of ActiveMQ users (persons or applications) who can access queues and topics. This
     *         value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This
     *         value must be 2-100 characters long.
     */

    public java.util.List<User> getUsers() {
        return users;
    }

    /**
     * Required. The list of ActiveMQ users (persons or applications) who can access queues and topics. This value can
     * contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be
     * 2-100 characters long.
     * 
     * @param users
     *        Required. The list of ActiveMQ users (persons or applications) who can access queues and topics. This
     *        value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This
     *        value must be 2-100 characters long.
     */

    public void setUsers(java.util.Collection<User> users) {
        if (users == null) {
            this.users = null;
            return;
        }

        this.users = new java.util.ArrayList<User>(users);
    }

    /**
     * Required. The list of ActiveMQ users (persons or applications) who can access queues and topics. This value can
     * contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be
     * 2-100 characters long.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsers(java.util.Collection)} or {@link #withUsers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param users
     *        Required. The list of ActiveMQ users (persons or applications) who can access queues and topics. This
     *        value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This
     *        value must be 2-100 characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withUsers(User... users) {
        if (this.users == null) {
            setUsers(new java.util.ArrayList<User>(users.length));
        }
        for (User ele : users) {
            this.users.add(ele);
        }
        return this;
    }

    /**
     * Required. The list of ActiveMQ users (persons or applications) who can access queues and topics. This value can
     * contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be
     * 2-100 characters long.
     * 
     * @param users
     *        Required. The list of ActiveMQ users (persons or applications) who can access queues and topics. This
     *        value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This
     *        value must be 2-100 characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withUsers(java.util.Collection<User> users) {
        setUsers(users);
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
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getBrokerName() != null)
            sb.append("BrokerName: ").append(getBrokerName()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getDeploymentMode() != null)
            sb.append("DeploymentMode: ").append(getDeploymentMode()).append(",");
        if (getEngineType() != null)
            sb.append("EngineType: ").append(getEngineType()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getHostInstanceType() != null)
            sb.append("HostInstanceType: ").append(getHostInstanceType()).append(",");
        if (getLogs() != null)
            sb.append("Logs: ").append(getLogs()).append(",");
        if (getMaintenanceWindowStartTime() != null)
            sb.append("MaintenanceWindowStartTime: ").append(getMaintenanceWindowStartTime()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUsers() != null)
            sb.append("Users: ").append(getUsers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBrokerRequest == false)
            return false;
        CreateBrokerRequest other = (CreateBrokerRequest) obj;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getBrokerName() == null ^ this.getBrokerName() == null)
            return false;
        if (other.getBrokerName() != null && other.getBrokerName().equals(this.getBrokerName()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getDeploymentMode() == null ^ this.getDeploymentMode() == null)
            return false;
        if (other.getDeploymentMode() != null && other.getDeploymentMode().equals(this.getDeploymentMode()) == false)
            return false;
        if (other.getEngineType() == null ^ this.getEngineType() == null)
            return false;
        if (other.getEngineType() != null && other.getEngineType().equals(this.getEngineType()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getHostInstanceType() == null ^ this.getHostInstanceType() == null)
            return false;
        if (other.getHostInstanceType() != null && other.getHostInstanceType().equals(this.getHostInstanceType()) == false)
            return false;
        if (other.getLogs() == null ^ this.getLogs() == null)
            return false;
        if (other.getLogs() != null && other.getLogs().equals(this.getLogs()) == false)
            return false;
        if (other.getMaintenanceWindowStartTime() == null ^ this.getMaintenanceWindowStartTime() == null)
            return false;
        if (other.getMaintenanceWindowStartTime() != null && other.getMaintenanceWindowStartTime().equals(this.getMaintenanceWindowStartTime()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUsers() == null ^ this.getUsers() == null)
            return false;
        if (other.getUsers() != null && other.getUsers().equals(this.getUsers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getBrokerName() == null) ? 0 : getBrokerName().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentMode() == null) ? 0 : getDeploymentMode().hashCode());
        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getHostInstanceType() == null) ? 0 : getHostInstanceType().hashCode());
        hashCode = prime * hashCode + ((getLogs() == null) ? 0 : getLogs().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceWindowStartTime() == null) ? 0 : getMaintenanceWindowStartTime().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUsers() == null) ? 0 : getUsers().hashCode());
        return hashCode;
    }

    @Override
    public CreateBrokerRequest clone() {
        return (CreateBrokerRequest) super.clone();
    }

}
