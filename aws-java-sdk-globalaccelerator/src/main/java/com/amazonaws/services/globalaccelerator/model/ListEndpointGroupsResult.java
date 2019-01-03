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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListEndpointGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEndpointGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of the endpoint groups associated with a listener.
     * </p>
     */
    private java.util.List<EndpointGroup> endpointGroups;
    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of the endpoint groups associated with a listener.
     * </p>
     * 
     * @return The list of the endpoint groups associated with a listener.
     */

    public java.util.List<EndpointGroup> getEndpointGroups() {
        return endpointGroups;
    }

    /**
     * <p>
     * The list of the endpoint groups associated with a listener.
     * </p>
     * 
     * @param endpointGroups
     *        The list of the endpoint groups associated with a listener.
     */

    public void setEndpointGroups(java.util.Collection<EndpointGroup> endpointGroups) {
        if (endpointGroups == null) {
            this.endpointGroups = null;
            return;
        }

        this.endpointGroups = new java.util.ArrayList<EndpointGroup>(endpointGroups);
    }

    /**
     * <p>
     * The list of the endpoint groups associated with a listener.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpointGroups(java.util.Collection)} or {@link #withEndpointGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param endpointGroups
     *        The list of the endpoint groups associated with a listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointGroupsResult withEndpointGroups(EndpointGroup... endpointGroups) {
        if (this.endpointGroups == null) {
            setEndpointGroups(new java.util.ArrayList<EndpointGroup>(endpointGroups.length));
        }
        for (EndpointGroup ele : endpointGroups) {
            this.endpointGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of the endpoint groups associated with a listener.
     * </p>
     * 
     * @param endpointGroups
     *        The list of the endpoint groups associated with a listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointGroupsResult withEndpointGroups(java.util.Collection<EndpointGroup> endpointGroups) {
        setEndpointGroups(endpointGroups);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @return The token for the next set of results. You receive this token from a previous call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointGroupsResult withNextToken(String nextToken) {
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
        if (getEndpointGroups() != null)
            sb.append("EndpointGroups: ").append(getEndpointGroups()).append(",");
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

        if (obj instanceof ListEndpointGroupsResult == false)
            return false;
        ListEndpointGroupsResult other = (ListEndpointGroupsResult) obj;
        if (other.getEndpointGroups() == null ^ this.getEndpointGroups() == null)
            return false;
        if (other.getEndpointGroups() != null && other.getEndpointGroups().equals(this.getEndpointGroups()) == false)
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

        hashCode = prime * hashCode + ((getEndpointGroups() == null) ? 0 : getEndpointGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEndpointGroupsResult clone() {
        try {
            return (ListEndpointGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
