/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A HarvestJob resource configuration
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/HarvestJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HarvestJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * The Amazon Resource Name (ARN) assigned to the HarvestJob.
     */
    private String arn;
    /**
     * The ID of the Channel that the HarvestJob will harvest from.
     */
    private String channelId;
    /**
     * The time the HarvestJob was submitted
     */
    private String createdAt;
    /**
     * The end of the time-window which will be harvested.
     */
    private String endTime;
    /**
     * The ID of the HarvestJob. The ID must be unique within the region and it cannot be changed after the HarvestJob
     * is submitted.
     */
    private String id;
    /**
     * The ID of the OriginEndpoint that the HarvestJob will harvest from. This cannot be changed after the HarvestJob
     * is submitted.
     */
    private String originEndpointId;

    private S3Destination s3Destination;
    /**
     * The start of the time-window which will be harvested.
     */
    private String startTime;
    /**
     * The current status of the HarvestJob. Consider setting up a CloudWatch Event to listen for HarvestJobs as they
     * succeed or fail. In the event of failure, the CloudWatch Event will include an explanation of why the HarvestJob
     * failed.
     */
    private String status;

    /**
     * The Amazon Resource Name (ARN) assigned to the HarvestJob.
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) assigned to the HarvestJob.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The Amazon Resource Name (ARN) assigned to the HarvestJob.
     * 
     * @return The Amazon Resource Name (ARN) assigned to the HarvestJob.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * The Amazon Resource Name (ARN) assigned to the HarvestJob.
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) assigned to the HarvestJob.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HarvestJob withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * The ID of the Channel that the HarvestJob will harvest from.
     * 
     * @param channelId
     *        The ID of the Channel that the HarvestJob will harvest from.
     */

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * The ID of the Channel that the HarvestJob will harvest from.
     * 
     * @return The ID of the Channel that the HarvestJob will harvest from.
     */

    public String getChannelId() {
        return this.channelId;
    }

    /**
     * The ID of the Channel that the HarvestJob will harvest from.
     * 
     * @param channelId
     *        The ID of the Channel that the HarvestJob will harvest from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HarvestJob withChannelId(String channelId) {
        setChannelId(channelId);
        return this;
    }

    /**
     * The time the HarvestJob was submitted
     * 
     * @param createdAt
     *        The time the HarvestJob was submitted
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The time the HarvestJob was submitted
     * 
     * @return The time the HarvestJob was submitted
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * The time the HarvestJob was submitted
     * 
     * @param createdAt
     *        The time the HarvestJob was submitted
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HarvestJob withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * The end of the time-window which will be harvested.
     * 
     * @param endTime
     *        The end of the time-window which will be harvested.
     */

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * The end of the time-window which will be harvested.
     * 
     * @return The end of the time-window which will be harvested.
     */

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * The end of the time-window which will be harvested.
     * 
     * @param endTime
     *        The end of the time-window which will be harvested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HarvestJob withEndTime(String endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * The ID of the HarvestJob. The ID must be unique within the region and it cannot be changed after the HarvestJob
     * is submitted.
     * 
     * @param id
     *        The ID of the HarvestJob. The ID must be unique within the region and it cannot be changed after the
     *        HarvestJob is submitted.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The ID of the HarvestJob. The ID must be unique within the region and it cannot be changed after the HarvestJob
     * is submitted.
     * 
     * @return The ID of the HarvestJob. The ID must be unique within the region and it cannot be changed after the
     *         HarvestJob is submitted.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The ID of the HarvestJob. The ID must be unique within the region and it cannot be changed after the HarvestJob
     * is submitted.
     * 
     * @param id
     *        The ID of the HarvestJob. The ID must be unique within the region and it cannot be changed after the
     *        HarvestJob is submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HarvestJob withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The ID of the OriginEndpoint that the HarvestJob will harvest from. This cannot be changed after the HarvestJob
     * is submitted.
     * 
     * @param originEndpointId
     *        The ID of the OriginEndpoint that the HarvestJob will harvest from. This cannot be changed after the
     *        HarvestJob is submitted.
     */

    public void setOriginEndpointId(String originEndpointId) {
        this.originEndpointId = originEndpointId;
    }

    /**
     * The ID of the OriginEndpoint that the HarvestJob will harvest from. This cannot be changed after the HarvestJob
     * is submitted.
     * 
     * @return The ID of the OriginEndpoint that the HarvestJob will harvest from. This cannot be changed after the
     *         HarvestJob is submitted.
     */

    public String getOriginEndpointId() {
        return this.originEndpointId;
    }

    /**
     * The ID of the OriginEndpoint that the HarvestJob will harvest from. This cannot be changed after the HarvestJob
     * is submitted.
     * 
     * @param originEndpointId
     *        The ID of the OriginEndpoint that the HarvestJob will harvest from. This cannot be changed after the
     *        HarvestJob is submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HarvestJob withOriginEndpointId(String originEndpointId) {
        setOriginEndpointId(originEndpointId);
        return this;
    }

    /**
     * @param s3Destination
     */

    public void setS3Destination(S3Destination s3Destination) {
        this.s3Destination = s3Destination;
    }

    /**
     * @return
     */

    public S3Destination getS3Destination() {
        return this.s3Destination;
    }

    /**
     * @param s3Destination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HarvestJob withS3Destination(S3Destination s3Destination) {
        setS3Destination(s3Destination);
        return this;
    }

    /**
     * The start of the time-window which will be harvested.
     * 
     * @param startTime
     *        The start of the time-window which will be harvested.
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * The start of the time-window which will be harvested.
     * 
     * @return The start of the time-window which will be harvested.
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * The start of the time-window which will be harvested.
     * 
     * @param startTime
     *        The start of the time-window which will be harvested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HarvestJob withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * The current status of the HarvestJob. Consider setting up a CloudWatch Event to listen for HarvestJobs as they
     * succeed or fail. In the event of failure, the CloudWatch Event will include an explanation of why the HarvestJob
     * failed.
     * 
     * @param status
     *        The current status of the HarvestJob. Consider setting up a CloudWatch Event to listen for HarvestJobs as
     *        they succeed or fail. In the event of failure, the CloudWatch Event will include an explanation of why the
     *        HarvestJob failed.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The current status of the HarvestJob. Consider setting up a CloudWatch Event to listen for HarvestJobs as they
     * succeed or fail. In the event of failure, the CloudWatch Event will include an explanation of why the HarvestJob
     * failed.
     * 
     * @return The current status of the HarvestJob. Consider setting up a CloudWatch Event to listen for HarvestJobs as
     *         they succeed or fail. In the event of failure, the CloudWatch Event will include an explanation of why
     *         the HarvestJob failed.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * The current status of the HarvestJob. Consider setting up a CloudWatch Event to listen for HarvestJobs as they
     * succeed or fail. In the event of failure, the CloudWatch Event will include an explanation of why the HarvestJob
     * failed.
     * 
     * @param status
     *        The current status of the HarvestJob. Consider setting up a CloudWatch Event to listen for HarvestJobs as
     *        they succeed or fail. In the event of failure, the CloudWatch Event will include an explanation of why the
     *        HarvestJob failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public HarvestJob withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * The current status of the HarvestJob. Consider setting up a CloudWatch Event to listen for HarvestJobs as they
     * succeed or fail. In the event of failure, the CloudWatch Event will include an explanation of why the HarvestJob
     * failed.
     * 
     * @param status
     *        The current status of the HarvestJob. Consider setting up a CloudWatch Event to listen for HarvestJobs as
     *        they succeed or fail. In the event of failure, the CloudWatch Event will include an explanation of why the
     *        HarvestJob failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public HarvestJob withStatus(Status status) {
        this.status = status.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getChannelId() != null)
            sb.append("ChannelId: ").append(getChannelId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getOriginEndpointId() != null)
            sb.append("OriginEndpointId: ").append(getOriginEndpointId()).append(",");
        if (getS3Destination() != null)
            sb.append("S3Destination: ").append(getS3Destination()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HarvestJob == false)
            return false;
        HarvestJob other = (HarvestJob) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getOriginEndpointId() == null ^ this.getOriginEndpointId() == null)
            return false;
        if (other.getOriginEndpointId() != null && other.getOriginEndpointId().equals(this.getOriginEndpointId()) == false)
            return false;
        if (other.getS3Destination() == null ^ this.getS3Destination() == null)
            return false;
        if (other.getS3Destination() != null && other.getS3Destination().equals(this.getS3Destination()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getOriginEndpointId() == null) ? 0 : getOriginEndpointId().hashCode());
        hashCode = prime * hashCode + ((getS3Destination() == null) ? 0 : getS3Destination().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public HarvestJob clone() {
        try {
            return (HarvestJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackage.model.transform.HarvestJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
