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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Response for ListEndpointsByPlatformApplication action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/ListEndpointsByPlatformApplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEndpointsByPlatformApplicationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Endpoints returned for ListEndpointsByPlatformApplication action.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Endpoint> endpoints;
    /**
     * <p>
     * NextToken string is returned when calling ListEndpointsByPlatformApplication action if additional records are
     * available after the first page results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Endpoints returned for ListEndpointsByPlatformApplication action.
     * </p>
     * 
     * @return Endpoints returned for ListEndpointsByPlatformApplication action.
     */

    public java.util.List<Endpoint> getEndpoints() {
        if (endpoints == null) {
            endpoints = new com.amazonaws.internal.SdkInternalList<Endpoint>();
        }
        return endpoints;
    }

    /**
     * <p>
     * Endpoints returned for ListEndpointsByPlatformApplication action.
     * </p>
     * 
     * @param endpoints
     *        Endpoints returned for ListEndpointsByPlatformApplication action.
     */

    public void setEndpoints(java.util.Collection<Endpoint> endpoints) {
        if (endpoints == null) {
            this.endpoints = null;
            return;
        }

        this.endpoints = new com.amazonaws.internal.SdkInternalList<Endpoint>(endpoints);
    }

    /**
     * <p>
     * Endpoints returned for ListEndpointsByPlatformApplication action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpoints(java.util.Collection)} or {@link #withEndpoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param endpoints
     *        Endpoints returned for ListEndpointsByPlatformApplication action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointsByPlatformApplicationResult withEndpoints(Endpoint... endpoints) {
        if (this.endpoints == null) {
            setEndpoints(new com.amazonaws.internal.SdkInternalList<Endpoint>(endpoints.length));
        }
        for (Endpoint ele : endpoints) {
            this.endpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Endpoints returned for ListEndpointsByPlatformApplication action.
     * </p>
     * 
     * @param endpoints
     *        Endpoints returned for ListEndpointsByPlatformApplication action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointsByPlatformApplicationResult withEndpoints(java.util.Collection<Endpoint> endpoints) {
        setEndpoints(endpoints);
        return this;
    }

    /**
     * <p>
     * NextToken string is returned when calling ListEndpointsByPlatformApplication action if additional records are
     * available after the first page results.
     * </p>
     * 
     * @param nextToken
     *        NextToken string is returned when calling ListEndpointsByPlatformApplication action if additional records
     *        are available after the first page results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * NextToken string is returned when calling ListEndpointsByPlatformApplication action if additional records are
     * available after the first page results.
     * </p>
     * 
     * @return NextToken string is returned when calling ListEndpointsByPlatformApplication action if additional records
     *         are available after the first page results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * NextToken string is returned when calling ListEndpointsByPlatformApplication action if additional records are
     * available after the first page results.
     * </p>
     * 
     * @param nextToken
     *        NextToken string is returned when calling ListEndpointsByPlatformApplication action if additional records
     *        are available after the first page results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointsByPlatformApplicationResult withNextToken(String nextToken) {
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
        if (getEndpoints() != null)
            sb.append("Endpoints: ").append(getEndpoints()).append(",");
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

        if (obj instanceof ListEndpointsByPlatformApplicationResult == false)
            return false;
        ListEndpointsByPlatformApplicationResult other = (ListEndpointsByPlatformApplicationResult) obj;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false)
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

        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEndpointsByPlatformApplicationResult clone() {
        try {
            return (ListEndpointsByPlatformApplicationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
