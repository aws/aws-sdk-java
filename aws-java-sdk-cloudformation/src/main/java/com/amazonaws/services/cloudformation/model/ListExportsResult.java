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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListExports" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExportsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The output for the <a>ListExports</a> action.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Export> exports;
    /**
     * <p>
     * If the output exceeds 100 exported output values, a string that identifies the next page of exports. If there is
     * no additional page, this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The output for the <a>ListExports</a> action.
     * </p>
     * 
     * @return The output for the <a>ListExports</a> action.
     */

    public java.util.List<Export> getExports() {
        if (exports == null) {
            exports = new com.amazonaws.internal.SdkInternalList<Export>();
        }
        return exports;
    }

    /**
     * <p>
     * The output for the <a>ListExports</a> action.
     * </p>
     * 
     * @param exports
     *        The output for the <a>ListExports</a> action.
     */

    public void setExports(java.util.Collection<Export> exports) {
        if (exports == null) {
            this.exports = null;
            return;
        }

        this.exports = new com.amazonaws.internal.SdkInternalList<Export>(exports);
    }

    /**
     * <p>
     * The output for the <a>ListExports</a> action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExports(java.util.Collection)} or {@link #withExports(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param exports
     *        The output for the <a>ListExports</a> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportsResult withExports(Export... exports) {
        if (this.exports == null) {
            setExports(new com.amazonaws.internal.SdkInternalList<Export>(exports.length));
        }
        for (Export ele : exports) {
            this.exports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The output for the <a>ListExports</a> action.
     * </p>
     * 
     * @param exports
     *        The output for the <a>ListExports</a> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportsResult withExports(java.util.Collection<Export> exports) {
        setExports(exports);
        return this;
    }

    /**
     * <p>
     * If the output exceeds 100 exported output values, a string that identifies the next page of exports. If there is
     * no additional page, this value is null.
     * </p>
     * 
     * @param nextToken
     *        If the output exceeds 100 exported output values, a string that identifies the next page of exports. If
     *        there is no additional page, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the output exceeds 100 exported output values, a string that identifies the next page of exports. If there is
     * no additional page, this value is null.
     * </p>
     * 
     * @return If the output exceeds 100 exported output values, a string that identifies the next page of exports. If
     *         there is no additional page, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the output exceeds 100 exported output values, a string that identifies the next page of exports. If there is
     * no additional page, this value is null.
     * </p>
     * 
     * @param nextToken
     *        If the output exceeds 100 exported output values, a string that identifies the next page of exports. If
     *        there is no additional page, this value is null.
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
