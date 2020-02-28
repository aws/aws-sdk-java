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
 * Provides the model output configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/ModelOutputConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelOutputConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The format of the model output configuration.
     * </p>
     */
    private String format;
    /**
     * <p>
     * A map of JSON keys in response from SageMaker to the Amazon Fraud Detector variables.
     * </p>
     */
    private java.util.Map<String, String> jsonKeyToVariableMap;
    /**
     * <p>
     * A map of CSV index values in the SageMaker response to the Amazon Fraud Detector variables.
     * </p>
     */
    private java.util.Map<String, String> csvIndexToVariableMap;

    /**
     * <p>
     * The format of the model output configuration.
     * </p>
     * 
     * @param format
     *        The format of the model output configuration.
     * @see ModelOutputDataFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the model output configuration.
     * </p>
     * 
     * @return The format of the model output configuration.
     * @see ModelOutputDataFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the model output configuration.
     * </p>
     * 
     * @param format
     *        The format of the model output configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelOutputDataFormat
     */

    public ModelOutputConfiguration withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the model output configuration.
     * </p>
     * 
     * @param format
     *        The format of the model output configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelOutputDataFormat
     */

    public ModelOutputConfiguration withFormat(ModelOutputDataFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * A map of JSON keys in response from SageMaker to the Amazon Fraud Detector variables.
     * </p>
     * 
     * @return A map of JSON keys in response from SageMaker to the Amazon Fraud Detector variables.
     */

    public java.util.Map<String, String> getJsonKeyToVariableMap() {
        return jsonKeyToVariableMap;
    }

    /**
     * <p>
     * A map of JSON keys in response from SageMaker to the Amazon Fraud Detector variables.
     * </p>
     * 
     * @param jsonKeyToVariableMap
     *        A map of JSON keys in response from SageMaker to the Amazon Fraud Detector variables.
     */

    public void setJsonKeyToVariableMap(java.util.Map<String, String> jsonKeyToVariableMap) {
        this.jsonKeyToVariableMap = jsonKeyToVariableMap;
    }

    /**
     * <p>
     * A map of JSON keys in response from SageMaker to the Amazon Fraud Detector variables.
     * </p>
     * 
     * @param jsonKeyToVariableMap
     *        A map of JSON keys in response from SageMaker to the Amazon Fraud Detector variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelOutputConfiguration withJsonKeyToVariableMap(java.util.Map<String, String> jsonKeyToVariableMap) {
        setJsonKeyToVariableMap(jsonKeyToVariableMap);
        return this;
    }

    /**
     * Add a single JsonKeyToVariableMap entry
     *
     * @see ModelOutputConfiguration#withJsonKeyToVariableMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ModelOutputConfiguration addJsonKeyToVariableMapEntry(String key, String value) {
        if (null == this.jsonKeyToVariableMap) {
            this.jsonKeyToVariableMap = new java.util.HashMap<String, String>();
        }
        if (this.jsonKeyToVariableMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.jsonKeyToVariableMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into JsonKeyToVariableMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelOutputConfiguration clearJsonKeyToVariableMapEntries() {
        this.jsonKeyToVariableMap = null;
        return this;
    }

    /**
     * <p>
     * A map of CSV index values in the SageMaker response to the Amazon Fraud Detector variables.
     * </p>
     * 
     * @return A map of CSV index values in the SageMaker response to the Amazon Fraud Detector variables.
     */

    public java.util.Map<String, String> getCsvIndexToVariableMap() {
        return csvIndexToVariableMap;
    }

    /**
     * <p>
     * A map of CSV index values in the SageMaker response to the Amazon Fraud Detector variables.
     * </p>
     * 
     * @param csvIndexToVariableMap
     *        A map of CSV index values in the SageMaker response to the Amazon Fraud Detector variables.
     */

    public void setCsvIndexToVariableMap(java.util.Map<String, String> csvIndexToVariableMap) {
        this.csvIndexToVariableMap = csvIndexToVariableMap;
    }

    /**
     * <p>
     * A map of CSV index values in the SageMaker response to the Amazon Fraud Detector variables.
     * </p>
     * 
     * @param csvIndexToVariableMap
     *        A map of CSV index values in the SageMaker response to the Amazon Fraud Detector variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelOutputConfiguration withCsvIndexToVariableMap(java.util.Map<String, String> csvIndexToVariableMap) {
        setCsvIndexToVariableMap(csvIndexToVariableMap);
        return this;
    }

    /**
     * Add a single CsvIndexToVariableMap entry
     *
     * @see ModelOutputConfiguration#withCsvIndexToVariableMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ModelOutputConfiguration addCsvIndexToVariableMapEntry(String key, String value) {
        if (null == this.csvIndexToVariableMap) {
            this.csvIndexToVariableMap = new java.util.HashMap<String, String>();
        }
        if (this.csvIndexToVariableMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.csvIndexToVariableMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CsvIndexToVariableMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelOutputConfiguration clearCsvIndexToVariableMapEntries() {
        this.csvIndexToVariableMap = null;
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
        if (getJsonKeyToVariableMap() != null)
            sb.append("JsonKeyToVariableMap: ").append(getJsonKeyToVariableMap()).append(",");
        if (getCsvIndexToVariableMap() != null)
            sb.append("CsvIndexToVariableMap: ").append(getCsvIndexToVariableMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelOutputConfiguration == false)
            return false;
        ModelOutputConfiguration other = (ModelOutputConfiguration) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getJsonKeyToVariableMap() == null ^ this.getJsonKeyToVariableMap() == null)
            return false;
        if (other.getJsonKeyToVariableMap() != null && other.getJsonKeyToVariableMap().equals(this.getJsonKeyToVariableMap()) == false)
            return false;
        if (other.getCsvIndexToVariableMap() == null ^ this.getCsvIndexToVariableMap() == null)
            return false;
        if (other.getCsvIndexToVariableMap() != null && other.getCsvIndexToVariableMap().equals(this.getCsvIndexToVariableMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getJsonKeyToVariableMap() == null) ? 0 : getJsonKeyToVariableMap().hashCode());
        hashCode = prime * hashCode + ((getCsvIndexToVariableMap() == null) ? 0 : getCsvIndexToVariableMap().hashCode());
        return hashCode;
    }

    @Override
    public ModelOutputConfiguration clone() {
        try {
            return (ModelOutputConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.ModelOutputConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
