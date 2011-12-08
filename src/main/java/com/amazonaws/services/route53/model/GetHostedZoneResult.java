/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model;

/**
 * <p>
 * A complex type containing information about the specified hosted zone.
 * </p>
 */
public class GetHostedZoneResult {

    /**
     * A complex type that contains the information about the specified
     * hosted zone.
     */
    private HostedZone hostedZone;

    /**
     * A complex type that contains information about the name servers for
     * the specified hosted zone.
     */
    private DelegationSet delegationSet;

    /**
     * A complex type that contains the information about the specified
     * hosted zone.
     *
     * @return A complex type that contains the information about the specified
     *         hosted zone.
     */
    public HostedZone getHostedZone() {
        return hostedZone;
    }
    
    /**
     * A complex type that contains the information about the specified
     * hosted zone.
     *
     * @param hostedZone A complex type that contains the information about the specified
     *         hosted zone.
     */
    public void setHostedZone(HostedZone hostedZone) {
        this.hostedZone = hostedZone;
    }
    
    /**
     * A complex type that contains the information about the specified
     * hosted zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostedZone A complex type that contains the information about the specified
     *         hosted zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetHostedZoneResult withHostedZone(HostedZone hostedZone) {
        this.hostedZone = hostedZone;
        return this;
    }
    
    
    /**
     * A complex type that contains information about the name servers for
     * the specified hosted zone.
     *
     * @return A complex type that contains information about the name servers for
     *         the specified hosted zone.
     */
    public DelegationSet getDelegationSet() {
        return delegationSet;
    }
    
    /**
     * A complex type that contains information about the name servers for
     * the specified hosted zone.
     *
     * @param delegationSet A complex type that contains information about the name servers for
     *         the specified hosted zone.
     */
    public void setDelegationSet(DelegationSet delegationSet) {
        this.delegationSet = delegationSet;
    }
    
    /**
     * A complex type that contains information about the name servers for
     * the specified hosted zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param delegationSet A complex type that contains information about the name servers for
     *         the specified hosted zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetHostedZoneResult withDelegationSet(DelegationSet delegationSet) {
        this.delegationSet = delegationSet;
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
        sb.append("HostedZone: " + hostedZone + ", ");
        sb.append("DelegationSet: " + delegationSet + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    