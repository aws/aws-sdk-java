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
 * Context information that enables AWS CloudFormation to uniquely identify a resource. AWS CloudFormation uses context
 * key-value pairs in cases where a resource's logical and physical IDs are not enough to uniquely identify that
 * resource. Each context key-value pair specifies a resource that contains the targeted resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/PhysicalResourceIdContextKeyValuePair"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhysicalResourceIdContextKeyValuePair implements Serializable, Cloneable {

    /**
     * <p>
     * The resource context key.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The resource context value.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The resource context key.
     * </p>
     * 
     * @param key
     *        The resource context key.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The resource context key.
     * </p>
     * 
     * @return The resource context key.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The resource context key.
     * </p>
     * 
     * @param key
     *        The resource context key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResourceIdContextKeyValuePair withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The resource context value.
     * </p>
     * 
     * @param value
     *        The resource context value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The resource context value.
     * </p>
     * 
     * @return The resource context value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The resource context value.
     * </p>
     * 
     * @param value
     *        The resource context value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResourceIdContextKeyValuePair withValue(String value) {
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

        if (obj instanceof PhysicalResourceIdContextKeyValuePair == false)
            return false;
        PhysicalResourceIdContextKeyValuePair other = (PhysicalResourceIdContextKeyValuePair) obj;
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
    public PhysicalResourceIdContextKeyValuePair clone() {
        try {
            return (PhysicalResourceIdContextKeyValuePair) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
