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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListRegexMatchSets" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRegexMatchSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If you have more <code>RegexMatchSet</code> objects than the number that you specified for <code>Limit</code> in
     * the request, the response includes a <code>NextMarker</code> value. To list more <code>RegexMatchSet</code>
     * objects, submit another <code>ListRegexMatchSets</code> request, and specify the <code>NextMarker</code> value
     * from the response in the <code>NextMarker</code> value in the next request.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * An array of <a>RegexMatchSetSummary</a> objects.
     * </p>
     */
    private java.util.List<RegexMatchSetSummary> regexMatchSets;

    /**
     * <p>
     * If you have more <code>RegexMatchSet</code> objects than the number that you specified for <code>Limit</code> in
     * the request, the response includes a <code>NextMarker</code> value. To list more <code>RegexMatchSet</code>
     * objects, submit another <code>ListRegexMatchSets</code> request, and specify the <code>NextMarker</code> value
     * from the response in the <code>NextMarker</code> value in the next request.
     * </p>
     * 
     * @param nextMarker
     *        If you have more <code>RegexMatchSet</code> objects than the number that you specified for
     *        <code>Limit</code> in the request, the response includes a <code>NextMarker</code> value. To list more
     *        <code>RegexMatchSet</code> objects, submit another <code>ListRegexMatchSets</code> request, and specify
     *        the <code>NextMarker</code> value from the response in the <code>NextMarker</code> value in the next
     *        request.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If you have more <code>RegexMatchSet</code> objects than the number that you specified for <code>Limit</code> in
     * the request, the response includes a <code>NextMarker</code> value. To list more <code>RegexMatchSet</code>
     * objects, submit another <code>ListRegexMatchSets</code> request, and specify the <code>NextMarker</code> value
     * from the response in the <code>NextMarker</code> value in the next request.
     * </p>
     * 
     * @return If you have more <code>RegexMatchSet</code> objects than the number that you specified for
     *         <code>Limit</code> in the request, the response includes a <code>NextMarker</code> value. To list more
     *         <code>RegexMatchSet</code> objects, submit another <code>ListRegexMatchSets</code> request, and specify
     *         the <code>NextMarker</code> value from the response in the <code>NextMarker</code> value in the next
     *         request.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If you have more <code>RegexMatchSet</code> objects than the number that you specified for <code>Limit</code> in
     * the request, the response includes a <code>NextMarker</code> value. To list more <code>RegexMatchSet</code>
     * objects, submit another <code>ListRegexMatchSets</code> request, and specify the <code>NextMarker</code> value
     * from the response in the <code>NextMarker</code> value in the next request.
     * </p>
     * 
     * @param nextMarker
     *        If you have more <code>RegexMatchSet</code> objects than the number that you specified for
     *        <code>Limit</code> in the request, the response includes a <code>NextMarker</code> value. To list more
     *        <code>RegexMatchSet</code> objects, submit another <code>ListRegexMatchSets</code> request, and specify
     *        the <code>NextMarker</code> value from the response in the <code>NextMarker</code> value in the next
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegexMatchSetsResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * An array of <a>RegexMatchSetSummary</a> objects.
     * </p>
     * 
     * @return An array of <a>RegexMatchSetSummary</a> objects.
     */

    public java.util.List<RegexMatchSetSummary> getRegexMatchSets() {
        return regexMatchSets;
    }

    /**
     * <p>
     * An array of <a>RegexMatchSetSummary</a> objects.
     * </p>
     * 
     * @param regexMatchSets
     *        An array of <a>RegexMatchSetSummary</a> objects.
     */

    public void setRegexMatchSets(java.util.Collection<RegexMatchSetSummary> regexMatchSets) {
        if (regexMatchSets == null) {
            this.regexMatchSets = null;
            return;
        }

        this.regexMatchSets = new java.util.ArrayList<RegexMatchSetSummary>(regexMatchSets);
    }

    /**
     * <p>
     * An array of <a>RegexMatchSetSummary</a> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegexMatchSets(java.util.Collection)} or {@link #withRegexMatchSets(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param regexMatchSets
     *        An array of <a>RegexMatchSetSummary</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegexMatchSetsResult withRegexMatchSets(RegexMatchSetSummary... regexMatchSets) {
        if (this.regexMatchSets == null) {
            setRegexMatchSets(new java.util.ArrayList<RegexMatchSetSummary>(regexMatchSets.length));
        }
        for (RegexMatchSetSummary ele : regexMatchSets) {
            this.regexMatchSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>RegexMatchSetSummary</a> objects.
     * </p>
     * 
     * @param regexMatchSets
     *        An array of <a>RegexMatchSetSummary</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegexMatchSetsResult withRegexMatchSets(java.util.Collection<RegexMatchSetSummary> regexMatchSets) {
        setRegexMatchSets(regexMatchSets);
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
        if (getRegexMatchSets() != null)
            sb.append("RegexMatchSets: ").append(getRegexMatchSets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRegexMatchSetsResult == false)
            return false;
        ListRegexMatchSetsResult other = (ListRegexMatchSetsResult) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getRegexMatchSets() == null ^ this.getRegexMatchSets() == null)
            return false;
        if (other.getRegexMatchSets() != null && other.getRegexMatchSets().equals(this.getRegexMatchSets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getRegexMatchSets() == null) ? 0 : getRegexMatchSets().hashCode());
        return hashCode;
    }

    @Override
    public ListRegexMatchSetsResult clone() {
        try {
            return (ListRegexMatchSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
