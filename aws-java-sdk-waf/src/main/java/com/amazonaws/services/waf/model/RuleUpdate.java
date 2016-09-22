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
package com.amazonaws.services.waf.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies a <code>Predicate</code> (such as an <code>IPSet</code>) and indicates whether you want to add it to a
 * <code>Rule</code> or delete it from a <code>Rule</code>.
 * </p>
 */
public class RuleUpdate implements Serializable, Cloneable {

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <code>Predicate</code> to a <code>Rule</code>. Use <code>DELETE</code> to
     * remove a <code>Predicate</code> from a <code>Rule</code>.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The ID of the <code>Predicate</code> (such as an <code>IPSet</code>) that you want to add to a <code>Rule</code>.
     * </p>
     */
    private Predicate predicate;

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <code>Predicate</code> to a <code>Rule</code>. Use <code>DELETE</code> to
     * remove a <code>Predicate</code> from a <code>Rule</code>.
     * </p>
     * 
     * @param action
     *        Specify <code>INSERT</code> to add a <code>Predicate</code> to a <code>Rule</code>. Use
     *        <code>DELETE</code> to remove a <code>Predicate</code> from a <code>Rule</code>.
     * @see ChangeAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <code>Predicate</code> to a <code>Rule</code>. Use <code>DELETE</code> to
     * remove a <code>Predicate</code> from a <code>Rule</code>.
     * </p>
     * 
     * @return Specify <code>INSERT</code> to add a <code>Predicate</code> to a <code>Rule</code>. Use
     *         <code>DELETE</code> to remove a <code>Predicate</code> from a <code>Rule</code>.
     * @see ChangeAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <code>Predicate</code> to a <code>Rule</code>. Use <code>DELETE</code> to
     * remove a <code>Predicate</code> from a <code>Rule</code>.
     * </p>
     * 
     * @param action
     *        Specify <code>INSERT</code> to add a <code>Predicate</code> to a <code>Rule</code>. Use
     *        <code>DELETE</code> to remove a <code>Predicate</code> from a <code>Rule</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public RuleUpdate withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <code>Predicate</code> to a <code>Rule</code>. Use <code>DELETE</code> to
     * remove a <code>Predicate</code> from a <code>Rule</code>.
     * </p>
     * 
     * @param action
     *        Specify <code>INSERT</code> to add a <code>Predicate</code> to a <code>Rule</code>. Use
     *        <code>DELETE</code> to remove a <code>Predicate</code> from a <code>Rule</code>.
     * @see ChangeAction
     */

    public void setAction(ChangeAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * Specify <code>INSERT</code> to add a <code>Predicate</code> to a <code>Rule</code>. Use <code>DELETE</code> to
     * remove a <code>Predicate</code> from a <code>Rule</code>.
     * </p>
     * 
     * @param action
     *        Specify <code>INSERT</code> to add a <code>Predicate</code> to a <code>Rule</code>. Use
     *        <code>DELETE</code> to remove a <code>Predicate</code> from a <code>Rule</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public RuleUpdate withAction(ChangeAction action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>Predicate</code> (such as an <code>IPSet</code>) that you want to add to a <code>Rule</code>.
     * </p>
     * 
     * @param predicate
     *        The ID of the <code>Predicate</code> (such as an <code>IPSet</code>) that you want to add to a
     *        <code>Rule</code>.
     */

    public void setPredicate(Predicate predicate) {
        this.predicate = predicate;
    }

    /**
     * <p>
     * The ID of the <code>Predicate</code> (such as an <code>IPSet</code>) that you want to add to a <code>Rule</code>.
     * </p>
     * 
     * @return The ID of the <code>Predicate</code> (such as an <code>IPSet</code>) that you want to add to a
     *         <code>Rule</code>.
     */

    public Predicate getPredicate() {
        return this.predicate;
    }

    /**
     * <p>
     * The ID of the <code>Predicate</code> (such as an <code>IPSet</code>) that you want to add to a <code>Rule</code>.
     * </p>
     * 
     * @param predicate
     *        The ID of the <code>Predicate</code> (such as an <code>IPSet</code>) that you want to add to a
     *        <code>Rule</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleUpdate withPredicate(Predicate predicate) {
        setPredicate(predicate);
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
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getPredicate() != null)
            sb.append("Predicate: " + getPredicate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleUpdate == false)
            return false;
        RuleUpdate other = (RuleUpdate) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getPredicate() == null ^ this.getPredicate() == null)
            return false;
        if (other.getPredicate() != null && other.getPredicate().equals(this.getPredicate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getPredicate() == null) ? 0 : getPredicate().hashCode());
        return hashCode;
    }

    @Override
    public RuleUpdate clone() {
        try {
            return (RuleUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
