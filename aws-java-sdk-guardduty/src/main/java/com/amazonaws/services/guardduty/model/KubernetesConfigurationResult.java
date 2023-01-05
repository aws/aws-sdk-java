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
 * Describes whether any Kubernetes logs will be enabled as a data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/KubernetesConfigurationResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KubernetesConfigurationResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes whether Kubernetes audit logs are enabled as a data source.
     * </p>
     */
    private KubernetesAuditLogsConfigurationResult auditLogs;

    /**
     * <p>
     * Describes whether Kubernetes audit logs are enabled as a data source.
     * </p>
     * 
     * @param auditLogs
     *        Describes whether Kubernetes audit logs are enabled as a data source.
     */

    public void setAuditLogs(KubernetesAuditLogsConfigurationResult auditLogs) {
        this.auditLogs = auditLogs;
    }

    /**
     * <p>
     * Describes whether Kubernetes audit logs are enabled as a data source.
     * </p>
     * 
     * @return Describes whether Kubernetes audit logs are enabled as a data source.
     */

    public KubernetesAuditLogsConfigurationResult getAuditLogs() {
        return this.auditLogs;
    }

    /**
     * <p>
     * Describes whether Kubernetes audit logs are enabled as a data source.
     * </p>
     * 
     * @param auditLogs
     *        Describes whether Kubernetes audit logs are enabled as a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KubernetesConfigurationResult withAuditLogs(KubernetesAuditLogsConfigurationResult auditLogs) {
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

        if (obj instanceof KubernetesConfigurationResult == false)
            return false;
        KubernetesConfigurationResult other = (KubernetesConfigurationResult) obj;
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
    public KubernetesConfigurationResult clone() {
        try {
            return (KubernetesConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.KubernetesConfigurationResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
