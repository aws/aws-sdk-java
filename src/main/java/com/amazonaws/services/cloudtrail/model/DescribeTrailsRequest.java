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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudtrail.AWSCloudTrail#describeTrails(DescribeTrailsRequest) DescribeTrails operation}.
 * <p>
 * Retrieves the settings for some or all trails associated with an account. Returns a list of Trail structures in JSON format.
 * </p>
 *
 * @see com.amazonaws.services.cloudtrail.AWSCloudTrail#describeTrails(DescribeTrailsRequest)
 */
public class DescribeTrailsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The list of <a>Trail</a> object names.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> trailNameList;

    /**
     * The list of <a>Trail</a> object names.
     *
     * @return The list of <a>Trail</a> object names.
     */
    public java.util.List<String> getTrailNameList() {
        if (trailNameList == null) {
              trailNameList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              trailNameList.setAutoConstruct(true);
        }
        return trailNameList;
    }
    
    /**
     * The list of <a>Trail</a> object names.
     *
     * @param trailNameList The list of <a>Trail</a> object names.
     */
    public void setTrailNameList(java.util.Collection<String> trailNameList) {
        if (trailNameList == null) {
            this.trailNameList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> trailNameListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(trailNameList.size());
        trailNameListCopy.addAll(trailNameList);
        this.trailNameList = trailNameListCopy;
    }
    
    /**
     * The list of <a>Trail</a> object names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trailNameList The list of <a>Trail</a> object names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTrailsRequest withTrailNameList(String... trailNameList) {
        if (getTrailNameList() == null) setTrailNameList(new java.util.ArrayList<String>(trailNameList.length));
        for (String value : trailNameList) {
            getTrailNameList().add(value);
        }
        return this;
    }
    
    /**
     * The list of <a>Trail</a> object names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trailNameList The list of <a>Trail</a> object names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTrailsRequest withTrailNameList(java.util.Collection<String> trailNameList) {
        if (trailNameList == null) {
            this.trailNameList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> trailNameListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(trailNameList.size());
            trailNameListCopy.addAll(trailNameList);
            this.trailNameList = trailNameListCopy;
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
        if (getTrailNameList() != null) sb.append("TrailNameList: " + getTrailNameList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTrailNameList() == null) ? 0 : getTrailNameList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTrailsRequest == false) return false;
        DescribeTrailsRequest other = (DescribeTrailsRequest)obj;
        
        if (other.getTrailNameList() == null ^ this.getTrailNameList() == null) return false;
        if (other.getTrailNameList() != null && other.getTrailNameList().equals(this.getTrailNameList()) == false) return false; 
        return true;
    }
    
}
    