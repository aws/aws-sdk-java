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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListPreviewRotationShifts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPreviewRotationShiftsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time a rotation would begin. The first shift is calculated from this date and time.
     * </p>
     */
    private java.util.Date rotationStartTime;
    /**
     * <p>
     * Used to filter the range of calculated shifts before sending the response back to the user.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The date and time a rotation shift would end.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The contacts that would be assigned to a rotation.
     * </p>
     */
    private java.util.List<String> members;
    /**
     * <p>
     * The time zone the rotation’s activity would be based on, in Internet Assigned Numbers Authority (IANA) format.
     * For example: "America/Los_Angeles", "UTC", or "Asia/Seoul".
     * </p>
     */
    private String timeZoneId;
    /**
     * <p>
     * Information about how long a rotation would last before restarting at the beginning of the shift order.
     * </p>
     */
    private RecurrenceSettings recurrence;
    /**
     * <p>
     * Information about changes that would be made in a rotation override.
     * </p>
     */
    private java.util.List<PreviewOverride> overrides;
    /**
     * <p>
     * A token to start the list. This token is used to get the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that can be specified in a
     * subsequent call to get the next set of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The date and time a rotation would begin. The first shift is calculated from this date and time.
     * </p>
     * 
     * @param rotationStartTime
     *        The date and time a rotation would begin. The first shift is calculated from this date and time.
     */

    public void setRotationStartTime(java.util.Date rotationStartTime) {
        this.rotationStartTime = rotationStartTime;
    }

    /**
     * <p>
     * The date and time a rotation would begin. The first shift is calculated from this date and time.
     * </p>
     * 
     * @return The date and time a rotation would begin. The first shift is calculated from this date and time.
     */

    public java.util.Date getRotationStartTime() {
        return this.rotationStartTime;
    }

    /**
     * <p>
     * The date and time a rotation would begin. The first shift is calculated from this date and time.
     * </p>
     * 
     * @param rotationStartTime
     *        The date and time a rotation would begin. The first shift is calculated from this date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPreviewRotationShiftsRequest withRotationStartTime(java.util.Date rotationStartTime) {
        setRotationStartTime(rotationStartTime);
        return this;
    }

    /**
     * <p>
     * Used to filter the range of calculated shifts before sending the response back to the user.
     * </p>
     * 
     * @param startTime
     *        Used to filter the range of calculated shifts before sending the response back to the user.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Used to filter the range of calculated shifts before sending the response back to the user.
     * </p>
     * 
     * @return Used to filter the range of calculated shifts before sending the response back to the user.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Used to filter the range of calculated shifts before sending the response back to the user.
     * </p>
     * 
     * @param startTime
     *        Used to filter the range of calculated shifts before sending the response back to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPreviewRotationShiftsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time a rotation shift would end.
     * </p>
     * 
     * @param endTime
     *        The date and time a rotation shift would end.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time a rotation shift would end.
     * </p>
     * 
     * @return The date and time a rotation shift would end.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The date and time a rotation shift would end.
     * </p>
     * 
     * @param endTime
     *        The date and time a rotation shift would end.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPreviewRotationShiftsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The contacts that would be assigned to a rotation.
     * </p>
     * 
     * @return The contacts that would be assigned to a rotation.
     */

    public java.util.List<String> getMembers() {
        return members;
    }

    /**
     * <p>
     * The contacts that would be assigned to a rotation.
     * </p>
     * 
     * @param members
     *        The contacts that would be assigned to a rotation.
     */

    public void setMembers(java.util.Collection<String> members) {
        if (members == null) {
            this.members = null;
            return;
        }

        this.members = new java.util.ArrayList<String>(members);
    }

    /**
     * <p>
     * The contacts that would be assigned to a rotation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMembers(java.util.Collection)} or {@link #withMembers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param members
     *        The contacts that would be assigned to a rotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPreviewRotationShiftsRequest withMembers(String... members) {
        if (this.members == null) {
            setMembers(new java.util.ArrayList<String>(members.length));
        }
        for (String ele : members) {
            this.members.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The contacts that would be assigned to a rotation.
     * </p>
     * 
     * @param members
     *        The contacts that would be assigned to a rotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPreviewRotationShiftsRequest withMembers(java.util.Collection<String> members) {
        setMembers(members);
        return this;
    }

    /**
     * <p>
     * The time zone the rotation’s activity would be based on, in Internet Assigned Numbers Authority (IANA) format.
     * For example: "America/Los_Angeles", "UTC", or "Asia/Seoul".
     * </p>
     * 
     * @param timeZoneId
     *        The time zone the rotation’s activity would be based on, in Internet Assigned Numbers Authority (IANA)
     *        format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul".
     */

    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    /**
     * <p>
     * The time zone the rotation’s activity would be based on, in Internet Assigned Numbers Authority (IANA) format.
     * For example: "America/Los_Angeles", "UTC", or "Asia/Seoul".
     * </p>
     * 
     * @return The time zone the rotation’s activity would be based on, in Internet Assigned Numbers Authority (IANA)
     *         format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul".
     */

    public String getTimeZoneId() {
        return this.timeZoneId;
    }

    /**
     * <p>
     * The time zone the rotation’s activity would be based on, in Internet Assigned Numbers Authority (IANA) format.
     * For example: "America/Los_Angeles", "UTC", or "Asia/Seoul".
     * </p>
     * 
     * @param timeZoneId
     *        The time zone the rotation’s activity would be based on, in Internet Assigned Numbers Authority (IANA)
     *        format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPreviewRotationShiftsRequest withTimeZoneId(String timeZoneId) {
        setTimeZoneId(timeZoneId);
        return this;
    }

    /**
     * <p>
     * Information about how long a rotation would last before restarting at the beginning of the shift order.
     * </p>
     * 
     * @param recurrence
     *        Information about how long a rotation would last before restarting at the beginning of the shift order.
     */

    public void setRecurrence(RecurrenceSettings recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * <p>
     * Information about how long a rotation would last before restarting at the beginning of the shift order.
     * </p>
     * 
     * @return Information about how long a rotation would last before restarting at the beginning of the shift order.
     */

    public RecurrenceSettings getRecurrence() {
        return this.recurrence;
    }

    /**
     * <p>
     * Information about how long a rotation would last before restarting at the beginning of the shift order.
     * </p>
     * 
     * @param recurrence
     *        Information about how long a rotation would last before restarting at the beginning of the shift order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPreviewRotationShiftsRequest withRecurrence(RecurrenceSettings recurrence) {
        setRecurrence(recurrence);
        return this;
    }

    /**
     * <p>
     * Information about changes that would be made in a rotation override.
     * </p>
     * 
     * @return Information about changes that would be made in a rotation override.
     */

    public java.util.List<PreviewOverride> getOverrides() {
        return overrides;
    }

    /**
     * <p>
     * Information about changes that would be made in a rotation override.
     * </p>
     * 
     * @param overrides
     *        Information about changes that would be made in a rotation override.
     */

    public void setOverrides(java.util.Collection<PreviewOverride> overrides) {
        if (overrides == null) {
            this.overrides = null;
            return;
        }

        this.overrides = new java.util.ArrayList<PreviewOverride>(overrides);
    }

    /**
     * <p>
     * Information about changes that would be made in a rotation override.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOverrides(java.util.Collection)} or {@link #withOverrides(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param overrides
     *        Information about changes that would be made in a rotation override.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPreviewRotationShiftsRequest withOverrides(PreviewOverride... overrides) {
        if (this.overrides == null) {
            setOverrides(new java.util.ArrayList<PreviewOverride>(overrides.length));
        }
        for (PreviewOverride ele : overrides) {
            this.overrides.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about changes that would be made in a rotation override.
     * </p>
     * 
     * @param overrides
     *        Information about changes that would be made in a rotation override.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPreviewRotationShiftsRequest withOverrides(java.util.Collection<PreviewOverride> overrides) {
        setOverrides(overrides);
        return this;
    }

    /**
     * <p>
     * A token to start the list. This token is used to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. This token is used to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to start the list. This token is used to get the next set of results.
     * </p>
     * 
     * @return A token to start the list. This token is used to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to start the list. This token is used to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. This token is used to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPreviewRotationShiftsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that can be specified in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that can be specified
     *        in a subsequent call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that can be specified in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @return The maximum number of items to return for this call. The call also returns a token that can be specified
     *         in a subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that can be specified in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that can be specified
     *        in a subsequent call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPreviewRotationShiftsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getRotationStartTime() != null)
            sb.append("RotationStartTime: ").append(getRotationStartTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getMembers() != null)
            sb.append("Members: ").append(getMembers()).append(",");
        if (getTimeZoneId() != null)
            sb.append("TimeZoneId: ").append(getTimeZoneId()).append(",");
        if (getRecurrence() != null)
            sb.append("Recurrence: ").append(getRecurrence()).append(",");
        if (getOverrides() != null)
            sb.append("Overrides: ").append(getOverrides()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPreviewRotationShiftsRequest == false)
            return false;
        ListPreviewRotationShiftsRequest other = (ListPreviewRotationShiftsRequest) obj;
        if (other.getRotationStartTime() == null ^ this.getRotationStartTime() == null)
            return false;
        if (other.getRotationStartTime() != null && other.getRotationStartTime().equals(this.getRotationStartTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getMembers() == null ^ this.getMembers() == null)
            return false;
        if (other.getMembers() != null && other.getMembers().equals(this.getMembers()) == false)
            return false;
        if (other.getTimeZoneId() == null ^ this.getTimeZoneId() == null)
            return false;
        if (other.getTimeZoneId() != null && other.getTimeZoneId().equals(this.getTimeZoneId()) == false)
            return false;
        if (other.getRecurrence() == null ^ this.getRecurrence() == null)
            return false;
        if (other.getRecurrence() != null && other.getRecurrence().equals(this.getRecurrence()) == false)
            return false;
        if (other.getOverrides() == null ^ this.getOverrides() == null)
            return false;
        if (other.getOverrides() != null && other.getOverrides().equals(this.getOverrides()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRotationStartTime() == null) ? 0 : getRotationStartTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getMembers() == null) ? 0 : getMembers().hashCode());
        hashCode = prime * hashCode + ((getTimeZoneId() == null) ? 0 : getTimeZoneId().hashCode());
        hashCode = prime * hashCode + ((getRecurrence() == null) ? 0 : getRecurrence().hashCode());
        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListPreviewRotationShiftsRequest clone() {
        return (ListPreviewRotationShiftsRequest) super.clone();
    }

}
