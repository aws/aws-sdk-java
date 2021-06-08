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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The options for the transit gateway multicast domain.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateTransitGatewayMulticastDomainRequestOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransitGatewayMulticastDomainRequestOptions implements Serializable, Cloneable {

    /**
     * <p>
     * Specify whether to enable Internet Group Management Protocol (IGMP) version 2 for the transit gateway multicast
     * domain.
     * </p>
     */
    private String igmpv2Support;
    /**
     * <p>
     * Specify whether to enable support for statically configuring multicast group sources for a domain.
     * </p>
     */
    private String staticSourcesSupport;
    /**
     * <p>
     * Indicates whether to automatically accept cross-account subnet associations that are associated with the transit
     * gateway multicast domain.
     * </p>
     */
    private String autoAcceptSharedAssociations;

    /**
     * <p>
     * Specify whether to enable Internet Group Management Protocol (IGMP) version 2 for the transit gateway multicast
     * domain.
     * </p>
     * 
     * @param igmpv2Support
     *        Specify whether to enable Internet Group Management Protocol (IGMP) version 2 for the transit gateway
     *        multicast domain.
     * @see Igmpv2SupportValue
     */

    public void setIgmpv2Support(String igmpv2Support) {
        this.igmpv2Support = igmpv2Support;
    }

    /**
     * <p>
     * Specify whether to enable Internet Group Management Protocol (IGMP) version 2 for the transit gateway multicast
     * domain.
     * </p>
     * 
     * @return Specify whether to enable Internet Group Management Protocol (IGMP) version 2 for the transit gateway
     *         multicast domain.
     * @see Igmpv2SupportValue
     */

    public String getIgmpv2Support() {
        return this.igmpv2Support;
    }

    /**
     * <p>
     * Specify whether to enable Internet Group Management Protocol (IGMP) version 2 for the transit gateway multicast
     * domain.
     * </p>
     * 
     * @param igmpv2Support
     *        Specify whether to enable Internet Group Management Protocol (IGMP) version 2 for the transit gateway
     *        multicast domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Igmpv2SupportValue
     */

    public CreateTransitGatewayMulticastDomainRequestOptions withIgmpv2Support(String igmpv2Support) {
        setIgmpv2Support(igmpv2Support);
        return this;
    }

    /**
     * <p>
     * Specify whether to enable Internet Group Management Protocol (IGMP) version 2 for the transit gateway multicast
     * domain.
     * </p>
     * 
     * @param igmpv2Support
     *        Specify whether to enable Internet Group Management Protocol (IGMP) version 2 for the transit gateway
     *        multicast domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Igmpv2SupportValue
     */

    public CreateTransitGatewayMulticastDomainRequestOptions withIgmpv2Support(Igmpv2SupportValue igmpv2Support) {
        this.igmpv2Support = igmpv2Support.toString();
        return this;
    }

    /**
     * <p>
     * Specify whether to enable support for statically configuring multicast group sources for a domain.
     * </p>
     * 
     * @param staticSourcesSupport
     *        Specify whether to enable support for statically configuring multicast group sources for a domain.
     * @see StaticSourcesSupportValue
     */

    public void setStaticSourcesSupport(String staticSourcesSupport) {
        this.staticSourcesSupport = staticSourcesSupport;
    }

    /**
     * <p>
     * Specify whether to enable support for statically configuring multicast group sources for a domain.
     * </p>
     * 
     * @return Specify whether to enable support for statically configuring multicast group sources for a domain.
     * @see StaticSourcesSupportValue
     */

    public String getStaticSourcesSupport() {
        return this.staticSourcesSupport;
    }

    /**
     * <p>
     * Specify whether to enable support for statically configuring multicast group sources for a domain.
     * </p>
     * 
     * @param staticSourcesSupport
     *        Specify whether to enable support for statically configuring multicast group sources for a domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StaticSourcesSupportValue
     */

    public CreateTransitGatewayMulticastDomainRequestOptions withStaticSourcesSupport(String staticSourcesSupport) {
        setStaticSourcesSupport(staticSourcesSupport);
        return this;
    }

    /**
     * <p>
     * Specify whether to enable support for statically configuring multicast group sources for a domain.
     * </p>
     * 
     * @param staticSourcesSupport
     *        Specify whether to enable support for statically configuring multicast group sources for a domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StaticSourcesSupportValue
     */

    public CreateTransitGatewayMulticastDomainRequestOptions withStaticSourcesSupport(StaticSourcesSupportValue staticSourcesSupport) {
        this.staticSourcesSupport = staticSourcesSupport.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether to automatically accept cross-account subnet associations that are associated with the transit
     * gateway multicast domain.
     * </p>
     * 
     * @param autoAcceptSharedAssociations
     *        Indicates whether to automatically accept cross-account subnet associations that are associated with the
     *        transit gateway multicast domain.
     * @see AutoAcceptSharedAssociationsValue
     */

    public void setAutoAcceptSharedAssociations(String autoAcceptSharedAssociations) {
        this.autoAcceptSharedAssociations = autoAcceptSharedAssociations;
    }

    /**
     * <p>
     * Indicates whether to automatically accept cross-account subnet associations that are associated with the transit
     * gateway multicast domain.
     * </p>
     * 
     * @return Indicates whether to automatically accept cross-account subnet associations that are associated with the
     *         transit gateway multicast domain.
     * @see AutoAcceptSharedAssociationsValue
     */

    public String getAutoAcceptSharedAssociations() {
        return this.autoAcceptSharedAssociations;
    }

    /**
     * <p>
     * Indicates whether to automatically accept cross-account subnet associations that are associated with the transit
     * gateway multicast domain.
     * </p>
     * 
     * @param autoAcceptSharedAssociations
     *        Indicates whether to automatically accept cross-account subnet associations that are associated with the
     *        transit gateway multicast domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoAcceptSharedAssociationsValue
     */

    public CreateTransitGatewayMulticastDomainRequestOptions withAutoAcceptSharedAssociations(String autoAcceptSharedAssociations) {
        setAutoAcceptSharedAssociations(autoAcceptSharedAssociations);
        return this;
    }

    /**
     * <p>
     * Indicates whether to automatically accept cross-account subnet associations that are associated with the transit
     * gateway multicast domain.
     * </p>
     * 
     * @param autoAcceptSharedAssociations
     *        Indicates whether to automatically accept cross-account subnet associations that are associated with the
     *        transit gateway multicast domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoAcceptSharedAssociationsValue
     */

    public CreateTransitGatewayMulticastDomainRequestOptions withAutoAcceptSharedAssociations(AutoAcceptSharedAssociationsValue autoAcceptSharedAssociations) {
        this.autoAcceptSharedAssociations = autoAcceptSharedAssociations.toString();
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
        if (getIgmpv2Support() != null)
            sb.append("Igmpv2Support: ").append(getIgmpv2Support()).append(",");
        if (getStaticSourcesSupport() != null)
            sb.append("StaticSourcesSupport: ").append(getStaticSourcesSupport()).append(",");
        if (getAutoAcceptSharedAssociations() != null)
            sb.append("AutoAcceptSharedAssociations: ").append(getAutoAcceptSharedAssociations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTransitGatewayMulticastDomainRequestOptions == false)
            return false;
        CreateTransitGatewayMulticastDomainRequestOptions other = (CreateTransitGatewayMulticastDomainRequestOptions) obj;
        if (other.getIgmpv2Support() == null ^ this.getIgmpv2Support() == null)
            return false;
        if (other.getIgmpv2Support() != null && other.getIgmpv2Support().equals(this.getIgmpv2Support()) == false)
            return false;
        if (other.getStaticSourcesSupport() == null ^ this.getStaticSourcesSupport() == null)
            return false;
        if (other.getStaticSourcesSupport() != null && other.getStaticSourcesSupport().equals(this.getStaticSourcesSupport()) == false)
            return false;
        if (other.getAutoAcceptSharedAssociations() == null ^ this.getAutoAcceptSharedAssociations() == null)
            return false;
        if (other.getAutoAcceptSharedAssociations() != null && other.getAutoAcceptSharedAssociations().equals(this.getAutoAcceptSharedAssociations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIgmpv2Support() == null) ? 0 : getIgmpv2Support().hashCode());
        hashCode = prime * hashCode + ((getStaticSourcesSupport() == null) ? 0 : getStaticSourcesSupport().hashCode());
        hashCode = prime * hashCode + ((getAutoAcceptSharedAssociations() == null) ? 0 : getAutoAcceptSharedAssociations().hashCode());
        return hashCode;
    }

    @Override
    public CreateTransitGatewayMulticastDomainRequestOptions clone() {
        try {
            return (CreateTransitGatewayMulticastDomainRequestOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
