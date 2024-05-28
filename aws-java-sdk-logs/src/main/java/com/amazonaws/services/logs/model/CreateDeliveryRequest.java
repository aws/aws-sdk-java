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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CreateDelivery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeliveryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the delivery source to use for this delivery.
     * </p>
     */
    private String deliverySourceName;
    /**
     * <p>
     * The ARN of the delivery destination to use for this delivery.
     * </p>
     */
    private String deliveryDestinationArn;
    /**
     * <p>
     * An optional list of key-value pairs to associate with the resource.
     * </p>
     * <p>
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> tags;

    /**
     * <p>
     * The name of the delivery source to use for this delivery.
     * </p>
     * 
     * @param deliverySourceName
     *        The name of the delivery source to use for this delivery.
     */

    public void setDeliverySourceName(String deliverySourceName) {
        this.deliverySourceName = deliverySourceName;
    }

    /**
     * <p>
     * The name of the delivery source to use for this delivery.
     * </p>
     * 
     * @return The name of the delivery source to use for this delivery.
     */

    public String getDeliverySourceName() {
        return this.deliverySourceName;
    }

    /**
     * <p>
     * The name of the delivery source to use for this delivery.
     * </p>
     * 
     * @param deliverySourceName
     *        The name of the delivery source to use for this delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeliveryRequest withDeliverySourceName(String deliverySourceName) {
        setDeliverySourceName(deliverySourceName);
        return this;
    }

    /**
     * <p>
     * The ARN of the delivery destination to use for this delivery.
     * </p>
     * 
     * @param deliveryDestinationArn
     *        The ARN of the delivery destination to use for this delivery.
     */

    public void setDeliveryDestinationArn(String deliveryDestinationArn) {
        this.deliveryDestinationArn = deliveryDestinationArn;
    }

    /**
     * <p>
     * The ARN of the delivery destination to use for this delivery.
     * </p>
     * 
     * @return The ARN of the delivery destination to use for this delivery.
     */

    public String getDeliveryDestinationArn() {
        return this.deliveryDestinationArn;
    }

    /**
     * <p>
     * The ARN of the delivery destination to use for this delivery.
     * </p>
     * 
     * @param deliveryDestinationArn
     *        The ARN of the delivery destination to use for this delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeliveryRequest withDeliveryDestinationArn(String deliveryDestinationArn) {
        setDeliveryDestinationArn(deliveryDestinationArn);
        return this;
    }

    /**
     * <p>
     * An optional list of key-value pairs to associate with the resource.
     * </p>
     * <p>
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * </p>
     * 
     * @return An optional list of key-value pairs to associate with the resource.</p>
     *         <p>
     *         For more information about tagging, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         resources</a>
     */

    public java.util.Map<String, String> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return tags;
    }

    /**
     * <p>
     * An optional list of key-value pairs to associate with the resource.
     * </p>
     * <p>
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * </p>
     * 
     * @param tags
     *        An optional list of key-value pairs to associate with the resource.</p>
     *        <p>
     *        For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(tags);
    }

    /**
     * <p>
     * An optional list of key-value pairs to associate with the resource.
     * </p>
     * <p>
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * </p>
     * 
     * @param tags
     *        An optional list of key-value pairs to associate with the resource.</p>
     *        <p>
     *        For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeliveryRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateDeliveryRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeliveryRequest addTagsEntry(String key, String value) {
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

    public CreateDeliveryRequest clearTagsEntries() {
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
        if (getDeliverySourceName() != null)
            sb.append("DeliverySourceName: ").append(getDeliverySourceName()).append(",");
        if (getDeliveryDestinationArn() != null)
            sb.append("DeliveryDestinationArn: ").append(getDeliveryDestinationArn()).append(",");
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

        if (obj instanceof CreateDeliveryRequest == false)
            return false;
        CreateDeliveryRequest other = (CreateDeliveryRequest) obj;
        if (other.getDeliverySourceName() == null ^ this.getDeliverySourceName() == null)
            return false;
        if (other.getDeliverySourceName() != null && other.getDeliverySourceName().equals(this.getDeliverySourceName()) == false)
            return false;
        if (other.getDeliveryDestinationArn() == null ^ this.getDeliveryDestinationArn() == null)
            return false;
        if (other.getDeliveryDestinationArn() != null && other.getDeliveryDestinationArn().equals(this.getDeliveryDestinationArn()) == false)
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

        hashCode = prime * hashCode + ((getDeliverySourceName() == null) ? 0 : getDeliverySourceName().hashCode());
        hashCode = prime * hashCode + ((getDeliveryDestinationArn() == null) ? 0 : getDeliveryDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeliveryRequest clone() {
        return (CreateDeliveryRequest) super.clone();
    }

}
