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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDefaultCreditSpecificationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The default credit option for CPU usage of the instance family.
     * </p>
     */
    private InstanceFamilyCreditSpecification instanceFamilyCreditSpecification;

    /**
     * <p>
     * The default credit option for CPU usage of the instance family.
     * </p>
     * 
     * @param instanceFamilyCreditSpecification
     *        The default credit option for CPU usage of the instance family.
     */

    public void setInstanceFamilyCreditSpecification(InstanceFamilyCreditSpecification instanceFamilyCreditSpecification) {
        this.instanceFamilyCreditSpecification = instanceFamilyCreditSpecification;
    }

    /**
     * <p>
     * The default credit option for CPU usage of the instance family.
     * </p>
     * 
     * @return The default credit option for CPU usage of the instance family.
     */

    public InstanceFamilyCreditSpecification getInstanceFamilyCreditSpecification() {
        return this.instanceFamilyCreditSpecification;
    }

    /**
     * <p>
     * The default credit option for CPU usage of the instance family.
     * </p>
     * 
     * @param instanceFamilyCreditSpecification
     *        The default credit option for CPU usage of the instance family.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDefaultCreditSpecificationResult withInstanceFamilyCreditSpecification(InstanceFamilyCreditSpecification instanceFamilyCreditSpecification) {
        setInstanceFamilyCreditSpecification(instanceFamilyCreditSpecification);
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
        if (getInstanceFamilyCreditSpecification() != null)
            sb.append("InstanceFamilyCreditSpecification: ").append(getInstanceFamilyCreditSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDefaultCreditSpecificationResult == false)
            return false;
        ModifyDefaultCreditSpecificationResult other = (ModifyDefaultCreditSpecificationResult) obj;
        if (other.getInstanceFamilyCreditSpecification() == null ^ this.getInstanceFamilyCreditSpecification() == null)
            return false;
        if (other.getInstanceFamilyCreditSpecification() != null
                && other.getInstanceFamilyCreditSpecification().equals(this.getInstanceFamilyCreditSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceFamilyCreditSpecification() == null) ? 0 : getInstanceFamilyCreditSpecification().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDefaultCreditSpecificationResult clone() {
        try {
            return (ModifyDefaultCreditSpecificationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
