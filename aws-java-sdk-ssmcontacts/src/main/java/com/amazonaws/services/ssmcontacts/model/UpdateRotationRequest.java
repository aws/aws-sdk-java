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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/UpdateRotation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRotationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rotation to update.
     * </p>
     */
    private String rotationId;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts to include in the updated rotation.
     * </p>
     * <p>
     * The order in which you list the contacts is their shift order in the rotation schedule.
     * </p>
     */
    private java.util.List<String> contactIds;
    /**
     * <p>
     * The date and time the rotation goes into effect.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time zone to base the updated rotation’s activity on, in Internet Assigned Numbers Authority (IANA) format.
     * For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the <a
     * href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.
     * </p>
     * <note>
     * <p>
     * Designators for time zones that don’t support Daylight Savings Time Rules, such as Pacific Standard Time (PST)
     * and Pacific Daylight Time (PDT), aren't supported.
     * </p>
     * </note>
     */
    private String timeZoneId;
    /**
     * <p>
     * Information about how long the updated rotation lasts before restarting at the beginning of the shift order.
     * </p>
     */
    private RecurrenceSettings recurrence;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rotation to update.
     * </p>
     * 
     * @param rotationId
     *        The Amazon Resource Name (ARN) of the rotation to update.
     */

    public void setRotationId(String rotationId) {
        this.rotationId = rotationId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rotation to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the rotation to update.
     */

    public String getRotationId() {
        return this.rotationId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rotation to update.
     * </p>
     * 
     * @param rotationId
     *        The Amazon Resource Name (ARN) of the rotation to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRotationRequest withRotationId(String rotationId) {
        setRotationId(rotationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts to include in the updated rotation.
     * </p>
     * <p>
     * The order in which you list the contacts is their shift order in the rotation schedule.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the contacts to include in the updated rotation. </p>
     *         <p>
     *         The order in which you list the contacts is their shift order in the rotation schedule.
     */

    public java.util.List<String> getContactIds() {
        return contactIds;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts to include in the updated rotation.
     * </p>
     * <p>
     * The order in which you list the contacts is their shift order in the rotation schedule.
     * </p>
     * 
     * @param contactIds
     *        The Amazon Resource Names (ARNs) of the contacts to include in the updated rotation. </p>
     *        <p>
     *        The order in which you list the contacts is their shift order in the rotation schedule.
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
     * The Amazon Resource Names (ARNs) of the contacts to include in the updated rotation.
     * </p>
     * <p>
     * The order in which you list the contacts is their shift order in the rotation schedule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContactIds(java.util.Collection)} or {@link #withContactIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param contactIds
     *        The Amazon Resource Names (ARNs) of the contacts to include in the updated rotation. </p>
     *        <p>
     *        The order in which you list the contacts is their shift order in the rotation schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRotationRequest withContactIds(String... contactIds) {
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
     * The Amazon Resource Names (ARNs) of the contacts to include in the updated rotation.
     * </p>
     * <p>
     * The order in which you list the contacts is their shift order in the rotation schedule.
     * </p>
     * 
     * @param contactIds
     *        The Amazon Resource Names (ARNs) of the contacts to include in the updated rotation. </p>
     *        <p>
     *        The order in which you list the contacts is their shift order in the rotation schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRotationRequest withContactIds(java.util.Collection<String> contactIds) {
        setContactIds(contactIds);
        return this;
    }

    /**
     * <p>
     * The date and time the rotation goes into effect.
     * </p>
     * 
     * @param startTime
     *        The date and time the rotation goes into effect.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time the rotation goes into effect.
     * </p>
     * 
     * @return The date and time the rotation goes into effect.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time the rotation goes into effect.
     * </p>
     * 
     * @param startTime
     *        The date and time the rotation goes into effect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRotationRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time zone to base the updated rotation’s activity on, in Internet Assigned Numbers Authority (IANA) format.
     * For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the <a
     * href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.
     * </p>
     * <note>
     * <p>
     * Designators for time zones that don’t support Daylight Savings Time Rules, such as Pacific Standard Time (PST)
     * and Pacific Daylight Time (PDT), aren't supported.
     * </p>
     * </note>
     * 
     * @param timeZoneId
     *        The time zone to base the updated rotation’s activity on, in Internet Assigned Numbers Authority (IANA)
     *        format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the <a
     *        href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.</p> <note>
     *        <p>
     *        Designators for time zones that don’t support Daylight Savings Time Rules, such as Pacific Standard Time
     *        (PST) and Pacific Daylight Time (PDT), aren't supported.
     *        </p>
     */

    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    /**
     * <p>
     * The time zone to base the updated rotation’s activity on, in Internet Assigned Numbers Authority (IANA) format.
     * For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the <a
     * href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.
     * </p>
     * <note>
     * <p>
     * Designators for time zones that don’t support Daylight Savings Time Rules, such as Pacific Standard Time (PST)
     * and Pacific Daylight Time (PDT), aren't supported.
     * </p>
     * </note>
     * 
     * @return The time zone to base the updated rotation’s activity on, in Internet Assigned Numbers Authority (IANA)
     *         format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the <a
     *         href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.</p> <note>
     *         <p>
     *         Designators for time zones that don’t support Daylight Savings Time Rules, such as Pacific Standard Time
     *         (PST) and Pacific Daylight Time (PDT), aren't supported.
     *         </p>
     */

    public String getTimeZoneId() {
        return this.timeZoneId;
    }

    /**
     * <p>
     * The time zone to base the updated rotation’s activity on, in Internet Assigned Numbers Authority (IANA) format.
     * For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the <a
     * href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.
     * </p>
     * <note>
     * <p>
     * Designators for time zones that don’t support Daylight Savings Time Rules, such as Pacific Standard Time (PST)
     * and Pacific Daylight Time (PDT), aren't supported.
     * </p>
     * </note>
     * 
     * @param timeZoneId
     *        The time zone to base the updated rotation’s activity on, in Internet Assigned Numbers Authority (IANA)
     *        format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the <a
     *        href="https://www.iana.org/time-zones">Time Zone Database</a> on the IANA website.</p> <note>
     *        <p>
     *        Designators for time zones that don’t support Daylight Savings Time Rules, such as Pacific Standard Time
     *        (PST) and Pacific Daylight Time (PDT), aren't supported.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRotationRequest withTimeZoneId(String timeZoneId) {
        setTimeZoneId(timeZoneId);
        return this;
    }

    /**
     * <p>
     * Information about how long the updated rotation lasts before restarting at the beginning of the shift order.
     * </p>
     * 
     * @param recurrence
     *        Information about how long the updated rotation lasts before restarting at the beginning of the shift
     *        order.
     */

    public void setRecurrence(RecurrenceSettings recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * <p>
     * Information about how long the updated rotation lasts before restarting at the beginning of the shift order.
     * </p>
     * 
     * @return Information about how long the updated rotation lasts before restarting at the beginning of the shift
     *         order.
     */

    public RecurrenceSettings getRecurrence() {
        return this.recurrence;
    }

    /**
     * <p>
     * Information about how long the updated rotation lasts before restarting at the beginning of the shift order.
     * </p>
     * 
     * @param recurrence
     *        Information about how long the updated rotation lasts before restarting at the beginning of the shift
     *        order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRotationRequest withRecurrence(RecurrenceSettings recurrence) {
        setRecurrence(recurrence);
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
        if (getRotationId() != null)
            sb.append("RotationId: ").append(getRotationId()).append(",");
        if (getContactIds() != null)
            sb.append("ContactIds: ").append(getContactIds()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getTimeZoneId() != null)
            sb.append("TimeZoneId: ").append(getTimeZoneId()).append(",");
        if (getRecurrence() != null)
            sb.append("Recurrence: ").append(getRecurrence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRotationRequest == false)
            return false;
        UpdateRotationRequest other = (UpdateRotationRequest) obj;
        if (other.getRotationId() == null ^ this.getRotationId() == null)
            return false;
        if (other.getRotationId() != null && other.getRotationId().equals(this.getRotationId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRotationId() == null) ? 0 : getRotationId().hashCode());
        hashCode = prime * hashCode + ((getContactIds() == null) ? 0 : getContactIds().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getTimeZoneId() == null) ? 0 : getTimeZoneId().hashCode());
        hashCode = prime * hashCode + ((getRecurrence() == null) ? 0 : getRecurrence().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRotationRequest clone() {
        return (UpdateRotationRequest) super.clone();
    }

}
