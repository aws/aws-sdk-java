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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Hardware specifications for the service that you want recommendations for.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ServiceSpecification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon EC2 hardware specifications that you want AWS to provide recommendations for.
     * </p>
     */
    private EC2Specification eC2Specification;

    /**
     * <p>
     * The Amazon EC2 hardware specifications that you want AWS to provide recommendations for.
     * </p>
     * 
     * @param eC2Specification
     *        The Amazon EC2 hardware specifications that you want AWS to provide recommendations for.
     */

    public void setEC2Specification(EC2Specification eC2Specification) {
        this.eC2Specification = eC2Specification;
    }

    /**
     * <p>
     * The Amazon EC2 hardware specifications that you want AWS to provide recommendations for.
     * </p>
     * 
     * @return The Amazon EC2 hardware specifications that you want AWS to provide recommendations for.
     */

    public EC2Specification getEC2Specification() {
        return this.eC2Specification;
    }

    /**
     * <p>
     * The Amazon EC2 hardware specifications that you want AWS to provide recommendations for.
     * </p>
     * 
     * @param eC2Specification
     *        The Amazon EC2 hardware specifications that you want AWS to provide recommendations for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSpecification withEC2Specification(EC2Specification eC2Specification) {
        setEC2Specification(eC2Specification);
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
        if (getEC2Specification() != null)
            sb.append("EC2Specification: ").append(getEC2Specification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceSpecification == false)
            return false;
        ServiceSpecification other = (ServiceSpecification) obj;
        if (other.getEC2Specification() == null ^ this.getEC2Specification() == null)
            return false;
        if (other.getEC2Specification() != null && other.getEC2Specification().equals(this.getEC2Specification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEC2Specification() == null) ? 0 : getEC2Specification().hashCode());
        return hashCode;
    }

    @Override
    public ServiceSpecification clone() {
        try {
            return (ServiceSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.ServiceSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
