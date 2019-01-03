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
 * In an <a>UpdateRegexPatternSet</a> request, <code>RegexPatternSetUpdate</code> specifies whether to insert or delete
 * a <code>RegexPatternString</code> and includes the settings for the <code>RegexPatternString</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/RegexPatternSetUpdate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegexPatternSetUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether to insert or delete a <code>RegexPatternString</code>.
     * </p>
     */
    private String action;
    /**
     * <p>
     * Specifies the regular expression (regex) pattern that you want AWS WAF to search for, such as
     * <code>B[a@]dB[o0]t</code>.
     * </p>
     */
    private String regexPatternString;

    /**
     * <p>
     * Specifies whether to insert or delete a <code>RegexPatternString</code>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert or delete a <code>RegexPatternString</code>.
     * @see ChangeAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies whether to insert or delete a <code>RegexPatternString</code>.
     * </p>
     * 
     * @return Specifies whether to insert or delete a <code>RegexPatternString</code>.
     * @see ChangeAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies whether to insert or delete a <code>RegexPatternString</code>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert or delete a <code>RegexPatternString</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public RegexPatternSetUpdate withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies whether to insert or delete a <code>RegexPatternString</code>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert or delete a <code>RegexPatternString</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public RegexPatternSetUpdate withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the regular expression (regex) pattern that you want AWS WAF to search for, such as
     * <code>B[a@]dB[o0]t</code>.
     * </p>
     * 
     * @param regexPatternString
     *        Specifies the regular expression (regex) pattern that you want AWS WAF to search for, such as
     *        <code>B[a@]dB[o0]t</code>.
     */

    public void setRegexPatternString(String regexPatternString) {
        this.regexPatternString = regexPatternString;
    }

    /**
     * <p>
     * Specifies the regular expression (regex) pattern that you want AWS WAF to search for, such as
     * <code>B[a@]dB[o0]t</code>.
     * </p>
     * 
     * @return Specifies the regular expression (regex) pattern that you want AWS WAF to search for, such as
     *         <code>B[a@]dB[o0]t</code>.
     */

    public String getRegexPatternString() {
        return this.regexPatternString;
    }

    /**
     * <p>
     * Specifies the regular expression (regex) pattern that you want AWS WAF to search for, such as
     * <code>B[a@]dB[o0]t</code>.
     * </p>
     * 
     * @param regexPatternString
     *        Specifies the regular expression (regex) pattern that you want AWS WAF to search for, such as
     *        <code>B[a@]dB[o0]t</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegexPatternSetUpdate withRegexPatternString(String regexPatternString) {
        setRegexPatternString(regexPatternString);
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
        if (getRegexPatternString() != null)
            sb.append("RegexPatternString: ").append(getRegexPatternString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegexPatternSetUpdate == false)
            return false;
        RegexPatternSetUpdate other = (RegexPatternSetUpdate) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getRegexPatternString() == null ^ this.getRegexPatternString() == null)
            return false;
        if (other.getRegexPatternString() != null && other.getRegexPatternString().equals(this.getRegexPatternString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getRegexPatternString() == null) ? 0 : getRegexPatternString().hashCode());
        return hashCode;
    }

    @Override
    public RegexPatternSetUpdate clone() {
        try {
            return (RegexPatternSetUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.RegexPatternSetUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
