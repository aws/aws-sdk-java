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
 * A representation of a resource association for a custom line item.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListResourcesAssociatedToCustomLineItemResponseElement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourcesAssociatedToCustomLineItemResponseElement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the associated resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The type of relationship between the custom line item and the associated resource.
     * </p>
     */
    private String relationship;
    /**
     * <p>
     * The end billing period of the associated resource.
     * </p>
     */
    private String endBillingPeriod;

    /**
     * <p>
     * The ARN of the associated resource.
     * </p>
     * 
     * @param arn
     *        The ARN of the associated resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the associated resource.
     * </p>
     * 
     * @return The ARN of the associated resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the associated resource.
     * </p>
     * 
     * @param arn
     *        The ARN of the associated resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesAssociatedToCustomLineItemResponseElement withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The type of relationship between the custom line item and the associated resource.
     * </p>
     * 
     * @param relationship
     *        The type of relationship between the custom line item and the associated resource.
     * @see CustomLineItemRelationship
     */

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    /**
     * <p>
     * The type of relationship between the custom line item and the associated resource.
     * </p>
     * 
     * @return The type of relationship between the custom line item and the associated resource.
     * @see CustomLineItemRelationship
     */

    public String getRelationship() {
        return this.relationship;
    }

    /**
     * <p>
     * The type of relationship between the custom line item and the associated resource.
     * </p>
     * 
     * @param relationship
     *        The type of relationship between the custom line item and the associated resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomLineItemRelationship
     */

    public ListResourcesAssociatedToCustomLineItemResponseElement withRelationship(String relationship) {
        setRelationship(relationship);
        return this;
    }

    /**
     * <p>
     * The type of relationship between the custom line item and the associated resource.
     * </p>
     * 
     * @param relationship
     *        The type of relationship between the custom line item and the associated resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomLineItemRelationship
     */

    public ListResourcesAssociatedToCustomLineItemResponseElement withRelationship(CustomLineItemRelationship relationship) {
        this.relationship = relationship.toString();
        return this;
    }

    /**
     * <p>
     * The end billing period of the associated resource.
     * </p>
     * 
     * @param endBillingPeriod
     *        The end billing period of the associated resource.
     */

    public void setEndBillingPeriod(String endBillingPeriod) {
        this.endBillingPeriod = endBillingPeriod;
    }

    /**
     * <p>
     * The end billing period of the associated resource.
     * </p>
     * 
     * @return The end billing period of the associated resource.
     */

    public String getEndBillingPeriod() {
        return this.endBillingPeriod;
    }

    /**
     * <p>
     * The end billing period of the associated resource.
     * </p>
     * 
     * @param endBillingPeriod
     *        The end billing period of the associated resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesAssociatedToCustomLineItemResponseElement withEndBillingPeriod(String endBillingPeriod) {
        setEndBillingPeriod(endBillingPeriod);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getRelationship() != null)
            sb.append("Relationship: ").append(getRelationship()).append(",");
        if (getEndBillingPeriod() != null)
            sb.append("EndBillingPeriod: ").append(getEndBillingPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourcesAssociatedToCustomLineItemResponseElement == false)
            return false;
        ListResourcesAssociatedToCustomLineItemResponseElement other = (ListResourcesAssociatedToCustomLineItemResponseElement) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getRelationship() == null ^ this.getRelationship() == null)
            return false;
        if (other.getRelationship() != null && other.getRelationship().equals(this.getRelationship()) == false)
            return false;
        if (other.getEndBillingPeriod() == null ^ this.getEndBillingPeriod() == null)
            return false;
        if (other.getEndBillingPeriod() != null && other.getEndBillingPeriod().equals(this.getEndBillingPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getRelationship() == null) ? 0 : getRelationship().hashCode());
        hashCode = prime * hashCode + ((getEndBillingPeriod() == null) ? 0 : getEndBillingPeriod().hashCode());
        return hashCode;
    }

    @Override
    public ListResourcesAssociatedToCustomLineItemResponseElement clone() {
        try {
            return (ListResourcesAssociatedToCustomLineItemResponseElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.ListResourcesAssociatedToCustomLineItemResponseElementMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
