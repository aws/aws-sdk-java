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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The Tag type enables you to specify a key-value pair that can be used to store information about an AWS
 * CloudFormation stack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/Tag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tag implements Serializable, Cloneable {

    /**
     * <p>
     * <i>Required</i>. A string used to identify this tag. You can specify a maximum of 128 characters for a tag key.
     * Tags owned by Amazon Web Services (AWS) have the reserved prefix: <code>aws:</code>.
     * </p>
     */
    private String key;
    /**
     * <p>
     * <i>Required</i>. A string containing the value for this tag. You can specify a maximum of 256 characters for a
     * tag value.
     * </p>
     */
    private String value;

    /**
     * <p>
     * <i>Required</i>. A string used to identify this tag. You can specify a maximum of 128 characters for a tag key.
     * Tags owned by Amazon Web Services (AWS) have the reserved prefix: <code>aws:</code>.
     * </p>
     * 
     * @param key
     *        <i>Required</i>. A string used to identify this tag. You can specify a maximum of 128 characters for a tag
     *        key. Tags owned by Amazon Web Services (AWS) have the reserved prefix: <code>aws:</code>.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * <i>Required</i>. A string used to identify this tag. You can specify a maximum of 128 characters for a tag key.
     * Tags owned by Amazon Web Services (AWS) have the reserved prefix: <code>aws:</code>.
     * </p>
     * 
     * @return <i>Required</i>. A string used to identify this tag. You can specify a maximum of 128 characters for a
     *         tag key. Tags owned by Amazon Web Services (AWS) have the reserved prefix: <code>aws:</code>.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * <i>Required</i>. A string used to identify this tag. You can specify a maximum of 128 characters for a tag key.
     * Tags owned by Amazon Web Services (AWS) have the reserved prefix: <code>aws:</code>.
     * </p>
     * 
     * @param key
     *        <i>Required</i>. A string used to identify this tag. You can specify a maximum of 128 characters for a tag
     *        key. Tags owned by Amazon Web Services (AWS) have the reserved prefix: <code>aws:</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * <i>Required</i>. A string containing the value for this tag. You can specify a maximum of 256 characters for a
     * tag value.
     * </p>
     * 
     * @param value
     *        <i>Required</i>. A string containing the value for this tag. You can specify a maximum of 256 characters
     *        for a tag value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * <i>Required</i>. A string containing the value for this tag. You can specify a maximum of 256 characters for a
     * tag value.
     * </p>
     * 
     * @return <i>Required</i>. A string containing the value for this tag. You can specify a maximum of 256 characters
     *         for a tag value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * <i>Required</i>. A string containing the value for this tag. You can specify a maximum of 256 characters for a
     * tag value.
     * </p>
     * 
     * @param value
     *        <i>Required</i>. A string containing the value for this tag. You can specify a maximum of 256 characters
     *        for a tag value.
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
