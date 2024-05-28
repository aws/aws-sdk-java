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
 * Describes which data sources are activated for the detector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsGuardDutyDetectorDataSourcesDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsGuardDutyDetectorDataSourcesDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains information on the status of CloudTrail as a data source for the detector.
     * </p>
     */
    private AwsGuardDutyDetectorDataSourcesCloudTrailDetails cloudTrail;
    /**
     * <p>
     * An object that contains information on the status of DNS logs as a data source for the detector.
     * </p>
     */
    private AwsGuardDutyDetectorDataSourcesDnsLogsDetails dnsLogs;
    /**
     * <p>
     * An object that contains information on the status of VPC Flow Logs as a data source for the detector.
     * </p>
     */
    private AwsGuardDutyDetectorDataSourcesFlowLogsDetails flowLogs;
    /**
     * <p>
     * An object that contains information on the status of Kubernetes data sources for the detector.
     * </p>
     */
    private AwsGuardDutyDetectorDataSourcesKubernetesDetails kubernetes;
    /**
     * <p>
     * An object that contains information on the status of Malware Protection as a data source for the detector.
     * </p>
     */
    private AwsGuardDutyDetectorDataSourcesMalwareProtectionDetails malwareProtection;
    /**
     * <p>
     * An object that contains information on the status of S3 Data event logs as a data source for the detector.
     * </p>
     */
    private AwsGuardDutyDetectorDataSourcesS3LogsDetails s3Logs;

    /**
     * <p>
     * An object that contains information on the status of CloudTrail as a data source for the detector.
     * </p>
     * 
     * @param cloudTrail
     *        An object that contains information on the status of CloudTrail as a data source for the detector.
     */

    public void setCloudTrail(AwsGuardDutyDetectorDataSourcesCloudTrailDetails cloudTrail) {
        this.cloudTrail = cloudTrail;
    }

    /**
     * <p>
     * An object that contains information on the status of CloudTrail as a data source for the detector.
     * </p>
     * 
     * @return An object that contains information on the status of CloudTrail as a data source for the detector.
     */

    public AwsGuardDutyDetectorDataSourcesCloudTrailDetails getCloudTrail() {
        return this.cloudTrail;
    }

    /**
     * <p>
     * An object that contains information on the status of CloudTrail as a data source for the detector.
     * </p>
     * 
     * @param cloudTrail
     *        An object that contains information on the status of CloudTrail as a data source for the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsGuardDutyDetectorDataSourcesDetails withCloudTrail(AwsGuardDutyDetectorDataSourcesCloudTrailDetails cloudTrail) {
        setCloudTrail(cloudTrail);
        return this;
    }

    /**
     * <p>
     * An object that contains information on the status of DNS logs as a data source for the detector.
     * </p>
     * 
     * @param dnsLogs
     *        An object that contains information on the status of DNS logs as a data source for the detector.
     */

    public void setDnsLogs(AwsGuardDutyDetectorDataSourcesDnsLogsDetails dnsLogs) {
        this.dnsLogs = dnsLogs;
    }

    /**
     * <p>
     * An object that contains information on the status of DNS logs as a data source for the detector.
     * </p>
     * 
     * @return An object that contains information on the status of DNS logs as a data source for the detector.
     */

    public AwsGuardDutyDetectorDataSourcesDnsLogsDetails getDnsLogs() {
        return this.dnsLogs;
    }

    /**
     * <p>
     * An object that contains information on the status of DNS logs as a data source for the detector.
     * </p>
     * 
     * @param dnsLogs
     *        An object that contains information on the status of DNS logs as a data source for the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsGuardDutyDetectorDataSourcesDetails withDnsLogs(AwsGuardDutyDetectorDataSourcesDnsLogsDetails dnsLogs) {
        setDnsLogs(dnsLogs);
        return this;
    }

    /**
     * <p>
     * An object that contains information on the status of VPC Flow Logs as a data source for the detector.
     * </p>
     * 
     * @param flowLogs
     *        An object that contains information on the status of VPC Flow Logs as a data source for the detector.
     */

    public void setFlowLogs(AwsGuardDutyDetectorDataSourcesFlowLogsDetails flowLogs) {
        this.flowLogs = flowLogs;
    }

    /**
     * <p>
     * An object that contains information on the status of VPC Flow Logs as a data source for the detector.
     * </p>
     * 
     * @return An object that contains information on the status of VPC Flow Logs as a data source for the detector.
     */

    public AwsGuardDutyDetectorDataSourcesFlowLogsDetails getFlowLogs() {
        return this.flowLogs;
    }

    /**
     * <p>
     * An object that contains information on the status of VPC Flow Logs as a data source for the detector.
     * </p>
     * 
     * @param flowLogs
     *        An object that contains information on the status of VPC Flow Logs as a data source for the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsGuardDutyDetectorDataSourcesDetails withFlowLogs(AwsGuardDutyDetectorDataSourcesFlowLogsDetails flowLogs) {
        setFlowLogs(flowLogs);
        return this;
    }

    /**
     * <p>
     * An object that contains information on the status of Kubernetes data sources for the detector.
     * </p>
     * 
     * @param kubernetes
     *        An object that contains information on the status of Kubernetes data sources for the detector.
     */

    public void setKubernetes(AwsGuardDutyDetectorDataSourcesKubernetesDetails kubernetes) {
        this.kubernetes = kubernetes;
    }

    /**
     * <p>
     * An object that contains information on the status of Kubernetes data sources for the detector.
     * </p>
     * 
     * @return An object that contains information on the status of Kubernetes data sources for the detector.
     */

    public AwsGuardDutyDetectorDataSourcesKubernetesDetails getKubernetes() {
        return this.kubernetes;
    }

    /**
     * <p>
     * An object that contains information on the status of Kubernetes data sources for the detector.
     * </p>
     * 
     * @param kubernetes
     *        An object that contains information on the status of Kubernetes data sources for the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsGuardDutyDetectorDataSourcesDetails withKubernetes(AwsGuardDutyDetectorDataSourcesKubernetesDetails kubernetes) {
        setKubernetes(kubernetes);
        return this;
    }

    /**
     * <p>
     * An object that contains information on the status of Malware Protection as a data source for the detector.
     * </p>
     * 
     * @param malwareProtection
     *        An object that contains information on the status of Malware Protection as a data source for the detector.
     */

    public void setMalwareProtection(AwsGuardDutyDetectorDataSourcesMalwareProtectionDetails malwareProtection) {
        this.malwareProtection = malwareProtection;
    }

    /**
     * <p>
     * An object that contains information on the status of Malware Protection as a data source for the detector.
     * </p>
     * 
     * @return An object that contains information on the status of Malware Protection as a data source for the
     *         detector.
     */

    public AwsGuardDutyDetectorDataSourcesMalwareProtectionDetails getMalwareProtection() {
        return this.malwareProtection;
    }

    /**
     * <p>
     * An object that contains information on the status of Malware Protection as a data source for the detector.
     * </p>
     * 
     * @param malwareProtection
     *        An object that contains information on the status of Malware Protection as a data source for the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsGuardDutyDetectorDataSourcesDetails withMalwareProtection(AwsGuardDutyDetectorDataSourcesMalwareProtectionDetails malwareProtection) {
        setMalwareProtection(malwareProtection);
        return this;
    }

    /**
     * <p>
     * An object that contains information on the status of S3 Data event logs as a data source for the detector.
     * </p>
     * 
     * @param s3Logs
     *        An object that contains information on the status of S3 Data event logs as a data source for the detector.
     */

    public void setS3Logs(AwsGuardDutyDetectorDataSourcesS3LogsDetails s3Logs) {
        this.s3Logs = s3Logs;
    }

    /**
     * <p>
     * An object that contains information on the status of S3 Data event logs as a data source for the detector.
     * </p>
     * 
     * @return An object that contains information on the status of S3 Data event logs as a data source for the
     *         detector.
     */

    public AwsGuardDutyDetectorDataSourcesS3LogsDetails getS3Logs() {
        return this.s3Logs;
    }

    /**
     * <p>
     * An object that contains information on the status of S3 Data event logs as a data source for the detector.
     * </p>
     * 
     * @param s3Logs
     *        An object that contains information on the status of S3 Data event logs as a data source for the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsGuardDutyDetectorDataSourcesDetails withS3Logs(AwsGuardDutyDetectorDataSourcesS3LogsDetails s3Logs) {
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
        if (getDnsLogs() != null)
            sb.append("DnsLogs: ").append(getDnsLogs()).append(",");
        if (getFlowLogs() != null)
            sb.append("FlowLogs: ").append(getFlowLogs()).append(",");
        if (getKubernetes() != null)
            sb.append("Kubernetes: ").append(getKubernetes()).append(",");
        if (getMalwareProtection() != null)
            sb.append("MalwareProtection: ").append(getMalwareProtection()).append(",");
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

        if (obj instanceof AwsGuardDutyDetectorDataSourcesDetails == false)
            return false;
        AwsGuardDutyDetectorDataSourcesDetails other = (AwsGuardDutyDetectorDataSourcesDetails) obj;
        if (other.getCloudTrail() == null ^ this.getCloudTrail() == null)
            return false;
        if (other.getCloudTrail() != null && other.getCloudTrail().equals(this.getCloudTrail()) == false)
            return false;
        if (other.getDnsLogs() == null ^ this.getDnsLogs() == null)
            return false;
        if (other.getDnsLogs() != null && other.getDnsLogs().equals(this.getDnsLogs()) == false)
            return false;
        if (other.getFlowLogs() == null ^ this.getFlowLogs() == null)
            return false;
        if (other.getFlowLogs() != null && other.getFlowLogs().equals(this.getFlowLogs()) == false)
            return false;
        if (other.getKubernetes() == null ^ this.getKubernetes() == null)
            return false;
        if (other.getKubernetes() != null && other.getKubernetes().equals(this.getKubernetes()) == false)
            return false;
        if (other.getMalwareProtection() == null ^ this.getMalwareProtection() == null)
            return false;
        if (other.getMalwareProtection() != null && other.getMalwareProtection().equals(this.getMalwareProtection()) == false)
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
        hashCode = prime * hashCode + ((getDnsLogs() == null) ? 0 : getDnsLogs().hashCode());
        hashCode = prime * hashCode + ((getFlowLogs() == null) ? 0 : getFlowLogs().hashCode());
        hashCode = prime * hashCode + ((getKubernetes() == null) ? 0 : getKubernetes().hashCode());
        hashCode = prime * hashCode + ((getMalwareProtection() == null) ? 0 : getMalwareProtection().hashCode());
        hashCode = prime * hashCode + ((getS3Logs() == null) ? 0 : getS3Logs().hashCode());
        return hashCode;
    }

    @Override
    public AwsGuardDutyDetectorDataSourcesDetails clone() {
        try {
            return (AwsGuardDutyDetectorDataSourcesDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsGuardDutyDetectorDataSourcesDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
