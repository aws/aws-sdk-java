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
 * An object that contains information on which data sources will be configured to be automatically enabled for new
 * members within the organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/OrganizationDataSourceConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationDataSourceConfigurations implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes whether S3 data event logs are enabled for new members of the organization.
     * </p>
     */
    private OrganizationS3LogsConfiguration s3Logs;
    /**
     * <p>
     * Describes the configuration of Kubernetes data sources for new members of the organization.
     * </p>
     */
    private OrganizationKubernetesConfiguration kubernetes;
    /**
     * <p>
     * Describes the configuration of Malware Protection for new members of the organization.
     * </p>
     */
    private OrganizationMalwareProtectionConfiguration malwareProtection;

    /**
     * <p>
     * Describes whether S3 data event logs are enabled for new members of the organization.
     * </p>
     * 
     * @param s3Logs
     *        Describes whether S3 data event logs are enabled for new members of the organization.
     */

    public void setS3Logs(OrganizationS3LogsConfiguration s3Logs) {
        this.s3Logs = s3Logs;
    }

    /**
     * <p>
     * Describes whether S3 data event logs are enabled for new members of the organization.
     * </p>
     * 
     * @return Describes whether S3 data event logs are enabled for new members of the organization.
     */

    public OrganizationS3LogsConfiguration getS3Logs() {
        return this.s3Logs;
    }

    /**
     * <p>
     * Describes whether S3 data event logs are enabled for new members of the organization.
     * </p>
     * 
     * @param s3Logs
     *        Describes whether S3 data event logs are enabled for new members of the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationDataSourceConfigurations withS3Logs(OrganizationS3LogsConfiguration s3Logs) {
        setS3Logs(s3Logs);
        return this;
    }

    /**
     * <p>
     * Describes the configuration of Kubernetes data sources for new members of the organization.
     * </p>
     * 
     * @param kubernetes
     *        Describes the configuration of Kubernetes data sources for new members of the organization.
     */

    public void setKubernetes(OrganizationKubernetesConfiguration kubernetes) {
        this.kubernetes = kubernetes;
    }

    /**
     * <p>
     * Describes the configuration of Kubernetes data sources for new members of the organization.
     * </p>
     * 
     * @return Describes the configuration of Kubernetes data sources for new members of the organization.
     */

    public OrganizationKubernetesConfiguration getKubernetes() {
        return this.kubernetes;
    }

    /**
     * <p>
     * Describes the configuration of Kubernetes data sources for new members of the organization.
     * </p>
     * 
     * @param kubernetes
     *        Describes the configuration of Kubernetes data sources for new members of the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationDataSourceConfigurations withKubernetes(OrganizationKubernetesConfiguration kubernetes) {
        setKubernetes(kubernetes);
        return this;
    }

    /**
     * <p>
     * Describes the configuration of Malware Protection for new members of the organization.
     * </p>
     * 
     * @param malwareProtection
     *        Describes the configuration of Malware Protection for new members of the organization.
     */

    public void setMalwareProtection(OrganizationMalwareProtectionConfiguration malwareProtection) {
        this.malwareProtection = malwareProtection;
    }

    /**
     * <p>
     * Describes the configuration of Malware Protection for new members of the organization.
     * </p>
     * 
     * @return Describes the configuration of Malware Protection for new members of the organization.
     */

    public OrganizationMalwareProtectionConfiguration getMalwareProtection() {
        return this.malwareProtection;
    }

    /**
     * <p>
     * Describes the configuration of Malware Protection for new members of the organization.
     * </p>
     * 
     * @param malwareProtection
     *        Describes the configuration of Malware Protection for new members of the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationDataSourceConfigurations withMalwareProtection(OrganizationMalwareProtectionConfiguration malwareProtection) {
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

        if (obj instanceof OrganizationDataSourceConfigurations == false)
            return false;
        OrganizationDataSourceConfigurations other = (OrganizationDataSourceConfigurations) obj;
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

        hashCode = prime * hashCode + ((getS3Logs() == null) ? 0 : getS3Logs().hashCode());
        hashCode = prime * hashCode + ((getKubernetes() == null) ? 0 : getKubernetes().hashCode());
        hashCode = prime * hashCode + ((getMalwareProtection() == null) ? 0 : getMalwareProtection().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationDataSourceConfigurations clone() {
        try {
            return (OrganizationDataSourceConfigurations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.OrganizationDataSourceConfigurationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
