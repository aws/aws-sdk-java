/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The list of information about logs to be enabled for the specified broker.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/PendingLogs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PendingLogs implements Serializable, Cloneable, StructuredPojo {

    /** Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged. */
    private Boolean audit;
    /** Enables general logging. */
    private Boolean general;

    /**
     * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
     * 
     * @param audit
     *        Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
     */

    public void setAudit(Boolean audit) {
        this.audit = audit;
    }

    /**
     * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
     * 
     * @return Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
     */

    public Boolean getAudit() {
        return this.audit;
    }

    /**
     * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
     * 
     * @param audit
     *        Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingLogs withAudit(Boolean audit) {
        setAudit(audit);
        return this;
    }

    /**
     * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
     * 
     * @return Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
     */

    public Boolean isAudit() {
        return this.audit;
    }

    /**
     * Enables general logging.
     * 
     * @param general
     *        Enables general logging.
     */

    public void setGeneral(Boolean general) {
        this.general = general;
    }

    /**
     * Enables general logging.
     * 
     * @return Enables general logging.
     */

    public Boolean getGeneral() {
        return this.general;
    }

    /**
     * Enables general logging.
     * 
     * @param general
     *        Enables general logging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingLogs withGeneral(Boolean general) {
        setGeneral(general);
        return this;
    }

    /**
     * Enables general logging.
     * 
     * @return Enables general logging.
     */

    public Boolean isGeneral() {
        return this.general;
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
        if (getAudit() != null)
            sb.append("Audit: ").append(getAudit()).append(",");
        if (getGeneral() != null)
            sb.append("General: ").append(getGeneral());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PendingLogs == false)
            return false;
        PendingLogs other = (PendingLogs) obj;
        if (other.getAudit() == null ^ this.getAudit() == null)
            return false;
        if (other.getAudit() != null && other.getAudit().equals(this.getAudit()) == false)
            return false;
        if (other.getGeneral() == null ^ this.getGeneral() == null)
            return false;
        if (other.getGeneral() != null && other.getGeneral().equals(this.getGeneral()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudit() == null) ? 0 : getAudit().hashCode());
        hashCode = prime * hashCode + ((getGeneral() == null) ? 0 : getGeneral().hashCode());
        return hashCode;
    }

    @Override
    public PendingLogs clone() {
        try {
            return (PendingLogs) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.PendingLogsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
