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
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#deleteHealthCheck(DeleteHealthCheckRequest) DeleteHealthCheck operation}.
 * <p>
 * This action deletes a health check. To delete a health check, send a <code>DELETE</code> request to the <code>2012-12-12/healthcheck/health check ID
 * </code> resource.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> You can delete a health check only if there are no resource record sets associated with this health check. If resource record sets
 * are associated with this health check, you must disassociate them before you can delete your health check. If you try to delete a health check that is
 * associated with resource record sets, Route 53 will deny your request with a HealthCheckInUse error. For information about disassociating the records
 * from your health check, see ChangeResourceRecordSets.
 * </p>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#deleteHealthCheck(DeleteHealthCheckRequest)
 */
public class DeleteHealthCheckRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the health check to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String healthCheckId;

    /**
     * The ID of the health check to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return The ID of the health check to delete.
     */
    public String getHealthCheckId() {
        return healthCheckId;
    }
    
    /**
     * The ID of the health check to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param healthCheckId The ID of the health check to delete.
     */
    public void setHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
    }
    
    /**
     * The ID of the health check to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param healthCheckId The ID of the health check to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteHealthCheckRequest withHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
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
        if (getHealthCheckId() != null) sb.append("HealthCheckId: " + getHealthCheckId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHealthCheckId() == null) ? 0 : getHealthCheckId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteHealthCheckRequest == false) return false;
        DeleteHealthCheckRequest other = (DeleteHealthCheckRequest)obj;
        
        if (other.getHealthCheckId() == null ^ this.getHealthCheckId() == null) return false;
        if (other.getHealthCheckId() != null && other.getHealthCheckId().equals(this.getHealthCheckId()) == false) return false; 
        return true;
    }
    
}
    