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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a <code>Predicate</code> (such as an <code>IPSet</code>) and indicates whether you want to add it to a
 * <code>Rule</code> or delete it from a <code>Rule</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/RuleUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleUpdate implements Serializable, Cloneable, StructuredPojo {

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
        withAction(action);
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
        this.action = action.toString();
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getPredicate() != null)
            sb.append("Predicate: ").append(getPredicate());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.RuleUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
