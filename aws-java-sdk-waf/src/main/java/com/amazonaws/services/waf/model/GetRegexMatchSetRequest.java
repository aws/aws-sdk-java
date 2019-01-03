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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRegexMatchSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRegexMatchSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a> that you want to get. <code>RegexMatchSetId</code>
     * is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * </p>
     */
    private String regexMatchSetId;

    /**
     * <p>
     * The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a> that you want to get. <code>RegexMatchSetId</code>
     * is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * </p>
     * 
     * @param regexMatchSetId
     *        The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a> that you want to get.
     *        <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     */

    public void setRegexMatchSetId(String regexMatchSetId) {
        this.regexMatchSetId = regexMatchSetId;
    }

    /**
     * <p>
     * The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a> that you want to get. <code>RegexMatchSetId</code>
     * is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * </p>
     * 
     * @return The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a> that you want to get.
     *         <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     */

    public String getRegexMatchSetId() {
        return this.regexMatchSetId;
    }

    /**
     * <p>
     * The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a> that you want to get. <code>RegexMatchSetId</code>
     * is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * </p>
     * 
     * @param regexMatchSetId
     *        The <code>RegexMatchSetId</code> of the <a>RegexMatchSet</a> that you want to get.
     *        <code>RegexMatchSetId</code> is returned by <a>CreateRegexMatchSet</a> and by <a>ListRegexMatchSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRegexMatchSetRequest withRegexMatchSetId(String regexMatchSetId) {
        setRegexMatchSetId(regexMatchSetId);
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
        if (getRegexMatchSetId() != null)
            sb.append("RegexMatchSetId: ").append(getRegexMatchSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRegexMatchSetRequest == false)
            return false;
        GetRegexMatchSetRequest other = (GetRegexMatchSetRequest) obj;
        if (other.getRegexMatchSetId() == null ^ this.getRegexMatchSetId() == null)
            return false;
        if (other.getRegexMatchSetId() != null && other.getRegexMatchSetId().equals(this.getRegexMatchSetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegexMatchSetId() == null) ? 0 : getRegexMatchSetId().hashCode());
        return hashCode;
    }

    @Override
    public GetRegexMatchSetRequest clone() {
        return (GetRegexMatchSetRequest) super.clone();
    }

}
