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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPackageVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists the package versions associated to the package.
     * </p>
     */
    private java.util.List<PackageVersionSummary> packageVersionSummaries;
    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists the package versions associated to the package.
     * </p>
     * 
     * @return Lists the package versions associated to the package.
     */

    public java.util.List<PackageVersionSummary> getPackageVersionSummaries() {
        return packageVersionSummaries;
    }

    /**
     * <p>
     * Lists the package versions associated to the package.
     * </p>
     * 
     * @param packageVersionSummaries
     *        Lists the package versions associated to the package.
     */

    public void setPackageVersionSummaries(java.util.Collection<PackageVersionSummary> packageVersionSummaries) {
        if (packageVersionSummaries == null) {
            this.packageVersionSummaries = null;
            return;
        }

        this.packageVersionSummaries = new java.util.ArrayList<PackageVersionSummary>(packageVersionSummaries);
    }

    /**
     * <p>
     * Lists the package versions associated to the package.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPackageVersionSummaries(java.util.Collection)} or
     * {@link #withPackageVersionSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param packageVersionSummaries
     *        Lists the package versions associated to the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionsResult withPackageVersionSummaries(PackageVersionSummary... packageVersionSummaries) {
        if (this.packageVersionSummaries == null) {
            setPackageVersionSummaries(new java.util.ArrayList<PackageVersionSummary>(packageVersionSummaries.length));
        }
        for (PackageVersionSummary ele : packageVersionSummaries) {
            this.packageVersionSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the package versions associated to the package.
     * </p>
     * 
     * @param packageVersionSummaries
     *        Lists the package versions associated to the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionsResult withPackageVersionSummaries(java.util.Collection<PackageVersionSummary> packageVersionSummaries) {
        setPackageVersionSummaries(packageVersionSummaries);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @return The token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackageVersionsResult withNextToken(String nextToken) {
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
        if (getPackageVersionSummaries() != null)
            sb.append("PackageVersionSummaries: ").append(getPackageVersionSummaries()).append(",");
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

        if (obj instanceof ListPackageVersionsResult == false)
            return false;
        ListPackageVersionsResult other = (ListPackageVersionsResult) obj;
        if (other.getPackageVersionSummaries() == null ^ this.getPackageVersionSummaries() == null)
            return false;
        if (other.getPackageVersionSummaries() != null && other.getPackageVersionSummaries().equals(this.getPackageVersionSummaries()) == false)
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

        hashCode = prime * hashCode + ((getPackageVersionSummaries() == null) ? 0 : getPackageVersionSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPackageVersionsResult clone() {
        try {
            return (ListPackageVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
