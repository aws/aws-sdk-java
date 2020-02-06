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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a regular expression used to validate the value of a slot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/SlotTypeRegexConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotTypeRegexConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A regular expression used to validate the value of a slot.
     * </p>
     * <p>
     * Use a standard regular expression. Amazon Lex supports the following characters in the regular expression:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z
     * </p>
     * </li>
     * <li>
     * <p>
     * 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * Unicode characters ("\ u&lt;Unicode&gt;")
     * </p>
     * </li>
     * </ul>
     * <p>
     * Represent Unicode characters with four digits, for example "\u0041" or "\u005A".
     * </p>
     * <p>
     * The following regular expression operators are not supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Infinite repeaters: *, +, or {x,} with no upper bound.
     * </p>
     * </li>
     * <li>
     * <p>
     * Wild card (.)
     * </p>
     * </li>
     * </ul>
     */
    private String pattern;

    /**
     * <p>
     * A regular expression used to validate the value of a slot.
     * </p>
     * <p>
     * Use a standard regular expression. Amazon Lex supports the following characters in the regular expression:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z
     * </p>
     * </li>
     * <li>
     * <p>
     * 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * Unicode characters ("\ u&lt;Unicode&gt;")
     * </p>
     * </li>
     * </ul>
     * <p>
     * Represent Unicode characters with four digits, for example "\u0041" or "\u005A".
     * </p>
     * <p>
     * The following regular expression operators are not supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Infinite repeaters: *, +, or {x,} with no upper bound.
     * </p>
     * </li>
     * <li>
     * <p>
     * Wild card (.)
     * </p>
     * </li>
     * </ul>
     * 
     * @param pattern
     *        A regular expression used to validate the value of a slot. </p>
     *        <p>
     *        Use a standard regular expression. Amazon Lex supports the following characters in the regular expression:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Unicode characters ("\ u&lt;Unicode&gt;")
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Represent Unicode characters with four digits, for example "\u0041" or "\u005A".
     *        </p>
     *        <p>
     *        The following regular expression operators are not supported:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Infinite repeaters: *, +, or {x,} with no upper bound.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Wild card (.)
     *        </p>
     *        </li>
     */

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * <p>
     * A regular expression used to validate the value of a slot.
     * </p>
     * <p>
     * Use a standard regular expression. Amazon Lex supports the following characters in the regular expression:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z
     * </p>
     * </li>
     * <li>
     * <p>
     * 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * Unicode characters ("\ u&lt;Unicode&gt;")
     * </p>
     * </li>
     * </ul>
     * <p>
     * Represent Unicode characters with four digits, for example "\u0041" or "\u005A".
     * </p>
     * <p>
     * The following regular expression operators are not supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Infinite repeaters: *, +, or {x,} with no upper bound.
     * </p>
     * </li>
     * <li>
     * <p>
     * Wild card (.)
     * </p>
     * </li>
     * </ul>
     * 
     * @return A regular expression used to validate the value of a slot. </p>
     *         <p>
     *         Use a standard regular expression. Amazon Lex supports the following characters in the regular
     *         expression:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A-Z, a-z
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         0-9
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Unicode characters ("\ u&lt;Unicode&gt;")
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Represent Unicode characters with four digits, for example "\u0041" or "\u005A".
     *         </p>
     *         <p>
     *         The following regular expression operators are not supported:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Infinite repeaters: *, +, or {x,} with no upper bound.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Wild card (.)
     *         </p>
     *         </li>
     */

    public String getPattern() {
        return this.pattern;
    }

    /**
     * <p>
     * A regular expression used to validate the value of a slot.
     * </p>
     * <p>
     * Use a standard regular expression. Amazon Lex supports the following characters in the regular expression:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z
     * </p>
     * </li>
     * <li>
     * <p>
     * 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * Unicode characters ("\ u&lt;Unicode&gt;")
     * </p>
     * </li>
     * </ul>
     * <p>
     * Represent Unicode characters with four digits, for example "\u0041" or "\u005A".
     * </p>
     * <p>
     * The following regular expression operators are not supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Infinite repeaters: *, +, or {x,} with no upper bound.
     * </p>
     * </li>
     * <li>
     * <p>
     * Wild card (.)
     * </p>
     * </li>
     * </ul>
     * 
     * @param pattern
     *        A regular expression used to validate the value of a slot. </p>
     *        <p>
     *        Use a standard regular expression. Amazon Lex supports the following characters in the regular expression:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Unicode characters ("\ u&lt;Unicode&gt;")
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Represent Unicode characters with four digits, for example "\u0041" or "\u005A".
     *        </p>
     *        <p>
     *        The following regular expression operators are not supported:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Infinite repeaters: *, +, or {x,} with no upper bound.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Wild card (.)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotTypeRegexConfiguration withPattern(String pattern) {
        setPattern(pattern);
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
        if (getPattern() != null)
            sb.append("Pattern: ").append(getPattern());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlotTypeRegexConfiguration == false)
            return false;
        SlotTypeRegexConfiguration other = (SlotTypeRegexConfiguration) obj;
        if (other.getPattern() == null ^ this.getPattern() == null)
            return false;
        if (other.getPattern() != null && other.getPattern().equals(this.getPattern()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPattern() == null) ? 0 : getPattern().hashCode());
        return hashCode;
    }

    @Override
    public SlotTypeRegexConfiguration clone() {
        try {
            return (SlotTypeRegexConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.SlotTypeRegexConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
