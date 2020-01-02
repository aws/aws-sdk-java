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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Parameters to define a mitigation action that adds a blank policy to restrict permissions.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplaceDefaultPolicyVersionParams implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the template to be applied. The only supported value is <code>BLANK_POLICY</code>.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * The name of the template to be applied. The only supported value is <code>BLANK_POLICY</code>.
     * </p>
     * 
     * @param templateName
     *        The name of the template to be applied. The only supported value is <code>BLANK_POLICY</code>.
     * @see PolicyTemplateName
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the template to be applied. The only supported value is <code>BLANK_POLICY</code>.
     * </p>
     * 
     * @return The name of the template to be applied. The only supported value is <code>BLANK_POLICY</code>.
     * @see PolicyTemplateName
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the template to be applied. The only supported value is <code>BLANK_POLICY</code>.
     * </p>
     * 
     * @param templateName
     *        The name of the template to be applied. The only supported value is <code>BLANK_POLICY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyTemplateName
     */

    public ReplaceDefaultPolicyVersionParams withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The name of the template to be applied. The only supported value is <code>BLANK_POLICY</code>.
     * </p>
     * 
     * @param templateName
     *        The name of the template to be applied. The only supported value is <code>BLANK_POLICY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyTemplateName
     */

    public ReplaceDefaultPolicyVersionParams withTemplateName(PolicyTemplateName templateName) {
        this.templateName = templateName.toString();
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
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplaceDefaultPolicyVersionParams == false)
            return false;
        ReplaceDefaultPolicyVersionParams other = (ReplaceDefaultPolicyVersionParams) obj;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public ReplaceDefaultPolicyVersionParams clone() {
        try {
            return (ReplaceDefaultPolicyVersionParams) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ReplaceDefaultPolicyVersionParamsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
