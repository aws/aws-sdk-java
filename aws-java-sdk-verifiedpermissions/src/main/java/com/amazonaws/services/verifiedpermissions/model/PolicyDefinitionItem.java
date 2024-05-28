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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that describes a <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_PolicyDefinintion.html"
 * >PolicyDefinintion</a>. It will always have either an <code>StaticPolicy</code> or a
 * <code>TemplateLinkedPolicy</code> element.
 * </p>
 * <p>
 * This data type is used as a response parameter for the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreatePolicy.html">CreatePolicy</a> and
 * <a href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_ListPolicies.html">ListPolicies</a>
 * operations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/PolicyDefinitionItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyDefinitionItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about a static policy that wasn't created with a policy template.
     * </p>
     */
    private StaticPolicyDefinitionItem staticValue;
    /**
     * <p>
     * Information about a template-linked policy that was created by instantiating a policy template.
     * </p>
     */
    private TemplateLinkedPolicyDefinitionItem templateLinked;

    /**
     * <p>
     * Information about a static policy that wasn't created with a policy template.
     * </p>
     * 
     * @param staticValue
     *        Information about a static policy that wasn't created with a policy template.
     */

    public void setStatic(StaticPolicyDefinitionItem staticValue) {
        this.staticValue = staticValue;
    }

    /**
     * <p>
     * Information about a static policy that wasn't created with a policy template.
     * </p>
     * 
     * @return Information about a static policy that wasn't created with a policy template.
     */

    public StaticPolicyDefinitionItem getStatic() {
        return this.staticValue;
    }

    /**
     * <p>
     * Information about a static policy that wasn't created with a policy template.
     * </p>
     * 
     * @param staticValue
     *        Information about a static policy that wasn't created with a policy template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDefinitionItem withStatic(StaticPolicyDefinitionItem staticValue) {
        setStatic(staticValue);
        return this;
    }

    /**
     * <p>
     * Information about a template-linked policy that was created by instantiating a policy template.
     * </p>
     * 
     * @param templateLinked
     *        Information about a template-linked policy that was created by instantiating a policy template.
     */

    public void setTemplateLinked(TemplateLinkedPolicyDefinitionItem templateLinked) {
        this.templateLinked = templateLinked;
    }

    /**
     * <p>
     * Information about a template-linked policy that was created by instantiating a policy template.
     * </p>
     * 
     * @return Information about a template-linked policy that was created by instantiating a policy template.
     */

    public TemplateLinkedPolicyDefinitionItem getTemplateLinked() {
        return this.templateLinked;
    }

    /**
     * <p>
     * Information about a template-linked policy that was created by instantiating a policy template.
     * </p>
     * 
     * @param templateLinked
     *        Information about a template-linked policy that was created by instantiating a policy template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDefinitionItem withTemplateLinked(TemplateLinkedPolicyDefinitionItem templateLinked) {
        setTemplateLinked(templateLinked);
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
        if (getStatic() != null)
            sb.append("Static: ").append(getStatic()).append(",");
        if (getTemplateLinked() != null)
            sb.append("TemplateLinked: ").append(getTemplateLinked());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyDefinitionItem == false)
            return false;
        PolicyDefinitionItem other = (PolicyDefinitionItem) obj;
        if (other.getStatic() == null ^ this.getStatic() == null)
            return false;
        if (other.getStatic() != null && other.getStatic().equals(this.getStatic()) == false)
            return false;
        if (other.getTemplateLinked() == null ^ this.getTemplateLinked() == null)
            return false;
        if (other.getTemplateLinked() != null && other.getTemplateLinked().equals(this.getTemplateLinked()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatic() == null) ? 0 : getStatic().hashCode());
        hashCode = prime * hashCode + ((getTemplateLinked() == null) ? 0 : getTemplateLinked().hashCode());
        return hashCode;
    }

    @Override
    public PolicyDefinitionItem clone() {
        try {
            return (PolicyDefinitionItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.PolicyDefinitionItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
