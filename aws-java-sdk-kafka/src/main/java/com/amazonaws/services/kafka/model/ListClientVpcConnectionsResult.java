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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListClientVpcConnections" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListClientVpcConnectionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of client VPC connections.
     * </p>
     */
    private java.util.List<ClientVpcConnection> clientVpcConnections;
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
     * List of client VPC connections.
     * </p>
     * 
     * @return <p>
     *         List of client VPC connections.
     *         </p>
     */

    public java.util.List<ClientVpcConnection> getClientVpcConnections() {
        return clientVpcConnections;
    }

    /**
     * <p>
     * List of client VPC connections.
     * </p>
     * 
     * @param clientVpcConnections
     *        <p>
     *        List of client VPC connections.
     *        </p>
     */

    public void setClientVpcConnections(java.util.Collection<ClientVpcConnection> clientVpcConnections) {
        if (clientVpcConnections == null) {
            this.clientVpcConnections = null;
            return;
        }

        this.clientVpcConnections = new java.util.ArrayList<ClientVpcConnection>(clientVpcConnections);
    }

    /**
     * <p>
     * List of client VPC connections.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClientVpcConnections(java.util.Collection)} or {@link #withClientVpcConnections(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param clientVpcConnections
     *        <p>
     *        List of client VPC connections.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClientVpcConnectionsResult withClientVpcConnections(ClientVpcConnection... clientVpcConnections) {
        if (this.clientVpcConnections == null) {
            setClientVpcConnections(new java.util.ArrayList<ClientVpcConnection>(clientVpcConnections.length));
        }
        for (ClientVpcConnection ele : clientVpcConnections) {
            this.clientVpcConnections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of client VPC connections.
     * </p>
     * 
     * @param clientVpcConnections
     *        <p>
     *        List of client VPC connections.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClientVpcConnectionsResult withClientVpcConnections(java.util.Collection<ClientVpcConnection> clientVpcConnections) {
        setClientVpcConnections(clientVpcConnections);
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

    public ListClientVpcConnectionsResult withNextToken(String nextToken) {
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
        if (getClientVpcConnections() != null)
            sb.append("ClientVpcConnections: ").append(getClientVpcConnections()).append(",");
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

        if (obj instanceof ListClientVpcConnectionsResult == false)
            return false;
        ListClientVpcConnectionsResult other = (ListClientVpcConnectionsResult) obj;
        if (other.getClientVpcConnections() == null ^ this.getClientVpcConnections() == null)
            return false;
        if (other.getClientVpcConnections() != null && other.getClientVpcConnections().equals(this.getClientVpcConnections()) == false)
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

        hashCode = prime * hashCode + ((getClientVpcConnections() == null) ? 0 : getClientVpcConnections().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListClientVpcConnectionsResult clone() {
        try {
            return (ListClientVpcConnectionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
