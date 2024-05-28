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
 * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to
 * bypass detection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/TextTransformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextTransformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Sets the relative processing order for multiple transformations. WAF processes all transformations, from lowest
     * priority to highest, before inspecting the transformed content. The priorities don't need to be consecutive, but
     * they must all be different.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * For detailed descriptions of each of the transformation types, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-transformation.html">Text
     * transformations</a> in the <i>WAF Developer Guide</i>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Sets the relative processing order for multiple transformations. WAF processes all transformations, from lowest
     * priority to highest, before inspecting the transformed content. The priorities don't need to be consecutive, but
     * they must all be different.
     * </p>
     * 
     * @param priority
     *        Sets the relative processing order for multiple transformations. WAF processes all transformations, from
     *        lowest priority to highest, before inspecting the transformed content. The priorities don't need to be
     *        consecutive, but they must all be different.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * Sets the relative processing order for multiple transformations. WAF processes all transformations, from lowest
     * priority to highest, before inspecting the transformed content. The priorities don't need to be consecutive, but
     * they must all be different.
     * </p>
     * 
     * @return Sets the relative processing order for multiple transformations. WAF processes all transformations, from
     *         lowest priority to highest, before inspecting the transformed content. The priorities don't need to be
     *         consecutive, but they must all be different.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * Sets the relative processing order for multiple transformations. WAF processes all transformations, from lowest
     * priority to highest, before inspecting the transformed content. The priorities don't need to be consecutive, but
     * they must all be different.
     * </p>
     * 
     * @param priority
     *        Sets the relative processing order for multiple transformations. WAF processes all transformations, from
     *        lowest priority to highest, before inspecting the transformed content. The priorities don't need to be
     *        consecutive, but they must all be different.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextTransformation withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * For detailed descriptions of each of the transformation types, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-transformation.html">Text
     * transformations</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param type
     *        For detailed descriptions of each of the transformation types, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-transformation.html">Text
     *        transformations</a> in the <i>WAF Developer Guide</i>.
     * @see TextTransformationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * For detailed descriptions of each of the transformation types, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-transformation.html">Text
     * transformations</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @return For detailed descriptions of each of the transformation types, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-transformation.html">Text
     *         transformations</a> in the <i>WAF Developer Guide</i>.
     * @see TextTransformationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * For detailed descriptions of each of the transformation types, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-transformation.html">Text
     * transformations</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param type
     *        For detailed descriptions of each of the transformation types, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-transformation.html">Text
     *        transformations</a> in the <i>WAF Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TextTransformationType
     */

    public TextTransformation withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * For detailed descriptions of each of the transformation types, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-transformation.html">Text
     * transformations</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param type
     *        For detailed descriptions of each of the transformation types, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-transformation.html">Text
     *        transformations</a> in the <i>WAF Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TextTransformationType
     */

    public TextTransformation withType(TextTransformationType type) {
        this.type = type.toString();
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
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
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

        if (obj instanceof TextTransformation == false)
            return false;
        TextTransformation other = (TextTransformation) obj;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
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

        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public TextTransformation clone() {
        try {
            return (TextTransformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.TextTransformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
