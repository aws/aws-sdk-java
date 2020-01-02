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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListSolutionVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSolutionVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of solution versions describing the version properties.
     * </p>
     */
    private java.util.List<SolutionVersionSummary> solutionVersions;
    /**
     * <p>
     * A token for getting the next set of solution versions (if they exist).
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of solution versions describing the version properties.
     * </p>
     * 
     * @return A list of solution versions describing the version properties.
     */

    public java.util.List<SolutionVersionSummary> getSolutionVersions() {
        return solutionVersions;
    }

    /**
     * <p>
     * A list of solution versions describing the version properties.
     * </p>
     * 
     * @param solutionVersions
     *        A list of solution versions describing the version properties.
     */

    public void setSolutionVersions(java.util.Collection<SolutionVersionSummary> solutionVersions) {
        if (solutionVersions == null) {
            this.solutionVersions = null;
            return;
        }

        this.solutionVersions = new java.util.ArrayList<SolutionVersionSummary>(solutionVersions);
    }

    /**
     * <p>
     * A list of solution versions describing the version properties.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSolutionVersions(java.util.Collection)} or {@link #withSolutionVersions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param solutionVersions
     *        A list of solution versions describing the version properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolutionVersionsResult withSolutionVersions(SolutionVersionSummary... solutionVersions) {
        if (this.solutionVersions == null) {
            setSolutionVersions(new java.util.ArrayList<SolutionVersionSummary>(solutionVersions.length));
        }
        for (SolutionVersionSummary ele : solutionVersions) {
            this.solutionVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of solution versions describing the version properties.
     * </p>
     * 
     * @param solutionVersions
     *        A list of solution versions describing the version properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolutionVersionsResult withSolutionVersions(java.util.Collection<SolutionVersionSummary> solutionVersions) {
        setSolutionVersions(solutionVersions);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of solution versions (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of solution versions (if they exist).
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of solution versions (if they exist).
     * </p>
     * 
     * @return A token for getting the next set of solution versions (if they exist).
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of solution versions (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of solution versions (if they exist).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolutionVersionsResult withNextToken(String nextToken) {
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
        if (getSolutionVersions() != null)
            sb.append("SolutionVersions: ").append(getSolutionVersions()).append(",");
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

        if (obj instanceof ListSolutionVersionsResult == false)
            return false;
        ListSolutionVersionsResult other = (ListSolutionVersionsResult) obj;
        if (other.getSolutionVersions() == null ^ this.getSolutionVersions() == null)
            return false;
        if (other.getSolutionVersions() != null && other.getSolutionVersions().equals(this.getSolutionVersions()) == false)
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

        hashCode = prime * hashCode + ((getSolutionVersions() == null) ? 0 : getSolutionVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSolutionVersionsResult clone() {
        try {
            return (ListSolutionVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
