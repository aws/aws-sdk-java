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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/DeleteDeliveryStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDeliveryStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     */
    private String deliveryStreamName;
    /**
     * <p>
     * Set this to true if you want to delete the delivery stream even if Kinesis Data Firehose is unable to retire the
     * grant for the CMK. Kinesis Data Firehose might be unable to retire the grant due to a customer error, such as
     * when the CMK or the grant are in an invalid state. If you force deletion, you can then use the <a
     * href="https://docs.aws.amazon.com/kms/latest/APIReference/API_RevokeGrant.html">RevokeGrant</a> operation to
     * revoke the grant you gave to Kinesis Data Firehose. If a failure to retire the grant happens due to an AWS KMS
     * issue, Kinesis Data Firehose keeps retrying the delete operation.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     */
    private Boolean allowForceDelete;

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamName
     *        The name of the delivery stream.
     */

    public void setDeliveryStreamName(String deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
    }

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     * 
     * @return The name of the delivery stream.
     */

    public String getDeliveryStreamName() {
        return this.deliveryStreamName;
    }

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamName
     *        The name of the delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDeliveryStreamRequest withDeliveryStreamName(String deliveryStreamName) {
        setDeliveryStreamName(deliveryStreamName);
        return this;
    }

    /**
     * <p>
     * Set this to true if you want to delete the delivery stream even if Kinesis Data Firehose is unable to retire the
     * grant for the CMK. Kinesis Data Firehose might be unable to retire the grant due to a customer error, such as
     * when the CMK or the grant are in an invalid state. If you force deletion, you can then use the <a
     * href="https://docs.aws.amazon.com/kms/latest/APIReference/API_RevokeGrant.html">RevokeGrant</a> operation to
     * revoke the grant you gave to Kinesis Data Firehose. If a failure to retire the grant happens due to an AWS KMS
     * issue, Kinesis Data Firehose keeps retrying the delete operation.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     * 
     * @param allowForceDelete
     *        Set this to true if you want to delete the delivery stream even if Kinesis Data Firehose is unable to
     *        retire the grant for the CMK. Kinesis Data Firehose might be unable to retire the grant due to a customer
     *        error, such as when the CMK or the grant are in an invalid state. If you force deletion, you can then use
     *        the <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_RevokeGrant.html">RevokeGrant</a>
     *        operation to revoke the grant you gave to Kinesis Data Firehose. If a failure to retire the grant happens
     *        due to an AWS KMS issue, Kinesis Data Firehose keeps retrying the delete operation.</p>
     *        <p>
     *        The default value is false.
     */

    public void setAllowForceDelete(Boolean allowForceDelete) {
        this.allowForceDelete = allowForceDelete;
    }

    /**
     * <p>
     * Set this to true if you want to delete the delivery stream even if Kinesis Data Firehose is unable to retire the
     * grant for the CMK. Kinesis Data Firehose might be unable to retire the grant due to a customer error, such as
     * when the CMK or the grant are in an invalid state. If you force deletion, you can then use the <a
     * href="https://docs.aws.amazon.com/kms/latest/APIReference/API_RevokeGrant.html">RevokeGrant</a> operation to
     * revoke the grant you gave to Kinesis Data Firehose. If a failure to retire the grant happens due to an AWS KMS
     * issue, Kinesis Data Firehose keeps retrying the delete operation.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     * 
     * @return Set this to true if you want to delete the delivery stream even if Kinesis Data Firehose is unable to
     *         retire the grant for the CMK. Kinesis Data Firehose might be unable to retire the grant due to a customer
     *         error, such as when the CMK or the grant are in an invalid state. If you force deletion, you can then use
     *         the <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_RevokeGrant.html">RevokeGrant</a>
     *         operation to revoke the grant you gave to Kinesis Data Firehose. If a failure to retire the grant happens
     *         due to an AWS KMS issue, Kinesis Data Firehose keeps retrying the delete operation.</p>
     *         <p>
     *         The default value is false.
     */

    public Boolean getAllowForceDelete() {
        return this.allowForceDelete;
    }

    /**
     * <p>
     * Set this to true if you want to delete the delivery stream even if Kinesis Data Firehose is unable to retire the
     * grant for the CMK. Kinesis Data Firehose might be unable to retire the grant due to a customer error, such as
     * when the CMK or the grant are in an invalid state. If you force deletion, you can then use the <a
     * href="https://docs.aws.amazon.com/kms/latest/APIReference/API_RevokeGrant.html">RevokeGrant</a> operation to
     * revoke the grant you gave to Kinesis Data Firehose. If a failure to retire the grant happens due to an AWS KMS
     * issue, Kinesis Data Firehose keeps retrying the delete operation.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     * 
     * @param allowForceDelete
     *        Set this to true if you want to delete the delivery stream even if Kinesis Data Firehose is unable to
     *        retire the grant for the CMK. Kinesis Data Firehose might be unable to retire the grant due to a customer
     *        error, such as when the CMK or the grant are in an invalid state. If you force deletion, you can then use
     *        the <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_RevokeGrant.html">RevokeGrant</a>
     *        operation to revoke the grant you gave to Kinesis Data Firehose. If a failure to retire the grant happens
     *        due to an AWS KMS issue, Kinesis Data Firehose keeps retrying the delete operation.</p>
     *        <p>
     *        The default value is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDeliveryStreamRequest withAllowForceDelete(Boolean allowForceDelete) {
        setAllowForceDelete(allowForceDelete);
        return this;
    }

    /**
     * <p>
     * Set this to true if you want to delete the delivery stream even if Kinesis Data Firehose is unable to retire the
     * grant for the CMK. Kinesis Data Firehose might be unable to retire the grant due to a customer error, such as
     * when the CMK or the grant are in an invalid state. If you force deletion, you can then use the <a
     * href="https://docs.aws.amazon.com/kms/latest/APIReference/API_RevokeGrant.html">RevokeGrant</a> operation to
     * revoke the grant you gave to Kinesis Data Firehose. If a failure to retire the grant happens due to an AWS KMS
     * issue, Kinesis Data Firehose keeps retrying the delete operation.
     * </p>
     * <p>
     * The default value is false.
     * </p>
     * 
     * @return Set this to true if you want to delete the delivery stream even if Kinesis Data Firehose is unable to
     *         retire the grant for the CMK. Kinesis Data Firehose might be unable to retire the grant due to a customer
     *         error, such as when the CMK or the grant are in an invalid state. If you force deletion, you can then use
     *         the <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_RevokeGrant.html">RevokeGrant</a>
     *         operation to revoke the grant you gave to Kinesis Data Firehose. If a failure to retire the grant happens
     *         due to an AWS KMS issue, Kinesis Data Firehose keeps retrying the delete operation.</p>
     *         <p>
     *         The default value is false.
     */

    public Boolean isAllowForceDelete() {
        return this.allowForceDelete;
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
        if (getAllowForceDelete() != null)
            sb.append("AllowForceDelete: ").append(getAllowForceDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDeliveryStreamRequest == false)
            return false;
        DeleteDeliveryStreamRequest other = (DeleteDeliveryStreamRequest) obj;
        if (other.getDeliveryStreamName() == null ^ this.getDeliveryStreamName() == null)
            return false;
        if (other.getDeliveryStreamName() != null && other.getDeliveryStreamName().equals(this.getDeliveryStreamName()) == false)
            return false;
        if (other.getAllowForceDelete() == null ^ this.getAllowForceDelete() == null)
            return false;
        if (other.getAllowForceDelete() != null && other.getAllowForceDelete().equals(this.getAllowForceDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryStreamName() == null) ? 0 : getDeliveryStreamName().hashCode());
        hashCode = prime * hashCode + ((getAllowForceDelete() == null) ? 0 : getAllowForceDelete().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDeliveryStreamRequest clone() {
        return (DeleteDeliveryStreamRequest) super.clone();
    }

}
