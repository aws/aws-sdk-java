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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The source entity of an analysis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AnalysisSourceEntity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisSourceEntity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source template for the source entity of the analysis.
     * </p>
     */
    private AnalysisSourceTemplate sourceTemplate;

    /**
     * <p>
     * The source template for the source entity of the analysis.
     * </p>
     * 
     * @param sourceTemplate
     *        The source template for the source entity of the analysis.
     */

    public void setSourceTemplate(AnalysisSourceTemplate sourceTemplate) {
        this.sourceTemplate = sourceTemplate;
    }

    /**
     * <p>
     * The source template for the source entity of the analysis.
     * </p>
     * 
     * @return The source template for the source entity of the analysis.
     */

    public AnalysisSourceTemplate getSourceTemplate() {
        return this.sourceTemplate;
    }

    /**
     * <p>
     * The source template for the source entity of the analysis.
     * </p>
     * 
     * @param sourceTemplate
     *        The source template for the source entity of the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisSourceEntity withSourceTemplate(AnalysisSourceTemplate sourceTemplate) {
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

        if (obj instanceof AnalysisSourceEntity == false)
            return false;
        AnalysisSourceEntity other = (AnalysisSourceEntity) obj;
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

        hashCode = prime * hashCode + ((getSourceTemplate() == null) ? 0 : getSourceTemplate().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisSourceEntity clone() {
        try {
            return (AnalysisSourceEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AnalysisSourceEntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
