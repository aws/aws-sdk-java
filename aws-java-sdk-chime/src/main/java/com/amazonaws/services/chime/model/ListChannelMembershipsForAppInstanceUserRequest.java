/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannelMembershipsForAppInstanceUser"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListChannelMembershipsForAppInstanceUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the app instance users
     * </p>
     */
    private String appInstanceUserArn;
    /**
     * <p>
     * The maximum number of users that you want returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token returned from previous API requests until the number of channel memberships is reached.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ARN of the app instance users
     * </p>
     * 
     * @param appInstanceUserArn
     *        The ARN of the app instance users
     */

    public void setAppInstanceUserArn(String appInstanceUserArn) {
        this.appInstanceUserArn = appInstanceUserArn;
    }

    /**
     * <p>
     * The ARN of the app instance users
     * </p>
     * 
     * @return The ARN of the app instance users
     */

    public String getAppInstanceUserArn() {
        return this.appInstanceUserArn;
    }

    /**
     * <p>
     * The ARN of the app instance users
     * </p>
     * 
     * @param appInstanceUserArn
     *        The ARN of the app instance users
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelMembershipsForAppInstanceUserRequest withAppInstanceUserArn(String appInstanceUserArn) {
        setAppInstanceUserArn(appInstanceUserArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of users that you want returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of users that you want returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of users that you want returned.
     * </p>
     * 
     * @return The maximum number of users that you want returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of users that you want returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of users that you want returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelMembershipsForAppInstanceUserRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token returned from previous API requests until the number of channel memberships is reached.
     * </p>
     * 
     * @param nextToken
     *        The token returned from previous API requests until the number of channel memberships is reached.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned from previous API requests until the number of channel memberships is reached.
     * </p>
     * 
     * @return The token returned from previous API requests until the number of channel memberships is reached.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned from previous API requests until the number of channel memberships is reached.
     * </p>
     * 
     * @param nextToken
     *        The token returned from previous API requests until the number of channel memberships is reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelMembershipsForAppInstanceUserRequest withNextToken(String nextToken) {
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
        if (getAppInstanceUserArn() != null)
            sb.append("AppInstanceUserArn: ").append(getAppInstanceUserArn()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListChannelMembershipsForAppInstanceUserRequest == false)
            return false;
        ListChannelMembershipsForAppInstanceUserRequest other = (ListChannelMembershipsForAppInstanceUserRequest) obj;
        if (other.getAppInstanceUserArn() == null ^ this.getAppInstanceUserArn() == null)
            return false;
        if (other.getAppInstanceUserArn() != null && other.getAppInstanceUserArn().equals(this.getAppInstanceUserArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getAppInstanceUserArn() == null) ? 0 : getAppInstanceUserArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListChannelMembershipsForAppInstanceUserRequest clone() {
        return (ListChannelMembershipsForAppInstanceUserRequest) super.clone();
    }

}
