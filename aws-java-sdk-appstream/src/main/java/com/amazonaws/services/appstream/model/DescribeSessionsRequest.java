/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeSessions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSessionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stack. This value is case-sensitive.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The name of the fleet. This value is case-sensitive.
     * </p>
     */
    private String fleetName;
    /**
     * <p>
     * The user identifier.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The size of each page of results. The default value is 20 and the maximum value is 50.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The authentication method. Specify <code>API</code> for a user authenticated using a streaming URL,
     * <code>SAML</code> for a SAML 2.0-federated user, or <code>USERPOOL</code> for a user in the AppStream 2.0 user
     * pool. The default is to authenticate users using a streaming URL.
     * </p>
     */
    private String authenticationType;

    /**
     * <p>
     * The name of the stack. This value is case-sensitive.
     * </p>
     * 
     * @param stackName
     *        The name of the stack. This value is case-sensitive.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name of the stack. This value is case-sensitive.
     * </p>
     * 
     * @return The name of the stack. This value is case-sensitive.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name of the stack. This value is case-sensitive.
     * </p>
     * 
     * @param stackName
     *        The name of the stack. This value is case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSessionsRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The name of the fleet. This value is case-sensitive.
     * </p>
     * 
     * @param fleetName
     *        The name of the fleet. This value is case-sensitive.
     */

    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }

    /**
     * <p>
     * The name of the fleet. This value is case-sensitive.
     * </p>
     * 
     * @return The name of the fleet. This value is case-sensitive.
     */

    public String getFleetName() {
        return this.fleetName;
    }

    /**
     * <p>
     * The name of the fleet. This value is case-sensitive.
     * </p>
     * 
     * @param fleetName
     *        The name of the fleet. This value is case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSessionsRequest withFleetName(String fleetName) {
        setFleetName(fleetName);
        return this;
    }

    /**
     * <p>
     * The user identifier.
     * </p>
     * 
     * @param userId
     *        The user identifier.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The user identifier.
     * </p>
     * 
     * @return The user identifier.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The user identifier.
     * </p>
     * 
     * @param userId
     *        The user identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSessionsRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If this value is
     *        null, it retrieves the first page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If this value is
     *         null, it retrieves the first page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If this value is
     *        null, it retrieves the first page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSessionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The size of each page of results. The default value is 20 and the maximum value is 50.
     * </p>
     * 
     * @param limit
     *        The size of each page of results. The default value is 20 and the maximum value is 50.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The size of each page of results. The default value is 20 and the maximum value is 50.
     * </p>
     * 
     * @return The size of each page of results. The default value is 20 and the maximum value is 50.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The size of each page of results. The default value is 20 and the maximum value is 50.
     * </p>
     * 
     * @param limit
     *        The size of each page of results. The default value is 20 and the maximum value is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSessionsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The authentication method. Specify <code>API</code> for a user authenticated using a streaming URL,
     * <code>SAML</code> for a SAML 2.0-federated user, or <code>USERPOOL</code> for a user in the AppStream 2.0 user
     * pool. The default is to authenticate users using a streaming URL.
     * </p>
     * 
     * @param authenticationType
     *        The authentication method. Specify <code>API</code> for a user authenticated using a streaming URL,
     *        <code>SAML</code> for a SAML 2.0-federated user, or <code>USERPOOL</code> for a user in the AppStream 2.0
     *        user pool. The default is to authenticate users using a streaming URL.
     * @see AuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * The authentication method. Specify <code>API</code> for a user authenticated using a streaming URL,
     * <code>SAML</code> for a SAML 2.0-federated user, or <code>USERPOOL</code> for a user in the AppStream 2.0 user
     * pool. The default is to authenticate users using a streaming URL.
     * </p>
     * 
     * @return The authentication method. Specify <code>API</code> for a user authenticated using a streaming URL,
     *         <code>SAML</code> for a SAML 2.0-federated user, or <code>USERPOOL</code> for a user in the AppStream 2.0
     *         user pool. The default is to authenticate users using a streaming URL.
     * @see AuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * The authentication method. Specify <code>API</code> for a user authenticated using a streaming URL,
     * <code>SAML</code> for a SAML 2.0-federated user, or <code>USERPOOL</code> for a user in the AppStream 2.0 user
     * pool. The default is to authenticate users using a streaming URL.
     * </p>
     * 
     * @param authenticationType
     *        The authentication method. Specify <code>API</code> for a user authenticated using a streaming URL,
     *        <code>SAML</code> for a SAML 2.0-federated user, or <code>USERPOOL</code> for a user in the AppStream 2.0
     *        user pool. The default is to authenticate users using a streaming URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public DescribeSessionsRequest withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The authentication method. Specify <code>API</code> for a user authenticated using a streaming URL,
     * <code>SAML</code> for a SAML 2.0-federated user, or <code>USERPOOL</code> for a user in the AppStream 2.0 user
     * pool. The default is to authenticate users using a streaming URL.
     * </p>
     * 
     * @param authenticationType
     *        The authentication method. Specify <code>API</code> for a user authenticated using a streaming URL,
     *        <code>SAML</code> for a SAML 2.0-federated user, or <code>USERPOOL</code> for a user in the AppStream 2.0
     *        user pool. The default is to authenticate users using a streaming URL.
     * @see AuthenticationType
     */

    public void setAuthenticationType(AuthenticationType authenticationType) {
        withAuthenticationType(authenticationType);
    }

    /**
     * <p>
     * The authentication method. Specify <code>API</code> for a user authenticated using a streaming URL,
     * <code>SAML</code> for a SAML 2.0-federated user, or <code>USERPOOL</code> for a user in the AppStream 2.0 user
     * pool. The default is to authenticate users using a streaming URL.
     * </p>
     * 
     * @param authenticationType
     *        The authentication method. Specify <code>API</code> for a user authenticated using a streaming URL,
     *        <code>SAML</code> for a SAML 2.0-federated user, or <code>USERPOOL</code> for a user in the AppStream 2.0
     *        user pool. The default is to authenticate users using a streaming URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public DescribeSessionsRequest withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
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
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getFleetName() != null)
            sb.append("FleetName: ").append(getFleetName()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSessionsRequest == false)
            return false;
        DescribeSessionsRequest other = (DescribeSessionsRequest) obj;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getFleetName() == null ^ this.getFleetName() == null)
            return false;
        if (other.getFleetName() != null && other.getFleetName().equals(this.getFleetName()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getFleetName() == null) ? 0 : getFleetName().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSessionsRequest clone() {
        return (DescribeSessionsRequest) super.clone();
    }

}
