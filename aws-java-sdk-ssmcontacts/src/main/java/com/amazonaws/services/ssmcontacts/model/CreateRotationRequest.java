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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/CreateRotation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRotationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the rotation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts to add to the rotation.
     * </p>
     * <p>
     * The order that you list the contacts in is their shift order in the rotation schedule. To change the order of the
     * contact's shifts, use the <a>UpdateRotation</a> operation.
     * </p>
     */
    private java.util.List<String> contactIds;
    /**
     * <p>
     * The date and time that the rotation goes into effect.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time zone to base the rotation’s activity on in Internet Assigned Numbers Authority (IANA) format. For
     * example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the <a
     * href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.
     * </p>
     * <note>
     * <p>
     * Designators for time zones that don’t support Daylight Savings Time rules, such as Pacific Standard Time (PST)
     * and Pacific Daylight Time (PDT), are not supported.
     * </p>
     * </note>
     */
    private String timeZoneId;
    /**
     * <p>
     * Information about the rule that specifies when a shift's team members rotate.
     * </p>
     */
    private RecurrenceSettings recurrence;
    /**
     * <p>
     * Optional metadata to assign to the rotation. Tags enable you to categorize a resource in different ways, such as
     * by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html">Tagging Incident Manager
     * resources</a> in the <i>Incident Manager User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A token that ensures that the operation is called only once with the specified details.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * The name of the rotation.
     * </p>
     * 
     * @param name
     *        The name of the rotation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rotation.
     * </p>
     * 
     * @return The name of the rotation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rotation.
     * </p>
     * 
     * @param name
     *        The name of the rotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRotationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts to add to the rotation.
     * </p>
     * <p>
     * The order that you list the contacts in is their shift order in the rotation schedule. To change the order of the
     * contact's shifts, use the <a>UpdateRotation</a> operation.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the contacts to add to the rotation.</p>
     *         <p>
     *         The order that you list the contacts in is their shift order in the rotation schedule. To change the
     *         order of the contact's shifts, use the <a>UpdateRotation</a> operation.
     */

    public java.util.List<String> getContactIds() {
        return contactIds;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts to add to the rotation.
     * </p>
     * <p>
     * The order that you list the contacts in is their shift order in the rotation schedule. To change the order of the
     * contact's shifts, use the <a>UpdateRotation</a> operation.
     * </p>
     * 
     * @param contactIds
     *        The Amazon Resource Names (ARNs) of the contacts to add to the rotation.</p>
     *        <p>
     *        The order that you list the contacts in is their shift order in the rotation schedule. To change the order
     *        of the contact's shifts, use the <a>UpdateRotation</a> operation.
     */

    public void setContactIds(java.util.Collection<String> contactIds) {
        if (contactIds == null) {
            this.contactIds = null;
            return;
        }

        this.contactIds = new java.util.ArrayList<String>(contactIds);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts to add to the rotation.
     * </p>
     * <p>
     * The order that you list the contacts in is their shift order in the rotation schedule. To change the order of the
     * contact's shifts, use the <a>UpdateRotation</a> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContactIds(java.util.Collection)} or {@link #withContactIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param contactIds
     *        The Amazon Resource Names (ARNs) of the contacts to add to the rotation.</p>
     *        <p>
     *        The order that you list the contacts in is their shift order in the rotation schedule. To change the order
     *        of the contact's shifts, use the <a>UpdateRotation</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRotationRequest withContactIds(String... contactIds) {
        if (this.contactIds == null) {
            setContactIds(new java.util.ArrayList<String>(contactIds.length));
        }
        for (String ele : contactIds) {
            this.contactIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts to add to the rotation.
     * </p>
     * <p>
     * The order that you list the contacts in is their shift order in the rotation schedule. To change the order of the
     * contact's shifts, use the <a>UpdateRotation</a> operation.
     * </p>
     * 
     * @param contactIds
     *        The Amazon Resource Names (ARNs) of the contacts to add to the rotation.</p>
     *        <p>
     *        The order that you list the contacts in is their shift order in the rotation schedule. To change the order
     *        of the contact's shifts, use the <a>UpdateRotation</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRotationRequest withContactIds(java.util.Collection<String> contactIds) {
        setContactIds(contactIds);
        return this;
    }

    /**
     * <p>
     * The date and time that the rotation goes into effect.
     * </p>
     * 
     * @param startTime
     *        The date and time that the rotation goes into effect.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time that the rotation goes into effect.
     * </p>
     * 
     * @return The date and time that the rotation goes into effect.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time that the rotation goes into effect.
     * </p>
     * 
     * @param startTime
     *        The date and time that the rotation goes into effect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRotationRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time zone to base the rotation’s activity on in Internet Assigned Numbers Authority (IANA) format. For
     * example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the <a
     * href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.
     * </p>
     * <note>
     * <p>
     * Designators for time zones that don’t support Daylight Savings Time rules, such as Pacific Standard Time (PST)
     * and Pacific Daylight Time (PDT), are not supported.
     * </p>
     * </note>
     * 
     * @param timeZoneId
     *        The time zone to base the rotation’s activity on in Internet Assigned Numbers Authority (IANA) format. For
     *        example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the <a
     *        href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.</p> <note>
     *        <p>
     *        Designators for time zones that don’t support Daylight Savings Time rules, such as Pacific Standard Time
     *        (PST) and Pacific Daylight Time (PDT), are not supported.
     *        </p>
     */

    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    /**
     * <p>
     * The time zone to base the rotation’s activity on in Internet Assigned Numbers Authority (IANA) format. For
     * example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the <a
     * href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.
     * </p>
     * <note>
     * <p>
     * Designators for time zones that don’t support Daylight Savings Time rules, such as Pacific Standard Time (PST)
     * and Pacific Daylight Time (PDT), are not supported.
     * </p>
     * </note>
     * 
     * @return The time zone to base the rotation’s activity on in Internet Assigned Numbers Authority (IANA) format.
     *         For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the <a
     *         href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.</p> <note>
     *         <p>
     *         Designators for time zones that don’t support Daylight Savings Time rules, such as Pacific Standard Time
     *         (PST) and Pacific Daylight Time (PDT), are not supported.
     *         </p>
     */

    public String getTimeZoneId() {
        return this.timeZoneId;
    }

    /**
     * <p>
     * The time zone to base the rotation’s activity on in Internet Assigned Numbers Authority (IANA) format. For
     * example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the <a
     * href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.
     * </p>
     * <note>
     * <p>
     * Designators for time zones that don’t support Daylight Savings Time rules, such as Pacific Standard Time (PST)
     * and Pacific Daylight Time (PDT), are not supported.
     * </p>
     * </note>
     * 
     * @param timeZoneId
     *        The time zone to base the rotation’s activity on in Internet Assigned Numbers Authority (IANA) format. For
     *        example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the <a
     *        href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.</p> <note>
     *        <p>
     *        Designators for time zones that don’t support Daylight Savings Time rules, such as Pacific Standard Time
     *        (PST) and Pacific Daylight Time (PDT), are not supported.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRotationRequest withTimeZoneId(String timeZoneId) {
        setTimeZoneId(timeZoneId);
        return this;
    }

    /**
     * <p>
     * Information about the rule that specifies when a shift's team members rotate.
     * </p>
     * 
     * @param recurrence
     *        Information about the rule that specifies when a shift's team members rotate.
     */

    public void setRecurrence(RecurrenceSettings recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * <p>
     * Information about the rule that specifies when a shift's team members rotate.
     * </p>
     * 
     * @return Information about the rule that specifies when a shift's team members rotate.
     */

    public RecurrenceSettings getRecurrence() {
        return this.recurrence;
    }

    /**
     * <p>
     * Information about the rule that specifies when a shift's team members rotate.
     * </p>
     * 
     * @param recurrence
     *        Information about the rule that specifies when a shift's team members rotate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRotationRequest withRecurrence(RecurrenceSettings recurrence) {
        setRecurrence(recurrence);
        return this;
    }

    /**
     * <p>
     * Optional metadata to assign to the rotation. Tags enable you to categorize a resource in different ways, such as
     * by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html">Tagging Incident Manager
     * resources</a> in the <i>Incident Manager User Guide</i>.
     * </p>
     * 
     * @return Optional metadata to assign to the rotation. Tags enable you to categorize a resource in different ways,
     *         such as by purpose, owner, or environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html">Tagging Incident
     *         Manager resources</a> in the <i>Incident Manager User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optional metadata to assign to the rotation. Tags enable you to categorize a resource in different ways, such as
     * by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html">Tagging Incident Manager
     * resources</a> in the <i>Incident Manager User Guide</i>.
     * </p>
     * 
     * @param tags
     *        Optional metadata to assign to the rotation. Tags enable you to categorize a resource in different ways,
     *        such as by purpose, owner, or environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html">Tagging Incident Manager
     *        resources</a> in the <i>Incident Manager User Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Optional metadata to assign to the rotation. Tags enable you to categorize a resource in different ways, such as
     * by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html">Tagging Incident Manager
     * resources</a> in the <i>Incident Manager User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Optional metadata to assign to the rotation. Tags enable you to categorize a resource in different ways,
     *        such as by purpose, owner, or environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html">Tagging Incident Manager
     *        resources</a> in the <i>Incident Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRotationRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optional metadata to assign to the rotation. Tags enable you to categorize a resource in different ways, such as
     * by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html">Tagging Incident Manager
     * resources</a> in the <i>Incident Manager User Guide</i>.
     * </p>
     * 
     * @param tags
     *        Optional metadata to assign to the rotation. Tags enable you to categorize a resource in different ways,
     *        such as by purpose, owner, or environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/incident-manager/latest/userguide/tagging.html">Tagging Incident Manager
     *        resources</a> in the <i>Incident Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRotationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A token that ensures that the operation is called only once with the specified details.
     * </p>
     * 
     * @param idempotencyToken
     *        A token that ensures that the operation is called only once with the specified details.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A token that ensures that the operation is called only once with the specified details.
     * </p>
     * 
     * @return A token that ensures that the operation is called only once with the specified details.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A token that ensures that the operation is called only once with the specified details.
     * </p>
     * 
     * @param idempotencyToken
     *        A token that ensures that the operation is called only once with the specified details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRotationRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getContactIds() != null)
            sb.append("ContactIds: ").append(getContactIds()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getTimeZoneId() != null)
            sb.append("TimeZoneId: ").append(getTimeZoneId()).append(",");
        if (getRecurrence() != null)
            sb.append("Recurrence: ").append(getRecurrence()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRotationRequest == false)
            return false;
        CreateRotationRequest other = (CreateRotationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getContactIds() == null ^ this.getContactIds() == null)
            return false;
        if (other.getContactIds() != null && other.getContactIds().equals(this.getContactIds()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getTimeZoneId() == null ^ this.getTimeZoneId() == null)
            return false;
        if (other.getTimeZoneId() != null && other.getTimeZoneId().equals(this.getTimeZoneId()) == false)
            return false;
        if (other.getRecurrence() == null ^ this.getRecurrence() == null)
            return false;
        if (other.getRecurrence() != null && other.getRecurrence().equals(this.getRecurrence()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getContactIds() == null) ? 0 : getContactIds().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getTimeZoneId() == null) ? 0 : getTimeZoneId().hashCode());
        hashCode = prime * hashCode + ((getRecurrence() == null) ? 0 : getRecurrence().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateRotationRequest clone() {
        return (CreateRotationRequest) super.clone();
    }

}
