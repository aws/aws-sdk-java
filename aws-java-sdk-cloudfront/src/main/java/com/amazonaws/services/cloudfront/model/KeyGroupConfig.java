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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A key group configuration.
 * </p>
 * <p>
 * A key group contains a list of public keys that you can use with <a
 * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">CloudFront signed URLs
 * and signed cookies</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/KeyGroupConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyGroupConfig implements Serializable, Cloneable {

    /**
     * <p>
     * A name to identify the key group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of the identifiers of the public keys in the key group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> items;
    /**
     * <p>
     * A comment to describe the key group. The comment cannot be longer than 128 characters.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * A name to identify the key group.
     * </p>
     * 
     * @param name
     *        A name to identify the key group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name to identify the key group.
     * </p>
     * 
     * @return A name to identify the key group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name to identify the key group.
     * </p>
     * 
     * @param name
     *        A name to identify the key group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyGroupConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of the identifiers of the public keys in the key group.
     * </p>
     * 
     * @return A list of the identifiers of the public keys in the key group.
     */

    public java.util.List<String> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return items;
    }

    /**
     * <p>
     * A list of the identifiers of the public keys in the key group.
     * </p>
     * 
     * @param items
     *        A list of the identifiers of the public keys in the key group.
     */

    public void setItems(java.util.Collection<String> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<String>(items);
    }

    /**
     * <p>
     * A list of the identifiers of the public keys in the key group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A list of the identifiers of the public keys in the key group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyGroupConfig withItems(String... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<String>(items.length));
        }
        for (String ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the identifiers of the public keys in the key group.
     * </p>
     * 
     * @param items
     *        A list of the identifiers of the public keys in the key group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyGroupConfig withItems(java.util.Collection<String> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * A comment to describe the key group. The comment cannot be longer than 128 characters.
     * </p>
     * 
     * @param comment
     *        A comment to describe the key group. The comment cannot be longer than 128 characters.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A comment to describe the key group. The comment cannot be longer than 128 characters.
     * </p>
     * 
     * @return A comment to describe the key group. The comment cannot be longer than 128 characters.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * A comment to describe the key group. The comment cannot be longer than 128 characters.
     * </p>
     * 
     * @param comment
     *        A comment to describe the key group. The comment cannot be longer than 128 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyGroupConfig withComment(String comment) {
        setComment(comment);
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
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyGroupConfig == false)
            return false;
        KeyGroupConfig other = (KeyGroupConfig) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public KeyGroupConfig clone() {
        try {
            return (KeyGroupConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
