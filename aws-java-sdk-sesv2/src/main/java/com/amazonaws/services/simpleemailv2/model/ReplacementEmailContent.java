/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The <code>ReplaceEmailContent</code> object to be used for a specific <code>BulkEmailEntry</code>. The
 * <code>ReplacementTemplate</code> can be specified within this object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ReplacementEmailContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplacementEmailContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>ReplacementTemplate</code> associated with <code>ReplacementEmailContent</code>.
     * </p>
     */
    private ReplacementTemplate replacementTemplate;

    /**
     * <p>
     * The <code>ReplacementTemplate</code> associated with <code>ReplacementEmailContent</code>.
     * </p>
     * 
     * @param replacementTemplate
     *        The <code>ReplacementTemplate</code> associated with <code>ReplacementEmailContent</code>.
     */

    public void setReplacementTemplate(ReplacementTemplate replacementTemplate) {
        this.replacementTemplate = replacementTemplate;
    }

    /**
     * <p>
     * The <code>ReplacementTemplate</code> associated with <code>ReplacementEmailContent</code>.
     * </p>
     * 
     * @return The <code>ReplacementTemplate</code> associated with <code>ReplacementEmailContent</code>.
     */

    public ReplacementTemplate getReplacementTemplate() {
        return this.replacementTemplate;
    }

    /**
     * <p>
     * The <code>ReplacementTemplate</code> associated with <code>ReplacementEmailContent</code>.
     * </p>
     * 
     * @param replacementTemplate
     *        The <code>ReplacementTemplate</code> associated with <code>ReplacementEmailContent</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplacementEmailContent withReplacementTemplate(ReplacementTemplate replacementTemplate) {
        setReplacementTemplate(replacementTemplate);
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
        if (getReplacementTemplate() != null)
            sb.append("ReplacementTemplate: ").append(getReplacementTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplacementEmailContent == false)
            return false;
        ReplacementEmailContent other = (ReplacementEmailContent) obj;
        if (other.getReplacementTemplate() == null ^ this.getReplacementTemplate() == null)
            return false;
        if (other.getReplacementTemplate() != null && other.getReplacementTemplate().equals(this.getReplacementTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplacementTemplate() == null) ? 0 : getReplacementTemplate().hashCode());
        return hashCode;
    }

    @Override
    public ReplacementEmailContent clone() {
        try {
            return (ReplacementEmailContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.ReplacementEmailContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
