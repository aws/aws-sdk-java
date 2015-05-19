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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#grantAccess(GrantAccessRequest) GrantAccess operation}.
 * <p>
 * <b>NOTE:</b>This API can be used only with Windows stacks.
 * </p>
 * <p>
 * Grants RDP access to a Windows instance for a specified time period.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#grantAccess(GrantAccessRequest)
 */
public class GrantAccessRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The instance's AWS OpsWorks ID.
     */
    private String instanceId;

    /**
     * The length of time (in minutes) that the grant is valid. When the
     * grant expires at the end of this period, the user will no longer be
     * able to use the credentials to log in. If the user is logged in at the
     * time, he or she automatically will be logged out.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 1440<br/>
     */
    private Integer validForInMinutes;

    /**
     * The instance's AWS OpsWorks ID.
     *
     * @return The instance's AWS OpsWorks ID.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance's AWS OpsWorks ID.
     *
     * @param instanceId The instance's AWS OpsWorks ID.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance's AWS OpsWorks ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance's AWS OpsWorks ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GrantAccessRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The length of time (in minutes) that the grant is valid. When the
     * grant expires at the end of this period, the user will no longer be
     * able to use the credentials to log in. If the user is logged in at the
     * time, he or she automatically will be logged out.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 1440<br/>
     *
     * @return The length of time (in minutes) that the grant is valid. When the
     *         grant expires at the end of this period, the user will no longer be
     *         able to use the credentials to log in. If the user is logged in at the
     *         time, he or she automatically will be logged out.
     */
    public Integer getValidForInMinutes() {
        return validForInMinutes;
    }
    
    /**
     * The length of time (in minutes) that the grant is valid. When the
     * grant expires at the end of this period, the user will no longer be
     * able to use the credentials to log in. If the user is logged in at the
     * time, he or she automatically will be logged out.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 1440<br/>
     *
     * @param validForInMinutes The length of time (in minutes) that the grant is valid. When the
     *         grant expires at the end of this period, the user will no longer be
     *         able to use the credentials to log in. If the user is logged in at the
     *         time, he or she automatically will be logged out.
     */
    public void setValidForInMinutes(Integer validForInMinutes) {
        this.validForInMinutes = validForInMinutes;
    }
    
    /**
     * The length of time (in minutes) that the grant is valid. When the
     * grant expires at the end of this period, the user will no longer be
     * able to use the credentials to log in. If the user is logged in at the
     * time, he or she automatically will be logged out.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 1440<br/>
     *
     * @param validForInMinutes The length of time (in minutes) that the grant is valid. When the
     *         grant expires at the end of this period, the user will no longer be
     *         able to use the credentials to log in. If the user is logged in at the
     *         time, he or she automatically will be logged out.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GrantAccessRequest withValidForInMinutes(Integer validForInMinutes) {
        this.validForInMinutes = validForInMinutes;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getValidForInMinutes() != null) sb.append("ValidForInMinutes: " + getValidForInMinutes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getValidForInMinutes() == null) ? 0 : getValidForInMinutes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GrantAccessRequest == false) return false;
        GrantAccessRequest other = (GrantAccessRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getValidForInMinutes() == null ^ this.getValidForInMinutes() == null) return false;
        if (other.getValidForInMinutes() != null && other.getValidForInMinutes().equals(this.getValidForInMinutes()) == false) return false; 
        return true;
    }
    
    @Override
    public GrantAccessRequest clone() {
        
            return (GrantAccessRequest) super.clone();
    }

}
    