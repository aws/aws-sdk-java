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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about which data sources are enabled for the GuardDuty member account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DataSourcesFreeTrial" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourcesFreeTrial implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes whether any Amazon Web Services CloudTrail management event logs are enabled as data sources.
     * </p>
     */
    private DataSourceFreeTrial cloudTrail;
    /**
     * <p>
     * Describes whether any DNS logs are enabled as data sources.
     * </p>
     */
    private DataSourceFreeTrial dnsLogs;
    /**
     * <p>
     * Describes whether any VPC Flow logs are enabled as data sources.
     * </p>
     */
    private DataSourceFreeTrial flowLogs;
    /**
     * <p>
     * Describes whether any S3 data event logs are enabled as data sources.
     * </p>
     */
    private DataSourceFreeTrial s3Logs;
    /**
     * <p>
     * Describes whether any Kubernetes logs are enabled as data sources.
     * </p>
     */
    private KubernetesDataSourceFreeTrial kubernetes;
    /**
     * <p>
     * Describes whether Malware Protection is enabled as a data source.
     * </p>
     */
    private MalwareProtectionDataSourceFreeTrial malwareProtection;

    /**
     * <p>
     * Describes whether any Amazon Web Services CloudTrail management event logs are enabled as data sources.
     * </p>
     * 
     * @param cloudTrail
     *        Describes whether any Amazon Web Services CloudTrail management event logs are enabled as data sources.
     */

    public void setCloudTrail(DataSourceFreeTrial cloudTrail) {
        this.cloudTrail = cloudTrail;
    }

    /**
     * <p>
     * Describes whether any Amazon Web Services CloudTrail management event logs are enabled as data sources.
     * </p>
     * 
     * @return Describes whether any Amazon Web Services CloudTrail management event logs are enabled as data sources.
     */

    public DataSourceFreeTrial getCloudTrail() {
        return this.cloudTrail;
    }

    /**
     * <p>
     * Describes whether any Amazon Web Services CloudTrail management event logs are enabled as data sources.
     * </p>
     * 
     * @param cloudTrail
     *        Describes whether any Amazon Web Services CloudTrail management event logs are enabled as data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourcesFreeTrial withCloudTrail(DataSourceFreeTrial cloudTrail) {
        setCloudTrail(cloudTrail);
        return this;
    }

    /**
     * <p>
     * Describes whether any DNS logs are enabled as data sources.
     * </p>
     * 
     * @param dnsLogs
     *        Describes whether any DNS logs are enabled as data sources.
     */

    public void setDnsLogs(DataSourceFreeTrial dnsLogs) {
        this.dnsLogs = dnsLogs;
    }

    /**
     * <p>
     * Describes whether any DNS logs are enabled as data sources.
     * </p>
     * 
     * @return Describes whether any DNS logs are enabled as data sources.
     */

    public DataSourceFreeTrial getDnsLogs() {
        return this.dnsLogs;
    }

    /**
     * <p>
     * Describes whether any DNS logs are enabled as data sources.
     * </p>
     * 
     * @param dnsLogs
     *        Describes whether any DNS logs are enabled as data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourcesFreeTrial withDnsLogs(DataSourceFreeTrial dnsLogs) {
        setDnsLogs(dnsLogs);
        return this;
    }

    /**
     * <p>
     * Describes whether any VPC Flow logs are enabled as data sources.
     * </p>
     * 
     * @param flowLogs
     *        Describes whether any VPC Flow logs are enabled as data sources.
     */

    public void setFlowLogs(DataSourceFreeTrial flowLogs) {
        this.flowLogs = flowLogs;
    }

    /**
     * <p>
     * Describes whether any VPC Flow logs are enabled as data sources.
     * </p>
     * 
     * @return Describes whether any VPC Flow logs are enabled as data sources.
     */

    public DataSourceFreeTrial getFlowLogs() {
        return this.flowLogs;
    }

    /**
     * <p>
     * Describes whether any VPC Flow logs are enabled as data sources.
     * </p>
     * 
     * @param flowLogs
     *        Describes whether any VPC Flow logs are enabled as data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourcesFreeTrial withFlowLogs(DataSourceFreeTrial flowLogs) {
        setFlowLogs(flowLogs);
        return this;
    }

    /**
     * <p>
     * Describes whether any S3 data event logs are enabled as data sources.
     * </p>
     * 
     * @param s3Logs
     *        Describes whether any S3 data event logs are enabled as data sources.
     */

    public void setS3Logs(DataSourceFreeTrial s3Logs) {
        this.s3Logs = s3Logs;
    }

    /**
     * <p>
     * Describes whether any S3 data event logs are enabled as data sources.
     * </p>
     * 
     * @return Describes whether any S3 data event logs are enabled as data sources.
     */

    public DataSourceFreeTrial getS3Logs() {
        return this.s3Logs;
    }

    /**
     * <p>
     * Describes whether any S3 data event logs are enabled as data sources.
     * </p>
     * 
     * @param s3Logs
     *        Describes whether any S3 data event logs are enabled as data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourcesFreeTrial withS3Logs(DataSourceFreeTrial s3Logs) {
        setS3Logs(s3Logs);
        return this;
    }

    /**
     * <p>
     * Describes whether any Kubernetes logs are enabled as data sources.
     * </p>
     * 
     * @param kubernetes
     *        Describes whether any Kubernetes logs are enabled as data sources.
     */

    public void setKubernetes(KubernetesDataSourceFreeTrial kubernetes) {
        this.kubernetes = kubernetes;
    }

    /**
     * <p>
     * Describes whether any Kubernetes logs are enabled as data sources.
     * </p>
     * 
     * @return Describes whether any Kubernetes logs are enabled as data sources.
     */

    public KubernetesDataSourceFreeTrial getKubernetes() {
        return this.kubernetes;
    }

    /**
     * <p>
     * Describes whether any Kubernetes logs are enabled as data sources.
     * </p>
     * 
     * @param kubernetes
     *        Describes whether any Kubernetes logs are enabled as data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourcesFreeTrial withKubernetes(KubernetesDataSourceFreeTrial kubernetes) {
        setKubernetes(kubernetes);
        return this;
    }

    /**
     * <p>
     * Describes whether Malware Protection is enabled as a data source.
     * </p>
     * 
     * @param malwareProtection
     *        Describes whether Malware Protection is enabled as a data source.
     */

    public void setMalwareProtection(MalwareProtectionDataSourceFreeTrial malwareProtection) {
        this.malwareProtection = malwareProtection;
    }

    /**
     * <p>
     * Describes whether Malware Protection is enabled as a data source.
     * </p>
     * 
     * @return Describes whether Malware Protection is enabled as a data source.
     */

    public MalwareProtectionDataSourceFreeTrial getMalwareProtection() {
        return this.malwareProtection;
    }

    /**
     * <p>
     * Describes whether Malware Protection is enabled as a data source.
     * </p>
     * 
     * @param malwareProtection
     *        Describes whether Malware Protection is enabled as a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourcesFreeTrial withMalwareProtection(MalwareProtectionDataSourceFreeTrial malwareProtection) {
        setMalwareProtection(malwareProtection);
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
        if (getS3Logs() != null)
            sb.append("S3Logs: ").append(getS3Logs()).append(",");
        if (getKubernetes() != null)
            sb.append("Kubernetes: ").append(getKubernetes()).append(",");
        if (getMalwareProtection() != null)
            sb.append("MalwareProtection: ").append(getMalwareProtection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourcesFreeTrial == false)
            return false;
        DataSourcesFreeTrial other = (DataSourcesFreeTrial) obj;
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
        if (other.getS3Logs() == null ^ this.getS3Logs() == null)
            return false;
        if (other.getS3Logs() != null && other.getS3Logs().equals(this.getS3Logs()) == false)
            return false;
        if (other.getKubernetes() == null ^ this.getKubernetes() == null)
            return false;
        if (other.getKubernetes() != null && other.getKubernetes().equals(this.getKubernetes()) == false)
            return false;
        if (other.getMalwareProtection() == null ^ this.getMalwareProtection() == null)
            return false;
        if (other.getMalwareProtection() != null && other.getMalwareProtection().equals(this.getMalwareProtection()) == false)
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
        hashCode = prime * hashCode + ((getS3Logs() == null) ? 0 : getS3Logs().hashCode());
        hashCode = prime * hashCode + ((getKubernetes() == null) ? 0 : getKubernetes().hashCode());
        hashCode = prime * hashCode + ((getMalwareProtection() == null) ? 0 : getMalwareProtection().hashCode());
        return hashCode;
    }

    @Override
    public DataSourcesFreeTrial clone() {
        try {
            return (DataSourcesFreeTrial) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.DataSourcesFreeTrialMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
