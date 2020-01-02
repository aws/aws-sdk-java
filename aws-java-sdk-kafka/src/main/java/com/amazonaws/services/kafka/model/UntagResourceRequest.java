/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UntagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UntagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the resource that's associated with the tags.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Tag keys must be unique for a given cluster. In addition, the following restrictions apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Each tag key must be unique. If you add a tag with a key that's already in use, your new tag overwrites the
     * existing key-value pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't start a tag key with aws: because this prefix is reserved for use by AWS. AWS creates tags that begin
     * with this prefix on your behalf, but you can't edit or delete them.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys must be between 1 and 128 Unicode characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys must consist of the following characters: Unicode letters, digits, white space, and the following
     * special characters: _ . / = + -
     * 
     * @.</p> </li>
     *        </ul>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the resource that's associated with the tags.
     * </p>
     * 
     * @param resourceArn
     *        <p>
     *        The Amazon Resource Name (ARN) that uniquely identifies the resource that's associated with the tags.
     *        </p>
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the resource that's associated with the tags.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) that uniquely identifies the resource that's associated with the tags.
     *         </p>
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the resource that's associated with the tags.
     * </p>
     * 
     * @param resourceArn
     *        <p>
     *        The Amazon Resource Name (ARN) that uniquely identifies the resource that's associated with the tags.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Tag keys must be unique for a given cluster. In addition, the following restrictions apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Each tag key must be unique. If you add a tag with a key that's already in use, your new tag overwrites the
     * existing key-value pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't start a tag key with aws: because this prefix is reserved for use by AWS. AWS creates tags that begin
     * with this prefix on your behalf, but you can't edit or delete them.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys must be between 1 and 128 Unicode characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys must consist of the following characters: Unicode letters, digits, white space, and the following
     * special characters: _ . / = + -
     * 
     * @.</p> </li>
     *        </ul>
     * @return <p>
     *         Tag keys must be unique for a given cluster. In addition, the following restrictions apply:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Each tag key must be unique. If you add a tag with a key that's already in use, your new tag overwrites
     *         the existing key-value pair.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't start a tag key with aws: because this prefix is reserved for use by AWS. AWS creates tags that
     *         begin with this prefix on your behalf, but you can't edit or delete them.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tag keys must be between 1 and 128 Unicode characters in length.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tag keys must consist of the following characters: Unicode letters, digits, white space, and the
     *         following special characters: _ . / = + -
     * @.</p> </li>
     *        </ul>
     */

    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * Tag keys must be unique for a given cluster. In addition, the following restrictions apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Each tag key must be unique. If you add a tag with a key that's already in use, your new tag overwrites the
     * existing key-value pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't start a tag key with aws: because this prefix is reserved for use by AWS. AWS creates tags that begin
     * with this prefix on your behalf, but you can't edit or delete them.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys must be between 1 and 128 Unicode characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys must consist of the following characters: Unicode letters, digits, white space, and the following
     * special characters: _ . / = + -
     * 
     * @.</p> </li>
     *        </ul>
     * @param tagKeys
     *        <p>
     *        Tag keys must be unique for a given cluster. In addition, the following restrictions apply:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Each tag key must be unique. If you add a tag with a key that's already in use, your new tag overwrites
     *        the existing key-value pair.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can't start a tag key with aws: because this prefix is reserved for use by AWS. AWS creates tags that
     *        begin with this prefix on your behalf, but you can't edit or delete them.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys must be between 1 and 128 Unicode characters in length.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys must consist of the following characters: Unicode letters, digits, white space, and the following
     *        special characters: _ . / = + -
     * @.</p> </li>
     *        </ul>
     */

    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new java.util.ArrayList<String>(tagKeys);
    }

    /**
     * <p>
     * Tag keys must be unique for a given cluster. In addition, the following restrictions apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Each tag key must be unique. If you add a tag with a key that's already in use, your new tag overwrites the
     * existing key-value pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't start a tag key with aws: because this prefix is reserved for use by AWS. AWS creates tags that begin
     * with this prefix on your behalf, but you can't edit or delete them.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys must be between 1 and 128 Unicode characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys must consist of the following characters: Unicode letters, digits, white space, and the following
     * special characters: _ . / = + -
     * 
     * @.</p> </li>
     *        </ul>
     * 
     *        <p>
     *        <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     *        {@link #setTagKeys(java.util.Collection)} or {@link #withTagKeys(java.util.Collection)} if you want to
     *        override the existing values.
     *        </p>
     * @param tagKeys
     *        <p>
     *        Tag keys must be unique for a given cluster. In addition, the following restrictions apply:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Each tag key must be unique. If you add a tag with a key that's already in use, your new tag overwrites
     *        the existing key-value pair.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can't start a tag key with aws: because this prefix is reserved for use by AWS. AWS creates tags that
     *        begin with this prefix on your behalf, but you can't edit or delete them.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys must be between 1 and 128 Unicode characters in length.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys must consist of the following characters: Unicode letters, digits, white space, and the following
     *        special characters: _ . / = + -
     * @.</p> </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withTagKeys(String... tagKeys) {
        if (this.tagKeys == null) {
            setTagKeys(new java.util.ArrayList<String>(tagKeys.length));
        }
        for (String ele : tagKeys) {
            this.tagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tag keys must be unique for a given cluster. In addition, the following restrictions apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Each tag key must be unique. If you add a tag with a key that's already in use, your new tag overwrites the
     * existing key-value pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't start a tag key with aws: because this prefix is reserved for use by AWS. AWS creates tags that begin
     * with this prefix on your behalf, but you can't edit or delete them.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys must be between 1 and 128 Unicode characters in length.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys must consist of the following characters: Unicode letters, digits, white space, and the following
     * special characters: _ . / = + -
     * 
     * @.</p> </li>
     *        </ul>
     * @param tagKeys
     *        <p>
     *        Tag keys must be unique for a given cluster. In addition, the following restrictions apply:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Each tag key must be unique. If you add a tag with a key that's already in use, your new tag overwrites
     *        the existing key-value pair.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can't start a tag key with aws: because this prefix is reserved for use by AWS. AWS creates tags that
     *        begin with this prefix on your behalf, but you can't edit or delete them.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys must be between 1 and 128 Unicode characters in length.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys must consist of the following characters: Unicode letters, digits, white space, and the following
     *        special characters: _ . / = + -
     * @.</p> </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getTagKeys() != null)
            sb.append("TagKeys: ").append(getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagResourceRequest == false)
            return false;
        UntagResourceRequest other = (UntagResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public UntagResourceRequest clone() {
        return (UntagResourceRequest) super.clone();
    }

}
