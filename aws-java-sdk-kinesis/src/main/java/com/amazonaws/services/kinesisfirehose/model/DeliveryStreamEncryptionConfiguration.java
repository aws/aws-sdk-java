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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Indicates the server-side encryption (SSE) status for the delivery stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/DeliveryStreamEncryptionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeliveryStreamEncryptionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * For a full description of the different values of this status, see <a>StartDeliveryStreamEncryption</a> and
     * <a>StopDeliveryStreamEncryption</a>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * For a full description of the different values of this status, see <a>StartDeliveryStreamEncryption</a> and
     * <a>StopDeliveryStreamEncryption</a>.
     * </p>
     * 
     * @param status
     *        For a full description of the different values of this status, see <a>StartDeliveryStreamEncryption</a>
     *        and <a>StopDeliveryStreamEncryption</a>.
     * @see DeliveryStreamEncryptionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * For a full description of the different values of this status, see <a>StartDeliveryStreamEncryption</a> and
     * <a>StopDeliveryStreamEncryption</a>.
     * </p>
     * 
     * @return For a full description of the different values of this status, see <a>StartDeliveryStreamEncryption</a>
     *         and <a>StopDeliveryStreamEncryption</a>.
     * @see DeliveryStreamEncryptionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * For a full description of the different values of this status, see <a>StartDeliveryStreamEncryption</a> and
     * <a>StopDeliveryStreamEncryption</a>.
     * </p>
     * 
     * @param status
     *        For a full description of the different values of this status, see <a>StartDeliveryStreamEncryption</a>
     *        and <a>StopDeliveryStreamEncryption</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStreamEncryptionStatus
     */

    public DeliveryStreamEncryptionConfiguration withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * For a full description of the different values of this status, see <a>StartDeliveryStreamEncryption</a> and
     * <a>StopDeliveryStreamEncryption</a>.
     * </p>
     * 
     * @param status
     *        For a full description of the different values of this status, see <a>StartDeliveryStreamEncryption</a>
     *        and <a>StopDeliveryStreamEncryption</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStreamEncryptionStatus
     */

    public DeliveryStreamEncryptionConfiguration withStatus(DeliveryStreamEncryptionStatus status) {
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

        if (obj instanceof DeliveryStreamEncryptionConfiguration == false)
            return false;
        DeliveryStreamEncryptionConfiguration other = (DeliveryStreamEncryptionConfiguration) obj;
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

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeliveryStreamEncryptionConfiguration clone() {
        try {
            return (DeliveryStreamEncryptionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.DeliveryStreamEncryptionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
