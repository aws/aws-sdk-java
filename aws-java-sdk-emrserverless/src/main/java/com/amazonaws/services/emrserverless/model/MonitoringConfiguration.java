/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration setting for monitoring.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/MonitoringConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 configuration for monitoring log publishing.
     * </p>
     */
    private S3MonitoringConfiguration s3MonitoringConfiguration;
    /**
     * <p>
     * The managed log persistence configuration for a job run.
     * </p>
     */
    private ManagedPersistenceMonitoringConfiguration managedPersistenceMonitoringConfiguration;

    /**
     * <p>
     * The Amazon S3 configuration for monitoring log publishing.
     * </p>
     * 
     * @param s3MonitoringConfiguration
     *        The Amazon S3 configuration for monitoring log publishing.
     */

    public void setS3MonitoringConfiguration(S3MonitoringConfiguration s3MonitoringConfiguration) {
        this.s3MonitoringConfiguration = s3MonitoringConfiguration;
    }

    /**
     * <p>
     * The Amazon S3 configuration for monitoring log publishing.
     * </p>
     * 
     * @return The Amazon S3 configuration for monitoring log publishing.
     */

    public S3MonitoringConfiguration getS3MonitoringConfiguration() {
        return this.s3MonitoringConfiguration;
    }

    /**
     * <p>
     * The Amazon S3 configuration for monitoring log publishing.
     * </p>
     * 
     * @param s3MonitoringConfiguration
     *        The Amazon S3 configuration for monitoring log publishing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringConfiguration withS3MonitoringConfiguration(S3MonitoringConfiguration s3MonitoringConfiguration) {
        setS3MonitoringConfiguration(s3MonitoringConfiguration);
        return this;
    }

    /**
     * <p>
     * The managed log persistence configuration for a job run.
     * </p>
     * 
     * @param managedPersistenceMonitoringConfiguration
     *        The managed log persistence configuration for a job run.
     */

    public void setManagedPersistenceMonitoringConfiguration(ManagedPersistenceMonitoringConfiguration managedPersistenceMonitoringConfiguration) {
        this.managedPersistenceMonitoringConfiguration = managedPersistenceMonitoringConfiguration;
    }

    /**
     * <p>
     * The managed log persistence configuration for a job run.
     * </p>
     * 
     * @return The managed log persistence configuration for a job run.
     */

    public ManagedPersistenceMonitoringConfiguration getManagedPersistenceMonitoringConfiguration() {
        return this.managedPersistenceMonitoringConfiguration;
    }

    /**
     * <p>
     * The managed log persistence configuration for a job run.
     * </p>
     * 
     * @param managedPersistenceMonitoringConfiguration
     *        The managed log persistence configuration for a job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringConfiguration withManagedPersistenceMonitoringConfiguration(
            ManagedPersistenceMonitoringConfiguration managedPersistenceMonitoringConfiguration) {
        setManagedPersistenceMonitoringConfiguration(managedPersistenceMonitoringConfiguration);
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
        if (getS3MonitoringConfiguration() != null)
            sb.append("S3MonitoringConfiguration: ").append(getS3MonitoringConfiguration()).append(",");
        if (getManagedPersistenceMonitoringConfiguration() != null)
            sb.append("ManagedPersistenceMonitoringConfiguration: ").append(getManagedPersistenceMonitoringConfiguration());
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
        if (other.getS3MonitoringConfiguration() == null ^ this.getS3MonitoringConfiguration() == null)
            return false;
        if (other.getS3MonitoringConfiguration() != null && other.getS3MonitoringConfiguration().equals(this.getS3MonitoringConfiguration()) == false)
            return false;
        if (other.getManagedPersistenceMonitoringConfiguration() == null ^ this.getManagedPersistenceMonitoringConfiguration() == null)
            return false;
        if (other.getManagedPersistenceMonitoringConfiguration() != null
                && other.getManagedPersistenceMonitoringConfiguration().equals(this.getManagedPersistenceMonitoringConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3MonitoringConfiguration() == null) ? 0 : getS3MonitoringConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getManagedPersistenceMonitoringConfiguration() == null) ? 0 : getManagedPersistenceMonitoringConfiguration().hashCode());
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
        com.amazonaws.services.emrserverless.model.transform.MonitoringConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
