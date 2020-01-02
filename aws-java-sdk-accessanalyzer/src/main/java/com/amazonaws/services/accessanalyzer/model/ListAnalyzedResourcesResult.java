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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response to the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListAnalyzedResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAnalyzedResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of resources that were analyzed.
     * </p>
     */
    private java.util.List<AnalyzedResourceSummary> analyzedResources;
    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of resources that were analyzed.
     * </p>
     * 
     * @return A list of resources that were analyzed.
     */

    public java.util.List<AnalyzedResourceSummary> getAnalyzedResources() {
        return analyzedResources;
    }

    /**
     * <p>
     * A list of resources that were analyzed.
     * </p>
     * 
     * @param analyzedResources
     *        A list of resources that were analyzed.
     */

    public void setAnalyzedResources(java.util.Collection<AnalyzedResourceSummary> analyzedResources) {
        if (analyzedResources == null) {
            this.analyzedResources = null;
            return;
        }

        this.analyzedResources = new java.util.ArrayList<AnalyzedResourceSummary>(analyzedResources);
    }

    /**
     * <p>
     * A list of resources that were analyzed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnalyzedResources(java.util.Collection)} or {@link #withAnalyzedResources(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param analyzedResources
     *        A list of resources that were analyzed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnalyzedResourcesResult withAnalyzedResources(AnalyzedResourceSummary... analyzedResources) {
        if (this.analyzedResources == null) {
            setAnalyzedResources(new java.util.ArrayList<AnalyzedResourceSummary>(analyzedResources.length));
        }
        for (AnalyzedResourceSummary ele : analyzedResources) {
            this.analyzedResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of resources that were analyzed.
     * </p>
     * 
     * @param analyzedResources
     *        A list of resources that were analyzed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnalyzedResourcesResult withAnalyzedResources(java.util.Collection<AnalyzedResourceSummary> analyzedResources) {
        setAnalyzedResources(analyzedResources);
        return this;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @return A token used for pagination of results returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnalyzedResourcesResult withNextToken(String nextToken) {
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
        if (getAnalyzedResources() != null)
            sb.append("AnalyzedResources: ").append(getAnalyzedResources()).append(",");
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

        if (obj instanceof ListAnalyzedResourcesResult == false)
            return false;
        ListAnalyzedResourcesResult other = (ListAnalyzedResourcesResult) obj;
        if (other.getAnalyzedResources() == null ^ this.getAnalyzedResources() == null)
            return false;
        if (other.getAnalyzedResources() != null && other.getAnalyzedResources().equals(this.getAnalyzedResources()) == false)
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

        hashCode = prime * hashCode + ((getAnalyzedResources() == null) ? 0 : getAnalyzedResources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAnalyzedResourcesResult clone() {
        try {
            return (ListAnalyzedResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
