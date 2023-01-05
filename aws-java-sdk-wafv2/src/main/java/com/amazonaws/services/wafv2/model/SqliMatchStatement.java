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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A rule statement that inspects for malicious SQL code. Attackers insert malicious SQL code into web requests to do
 * things like modify your database or extract data from it.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/SqliMatchStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SqliMatchStatement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The part of the web request that you want WAF to inspect.
     * </p>
     */
    private FieldToMatch fieldToMatch;
    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. If you specify one or more transformations in a rule statement, WAF performs all
     * transformations on the content of the request component identified by <code>FieldToMatch</code>, starting from
     * the lowest priority setting, before inspecting the content for a match.
     * </p>
     */
    private java.util.List<TextTransformation> textTransformations;
    /**
     * <p>
     * The sensitivity that you want WAF to use to inspect for SQL injection attacks.
     * </p>
     * <p>
     * <code>HIGH</code> detects more attacks, but might generate more false positives, especially if your web requests
     * frequently contain unusual strings. For information about identifying and mitigating false positives, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-testing.html">Testing and tuning</a> in the
     * <i>WAF Developer Guide</i>.
     * </p>
     * <p>
     * <code>LOW</code> is generally a better choice for resources that already have other protections against SQL
     * injection attacks or that have a low tolerance for false positives.
     * </p>
     * <p>
     * Default: <code>LOW</code>
     * </p>
     */
    private String sensitivityLevel;

    /**
     * <p>
     * The part of the web request that you want WAF to inspect.
     * </p>
     * 
     * @param fieldToMatch
     *        The part of the web request that you want WAF to inspect.
     */

    public void setFieldToMatch(FieldToMatch fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
    }

    /**
     * <p>
     * The part of the web request that you want WAF to inspect.
     * </p>
     * 
     * @return The part of the web request that you want WAF to inspect.
     */

    public FieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }

    /**
     * <p>
     * The part of the web request that you want WAF to inspect.
     * </p>
     * 
     * @param fieldToMatch
     *        The part of the web request that you want WAF to inspect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqliMatchStatement withFieldToMatch(FieldToMatch fieldToMatch) {
        setFieldToMatch(fieldToMatch);
        return this;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. If you specify one or more transformations in a rule statement, WAF performs all
     * transformations on the content of the request component identified by <code>FieldToMatch</code>, starting from
     * the lowest priority setting, before inspecting the content for a match.
     * </p>
     * 
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *         effort to bypass detection. If you specify one or more transformations in a rule statement, WAF performs
     *         all transformations on the content of the request component identified by <code>FieldToMatch</code>,
     *         starting from the lowest priority setting, before inspecting the content for a match.
     */

    public java.util.List<TextTransformation> getTextTransformations() {
        return textTransformations;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. If you specify one or more transformations in a rule statement, WAF performs all
     * transformations on the content of the request component identified by <code>FieldToMatch</code>, starting from
     * the lowest priority setting, before inspecting the content for a match.
     * </p>
     * 
     * @param textTransformations
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass detection. If you specify one or more transformations in a rule statement, WAF performs
     *        all transformations on the content of the request component identified by <code>FieldToMatch</code>,
     *        starting from the lowest priority setting, before inspecting the content for a match.
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
     * bypass detection. If you specify one or more transformations in a rule statement, WAF performs all
     * transformations on the content of the request component identified by <code>FieldToMatch</code>, starting from
     * the lowest priority setting, before inspecting the content for a match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTextTransformations(java.util.Collection)} or {@link #withTextTransformations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param textTransformations
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass detection. If you specify one or more transformations in a rule statement, WAF performs
     *        all transformations on the content of the request component identified by <code>FieldToMatch</code>,
     *        starting from the lowest priority setting, before inspecting the content for a match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqliMatchStatement withTextTransformations(TextTransformation... textTransformations) {
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
     * bypass detection. If you specify one or more transformations in a rule statement, WAF performs all
     * transformations on the content of the request component identified by <code>FieldToMatch</code>, starting from
     * the lowest priority setting, before inspecting the content for a match.
     * </p>
     * 
     * @param textTransformations
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass detection. If you specify one or more transformations in a rule statement, WAF performs
     *        all transformations on the content of the request component identified by <code>FieldToMatch</code>,
     *        starting from the lowest priority setting, before inspecting the content for a match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqliMatchStatement withTextTransformations(java.util.Collection<TextTransformation> textTransformations) {
        setTextTransformations(textTransformations);
        return this;
    }

    /**
     * <p>
     * The sensitivity that you want WAF to use to inspect for SQL injection attacks.
     * </p>
     * <p>
     * <code>HIGH</code> detects more attacks, but might generate more false positives, especially if your web requests
     * frequently contain unusual strings. For information about identifying and mitigating false positives, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-testing.html">Testing and tuning</a> in the
     * <i>WAF Developer Guide</i>.
     * </p>
     * <p>
     * <code>LOW</code> is generally a better choice for resources that already have other protections against SQL
     * injection attacks or that have a low tolerance for false positives.
     * </p>
     * <p>
     * Default: <code>LOW</code>
     * </p>
     * 
     * @param sensitivityLevel
     *        The sensitivity that you want WAF to use to inspect for SQL injection attacks. </p>
     *        <p>
     *        <code>HIGH</code> detects more attacks, but might generate more false positives, especially if your web
     *        requests frequently contain unusual strings. For information about identifying and mitigating false
     *        positives, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-testing.html">Testing and tuning</a>
     *        in the <i>WAF Developer Guide</i>.
     *        </p>
     *        <p>
     *        <code>LOW</code> is generally a better choice for resources that already have other protections against
     *        SQL injection attacks or that have a low tolerance for false positives.
     *        </p>
     *        <p>
     *        Default: <code>LOW</code>
     * @see SensitivityLevel
     */

    public void setSensitivityLevel(String sensitivityLevel) {
        this.sensitivityLevel = sensitivityLevel;
    }

    /**
     * <p>
     * The sensitivity that you want WAF to use to inspect for SQL injection attacks.
     * </p>
     * <p>
     * <code>HIGH</code> detects more attacks, but might generate more false positives, especially if your web requests
     * frequently contain unusual strings. For information about identifying and mitigating false positives, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-testing.html">Testing and tuning</a> in the
     * <i>WAF Developer Guide</i>.
     * </p>
     * <p>
     * <code>LOW</code> is generally a better choice for resources that already have other protections against SQL
     * injection attacks or that have a low tolerance for false positives.
     * </p>
     * <p>
     * Default: <code>LOW</code>
     * </p>
     * 
     * @return The sensitivity that you want WAF to use to inspect for SQL injection attacks. </p>
     *         <p>
     *         <code>HIGH</code> detects more attacks, but might generate more false positives, especially if your web
     *         requests frequently contain unusual strings. For information about identifying and mitigating false
     *         positives, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-testing.html">Testing and tuning</a>
     *         in the <i>WAF Developer Guide</i>.
     *         </p>
     *         <p>
     *         <code>LOW</code> is generally a better choice for resources that already have other protections against
     *         SQL injection attacks or that have a low tolerance for false positives.
     *         </p>
     *         <p>
     *         Default: <code>LOW</code>
     * @see SensitivityLevel
     */

    public String getSensitivityLevel() {
        return this.sensitivityLevel;
    }

    /**
     * <p>
     * The sensitivity that you want WAF to use to inspect for SQL injection attacks.
     * </p>
     * <p>
     * <code>HIGH</code> detects more attacks, but might generate more false positives, especially if your web requests
     * frequently contain unusual strings. For information about identifying and mitigating false positives, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-testing.html">Testing and tuning</a> in the
     * <i>WAF Developer Guide</i>.
     * </p>
     * <p>
     * <code>LOW</code> is generally a better choice for resources that already have other protections against SQL
     * injection attacks or that have a low tolerance for false positives.
     * </p>
     * <p>
     * Default: <code>LOW</code>
     * </p>
     * 
     * @param sensitivityLevel
     *        The sensitivity that you want WAF to use to inspect for SQL injection attacks. </p>
     *        <p>
     *        <code>HIGH</code> detects more attacks, but might generate more false positives, especially if your web
     *        requests frequently contain unusual strings. For information about identifying and mitigating false
     *        positives, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-testing.html">Testing and tuning</a>
     *        in the <i>WAF Developer Guide</i>.
     *        </p>
     *        <p>
     *        <code>LOW</code> is generally a better choice for resources that already have other protections against
     *        SQL injection attacks or that have a low tolerance for false positives.
     *        </p>
     *        <p>
     *        Default: <code>LOW</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SensitivityLevel
     */

    public SqliMatchStatement withSensitivityLevel(String sensitivityLevel) {
        setSensitivityLevel(sensitivityLevel);
        return this;
    }

    /**
     * <p>
     * The sensitivity that you want WAF to use to inspect for SQL injection attacks.
     * </p>
     * <p>
     * <code>HIGH</code> detects more attacks, but might generate more false positives, especially if your web requests
     * frequently contain unusual strings. For information about identifying and mitigating false positives, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-testing.html">Testing and tuning</a> in the
     * <i>WAF Developer Guide</i>.
     * </p>
     * <p>
     * <code>LOW</code> is generally a better choice for resources that already have other protections against SQL
     * injection attacks or that have a low tolerance for false positives.
     * </p>
     * <p>
     * Default: <code>LOW</code>
     * </p>
     * 
     * @param sensitivityLevel
     *        The sensitivity that you want WAF to use to inspect for SQL injection attacks. </p>
     *        <p>
     *        <code>HIGH</code> detects more attacks, but might generate more false positives, especially if your web
     *        requests frequently contain unusual strings. For information about identifying and mitigating false
     *        positives, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/web-acl-testing.html">Testing and tuning</a>
     *        in the <i>WAF Developer Guide</i>.
     *        </p>
     *        <p>
     *        <code>LOW</code> is generally a better choice for resources that already have other protections against
     *        SQL injection attacks or that have a low tolerance for false positives.
     *        </p>
     *        <p>
     *        Default: <code>LOW</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SensitivityLevel
     */

    public SqliMatchStatement withSensitivityLevel(SensitivityLevel sensitivityLevel) {
        this.sensitivityLevel = sensitivityLevel.toString();
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
        if (getTextTransformations() != null)
            sb.append("TextTransformations: ").append(getTextTransformations()).append(",");
        if (getSensitivityLevel() != null)
            sb.append("SensitivityLevel: ").append(getSensitivityLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqliMatchStatement == false)
            return false;
        SqliMatchStatement other = (SqliMatchStatement) obj;
        if (other.getFieldToMatch() == null ^ this.getFieldToMatch() == null)
            return false;
        if (other.getFieldToMatch() != null && other.getFieldToMatch().equals(this.getFieldToMatch()) == false)
            return false;
        if (other.getTextTransformations() == null ^ this.getTextTransformations() == null)
            return false;
        if (other.getTextTransformations() != null && other.getTextTransformations().equals(this.getTextTransformations()) == false)
            return false;
        if (other.getSensitivityLevel() == null ^ this.getSensitivityLevel() == null)
            return false;
        if (other.getSensitivityLevel() != null && other.getSensitivityLevel().equals(this.getSensitivityLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldToMatch() == null) ? 0 : getFieldToMatch().hashCode());
        hashCode = prime * hashCode + ((getTextTransformations() == null) ? 0 : getTextTransformations().hashCode());
        hashCode = prime * hashCode + ((getSensitivityLevel() == null) ? 0 : getSensitivityLevel().hashCode());
        return hashCode;
    }

    @Override
    public SqliMatchStatement clone() {
        try {
            return (SqliMatchStatement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.SqliMatchStatementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
