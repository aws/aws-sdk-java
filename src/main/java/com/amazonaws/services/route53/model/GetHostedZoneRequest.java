/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#getHostedZone(GetHostedZoneRequest) GetHostedZone operation}.
 * <p>
 * To retrieve the delegation set for a hosted zone, send a <code>GET</code> request to the <code>2012-12-12/hostedzone/hosted zone ID </code> resource.
 * The delegation set is the four Route 53 name servers that were assigned to the hosted zone when you created it.
 * </p>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#getHostedZone(GetHostedZoneRequest)
 */
public class GetHostedZoneRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the hosted zone for which you want to get a list of the name
     * servers in the delegation set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     */
    private String id;

    /**
     * Default constructor for a new GetHostedZoneRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetHostedZoneRequest() {}
    
    /**
     * Constructs a new GetHostedZoneRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param id The ID of the hosted zone for which you want to get a list
     * of the name servers in the delegation set.
     */
    public GetHostedZoneRequest(String id) {
        setId(id);
    }

    /**
     * The ID of the hosted zone for which you want to get a list of the name
     * servers in the delegation set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @return The ID of the hosted zone for which you want to get a list of the name
     *         servers in the delegation set.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The ID of the hosted zone for which you want to get a list of the name
     * servers in the delegation set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param id The ID of the hosted zone for which you want to get a list of the name
     *         servers in the delegation set.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The ID of the hosted zone for which you want to get a list of the name
     * servers in the delegation set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param id The ID of the hosted zone for which you want to get a list of the name
     *         servers in the delegation set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetHostedZoneRequest withId(String id) {
        this.id = id;
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
        if (getId() != null) sb.append("Id: " + getId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetHostedZoneRequest == false) return false;
        GetHostedZoneRequest other = (GetHostedZoneRequest)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        return true;
    }
    
}
    