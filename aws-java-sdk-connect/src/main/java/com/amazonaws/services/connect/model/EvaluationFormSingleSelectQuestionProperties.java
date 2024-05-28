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
 * Information about the options in single select questions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EvaluationFormSingleSelectQuestionProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationFormSingleSelectQuestionProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The answer options of the single select question.
     * </p>
     */
    private java.util.List<EvaluationFormSingleSelectQuestionOption> options;
    /**
     * <p>
     * The display mode of the single select question.
     * </p>
     */
    private String displayAs;
    /**
     * <p>
     * The display mode of the single select question.
     * </p>
     */
    private EvaluationFormSingleSelectQuestionAutomation automation;

    /**
     * <p>
     * The answer options of the single select question.
     * </p>
     * 
     * @return The answer options of the single select question.
     */

    public java.util.List<EvaluationFormSingleSelectQuestionOption> getOptions() {
        return options;
    }

    /**
     * <p>
     * The answer options of the single select question.
     * </p>
     * 
     * @param options
     *        The answer options of the single select question.
     */

    public void setOptions(java.util.Collection<EvaluationFormSingleSelectQuestionOption> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        this.options = new java.util.ArrayList<EvaluationFormSingleSelectQuestionOption>(options);
    }

    /**
     * <p>
     * The answer options of the single select question.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptions(java.util.Collection)} or {@link #withOptions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param options
     *        The answer options of the single select question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSingleSelectQuestionProperties withOptions(EvaluationFormSingleSelectQuestionOption... options) {
        if (this.options == null) {
            setOptions(new java.util.ArrayList<EvaluationFormSingleSelectQuestionOption>(options.length));
        }
        for (EvaluationFormSingleSelectQuestionOption ele : options) {
            this.options.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The answer options of the single select question.
     * </p>
     * 
     * @param options
     *        The answer options of the single select question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSingleSelectQuestionProperties withOptions(java.util.Collection<EvaluationFormSingleSelectQuestionOption> options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The display mode of the single select question.
     * </p>
     * 
     * @param displayAs
     *        The display mode of the single select question.
     * @see EvaluationFormSingleSelectQuestionDisplayMode
     */

    public void setDisplayAs(String displayAs) {
        this.displayAs = displayAs;
    }

    /**
     * <p>
     * The display mode of the single select question.
     * </p>
     * 
     * @return The display mode of the single select question.
     * @see EvaluationFormSingleSelectQuestionDisplayMode
     */

    public String getDisplayAs() {
        return this.displayAs;
    }

    /**
     * <p>
     * The display mode of the single select question.
     * </p>
     * 
     * @param displayAs
     *        The display mode of the single select question.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationFormSingleSelectQuestionDisplayMode
     */

    public EvaluationFormSingleSelectQuestionProperties withDisplayAs(String displayAs) {
        setDisplayAs(displayAs);
        return this;
    }

    /**
     * <p>
     * The display mode of the single select question.
     * </p>
     * 
     * @param displayAs
     *        The display mode of the single select question.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationFormSingleSelectQuestionDisplayMode
     */

    public EvaluationFormSingleSelectQuestionProperties withDisplayAs(EvaluationFormSingleSelectQuestionDisplayMode displayAs) {
        this.displayAs = displayAs.toString();
        return this;
    }

    /**
     * <p>
     * The display mode of the single select question.
     * </p>
     * 
     * @param automation
     *        The display mode of the single select question.
     */

    public void setAutomation(EvaluationFormSingleSelectQuestionAutomation automation) {
        this.automation = automation;
    }

    /**
     * <p>
     * The display mode of the single select question.
     * </p>
     * 
     * @return The display mode of the single select question.
     */

    public EvaluationFormSingleSelectQuestionAutomation getAutomation() {
        return this.automation;
    }

    /**
     * <p>
     * The display mode of the single select question.
     * </p>
     * 
     * @param automation
     *        The display mode of the single select question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSingleSelectQuestionProperties withAutomation(EvaluationFormSingleSelectQuestionAutomation automation) {
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
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getDisplayAs() != null)
            sb.append("DisplayAs: ").append(getDisplayAs()).append(",");
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

        if (obj instanceof EvaluationFormSingleSelectQuestionProperties == false)
            return false;
        EvaluationFormSingleSelectQuestionProperties other = (EvaluationFormSingleSelectQuestionProperties) obj;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getDisplayAs() == null ^ this.getDisplayAs() == null)
            return false;
        if (other.getDisplayAs() != null && other.getDisplayAs().equals(this.getDisplayAs()) == false)
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

        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getDisplayAs() == null) ? 0 : getDisplayAs().hashCode());
        hashCode = prime * hashCode + ((getAutomation() == null) ? 0 : getAutomation().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationFormSingleSelectQuestionProperties clone() {
        try {
            return (EvaluationFormSingleSelectQuestionProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EvaluationFormSingleSelectQuestionPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
