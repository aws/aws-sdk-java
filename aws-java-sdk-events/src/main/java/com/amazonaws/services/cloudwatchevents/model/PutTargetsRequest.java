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
 * Container for the parameters to the <a>PutTargets</a> operation.
 * </p>
 */
public class PutTargetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the rule you want to add targets to.
     * </p>
     */
    private String rule;
    /**
     * <p>
     * List of targets you want to update or add to the rule.
     * </p>
     */
    private java.util.List<Target> targets;

    /**
     * <p>
     * The name of the rule you want to add targets to.
     * </p>
     * 
     * @param rule
     *        The name of the rule you want to add targets to.
     */

    public void setRule(String rule) {
        this.rule = rule;
    }

    /**
     * <p>
     * The name of the rule you want to add targets to.
     * </p>
     * 
     * @return The name of the rule you want to add targets to.
     */

    public String getRule() {
        return this.rule;
    }

    /**
     * <p>
     * The name of the rule you want to add targets to.
     * </p>
     * 
     * @param rule
     *        The name of the rule you want to add targets to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutTargetsRequest withRule(String rule) {
        setRule(rule);
        return this;
    }

    /**
     * <p>
     * List of targets you want to update or add to the rule.
     * </p>
     * 
     * @return List of targets you want to update or add to the rule.
     */

    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>
     * List of targets you want to update or add to the rule.
     * </p>
     * 
     * @param targets
     *        List of targets you want to update or add to the rule.
     */

    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<Target>(targets);
    }

    /**
     * <p>
     * List of targets you want to update or add to the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        List of targets you want to update or add to the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutTargetsRequest withTargets(Target... targets) {
        if (this.targets == null) {
            setTargets(new java.util.ArrayList<Target>(targets.length));
        }
        for (Target ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of targets you want to update or add to the rule.
     * </p>
     * 
     * @param targets
     *        List of targets you want to update or add to the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutTargetsRequest withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
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
        if (getTargets() != null)
            sb.append("Targets: " + getTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutTargetsRequest == false)
            return false;
        PutTargetsRequest other = (PutTargetsRequest) obj;
        if (other.getRule() == null ^ this.getRule() == null)
            return false;
        if (other.getRule() != null && other.getRule().equals(this.getRule()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRule() == null) ? 0 : getRule().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        return hashCode;
    }

    @Override
    public PutTargetsRequest clone() {
        return (PutTargetsRequest) super.clone();
    }
}
