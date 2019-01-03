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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a summary of SSL/TLS certificate metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/LoadBalancerTlsCertificateSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerTlsCertificateSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the SSL/TLS certificate.
     * </p>
     */
    private String name;
    /**
     * <p>
     * When <code>true</code>, the SSL/TLS certificate is attached to the Lightsail load balancer.
     * </p>
     */
    private Boolean isAttached;

    /**
     * <p>
     * The name of the SSL/TLS certificate.
     * </p>
     * 
     * @param name
     *        The name of the SSL/TLS certificate.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the SSL/TLS certificate.
     * </p>
     * 
     * @return The name of the SSL/TLS certificate.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the SSL/TLS certificate.
     * </p>
     * 
     * @param name
     *        The name of the SSL/TLS certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificateSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, the SSL/TLS certificate is attached to the Lightsail load balancer.
     * </p>
     * 
     * @param isAttached
     *        When <code>true</code>, the SSL/TLS certificate is attached to the Lightsail load balancer.
     */

    public void setIsAttached(Boolean isAttached) {
        this.isAttached = isAttached;
    }

    /**
     * <p>
     * When <code>true</code>, the SSL/TLS certificate is attached to the Lightsail load balancer.
     * </p>
     * 
     * @return When <code>true</code>, the SSL/TLS certificate is attached to the Lightsail load balancer.
     */

    public Boolean getIsAttached() {
        return this.isAttached;
    }

    /**
     * <p>
     * When <code>true</code>, the SSL/TLS certificate is attached to the Lightsail load balancer.
     * </p>
     * 
     * @param isAttached
     *        When <code>true</code>, the SSL/TLS certificate is attached to the Lightsail load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificateSummary withIsAttached(Boolean isAttached) {
        setIsAttached(isAttached);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, the SSL/TLS certificate is attached to the Lightsail load balancer.
     * </p>
     * 
     * @return When <code>true</code>, the SSL/TLS certificate is attached to the Lightsail load balancer.
     */

    public Boolean isAttached() {
        return this.isAttached;
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
        if (getIsAttached() != null)
            sb.append("IsAttached: ").append(getIsAttached());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerTlsCertificateSummary == false)
            return false;
        LoadBalancerTlsCertificateSummary other = (LoadBalancerTlsCertificateSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIsAttached() == null ^ this.getIsAttached() == null)
            return false;
        if (other.getIsAttached() != null && other.getIsAttached().equals(this.getIsAttached()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIsAttached() == null) ? 0 : getIsAttached().hashCode());
        return hashCode;
    }

    @Override
    public LoadBalancerTlsCertificateSummary clone() {
        try {
            return (LoadBalancerTlsCertificateSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.LoadBalancerTlsCertificateSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
