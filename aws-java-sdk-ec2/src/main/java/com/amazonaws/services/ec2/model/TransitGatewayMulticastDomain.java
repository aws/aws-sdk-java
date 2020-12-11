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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the transit gateway multicast domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayMulticastDomain" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayMulticastDomain implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     */
    private String transitGatewayMulticastDomainId;
    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     */
    private String transitGatewayId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transit gateway multicast domain.
     * </p>
     */
    private String transitGatewayMulticastDomainArn;
    /**
     * <p>
     * The ID of the AWS account that owns the transit gateway multiicast domain.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The options for the transit gateway multicast domain.
     * </p>
     */
    private TransitGatewayMulticastDomainOptions options;
    /**
     * <p>
     * The state of the transit gateway multicast domain.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The time the transit gateway multicast domain was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The tags for the transit gateway multicast domain.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     * 
     * @param transitGatewayMulticastDomainId
     *        The ID of the transit gateway multicast domain.
     */

    public void setTransitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
        this.transitGatewayMulticastDomainId = transitGatewayMulticastDomainId;
    }

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     * 
     * @return The ID of the transit gateway multicast domain.
     */

    public String getTransitGatewayMulticastDomainId() {
        return this.transitGatewayMulticastDomainId;
    }

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     * 
     * @param transitGatewayMulticastDomainId
     *        The ID of the transit gateway multicast domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayMulticastDomain withTransitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
        setTransitGatewayMulticastDomainId(transitGatewayMulticastDomainId);
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway.
     */

    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @return The ID of the transit gateway.
     */

    public String getTransitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayMulticastDomain withTransitGatewayId(String transitGatewayId) {
        setTransitGatewayId(transitGatewayId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transit gateway multicast domain.
     * </p>
     * 
     * @param transitGatewayMulticastDomainArn
     *        The Amazon Resource Name (ARN) of the transit gateway multicast domain.
     */

    public void setTransitGatewayMulticastDomainArn(String transitGatewayMulticastDomainArn) {
        this.transitGatewayMulticastDomainArn = transitGatewayMulticastDomainArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transit gateway multicast domain.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the transit gateway multicast domain.
     */

    public String getTransitGatewayMulticastDomainArn() {
        return this.transitGatewayMulticastDomainArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transit gateway multicast domain.
     * </p>
     * 
     * @param transitGatewayMulticastDomainArn
     *        The Amazon Resource Name (ARN) of the transit gateway multicast domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayMulticastDomain withTransitGatewayMulticastDomainArn(String transitGatewayMulticastDomainArn) {
        setTransitGatewayMulticastDomainArn(transitGatewayMulticastDomainArn);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the transit gateway multiicast domain.
     * </p>
     * 
     * @param ownerId
     *        The ID of the AWS account that owns the transit gateway multiicast domain.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the transit gateway multiicast domain.
     * </p>
     * 
     * @return The ID of the AWS account that owns the transit gateway multiicast domain.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the transit gateway multiicast domain.
     * </p>
     * 
     * @param ownerId
     *        The ID of the AWS account that owns the transit gateway multiicast domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayMulticastDomain withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The options for the transit gateway multicast domain.
     * </p>
     * 
     * @param options
     *        The options for the transit gateway multicast domain.
     */

    public void setOptions(TransitGatewayMulticastDomainOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * The options for the transit gateway multicast domain.
     * </p>
     * 
     * @return The options for the transit gateway multicast domain.
     */

    public TransitGatewayMulticastDomainOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * The options for the transit gateway multicast domain.
     * </p>
     * 
     * @param options
     *        The options for the transit gateway multicast domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayMulticastDomain withOptions(TransitGatewayMulticastDomainOptions options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The state of the transit gateway multicast domain.
     * </p>
     * 
     * @param state
     *        The state of the transit gateway multicast domain.
     * @see TransitGatewayMulticastDomainState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the transit gateway multicast domain.
     * </p>
     * 
     * @return The state of the transit gateway multicast domain.
     * @see TransitGatewayMulticastDomainState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the transit gateway multicast domain.
     * </p>
     * 
     * @param state
     *        The state of the transit gateway multicast domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayMulticastDomainState
     */

    public TransitGatewayMulticastDomain withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the transit gateway multicast domain.
     * </p>
     * 
     * @param state
     *        The state of the transit gateway multicast domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayMulticastDomainState
     */

    public TransitGatewayMulticastDomain withState(TransitGatewayMulticastDomainState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The time the transit gateway multicast domain was created.
     * </p>
     * 
     * @param creationTime
     *        The time the transit gateway multicast domain was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the transit gateway multicast domain was created.
     * </p>
     * 
     * @return The time the transit gateway multicast domain was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the transit gateway multicast domain was created.
     * </p>
     * 
     * @param creationTime
     *        The time the transit gateway multicast domain was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayMulticastDomain withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The tags for the transit gateway multicast domain.
     * </p>
     * 
     * @return The tags for the transit gateway multicast domain.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags for the transit gateway multicast domain.
     * </p>
     * 
     * @param tags
     *        The tags for the transit gateway multicast domain.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags for the transit gateway multicast domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the transit gateway multicast domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayMulticastDomain withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags for the transit gateway multicast domain.
     * </p>
     * 
     * @param tags
     *        The tags for the transit gateway multicast domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayMulticastDomain withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTransitGatewayMulticastDomainId() != null)
            sb.append("TransitGatewayMulticastDomainId: ").append(getTransitGatewayMulticastDomainId()).append(",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: ").append(getTransitGatewayId()).append(",");
        if (getTransitGatewayMulticastDomainArn() != null)
            sb.append("TransitGatewayMulticastDomainArn: ").append(getTransitGatewayMulticastDomainArn()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
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

        if (obj instanceof TransitGatewayMulticastDomain == false)
            return false;
        TransitGatewayMulticastDomain other = (TransitGatewayMulticastDomain) obj;
        if (other.getTransitGatewayMulticastDomainId() == null ^ this.getTransitGatewayMulticastDomainId() == null)
            return false;
        if (other.getTransitGatewayMulticastDomainId() != null
                && other.getTransitGatewayMulticastDomainId().equals(this.getTransitGatewayMulticastDomainId()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getTransitGatewayMulticastDomainArn() == null ^ this.getTransitGatewayMulticastDomainArn() == null)
            return false;
        if (other.getTransitGatewayMulticastDomainArn() != null
                && other.getTransitGatewayMulticastDomainArn().equals(this.getTransitGatewayMulticastDomainArn()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
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

        hashCode = prime * hashCode + ((getTransitGatewayMulticastDomainId() == null) ? 0 : getTransitGatewayMulticastDomainId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayMulticastDomainArn() == null) ? 0 : getTransitGatewayMulticastDomainArn().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayMulticastDomain clone() {
        try {
            return (TransitGatewayMulticastDomain) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
