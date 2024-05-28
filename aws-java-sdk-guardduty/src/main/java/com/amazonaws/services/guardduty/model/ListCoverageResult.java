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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListCoverage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCoverageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of resources and their attributes providing cluster details.
     * </p>
     */
    private java.util.List<CoverageResource> resources;
    /**
     * <p>
     * The pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of resources and their attributes providing cluster details.
     * </p>
     * 
     * @return A list of resources and their attributes providing cluster details.
     */

    public java.util.List<CoverageResource> getResources() {
        return resources;
    }

    /**
     * <p>
     * A list of resources and their attributes providing cluster details.
     * </p>
     * 
     * @param resources
     *        A list of resources and their attributes providing cluster details.
     */

    public void setResources(java.util.Collection<CoverageResource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<CoverageResource>(resources);
    }

    /**
     * <p>
     * A list of resources and their attributes providing cluster details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        A list of resources and their attributes providing cluster details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCoverageResult withResources(CoverageResource... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<CoverageResource>(resources.length));
        }
        for (CoverageResource ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of resources and their attributes providing cluster details.
     * </p>
     * 
     * @param resources
     *        A list of resources and their attributes providing cluster details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCoverageResult withResources(java.util.Collection<CoverageResource> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     * 
     * @param nextToken
     *        The pagination parameter to be used on the next list operation to retrieve more items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     * 
     * @return The pagination parameter to be used on the next list operation to retrieve more items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     * 
     * @param nextToken
     *        The pagination parameter to be used on the next list operation to retrieve more items.
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
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
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
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
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

        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
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
