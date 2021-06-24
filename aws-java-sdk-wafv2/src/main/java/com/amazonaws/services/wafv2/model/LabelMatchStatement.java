/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A rule statement that defines a string match search against labels that have been added to the web request by rules
 * that have already run in the web ACL.
 * </p>
 * <p>
 * The label match statement provides the label or namespace string to search for. The label string can represent a part
 * or all of the fully qualified label name that had been added to the web request. Fully qualified labels have a
 * prefix, optional namespaces, and label name. The prefix identifies the rule group or web ACL context of the rule that
 * added the label. If you do not provide the fully qualified name in your label match string, WAF performs the search
 * for labels that were added in the same context as the label match statement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/LabelMatchStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelMatchStatement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify whether you want to match using the label name or just the namespace.
     * </p>
     */
    private String scope;
    /**
     * <p>
     * The string to match against. The setting you provide for this depends on the match statement's <code>Scope</code>
     * setting:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the <code>Scope</code> indicates <code>LABEL</code>, then this specification must include the name and can
     * include any number of preceding namespace specifications and prefix up to providing the fully qualified label
     * name.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>Scope</code> indicates <code>NAMESPACE</code>, then this specification can include any number of
     * contiguous namespace strings, and can include the entire label namespace prefix from the rule group or web ACL
     * where the label originates.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Labels are case sensitive and components of a label must be separated by colon, for example
     * <code>NS1:NS2:name</code>.
     * </p>
     */
    private String key;

    /**
     * <p>
     * Specify whether you want to match using the label name or just the namespace.
     * </p>
     * 
     * @param scope
     *        Specify whether you want to match using the label name or just the namespace.
     * @see LabelMatchScope
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * Specify whether you want to match using the label name or just the namespace.
     * </p>
     * 
     * @return Specify whether you want to match using the label name or just the namespace.
     * @see LabelMatchScope
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * Specify whether you want to match using the label name or just the namespace.
     * </p>
     * 
     * @param scope
     *        Specify whether you want to match using the label name or just the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LabelMatchScope
     */

    public LabelMatchStatement withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * Specify whether you want to match using the label name or just the namespace.
     * </p>
     * 
     * @param scope
     *        Specify whether you want to match using the label name or just the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LabelMatchScope
     */

    public LabelMatchStatement withScope(LabelMatchScope scope) {
        this.scope = scope.toString();
        return this;
    }

    /**
     * <p>
     * The string to match against. The setting you provide for this depends on the match statement's <code>Scope</code>
     * setting:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the <code>Scope</code> indicates <code>LABEL</code>, then this specification must include the name and can
     * include any number of preceding namespace specifications and prefix up to providing the fully qualified label
     * name.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>Scope</code> indicates <code>NAMESPACE</code>, then this specification can include any number of
     * contiguous namespace strings, and can include the entire label namespace prefix from the rule group or web ACL
     * where the label originates.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Labels are case sensitive and components of a label must be separated by colon, for example
     * <code>NS1:NS2:name</code>.
     * </p>
     * 
     * @param key
     *        The string to match against. The setting you provide for this depends on the match statement's
     *        <code>Scope</code> setting: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the <code>Scope</code> indicates <code>LABEL</code>, then this specification must include the name and
     *        can include any number of preceding namespace specifications and prefix up to providing the fully
     *        qualified label name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the <code>Scope</code> indicates <code>NAMESPACE</code>, then this specification can include any number
     *        of contiguous namespace strings, and can include the entire label namespace prefix from the rule group or
     *        web ACL where the label originates.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Labels are case sensitive and components of a label must be separated by colon, for example
     *        <code>NS1:NS2:name</code>.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The string to match against. The setting you provide for this depends on the match statement's <code>Scope</code>
     * setting:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the <code>Scope</code> indicates <code>LABEL</code>, then this specification must include the name and can
     * include any number of preceding namespace specifications and prefix up to providing the fully qualified label
     * name.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>Scope</code> indicates <code>NAMESPACE</code>, then this specification can include any number of
     * contiguous namespace strings, and can include the entire label namespace prefix from the rule group or web ACL
     * where the label originates.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Labels are case sensitive and components of a label must be separated by colon, for example
     * <code>NS1:NS2:name</code>.
     * </p>
     * 
     * @return The string to match against. The setting you provide for this depends on the match statement's
     *         <code>Scope</code> setting: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the <code>Scope</code> indicates <code>LABEL</code>, then this specification must include the name and
     *         can include any number of preceding namespace specifications and prefix up to providing the fully
     *         qualified label name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the <code>Scope</code> indicates <code>NAMESPACE</code>, then this specification can include any
     *         number of contiguous namespace strings, and can include the entire label namespace prefix from the rule
     *         group or web ACL where the label originates.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Labels are case sensitive and components of a label must be separated by colon, for example
     *         <code>NS1:NS2:name</code>.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The string to match against. The setting you provide for this depends on the match statement's <code>Scope</code>
     * setting:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the <code>Scope</code> indicates <code>LABEL</code>, then this specification must include the name and can
     * include any number of preceding namespace specifications and prefix up to providing the fully qualified label
     * name.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>Scope</code> indicates <code>NAMESPACE</code>, then this specification can include any number of
     * contiguous namespace strings, and can include the entire label namespace prefix from the rule group or web ACL
     * where the label originates.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Labels are case sensitive and components of a label must be separated by colon, for example
     * <code>NS1:NS2:name</code>.
     * </p>
     * 
     * @param key
     *        The string to match against. The setting you provide for this depends on the match statement's
     *        <code>Scope</code> setting: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the <code>Scope</code> indicates <code>LABEL</code>, then this specification must include the name and
     *        can include any number of preceding namespace specifications and prefix up to providing the fully
     *        qualified label name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the <code>Scope</code> indicates <code>NAMESPACE</code>, then this specification can include any number
     *        of contiguous namespace strings, and can include the entire label namespace prefix from the rule group or
     *        web ACL where the label originates.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Labels are case sensitive and components of a label must be separated by colon, for example
     *        <code>NS1:NS2:name</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelMatchStatement withKey(String key) {
        setKey(key);
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
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelMatchStatement == false)
            return false;
        LabelMatchStatement other = (LabelMatchStatement) obj;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        return hashCode;
    }

    @Override
    public LabelMatchStatement clone() {
        try {
            return (LabelMatchStatement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.LabelMatchStatementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
