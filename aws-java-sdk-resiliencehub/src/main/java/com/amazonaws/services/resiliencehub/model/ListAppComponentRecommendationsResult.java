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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppComponentRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppComponentRecommendationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The recommendations for an Resilience Hub application component, returned as an object. This object contains
     * component names, configuration recommendations, and recommendation statuses.
     * </p>
     */
    private java.util.List<ComponentRecommendation> componentRecommendations;
    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The recommendations for an Resilience Hub application component, returned as an object. This object contains
     * component names, configuration recommendations, and recommendation statuses.
     * </p>
     * 
     * @return The recommendations for an Resilience Hub application component, returned as an object. This object
     *         contains component names, configuration recommendations, and recommendation statuses.
     */

    public java.util.List<ComponentRecommendation> getComponentRecommendations() {
        return componentRecommendations;
    }

    /**
     * <p>
     * The recommendations for an Resilience Hub application component, returned as an object. This object contains
     * component names, configuration recommendations, and recommendation statuses.
     * </p>
     * 
     * @param componentRecommendations
     *        The recommendations for an Resilience Hub application component, returned as an object. This object
     *        contains component names, configuration recommendations, and recommendation statuses.
     */

    public void setComponentRecommendations(java.util.Collection<ComponentRecommendation> componentRecommendations) {
        if (componentRecommendations == null) {
            this.componentRecommendations = null;
            return;
        }

        this.componentRecommendations = new java.util.ArrayList<ComponentRecommendation>(componentRecommendations);
    }

    /**
     * <p>
     * The recommendations for an Resilience Hub application component, returned as an object. This object contains
     * component names, configuration recommendations, and recommendation statuses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComponentRecommendations(java.util.Collection)} or
     * {@link #withComponentRecommendations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param componentRecommendations
     *        The recommendations for an Resilience Hub application component, returned as an object. This object
     *        contains component names, configuration recommendations, and recommendation statuses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppComponentRecommendationsResult withComponentRecommendations(ComponentRecommendation... componentRecommendations) {
        if (this.componentRecommendations == null) {
            setComponentRecommendations(new java.util.ArrayList<ComponentRecommendation>(componentRecommendations.length));
        }
        for (ComponentRecommendation ele : componentRecommendations) {
            this.componentRecommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The recommendations for an Resilience Hub application component, returned as an object. This object contains
     * component names, configuration recommendations, and recommendation statuses.
     * </p>
     * 
     * @param componentRecommendations
     *        The recommendations for an Resilience Hub application component, returned as an object. This object
     *        contains component names, configuration recommendations, and recommendation statuses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppComponentRecommendationsResult withComponentRecommendations(java.util.Collection<ComponentRecommendation> componentRecommendations) {
        setComponentRecommendations(componentRecommendations);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppComponentRecommendationsResult withNextToken(String nextToken) {
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
        if (getComponentRecommendations() != null)
            sb.append("ComponentRecommendations: ").append(getComponentRecommendations()).append(",");
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

        if (obj instanceof ListAppComponentRecommendationsResult == false)
            return false;
        ListAppComponentRecommendationsResult other = (ListAppComponentRecommendationsResult) obj;
        if (other.getComponentRecommendations() == null ^ this.getComponentRecommendations() == null)
            return false;
        if (other.getComponentRecommendations() != null && other.getComponentRecommendations().equals(this.getComponentRecommendations()) == false)
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

        hashCode = prime * hashCode + ((getComponentRecommendations() == null) ? 0 : getComponentRecommendations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAppComponentRecommendationsResult clone() {
        try {
            return (ListAppComponentRecommendationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
