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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Complex data type for field-level encryption profiles that includes all of the encryption entities.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/EncryptionEntities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionEntities implements Serializable, Cloneable {

    /**
     * <p>
     * Number of field pattern items in a field-level encryption content type-profile mapping.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * An array of field patterns in a field-level encryption content type-profile mapping.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EncryptionEntity> items;

    /**
     * <p>
     * Number of field pattern items in a field-level encryption content type-profile mapping.
     * </p>
     * 
     * @param quantity
     *        Number of field pattern items in a field-level encryption content type-profile mapping.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * Number of field pattern items in a field-level encryption content type-profile mapping.
     * </p>
     * 
     * @return Number of field pattern items in a field-level encryption content type-profile mapping.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * Number of field pattern items in a field-level encryption content type-profile mapping.
     * </p>
     * 
     * @param quantity
     *        Number of field pattern items in a field-level encryption content type-profile mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionEntities withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * An array of field patterns in a field-level encryption content type-profile mapping.
     * </p>
     * 
     * @return An array of field patterns in a field-level encryption content type-profile mapping.
     */

    public java.util.List<EncryptionEntity> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<EncryptionEntity>();
        }
        return items;
    }

    /**
     * <p>
     * An array of field patterns in a field-level encryption content type-profile mapping.
     * </p>
     * 
     * @param items
     *        An array of field patterns in a field-level encryption content type-profile mapping.
     */

    public void setItems(java.util.Collection<EncryptionEntity> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<EncryptionEntity>(items);
    }

    /**
     * <p>
     * An array of field patterns in a field-level encryption content type-profile mapping.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        An array of field patterns in a field-level encryption content type-profile mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionEntities withItems(EncryptionEntity... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<EncryptionEntity>(items.length));
        }
        for (EncryptionEntity ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of field patterns in a field-level encryption content type-profile mapping.
     * </p>
     * 
     * @param items
     *        An array of field patterns in a field-level encryption content type-profile mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionEntities withItems(java.util.Collection<EncryptionEntity> items) {
        setItems(items);
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
        if (getQuantity() != null)
            sb.append("Quantity: ").append(getQuantity()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionEntities == false)
            return false;
        EncryptionEntities other = (EncryptionEntities) obj;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionEntities clone() {
        try {
            return (EncryptionEntities) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
