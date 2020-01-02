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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/StartDeliveryStreamEncryption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDeliveryStreamEncryptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the delivery stream for which you want to enable server-side encryption (SSE).
     * </p>
     */
    private String deliveryStreamName;
    /**
     * <p>
     * Used to specify the type and Amazon Resource Name (ARN) of the KMS key needed for Server-Side Encryption (SSE).
     * </p>
     */
    private DeliveryStreamEncryptionConfigurationInput deliveryStreamEncryptionConfigurationInput;

    /**
     * <p>
     * The name of the delivery stream for which you want to enable server-side encryption (SSE).
     * </p>
     * 
     * @param deliveryStreamName
     *        The name of the delivery stream for which you want to enable server-side encryption (SSE).
     */

    public void setDeliveryStreamName(String deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
    }

    /**
     * <p>
     * The name of the delivery stream for which you want to enable server-side encryption (SSE).
     * </p>
     * 
     * @return The name of the delivery stream for which you want to enable server-side encryption (SSE).
     */

    public String getDeliveryStreamName() {
        return this.deliveryStreamName;
    }

    /**
     * <p>
     * The name of the delivery stream for which you want to enable server-side encryption (SSE).
     * </p>
     * 
     * @param deliveryStreamName
     *        The name of the delivery stream for which you want to enable server-side encryption (SSE).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeliveryStreamEncryptionRequest withDeliveryStreamName(String deliveryStreamName) {
        setDeliveryStreamName(deliveryStreamName);
        return this;
    }

    /**
     * <p>
     * Used to specify the type and Amazon Resource Name (ARN) of the KMS key needed for Server-Side Encryption (SSE).
     * </p>
     * 
     * @param deliveryStreamEncryptionConfigurationInput
     *        Used to specify the type and Amazon Resource Name (ARN) of the KMS key needed for Server-Side Encryption
     *        (SSE).
     */

    public void setDeliveryStreamEncryptionConfigurationInput(DeliveryStreamEncryptionConfigurationInput deliveryStreamEncryptionConfigurationInput) {
        this.deliveryStreamEncryptionConfigurationInput = deliveryStreamEncryptionConfigurationInput;
    }

    /**
     * <p>
     * Used to specify the type and Amazon Resource Name (ARN) of the KMS key needed for Server-Side Encryption (SSE).
     * </p>
     * 
     * @return Used to specify the type and Amazon Resource Name (ARN) of the KMS key needed for Server-Side Encryption
     *         (SSE).
     */

    public DeliveryStreamEncryptionConfigurationInput getDeliveryStreamEncryptionConfigurationInput() {
        return this.deliveryStreamEncryptionConfigurationInput;
    }

    /**
     * <p>
     * Used to specify the type and Amazon Resource Name (ARN) of the KMS key needed for Server-Side Encryption (SSE).
     * </p>
     * 
     * @param deliveryStreamEncryptionConfigurationInput
     *        Used to specify the type and Amazon Resource Name (ARN) of the KMS key needed for Server-Side Encryption
     *        (SSE).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeliveryStreamEncryptionRequest withDeliveryStreamEncryptionConfigurationInput(
            DeliveryStreamEncryptionConfigurationInput deliveryStreamEncryptionConfigurationInput) {
        setDeliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput);
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
        if (getDeliveryStreamName() != null)
            sb.append("DeliveryStreamName: ").append(getDeliveryStreamName()).append(",");
        if (getDeliveryStreamEncryptionConfigurationInput() != null)
            sb.append("DeliveryStreamEncryptionConfigurationInput: ").append(getDeliveryStreamEncryptionConfigurationInput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDeliveryStreamEncryptionRequest == false)
            return false;
        StartDeliveryStreamEncryptionRequest other = (StartDeliveryStreamEncryptionRequest) obj;
        if (other.getDeliveryStreamName() == null ^ this.getDeliveryStreamName() == null)
            return false;
        if (other.getDeliveryStreamName() != null && other.getDeliveryStreamName().equals(this.getDeliveryStreamName()) == false)
            return false;
        if (other.getDeliveryStreamEncryptionConfigurationInput() == null ^ this.getDeliveryStreamEncryptionConfigurationInput() == null)
            return false;
        if (other.getDeliveryStreamEncryptionConfigurationInput() != null
                && other.getDeliveryStreamEncryptionConfigurationInput().equals(this.getDeliveryStreamEncryptionConfigurationInput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryStreamName() == null) ? 0 : getDeliveryStreamName().hashCode());
        hashCode = prime * hashCode
                + ((getDeliveryStreamEncryptionConfigurationInput() == null) ? 0 : getDeliveryStreamEncryptionConfigurationInput().hashCode());
        return hashCode;
    }

    @Override
    public StartDeliveryStreamEncryptionRequest clone() {
        return (StartDeliveryStreamEncryptionRequest) super.clone();
    }

}
