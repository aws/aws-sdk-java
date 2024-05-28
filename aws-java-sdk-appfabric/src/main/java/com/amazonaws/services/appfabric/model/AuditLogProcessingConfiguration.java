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
 * Contains information about an audit log processing configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/AuditLogProcessingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuditLogProcessingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The event schema in which the audit logs need to be formatted.
     * </p>
     */
    private String schema;
    /**
     * <p>
     * The format in which the audit logs need to be formatted.
     * </p>
     */
    private String format;

    /**
     * <p>
     * The event schema in which the audit logs need to be formatted.
     * </p>
     * 
     * @param schema
     *        The event schema in which the audit logs need to be formatted.
     * @see Schema
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The event schema in which the audit logs need to be formatted.
     * </p>
     * 
     * @return The event schema in which the audit logs need to be formatted.
     * @see Schema
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * The event schema in which the audit logs need to be formatted.
     * </p>
     * 
     * @param schema
     *        The event schema in which the audit logs need to be formatted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Schema
     */

    public AuditLogProcessingConfiguration withSchema(String schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * The event schema in which the audit logs need to be formatted.
     * </p>
     * 
     * @param schema
     *        The event schema in which the audit logs need to be formatted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Schema
     */

    public AuditLogProcessingConfiguration withSchema(Schema schema) {
        this.schema = schema.toString();
        return this;
    }

    /**
     * <p>
     * The format in which the audit logs need to be formatted.
     * </p>
     * 
     * @param format
     *        The format in which the audit logs need to be formatted.
     * @see Format
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format in which the audit logs need to be formatted.
     * </p>
     * 
     * @return The format in which the audit logs need to be formatted.
     * @see Format
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format in which the audit logs need to be formatted.
     * </p>
     * 
     * @param format
     *        The format in which the audit logs need to be formatted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public AuditLogProcessingConfiguration withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format in which the audit logs need to be formatted.
     * </p>
     * 
     * @param format
     *        The format in which the audit logs need to be formatted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public AuditLogProcessingConfiguration withFormat(Format format) {
        this.format = format.toString();
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
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuditLogProcessingConfiguration == false)
            return false;
        AuditLogProcessingConfiguration other = (AuditLogProcessingConfiguration) obj;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public AuditLogProcessingConfiguration clone() {
        try {
            return (AuditLogProcessingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appfabric.model.transform.AuditLogProcessingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
