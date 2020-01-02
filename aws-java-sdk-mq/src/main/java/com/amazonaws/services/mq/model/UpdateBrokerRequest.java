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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Updates the broker using the specified properties.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/UpdateBroker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBrokerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The automatic
     * upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or
     * special characters.
     */
    private String brokerId;
    /** A list of information about the configuration. */
    private ConfigurationId configuration;
    /**
     * The version of the broker engine. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     */
    private String engineVersion;
    /**
     * The host instance type of the broker to upgrade to. For a list of supported instance types, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
     */
    private String hostInstanceType;
    /** Enables Amazon CloudWatch logging for brokers. */
    private Logs logs;
    /** The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers. */
    private java.util.List<String> securityGroups;

    /**
     * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The automatic
     * upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     * 
     * @param autoMinorVersionUpgrade
     *        Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The
     *        automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The automatic
     * upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     * 
     * @return Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The
     *         automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The automatic
     * upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     * 
     * @param autoMinorVersionUpgrade
     *        Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The
     *        automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBrokerRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The automatic
     * upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     * 
     * @return Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The
     *         automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or
     * special characters.
     * 
     * @param brokerId
     *        The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain
     *        only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard
     *        characters, or special characters.
     */

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    /**
     * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or
     * special characters.
     * 
     * @return The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain
     *         only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard
     *         characters, or special characters.
     */

    public String getBrokerId() {
        return this.brokerId;
    }

    /**
     * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or
     * special characters.
     * 
     * @param brokerId
     *        The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain
     *        only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard
     *        characters, or special characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBrokerRequest withBrokerId(String brokerId) {
        setBrokerId(brokerId);
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

    public UpdateBrokerRequest withConfiguration(ConfigurationId configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * The version of the broker engine. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     * 
     * @param engineVersion
     *        The version of the broker engine. For a list of supported engine versions, see
     *        https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * The version of the broker engine. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     * 
     * @return The version of the broker engine. For a list of supported engine versions, see
     *         https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * The version of the broker engine. For a list of supported engine versions, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     * 
     * @param engineVersion
     *        The version of the broker engine. For a list of supported engine versions, see
     *        https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBrokerRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * The host instance type of the broker to upgrade to. For a list of supported instance types, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
     * 
     * @param hostInstanceType
     *        The host instance type of the broker to upgrade to. For a list of supported instance types, see
     *        https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
     */

    public void setHostInstanceType(String hostInstanceType) {
        this.hostInstanceType = hostInstanceType;
    }

    /**
     * The host instance type of the broker to upgrade to. For a list of supported instance types, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
     * 
     * @return The host instance type of the broker to upgrade to. For a list of supported instance types, see
     *         https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
     */

    public String getHostInstanceType() {
        return this.hostInstanceType;
    }

    /**
     * The host instance type of the broker to upgrade to. For a list of supported instance types, see
     * https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
     * 
     * @param hostInstanceType
     *        The host instance type of the broker to upgrade to. For a list of supported instance types, see
     *        https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBrokerRequest withHostInstanceType(String hostInstanceType) {
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

    public UpdateBrokerRequest withLogs(Logs logs) {
        setLogs(logs);
        return this;
    }

    /**
     * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
     * 
     * @return The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
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
     * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
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

    public UpdateBrokerRequest withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
     * 
     * @param securityGroups
     *        The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBrokerRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
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
        if (getLogs() != null)
            sb.append("Logs: ").append(getLogs()).append(",");
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

        if (obj instanceof UpdateBrokerRequest == false)
            return false;
        UpdateBrokerRequest other = (UpdateBrokerRequest) obj;
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
        if (other.getLogs() == null ^ this.getLogs() == null)
            return false;
        if (other.getLogs() != null && other.getLogs().equals(this.getLogs()) == false)
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

        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getBrokerId() == null) ? 0 : getBrokerId().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getHostInstanceType() == null) ? 0 : getHostInstanceType().hashCode());
        hashCode = prime * hashCode + ((getLogs() == null) ? 0 : getLogs().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBrokerRequest clone() {
        return (UpdateBrokerRequest) super.clone();
    }

}
