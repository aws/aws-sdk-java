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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The list of information about logs to be enabled for the specified broker.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/Logs" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Logs implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged. Does
     * not apply to RabbitMQ brokers.
     * </p>
     */
    private Boolean audit;
    /**
     * <p>
     * Enables general logging.
     * </p>
     */
    private Boolean general;

    /**
     * <p>
     * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged. Does
     * not apply to RabbitMQ brokers.
     * </p>
     * 
     * @param audit
     *        Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
     *        Does not apply to RabbitMQ brokers.
     */

    public void setAudit(Boolean audit) {
        this.audit = audit;
    }

    /**
     * <p>
     * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged. Does
     * not apply to RabbitMQ brokers.
     * </p>
     * 
     * @return Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
     *         Does not apply to RabbitMQ brokers.
     */

    public Boolean getAudit() {
        return this.audit;
    }

    /**
     * <p>
     * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged. Does
     * not apply to RabbitMQ brokers.
     * </p>
     * 
     * @param audit
     *        Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
     *        Does not apply to RabbitMQ brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Logs withAudit(Boolean audit) {
        setAudit(audit);
        return this;
    }

    /**
     * <p>
     * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged. Does
     * not apply to RabbitMQ brokers.
     * </p>
     * 
     * @return Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
     *         Does not apply to RabbitMQ brokers.
     */

    public Boolean isAudit() {
        return this.audit;
    }

    /**
     * <p>
     * Enables general logging.
     * </p>
     * 
     * @param general
     *        Enables general logging.
     */

    public void setGeneral(Boolean general) {
        this.general = general;
    }

    /**
     * <p>
     * Enables general logging.
     * </p>
     * 
     * @return Enables general logging.
     */

    public Boolean getGeneral() {
        return this.general;
    }

    /**
     * <p>
     * Enables general logging.
     * </p>
     * 
     * @param general
     *        Enables general logging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Logs withGeneral(Boolean general) {
        setGeneral(general);
        return this;
    }

    /**
     * <p>
     * Enables general logging.
     * </p>
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

        if (obj instanceof Logs == false)
            return false;
        Logs other = (Logs) obj;
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
    public Logs clone() {
        try {
            return (Logs) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.LogsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
