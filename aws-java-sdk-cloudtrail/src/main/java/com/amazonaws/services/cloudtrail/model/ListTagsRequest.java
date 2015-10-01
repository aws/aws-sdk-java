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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudtrail.AWSCloudTrail#listTags(ListTagsRequest) ListTags operation}.
 * <p>
 * Lists the tags for the trail in the current region.
 * </p>
 *
 * @see com.amazonaws.services.cloudtrail.AWSCloudTrail#listTags(ListTagsRequest)
 */
public class ListTagsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Specifies a list of trail ARNs whose tags will be listed. The list has
     * a limit of 20 ARNs. The format of a trail ARN is
     * <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceIdList;

    /**
     * Reserved for future use.
     */
    private String nextToken;

    /**
     * Specifies a list of trail ARNs whose tags will be listed. The list has
     * a limit of 20 ARNs. The format of a trail ARN is
     * <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>.
     *
     * @return Specifies a list of trail ARNs whose tags will be listed. The list has
     *         a limit of 20 ARNs. The format of a trail ARN is
     *         <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>.
     */
    public java.util.List<String> getResourceIdList() {
        if (resourceIdList == null) {
              resourceIdList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              resourceIdList.setAutoConstruct(true);
        }
        return resourceIdList;
    }
    
    /**
     * Specifies a list of trail ARNs whose tags will be listed. The list has
     * a limit of 20 ARNs. The format of a trail ARN is
     * <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>.
     *
     * @param resourceIdList Specifies a list of trail ARNs whose tags will be listed. The list has
     *         a limit of 20 ARNs. The format of a trail ARN is
     *         <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>.
     */
    public void setResourceIdList(java.util.Collection<String> resourceIdList) {
        if (resourceIdList == null) {
            this.resourceIdList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceIdListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(resourceIdList.size());
        resourceIdListCopy.addAll(resourceIdList);
        this.resourceIdList = resourceIdListCopy;
    }
    
    /**
     * Specifies a list of trail ARNs whose tags will be listed. The list has
     * a limit of 20 ARNs. The format of a trail ARN is
     * <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResourceIdList(java.util.Collection)} or {@link
     * #withResourceIdList(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceIdList Specifies a list of trail ARNs whose tags will be listed. The list has
     *         a limit of 20 ARNs. The format of a trail ARN is
     *         <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTagsRequest withResourceIdList(String... resourceIdList) {
        if (getResourceIdList() == null) setResourceIdList(new java.util.ArrayList<String>(resourceIdList.length));
        for (String value : resourceIdList) {
            getResourceIdList().add(value);
        }
        return this;
    }
    
    /**
     * Specifies a list of trail ARNs whose tags will be listed. The list has
     * a limit of 20 ARNs. The format of a trail ARN is
     * <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceIdList Specifies a list of trail ARNs whose tags will be listed. The list has
     *         a limit of 20 ARNs. The format of a trail ARN is
     *         <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTagsRequest withResourceIdList(java.util.Collection<String> resourceIdList) {
        if (resourceIdList == null) {
            this.resourceIdList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceIdListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(resourceIdList.size());
            resourceIdListCopy.addAll(resourceIdList);
            this.resourceIdList = resourceIdListCopy;
        }

        return this;
    }

    /**
     * Reserved for future use.
     *
     * @return Reserved for future use.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Reserved for future use.
     *
     * @param nextToken Reserved for future use.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Reserved for future use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken Reserved for future use.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTagsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getResourceIdList() != null) sb.append("ResourceIdList: " + getResourceIdList() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceIdList() == null) ? 0 : getResourceIdList().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTagsRequest == false) return false;
        ListTagsRequest other = (ListTagsRequest)obj;
        
        if (other.getResourceIdList() == null ^ this.getResourceIdList() == null) return false;
        if (other.getResourceIdList() != null && other.getResourceIdList().equals(this.getResourceIdList()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public ListTagsRequest clone() {
        
            return (ListTagsRequest) super.clone();
    }

}
    