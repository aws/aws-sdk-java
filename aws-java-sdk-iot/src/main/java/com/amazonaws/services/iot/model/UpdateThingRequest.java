/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iot.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the UpdateThing operation.
 * </p>
 */
public class UpdateThingRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The thing name.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The attribute payload, a JSON string containing up to three key-value
     * pairs.
     * </p>
     * <p>
     * For example: {\"attributes\":{\"string1\":\"string2\"}}
     * </p>
     */
    private AttributePayload attributePayload;

    /**
     * <p>
     * The thing name.
     * </p>
     * 
     * @param thingName
     *        The thing name.
     */
    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The thing name.
     * </p>
     * 
     * @return The thing name.
     */
    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The thing name.
     * </p>
     * 
     * @param thingName
     *        The thing name.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateThingRequest withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The attribute payload, a JSON string containing up to three key-value
     * pairs.
     * </p>
     * <p>
     * For example: {\"attributes\":{\"string1\":\"string2\"}}
     * </p>
     * 
     * @param attributePayload
     *        The attribute payload, a JSON string containing up to three
     *        key-value pairs.</p>
     *        <p>
     *        For example: {\"attributes\":{\"string1\":\"string2\"}}
     */
    public void setAttributePayload(AttributePayload attributePayload) {
        this.attributePayload = attributePayload;
    }

    /**
     * <p>
     * The attribute payload, a JSON string containing up to three key-value
     * pairs.
     * </p>
     * <p>
     * For example: {\"attributes\":{\"string1\":\"string2\"}}
     * </p>
     * 
     * @return The attribute payload, a JSON string containing up to three
     *         key-value pairs.</p>
     *         <p>
     *         For example: {\"attributes\":{\"string1\":\"string2\"}}
     */
    public AttributePayload getAttributePayload() {
        return this.attributePayload;
    }

    /**
     * <p>
     * The attribute payload, a JSON string containing up to three key-value
     * pairs.
     * </p>
     * <p>
     * For example: {\"attributes\":{\"string1\":\"string2\"}}
     * </p>
     * 
     * @param attributePayload
     *        The attribute payload, a JSON string containing up to three
     *        key-value pairs.</p>
     *        <p>
     *        For example: {\"attributes\":{\"string1\":\"string2\"}}
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateThingRequest withAttributePayload(
            AttributePayload attributePayload) {
        setAttributePayload(attributePayload);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("ThingName: " + getThingName() + ",");
        if (getAttributePayload() != null)
            sb.append("AttributePayload: " + getAttributePayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateThingRequest == false)
            return false;
        UpdateThingRequest other = (UpdateThingRequest) obj;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null
                && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getAttributePayload() == null
                ^ this.getAttributePayload() == null)
            return false;
        if (other.getAttributePayload() != null
                && other.getAttributePayload().equals(
                        this.getAttributePayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime
                * hashCode
                + ((getAttributePayload() == null) ? 0 : getAttributePayload()
                        .hashCode());
        return hashCode;
    }

    @Override
    public UpdateThingRequest clone() {
        return (UpdateThingRequest) super.clone();
    }
}