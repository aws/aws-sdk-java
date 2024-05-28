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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains information about one logs delivery destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeliveryDestinationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeliveryDestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the Amazon Web Services destination that this delivery destination represents. That Amazon Web
     * Services destination can be a log group in CloudWatch Logs, an Amazon S3 bucket, or a delivery stream in
     * Firehose.
     * </p>
     */
    private String destinationResourceArn;

    /**
     * <p>
     * The ARN of the Amazon Web Services destination that this delivery destination represents. That Amazon Web
     * Services destination can be a log group in CloudWatch Logs, an Amazon S3 bucket, or a delivery stream in
     * Firehose.
     * </p>
     * 
     * @param destinationResourceArn
     *        The ARN of the Amazon Web Services destination that this delivery destination represents. That Amazon Web
     *        Services destination can be a log group in CloudWatch Logs, an Amazon S3 bucket, or a delivery stream in
     *        Firehose.
     */

    public void setDestinationResourceArn(String destinationResourceArn) {
        this.destinationResourceArn = destinationResourceArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Web Services destination that this delivery destination represents. That Amazon Web
     * Services destination can be a log group in CloudWatch Logs, an Amazon S3 bucket, or a delivery stream in
     * Firehose.
     * </p>
     * 
     * @return The ARN of the Amazon Web Services destination that this delivery destination represents. That Amazon Web
     *         Services destination can be a log group in CloudWatch Logs, an Amazon S3 bucket, or a delivery stream in
     *         Firehose.
     */

    public String getDestinationResourceArn() {
        return this.destinationResourceArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Web Services destination that this delivery destination represents. That Amazon Web
     * Services destination can be a log group in CloudWatch Logs, an Amazon S3 bucket, or a delivery stream in
     * Firehose.
     * </p>
     * 
     * @param destinationResourceArn
     *        The ARN of the Amazon Web Services destination that this delivery destination represents. That Amazon Web
     *        Services destination can be a log group in CloudWatch Logs, an Amazon S3 bucket, or a delivery stream in
     *        Firehose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryDestinationConfiguration withDestinationResourceArn(String destinationResourceArn) {
        setDestinationResourceArn(destinationResourceArn);
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
        if (getDestinationResourceArn() != null)
            sb.append("DestinationResourceArn: ").append(getDestinationResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeliveryDestinationConfiguration == false)
            return false;
        DeliveryDestinationConfiguration other = (DeliveryDestinationConfiguration) obj;
        if (other.getDestinationResourceArn() == null ^ this.getDestinationResourceArn() == null)
            return false;
        if (other.getDestinationResourceArn() != null && other.getDestinationResourceArn().equals(this.getDestinationResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationResourceArn() == null) ? 0 : getDestinationResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public DeliveryDestinationConfiguration clone() {
        try {
            return (DeliveryDestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.DeliveryDestinationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
