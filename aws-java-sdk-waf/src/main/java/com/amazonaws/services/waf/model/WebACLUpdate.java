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
 * Specifies whether to insert a <code>Rule</code> into or delete a <code>Rule</code> from a <code>WebACL</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/WebACLUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WebACLUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether to insert a <code>Rule</code> into or delete a <code>Rule</code> from a <code>WebACL</code>.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The <code>ActivatedRule</code> object in an <a>UpdateWebACL</a> request specifies a <code>Rule</code> that you
     * want to insert or delete, the priority of the <code>Rule</code> in the <code>WebACL</code>, and the action that
     * you want AWS WAF to take when a web request matches the <code>Rule</code> (<code>ALLOW</code>, <code>BLOCK</code>
     * , or <code>COUNT</code>).
     * </p>
     */
    private ActivatedRule activatedRule;

    /**
     * <p>
     * Specifies whether to insert a <code>Rule</code> into or delete a <code>Rule</code> from a <code>WebACL</code>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert a <code>Rule</code> into or delete a <code>Rule</code> from a
     *        <code>WebACL</code>.
     * @see ChangeAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies whether to insert a <code>Rule</code> into or delete a <code>Rule</code> from a <code>WebACL</code>.
     * </p>
     * 
     * @return Specifies whether to insert a <code>Rule</code> into or delete a <code>Rule</code> from a
     *         <code>WebACL</code>.
     * @see ChangeAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies whether to insert a <code>Rule</code> into or delete a <code>Rule</code> from a <code>WebACL</code>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert a <code>Rule</code> into or delete a <code>Rule</code> from a
     *        <code>WebACL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public WebACLUpdate withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies whether to insert a <code>Rule</code> into or delete a <code>Rule</code> from a <code>WebACL</code>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert a <code>Rule</code> into or delete a <code>Rule</code> from a
     *        <code>WebACL</code>.
     * @see ChangeAction
     */

    public void setAction(ChangeAction action) {
        withAction(action);
    }

    /**
     * <p>
     * Specifies whether to insert a <code>Rule</code> into or delete a <code>Rule</code> from a <code>WebACL</code>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert a <code>Rule</code> into or delete a <code>Rule</code> from a
     *        <code>WebACL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public WebACLUpdate withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The <code>ActivatedRule</code> object in an <a>UpdateWebACL</a> request specifies a <code>Rule</code> that you
     * want to insert or delete, the priority of the <code>Rule</code> in the <code>WebACL</code>, and the action that
     * you want AWS WAF to take when a web request matches the <code>Rule</code> (<code>ALLOW</code>, <code>BLOCK</code>
     * , or <code>COUNT</code>).
     * </p>
     * 
     * @param activatedRule
     *        The <code>ActivatedRule</code> object in an <a>UpdateWebACL</a> request specifies a <code>Rule</code> that
     *        you want to insert or delete, the priority of the <code>Rule</code> in the <code>WebACL</code>, and the
     *        action that you want AWS WAF to take when a web request matches the <code>Rule</code> (<code>ALLOW</code>,
     *        <code>BLOCK</code>, or <code>COUNT</code>).
     */

    public void setActivatedRule(ActivatedRule activatedRule) {
        this.activatedRule = activatedRule;
    }

    /**
     * <p>
     * The <code>ActivatedRule</code> object in an <a>UpdateWebACL</a> request specifies a <code>Rule</code> that you
     * want to insert or delete, the priority of the <code>Rule</code> in the <code>WebACL</code>, and the action that
     * you want AWS WAF to take when a web request matches the <code>Rule</code> (<code>ALLOW</code>, <code>BLOCK</code>
     * , or <code>COUNT</code>).
     * </p>
     * 
     * @return The <code>ActivatedRule</code> object in an <a>UpdateWebACL</a> request specifies a <code>Rule</code>
     *         that you want to insert or delete, the priority of the <code>Rule</code> in the <code>WebACL</code>, and
     *         the action that you want AWS WAF to take when a web request matches the <code>Rule</code> (
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>).
     */

    public ActivatedRule getActivatedRule() {
        return this.activatedRule;
    }

    /**
     * <p>
     * The <code>ActivatedRule</code> object in an <a>UpdateWebACL</a> request specifies a <code>Rule</code> that you
     * want to insert or delete, the priority of the <code>Rule</code> in the <code>WebACL</code>, and the action that
     * you want AWS WAF to take when a web request matches the <code>Rule</code> (<code>ALLOW</code>, <code>BLOCK</code>
     * , or <code>COUNT</code>).
     * </p>
     * 
     * @param activatedRule
     *        The <code>ActivatedRule</code> object in an <a>UpdateWebACL</a> request specifies a <code>Rule</code> that
     *        you want to insert or delete, the priority of the <code>Rule</code> in the <code>WebACL</code>, and the
     *        action that you want AWS WAF to take when a web request matches the <code>Rule</code> (<code>ALLOW</code>,
     *        <code>BLOCK</code>, or <code>COUNT</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebACLUpdate withActivatedRule(ActivatedRule activatedRule) {
        setActivatedRule(activatedRule);
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
        if (getActivatedRule() != null)
            sb.append("ActivatedRule: ").append(getActivatedRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebACLUpdate == false)
            return false;
        WebACLUpdate other = (WebACLUpdate) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getActivatedRule() == null ^ this.getActivatedRule() == null)
            return false;
        if (other.getActivatedRule() != null && other.getActivatedRule().equals(this.getActivatedRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getActivatedRule() == null) ? 0 : getActivatedRule().hashCode());
        return hashCode;
    }

    @Override
    public WebACLUpdate clone() {
        try {
            return (WebACLUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.WebACLUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
