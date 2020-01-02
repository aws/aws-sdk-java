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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details on the resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ResourceDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details on the Amazon EC2 resource.
     * </p>
     */
    private EC2ResourceDetails eC2ResourceDetails;

    /**
     * <p>
     * Details on the Amazon EC2 resource.
     * </p>
     * 
     * @param eC2ResourceDetails
     *        Details on the Amazon EC2 resource.
     */

    public void setEC2ResourceDetails(EC2ResourceDetails eC2ResourceDetails) {
        this.eC2ResourceDetails = eC2ResourceDetails;
    }

    /**
     * <p>
     * Details on the Amazon EC2 resource.
     * </p>
     * 
     * @return Details on the Amazon EC2 resource.
     */

    public EC2ResourceDetails getEC2ResourceDetails() {
        return this.eC2ResourceDetails;
    }

    /**
     * <p>
     * Details on the Amazon EC2 resource.
     * </p>
     * 
     * @param eC2ResourceDetails
     *        Details on the Amazon EC2 resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withEC2ResourceDetails(EC2ResourceDetails eC2ResourceDetails) {
        setEC2ResourceDetails(eC2ResourceDetails);
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
        if (getEC2ResourceDetails() != null)
            sb.append("EC2ResourceDetails: ").append(getEC2ResourceDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDetails == false)
            return false;
        ResourceDetails other = (ResourceDetails) obj;
        if (other.getEC2ResourceDetails() == null ^ this.getEC2ResourceDetails() == null)
            return false;
        if (other.getEC2ResourceDetails() != null && other.getEC2ResourceDetails().equals(this.getEC2ResourceDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEC2ResourceDetails() == null) ? 0 : getEC2ResourceDetails().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDetails clone() {
        try {
            return (ResourceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.ResourceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
