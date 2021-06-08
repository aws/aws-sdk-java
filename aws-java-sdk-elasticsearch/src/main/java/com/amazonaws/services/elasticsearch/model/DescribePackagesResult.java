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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Container for response returned by <code> <a>DescribePackages</a> </code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePackagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of <code>PackageDetails</code> objects.
     * </p>
     */
    private java.util.List<PackageDetails> packageDetailsList;

    private String nextToken;

    /**
     * <p>
     * List of <code>PackageDetails</code> objects.
     * </p>
     * 
     * @return List of <code>PackageDetails</code> objects.
     */

    public java.util.List<PackageDetails> getPackageDetailsList() {
        return packageDetailsList;
    }

    /**
     * <p>
     * List of <code>PackageDetails</code> objects.
     * </p>
     * 
     * @param packageDetailsList
     *        List of <code>PackageDetails</code> objects.
     */

    public void setPackageDetailsList(java.util.Collection<PackageDetails> packageDetailsList) {
        if (packageDetailsList == null) {
            this.packageDetailsList = null;
            return;
        }

        this.packageDetailsList = new java.util.ArrayList<PackageDetails>(packageDetailsList);
    }

    /**
     * <p>
     * List of <code>PackageDetails</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPackageDetailsList(java.util.Collection)} or {@link #withPackageDetailsList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param packageDetailsList
     *        List of <code>PackageDetails</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackagesResult withPackageDetailsList(PackageDetails... packageDetailsList) {
        if (this.packageDetailsList == null) {
            setPackageDetailsList(new java.util.ArrayList<PackageDetails>(packageDetailsList.length));
        }
        for (PackageDetails ele : packageDetailsList) {
            this.packageDetailsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of <code>PackageDetails</code> objects.
     * </p>
     * 
     * @param packageDetailsList
     *        List of <code>PackageDetails</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackagesResult withPackageDetailsList(java.util.Collection<PackageDetails> packageDetailsList) {
        setPackageDetailsList(packageDetailsList);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackagesResult withNextToken(String nextToken) {
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
        if (getPackageDetailsList() != null)
            sb.append("PackageDetailsList: ").append(getPackageDetailsList()).append(",");
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

        if (obj instanceof DescribePackagesResult == false)
            return false;
        DescribePackagesResult other = (DescribePackagesResult) obj;
        if (other.getPackageDetailsList() == null ^ this.getPackageDetailsList() == null)
            return false;
        if (other.getPackageDetailsList() != null && other.getPackageDetailsList().equals(this.getPackageDetailsList()) == false)
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

        hashCode = prime * hashCode + ((getPackageDetailsList() == null) ? 0 : getPackageDetailsList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribePackagesResult clone() {
        try {
            return (DescribePackagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
