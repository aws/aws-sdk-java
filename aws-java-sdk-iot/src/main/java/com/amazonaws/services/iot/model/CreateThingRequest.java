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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the CreateThing operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateThingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the thing to create.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The name of the thing type associated with the new thing.
     * </p>
     */
    private String thingTypeName;
    /**
     * <p>
     * The attribute payload, which consists of up to three name/value pairs in a JSON document. For example:
     * </p>
     * <p>
     * <code>{\"attributes\":{\"string1\":\"string2\"}}</code>
     * </p>
     */
    private AttributePayload attributePayload;
    /**
     * <p>
     * The name of the billing group the thing will be added to.
     * </p>
     */
    private String billingGroupName;

    /**
     * <p>
     * The name of the thing to create.
     * </p>
     * 
     * @param thingName
     *        The name of the thing to create.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing to create.
     * </p>
     * 
     * @return The name of the thing to create.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the thing to create.
     * </p>
     * 
     * @param thingName
     *        The name of the thing to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThingRequest withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The name of the thing type associated with the new thing.
     * </p>
     * 
     * @param thingTypeName
     *        The name of the thing type associated with the new thing.
     */

    public void setThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type associated with the new thing.
     * </p>
     * 
     * @return The name of the thing type associated with the new thing.
     */

    public String getThingTypeName() {
        return this.thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type associated with the new thing.
     * </p>
     * 
     * @param thingTypeName
     *        The name of the thing type associated with the new thing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThingRequest withThingTypeName(String thingTypeName) {
        setThingTypeName(thingTypeName);
        return this;
    }

    /**
     * <p>
     * The attribute payload, which consists of up to three name/value pairs in a JSON document. For example:
     * </p>
     * <p>
     * <code>{\"attributes\":{\"string1\":\"string2\"}}</code>
     * </p>
     * 
     * @param attributePayload
     *        The attribute payload, which consists of up to three name/value pairs in a JSON document. For example:</p>
     *        <p>
     *        <code>{\"attributes\":{\"string1\":\"string2\"}}</code>
     */

    public void setAttributePayload(AttributePayload attributePayload) {
        this.attributePayload = attributePayload;
    }

    /**
     * <p>
     * The attribute payload, which consists of up to three name/value pairs in a JSON document. For example:
     * </p>
     * <p>
     * <code>{\"attributes\":{\"string1\":\"string2\"}}</code>
     * </p>
     * 
     * @return The attribute payload, which consists of up to three name/value pairs in a JSON document. For
     *         example:</p>
     *         <p>
     *         <code>{\"attributes\":{\"string1\":\"string2\"}}</code>
     */

    public AttributePayload getAttributePayload() {
        return this.attributePayload;
    }

    /**
     * <p>
     * The attribute payload, which consists of up to three name/value pairs in a JSON document. For example:
     * </p>
     * <p>
     * <code>{\"attributes\":{\"string1\":\"string2\"}}</code>
     * </p>
     * 
     * @param attributePayload
     *        The attribute payload, which consists of up to three name/value pairs in a JSON document. For example:</p>
     *        <p>
     *        <code>{\"attributes\":{\"string1\":\"string2\"}}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThingRequest withAttributePayload(AttributePayload attributePayload) {
        setAttributePayload(attributePayload);
        return this;
    }

    /**
     * <p>
     * The name of the billing group the thing will be added to.
     * </p>
     * 
     * @param billingGroupName
     *        The name of the billing group the thing will be added to.
     */

    public void setBillingGroupName(String billingGroupName) {
        this.billingGroupName = billingGroupName;
    }

    /**
     * <p>
     * The name of the billing group the thing will be added to.
     * </p>
     * 
     * @return The name of the billing group the thing will be added to.
     */

    public String getBillingGroupName() {
        return this.billingGroupName;
    }

    /**
     * <p>
     * The name of the billing group the thing will be added to.
     * </p>
     * 
     * @param billingGroupName
     *        The name of the billing group the thing will be added to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThingRequest withBillingGroupName(String billingGroupName) {
        setBillingGroupName(billingGroupName);
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
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getThingTypeName() != null)
            sb.append("ThingTypeName: ").append(getThingTypeName()).append(",");
        if (getAttributePayload() != null)
            sb.append("AttributePayload: ").append(getAttributePayload()).append(",");
        if (getBillingGroupName() != null)
            sb.append("BillingGroupName: ").append(getBillingGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateThingRequest == false)
            return false;
        CreateThingRequest other = (CreateThingRequest) obj;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getThingTypeName() == null ^ this.getThingTypeName() == null)
            return false;
        if (other.getThingTypeName() != null && other.getThingTypeName().equals(this.getThingTypeName()) == false)
            return false;
        if (other.getAttributePayload() == null ^ this.getAttributePayload() == null)
            return false;
        if (other.getAttributePayload() != null && other.getAttributePayload().equals(this.getAttributePayload()) == false)
            return false;
        if (other.getBillingGroupName() == null ^ this.getBillingGroupName() == null)
            return false;
        if (other.getBillingGroupName() != null && other.getBillingGroupName().equals(this.getBillingGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getThingTypeName() == null) ? 0 : getThingTypeName().hashCode());
        hashCode = prime * hashCode + ((getAttributePayload() == null) ? 0 : getAttributePayload().hashCode());
        hashCode = prime * hashCode + ((getBillingGroupName() == null) ? 0 : getBillingGroupName().hashCode());
        return hashCode;
    }

    @Override
    public CreateThingRequest clone() {
        return (CreateThingRequest) super.clone();
    }

}
