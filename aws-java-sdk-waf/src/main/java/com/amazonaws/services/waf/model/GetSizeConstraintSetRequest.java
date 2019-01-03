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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetSizeConstraintSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSizeConstraintSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>SizeConstraintSetId</code> of the <a>SizeConstraintSet</a> that you want to get.
     * <code>SizeConstraintSetId</code> is returned by <a>CreateSizeConstraintSet</a> and by
     * <a>ListSizeConstraintSets</a>.
     * </p>
     */
    private String sizeConstraintSetId;

    /**
     * <p>
     * The <code>SizeConstraintSetId</code> of the <a>SizeConstraintSet</a> that you want to get.
     * <code>SizeConstraintSetId</code> is returned by <a>CreateSizeConstraintSet</a> and by
     * <a>ListSizeConstraintSets</a>.
     * </p>
     * 
     * @param sizeConstraintSetId
     *        The <code>SizeConstraintSetId</code> of the <a>SizeConstraintSet</a> that you want to get.
     *        <code>SizeConstraintSetId</code> is returned by <a>CreateSizeConstraintSet</a> and by
     *        <a>ListSizeConstraintSets</a>.
     */

    public void setSizeConstraintSetId(String sizeConstraintSetId) {
        this.sizeConstraintSetId = sizeConstraintSetId;
    }

    /**
     * <p>
     * The <code>SizeConstraintSetId</code> of the <a>SizeConstraintSet</a> that you want to get.
     * <code>SizeConstraintSetId</code> is returned by <a>CreateSizeConstraintSet</a> and by
     * <a>ListSizeConstraintSets</a>.
     * </p>
     * 
     * @return The <code>SizeConstraintSetId</code> of the <a>SizeConstraintSet</a> that you want to get.
     *         <code>SizeConstraintSetId</code> is returned by <a>CreateSizeConstraintSet</a> and by
     *         <a>ListSizeConstraintSets</a>.
     */

    public String getSizeConstraintSetId() {
        return this.sizeConstraintSetId;
    }

    /**
     * <p>
     * The <code>SizeConstraintSetId</code> of the <a>SizeConstraintSet</a> that you want to get.
     * <code>SizeConstraintSetId</code> is returned by <a>CreateSizeConstraintSet</a> and by
     * <a>ListSizeConstraintSets</a>.
     * </p>
     * 
     * @param sizeConstraintSetId
     *        The <code>SizeConstraintSetId</code> of the <a>SizeConstraintSet</a> that you want to get.
     *        <code>SizeConstraintSetId</code> is returned by <a>CreateSizeConstraintSet</a> and by
     *        <a>ListSizeConstraintSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSizeConstraintSetRequest withSizeConstraintSetId(String sizeConstraintSetId) {
        setSizeConstraintSetId(sizeConstraintSetId);
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
        if (getSizeConstraintSetId() != null)
            sb.append("SizeConstraintSetId: ").append(getSizeConstraintSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSizeConstraintSetRequest == false)
            return false;
        GetSizeConstraintSetRequest other = (GetSizeConstraintSetRequest) obj;
        if (other.getSizeConstraintSetId() == null ^ this.getSizeConstraintSetId() == null)
            return false;
        if (other.getSizeConstraintSetId() != null && other.getSizeConstraintSetId().equals(this.getSizeConstraintSetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSizeConstraintSetId() == null) ? 0 : getSizeConstraintSetId().hashCode());
        return hashCode;
    }

    @Override
    public GetSizeConstraintSetRequest clone() {
        return (GetSizeConstraintSetRequest) super.clone();
    }

}
