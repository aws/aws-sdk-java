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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with the
 * key-value pair ‘Department’:’Sales’ might be added to a resource to indicate its use by a particular department.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/Tag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The initial part of a key-value pair that forms a tag associated with a given resource. For instance, if you want
     * to show which resources are used by which departments, you might use “Department” as the key portion of the pair,
     * with multiple possible values such as “sales,” “legal,” and “administration.”
     * </p>
     */
    private String key;
    /**
     * <p>
     * The second part of a key-value pair that forms a tag associated with a given resource. For instance, if you want
     * to show which resources are used by which departments, you might use “Department” as the initial (key) portion of
     * the pair, with a value of “sales” to indicate the sales department.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The initial part of a key-value pair that forms a tag associated with a given resource. For instance, if you want
     * to show which resources are used by which departments, you might use “Department” as the key portion of the pair,
     * with multiple possible values such as “sales,” “legal,” and “administration.”
     * </p>
     * 
     * @param key
     *        The initial part of a key-value pair that forms a tag associated with a given resource. For instance, if
     *        you want to show which resources are used by which departments, you might use “Department” as the key
     *        portion of the pair, with multiple possible values such as “sales,” “legal,” and “administration.”
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The initial part of a key-value pair that forms a tag associated with a given resource. For instance, if you want
     * to show which resources are used by which departments, you might use “Department” as the key portion of the pair,
     * with multiple possible values such as “sales,” “legal,” and “administration.”
     * </p>
     * 
     * @return The initial part of a key-value pair that forms a tag associated with a given resource. For instance, if
     *         you want to show which resources are used by which departments, you might use “Department” as the key
     *         portion of the pair, with multiple possible values such as “sales,” “legal,” and “administration.”
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The initial part of a key-value pair that forms a tag associated with a given resource. For instance, if you want
     * to show which resources are used by which departments, you might use “Department” as the key portion of the pair,
     * with multiple possible values such as “sales,” “legal,” and “administration.”
     * </p>
     * 
     * @param key
     *        The initial part of a key-value pair that forms a tag associated with a given resource. For instance, if
     *        you want to show which resources are used by which departments, you might use “Department” as the key
     *        portion of the pair, with multiple possible values such as “sales,” “legal,” and “administration.”
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The second part of a key-value pair that forms a tag associated with a given resource. For instance, if you want
     * to show which resources are used by which departments, you might use “Department” as the initial (key) portion of
     * the pair, with a value of “sales” to indicate the sales department.
     * </p>
     * 
     * @param value
     *        The second part of a key-value pair that forms a tag associated with a given resource. For instance, if
     *        you want to show which resources are used by which departments, you might use “Department” as the initial
     *        (key) portion of the pair, with a value of “sales” to indicate the sales department.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The second part of a key-value pair that forms a tag associated with a given resource. For instance, if you want
     * to show which resources are used by which departments, you might use “Department” as the initial (key) portion of
     * the pair, with a value of “sales” to indicate the sales department.
     * </p>
     * 
     * @return The second part of a key-value pair that forms a tag associated with a given resource. For instance, if
     *         you want to show which resources are used by which departments, you might use “Department” as the initial
     *         (key) portion of the pair, with a value of “sales” to indicate the sales department.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The second part of a key-value pair that forms a tag associated with a given resource. For instance, if you want
     * to show which resources are used by which departments, you might use “Department” as the initial (key) portion of
     * the pair, with a value of “sales” to indicate the sales department.
     * </p>
     * 
     * @param value
     *        The second part of a key-value pair that forms a tag associated with a given resource. For instance, if
     *        you want to show which resources are used by which departments, you might use “Department” as the initial
     *        (key) portion of the pair, with a value of “sales” to indicate the sales department.
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
        com.amazonaws.services.comprehend.model.transform.TagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
