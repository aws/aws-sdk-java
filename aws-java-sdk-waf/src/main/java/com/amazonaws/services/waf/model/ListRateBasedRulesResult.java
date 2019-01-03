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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListRateBasedRules" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRateBasedRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If you have more <code>Rules</code> than the number that you specified for <code>Limit</code> in the request, the
     * response includes a <code>NextMarker</code> value. To list more <code>Rules</code>, submit another
     * <code>ListRateBasedRules</code> request, and specify the <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * An array of <a>RuleSummary</a> objects.
     * </p>
     */
    private java.util.List<RuleSummary> rules;

    /**
     * <p>
     * If you have more <code>Rules</code> than the number that you specified for <code>Limit</code> in the request, the
     * response includes a <code>NextMarker</code> value. To list more <code>Rules</code>, submit another
     * <code>ListRateBasedRules</code> request, and specify the <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * 
     * @param nextMarker
     *        If you have more <code>Rules</code> than the number that you specified for <code>Limit</code> in the
     *        request, the response includes a <code>NextMarker</code> value. To list more <code>Rules</code>, submit
     *        another <code>ListRateBasedRules</code> request, and specify the <code>NextMarker</code> value from the
     *        response in the <code>NextMarker</code> value in the next request.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If you have more <code>Rules</code> than the number that you specified for <code>Limit</code> in the request, the
     * response includes a <code>NextMarker</code> value. To list more <code>Rules</code>, submit another
     * <code>ListRateBasedRules</code> request, and specify the <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * 
     * @return If you have more <code>Rules</code> than the number that you specified for <code>Limit</code> in the
     *         request, the response includes a <code>NextMarker</code> value. To list more <code>Rules</code>, submit
     *         another <code>ListRateBasedRules</code> request, and specify the <code>NextMarker</code> value from the
     *         response in the <code>NextMarker</code> value in the next request.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If you have more <code>Rules</code> than the number that you specified for <code>Limit</code> in the request, the
     * response includes a <code>NextMarker</code> value. To list more <code>Rules</code>, submit another
     * <code>ListRateBasedRules</code> request, and specify the <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * 
     * @param nextMarker
     *        If you have more <code>Rules</code> than the number that you specified for <code>Limit</code> in the
     *        request, the response includes a <code>NextMarker</code> value. To list more <code>Rules</code>, submit
     *        another <code>ListRateBasedRules</code> request, and specify the <code>NextMarker</code> value from the
     *        response in the <code>NextMarker</code> value in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRateBasedRulesResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * An array of <a>RuleSummary</a> objects.
     * </p>
     * 
     * @return An array of <a>RuleSummary</a> objects.
     */

    public java.util.List<RuleSummary> getRules() {
        return rules;
    }

    /**
     * <p>
     * An array of <a>RuleSummary</a> objects.
     * </p>
     * 
     * @param rules
     *        An array of <a>RuleSummary</a> objects.
     */

    public void setRules(java.util.Collection<RuleSummary> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<RuleSummary>(rules);
    }

    /**
     * <p>
     * An array of <a>RuleSummary</a> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        An array of <a>RuleSummary</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRateBasedRulesResult withRules(RuleSummary... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<RuleSummary>(rules.length));
        }
        for (RuleSummary ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>RuleSummary</a> objects.
     * </p>
     * 
     * @param rules
     *        An array of <a>RuleSummary</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRateBasedRulesResult withRules(java.util.Collection<RuleSummary> rules) {
        setRules(rules);
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
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRateBasedRulesResult == false)
            return false;
        ListRateBasedRulesResult other = (ListRateBasedRulesResult) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public ListRateBasedRulesResult clone() {
        try {
            return (ListRateBasedRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
