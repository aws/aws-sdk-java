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
 * The response to a <a>ListXssMatchSets</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListXssMatchSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListXssMatchSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If you have more <a>XssMatchSet</a> objects than the number that you specified for <code>Limit</code> in the
     * request, the response includes a <code>NextMarker</code> value. To list more <code>XssMatchSet</code> objects,
     * submit another <code>ListXssMatchSets</code> request, and specify the <code>NextMarker</code> value from the
     * response in the <code>NextMarker</code> value in the next request.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * An array of <a>XssMatchSetSummary</a> objects.
     * </p>
     */
    private java.util.List<XssMatchSetSummary> xssMatchSets;

    /**
     * <p>
     * If you have more <a>XssMatchSet</a> objects than the number that you specified for <code>Limit</code> in the
     * request, the response includes a <code>NextMarker</code> value. To list more <code>XssMatchSet</code> objects,
     * submit another <code>ListXssMatchSets</code> request, and specify the <code>NextMarker</code> value from the
     * response in the <code>NextMarker</code> value in the next request.
     * </p>
     * 
     * @param nextMarker
     *        If you have more <a>XssMatchSet</a> objects than the number that you specified for <code>Limit</code> in
     *        the request, the response includes a <code>NextMarker</code> value. To list more <code>XssMatchSet</code>
     *        objects, submit another <code>ListXssMatchSets</code> request, and specify the <code>NextMarker</code>
     *        value from the response in the <code>NextMarker</code> value in the next request.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If you have more <a>XssMatchSet</a> objects than the number that you specified for <code>Limit</code> in the
     * request, the response includes a <code>NextMarker</code> value. To list more <code>XssMatchSet</code> objects,
     * submit another <code>ListXssMatchSets</code> request, and specify the <code>NextMarker</code> value from the
     * response in the <code>NextMarker</code> value in the next request.
     * </p>
     * 
     * @return If you have more <a>XssMatchSet</a> objects than the number that you specified for <code>Limit</code> in
     *         the request, the response includes a <code>NextMarker</code> value. To list more <code>XssMatchSet</code>
     *         objects, submit another <code>ListXssMatchSets</code> request, and specify the <code>NextMarker</code>
     *         value from the response in the <code>NextMarker</code> value in the next request.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If you have more <a>XssMatchSet</a> objects than the number that you specified for <code>Limit</code> in the
     * request, the response includes a <code>NextMarker</code> value. To list more <code>XssMatchSet</code> objects,
     * submit another <code>ListXssMatchSets</code> request, and specify the <code>NextMarker</code> value from the
     * response in the <code>NextMarker</code> value in the next request.
     * </p>
     * 
     * @param nextMarker
     *        If you have more <a>XssMatchSet</a> objects than the number that you specified for <code>Limit</code> in
     *        the request, the response includes a <code>NextMarker</code> value. To list more <code>XssMatchSet</code>
     *        objects, submit another <code>ListXssMatchSets</code> request, and specify the <code>NextMarker</code>
     *        value from the response in the <code>NextMarker</code> value in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListXssMatchSetsResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * An array of <a>XssMatchSetSummary</a> objects.
     * </p>
     * 
     * @return An array of <a>XssMatchSetSummary</a> objects.
     */

    public java.util.List<XssMatchSetSummary> getXssMatchSets() {
        return xssMatchSets;
    }

    /**
     * <p>
     * An array of <a>XssMatchSetSummary</a> objects.
     * </p>
     * 
     * @param xssMatchSets
     *        An array of <a>XssMatchSetSummary</a> objects.
     */

    public void setXssMatchSets(java.util.Collection<XssMatchSetSummary> xssMatchSets) {
        if (xssMatchSets == null) {
            this.xssMatchSets = null;
            return;
        }

        this.xssMatchSets = new java.util.ArrayList<XssMatchSetSummary>(xssMatchSets);
    }

    /**
     * <p>
     * An array of <a>XssMatchSetSummary</a> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setXssMatchSets(java.util.Collection)} or {@link #withXssMatchSets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param xssMatchSets
     *        An array of <a>XssMatchSetSummary</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListXssMatchSetsResult withXssMatchSets(XssMatchSetSummary... xssMatchSets) {
        if (this.xssMatchSets == null) {
            setXssMatchSets(new java.util.ArrayList<XssMatchSetSummary>(xssMatchSets.length));
        }
        for (XssMatchSetSummary ele : xssMatchSets) {
            this.xssMatchSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>XssMatchSetSummary</a> objects.
     * </p>
     * 
     * @param xssMatchSets
     *        An array of <a>XssMatchSetSummary</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListXssMatchSetsResult withXssMatchSets(java.util.Collection<XssMatchSetSummary> xssMatchSets) {
        setXssMatchSets(xssMatchSets);
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
        if (getXssMatchSets() != null)
            sb.append("XssMatchSets: ").append(getXssMatchSets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListXssMatchSetsResult == false)
            return false;
        ListXssMatchSetsResult other = (ListXssMatchSetsResult) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getXssMatchSets() == null ^ this.getXssMatchSets() == null)
            return false;
        if (other.getXssMatchSets() != null && other.getXssMatchSets().equals(this.getXssMatchSets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getXssMatchSets() == null) ? 0 : getXssMatchSets().hashCode());
        return hashCode;
    }

    @Override
    public ListXssMatchSetsResult clone() {
        try {
            return (ListXssMatchSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
