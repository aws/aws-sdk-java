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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about an Elastic Load Balancing resource limit for your AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/Limit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Limit implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the limit. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * classic-listeners
     * </p>
     * </li>
     * <li>
     * <p>
     * classic-load-balancers
     * </p>
     * </li>
     * <li>
     * <p>
     * classic-registered-instances
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * The maximum value of the limit.
     * </p>
     */
    private String max;

    /**
     * <p>
     * The name of the limit. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * classic-listeners
     * </p>
     * </li>
     * <li>
     * <p>
     * classic-load-balancers
     * </p>
     * </li>
     * <li>
     * <p>
     * classic-registered-instances
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the limit. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        classic-listeners
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        classic-load-balancers
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        classic-registered-instances
     *        </p>
     *        </li>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the limit. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * classic-listeners
     * </p>
     * </li>
     * <li>
     * <p>
     * classic-load-balancers
     * </p>
     * </li>
     * <li>
     * <p>
     * classic-registered-instances
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the limit. The possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         classic-listeners
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         classic-load-balancers
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         classic-registered-instances
     *         </p>
     *         </li>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the limit. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * classic-listeners
     * </p>
     * </li>
     * <li>
     * <p>
     * classic-load-balancers
     * </p>
     * </li>
     * <li>
     * <p>
     * classic-registered-instances
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the limit. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        classic-listeners
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        classic-load-balancers
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        classic-registered-instances
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Limit withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The maximum value of the limit.
     * </p>
     * 
     * @param max
     *        The maximum value of the limit.
     */

    public void setMax(String max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum value of the limit.
     * </p>
     * 
     * @return The maximum value of the limit.
     */

    public String getMax() {
        return this.max;
    }

    /**
     * <p>
     * The maximum value of the limit.
     * </p>
     * 
     * @param max
     *        The maximum value of the limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Limit withMax(String max) {
        setMax(max);
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
        if (getMax() != null)
            sb.append("Max: ").append(getMax());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Limit == false)
            return false;
        Limit other = (Limit) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        return hashCode;
    }

    @Override
    public Limit clone() {
        try {
            return (Limit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
