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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFleetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Information about the instances that could not be launched by the fleet. Valid only when <b>Type</b> is set to
     * <code>instant</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CreateFleetError> errors;
    /**
     * <p>
     * Information about the instances that were launched by the fleet. Valid only when <b>Type</b> is set to
     * <code>instant</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CreateFleetInstance> instances;

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     * 
     * @param fleetId
     *        The ID of the EC2 Fleet.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     * 
     * @return The ID of the EC2 Fleet.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     * 
     * @param fleetId
     *        The ID of the EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetResult withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Information about the instances that could not be launched by the fleet. Valid only when <b>Type</b> is set to
     * <code>instant</code>.
     * </p>
     * 
     * @return Information about the instances that could not be launched by the fleet. Valid only when <b>Type</b> is
     *         set to <code>instant</code>.
     */

    public java.util.List<CreateFleetError> getErrors() {
        if (errors == null) {
            errors = new com.amazonaws.internal.SdkInternalList<CreateFleetError>();
        }
        return errors;
    }

    /**
     * <p>
     * Information about the instances that could not be launched by the fleet. Valid only when <b>Type</b> is set to
     * <code>instant</code>.
     * </p>
     * 
     * @param errors
     *        Information about the instances that could not be launched by the fleet. Valid only when <b>Type</b> is
     *        set to <code>instant</code>.
     */

    public void setErrors(java.util.Collection<CreateFleetError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new com.amazonaws.internal.SdkInternalList<CreateFleetError>(errors);
    }

    /**
     * <p>
     * Information about the instances that could not be launched by the fleet. Valid only when <b>Type</b> is set to
     * <code>instant</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Information about the instances that could not be launched by the fleet. Valid only when <b>Type</b> is
     *        set to <code>instant</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetResult withErrors(CreateFleetError... errors) {
        if (this.errors == null) {
            setErrors(new com.amazonaws.internal.SdkInternalList<CreateFleetError>(errors.length));
        }
        for (CreateFleetError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the instances that could not be launched by the fleet. Valid only when <b>Type</b> is set to
     * <code>instant</code>.
     * </p>
     * 
     * @param errors
     *        Information about the instances that could not be launched by the fleet. Valid only when <b>Type</b> is
     *        set to <code>instant</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetResult withErrors(java.util.Collection<CreateFleetError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * Information about the instances that were launched by the fleet. Valid only when <b>Type</b> is set to
     * <code>instant</code>.
     * </p>
     * 
     * @return Information about the instances that were launched by the fleet. Valid only when <b>Type</b> is set to
     *         <code>instant</code>.
     */

    public java.util.List<CreateFleetInstance> getInstances() {
        if (instances == null) {
            instances = new com.amazonaws.internal.SdkInternalList<CreateFleetInstance>();
        }
        return instances;
    }

    /**
     * <p>
     * Information about the instances that were launched by the fleet. Valid only when <b>Type</b> is set to
     * <code>instant</code>.
     * </p>
     * 
     * @param instances
     *        Information about the instances that were launched by the fleet. Valid only when <b>Type</b> is set to
     *        <code>instant</code>.
     */

    public void setInstances(java.util.Collection<CreateFleetInstance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new com.amazonaws.internal.SdkInternalList<CreateFleetInstance>(instances);
    }

    /**
     * <p>
     * Information about the instances that were launched by the fleet. Valid only when <b>Type</b> is set to
     * <code>instant</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        Information about the instances that were launched by the fleet. Valid only when <b>Type</b> is set to
     *        <code>instant</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetResult withInstances(CreateFleetInstance... instances) {
        if (this.instances == null) {
            setInstances(new com.amazonaws.internal.SdkInternalList<CreateFleetInstance>(instances.length));
        }
        for (CreateFleetInstance ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the instances that were launched by the fleet. Valid only when <b>Type</b> is set to
     * <code>instant</code>.
     * </p>
     * 
     * @param instances
     *        Information about the instances that were launched by the fleet. Valid only when <b>Type</b> is set to
     *        <code>instant</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetResult withInstances(java.util.Collection<CreateFleetInstance> instances) {
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
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

        if (obj instanceof CreateFleetResult == false)
            return false;
        CreateFleetResult other = (CreateFleetResult) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        return hashCode;
    }

    @Override
    public CreateFleetResult clone() {
        try {
            return (CreateFleetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
