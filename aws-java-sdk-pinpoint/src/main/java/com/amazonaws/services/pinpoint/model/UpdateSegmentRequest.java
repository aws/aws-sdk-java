/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateSegment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSegmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     */
    private String segmentId;

    private WriteSegmentRequest writeSegmentRequest;

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *        Amazon Pinpoint console.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @return The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *         Amazon Pinpoint console.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *        Amazon Pinpoint console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSegmentRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     * 
     * @param segmentId
     *        The unique identifier for the segment.
     */

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     * 
     * @return The unique identifier for the segment.
     */

    public String getSegmentId() {
        return this.segmentId;
    }

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     * 
     * @param segmentId
     *        The unique identifier for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSegmentRequest withSegmentId(String segmentId) {
        setSegmentId(segmentId);
        return this;
    }

    /**
     * @param writeSegmentRequest
     */

    public void setWriteSegmentRequest(WriteSegmentRequest writeSegmentRequest) {
        this.writeSegmentRequest = writeSegmentRequest;
    }

    /**
     * @return
     */

    public WriteSegmentRequest getWriteSegmentRequest() {
        return this.writeSegmentRequest;
    }

    /**
     * @param writeSegmentRequest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSegmentRequest withWriteSegmentRequest(WriteSegmentRequest writeSegmentRequest) {
        setWriteSegmentRequest(writeSegmentRequest);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getSegmentId() != null)
            sb.append("SegmentId: ").append(getSegmentId()).append(",");
        if (getWriteSegmentRequest() != null)
            sb.append("WriteSegmentRequest: ").append(getWriteSegmentRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSegmentRequest == false)
            return false;
        UpdateSegmentRequest other = (UpdateSegmentRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getSegmentId() == null ^ this.getSegmentId() == null)
            return false;
        if (other.getSegmentId() != null && other.getSegmentId().equals(this.getSegmentId()) == false)
            return false;
        if (other.getWriteSegmentRequest() == null ^ this.getWriteSegmentRequest() == null)
            return false;
        if (other.getWriteSegmentRequest() != null && other.getWriteSegmentRequest().equals(this.getWriteSegmentRequest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getSegmentId() == null) ? 0 : getSegmentId().hashCode());
        hashCode = prime * hashCode + ((getWriteSegmentRequest() == null) ? 0 : getWriteSegmentRequest().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSegmentRequest clone() {
        return (UpdateSegmentRequest) super.clone();
    }

}
