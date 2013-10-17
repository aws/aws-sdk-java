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


/**
 * <p>
 * Contains the result of a successful invocation of the GetInstanceProfile action.
 * </p>
 */
public class GetInstanceProfileResult implements Serializable {

    /**
     * Information about the instance profile.
     */
    private InstanceProfile instanceProfile;

    /**
     * Information about the instance profile.
     *
     * @return Information about the instance profile.
     */
    public InstanceProfile getInstanceProfile() {
        return instanceProfile;
    }
    
    /**
     * Information about the instance profile.
     *
     * @param instanceProfile Information about the instance profile.
     */
    public void setInstanceProfile(InstanceProfile instanceProfile) {
        this.instanceProfile = instanceProfile;
    }
    
    /**
     * Information about the instance profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceProfile Information about the instance profile.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetInstanceProfileResult withInstanceProfile(InstanceProfile instanceProfile) {
        this.instanceProfile = instanceProfile;
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
        if (getInstanceProfile() != null) sb.append("InstanceProfile: " + getInstanceProfile() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceProfile() == null) ? 0 : getInstanceProfile().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetInstanceProfileResult == false) return false;
        GetInstanceProfileResult other = (GetInstanceProfileResult)obj;
        
        if (other.getInstanceProfile() == null ^ this.getInstanceProfile() == null) return false;
        if (other.getInstanceProfile() != null && other.getInstanceProfile().equals(this.getInstanceProfile()) == false) return false; 
        return true;
    }
    
}
    