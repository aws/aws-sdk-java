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
 * <p>
 * The response to a <a>GetXssMatchSet</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetXssMatchSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetXssMatchSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the <a>XssMatchSet</a> that you specified in the <code>GetXssMatchSet</code> request. For more
     * information, see the following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>XssMatchSet</a>: Contains <code>Name</code>, <code>XssMatchSetId</code>, and an array of
     * <code>XssMatchTuple</code> objects
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>XssMatchTuple</a>: Each <code>XssMatchTuple</code> object contains <code>FieldToMatch</code> and
     * <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     */
    private XssMatchSet xssMatchSet;

    /**
     * <p>
     * Information about the <a>XssMatchSet</a> that you specified in the <code>GetXssMatchSet</code> request. For more
     * information, see the following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>XssMatchSet</a>: Contains <code>Name</code>, <code>XssMatchSetId</code>, and an array of
     * <code>XssMatchTuple</code> objects
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>XssMatchTuple</a>: Each <code>XssMatchTuple</code> object contains <code>FieldToMatch</code> and
     * <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param xssMatchSet
     *        Information about the <a>XssMatchSet</a> that you specified in the <code>GetXssMatchSet</code> request.
     *        For more information, see the following topics:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>XssMatchSet</a>: Contains <code>Name</code>, <code>XssMatchSetId</code>, and an array of
     *        <code>XssMatchTuple</code> objects
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>XssMatchTuple</a>: Each <code>XssMatchTuple</code> object contains <code>FieldToMatch</code> and
     *        <code>TextTransformation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     *        </p>
     *        </li>
     */

    public void setXssMatchSet(XssMatchSet xssMatchSet) {
        this.xssMatchSet = xssMatchSet;
    }

    /**
     * <p>
     * Information about the <a>XssMatchSet</a> that you specified in the <code>GetXssMatchSet</code> request. For more
     * information, see the following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>XssMatchSet</a>: Contains <code>Name</code>, <code>XssMatchSetId</code>, and an array of
     * <code>XssMatchTuple</code> objects
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>XssMatchTuple</a>: Each <code>XssMatchTuple</code> object contains <code>FieldToMatch</code> and
     * <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about the <a>XssMatchSet</a> that you specified in the <code>GetXssMatchSet</code> request.
     *         For more information, see the following topics:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>XssMatchSet</a>: Contains <code>Name</code>, <code>XssMatchSetId</code>, and an array of
     *         <code>XssMatchTuple</code> objects
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>XssMatchTuple</a>: Each <code>XssMatchTuple</code> object contains <code>FieldToMatch</code> and
     *         <code>TextTransformation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     *         </p>
     *         </li>
     */

    public XssMatchSet getXssMatchSet() {
        return this.xssMatchSet;
    }

    /**
     * <p>
     * Information about the <a>XssMatchSet</a> that you specified in the <code>GetXssMatchSet</code> request. For more
     * information, see the following topics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>XssMatchSet</a>: Contains <code>Name</code>, <code>XssMatchSetId</code>, and an array of
     * <code>XssMatchTuple</code> objects
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>XssMatchTuple</a>: Each <code>XssMatchTuple</code> object contains <code>FieldToMatch</code> and
     * <code>TextTransformation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param xssMatchSet
     *        Information about the <a>XssMatchSet</a> that you specified in the <code>GetXssMatchSet</code> request.
     *        For more information, see the following topics:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a>XssMatchSet</a>: Contains <code>Name</code>, <code>XssMatchSetId</code>, and an array of
     *        <code>XssMatchTuple</code> objects
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>XssMatchTuple</a>: Each <code>XssMatchTuple</code> object contains <code>FieldToMatch</code> and
     *        <code>TextTransformation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetXssMatchSetResult withXssMatchSet(XssMatchSet xssMatchSet) {
        setXssMatchSet(xssMatchSet);
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
        if (getXssMatchSet() != null)
            sb.append("XssMatchSet: ").append(getXssMatchSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetXssMatchSetResult == false)
            return false;
        GetXssMatchSetResult other = (GetXssMatchSetResult) obj;
        if (other.getXssMatchSet() == null ^ this.getXssMatchSet() == null)
            return false;
        if (other.getXssMatchSet() != null && other.getXssMatchSet().equals(this.getXssMatchSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getXssMatchSet() == null) ? 0 : getXssMatchSet().hashCode());
        return hashCode;
    }

    @Override
    public GetXssMatchSetResult clone() {
        try {
            return (GetXssMatchSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
