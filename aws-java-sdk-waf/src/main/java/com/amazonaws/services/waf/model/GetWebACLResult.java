/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.waf.model;

import java.io.Serializable;

/**
 * 
 */
public class GetWebACLResult implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the <a>WebACL</a> that you specified in the
     * <code>GetWebACL</code> request. For more information, see the following
     * topics:
     * </p>
     * <ul>
     * <li><a>WebACL</a>: Contains <code>DefaultAction</code>,
     * <code>MetricName</code>, <code>Name</code>, an array of <code>Rule</code>
     * objects, and <code>WebACLId</code></li>
     * <li><code>DefaultAction</code> (Data type is <a>WafAction</a>): Contains
     * <code>Type</code></li>
     * <li><code>Rules</code>: Contains an array of <code>ActivatedRule</code>
     * objects, which contain <code>Action</code>, <code>Priority</code>, and
     * <code>RuleId</code></li>
     * <li><code>Action</code>: Contains <code>Type</code></li>
     * </ul>
     */
    private WebACL webACL;

    /**
     * <p>
     * Information about the <a>WebACL</a> that you specified in the
     * <code>GetWebACL</code> request. For more information, see the following
     * topics:
     * </p>
     * <ul>
     * <li><a>WebACL</a>: Contains <code>DefaultAction</code>,
     * <code>MetricName</code>, <code>Name</code>, an array of <code>Rule</code>
     * objects, and <code>WebACLId</code></li>
     * <li><code>DefaultAction</code> (Data type is <a>WafAction</a>): Contains
     * <code>Type</code></li>
     * <li><code>Rules</code>: Contains an array of <code>ActivatedRule</code>
     * objects, which contain <code>Action</code>, <code>Priority</code>, and
     * <code>RuleId</code></li>
     * <li><code>Action</code>: Contains <code>Type</code></li>
     * </ul>
     * 
     * @param webACL
     *        Information about the <a>WebACL</a> that you specified in the
     *        <code>GetWebACL</code> request. For more information, see the
     *        following topics:</p>
     *        <ul>
     *        <li><a>WebACL</a>: Contains <code>DefaultAction</code>,
     *        <code>MetricName</code>, <code>Name</code>, an array of
     *        <code>Rule</code> objects, and <code>WebACLId</code></li>
     *        <li><code>DefaultAction</code> (Data type is <a>WafAction</a>):
     *        Contains <code>Type</code></li>
     *        <li><code>Rules</code>: Contains an array of
     *        <code>ActivatedRule</code> objects, which contain
     *        <code>Action</code>, <code>Priority</code>, and
     *        <code>RuleId</code></li>
     *        <li><code>Action</code>: Contains <code>Type</code></li>
     */
    public void setWebACL(WebACL webACL) {
        this.webACL = webACL;
    }

    /**
     * <p>
     * Information about the <a>WebACL</a> that you specified in the
     * <code>GetWebACL</code> request. For more information, see the following
     * topics:
     * </p>
     * <ul>
     * <li><a>WebACL</a>: Contains <code>DefaultAction</code>,
     * <code>MetricName</code>, <code>Name</code>, an array of <code>Rule</code>
     * objects, and <code>WebACLId</code></li>
     * <li><code>DefaultAction</code> (Data type is <a>WafAction</a>): Contains
     * <code>Type</code></li>
     * <li><code>Rules</code>: Contains an array of <code>ActivatedRule</code>
     * objects, which contain <code>Action</code>, <code>Priority</code>, and
     * <code>RuleId</code></li>
     * <li><code>Action</code>: Contains <code>Type</code></li>
     * </ul>
     * 
     * @return Information about the <a>WebACL</a> that you specified in the
     *         <code>GetWebACL</code> request. For more information, see the
     *         following topics:</p>
     *         <ul>
     *         <li><a>WebACL</a>: Contains <code>DefaultAction</code>,
     *         <code>MetricName</code>, <code>Name</code>, an array of
     *         <code>Rule</code> objects, and <code>WebACLId</code></li>
     *         <li><code>DefaultAction</code> (Data type is <a>WafAction</a>):
     *         Contains <code>Type</code></li>
     *         <li><code>Rules</code>: Contains an array of
     *         <code>ActivatedRule</code> objects, which contain
     *         <code>Action</code>, <code>Priority</code>, and
     *         <code>RuleId</code></li>
     *         <li><code>Action</code>: Contains <code>Type</code></li>
     */
    public WebACL getWebACL() {
        return this.webACL;
    }

    /**
     * <p>
     * Information about the <a>WebACL</a> that you specified in the
     * <code>GetWebACL</code> request. For more information, see the following
     * topics:
     * </p>
     * <ul>
     * <li><a>WebACL</a>: Contains <code>DefaultAction</code>,
     * <code>MetricName</code>, <code>Name</code>, an array of <code>Rule</code>
     * objects, and <code>WebACLId</code></li>
     * <li><code>DefaultAction</code> (Data type is <a>WafAction</a>): Contains
     * <code>Type</code></li>
     * <li><code>Rules</code>: Contains an array of <code>ActivatedRule</code>
     * objects, which contain <code>Action</code>, <code>Priority</code>, and
     * <code>RuleId</code></li>
     * <li><code>Action</code>: Contains <code>Type</code></li>
     * </ul>
     * 
     * @param webACL
     *        Information about the <a>WebACL</a> that you specified in the
     *        <code>GetWebACL</code> request. For more information, see the
     *        following topics:</p>
     *        <ul>
     *        <li><a>WebACL</a>: Contains <code>DefaultAction</code>,
     *        <code>MetricName</code>, <code>Name</code>, an array of
     *        <code>Rule</code> objects, and <code>WebACLId</code></li>
     *        <li><code>DefaultAction</code> (Data type is <a>WafAction</a>):
     *        Contains <code>Type</code></li>
     *        <li><code>Rules</code>: Contains an array of
     *        <code>ActivatedRule</code> objects, which contain
     *        <code>Action</code>, <code>Priority</code>, and
     *        <code>RuleId</code></li>
     *        <li><code>Action</code>: Contains <code>Type</code></li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetWebACLResult withWebACL(WebACL webACL) {
        setWebACL(webACL);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWebACL() != null)
            sb.append("WebACL: " + getWebACL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWebACLResult == false)
            return false;
        GetWebACLResult other = (GetWebACLResult) obj;
        if (other.getWebACL() == null ^ this.getWebACL() == null)
            return false;
        if (other.getWebACL() != null
                && other.getWebACL().equals(this.getWebACL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getWebACL() == null) ? 0 : getWebACL().hashCode());
        return hashCode;
    }

    @Override
    public GetWebACLResult clone() {
        try {
            return (GetWebACLResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}