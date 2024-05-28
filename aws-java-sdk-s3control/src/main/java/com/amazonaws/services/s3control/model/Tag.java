/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An Amazon Web Services resource tag that's associated with your S3 resource. You can add tags to new objects when you
 * upload them, or you can add object tags to existing objects.
 * </p>
 * <note>
 * <p>
 * This operation is only supported for <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage-lens-groups.html">S3 Storage Lens groups</a> and
 * for <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-grants-tagging.html">S3 Access Grants</a>.
 * The tagged resource can be an S3 Storage Lens group or S3 Access Grants instance, registered location, or grant.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/Tag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tag implements Serializable, Cloneable {

    /**
     * <p>
     * The key of the key-value pair of a tag added to your Amazon Web Services resource. A tag key can be up to 128
     * Unicode characters in length and is case-sensitive. System created tags that begin with <code>aws:</code> aren’t
     * supported.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value of the key-value pair of a tag added to your Amazon Web Services resource. A tag value can be up to 256
     * Unicode characters in length and is case-sensitive.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The key of the key-value pair of a tag added to your Amazon Web Services resource. A tag key can be up to 128
     * Unicode characters in length and is case-sensitive. System created tags that begin with <code>aws:</code> aren’t
     * supported.
     * </p>
     * 
     * @param key
     *        The key of the key-value pair of a tag added to your Amazon Web Services resource. A tag key can be up to
     *        128 Unicode characters in length and is case-sensitive. System created tags that begin with
     *        <code>aws:</code> aren’t supported.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key of the key-value pair of a tag added to your Amazon Web Services resource. A tag key can be up to 128
     * Unicode characters in length and is case-sensitive. System created tags that begin with <code>aws:</code> aren’t
     * supported.
     * </p>
     * 
     * @return The key of the key-value pair of a tag added to your Amazon Web Services resource. A tag key can be up to
     *         128 Unicode characters in length and is case-sensitive. System created tags that begin with
     *         <code>aws:</code> aren’t supported.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key of the key-value pair of a tag added to your Amazon Web Services resource. A tag key can be up to 128
     * Unicode characters in length and is case-sensitive. System created tags that begin with <code>aws:</code> aren’t
     * supported.
     * </p>
     * 
     * @param key
     *        The key of the key-value pair of a tag added to your Amazon Web Services resource. A tag key can be up to
     *        128 Unicode characters in length and is case-sensitive. System created tags that begin with
     *        <code>aws:</code> aren’t supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value of the key-value pair of a tag added to your Amazon Web Services resource. A tag value can be up to 256
     * Unicode characters in length and is case-sensitive.
     * </p>
     * 
     * @param value
     *        The value of the key-value pair of a tag added to your Amazon Web Services resource. A tag value can be up
     *        to 256 Unicode characters in length and is case-sensitive.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the key-value pair of a tag added to your Amazon Web Services resource. A tag value can be up to 256
     * Unicode characters in length and is case-sensitive.
     * </p>
     * 
     * @return The value of the key-value pair of a tag added to your Amazon Web Services resource. A tag value can be
     *         up to 256 Unicode characters in length and is case-sensitive.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the key-value pair of a tag added to your Amazon Web Services resource. A tag value can be up to 256
     * Unicode characters in length and is case-sensitive.
     * </p>
     * 
     * @param value
     *        The value of the key-value pair of a tag added to your Amazon Web Services resource. A tag value can be up
     *        to 256 Unicode characters in length and is case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withValue(String value) {
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
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

        if (obj instanceof Tag == false)
            return false;
        Tag other = (Tag) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
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

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Tag clone() {
        try {
            return (Tag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
