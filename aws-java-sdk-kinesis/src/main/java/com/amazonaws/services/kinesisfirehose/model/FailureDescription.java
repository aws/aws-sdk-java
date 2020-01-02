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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details in case one of the following operations fails due to an error related to KMS:
 * <a>CreateDeliveryStream</a>, <a>DeleteDeliveryStream</a>, <a>StartDeliveryStreamEncryption</a>,
 * <a>StopDeliveryStreamEncryption</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/FailureDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailureDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of error that caused the failure.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A message providing details about the error that caused the failure.
     * </p>
     */
    private String details;

    /**
     * <p>
     * The type of error that caused the failure.
     * </p>
     * 
     * @param type
     *        The type of error that caused the failure.
     * @see DeliveryStreamFailureType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of error that caused the failure.
     * </p>
     * 
     * @return The type of error that caused the failure.
     * @see DeliveryStreamFailureType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of error that caused the failure.
     * </p>
     * 
     * @param type
     *        The type of error that caused the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStreamFailureType
     */

    public FailureDescription withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of error that caused the failure.
     * </p>
     * 
     * @param type
     *        The type of error that caused the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStreamFailureType
     */

    public FailureDescription withType(DeliveryStreamFailureType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A message providing details about the error that caused the failure.
     * </p>
     * 
     * @param details
     *        A message providing details about the error that caused the failure.
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * A message providing details about the error that caused the failure.
     * </p>
     * 
     * @return A message providing details about the error that caused the failure.
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * A message providing details about the error that caused the failure.
     * </p>
     * 
     * @param details
     *        A message providing details about the error that caused the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureDescription withDetails(String details) {
        setDetails(details);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailureDescription == false)
            return false;
        FailureDescription other = (FailureDescription) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public FailureDescription clone() {
        try {
            return (FailureDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.FailureDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
