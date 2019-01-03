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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the Classic Load Balancers to attach to a Spot Fleet. Spot Fleet registers the running Spot Instances with
 * these Classic Load Balancers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ClassicLoadBalancersConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClassicLoadBalancersConfig implements Serializable, Cloneable {

    /**
     * <p>
     * One or more Classic Load Balancers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClassicLoadBalancer> classicLoadBalancers;

    /**
     * <p>
     * One or more Classic Load Balancers.
     * </p>
     * 
     * @return One or more Classic Load Balancers.
     */

    public java.util.List<ClassicLoadBalancer> getClassicLoadBalancers() {
        if (classicLoadBalancers == null) {
            classicLoadBalancers = new com.amazonaws.internal.SdkInternalList<ClassicLoadBalancer>();
        }
        return classicLoadBalancers;
    }

    /**
     * <p>
     * One or more Classic Load Balancers.
     * </p>
     * 
     * @param classicLoadBalancers
     *        One or more Classic Load Balancers.
     */

    public void setClassicLoadBalancers(java.util.Collection<ClassicLoadBalancer> classicLoadBalancers) {
        if (classicLoadBalancers == null) {
            this.classicLoadBalancers = null;
            return;
        }

        this.classicLoadBalancers = new com.amazonaws.internal.SdkInternalList<ClassicLoadBalancer>(classicLoadBalancers);
    }

    /**
     * <p>
     * One or more Classic Load Balancers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClassicLoadBalancers(java.util.Collection)} or {@link #withClassicLoadBalancers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param classicLoadBalancers
     *        One or more Classic Load Balancers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassicLoadBalancersConfig withClassicLoadBalancers(ClassicLoadBalancer... classicLoadBalancers) {
        if (this.classicLoadBalancers == null) {
            setClassicLoadBalancers(new com.amazonaws.internal.SdkInternalList<ClassicLoadBalancer>(classicLoadBalancers.length));
        }
        for (ClassicLoadBalancer ele : classicLoadBalancers) {
            this.classicLoadBalancers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Classic Load Balancers.
     * </p>
     * 
     * @param classicLoadBalancers
     *        One or more Classic Load Balancers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassicLoadBalancersConfig withClassicLoadBalancers(java.util.Collection<ClassicLoadBalancer> classicLoadBalancers) {
        setClassicLoadBalancers(classicLoadBalancers);
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
        if (getClassicLoadBalancers() != null)
            sb.append("ClassicLoadBalancers: ").append(getClassicLoadBalancers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassicLoadBalancersConfig == false)
            return false;
        ClassicLoadBalancersConfig other = (ClassicLoadBalancersConfig) obj;
        if (other.getClassicLoadBalancers() == null ^ this.getClassicLoadBalancers() == null)
            return false;
        if (other.getClassicLoadBalancers() != null && other.getClassicLoadBalancers().equals(this.getClassicLoadBalancers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClassicLoadBalancers() == null) ? 0 : getClassicLoadBalancers().hashCode());
        return hashCode;
    }

    @Override
    public ClassicLoadBalancersConfig clone() {
        try {
            return (ClassicLoadBalancersConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
