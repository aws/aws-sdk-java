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
 * In an <a>UpdateRegexMatchSet</a> request, <code>RegexMatchSetUpdate</code> specifies whether to insert or delete a
 * <a>RegexMatchTuple</a> and includes the settings for the <code>RegexMatchTuple</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/RegexMatchSetUpdate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegexMatchSetUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether to insert or delete a <a>RegexMatchTuple</a>.
     * </p>
     */
    private String action;
    /**
     * <p>
     * Information about the part of a web request that you want AWS WAF to inspect and the identifier of the regular
     * expression (regex) pattern that you want AWS WAF to search for. If you specify <code>DELETE</code> for the value
     * of <code>Action</code>, the <code>RegexMatchTuple</code> values must exactly match the values in the
     * <code>RegexMatchTuple</code> that you want to delete from the <code>RegexMatchSet</code>.
     * </p>
     */
    private RegexMatchTuple regexMatchTuple;

    /**
     * <p>
     * Specifies whether to insert or delete a <a>RegexMatchTuple</a>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert or delete a <a>RegexMatchTuple</a>.
     * @see ChangeAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies whether to insert or delete a <a>RegexMatchTuple</a>.
     * </p>
     * 
     * @return Specifies whether to insert or delete a <a>RegexMatchTuple</a>.
     * @see ChangeAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies whether to insert or delete a <a>RegexMatchTuple</a>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert or delete a <a>RegexMatchTuple</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public RegexMatchSetUpdate withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies whether to insert or delete a <a>RegexMatchTuple</a>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert or delete a <a>RegexMatchTuple</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public RegexMatchSetUpdate withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * Information about the part of a web request that you want AWS WAF to inspect and the identifier of the regular
     * expression (regex) pattern that you want AWS WAF to search for. If you specify <code>DELETE</code> for the value
     * of <code>Action</code>, the <code>RegexMatchTuple</code> values must exactly match the values in the
     * <code>RegexMatchTuple</code> that you want to delete from the <code>RegexMatchSet</code>.
     * </p>
     * 
     * @param regexMatchTuple
     *        Information about the part of a web request that you want AWS WAF to inspect and the identifier of the
     *        regular expression (regex) pattern that you want AWS WAF to search for. If you specify <code>DELETE</code>
     *        for the value of <code>Action</code>, the <code>RegexMatchTuple</code> values must exactly match the
     *        values in the <code>RegexMatchTuple</code> that you want to delete from the <code>RegexMatchSet</code>.
     */

    public void setRegexMatchTuple(RegexMatchTuple regexMatchTuple) {
        this.regexMatchTuple = regexMatchTuple;
    }

    /**
     * <p>
     * Information about the part of a web request that you want AWS WAF to inspect and the identifier of the regular
     * expression (regex) pattern that you want AWS WAF to search for. If you specify <code>DELETE</code> for the value
     * of <code>Action</code>, the <code>RegexMatchTuple</code> values must exactly match the values in the
     * <code>RegexMatchTuple</code> that you want to delete from the <code>RegexMatchSet</code>.
     * </p>
     * 
     * @return Information about the part of a web request that you want AWS WAF to inspect and the identifier of the
     *         regular expression (regex) pattern that you want AWS WAF to search for. If you specify
     *         <code>DELETE</code> for the value of <code>Action</code>, the <code>RegexMatchTuple</code> values must
     *         exactly match the values in the <code>RegexMatchTuple</code> that you want to delete from the
     *         <code>RegexMatchSet</code>.
     */

    public RegexMatchTuple getRegexMatchTuple() {
        return this.regexMatchTuple;
    }

    /**
     * <p>
     * Information about the part of a web request that you want AWS WAF to inspect and the identifier of the regular
     * expression (regex) pattern that you want AWS WAF to search for. If you specify <code>DELETE</code> for the value
     * of <code>Action</code>, the <code>RegexMatchTuple</code> values must exactly match the values in the
     * <code>RegexMatchTuple</code> that you want to delete from the <code>RegexMatchSet</code>.
     * </p>
     * 
     * @param regexMatchTuple
     *        Information about the part of a web request that you want AWS WAF to inspect and the identifier of the
     *        regular expression (regex) pattern that you want AWS WAF to search for. If you specify <code>DELETE</code>
     *        for the value of <code>Action</code>, the <code>RegexMatchTuple</code> values must exactly match the
     *        values in the <code>RegexMatchTuple</code> that you want to delete from the <code>RegexMatchSet</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegexMatchSetUpdate withRegexMatchTuple(RegexMatchTuple regexMatchTuple) {
        setRegexMatchTuple(regexMatchTuple);
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
        if (getRegexMatchTuple() != null)
            sb.append("RegexMatchTuple: ").append(getRegexMatchTuple());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegexMatchSetUpdate == false)
            return false;
        RegexMatchSetUpdate other = (RegexMatchSetUpdate) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getRegexMatchTuple() == null ^ this.getRegexMatchTuple() == null)
            return false;
        if (other.getRegexMatchTuple() != null && other.getRegexMatchTuple().equals(this.getRegexMatchTuple()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getRegexMatchTuple() == null) ? 0 : getRegexMatchTuple().hashCode());
        return hashCode;
    }

    @Override
    public RegexMatchSetUpdate clone() {
        try {
            return (RegexMatchSetUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.RegexMatchSetUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
