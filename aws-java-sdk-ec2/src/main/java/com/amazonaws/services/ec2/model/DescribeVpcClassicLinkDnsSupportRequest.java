/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeVpcClassicLinkDnsSupport(DescribeVpcClassicLinkDnsSupportRequest) DescribeVpcClassicLinkDnsSupport operation}.
 * <p>
 * Describes the ClassicLink DNS support status of one or more VPCs. If
 * enabled, the DNS hostname of a linked EC2-Classic instance resolves to
 * its private IP address when addressed from an instance in the VPC to
 * which it's linked. Similarly, the DNS hostname of an instance in a VPC
 * resolves to its private IP address when addressed from a linked
 * EC2-Classic instance. For more information about ClassicLink, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"> ClassicLink </a>
 * in the Amazon Elastic Compute Cloud User Guide.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeVpcClassicLinkDnsSupport(DescribeVpcClassicLinkDnsSupportRequest)
 */
public class DescribeVpcClassicLinkDnsSupportRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * One or more VPC IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcIds;

    /**
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the
     * next set of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 255<br/>
     */
    private Integer maxResults;

    /**
     * The token for the next set of items to return. (You received this
     * token from a prior call.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * One or more VPC IDs.
     *
     * @return One or more VPC IDs.
     */
    public java.util.List<String> getVpcIds() {
        if (vpcIds == null) {
              vpcIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              vpcIds.setAutoConstruct(true);
        }
        return vpcIds;
    }
    
    /**
     * One or more VPC IDs.
     *
     * @param vpcIds One or more VPC IDs.
     */
    public void setVpcIds(java.util.Collection<String> vpcIds) {
        if (vpcIds == null) {
            this.vpcIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcIds.size());
        vpcIdsCopy.addAll(vpcIds);
        this.vpcIds = vpcIdsCopy;
    }
    
    /**
     * One or more VPC IDs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVpcIds(java.util.Collection)} or {@link
     * #withVpcIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcIds One or more VPC IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcClassicLinkDnsSupportRequest withVpcIds(String... vpcIds) {
        if (getVpcIds() == null) setVpcIds(new java.util.ArrayList<String>(vpcIds.length));
        for (String value : vpcIds) {
            getVpcIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more VPC IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcIds One or more VPC IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcClassicLinkDnsSupportRequest withVpcIds(java.util.Collection<String> vpcIds) {
        if (vpcIds == null) {
            this.vpcIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcIds.size());
            vpcIdsCopy.addAll(vpcIds);
            this.vpcIds = vpcIdsCopy;
        }

        return this;
    }

    /**
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the
     * next set of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 255<br/>
     *
     * @return The maximum number of items to return for this request. The request
     *         returns a token that you can specify in a subsequent call to get the
     *         next set of results.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the
     * next set of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 255<br/>
     *
     * @param maxResults The maximum number of items to return for this request. The request
     *         returns a token that you can specify in a subsequent call to get the
     *         next set of results.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the
     * next set of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 255<br/>
     *
     * @param maxResults The maximum number of items to return for this request. The request
     *         returns a token that you can specify in a subsequent call to get the
     *         next set of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcClassicLinkDnsSupportRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * The token for the next set of items to return. (You received this
     * token from a prior call.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return The token for the next set of items to return. (You received this
     *         token from a prior call.)
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token for the next set of items to return. (You received this
     * token from a prior call.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken The token for the next set of items to return. (You received this
     *         token from a prior call.)
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token for the next set of items to return. (You received this
     * token from a prior call.)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken The token for the next set of items to return. (You received this
     *         token from a prior call.)
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcClassicLinkDnsSupportRequest withNextToken(String nextToken) {
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
        if (getVpcIds() != null) sb.append("VpcIds: " + getVpcIds() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcIds() == null) ? 0 : getVpcIds().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVpcClassicLinkDnsSupportRequest == false) return false;
        DescribeVpcClassicLinkDnsSupportRequest other = (DescribeVpcClassicLinkDnsSupportRequest)obj;
        
        if (other.getVpcIds() == null ^ this.getVpcIds() == null) return false;
        if (other.getVpcIds() != null && other.getVpcIds().equals(this.getVpcIds()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeVpcClassicLinkDnsSupportRequest clone() {
        
            return (DescribeVpcClassicLinkDnsSupportRequest) super.clone();
    }

}
    