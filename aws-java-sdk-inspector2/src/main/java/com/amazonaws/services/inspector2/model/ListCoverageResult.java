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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCoverage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCoverageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that contains details on the covered resources in your environment.
     * </p>
     */
    private java.util.List<CoveredResource> coveredResources;
    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An object that contains details on the covered resources in your environment.
     * </p>
     * 
     * @return An object that contains details on the covered resources in your environment.
     */

    public java.util.List<CoveredResource> getCoveredResources() {
        return coveredResources;
    }

    /**
     * <p>
     * An object that contains details on the covered resources in your environment.
     * </p>
     * 
     * @param coveredResources
     *        An object that contains details on the covered resources in your environment.
     */

    public void setCoveredResources(java.util.Collection<CoveredResource> coveredResources) {
        if (coveredResources == null) {
            this.coveredResources = null;
            return;
        }

        this.coveredResources = new java.util.ArrayList<CoveredResource>(coveredResources);
    }

    /**
     * <p>
     * An object that contains details on the covered resources in your environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCoveredResources(java.util.Collection)} or {@link #withCoveredResources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param coveredResources
     *        An object that contains details on the covered resources in your environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCoverageResult withCoveredResources(CoveredResource... coveredResources) {
        if (this.coveredResources == null) {
            setCoveredResources(new java.util.ArrayList<CoveredResource>(coveredResources.length));
        }
        for (CoveredResource ele : coveredResources) {
            this.coveredResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that contains details on the covered resources in your environment.
     * </p>
     * 
     * @param coveredResources
     *        An object that contains details on the covered resources in your environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCoverageResult withCoveredResources(java.util.Collection<CoveredResource> coveredResources) {
        setCoveredResources(coveredResources);
        return this;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results that are returned in the response. Set the value of this parameter
     *        to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value
     *        returned from the previous request to continue listing results after the first page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @return A token to use for paginating results that are returned in the response. Set the value of this parameter
     *         to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code>
     *         value returned from the previous request to continue listing results after the first page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results that are returned in the response. Set the value of this parameter
     *        to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value
     *        returned from the previous request to continue listing results after the first page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCoverageResult withNextToken(String nextToken) {
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
        if (getCoveredResources() != null)
            sb.append("CoveredResources: ").append(getCoveredResources()).append(",");
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

        if (obj instanceof ListCoverageResult == false)
            return false;
        ListCoverageResult other = (ListCoverageResult) obj;
        if (other.getCoveredResources() == null ^ this.getCoveredResources() == null)
            return false;
        if (other.getCoveredResources() != null && other.getCoveredResources().equals(this.getCoveredResources()) == false)
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

        hashCode = prime * hashCode + ((getCoveredResources() == null) ? 0 : getCoveredResources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCoverageResult clone() {
        try {
            return (ListCoverageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
