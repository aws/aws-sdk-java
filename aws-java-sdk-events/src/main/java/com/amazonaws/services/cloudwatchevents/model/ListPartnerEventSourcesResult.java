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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ListPartnerEventSources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPartnerEventSourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of partner event sources returned by the operation.
     * </p>
     */
    private java.util.List<PartnerEventSource> partnerEventSources;
    /**
     * <p>
     * A token you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of partner event sources returned by the operation.
     * </p>
     * 
     * @return The list of partner event sources returned by the operation.
     */

    public java.util.List<PartnerEventSource> getPartnerEventSources() {
        return partnerEventSources;
    }

    /**
     * <p>
     * The list of partner event sources returned by the operation.
     * </p>
     * 
     * @param partnerEventSources
     *        The list of partner event sources returned by the operation.
     */

    public void setPartnerEventSources(java.util.Collection<PartnerEventSource> partnerEventSources) {
        if (partnerEventSources == null) {
            this.partnerEventSources = null;
            return;
        }

        this.partnerEventSources = new java.util.ArrayList<PartnerEventSource>(partnerEventSources);
    }

    /**
     * <p>
     * The list of partner event sources returned by the operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartnerEventSources(java.util.Collection)} or {@link #withPartnerEventSources(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param partnerEventSources
     *        The list of partner event sources returned by the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartnerEventSourcesResult withPartnerEventSources(PartnerEventSource... partnerEventSources) {
        if (this.partnerEventSources == null) {
            setPartnerEventSources(new java.util.ArrayList<PartnerEventSource>(partnerEventSources.length));
        }
        for (PartnerEventSource ele : partnerEventSources) {
            this.partnerEventSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of partner event sources returned by the operation.
     * </p>
     * 
     * @param partnerEventSources
     *        The list of partner event sources returned by the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartnerEventSourcesResult withPartnerEventSources(java.util.Collection<PartnerEventSource> partnerEventSources) {
        setPartnerEventSources(partnerEventSources);
        return this;
    }

    /**
     * <p>
     * A token you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use in a subsequent operation to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @return A token you can use in a subsequent operation to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use in a subsequent operation to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartnerEventSourcesResult withNextToken(String nextToken) {
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
        if (getPartnerEventSources() != null)
            sb.append("PartnerEventSources: ").append(getPartnerEventSources()).append(",");
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

        if (obj instanceof ListPartnerEventSourcesResult == false)
            return false;
        ListPartnerEventSourcesResult other = (ListPartnerEventSourcesResult) obj;
        if (other.getPartnerEventSources() == null ^ this.getPartnerEventSources() == null)
            return false;
        if (other.getPartnerEventSources() != null && other.getPartnerEventSources().equals(this.getPartnerEventSources()) == false)
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

        hashCode = prime * hashCode + ((getPartnerEventSources() == null) ? 0 : getPartnerEventSources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPartnerEventSourcesResult clone() {
        try {
            return (ListPartnerEventSourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
