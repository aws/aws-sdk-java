/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListVpcConnections" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVpcConnectionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of VPC connections.
     * </p>
     */
    private java.util.List<VpcConnection> vpcConnections;
    /**
     * <p>
     * The paginated results marker. When the result of a ListClientVpcConnections operation is truncated, the call
     * returns NextToken in the response. To get another batch of configurations, provide this token in your next
     * request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of VPC connections.
     * </p>
     * 
     * @return <p>
     *         List of VPC connections.
     *         </p>
     */

    public java.util.List<VpcConnection> getVpcConnections() {
        return vpcConnections;
    }

    /**
     * <p>
     * List of VPC connections.
     * </p>
     * 
     * @param vpcConnections
     *        <p>
     *        List of VPC connections.
     *        </p>
     */

    public void setVpcConnections(java.util.Collection<VpcConnection> vpcConnections) {
        if (vpcConnections == null) {
            this.vpcConnections = null;
            return;
        }

        this.vpcConnections = new java.util.ArrayList<VpcConnection>(vpcConnections);
    }

    /**
     * <p>
     * List of VPC connections.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcConnections(java.util.Collection)} or {@link #withVpcConnections(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param vpcConnections
     *        <p>
     *        List of VPC connections.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVpcConnectionsResult withVpcConnections(VpcConnection... vpcConnections) {
        if (this.vpcConnections == null) {
            setVpcConnections(new java.util.ArrayList<VpcConnection>(vpcConnections.length));
        }
        for (VpcConnection ele : vpcConnections) {
            this.vpcConnections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of VPC connections.
     * </p>
     * 
     * @param vpcConnections
     *        <p>
     *        List of VPC connections.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVpcConnectionsResult withVpcConnections(java.util.Collection<VpcConnection> vpcConnections) {
        setVpcConnections(vpcConnections);
        return this;
    }

    /**
     * <p>
     * The paginated results marker. When the result of a ListClientVpcConnections operation is truncated, the call
     * returns NextToken in the response. To get another batch of configurations, provide this token in your next
     * request.
     * </p>
     * 
     * @param nextToken
     *        <p>
     *        The paginated results marker. When the result of a ListClientVpcConnections operation is truncated, the
     *        call returns NextToken in the response. To get another batch of configurations, provide this token in your
     *        next request.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The paginated results marker. When the result of a ListClientVpcConnections operation is truncated, the call
     * returns NextToken in the response. To get another batch of configurations, provide this token in your next
     * request.
     * </p>
     * 
     * @return <p>
     *         The paginated results marker. When the result of a ListClientVpcConnections operation is truncated, the
     *         call returns NextToken in the response. To get another batch of configurations, provide this token in
     *         your next request.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The paginated results marker. When the result of a ListClientVpcConnections operation is truncated, the call
     * returns NextToken in the response. To get another batch of configurations, provide this token in your next
     * request.
     * </p>
     * 
     * @param nextToken
     *        <p>
     *        The paginated results marker. When the result of a ListClientVpcConnections operation is truncated, the
     *        call returns NextToken in the response. To get another batch of configurations, provide this token in your
     *        next request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVpcConnectionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getVpcConnections() != null)
            sb.append("VpcConnections: ").append(getVpcConnections()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVpcConnectionsResult == false)
            return false;
        ListVpcConnectionsResult other = (ListVpcConnectionsResult) obj;
        if (other.getVpcConnections() == null ^ this.getVpcConnections() == null)
            return false;
        if (other.getVpcConnections() != null && other.getVpcConnections().equals(this.getVpcConnections()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcConnections() == null) ? 0 : getVpcConnections().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListVpcConnectionsResult clone() {
        try {
            return (ListVpcConnectionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
