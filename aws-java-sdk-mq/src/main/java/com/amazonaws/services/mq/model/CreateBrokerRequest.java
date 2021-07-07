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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a broker using the specified properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateBroker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBrokerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Optional. The authentication strategy used to secure the broker. The default is SIMPLE.
     * </p>
     */
    private String authenticationStrategy;
    /**
     * <p>
     * Enables automatic upgrades to new minor versions for brokers, as new versions are released and supported by
     * Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a manual
     * broker reboot. Set to true by default, if no value is specified.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * Required. The broker's name. This value must be unique in your AWS account, 1-50 characters long, must contain
     * only letters, numbers, dashes, and underscores, and must not contain white spaces, brackets, wildcard characters,
     * or special characters.
     * </p>
     */
    private String brokerName;
    /**
     * <p>
     * A list of information about the configuration.
     * </p>
     */
    private ConfigurationId configuration;
    /**
     * <p>
     * The unique ID that the requester receives for the created broker. Amazon MQ passes your ID with the API action.
     * Note: We recommend using a Universally Unique Identifier (UUID) for the creatorRequestId. You may omit the
     * creatorRequestId if your application doesn't require idempotency.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * Required. The broker's deployment mode.
     * </p>
     */
    private String deploymentMode;
    /**
     * <p>
     * Encryption options for the broker. Does not apply to RabbitMQ brokers.
     * </p>
     */
    private EncryptionOptions encryptionOptions;
    /**
     * <p>
     * Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * </p>
     */
    private String engineType;
    /**
     * <p>
     * Required. The broker engine's version. For a list of supported engine versions, see <a
     * href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported engines</a>.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Required. The broker's instance type.
     * </p>
     */
    private String hostInstanceType;
    /**
     * <p>
     * Optional. The metadata of the LDAP server used to authenticate and authorize connections to the broker. Does not
     * apply to RabbitMQ brokers.
     * </p>
     */
    private LdapServerMetadataInput ldapServerMetadata;
    /**
     * <p>
     * Enables Amazon CloudWatch logging for brokers.
     * </p>
     */
    private Logs logs;
    /**
     * <p>
     * The parameters that determine the WeeklyStartTime.
     * </p>
     */
    private WeeklyStartTime maintenanceWindowStartTime;
    /**
     * <p>
     * Enables connections from applications outside of the VPC that hosts the broker's subnets. Set to false by
     * default, if no value is provided.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     * </p>
     */
    private java.util.List<String> securityGroups;
    /**
     * <p>
     * The broker's storage type.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The list of groups that define which subnets and IP ranges the broker can use from different Availability Zones.
     * If you specify more than one subnet, the subnets must be in different Availability Zones. Amazon MQ will not be
     * able to create VPC endpoints for your broker with multiple subnets in the same Availability Zone. A
     * SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ
     * Amazon MQ for ActiveMQ deployment requires two subnets. A CLUSTER_MULTI_AZ Amazon MQ for RabbitMQ deployment has
     * no subnet requirements when deployed with public accessibility. Deployment without public accessibility requires
     * at least one subnet.
     * </p>
     * <important>
     * <p>
     * If you specify subnets in a <a href="https://docs.aws.amazon.com/vpc/latest/userguide/vpc-sharing.html">shared
     * VPC</a> for a RabbitMQ broker, the associated VPC to which the specified subnets belong must be owned by your AWS
     * account. Amazon MQ will not be able to create VPC endpoints in VPCs that are not owned by your AWS account.
     * </p>
     * </important>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * Create tags when creating the broker.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Required. The list of broker users (persons or applications) who can access queues and topics. This value can
     * contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be
     * 2-100 characters long.
     * </p>
     * <important><title>Amazon MQ for RabbitMQ</title>
     * <p>
     * When you create an Amazon MQ for RabbitMQ broker, one and only one administrative user is accepted and created
     * when a broker is first provisioned. All subsequent broker users are created by making RabbitMQ API calls directly
     * to brokers or via the RabbitMQ web console.
     * </p>
     * </important>
     */
    private java.util.List<User> users;

    /**
     * <p>
     * Optional. The authentication strategy used to secure the broker. The default is SIMPLE.
     * </p>
     * 
     * @param authenticationStrategy
     *        Optional. The authentication strategy used to secure the broker. The default is SIMPLE.
     * @see AuthenticationStrategy
     */

    public void setAuthenticationStrategy(String authenticationStrategy) {
        this.authenticationStrategy = authenticationStrategy;
    }

    /**
     * <p>
     * Optional. The authentication strategy used to secure the broker. The default is SIMPLE.
     * </p>
     * 
     * @return Optional. The authentication strategy used to secure the broker. The default is SIMPLE.
     * @see AuthenticationStrategy
     */

    public String getAuthenticationStrategy() {
        return this.authenticationStrategy;
    }

    /**
     * <p>
     * Optional. The authentication strategy used to secure the broker. The default is SIMPLE.
     * </p>
     * 
     * @param authenticationStrategy
     *        Optional. The authentication strategy used to secure the broker. The default is SIMPLE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationStrategy
     */

    public CreateBrokerRequest withAuthenticationStrategy(String authenticationStrategy) {
        setAuthenticationStrategy(authenticationStrategy);
        return this;
    }

    /**
     * <p>
     * Optional. The authentication strategy used to secure the broker. The default is SIMPLE.
     * </p>
     * 
     * @param authenticationStrategy
     *        Optional. The authentication strategy used to secure the broker. The default is SIMPLE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationStrategy
     */

    public CreateBrokerRequest withAuthenticationStrategy(AuthenticationStrategy authenticationStrategy) {
        this.authenticationStrategy = authenticationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * Enables automatic upgrades to new minor versions for brokers, as new versions are released and supported by
     * Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a manual
     * broker reboot. Set to true by default, if no value is specified.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Enables automatic upgrades to new minor versions for brokers, as new versions are released and supported
     *        by Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a
     *        manual broker reboot. Set to true by default, if no value is specified.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Enables automatic upgrades to new minor versions for brokers, as new versions are released and supported by
     * Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a manual
     * broker reboot. Set to true by default, if no value is specified.
     * </p>
     * 
     * @return Enables automatic upgrades to new minor versions for brokers, as new versions are released and supported
     *         by Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a
     *         manual broker reboot. Set to true by default, if no value is specified.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Enables automatic upgrades to new minor versions for brokers, as new versions are released and supported by
     * Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a manual
     * broker reboot. Set to true by default, if no value is specified.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Enables automatic upgrades to new minor versions for brokers, as new versions are released and supported
     *        by Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a
     *        manual broker reboot. Set to true by default, if no value is specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * Enables automatic upgrades to new minor versions for brokers, as new versions are released and supported by
     * Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a manual
     * broker reboot. Set to true by default, if no value is specified.
     * </p>
     * 
     * @return Enables automatic upgrades to new minor versions for brokers, as new versions are released and supported
     *         by Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a
     *         manual broker reboot. Set to true by default, if no value is specified.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Required. The broker's name. This value must be unique in your AWS account, 1-50 characters long, must contain
     * only letters, numbers, dashes, and underscores, and must not contain white spaces, brackets, wildcard characters,
     * or special characters.
     * </p>
     * 
     * @param brokerName
     *        Required. The broker's name. This value must be unique in your AWS account, 1-50 characters long, must
     *        contain only letters, numbers, dashes, and underscores, and must not contain white spaces, brackets,
     *        wildcard characters, or special characters.
     */

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    /**
     * <p>
     * Required. The broker's name. This value must be unique in your AWS account, 1-50 characters long, must contain
     * only letters, numbers, dashes, and underscores, and must not contain white spaces, brackets, wildcard characters,
     * or special characters.
     * </p>
     * 
     * @return Required. The broker's name. This value must be unique in your AWS account, 1-50 characters long, must
     *         contain only letters, numbers, dashes, and underscores, and must not contain white spaces, brackets,
     *         wildcard characters, or special characters.
     */

    public String getBrokerName() {
        return this.brokerName;
    }

    /**
     * <p>
     * Required. The broker's name. This value must be unique in your AWS account, 1-50 characters long, must contain
     * only letters, numbers, dashes, and underscores, and must not contain white spaces, brackets, wildcard characters,
     * or special characters.
     * </p>
     * 
     * @param brokerName
     *        Required. The broker's name. This value must be unique in your AWS account, 1-50 characters long, must
     *        contain only letters, numbers, dashes, and underscores, and must not contain white spaces, brackets,
     *        wildcard characters, or special characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withBrokerName(String brokerName) {
        setBrokerName(brokerName);
        return this;
    }

    /**
     * <p>
     * A list of information about the configuration.
     * </p>
     * 
     * @param configuration
     *        A list of information about the configuration.
     */

    public void setConfiguration(ConfigurationId configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * A list of information about the configuration.
     * </p>
     * 
     * @return A list of information about the configuration.
     */

    public ConfigurationId getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * A list of information about the configuration.
     * </p>
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
     * <p>
     * The unique ID that the requester receives for the created broker. Amazon MQ passes your ID with the API action.
     * Note: We recommend using a Universally Unique Identifier (UUID) for the creatorRequestId. You may omit the
     * creatorRequestId if your application doesn't require idempotency.
     * </p>
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
     * <p>
     * The unique ID that the requester receives for the created broker. Amazon MQ passes your ID with the API action.
     * Note: We recommend using a Universally Unique Identifier (UUID) for the creatorRequestId. You may omit the
     * creatorRequestId if your application doesn't require idempotency.
     * </p>
     * 
     * @return The unique ID that the requester receives for the created broker. Amazon MQ passes your ID with the API
     *         action. Note: We recommend using a Universally Unique Identifier (UUID) for the creatorRequestId. You may
     *         omit the creatorRequestId if your application doesn't require idempotency.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * The unique ID that the requester receives for the created broker. Amazon MQ passes your ID with the API action.
     * Note: We recommend using a Universally Unique Identifier (UUID) for the creatorRequestId. You may omit the
     * creatorRequestId if your application doesn't require idempotency.
     * </p>
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
     * <p>
     * Required. The broker's deployment mode.
     * </p>
     * 
     * @param deploymentMode
     *        Required. The broker's deployment mode.
     * @see DeploymentMode
     */

    public void setDeploymentMode(String deploymentMode) {
        this.deploymentMode = deploymentMode;
    }

    /**
     * <p>
     * Required. The broker's deployment mode.
     * </p>
     * 
     * @return Required. The broker's deployment mode.
     * @see DeploymentMode
     */

    public String getDeploymentMode() {
        return this.deploymentMode;
    }

    /**
     * <p>
     * Required. The broker's deployment mode.
     * </p>
     * 
     * @param deploymentMode
     *        Required. The broker's deployment mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentMode
     */

    public CreateBrokerRequest withDeploymentMode(String deploymentMode) {
        setDeploymentMode(deploymentMode);
        return this;
    }

    /**
     * <p>
     * Required. The broker's deployment mode.
     * </p>
     * 
     * @param deploymentMode
     *        Required. The broker's deployment mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentMode
     */

    public CreateBrokerRequest withDeploymentMode(DeploymentMode deploymentMode) {
        this.deploymentMode = deploymentMode.toString();
        return this;
    }

    /**
     * <p>
     * Encryption options for the broker. Does not apply to RabbitMQ brokers.
     * </p>
     * 
     * @param encryptionOptions
     *        Encryption options for the broker. Does not apply to RabbitMQ brokers.
     */

    public void setEncryptionOptions(EncryptionOptions encryptionOptions) {
        this.encryptionOptions = encryptionOptions;
    }

    /**
     * <p>
     * Encryption options for the broker. Does not apply to RabbitMQ brokers.
     * </p>
     * 
     * @return Encryption options for the broker. Does not apply to RabbitMQ brokers.
     */

    public EncryptionOptions getEncryptionOptions() {
        return this.encryptionOptions;
    }

    /**
     * <p>
     * Encryption options for the broker. Does not apply to RabbitMQ brokers.
     * </p>
     * 
     * @param encryptionOptions
     *        Encryption options for the broker. Does not apply to RabbitMQ brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withEncryptionOptions(EncryptionOptions encryptionOptions) {
        setEncryptionOptions(encryptionOptions);
        return this;
    }

    /**
     * <p>
     * Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * </p>
     * 
     * @param engineType
     *        Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * @see EngineType
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * <p>
     * Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * </p>
     * 
     * @return Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * @see EngineType
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * <p>
     * Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * </p>
     * 
     * @param engineType
     *        Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public CreateBrokerRequest withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * <p>
     * Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * </p>
     * 
     * @param engineType
     *        Required. The type of broker engine. Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public CreateBrokerRequest withEngineType(EngineType engineType) {
        this.engineType = engineType.toString();
        return this;
    }

    /**
     * <p>
     * Required. The broker engine's version. For a list of supported engine versions, see <a
     * href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported engines</a>.
     * </p>
     * 
     * @param engineVersion
     *        Required. The broker engine's version. For a list of supported engine versions, see <a
     *        href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported
     *        engines</a>.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * Required. The broker engine's version. For a list of supported engine versions, see <a
     * href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported engines</a>.
     * </p>
     * 
     * @return Required. The broker engine's version. For a list of supported engine versions, see <a
     *         href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported
     *         engines</a>.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * Required. The broker engine's version. For a list of supported engine versions, see <a
     * href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported engines</a>.
     * </p>
     * 
     * @param engineVersion
     *        Required. The broker engine's version. For a list of supported engine versions, see <a
     *        href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported
     *        engines</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Required. The broker's instance type.
     * </p>
     * 
     * @param hostInstanceType
     *        Required. The broker's instance type.
     */

    public void setHostInstanceType(String hostInstanceType) {
        this.hostInstanceType = hostInstanceType;
    }

    /**
     * <p>
     * Required. The broker's instance type.
     * </p>
     * 
     * @return Required. The broker's instance type.
     */

    public String getHostInstanceType() {
        return this.hostInstanceType;
    }

    /**
     * <p>
     * Required. The broker's instance type.
     * </p>
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
     * <p>
     * Optional. The metadata of the LDAP server used to authenticate and authorize connections to the broker. Does not
     * apply to RabbitMQ brokers.
     * </p>
     * 
     * @param ldapServerMetadata
     *        Optional. The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     *        Does not apply to RabbitMQ brokers.
     */

    public void setLdapServerMetadata(LdapServerMetadataInput ldapServerMetadata) {
        this.ldapServerMetadata = ldapServerMetadata;
    }

    /**
     * <p>
     * Optional. The metadata of the LDAP server used to authenticate and authorize connections to the broker. Does not
     * apply to RabbitMQ brokers.
     * </p>
     * 
     * @return Optional. The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     *         Does not apply to RabbitMQ brokers.
     */

    public LdapServerMetadataInput getLdapServerMetadata() {
        return this.ldapServerMetadata;
    }

    /**
     * <p>
     * Optional. The metadata of the LDAP server used to authenticate and authorize connections to the broker. Does not
     * apply to RabbitMQ brokers.
     * </p>
     * 
     * @param ldapServerMetadata
     *        Optional. The metadata of the LDAP server used to authenticate and authorize connections to the broker.
     *        Does not apply to RabbitMQ brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withLdapServerMetadata(LdapServerMetadataInput ldapServerMetadata) {
        setLdapServerMetadata(ldapServerMetadata);
        return this;
    }

    /**
     * <p>
     * Enables Amazon CloudWatch logging for brokers.
     * </p>
     * 
     * @param logs
     *        Enables Amazon CloudWatch logging for brokers.
     */

    public void setLogs(Logs logs) {
        this.logs = logs;
    }

    /**
     * <p>
     * Enables Amazon CloudWatch logging for brokers.
     * </p>
     * 
     * @return Enables Amazon CloudWatch logging for brokers.
     */

    public Logs getLogs() {
        return this.logs;
    }

    /**
     * <p>
     * Enables Amazon CloudWatch logging for brokers.
     * </p>
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
     * <p>
     * The parameters that determine the WeeklyStartTime.
     * </p>
     * 
     * @param maintenanceWindowStartTime
     *        The parameters that determine the WeeklyStartTime.
     */

    public void setMaintenanceWindowStartTime(WeeklyStartTime maintenanceWindowStartTime) {
        this.maintenanceWindowStartTime = maintenanceWindowStartTime;
    }

    /**
     * <p>
     * The parameters that determine the WeeklyStartTime.
     * </p>
     * 
     * @return The parameters that determine the WeeklyStartTime.
     */

    public WeeklyStartTime getMaintenanceWindowStartTime() {
        return this.maintenanceWindowStartTime;
    }

    /**
     * <p>
     * The parameters that determine the WeeklyStartTime.
     * </p>
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
     * <p>
     * Enables connections from applications outside of the VPC that hosts the broker's subnets. Set to false by
     * default, if no value is provided.
     * </p>
     * 
     * @param publiclyAccessible
     *        Enables connections from applications outside of the VPC that hosts the broker's subnets. Set to false by
     *        default, if no value is provided.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Enables connections from applications outside of the VPC that hosts the broker's subnets. Set to false by
     * default, if no value is provided.
     * </p>
     * 
     * @return Enables connections from applications outside of the VPC that hosts the broker's subnets. Set to false by
     *         default, if no value is provided.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Enables connections from applications outside of the VPC that hosts the broker's subnets. Set to false by
     * default, if no value is provided.
     * </p>
     * 
     * @param publiclyAccessible
     *        Enables connections from applications outside of the VPC that hosts the broker's subnets. Set to false by
     *        default, if no value is provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Enables connections from applications outside of the VPC that hosts the broker's subnets. Set to false by
     * default, if no value is provided.
     * </p>
     * 
     * @return Enables connections from applications outside of the VPC that hosts the broker's subnets. Set to false by
     *         default, if no value is provided.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     * </p>
     * 
     * @return The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     * </p>
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
     * <p>
     * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     * </p>
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
     * <p>
     * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
     * </p>
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
     * <p>
     * The broker's storage type.
     * </p>
     * 
     * @param storageType
     *        The broker's storage type.
     * @see BrokerStorageType
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The broker's storage type.
     * </p>
     * 
     * @return The broker's storage type.
     * @see BrokerStorageType
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The broker's storage type.
     * </p>
     * 
     * @param storageType
     *        The broker's storage type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BrokerStorageType
     */

    public CreateBrokerRequest withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The broker's storage type.
     * </p>
     * 
     * @param storageType
     *        The broker's storage type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BrokerStorageType
     */

    public CreateBrokerRequest withStorageType(BrokerStorageType storageType) {
        this.storageType = storageType.toString();
        return this;
    }

    /**
     * <p>
     * The list of groups that define which subnets and IP ranges the broker can use from different Availability Zones.
     * If you specify more than one subnet, the subnets must be in different Availability Zones. Amazon MQ will not be
     * able to create VPC endpoints for your broker with multiple subnets in the same Availability Zone. A
     * SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ
     * Amazon MQ for ActiveMQ deployment requires two subnets. A CLUSTER_MULTI_AZ Amazon MQ for RabbitMQ deployment has
     * no subnet requirements when deployed with public accessibility. Deployment without public accessibility requires
     * at least one subnet.
     * </p>
     * <important>
     * <p>
     * If you specify subnets in a <a href="https://docs.aws.amazon.com/vpc/latest/userguide/vpc-sharing.html">shared
     * VPC</a> for a RabbitMQ broker, the associated VPC to which the specified subnets belong must be owned by your AWS
     * account. Amazon MQ will not be able to create VPC endpoints in VPCs that are not owned by your AWS account.
     * </p>
     * </important>
     * 
     * @return The list of groups that define which subnets and IP ranges the broker can use from different Availability
     *         Zones. If you specify more than one subnet, the subnets must be in different Availability Zones. Amazon
     *         MQ will not be able to create VPC endpoints for your broker with multiple subnets in the same
     *         Availability Zone. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An
     *         ACTIVE_STANDBY_MULTI_AZ Amazon MQ for ActiveMQ deployment requires two subnets. A CLUSTER_MULTI_AZ Amazon
     *         MQ for RabbitMQ deployment has no subnet requirements when deployed with public accessibility. Deployment
     *         without public accessibility requires at least one subnet.</p> <important>
     *         <p>
     *         If you specify subnets in a <a
     *         href="https://docs.aws.amazon.com/vpc/latest/userguide/vpc-sharing.html">shared VPC</a> for a RabbitMQ
     *         broker, the associated VPC to which the specified subnets belong must be owned by your AWS account.
     *         Amazon MQ will not be able to create VPC endpoints in VPCs that are not owned by your AWS account.
     *         </p>
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The list of groups that define which subnets and IP ranges the broker can use from different Availability Zones.
     * If you specify more than one subnet, the subnets must be in different Availability Zones. Amazon MQ will not be
     * able to create VPC endpoints for your broker with multiple subnets in the same Availability Zone. A
     * SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ
     * Amazon MQ for ActiveMQ deployment requires two subnets. A CLUSTER_MULTI_AZ Amazon MQ for RabbitMQ deployment has
     * no subnet requirements when deployed with public accessibility. Deployment without public accessibility requires
     * at least one subnet.
     * </p>
     * <important>
     * <p>
     * If you specify subnets in a <a href="https://docs.aws.amazon.com/vpc/latest/userguide/vpc-sharing.html">shared
     * VPC</a> for a RabbitMQ broker, the associated VPC to which the specified subnets belong must be owned by your AWS
     * account. Amazon MQ will not be able to create VPC endpoints in VPCs that are not owned by your AWS account.
     * </p>
     * </important>
     * 
     * @param subnetIds
     *        The list of groups that define which subnets and IP ranges the broker can use from different Availability
     *        Zones. If you specify more than one subnet, the subnets must be in different Availability Zones. Amazon MQ
     *        will not be able to create VPC endpoints for your broker with multiple subnets in the same Availability
     *        Zone. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An
     *        ACTIVE_STANDBY_MULTI_AZ Amazon MQ for ActiveMQ deployment requires two subnets. A CLUSTER_MULTI_AZ Amazon
     *        MQ for RabbitMQ deployment has no subnet requirements when deployed with public accessibility. Deployment
     *        without public accessibility requires at least one subnet.</p> <important>
     *        <p>
     *        If you specify subnets in a <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/vpc-sharing.html">shared VPC</a> for a RabbitMQ
     *        broker, the associated VPC to which the specified subnets belong must be owned by your AWS account. Amazon
     *        MQ will not be able to create VPC endpoints in VPCs that are not owned by your AWS account.
     *        </p>
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * The list of groups that define which subnets and IP ranges the broker can use from different Availability Zones.
     * If you specify more than one subnet, the subnets must be in different Availability Zones. Amazon MQ will not be
     * able to create VPC endpoints for your broker with multiple subnets in the same Availability Zone. A
     * SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ
     * Amazon MQ for ActiveMQ deployment requires two subnets. A CLUSTER_MULTI_AZ Amazon MQ for RabbitMQ deployment has
     * no subnet requirements when deployed with public accessibility. Deployment without public accessibility requires
     * at least one subnet.
     * </p>
     * <important>
     * <p>
     * If you specify subnets in a <a href="https://docs.aws.amazon.com/vpc/latest/userguide/vpc-sharing.html">shared
     * VPC</a> for a RabbitMQ broker, the associated VPC to which the specified subnets belong must be owned by your AWS
     * account. Amazon MQ will not be able to create VPC endpoints in VPCs that are not owned by your AWS account.
     * </p>
     * </important>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The list of groups that define which subnets and IP ranges the broker can use from different Availability
     *        Zones. If you specify more than one subnet, the subnets must be in different Availability Zones. Amazon MQ
     *        will not be able to create VPC endpoints for your broker with multiple subnets in the same Availability
     *        Zone. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An
     *        ACTIVE_STANDBY_MULTI_AZ Amazon MQ for ActiveMQ deployment requires two subnets. A CLUSTER_MULTI_AZ Amazon
     *        MQ for RabbitMQ deployment has no subnet requirements when deployed with public accessibility. Deployment
     *        without public accessibility requires at least one subnet.</p> <important>
     *        <p>
     *        If you specify subnets in a <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/vpc-sharing.html">shared VPC</a> for a RabbitMQ
     *        broker, the associated VPC to which the specified subnets belong must be owned by your AWS account. Amazon
     *        MQ will not be able to create VPC endpoints in VPCs that are not owned by your AWS account.
     *        </p>
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
     * <p>
     * The list of groups that define which subnets and IP ranges the broker can use from different Availability Zones.
     * If you specify more than one subnet, the subnets must be in different Availability Zones. Amazon MQ will not be
     * able to create VPC endpoints for your broker with multiple subnets in the same Availability Zone. A
     * SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ
     * Amazon MQ for ActiveMQ deployment requires two subnets. A CLUSTER_MULTI_AZ Amazon MQ for RabbitMQ deployment has
     * no subnet requirements when deployed with public accessibility. Deployment without public accessibility requires
     * at least one subnet.
     * </p>
     * <important>
     * <p>
     * If you specify subnets in a <a href="https://docs.aws.amazon.com/vpc/latest/userguide/vpc-sharing.html">shared
     * VPC</a> for a RabbitMQ broker, the associated VPC to which the specified subnets belong must be owned by your AWS
     * account. Amazon MQ will not be able to create VPC endpoints in VPCs that are not owned by your AWS account.
     * </p>
     * </important>
     * 
     * @param subnetIds
     *        The list of groups that define which subnets and IP ranges the broker can use from different Availability
     *        Zones. If you specify more than one subnet, the subnets must be in different Availability Zones. Amazon MQ
     *        will not be able to create VPC endpoints for your broker with multiple subnets in the same Availability
     *        Zone. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An
     *        ACTIVE_STANDBY_MULTI_AZ Amazon MQ for ActiveMQ deployment requires two subnets. A CLUSTER_MULTI_AZ Amazon
     *        MQ for RabbitMQ deployment has no subnet requirements when deployed with public accessibility. Deployment
     *        without public accessibility requires at least one subnet.</p> <important>
     *        <p>
     *        If you specify subnets in a <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/vpc-sharing.html">shared VPC</a> for a RabbitMQ
     *        broker, the associated VPC to which the specified subnets belong must be owned by your AWS account. Amazon
     *        MQ will not be able to create VPC endpoints in VPCs that are not owned by your AWS account.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * Create tags when creating the broker.
     * </p>
     * 
     * @return Create tags when creating the broker.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Create tags when creating the broker.
     * </p>
     * 
     * @param tags
     *        Create tags when creating the broker.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Create tags when creating the broker.
     * </p>
     * 
     * @param tags
     *        Create tags when creating the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBrokerRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateBrokerRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

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
     * <p>
     * Required. The list of broker users (persons or applications) who can access queues and topics. This value can
     * contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be
     * 2-100 characters long.
     * </p>
     * <important><title>Amazon MQ for RabbitMQ</title>
     * <p>
     * When you create an Amazon MQ for RabbitMQ broker, one and only one administrative user is accepted and created
     * when a broker is first provisioned. All subsequent broker users are created by making RabbitMQ API calls directly
     * to brokers or via the RabbitMQ web console.
     * </p>
     * </important>
     * 
     * @return Required. The list of broker users (persons or applications) who can access queues and topics. This value
     *         can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value
     *         must be 2-100 characters long.</p> <important><title>Amazon MQ for RabbitMQ</title>
     *         <p>
     *         When you create an Amazon MQ for RabbitMQ broker, one and only one administrative user is accepted and
     *         created when a broker is first provisioned. All subsequent broker users are created by making RabbitMQ
     *         API calls directly to brokers or via the RabbitMQ web console.
     *         </p>
     */

    public java.util.List<User> getUsers() {
        return users;
    }

    /**
     * <p>
     * Required. The list of broker users (persons or applications) who can access queues and topics. This value can
     * contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be
     * 2-100 characters long.
     * </p>
     * <important><title>Amazon MQ for RabbitMQ</title>
     * <p>
     * When you create an Amazon MQ for RabbitMQ broker, one and only one administrative user is accepted and created
     * when a broker is first provisioned. All subsequent broker users are created by making RabbitMQ API calls directly
     * to brokers or via the RabbitMQ web console.
     * </p>
     * </important>
     * 
     * @param users
     *        Required. The list of broker users (persons or applications) who can access queues and topics. This value
     *        can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value
     *        must be 2-100 characters long.</p> <important><title>Amazon MQ for RabbitMQ</title>
     *        <p>
     *        When you create an Amazon MQ for RabbitMQ broker, one and only one administrative user is accepted and
     *        created when a broker is first provisioned. All subsequent broker users are created by making RabbitMQ API
     *        calls directly to brokers or via the RabbitMQ web console.
     *        </p>
     */

    public void setUsers(java.util.Collection<User> users) {
        if (users == null) {
            this.users = null;
            return;
        }

        this.users = new java.util.ArrayList<User>(users);
    }

    /**
     * <p>
     * Required. The list of broker users (persons or applications) who can access queues and topics. This value can
     * contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be
     * 2-100 characters long.
     * </p>
     * <important><title>Amazon MQ for RabbitMQ</title>
     * <p>
     * When you create an Amazon MQ for RabbitMQ broker, one and only one administrative user is accepted and created
     * when a broker is first provisioned. All subsequent broker users are created by making RabbitMQ API calls directly
     * to brokers or via the RabbitMQ web console.
     * </p>
     * </important>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsers(java.util.Collection)} or {@link #withUsers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param users
     *        Required. The list of broker users (persons or applications) who can access queues and topics. This value
     *        can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value
     *        must be 2-100 characters long.</p> <important><title>Amazon MQ for RabbitMQ</title>
     *        <p>
     *        When you create an Amazon MQ for RabbitMQ broker, one and only one administrative user is accepted and
     *        created when a broker is first provisioned. All subsequent broker users are created by making RabbitMQ API
     *        calls directly to brokers or via the RabbitMQ web console.
     *        </p>
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
     * <p>
     * Required. The list of broker users (persons or applications) who can access queues and topics. This value can
     * contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be
     * 2-100 characters long.
     * </p>
     * <important><title>Amazon MQ for RabbitMQ</title>
     * <p>
     * When you create an Amazon MQ for RabbitMQ broker, one and only one administrative user is accepted and created
     * when a broker is first provisioned. All subsequent broker users are created by making RabbitMQ API calls directly
     * to brokers or via the RabbitMQ web console.
     * </p>
     * </important>
     * 
     * @param users
     *        Required. The list of broker users (persons or applications) who can access queues and topics. This value
     *        can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value
     *        must be 2-100 characters long.</p> <important><title>Amazon MQ for RabbitMQ</title>
     *        <p>
     *        When you create an Amazon MQ for RabbitMQ broker, one and only one administrative user is accepted and
     *        created when a broker is first provisioned. All subsequent broker users are created by making RabbitMQ API
     *        calls directly to brokers or via the RabbitMQ web console.
     *        </p>
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
        if (getAuthenticationStrategy() != null)
            sb.append("AuthenticationStrategy: ").append(getAuthenticationStrategy()).append(",");
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
        if (getEncryptionOptions() != null)
            sb.append("EncryptionOptions: ").append(getEncryptionOptions()).append(",");
        if (getEngineType() != null)
            sb.append("EngineType: ").append(getEngineType()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getHostInstanceType() != null)
            sb.append("HostInstanceType: ").append(getHostInstanceType()).append(",");
        if (getLdapServerMetadata() != null)
            sb.append("LdapServerMetadata: ").append(getLdapServerMetadata()).append(",");
        if (getLogs() != null)
            sb.append("Logs: ").append(getLogs()).append(",");
        if (getMaintenanceWindowStartTime() != null)
            sb.append("MaintenanceWindowStartTime: ").append(getMaintenanceWindowStartTime()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
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
        if (other.getAuthenticationStrategy() == null ^ this.getAuthenticationStrategy() == null)
            return false;
        if (other.getAuthenticationStrategy() != null && other.getAuthenticationStrategy().equals(this.getAuthenticationStrategy()) == false)
            return false;
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
        if (other.getEncryptionOptions() == null ^ this.getEncryptionOptions() == null)
            return false;
        if (other.getEncryptionOptions() != null && other.getEncryptionOptions().equals(this.getEncryptionOptions()) == false)
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
        if (other.getLdapServerMetadata() == null ^ this.getLdapServerMetadata() == null)
            return false;
        if (other.getLdapServerMetadata() != null && other.getLdapServerMetadata().equals(this.getLdapServerMetadata()) == false)
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
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
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

        hashCode = prime * hashCode + ((getAuthenticationStrategy() == null) ? 0 : getAuthenticationStrategy().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getBrokerName() == null) ? 0 : getBrokerName().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentMode() == null) ? 0 : getDeploymentMode().hashCode());
        hashCode = prime * hashCode + ((getEncryptionOptions() == null) ? 0 : getEncryptionOptions().hashCode());
        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getHostInstanceType() == null) ? 0 : getHostInstanceType().hashCode());
        hashCode = prime * hashCode + ((getLdapServerMetadata() == null) ? 0 : getLdapServerMetadata().hashCode());
        hashCode = prime * hashCode + ((getLogs() == null) ? 0 : getLogs().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceWindowStartTime() == null) ? 0 : getMaintenanceWindowStartTime().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
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
