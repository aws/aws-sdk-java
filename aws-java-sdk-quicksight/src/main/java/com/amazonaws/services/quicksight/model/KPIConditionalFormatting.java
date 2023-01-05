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
 * The conditional formatting of a KPI visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/KPIConditionalFormatting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KPIConditionalFormatting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The conditional formatting options of a KPI visual.
     * </p>
     */
    private java.util.List<KPIConditionalFormattingOption> conditionalFormattingOptions;

    /**
     * <p>
     * The conditional formatting options of a KPI visual.
     * </p>
     * 
     * @return The conditional formatting options of a KPI visual.
     */

    public java.util.List<KPIConditionalFormattingOption> getConditionalFormattingOptions() {
        return conditionalFormattingOptions;
    }

    /**
     * <p>
     * The conditional formatting options of a KPI visual.
     * </p>
     * 
     * @param conditionalFormattingOptions
     *        The conditional formatting options of a KPI visual.
     */

    public void setConditionalFormattingOptions(java.util.Collection<KPIConditionalFormattingOption> conditionalFormattingOptions) {
        if (conditionalFormattingOptions == null) {
            this.conditionalFormattingOptions = null;
            return;
        }

        this.conditionalFormattingOptions = new java.util.ArrayList<KPIConditionalFormattingOption>(conditionalFormattingOptions);
    }

    /**
     * <p>
     * The conditional formatting options of a KPI visual.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConditionalFormattingOptions(java.util.Collection)} or
     * {@link #withConditionalFormattingOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param conditionalFormattingOptions
     *        The conditional formatting options of a KPI visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIConditionalFormatting withConditionalFormattingOptions(KPIConditionalFormattingOption... conditionalFormattingOptions) {
        if (this.conditionalFormattingOptions == null) {
            setConditionalFormattingOptions(new java.util.ArrayList<KPIConditionalFormattingOption>(conditionalFormattingOptions.length));
        }
        for (KPIConditionalFormattingOption ele : conditionalFormattingOptions) {
            this.conditionalFormattingOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The conditional formatting options of a KPI visual.
     * </p>
     * 
     * @param conditionalFormattingOptions
     *        The conditional formatting options of a KPI visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIConditionalFormatting withConditionalFormattingOptions(java.util.Collection<KPIConditionalFormattingOption> conditionalFormattingOptions) {
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

        if (obj instanceof KPIConditionalFormatting == false)
            return false;
        KPIConditionalFormatting other = (KPIConditionalFormatting) obj;
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
    public KPIConditionalFormatting clone() {
        try {
            return (KPIConditionalFormatting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.KPIConditionalFormattingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
