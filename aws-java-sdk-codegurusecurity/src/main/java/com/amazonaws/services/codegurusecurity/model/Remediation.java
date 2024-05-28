/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about how to remediate a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/Remediation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Remediation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains information about the recommended course of action to remediate a finding.
     * </p>
     */
    private Recommendation recommendation;
    /**
     * <p>
     * A list of <code>SuggestedFix</code> objects. Each object contains information about a suggested code fix to
     * remediate the finding.
     * </p>
     */
    private java.util.List<SuggestedFix> suggestedFixes;

    /**
     * <p>
     * An object that contains information about the recommended course of action to remediate a finding.
     * </p>
     * 
     * @param recommendation
     *        An object that contains information about the recommended course of action to remediate a finding.
     */

    public void setRecommendation(Recommendation recommendation) {
        this.recommendation = recommendation;
    }

    /**
     * <p>
     * An object that contains information about the recommended course of action to remediate a finding.
     * </p>
     * 
     * @return An object that contains information about the recommended course of action to remediate a finding.
     */

    public Recommendation getRecommendation() {
        return this.recommendation;
    }

    /**
     * <p>
     * An object that contains information about the recommended course of action to remediate a finding.
     * </p>
     * 
     * @param recommendation
     *        An object that contains information about the recommended course of action to remediate a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Remediation withRecommendation(Recommendation recommendation) {
        setRecommendation(recommendation);
        return this;
    }

    /**
     * <p>
     * A list of <code>SuggestedFix</code> objects. Each object contains information about a suggested code fix to
     * remediate the finding.
     * </p>
     * 
     * @return A list of <code>SuggestedFix</code> objects. Each object contains information about a suggested code fix
     *         to remediate the finding.
     */

    public java.util.List<SuggestedFix> getSuggestedFixes() {
        return suggestedFixes;
    }

    /**
     * <p>
     * A list of <code>SuggestedFix</code> objects. Each object contains information about a suggested code fix to
     * remediate the finding.
     * </p>
     * 
     * @param suggestedFixes
     *        A list of <code>SuggestedFix</code> objects. Each object contains information about a suggested code fix
     *        to remediate the finding.
     */

    public void setSuggestedFixes(java.util.Collection<SuggestedFix> suggestedFixes) {
        if (suggestedFixes == null) {
            this.suggestedFixes = null;
            return;
        }

        this.suggestedFixes = new java.util.ArrayList<SuggestedFix>(suggestedFixes);
    }

    /**
     * <p>
     * A list of <code>SuggestedFix</code> objects. Each object contains information about a suggested code fix to
     * remediate the finding.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuggestedFixes(java.util.Collection)} or {@link #withSuggestedFixes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param suggestedFixes
     *        A list of <code>SuggestedFix</code> objects. Each object contains information about a suggested code fix
     *        to remediate the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Remediation withSuggestedFixes(SuggestedFix... suggestedFixes) {
        if (this.suggestedFixes == null) {
            setSuggestedFixes(new java.util.ArrayList<SuggestedFix>(suggestedFixes.length));
        }
        for (SuggestedFix ele : suggestedFixes) {
            this.suggestedFixes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>SuggestedFix</code> objects. Each object contains information about a suggested code fix to
     * remediate the finding.
     * </p>
     * 
     * @param suggestedFixes
     *        A list of <code>SuggestedFix</code> objects. Each object contains information about a suggested code fix
     *        to remediate the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Remediation withSuggestedFixes(java.util.Collection<SuggestedFix> suggestedFixes) {
        setSuggestedFixes(suggestedFixes);
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
        if (getRecommendation() != null)
            sb.append("Recommendation: ").append(getRecommendation()).append(",");
        if (getSuggestedFixes() != null)
            sb.append("SuggestedFixes: ").append(getSuggestedFixes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Remediation == false)
            return false;
        Remediation other = (Remediation) obj;
        if (other.getRecommendation() == null ^ this.getRecommendation() == null)
            return false;
        if (other.getRecommendation() != null && other.getRecommendation().equals(this.getRecommendation()) == false)
            return false;
        if (other.getSuggestedFixes() == null ^ this.getSuggestedFixes() == null)
            return false;
        if (other.getSuggestedFixes() != null && other.getSuggestedFixes().equals(this.getSuggestedFixes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendation() == null) ? 0 : getRecommendation().hashCode());
        hashCode = prime * hashCode + ((getSuggestedFixes() == null) ? 0 : getSuggestedFixes().hashCode());
        return hashCode;
    }

    @Override
    public Remediation clone() {
        try {
            return (Remediation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurusecurity.model.transform.RemediationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
