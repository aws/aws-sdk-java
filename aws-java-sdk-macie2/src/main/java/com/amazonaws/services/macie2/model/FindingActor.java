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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an entity that performed an action that produced a policy finding for a resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/FindingActor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingActor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The domain name of the device that the entity used to perform the action on the affected resource.
     * </p>
     */
    private DomainDetails domainDetails;
    /**
     * <p>
     * The IP address of the device that the entity used to perform the action on the affected resource. This object
     * also provides information such as the owner and geographic location for the IP address.
     * </p>
     */
    private IpAddressDetails ipAddressDetails;
    /**
     * <p>
     * The type and other characteristics of the entity that performed the action on the affected resource.
     * </p>
     */
    private UserIdentity userIdentity;

    /**
     * <p>
     * The domain name of the device that the entity used to perform the action on the affected resource.
     * </p>
     * 
     * @param domainDetails
     *        The domain name of the device that the entity used to perform the action on the affected resource.
     */

    public void setDomainDetails(DomainDetails domainDetails) {
        this.domainDetails = domainDetails;
    }

    /**
     * <p>
     * The domain name of the device that the entity used to perform the action on the affected resource.
     * </p>
     * 
     * @return The domain name of the device that the entity used to perform the action on the affected resource.
     */

    public DomainDetails getDomainDetails() {
        return this.domainDetails;
    }

    /**
     * <p>
     * The domain name of the device that the entity used to perform the action on the affected resource.
     * </p>
     * 
     * @param domainDetails
     *        The domain name of the device that the entity used to perform the action on the affected resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingActor withDomainDetails(DomainDetails domainDetails) {
        setDomainDetails(domainDetails);
        return this;
    }

    /**
     * <p>
     * The IP address of the device that the entity used to perform the action on the affected resource. This object
     * also provides information such as the owner and geographic location for the IP address.
     * </p>
     * 
     * @param ipAddressDetails
     *        The IP address of the device that the entity used to perform the action on the affected resource. This
     *        object also provides information such as the owner and geographic location for the IP address.
     */

    public void setIpAddressDetails(IpAddressDetails ipAddressDetails) {
        this.ipAddressDetails = ipAddressDetails;
    }

    /**
     * <p>
     * The IP address of the device that the entity used to perform the action on the affected resource. This object
     * also provides information such as the owner and geographic location for the IP address.
     * </p>
     * 
     * @return The IP address of the device that the entity used to perform the action on the affected resource. This
     *         object also provides information such as the owner and geographic location for the IP address.
     */

    public IpAddressDetails getIpAddressDetails() {
        return this.ipAddressDetails;
    }

    /**
     * <p>
     * The IP address of the device that the entity used to perform the action on the affected resource. This object
     * also provides information such as the owner and geographic location for the IP address.
     * </p>
     * 
     * @param ipAddressDetails
     *        The IP address of the device that the entity used to perform the action on the affected resource. This
     *        object also provides information such as the owner and geographic location for the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingActor withIpAddressDetails(IpAddressDetails ipAddressDetails) {
        setIpAddressDetails(ipAddressDetails);
        return this;
    }

    /**
     * <p>
     * The type and other characteristics of the entity that performed the action on the affected resource.
     * </p>
     * 
     * @param userIdentity
     *        The type and other characteristics of the entity that performed the action on the affected resource.
     */

    public void setUserIdentity(UserIdentity userIdentity) {
        this.userIdentity = userIdentity;
    }

    /**
     * <p>
     * The type and other characteristics of the entity that performed the action on the affected resource.
     * </p>
     * 
     * @return The type and other characteristics of the entity that performed the action on the affected resource.
     */

    public UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    /**
     * <p>
     * The type and other characteristics of the entity that performed the action on the affected resource.
     * </p>
     * 
     * @param userIdentity
     *        The type and other characteristics of the entity that performed the action on the affected resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingActor withUserIdentity(UserIdentity userIdentity) {
        setUserIdentity(userIdentity);
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
        if (getDomainDetails() != null)
            sb.append("DomainDetails: ").append(getDomainDetails()).append(",");
        if (getIpAddressDetails() != null)
            sb.append("IpAddressDetails: ").append(getIpAddressDetails()).append(",");
        if (getUserIdentity() != null)
            sb.append("UserIdentity: ").append(getUserIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingActor == false)
            return false;
        FindingActor other = (FindingActor) obj;
        if (other.getDomainDetails() == null ^ this.getDomainDetails() == null)
            return false;
        if (other.getDomainDetails() != null && other.getDomainDetails().equals(this.getDomainDetails()) == false)
            return false;
        if (other.getIpAddressDetails() == null ^ this.getIpAddressDetails() == null)
            return false;
        if (other.getIpAddressDetails() != null && other.getIpAddressDetails().equals(this.getIpAddressDetails()) == false)
            return false;
        if (other.getUserIdentity() == null ^ this.getUserIdentity() == null)
            return false;
        if (other.getUserIdentity() != null && other.getUserIdentity().equals(this.getUserIdentity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainDetails() == null) ? 0 : getDomainDetails().hashCode());
        hashCode = prime * hashCode + ((getIpAddressDetails() == null) ? 0 : getIpAddressDetails().hashCode());
        hashCode = prime * hashCode + ((getUserIdentity() == null) ? 0 : getUserIdentity().hashCode());
        return hashCode;
    }

    @Override
    public FindingActor clone() {
        try {
            return (FindingActor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.FindingActorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
