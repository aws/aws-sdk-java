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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreatePublishingDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePublishingDestinationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the GuardDuty detector associated with the publishing destination.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * The type of resource for the publishing destination. Currently only S3 is supported.
     * </p>
     */
    private String destinationType;
    /**
     * <p>
     * Properties of the publishing destination, including the ARNs for the destination and the KMS key used for
     * encryption.
     * </p>
     */
    private DestinationProperties destinationProperties;
    /**
     * <p>
     * The idempotency token for the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the GuardDuty detector associated with the publishing destination.
     * </p>
     * 
     * @param detectorId
     *        The ID of the GuardDuty detector associated with the publishing destination.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID of the GuardDuty detector associated with the publishing destination.
     * </p>
     * 
     * @return The ID of the GuardDuty detector associated with the publishing destination.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The ID of the GuardDuty detector associated with the publishing destination.
     * </p>
     * 
     * @param detectorId
     *        The ID of the GuardDuty detector associated with the publishing destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePublishingDestinationRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * The type of resource for the publishing destination. Currently only S3 is supported.
     * </p>
     * 
     * @param destinationType
     *        The type of resource for the publishing destination. Currently only S3 is supported.
     * @see DestinationType
     */

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    /**
     * <p>
     * The type of resource for the publishing destination. Currently only S3 is supported.
     * </p>
     * 
     * @return The type of resource for the publishing destination. Currently only S3 is supported.
     * @see DestinationType
     */

    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * <p>
     * The type of resource for the publishing destination. Currently only S3 is supported.
     * </p>
     * 
     * @param destinationType
     *        The type of resource for the publishing destination. Currently only S3 is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationType
     */

    public CreatePublishingDestinationRequest withDestinationType(String destinationType) {
        setDestinationType(destinationType);
        return this;
    }

    /**
     * <p>
     * The type of resource for the publishing destination. Currently only S3 is supported.
     * </p>
     * 
     * @param destinationType
     *        The type of resource for the publishing destination. Currently only S3 is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationType
     */

    public CreatePublishingDestinationRequest withDestinationType(DestinationType destinationType) {
        this.destinationType = destinationType.toString();
        return this;
    }

    /**
     * <p>
     * Properties of the publishing destination, including the ARNs for the destination and the KMS key used for
     * encryption.
     * </p>
     * 
     * @param destinationProperties
     *        Properties of the publishing destination, including the ARNs for the destination and the KMS key used for
     *        encryption.
     */

    public void setDestinationProperties(DestinationProperties destinationProperties) {
        this.destinationProperties = destinationProperties;
    }

    /**
     * <p>
     * Properties of the publishing destination, including the ARNs for the destination and the KMS key used for
     * encryption.
     * </p>
     * 
     * @return Properties of the publishing destination, including the ARNs for the destination and the KMS key used for
     *         encryption.
     */

    public DestinationProperties getDestinationProperties() {
        return this.destinationProperties;
    }

    /**
     * <p>
     * Properties of the publishing destination, including the ARNs for the destination and the KMS key used for
     * encryption.
     * </p>
     * 
     * @param destinationProperties
     *        Properties of the publishing destination, including the ARNs for the destination and the KMS key used for
     *        encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePublishingDestinationRequest withDestinationProperties(DestinationProperties destinationProperties) {
        setDestinationProperties(destinationProperties);
        return this;
    }

    /**
     * <p>
     * The idempotency token for the request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token for the request.
     * </p>
     * 
     * @return The idempotency token for the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token for the request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePublishingDestinationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getDestinationType() != null)
            sb.append("DestinationType: ").append(getDestinationType()).append(",");
        if (getDestinationProperties() != null)
            sb.append("DestinationProperties: ").append(getDestinationProperties()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePublishingDestinationRequest == false)
            return false;
        CreatePublishingDestinationRequest other = (CreatePublishingDestinationRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getDestinationType() == null ^ this.getDestinationType() == null)
            return false;
        if (other.getDestinationType() != null && other.getDestinationType().equals(this.getDestinationType()) == false)
            return false;
        if (other.getDestinationProperties() == null ^ this.getDestinationProperties() == null)
            return false;
        if (other.getDestinationProperties() != null && other.getDestinationProperties().equals(this.getDestinationProperties()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getDestinationType() == null) ? 0 : getDestinationType().hashCode());
        hashCode = prime * hashCode + ((getDestinationProperties() == null) ? 0 : getDestinationProperties().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreatePublishingDestinationRequest clone() {
        return (CreatePublishingDestinationRequest) super.clone();
    }

}
