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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A map containing a priority as a key, and recovery method name as a value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/RecoveryOptionType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecoveryOptionType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A positive integer specifying priority of a method with 1 being the highest priority.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * Specifies the recovery method for a user.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A positive integer specifying priority of a method with 1 being the highest priority.
     * </p>
     * 
     * @param priority
     *        A positive integer specifying priority of a method with 1 being the highest priority.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * A positive integer specifying priority of a method with 1 being the highest priority.
     * </p>
     * 
     * @return A positive integer specifying priority of a method with 1 being the highest priority.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * A positive integer specifying priority of a method with 1 being the highest priority.
     * </p>
     * 
     * @param priority
     *        A positive integer specifying priority of a method with 1 being the highest priority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryOptionType withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * Specifies the recovery method for a user.
     * </p>
     * 
     * @param name
     *        Specifies the recovery method for a user.
     * @see RecoveryOptionNameType
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the recovery method for a user.
     * </p>
     * 
     * @return Specifies the recovery method for a user.
     * @see RecoveryOptionNameType
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the recovery method for a user.
     * </p>
     * 
     * @param name
     *        Specifies the recovery method for a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecoveryOptionNameType
     */

    public RecoveryOptionType withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the recovery method for a user.
     * </p>
     * 
     * @param name
     *        Specifies the recovery method for a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecoveryOptionNameType
     */

    public RecoveryOptionType withName(RecoveryOptionNameType name) {
        this.name = name.toString();
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
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecoveryOptionType == false)
            return false;
        RecoveryOptionType other = (RecoveryOptionType) obj;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public RecoveryOptionType clone() {
        try {
            return (RecoveryOptionType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.RecoveryOptionTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
