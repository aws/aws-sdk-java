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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListEndpointAccess"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEndpointAccessRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to display the next page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If your initial <code>ListEndpointAccess</code> operation returns a <code>nextToken</code>, you can include the
     * returned <code>nextToken</code> in following <code>ListEndpointAccess</code> operations, which returns results in
     * the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The unique identifier of the virtual private cloud with access to Amazon Redshift Serverless.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The name of the workgroup associated with the VPC endpoint to return.
     * </p>
     */
    private String workgroupName;

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to display the next page of results.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to display the next page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to display the next page of results.
     * </p>
     * 
     * @return An optional parameter that specifies the maximum number of results to return. You can use
     *         <code>nextToken</code> to display the next page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to display the next page of results.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to display the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointAccessRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If your initial <code>ListEndpointAccess</code> operation returns a <code>nextToken</code>, you can include the
     * returned <code>nextToken</code> in following <code>ListEndpointAccess</code> operations, which returns results in
     * the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>ListEndpointAccess</code> operation returns a <code>nextToken</code>, you can
     *        include the returned <code>nextToken</code> in following <code>ListEndpointAccess</code> operations, which
     *        returns results in the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If your initial <code>ListEndpointAccess</code> operation returns a <code>nextToken</code>, you can include the
     * returned <code>nextToken</code> in following <code>ListEndpointAccess</code> operations, which returns results in
     * the next page.
     * </p>
     * 
     * @return If your initial <code>ListEndpointAccess</code> operation returns a <code>nextToken</code>, you can
     *         include the returned <code>nextToken</code> in following <code>ListEndpointAccess</code> operations,
     *         which returns results in the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If your initial <code>ListEndpointAccess</code> operation returns a <code>nextToken</code>, you can include the
     * returned <code>nextToken</code> in following <code>ListEndpointAccess</code> operations, which returns results in
     * the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>ListEndpointAccess</code> operation returns a <code>nextToken</code>, you can
     *        include the returned <code>nextToken</code> in following <code>ListEndpointAccess</code> operations, which
     *        returns results in the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointAccessRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the virtual private cloud with access to Amazon Redshift Serverless.
     * </p>
     * 
     * @param vpcId
     *        The unique identifier of the virtual private cloud with access to Amazon Redshift Serverless.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The unique identifier of the virtual private cloud with access to Amazon Redshift Serverless.
     * </p>
     * 
     * @return The unique identifier of the virtual private cloud with access to Amazon Redshift Serverless.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The unique identifier of the virtual private cloud with access to Amazon Redshift Serverless.
     * </p>
     * 
     * @param vpcId
     *        The unique identifier of the virtual private cloud with access to Amazon Redshift Serverless.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointAccessRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The name of the workgroup associated with the VPC endpoint to return.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup associated with the VPC endpoint to return.
     */

    public void setWorkgroupName(String workgroupName) {
        this.workgroupName = workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup associated with the VPC endpoint to return.
     * </p>
     * 
     * @return The name of the workgroup associated with the VPC endpoint to return.
     */

    public String getWorkgroupName() {
        return this.workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup associated with the VPC endpoint to return.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup associated with the VPC endpoint to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointAccessRequest withWorkgroupName(String workgroupName) {
        setWorkgroupName(workgroupName);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getWorkgroupName() != null)
            sb.append("WorkgroupName: ").append(getWorkgroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEndpointAccessRequest == false)
            return false;
        ListEndpointAccessRequest other = (ListEndpointAccessRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getWorkgroupName() == null ^ this.getWorkgroupName() == null)
            return false;
        if (other.getWorkgroupName() != null && other.getWorkgroupName().equals(this.getWorkgroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getWorkgroupName() == null) ? 0 : getWorkgroupName().hashCode());
        return hashCode;
    }

    @Override
    public ListEndpointAccessRequest clone() {
        return (ListEndpointAccessRequest) super.clone();
    }

}
