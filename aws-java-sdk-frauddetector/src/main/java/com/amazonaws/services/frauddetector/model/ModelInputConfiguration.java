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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The model input configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/ModelInputConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelInputConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The format of the model input configuration. The format differs depending on if it is passed through to SageMaker
     * or constructed by Amazon Fraud Detector.
     * </p>
     */
    private String format;
    /**
     * <p>
     * For an opaque-model, the input to the model will be a ByteBuffer blob provided in the getPrediction request, and
     * will be passed to SageMaker as-is. For non-opaque models, the input will be constructed by Amazon Fraud Detector
     * based on the model-configuration.
     * </p>
     */
    private Boolean isOpaque;
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
     * For an opaque-model, the input to the model will be a ByteBuffer blob provided in the getPrediction request, and
     * will be passed to SageMaker as-is. For non-opaque models, the input will be constructed by Amazon Fraud Detector
     * based on the model-configuration.
     * </p>
     * 
     * @param isOpaque
     *        For an opaque-model, the input to the model will be a ByteBuffer blob provided in the getPrediction
     *        request, and will be passed to SageMaker as-is. For non-opaque models, the input will be constructed by
     *        Amazon Fraud Detector based on the model-configuration.
     */

    public void setIsOpaque(Boolean isOpaque) {
        this.isOpaque = isOpaque;
    }

    /**
     * <p>
     * For an opaque-model, the input to the model will be a ByteBuffer blob provided in the getPrediction request, and
     * will be passed to SageMaker as-is. For non-opaque models, the input will be constructed by Amazon Fraud Detector
     * based on the model-configuration.
     * </p>
     * 
     * @return For an opaque-model, the input to the model will be a ByteBuffer blob provided in the getPrediction
     *         request, and will be passed to SageMaker as-is. For non-opaque models, the input will be constructed by
     *         Amazon Fraud Detector based on the model-configuration.
     */

    public Boolean getIsOpaque() {
        return this.isOpaque;
    }

    /**
     * <p>
     * For an opaque-model, the input to the model will be a ByteBuffer blob provided in the getPrediction request, and
     * will be passed to SageMaker as-is. For non-opaque models, the input will be constructed by Amazon Fraud Detector
     * based on the model-configuration.
     * </p>
     * 
     * @param isOpaque
     *        For an opaque-model, the input to the model will be a ByteBuffer blob provided in the getPrediction
     *        request, and will be passed to SageMaker as-is. For non-opaque models, the input will be constructed by
     *        Amazon Fraud Detector based on the model-configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelInputConfiguration withIsOpaque(Boolean isOpaque) {
        setIsOpaque(isOpaque);
        return this;
    }

    /**
     * <p>
     * For an opaque-model, the input to the model will be a ByteBuffer blob provided in the getPrediction request, and
     * will be passed to SageMaker as-is. For non-opaque models, the input will be constructed by Amazon Fraud Detector
     * based on the model-configuration.
     * </p>
     * 
     * @return For an opaque-model, the input to the model will be a ByteBuffer blob provided in the getPrediction
     *         request, and will be passed to SageMaker as-is. For non-opaque models, the input will be constructed by
     *         Amazon Fraud Detector based on the model-configuration.
     */

    public Boolean isOpaque() {
        return this.isOpaque;
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getIsOpaque() != null)
            sb.append("IsOpaque: ").append(getIsOpaque()).append(",");
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
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getIsOpaque() == null ^ this.getIsOpaque() == null)
            return false;
        if (other.getIsOpaque() != null && other.getIsOpaque().equals(this.getIsOpaque()) == false)
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

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getIsOpaque() == null) ? 0 : getIsOpaque().hashCode());
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
