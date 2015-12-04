/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#updateTrafficPolicyInstance(UpdateTrafficPolicyInstanceRequest) UpdateTrafficPolicyInstance operation}.
 * <p>
 * Updates the resource record sets in a specified hosted zone that were
 * created based on the settings in a specified traffic policy version.
 * </p>
 * <p>
 * <b>IMPORTANT:</b>The DNS type of the resource record sets that you're
 * updating must match the DNS type in the JSON document that is
 * associated with the traffic policy version that you're using to update
 * the traffic policy instance.
 * </p>
 * <p>
 * When you update a traffic policy instance, Amazon Route 53 continues
 * to respond to DNS queries for the root resource record set name (such
 * as example.com) while it replaces one group of resource record sets
 * with another. Amazon Route 53 performs the following operations:
 * </p>
 * <ol> <li>Amazon Route 53 creates a new group of resource record sets
 * based on the specified traffic policy. This is true regardless of how
 * substantial the differences are between the existing resource record
 * sets and the new resource record sets. </li>
 * <li>When all of the new resource record sets have been created,
 * Amazon Route 53 starts to respond to DNS queries for the root resource
 * record set name (such as example.com) by using the new resource record
 * sets.</li>
 * <li>Amazon Route 53 deletes the old group of resource record sets
 * that are associated with the root resource record set name.</li>
 * </ol> <p>
 * To update a traffic policy instance, send a <code>POST</code> request
 * to the <code>/2013-04-01/trafficpolicyinstance/traffic policy ID
 * </code> resource. The request body must include an XML document with
 * an <code>UpdateTrafficPolicyInstanceRequest</code> element.
 * </p>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#updateTrafficPolicyInstance(UpdateTrafficPolicyInstanceRequest)
 */
public class UpdateTrafficPolicyInstanceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the traffic policy instance that you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     */
    private String id;

    /**
     * The TTL that you want Amazon Route 53 to assign to all of the updated
     * resource record sets.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Long tTL;

    /**
     * The ID of the traffic policy that you want Amazon Route 53 to use to
     * update resource record sets for the specified traffic policy instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     */
    private String trafficPolicyId;

    /**
     * The version of the traffic policy that you want Amazon Route 53 to use
     * to update resource record sets for the specified traffic policy
     * instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer trafficPolicyVersion;

    /**
     * The ID of the traffic policy instance that you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @return The ID of the traffic policy instance that you want to update.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The ID of the traffic policy instance that you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param id The ID of the traffic policy instance that you want to update.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The ID of the traffic policy instance that you want to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param id The ID of the traffic policy instance that you want to update.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateTrafficPolicyInstanceRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The TTL that you want Amazon Route 53 to assign to all of the updated
     * resource record sets.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return The TTL that you want Amazon Route 53 to assign to all of the updated
     *         resource record sets.
     */
    public Long getTTL() {
        return tTL;
    }
    
    /**
     * The TTL that you want Amazon Route 53 to assign to all of the updated
     * resource record sets.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param tTL The TTL that you want Amazon Route 53 to assign to all of the updated
     *         resource record sets.
     */
    public void setTTL(Long tTL) {
        this.tTL = tTL;
    }
    
    /**
     * The TTL that you want Amazon Route 53 to assign to all of the updated
     * resource record sets.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param tTL The TTL that you want Amazon Route 53 to assign to all of the updated
     *         resource record sets.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateTrafficPolicyInstanceRequest withTTL(Long tTL) {
        this.tTL = tTL;
        return this;
    }

    /**
     * The ID of the traffic policy that you want Amazon Route 53 to use to
     * update resource record sets for the specified traffic policy instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @return The ID of the traffic policy that you want Amazon Route 53 to use to
     *         update resource record sets for the specified traffic policy instance.
     */
    public String getTrafficPolicyId() {
        return trafficPolicyId;
    }
    
    /**
     * The ID of the traffic policy that you want Amazon Route 53 to use to
     * update resource record sets for the specified traffic policy instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param trafficPolicyId The ID of the traffic policy that you want Amazon Route 53 to use to
     *         update resource record sets for the specified traffic policy instance.
     */
    public void setTrafficPolicyId(String trafficPolicyId) {
        this.trafficPolicyId = trafficPolicyId;
    }
    
    /**
     * The ID of the traffic policy that you want Amazon Route 53 to use to
     * update resource record sets for the specified traffic policy instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param trafficPolicyId The ID of the traffic policy that you want Amazon Route 53 to use to
     *         update resource record sets for the specified traffic policy instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateTrafficPolicyInstanceRequest withTrafficPolicyId(String trafficPolicyId) {
        this.trafficPolicyId = trafficPolicyId;
        return this;
    }

    /**
     * The version of the traffic policy that you want Amazon Route 53 to use
     * to update resource record sets for the specified traffic policy
     * instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return The version of the traffic policy that you want Amazon Route 53 to use
     *         to update resource record sets for the specified traffic policy
     *         instance.
     */
    public Integer getTrafficPolicyVersion() {
        return trafficPolicyVersion;
    }
    
    /**
     * The version of the traffic policy that you want Amazon Route 53 to use
     * to update resource record sets for the specified traffic policy
     * instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param trafficPolicyVersion The version of the traffic policy that you want Amazon Route 53 to use
     *         to update resource record sets for the specified traffic policy
     *         instance.
     */
    public void setTrafficPolicyVersion(Integer trafficPolicyVersion) {
        this.trafficPolicyVersion = trafficPolicyVersion;
    }
    
    /**
     * The version of the traffic policy that you want Amazon Route 53 to use
     * to update resource record sets for the specified traffic policy
     * instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param trafficPolicyVersion The version of the traffic policy that you want Amazon Route 53 to use
     *         to update resource record sets for the specified traffic policy
     *         instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateTrafficPolicyInstanceRequest withTrafficPolicyVersion(Integer trafficPolicyVersion) {
        this.trafficPolicyVersion = trafficPolicyVersion;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getTTL() != null) sb.append("TTL: " + getTTL() + ",");
        if (getTrafficPolicyId() != null) sb.append("TrafficPolicyId: " + getTrafficPolicyId() + ",");
        if (getTrafficPolicyVersion() != null) sb.append("TrafficPolicyVersion: " + getTrafficPolicyVersion() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getTTL() == null) ? 0 : getTTL().hashCode()); 
        hashCode = prime * hashCode + ((getTrafficPolicyId() == null) ? 0 : getTrafficPolicyId().hashCode()); 
        hashCode = prime * hashCode + ((getTrafficPolicyVersion() == null) ? 0 : getTrafficPolicyVersion().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateTrafficPolicyInstanceRequest == false) return false;
        UpdateTrafficPolicyInstanceRequest other = (UpdateTrafficPolicyInstanceRequest)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getTTL() == null ^ this.getTTL() == null) return false;
        if (other.getTTL() != null && other.getTTL().equals(this.getTTL()) == false) return false; 
        if (other.getTrafficPolicyId() == null ^ this.getTrafficPolicyId() == null) return false;
        if (other.getTrafficPolicyId() != null && other.getTrafficPolicyId().equals(this.getTrafficPolicyId()) == false) return false; 
        if (other.getTrafficPolicyVersion() == null ^ this.getTrafficPolicyVersion() == null) return false;
        if (other.getTrafficPolicyVersion() != null && other.getTrafficPolicyVersion().equals(this.getTrafficPolicyVersion()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateTrafficPolicyInstanceRequest clone() {
        
            return (UpdateTrafficPolicyInstanceRequest) super.clone();
    }

}
    