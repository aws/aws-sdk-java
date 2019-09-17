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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a cipher used in a policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/Cipher" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Cipher implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cipher.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The priority of the cipher.
     * </p>
     */
    private Integer priority;

    /**
     * <p>
     * The name of the cipher.
     * </p>
     * 
     * @param name
     *        The name of the cipher.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the cipher.
     * </p>
     * 
     * @return The name of the cipher.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the cipher.
     * </p>
     * 
     * @param name
     *        The name of the cipher.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cipher withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The priority of the cipher.
     * </p>
     * 
     * @param priority
     *        The priority of the cipher.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority of the cipher.
     * </p>
     * 
     * @return The priority of the cipher.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority of the cipher.
     * </p>
     * 
     * @param priority
     *        The priority of the cipher.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cipher withPriority(Integer priority) {
        setPriority(priority);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Cipher == false)
            return false;
        Cipher other = (Cipher) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        return hashCode;
    }

    @Override
    public Cipher clone() {
        try {
            return (Cipher) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
