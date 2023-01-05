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
package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListAppInstanceUserEndpoints"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppInstanceUserEndpointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The information for each requested <code>AppInstanceUserEndpoint</code>.
     * </p>
     */
    private java.util.List<AppInstanceUserEndpointSummary> appInstanceUserEndpoints;
    /**
     * <p>
     * The token passed by previous API calls until all requested endpoints are returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The information for each requested <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @return The information for each requested <code>AppInstanceUserEndpoint</code>.
     */

    public java.util.List<AppInstanceUserEndpointSummary> getAppInstanceUserEndpoints() {
        return appInstanceUserEndpoints;
    }

    /**
     * <p>
     * The information for each requested <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param appInstanceUserEndpoints
     *        The information for each requested <code>AppInstanceUserEndpoint</code>.
     */

    public void setAppInstanceUserEndpoints(java.util.Collection<AppInstanceUserEndpointSummary> appInstanceUserEndpoints) {
        if (appInstanceUserEndpoints == null) {
            this.appInstanceUserEndpoints = null;
            return;
        }

        this.appInstanceUserEndpoints = new java.util.ArrayList<AppInstanceUserEndpointSummary>(appInstanceUserEndpoints);
    }

    /**
     * <p>
     * The information for each requested <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppInstanceUserEndpoints(java.util.Collection)} or
     * {@link #withAppInstanceUserEndpoints(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param appInstanceUserEndpoints
     *        The information for each requested <code>AppInstanceUserEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstanceUserEndpointsResult withAppInstanceUserEndpoints(AppInstanceUserEndpointSummary... appInstanceUserEndpoints) {
        if (this.appInstanceUserEndpoints == null) {
            setAppInstanceUserEndpoints(new java.util.ArrayList<AppInstanceUserEndpointSummary>(appInstanceUserEndpoints.length));
        }
        for (AppInstanceUserEndpointSummary ele : appInstanceUserEndpoints) {
            this.appInstanceUserEndpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The information for each requested <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param appInstanceUserEndpoints
     *        The information for each requested <code>AppInstanceUserEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstanceUserEndpointsResult withAppInstanceUserEndpoints(java.util.Collection<AppInstanceUserEndpointSummary> appInstanceUserEndpoints) {
        setAppInstanceUserEndpoints(appInstanceUserEndpoints);
        return this;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested endpoints are returned.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API calls until all requested endpoints are returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested endpoints are returned.
     * </p>
     * 
     * @return The token passed by previous API calls until all requested endpoints are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested endpoints are returned.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API calls until all requested endpoints are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstanceUserEndpointsResult withNextToken(String nextToken) {
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
        if (getAppInstanceUserEndpoints() != null)
            sb.append("AppInstanceUserEndpoints: ").append(getAppInstanceUserEndpoints()).append(",");
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

        if (obj instanceof ListAppInstanceUserEndpointsResult == false)
            return false;
        ListAppInstanceUserEndpointsResult other = (ListAppInstanceUserEndpointsResult) obj;
        if (other.getAppInstanceUserEndpoints() == null ^ this.getAppInstanceUserEndpoints() == null)
            return false;
        if (other.getAppInstanceUserEndpoints() != null && other.getAppInstanceUserEndpoints().equals(this.getAppInstanceUserEndpoints()) == false)
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

        hashCode = prime * hashCode + ((getAppInstanceUserEndpoints() == null) ? 0 : getAppInstanceUserEndpoints().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAppInstanceUserEndpointsResult clone() {
        try {
            return (ListAppInstanceUserEndpointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
