/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListVersionsByFunction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVersionsByFunctionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * A list of Lambda function versions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FunctionConfiguration> versions;

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextMarker
     *        The pagination token that's included if more results are available.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @return The pagination token that's included if more results are available.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextMarker
     *        The pagination token that's included if more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVersionsByFunctionResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * A list of Lambda function versions.
     * </p>
     * 
     * @return A list of Lambda function versions.
     */

    public java.util.List<FunctionConfiguration> getVersions() {
        if (versions == null) {
            versions = new com.amazonaws.internal.SdkInternalList<FunctionConfiguration>();
        }
        return versions;
    }

    /**
     * <p>
     * A list of Lambda function versions.
     * </p>
     * 
     * @param versions
     *        A list of Lambda function versions.
     */

    public void setVersions(java.util.Collection<FunctionConfiguration> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new com.amazonaws.internal.SdkInternalList<FunctionConfiguration>(versions);
    }

    /**
     * <p>
     * A list of Lambda function versions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersions(java.util.Collection)} or {@link #withVersions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param versions
     *        A list of Lambda function versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVersionsByFunctionResult withVersions(FunctionConfiguration... versions) {
        if (this.versions == null) {
            setVersions(new com.amazonaws.internal.SdkInternalList<FunctionConfiguration>(versions.length));
        }
        for (FunctionConfiguration ele : versions) {
            this.versions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Lambda function versions.
     * </p>
     * 
     * @param versions
     *        A list of Lambda function versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVersionsByFunctionResult withVersions(java.util.Collection<FunctionConfiguration> versions) {
        setVersions(versions);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
        if (getVersions() != null)
            sb.append("Versions: ").append(getVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVersionsByFunctionResult == false)
            return false;
        ListVersionsByFunctionResult other = (ListVersionsByFunctionResult) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getVersions() == null ^ this.getVersions() == null)
            return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        return hashCode;
    }

    @Override
    public ListVersionsByFunctionResult clone() {
        try {
            return (ListVersionsByFunctionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
