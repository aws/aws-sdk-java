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
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#deleteTrafficPolicy(DeleteTrafficPolicyRequest) DeleteTrafficPolicy operation}.
 * <p>
 * Deletes a traffic policy. To delete a traffic policy, send a
 * <code>DELETE</code> request to the
 * <code>2013-04-01/trafficpolicy</code> resource.
 * </p>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#deleteTrafficPolicy(DeleteTrafficPolicyRequest)
 */
public class DeleteTrafficPolicyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the traffic policy that you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     */
    private String id;

    /**
     * The version number of the traffic policy that you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer version;

    /**
     * The ID of the traffic policy that you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @return The ID of the traffic policy that you want to delete.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The ID of the traffic policy that you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param id The ID of the traffic policy that you want to delete.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The ID of the traffic policy that you want to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param id The ID of the traffic policy that you want to delete.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteTrafficPolicyRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The version number of the traffic policy that you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return The version number of the traffic policy that you want to delete.
     */
    public Integer getVersion() {
        return version;
    }
    
    /**
     * The version number of the traffic policy that you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param version The version number of the traffic policy that you want to delete.
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
    
    /**
     * The version number of the traffic policy that you want to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param version The version number of the traffic policy that you want to delete.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteTrafficPolicyRequest withVersion(Integer version) {
        this.version = version;
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
        if (getVersion() != null) sb.append("Version: " + getVersion() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteTrafficPolicyRequest == false) return false;
        DeleteTrafficPolicyRequest other = (DeleteTrafficPolicyRequest)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteTrafficPolicyRequest clone() {
        
            return (DeleteTrafficPolicyRequest) super.clone();
    }

}
    