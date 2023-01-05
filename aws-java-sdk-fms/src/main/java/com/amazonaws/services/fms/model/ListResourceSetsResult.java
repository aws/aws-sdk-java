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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListResourceSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>ResourceSetSummary</code> objects.
     * </p>
     */
    private java.util.List<ResourceSetSummary> resourceSets;
    /**
     * <p>
     * When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that are
     * still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     * <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token returned from
     * the prior request in your next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>ResourceSetSummary</code> objects.
     * </p>
     * 
     * @return An array of <code>ResourceSetSummary</code> objects.
     */

    public java.util.List<ResourceSetSummary> getResourceSets() {
        return resourceSets;
    }

    /**
     * <p>
     * An array of <code>ResourceSetSummary</code> objects.
     * </p>
     * 
     * @param resourceSets
     *        An array of <code>ResourceSetSummary</code> objects.
     */

    public void setResourceSets(java.util.Collection<ResourceSetSummary> resourceSets) {
        if (resourceSets == null) {
            this.resourceSets = null;
            return;
        }

        this.resourceSets = new java.util.ArrayList<ResourceSetSummary>(resourceSets);
    }

    /**
     * <p>
     * An array of <code>ResourceSetSummary</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceSets(java.util.Collection)} or {@link #withResourceSets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceSets
     *        An array of <code>ResourceSetSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceSetsResult withResourceSets(ResourceSetSummary... resourceSets) {
        if (this.resourceSets == null) {
            setResourceSets(new java.util.ArrayList<ResourceSetSummary>(resourceSets.length));
        }
        for (ResourceSetSummary ele : resourceSets) {
            this.resourceSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ResourceSetSummary</code> objects.
     * </p>
     * 
     * @param resourceSets
     *        An array of <code>ResourceSetSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceSetsResult withResourceSets(java.util.Collection<ResourceSetSummary> resourceSets) {
        setResourceSets(resourceSets);
        return this;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that are
     * still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     * <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token returned from
     * the prior request in your next request.
     * </p>
     * 
     * @param nextToken
     *        When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that
     *        are still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     *        <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token
     *        returned from the prior request in your next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that are
     * still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     * <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token returned from
     * the prior request in your next request.
     * </p>
     * 
     * @return When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that
     *         are still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     *         <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token
     *         returned from the prior request in your next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that are
     * still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     * <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token returned from
     * the prior request in your next request.
     * </p>
     * 
     * @param nextToken
     *        When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that
     *        are still available for retrieval exceeds the maximum you requested, Firewall Manager returns a
     *        <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token
     *        returned from the prior request in your next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceSetsResult withNextToken(String nextToken) {
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
        if (getResourceSets() != null)
            sb.append("ResourceSets: ").append(getResourceSets()).append(",");
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

        if (obj instanceof ListResourceSetsResult == false)
            return false;
        ListResourceSetsResult other = (ListResourceSetsResult) obj;
        if (other.getResourceSets() == null ^ this.getResourceSets() == null)
            return false;
        if (other.getResourceSets() != null && other.getResourceSets().equals(this.getResourceSets()) == false)
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

        hashCode = prime * hashCode + ((getResourceSets() == null) ? 0 : getResourceSets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceSetsResult clone() {
        try {
            return (ListResourceSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
