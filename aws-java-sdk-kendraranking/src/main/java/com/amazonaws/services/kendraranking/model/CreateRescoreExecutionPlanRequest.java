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
package com.amazonaws.services.kendraranking.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/CreateRescoreExecutionPlan"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRescoreExecutionPlanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the rescore execution plan.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description for the rescore execution plan.
     * </p>
     */
    private String description;
    /**
     * <p>
     * You can set additional capacity units to meet the needs of your rescore execution plan. You are given a single
     * capacity unit by default. If you want to use the default capacity, you don't set additional capacity units. For
     * more information on the default capacity and additional capacity units, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html">Adjusting capacity</a>.
     * </p>
     */
    private CapacityUnitsConfiguration capacityUnits;
    /**
     * <p>
     * A list of key-value pairs that identify or categorize your rescore execution plan. You can also use tags to help
     * control access to the rescore execution plan. Tag keys and values can consist of Unicode letters, digits, white
     * space, and any of the following symbols: _ . : / = + - @.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A token that you provide to identify the request to create a rescore execution plan. Multiple calls to the
     * <code>CreateRescoreExecutionPlanRequest</code> API with the same client token will create only one rescore
     * execution plan.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * A name for the rescore execution plan.
     * </p>
     * 
     * @param name
     *        A name for the rescore execution plan.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the rescore execution plan.
     * </p>
     * 
     * @return A name for the rescore execution plan.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the rescore execution plan.
     * </p>
     * 
     * @param name
     *        A name for the rescore execution plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRescoreExecutionPlanRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description for the rescore execution plan.
     * </p>
     * 
     * @param description
     *        A description for the rescore execution plan.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the rescore execution plan.
     * </p>
     * 
     * @return A description for the rescore execution plan.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the rescore execution plan.
     * </p>
     * 
     * @param description
     *        A description for the rescore execution plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRescoreExecutionPlanRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * You can set additional capacity units to meet the needs of your rescore execution plan. You are given a single
     * capacity unit by default. If you want to use the default capacity, you don't set additional capacity units. For
     * more information on the default capacity and additional capacity units, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html">Adjusting capacity</a>.
     * </p>
     * 
     * @param capacityUnits
     *        You can set additional capacity units to meet the needs of your rescore execution plan. You are given a
     *        single capacity unit by default. If you want to use the default capacity, you don't set additional
     *        capacity units. For more information on the default capacity and additional capacity units, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html">Adjusting capacity</a>.
     */

    public void setCapacityUnits(CapacityUnitsConfiguration capacityUnits) {
        this.capacityUnits = capacityUnits;
    }

    /**
     * <p>
     * You can set additional capacity units to meet the needs of your rescore execution plan. You are given a single
     * capacity unit by default. If you want to use the default capacity, you don't set additional capacity units. For
     * more information on the default capacity and additional capacity units, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html">Adjusting capacity</a>.
     * </p>
     * 
     * @return You can set additional capacity units to meet the needs of your rescore execution plan. You are given a
     *         single capacity unit by default. If you want to use the default capacity, you don't set additional
     *         capacity units. For more information on the default capacity and additional capacity units, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html">Adjusting capacity</a>.
     */

    public CapacityUnitsConfiguration getCapacityUnits() {
        return this.capacityUnits;
    }

    /**
     * <p>
     * You can set additional capacity units to meet the needs of your rescore execution plan. You are given a single
     * capacity unit by default. If you want to use the default capacity, you don't set additional capacity units. For
     * more information on the default capacity and additional capacity units, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html">Adjusting capacity</a>.
     * </p>
     * 
     * @param capacityUnits
     *        You can set additional capacity units to meet the needs of your rescore execution plan. You are given a
     *        single capacity unit by default. If you want to use the default capacity, you don't set additional
     *        capacity units. For more information on the default capacity and additional capacity units, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/adjusting-capacity.html">Adjusting capacity</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRescoreExecutionPlanRequest withCapacityUnits(CapacityUnitsConfiguration capacityUnits) {
        setCapacityUnits(capacityUnits);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize your rescore execution plan. You can also use tags to help
     * control access to the rescore execution plan. Tag keys and values can consist of Unicode letters, digits, white
     * space, and any of the following symbols: _ . : / = + - @.
     * </p>
     * 
     * @return A list of key-value pairs that identify or categorize your rescore execution plan. You can also use tags
     *         to help control access to the rescore execution plan. Tag keys and values can consist of Unicode letters,
     *         digits, white space, and any of the following symbols: _ . : / = + - @.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize your rescore execution plan. You can also use tags to help
     * control access to the rescore execution plan. Tag keys and values can consist of Unicode letters, digits, white
     * space, and any of the following symbols: _ . : / = + - @.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize your rescore execution plan. You can also use tags
     *        to help control access to the rescore execution plan. Tag keys and values can consist of Unicode letters,
     *        digits, white space, and any of the following symbols: _ . : / = + - @.
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
     * A list of key-value pairs that identify or categorize your rescore execution plan. You can also use tags to help
     * control access to the rescore execution plan. Tag keys and values can consist of Unicode letters, digits, white
     * space, and any of the following symbols: _ . : / = + - @.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize your rescore execution plan. You can also use tags
     *        to help control access to the rescore execution plan. Tag keys and values can consist of Unicode letters,
     *        digits, white space, and any of the following symbols: _ . : / = + - @.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRescoreExecutionPlanRequest withTags(Tag... tags) {
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
     * A list of key-value pairs that identify or categorize your rescore execution plan. You can also use tags to help
     * control access to the rescore execution plan. Tag keys and values can consist of Unicode letters, digits, white
     * space, and any of the following symbols: _ . : / = + - @.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize your rescore execution plan. You can also use tags
     *        to help control access to the rescore execution plan. Tag keys and values can consist of Unicode letters,
     *        digits, white space, and any of the following symbols: _ . : / = + - @.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRescoreExecutionPlanRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create a rescore execution plan. Multiple calls to the
     * <code>CreateRescoreExecutionPlanRequest</code> API with the same client token will create only one rescore
     * execution plan.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create a rescore execution plan. Multiple calls to the
     *        <code>CreateRescoreExecutionPlanRequest</code> API with the same client token will create only one rescore
     *        execution plan.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create a rescore execution plan. Multiple calls to the
     * <code>CreateRescoreExecutionPlanRequest</code> API with the same client token will create only one rescore
     * execution plan.
     * </p>
     * 
     * @return A token that you provide to identify the request to create a rescore execution plan. Multiple calls to
     *         the <code>CreateRescoreExecutionPlanRequest</code> API with the same client token will create only one
     *         rescore execution plan.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create a rescore execution plan. Multiple calls to the
     * <code>CreateRescoreExecutionPlanRequest</code> API with the same client token will create only one rescore
     * execution plan.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create a rescore execution plan. Multiple calls to the
     *        <code>CreateRescoreExecutionPlanRequest</code> API with the same client token will create only one rescore
     *        execution plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRescoreExecutionPlanRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCapacityUnits() != null)
            sb.append("CapacityUnits: ").append(getCapacityUnits()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRescoreExecutionPlanRequest == false)
            return false;
        CreateRescoreExecutionPlanRequest other = (CreateRescoreExecutionPlanRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCapacityUnits() == null ^ this.getCapacityUnits() == null)
            return false;
        if (other.getCapacityUnits() != null && other.getCapacityUnits().equals(this.getCapacityUnits()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCapacityUnits() == null) ? 0 : getCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateRescoreExecutionPlanRequest clone() {
        return (CreateRescoreExecutionPlanRequest) super.clone();
    }

}
