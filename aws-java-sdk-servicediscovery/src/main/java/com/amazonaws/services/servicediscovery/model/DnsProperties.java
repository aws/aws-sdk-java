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
 * A complex type that contains the ID for the Route 53 hosted zone that Cloud Map creates when you create a namespace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DnsProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DnsProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for the Route 53 hosted zone that Cloud Map creates when you create a namespace.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * Start of Authority (SOA) record for the hosted zone.
     * </p>
     */
    private SOA sOA;

    /**
     * <p>
     * The ID for the Route 53 hosted zone that Cloud Map creates when you create a namespace.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID for the Route 53 hosted zone that Cloud Map creates when you create a namespace.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID for the Route 53 hosted zone that Cloud Map creates when you create a namespace.
     * </p>
     * 
     * @return The ID for the Route 53 hosted zone that Cloud Map creates when you create a namespace.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The ID for the Route 53 hosted zone that Cloud Map creates when you create a namespace.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID for the Route 53 hosted zone that Cloud Map creates when you create a namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsProperties withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * Start of Authority (SOA) record for the hosted zone.
     * </p>
     * 
     * @param sOA
     *        Start of Authority (SOA) record for the hosted zone.
     */

    public void setSOA(SOA sOA) {
        this.sOA = sOA;
    }

    /**
     * <p>
     * Start of Authority (SOA) record for the hosted zone.
     * </p>
     * 
     * @return Start of Authority (SOA) record for the hosted zone.
     */

    public SOA getSOA() {
        return this.sOA;
    }

    /**
     * <p>
     * Start of Authority (SOA) record for the hosted zone.
     * </p>
     * 
     * @param sOA
     *        Start of Authority (SOA) record for the hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsProperties withSOA(SOA sOA) {
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId()).append(",");
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

        if (obj instanceof DnsProperties == false)
            return false;
        DnsProperties other = (DnsProperties) obj;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getSOA() == null) ? 0 : getSOA().hashCode());
        return hashCode;
    }

    @Override
    public DnsProperties clone() {
        try {
            return (DnsProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.DnsPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
