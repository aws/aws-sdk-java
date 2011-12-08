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
 * A complex type containing the response information for the new hosted
 * zone.
 * </p>
 */
public class CreateHostedZoneResult {

    /**
     * A complex type that contains identifying information about the hosted
     * zone.
     */
    private HostedZone hostedZone;

    /**
     * A complex type that contains information about the request to create a
     * hosted zone. This includes an ID that you use when you call the
     * <a>GetChange</a> action to get the current status of the change
     * request.
     */
    private ChangeInfo changeInfo;

    /**
     * A complex type that contains name server information.
     */
    private DelegationSet delegationSet;

    /**
     * The unique URL representing the new hosted zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String location;

    /**
     * A complex type that contains identifying information about the hosted
     * zone.
     *
     * @return A complex type that contains identifying information about the hosted
     *         zone.
     */
    public HostedZone getHostedZone() {
        return hostedZone;
    }
    
    /**
     * A complex type that contains identifying information about the hosted
     * zone.
     *
     * @param hostedZone A complex type that contains identifying information about the hosted
     *         zone.
     */
    public void setHostedZone(HostedZone hostedZone) {
        this.hostedZone = hostedZone;
    }
    
    /**
     * A complex type that contains identifying information about the hosted
     * zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostedZone A complex type that contains identifying information about the hosted
     *         zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateHostedZoneResult withHostedZone(HostedZone hostedZone) {
        this.hostedZone = hostedZone;
        return this;
    }
    
    
    /**
     * A complex type that contains information about the request to create a
     * hosted zone. This includes an ID that you use when you call the
     * <a>GetChange</a> action to get the current status of the change
     * request.
     *
     * @return A complex type that contains information about the request to create a
     *         hosted zone. This includes an ID that you use when you call the
     *         <a>GetChange</a> action to get the current status of the change
     *         request.
     */
    public ChangeInfo getChangeInfo() {
        return changeInfo;
    }
    
    /**
     * A complex type that contains information about the request to create a
     * hosted zone. This includes an ID that you use when you call the
     * <a>GetChange</a> action to get the current status of the change
     * request.
     *
     * @param changeInfo A complex type that contains information about the request to create a
     *         hosted zone. This includes an ID that you use when you call the
     *         <a>GetChange</a> action to get the current status of the change
     *         request.
     */
    public void setChangeInfo(ChangeInfo changeInfo) {
        this.changeInfo = changeInfo;
    }
    
    /**
     * A complex type that contains information about the request to create a
     * hosted zone. This includes an ID that you use when you call the
     * <a>GetChange</a> action to get the current status of the change
     * request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param changeInfo A complex type that contains information about the request to create a
     *         hosted zone. This includes an ID that you use when you call the
     *         <a>GetChange</a> action to get the current status of the change
     *         request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateHostedZoneResult withChangeInfo(ChangeInfo changeInfo) {
        this.changeInfo = changeInfo;
        return this;
    }
    
    
    /**
     * A complex type that contains name server information.
     *
     * @return A complex type that contains name server information.
     */
    public DelegationSet getDelegationSet() {
        return delegationSet;
    }
    
    /**
     * A complex type that contains name server information.
     *
     * @param delegationSet A complex type that contains name server information.
     */
    public void setDelegationSet(DelegationSet delegationSet) {
        this.delegationSet = delegationSet;
    }
    
    /**
     * A complex type that contains name server information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param delegationSet A complex type that contains name server information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateHostedZoneResult withDelegationSet(DelegationSet delegationSet) {
        this.delegationSet = delegationSet;
        return this;
    }
    
    
    /**
     * The unique URL representing the new hosted zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return The unique URL representing the new hosted zone.
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * The unique URL representing the new hosted zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param location The unique URL representing the new hosted zone.
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * The unique URL representing the new hosted zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param location The unique URL representing the new hosted zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateHostedZoneResult withLocation(String location) {
        this.location = location;
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
        sb.append("ChangeInfo: " + changeInfo + ", ");
        sb.append("DelegationSet: " + delegationSet + ", ");
        sb.append("Location: " + location + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    