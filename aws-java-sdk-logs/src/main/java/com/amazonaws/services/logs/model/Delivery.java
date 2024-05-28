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
 * This structure contains information about one <i>delivery</i> in your account.
 * </p>
 * <p>
 * A delivery is a connection between a logical <i>delivery source</i> and a logical <i>delivery destination</i>.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_CreateDelivery.html"
 * >CreateDelivery</a>.
 * </p>
 * <p>
 * You can't update an existing delivery. You can only create and delete deliveries.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/Delivery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Delivery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID that identifies this delivery in your account.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies this delivery.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the delivery source that is associated with this delivery.
     * </p>
     */
    private String deliverySourceName;
    /**
     * <p>
     * The ARN of the delivery destination that is associated with this delivery.
     * </p>
     */
    private String deliveryDestinationArn;
    /**
     * <p>
     * Displays whether the delivery destination associated with this delivery is CloudWatch Logs, Amazon S3, or
     * Firehose.
     * </p>
     */
    private String deliveryDestinationType;
    /**
     * <p>
     * The tags that have been assigned to this delivery.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> tags;

    /**
     * <p>
     * The unique ID that identifies this delivery in your account.
     * </p>
     * 
     * @param id
     *        The unique ID that identifies this delivery in your account.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID that identifies this delivery in your account.
     * </p>
     * 
     * @return The unique ID that identifies this delivery in your account.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID that identifies this delivery in your account.
     * </p>
     * 
     * @param id
     *        The unique ID that identifies this delivery in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Delivery withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies this delivery.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that uniquely identifies this delivery.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies this delivery.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that uniquely identifies this delivery.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies this delivery.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) that uniquely identifies this delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Delivery withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the delivery source that is associated with this delivery.
     * </p>
     * 
     * @param deliverySourceName
     *        The name of the delivery source that is associated with this delivery.
     */

    public void setDeliverySourceName(String deliverySourceName) {
        this.deliverySourceName = deliverySourceName;
    }

    /**
     * <p>
     * The name of the delivery source that is associated with this delivery.
     * </p>
     * 
     * @return The name of the delivery source that is associated with this delivery.
     */

    public String getDeliverySourceName() {
        return this.deliverySourceName;
    }

    /**
     * <p>
     * The name of the delivery source that is associated with this delivery.
     * </p>
     * 
     * @param deliverySourceName
     *        The name of the delivery source that is associated with this delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Delivery withDeliverySourceName(String deliverySourceName) {
        setDeliverySourceName(deliverySourceName);
        return this;
    }

    /**
     * <p>
     * The ARN of the delivery destination that is associated with this delivery.
     * </p>
     * 
     * @param deliveryDestinationArn
     *        The ARN of the delivery destination that is associated with this delivery.
     */

    public void setDeliveryDestinationArn(String deliveryDestinationArn) {
        this.deliveryDestinationArn = deliveryDestinationArn;
    }

    /**
     * <p>
     * The ARN of the delivery destination that is associated with this delivery.
     * </p>
     * 
     * @return The ARN of the delivery destination that is associated with this delivery.
     */

    public String getDeliveryDestinationArn() {
        return this.deliveryDestinationArn;
    }

    /**
     * <p>
     * The ARN of the delivery destination that is associated with this delivery.
     * </p>
     * 
     * @param deliveryDestinationArn
     *        The ARN of the delivery destination that is associated with this delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Delivery withDeliveryDestinationArn(String deliveryDestinationArn) {
        setDeliveryDestinationArn(deliveryDestinationArn);
        return this;
    }

    /**
     * <p>
     * Displays whether the delivery destination associated with this delivery is CloudWatch Logs, Amazon S3, or
     * Firehose.
     * </p>
     * 
     * @param deliveryDestinationType
     *        Displays whether the delivery destination associated with this delivery is CloudWatch Logs, Amazon S3, or
     *        Firehose.
     * @see DeliveryDestinationType
     */

    public void setDeliveryDestinationType(String deliveryDestinationType) {
        this.deliveryDestinationType = deliveryDestinationType;
    }

    /**
     * <p>
     * Displays whether the delivery destination associated with this delivery is CloudWatch Logs, Amazon S3, or
     * Firehose.
     * </p>
     * 
     * @return Displays whether the delivery destination associated with this delivery is CloudWatch Logs, Amazon S3, or
     *         Firehose.
     * @see DeliveryDestinationType
     */

    public String getDeliveryDestinationType() {
        return this.deliveryDestinationType;
    }

    /**
     * <p>
     * Displays whether the delivery destination associated with this delivery is CloudWatch Logs, Amazon S3, or
     * Firehose.
     * </p>
     * 
     * @param deliveryDestinationType
     *        Displays whether the delivery destination associated with this delivery is CloudWatch Logs, Amazon S3, or
     *        Firehose.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryDestinationType
     */

    public Delivery withDeliveryDestinationType(String deliveryDestinationType) {
        setDeliveryDestinationType(deliveryDestinationType);
        return this;
    }

    /**
     * <p>
     * Displays whether the delivery destination associated with this delivery is CloudWatch Logs, Amazon S3, or
     * Firehose.
     * </p>
     * 
     * @param deliveryDestinationType
     *        Displays whether the delivery destination associated with this delivery is CloudWatch Logs, Amazon S3, or
     *        Firehose.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryDestinationType
     */

    public Delivery withDeliveryDestinationType(DeliveryDestinationType deliveryDestinationType) {
        this.deliveryDestinationType = deliveryDestinationType.toString();
        return this;
    }

    /**
     * <p>
     * The tags that have been assigned to this delivery.
     * </p>
     * 
     * @return The tags that have been assigned to this delivery.
     */

    public java.util.Map<String, String> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags that have been assigned to this delivery.
     * </p>
     * 
     * @param tags
     *        The tags that have been assigned to this delivery.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(tags);
    }

    /**
     * <p>
     * The tags that have been assigned to this delivery.
     * </p>
     * 
     * @param tags
     *        The tags that have been assigned to this delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Delivery withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Delivery#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Delivery addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Delivery clearTagsEntries() {
        this.tags = null;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDeliverySourceName() != null)
            sb.append("DeliverySourceName: ").append(getDeliverySourceName()).append(",");
        if (getDeliveryDestinationArn() != null)
            sb.append("DeliveryDestinationArn: ").append(getDeliveryDestinationArn()).append(",");
        if (getDeliveryDestinationType() != null)
            sb.append("DeliveryDestinationType: ").append(getDeliveryDestinationType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Delivery == false)
            return false;
        Delivery other = (Delivery) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDeliverySourceName() == null ^ this.getDeliverySourceName() == null)
            return false;
        if (other.getDeliverySourceName() != null && other.getDeliverySourceName().equals(this.getDeliverySourceName()) == false)
            return false;
        if (other.getDeliveryDestinationArn() == null ^ this.getDeliveryDestinationArn() == null)
            return false;
        if (other.getDeliveryDestinationArn() != null && other.getDeliveryDestinationArn().equals(this.getDeliveryDestinationArn()) == false)
            return false;
        if (other.getDeliveryDestinationType() == null ^ this.getDeliveryDestinationType() == null)
            return false;
        if (other.getDeliveryDestinationType() != null && other.getDeliveryDestinationType().equals(this.getDeliveryDestinationType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDeliverySourceName() == null) ? 0 : getDeliverySourceName().hashCode());
        hashCode = prime * hashCode + ((getDeliveryDestinationArn() == null) ? 0 : getDeliveryDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getDeliveryDestinationType() == null) ? 0 : getDeliveryDestinationType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Delivery clone() {
        try {
            return (Delivery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.DeliveryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
