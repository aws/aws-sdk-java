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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a transit gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGateway implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     */
    private String transitGatewayId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transit gateway.
     * </p>
     */
    private String transitGatewayArn;
    /**
     * <p>
     * The state of the transit gateway.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The ID of the AWS account ID that owns the transit gateway.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The description of the transit gateway.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The creation time.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The transit gateway options.
     * </p>
     */
    private TransitGatewayOptions options;
    /**
     * <p>
     * The tags for the transit gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

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

    public TransitGateway withTransitGatewayId(String transitGatewayId) {
        setTransitGatewayId(transitGatewayId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transit gateway.
     * </p>
     * 
     * @param transitGatewayArn
     *        The Amazon Resource Name (ARN) of the transit gateway.
     */

    public void setTransitGatewayArn(String transitGatewayArn) {
        this.transitGatewayArn = transitGatewayArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transit gateway.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the transit gateway.
     */

    public String getTransitGatewayArn() {
        return this.transitGatewayArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transit gateway.
     * </p>
     * 
     * @param transitGatewayArn
     *        The Amazon Resource Name (ARN) of the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGateway withTransitGatewayArn(String transitGatewayArn) {
        setTransitGatewayArn(transitGatewayArn);
        return this;
    }

    /**
     * <p>
     * The state of the transit gateway.
     * </p>
     * 
     * @param state
     *        The state of the transit gateway.
     * @see TransitGatewayState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the transit gateway.
     * </p>
     * 
     * @return The state of the transit gateway.
     * @see TransitGatewayState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the transit gateway.
     * </p>
     * 
     * @param state
     *        The state of the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayState
     */

    public TransitGateway withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the transit gateway.
     * </p>
     * 
     * @param state
     *        The state of the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayState
     */

    public TransitGateway withState(TransitGatewayState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account ID that owns the transit gateway.
     * </p>
     * 
     * @param ownerId
     *        The ID of the AWS account ID that owns the transit gateway.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account ID that owns the transit gateway.
     * </p>
     * 
     * @return The ID of the AWS account ID that owns the transit gateway.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account ID that owns the transit gateway.
     * </p>
     * 
     * @param ownerId
     *        The ID of the AWS account ID that owns the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGateway withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The description of the transit gateway.
     * </p>
     * 
     * @param description
     *        The description of the transit gateway.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the transit gateway.
     * </p>
     * 
     * @return The description of the transit gateway.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the transit gateway.
     * </p>
     * 
     * @param description
     *        The description of the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGateway withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @return The creation time.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGateway withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The transit gateway options.
     * </p>
     * 
     * @param options
     *        The transit gateway options.
     */

    public void setOptions(TransitGatewayOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * The transit gateway options.
     * </p>
     * 
     * @return The transit gateway options.
     */

    public TransitGatewayOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * The transit gateway options.
     * </p>
     * 
     * @param options
     *        The transit gateway options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGateway withOptions(TransitGatewayOptions options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The tags for the transit gateway.
     * </p>
     * 
     * @return The tags for the transit gateway.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags for the transit gateway.
     * </p>
     * 
     * @param tags
     *        The tags for the transit gateway.
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
     * The tags for the transit gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGateway withTags(Tag... tags) {
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
     * The tags for the transit gateway.
     * </p>
     * 
     * @param tags
     *        The tags for the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGateway withTags(java.util.Collection<Tag> tags) {
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
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: ").append(getTransitGatewayId()).append(",");
        if (getTransitGatewayArn() != null)
            sb.append("TransitGatewayArn: ").append(getTransitGatewayArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
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

        if (obj instanceof TransitGateway == false)
            return false;
        TransitGateway other = (TransitGateway) obj;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getTransitGatewayArn() == null ^ this.getTransitGatewayArn() == null)
            return false;
        if (other.getTransitGatewayArn() != null && other.getTransitGatewayArn().equals(this.getTransitGatewayArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
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

        hashCode = prime * hashCode + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayArn() == null) ? 0 : getTransitGatewayArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TransitGateway clone() {
        try {
            return (TransitGateway) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
