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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A representation of a pricing plan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/PricingPlanListElement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PricingPlanListElement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a pricing plan.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The pricing plan Amazon Resource Names (ARN). This can be used to uniquely identify a pricing plan.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The pricing plan description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The pricing rules count that's currently associated with this pricing plan list element.
     * </p>
     */
    private Long size;
    /**
     * <p>
     * The time when the pricing plan was created.
     * </p>
     */
    private Long creationTime;
    /**
     * <p>
     * The most recent time when the pricing plan was modified.
     * </p>
     */
    private Long lastModifiedTime;

    /**
     * <p>
     * The name of a pricing plan.
     * </p>
     * 
     * @param name
     *        The name of a pricing plan.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a pricing plan.
     * </p>
     * 
     * @return The name of a pricing plan.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a pricing plan.
     * </p>
     * 
     * @param name
     *        The name of a pricing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PricingPlanListElement withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The pricing plan Amazon Resource Names (ARN). This can be used to uniquely identify a pricing plan.
     * </p>
     * 
     * @param arn
     *        The pricing plan Amazon Resource Names (ARN). This can be used to uniquely identify a pricing plan.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The pricing plan Amazon Resource Names (ARN). This can be used to uniquely identify a pricing plan.
     * </p>
     * 
     * @return The pricing plan Amazon Resource Names (ARN). This can be used to uniquely identify a pricing plan.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The pricing plan Amazon Resource Names (ARN). This can be used to uniquely identify a pricing plan.
     * </p>
     * 
     * @param arn
     *        The pricing plan Amazon Resource Names (ARN). This can be used to uniquely identify a pricing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PricingPlanListElement withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The pricing plan description.
     * </p>
     * 
     * @param description
     *        The pricing plan description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The pricing plan description.
     * </p>
     * 
     * @return The pricing plan description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The pricing plan description.
     * </p>
     * 
     * @param description
     *        The pricing plan description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PricingPlanListElement withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The pricing rules count that's currently associated with this pricing plan list element.
     * </p>
     * 
     * @param size
     *        The pricing rules count that's currently associated with this pricing plan list element.
     */

    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * <p>
     * The pricing rules count that's currently associated with this pricing plan list element.
     * </p>
     * 
     * @return The pricing rules count that's currently associated with this pricing plan list element.
     */

    public Long getSize() {
        return this.size;
    }

    /**
     * <p>
     * The pricing rules count that's currently associated with this pricing plan list element.
     * </p>
     * 
     * @param size
     *        The pricing rules count that's currently associated with this pricing plan list element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PricingPlanListElement withSize(Long size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The time when the pricing plan was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the pricing plan was created.
     */

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the pricing plan was created.
     * </p>
     * 
     * @return The time when the pricing plan was created.
     */

    public Long getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the pricing plan was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the pricing plan was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PricingPlanListElement withCreationTime(Long creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The most recent time when the pricing plan was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The most recent time when the pricing plan was modified.
     */

    public void setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The most recent time when the pricing plan was modified.
     * </p>
     * 
     * @return The most recent time when the pricing plan was modified.
     */

    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The most recent time when the pricing plan was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The most recent time when the pricing plan was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PricingPlanListElement withLastModifiedTime(Long lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PricingPlanListElement == false)
            return false;
        PricingPlanListElement other = (PricingPlanListElement) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public PricingPlanListElement clone() {
        try {
            return (PricingPlanListElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.PricingPlanListElementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
