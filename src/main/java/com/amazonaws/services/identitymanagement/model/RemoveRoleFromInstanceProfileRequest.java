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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#removeRoleFromInstanceProfile(RemoveRoleFromInstanceProfileRequest) RemoveRoleFromInstanceProfile operation}.
 * <p>
 * Removes the specified role from the specified instance profile.
 * </p>
 * <p>
 * <b>IMPORTANT:</b>Make sure you do not have any Amazon EC2 instances running with the role you are about to remove from the instance profile. Removing
 * a role from an instance profile that is associated with a running instance will break any applications running on the instance.
 * </p>
 * <p>
 * For more information about roles, go to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"> Working with Roles </a> . For
 * more information about instance profiles, go to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"> About Instance
 * Profiles </a> .
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#removeRoleFromInstanceProfile(RemoveRoleFromInstanceProfileRequest)
 */
public class RemoveRoleFromInstanceProfileRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Name of the instance profile to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String instanceProfileName;

    /**
     * Name of the role to remove.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String roleName;

    /**
     * Name of the instance profile to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the instance profile to update.
     */
    public String getInstanceProfileName() {
        return instanceProfileName;
    }
    
    /**
     * Name of the instance profile to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param instanceProfileName Name of the instance profile to update.
     */
    public void setInstanceProfileName(String instanceProfileName) {
        this.instanceProfileName = instanceProfileName;
    }
    
    /**
     * Name of the instance profile to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param instanceProfileName Name of the instance profile to update.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RemoveRoleFromInstanceProfileRequest withInstanceProfileName(String instanceProfileName) {
        this.instanceProfileName = instanceProfileName;
        return this;
    }

    /**
     * Name of the role to remove.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the role to remove.
     */
    public String getRoleName() {
        return roleName;
    }
    
    /**
     * Name of the role to remove.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param roleName Name of the role to remove.
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    /**
     * Name of the role to remove.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param roleName Name of the role to remove.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RemoveRoleFromInstanceProfileRequest withRoleName(String roleName) {
        this.roleName = roleName;
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
        if (getInstanceProfileName() != null) sb.append("InstanceProfileName: " + getInstanceProfileName() + ",");
        if (getRoleName() != null) sb.append("RoleName: " + getRoleName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceProfileName() == null) ? 0 : getInstanceProfileName().hashCode()); 
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RemoveRoleFromInstanceProfileRequest == false) return false;
        RemoveRoleFromInstanceProfileRequest other = (RemoveRoleFromInstanceProfileRequest)obj;
        
        if (other.getInstanceProfileName() == null ^ this.getInstanceProfileName() == null) return false;
        if (other.getInstanceProfileName() != null && other.getInstanceProfileName().equals(this.getInstanceProfileName()) == false) return false; 
        if (other.getRoleName() == null ^ this.getRoleName() == null) return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false) return false; 
        return true;
    }
    
}
    