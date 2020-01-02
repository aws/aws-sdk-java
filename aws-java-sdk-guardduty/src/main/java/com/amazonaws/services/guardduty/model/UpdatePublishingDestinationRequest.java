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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdatePublishingDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePublishingDestinationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * The ID of the detector associated with the publishing destinations to update.
     * </p>
     */
    private String destinationId;
    /**
     * <p>
     * A <code>DestinationProperties</code> object that includes the <code>DestinationArn</code> and
     * <code>KmsKeyArn</code> of the publishing destination.
     * </p>
     */
    private DestinationProperties destinationProperties;

    /**
     * <p>
     * The ID of the
     * </p>
     * 
     * @param detectorId
     *        The ID of the
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID of the
     * </p>
     * 
     * @return The ID of the
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The ID of the
     * </p>
     * 
     * @param detectorId
     *        The ID of the
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePublishingDestinationRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * The ID of the detector associated with the publishing destinations to update.
     * </p>
     * 
     * @param destinationId
     *        The ID of the detector associated with the publishing destinations to update.
     */

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    /**
     * <p>
     * The ID of the detector associated with the publishing destinations to update.
     * </p>
     * 
     * @return The ID of the detector associated with the publishing destinations to update.
     */

    public String getDestinationId() {
        return this.destinationId;
    }

    /**
     * <p>
     * The ID of the detector associated with the publishing destinations to update.
     * </p>
     * 
     * @param destinationId
     *        The ID of the detector associated with the publishing destinations to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePublishingDestinationRequest withDestinationId(String destinationId) {
        setDestinationId(destinationId);
        return this;
    }

    /**
     * <p>
     * A <code>DestinationProperties</code> object that includes the <code>DestinationArn</code> and
     * <code>KmsKeyArn</code> of the publishing destination.
     * </p>
     * 
     * @param destinationProperties
     *        A <code>DestinationProperties</code> object that includes the <code>DestinationArn</code> and
     *        <code>KmsKeyArn</code> of the publishing destination.
     */

    public void setDestinationProperties(DestinationProperties destinationProperties) {
        this.destinationProperties = destinationProperties;
    }

    /**
     * <p>
     * A <code>DestinationProperties</code> object that includes the <code>DestinationArn</code> and
     * <code>KmsKeyArn</code> of the publishing destination.
     * </p>
     * 
     * @return A <code>DestinationProperties</code> object that includes the <code>DestinationArn</code> and
     *         <code>KmsKeyArn</code> of the publishing destination.
     */

    public DestinationProperties getDestinationProperties() {
        return this.destinationProperties;
    }

    /**
     * <p>
     * A <code>DestinationProperties</code> object that includes the <code>DestinationArn</code> and
     * <code>KmsKeyArn</code> of the publishing destination.
     * </p>
     * 
     * @param destinationProperties
     *        A <code>DestinationProperties</code> object that includes the <code>DestinationArn</code> and
     *        <code>KmsKeyArn</code> of the publishing destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePublishingDestinationRequest withDestinationProperties(DestinationProperties destinationProperties) {
        setDestinationProperties(destinationProperties);
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getDestinationId() != null)
            sb.append("DestinationId: ").append(getDestinationId()).append(",");
        if (getDestinationProperties() != null)
            sb.append("DestinationProperties: ").append(getDestinationProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePublishingDestinationRequest == false)
            return false;
        UpdatePublishingDestinationRequest other = (UpdatePublishingDestinationRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getDestinationId() == null ^ this.getDestinationId() == null)
            return false;
        if (other.getDestinationId() != null && other.getDestinationId().equals(this.getDestinationId()) == false)
            return false;
        if (other.getDestinationProperties() == null ^ this.getDestinationProperties() == null)
            return false;
        if (other.getDestinationProperties() != null && other.getDestinationProperties().equals(this.getDestinationProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getDestinationId() == null) ? 0 : getDestinationId().hashCode());
        hashCode = prime * hashCode + ((getDestinationProperties() == null) ? 0 : getDestinationProperties().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePublishingDestinationRequest clone() {
        return (UpdatePublishingDestinationRequest) super.clone();
    }

}
