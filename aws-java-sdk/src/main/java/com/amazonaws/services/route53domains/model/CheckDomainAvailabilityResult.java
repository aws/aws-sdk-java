/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;

/**
 * <p>
 * The CheckDomainAvailability response includes the following elements.
 * </p>
 */
public class CheckDomainAvailabilityResult implements Serializable {

    /**
     * Whether the domain name is available for registering. <note> <p>You
     * can only register domains designated as <code>AVAILABLE</code>.
     * </note> <p>Type: String <p>Valid values: <ul>
     * <li><code>AVAILABLE</code> ??? The domain name is available.</li>
     * <li><code>AVAILABLE_RESERVED</code> ??? The domain name is reserved
     * under specific conditions.</li> <li><code>AVAILABLE_PREORDER</code>
     * ??? The domain name is available and can be preordered.</li>
     * <li><code>UNAVAILABLE</code> ??? The domain name is not
     * available.</li> <li><code>UNAVAILABLE_PREMIUM</code> ??? The domain
     * name is not available.</li> <li><code>UNAVAILABLE_RESTRICTED</code>
     * ??? The domain name is forbidden.</li> <li><code>RESERVED</code> ???
     * The domain name has been reserved for another person or
     * organization.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, AVAILABLE_RESERVED, AVAILABLE_PREORDER, UNAVAILABLE, UNAVAILABLE_PREMIUM, UNAVAILABLE_RESTRICTED, RESERVED
     */
    private String availability;

    /**
     * Whether the domain name is available for registering. <note> <p>You
     * can only register domains designated as <code>AVAILABLE</code>.
     * </note> <p>Type: String <p>Valid values: <ul>
     * <li><code>AVAILABLE</code> ??? The domain name is available.</li>
     * <li><code>AVAILABLE_RESERVED</code> ??? The domain name is reserved
     * under specific conditions.</li> <li><code>AVAILABLE_PREORDER</code>
     * ??? The domain name is available and can be preordered.</li>
     * <li><code>UNAVAILABLE</code> ??? The domain name is not
     * available.</li> <li><code>UNAVAILABLE_PREMIUM</code> ??? The domain
     * name is not available.</li> <li><code>UNAVAILABLE_RESTRICTED</code>
     * ??? The domain name is forbidden.</li> <li><code>RESERVED</code> ???
     * The domain name has been reserved for another person or
     * organization.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, AVAILABLE_RESERVED, AVAILABLE_PREORDER, UNAVAILABLE, UNAVAILABLE_PREMIUM, UNAVAILABLE_RESTRICTED, RESERVED
     *
     * @return Whether the domain name is available for registering. <note> <p>You
     *         can only register domains designated as <code>AVAILABLE</code>.
     *         </note> <p>Type: String <p>Valid values: <ul>
     *         <li><code>AVAILABLE</code> ??? The domain name is available.</li>
     *         <li><code>AVAILABLE_RESERVED</code> ??? The domain name is reserved
     *         under specific conditions.</li> <li><code>AVAILABLE_PREORDER</code>
     *         ??? The domain name is available and can be preordered.</li>
     *         <li><code>UNAVAILABLE</code> ??? The domain name is not
     *         available.</li> <li><code>UNAVAILABLE_PREMIUM</code> ??? The domain
     *         name is not available.</li> <li><code>UNAVAILABLE_RESTRICTED</code>
     *         ??? The domain name is forbidden.</li> <li><code>RESERVED</code> ???
     *         The domain name has been reserved for another person or
     *         organization.</li> </ul>
     *
     * @see DomainAvailability
     */
    public String getAvailability() {
        return availability;
    }
    
