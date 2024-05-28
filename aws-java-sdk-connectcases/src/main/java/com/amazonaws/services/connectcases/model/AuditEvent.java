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
 * Represents the content of a particular audit event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/AuditEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuditEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier of a case audit history event.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * A list of Case Audit History event fields.
     * </p>
     */
    private java.util.List<AuditEventField> fields;
    /**
     * <p>
     * Information of the user which performed the audit.
     * </p>
     */
    private AuditEventPerformedBy performedBy;
    /**
     * <p>
     * Time at which an Audit History event took place.
     * </p>
     */
    private java.util.Date performedTime;
    /**
     * <p>
     * The Type of the related item.
     * </p>
     */
    private String relatedItemType;
    /**
     * <p>
     * The Type of an audit history event.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Unique identifier of a case audit history event.
     * </p>
     * 
     * @param eventId
     *        Unique identifier of a case audit history event.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * Unique identifier of a case audit history event.
     * </p>
     * 
     * @return Unique identifier of a case audit history event.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * Unique identifier of a case audit history event.
     * </p>
     * 
     * @param eventId
     *        Unique identifier of a case audit history event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditEvent withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * A list of Case Audit History event fields.
     * </p>
     * 
     * @return A list of Case Audit History event fields.
     */

    public java.util.List<AuditEventField> getFields() {
        return fields;
    }

    /**
     * <p>
     * A list of Case Audit History event fields.
     * </p>
     * 
     * @param fields
     *        A list of Case Audit History event fields.
     */

    public void setFields(java.util.Collection<AuditEventField> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new java.util.ArrayList<AuditEventField>(fields);
    }

    /**
     * <p>
     * A list of Case Audit History event fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFields(java.util.Collection)} or {@link #withFields(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fields
     *        A list of Case Audit History event fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditEvent withFields(AuditEventField... fields) {
        if (this.fields == null) {
            setFields(new java.util.ArrayList<AuditEventField>(fields.length));
        }
        for (AuditEventField ele : fields) {
            this.fields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Case Audit History event fields.
     * </p>
     * 
     * @param fields
     *        A list of Case Audit History event fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditEvent withFields(java.util.Collection<AuditEventField> fields) {
        setFields(fields);
        return this;
    }

    /**
     * <p>
     * Information of the user which performed the audit.
     * </p>
     * 
     * @param performedBy
     *        Information of the user which performed the audit.
     */

    public void setPerformedBy(AuditEventPerformedBy performedBy) {
        this.performedBy = performedBy;
    }

    /**
     * <p>
     * Information of the user which performed the audit.
     * </p>
     * 
     * @return Information of the user which performed the audit.
     */

    public AuditEventPerformedBy getPerformedBy() {
        return this.performedBy;
    }

    /**
     * <p>
     * Information of the user which performed the audit.
     * </p>
     * 
     * @param performedBy
     *        Information of the user which performed the audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditEvent withPerformedBy(AuditEventPerformedBy performedBy) {
        setPerformedBy(performedBy);
        return this;
    }

    /**
     * <p>
     * Time at which an Audit History event took place.
     * </p>
     * 
     * @param performedTime
     *        Time at which an Audit History event took place.
     */

    public void setPerformedTime(java.util.Date performedTime) {
        this.performedTime = performedTime;
    }

    /**
     * <p>
     * Time at which an Audit History event took place.
     * </p>
     * 
     * @return Time at which an Audit History event took place.
     */

    public java.util.Date getPerformedTime() {
        return this.performedTime;
    }

    /**
     * <p>
     * Time at which an Audit History event took place.
     * </p>
     * 
     * @param performedTime
     *        Time at which an Audit History event took place.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditEvent withPerformedTime(java.util.Date performedTime) {
        setPerformedTime(performedTime);
        return this;
    }

    /**
     * <p>
     * The Type of the related item.
     * </p>
     * 
     * @param relatedItemType
     *        The Type of the related item.
     * @see RelatedItemType
     */

    public void setRelatedItemType(String relatedItemType) {
        this.relatedItemType = relatedItemType;
    }

    /**
     * <p>
     * The Type of the related item.
     * </p>
     * 
     * @return The Type of the related item.
     * @see RelatedItemType
     */

    public String getRelatedItemType() {
        return this.relatedItemType;
    }

    /**
     * <p>
     * The Type of the related item.
     * </p>
     * 
     * @param relatedItemType
     *        The Type of the related item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelatedItemType
     */

    public AuditEvent withRelatedItemType(String relatedItemType) {
        setRelatedItemType(relatedItemType);
        return this;
    }

    /**
     * <p>
     * The Type of the related item.
     * </p>
     * 
     * @param relatedItemType
     *        The Type of the related item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelatedItemType
     */

    public AuditEvent withRelatedItemType(RelatedItemType relatedItemType) {
        this.relatedItemType = relatedItemType.toString();
        return this;
    }

    /**
     * <p>
     * The Type of an audit history event.
     * </p>
     * 
     * @param type
     *        The Type of an audit history event.
     * @see AuditEventType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The Type of an audit history event.
     * </p>
     * 
     * @return The Type of an audit history event.
     * @see AuditEventType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The Type of an audit history event.
     * </p>
     * 
     * @param type
     *        The Type of an audit history event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditEventType
     */

    public AuditEvent withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The Type of an audit history event.
     * </p>
     * 
     * @param type
     *        The Type of an audit history event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditEventType
     */

    public AuditEvent withType(AuditEventType type) {
        this.type = type.toString();
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
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId()).append(",");
        if (getFields() != null)
            sb.append("Fields: ").append(getFields()).append(",");
        if (getPerformedBy() != null)
            sb.append("PerformedBy: ").append(getPerformedBy()).append(",");
        if (getPerformedTime() != null)
            sb.append("PerformedTime: ").append(getPerformedTime()).append(",");
        if (getRelatedItemType() != null)
            sb.append("RelatedItemType: ").append(getRelatedItemType()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuditEvent == false)
            return false;
        AuditEvent other = (AuditEvent) obj;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        if (other.getPerformedBy() == null ^ this.getPerformedBy() == null)
            return false;
        if (other.getPerformedBy() != null && other.getPerformedBy().equals(this.getPerformedBy()) == false)
            return false;
        if (other.getPerformedTime() == null ^ this.getPerformedTime() == null)
            return false;
        if (other.getPerformedTime() != null && other.getPerformedTime().equals(this.getPerformedTime()) == false)
            return false;
        if (other.getRelatedItemType() == null ^ this.getRelatedItemType() == null)
            return false;
        if (other.getRelatedItemType() != null && other.getRelatedItemType().equals(this.getRelatedItemType()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        hashCode = prime * hashCode + ((getPerformedBy() == null) ? 0 : getPerformedBy().hashCode());
        hashCode = prime * hashCode + ((getPerformedTime() == null) ? 0 : getPerformedTime().hashCode());
        hashCode = prime * hashCode + ((getRelatedItemType() == null) ? 0 : getRelatedItemType().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AuditEvent clone() {
        try {
            return (AuditEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.AuditEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
