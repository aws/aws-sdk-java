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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about source data used to generate metrics.
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
     * Details about an AppFlow datasource.
     * </p>
     */
    private AppFlowConfig appFlowConfig;
    /**
     * <p>
     * Details about an Amazon CloudWatch monitoring datasource.
     * </p>
     */
    private CloudWatchConfig cloudWatchConfig;
    /**
     * <p>
     * Details about an Amazon Relational Database Service (RDS) datasource.
     * </p>
     */
    private RDSSourceConfig rDSSourceConfig;
    /**
     * <p>
     * Details about an Amazon Redshift database datasource.
     * </p>
     */
    private RedshiftSourceConfig redshiftSourceConfig;
    /**
     * <p>
     * Details about an Amazon Athena datasource.
     * </p>
     */
    private AthenaSourceConfig athenaSourceConfig;

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
     * Details about an AppFlow datasource.
     * </p>
     * 
     * @param appFlowConfig
     *        Details about an AppFlow datasource.
     */

    public void setAppFlowConfig(AppFlowConfig appFlowConfig) {
        this.appFlowConfig = appFlowConfig;
    }

    /**
     * <p>
     * Details about an AppFlow datasource.
     * </p>
     * 
     * @return Details about an AppFlow datasource.
     */

    public AppFlowConfig getAppFlowConfig() {
        return this.appFlowConfig;
    }

    /**
     * <p>
     * Details about an AppFlow datasource.
     * </p>
     * 
     * @param appFlowConfig
     *        Details about an AppFlow datasource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSource withAppFlowConfig(AppFlowConfig appFlowConfig) {
        setAppFlowConfig(appFlowConfig);
        return this;
    }

    /**
     * <p>
     * Details about an Amazon CloudWatch monitoring datasource.
     * </p>
     * 
     * @param cloudWatchConfig
     *        Details about an Amazon CloudWatch monitoring datasource.
     */

    public void setCloudWatchConfig(CloudWatchConfig cloudWatchConfig) {
        this.cloudWatchConfig = cloudWatchConfig;
    }

    /**
     * <p>
     * Details about an Amazon CloudWatch monitoring datasource.
     * </p>
     * 
     * @return Details about an Amazon CloudWatch monitoring datasource.
     */

    public CloudWatchConfig getCloudWatchConfig() {
        return this.cloudWatchConfig;
    }

    /**
     * <p>
     * Details about an Amazon CloudWatch monitoring datasource.
     * </p>
     * 
     * @param cloudWatchConfig
     *        Details about an Amazon CloudWatch monitoring datasource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSource withCloudWatchConfig(CloudWatchConfig cloudWatchConfig) {
        setCloudWatchConfig(cloudWatchConfig);
        return this;
    }

    /**
     * <p>
     * Details about an Amazon Relational Database Service (RDS) datasource.
     * </p>
     * 
     * @param rDSSourceConfig
     *        Details about an Amazon Relational Database Service (RDS) datasource.
     */

    public void setRDSSourceConfig(RDSSourceConfig rDSSourceConfig) {
        this.rDSSourceConfig = rDSSourceConfig;
    }

    /**
     * <p>
     * Details about an Amazon Relational Database Service (RDS) datasource.
     * </p>
     * 
     * @return Details about an Amazon Relational Database Service (RDS) datasource.
     */

    public RDSSourceConfig getRDSSourceConfig() {
        return this.rDSSourceConfig;
    }

    /**
     * <p>
     * Details about an Amazon Relational Database Service (RDS) datasource.
     * </p>
     * 
     * @param rDSSourceConfig
     *        Details about an Amazon Relational Database Service (RDS) datasource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSource withRDSSourceConfig(RDSSourceConfig rDSSourceConfig) {
        setRDSSourceConfig(rDSSourceConfig);
        return this;
    }

    /**
     * <p>
     * Details about an Amazon Redshift database datasource.
     * </p>
     * 
     * @param redshiftSourceConfig
     *        Details about an Amazon Redshift database datasource.
     */

    public void setRedshiftSourceConfig(RedshiftSourceConfig redshiftSourceConfig) {
        this.redshiftSourceConfig = redshiftSourceConfig;
    }

    /**
     * <p>
     * Details about an Amazon Redshift database datasource.
     * </p>
     * 
     * @return Details about an Amazon Redshift database datasource.
     */

    public RedshiftSourceConfig getRedshiftSourceConfig() {
        return this.redshiftSourceConfig;
    }

    /**
     * <p>
     * Details about an Amazon Redshift database datasource.
     * </p>
     * 
     * @param redshiftSourceConfig
     *        Details about an Amazon Redshift database datasource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSource withRedshiftSourceConfig(RedshiftSourceConfig redshiftSourceConfig) {
        setRedshiftSourceConfig(redshiftSourceConfig);
        return this;
    }

    /**
     * <p>
     * Details about an Amazon Athena datasource.
     * </p>
     * 
     * @param athenaSourceConfig
     *        Details about an Amazon Athena datasource.
     */

    public void setAthenaSourceConfig(AthenaSourceConfig athenaSourceConfig) {
        this.athenaSourceConfig = athenaSourceConfig;
    }

    /**
     * <p>
     * Details about an Amazon Athena datasource.
     * </p>
     * 
     * @return Details about an Amazon Athena datasource.
     */

    public AthenaSourceConfig getAthenaSourceConfig() {
        return this.athenaSourceConfig;
    }

    /**
     * <p>
     * Details about an Amazon Athena datasource.
     * </p>
     * 
     * @param athenaSourceConfig
     *        Details about an Amazon Athena datasource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSource withAthenaSourceConfig(AthenaSourceConfig athenaSourceConfig) {
        setAthenaSourceConfig(athenaSourceConfig);
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
            sb.append("RedshiftSourceConfig: ").append(getRedshiftSourceConfig()).append(",");
        if (getAthenaSourceConfig() != null)
            sb.append("AthenaSourceConfig: ").append(getAthenaSourceConfig());
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
        if (other.getAthenaSourceConfig() == null ^ this.getAthenaSourceConfig() == null)
            return false;
        if (other.getAthenaSourceConfig() != null && other.getAthenaSourceConfig().equals(this.getAthenaSourceConfig()) == false)
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
        hashCode = prime * hashCode + ((getAthenaSourceConfig() == null) ? 0 : getAthenaSourceConfig().hashCode());
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
