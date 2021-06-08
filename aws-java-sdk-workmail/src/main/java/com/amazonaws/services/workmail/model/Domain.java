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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The domain to associate with an Amazon WorkMail organization.
 * </p>
 * <p>
 * When you configure a domain hosted in Amazon Route 53 (Route 53), all recommended DNS records are added to the
 * organization when you create it. For more information, see <a
 * href="https://docs.aws.amazon.com/workmail/latest/adminguide/add_domain.html">Adding a domain</a> in the <i>Amazon
 * WorkMail Administrator Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/Domain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Domain implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The fully qualified domain name.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The hosted zone ID for a domain hosted in Route 53. Required when configuring a domain hosted in Route 53.
     * </p>
     */
    private String hostedZoneId;

    /**
     * <p>
     * The fully qualified domain name.
     * </p>
     * 
     * @param domainName
     *        The fully qualified domain name.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The fully qualified domain name.
     * </p>
     * 
     * @return The fully qualified domain name.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The fully qualified domain name.
     * </p>
     * 
     * @param domainName
     *        The fully qualified domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Domain withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The hosted zone ID for a domain hosted in Route 53. Required when configuring a domain hosted in Route 53.
     * </p>
     * 
     * @param hostedZoneId
     *        The hosted zone ID for a domain hosted in Route 53. Required when configuring a domain hosted in Route 53.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The hosted zone ID for a domain hosted in Route 53. Required when configuring a domain hosted in Route 53.
     * </p>
     * 
     * @return The hosted zone ID for a domain hosted in Route 53. Required when configuring a domain hosted in Route
     *         53.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The hosted zone ID for a domain hosted in Route 53. Required when configuring a domain hosted in Route 53.
     * </p>
     * 
     * @param hostedZoneId
     *        The hosted zone ID for a domain hosted in Route 53. Required when configuring a domain hosted in Route 53.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Domain withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Domain == false)
            return false;
        Domain other = (Domain) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        return hashCode;
    }

    @Override
    public Domain clone() {
        try {
            return (Domain) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmail.model.transform.DomainMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
