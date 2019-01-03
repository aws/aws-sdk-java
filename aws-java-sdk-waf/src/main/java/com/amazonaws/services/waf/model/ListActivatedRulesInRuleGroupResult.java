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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListActivatedRulesInRuleGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListActivatedRulesInRuleGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * If you have more <code>ActivatedRules</code> than the number that you specified for <code>Limit</code> in the
     * request, the response includes a <code>NextMarker</code> value. To list more <code>ActivatedRules</code>, submit
     * another <code>ListActivatedRulesInRuleGroup</code> request, and specify the <code>NextMarker</code> value from
     * the response in the <code>NextMarker</code> value in the next request.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * An array of <code>ActivatedRules</code> objects.
     * </p>
     */
    private java.util.List<ActivatedRule> activatedRules;

    /**
     * <p>
     * If you have more <code>ActivatedRules</code> than the number that you specified for <code>Limit</code> in the
     * request, the response includes a <code>NextMarker</code> value. To list more <code>ActivatedRules</code>, submit
     * another <code>ListActivatedRulesInRuleGroup</code> request, and specify the <code>NextMarker</code> value from
     * the response in the <code>NextMarker</code> value in the next request.
     * </p>
     * 
     * @param nextMarker
     *        If you have more <code>ActivatedRules</code> than the number that you specified for <code>Limit</code> in
     *        the request, the response includes a <code>NextMarker</code> value. To list more
     *        <code>ActivatedRules</code>, submit another <code>ListActivatedRulesInRuleGroup</code> request, and
     *        specify the <code>NextMarker</code> value from the response in the <code>NextMarker</code> value in the
     *        next request.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If you have more <code>ActivatedRules</code> than the number that you specified for <code>Limit</code> in the
     * request, the response includes a <code>NextMarker</code> value. To list more <code>ActivatedRules</code>, submit
     * another <code>ListActivatedRulesInRuleGroup</code> request, and specify the <code>NextMarker</code> value from
     * the response in the <code>NextMarker</code> value in the next request.
     * </p>
     * 
     * @return If you have more <code>ActivatedRules</code> than the number that you specified for <code>Limit</code> in
     *         the request, the response includes a <code>NextMarker</code> value. To list more
     *         <code>ActivatedRules</code>, submit another <code>ListActivatedRulesInRuleGroup</code> request, and
     *         specify the <code>NextMarker</code> value from the response in the <code>NextMarker</code> value in the
     *         next request.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If you have more <code>ActivatedRules</code> than the number that you specified for <code>Limit</code> in the
     * request, the response includes a <code>NextMarker</code> value. To list more <code>ActivatedRules</code>, submit
     * another <code>ListActivatedRulesInRuleGroup</code> request, and specify the <code>NextMarker</code> value from
     * the response in the <code>NextMarker</code> value in the next request.
     * </p>
     * 
     * @param nextMarker
     *        If you have more <code>ActivatedRules</code> than the number that you specified for <code>Limit</code> in
     *        the request, the response includes a <code>NextMarker</code> value. To list more
     *        <code>ActivatedRules</code>, submit another <code>ListActivatedRulesInRuleGroup</code> request, and
     *        specify the <code>NextMarker</code> value from the response in the <code>NextMarker</code> value in the
     *        next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListActivatedRulesInRuleGroupResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * An array of <code>ActivatedRules</code> objects.
     * </p>
     * 
     * @return An array of <code>ActivatedRules</code> objects.
     */

    public java.util.List<ActivatedRule> getActivatedRules() {
        return activatedRules;
    }

    /**
     * <p>
     * An array of <code>ActivatedRules</code> objects.
     * </p>
     * 
     * @param activatedRules
     *        An array of <code>ActivatedRules</code> objects.
     */

    public void setActivatedRules(java.util.Collection<ActivatedRule> activatedRules) {
        if (activatedRules == null) {
            this.activatedRules = null;
            return;
        }

        this.activatedRules = new java.util.ArrayList<ActivatedRule>(activatedRules);
    }

    /**
     * <p>
     * An array of <code>ActivatedRules</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActivatedRules(java.util.Collection)} or {@link #withActivatedRules(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param activatedRules
     *        An array of <code>ActivatedRules</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListActivatedRulesInRuleGroupResult withActivatedRules(ActivatedRule... activatedRules) {
        if (this.activatedRules == null) {
            setActivatedRules(new java.util.ArrayList<ActivatedRule>(activatedRules.length));
        }
        for (ActivatedRule ele : activatedRules) {
            this.activatedRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ActivatedRules</code> objects.
     * </p>
     * 
     * @param activatedRules
     *        An array of <code>ActivatedRules</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListActivatedRulesInRuleGroupResult withActivatedRules(java.util.Collection<ActivatedRule> activatedRules) {
        setActivatedRules(activatedRules);
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
        if (getActivatedRules() != null)
            sb.append("ActivatedRules: ").append(getActivatedRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListActivatedRulesInRuleGroupResult == false)
            return false;
        ListActivatedRulesInRuleGroupResult other = (ListActivatedRulesInRuleGroupResult) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getActivatedRules() == null ^ this.getActivatedRules() == null)
            return false;
        if (other.getActivatedRules() != null && other.getActivatedRules().equals(this.getActivatedRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getActivatedRules() == null) ? 0 : getActivatedRules().hashCode());
        return hashCode;
    }

    @Override
    public ListActivatedRulesInRuleGroupResult clone() {
        try {
            return (ListActivatedRulesInRuleGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
