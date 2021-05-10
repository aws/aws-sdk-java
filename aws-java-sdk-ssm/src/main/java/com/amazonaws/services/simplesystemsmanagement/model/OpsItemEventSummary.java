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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about an OpsItem event or that associated an OpsItem with a related item.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/OpsItemEventSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpsItemEventSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the OpsItem.
     * </p>
     */
    private String opsItemId;
    /**
     * <p>
     * The ID of the OpsItem event.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * The source of the OpsItem event.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The type of information provided as a detail.
     * </p>
     */
    private String detailType;
    /**
     * <p>
     * Specific information about the OpsItem event.
     * </p>
     */
    private String detail;
    /**
     * <p>
     * Information about the user or resource that created the OpsItem event.
     * </p>
     */
    private OpsItemIdentity createdBy;
    /**
     * <p>
     * The date and time the OpsItem event was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The ID of the OpsItem.
     * </p>
     * 
     * @param opsItemId
     *        The ID of the OpsItem.
     */

    public void setOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
    }

    /**
     * <p>
     * The ID of the OpsItem.
     * </p>
     * 
     * @return The ID of the OpsItem.
     */

    public String getOpsItemId() {
        return this.opsItemId;
    }

    /**
     * <p>
     * The ID of the OpsItem.
     * </p>
     * 
     * @param opsItemId
     *        The ID of the OpsItem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemEventSummary withOpsItemId(String opsItemId) {
        setOpsItemId(opsItemId);
        return this;
    }

    /**
     * <p>
     * The ID of the OpsItem event.
     * </p>
     * 
     * @param eventId
     *        The ID of the OpsItem event.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The ID of the OpsItem event.
     * </p>
     * 
     * @return The ID of the OpsItem event.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The ID of the OpsItem event.
     * </p>
     * 
     * @param eventId
     *        The ID of the OpsItem event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemEventSummary withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * The source of the OpsItem event.
     * </p>
     * 
     * @param source
     *        The source of the OpsItem event.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the OpsItem event.
     * </p>
     * 
     * @return The source of the OpsItem event.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the OpsItem event.
     * </p>
     * 
     * @param source
     *        The source of the OpsItem event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemEventSummary withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The type of information provided as a detail.
     * </p>
     * 
     * @param detailType
     *        The type of information provided as a detail.
     */

    public void setDetailType(String detailType) {
        this.detailType = detailType;
    }

    /**
     * <p>
     * The type of information provided as a detail.
     * </p>
     * 
     * @return The type of information provided as a detail.
     */

    public String getDetailType() {
        return this.detailType;
    }

    /**
     * <p>
     * The type of information provided as a detail.
     * </p>
     * 
     * @param detailType
     *        The type of information provided as a detail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemEventSummary withDetailType(String detailType) {
        setDetailType(detailType);
        return this;
    }

    /**
     * <p>
     * Specific information about the OpsItem event.
     * </p>
     * 
     * @param detail
     *        Specific information about the OpsItem event.
     */

    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * <p>
     * Specific information about the OpsItem event.
     * </p>
     * 
     * @return Specific information about the OpsItem event.
     */

    public String getDetail() {
        return this.detail;
    }

    /**
     * <p>
     * Specific information about the OpsItem event.
     * </p>
     * 
     * @param detail
     *        Specific information about the OpsItem event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemEventSummary withDetail(String detail) {
        setDetail(detail);
        return this;
    }

    /**
     * <p>
     * Information about the user or resource that created the OpsItem event.
     * </p>
     * 
     * @param createdBy
     *        Information about the user or resource that created the OpsItem event.
     */

    public void setCreatedBy(OpsItemIdentity createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * Information about the user or resource that created the OpsItem event.
     * </p>
     * 
     * @return Information about the user or resource that created the OpsItem event.
     */

    public OpsItemIdentity getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * Information about the user or resource that created the OpsItem event.
     * </p>
     * 
     * @param createdBy
     *        Information about the user or resource that created the OpsItem event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemEventSummary withCreatedBy(OpsItemIdentity createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The date and time the OpsItem event was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time the OpsItem event was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time the OpsItem event was created.
     * </p>
     * 
     * @return The date and time the OpsItem event was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time the OpsItem event was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time the OpsItem event was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemEventSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
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
        if (getOpsItemId() != null)
            sb.append("OpsItemId: ").append(getOpsItemId()).append(",");
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDetailType() != null)
            sb.append("DetailType: ").append(getDetailType()).append(",");
        if (getDetail() != null)
            sb.append("Detail: ").append(getDetail()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpsItemEventSummary == false)
            return false;
        OpsItemEventSummary other = (OpsItemEventSummary) obj;
        if (other.getOpsItemId() == null ^ this.getOpsItemId() == null)
            return false;
        if (other.getOpsItemId() != null && other.getOpsItemId().equals(this.getOpsItemId()) == false)
            return false;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDetailType() == null ^ this.getDetailType() == null)
            return false;
        if (other.getDetailType() != null && other.getDetailType().equals(this.getDetailType()) == false)
            return false;
        if (other.getDetail() == null ^ this.getDetail() == null)
            return false;
        if (other.getDetail() != null && other.getDetail().equals(this.getDetail()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOpsItemId() == null) ? 0 : getOpsItemId().hashCode());
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDetailType() == null) ? 0 : getDetailType().hashCode());
        hashCode = prime * hashCode + ((getDetail() == null) ? 0 : getDetail().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public OpsItemEventSummary clone() {
        try {
            return (OpsItemEventSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.OpsItemEventSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
