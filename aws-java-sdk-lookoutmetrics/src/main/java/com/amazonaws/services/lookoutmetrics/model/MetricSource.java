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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about source data used to generate a metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/MetricSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricSource implements Serializable, Cloneable, StructuredPojo {

    private S3SourceConfig s3SourceConfig;
    /**
     * <p>
     * An object containing information about the AppFlow configuration.
     * </p>
     */
    private AppFlowConfig appFlowConfig;
    /**
     * <p>
     * An object containing information about the Amazon CloudWatch monitoring configuration.
     * </p>
     */
    private CloudWatchConfig cloudWatchConfig;
    /**
     * <p>
     * An object containing information about the Amazon Relational Database Service (RDS) configuration.
     * </p>
     */
    private RDSSourceConfig rDSSourceConfig;
    /**
     * <p>
     * An object containing information about the Amazon Redshift database configuration.
     * </p>
     */
    private RedshiftSourceConfig redshiftSourceConfig;

    /**
     * @param s3SourceConfig
     */

    public void setS3SourceConfig(S3SourceConfig s3SourceConfig) {
        this.s3SourceConfig = s3SourceConfig;
    }

    /**
     * @return
     */

    public S3SourceConfig getS3SourceConfig() {
        return this.s3SourceConfig;
    }

    /**
     * @param s3SourceConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSource withS3SourceConfig(S3SourceConfig s3SourceConfig) {
        setS3SourceConfig(s3SourceConfig);
        return this;
    }

    /**
     * <p>
     * An object containing information about the AppFlow configuration.
     * </p>
     * 
     * @param appFlowConfig
     *        An object containing information about the AppFlow configuration.
     */

    public void setAppFlowConfig(AppFlowConfig appFlowConfig) {
        this.appFlowConfig = appFlowConfig;
    }

    /**
     * <p>
     * An object containing information about the AppFlow configuration.
     * </p>
     * 
     * @return An object containing information about the AppFlow configuration.
     */

    public AppFlowConfig getAppFlowConfig() {
        return this.appFlowConfig;
    }

    /**
     * <p>
     * An object containing information about the AppFlow configuration.
     * </p>
     * 
     * @param appFlowConfig
     *        An object containing information about the AppFlow configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSource withAppFlowConfig(AppFlowConfig appFlowConfig) {
        setAppFlowConfig(appFlowConfig);
        return this;
    }

    /**
     * <p>
     * An object containing information about the Amazon CloudWatch monitoring configuration.
     * </p>
     * 
     * @param cloudWatchConfig
     *        An object containing information about the Amazon CloudWatch monitoring configuration.
     */

    public void setCloudWatchConfig(CloudWatchConfig cloudWatchConfig) {
        this.cloudWatchConfig = cloudWatchConfig;
    }

    /**
     * <p>
     * An object containing information about the Amazon CloudWatch monitoring configuration.
     * </p>
     * 
     * @return An object containing information about the Amazon CloudWatch monitoring configuration.
     */

    public CloudWatchConfig getCloudWatchConfig() {
        return this.cloudWatchConfig;
    }

    /**
     * <p>
     * An object containing information about the Amazon CloudWatch monitoring configuration.
     * </p>
     * 
     * @param cloudWatchConfig
     *        An object containing information about the Amazon CloudWatch monitoring configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSource withCloudWatchConfig(CloudWatchConfig cloudWatchConfig) {
        setCloudWatchConfig(cloudWatchConfig);
        return this;
    }

    /**
     * <p>
     * An object containing information about the Amazon Relational Database Service (RDS) configuration.
     * </p>
     * 
     * @param rDSSourceConfig
     *        An object containing information about the Amazon Relational Database Service (RDS) configuration.
     */

    public void setRDSSourceConfig(RDSSourceConfig rDSSourceConfig) {
        this.rDSSourceConfig = rDSSourceConfig;
    }

    /**
     * <p>
     * An object containing information about the Amazon Relational Database Service (RDS) configuration.
     * </p>
     * 
     * @return An object containing information about the Amazon Relational Database Service (RDS) configuration.
     */

    public RDSSourceConfig getRDSSourceConfig() {
        return this.rDSSourceConfig;
    }

    /**
     * <p>
     * An object containing information about the Amazon Relational Database Service (RDS) configuration.
     * </p>
     * 
     * @param rDSSourceConfig
     *        An object containing information about the Amazon Relational Database Service (RDS) configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSource withRDSSourceConfig(RDSSourceConfig rDSSourceConfig) {
        setRDSSourceConfig(rDSSourceConfig);
        return this;
    }

    /**
     * <p>
     * An object containing information about the Amazon Redshift database configuration.
     * </p>
     * 
     * @param redshiftSourceConfig
     *        An object containing information about the Amazon Redshift database configuration.
     */

    public void setRedshiftSourceConfig(RedshiftSourceConfig redshiftSourceConfig) {
        this.redshiftSourceConfig = redshiftSourceConfig;
    }

    /**
     * <p>
     * An object containing information about the Amazon Redshift database configuration.
     * </p>
     * 
     * @return An object containing information about the Amazon Redshift database configuration.
     */

    public RedshiftSourceConfig getRedshiftSourceConfig() {
        return this.redshiftSourceConfig;
    }

    /**
     * <p>
     * An object containing information about the Amazon Redshift database configuration.
     * </p>
     * 
     * @param redshiftSourceConfig
     *        An object containing information about the Amazon Redshift database configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSource withRedshiftSourceConfig(RedshiftSourceConfig redshiftSourceConfig) {
        setRedshiftSourceConfig(redshiftSourceConfig);
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
        if (getS3SourceConfig() != null)
            sb.append("S3SourceConfig: ").append(getS3SourceConfig()).append(",");
        if (getAppFlowConfig() != null)
            sb.append("AppFlowConfig: ").append(getAppFlowConfig()).append(",");
        if (getCloudWatchConfig() != null)
            sb.append("CloudWatchConfig: ").append(getCloudWatchConfig()).append(",");
        if (getRDSSourceConfig() != null)
            sb.append("RDSSourceConfig: ").append(getRDSSourceConfig()).append(",");
        if (getRedshiftSourceConfig() != null)
            sb.append("RedshiftSourceConfig: ").append(getRedshiftSourceConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricSource == false)
            return false;
        MetricSource other = (MetricSource) obj;
        if (other.getS3SourceConfig() == null ^ this.getS3SourceConfig() == null)
            return false;
        if (other.getS3SourceConfig() != null && other.getS3SourceConfig().equals(this.getS3SourceConfig()) == false)
            return false;
        if (other.getAppFlowConfig() == null ^ this.getAppFlowConfig() == null)
            return false;
        if (other.getAppFlowConfig() != null && other.getAppFlowConfig().equals(this.getAppFlowConfig()) == false)
            return false;
        if (other.getCloudWatchConfig() == null ^ this.getCloudWatchConfig() == null)
            return false;
        if (other.getCloudWatchConfig() != null && other.getCloudWatchConfig().equals(this.getCloudWatchConfig()) == false)
            return false;
        if (other.getRDSSourceConfig() == null ^ this.getRDSSourceConfig() == null)
            return false;
        if (other.getRDSSourceConfig() != null && other.getRDSSourceConfig().equals(this.getRDSSourceConfig()) == false)
            return false;
        if (other.getRedshiftSourceConfig() == null ^ this.getRedshiftSourceConfig() == null)
            return false;
        if (other.getRedshiftSourceConfig() != null && other.getRedshiftSourceConfig().equals(this.getRedshiftSourceConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3SourceConfig() == null) ? 0 : getS3SourceConfig().hashCode());
        hashCode = prime * hashCode + ((getAppFlowConfig() == null) ? 0 : getAppFlowConfig().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchConfig() == null) ? 0 : getCloudWatchConfig().hashCode());
        hashCode = prime * hashCode + ((getRDSSourceConfig() == null) ? 0 : getRDSSourceConfig().hashCode());
        hashCode = prime * hashCode + ((getRedshiftSourceConfig() == null) ? 0 : getRedshiftSourceConfig().hashCode());
        return hashCode;
    }

    @Override
    public MetricSource clone() {
        try {
            return (MetricSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.MetricSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
