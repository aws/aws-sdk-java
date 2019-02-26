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
 * A complex type that contains zero or more <code>Tag</code> elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/Tags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tags implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains <code>Tag</code> elements.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> items;

    /**
     * <p>
     * A complex type that contains <code>Tag</code> elements.
     * </p>
     * 
     * @return A complex type that contains <code>Tag</code> elements.
     */

    public java.util.List<Tag> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return items;
    }

    /**
     * <p>
     * A complex type that contains <code>Tag</code> elements.
     * </p>
     * 
     * @param items
     *        A complex type that contains <code>Tag</code> elements.
     */

    public void setItems(java.util.Collection<Tag> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<Tag>(items);
    }

    /**
     * <p>
     * A complex type that contains <code>Tag</code> elements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A complex type that contains <code>Tag</code> elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tags withItems(Tag... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<Tag>(items.length));
        }
        for (Tag ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains <code>Tag</code> elements.
     * </p>
     * 
     * @param items
     *        A complex type that contains <code>Tag</code> elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tags withItems(java.util.Collection<Tag> items) {
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

        if (obj instanceof Tags == false)
            return false;
        Tags other = (Tags) obj;
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

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public Tags clone() {
        try {
            return (Tags) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
