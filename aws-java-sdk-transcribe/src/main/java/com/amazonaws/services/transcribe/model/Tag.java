/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Adds metadata, in the form of a key:value pair, to the specified resource.
 * </p>
 * <p>
 * For example, you could add the tag <code>Department:Sales</code> to a resource to indicate that it pertains to your
 * organization's sales department. You can also use tags for tag-based access control.
 * </p>
 * <p>
 * To learn more about tagging, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging
 * resources</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/Tag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The first part of a key:value pair that forms a tag associated with a given resource. For example, in the tag
     * <code>Department:Sales</code>, the key is 'Department'.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The second part of a key:value pair that forms a tag associated with a given resource. For example, in the tag
     * <code>Department:Sales</code>, the value is 'Sales'.
     * </p>
     * <p>
     * Note that you can set the value of a tag to an empty string, but you can't set the value of a tag to null.
     * Omitting the tag value is the same as using an empty string.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The first part of a key:value pair that forms a tag associated with a given resource. For example, in the tag
     * <code>Department:Sales</code>, the key is 'Department'.
     * </p>
     * 
     * @param key
     *        The first part of a key:value pair that forms a tag associated with a given resource. For example, in the
     *        tag <code>Department:Sales</code>, the key is 'Department'.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The first part of a key:value pair that forms a tag associated with a given resource. For example, in the tag
     * <code>Department:Sales</code>, the key is 'Department'.
     * </p>
     * 
     * @return The first part of a key:value pair that forms a tag associated with a given resource. For example, in the
     *         tag <code>Department:Sales</code>, the key is 'Department'.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The first part of a key:value pair that forms a tag associated with a given resource. For example, in the tag
     * <code>Department:Sales</code>, the key is 'Department'.
     * </p>
     * 
     * @param key
     *        The first part of a key:value pair that forms a tag associated with a given resource. For example, in the
     *        tag <code>Department:Sales</code>, the key is 'Department'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The second part of a key:value pair that forms a tag associated with a given resource. For example, in the tag
     * <code>Department:Sales</code>, the value is 'Sales'.
     * </p>
     * <p>
     * Note that you can set the value of a tag to an empty string, but you can't set the value of a tag to null.
     * Omitting the tag value is the same as using an empty string.
     * </p>
     * 
     * @param value
     *        The second part of a key:value pair that forms a tag associated with a given resource. For example, in the
     *        tag <code>Department:Sales</code>, the value is 'Sales'.</p>
     *        <p>
     *        Note that you can set the value of a tag to an empty string, but you can't set the value of a tag to null.
     *        Omitting the tag value is the same as using an empty string.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The second part of a key:value pair that forms a tag associated with a given resource. For example, in the tag
     * <code>Department:Sales</code>, the value is 'Sales'.
     * </p>
     * <p>
     * Note that you can set the value of a tag to an empty string, but you can't set the value of a tag to null.
     * Omitting the tag value is the same as using an empty string.
     * </p>
     * 
     * @return The second part of a key:value pair that forms a tag associated with a given resource. For example, in
     *         the tag <code>Department:Sales</code>, the value is 'Sales'.</p>
     *         <p>
     *         Note that you can set the value of a tag to an empty string, but you can't set the value of a tag to
     *         null. Omitting the tag value is the same as using an empty string.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The second part of a key:value pair that forms a tag associated with a given resource. For example, in the tag
     * <code>Department:Sales</code>, the value is 'Sales'.
     * </p>
     * <p>
     * Note that you can set the value of a tag to an empty string, but you can't set the value of a tag to null.
     * Omitting the tag value is the same as using an empty string.
     * </p>
     * 
     * @param value
     *        The second part of a key:value pair that forms a tag associated with a given resource. For example, in the
     *        tag <code>Department:Sales</code>, the value is 'Sales'.</p>
     *        <p>
     *        Note that you can set the value of a tag to an empty string, but you can't set the value of a tag to null.
     *        Omitting the tag value is the same as using an empty string.
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
        com.amazonaws.services.transcribe.model.transform.TagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
