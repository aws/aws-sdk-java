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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTransitGatewayPolicyTablesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Describes the transit gateway policy tables.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TransitGatewayPolicyTable> transitGatewayPolicyTables;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Describes the transit gateway policy tables.
     * </p>
     * 
     * @return Describes the transit gateway policy tables.
     */

    public java.util.List<TransitGatewayPolicyTable> getTransitGatewayPolicyTables() {
        if (transitGatewayPolicyTables == null) {
            transitGatewayPolicyTables = new com.amazonaws.internal.SdkInternalList<TransitGatewayPolicyTable>();
        }
        return transitGatewayPolicyTables;
    }

    /**
     * <p>
     * Describes the transit gateway policy tables.
     * </p>
     * 
     * @param transitGatewayPolicyTables
     *        Describes the transit gateway policy tables.
     */

    public void setTransitGatewayPolicyTables(java.util.Collection<TransitGatewayPolicyTable> transitGatewayPolicyTables) {
        if (transitGatewayPolicyTables == null) {
            this.transitGatewayPolicyTables = null;
            return;
        }

        this.transitGatewayPolicyTables = new com.amazonaws.internal.SdkInternalList<TransitGatewayPolicyTable>(transitGatewayPolicyTables);
    }

    /**
     * <p>
     * Describes the transit gateway policy tables.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransitGatewayPolicyTables(java.util.Collection)} or
     * {@link #withTransitGatewayPolicyTables(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param transitGatewayPolicyTables
     *        Describes the transit gateway policy tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewayPolicyTablesResult withTransitGatewayPolicyTables(TransitGatewayPolicyTable... transitGatewayPolicyTables) {
        if (this.transitGatewayPolicyTables == null) {
            setTransitGatewayPolicyTables(new com.amazonaws.internal.SdkInternalList<TransitGatewayPolicyTable>(transitGatewayPolicyTables.length));
        }
        for (TransitGatewayPolicyTable ele : transitGatewayPolicyTables) {
            this.transitGatewayPolicyTables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the transit gateway policy tables.
     * </p>
     * 
     * @param transitGatewayPolicyTables
     *        Describes the transit gateway policy tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewayPolicyTablesResult withTransitGatewayPolicyTables(java.util.Collection<TransitGatewayPolicyTable> transitGatewayPolicyTables) {
        setTransitGatewayPolicyTables(transitGatewayPolicyTables);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewayPolicyTablesResult withNextToken(String nextToken) {
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
        if (getTransitGatewayPolicyTables() != null)
            sb.append("TransitGatewayPolicyTables: ").append(getTransitGatewayPolicyTables()).append(",");
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

        if (obj instanceof DescribeTransitGatewayPolicyTablesResult == false)
            return false;
        DescribeTransitGatewayPolicyTablesResult other = (DescribeTransitGatewayPolicyTablesResult) obj;
        if (other.getTransitGatewayPolicyTables() == null ^ this.getTransitGatewayPolicyTables() == null)
            return false;
        if (other.getTransitGatewayPolicyTables() != null && other.getTransitGatewayPolicyTables().equals(this.getTransitGatewayPolicyTables()) == false)
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

        hashCode = prime * hashCode + ((getTransitGatewayPolicyTables() == null) ? 0 : getTransitGatewayPolicyTables().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTransitGatewayPolicyTablesResult clone() {
        try {
            return (DescribeTransitGatewayPolicyTablesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
