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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about an Amazon MQ message broker. A message broker allows software applications and components to
 * communicate using various programming languages, operating systems, and formal messaging protocols.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAmazonMqBrokerDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAmazonMqBrokerDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The authentication strategy used to secure the broker. The default is <code>SIMPLE</code>.
     * </p>
     */
    private String authenticationStrategy;
    /**
     * <p>
     * Whether automatically upgrade new minor versions for brokers, as new versions are released and supported by
     * Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a manual
     * broker reboot.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the broker.
     * </p>
     */
    private String brokerArn;
    /**
     * <p>
     * The broker's name.
     * </p>
     */
    private String brokerName;
    /**
     * <p>
     * The broker's deployment mode.
     * </p>
     */
    private String deploymentMode;
    /**
     * <p>
     * Encryption options for the broker. Doesn’t apply to RabbitMQ brokers.
     * </p>
     */
    private AwsAmazonMqBrokerEncryptionOptionsDetails encryptionOptions;
    /**
     * <p>
     * The type of broker engine.
     * </p>
     */
    private String engineType;
    /**
     * <p>
     * The version of the broker engine.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The broker's instance type.
     * </p>
     */
    private String hostInstanceType;
    /**
     * <p>
     * The unique ID that Amazon MQ generates for the broker.
     * </p>
     */
    private String brokerId;
    /**
     * <p>
     * The metadata of the Lightweight Directory Access Protocol (LDAP) server used to authenticate and authorize
     * connections to the broker. This is an optional failover server.
     * </p>
     */
    private AwsAmazonMqBrokerLdapServerMetadataDetails ldapServerMetadata;
    /**
     * <p>
     * Turns on Amazon CloudWatch logging for brokers.
     * </p>
     */
    private AwsAmazonMqBrokerLogsDetails logs;
    /**
     * <p>
     * The scheduled time period (UTC) during which Amazon MQ begins to apply pending updates or patches to the broker.
     * </p>
     */
    private AwsAmazonMqBrokerMaintenanceWindowStartTimeDetails maintenanceWindowStartTime;
    /**
     * <p>
     * Permits connections from applications outside of the VPC that hosts the broker's subnets.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * The list of rules (one minimum, 125 maximum) that authorize connections to brokers.
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
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The list of all broker usernames for the specified broker. Doesn't apply to RabbitMQ brokers.
     * </p>
     */
    private java.util.List<AwsAmazonMqBrokerUsersDetails> users;

    /**
     * <p>
     * The authentication strategy used to secure the broker. The default is <code>SIMPLE</code>.
     * </p>
     * 
     * @param authenticationStrategy
     *        The authentication strategy used to secure the broker. The default is <code>SIMPLE</code>.
     */

    public void setAuthenticationStrategy(String authenticationStrategy) {
        this.authenticationStrategy = authenticationStrategy;
    }

    /**
     * <p>
     * The authentication strategy used to secure the broker. The default is <code>SIMPLE</code>.
     * </p>
     * 
     * @return The authentication strategy used to secure the broker. The default is <code>SIMPLE</code>.
     */

    public String getAuthenticationStrategy() {
        return this.authenticationStrategy;
    }

    /**
     * <p>
     * The authentication strategy used to secure the broker. The default is <code>SIMPLE</code>.
     * </p>
     * 
     * @param authenticationStrategy
     *        The authentication strategy used to secure the broker. The default is <code>SIMPLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerDetails withAuthenticationStrategy(String authenticationStrategy) {
        setAuthenticationStrategy(authenticationStrategy);
        return this;
    }

    /**
     * <p>
     * Whether automatically upgrade new minor versions for brokers, as new versions are released and supported by
     * Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a manual
     * broker reboot.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Whether automatically upgrade new minor versions for brokers, as new versions are released and supported
     *        by Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a
     *        manual broker reboot.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Whether automatically upgrade new minor versions for brokers, as new versions are released and supported by
     * Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a manual
     * broker reboot.
     * </p>
     * 
     * @return Whether automatically upgrade new minor versions for brokers, as new versions are released and supported
     *         by Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a
     *         manual broker reboot.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Whether automatically upgrade new minor versions for brokers, as new versions are released and supported by
     * Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a manual
     * broker reboot.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Whether automatically upgrade new minor versions for brokers, as new versions are released and supported
     *        by Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a
     *        manual broker reboot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerDetails withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * Whether automatically upgrade new minor versions for brokers, as new versions are released and supported by
     * Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a manual
     * broker reboot.
     * </p>
     * 
     * @return Whether automatically upgrade new minor versions for brokers, as new versions are released and supported
     *         by Amazon MQ. Automatic upgrades occur during the scheduled maintenance window of the broker or after a
     *         manual broker reboot.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the broker.
     * </p>
     * 
     * @param brokerArn
     *        The Amazon Resource Name (ARN) of the broker.
     */

    public void setBrokerArn(String brokerArn) {
        this.brokerArn = brokerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the broker.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the broker.
     */

    public String getBrokerArn() {
        return this.brokerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the broker.
     * </p>
     * 
     * @param brokerArn
     *        The Amazon Resource Name (ARN) of the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerDetails withBrokerArn(String brokerArn) {
        setBrokerArn(brokerArn);
        return this;
    }

    /**
     * <p>
     * The broker's name.
     * </p>
     * 
     * @param brokerName
     *        The broker's name.
     */

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    /**
     * <p>
     * The broker's name.
     * </p>
     * 
     * @return The broker's name.
     */

    public String getBrokerName() {
        return this.brokerName;
    }

    /**
     * <p>
     * The broker's name.
     * </p>
     * 
     * @param brokerName
     *        The broker's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerDetails withBrokerName(String brokerName) {
        setBrokerName(brokerName);
        return this;
    }

    /**
     * <p>
     * The broker's deployment mode.
     * </p>
     * 
     * @param deploymentMode
     *        The broker's deployment mode.
     */

    public void setDeploymentMode(String deploymentMode) {
        this.deploymentMode = deploymentMode;
    }

    /**
     * <p>
     * The broker's deployment mode.
     * </p>
     * 
     * @return The broker's deployment mode.
     */

    public String getDeploymentMode() {
        return this.deploymentMode;
    }

    /**
     * <p>
     * The broker's deployment mode.
     * </p>
     * 
     * @param deploymentMode
     *        The broker's deployment mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerDetails withDeploymentMode(String deploymentMode) {
        setDeploymentMode(deploymentMode);
        return this;
    }

    /**
     * <p>
     * Encryption options for the broker. Doesn’t apply to RabbitMQ brokers.
     * </p>
     * 
     * @param encryptionOptions
     *        Encryption options for the broker. Doesn’t apply to RabbitMQ brokers.
     */

    public void setEncryptionOptions(AwsAmazonMqBrokerEncryptionOptionsDetails encryptionOptions) {
        this.encryptionOptions = encryptionOptions;
    }

    /**
     * <p>
     * Encryption options for the broker. Doesn’t apply to RabbitMQ brokers.
     * </p>
     * 
     * @return Encryption options for the broker. Doesn’t apply to RabbitMQ brokers.
     */

    public AwsAmazonMqBrokerEncryptionOptionsDetails getEncryptionOptions() {
        return this.encryptionOptions;
    }

    /**
     * <p>
     * Encryption options for the broker. Doesn’t apply to RabbitMQ brokers.
     * </p>
     * 
     * @param encryptionOptions
     *        Encryption options for the broker. Doesn’t apply to RabbitMQ brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerDetails withEncryptionOptions(AwsAmazonMqBrokerEncryptionOptionsDetails encryptionOptions) {
        setEncryptionOptions(encryptionOptions);
        return this;
    }

    /**
     * <p>
     * The type of broker engine.
     * </p>
     * 
     * @param engineType
     *        The type of broker engine.
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * <p>
     * The type of broker engine.
     * </p>
     * 
     * @return The type of broker engine.
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * <p>
     * The type of broker engine.
     * </p>
     * 
     * @param engineType
     *        The type of broker engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerDetails withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * <p>
     * The version of the broker engine.
     * </p>
     * 
     * @param engineVersion
     *        The version of the broker engine.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the broker engine.
     * </p>
     * 
     * @return The version of the broker engine.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version of the broker engine.
     * </p>
     * 
     * @param engineVersion
     *        The version of the broker engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerDetails withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The broker's instance type.
     * </p>
     * 
     * @param hostInstanceType
     *        The broker's instance type.
     */

    public void setHostInstanceType(String hostInstanceType) {
        this.hostInstanceType = hostInstanceType;
    }

    /**
     * <p>
     * The broker's instance type.
     * </p>
     * 
     * @return The broker's instance type.
     */

    public String getHostInstanceType() {
        return this.hostInstanceType;
    }

    /**
     * <p>
     * The broker's instance type.
     * </p>
     * 
     * @param hostInstanceType
     *        The broker's instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerDetails withHostInstanceType(String hostInstanceType) {
        setHostInstanceType(hostInstanceType);
        return this;
    }

    /**
     * <p>
     * The unique ID that Amazon MQ generates for the broker.
     * </p>
     * 
     * @param brokerId
     *        The unique ID that Amazon MQ generates for the broker.
     */

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    /**
     * <p>
     * The unique ID that Amazon MQ generates for the broker.
     * </p>
     * 
     * @return The unique ID that Amazon MQ generates for the broker.
     */

    public String getBrokerId() {
        return this.brokerId;
    }

    /**
     * <p>
     * The unique ID that Amazon MQ generates for the broker.
     * </p>
     * 
     * @param brokerId
     *        The unique ID that Amazon MQ generates for the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerDetails withBrokerId(String brokerId) {
        setBrokerId(brokerId);
        return this;
    }

    /**
     * <p>
     * The metadata of the Lightweight Directory Access Protocol (LDAP) server used to authenticate and authorize
     * connections to the broker. This is an optional failover server.
     * </p>
     * 
     * @param ldapServerMetadata
     *        The metadata of the Lightweight Directory Access Protocol (LDAP) server used to authenticate and authorize
     *        connections to the broker. This is an optional failover server.
     */

    public void setLdapServerMetadata(AwsAmazonMqBrokerLdapServerMetadataDetails ldapServerMetadata) {
        this.ldapServerMetadata = ldapServerMetadata;
    }

    /**
     * <p>
     * The metadata of the Lightweight Directory Access Protocol (LDAP) server used to authenticate and authorize
     * connections to the broker. This is an optional failover server.
     * </p>
     * 
     * @return The metadata of the Lightweight Directory Access Protocol (LDAP) server used to authenticate and
     *         authorize connections to the broker. This is an optional failover server.
     */

    public AwsAmazonMqBrokerLdapServerMetadataDetails getLdapServerMetadata() {
        return this.ldapServerMetadata;
    }

    /**
     * <p>
     * The metadata of the Lightweight Directory Access Protocol (LDAP) server used to authenticate and authorize
     * connections to the broker. This is an optional failover server.
     * </p>
     * 
     * @param ldapServerMetadata
     *        The metadata of the Lightweight Directory Access Protocol (LDAP) server used to authenticate and authorize
     *        connections to the broker. This is an optional failover server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerDetails withLdapServerMetadata(AwsAmazonMqBrokerLdapServerMetadataDetails ldapServerMetadata) {
        setLdapServerMetadata(ldapServerMetadata);
        return this;
    }

    /**
     * <p>
     * Turns on Amazon CloudWatch logging for brokers.
     * </p>
     * 
     * @param logs
     *        Turns on Amazon CloudWatch logging for brokers.
     */

    public void setLogs(AwsAmazonMqBrokerLogsDetails logs) {
        this.logs = logs;
    }

    /**
     * <p>
     * Turns on Amazon CloudWatch logging for brokers.
     * </p>
     * 
     * @return Turns on Amazon CloudWatch logging for brokers.
     */

    public AwsAmazonMqBrokerLogsDetails getLogs() {
        return this.logs;
    }

    /**
     * <p>
     * Turns on Amazon CloudWatch logging for brokers.
     * </p>
     * 
     * @param logs
     *        Turns on Amazon CloudWatch logging for brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerDetails withLogs(AwsAmazonMqBrokerLogsDetails logs) {
        setLogs(logs);
        return this;
    }

    /**
     * <p>
     * The scheduled time period (UTC) during which Amazon MQ begins to apply pending updates or patches to the broker.
     * </p>
     * 
     * @param maintenanceWindowStartTime
     *        The scheduled time period (UTC) during which Amazon MQ begins to apply pending updates or patches to the
     *        broker.
     */

    public void setMaintenanceWindowStartTime(AwsAmazonMqBrokerMaintenanceWindowStartTimeDetails maintenanceWindowStartTime) {
        this.maintenanceWindowStartTime = maintenanceWindowStartTime;
    }

    /**
     * <p>
     * The scheduled time period (UTC) during which Amazon MQ begins to apply pending updates or patches to the broker.
     * </p>
     * 
     * @return The scheduled time period (UTC) during which Amazon MQ begins to apply pending updates or patches to the
     *         broker.
     */

    public AwsAmazonMqBrokerMaintenanceWindowStartTimeDetails getMaintenanceWindowStartTime() {
        return this.maintenanceWindowStartTime;
    }

    /**
     * <p>
     * The scheduled time period (UTC) during which Amazon MQ begins to apply pending updates or patches to the broker.
     * </p>
     * 
     * @param maintenanceWindowStartTime
     *        The scheduled time period (UTC) during which Amazon MQ begins to apply pending updates or patches to the
     *        broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerDetails withMaintenanceWindowStartTime(AwsAmazonMqBrokerMaintenanceWindowStartTimeDetails maintenanceWindowStartTime) {
        setMaintenanceWindowStartTime(maintenanceWindowStartTime);
        return this;
    }

    /**
     * <p>
     * Permits connections from applications outside of the VPC that hosts the broker's subnets.
     * </p>
     * 
     * @param publiclyAccessible
     *        Permits connections from applications outside of the VPC that hosts the broker's subnets.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Permits connections from applications outside of the VPC that hosts the broker's subnets.
     * </p>
     * 
     * @return Permits connections from applications outside of the VPC that hosts the broker's subnets.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Permits connections from applications outside of the VPC that hosts the broker's subnets.
     * </p>
     * 
     * @param publiclyAccessible
     *        Permits connections from applications outside of the VPC that hosts the broker's subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerDetails withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Permits connections from applications outside of the VPC that hosts the broker's subnets.
     * </p>
     * 
     * @return Permits connections from applications outside of the VPC that hosts the broker's subnets.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The list of rules (one minimum, 125 maximum) that authorize connections to brokers.
     * </p>
     * 
     * @return The list of rules (one minimum, 125 maximum) that authorize connections to brokers.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The list of rules (one minimum, 125 maximum) that authorize connections to brokers.
     * </p>
     * 
     * @param securityGroups
     *        The list of rules (one minimum, 125 maximum) that authorize connections to brokers.
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
     * The list of rules (one minimum, 125 maximum) that authorize connections to brokers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The list of rules (one minimum, 125 maximum) that authorize connections to brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerDetails withSecurityGroups(String... securityGroups) {
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
     * The list of rules (one minimum, 125 maximum) that authorize connections to brokers.
     * </p>
     * 
     * @param securityGroups
     *        The list of rules (one minimum, 125 maximum) that authorize connections to brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerDetails withSecurityGroups(java.util.Collection<String> securityGroups) {
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
     */

    public AwsAmazonMqBrokerDetails withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The list of groups that define which subnets and IP ranges the broker can use from different Availability Zones.
     * </p>
     * 
     * @return The list of groups that define which subnets and IP ranges the broker can use from different Availability
     *         Zones.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The list of groups that define which subnets and IP ranges the broker can use from different Availability Zones.
     * </p>
     * 
     * @param subnetIds
     *        The list of groups that define which subnets and IP ranges the broker can use from different Availability
     *        Zones.
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
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The list of groups that define which subnets and IP ranges the broker can use from different Availability
     *        Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerDetails withSubnetIds(String... subnetIds) {
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
     * </p>
     * 
     * @param subnetIds
     *        The list of groups that define which subnets and IP ranges the broker can use from different Availability
     *        Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerDetails withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The list of all broker usernames for the specified broker. Doesn't apply to RabbitMQ brokers.
     * </p>
     * 
     * @return The list of all broker usernames for the specified broker. Doesn't apply to RabbitMQ brokers.
     */

    public java.util.List<AwsAmazonMqBrokerUsersDetails> getUsers() {
        return users;
    }

    /**
     * <p>
     * The list of all broker usernames for the specified broker. Doesn't apply to RabbitMQ brokers.
     * </p>
     * 
     * @param users
     *        The list of all broker usernames for the specified broker. Doesn't apply to RabbitMQ brokers.
     */

    public void setUsers(java.util.Collection<AwsAmazonMqBrokerUsersDetails> users) {
        if (users == null) {
            this.users = null;
            return;
        }

        this.users = new java.util.ArrayList<AwsAmazonMqBrokerUsersDetails>(users);
    }

    /**
     * <p>
     * The list of all broker usernames for the specified broker. Doesn't apply to RabbitMQ brokers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsers(java.util.Collection)} or {@link #withUsers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param users
     *        The list of all broker usernames for the specified broker. Doesn't apply to RabbitMQ brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerDetails withUsers(AwsAmazonMqBrokerUsersDetails... users) {
        if (this.users == null) {
            setUsers(new java.util.ArrayList<AwsAmazonMqBrokerUsersDetails>(users.length));
        }
        for (AwsAmazonMqBrokerUsersDetails ele : users) {
            this.users.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of all broker usernames for the specified broker. Doesn't apply to RabbitMQ brokers.
     * </p>
     * 
     * @param users
     *        The list of all broker usernames for the specified broker. Doesn't apply to RabbitMQ brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerDetails withUsers(java.util.Collection<AwsAmazonMqBrokerUsersDetails> users) {
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
        if (getBrokerArn() != null)
            sb.append("BrokerArn: ").append(getBrokerArn()).append(",");
        if (getBrokerName() != null)
            sb.append("BrokerName: ").append(getBrokerName()).append(",");
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
        if (getBrokerId() != null)
            sb.append("BrokerId: ").append(getBrokerId()).append(",");
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

        if (obj instanceof AwsAmazonMqBrokerDetails == false)
            return false;
        AwsAmazonMqBrokerDetails other = (AwsAmazonMqBrokerDetails) obj;
        if (other.getAuthenticationStrategy() == null ^ this.getAuthenticationStrategy() == null)
            return false;
        if (other.getAuthenticationStrategy() != null && other.getAuthenticationStrategy().equals(this.getAuthenticationStrategy()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getBrokerArn() == null ^ this.getBrokerArn() == null)
            return false;
        if (other.getBrokerArn() != null && other.getBrokerArn().equals(this.getBrokerArn()) == false)
            return false;
        if (other.getBrokerName() == null ^ this.getBrokerName() == null)
            return false;
        if (other.getBrokerName() != null && other.getBrokerName().equals(this.getBrokerName()) == false)
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
        if (other.getBrokerId() == null ^ this.getBrokerId() == null)
            return false;
        if (other.getBrokerId() != null && other.getBrokerId().equals(this.getBrokerId()) == false)
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
        hashCode = prime * hashCode + ((getBrokerArn() == null) ? 0 : getBrokerArn().hashCode());
        hashCode = prime * hashCode + ((getBrokerName() == null) ? 0 : getBrokerName().hashCode());
        hashCode = prime * hashCode + ((getDeploymentMode() == null) ? 0 : getDeploymentMode().hashCode());
        hashCode = prime * hashCode + ((getEncryptionOptions() == null) ? 0 : getEncryptionOptions().hashCode());
        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getHostInstanceType() == null) ? 0 : getHostInstanceType().hashCode());
        hashCode = prime * hashCode + ((getBrokerId() == null) ? 0 : getBrokerId().hashCode());
        hashCode = prime * hashCode + ((getLdapServerMetadata() == null) ? 0 : getLdapServerMetadata().hashCode());
        hashCode = prime * hashCode + ((getLogs() == null) ? 0 : getLogs().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceWindowStartTime() == null) ? 0 : getMaintenanceWindowStartTime().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getUsers() == null) ? 0 : getUsers().hashCode());
        return hashCode;
    }

    @Override
    public AwsAmazonMqBrokerDetails clone() {
        try {
            return (AwsAmazonMqBrokerDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAmazonMqBrokerDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
