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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that defines the email template to use for an email message, and the values to use for any message
 * variables in that template. An <i>email template</i> is a type of message template that contains content that you
 * want to define, save, and reuse in email messages that you send.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/Template" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Template implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template.
     * </p>
     */
    private String templateArn;
    /**
     * <p>
     * An object that defines the values to use for message variables in the template. This object is a set of key-value
     * pairs. Each key defines a message variable in the template. The corresponding value defines the value to use for
     * that variable.
     * </p>
     */
    private String templateData;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template.
     * </p>
     * 
     * @param templateArn
     *        The Amazon Resource Name (ARN) of the template.
     */

    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the template.
     */

    public String getTemplateArn() {
        return this.templateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template.
     * </p>
     * 
     * @param templateArn
     *        The Amazon Resource Name (ARN) of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Template withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
        return this;
    }

    /**
     * <p>
     * An object that defines the values to use for message variables in the template. This object is a set of key-value
     * pairs. Each key defines a message variable in the template. The corresponding value defines the value to use for
     * that variable.
     * </p>
     * 
     * @param templateData
     *        An object that defines the values to use for message variables in the template. This object is a set of
     *        key-value pairs. Each key defines a message variable in the template. The corresponding value defines the
     *        value to use for that variable.
     */

    public void setTemplateData(String templateData) {
        this.templateData = templateData;
    }

    /**
     * <p>
     * An object that defines the values to use for message variables in the template. This object is a set of key-value
     * pairs. Each key defines a message variable in the template. The corresponding value defines the value to use for
     * that variable.
     * </p>
     * 
     * @return An object that defines the values to use for message variables in the template. This object is a set of
     *         key-value pairs. Each key defines a message variable in the template. The corresponding value defines the
     *         value to use for that variable.
     */

    public String getTemplateData() {
        return this.templateData;
    }

    /**
     * <p>
     * An object that defines the values to use for message variables in the template. This object is a set of key-value
     * pairs. Each key defines a message variable in the template. The corresponding value defines the value to use for
     * that variable.
     * </p>
     * 
     * @param templateData
     *        An object that defines the values to use for message variables in the template. This object is a set of
     *        key-value pairs. Each key defines a message variable in the template. The corresponding value defines the
     *        value to use for that variable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Template withTemplateData(String templateData) {
        setTemplateData(templateData);
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
        if (getTemplateArn() != null)
            sb.append("TemplateArn: ").append(getTemplateArn()).append(",");
        if (getTemplateData() != null)
            sb.append("TemplateData: ").append(getTemplateData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Template == false)
            return false;
        Template other = (Template) obj;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getTemplateData() == null ^ this.getTemplateData() == null)
            return false;
        if (other.getTemplateData() != null && other.getTemplateData().equals(this.getTemplateData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getTemplateData() == null) ? 0 : getTemplateData().hashCode());
        return hashCode;
    }

    @Override
    public Template clone() {
        try {
            return (Template) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.TemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
