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
 * Specifies the format and location of the input data for the dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DatasetInputDataConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetInputDataConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your custom model. An augmented manifest file
     * is a labeled dataset that is produced by Amazon SageMaker Ground Truth.
     * </p>
     */
    private java.util.List<DatasetAugmentedManifestsListItem> augmentedManifests;
    /**
     * <p>
     * <code>COMPREHEND_CSV</code>: The data format is a two-column CSV file, where the first column contains labels and
     * the second column contains documents.
     * </p>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: The data format
     * </p>
     */
    private String dataFormat;
    /**
     * <p>
     * The input properties for training a document classifier model.
     * </p>
     * <p>
     * For more information on how the input file is formatted, see <a
     * href="https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html">Preparing training data</a> in
     * the Comprehend Developer Guide.
     * </p>
     */
    private DatasetDocumentClassifierInputDataConfig documentClassifierInputDataConfig;
    /**
     * <p>
     * The input properties for training an entity recognizer model.
     * </p>
     */
    private DatasetEntityRecognizerInputDataConfig entityRecognizerInputDataConfig;

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your custom model. An augmented manifest file
     * is a labeled dataset that is produced by Amazon SageMaker Ground Truth.
     * </p>
     * 
     * @return A list of augmented manifest files that provide training data for your custom model. An augmented
     *         manifest file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.
     */

    public java.util.List<DatasetAugmentedManifestsListItem> getAugmentedManifests() {
        return augmentedManifests;
    }

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your custom model. An augmented manifest file
     * is a labeled dataset that is produced by Amazon SageMaker Ground Truth.
     * </p>
     * 
     * @param augmentedManifests
     *        A list of augmented manifest files that provide training data for your custom model. An augmented manifest
     *        file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.
     */

    public void setAugmentedManifests(java.util.Collection<DatasetAugmentedManifestsListItem> augmentedManifests) {
        if (augmentedManifests == null) {
            this.augmentedManifests = null;
            return;
        }

        this.augmentedManifests = new java.util.ArrayList<DatasetAugmentedManifestsListItem>(augmentedManifests);
    }

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your custom model. An augmented manifest file
     * is a labeled dataset that is produced by Amazon SageMaker Ground Truth.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAugmentedManifests(java.util.Collection)} or {@link #withAugmentedManifests(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param augmentedManifests
     *        A list of augmented manifest files that provide training data for your custom model. An augmented manifest
     *        file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetInputDataConfig withAugmentedManifests(DatasetAugmentedManifestsListItem... augmentedManifests) {
        if (this.augmentedManifests == null) {
            setAugmentedManifests(new java.util.ArrayList<DatasetAugmentedManifestsListItem>(augmentedManifests.length));
        }
        for (DatasetAugmentedManifestsListItem ele : augmentedManifests) {
            this.augmentedManifests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your custom model. An augmented manifest file
     * is a labeled dataset that is produced by Amazon SageMaker Ground Truth.
     * </p>
     * 
     * @param augmentedManifests
     *        A list of augmented manifest files that provide training data for your custom model. An augmented manifest
     *        file is a labeled dataset that is produced by Amazon SageMaker Ground Truth.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetInputDataConfig withAugmentedManifests(java.util.Collection<DatasetAugmentedManifestsListItem> augmentedManifests) {
        setAugmentedManifests(augmentedManifests);
        return this;
    }

    /**
     * <p>
     * <code>COMPREHEND_CSV</code>: The data format is a two-column CSV file, where the first column contains labels and
     * the second column contains documents.
     * </p>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: The data format
     * </p>
     * 
     * @param dataFormat
     *        <code>COMPREHEND_CSV</code>: The data format is a two-column CSV file, where the first column contains
     *        labels and the second column contains documents.</p>
     *        <p>
     *        <code>AUGMENTED_MANIFEST</code>: The data format
     * @see DatasetDataFormat
     */

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * <p>
     * <code>COMPREHEND_CSV</code>: The data format is a two-column CSV file, where the first column contains labels and
     * the second column contains documents.
     * </p>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: The data format
     * </p>
     * 
     * @return <code>COMPREHEND_CSV</code>: The data format is a two-column CSV file, where the first column contains
     *         labels and the second column contains documents.</p>
     *         <p>
     *         <code>AUGMENTED_MANIFEST</code>: The data format
     * @see DatasetDataFormat
     */

    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * <p>
     * <code>COMPREHEND_CSV</code>: The data format is a two-column CSV file, where the first column contains labels and
     * the second column contains documents.
     * </p>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: The data format
     * </p>
     * 
     * @param dataFormat
     *        <code>COMPREHEND_CSV</code>: The data format is a two-column CSV file, where the first column contains
     *        labels and the second column contains documents.</p>
     *        <p>
     *        <code>AUGMENTED_MANIFEST</code>: The data format
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetDataFormat
     */

    public DatasetInputDataConfig withDataFormat(String dataFormat) {
        setDataFormat(dataFormat);
        return this;
    }

    /**
     * <p>
     * <code>COMPREHEND_CSV</code>: The data format is a two-column CSV file, where the first column contains labels and
     * the second column contains documents.
     * </p>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: The data format
     * </p>
     * 
     * @param dataFormat
     *        <code>COMPREHEND_CSV</code>: The data format is a two-column CSV file, where the first column contains
     *        labels and the second column contains documents.</p>
     *        <p>
     *        <code>AUGMENTED_MANIFEST</code>: The data format
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetDataFormat
     */

    public DatasetInputDataConfig withDataFormat(DatasetDataFormat dataFormat) {
        this.dataFormat = dataFormat.toString();
        return this;
    }

    /**
     * <p>
     * The input properties for training a document classifier model.
     * </p>
     * <p>
     * For more information on how the input file is formatted, see <a
     * href="https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html">Preparing training data</a> in
     * the Comprehend Developer Guide.
     * </p>
     * 
     * @param documentClassifierInputDataConfig
     *        The input properties for training a document classifier model. </p>
     *        <p>
     *        For more information on how the input file is formatted, see <a
     *        href="https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html">Preparing training
     *        data</a> in the Comprehend Developer Guide.
     */

    public void setDocumentClassifierInputDataConfig(DatasetDocumentClassifierInputDataConfig documentClassifierInputDataConfig) {
        this.documentClassifierInputDataConfig = documentClassifierInputDataConfig;
    }

    /**
     * <p>
     * The input properties for training a document classifier model.
     * </p>
     * <p>
     * For more information on how the input file is formatted, see <a
     * href="https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html">Preparing training data</a> in
     * the Comprehend Developer Guide.
     * </p>
     * 
     * @return The input properties for training a document classifier model. </p>
     *         <p>
     *         For more information on how the input file is formatted, see <a
     *         href="https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html">Preparing training
     *         data</a> in the Comprehend Developer Guide.
     */

    public DatasetDocumentClassifierInputDataConfig getDocumentClassifierInputDataConfig() {
        return this.documentClassifierInputDataConfig;
    }

    /**
     * <p>
     * The input properties for training a document classifier model.
     * </p>
     * <p>
     * For more information on how the input file is formatted, see <a
     * href="https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html">Preparing training data</a> in
     * the Comprehend Developer Guide.
     * </p>
     * 
     * @param documentClassifierInputDataConfig
     *        The input properties for training a document classifier model. </p>
     *        <p>
     *        For more information on how the input file is formatted, see <a
     *        href="https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html">Preparing training
     *        data</a> in the Comprehend Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetInputDataConfig withDocumentClassifierInputDataConfig(DatasetDocumentClassifierInputDataConfig documentClassifierInputDataConfig) {
        setDocumentClassifierInputDataConfig(documentClassifierInputDataConfig);
        return this;
    }

    /**
     * <p>
     * The input properties for training an entity recognizer model.
     * </p>
     * 
     * @param entityRecognizerInputDataConfig
     *        The input properties for training an entity recognizer model.
     */

    public void setEntityRecognizerInputDataConfig(DatasetEntityRecognizerInputDataConfig entityRecognizerInputDataConfig) {
        this.entityRecognizerInputDataConfig = entityRecognizerInputDataConfig;
    }

    /**
     * <p>
     * The input properties for training an entity recognizer model.
     * </p>
     * 
     * @return The input properties for training an entity recognizer model.
     */

    public DatasetEntityRecognizerInputDataConfig getEntityRecognizerInputDataConfig() {
        return this.entityRecognizerInputDataConfig;
    }

    /**
     * <p>
     * The input properties for training an entity recognizer model.
     * </p>
     * 
     * @param entityRecognizerInputDataConfig
     *        The input properties for training an entity recognizer model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetInputDataConfig withEntityRecognizerInputDataConfig(DatasetEntityRecognizerInputDataConfig entityRecognizerInputDataConfig) {
        setEntityRecognizerInputDataConfig(entityRecognizerInputDataConfig);
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
        if (getAugmentedManifests() != null)
            sb.append("AugmentedManifests: ").append(getAugmentedManifests()).append(",");
        if (getDataFormat() != null)
            sb.append("DataFormat: ").append(getDataFormat()).append(",");
        if (getDocumentClassifierInputDataConfig() != null)
            sb.append("DocumentClassifierInputDataConfig: ").append(getDocumentClassifierInputDataConfig()).append(",");
        if (getEntityRecognizerInputDataConfig() != null)
            sb.append("EntityRecognizerInputDataConfig: ").append(getEntityRecognizerInputDataConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetInputDataConfig == false)
            return false;
        DatasetInputDataConfig other = (DatasetInputDataConfig) obj;
        if (other.getAugmentedManifests() == null ^ this.getAugmentedManifests() == null)
            return false;
        if (other.getAugmentedManifests() != null && other.getAugmentedManifests().equals(this.getAugmentedManifests()) == false)
            return false;
        if (other.getDataFormat() == null ^ this.getDataFormat() == null)
            return false;
        if (other.getDataFormat() != null && other.getDataFormat().equals(this.getDataFormat()) == false)
            return false;
        if (other.getDocumentClassifierInputDataConfig() == null ^ this.getDocumentClassifierInputDataConfig() == null)
            return false;
        if (other.getDocumentClassifierInputDataConfig() != null
                && other.getDocumentClassifierInputDataConfig().equals(this.getDocumentClassifierInputDataConfig()) == false)
            return false;
        if (other.getEntityRecognizerInputDataConfig() == null ^ this.getEntityRecognizerInputDataConfig() == null)
            return false;
        if (other.getEntityRecognizerInputDataConfig() != null
                && other.getEntityRecognizerInputDataConfig().equals(this.getEntityRecognizerInputDataConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAugmentedManifests() == null) ? 0 : getAugmentedManifests().hashCode());
        hashCode = prime * hashCode + ((getDataFormat() == null) ? 0 : getDataFormat().hashCode());
        hashCode = prime * hashCode + ((getDocumentClassifierInputDataConfig() == null) ? 0 : getDocumentClassifierInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getEntityRecognizerInputDataConfig() == null) ? 0 : getEntityRecognizerInputDataConfig().hashCode());
        return hashCode;
    }

    @Override
    public DatasetInputDataConfig clone() {
        try {
            return (DatasetInputDataConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.DatasetInputDataConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
