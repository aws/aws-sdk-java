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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetSizeConstraintSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSizeConstraintSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the <a>SizeConstraintSet</a> that you specified in the <code>GetSizeConstraintSet</code>
     * request. For more information, see the following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SizeConstraintSet</a>: Contains <code>SizeConstraintSetId</code>, <code>SizeConstraints</code>, and
     * <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SizeConstraints</code>: Contains an array of <a>SizeConstraint</a> objects. Each
     * <code>SizeConstraint</code> object contains <a>FieldToMatch</a>, <code>TextTransformation</code>,
     * <code>ComparisonOperator</code>, and <code>Size</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     */
    private SizeConstraintSet sizeConstraintSet;

    /**
     * <p>
     * Information about the <a>SizeConstraintSet</a> that you specified in the <code>GetSizeConstraintSet</code>
     * request. For more information, see the following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SizeConstraintSet</a>: Contains <code>SizeConstraintSetId</code>, <code>SizeConstraints</code>, and
     * <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SizeConstraints</code>: Contains an array of <a>SizeConstraint</a> objects. Each
     * <code>SizeConstraint</code> object contains <a>FieldToMatch</a>, <code>TextTransformation</code>,
     * <code>ComparisonOperator</code>, and <code>Size</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param sizeConstraintSet
     *        Information about the <a>SizeConstraintSet</a> that you specified in the <code>GetSizeConstraintSet</code>
     *        request. For more information, see the following topics:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>SizeConstraintSet</a>: Contains <code>SizeConstraintSetId</code>, <code>SizeConstraints</code>, and
     *        <code>Name</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SizeConstraints</code>: Contains an array of <a>SizeConstraint</a> objects. Each
     *        <code>SizeConstraint</code> object contains <a>FieldToMatch</a>, <code>TextTransformation</code>,
     *        <code>ComparisonOperator</code>, and <code>Size</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     *        </p>
     *        </li>
     */

    public void setSizeConstraintSet(SizeConstraintSet sizeConstraintSet) {
        this.sizeConstraintSet = sizeConstraintSet;
    }

    /**
     * <p>
     * Information about the <a>SizeConstraintSet</a> that you specified in the <code>GetSizeConstraintSet</code>
     * request. For more information, see the following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SizeConstraintSet</a>: Contains <code>SizeConstraintSetId</code>, <code>SizeConstraints</code>, and
     * <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SizeConstraints</code>: Contains an array of <a>SizeConstraint</a> objects. Each
     * <code>SizeConstraint</code> object contains <a>FieldToMatch</a>, <code>TextTransformation</code>,
     * <code>ComparisonOperator</code>, and <code>Size</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about the <a>SizeConstraintSet</a> that you specified in the
     *         <code>GetSizeConstraintSet</code> request. For more information, see the following topics:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>SizeConstraintSet</a>: Contains <code>SizeConstraintSetId</code>, <code>SizeConstraints</code>, and
     *         <code>Name</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SizeConstraints</code>: Contains an array of <a>SizeConstraint</a> objects. Each
     *         <code>SizeConstraint</code> object contains <a>FieldToMatch</a>, <code>TextTransformation</code>,
     *         <code>ComparisonOperator</code>, and <code>Size</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     *         </p>
     *         </li>
     */

    public SizeConstraintSet getSizeConstraintSet() {
        return this.sizeConstraintSet;
    }

    /**
     * <p>
     * Information about the <a>SizeConstraintSet</a> that you specified in the <code>GetSizeConstraintSet</code>
     * request. For more information, see the following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>SizeConstraintSet</a>: Contains <code>SizeConstraintSetId</code>, <code>SizeConstraints</code>, and
     * <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SizeConstraints</code>: Contains an array of <a>SizeConstraint</a> objects. Each
     * <code>SizeConstraint</code> object contains <a>FieldToMatch</a>, <code>TextTransformation</code>,
     * <code>ComparisonOperator</code>, and <code>Size</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param sizeConstraintSet
     *        Information about the <a>SizeConstraintSet</a> that you specified in the <code>GetSizeConstraintSet</code>
     *        request. For more information, see the following topics:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>SizeConstraintSet</a>: Contains <code>SizeConstraintSetId</code>, <code>SizeConstraints</code>, and
     *        <code>Name</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SizeConstraints</code>: Contains an array of <a>SizeConstraint</a> objects. Each
     *        <code>SizeConstraint</code> object contains <a>FieldToMatch</a>, <code>TextTransformation</code>,
     *        <code>ComparisonOperator</code>, and <code>Size</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSizeConstraintSetResult withSizeConstraintSet(SizeConstraintSet sizeConstraintSet) {
        setSizeConstraintSet(sizeConstraintSet);
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
        if (getSizeConstraintSet() != null)
            sb.append("SizeConstraintSet: ").append(getSizeConstraintSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSizeConstraintSetResult == false)
            return false;
        GetSizeConstraintSetResult other = (GetSizeConstraintSetResult) obj;
        if (other.getSizeConstraintSet() == null ^ this.getSizeConstraintSet() == null)
            return false;
        if (other.getSizeConstraintSet() != null && other.getSizeConstraintSet().equals(this.getSizeConstraintSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSizeConstraintSet() == null) ? 0 : getSizeConstraintSet().hashCode());
        return hashCode;
    }

    @Override
    public GetSizeConstraintSetResult clone() {
        try {
            return (GetSizeConstraintSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
