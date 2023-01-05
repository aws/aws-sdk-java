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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about the <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>,
 * <code>XssMatchSet</code>, <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, and <code>SizeConstraintSet</code>
 * objects that you want to add to a rule and, for each object, indicates whether you want to negate the settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsWafRulePredicateListDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafRulePredicateListDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for a predicate in a rule, such as <code>ByteMatchSetId</code> or <code>IPSetId</code>.
     * </p>
     */
    private String dataId;
    /**
     * <p>
     * Specifies if you want WAF to allow, block, or count requests based on the settings in the
     * <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>, <code>XssMatchSet</code>,
     * <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, or <code>SizeConstraintSet</code>.
     * </p>
     */
    private Boolean negated;
    /**
     * <p>
     * The type of predicate in a rule, such as <code>ByteMatch</code> or <code>IPSet</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A unique identifier for a predicate in a rule, such as <code>ByteMatchSetId</code> or <code>IPSetId</code>.
     * </p>
     * 
     * @param dataId
     *        A unique identifier for a predicate in a rule, such as <code>ByteMatchSetId</code> or <code>IPSetId</code>
     *        .
     */

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    /**
     * <p>
     * A unique identifier for a predicate in a rule, such as <code>ByteMatchSetId</code> or <code>IPSetId</code>.
     * </p>
     * 
     * @return A unique identifier for a predicate in a rule, such as <code>ByteMatchSetId</code> or
     *         <code>IPSetId</code>.
     */

    public String getDataId() {
        return this.dataId;
    }

    /**
     * <p>
     * A unique identifier for a predicate in a rule, such as <code>ByteMatchSetId</code> or <code>IPSetId</code>.
     * </p>
     * 
     * @param dataId
     *        A unique identifier for a predicate in a rule, such as <code>ByteMatchSetId</code> or <code>IPSetId</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRulePredicateListDetails withDataId(String dataId) {
        setDataId(dataId);
        return this;
    }

    /**
     * <p>
     * Specifies if you want WAF to allow, block, or count requests based on the settings in the
     * <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>, <code>XssMatchSet</code>,
     * <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, or <code>SizeConstraintSet</code>.
     * </p>
     * 
     * @param negated
     *        Specifies if you want WAF to allow, block, or count requests based on the settings in the
     *        <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>, <code>XssMatchSet</code>
     *        , <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, or <code>SizeConstraintSet</code>.
     */

    public void setNegated(Boolean negated) {
        this.negated = negated;
    }

    /**
     * <p>
     * Specifies if you want WAF to allow, block, or count requests based on the settings in the
     * <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>, <code>XssMatchSet</code>,
     * <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, or <code>SizeConstraintSet</code>.
     * </p>
     * 
     * @return Specifies if you want WAF to allow, block, or count requests based on the settings in the
     *         <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>,
     *         <code>XssMatchSet</code>, <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, or
     *         <code>SizeConstraintSet</code>.
     */

    public Boolean getNegated() {
        return this.negated;
    }

    /**
     * <p>
     * Specifies if you want WAF to allow, block, or count requests based on the settings in the
     * <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>, <code>XssMatchSet</code>,
     * <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, or <code>SizeConstraintSet</code>.
     * </p>
     * 
     * @param negated
     *        Specifies if you want WAF to allow, block, or count requests based on the settings in the
     *        <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>, <code>XssMatchSet</code>
     *        , <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, or <code>SizeConstraintSet</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRulePredicateListDetails withNegated(Boolean negated) {
        setNegated(negated);
        return this;
    }

    /**
     * <p>
     * Specifies if you want WAF to allow, block, or count requests based on the settings in the
     * <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>, <code>XssMatchSet</code>,
     * <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, or <code>SizeConstraintSet</code>.
     * </p>
     * 
     * @return Specifies if you want WAF to allow, block, or count requests based on the settings in the
     *         <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>,
     *         <code>XssMatchSet</code>, <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, or
     *         <code>SizeConstraintSet</code>.
     */

    public Boolean isNegated() {
        return this.negated;
    }

    /**
     * <p>
     * The type of predicate in a rule, such as <code>ByteMatch</code> or <code>IPSet</code>.
     * </p>
     * 
     * @param type
     *        The type of predicate in a rule, such as <code>ByteMatch</code> or <code>IPSet</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of predicate in a rule, such as <code>ByteMatch</code> or <code>IPSet</code>.
     * </p>
     * 
     * @return The type of predicate in a rule, such as <code>ByteMatch</code> or <code>IPSet</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of predicate in a rule, such as <code>ByteMatch</code> or <code>IPSet</code>.
     * </p>
     * 
     * @param type
     *        The type of predicate in a rule, such as <code>ByteMatch</code> or <code>IPSet</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafRulePredicateListDetails withType(String type) {
        setType(type);
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
        if (getDataId() != null)
            sb.append("DataId: ").append(getDataId()).append(",");
        if (getNegated() != null)
            sb.append("Negated: ").append(getNegated()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsWafRulePredicateListDetails == false)
            return false;
        AwsWafRulePredicateListDetails other = (AwsWafRulePredicateListDetails) obj;
        if (other.getDataId() == null ^ this.getDataId() == null)
            return false;
        if (other.getDataId() != null && other.getDataId().equals(this.getDataId()) == false)
            return false;
        if (other.getNegated() == null ^ this.getNegated() == null)
            return false;
        if (other.getNegated() != null && other.getNegated().equals(this.getNegated()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getDataId() == null) ? 0 : getDataId().hashCode());
        hashCode = prime * hashCode + ((getNegated() == null) ? 0 : getNegated().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AwsWafRulePredicateListDetails clone() {
        try {
            return (AwsWafRulePredicateListDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsWafRulePredicateListDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
