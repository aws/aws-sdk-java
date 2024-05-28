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
package com.amazonaws.services.appfabric.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the destination of ingested data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/DestinationConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains information about an audit log destination configuration.
     * </p>
     */
    private AuditLogDestinationConfiguration auditLog;

    /**
     * <p>
     * Contains information about an audit log destination configuration.
     * </p>
     * 
     * @param auditLog
     *        Contains information about an audit log destination configuration.
     */

    public void setAuditLog(AuditLogDestinationConfiguration auditLog) {
        this.auditLog = auditLog;
    }

    /**
     * <p>
     * Contains information about an audit log destination configuration.
     * </p>
     * 
     * @return Contains information about an audit log destination configuration.
     */

    public AuditLogDestinationConfiguration getAuditLog() {
        return this.auditLog;
    }

    /**
     * <p>
     * Contains information about an audit log destination configuration.
     * </p>
     * 
     * @param auditLog
     *        Contains information about an audit log destination configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConfiguration withAuditLog(AuditLogDestinationConfiguration auditLog) {
        setAuditLog(auditLog);
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
        if (getAuditLog() != null)
            sb.append("AuditLog: ").append(getAuditLog());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationConfiguration == false)
            return false;
        DestinationConfiguration other = (DestinationConfiguration) obj;
        if (other.getAuditLog() == null ^ this.getAuditLog() == null)
            return false;
        if (other.getAuditLog() != null && other.getAuditLog().equals(this.getAuditLog()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuditLog() == null) ? 0 : getAuditLog().hashCode());
        return hashCode;
    }

    @Override
    public DestinationConfiguration clone() {
        try {
            return (DestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appfabric.model.transform.DestinationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
