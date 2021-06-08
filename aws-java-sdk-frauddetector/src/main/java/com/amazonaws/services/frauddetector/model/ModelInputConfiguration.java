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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon SageMaker model input configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/ModelInputConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelInputConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The event type name.
     * </p>
     */
    private String eventTypeName;
    /**
     * <p>
     * The format of the model input configuration. The format differs depending on if it is passed through to SageMaker
     * or constructed by Amazon Fraud Detector.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The event variables.
     * </p>
     */
    private Boolean useEventVariables;
    /**
     * <p>
     * Template for constructing the JSON input-data sent to SageMaker. At event-evaluation, the placeholders for
     * variable names in the template will be replaced with the variable values before being sent to SageMaker.
     * </p>
     */
    private String jsonInputTemplate;
    /**
     * <p>
     * Template for constructing the CSV input-data sent to SageMaker. At event-evaluation, the placeholders for
     * variable-names in the template will be replaced with the variable values before being sent to SageMaker.
     * </p>
     */
    private String csvInputTemplate;

    /**
     * <p>
     * The event type name.
     * </p>
     * 
     * @param eventTypeName
     *        The event type name.
     */

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    /**
     * <p>
     * The event type name.
     * </p>
     * 
     * @return The event type name.
     */

    public String getEventTypeName() {
        return this.eventTypeName;
    }

    /**
     * <p>
     * The event type name.
     * </p>
     * 
     * @param eventTypeName
     *        The event type name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelInputConfiguration withEventTypeName(String eventTypeName) {
        setEventTypeName(eventTypeName);
        return this;
    }

    /**
     * <p>
     * The format of the model input configuration. The format differs depending on if it is passed through to SageMaker
     * or constructed by Amazon Fraud Detector.
     * </p>
     * 
     * @param format
     *        The format of the model input configuration. The format differs depending on if it is passed through to
     *        SageMaker or constructed by Amazon Fraud Detector.
     * @see ModelInputDataFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the model input configuration. The format differs depending on if it is passed through to SageMaker
     * or constructed by Amazon Fraud Detector.
     * </p>
     * 
     * @return The format of the model input configuration. The format differs depending on if it is passed through to
     *         SageMaker or constructed by Amazon Fraud Detector.
     * @see ModelInputDataFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the model input configuration. The format differs depending on if it is passed through to SageMaker
     * or constructed by Amazon Fraud Detector.
     * </p>
     * 
     * @param format
     *        The format of the model input configuration. The format differs depending on if it is passed through to
     *        SageMaker or constructed by Amazon Fraud Detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelInputDataFormat
     */

    public ModelInputConfiguration withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the model input configuration. The format differs depending on if it is passed through to SageMaker
     * or constructed by Amazon Fraud Detector.
     * </p>
     * 
     * @param format
     *        The format of the model input configuration. The format differs depending on if it is passed through to
     *        SageMaker or constructed by Amazon Fraud Detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelInputDataFormat
     */

    public ModelInputConfiguration withFormat(ModelInputDataFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The event variables.
     * </p>
     * 
     * @param useEventVariables
     *        The event variables.
     */

    public void setUseEventVariables(Boolean useEventVariables) {
        this.useEventVariables = useEventVariables;
    }

    /**
     * <p>
     * The event variables.
     * </p>
     * 
     * @return The event variables.
     */

    public Boolean getUseEventVariables() {
        return this.useEventVariables;
    }

    /**
     * <p>
     * The event variables.
     * </p>
     * 
     * @param useEventVariables
     *        The event variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelInputConfiguration withUseEventVariables(Boolean useEventVariables) {
        setUseEventVariables(useEventVariables);
        return this;
    }

    /**
     * <p>
     * The event variables.
     * </p>
     * 
     * @return The event variables.
     */

    public Boolean isUseEventVariables() {
        return this.useEventVariables;
    }

    /**
     * <p>
     * Template for constructing the JSON input-data sent to SageMaker. At event-evaluation, the placeholders for
     * variable names in the template will be replaced with the variable values before being sent to SageMaker.
     * </p>
     * 
     * @param jsonInputTemplate
     *        Template for constructing the JSON input-data sent to SageMaker. At event-evaluation, the placeholders for
     *        variable names in the template will be replaced with the variable values before being sent to SageMaker.
     */

    public void setJsonInputTemplate(String jsonInputTemplate) {
        this.jsonInputTemplate = jsonInputTemplate;
    }

    /**
     * <p>
     * Template for constructing the JSON input-data sent to SageMaker. At event-evaluation, the placeholders for
     * variable names in the template will be replaced with the variable values before being sent to SageMaker.
     * </p>
     * 
     * @return Template for constructing the JSON input-data sent to SageMaker. At event-evaluation, the placeholders
     *         for variable names in the template will be replaced with the variable values before being sent to
     *         SageMaker.
     */

    public String getJsonInputTemplate() {
        return this.jsonInputTemplate;
    }

    /**
     * <p>
     * Template for constructing the JSON input-data sent to SageMaker. At event-evaluation, the placeholders for
     * variable names in the template will be replaced with the variable values before being sent to SageMaker.
     * </p>
     * 
     * @param jsonInputTemplate
     *        Template for constructing the JSON input-data sent to SageMaker. At event-evaluation, the placeholders for
     *        variable names in the template will be replaced with the variable values before being sent to SageMaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelInputConfiguration withJsonInputTemplate(String jsonInputTemplate) {
        setJsonInputTemplate(jsonInputTemplate);
        return this;
    }

    /**
     * <p>
     * Template for constructing the CSV input-data sent to SageMaker. At event-evaluation, the placeholders for
     * variable-names in the template will be replaced with the variable values before being sent to SageMaker.
     * </p>
     * 
     * @param csvInputTemplate
     *        Template for constructing the CSV input-data sent to SageMaker. At event-evaluation, the placeholders for
     *        variable-names in the template will be replaced with the variable values before being sent to SageMaker.
     */

    public void setCsvInputTemplate(String csvInputTemplate) {
        this.csvInputTemplate = csvInputTemplate;
    }

    /**
     * <p>
     * Template for constructing the CSV input-data sent to SageMaker. At event-evaluation, the placeholders for
     * variable-names in the template will be replaced with the variable values before being sent to SageMaker.
     * </p>
     * 
     * @return Template for constructing the CSV input-data sent to SageMaker. At event-evaluation, the placeholders for
     *         variable-names in the template will be replaced with the variable values before being sent to SageMaker.
     */

    public String getCsvInputTemplate() {
        return this.csvInputTemplate;
    }

    /**
     * <p>
     * Template for constructing the CSV input-data sent to SageMaker. At event-evaluation, the placeholders for
     * variable-names in the template will be replaced with the variable values before being sent to SageMaker.
     * </p>
     * 
     * @param csvInputTemplate
     *        Template for constructing the CSV input-data sent to SageMaker. At event-evaluation, the placeholders for
     *        variable-names in the template will be replaced with the variable values before being sent to SageMaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelInputConfiguration withCsvInputTemplate(String csvInputTemplate) {
        setCsvInputTemplate(csvInputTemplate);
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
        if (getEventTypeName() != null)
            sb.append("EventTypeName: ").append(getEventTypeName()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getUseEventVariables() != null)
            sb.append("UseEventVariables: ").append(getUseEventVariables()).append(",");
        if (getJsonInputTemplate() != null)
            sb.append("JsonInputTemplate: ").append(getJsonInputTemplate()).append(",");
        if (getCsvInputTemplate() != null)
            sb.append("CsvInputTemplate: ").append(getCsvInputTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelInputConfiguration == false)
            return false;
        ModelInputConfiguration other = (ModelInputConfiguration) obj;
        if (other.getEventTypeName() == null ^ this.getEventTypeName() == null)
            return false;
        if (other.getEventTypeName() != null && other.getEventTypeName().equals(this.getEventTypeName()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getUseEventVariables() == null ^ this.getUseEventVariables() == null)
            return false;
        if (other.getUseEventVariables() != null && other.getUseEventVariables().equals(this.getUseEventVariables()) == false)
            return false;
        if (other.getJsonInputTemplate() == null ^ this.getJsonInputTemplate() == null)
            return false;
        if (other.getJsonInputTemplate() != null && other.getJsonInputTemplate().equals(this.getJsonInputTemplate()) == false)
            return false;
        if (other.getCsvInputTemplate() == null ^ this.getCsvInputTemplate() == null)
            return false;
        if (other.getCsvInputTemplate() != null && other.getCsvInputTemplate().equals(this.getCsvInputTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventTypeName() == null) ? 0 : getEventTypeName().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getUseEventVariables() == null) ? 0 : getUseEventVariables().hashCode());
        hashCode = prime * hashCode + ((getJsonInputTemplate() == null) ? 0 : getJsonInputTemplate().hashCode());
        hashCode = prime * hashCode + ((getCsvInputTemplate() == null) ? 0 : getCsvInputTemplate().hashCode());
        return hashCode;
    }

    @Override
    public ModelInputConfiguration clone() {
        try {
            return (ModelInputConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.ModelInputConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
