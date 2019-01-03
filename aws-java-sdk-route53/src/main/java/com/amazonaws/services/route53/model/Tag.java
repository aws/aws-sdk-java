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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains information about a tag that you want to add or edit for the specified health check or
 * hosted zone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/Tag" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tag implements Serializable, Cloneable {

    /**
     * <p>
     * The value of <code>Key</code> depends on the operation that you want to perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Add a tag to a health check or hosted zone</b>: <code>Key</code> is the name that you want to give the new
     * tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Edit a tag</b>: <code>Key</code> is the name of the tag that you want to change the <code>Value</code> for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> Delete a key</b>: <code>Key</code> is the name of the tag you want to remove.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Give a name to a health check</b>: Edit the default <code>Name</code> tag. In the Amazon Route 53 console, the
     * list of your health checks includes a <b>Name</b> column that lets you see the name that you've given to each
     * health check.
     * </p>
     * </li>
     * </ul>
     */
    private String key;
    /**
     * <p>
     * The value of <code>Value</code> depends on the operation that you want to perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Add a tag to a health check or hosted zone</b>: <code>Value</code> is the value that you want to give the new
     * tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Edit a tag</b>: <code>Value</code> is the new value that you want to assign the tag.
     * </p>
     * </li>
     * </ul>
     */
    private String value;

    /**
     * <p>
     * The value of <code>Key</code> depends on the operation that you want to perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Add a tag to a health check or hosted zone</b>: <code>Key</code> is the name that you want to give the new
     * tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Edit a tag</b>: <code>Key</code> is the name of the tag that you want to change the <code>Value</code> for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> Delete a key</b>: <code>Key</code> is the name of the tag you want to remove.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Give a name to a health check</b>: Edit the default <code>Name</code> tag. In the Amazon Route 53 console, the
     * list of your health checks includes a <b>Name</b> column that lets you see the name that you've given to each
     * health check.
     * </p>
     * </li>
     * </ul>
     * 
     * @param key
     *        The value of <code>Key</code> depends on the operation that you want to perform:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Add a tag to a health check or hosted zone</b>: <code>Key</code> is the name that you want to give the
     *        new tag.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Edit a tag</b>: <code>Key</code> is the name of the tag that you want to change the <code>Value</code>
     *        for.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> Delete a key</b>: <code>Key</code> is the name of the tag you want to remove.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Give a name to a health check</b>: Edit the default <code>Name</code> tag. In the Amazon Route 53
     *        console, the list of your health checks includes a <b>Name</b> column that lets you see the name that
     *        you've given to each health check.
     *        </p>
     *        </li>
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The value of <code>Key</code> depends on the operation that you want to perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Add a tag to a health check or hosted zone</b>: <code>Key</code> is the name that you want to give the new
     * tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Edit a tag</b>: <code>Key</code> is the name of the tag that you want to change the <code>Value</code> for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> Delete a key</b>: <code>Key</code> is the name of the tag you want to remove.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Give a name to a health check</b>: Edit the default <code>Name</code> tag. In the Amazon Route 53 console, the
     * list of your health checks includes a <b>Name</b> column that lets you see the name that you've given to each
     * health check.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The value of <code>Key</code> depends on the operation that you want to perform:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Add a tag to a health check or hosted zone</b>: <code>Key</code> is the name that you want to give the
     *         new tag.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Edit a tag</b>: <code>Key</code> is the name of the tag that you want to change the <code>Value</code>
     *         for.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> Delete a key</b>: <code>Key</code> is the name of the tag you want to remove.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Give a name to a health check</b>: Edit the default <code>Name</code> tag. In the Amazon Route 53
     *         console, the list of your health checks includes a <b>Name</b> column that lets you see the name that
     *         you've given to each health check.
     *         </p>
     *         </li>
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The value of <code>Key</code> depends on the operation that you want to perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Add a tag to a health check or hosted zone</b>: <code>Key</code> is the name that you want to give the new
     * tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Edit a tag</b>: <code>Key</code> is the name of the tag that you want to change the <code>Value</code> for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> Delete a key</b>: <code>Key</code> is the name of the tag you want to remove.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Give a name to a health check</b>: Edit the default <code>Name</code> tag. In the Amazon Route 53 console, the
     * list of your health checks includes a <b>Name</b> column that lets you see the name that you've given to each
     * health check.
     * </p>
     * </li>
     * </ul>
     * 
     * @param key
     *        The value of <code>Key</code> depends on the operation that you want to perform:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Add a tag to a health check or hosted zone</b>: <code>Key</code> is the name that you want to give the
     *        new tag.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Edit a tag</b>: <code>Key</code> is the name of the tag that you want to change the <code>Value</code>
     *        for.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> Delete a key</b>: <code>Key</code> is the name of the tag you want to remove.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Give a name to a health check</b>: Edit the default <code>Name</code> tag. In the Amazon Route 53
     *        console, the list of your health checks includes a <b>Name</b> column that lets you see the name that
     *        you've given to each health check.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value of <code>Value</code> depends on the operation that you want to perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Add a tag to a health check or hosted zone</b>: <code>Value</code> is the value that you want to give the new
     * tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Edit a tag</b>: <code>Value</code> is the new value that you want to assign the tag.
     * </p>
     * </li>
     * </ul>
     * 
     * @param value
     *        The value of <code>Value</code> depends on the operation that you want to perform:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Add a tag to a health check or hosted zone</b>: <code>Value</code> is the value that you want to give
     *        the new tag.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Edit a tag</b>: <code>Value</code> is the new value that you want to assign the tag.
     *        </p>
     *        </li>
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of <code>Value</code> depends on the operation that you want to perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Add a tag to a health check or hosted zone</b>: <code>Value</code> is the value that you want to give the new
     * tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Edit a tag</b>: <code>Value</code> is the new value that you want to assign the tag.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The value of <code>Value</code> depends on the operation that you want to perform:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Add a tag to a health check or hosted zone</b>: <code>Value</code> is the value that you want to give
     *         the new tag.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Edit a tag</b>: <code>Value</code> is the new value that you want to assign the tag.
     *         </p>
     *         </li>
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of <code>Value</code> depends on the operation that you want to perform:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Add a tag to a health check or hosted zone</b>: <code>Value</code> is the value that you want to give the new
     * tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Edit a tag</b>: <code>Value</code> is the new value that you want to assign the tag.
     * </p>
     * </li>
     * </ul>
     * 
     * @param value
     *        The value of <code>Value</code> depends on the operation that you want to perform:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Add a tag to a health check or hosted zone</b>: <code>Value</code> is the value that you want to give
     *        the new tag.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Edit a tag</b>: <code>Value</code> is the new value that you want to assign the tag.
     *        </p>
     *        </li>
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
