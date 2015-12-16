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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#releaseHosts(ReleaseHostsRequest) ReleaseHosts operation}.
 * <p>
 * When you no longer want to use a Dedicated host it can be released.
 * On-Demand billing is stopped and the host goes into
 * <code>released</code> state. The host ID of Dedicated hosts that have
 * been released can no longer be specified in another request, e.g.,
 * ModifyHosts. You must stop or terminate all instances on a host before
 * it can be released.
 * </p>
 * <p>
 * When Dedicated hosts are released, it make take some time for them to
 * stop counting toward your limit and you may receive capacity errors
 * when trying to allocate new Dedicated hosts. Try waiting a few
 * minutes, and then try again.
 * </p>
 * <p>
 * Released hosts will still appear in a DescribeHosts response.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#releaseHosts(ReleaseHostsRequest)
 */
public class ReleaseHostsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The IDs of the Dedicated hosts you want to release.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> hostIds;

    /**
     * The IDs of the Dedicated hosts you want to release.
     *
     * @return The IDs of the Dedicated hosts you want to release.
     */
    public java.util.List<String> getHostIds() {
        if (hostIds == null) {
              hostIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              hostIds.setAutoConstruct(true);
        }
        return hostIds;
    }
    
    /**
     * The IDs of the Dedicated hosts you want to release.
     *
     * @param hostIds The IDs of the Dedicated hosts you want to release.
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
     * The IDs of the Dedicated hosts you want to release.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setHostIds(java.util.Collection)} or {@link
     * #withHostIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostIds The IDs of the Dedicated hosts you want to release.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReleaseHostsRequest withHostIds(String... hostIds) {
        if (getHostIds() == null) setHostIds(new java.util.ArrayList<String>(hostIds.length));
        for (String value : hostIds) {
            getHostIds().add(value);
        }
        return this;
    }
    
    /**
     * The IDs of the Dedicated hosts you want to release.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostIds The IDs of the Dedicated hosts you want to release.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReleaseHostsRequest withHostIds(java.util.Collection<String> hostIds) {
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

        if (obj instanceof ReleaseHostsRequest == false) return false;
        ReleaseHostsRequest other = (ReleaseHostsRequest)obj;
        
        if (other.getHostIds() == null ^ this.getHostIds() == null) return false;
        if (other.getHostIds() != null && other.getHostIds().equals(this.getHostIds()) == false) return false; 
        return true;
    }
    
    @Override
    public ReleaseHostsRequest clone() {
        
            return (ReleaseHostsRequest) super.clone();
    }

}
    