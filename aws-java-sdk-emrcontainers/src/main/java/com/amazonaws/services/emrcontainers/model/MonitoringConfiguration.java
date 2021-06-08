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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration setting for monitoring.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/MonitoringConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Monitoring configurations for the persistent application UI.
     * </p>
     */
    private String persistentAppUI;
    /**
     * <p>
     * Monitoring configurations for CloudWatch.
     * </p>
     */
    private CloudWatchMonitoringConfiguration cloudWatchMonitoringConfiguration;
    /**
     * <p>
     * Amazon S3 configuration for monitoring log publishing.
     * </p>
     */
    private S3MonitoringConfiguration s3MonitoringConfiguration;

    /**
     * <p>
     * Monitoring configurations for the persistent application UI.
     * </p>
     * 
     * @param persistentAppUI
     *        Monitoring configurations for the persistent application UI.
     * @see PersistentAppUI
     */

    public void setPersistentAppUI(String persistentAppUI) {
        this.persistentAppUI = persistentAppUI;
    }

    /**
     * <p>
     * Monitoring configurations for the persistent application UI.
     * </p>
     * 
     * @return Monitoring configurations for the persistent application UI.
     * @see PersistentAppUI
     */

    public String getPersistentAppUI() {
        return this.persistentAppUI;
    }

    /**
     * <p>
     * Monitoring configurations for the persistent application UI.
     * </p>
     * 
     * @param persistentAppUI
     *        Monitoring configurations for the persistent application UI.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PersistentAppUI
     */

    public MonitoringConfiguration withPersistentAppUI(String persistentAppUI) {
        setPersistentAppUI(persistentAppUI);
        return this;
    }

    /**
     * <p>
     * Monitoring configurations for the persistent application UI.
     * </p>
     * 
     * @param persistentAppUI
     *        Monitoring configurations for the persistent application UI.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PersistentAppUI
     */

    public MonitoringConfiguration withPersistentAppUI(PersistentAppUI persistentAppUI) {
        this.persistentAppUI = persistentAppUI.toString();
        return this;
    }

    /**
     * <p>
     * Monitoring configurations for CloudWatch.
     * </p>
     * 
     * @param cloudWatchMonitoringConfiguration
     *        Monitoring configurations for CloudWatch.
     */

    public void setCloudWatchMonitoringConfiguration(CloudWatchMonitoringConfiguration cloudWatchMonitoringConfiguration) {
        this.cloudWatchMonitoringConfiguration = cloudWatchMonitoringConfiguration;
    }

    /**
     * <p>
     * Monitoring configurations for CloudWatch.
     * </p>
     * 
     * @return Monitoring configurations for CloudWatch.
     */

    public CloudWatchMonitoringConfiguration getCloudWatchMonitoringConfiguration() {
        return this.cloudWatchMonitoringConfiguration;
    }

    /**
     * <p>
     * Monitoring configurations for CloudWatch.
     * </p>
     * 
     * @param cloudWatchMonitoringConfiguration
     *        Monitoring configurations for CloudWatch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringConfiguration withCloudWatchMonitoringConfiguration(CloudWatchMonitoringConfiguration cloudWatchMonitoringConfiguration) {
        setCloudWatchMonitoringConfiguration(cloudWatchMonitoringConfiguration);
        return this;
    }

    /**
     * <p>
     * Amazon S3 configuration for monitoring log publishing.
     * </p>
     * 
     * @param s3MonitoringConfiguration
     *        Amazon S3 configuration for monitoring log publishing.
     */

    public void setS3MonitoringConfiguration(S3MonitoringConfiguration s3MonitoringConfiguration) {
        this.s3MonitoringConfiguration = s3MonitoringConfiguration;
    }

    /**
     * <p>
     * Amazon S3 configuration for monitoring log publishing.
     * </p>
     * 
     * @return Amazon S3 configuration for monitoring log publishing.
     */

    public S3MonitoringConfiguration getS3MonitoringConfiguration() {
        return this.s3MonitoringConfiguration;
    }

    /**
     * <p>
     * Amazon S3 configuration for monitoring log publishing.
     * </p>
     * 
     * @param s3MonitoringConfiguration
     *        Amazon S3 configuration for monitoring log publishing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringConfiguration withS3MonitoringConfiguration(S3MonitoringConfiguration s3MonitoringConfiguration) {
        setS3MonitoringConfiguration(s3MonitoringConfiguration);
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
        if (getPersistentAppUI() != null)
            sb.append("PersistentAppUI: ").append(getPersistentAppUI()).append(",");
        if (getCloudWatchMonitoringConfiguration() != null)
            sb.append("CloudWatchMonitoringConfiguration: ").append(getCloudWatchMonitoringConfiguration()).append(",");
        if (getS3MonitoringConfiguration() != null)
            sb.append("S3MonitoringConfiguration: ").append(getS3MonitoringConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringConfiguration == false)
            return false;
        MonitoringConfiguration other = (MonitoringConfiguration) obj;
        if (other.getPersistentAppUI() == null ^ this.getPersistentAppUI() == null)
            return false;
        if (other.getPersistentAppUI() != null && other.getPersistentAppUI().equals(this.getPersistentAppUI()) == false)
            return false;
        if (other.getCloudWatchMonitoringConfiguration() == null ^ this.getCloudWatchMonitoringConfiguration() == null)
            return false;
        if (other.getCloudWatchMonitoringConfiguration() != null
                && other.getCloudWatchMonitoringConfiguration().equals(this.getCloudWatchMonitoringConfiguration()) == false)
            return false;
        if (other.getS3MonitoringConfiguration() == null ^ this.getS3MonitoringConfiguration() == null)
            return false;
        if (other.getS3MonitoringConfiguration() != null && other.getS3MonitoringConfiguration().equals(this.getS3MonitoringConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPersistentAppUI() == null) ? 0 : getPersistentAppUI().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchMonitoringConfiguration() == null) ? 0 : getCloudWatchMonitoringConfiguration().hashCode());
        hashCode = prime * hashCode + ((getS3MonitoringConfiguration() == null) ? 0 : getS3MonitoringConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringConfiguration clone() {
        try {
            return (MonitoringConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.MonitoringConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
