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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that defines the tags that are associated with a resource. A <i>tag</i> is a label that you optionally
 * define and associate with a resource in Amazon Pinpoint. Tags can help you categorize and manage resources in
 * different ways, such as by purpose, owner, environment, or other criteria. A resource can have as many as 50 tags.
 * </p>
 * <p>
 * Each tag consists of a required <i>tag key</i> and an associated <i>tag value</i>, both of which you define. A tag
 * key is a general label that acts as a category for a more specific tag value. A tag value acts as a descriptor within
 * a tag key. For example, if you have two versions of an Amazon Pinpoint project, one for internal testing and another
 * for external use, you might assign a <code>Stack</code> tag key to both projects. The value of the <code>Stack</code>
 *  tag key might be <code>Test</code> for one project and <code>Production</code> for the other project.
 * </p>
 * <p>
 * A tag key can contain as many as 128 characters. A tag value can contain as many as 256 characters. The characters
 * can be Unicode letters, digits, white space, or one of the following symbols: _ . : / = + -. The following additional
 * restrictions apply to tags:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Tag keys and values are case sensitive.
 * </p>
 * </li>
 * <li>
 * <p>
 * For each associated resource, each tag key must be unique and it can have only one value.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>aws:</code> prefix is reserved for use by AWS; you can’t use it in any tag keys or values that you define.
 * In addition, you can't edit or remove tag keys or values that use this prefix. Tags that use this prefix don’t count
 * against the limit of 50 tags per resource.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can associate tags with public or shared resources, but the tags are available only for your AWS account, not any
 * other accounts that share the resource. In addition, the tags are available only for resources that are located in
 * the specified AWS Region for your AWS account.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/Tag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One part of a key-value pair that defines a tag. The maximum length of a tag key is 128 characters. The minimum
     * length is 1 character.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The optional part of a key-value pair that defines a tag. The maximum length of a tag value is 256 characters.
     * The minimum length is 0 characters. If you don’t want a resource to have a specific tag value, don’t specify a
     * value for this parameter. Amazon Pinpoint will set the value to an empty string.
     * </p>
     */
    private String value;

    /**
     * <p>
     * One part of a key-value pair that defines a tag. The maximum length of a tag key is 128 characters. The minimum
     * length is 1 character.
     * </p>
     * 
     * @param key
     *        One part of a key-value pair that defines a tag. The maximum length of a tag key is 128 characters. The
     *        minimum length is 1 character.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * One part of a key-value pair that defines a tag. The maximum length of a tag key is 128 characters. The minimum
     * length is 1 character.
     * </p>
     * 
     * @return One part of a key-value pair that defines a tag. The maximum length of a tag key is 128 characters. The
     *         minimum length is 1 character.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * One part of a key-value pair that defines a tag. The maximum length of a tag key is 128 characters. The minimum
     * length is 1 character.
     * </p>
     * 
     * @param key
     *        One part of a key-value pair that defines a tag. The maximum length of a tag key is 128 characters. The
     *        minimum length is 1 character.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The optional part of a key-value pair that defines a tag. The maximum length of a tag value is 256 characters.
     * The minimum length is 0 characters. If you don’t want a resource to have a specific tag value, don’t specify a
     * value for this parameter. Amazon Pinpoint will set the value to an empty string.
     * </p>
     * 
     * @param value
     *        The optional part of a key-value pair that defines a tag. The maximum length of a tag value is 256
     *        characters. The minimum length is 0 characters. If you don’t want a resource to have a specific tag value,
     *        don’t specify a value for this parameter. Amazon Pinpoint will set the value to an empty string.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The optional part of a key-value pair that defines a tag. The maximum length of a tag value is 256 characters.
     * The minimum length is 0 characters. If you don’t want a resource to have a specific tag value, don’t specify a
     * value for this parameter. Amazon Pinpoint will set the value to an empty string.
     * </p>
     * 
     * @return The optional part of a key-value pair that defines a tag. The maximum length of a tag value is 256
     *         characters. The minimum length is 0 characters. If you don’t want a resource to have a specific tag
     *         value, don’t specify a value for this parameter. Amazon Pinpoint will set the value to an empty string.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The optional part of a key-value pair that defines a tag. The maximum length of a tag value is 256 characters.
     * The minimum length is 0 characters. If you don’t want a resource to have a specific tag value, don’t specify a
     * value for this parameter. Amazon Pinpoint will set the value to an empty string.
     * </p>
     * 
     * @param value
     *        The optional part of a key-value pair that defines a tag. The maximum length of a tag value is 256
     *        characters. The minimum length is 0 characters. If you don’t want a resource to have a specific tag value,
     *        don’t specify a value for this parameter. Amazon Pinpoint will set the value to an empty string.
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.TagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
