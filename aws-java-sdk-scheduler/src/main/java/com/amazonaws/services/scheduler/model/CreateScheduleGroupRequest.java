/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.scheduler.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/CreateScheduleGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateScheduleGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not specify a
     * client token, EventBridge Scheduler uses a randomly generated token for the request to ensure idempotency.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The name of the schedule group that you are creating.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The list of tags to associate with the schedule group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not specify a
     * client token, EventBridge Scheduler uses a randomly generated token for the request to ensure idempotency.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not
     *        specify a client token, EventBridge Scheduler uses a randomly generated token for the request to ensure
     *        idempotency.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not specify a
     * client token, EventBridge Scheduler uses a randomly generated token for the request to ensure idempotency.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not
     *         specify a client token, EventBridge Scheduler uses a randomly generated token for the request to ensure
     *         idempotency.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not specify a
     * client token, EventBridge Scheduler uses a randomly generated token for the request to ensure idempotency.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not
     *        specify a client token, EventBridge Scheduler uses a randomly generated token for the request to ensure
     *        idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduleGroupRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The name of the schedule group that you are creating.
     * </p>
     * 
     * @param name
     *        The name of the schedule group that you are creating.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the schedule group that you are creating.
     * </p>
     * 
     * @return The name of the schedule group that you are creating.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the schedule group that you are creating.
     * </p>
     * 
     * @param name
     *        The name of the schedule group that you are creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduleGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The list of tags to associate with the schedule group.
     * </p>
     * 
     * @return The list of tags to associate with the schedule group.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags to associate with the schedule group.
     * </p>
     * 
     * @param tags
     *        The list of tags to associate with the schedule group.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The list of tags to associate with the schedule group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags to associate with the schedule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduleGroupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags to associate with the schedule group.
     * </p>
     * 
     * @param tags
     *        The list of tags to associate with the schedule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduleGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof CreateScheduleGroupRequest == false)
            return false;
        CreateScheduleGroupRequest other = (CreateScheduleGroupRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateScheduleGroupRequest clone() {
        return (CreateScheduleGroupRequest) super.clone();
    }

}
