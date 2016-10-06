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
 * For the action that is associated with a rule in a <code>WebACL</code>, specifies the action that you want AWS WAF to
 * perform when a web request matches all of the conditions in a rule. For the default action in a <code>WebACL</code>,
 * specifies the action that you want AWS WAF to take when a web request doesn't match all of the conditions in any of
 * the rules in a <code>WebACL</code>.
 * </p>
 */
public class WafAction implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies how you want AWS WAF to respond to requests that match the settings in a <code>Rule</code>. Valid
     * settings include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code>: AWS WAF allows requests
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code>: AWS WAF blocks requests
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code>: AWS WAF increments a counter of the requests that match all of the conditions in the rule.
     * AWS WAF then continues to inspect the web request based on the remaining rules in the web ACL. You can't specify
     * <code>COUNT</code> for the default action for a <code>WebACL</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String type;

    /**
     * <p>
     * Specifies how you want AWS WAF to respond to requests that match the settings in a <code>Rule</code>. Valid
     * settings include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code>: AWS WAF allows requests
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code>: AWS WAF blocks requests
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code>: AWS WAF increments a counter of the requests that match all of the conditions in the rule.
     * AWS WAF then continues to inspect the web request based on the remaining rules in the web ACL. You can't specify
     * <code>COUNT</code> for the default action for a <code>WebACL</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Specifies how you want AWS WAF to respond to requests that match the settings in a <code>Rule</code>.
     *        Valid settings include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALLOW</code>: AWS WAF allows requests
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BLOCK</code>: AWS WAF blocks requests
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COUNT</code>: AWS WAF increments a counter of the requests that match all of the conditions in the
     *        rule. AWS WAF then continues to inspect the web request based on the remaining rules in the web ACL. You
     *        can't specify <code>COUNT</code> for the default action for a <code>WebACL</code>.
     *        </p>
     *        </li>
     * @see WafActionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies how you want AWS WAF to respond to requests that match the settings in a <code>Rule</code>. Valid
     * settings include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code>: AWS WAF allows requests
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code>: AWS WAF blocks requests
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code>: AWS WAF increments a counter of the requests that match all of the conditions in the rule.
     * AWS WAF then continues to inspect the web request based on the remaining rules in the web ACL. You can't specify
     * <code>COUNT</code> for the default action for a <code>WebACL</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies how you want AWS WAF to respond to requests that match the settings in a <code>Rule</code>.
     *         Valid settings include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALLOW</code>: AWS WAF allows requests
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BLOCK</code>: AWS WAF blocks requests
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COUNT</code>: AWS WAF increments a counter of the requests that match all of the conditions in the
     *         rule. AWS WAF then continues to inspect the web request based on the remaining rules in the web ACL. You
     *         can't specify <code>COUNT</code> for the default action for a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @see WafActionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies how you want AWS WAF to respond to requests that match the settings in a <code>Rule</code>. Valid
     * settings include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code>: AWS WAF allows requests
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code>: AWS WAF blocks requests
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code>: AWS WAF increments a counter of the requests that match all of the conditions in the rule.
     * AWS WAF then continues to inspect the web request based on the remaining rules in the web ACL. You can't specify
     * <code>COUNT</code> for the default action for a <code>WebACL</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Specifies how you want AWS WAF to respond to requests that match the settings in a <code>Rule</code>.
     *        Valid settings include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALLOW</code>: AWS WAF allows requests
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BLOCK</code>: AWS WAF blocks requests
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COUNT</code>: AWS WAF increments a counter of the requests that match all of the conditions in the
     *        rule. AWS WAF then continues to inspect the web request based on the remaining rules in the web ACL. You
     *        can't specify <code>COUNT</code> for the default action for a <code>WebACL</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WafActionType
     */

    public WafAction withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies how you want AWS WAF to respond to requests that match the settings in a <code>Rule</code>. Valid
     * settings include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code>: AWS WAF allows requests
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code>: AWS WAF blocks requests
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code>: AWS WAF increments a counter of the requests that match all of the conditions in the rule.
     * AWS WAF then continues to inspect the web request based on the remaining rules in the web ACL. You can't specify
     * <code>COUNT</code> for the default action for a <code>WebACL</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Specifies how you want AWS WAF to respond to requests that match the settings in a <code>Rule</code>.
     *        Valid settings include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALLOW</code>: AWS WAF allows requests
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BLOCK</code>: AWS WAF blocks requests
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COUNT</code>: AWS WAF increments a counter of the requests that match all of the conditions in the
     *        rule. AWS WAF then continues to inspect the web request based on the remaining rules in the web ACL. You
     *        can't specify <code>COUNT</code> for the default action for a <code>WebACL</code>.
     *        </p>
     *        </li>
     * @see WafActionType
     */

    public void setType(WafActionType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Specifies how you want AWS WAF to respond to requests that match the settings in a <code>Rule</code>. Valid
     * settings include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code>: AWS WAF allows requests
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code>: AWS WAF blocks requests
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code>: AWS WAF increments a counter of the requests that match all of the conditions in the rule.
     * AWS WAF then continues to inspect the web request based on the remaining rules in the web ACL. You can't specify
     * <code>COUNT</code> for the default action for a <code>WebACL</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Specifies how you want AWS WAF to respond to requests that match the settings in a <code>Rule</code>.
     *        Valid settings include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALLOW</code>: AWS WAF allows requests
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BLOCK</code>: AWS WAF blocks requests
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COUNT</code>: AWS WAF increments a counter of the requests that match all of the conditions in the
     *        rule. AWS WAF then continues to inspect the web request based on the remaining rules in the web ACL. You
     *        can't specify <code>COUNT</code> for the default action for a <code>WebACL</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WafActionType
     */

    public WafAction withType(WafActionType type) {
        setType(type);
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
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WafAction == false)
            return false;
        WafAction other = (WafAction) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public WafAction clone() {
        try {
            return (WafAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