    /**
     * Whether the domain name is available for registering. <note> <p>You
     * can only register domains designated as <code>AVAILABLE</code>.
     * </note> <p>Type: String <p>Valid values: <ul>
     * <li><code>AVAILABLE</code> ??? The domain name is available.</li>
     * <li><code>AVAILABLE_RESERVED</code> ??? The domain name is reserved
     * under specific conditions.</li> <li><code>AVAILABLE_PREORDER</code>
     * ??? The domain name is available and can be preordered.</li>
     * <li><code>UNAVAILABLE</code> ??? The domain name is not
     * available.</li> <li><code>UNAVAILABLE_PREMIUM</code> ??? The domain
     * name is not available.</li> <li><code>UNAVAILABLE_RESTRICTED</code>
     * ??? The domain name is forbidden.</li> <li><code>RESERVED</code> ???
     * The domain name has been reserved for another person or
     * organization.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, AVAILABLE_RESERVED, AVAILABLE_PREORDER, UNAVAILABLE, UNAVAILABLE_PREMIUM, UNAVAILABLE_RESTRICTED, RESERVED
     *
     * @param availability Whether the domain name is available for registering. <note> <p>You
     *         can only register domains designated as <code>AVAILABLE</code>.
     *         </note> <p>Type: String <p>Valid values: <ul>
     *         <li><code>AVAILABLE</code> ??? The domain name is available.</li>
     *         <li><code>AVAILABLE_RESERVED</code> ??? The domain name is reserved
     *         under specific conditions.</li> <li><code>AVAILABLE_PREORDER</code>
     *         ??? The domain name is available and can be preordered.</li>
     *         <li><code>UNAVAILABLE</code> ??? The domain name is not
     *         available.</li> <li><code>UNAVAILABLE_PREMIUM</code> ??? The domain
     *         name is not available.</li> <li><code>UNAVAILABLE_RESTRICTED</code>
     *         ??? The domain name is forbidden.</li> <li><code>RESERVED</code> ???
     *         The domain name has been reserved for another person or
     *         organization.</li> </ul>
     *
     * @see DomainAvailability
     */
    public void setAvailability(String availability) {
        this.availability = availability;
    }
    
    /**
     * Whether the domain name is available for registering. <note> <p>You
     * can only register domains designated as <code>AVAILABLE</code>.
     * </note> <p>Type: String <p>Valid values: <ul>
     * <li><code>AVAILABLE</code> ??? The domain name is available.</li>
     * <li><code>AVAILABLE_RESERVED</code> ??? The domain name is reserved
     * under specific conditions.</li> <li><code>AVAILABLE_PREORDER</code>
     * ??? The domain name is available and can be preordered.</li>
     * <li><code>UNAVAILABLE</code> ??? The domain name is not
     * available.</li> <li><code>UNAVAILABLE_PREMIUM</code> ??? The domain
     * name is not available.</li> <li><code>UNAVAILABLE_RESTRICTED</code>
     * ??? The domain name is forbidden.</li> <li><code>RESERVED</code> ???
     * The domain name has been reserved for another person or
     * organization.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, AVAILABLE_RESERVED, AVAILABLE_PREORDER, UNAVAILABLE, UNAVAILABLE_PREMIUM, UNAVAILABLE_RESTRICTED, RESERVED
     *
     * @param availability Whether the domain name is available for registering. <note> <p>You
     *         can only register domains designated as <code>AVAILABLE</code>.
     *         </note> <p>Type: String <p>Valid values: <ul>
     *         <li><code>AVAILABLE</code> ??? The domain name is available.</li>
     *         <li><code>AVAILABLE_RESERVED</code> ??? The domain name is reserved
     *         under specific conditions.</li> <li><code>AVAILABLE_PREORDER</code>
     *         ??? The domain name is available and can be preordered.</li>
     *         <li><code>UNAVAILABLE</code> ??? The domain name is not
     *         available.</li> <li><code>UNAVAILABLE_PREMIUM</code> ??? The domain
     *         name is not available.</li> <li><code>UNAVAILABLE_RESTRICTED</code>
     *         ??? The domain name is forbidden.</li> <li><code>RESERVED</code> ???
     *         The domain name has been reserved for another person or
     *         organization.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DomainAvailability
     */
    public CheckDomainAvailabilityResult withAvailability(String availability) {
        this.availability = availability;
        return this;
    }

