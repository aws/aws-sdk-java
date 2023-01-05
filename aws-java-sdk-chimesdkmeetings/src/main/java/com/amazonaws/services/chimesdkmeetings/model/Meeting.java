/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmeetings.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A meeting created using the Amazon Chime SDK.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/Meeting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Meeting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     */
    private String meetingId;
    /**
     * <p>
     * Reserved.
     * </p>
     */
    private String meetingHostId;
    /**
     * <p>
     * The external meeting ID.
     * </p>
     */
    private String externalMeetingId;
    /**
     * <p>
     * The Region in which you create the meeting. Available values: <code>af-south-1</code>,
     * <code>ap-northeast-1</code>, <code>ap-northeast-2</code>, <code>ap-south-1</code>, <code>ap-southeast-1</code>,
     * <code>ap-southeast-2</code>, <code>ca-central-1</code>, <code>eu-central-1</code>, <code>eu-north-1</code>,
     * <code>eu-south-1</code>, <code>eu-west-1</code>, <code>eu-west-2</code>, <code>eu-west-3</code>,
     * <code>sa-east-1</code>, <code>us-east-1</code>, <code>us-east-2</code>, <code>us-west-1</code>,
     * <code>us-west-2</code>.
     * </p>
     * <p>
     * Available values in AWS GovCloud (US) Regions: <code>us-gov-east-1</code>, <code>us-gov-west-1</code>.
     * </p>
     */
    private String mediaRegion;
    /**
     * <p>
     * The media placement for the meeting.
     * </p>
     */
    private MediaPlacement mediaPlacement;
    /**
     * <p>
     * The features available to a meeting, such as Amazon Voice Focus.
     * </p>
     */
    private MeetingFeaturesConfiguration meetingFeatures;
    /**
     * <p>
     * When specified, replicates the media from the primary meeting to this meeting.
     * </p>
     */
    private String primaryMeetingId;
    /**
     * <p>
     * Array of strings.
     * </p>
     */
    private java.util.List<String> tenantIds;
    /**
     * <p>
     * The ARN of the meeting.
     * </p>
     */
    private String meetingArn;

    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     * 
     * @param meetingId
     *        The Amazon Chime SDK meeting ID.
     */

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     * 
     * @return The Amazon Chime SDK meeting ID.
     */

    public String getMeetingId() {
        return this.meetingId;
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     * 
     * @param meetingId
     *        The Amazon Chime SDK meeting ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Meeting withMeetingId(String meetingId) {
        setMeetingId(meetingId);
        return this;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param meetingHostId
     *        Reserved.
     */

    public void setMeetingHostId(String meetingHostId) {
        this.meetingHostId = meetingHostId;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @return Reserved.
     */

    public String getMeetingHostId() {
        return this.meetingHostId;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param meetingHostId
     *        Reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Meeting withMeetingHostId(String meetingHostId) {
        setMeetingHostId(meetingHostId);
        return this;
    }

    /**
     * <p>
     * The external meeting ID.
     * </p>
     * 
     * @param externalMeetingId
     *        The external meeting ID.
     */

    public void setExternalMeetingId(String externalMeetingId) {
        this.externalMeetingId = externalMeetingId;
    }

    /**
     * <p>
     * The external meeting ID.
     * </p>
     * 
     * @return The external meeting ID.
     */

    public String getExternalMeetingId() {
        return this.externalMeetingId;
    }

    /**
     * <p>
     * The external meeting ID.
     * </p>
     * 
     * @param externalMeetingId
     *        The external meeting ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Meeting withExternalMeetingId(String externalMeetingId) {
        setExternalMeetingId(externalMeetingId);
        return this;
    }

    /**
     * <p>
     * The Region in which you create the meeting. Available values: <code>af-south-1</code>,
     * <code>ap-northeast-1</code>, <code>ap-northeast-2</code>, <code>ap-south-1</code>, <code>ap-southeast-1</code>,
     * <code>ap-southeast-2</code>, <code>ca-central-1</code>, <code>eu-central-1</code>, <code>eu-north-1</code>,
     * <code>eu-south-1</code>, <code>eu-west-1</code>, <code>eu-west-2</code>, <code>eu-west-3</code>,
     * <code>sa-east-1</code>, <code>us-east-1</code>, <code>us-east-2</code>, <code>us-west-1</code>,
     * <code>us-west-2</code>.
     * </p>
     * <p>
     * Available values in AWS GovCloud (US) Regions: <code>us-gov-east-1</code>, <code>us-gov-west-1</code>.
     * </p>
     * 
     * @param mediaRegion
     *        The Region in which you create the meeting. Available values: <code>af-south-1</code>,
     *        <code>ap-northeast-1</code>, <code>ap-northeast-2</code>, <code>ap-south-1</code>,
     *        <code>ap-southeast-1</code>, <code>ap-southeast-2</code>, <code>ca-central-1</code>,
     *        <code>eu-central-1</code>, <code>eu-north-1</code>, <code>eu-south-1</code>, <code>eu-west-1</code>,
     *        <code>eu-west-2</code>, <code>eu-west-3</code>, <code>sa-east-1</code>, <code>us-east-1</code>,
     *        <code>us-east-2</code>, <code>us-west-1</code>, <code>us-west-2</code>.</p>
     *        <p>
     *        Available values in AWS GovCloud (US) Regions: <code>us-gov-east-1</code>, <code>us-gov-west-1</code>.
     */

    public void setMediaRegion(String mediaRegion) {
        this.mediaRegion = mediaRegion;
    }

    /**
     * <p>
     * The Region in which you create the meeting. Available values: <code>af-south-1</code>,
     * <code>ap-northeast-1</code>, <code>ap-northeast-2</code>, <code>ap-south-1</code>, <code>ap-southeast-1</code>,
     * <code>ap-southeast-2</code>, <code>ca-central-1</code>, <code>eu-central-1</code>, <code>eu-north-1</code>,
     * <code>eu-south-1</code>, <code>eu-west-1</code>, <code>eu-west-2</code>, <code>eu-west-3</code>,
     * <code>sa-east-1</code>, <code>us-east-1</code>, <code>us-east-2</code>, <code>us-west-1</code>,
     * <code>us-west-2</code>.
     * </p>
     * <p>
     * Available values in AWS GovCloud (US) Regions: <code>us-gov-east-1</code>, <code>us-gov-west-1</code>.
     * </p>
     * 
     * @return The Region in which you create the meeting. Available values: <code>af-south-1</code>,
     *         <code>ap-northeast-1</code>, <code>ap-northeast-2</code>, <code>ap-south-1</code>,
     *         <code>ap-southeast-1</code>, <code>ap-southeast-2</code>, <code>ca-central-1</code>,
     *         <code>eu-central-1</code>, <code>eu-north-1</code>, <code>eu-south-1</code>, <code>eu-west-1</code>,
     *         <code>eu-west-2</code>, <code>eu-west-3</code>, <code>sa-east-1</code>, <code>us-east-1</code>,
     *         <code>us-east-2</code>, <code>us-west-1</code>, <code>us-west-2</code>.</p>
     *         <p>
     *         Available values in AWS GovCloud (US) Regions: <code>us-gov-east-1</code>, <code>us-gov-west-1</code>.
     */

    public String getMediaRegion() {
        return this.mediaRegion;
    }

    /**
     * <p>
     * The Region in which you create the meeting. Available values: <code>af-south-1</code>,
     * <code>ap-northeast-1</code>, <code>ap-northeast-2</code>, <code>ap-south-1</code>, <code>ap-southeast-1</code>,
     * <code>ap-southeast-2</code>, <code>ca-central-1</code>, <code>eu-central-1</code>, <code>eu-north-1</code>,
     * <code>eu-south-1</code>, <code>eu-west-1</code>, <code>eu-west-2</code>, <code>eu-west-3</code>,
     * <code>sa-east-1</code>, <code>us-east-1</code>, <code>us-east-2</code>, <code>us-west-1</code>,
     * <code>us-west-2</code>.
     * </p>
     * <p>
     * Available values in AWS GovCloud (US) Regions: <code>us-gov-east-1</code>, <code>us-gov-west-1</code>.
     * </p>
     * 
     * @param mediaRegion
     *        The Region in which you create the meeting. Available values: <code>af-south-1</code>,
     *        <code>ap-northeast-1</code>, <code>ap-northeast-2</code>, <code>ap-south-1</code>,
     *        <code>ap-southeast-1</code>, <code>ap-southeast-2</code>, <code>ca-central-1</code>,
     *        <code>eu-central-1</code>, <code>eu-north-1</code>, <code>eu-south-1</code>, <code>eu-west-1</code>,
     *        <code>eu-west-2</code>, <code>eu-west-3</code>, <code>sa-east-1</code>, <code>us-east-1</code>,
     *        <code>us-east-2</code>, <code>us-west-1</code>, <code>us-west-2</code>.</p>
     *        <p>
     *        Available values in AWS GovCloud (US) Regions: <code>us-gov-east-1</code>, <code>us-gov-west-1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Meeting withMediaRegion(String mediaRegion) {
        setMediaRegion(mediaRegion);
        return this;
    }

    /**
     * <p>
     * The media placement for the meeting.
     * </p>
     * 
     * @param mediaPlacement
     *        The media placement for the meeting.
     */

    public void setMediaPlacement(MediaPlacement mediaPlacement) {
        this.mediaPlacement = mediaPlacement;
    }

    /**
     * <p>
     * The media placement for the meeting.
     * </p>
     * 
     * @return The media placement for the meeting.
     */

    public MediaPlacement getMediaPlacement() {
        return this.mediaPlacement;
    }

    /**
     * <p>
     * The media placement for the meeting.
     * </p>
     * 
     * @param mediaPlacement
     *        The media placement for the meeting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Meeting withMediaPlacement(MediaPlacement mediaPlacement) {
        setMediaPlacement(mediaPlacement);
        return this;
    }

    /**
     * <p>
     * The features available to a meeting, such as Amazon Voice Focus.
     * </p>
     * 
     * @param meetingFeatures
     *        The features available to a meeting, such as Amazon Voice Focus.
     */

    public void setMeetingFeatures(MeetingFeaturesConfiguration meetingFeatures) {
        this.meetingFeatures = meetingFeatures;
    }

    /**
     * <p>
     * The features available to a meeting, such as Amazon Voice Focus.
     * </p>
     * 
     * @return The features available to a meeting, such as Amazon Voice Focus.
     */

    public MeetingFeaturesConfiguration getMeetingFeatures() {
        return this.meetingFeatures;
    }

    /**
     * <p>
     * The features available to a meeting, such as Amazon Voice Focus.
     * </p>
     * 
     * @param meetingFeatures
     *        The features available to a meeting, such as Amazon Voice Focus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Meeting withMeetingFeatures(MeetingFeaturesConfiguration meetingFeatures) {
        setMeetingFeatures(meetingFeatures);
        return this;
    }

    /**
     * <p>
     * When specified, replicates the media from the primary meeting to this meeting.
     * </p>
     * 
     * @param primaryMeetingId
     *        When specified, replicates the media from the primary meeting to this meeting.
     */

    public void setPrimaryMeetingId(String primaryMeetingId) {
        this.primaryMeetingId = primaryMeetingId;
    }

    /**
     * <p>
     * When specified, replicates the media from the primary meeting to this meeting.
     * </p>
     * 
     * @return When specified, replicates the media from the primary meeting to this meeting.
     */

    public String getPrimaryMeetingId() {
        return this.primaryMeetingId;
    }

    /**
     * <p>
     * When specified, replicates the media from the primary meeting to this meeting.
     * </p>
     * 
     * @param primaryMeetingId
     *        When specified, replicates the media from the primary meeting to this meeting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Meeting withPrimaryMeetingId(String primaryMeetingId) {
        setPrimaryMeetingId(primaryMeetingId);
        return this;
    }

    /**
     * <p>
     * Array of strings.
     * </p>
     * 
     * @return Array of strings.
     */

    public java.util.List<String> getTenantIds() {
        return tenantIds;
    }

    /**
     * <p>
     * Array of strings.
     * </p>
     * 
     * @param tenantIds
     *        Array of strings.
     */

    public void setTenantIds(java.util.Collection<String> tenantIds) {
        if (tenantIds == null) {
            this.tenantIds = null;
            return;
        }

        this.tenantIds = new java.util.ArrayList<String>(tenantIds);
    }

    /**
     * <p>
     * Array of strings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTenantIds(java.util.Collection)} or {@link #withTenantIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tenantIds
     *        Array of strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Meeting withTenantIds(String... tenantIds) {
        if (this.tenantIds == null) {
            setTenantIds(new java.util.ArrayList<String>(tenantIds.length));
        }
        for (String ele : tenantIds) {
            this.tenantIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Array of strings.
     * </p>
     * 
     * @param tenantIds
     *        Array of strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Meeting withTenantIds(java.util.Collection<String> tenantIds) {
        setTenantIds(tenantIds);
        return this;
    }

    /**
     * <p>
     * The ARN of the meeting.
     * </p>
     * 
     * @param meetingArn
     *        The ARN of the meeting.
     */

    public void setMeetingArn(String meetingArn) {
        this.meetingArn = meetingArn;
    }

    /**
     * <p>
     * The ARN of the meeting.
     * </p>
     * 
     * @return The ARN of the meeting.
     */

    public String getMeetingArn() {
        return this.meetingArn;
    }

    /**
     * <p>
     * The ARN of the meeting.
     * </p>
     * 
     * @param meetingArn
     *        The ARN of the meeting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Meeting withMeetingArn(String meetingArn) {
        setMeetingArn(meetingArn);
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
        if (getMeetingId() != null)
            sb.append("MeetingId: ").append(getMeetingId()).append(",");
        if (getMeetingHostId() != null)
            sb.append("MeetingHostId: ").append("***Sensitive Data Redacted***").append(",");
        if (getExternalMeetingId() != null)
            sb.append("ExternalMeetingId: ").append("***Sensitive Data Redacted***").append(",");
        if (getMediaRegion() != null)
            sb.append("MediaRegion: ").append(getMediaRegion()).append(",");
        if (getMediaPlacement() != null)
            sb.append("MediaPlacement: ").append(getMediaPlacement()).append(",");
        if (getMeetingFeatures() != null)
            sb.append("MeetingFeatures: ").append(getMeetingFeatures()).append(",");
        if (getPrimaryMeetingId() != null)
            sb.append("PrimaryMeetingId: ").append(getPrimaryMeetingId()).append(",");
        if (getTenantIds() != null)
            sb.append("TenantIds: ").append(getTenantIds()).append(",");
        if (getMeetingArn() != null)
            sb.append("MeetingArn: ").append(getMeetingArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Meeting == false)
            return false;
        Meeting other = (Meeting) obj;
        if (other.getMeetingId() == null ^ this.getMeetingId() == null)
            return false;
        if (other.getMeetingId() != null && other.getMeetingId().equals(this.getMeetingId()) == false)
            return false;
        if (other.getMeetingHostId() == null ^ this.getMeetingHostId() == null)
            return false;
        if (other.getMeetingHostId() != null && other.getMeetingHostId().equals(this.getMeetingHostId()) == false)
            return false;
        if (other.getExternalMeetingId() == null ^ this.getExternalMeetingId() == null)
            return false;
        if (other.getExternalMeetingId() != null && other.getExternalMeetingId().equals(this.getExternalMeetingId()) == false)
            return false;
        if (other.getMediaRegion() == null ^ this.getMediaRegion() == null)
            return false;
        if (other.getMediaRegion() != null && other.getMediaRegion().equals(this.getMediaRegion()) == false)
            return false;
        if (other.getMediaPlacement() == null ^ this.getMediaPlacement() == null)
            return false;
        if (other.getMediaPlacement() != null && other.getMediaPlacement().equals(this.getMediaPlacement()) == false)
            return false;
        if (other.getMeetingFeatures() == null ^ this.getMeetingFeatures() == null)
            return false;
        if (other.getMeetingFeatures() != null && other.getMeetingFeatures().equals(this.getMeetingFeatures()) == false)
            return false;
        if (other.getPrimaryMeetingId() == null ^ this.getPrimaryMeetingId() == null)
            return false;
        if (other.getPrimaryMeetingId() != null && other.getPrimaryMeetingId().equals(this.getPrimaryMeetingId()) == false)
            return false;
        if (other.getTenantIds() == null ^ this.getTenantIds() == null)
            return false;
        if (other.getTenantIds() != null && other.getTenantIds().equals(this.getTenantIds()) == false)
            return false;
        if (other.getMeetingArn() == null ^ this.getMeetingArn() == null)
            return false;
        if (other.getMeetingArn() != null && other.getMeetingArn().equals(this.getMeetingArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeetingId() == null) ? 0 : getMeetingId().hashCode());
        hashCode = prime * hashCode + ((getMeetingHostId() == null) ? 0 : getMeetingHostId().hashCode());
        hashCode = prime * hashCode + ((getExternalMeetingId() == null) ? 0 : getExternalMeetingId().hashCode());
        hashCode = prime * hashCode + ((getMediaRegion() == null) ? 0 : getMediaRegion().hashCode());
        hashCode = prime * hashCode + ((getMediaPlacement() == null) ? 0 : getMediaPlacement().hashCode());
        hashCode = prime * hashCode + ((getMeetingFeatures() == null) ? 0 : getMeetingFeatures().hashCode());
        hashCode = prime * hashCode + ((getPrimaryMeetingId() == null) ? 0 : getPrimaryMeetingId().hashCode());
        hashCode = prime * hashCode + ((getTenantIds() == null) ? 0 : getTenantIds().hashCode());
        hashCode = prime * hashCode + ((getMeetingArn() == null) ? 0 : getMeetingArn().hashCode());
        return hashCode;
    }

    @Override
    public Meeting clone() {
        try {
            return (Meeting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmeetings.model.transform.MeetingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
