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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the configuration for experiment logging.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/CreateExperimentTemplateLogConfigurationInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExperimentTemplateLogConfigurationInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration for experiment logging to Amazon CloudWatch Logs.
     * </p>
     */
    private ExperimentTemplateCloudWatchLogsLogConfigurationInput cloudWatchLogsConfiguration;
    /**
     * <p>
     * The configuration for experiment logging to Amazon S3.
     * </p>
     */
    private ExperimentTemplateS3LogConfigurationInput s3Configuration;
    /**
     * <p>
     * The schema version.
     * </p>
     */
    private Integer logSchemaVersion;

    /**
     * <p>
     * The configuration for experiment logging to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param cloudWatchLogsConfiguration
     *        The configuration for experiment logging to Amazon CloudWatch Logs.
     */

    public void setCloudWatchLogsConfiguration(ExperimentTemplateCloudWatchLogsLogConfigurationInput cloudWatchLogsConfiguration) {
        this.cloudWatchLogsConfiguration = cloudWatchLogsConfiguration;
    }

    /**
     * <p>
     * The configuration for experiment logging to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return The configuration for experiment logging to Amazon CloudWatch Logs.
     */

    public ExperimentTemplateCloudWatchLogsLogConfigurationInput getCloudWatchLogsConfiguration() {
        return this.cloudWatchLogsConfiguration;
    }

    /**
     * <p>
     * The configuration for experiment logging to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param cloudWatchLogsConfiguration
     *        The configuration for experiment logging to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateLogConfigurationInput withCloudWatchLogsConfiguration(
            ExperimentTemplateCloudWatchLogsLogConfigurationInput cloudWatchLogsConfiguration) {
        setCloudWatchLogsConfiguration(cloudWatchLogsConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration for experiment logging to Amazon S3.
     * </p>
     * 
     * @param s3Configuration
     *        The configuration for experiment logging to Amazon S3.
     */

    public void setS3Configuration(ExperimentTemplateS3LogConfigurationInput s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    /**
     * <p>
     * The configuration for experiment logging to Amazon S3.
     * </p>
     * 
     * @return The configuration for experiment logging to Amazon S3.
     */

    public ExperimentTemplateS3LogConfigurationInput getS3Configuration() {
        return this.s3Configuration;
    }

    /**
     * <p>
     * The configuration for experiment logging to Amazon S3.
     * </p>
     * 
     * @param s3Configuration
     *        The configuration for experiment logging to Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateLogConfigurationInput withS3Configuration(ExperimentTemplateS3LogConfigurationInput s3Configuration) {
        setS3Configuration(s3Configuration);
        return this;
    }

    /**
     * <p>
     * The schema version.
     * </p>
     * 
     * @param logSchemaVersion
     *        The schema version.
     */

    public void setLogSchemaVersion(Integer logSchemaVersion) {
        this.logSchemaVersion = logSchemaVersion;
    }

    /**
     * <p>
     * The schema version.
     * </p>
     * 
     * @return The schema version.
     */

    public Integer getLogSchemaVersion() {
        return this.logSchemaVersion;
    }

    /**
     * <p>
     * The schema version.
     * </p>
     * 
     * @param logSchemaVersion
     *        The schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateLogConfigurationInput withLogSchemaVersion(Integer logSchemaVersion) {
        setLogSchemaVersion(logSchemaVersion);
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
        if (getCloudWatchLogsConfiguration() != null)
            sb.append("CloudWatchLogsConfiguration: ").append(getCloudWatchLogsConfiguration()).append(",");
        if (getS3Configuration() != null)
            sb.append("S3Configuration: ").append(getS3Configuration()).append(",");
        if (getLogSchemaVersion() != null)
            sb.append("LogSchemaVersion: ").append(getLogSchemaVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateExperimentTemplateLogConfigurationInput == false)
            return false;
        CreateExperimentTemplateLogConfigurationInput other = (CreateExperimentTemplateLogConfigurationInput) obj;
        if (other.getCloudWatchLogsConfiguration() == null ^ this.getCloudWatchLogsConfiguration() == null)
            return false;
        if (other.getCloudWatchLogsConfiguration() != null && other.getCloudWatchLogsConfiguration().equals(this.getCloudWatchLogsConfiguration()) == false)
            return false;
        if (other.getS3Configuration() == null ^ this.getS3Configuration() == null)
            return false;
        if (other.getS3Configuration() != null && other.getS3Configuration().equals(this.getS3Configuration()) == false)
            return false;
        if (other.getLogSchemaVersion() == null ^ this.getLogSchemaVersion() == null)
            return false;
        if (other.getLogSchemaVersion() != null && other.getLogSchemaVersion().equals(this.getLogSchemaVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchLogsConfiguration() == null) ? 0 : getCloudWatchLogsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getS3Configuration() == null) ? 0 : getS3Configuration().hashCode());
        hashCode = prime * hashCode + ((getLogSchemaVersion() == null) ? 0 : getLogSchemaVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateExperimentTemplateLogConfigurationInput clone() {
        try {
            return (CreateExperimentTemplateLogConfigurationInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fis.model.transform.CreateExperimentTemplateLogConfigurationInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
