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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The source entity of the template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TemplateSourceEntity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateSourceEntity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source analysis, if it is based on an analysis.
     * </p>
     */
    private TemplateSourceAnalysis sourceAnalysis;
    /**
     * <p>
     * The source template, if it is based on an template.
     * </p>
     */
    private TemplateSourceTemplate sourceTemplate;

    /**
     * <p>
     * The source analysis, if it is based on an analysis.
     * </p>
     * 
     * @param sourceAnalysis
     *        The source analysis, if it is based on an analysis.
     */

    public void setSourceAnalysis(TemplateSourceAnalysis sourceAnalysis) {
        this.sourceAnalysis = sourceAnalysis;
    }

    /**
     * <p>
     * The source analysis, if it is based on an analysis.
     * </p>
     * 
     * @return The source analysis, if it is based on an analysis.
     */

    public TemplateSourceAnalysis getSourceAnalysis() {
        return this.sourceAnalysis;
    }

    /**
     * <p>
     * The source analysis, if it is based on an analysis.
     * </p>
     * 
     * @param sourceAnalysis
     *        The source analysis, if it is based on an analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSourceEntity withSourceAnalysis(TemplateSourceAnalysis sourceAnalysis) {
        setSourceAnalysis(sourceAnalysis);
        return this;
    }

    /**
     * <p>
     * The source template, if it is based on an template.
     * </p>
     * 
     * @param sourceTemplate
     *        The source template, if it is based on an template.
     */

    public void setSourceTemplate(TemplateSourceTemplate sourceTemplate) {
        this.sourceTemplate = sourceTemplate;
    }

    /**
     * <p>
     * The source template, if it is based on an template.
     * </p>
     * 
     * @return The source template, if it is based on an template.
     */

    public TemplateSourceTemplate getSourceTemplate() {
        return this.sourceTemplate;
    }

    /**
     * <p>
     * The source template, if it is based on an template.
     * </p>
     * 
     * @param sourceTemplate
     *        The source template, if it is based on an template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSourceEntity withSourceTemplate(TemplateSourceTemplate sourceTemplate) {
        setSourceTemplate(sourceTemplate);
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
        if (getSourceAnalysis() != null)
            sb.append("SourceAnalysis: ").append(getSourceAnalysis()).append(",");
        if (getSourceTemplate() != null)
            sb.append("SourceTemplate: ").append(getSourceTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateSourceEntity == false)
            return false;
        TemplateSourceEntity other = (TemplateSourceEntity) obj;
        if (other.getSourceAnalysis() == null ^ this.getSourceAnalysis() == null)
            return false;
        if (other.getSourceAnalysis() != null && other.getSourceAnalysis().equals(this.getSourceAnalysis()) == false)
            return false;
        if (other.getSourceTemplate() == null ^ this.getSourceTemplate() == null)
            return false;
        if (other.getSourceTemplate() != null && other.getSourceTemplate().equals(this.getSourceTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceAnalysis() == null) ? 0 : getSourceAnalysis().hashCode());
        hashCode = prime * hashCode + ((getSourceTemplate() == null) ? 0 : getSourceTemplate().hashCode());
        return hashCode;
    }

    @Override
    public TemplateSourceEntity clone() {
        try {
            return (TemplateSourceEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TemplateSourceEntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
