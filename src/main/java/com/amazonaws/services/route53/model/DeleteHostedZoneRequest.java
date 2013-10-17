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
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#deleteHostedZone(DeleteHostedZoneRequest) DeleteHostedZone operation}.
 * <p>
 * This action deletes a hosted zone. To delete a hosted zone, send a <code>DELETE</code> request to the <code>2012-12-12/hostedzone/hosted zone ID
 * </code> resource.
 * </p>
 * <p>
 * For more information about deleting a hosted zone, see <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DeleteHostedZone.html">
 * Deleting a Hosted Zone </a> in the <i>Amazon Route 53 Developer Guide</i> .
 * </p>
 * <p>
 * <b>IMPORTANT:</b> You can delete a hosted zone only if there are no resource record sets other than the default SOA record and NS resource record
 * sets. If your hosted zone contains other resource record sets, you must delete them before you can delete your hosted zone. If you try to delete a
 * hosted zone that contains other resource record sets, Route 53 will deny your request with a HostedZoneNotEmpty error. For information about deleting
 * records from your hosted zone, see ChangeResourceRecordSets.
 * </p>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#deleteHostedZone(DeleteHostedZoneRequest)
 */
public class DeleteHostedZoneRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the request. Include this ID in a call to <a>GetChange</a>
     * to track when the change has propagated to all Route 53 DNS servers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     */
    private String id;

    /**
     * Default constructor for a new DeleteHostedZoneRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteHostedZoneRequest() {}
    
    /**
     * Constructs a new DeleteHostedZoneRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param id The ID of the request. Include this ID in a call to
     * <a>GetChange</a> to track when the change has propagated to all Route
     * 53 DNS servers.
     */
    public DeleteHostedZoneRequest(String id) {
        setId(id);
    }

    /**
     * The ID of the request. Include this ID in a call to <a>GetChange</a>
     * to track when the change has propagated to all Route 53 DNS servers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @return The ID of the request. Include this ID in a call to <a>GetChange</a>
     *         to track when the change has propagated to all Route 53 DNS servers.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The ID of the request. Include this ID in a call to <a>GetChange</a>
     * to track when the change has propagated to all Route 53 DNS servers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param id The ID of the request. Include this ID in a call to <a>GetChange</a>
     *         to track when the change has propagated to all Route 53 DNS servers.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The ID of the request. Include this ID in a call to <a>GetChange</a>
     * to track when the change has propagated to all Route 53 DNS servers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param id The ID of the request. Include this ID in a call to <a>GetChange</a>
     *         to track when the change has propagated to all Route 53 DNS servers.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteHostedZoneRequest withId(String id) {
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

        if (obj instanceof DeleteHostedZoneRequest == false) return false;
        DeleteHostedZoneRequest other = (DeleteHostedZoneRequest)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        return true;
    }
    
}
    