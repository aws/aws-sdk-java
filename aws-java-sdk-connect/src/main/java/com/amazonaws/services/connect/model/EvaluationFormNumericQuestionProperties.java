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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about properties for a numeric question in an evaluation form.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EvaluationFormNumericQuestionProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationFormNumericQuestionProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum answer value.
     * </p>
     */
    private Integer minValue;
    /**
     * <p>
     * The maximum answer value.
     * </p>
     */
    private Integer maxValue;
    /**
     * <p>
     * The scoring options of the numeric question.
     * </p>
     */
    private java.util.List<EvaluationFormNumericQuestionOption> options;
    /**
     * <p>
     * The automation properties of the numeric question.
     * </p>
     */
    private EvaluationFormNumericQuestionAutomation automation;

    /**
     * <p>
     * The minimum answer value.
     * </p>
     * 
     * @param minValue
     *        The minimum answer value.
     */

    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }

    /**
     * <p>
     * The minimum answer value.
     * </p>
     * 
     * @return The minimum answer value.
     */

    public Integer getMinValue() {
        return this.minValue;
    }

    /**
     * <p>
     * The minimum answer value.
     * </p>
     * 
     * @param minValue
     *        The minimum answer value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormNumericQuestionProperties withMinValue(Integer minValue) {
        setMinValue(minValue);
        return this;
    }

    /**
     * <p>
     * The maximum answer value.
     * </p>
     * 
     * @param maxValue
     *        The maximum answer value.
     */

    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * <p>
     * The maximum answer value.
     * </p>
     * 
     * @return The maximum answer value.
     */

    public Integer getMaxValue() {
        return this.maxValue;
    }

    /**
     * <p>
     * The maximum answer value.
     * </p>
     * 
     * @param maxValue
     *        The maximum answer value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormNumericQuestionProperties withMaxValue(Integer maxValue) {
        setMaxValue(maxValue);
        return this;
    }

    /**
     * <p>
     * The scoring options of the numeric question.
     * </p>
     * 
     * @return The scoring options of the numeric question.
     */

    public java.util.List<EvaluationFormNumericQuestionOption> getOptions() {
        return options;
    }

    /**
     * <p>
     * The scoring options of the numeric question.
     * </p>
     * 
     * @param options
     *        The scoring options of the numeric question.
     */

    public void setOptions(java.util.Collection<EvaluationFormNumericQuestionOption> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        this.options = new java.util.ArrayList<EvaluationFormNumericQuestionOption>(options);
    }

    /**
     * <p>
     * The scoring options of the numeric question.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptions(java.util.Collection)} or {@link #withOptions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param options
     *        The scoring options of the numeric question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormNumericQuestionProperties withOptions(EvaluationFormNumericQuestionOption... options) {
        if (this.options == null) {
            setOptions(new java.util.ArrayList<EvaluationFormNumericQuestionOption>(options.length));
        }
        for (EvaluationFormNumericQuestionOption ele : options) {
            this.options.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The scoring options of the numeric question.
     * </p>
     * 
     * @param options
     *        The scoring options of the numeric question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormNumericQuestionProperties withOptions(java.util.Collection<EvaluationFormNumericQuestionOption> options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The automation properties of the numeric question.
     * </p>
     * 
     * @param automation
     *        The automation properties of the numeric question.
     */

    public void setAutomation(EvaluationFormNumericQuestionAutomation automation) {
        this.automation = automation;
    }

    /**
     * <p>
     * The automation properties of the numeric question.
     * </p>
     * 
     * @return The automation properties of the numeric question.
     */

    public EvaluationFormNumericQuestionAutomation getAutomation() {
        return this.automation;
    }

    /**
     * <p>
     * The automation properties of the numeric question.
     * </p>
     * 
     * @param automation
     *        The automation properties of the numeric question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormNumericQuestionProperties withAutomation(EvaluationFormNumericQuestionAutomation automation) {
        setAutomation(automation);
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
        if (getMinValue() != null)
            sb.append("MinValue: ").append(getMinValue()).append(",");
        if (getMaxValue() != null)
            sb.append("MaxValue: ").append(getMaxValue()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getAutomation() != null)
            sb.append("Automation: ").append(getAutomation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormNumericQuestionProperties == false)
            return false;
        EvaluationFormNumericQuestionProperties other = (EvaluationFormNumericQuestionProperties) obj;
        if (other.getMinValue() == null ^ this.getMinValue() == null)
            return false;
        if (other.getMinValue() != null && other.getMinValue().equals(this.getMinValue()) == false)
            return false;
        if (other.getMaxValue() == null ^ this.getMaxValue() == null)
            return false;
        if (other.getMaxValue() != null && other.getMaxValue().equals(this.getMaxValue()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getAutomation() == null ^ this.getAutomation() == null)
            return false;
        if (other.getAutomation() != null && other.getAutomation().equals(this.getAutomation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinValue() == null) ? 0 : getMinValue().hashCode());
        hashCode = prime * hashCode + ((getMaxValue() == null) ? 0 : getMaxValue().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getAutomation() == null) ? 0 : getAutomation().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationFormNumericQuestionProperties clone() {
        try {
            return (EvaluationFormNumericQuestionProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EvaluationFormNumericQuestionPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
