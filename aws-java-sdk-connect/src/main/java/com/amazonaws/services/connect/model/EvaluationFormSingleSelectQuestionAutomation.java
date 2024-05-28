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
 * Information about the automation configuration in single select questions. Automation options are evaluated in order,
 * and the first matched option is applied. If no automation option matches, and there is a default option, then the
 * default option is applied.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EvaluationFormSingleSelectQuestionAutomation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationFormSingleSelectQuestionAutomation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The automation options of the single select question.
     * </p>
     */
    private java.util.List<EvaluationFormSingleSelectQuestionAutomationOption> options;
    /**
     * <p>
     * The identifier of the default answer option, when none of the automation options match the criteria.
     * </p>
     */
    private String defaultOptionRefId;

    /**
     * <p>
     * The automation options of the single select question.
     * </p>
     * 
     * @return The automation options of the single select question.
     */

    public java.util.List<EvaluationFormSingleSelectQuestionAutomationOption> getOptions() {
        return options;
    }

    /**
     * <p>
     * The automation options of the single select question.
     * </p>
     * 
     * @param options
     *        The automation options of the single select question.
     */

    public void setOptions(java.util.Collection<EvaluationFormSingleSelectQuestionAutomationOption> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        this.options = new java.util.ArrayList<EvaluationFormSingleSelectQuestionAutomationOption>(options);
    }

    /**
     * <p>
     * The automation options of the single select question.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptions(java.util.Collection)} or {@link #withOptions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param options
     *        The automation options of the single select question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSingleSelectQuestionAutomation withOptions(EvaluationFormSingleSelectQuestionAutomationOption... options) {
        if (this.options == null) {
            setOptions(new java.util.ArrayList<EvaluationFormSingleSelectQuestionAutomationOption>(options.length));
        }
        for (EvaluationFormSingleSelectQuestionAutomationOption ele : options) {
            this.options.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The automation options of the single select question.
     * </p>
     * 
     * @param options
     *        The automation options of the single select question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSingleSelectQuestionAutomation withOptions(java.util.Collection<EvaluationFormSingleSelectQuestionAutomationOption> options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The identifier of the default answer option, when none of the automation options match the criteria.
     * </p>
     * 
     * @param defaultOptionRefId
     *        The identifier of the default answer option, when none of the automation options match the criteria.
     */

    public void setDefaultOptionRefId(String defaultOptionRefId) {
        this.defaultOptionRefId = defaultOptionRefId;
    }

    /**
     * <p>
     * The identifier of the default answer option, when none of the automation options match the criteria.
     * </p>
     * 
     * @return The identifier of the default answer option, when none of the automation options match the criteria.
     */

    public String getDefaultOptionRefId() {
        return this.defaultOptionRefId;
    }

    /**
     * <p>
     * The identifier of the default answer option, when none of the automation options match the criteria.
     * </p>
     * 
     * @param defaultOptionRefId
     *        The identifier of the default answer option, when none of the automation options match the criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSingleSelectQuestionAutomation withDefaultOptionRefId(String defaultOptionRefId) {
        setDefaultOptionRefId(defaultOptionRefId);
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
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getDefaultOptionRefId() != null)
            sb.append("DefaultOptionRefId: ").append(getDefaultOptionRefId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormSingleSelectQuestionAutomation == false)
            return false;
        EvaluationFormSingleSelectQuestionAutomation other = (EvaluationFormSingleSelectQuestionAutomation) obj;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getDefaultOptionRefId() == null ^ this.getDefaultOptionRefId() == null)
            return false;
        if (other.getDefaultOptionRefId() != null && other.getDefaultOptionRefId().equals(this.getDefaultOptionRefId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getDefaultOptionRefId() == null) ? 0 : getDefaultOptionRefId().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationFormSingleSelectQuestionAutomation clone() {
        try {
            return (EvaluationFormSingleSelectQuestionAutomation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EvaluationFormSingleSelectQuestionAutomationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
