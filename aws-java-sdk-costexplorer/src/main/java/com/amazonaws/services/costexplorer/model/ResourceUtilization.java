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
 * Resource utilization of current resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ResourceUtilization" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceUtilization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Utilization of current Amazon EC2 Instance
     * </p>
     */
    private EC2ResourceUtilization eC2ResourceUtilization;

    /**
     * <p>
     * Utilization of current Amazon EC2 Instance
     * </p>
     * 
     * @param eC2ResourceUtilization
     *        Utilization of current Amazon EC2 Instance
     */

    public void setEC2ResourceUtilization(EC2ResourceUtilization eC2ResourceUtilization) {
        this.eC2ResourceUtilization = eC2ResourceUtilization;
    }

    /**
     * <p>
     * Utilization of current Amazon EC2 Instance
     * </p>
     * 
     * @return Utilization of current Amazon EC2 Instance
     */

    public EC2ResourceUtilization getEC2ResourceUtilization() {
        return this.eC2ResourceUtilization;
    }

    /**
     * <p>
     * Utilization of current Amazon EC2 Instance
     * </p>
     * 
     * @param eC2ResourceUtilization
     *        Utilization of current Amazon EC2 Instance
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceUtilization withEC2ResourceUtilization(EC2ResourceUtilization eC2ResourceUtilization) {
        setEC2ResourceUtilization(eC2ResourceUtilization);
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
        if (getEC2ResourceUtilization() != null)
            sb.append("EC2ResourceUtilization: ").append(getEC2ResourceUtilization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceUtilization == false)
            return false;
        ResourceUtilization other = (ResourceUtilization) obj;
        if (other.getEC2ResourceUtilization() == null ^ this.getEC2ResourceUtilization() == null)
            return false;
        if (other.getEC2ResourceUtilization() != null && other.getEC2ResourceUtilization().equals(this.getEC2ResourceUtilization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEC2ResourceUtilization() == null) ? 0 : getEC2ResourceUtilization().hashCode());
        return hashCode;
    }

    @Override
    public ResourceUtilization clone() {
        try {
            return (ResourceUtilization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.ResourceUtilizationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
