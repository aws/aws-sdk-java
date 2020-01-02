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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListEndpoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEndpointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Displays a list of endpoint properties being retrieved by the service in response to the request.
     * </p>
     */
    private java.util.List<EndpointProperties> endpointPropertiesList;
    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Displays a list of endpoint properties being retrieved by the service in response to the request.
     * </p>
     * 
     * @return Displays a list of endpoint properties being retrieved by the service in response to the request.
     */

    public java.util.List<EndpointProperties> getEndpointPropertiesList() {
        return endpointPropertiesList;
    }

    /**
     * <p>
     * Displays a list of endpoint properties being retrieved by the service in response to the request.
     * </p>
     * 
     * @param endpointPropertiesList
     *        Displays a list of endpoint properties being retrieved by the service in response to the request.
     */

    public void setEndpointPropertiesList(java.util.Collection<EndpointProperties> endpointPropertiesList) {
        if (endpointPropertiesList == null) {
            this.endpointPropertiesList = null;
            return;
        }

        this.endpointPropertiesList = new java.util.ArrayList<EndpointProperties>(endpointPropertiesList);
    }

    /**
     * <p>
     * Displays a list of endpoint properties being retrieved by the service in response to the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpointPropertiesList(java.util.Collection)} or
     * {@link #withEndpointPropertiesList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param endpointPropertiesList
     *        Displays a list of endpoint properties being retrieved by the service in response to the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointsResult withEndpointPropertiesList(EndpointProperties... endpointPropertiesList) {
        if (this.endpointPropertiesList == null) {
            setEndpointPropertiesList(new java.util.ArrayList<EndpointProperties>(endpointPropertiesList.length));
        }
        for (EndpointProperties ele : endpointPropertiesList) {
            this.endpointPropertiesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Displays a list of endpoint properties being retrieved by the service in response to the request.
     * </p>
     * 
     * @param endpointPropertiesList
     *        Displays a list of endpoint properties being retrieved by the service in response to the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointsResult withEndpointPropertiesList(java.util.Collection<EndpointProperties> endpointPropertiesList) {
        setEndpointPropertiesList(endpointPropertiesList);
        return this;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @return Identifies the next page of results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointsResult withNextToken(String nextToken) {
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
        if (getEndpointPropertiesList() != null)
            sb.append("EndpointPropertiesList: ").append(getEndpointPropertiesList()).append(",");
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

        if (obj instanceof ListEndpointsResult == false)
            return false;
        ListEndpointsResult other = (ListEndpointsResult) obj;
        if (other.getEndpointPropertiesList() == null ^ this.getEndpointPropertiesList() == null)
            return false;
        if (other.getEndpointPropertiesList() != null && other.getEndpointPropertiesList().equals(this.getEndpointPropertiesList()) == false)
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

        hashCode = prime * hashCode + ((getEndpointPropertiesList() == null) ? 0 : getEndpointPropertiesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEndpointsResult clone() {
        try {
            return (ListEndpointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
