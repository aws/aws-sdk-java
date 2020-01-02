/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListAvailableManagedRuleGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAvailableManagedRuleGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, AWS WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     */
    private String nextMarker;
    /** <p/> */
    private java.util.List<ManagedRuleGroupSummary> managedRuleGroups;

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, AWS WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     * 
     * @param nextMarker
     *        When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are
     *        still available for retrieval exceeds the limit, AWS WAF returns a <code>NextMarker</code> value in the
     *        response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     *        request.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, AWS WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     * 
     * @return When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are
     *         still available for retrieval exceeds the limit, AWS WAF returns a <code>NextMarker</code> value in the
     *         response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     *         request.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, AWS WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     * 
     * @param nextMarker
     *        When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are
     *        still available for retrieval exceeds the limit, AWS WAF returns a <code>NextMarker</code> value in the
     *        response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableManagedRuleGroupsResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<ManagedRuleGroupSummary> getManagedRuleGroups() {
        return managedRuleGroups;
    }

    /**
     * <p/>
     * 
     * @param managedRuleGroups
     */

    public void setManagedRuleGroups(java.util.Collection<ManagedRuleGroupSummary> managedRuleGroups) {
        if (managedRuleGroups == null) {
            this.managedRuleGroups = null;
            return;
        }

        this.managedRuleGroups = new java.util.ArrayList<ManagedRuleGroupSummary>(managedRuleGroups);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManagedRuleGroups(java.util.Collection)} or {@link #withManagedRuleGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param managedRuleGroups
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableManagedRuleGroupsResult withManagedRuleGroups(ManagedRuleGroupSummary... managedRuleGroups) {
        if (this.managedRuleGroups == null) {
            setManagedRuleGroups(new java.util.ArrayList<ManagedRuleGroupSummary>(managedRuleGroups.length));
        }
        for (ManagedRuleGroupSummary ele : managedRuleGroups) {
            this.managedRuleGroups.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param managedRuleGroups
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableManagedRuleGroupsResult withManagedRuleGroups(java.util.Collection<ManagedRuleGroupSummary> managedRuleGroups) {
        setManagedRuleGroups(managedRuleGroups);
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
        if (getManagedRuleGroups() != null)
            sb.append("ManagedRuleGroups: ").append(getManagedRuleGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAvailableManagedRuleGroupsResult == false)
            return false;
        ListAvailableManagedRuleGroupsResult other = (ListAvailableManagedRuleGroupsResult) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getManagedRuleGroups() == null ^ this.getManagedRuleGroups() == null)
            return false;
        if (other.getManagedRuleGroups() != null && other.getManagedRuleGroups().equals(this.getManagedRuleGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getManagedRuleGroups() == null) ? 0 : getManagedRuleGroups().hashCode());
        return hashCode;
    }

    @Override
    public ListAvailableManagedRuleGroupsResult clone() {
        try {
            return (ListAvailableManagedRuleGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
