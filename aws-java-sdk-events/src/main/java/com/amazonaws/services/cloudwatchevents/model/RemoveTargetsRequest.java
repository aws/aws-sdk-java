/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <a>RemoveTargets</a> operation.
 * </p>
 */
public class RemoveTargetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the rule you want to remove targets from.
     * </p>
     */
    private String rule;
    /**
     * <p>
     * The list of target IDs to remove from the rule.
     * </p>
     */
    private java.util.List<String> ids;

    /**
     * <p>
     * The name of the rule you want to remove targets from.
     * </p>
     * 
     * @param rule
     *        The name of the rule you want to remove targets from.
     */

    public void setRule(String rule) {
        this.rule = rule;
    }

    /**
     * <p>
     * The name of the rule you want to remove targets from.
     * </p>
     * 
     * @return The name of the rule you want to remove targets from.
     */

    public String getRule() {
        return this.rule;
    }

    /**
     * <p>
     * The name of the rule you want to remove targets from.
     * </p>
     * 
     * @param rule
     *        The name of the rule you want to remove targets from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTargetsRequest withRule(String rule) {
        setRule(rule);
        return this;
    }

    /**
     * <p>
     * The list of target IDs to remove from the rule.
     * </p>
     * 
     * @return The list of target IDs to remove from the rule.
     */

    public java.util.List<String> getIds() {
        return ids;
    }

    /**
     * <p>
     * The list of target IDs to remove from the rule.
     * </p>
     * 
     * @param ids
     *        The list of target IDs to remove from the rule.
     */

    public void setIds(java.util.Collection<String> ids) {
        if (ids == null) {
            this.ids = null;
            return;
        }

        this.ids = new java.util.ArrayList<String>(ids);
    }

    /**
     * <p>
     * The list of target IDs to remove from the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIds(java.util.Collection)} or {@link #withIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ids
     *        The list of target IDs to remove from the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTargetsRequest withIds(String... ids) {
        if (this.ids == null) {
            setIds(new java.util.ArrayList<String>(ids.length));
        }
        for (String ele : ids) {
            this.ids.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of target IDs to remove from the rule.
     * </p>
     * 
     * @param ids
     *        The list of target IDs to remove from the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTargetsRequest withIds(java.util.Collection<String> ids) {
        setIds(ids);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRule() != null)
            sb.append("Rule: " + getRule() + ",");
        if (getIds() != null)
            sb.append("Ids: " + getIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveTargetsRequest == false)
            return false;
        RemoveTargetsRequest other = (RemoveTargetsRequest) obj;
        if (other.getRule() == null ^ this.getRule() == null)
            return false;
        if (other.getRule() != null && other.getRule().equals(this.getRule()) == false)
            return false;
        if (other.getIds() == null ^ this.getIds() == null)
            return false;
        if (other.getIds() != null && other.getIds().equals(this.getIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRule() == null) ? 0 : getRule().hashCode());
        hashCode = prime * hashCode + ((getIds() == null) ? 0 : getIds().hashCode());
        return hashCode;
    }

    @Override
    public RemoveTargetsRequest clone() {
        return (RemoveTargetsRequest) super.clone();
    }
}
