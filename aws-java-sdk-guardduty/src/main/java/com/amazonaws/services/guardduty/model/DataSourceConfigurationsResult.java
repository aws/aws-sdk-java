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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information on the status of data sources for the detector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DataSourceConfigurationsResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceConfigurationsResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains information on the status of CloudTrail as a data source.
     * </p>
     */
    private CloudTrailConfigurationResult cloudTrail;
    /**
     * <p>
     * An object that contains information on the status of DNS logs as a data source.
     * </p>
     */
    private DNSLogsConfigurationResult dNSLogs;
    /**
     * <p>
     * An object that contains information on the status of VPC flow logs as a data source.
     * </p>
     */
    private FlowLogsConfigurationResult flowLogs;
    /**
     * <p>
     * An object that contains information on the status of S3 Data event logs as a data source.
     * </p>
     */
    private S3LogsConfigurationResult s3Logs;

    /**
     * <p>
     * An object that contains information on the status of CloudTrail as a data source.
     * </p>
     * 
     * @param cloudTrail
     *        An object that contains information on the status of CloudTrail as a data source.
     */

    public void setCloudTrail(CloudTrailConfigurationResult cloudTrail) {
        this.cloudTrail = cloudTrail;
    }

    /**
     * <p>
     * An object that contains information on the status of CloudTrail as a data source.
     * </p>
     * 
     * @return An object that contains information on the status of CloudTrail as a data source.
     */

    public CloudTrailConfigurationResult getCloudTrail() {
        return this.cloudTrail;
    }

    /**
     * <p>
     * An object that contains information on the status of CloudTrail as a data source.
     * </p>
     * 
     * @param cloudTrail
     *        An object that contains information on the status of CloudTrail as a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfigurationsResult withCloudTrail(CloudTrailConfigurationResult cloudTrail) {
        setCloudTrail(cloudTrail);
        return this;
    }

    /**
     * <p>
     * An object that contains information on the status of DNS logs as a data source.
     * </p>
     * 
     * @param dNSLogs
     *        An object that contains information on the status of DNS logs as a data source.
     */

    public void setDNSLogs(DNSLogsConfigurationResult dNSLogs) {
        this.dNSLogs = dNSLogs;
    }

    /**
     * <p>
     * An object that contains information on the status of DNS logs as a data source.
     * </p>
     * 
     * @return An object that contains information on the status of DNS logs as a data source.
     */

    public DNSLogsConfigurationResult getDNSLogs() {
        return this.dNSLogs;
    }

    /**
     * <p>
     * An object that contains information on the status of DNS logs as a data source.
     * </p>
     * 
     * @param dNSLogs
     *        An object that contains information on the status of DNS logs as a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfigurationsResult withDNSLogs(DNSLogsConfigurationResult dNSLogs) {
        setDNSLogs(dNSLogs);
        return this;
    }

    /**
     * <p>
     * An object that contains information on the status of VPC flow logs as a data source.
     * </p>
     * 
     * @param flowLogs
     *        An object that contains information on the status of VPC flow logs as a data source.
     */

    public void setFlowLogs(FlowLogsConfigurationResult flowLogs) {
        this.flowLogs = flowLogs;
    }

    /**
     * <p>
     * An object that contains information on the status of VPC flow logs as a data source.
     * </p>
     * 
     * @return An object that contains information on the status of VPC flow logs as a data source.
     */

    public FlowLogsConfigurationResult getFlowLogs() {
        return this.flowLogs;
    }

    /**
     * <p>
     * An object that contains information on the status of VPC flow logs as a data source.
     * </p>
     * 
     * @param flowLogs
     *        An object that contains information on the status of VPC flow logs as a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfigurationsResult withFlowLogs(FlowLogsConfigurationResult flowLogs) {
        setFlowLogs(flowLogs);
        return this;
    }

    /**
     * <p>
     * An object that contains information on the status of S3 Data event logs as a data source.
     * </p>
     * 
     * @param s3Logs
     *        An object that contains information on the status of S3 Data event logs as a data source.
     */

    public void setS3Logs(S3LogsConfigurationResult s3Logs) {
        this.s3Logs = s3Logs;
    }

    /**
     * <p>
     * An object that contains information on the status of S3 Data event logs as a data source.
     * </p>
     * 
     * @return An object that contains information on the status of S3 Data event logs as a data source.
     */

    public S3LogsConfigurationResult getS3Logs() {
        return this.s3Logs;
    }

    /**
     * <p>
     * An object that contains information on the status of S3 Data event logs as a data source.
     * </p>
     * 
     * @param s3Logs
     *        An object that contains information on the status of S3 Data event logs as a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfigurationsResult withS3Logs(S3LogsConfigurationResult s3Logs) {
        setS3Logs(s3Logs);
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
        if (getCloudTrail() != null)
            sb.append("CloudTrail: ").append(getCloudTrail()).append(",");
        if (getDNSLogs() != null)
            sb.append("DNSLogs: ").append(getDNSLogs()).append(",");
        if (getFlowLogs() != null)
            sb.append("FlowLogs: ").append(getFlowLogs()).append(",");
        if (getS3Logs() != null)
            sb.append("S3Logs: ").append(getS3Logs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceConfigurationsResult == false)
            return false;
        DataSourceConfigurationsResult other = (DataSourceConfigurationsResult) obj;
        if (other.getCloudTrail() == null ^ this.getCloudTrail() == null)
            return false;
        if (other.getCloudTrail() != null && other.getCloudTrail().equals(this.getCloudTrail()) == false)
            return false;
        if (other.getDNSLogs() == null ^ this.getDNSLogs() == null)
            return false;
        if (other.getDNSLogs() != null && other.getDNSLogs().equals(this.getDNSLogs()) == false)
            return false;
        if (other.getFlowLogs() == null ^ this.getFlowLogs() == null)
            return false;
        if (other.getFlowLogs() != null && other.getFlowLogs().equals(this.getFlowLogs()) == false)
            return false;
        if (other.getS3Logs() == null ^ this.getS3Logs() == null)
            return false;
        if (other.getS3Logs() != null && other.getS3Logs().equals(this.getS3Logs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudTrail() == null) ? 0 : getCloudTrail().hashCode());
        hashCode = prime * hashCode + ((getDNSLogs() == null) ? 0 : getDNSLogs().hashCode());
        hashCode = prime * hashCode + ((getFlowLogs() == null) ? 0 : getFlowLogs().hashCode());
        hashCode = prime * hashCode + ((getS3Logs() == null) ? 0 : getS3Logs().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceConfigurationsResult clone() {
        try {
            return (DataSourceConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.DataSourceConfigurationsResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
