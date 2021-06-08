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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Filter the selection by using a condition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The condition accepts before or after a specified time, equal to a string, or equal to an integer.
     * </p>
     */
    private Condition condition;
    /**
     * <p>
     * The key that you're filtering on.
     * </p>
     */
    private String key;

    /**
     * <p>
     * The condition accepts before or after a specified time, equal to a string, or equal to an integer.
     * </p>
     * 
     * @param condition
     *        The condition accepts before or after a specified time, equal to a string, or equal to an integer.
     */

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The condition accepts before or after a specified time, equal to a string, or equal to an integer.
     * </p>
     * 
     * @return The condition accepts before or after a specified time, equal to a string, or equal to an integer.
     */

    public Condition getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * The condition accepts before or after a specified time, equal to a string, or equal to an integer.
     * </p>
     * 
     * @param condition
     *        The condition accepts before or after a specified time, equal to a string, or equal to an integer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withCondition(Condition condition) {
        setCondition(condition);
        return this;
    }

    /**
     * <p>
     * The key that you're filtering on.
     * </p>
     * 
     * @param key
     *        The key that you're filtering on.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key that you're filtering on.
     * </p>
     * 
     * @return The key that you're filtering on.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key that you're filtering on.
     * </p>
     * 
     * @param key
     *        The key that you're filtering on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withKey(String key) {
        setKey(key);
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
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
