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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/UpdateBroker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBrokerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Optional. The authentication strategy used to secure the broker. The default is SIMPLE.
     * </p>
     */
    private String authenticationStrategy;
    /**
     * <p>
     * The new boolean value that specifies whether broker engines automatically upgrade to new minor versions as new
     * versions are released and supported by Amazon MQ.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * Required. The unique ID that Amazon MQ generates for the broker.
     * </p>
     */
    private String brokerId;
    /**
     * <p>
     * The ID of the updated configuration.
     * </p>
     */
    private ConfigurationId configuration;
    /**
     * <p>
     * The broker engine version to upgrade to. For a list of supported engine versions, see <a
     * href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported engines</a>.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The broker's host instance type to upgrade to. For a list of supported instance types, see <a
     * href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker.html#broker-instance-types">Broker
     * instance types</a>.
     * </p>
     */
    private String hostInstanceType;
    /**
     * <p>
     * Optional. The metadata of the LDAP server used to authenticate and authorize connections to the broker. Does not
     * apply to RabbitMQ brokers.
     * </p>
     */
    private LdapServerMetadataOutput ldapServerMetadata;
    /**
     * <p>
     * The list of information about logs to be enabled for the specified broker.
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
     * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
     * </p>
     */
    private java.util.List<String> securityGroups;

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

    public UpdateBrokerResult withAuthenticationStrategy(String authenticationStrategy) {
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

    public UpdateBrokerResult withAuthenticationStrategy(AuthenticationStrategy authenticationStrategy) {
        this.authenticationStrategy = authenticationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The new boolean value that specifies whether broker engines automatically upgrade to new minor versions as new
     * versions are released and supported by Amazon MQ.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        The new boolean value that specifies whether broker engines automatically upgrade to new minor versions as
     *        new versions are released and supported by Amazon MQ.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * The new boolean value that specifies whether broker engines automatically upgrade to new minor versions as new
     * versions are released and supported by Amazon MQ.
     * </p>
     * 
     * @return The new boolean value that specifies whether broker engines automatically upgrade to new minor versions
     *         as new versions are released and supported by Amazon MQ.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * The new boolean value that specifies whether broker engines automatically upgrade to new minor versions as new
     * versions are released and supported by Amazon MQ.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        The new boolean value that specifies whether broker engines automatically upgrade to new minor versions as
     *        new versions are released and supported by Amazon MQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBrokerResult withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * The new boolean value that specifies whether broker engines automatically upgrade to new minor versions as new
     * versions are released and supported by Amazon MQ.
     * </p>
     * 
     * @return The new boolean value that specifies whether broker engines automatically upgrade to new minor versions
     *         as new versions are released and supported by Amazon MQ.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Required. The unique ID that Amazon MQ generates for the broker.
     * </p>
     * 
     * @param brokerId
     *        Required. The unique ID that Amazon MQ generates for the broker.
     */

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    /**
     * <p>
     * Required. The unique ID that Amazon MQ generates for the broker.
     * </p>
     * 
     * @return Required. The unique ID that Amazon MQ generates for the broker.
     */

    public String getBrokerId() {
        return this.brokerId;
    }

    /**
     * <p>
     * Required. The unique ID that Amazon MQ generates for the broker.
     * </p>
     * 
     * @param brokerId
     *        Required. The unique ID that Amazon MQ generates for the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBrokerResult withBrokerId(String brokerId) {
        setBrokerId(brokerId);
        return this;
    }

    /**
     * <p>
     * The ID of the updated configuration.
     * </p>
     * 
     * @param configuration
     *        The ID of the updated configuration.
     */

    public void setConfiguration(ConfigurationId configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The ID of the updated configuration.
     * </p>
     * 
     * @return The ID of the updated configuration.
     */

    public ConfigurationId getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The ID of the updated configuration.
     * </p>
     * 
     * @param configuration
     *        The ID of the updated configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBrokerResult withConfiguration(ConfigurationId configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The broker engine version to upgrade to. For a list of supported engine versions, see <a
     * href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported engines</a>.
     * </p>
     * 
     * @param engineVersion
     *        The broker engine version to upgrade to. For a list of supported engine versions, see <a
     *        href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported
     *        engines</a>.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The broker engine version to upgrade to. For a list of supported engine versions, see <a
     * href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported engines</a>.
     * </p>
     * 
     * @return The broker engine version to upgrade to. For a list of supported engine versions, see <a
     *         href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported
     *         engines</a>.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The broker engine version to upgrade to. For a list of supported engine versions, see <a
     * href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported engines</a>.
     * </p>
     * 
     * @param engineVersion
     *        The broker engine version to upgrade to. For a list of supported engine versions, see <a
     *        href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker-engine.html">Supported
     *        engines</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBrokerResult withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The broker's host instance type to upgrade to. For a list of supported instance types, see <a
     * href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker.html#broker-instance-types">Broker
     * instance types</a>.
     * </p>
     * 
     * @param hostInstanceType
     *        The broker's host instance type to upgrade to. For a list of supported instance types, see <a
     *        href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker.html#broker-instance-types"
     *        >Broker instance types</a>.
     */

    public void setHostInstanceType(String hostInstanceType) {
        this.hostInstanceType = hostInstanceType;
    }

    /**
     * <p>
     * The broker's host instance type to upgrade to. For a list of supported instance types, see <a
     * href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker.html#broker-instance-types">Broker
     * instance types</a>.
     * </p>
     * 
     * @return The broker's host instance type to upgrade to. For a list of supported instance types, see <a
     *         href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker.html#broker-instance-types"
     *         >Broker instance types</a>.
     */

    public String getHostInstanceType() {
        return this.hostInstanceType;
    }

    /**
     * <p>
     * The broker's host instance type to upgrade to. For a list of supported instance types, see <a
     * href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker.html#broker-instance-types">Broker
     * instance types</a>.
     * </p>
     * 
     * @param hostInstanceType
     *        The broker's host instance type to upgrade to. For a list of supported instance types, see <a
     *        href="https://docs.aws.amazon.com//amazon-mq/latest/developer-guide/broker.html#broker-instance-types"
     *        >Broker instance types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBrokerResult withHostInstanceType(String hostInstanceType) {
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

    public void setLdapServerMetadata(LdapServerMetadataOutput ldapServerMetadata) {
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

    public LdapServerMetadataOutput getLdapServerMetadata() {
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

    public UpdateBrokerResult withLdapServerMetadata(LdapServerMetadataOutput ldapServerMetadata) {
        setLdapServerMetadata(ldapServerMetadata);
        return this;
    }

    /**
     * <p>
     * The list of information about logs to be enabled for the specified broker.
     * </p>
     * 
     * @param logs
     *        The list of information about logs to be enabled for the specified broker.
     */

    public void setLogs(Logs logs) {
        this.logs = logs;
    }

    /**
     * <p>
     * The list of information about logs to be enabled for the specified broker.
     * </p>
     * 
     * @return The list of information about logs to be enabled for the specified broker.
     */

    public Logs getLogs() {
        return this.logs;
    }

    /**
     * <p>
     * The list of information about logs to be enabled for the specified broker.
     * </p>
     * 
     * @param logs
     *        The list of information about logs to be enabled for the specified broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBrokerResult withLogs(Logs logs) {
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

    public UpdateBrokerResult withMaintenanceWindowStartTime(WeeklyStartTime maintenanceWindowStartTime) {
        setMaintenanceWindowStartTime(maintenanceWindowStartTime);
        return this;
    }

    /**
     * <p>
     * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
     * </p>
     * 
     * @return The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
     * </p>
     * 
     * @param securityGroups
     *        The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
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
     * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBrokerResult withSecurityGroups(String... securityGroups) {
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
     * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
     * </p>
     * 
     * @param securityGroups
     *        The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBrokerResult withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
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
        if (getBrokerId() != null)
            sb.append("BrokerId: ").append(getBrokerId()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
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
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBrokerResult == false)
            return false;
        UpdateBrokerResult other = (UpdateBrokerResult) obj;
        if (other.getAuthenticationStrategy() == null ^ this.getAuthenticationStrategy() == null)
            return false;
        if (other.getAuthenticationStrategy() != null && other.getAuthenticationStrategy().equals(this.getAuthenticationStrategy()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getBrokerId() == null ^ this.getBrokerId() == null)
            return false;
        if (other.getBrokerId() != null && other.getBrokerId().equals(this.getBrokerId()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
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
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationStrategy() == null) ? 0 : getAuthenticationStrategy().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getBrokerId() == null) ? 0 : getBrokerId().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getHostInstanceType() == null) ? 0 : getHostInstanceType().hashCode());
        hashCode = prime * hashCode + ((getLdapServerMetadata() == null) ? 0 : getLdapServerMetadata().hashCode());
        hashCode = prime * hashCode + ((getLogs() == null) ? 0 : getLogs().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceWindowStartTime() == null) ? 0 : getMaintenanceWindowStartTime().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBrokerResult clone() {
        try {
            return (UpdateBrokerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
