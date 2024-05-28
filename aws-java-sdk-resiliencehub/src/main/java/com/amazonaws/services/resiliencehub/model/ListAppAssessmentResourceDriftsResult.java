/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppAssessmentResourceDrifts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppAssessmentResourceDriftsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Null, or the token from a previous call to get the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Indicates all the resource drifts detected for an assessed entity.
     * </p>
     */
    private java.util.List<ResourceDrift> resourceDrifts;

    /**
     * <p>
     * Null, or the token from a previous call to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Null, or the token from a previous call to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Null, or the token from a previous call to get the next set of results.
     * </p>
     * 
     * @return Null, or the token from a previous call to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Null, or the token from a previous call to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Null, or the token from a previous call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppAssessmentResourceDriftsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Indicates all the resource drifts detected for an assessed entity.
     * </p>
     * 
     * @return Indicates all the resource drifts detected for an assessed entity.
     */

    public java.util.List<ResourceDrift> getResourceDrifts() {
        return resourceDrifts;
    }

    /**
     * <p>
     * Indicates all the resource drifts detected for an assessed entity.
     * </p>
     * 
     * @param resourceDrifts
     *        Indicates all the resource drifts detected for an assessed entity.
     */

    public void setResourceDrifts(java.util.Collection<ResourceDrift> resourceDrifts) {
        if (resourceDrifts == null) {
            this.resourceDrifts = null;
            return;
        }

        this.resourceDrifts = new java.util.ArrayList<ResourceDrift>(resourceDrifts);
    }

    /**
     * <p>
     * Indicates all the resource drifts detected for an assessed entity.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceDrifts(java.util.Collection)} or {@link #withResourceDrifts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceDrifts
     *        Indicates all the resource drifts detected for an assessed entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppAssessmentResourceDriftsResult withResourceDrifts(ResourceDrift... resourceDrifts) {
        if (this.resourceDrifts == null) {
            setResourceDrifts(new java.util.ArrayList<ResourceDrift>(resourceDrifts.length));
        }
        for (ResourceDrift ele : resourceDrifts) {
            this.resourceDrifts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates all the resource drifts detected for an assessed entity.
     * </p>
     * 
     * @param resourceDrifts
     *        Indicates all the resource drifts detected for an assessed entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppAssessmentResourceDriftsResult withResourceDrifts(java.util.Collection<ResourceDrift> resourceDrifts) {
        setResourceDrifts(resourceDrifts);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getResourceDrifts() != null)
            sb.append("ResourceDrifts: ").append(getResourceDrifts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAppAssessmentResourceDriftsResult == false)
            return false;
        ListAppAssessmentResourceDriftsResult other = (ListAppAssessmentResourceDriftsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResourceDrifts() == null ^ this.getResourceDrifts() == null)
            return false;
        if (other.getResourceDrifts() != null && other.getResourceDrifts().equals(this.getResourceDrifts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResourceDrifts() == null) ? 0 : getResourceDrifts().hashCode());
        return hashCode;
    }

    @Override
    public ListAppAssessmentResourceDriftsResult clone() {
        try {
            return (ListAppAssessmentResourceDriftsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
