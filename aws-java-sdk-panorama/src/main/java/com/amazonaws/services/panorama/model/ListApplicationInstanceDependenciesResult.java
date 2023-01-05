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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListApplicationInstanceDependencies"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationInstanceDependenciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of package objects.
     * </p>
     */
    private java.util.List<PackageObject> packageObjects;

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that's included if more results are available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     * 
     * @return A pagination token that's included if more results are available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that's included if more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationInstanceDependenciesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of package objects.
     * </p>
     * 
     * @return A list of package objects.
     */

    public java.util.List<PackageObject> getPackageObjects() {
        return packageObjects;
    }

    /**
     * <p>
     * A list of package objects.
     * </p>
     * 
     * @param packageObjects
     *        A list of package objects.
     */

    public void setPackageObjects(java.util.Collection<PackageObject> packageObjects) {
        if (packageObjects == null) {
            this.packageObjects = null;
            return;
        }

        this.packageObjects = new java.util.ArrayList<PackageObject>(packageObjects);
    }

    /**
     * <p>
     * A list of package objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPackageObjects(java.util.Collection)} or {@link #withPackageObjects(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param packageObjects
     *        A list of package objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationInstanceDependenciesResult withPackageObjects(PackageObject... packageObjects) {
        if (this.packageObjects == null) {
            setPackageObjects(new java.util.ArrayList<PackageObject>(packageObjects.length));
        }
        for (PackageObject ele : packageObjects) {
            this.packageObjects.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of package objects.
     * </p>
     * 
     * @param packageObjects
     *        A list of package objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationInstanceDependenciesResult withPackageObjects(java.util.Collection<PackageObject> packageObjects) {
        setPackageObjects(packageObjects);
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
        if (getPackageObjects() != null)
            sb.append("PackageObjects: ").append(getPackageObjects());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListApplicationInstanceDependenciesResult == false)
            return false;
        ListApplicationInstanceDependenciesResult other = (ListApplicationInstanceDependenciesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPackageObjects() == null ^ this.getPackageObjects() == null)
            return false;
        if (other.getPackageObjects() != null && other.getPackageObjects().equals(this.getPackageObjects()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPackageObjects() == null) ? 0 : getPackageObjects().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationInstanceDependenciesResult clone() {
        try {
            return (ListApplicationInstanceDependenciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
