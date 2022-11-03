/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Template summary information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/TemplateSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The template name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template.
     * </p>
     */
    private String templateArn;
    /**
     * <p>
     * The unique identifier for the template.
     * </p>
     */
    private String templateId;

    /**
     * <p>
     * The template name.
     * </p>
     * 
     * @param name
     *        The template name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The template name.
     * </p>
     * 
     * @return The template name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The template name.
     * </p>
     * 
     * @param name
     *        The template name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withName(String name) {
        setName(name);
        return this;
    }

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

    public TemplateSummary withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the template.
     * </p>
     * 
     * @param templateId
     *        The unique identifier for the template.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * The unique identifier for the template.
     * </p>
     * 
     * @return The unique identifier for the template.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * The unique identifier for the template.
     * </p>
     * 
     * @param templateId
     *        The unique identifier for the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withTemplateId(String templateId) {
        setTemplateId(templateId);
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
        if (getTemplateArn() != null)
            sb.append("TemplateArn: ").append(getTemplateArn()).append(",");
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateSummary == false)
            return false;
        TemplateSummary other = (TemplateSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        return hashCode;
    }

    @Override
    public TemplateSummary clone() {
        try {
            return (TemplateSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.TemplateSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
