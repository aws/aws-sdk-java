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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreateQueue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateQueueRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Optional. A description of the queue that you are creating. */
    private String description;
    /** The name of the queue that you are creating. */
    private String name;
    /**
     * Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute,
     * billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue,
     * regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment. When you use the
     * API to create a queue, the default is on-demand.
     */
    private String pricingPlan;
    /**
     * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to
     * on-demand queues.
     */
    private ReservationPlanSettings reservationPlanSettings;
    /** The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key. */
    private java.util.Map<String, String> tags;

    /**
     * Optional. A description of the queue that you are creating.
     * 
     * @param description
     *        Optional. A description of the queue that you are creating.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Optional. A description of the queue that you are creating.
     * 
     * @return Optional. A description of the queue that you are creating.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * Optional. A description of the queue that you are creating.
     * 
     * @param description
     *        Optional. A description of the queue that you are creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The name of the queue that you are creating.
     * 
     * @param name
     *        The name of the queue that you are creating.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the queue that you are creating.
     * 
     * @return The name of the queue that you are creating.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the queue that you are creating.
     * 
     * @param name
     *        The name of the queue that you are creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute,
     * billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue,
     * regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment. When you use the
     * API to create a queue, the default is on-demand.
     * 
     * @param pricingPlan
     *        Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per
     *        minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the
     *        entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month
     *        commitment. When you use the API to create a queue, the default is on-demand.
     * @see PricingPlan
     */

    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    /**
     * Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute,
     * billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue,
     * regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment. When you use the
     * API to create a queue, the default is on-demand.
     * 
     * @return Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per
     *         minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the
     *         entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month
     *         commitment. When you use the API to create a queue, the default is on-demand.
     * @see PricingPlan
     */

    public String getPricingPlan() {
        return this.pricingPlan;
    }

    /**
     * Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute,
     * billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue,
     * regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment. When you use the
     * API to create a queue, the default is on-demand.
     * 
     * @param pricingPlan
     *        Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per
     *        minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the
     *        entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month
     *        commitment. When you use the API to create a queue, the default is on-demand.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public CreateQueueRequest withPricingPlan(String pricingPlan) {
        setPricingPlan(pricingPlan);
        return this;
    }

    /**
     * Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute,
     * billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue,
     * regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment. When you use the
     * API to create a queue, the default is on-demand.
     * 
     * @param pricingPlan
     *        Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per
     *        minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the
     *        entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month
     *        commitment. When you use the API to create a queue, the default is on-demand.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public CreateQueueRequest withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to
     * on-demand queues.
     * 
     * @param reservationPlanSettings
     *        Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to
     *        on-demand queues.
     */

    public void setReservationPlanSettings(ReservationPlanSettings reservationPlanSettings) {
        this.reservationPlanSettings = reservationPlanSettings;
    }

    /**
     * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to
     * on-demand queues.
     * 
     * @return Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable
     *         to on-demand queues.
     */

    public ReservationPlanSettings getReservationPlanSettings() {
        return this.reservationPlanSettings;
    }

    /**
     * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to
     * on-demand queues.
     * 
     * @param reservationPlanSettings
     *        Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to
     *        on-demand queues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest withReservationPlanSettings(ReservationPlanSettings reservationPlanSettings) {
        setReservationPlanSettings(reservationPlanSettings);
        return this;
    }

    /**
     * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
     * 
     * @return The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a
     *         key.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
     * 
     * @param tags
     *        The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a
     *        key.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
     * 
     * @param tags
     *        The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a
     *        key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateQueueRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
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

    public CreateQueueRequest clearTagsEntries() {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: ").append(getPricingPlan()).append(",");
        if (getReservationPlanSettings() != null)
            sb.append("ReservationPlanSettings: ").append(getReservationPlanSettings()).append(",");
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

        if (obj instanceof CreateQueueRequest == false)
            return false;
        CreateQueueRequest other = (CreateQueueRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPricingPlan() == null ^ this.getPricingPlan() == null)
            return false;
        if (other.getPricingPlan() != null && other.getPricingPlan().equals(this.getPricingPlan()) == false)
            return false;
        if (other.getReservationPlanSettings() == null ^ this.getReservationPlanSettings() == null)
            return false;
        if (other.getReservationPlanSettings() != null && other.getReservationPlanSettings().equals(this.getReservationPlanSettings()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime * hashCode + ((getReservationPlanSettings() == null) ? 0 : getReservationPlanSettings().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateQueueRequest clone() {
        return (CreateQueueRequest) super.clone();
    }

}
