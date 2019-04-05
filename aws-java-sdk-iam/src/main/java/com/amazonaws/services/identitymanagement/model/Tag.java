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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A structure that represents user-provided metadata that can be associated with a resource such as an IAM user or
 * role. For more information about tagging, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the <i>IAM User
 * Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/Tag" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tag implements Serializable, Cloneable {

    /**
     * <p>
     * The key name that can be used to look up or retrieve the associated value. For example, <code>Department</code>
     * or <code>Cost Center</code> are common choices.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value associated with this tag. For example, tags with a key name of <code>Department</code> could have
     * values such as <code>Human Resources</code>, <code>Accounting</code>, and <code>Support</code>. Tags with a key
     * name of <code>Cost Center</code> might have values that consist of the number associated with the different cost
     * centers in your company. Typically, many resources have tags with the same key name but with different values.
     * </p>
     * <note>
     * <p>
     * AWS always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store
     * comma-separated values in the string. However, you must interpret the value in your code.
     * </p>
     * </note>
     */
    private String value;

    /**
     * <p>
     * The key name that can be used to look up or retrieve the associated value. For example, <code>Department</code>
     * or <code>Cost Center</code> are common choices.
     * </p>
     * 
     * @param key
     *        The key name that can be used to look up or retrieve the associated value. For example,
     *        <code>Department</code> or <code>Cost Center</code> are common choices.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key name that can be used to look up or retrieve the associated value. For example, <code>Department</code>
     * or <code>Cost Center</code> are common choices.
     * </p>
     * 
     * @return The key name that can be used to look up or retrieve the associated value. For example,
     *         <code>Department</code> or <code>Cost Center</code> are common choices.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key name that can be used to look up or retrieve the associated value. For example, <code>Department</code>
     * or <code>Cost Center</code> are common choices.
     * </p>
     * 
     * @param key
     *        The key name that can be used to look up or retrieve the associated value. For example,
     *        <code>Department</code> or <code>Cost Center</code> are common choices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value associated with this tag. For example, tags with a key name of <code>Department</code> could have
     * values such as <code>Human Resources</code>, <code>Accounting</code>, and <code>Support</code>. Tags with a key
     * name of <code>Cost Center</code> might have values that consist of the number associated with the different cost
     * centers in your company. Typically, many resources have tags with the same key name but with different values.
     * </p>
     * <note>
     * <p>
     * AWS always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store
     * comma-separated values in the string. However, you must interpret the value in your code.
     * </p>
     * </note>
     * 
     * @param value
     *        The value associated with this tag. For example, tags with a key name of <code>Department</code> could
     *        have values such as <code>Human Resources</code>, <code>Accounting</code>, and <code>Support</code>. Tags
     *        with a key name of <code>Cost Center</code> might have values that consist of the number associated with
     *        the different cost centers in your company. Typically, many resources have tags with the same key name but
     *        with different values.</p> <note>
     *        <p>
     *        AWS always interprets the tag <code>Value</code> as a single string. If you need to store an array, you
     *        can store comma-separated values in the string. However, you must interpret the value in your code.
     *        </p>
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value associated with this tag. For example, tags with a key name of <code>Department</code> could have
     * values such as <code>Human Resources</code>, <code>Accounting</code>, and <code>Support</code>. Tags with a key
     * name of <code>Cost Center</code> might have values that consist of the number associated with the different cost
     * centers in your company. Typically, many resources have tags with the same key name but with different values.
     * </p>
     * <note>
     * <p>
     * AWS always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store
     * comma-separated values in the string. However, you must interpret the value in your code.
     * </p>
     * </note>
     * 
     * @return The value associated with this tag. For example, tags with a key name of <code>Department</code> could
     *         have values such as <code>Human Resources</code>, <code>Accounting</code>, and <code>Support</code>. Tags
     *         with a key name of <code>Cost Center</code> might have values that consist of the number associated with
     *         the different cost centers in your company. Typically, many resources have tags with the same key name
     *         but with different values.</p> <note>
     *         <p>
     *         AWS always interprets the tag <code>Value</code> as a single string. If you need to store an array, you
     *         can store comma-separated values in the string. However, you must interpret the value in your code.
     *         </p>
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value associated with this tag. For example, tags with a key name of <code>Department</code> could have
     * values such as <code>Human Resources</code>, <code>Accounting</code>, and <code>Support</code>. Tags with a key
     * name of <code>Cost Center</code> might have values that consist of the number associated with the different cost
     * centers in your company. Typically, many resources have tags with the same key name but with different values.
     * </p>
     * <note>
     * <p>
     * AWS always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store
     * comma-separated values in the string. However, you must interpret the value in your code.
     * </p>
     * </note>
     * 
     * @param value
     *        The value associated with this tag. For example, tags with a key name of <code>Department</code> could
     *        have values such as <code>Human Resources</code>, <code>Accounting</code>, and <code>Support</code>. Tags
     *        with a key name of <code>Cost Center</code> might have values that consist of the number associated with
     *        the different cost centers in your company. Typically, many resources have tags with the same key name but
     *        with different values.</p> <note>
     *        <p>
     *        AWS always interprets the tag <code>Value</code> as a single string. If you need to store an array, you
     *        can store comma-separated values in the string. However, you must interpret the value in your code.
     *        </p>
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
