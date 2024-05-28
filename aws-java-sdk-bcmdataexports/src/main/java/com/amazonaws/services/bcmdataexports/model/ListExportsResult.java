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
package com.amazonaws.services.bcmdataexports.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/ListExports" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExportsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details of the exports, including name and export status.
     * </p>
     */
    private java.util.List<ExportReference> exports;
    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The details of the exports, including name and export status.
     * </p>
     * 
     * @return The details of the exports, including name and export status.
     */

    public java.util.List<ExportReference> getExports() {
        return exports;
    }

    /**
     * <p>
     * The details of the exports, including name and export status.
     * </p>
     * 
     * @param exports
     *        The details of the exports, including name and export status.
     */

    public void setExports(java.util.Collection<ExportReference> exports) {
        if (exports == null) {
            this.exports = null;
            return;
        }

        this.exports = new java.util.ArrayList<ExportReference>(exports);
    }

    /**
     * <p>
     * The details of the exports, including name and export status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExports(java.util.Collection)} or {@link #withExports(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param exports
     *        The details of the exports, including name and export status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportsResult withExports(ExportReference... exports) {
        if (this.exports == null) {
            setExports(new java.util.ArrayList<ExportReference>(exports.length));
        }
        for (ExportReference ele : exports) {
            this.exports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details of the exports, including name and export status.
     * </p>
     * 
     * @param exports
     *        The details of the exports, including name and export status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportsResult withExports(java.util.Collection<ExportReference> exports) {
        setExports(exports);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @return The token to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportsResult withNextToken(String nextToken) {
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
        if (getExports() != null)
            sb.append("Exports: ").append(getExports()).append(",");
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

        if (obj instanceof ListExportsResult == false)
            return false;
        ListExportsResult other = (ListExportsResult) obj;
        if (other.getExports() == null ^ this.getExports() == null)
            return false;
        if (other.getExports() != null && other.getExports().equals(this.getExports()) == false)
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

        hashCode = prime * hashCode + ((getExports() == null) ? 0 : getExports().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListExportsResult clone() {
        try {
            return (ListExportsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
