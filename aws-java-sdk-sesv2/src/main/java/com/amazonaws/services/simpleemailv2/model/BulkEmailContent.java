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
 * An object that contains the body of the message. You can specify a template message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/BulkEmailContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BulkEmailContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The template to use for the bulk email message.
     * </p>
     */
    private Template template;

    /**
     * <p>
     * The template to use for the bulk email message.
     * </p>
     * 
     * @param template
     *        The template to use for the bulk email message.
     */

    public void setTemplate(Template template) {
        this.template = template;
    }

    /**
     * <p>
     * The template to use for the bulk email message.
     * </p>
     * 
     * @return The template to use for the bulk email message.
     */

    public Template getTemplate() {
        return this.template;
    }

    /**
     * <p>
     * The template to use for the bulk email message.
     * </p>
     * 
     * @param template
     *        The template to use for the bulk email message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkEmailContent withTemplate(Template template) {
        setTemplate(template);
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
        if (getTemplate() != null)
            sb.append("Template: ").append(getTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BulkEmailContent == false)
            return false;
        BulkEmailContent other = (BulkEmailContent) obj;
        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        return hashCode;
    }

    @Override
    public BulkEmailContent clone() {
        try {
            return (BulkEmailContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.BulkEmailContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
