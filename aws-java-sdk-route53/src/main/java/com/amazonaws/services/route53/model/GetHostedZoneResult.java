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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contain the response to a <code>GetHostedZone</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHostedZone" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetHostedZoneResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains general information about the specified hosted zone.
     * </p>
     */
    private HostedZone hostedZone;
    /**
     * <p>
     * A complex type that lists the Amazon Route 53 name servers for the specified hosted zone.
     * </p>
     */
    private DelegationSet delegationSet;
    /**
     * <p>
     * A complex type that contains information about the VPCs that are associated with the specified hosted zone.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VPC> vPCs;

    /**
     * <p>
     * A complex type that contains general information about the specified hosted zone.
     * </p>
     * 
     * @param hostedZone
     *        A complex type that contains general information about the specified hosted zone.
     */

    public void setHostedZone(HostedZone hostedZone) {
        this.hostedZone = hostedZone;
    }

    /**
     * <p>
     * A complex type that contains general information about the specified hosted zone.
     * </p>
     * 
     * @return A complex type that contains general information about the specified hosted zone.
     */

    public HostedZone getHostedZone() {
        return this.hostedZone;
    }

    /**
     * <p>
     * A complex type that contains general information about the specified hosted zone.
     * </p>
     * 
     * @param hostedZone
     *        A complex type that contains general information about the specified hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHostedZoneResult withHostedZone(HostedZone hostedZone) {
        setHostedZone(hostedZone);
        return this;
    }

    /**
     * <p>
     * A complex type that lists the Amazon Route 53 name servers for the specified hosted zone.
     * </p>
     * 
     * @param delegationSet
     *        A complex type that lists the Amazon Route 53 name servers for the specified hosted zone.
     */

    public void setDelegationSet(DelegationSet delegationSet) {
        this.delegationSet = delegationSet;
    }

    /**
     * <p>
     * A complex type that lists the Amazon Route 53 name servers for the specified hosted zone.
     * </p>
     * 
     * @return A complex type that lists the Amazon Route 53 name servers for the specified hosted zone.
     */

    public DelegationSet getDelegationSet() {
        return this.delegationSet;
    }

    /**
     * <p>
     * A complex type that lists the Amazon Route 53 name servers for the specified hosted zone.
     * </p>
     * 
     * @param delegationSet
     *        A complex type that lists the Amazon Route 53 name servers for the specified hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHostedZoneResult withDelegationSet(DelegationSet delegationSet) {
        setDelegationSet(delegationSet);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the VPCs that are associated with the specified hosted zone.
     * </p>
     * 
     * @return A complex type that contains information about the VPCs that are associated with the specified hosted
     *         zone.
     */

    public java.util.List<VPC> getVPCs() {
        if (vPCs == null) {
            vPCs = new com.amazonaws.internal.SdkInternalList<VPC>();
        }
        return vPCs;
    }

    /**
     * <p>
     * A complex type that contains information about the VPCs that are associated with the specified hosted zone.
     * </p>
     * 
     * @param vPCs
     *        A complex type that contains information about the VPCs that are associated with the specified hosted
     *        zone.
     */

    public void setVPCs(java.util.Collection<VPC> vPCs) {
        if (vPCs == null) {
            this.vPCs = null;
            return;
        }

        this.vPCs = new com.amazonaws.internal.SdkInternalList<VPC>(vPCs);
    }

    /**
     * <p>
     * A complex type that contains information about the VPCs that are associated with the specified hosted zone.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVPCs(java.util.Collection)} or {@link #withVPCs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param vPCs
     *        A complex type that contains information about the VPCs that are associated with the specified hosted
     *        zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHostedZoneResult withVPCs(VPC... vPCs) {
        if (this.vPCs == null) {
            setVPCs(new com.amazonaws.internal.SdkInternalList<VPC>(vPCs.length));
        }
        for (VPC ele : vPCs) {
            this.vPCs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the VPCs that are associated with the specified hosted zone.
     * </p>
     * 
     * @param vPCs
     *        A complex type that contains information about the VPCs that are associated with the specified hosted
     *        zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHostedZoneResult withVPCs(java.util.Collection<VPC> vPCs) {
        setVPCs(vPCs);
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
        if (getHostedZone() != null)
            sb.append("HostedZone: ").append(getHostedZone()).append(",");
        if (getDelegationSet() != null)
            sb.append("DelegationSet: ").append(getDelegationSet()).append(",");
        if (getVPCs() != null)
            sb.append("VPCs: ").append(getVPCs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHostedZoneResult == false)
            return false;
        GetHostedZoneResult other = (GetHostedZoneResult) obj;
        if (other.getHostedZone() == null ^ this.getHostedZone() == null)
            return false;
        if (other.getHostedZone() != null && other.getHostedZone().equals(this.getHostedZone()) == false)
            return false;
        if (other.getDelegationSet() == null ^ this.getDelegationSet() == null)
            return false;
        if (other.getDelegationSet() != null && other.getDelegationSet().equals(this.getDelegationSet()) == false)
            return false;
        if (other.getVPCs() == null ^ this.getVPCs() == null)
            return false;
        if (other.getVPCs() != null && other.getVPCs().equals(this.getVPCs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostedZone() == null) ? 0 : getHostedZone().hashCode());
        hashCode = prime * hashCode + ((getDelegationSet() == null) ? 0 : getDelegationSet().hashCode());
        hashCode = prime * hashCode + ((getVPCs() == null) ? 0 : getVPCs().hashCode());
        return hashCode;
    }

    @Override
    public GetHostedZoneResult clone() {
        try {
            return (GetHostedZoneResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
