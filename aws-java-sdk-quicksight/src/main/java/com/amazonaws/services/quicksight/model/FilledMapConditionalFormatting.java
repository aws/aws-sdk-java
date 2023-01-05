/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The conditional formatting of a <code>FilledMapVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FilledMapConditionalFormatting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilledMapConditionalFormatting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Conditional formatting options of a <code>FilledMapVisual</code>.
     * </p>
     */
    private java.util.List<FilledMapConditionalFormattingOption> conditionalFormattingOptions;

    /**
     * <p>
     * Conditional formatting options of a <code>FilledMapVisual</code>.
     * </p>
     * 
     * @return Conditional formatting options of a <code>FilledMapVisual</code>.
     */

    public java.util.List<FilledMapConditionalFormattingOption> getConditionalFormattingOptions() {
        return conditionalFormattingOptions;
    }

    /**
     * <p>
     * Conditional formatting options of a <code>FilledMapVisual</code>.
     * </p>
     * 
     * @param conditionalFormattingOptions
     *        Conditional formatting options of a <code>FilledMapVisual</code>.
     */

    public void setConditionalFormattingOptions(java.util.Collection<FilledMapConditionalFormattingOption> conditionalFormattingOptions) {
        if (conditionalFormattingOptions == null) {
            this.conditionalFormattingOptions = null;
            return;
        }

        this.conditionalFormattingOptions = new java.util.ArrayList<FilledMapConditionalFormattingOption>(conditionalFormattingOptions);
    }

    /**
     * <p>
     * Conditional formatting options of a <code>FilledMapVisual</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConditionalFormattingOptions(java.util.Collection)} or
     * {@link #withConditionalFormattingOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param conditionalFormattingOptions
     *        Conditional formatting options of a <code>FilledMapVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilledMapConditionalFormatting withConditionalFormattingOptions(FilledMapConditionalFormattingOption... conditionalFormattingOptions) {
        if (this.conditionalFormattingOptions == null) {
            setConditionalFormattingOptions(new java.util.ArrayList<FilledMapConditionalFormattingOption>(conditionalFormattingOptions.length));
        }
        for (FilledMapConditionalFormattingOption ele : conditionalFormattingOptions) {
            this.conditionalFormattingOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Conditional formatting options of a <code>FilledMapVisual</code>.
     * </p>
     * 
     * @param conditionalFormattingOptions
     *        Conditional formatting options of a <code>FilledMapVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilledMapConditionalFormatting withConditionalFormattingOptions(
            java.util.Collection<FilledMapConditionalFormattingOption> conditionalFormattingOptions) {
        setConditionalFormattingOptions(conditionalFormattingOptions);
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
        if (getConditionalFormattingOptions() != null)
            sb.append("ConditionalFormattingOptions: ").append(getConditionalFormattingOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilledMapConditionalFormatting == false)
            return false;
        FilledMapConditionalFormatting other = (FilledMapConditionalFormatting) obj;
        if (other.getConditionalFormattingOptions() == null ^ this.getConditionalFormattingOptions() == null)
            return false;
        if (other.getConditionalFormattingOptions() != null && other.getConditionalFormattingOptions().equals(this.getConditionalFormattingOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConditionalFormattingOptions() == null) ? 0 : getConditionalFormattingOptions().hashCode());
        return hashCode;
    }

    @Override
    public FilledMapConditionalFormatting clone() {
        try {
            return (FilledMapConditionalFormatting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FilledMapConditionalFormattingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
