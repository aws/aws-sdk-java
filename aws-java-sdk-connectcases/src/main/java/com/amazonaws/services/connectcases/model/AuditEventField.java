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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Fields for audit event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/AuditEventField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuditEventField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier of field in an Audit History entry.
     * </p>
     */
    private String eventFieldId;
    /**
     * <p>
     * Union of potential field value types.
     * </p>
     */
    private AuditEventFieldValueUnion newValue;
    /**
     * <p>
     * Union of potential field value types.
     * </p>
     */
    private AuditEventFieldValueUnion oldValue;

    /**
     * <p>
     * Unique identifier of field in an Audit History entry.
     * </p>
     * 
     * @param eventFieldId
     *        Unique identifier of field in an Audit History entry.
     */

    public void setEventFieldId(String eventFieldId) {
        this.eventFieldId = eventFieldId;
    }

    /**
     * <p>
     * Unique identifier of field in an Audit History entry.
     * </p>
     * 
     * @return Unique identifier of field in an Audit History entry.
     */

    public String getEventFieldId() {
        return this.eventFieldId;
    }

    /**
     * <p>
     * Unique identifier of field in an Audit History entry.
     * </p>
     * 
     * @param eventFieldId
     *        Unique identifier of field in an Audit History entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditEventField withEventFieldId(String eventFieldId) {
        setEventFieldId(eventFieldId);
        return this;
    }

    /**
     * <p>
     * Union of potential field value types.
     * </p>
     * 
     * @param newValue
     *        Union of potential field value types.
     */

    public void setNewValue(AuditEventFieldValueUnion newValue) {
        this.newValue = newValue;
    }

    /**
     * <p>
     * Union of potential field value types.
     * </p>
     * 
     * @return Union of potential field value types.
     */

    public AuditEventFieldValueUnion getNewValue() {
        return this.newValue;
    }

    /**
     * <p>
     * Union of potential field value types.
     * </p>
     * 
     * @param newValue
     *        Union of potential field value types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditEventField withNewValue(AuditEventFieldValueUnion newValue) {
        setNewValue(newValue);
        return this;
    }

    /**
     * <p>
     * Union of potential field value types.
     * </p>
     * 
     * @param oldValue
     *        Union of potential field value types.
     */

    public void setOldValue(AuditEventFieldValueUnion oldValue) {
        this.oldValue = oldValue;
    }

    /**
     * <p>
     * Union of potential field value types.
     * </p>
     * 
     * @return Union of potential field value types.
     */

    public AuditEventFieldValueUnion getOldValue() {
        return this.oldValue;
    }

    /**
     * <p>
     * Union of potential field value types.
     * </p>
     * 
     * @param oldValue
     *        Union of potential field value types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditEventField withOldValue(AuditEventFieldValueUnion oldValue) {
        setOldValue(oldValue);
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
        if (getEventFieldId() != null)
            sb.append("EventFieldId: ").append(getEventFieldId()).append(",");
        if (getNewValue() != null)
            sb.append("NewValue: ").append(getNewValue()).append(",");
        if (getOldValue() != null)
            sb.append("OldValue: ").append(getOldValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuditEventField == false)
            return false;
        AuditEventField other = (AuditEventField) obj;
        if (other.getEventFieldId() == null ^ this.getEventFieldId() == null)
            return false;
        if (other.getEventFieldId() != null && other.getEventFieldId().equals(this.getEventFieldId()) == false)
            return false;
        if (other.getNewValue() == null ^ this.getNewValue() == null)
            return false;
        if (other.getNewValue() != null && other.getNewValue().equals(this.getNewValue()) == false)
            return false;
        if (other.getOldValue() == null ^ this.getOldValue() == null)
            return false;
        if (other.getOldValue() != null && other.getOldValue().equals(this.getOldValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventFieldId() == null) ? 0 : getEventFieldId().hashCode());
        hashCode = prime * hashCode + ((getNewValue() == null) ? 0 : getNewValue().hashCode());
        hashCode = prime * hashCode + ((getOldValue() == null) ? 0 : getOldValue().hashCode());
        return hashCode;
    }

    @Override
    public AuditEventField clone() {
        try {
            return (AuditEventField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.AuditEventFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
