/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalizeevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents item metadata added to an Items dataset using the <code>PutItems</code> API. For more information see <a
 * href="https://docs.aws.amazon.com/personalize/latest/dg/importing-items.html">Importing Items Incrementally</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-events-2018-03-22/Item" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Item implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID associated with the item.
     * </p>
     */
    private String itemId;
    /**
     * <p>
     * A string map of item-specific metadata. Each element in the map consists of a key-value pair. For example,
     * <code>{"numberOfRatings": "12"}</code>.
     * </p>
     * <p>
     * The keys use camel case names that match the fields in the schema for the Items dataset. In the previous example,
     * the <code>numberOfRatings</code> matches the 'NUMBER_OF_RATINGS' field defined in the Items schema. For
     * categorical string data, to include multiple categories for a single item, separate each category with a pipe
     * separator (<code>|</code>). For example, <code>\"Horror|Action\"</code>.
     * </p>
     */
    private String properties;

    /**
     * <p>
     * The ID associated with the item.
     * </p>
     * 
     * @param itemId
     *        The ID associated with the item.
     */

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * <p>
     * The ID associated with the item.
     * </p>
     * 
     * @return The ID associated with the item.
     */

    public String getItemId() {
        return this.itemId;
    }

    /**
     * <p>
     * The ID associated with the item.
     * </p>
     * 
     * @param itemId
     *        The ID associated with the item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Item withItemId(String itemId) {
        setItemId(itemId);
        return this;
    }

    /**
     * <p>
     * A string map of item-specific metadata. Each element in the map consists of a key-value pair. For example,
     * <code>{"numberOfRatings": "12"}</code>.
     * </p>
     * <p>
     * The keys use camel case names that match the fields in the schema for the Items dataset. In the previous example,
     * the <code>numberOfRatings</code> matches the 'NUMBER_OF_RATINGS' field defined in the Items schema. For
     * categorical string data, to include multiple categories for a single item, separate each category with a pipe
     * separator (<code>|</code>). For example, <code>\"Horror|Action\"</code>.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param properties
     *        A string map of item-specific metadata. Each element in the map consists of a key-value pair. For example,
     *        <code>{"numberOfRatings": "12"}</code>.</p>
     *        <p>
     *        The keys use camel case names that match the fields in the schema for the Items dataset. In the previous
     *        example, the <code>numberOfRatings</code> matches the 'NUMBER_OF_RATINGS' field defined in the Items
     *        schema. For categorical string data, to include multiple categories for a single item, separate each
     *        category with a pipe separator (<code>|</code>). For example, <code>\"Horror|Action\"</code>.
     */

    public void setProperties(String properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * A string map of item-specific metadata. Each element in the map consists of a key-value pair. For example,
     * <code>{"numberOfRatings": "12"}</code>.
     * </p>
     * <p>
     * The keys use camel case names that match the fields in the schema for the Items dataset. In the previous example,
     * the <code>numberOfRatings</code> matches the 'NUMBER_OF_RATINGS' field defined in the Items schema. For
     * categorical string data, to include multiple categories for a single item, separate each category with a pipe
     * separator (<code>|</code>). For example, <code>\"Horror|Action\"</code>.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return A string map of item-specific metadata. Each element in the map consists of a key-value pair. For
     *         example, <code>{"numberOfRatings": "12"}</code>.</p>
     *         <p>
     *         The keys use camel case names that match the fields in the schema for the Items dataset. In the previous
     *         example, the <code>numberOfRatings</code> matches the 'NUMBER_OF_RATINGS' field defined in the Items
     *         schema. For categorical string data, to include multiple categories for a single item, separate each
     *         category with a pipe separator (<code>|</code>). For example, <code>\"Horror|Action\"</code>.
     */

    public String getProperties() {
        return this.properties;
    }

    /**
     * <p>
     * A string map of item-specific metadata. Each element in the map consists of a key-value pair. For example,
     * <code>{"numberOfRatings": "12"}</code>.
     * </p>
     * <p>
     * The keys use camel case names that match the fields in the schema for the Items dataset. In the previous example,
     * the <code>numberOfRatings</code> matches the 'NUMBER_OF_RATINGS' field defined in the Items schema. For
     * categorical string data, to include multiple categories for a single item, separate each category with a pipe
     * separator (<code>|</code>). For example, <code>\"Horror|Action\"</code>.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param properties
     *        A string map of item-specific metadata. Each element in the map consists of a key-value pair. For example,
     *        <code>{"numberOfRatings": "12"}</code>.</p>
     *        <p>
     *        The keys use camel case names that match the fields in the schema for the Items dataset. In the previous
     *        example, the <code>numberOfRatings</code> matches the 'NUMBER_OF_RATINGS' field defined in the Items
     *        schema. For categorical string data, to include multiple categories for a single item, separate each
     *        category with a pipe separator (<code>|</code>). For example, <code>\"Horror|Action\"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Item withProperties(String properties) {
        setProperties(properties);
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
        if (getItemId() != null)
            sb.append("ItemId: ").append(getItemId()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Item == false)
            return false;
        Item other = (Item) obj;
        if (other.getItemId() == null ^ this.getItemId() == null)
            return false;
        if (other.getItemId() != null && other.getItemId().equals(this.getItemId()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItemId() == null) ? 0 : getItemId().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public Item clone() {
        try {
            return (Item) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalizeevents.model.transform.ItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
