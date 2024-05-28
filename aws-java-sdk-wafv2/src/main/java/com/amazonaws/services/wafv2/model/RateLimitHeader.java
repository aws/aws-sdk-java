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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a header as an aggregate key for a rate-based rule. Each distinct value in the header contributes to the
 * aggregation instance. If you use a single header as your custom key, then each value fully defines an aggregation
 * instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/RateLimitHeader" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RateLimitHeader implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the header to use.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. Text transformations are used in rule match statements, to transform the
     * <code>FieldToMatch</code> request component before inspecting it, and they're used in rate-based rule statements,
     * to transform request components before using them as custom aggregation keys. If you specify one or more
     * transformations to apply, WAF performs all transformations on the specified content, starting from the lowest
     * priority setting, and then uses the transformed component contents.
     * </p>
     */
    private java.util.List<TextTransformation> textTransformations;

    /**
     * <p>
     * The name of the header to use.
     * </p>
     * 
     * @param name
     *        The name of the header to use.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the header to use.
     * </p>
     * 
     * @return The name of the header to use.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the header to use.
     * </p>
     * 
     * @param name
     *        The name of the header to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateLimitHeader withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. Text transformations are used in rule match statements, to transform the
     * <code>FieldToMatch</code> request component before inspecting it, and they're used in rate-based rule statements,
     * to transform request components before using them as custom aggregation keys. If you specify one or more
     * transformations to apply, WAF performs all transformations on the specified content, starting from the lowest
     * priority setting, and then uses the transformed component contents.
     * </p>
     * 
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *         effort to bypass detection. Text transformations are used in rule match statements, to transform the
     *         <code>FieldToMatch</code> request component before inspecting it, and they're used in rate-based rule
     *         statements, to transform request components before using them as custom aggregation keys. If you specify
     *         one or more transformations to apply, WAF performs all transformations on the specified content, starting
     *         from the lowest priority setting, and then uses the transformed component contents.
     */

    public java.util.List<TextTransformation> getTextTransformations() {
        return textTransformations;
    }

    /**
     * <p>
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
     * bypass detection. Text transformations are used in rule match statements, to transform the
     * <code>FieldToMatch</code> request component before inspecting it, and they're used in rate-based rule statements,
     * to transform request components before using them as custom aggregation keys. If you specify one or more
     * transformations to apply, WAF performs all transformations on the specified content, starting from the lowest
     * priority setting, and then uses the transformed component contents.
     * </p>
     * 
     * @param textTransformations
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass detection. Text transformations are used in rule match statements, to transform the
     *        <code>FieldToMatch</code> request component before inspecting it, and they're used in rate-based rule
     *        statements, to transform request components before using them as custom aggregation keys. If you specify
     *        one or more transformations to apply, WAF performs all transformations on the specified content, starting
     *        from the lowest priority setting, and then uses the transformed component contents.
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
     * bypass detection. Text transformations are used in rule match statements, to transform the
     * <code>FieldToMatch</code> request component before inspecting it, and they're used in rate-based rule statements,
     * to transform request components before using them as custom aggregation keys. If you specify one or more
     * transformations to apply, WAF performs all transformations on the specified content, starting from the lowest
     * priority setting, and then uses the transformed component contents.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTextTransformations(java.util.Collection)} or {@link #withTextTransformations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param textTransformations
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass detection. Text transformations are used in rule match statements, to transform the
     *        <code>FieldToMatch</code> request component before inspecting it, and they're used in rate-based rule
     *        statements, to transform request components before using them as custom aggregation keys. If you specify
     *        one or more transformations to apply, WAF performs all transformations on the specified content, starting
     *        from the lowest priority setting, and then uses the transformed component contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateLimitHeader withTextTransformations(TextTransformation... textTransformations) {
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
     * bypass detection. Text transformations are used in rule match statements, to transform the
     * <code>FieldToMatch</code> request component before inspecting it, and they're used in rate-based rule statements,
     * to transform request components before using them as custom aggregation keys. If you specify one or more
     * transformations to apply, WAF performs all transformations on the specified content, starting from the lowest
     * priority setting, and then uses the transformed component contents.
     * </p>
     * 
     * @param textTransformations
     *        Text transformations eliminate some of the unusual formatting that attackers use in web requests in an
     *        effort to bypass detection. Text transformations are used in rule match statements, to transform the
     *        <code>FieldToMatch</code> request component before inspecting it, and they're used in rate-based rule
     *        statements, to transform request components before using them as custom aggregation keys. If you specify
     *        one or more transformations to apply, WAF performs all transformations on the specified content, starting
     *        from the lowest priority setting, and then uses the transformed component contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateLimitHeader withTextTransformations(java.util.Collection<TextTransformation> textTransformations) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof RateLimitHeader == false)
            return false;
        RateLimitHeader other = (RateLimitHeader) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTextTransformations() == null) ? 0 : getTextTransformations().hashCode());
        return hashCode;
    }

    @Override
    public RateLimitHeader clone() {
        try {
            return (RateLimitHeader) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.RateLimitHeaderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
