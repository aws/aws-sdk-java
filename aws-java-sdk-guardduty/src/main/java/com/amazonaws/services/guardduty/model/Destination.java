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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a publishing destination, including the ID, type, and status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/Destination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Destination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the publishing destination.
     * </p>
     */
    private String destinationId;
    /**
     * <p>
     * The type of resource used for the publishing destination. Currently, only S3 is supported.
     * </p>
     */
    private String destinationType;
    /**
     * <p>
     * The status of the publishing destination.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The unique ID of the publishing destination.
     * </p>
     * 
     * @param destinationId
     *        The unique ID of the publishing destination.
     */

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    /**
     * <p>
     * The unique ID of the publishing destination.
     * </p>
     * 
     * @return The unique ID of the publishing destination.
     */

    public String getDestinationId() {
        return this.destinationId;
    }

    /**
     * <p>
     * The unique ID of the publishing destination.
     * </p>
     * 
     * @param destinationId
     *        The unique ID of the publishing destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withDestinationId(String destinationId) {
        setDestinationId(destinationId);
        return this;
    }

    /**
     * <p>
     * The type of resource used for the publishing destination. Currently, only S3 is supported.
     * </p>
     * 
     * @param destinationType
     *        The type of resource used for the publishing destination. Currently, only S3 is supported.
     * @see DestinationType
     */

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    /**
     * <p>
     * The type of resource used for the publishing destination. Currently, only S3 is supported.
     * </p>
     * 
     * @return The type of resource used for the publishing destination. Currently, only S3 is supported.
     * @see DestinationType
     */

    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * <p>
     * The type of resource used for the publishing destination. Currently, only S3 is supported.
     * </p>
     * 
     * @param destinationType
     *        The type of resource used for the publishing destination. Currently, only S3 is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationType
     */

    public Destination withDestinationType(String destinationType) {
        setDestinationType(destinationType);
        return this;
    }

    /**
     * <p>
     * The type of resource used for the publishing destination. Currently, only S3 is supported.
     * </p>
     * 
     * @param destinationType
     *        The type of resource used for the publishing destination. Currently, only S3 is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationType
     */

    public Destination withDestinationType(DestinationType destinationType) {
        this.destinationType = destinationType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the publishing destination.
     * </p>
     * 
     * @param status
     *        The status of the publishing destination.
     * @see PublishingStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the publishing destination.
     * </p>
     * 
     * @return The status of the publishing destination.
     * @see PublishingStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the publishing destination.
     * </p>
     * 
     * @param status
     *        The status of the publishing destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PublishingStatus
     */

    public Destination withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the publishing destination.
     * </p>
     * 
     * @param status
     *        The status of the publishing destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PublishingStatus
     */

    public Destination withStatus(PublishingStatus status) {
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
        if (getDestinationId() != null)
            sb.append("DestinationId: ").append(getDestinationId()).append(",");
        if (getDestinationType() != null)
            sb.append("DestinationType: ").append(getDestinationType()).append(",");
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

        if (obj instanceof Destination == false)
            return false;
        Destination other = (Destination) obj;
        if (other.getDestinationId() == null ^ this.getDestinationId() == null)
            return false;
        if (other.getDestinationId() != null && other.getDestinationId().equals(this.getDestinationId()) == false)
            return false;
        if (other.getDestinationType() == null ^ this.getDestinationType() == null)
            return false;
        if (other.getDestinationType() != null && other.getDestinationType().equals(this.getDestinationType()) == false)
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

        hashCode = prime * hashCode + ((getDestinationId() == null) ? 0 : getDestinationId().hashCode());
        hashCode = prime * hashCode + ((getDestinationType() == null) ? 0 : getDestinationType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public Destination clone() {
        try {
            return (Destination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.DestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
