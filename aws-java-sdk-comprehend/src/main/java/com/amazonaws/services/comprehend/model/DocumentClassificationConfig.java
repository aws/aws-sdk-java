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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration required for a document classification model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DocumentClassificationConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentClassificationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Classification mode indicates whether the documents are <code>MULTI_CLASS</code> or <code>MULTI_LABEL</code>.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * One or more labels to associate with the custom classifier.
     * </p>
     */
    private java.util.List<String> labels;

    /**
     * <p>
     * Classification mode indicates whether the documents are <code>MULTI_CLASS</code> or <code>MULTI_LABEL</code>.
     * </p>
     * 
     * @param mode
     *        Classification mode indicates whether the documents are <code>MULTI_CLASS</code> or
     *        <code>MULTI_LABEL</code>.
     * @see DocumentClassifierMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Classification mode indicates whether the documents are <code>MULTI_CLASS</code> or <code>MULTI_LABEL</code>.
     * </p>
     * 
     * @return Classification mode indicates whether the documents are <code>MULTI_CLASS</code> or
     *         <code>MULTI_LABEL</code>.
     * @see DocumentClassifierMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * Classification mode indicates whether the documents are <code>MULTI_CLASS</code> or <code>MULTI_LABEL</code>.
     * </p>
     * 
     * @param mode
     *        Classification mode indicates whether the documents are <code>MULTI_CLASS</code> or
     *        <code>MULTI_LABEL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentClassifierMode
     */

    public DocumentClassificationConfig withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * Classification mode indicates whether the documents are <code>MULTI_CLASS</code> or <code>MULTI_LABEL</code>.
     * </p>
     * 
     * @param mode
     *        Classification mode indicates whether the documents are <code>MULTI_CLASS</code> or
     *        <code>MULTI_LABEL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentClassifierMode
     */

    public DocumentClassificationConfig withMode(DocumentClassifierMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * One or more labels to associate with the custom classifier.
     * </p>
     * 
     * @return One or more labels to associate with the custom classifier.
     */

    public java.util.List<String> getLabels() {
        return labels;
    }

    /**
     * <p>
     * One or more labels to associate with the custom classifier.
     * </p>
     * 
     * @param labels
     *        One or more labels to associate with the custom classifier.
     */

    public void setLabels(java.util.Collection<String> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<String>(labels);
    }

    /**
     * <p>
     * One or more labels to associate with the custom classifier.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabels(java.util.Collection)} or {@link #withLabels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param labels
     *        One or more labels to associate with the custom classifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassificationConfig withLabels(String... labels) {
        if (this.labels == null) {
            setLabels(new java.util.ArrayList<String>(labels.length));
        }
        for (String ele : labels) {
            this.labels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more labels to associate with the custom classifier.
     * </p>
     * 
     * @param labels
     *        One or more labels to associate with the custom classifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassificationConfig withLabels(java.util.Collection<String> labels) {
        setLabels(labels);
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
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentClassificationConfig == false)
            return false;
        DocumentClassificationConfig other = (DocumentClassificationConfig) obj;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        return hashCode;
    }

    @Override
    public DocumentClassificationConfig clone() {
        try {
            return (DocumentClassificationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.DocumentClassificationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
