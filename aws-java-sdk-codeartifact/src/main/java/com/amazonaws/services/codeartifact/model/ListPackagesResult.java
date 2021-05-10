/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListPackages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPackagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of returned <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageSummary.html">PackageSummary</a>
     * objects.
     * </p>
     */
    private java.util.List<PackageSummary> packages;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of returned <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageSummary.html">PackageSummary</a>
     * objects.
     * </p>
     * 
     * @return The list of returned <a
     *         href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageSummary.html"
     *         >PackageSummary</a> objects.
     */

    public java.util.List<PackageSummary> getPackages() {
        return packages;
    }

    /**
     * <p>
     * The list of returned <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageSummary.html">PackageSummary</a>
     * objects.
     * </p>
     * 
     * @param packages
     *        The list of returned <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageSummary.html"
     *        >PackageSummary</a> objects.
     */

    public void setPackages(java.util.Collection<PackageSummary> packages) {
        if (packages == null) {
            this.packages = null;
            return;
        }

        this.packages = new java.util.ArrayList<PackageSummary>(packages);
    }

    /**
     * <p>
     * The list of returned <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageSummary.html">PackageSummary</a>
     * objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPackages(java.util.Collection)} or {@link #withPackages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param packages
     *        The list of returned <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageSummary.html"
     *        >PackageSummary</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackagesResult withPackages(PackageSummary... packages) {
        if (this.packages == null) {
            setPackages(new java.util.ArrayList<PackageSummary>(packages.length));
        }
        for (PackageSummary ele : packages) {
            this.packages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of returned <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageSummary.html">PackageSummary</a>
     * objects.
     * </p>
     * 
     * @param packages
     *        The list of returned <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageSummary.html"
     *        >PackageSummary</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackagesResult withPackages(java.util.Collection<PackageSummary> packages) {
        setPackages(packages);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackagesResult withNextToken(String nextToken) {
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
        if (getPackages() != null)
            sb.append("Packages: ").append(getPackages()).append(",");
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

        if (obj instanceof ListPackagesResult == false)
            return false;
        ListPackagesResult other = (ListPackagesResult) obj;
        if (other.getPackages() == null ^ this.getPackages() == null)
            return false;
        if (other.getPackages() != null && other.getPackages().equals(this.getPackages()) == false)
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

        hashCode = prime * hashCode + ((getPackages() == null) ? 0 : getPackages().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPackagesResult clone() {
        try {
            return (ListPackagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
