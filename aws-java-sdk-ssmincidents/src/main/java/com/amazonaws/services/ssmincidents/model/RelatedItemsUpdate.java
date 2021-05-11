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
 * Details about the related item you're adding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/RelatedItemsUpdate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelatedItemsUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about the related item you're adding.
     * </p>
     */
    private RelatedItem itemToAdd;
    /**
     * <p>
     * Details about the related item you're deleting.
     * </p>
     */
    private ItemIdentifier itemToRemove;

    /**
     * <p>
     * Details about the related item you're adding.
     * </p>
     * 
     * @param itemToAdd
     *        Details about the related item you're adding.
     */

    public void setItemToAdd(RelatedItem itemToAdd) {
        this.itemToAdd = itemToAdd;
    }

    /**
     * <p>
     * Details about the related item you're adding.
     * </p>
     * 
     * @return Details about the related item you're adding.
     */

    public RelatedItem getItemToAdd() {
        return this.itemToAdd;
    }

    /**
     * <p>
     * Details about the related item you're adding.
     * </p>
     * 
     * @param itemToAdd
     *        Details about the related item you're adding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedItemsUpdate withItemToAdd(RelatedItem itemToAdd) {
        setItemToAdd(itemToAdd);
        return this;
    }

    /**
     * <p>
     * Details about the related item you're deleting.
     * </p>
     * 
     * @param itemToRemove
     *        Details about the related item you're deleting.
     */

    public void setItemToRemove(ItemIdentifier itemToRemove) {
        this.itemToRemove = itemToRemove;
    }

    /**
     * <p>
     * Details about the related item you're deleting.
     * </p>
     * 
     * @return Details about the related item you're deleting.
     */

    public ItemIdentifier getItemToRemove() {
        return this.itemToRemove;
    }

    /**
     * <p>
     * Details about the related item you're deleting.
     * </p>
     * 
     * @param itemToRemove
     *        Details about the related item you're deleting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedItemsUpdate withItemToRemove(ItemIdentifier itemToRemove) {
        setItemToRemove(itemToRemove);
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
        if (getItemToAdd() != null)
            sb.append("ItemToAdd: ").append(getItemToAdd()).append(",");
        if (getItemToRemove() != null)
            sb.append("ItemToRemove: ").append(getItemToRemove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelatedItemsUpdate == false)
            return false;
        RelatedItemsUpdate other = (RelatedItemsUpdate) obj;
        if (other.getItemToAdd() == null ^ this.getItemToAdd() == null)
            return false;
        if (other.getItemToAdd() != null && other.getItemToAdd().equals(this.getItemToAdd()) == false)
            return false;
        if (other.getItemToRemove() == null ^ this.getItemToRemove() == null)
            return false;
        if (other.getItemToRemove() != null && other.getItemToRemove().equals(this.getItemToRemove()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItemToAdd() == null) ? 0 : getItemToAdd().hashCode());
        hashCode = prime * hashCode + ((getItemToRemove() == null) ? 0 : getItemToRemove().hashCode());
        return hashCode;
    }

    @Override
    public RelatedItemsUpdate clone() {
        try {
            return (RelatedItemsUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.RelatedItemsUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
