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
 * Organization-wide Kubernetes data sources configurations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/OrganizationKubernetesConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationKubernetesConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether Kubernetes audit logs data source should be auto-enabled for new members joining the organization.
     * </p>
     */
    private OrganizationKubernetesAuditLogsConfiguration auditLogs;

    /**
     * <p>
     * Whether Kubernetes audit logs data source should be auto-enabled for new members joining the organization.
     * </p>
     * 
     * @param auditLogs
     *        Whether Kubernetes audit logs data source should be auto-enabled for new members joining the organization.
     */

    public void setAuditLogs(OrganizationKubernetesAuditLogsConfiguration auditLogs) {
        this.auditLogs = auditLogs;
    }

    /**
     * <p>
     * Whether Kubernetes audit logs data source should be auto-enabled for new members joining the organization.
     * </p>
     * 
     * @return Whether Kubernetes audit logs data source should be auto-enabled for new members joining the
     *         organization.
     */

    public OrganizationKubernetesAuditLogsConfiguration getAuditLogs() {
        return this.auditLogs;
    }

    /**
     * <p>
     * Whether Kubernetes audit logs data source should be auto-enabled for new members joining the organization.
     * </p>
     * 
     * @param auditLogs
     *        Whether Kubernetes audit logs data source should be auto-enabled for new members joining the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationKubernetesConfiguration withAuditLogs(OrganizationKubernetesAuditLogsConfiguration auditLogs) {
        setAuditLogs(auditLogs);
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
        if (getAuditLogs() != null)
            sb.append("AuditLogs: ").append(getAuditLogs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationKubernetesConfiguration == false)
            return false;
        OrganizationKubernetesConfiguration other = (OrganizationKubernetesConfiguration) obj;
        if (other.getAuditLogs() == null ^ this.getAuditLogs() == null)
            return false;
        if (other.getAuditLogs() != null && other.getAuditLogs().equals(this.getAuditLogs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuditLogs() == null) ? 0 : getAuditLogs().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationKubernetesConfiguration clone() {
        try {
            return (OrganizationKubernetesConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.OrganizationKubernetesConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
