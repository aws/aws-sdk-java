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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateCloudFormationStack"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCloudFormationStackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of parameters that will be used to create the new Amazon EC2 instance. You can only pass one instance
     * entry at a time in this array. You will get an invalid parameter error if you pass more than one instance entry
     * in this array.
     * </p>
     */
    private java.util.List<InstanceEntry> instances;

    /**
     * <p>
     * An array of parameters that will be used to create the new Amazon EC2 instance. You can only pass one instance
     * entry at a time in this array. You will get an invalid parameter error if you pass more than one instance entry
     * in this array.
     * </p>
     * 
     * @return An array of parameters that will be used to create the new Amazon EC2 instance. You can only pass one
     *         instance entry at a time in this array. You will get an invalid parameter error if you pass more than one
     *         instance entry in this array.
     */

    public java.util.List<InstanceEntry> getInstances() {
        return instances;
    }

    /**
     * <p>
     * An array of parameters that will be used to create the new Amazon EC2 instance. You can only pass one instance
     * entry at a time in this array. You will get an invalid parameter error if you pass more than one instance entry
     * in this array.
     * </p>
     * 
     * @param instances
     *        An array of parameters that will be used to create the new Amazon EC2 instance. You can only pass one
     *        instance entry at a time in this array. You will get an invalid parameter error if you pass more than one
     *        instance entry in this array.
     */

    public void setInstances(java.util.Collection<InstanceEntry> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<InstanceEntry>(instances);
    }

    /**
     * <p>
     * An array of parameters that will be used to create the new Amazon EC2 instance. You can only pass one instance
     * entry at a time in this array. You will get an invalid parameter error if you pass more than one instance entry
     * in this array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        An array of parameters that will be used to create the new Amazon EC2 instance. You can only pass one
     *        instance entry at a time in this array. You will get an invalid parameter error if you pass more than one
     *        instance entry in this array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationStackRequest withInstances(InstanceEntry... instances) {
        if (this.instances == null) {
            setInstances(new java.util.ArrayList<InstanceEntry>(instances.length));
        }
        for (InstanceEntry ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of parameters that will be used to create the new Amazon EC2 instance. You can only pass one instance
     * entry at a time in this array. You will get an invalid parameter error if you pass more than one instance entry
     * in this array.
     * </p>
     * 
     * @param instances
     *        An array of parameters that will be used to create the new Amazon EC2 instance. You can only pass one
     *        instance entry at a time in this array. You will get an invalid parameter error if you pass more than one
     *        instance entry in this array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationStackRequest withInstances(java.util.Collection<InstanceEntry> instances) {
        setInstances(instances);
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
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCloudFormationStackRequest == false)
            return false;
        CreateCloudFormationStackRequest other = (CreateCloudFormationStackRequest) obj;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        return hashCode;
    }

    @Override
    public CreateCloudFormationStackRequest clone() {
        return (CreateCloudFormationStackRequest) super.clone();
    }

}
