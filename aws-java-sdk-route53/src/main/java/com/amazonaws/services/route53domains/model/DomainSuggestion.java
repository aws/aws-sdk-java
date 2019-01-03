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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about one suggested domain name.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/DomainSuggestion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainSuggestion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A suggested domain name.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Whether the domain name is available for registering.
     * </p>
     * <note>
     * <p>
     * You can register only the domains that are designated as <code>AVAILABLE</code>.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * </p>
     * <dl>
     * <dt>AVAILABLE</dt>
     * <dd>
     * <p>
     * The domain name is available.
     * </p>
     * </dd>
     * <dt>AVAILABLE_RESERVED</dt>
     * <dd>
     * <p>
     * The domain name is reserved under specific conditions.
     * </p>
     * </dd>
     * <dt>AVAILABLE_PREORDER</dt>
     * <dd>
     * <p>
     * The domain name is available and can be preordered.
     * </p>
     * </dd>
     * <dt>DONT_KNOW</dt>
     * <dd>
     * <p>
     * The TLD registry didn't reply with a definitive answer about whether the domain name is available. Amazon Route
     * 53 can return this response for a variety of reasons, for example, the registry is performing maintenance. Try
     * again later.
     * </p>
     * </dd>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * The TLD registry didn't return a response in the expected amount of time. When the response is delayed, it
     * usually takes just a few extra seconds. You can resubmit the request immediately.
     * </p>
     * </dd>
     * <dt>RESERVED</dt>
     * <dd>
     * <p>
     * The domain name has been reserved for another person or organization.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE</dt>
     * <dd>
     * <p>
     * The domain name is not available.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE_PREMIUM</dt>
     * <dd>
     * <p>
     * The domain name is not available.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE_RESTRICTED</dt>
     * <dd>
     * <p>
     * The domain name is forbidden.
     * </p>
     * </dd>
     * </dl>
     */
    private String availability;

    /**
     * <p>
     * A suggested domain name.
     * </p>
     * 
     * @param domainName
     *        A suggested domain name.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * A suggested domain name.
     * </p>
     * 
     * @return A suggested domain name.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * A suggested domain name.
     * </p>
     * 
     * @param domainName
     *        A suggested domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSuggestion withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Whether the domain name is available for registering.
     * </p>
     * <note>
     * <p>
     * You can register only the domains that are designated as <code>AVAILABLE</code>.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * </p>
     * <dl>
     * <dt>AVAILABLE</dt>
     * <dd>
     * <p>
     * The domain name is available.
     * </p>
     * </dd>
     * <dt>AVAILABLE_RESERVED</dt>
     * <dd>
     * <p>
     * The domain name is reserved under specific conditions.
     * </p>
     * </dd>
     * <dt>AVAILABLE_PREORDER</dt>
     * <dd>
     * <p>
     * The domain name is available and can be preordered.
     * </p>
     * </dd>
     * <dt>DONT_KNOW</dt>
     * <dd>
     * <p>
     * The TLD registry didn't reply with a definitive answer about whether the domain name is available. Amazon Route
     * 53 can return this response for a variety of reasons, for example, the registry is performing maintenance. Try
     * again later.
     * </p>
     * </dd>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * The TLD registry didn't return a response in the expected amount of time. When the response is delayed, it
     * usually takes just a few extra seconds. You can resubmit the request immediately.
     * </p>
     * </dd>
     * <dt>RESERVED</dt>
     * <dd>
     * <p>
     * The domain name has been reserved for another person or organization.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE</dt>
     * <dd>
     * <p>
     * The domain name is not available.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE_PREMIUM</dt>
     * <dd>
     * <p>
     * The domain name is not available.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE_RESTRICTED</dt>
     * <dd>
     * <p>
     * The domain name is forbidden.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param availability
     *        Whether the domain name is available for registering.</p> <note>
     *        <p>
     *        You can register only the domains that are designated as <code>AVAILABLE</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Valid values:
     *        </p>
     *        <dl>
     *        <dt>AVAILABLE</dt>
     *        <dd>
     *        <p>
     *        The domain name is available.
     *        </p>
     *        </dd>
     *        <dt>AVAILABLE_RESERVED</dt>
     *        <dd>
     *        <p>
     *        The domain name is reserved under specific conditions.
     *        </p>
     *        </dd>
     *        <dt>AVAILABLE_PREORDER</dt>
     *        <dd>
     *        <p>
     *        The domain name is available and can be preordered.
     *        </p>
     *        </dd>
     *        <dt>DONT_KNOW</dt>
     *        <dd>
     *        <p>
     *        The TLD registry didn't reply with a definitive answer about whether the domain name is available. Amazon
     *        Route 53 can return this response for a variety of reasons, for example, the registry is performing
     *        maintenance. Try again later.
     *        </p>
     *        </dd>
     *        <dt>PENDING</dt>
     *        <dd>
     *        <p>
     *        The TLD registry didn't return a response in the expected amount of time. When the response is delayed, it
     *        usually takes just a few extra seconds. You can resubmit the request immediately.
     *        </p>
     *        </dd>
     *        <dt>RESERVED</dt>
     *        <dd>
     *        <p>
     *        The domain name has been reserved for another person or organization.
     *        </p>
     *        </dd>
     *        <dt>UNAVAILABLE</dt>
     *        <dd>
     *        <p>
     *        The domain name is not available.
     *        </p>
     *        </dd>
     *        <dt>UNAVAILABLE_PREMIUM</dt>
     *        <dd>
     *        <p>
     *        The domain name is not available.
     *        </p>
     *        </dd>
     *        <dt>UNAVAILABLE_RESTRICTED</dt>
     *        <dd>
     *        <p>
     *        The domain name is forbidden.
     *        </p>
     *        </dd>
     */

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    /**
     * <p>
     * Whether the domain name is available for registering.
     * </p>
     * <note>
     * <p>
     * You can register only the domains that are designated as <code>AVAILABLE</code>.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * </p>
     * <dl>
     * <dt>AVAILABLE</dt>
     * <dd>
     * <p>
     * The domain name is available.
     * </p>
     * </dd>
     * <dt>AVAILABLE_RESERVED</dt>
     * <dd>
     * <p>
     * The domain name is reserved under specific conditions.
     * </p>
     * </dd>
     * <dt>AVAILABLE_PREORDER</dt>
     * <dd>
     * <p>
     * The domain name is available and can be preordered.
     * </p>
     * </dd>
     * <dt>DONT_KNOW</dt>
     * <dd>
     * <p>
     * The TLD registry didn't reply with a definitive answer about whether the domain name is available. Amazon Route
     * 53 can return this response for a variety of reasons, for example, the registry is performing maintenance. Try
     * again later.
     * </p>
     * </dd>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * The TLD registry didn't return a response in the expected amount of time. When the response is delayed, it
     * usually takes just a few extra seconds. You can resubmit the request immediately.
     * </p>
     * </dd>
     * <dt>RESERVED</dt>
     * <dd>
     * <p>
     * The domain name has been reserved for another person or organization.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE</dt>
     * <dd>
     * <p>
     * The domain name is not available.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE_PREMIUM</dt>
     * <dd>
     * <p>
     * The domain name is not available.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE_RESTRICTED</dt>
     * <dd>
     * <p>
     * The domain name is forbidden.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return Whether the domain name is available for registering.</p> <note>
     *         <p>
     *         You can register only the domains that are designated as <code>AVAILABLE</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Valid values:
     *         </p>
     *         <dl>
     *         <dt>AVAILABLE</dt>
     *         <dd>
     *         <p>
     *         The domain name is available.
     *         </p>
     *         </dd>
     *         <dt>AVAILABLE_RESERVED</dt>
     *         <dd>
     *         <p>
     *         The domain name is reserved under specific conditions.
     *         </p>
     *         </dd>
     *         <dt>AVAILABLE_PREORDER</dt>
     *         <dd>
     *         <p>
     *         The domain name is available and can be preordered.
     *         </p>
     *         </dd>
     *         <dt>DONT_KNOW</dt>
     *         <dd>
     *         <p>
     *         The TLD registry didn't reply with a definitive answer about whether the domain name is available. Amazon
     *         Route 53 can return this response for a variety of reasons, for example, the registry is performing
     *         maintenance. Try again later.
     *         </p>
     *         </dd>
     *         <dt>PENDING</dt>
     *         <dd>
     *         <p>
     *         The TLD registry didn't return a response in the expected amount of time. When the response is delayed,
     *         it usually takes just a few extra seconds. You can resubmit the request immediately.
     *         </p>
     *         </dd>
     *         <dt>RESERVED</dt>
     *         <dd>
     *         <p>
     *         The domain name has been reserved for another person or organization.
     *         </p>
     *         </dd>
     *         <dt>UNAVAILABLE</dt>
     *         <dd>
     *         <p>
     *         The domain name is not available.
     *         </p>
     *         </dd>
     *         <dt>UNAVAILABLE_PREMIUM</dt>
     *         <dd>
     *         <p>
     *         The domain name is not available.
     *         </p>
     *         </dd>
     *         <dt>UNAVAILABLE_RESTRICTED</dt>
     *         <dd>
     *         <p>
     *         The domain name is forbidden.
     *         </p>
     *         </dd>
     */

    public String getAvailability() {
        return this.availability;
    }

    /**
     * <p>
     * Whether the domain name is available for registering.
     * </p>
     * <note>
     * <p>
     * You can register only the domains that are designated as <code>AVAILABLE</code>.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * </p>
     * <dl>
     * <dt>AVAILABLE</dt>
     * <dd>
     * <p>
     * The domain name is available.
     * </p>
     * </dd>
     * <dt>AVAILABLE_RESERVED</dt>
     * <dd>
     * <p>
     * The domain name is reserved under specific conditions.
     * </p>
     * </dd>
     * <dt>AVAILABLE_PREORDER</dt>
     * <dd>
     * <p>
     * The domain name is available and can be preordered.
     * </p>
     * </dd>
     * <dt>DONT_KNOW</dt>
     * <dd>
     * <p>
     * The TLD registry didn't reply with a definitive answer about whether the domain name is available. Amazon Route
     * 53 can return this response for a variety of reasons, for example, the registry is performing maintenance. Try
     * again later.
     * </p>
     * </dd>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * The TLD registry didn't return a response in the expected amount of time. When the response is delayed, it
     * usually takes just a few extra seconds. You can resubmit the request immediately.
     * </p>
     * </dd>
     * <dt>RESERVED</dt>
     * <dd>
     * <p>
     * The domain name has been reserved for another person or organization.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE</dt>
     * <dd>
     * <p>
     * The domain name is not available.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE_PREMIUM</dt>
     * <dd>
     * <p>
     * The domain name is not available.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE_RESTRICTED</dt>
     * <dd>
     * <p>
     * The domain name is forbidden.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param availability
     *        Whether the domain name is available for registering.</p> <note>
     *        <p>
     *        You can register only the domains that are designated as <code>AVAILABLE</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Valid values:
     *        </p>
     *        <dl>
     *        <dt>AVAILABLE</dt>
     *        <dd>
     *        <p>
     *        The domain name is available.
     *        </p>
     *        </dd>
     *        <dt>AVAILABLE_RESERVED</dt>
     *        <dd>
     *        <p>
     *        The domain name is reserved under specific conditions.
     *        </p>
     *        </dd>
     *        <dt>AVAILABLE_PREORDER</dt>
     *        <dd>
     *        <p>
     *        The domain name is available and can be preordered.
     *        </p>
     *        </dd>
     *        <dt>DONT_KNOW</dt>
     *        <dd>
     *        <p>
     *        The TLD registry didn't reply with a definitive answer about whether the domain name is available. Amazon
     *        Route 53 can return this response for a variety of reasons, for example, the registry is performing
     *        maintenance. Try again later.
     *        </p>
     *        </dd>
     *        <dt>PENDING</dt>
     *        <dd>
     *        <p>
     *        The TLD registry didn't return a response in the expected amount of time. When the response is delayed, it
     *        usually takes just a few extra seconds. You can resubmit the request immediately.
     *        </p>
     *        </dd>
     *        <dt>RESERVED</dt>
     *        <dd>
     *        <p>
     *        The domain name has been reserved for another person or organization.
     *        </p>
     *        </dd>
     *        <dt>UNAVAILABLE</dt>
     *        <dd>
     *        <p>
     *        The domain name is not available.
     *        </p>
     *        </dd>
     *        <dt>UNAVAILABLE_PREMIUM</dt>
     *        <dd>
     *        <p>
     *        The domain name is not available.
     *        </p>
     *        </dd>
     *        <dt>UNAVAILABLE_RESTRICTED</dt>
     *        <dd>
     *        <p>
     *        The domain name is forbidden.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSuggestion withAvailability(String availability) {
        setAvailability(availability);
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
        if (getAvailability() != null)
            sb.append("Availability: ").append(getAvailability());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainSuggestion == false)
            return false;
        DomainSuggestion other = (DomainSuggestion) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAvailability() == null ^ this.getAvailability() == null)
            return false;
        if (other.getAvailability() != null && other.getAvailability().equals(this.getAvailability()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getAvailability() == null) ? 0 : getAvailability().hashCode());
        return hashCode;
    }

    @Override
    public DomainSuggestion clone() {
        try {
            return (DomainSuggestion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53domains.model.transform.DomainSuggestionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
