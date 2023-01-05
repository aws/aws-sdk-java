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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCoreNetworkChangeEvents"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCoreNetworkChangeEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The response to <code>GetCoreNetworkChangeEventsRequest</code>.
     * </p>
     */
    private java.util.List<CoreNetworkChangeEvent> coreNetworkChangeEvents;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The response to <code>GetCoreNetworkChangeEventsRequest</code>.
     * </p>
     * 
     * @return The response to <code>GetCoreNetworkChangeEventsRequest</code>.
     */

    public java.util.List<CoreNetworkChangeEvent> getCoreNetworkChangeEvents() {
        return coreNetworkChangeEvents;
    }

    /**
     * <p>
     * The response to <code>GetCoreNetworkChangeEventsRequest</code>.
     * </p>
     * 
     * @param coreNetworkChangeEvents
     *        The response to <code>GetCoreNetworkChangeEventsRequest</code>.
     */

    public void setCoreNetworkChangeEvents(java.util.Collection<CoreNetworkChangeEvent> coreNetworkChangeEvents) {
        if (coreNetworkChangeEvents == null) {
            this.coreNetworkChangeEvents = null;
            return;
        }

        this.coreNetworkChangeEvents = new java.util.ArrayList<CoreNetworkChangeEvent>(coreNetworkChangeEvents);
    }

    /**
     * <p>
     * The response to <code>GetCoreNetworkChangeEventsRequest</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCoreNetworkChangeEvents(java.util.Collection)} or
     * {@link #withCoreNetworkChangeEvents(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param coreNetworkChangeEvents
     *        The response to <code>GetCoreNetworkChangeEventsRequest</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoreNetworkChangeEventsResult withCoreNetworkChangeEvents(CoreNetworkChangeEvent... coreNetworkChangeEvents) {
        if (this.coreNetworkChangeEvents == null) {
            setCoreNetworkChangeEvents(new java.util.ArrayList<CoreNetworkChangeEvent>(coreNetworkChangeEvents.length));
        }
        for (CoreNetworkChangeEvent ele : coreNetworkChangeEvents) {
            this.coreNetworkChangeEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The response to <code>GetCoreNetworkChangeEventsRequest</code>.
     * </p>
     * 
     * @param coreNetworkChangeEvents
     *        The response to <code>GetCoreNetworkChangeEventsRequest</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoreNetworkChangeEventsResult withCoreNetworkChangeEvents(java.util.Collection<CoreNetworkChangeEvent> coreNetworkChangeEvents) {
        setCoreNetworkChangeEvents(coreNetworkChangeEvents);
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

    public GetCoreNetworkChangeEventsResult withNextToken(String nextToken) {
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
        if (getCoreNetworkChangeEvents() != null)
            sb.append("CoreNetworkChangeEvents: ").append(getCoreNetworkChangeEvents()).append(",");
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

        if (obj instanceof GetCoreNetworkChangeEventsResult == false)
            return false;
        GetCoreNetworkChangeEventsResult other = (GetCoreNetworkChangeEventsResult) obj;
        if (other.getCoreNetworkChangeEvents() == null ^ this.getCoreNetworkChangeEvents() == null)
            return false;
        if (other.getCoreNetworkChangeEvents() != null && other.getCoreNetworkChangeEvents().equals(this.getCoreNetworkChangeEvents()) == false)
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

        hashCode = prime * hashCode + ((getCoreNetworkChangeEvents() == null) ? 0 : getCoreNetworkChangeEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetCoreNetworkChangeEventsResult clone() {
        try {
            return (GetCoreNetworkChangeEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
