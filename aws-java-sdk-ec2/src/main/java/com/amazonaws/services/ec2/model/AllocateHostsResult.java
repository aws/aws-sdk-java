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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * 
 */
public class AllocateHostsResult implements Serializable, Cloneable {

    /**
     * The ID of the allocated Dedicated host. This is used when you want to
     * launch an instance onto a specific host.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> hostIds;

    /**
     * The ID of the allocated Dedicated host. This is used when you want to
     * launch an instance onto a specific host.
     *
     * @return The ID of the allocated Dedicated host. This is used when you want to
     *         launch an instance onto a specific host.
     */
    public java.util.List<String> getHostIds() {
        if (hostIds == null) {
              hostIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              hostIds.setAutoConstruct(true);
        }
        return hostIds;
    }
    
    /**
     * The ID of the allocated Dedicated host. This is used when you want to
     * launch an instance onto a specific host.
     *
     * @param hostIds The ID of the allocated Dedicated host. This is used when you want to
     *         launch an instance onto a specific host.
     */
    public void setHostIds(java.util.Collection<String> hostIds) {
        if (hostIds == null) {
            this.hostIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> hostIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(hostIds.size());
        hostIdsCopy.addAll(hostIds);
        this.hostIds = hostIdsCopy;
    }
    
    /**
     * The ID of the allocated Dedicated host. This is used when you want to
     * launch an instance onto a specific host.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setHostIds(java.util.Collection)} or {@link
     * #withHostIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostIds The ID of the allocated Dedicated host. This is used when you want to
     *         launch an instance onto a specific host.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AllocateHostsResult withHostIds(String... hostIds) {
        if (getHostIds() == null) setHostIds(new java.util.ArrayList<String>(hostIds.length));
        for (String value : hostIds) {
            getHostIds().add(value);
        }
        return this;
    }
    
    /**
     * The ID of the allocated Dedicated host. This is used when you want to
     * launch an instance onto a specific host.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostIds The ID of the allocated Dedicated host. This is used when you want to
     *         launch an instance onto a specific host.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AllocateHostsResult withHostIds(java.util.Collection<String> hostIds) {
        if (hostIds == null) {
            this.hostIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> hostIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(hostIds.size());
            hostIdsCopy.addAll(hostIds);
            this.hostIds = hostIdsCopy;
        }

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
        if (getHostIds() != null) sb.append("HostIds: " + getHostIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHostIds() == null) ? 0 : getHostIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AllocateHostsResult == false) return false;
        AllocateHostsResult other = (AllocateHostsResult)obj;
        
        if (other.getHostIds() == null ^ this.getHostIds() == null) return false;
        if (other.getHostIds() != null && other.getHostIds().equals(this.getHostIds()) == false) return false; 
        return true;
    }
    
    @Override
    public AllocateHostsResult clone() {
        try {
            return (AllocateHostsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    