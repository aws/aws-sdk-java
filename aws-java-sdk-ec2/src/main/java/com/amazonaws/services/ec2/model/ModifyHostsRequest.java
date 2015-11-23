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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#modifyHosts(ModifyHostsRequest) ModifyHosts operation}.
 * <p>
 * Modify the auto-placement setting of a Dedicated host. When
 * auto-placement is enabled, AWS will place instances that you launch
 * with a tenancy of <code>host</code> , but without targeting a specific
 * host ID, onto any available Dedicated host in your account which has
 * auto-placement enabled. When auto-placement is disabled, you need to
 * provide a host ID if you want the instance to launch onto a specific
 * host. If no host ID is provided, the instance will be launched onto a
 * suitable host which has auto-placement enabled.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#modifyHosts(ModifyHostsRequest)
 */
public class ModifyHostsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The host IDs of the Dedicated hosts you want to modify.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> hostIds;

    /**
     * Specify whether to enable or disable auto-placement.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     */
    private String autoPlacement;

    /**
     * The host IDs of the Dedicated hosts you want to modify.
     *
     * @return The host IDs of the Dedicated hosts you want to modify.
     */
    public java.util.List<String> getHostIds() {
        if (hostIds == null) {
              hostIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              hostIds.setAutoConstruct(true);
        }
        return hostIds;
    }
    
    /**
     * The host IDs of the Dedicated hosts you want to modify.
     *
     * @param hostIds The host IDs of the Dedicated hosts you want to modify.
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
     * The host IDs of the Dedicated hosts you want to modify.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setHostIds(java.util.Collection)} or {@link
     * #withHostIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostIds The host IDs of the Dedicated hosts you want to modify.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyHostsRequest withHostIds(String... hostIds) {
        if (getHostIds() == null) setHostIds(new java.util.ArrayList<String>(hostIds.length));
        for (String value : hostIds) {
            getHostIds().add(value);
        }
        return this;
    }
    
    /**
     * The host IDs of the Dedicated hosts you want to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostIds The host IDs of the Dedicated hosts you want to modify.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyHostsRequest withHostIds(java.util.Collection<String> hostIds) {
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
     * Specify whether to enable or disable auto-placement.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @return Specify whether to enable or disable auto-placement.
     *
     * @see AutoPlacement
     */
    public String getAutoPlacement() {
        return autoPlacement;
    }
    
    /**
     * Specify whether to enable or disable auto-placement.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement Specify whether to enable or disable auto-placement.
     *
     * @see AutoPlacement
     */
    public void setAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
    }
    
    /**
     * Specify whether to enable or disable auto-placement.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement Specify whether to enable or disable auto-placement.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AutoPlacement
     */
    public ModifyHostsRequest withAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
        return this;
    }

    /**
     * Specify whether to enable or disable auto-placement.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement Specify whether to enable or disable auto-placement.
     *
     * @see AutoPlacement
     */
    public void setAutoPlacement(AutoPlacement autoPlacement) {
        this.autoPlacement = autoPlacement.toString();
    }
    
    /**
     * Specify whether to enable or disable auto-placement.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement Specify whether to enable or disable auto-placement.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AutoPlacement
     */
    public ModifyHostsRequest withAutoPlacement(AutoPlacement autoPlacement) {
        this.autoPlacement = autoPlacement.toString();
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
        if (getHostIds() != null) sb.append("HostIds: " + getHostIds() + ",");
        if (getAutoPlacement() != null) sb.append("AutoPlacement: " + getAutoPlacement() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHostIds() == null) ? 0 : getHostIds().hashCode()); 
        hashCode = prime * hashCode + ((getAutoPlacement() == null) ? 0 : getAutoPlacement().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyHostsRequest == false) return false;
        ModifyHostsRequest other = (ModifyHostsRequest)obj;
        
        if (other.getHostIds() == null ^ this.getHostIds() == null) return false;
        if (other.getHostIds() != null && other.getHostIds().equals(this.getHostIds()) == false) return false; 
        if (other.getAutoPlacement() == null ^ this.getAutoPlacement() == null) return false;
        if (other.getAutoPlacement() != null && other.getAutoPlacement().equals(this.getAutoPlacement()) == false) return false; 
        return true;
    }
    
    @Override
    public ModifyHostsRequest clone() {
        
            return (ModifyHostsRequest) super.clone();
    }

}
    