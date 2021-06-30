/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * DNS properties for the private DNS namespace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/PrivateDnsPropertiesMutable"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrivateDnsPropertiesMutable implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Fields for the Start of Authority (SOA) record for the hosted zone for the private DNS namespace.
     * </p>
     */
    private SOA sOA;

    /**
     * <p>
     * Fields for the Start of Authority (SOA) record for the hosted zone for the private DNS namespace.
     * </p>
     * 
     * @param sOA
     *        Fields for the Start of Authority (SOA) record for the hosted zone for the private DNS namespace.
     */

    public void setSOA(SOA sOA) {
        this.sOA = sOA;
    }

    /**
     * <p>
     * Fields for the Start of Authority (SOA) record for the hosted zone for the private DNS namespace.
     * </p>
     * 
     * @return Fields for the Start of Authority (SOA) record for the hosted zone for the private DNS namespace.
     */

    public SOA getSOA() {
        return this.sOA;
    }

    /**
     * <p>
     * Fields for the Start of Authority (SOA) record for the hosted zone for the private DNS namespace.
     * </p>
     * 
     * @param sOA
     *        Fields for the Start of Authority (SOA) record for the hosted zone for the private DNS namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivateDnsPropertiesMutable withSOA(SOA sOA) {
        setSOA(sOA);
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
        if (getSOA() != null)
            sb.append("SOA: ").append(getSOA());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrivateDnsPropertiesMutable == false)
            return false;
        PrivateDnsPropertiesMutable other = (PrivateDnsPropertiesMutable) obj;
        if (other.getSOA() == null ^ this.getSOA() == null)
            return false;
        if (other.getSOA() != null && other.getSOA().equals(this.getSOA()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSOA() == null) ? 0 : getSOA().hashCode());
        return hashCode;
    }

    @Override
    public PrivateDnsPropertiesMutable clone() {
        try {
            return (PrivateDnsPropertiesMutable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.PrivateDnsPropertiesMutableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