    /**
     * Whether the domain name is available for registering. <note> <p>You
     * can only register domains designated as <code>AVAILABLE</code>.
     * </note> <p>Type: String <p>Valid values: <ul>
     * <li><code>AVAILABLE</code> ??? The domain name is available.</li>
     * <li><code>AVAILABLE_RESERVED</code> ??? The domain name is reserved
     * under specific conditions.</li> <li><code>AVAILABLE_PREORDER</code>
     * ??? The domain name is available and can be preordered.</li>
     * <li><code>UNAVAILABLE</code> ??? The domain name is not
     * available.</li> <li><code>UNAVAILABLE_PREMIUM</code> ??? The domain
     * name is not available.</li> <li><code>UNAVAILABLE_RESTRICTED</code>
     * ??? The domain name is forbidden.</li> <li><code>RESERVED</code> ???
     * The domain name has been reserved for another person or
     * organization.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, AVAILABLE_RESERVED, AVAILABLE_PREORDER, UNAVAILABLE, UNAVAILABLE_PREMIUM, UNAVAILABLE_RESTRICTED, RESERVED
     *
     * @param availability Whether the domain name is available for registering. <note> <p>You
     *         can only register domains designated as <code>AVAILABLE</code>.
     *         </note> <p>Type: String <p>Valid values: <ul>
     *         <li><code>AVAILABLE</code> ??? The domain name is available.</li>
     *         <li><code>AVAILABLE_RESERVED</code> ??? The domain name is reserved
     *         under specific conditions.</li> <li><code>AVAILABLE_PREORDER</code>
     *         ??? The domain name is available and can be preordered.</li>
     *         <li><code>UNAVAILABLE</code> ??? The domain name is not
     *         available.</li> <li><code>UNAVAILABLE_PREMIUM</code> ??? The domain
     *         name is not available.</li> <li><code>UNAVAILABLE_RESTRICTED</code>
     *         ??? The domain name is forbidden.</li> <li><code>RESERVED</code> ???
     *         The domain name has been reserved for another person or
     *         organization.</li> </ul>
     *
     * @see DomainAvailability
     */
    public void setAvailability(DomainAvailability availability) {
        this.availability = availability.toString();
    }
    
    /**
     * Whether the domain name is available for registering. <note> <p>You
     * can only register domains designated as <code>AVAILABLE</code>.
     * </note> <p>Type: String <p>Valid values: <ul>
     * <li><code>AVAILABLE</code> ??? The domain name is available.</li>
     * <li><code>AVAILABLE_RESERVED</code> ??? The domain name is reserved
     * under specific conditions.</li> <li><code>AVAILABLE_PREORDER</code>
     * ??? The domain name is available and can be preordered.</li>
     * <li><code>UNAVAILABLE</code> ??? The domain name is not
     * available.</li> <li><code>UNAVAILABLE_PREMIUM</code> ??? The domain
     * name is not available.</li> <li><code>UNAVAILABLE_RESTRICTED</code>
     * ??? The domain name is forbidden.</li> <li><code>RESERVED</code> ???
     * The domain name has been reserved for another person or
     * organization.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, AVAILABLE_RESERVED, AVAILABLE_PREORDER, UNAVAILABLE, UNAVAILABLE_PREMIUM, UNAVAILABLE_RESTRICTED, RESERVED
     *
     * @param availability Whether the domain name is available for registering. <note> <p>You
     *         can only register domains designated as <code>AVAILABLE</code>.
     *         </note> <p>Type: String <p>Valid values: <ul>
     *         <li><code>AVAILABLE</code> ??? The domain name is available.</li>
     *         <li><code>AVAILABLE_RESERVED</code> ??? The domain name is reserved
     *         under specific conditions.</li> <li><code>AVAILABLE_PREORDER</code>
     *         ??? The domain name is available and can be preordered.</li>
     *         <li><code>UNAVAILABLE</code> ??? The domain name is not
     *         available.</li> <li><code>UNAVAILABLE_PREMIUM</code> ??? The domain
     *         name is not available.</li> <li><code>UNAVAILABLE_RESTRICTED</code>
     *         ??? The domain name is forbidden.</li> <li><code>RESERVED</code> ???
     *         The domain name has been reserved for another person or
     *         organization.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DomainAvailability
     */
    public CheckDomainAvailabilityResult withAvailability(DomainAvailability availability) {
        this.availability = availability.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAvailability() != null) sb.append("Availability: " + getAvailability() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAvailability() == null) ? 0 : getAvailability().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CheckDomainAvailabilityResult == false) return false;
        CheckDomainAvailabilityResult other = (CheckDomainAvailabilityResult)obj;
        
        if (other.getAvailability() == null ^ this.getAvailability() == null) return false;
        if (other.getAvailability() != null && other.getAvailability().equals(this.getAvailability()) == false) return false; 
        return true;
    }
    
}
    