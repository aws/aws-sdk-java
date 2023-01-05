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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMobileDeviceAccessOverrides"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMobileDeviceAccessOverridesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The WorkMail organization under which to list mobile device access overrides.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The WorkMail user under which you list the mobile device access overrides. Accepts the following types of user
     * identities:
     * </p>
     * <ul>
     * <li>
     * <p>
     * User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     * <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: <code>user@domain.tld</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * User name: <code>user</code>
     * </p>
     * </li>
     * </ul>
     */
    private String userId;
    /**
     * <p>
     * The mobile device to which the access override applies.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * The token to use to retrieve the next page of results. The first call does not require a token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The WorkMail organization under which to list mobile device access overrides.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization under which to list mobile device access overrides.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The WorkMail organization under which to list mobile device access overrides.
     * </p>
     * 
     * @return The WorkMail organization under which to list mobile device access overrides.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The WorkMail organization under which to list mobile device access overrides.
     * </p>
     * 
     * @param organizationId
     *        The WorkMail organization under which to list mobile device access overrides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMobileDeviceAccessOverridesRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The WorkMail user under which you list the mobile device access overrides. Accepts the following types of user
     * identities:
     * </p>
     * <ul>
     * <li>
     * <p>
     * User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     * <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: <code>user@domain.tld</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * User name: <code>user</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param userId
     *        The WorkMail user under which you list the mobile device access overrides. Accepts the following types of
     *        user identities:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     *        <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Email address: <code>user@domain.tld</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        User name: <code>user</code>
     *        </p>
     *        </li>
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The WorkMail user under which you list the mobile device access overrides. Accepts the following types of user
     * identities:
     * </p>
     * <ul>
     * <li>
     * <p>
     * User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     * <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: <code>user@domain.tld</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * User name: <code>user</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The WorkMail user under which you list the mobile device access overrides. Accepts the following types of
     *         user identities:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     *         <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Email address: <code>user@domain.tld</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         User name: <code>user</code>
     *         </p>
     *         </li>
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The WorkMail user under which you list the mobile device access overrides. Accepts the following types of user
     * identities:
     * </p>
     * <ul>
     * <li>
     * <p>
     * User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     * <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: <code>user@domain.tld</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * User name: <code>user</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param userId
     *        The WorkMail user under which you list the mobile device access overrides. Accepts the following types of
     *        user identities:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        User ID: <code>12345678-1234-1234-1234-123456789012</code> or
     *        <code>S-1-1-12-1234567890-123456789-123456789-1234</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Email address: <code>user@domain.tld</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        User name: <code>user</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMobileDeviceAccessOverridesRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The mobile device to which the access override applies.
     * </p>
     * 
     * @param deviceId
     *        The mobile device to which the access override applies.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The mobile device to which the access override applies.
     * </p>
     * 
     * @return The mobile device to which the access override applies.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The mobile device to which the access override applies.
     * </p>
     * 
     * @param deviceId
     *        The mobile device to which the access override applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMobileDeviceAccessOverridesRequest withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The first call does not require a token.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The first call does not require a token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The first call does not require a token.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. The first call does not require a token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The first call does not require a token.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The first call does not require a token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMobileDeviceAccessOverridesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * 
     * @return The maximum number of results to return in a single call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMobileDeviceAccessOverridesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMobileDeviceAccessOverridesRequest == false)
            return false;
        ListMobileDeviceAccessOverridesRequest other = (ListMobileDeviceAccessOverridesRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListMobileDeviceAccessOverridesRequest clone() {
        return (ListMobileDeviceAccessOverridesRequest) super.clone();
    }

}
