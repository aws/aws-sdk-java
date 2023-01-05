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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes Amazon Kinesis Data Firehose logging options.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VerifiedAccessLogKinesisDataFirehoseDestinationOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifiedAccessLogKinesisDataFirehoseDestinationOptions implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether logging is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The ID of the delivery stream.
     * </p>
     */
    private String deliveryStream;

    /**
     * <p>
     * Indicates whether logging is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether logging is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether logging is enabled.
     * </p>
     * 
     * @return Indicates whether logging is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether logging is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether logging is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessLogKinesisDataFirehoseDestinationOptions withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether logging is enabled.
     * </p>
     * 
     * @return Indicates whether logging is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The ID of the delivery stream.
     * </p>
     * 
     * @param deliveryStream
     *        The ID of the delivery stream.
     */

    public void setDeliveryStream(String deliveryStream) {
        this.deliveryStream = deliveryStream;
    }

    /**
     * <p>
     * The ID of the delivery stream.
     * </p>
     * 
     * @return The ID of the delivery stream.
     */

    public String getDeliveryStream() {
        return this.deliveryStream;
    }

    /**
     * <p>
     * The ID of the delivery stream.
     * </p>
     * 
     * @param deliveryStream
     *        The ID of the delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessLogKinesisDataFirehoseDestinationOptions withDeliveryStream(String deliveryStream) {
        setDeliveryStream(deliveryStream);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getDeliveryStream() != null)
            sb.append("DeliveryStream: ").append(getDeliveryStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifiedAccessLogKinesisDataFirehoseDestinationOptions == false)
            return false;
        VerifiedAccessLogKinesisDataFirehoseDestinationOptions other = (VerifiedAccessLogKinesisDataFirehoseDestinationOptions) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getDeliveryStream() == null ^ this.getDeliveryStream() == null)
            return false;
        if (other.getDeliveryStream() != null && other.getDeliveryStream().equals(this.getDeliveryStream()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getDeliveryStream() == null) ? 0 : getDeliveryStream().hashCode());
        return hashCode;
    }

    @Override
    public VerifiedAccessLogKinesisDataFirehoseDestinationOptions clone() {
        try {
            return (VerifiedAccessLogKinesisDataFirehoseDestinationOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
