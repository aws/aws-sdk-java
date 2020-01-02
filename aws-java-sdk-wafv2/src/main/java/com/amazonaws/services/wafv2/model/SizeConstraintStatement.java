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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <note>
 * <p>
 * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information, including
 * how to migrate your AWS WAF resources from the prior release, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * A rule statement that compares a number of bytes against the size of a request component, using a comparison
 * operator, such as greater than (&gt;) or less than (&lt;). For example, you can use a size constraint statement to
 * look for query strings that are longer than 100 bytes.
 * </p>
 * <p>
 * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the first 8192 bytes (8 KB). If the
 * request body for your web requests never exceeds 8192 bytes, you can create a size constraint condition and block
 * requests that have a request body greater than 8192 bytes.
 * </p>
 * <p>
 * If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI counts as one
 * character. For example, the URI <code>/logo.jpg</code> is nine characters long.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/SizeConstraintStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SizeConstraintStatement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The part of a web request that you want AWS WAF to inspect. For more information, see <a>FieldToMatch</a>.
     * </p>
     */
    private FieldToMatch fieldToMatch;
    /**
     * <p>
     * The operator to use to compare the request part to the size setting.
     * </p>
     */
    private String comparisonOperator;
    /**
     * <p>
     * The size, in byte, to compare to the request part, after any transformations.
     * </p>
     */
    private Long size;
    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content identified by <code>FieldToMatch</code>, starting from the lowest priority
     * setting, before inspecting the content for a match.
     * </p>
     */
    private java.util.List<TextTransformation> textTransformations;

    /**
     * <p>
     * The part of a web request that you want AWS WAF to inspect. For more information, see <a>FieldToMatch</a>.
     * </p>
     * 
     * @param fieldToMatch
     *        The part of a web request that you want AWS WAF to inspect. For more information, see <a>FieldToMatch</a>.
     */

    public void setFieldToMatch(FieldToMatch fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
    }

    /**
     * <p>
     * The part of a web request that you want AWS WAF to inspect. For more information, see <a>FieldToMatch</a>.
     * </p>
     * 
     * @return The part of a web request that you want AWS WAF to inspect. For more information, see
     *         <a>FieldToMatch</a>.
     */

    public FieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }

    /**
     * <p>
     * The part of a web request that you want AWS WAF to inspect. For more information, see <a>FieldToMatch</a>.
     * </p>
     * 
     * @param fieldToMatch
     *        The part of a web request that you want AWS WAF to inspect. For more information, see <a>FieldToMatch</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SizeConstraintStatement withFieldToMatch(FieldToMatch fieldToMatch) {
        setFieldToMatch(fieldToMatch);
        return this;
    }

    /**
     * <p>
     * The operator to use to compare the request part to the size setting.
     * </p>
     * 
     * @param comparisonOperator
     *        The operator to use to compare the request part to the size setting.
     * @see ComparisonOperator
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * The operator to use to compare the request part to the size setting.
     * </p>
     * 
     * @return The operator to use to compare the request part to the size setting.
     * @see ComparisonOperator
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * <p>
     * The operator to use to compare the request part to the size setting.
     * </p>
     * 
     * @param comparisonOperator
     *        The operator to use to compare the request part to the size setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public SizeConstraintStatement withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * <p>
     * The operator to use to compare the request part to the size setting.
     * </p>
     * 
     * @param comparisonOperator
     *        The operator to use to compare the request part to the size setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public SizeConstraintStatement withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * <p>
     * The size, in byte, to compare to the request part, after any transformations.
     * </p>
     * 
     * @param size
     *        The size, in byte, to compare to the request part, after any transformations.
     */

    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * <p>
     * The size, in byte, to compare to the request part, after any transformations.
     * </p>
     * 
     * @return The size, in byte, to compare to the request part, after any transformations.
     */

    public Long getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size, in byte, to compare to the request part, after any transformations.
     * </p>
     * 
     * @param size
     *        The size, in byte, to compare to the request part, after any transformations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SizeConstraintStatement withSize(Long size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content identified by <code>FieldToMatch</code>, starting from the lowest priority
     * setting, before inspecting the content for a match.
     * </p>
     * 
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *         effort to bypass detection. If you specify one or more transformations in a rule statement, AWS WAF
     *         performs all transformations on the content identified by <code>FieldToMatch</code>, starting from the
     *         lowest priority setting, before inspecting the content for a match.
     */

    public java.util.List<TextTransformation> getTextTransformations() {
        return textTransformations;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content identified by <code>FieldToMatch</code>, starting from the lowest priority
     * setting, before inspecting the content for a match.
     * </p>
     * 
     * @param textTransformations
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass detection. If you specify one or more transformations in a rule statement, AWS WAF
     *        performs all transformations on the content identified by <code>FieldToMatch</code>, starting from the
     *        lowest priority setting, before inspecting the content for a match.
     */

    public void setTextTransformations(java.util.Collection<TextTransformation> textTransformations) {
        if (textTransformations == null) {
            this.textTransformations = null;
            return;
        }

        this.textTransformations = new java.util.ArrayList<TextTransformation>(textTransformations);
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content identified by <code>FieldToMatch</code>, starting from the lowest priority
     * setting, before inspecting the content for a match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTextTransformations(java.util.Collection)} or {@link #withTextTransformations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param textTransformations
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass detection. If you specify one or more transformations in a rule statement, AWS WAF
     *        performs all transformations on the content identified by <code>FieldToMatch</code>, starting from the
     *        lowest priority setting, before inspecting the content for a match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SizeConstraintStatement withTextTransformations(TextTransformation... textTransformations) {
        if (this.textTransformations == null) {
            setTextTransformations(new java.util.ArrayList<TextTransformation>(textTransformations.length));
        }
        for (TextTransformation ele : textTransformations) {
            this.textTransformations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. If you specify one or more transformations in a rule statement, AWS WAF performs all
     * transformations on the content identified by <code>FieldToMatch</code>, starting from the lowest priority
     * setting, before inspecting the content for a match.
     * </p>
     * 
     * @param textTransformations
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass detection. If you specify one or more transformations in a rule statement, AWS WAF
     *        performs all transformations on the content identified by <code>FieldToMatch</code>, starting from the
     *        lowest priority setting, before inspecting the content for a match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SizeConstraintStatement withTextTransformations(java.util.Collection<TextTransformation> textTransformations) {
        setTextTransformations(textTransformations);
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
        if (getFieldToMatch() != null)
            sb.append("FieldToMatch: ").append(getFieldToMatch()).append(",");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: ").append(getComparisonOperator()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getTextTransformations() != null)
            sb.append("TextTransformations: ").append(getTextTransformations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SizeConstraintStatement == false)
            return false;
        SizeConstraintStatement other = (SizeConstraintStatement) obj;
        if (other.getFieldToMatch() == null ^ this.getFieldToMatch() == null)
            return false;
        if (other.getFieldToMatch() != null && other.getFieldToMatch().equals(this.getFieldToMatch()) == false)
            return false;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getTextTransformations() == null ^ this.getTextTransformations() == null)
            return false;
        if (other.getTextTransformations() != null && other.getTextTransformations().equals(this.getTextTransformations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldToMatch() == null) ? 0 : getFieldToMatch().hashCode());
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getTextTransformations() == null) ? 0 : getTextTransformations().hashCode());
        return hashCode;
    }

    @Override
    public SizeConstraintStatement clone() {
        try {
            return (SizeConstraintStatement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.SizeConstraintStatementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
