/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The CheckDomainAvailability response includes the following elements.
 * </p>
 */
public class CheckDomainAvailabilityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Whether the domain name is available for registering.
     * </p>
     * <note>
     * <p>
     * You can only register domains designated as <code>AVAILABLE</code>.
     * </p>
     * </note>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li><code>AVAILABLE</code> – The domain name is available.</li>
     * <li><code>AVAILABLE_RESERVED</code> – The domain name is reserved under specific conditions.</li>
     * <li><code>AVAILABLE_PREORDER</code> – The domain name is available and can be preordered.</li>
     * <li><code>UNAVAILABLE</code> – The domain name is not available.</li>
     * <li><code>UNAVAILABLE_PREMIUM</code> – The domain name is not available.</li>
     * <li><code>UNAVAILABLE_RESTRICTED</code> – The domain name is forbidden.</li>
     * <li><code>RESERVED</code> – The domain name has been reserved for another person or organization.</li>
     * <li><code>DONT_KNOW</code> – The TLD registry didn't reply with a definitive answer about whether the domain name
     * is available. Amazon Route 53 can return this response for a variety of reasons, for example, the registry is
     * performing maintenance. Try again later.</li>
     * </ul>
     */
    private String availability;

    /**
     * <p>
     * Whether the domain name is available for registering.
     * </p>
     * <note>
     * <p>
     * You can only register domains designated as <code>AVAILABLE</code>.
     * </p>
     * </note>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li><code>AVAILABLE</code> – The domain name is available.</li>
     * <li><code>AVAILABLE_RESERVED</code> – The domain name is reserved under specific conditions.</li>
     * <li><code>AVAILABLE_PREORDER</code> – The domain name is available and can be preordered.</li>
     * <li><code>UNAVAILABLE</code> – The domain name is not available.</li>
     * <li><code>UNAVAILABLE_PREMIUM</code> – The domain name is not available.</li>
     * <li><code>UNAVAILABLE_RESTRICTED</code> – The domain name is forbidden.</li>
     * <li><code>RESERVED</code> – The domain name has been reserved for another person or organization.</li>
     * <li><code>DONT_KNOW</code> – The TLD registry didn't reply with a definitive answer about whether the domain name
     * is available. Amazon Route 53 can return this response for a variety of reasons, for example, the registry is
     * performing maintenance. Try again later.</li>
     * </ul>
     * 
     * @param availability
     *        Whether the domain name is available for registering.</p> <note>
     *        <p>
     *        You can only register domains designated as <code>AVAILABLE</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li><code>AVAILABLE</code> – The domain name is available.</li>
     *        <li><code>AVAILABLE_RESERVED</code> – The domain name is reserved under specific conditions.</li>
     *        <li><code>AVAILABLE_PREORDER</code> – The domain name is available and can be preordered.</li>
     *        <li><code>UNAVAILABLE</code> – The domain name is not available.</li>
     *        <li><code>UNAVAILABLE_PREMIUM</code> – The domain name is not available.</li>
     *        <li><code>UNAVAILABLE_RESTRICTED</code> – The domain name is forbidden.</li>
     *        <li><code>RESERVED</code> – The domain name has been reserved for another person or organization.</li>
     *        <li><code>DONT_KNOW</code> – The TLD registry didn't reply with a definitive answer about whether the
     *        domain name is available. Amazon Route 53 can return this response for a variety of reasons, for example,
     *        the registry is performing maintenance. Try again later.</li>
     * @see DomainAvailability
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
     * You can only register domains designated as <code>AVAILABLE</code>.
     * </p>
     * </note>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li><code>AVAILABLE</code> – The domain name is available.</li>
     * <li><code>AVAILABLE_RESERVED</code> – The domain name is reserved under specific conditions.</li>
     * <li><code>AVAILABLE_PREORDER</code> – The domain name is available and can be preordered.</li>
     * <li><code>UNAVAILABLE</code> – The domain name is not available.</li>
     * <li><code>UNAVAILABLE_PREMIUM</code> – The domain name is not available.</li>
     * <li><code>UNAVAILABLE_RESTRICTED</code> – The domain name is forbidden.</li>
     * <li><code>RESERVED</code> – The domain name has been reserved for another person or organization.</li>
     * <li><code>DONT_KNOW</code> – The TLD registry didn't reply with a definitive answer about whether the domain name
     * is available. Amazon Route 53 can return this response for a variety of reasons, for example, the registry is
     * performing maintenance. Try again later.</li>
     * </ul>
     * 
     * @return Whether the domain name is available for registering.</p> <note>
     *         <p>
     *         You can only register domains designated as <code>AVAILABLE</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li><code>AVAILABLE</code> – The domain name is available.</li>
     *         <li><code>AVAILABLE_RESERVED</code> – The domain name is reserved under specific conditions.</li>
     *         <li><code>AVAILABLE_PREORDER</code> – The domain name is available and can be preordered.</li>
     *         <li><code>UNAVAILABLE</code> – The domain name is not available.</li>
     *         <li><code>UNAVAILABLE_PREMIUM</code> – The domain name is not available.</li>
     *         <li><code>UNAVAILABLE_RESTRICTED</code> – The domain name is forbidden.</li>
     *         <li><code>RESERVED</code> – The domain name has been reserved for another person or organization.</li>
     *         <li><code>DONT_KNOW</code> – The TLD registry didn't reply with a definitive answer about whether the
     *         domain name is available. Amazon Route 53 can return this response for a variety of reasons, for example,
     *         the registry is performing maintenance. Try again later.</li>
     * @see DomainAvailability
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
     * You can only register domains designated as <code>AVAILABLE</code>.
     * </p>
     * </note>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li><code>AVAILABLE</code> – The domain name is available.</li>
     * <li><code>AVAILABLE_RESERVED</code> – The domain name is reserved under specific conditions.</li>
     * <li><code>AVAILABLE_PREORDER</code> – The domain name is available and can be preordered.</li>
     * <li><code>UNAVAILABLE</code> – The domain name is not available.</li>
     * <li><code>UNAVAILABLE_PREMIUM</code> – The domain name is not available.</li>
     * <li><code>UNAVAILABLE_RESTRICTED</code> – The domain name is forbidden.</li>
     * <li><code>RESERVED</code> – The domain name has been reserved for another person or organization.</li>
     * <li><code>DONT_KNOW</code> – The TLD registry didn't reply with a definitive answer about whether the domain name
     * is available. Amazon Route 53 can return this response for a variety of reasons, for example, the registry is
     * performing maintenance. Try again later.</li>
     * </ul>
     * 
     * @param availability
     *        Whether the domain name is available for registering.</p> <note>
     *        <p>
     *        You can only register domains designated as <code>AVAILABLE</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li><code>AVAILABLE</code> – The domain name is available.</li>
     *        <li><code>AVAILABLE_RESERVED</code> – The domain name is reserved under specific conditions.</li>
     *        <li><code>AVAILABLE_PREORDER</code> – The domain name is available and can be preordered.</li>
     *        <li><code>UNAVAILABLE</code> – The domain name is not available.</li>
     *        <li><code>UNAVAILABLE_PREMIUM</code> – The domain name is not available.</li>
     *        <li><code>UNAVAILABLE_RESTRICTED</code> – The domain name is forbidden.</li>
     *        <li><code>RESERVED</code> – The domain name has been reserved for another person or organization.</li>
     *        <li><code>DONT_KNOW</code> – The TLD registry didn't reply with a definitive answer about whether the
     *        domain name is available. Amazon Route 53 can return this response for a variety of reasons, for example,
     *        the registry is performing maintenance. Try again later.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainAvailability
     */

    public CheckDomainAvailabilityResult withAvailability(String availability) {
        setAvailability(availability);
        return this;
    }

    /**
     * <p>
     * Whether the domain name is available for registering.
     * </p>
     * <note>
     * <p>
     * You can only register domains designated as <code>AVAILABLE</code>.
     * </p>
     * </note>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li><code>AVAILABLE</code> – The domain name is available.</li>
     * <li><code>AVAILABLE_RESERVED</code> – The domain name is reserved under specific conditions.</li>
     * <li><code>AVAILABLE_PREORDER</code> – The domain name is available and can be preordered.</li>
     * <li><code>UNAVAILABLE</code> – The domain name is not available.</li>
     * <li><code>UNAVAILABLE_PREMIUM</code> – The domain name is not available.</li>
     * <li><code>UNAVAILABLE_RESTRICTED</code> – The domain name is forbidden.</li>
     * <li><code>RESERVED</code> – The domain name has been reserved for another person or organization.</li>
     * <li><code>DONT_KNOW</code> – The TLD registry didn't reply with a definitive answer about whether the domain name
     * is available. Amazon Route 53 can return this response for a variety of reasons, for example, the registry is
     * performing maintenance. Try again later.</li>
     * </ul>
     * 
     * @param availability
     *        Whether the domain name is available for registering.</p> <note>
     *        <p>
     *        You can only register domains designated as <code>AVAILABLE</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li><code>AVAILABLE</code> – The domain name is available.</li>
     *        <li><code>AVAILABLE_RESERVED</code> – The domain name is reserved under specific conditions.</li>
     *        <li><code>AVAILABLE_PREORDER</code> – The domain name is available and can be preordered.</li>
     *        <li><code>UNAVAILABLE</code> – The domain name is not available.</li>
     *        <li><code>UNAVAILABLE_PREMIUM</code> – The domain name is not available.</li>
     *        <li><code>UNAVAILABLE_RESTRICTED</code> – The domain name is forbidden.</li>
     *        <li><code>RESERVED</code> – The domain name has been reserved for another person or organization.</li>
     *        <li><code>DONT_KNOW</code> – The TLD registry didn't reply with a definitive answer about whether the
     *        domain name is available. Amazon Route 53 can return this response for a variety of reasons, for example,
     *        the registry is performing maintenance. Try again later.</li>
     * @see DomainAvailability
     */

    public void setAvailability(DomainAvailability availability) {
        this.availability = availability.toString();
    }

    /**
     * <p>
     * Whether the domain name is available for registering.
     * </p>
     * <note>
     * <p>
     * You can only register domains designated as <code>AVAILABLE</code>.
     * </p>
     * </note>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li><code>AVAILABLE</code> – The domain name is available.</li>
     * <li><code>AVAILABLE_RESERVED</code> – The domain name is reserved under specific conditions.</li>
     * <li><code>AVAILABLE_PREORDER</code> – The domain name is available and can be preordered.</li>
     * <li><code>UNAVAILABLE</code> – The domain name is not available.</li>
     * <li><code>UNAVAILABLE_PREMIUM</code> – The domain name is not available.</li>
     * <li><code>UNAVAILABLE_RESTRICTED</code> – The domain name is forbidden.</li>
     * <li><code>RESERVED</code> – The domain name has been reserved for another person or organization.</li>
     * <li><code>DONT_KNOW</code> – The TLD registry didn't reply with a definitive answer about whether the domain name
     * is available. Amazon Route 53 can return this response for a variety of reasons, for example, the registry is
     * performing maintenance. Try again later.</li>
     * </ul>
     * 
     * @param availability
     *        Whether the domain name is available for registering.</p> <note>
     *        <p>
     *        You can only register domains designated as <code>AVAILABLE</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li><code>AVAILABLE</code> – The domain name is available.</li>
     *        <li><code>AVAILABLE_RESERVED</code> – The domain name is reserved under specific conditions.</li>
     *        <li><code>AVAILABLE_PREORDER</code> – The domain name is available and can be preordered.</li>
     *        <li><code>UNAVAILABLE</code> – The domain name is not available.</li>
     *        <li><code>UNAVAILABLE_PREMIUM</code> – The domain name is not available.</li>
     *        <li><code>UNAVAILABLE_RESTRICTED</code> – The domain name is forbidden.</li>
     *        <li><code>RESERVED</code> – The domain name has been reserved for another person or organization.</li>
     *        <li><code>DONT_KNOW</code> – The TLD registry didn't reply with a definitive answer about whether the
     *        domain name is available. Amazon Route 53 can return this response for a variety of reasons, for example,
     *        the registry is performing maintenance. Try again later.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainAvailability
     */

    public CheckDomainAvailabilityResult withAvailability(DomainAvailability availability) {
        setAvailability(availability);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAvailability() != null)
            sb.append("Availability: " + getAvailability());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckDomainAvailabilityResult == false)
            return false;
        CheckDomainAvailabilityResult other = (CheckDomainAvailabilityResult) obj;
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

        hashCode = prime * hashCode + ((getAvailability() == null) ? 0 : getAvailability().hashCode());
        return hashCode;
    }

    @Override
    public CheckDomainAvailabilityResult clone() {
        try {
            return (CheckDomainAvailabilityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
