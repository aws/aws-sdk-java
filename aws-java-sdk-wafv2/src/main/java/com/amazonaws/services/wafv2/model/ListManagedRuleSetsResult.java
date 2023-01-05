/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListManagedRuleSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListManagedRuleSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * Your managed rule sets.
     * </p>
     */
    private java.util.List<ManagedRuleSetSummary> managedRuleSets;

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     * 
     * @param nextMarker
     *        When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are
     *        still available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the
     *        response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     *        request.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     * 
     * @return When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are
     *         still available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the
     *         response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     *         request.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     * 
     * @param nextMarker
     *        When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are
     *        still available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the
     *        response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListManagedRuleSetsResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * Your managed rule sets.
     * </p>
     * 
     * @return Your managed rule sets.
     */

    public java.util.List<ManagedRuleSetSummary> getManagedRuleSets() {
        return managedRuleSets;
    }

    /**
     * <p>
     * Your managed rule sets.
     * </p>
     * 
     * @param managedRuleSets
     *        Your managed rule sets.
     */

    public void setManagedRuleSets(java.util.Collection<ManagedRuleSetSummary> managedRuleSets) {
        if (managedRuleSets == null) {
            this.managedRuleSets = null;
            return;
        }

        this.managedRuleSets = new java.util.ArrayList<ManagedRuleSetSummary>(managedRuleSets);
    }

    /**
     * <p>
     * Your managed rule sets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManagedRuleSets(java.util.Collection)} or {@link #withManagedRuleSets(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param managedRuleSets
     *        Your managed rule sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListManagedRuleSetsResult withManagedRuleSets(ManagedRuleSetSummary... managedRuleSets) {
        if (this.managedRuleSets == null) {
            setManagedRuleSets(new java.util.ArrayList<ManagedRuleSetSummary>(managedRuleSets.length));
        }
        for (ManagedRuleSetSummary ele : managedRuleSets) {
            this.managedRuleSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Your managed rule sets.
     * </p>
     * 
     * @param managedRuleSets
     *        Your managed rule sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListManagedRuleSetsResult withManagedRuleSets(java.util.Collection<ManagedRuleSetSummary> managedRuleSets) {
        setManagedRuleSets(managedRuleSets);
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
        if (getManagedRuleSets() != null)
            sb.append("ManagedRuleSets: ").append(getManagedRuleSets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListManagedRuleSetsResult == false)
            return false;
        ListManagedRuleSetsResult other = (ListManagedRuleSetsResult) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getManagedRuleSets() == null ^ this.getManagedRuleSets() == null)
            return false;
        if (other.getManagedRuleSets() != null && other.getManagedRuleSets().equals(this.getManagedRuleSets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getManagedRuleSets() == null) ? 0 : getManagedRuleSets().hashCode());
        return hashCode;
    }

    @Override
    public ListManagedRuleSetsResult clone() {
        try {
            return (ListManagedRuleSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
