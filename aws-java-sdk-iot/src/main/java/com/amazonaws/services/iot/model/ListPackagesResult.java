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
public class ListPackagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The software package summary.
     * </p>
     */
    private java.util.List<PackageSummary> packageSummaries;
    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The software package summary.
     * </p>
     * 
     * @return The software package summary.
     */

    public java.util.List<PackageSummary> getPackageSummaries() {
        return packageSummaries;
    }

    /**
     * <p>
     * The software package summary.
     * </p>
     * 
     * @param packageSummaries
     *        The software package summary.
     */

    public void setPackageSummaries(java.util.Collection<PackageSummary> packageSummaries) {
        if (packageSummaries == null) {
            this.packageSummaries = null;
            return;
        }

        this.packageSummaries = new java.util.ArrayList<PackageSummary>(packageSummaries);
    }

    /**
     * <p>
     * The software package summary.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPackageSummaries(java.util.Collection)} or {@link #withPackageSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param packageSummaries
     *        The software package summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackagesResult withPackageSummaries(PackageSummary... packageSummaries) {
        if (this.packageSummaries == null) {
            setPackageSummaries(new java.util.ArrayList<PackageSummary>(packageSummaries.length));
        }
        for (PackageSummary ele : packageSummaries) {
            this.packageSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The software package summary.
     * </p>
     * 
     * @param packageSummaries
     *        The software package summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackagesResult withPackageSummaries(java.util.Collection<PackageSummary> packageSummaries) {
        setPackageSummaries(packageSummaries);
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
        if (getPackageSummaries() != null)
            sb.append("PackageSummaries: ").append(getPackageSummaries()).append(",");
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
        if (other.getPackageSummaries() == null ^ this.getPackageSummaries() == null)
            return false;
        if (other.getPackageSummaries() != null && other.getPackageSummaries().equals(this.getPackageSummaries()) == false)
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

        hashCode = prime * hashCode + ((getPackageSummaries() == null) ? 0 : getPackageSummaries().hashCode());
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
