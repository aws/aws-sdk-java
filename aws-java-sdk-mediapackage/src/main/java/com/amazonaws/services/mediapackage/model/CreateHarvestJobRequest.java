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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Configuration parameters used to create a new HarvestJob.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/CreateHarvestJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHarvestJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The end of the time-window which will be harvested
     */
    private String endTime;
    /**
     * The ID of the HarvestJob. The ID must be unique within the region and it cannot be changed after the HarvestJob
     * is submitted
     */
    private String id;
    /**
     * The ID of the OriginEndpoint that the HarvestJob will harvest from. This cannot be changed after the HarvestJob
     * is submitted.
     */
    private String originEndpointId;

    private S3Destination s3Destination;
    /**
     * The start of the time-window which will be harvested
     */
    private String startTime;

    /**
     * The end of the time-window which will be harvested
     * 
     * @param endTime
     *        The end of the time-window which will be harvested
     */

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * The end of the time-window which will be harvested
     * 
     * @return The end of the time-window which will be harvested
     */

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * The end of the time-window which will be harvested
     * 
     * @param endTime
     *        The end of the time-window which will be harvested
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHarvestJobRequest withEndTime(String endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * The ID of the HarvestJob. The ID must be unique within the region and it cannot be changed after the HarvestJob
     * is submitted
     * 
     * @param id
     *        The ID of the HarvestJob. The ID must be unique within the region and it cannot be changed after the
     *        HarvestJob is submitted
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The ID of the HarvestJob. The ID must be unique within the region and it cannot be changed after the HarvestJob
     * is submitted
     * 
     * @return The ID of the HarvestJob. The ID must be unique within the region and it cannot be changed after the
     *         HarvestJob is submitted
     */

    public String getId() {
        return this.id;
    }

    /**
     * The ID of the HarvestJob. The ID must be unique within the region and it cannot be changed after the HarvestJob
     * is submitted
     * 
     * @param id
     *        The ID of the HarvestJob. The ID must be unique within the region and it cannot be changed after the
     *        HarvestJob is submitted
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHarvestJobRequest withId(String id) {
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

    public CreateHarvestJobRequest withOriginEndpointId(String originEndpointId) {
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

    public CreateHarvestJobRequest withS3Destination(S3Destination s3Destination) {
        setS3Destination(s3Destination);
        return this;
    }

    /**
     * The start of the time-window which will be harvested
     * 
     * @param startTime
     *        The start of the time-window which will be harvested
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * The start of the time-window which will be harvested
     * 
     * @return The start of the time-window which will be harvested
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * The start of the time-window which will be harvested
     * 
     * @param startTime
     *        The start of the time-window which will be harvested
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHarvestJobRequest withStartTime(String startTime) {
        setStartTime(startTime);
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
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getOriginEndpointId() != null)
            sb.append("OriginEndpointId: ").append(getOriginEndpointId()).append(",");
        if (getS3Destination() != null)
            sb.append("S3Destination: ").append(getS3Destination()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHarvestJobRequest == false)
            return false;
        CreateHarvestJobRequest other = (CreateHarvestJobRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getOriginEndpointId() == null) ? 0 : getOriginEndpointId().hashCode());
        hashCode = prime * hashCode + ((getS3Destination() == null) ? 0 : getS3Destination().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public CreateHarvestJobRequest clone() {
        return (CreateHarvestJobRequest) super.clone();
    }

}
