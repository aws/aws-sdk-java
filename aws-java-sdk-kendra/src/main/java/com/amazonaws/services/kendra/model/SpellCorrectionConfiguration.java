/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information for suggested query spell corrections.
 * </p>
 * <p>
 * Suggested spell corrections are based on words that appear in your indexed documents and how closely a corrected word
 * matches a misspelled word.
 * </p>
 * <p>
 * This feature is designed with certain defaults or limits. For information on the current limits and how to request
 * more support for some limits, see the <a
 * href="https://docs.aws.amazon.com/kendra/latest/dg/query-spell-check.html">Spell Checker documentation</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SpellCorrectionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpellCorrectionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * <code>TRUE</code> to suggest spell corrections for queries.
     * </p>
     */
    private Boolean includeQuerySpellCheckSuggestions;

    /**
     * <p>
     * <code>TRUE</code> to suggest spell corrections for queries.
     * </p>
     * 
     * @param includeQuerySpellCheckSuggestions
     *        <code>TRUE</code> to suggest spell corrections for queries.
     */

    public void setIncludeQuerySpellCheckSuggestions(Boolean includeQuerySpellCheckSuggestions) {
        this.includeQuerySpellCheckSuggestions = includeQuerySpellCheckSuggestions;
    }

    /**
     * <p>
     * <code>TRUE</code> to suggest spell corrections for queries.
     * </p>
     * 
     * @return <code>TRUE</code> to suggest spell corrections for queries.
     */

    public Boolean getIncludeQuerySpellCheckSuggestions() {
        return this.includeQuerySpellCheckSuggestions;
    }

    /**
     * <p>
     * <code>TRUE</code> to suggest spell corrections for queries.
     * </p>
     * 
     * @param includeQuerySpellCheckSuggestions
     *        <code>TRUE</code> to suggest spell corrections for queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpellCorrectionConfiguration withIncludeQuerySpellCheckSuggestions(Boolean includeQuerySpellCheckSuggestions) {
        setIncludeQuerySpellCheckSuggestions(includeQuerySpellCheckSuggestions);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to suggest spell corrections for queries.
     * </p>
     * 
     * @return <code>TRUE</code> to suggest spell corrections for queries.
     */

    public Boolean isIncludeQuerySpellCheckSuggestions() {
        return this.includeQuerySpellCheckSuggestions;
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
        if (getIncludeQuerySpellCheckSuggestions() != null)
            sb.append("IncludeQuerySpellCheckSuggestions: ").append(getIncludeQuerySpellCheckSuggestions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpellCorrectionConfiguration == false)
            return false;
        SpellCorrectionConfiguration other = (SpellCorrectionConfiguration) obj;
        if (other.getIncludeQuerySpellCheckSuggestions() == null ^ this.getIncludeQuerySpellCheckSuggestions() == null)
            return false;
        if (other.getIncludeQuerySpellCheckSuggestions() != null
                && other.getIncludeQuerySpellCheckSuggestions().equals(this.getIncludeQuerySpellCheckSuggestions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncludeQuerySpellCheckSuggestions() == null) ? 0 : getIncludeQuerySpellCheckSuggestions().hashCode());
        return hashCode;
    }

    @Override
    public SpellCorrectionConfiguration clone() {
        try {
            return (SpellCorrectionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.SpellCorrectionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
