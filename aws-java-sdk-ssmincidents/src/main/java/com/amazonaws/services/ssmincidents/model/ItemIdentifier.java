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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details and type of a related item.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ItemIdentifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ItemIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of related item. Incident Manager supports the following types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ANALYSIS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCIDENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>METRIC</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ATTACHMENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER</code>
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * Details about the related item.
     * </p>
     */
    private ItemValue value;

    /**
     * <p>
     * The type of related item. Incident Manager supports the following types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ANALYSIS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCIDENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>METRIC</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ATTACHMENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of related item. Incident Manager supports the following types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ANALYSIS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCIDENT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>METRIC</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PARENT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ATTACHMENT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OTHER</code>
     *        </p>
     *        </li>
     * @see ItemType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of related item. Incident Manager supports the following types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ANALYSIS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCIDENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>METRIC</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ATTACHMENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of related item. Incident Manager supports the following types:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ANALYSIS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INCIDENT</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>METRIC</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PARENT</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ATTACHMENT</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OTHER</code>
     *         </p>
     *         </li>
     * @see ItemType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of related item. Incident Manager supports the following types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ANALYSIS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCIDENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>METRIC</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ATTACHMENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of related item. Incident Manager supports the following types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ANALYSIS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCIDENT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>METRIC</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PARENT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ATTACHMENT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OTHER</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ItemType
     */

    public ItemIdentifier withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of related item. Incident Manager supports the following types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ANALYSIS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCIDENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>METRIC</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ATTACHMENT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OTHER</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of related item. Incident Manager supports the following types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ANALYSIS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCIDENT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>METRIC</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PARENT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ATTACHMENT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OTHER</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ItemType
     */

    public ItemIdentifier withType(ItemType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Details about the related item.
     * </p>
     * 
     * @param value
     *        Details about the related item.
     */

    public void setValue(ItemValue value) {
        this.value = value;
    }

    /**
     * <p>
     * Details about the related item.
     * </p>
     * 
     * @return Details about the related item.
     */

    public ItemValue getValue() {
        return this.value;
    }

    /**
     * <p>
     * Details about the related item.
     * </p>
     * 
     * @param value
     *        Details about the related item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemIdentifier withValue(ItemValue value) {
        setValue(value);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ItemIdentifier == false)
            return false;
        ItemIdentifier other = (ItemIdentifier) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ItemIdentifier clone() {
        try {
            return (ItemIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.ItemIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
