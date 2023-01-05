/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for request parameters to the <code><a>DescribeVpcEndpoints</a></code> operation. Specifies the list of VPC
 * endpoints to be described.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcEndpointsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifiers of the endpoints to get information about.
     * </p>
     */
    private java.util.List<String> vpcEndpointIds;

    /**
     * <p>
     * The unique identifiers of the endpoints to get information about.
     * </p>
     * 
     * @return The unique identifiers of the endpoints to get information about.
     */

    public java.util.List<String> getVpcEndpointIds() {
        return vpcEndpointIds;
    }

    /**
     * <p>
     * The unique identifiers of the endpoints to get information about.
     * </p>
     * 
     * @param vpcEndpointIds
     *        The unique identifiers of the endpoints to get information about.
     */

    public void setVpcEndpointIds(java.util.Collection<String> vpcEndpointIds) {
        if (vpcEndpointIds == null) {
            this.vpcEndpointIds = null;
            return;
        }

        this.vpcEndpointIds = new java.util.ArrayList<String>(vpcEndpointIds);
    }

    /**
     * <p>
     * The unique identifiers of the endpoints to get information about.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcEndpointIds(java.util.Collection)} or {@link #withVpcEndpointIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param vpcEndpointIds
     *        The unique identifiers of the endpoints to get information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointsRequest withVpcEndpointIds(String... vpcEndpointIds) {
        if (this.vpcEndpointIds == null) {
            setVpcEndpointIds(new java.util.ArrayList<String>(vpcEndpointIds.length));
        }
        for (String ele : vpcEndpointIds) {
            this.vpcEndpointIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifiers of the endpoints to get information about.
     * </p>
     * 
     * @param vpcEndpointIds
     *        The unique identifiers of the endpoints to get information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointsRequest withVpcEndpointIds(java.util.Collection<String> vpcEndpointIds) {
        setVpcEndpointIds(vpcEndpointIds);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVpcEndpointIds() != null)
            sb.append("VpcEndpointIds: ").append(getVpcEndpointIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpcEndpointsRequest == false)
            return false;
        DescribeVpcEndpointsRequest other = (DescribeVpcEndpointsRequest) obj;
        if (other.getVpcEndpointIds() == null ^ this.getVpcEndpointIds() == null)
            return false;
        if (other.getVpcEndpointIds() != null && other.getVpcEndpointIds().equals(this.getVpcEndpointIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcEndpointIds() == null) ? 0 : getVpcEndpointIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpcEndpointsRequest clone() {
        return (DescribeVpcEndpointsRequest) super.clone();
    }

}
