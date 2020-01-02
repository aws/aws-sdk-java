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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatasetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the dataset.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The domain associated with the dataset. When you add a dataset to a dataset group, this value and the value
     * specified for the <code>Domain</code> parameter of the <a>CreateDatasetGroup</a> operation must match.
     * </p>
     * <p>
     * The <code>Domain</code> and <code>DatasetType</code> that you choose determine the fields that must be present in
     * the training data that you import to the dataset. For example, if you choose the <code>RETAIL</code> domain and
     * <code>TARGET_TIME_SERIES</code> as the <code>DatasetType</code>, Amazon Forecast requires <code>item_id</code>,
     * <code>timestamp</code>, and <code>demand</code> fields to be present in your data. For more information, see
     * <a>howitworks-datasets-groups</a>.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The dataset type. Valid values depend on the chosen <code>Domain</code>.
     * </p>
     */
    private String datasetType;
    /**
     * <p>
     * The frequency of data collection. This parameter is required for RELATED_TIME_SERIES datasets.
     * </p>
     * <p>
     * Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes),
     * 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "D" indicates every day and "15min"
     * indicates every 15 minutes.
     * </p>
     */
    private String dataFrequency;
    /**
     * <p>
     * The schema for the dataset. The schema attributes and their order must match the fields in your data. The dataset
     * <code>Domain</code> and <code>DatasetType</code> that you choose determine the minimum required fields in your
     * training data. For information about the required fields for a specific dataset domain and type, see
     * <a>howitworks-domains-ds-types</a>.
     * </p>
     */
    private Schema schema;
    /**
     * <p>
     * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the key.
     * </p>
     */
    private EncryptionConfig encryptionConfig;

    /**
     * <p>
     * A name for the dataset.
     * </p>
     * 
     * @param datasetName
     *        A name for the dataset.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * A name for the dataset.
     * </p>
     * 
     * @return A name for the dataset.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * A name for the dataset.
     * </p>
     * 
     * @param datasetName
     *        A name for the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The domain associated with the dataset. When you add a dataset to a dataset group, this value and the value
     * specified for the <code>Domain</code> parameter of the <a>CreateDatasetGroup</a> operation must match.
     * </p>
     * <p>
     * The <code>Domain</code> and <code>DatasetType</code> that you choose determine the fields that must be present in
     * the training data that you import to the dataset. For example, if you choose the <code>RETAIL</code> domain and
     * <code>TARGET_TIME_SERIES</code> as the <code>DatasetType</code>, Amazon Forecast requires <code>item_id</code>,
     * <code>timestamp</code>, and <code>demand</code> fields to be present in your data. For more information, see
     * <a>howitworks-datasets-groups</a>.
     * </p>
     * 
     * @param domain
     *        The domain associated with the dataset. When you add a dataset to a dataset group, this value and the
     *        value specified for the <code>Domain</code> parameter of the <a>CreateDatasetGroup</a> operation must
     *        match.</p>
     *        <p>
     *        The <code>Domain</code> and <code>DatasetType</code> that you choose determine the fields that must be
     *        present in the training data that you import to the dataset. For example, if you choose the
     *        <code>RETAIL</code> domain and <code>TARGET_TIME_SERIES</code> as the <code>DatasetType</code>, Amazon
     *        Forecast requires <code>item_id</code>, <code>timestamp</code>, and <code>demand</code> fields to be
     *        present in your data. For more information, see <a>howitworks-datasets-groups</a>.
     * @see Domain
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain associated with the dataset. When you add a dataset to a dataset group, this value and the value
     * specified for the <code>Domain</code> parameter of the <a>CreateDatasetGroup</a> operation must match.
     * </p>
     * <p>
     * The <code>Domain</code> and <code>DatasetType</code> that you choose determine the fields that must be present in
     * the training data that you import to the dataset. For example, if you choose the <code>RETAIL</code> domain and
     * <code>TARGET_TIME_SERIES</code> as the <code>DatasetType</code>, Amazon Forecast requires <code>item_id</code>,
     * <code>timestamp</code>, and <code>demand</code> fields to be present in your data. For more information, see
     * <a>howitworks-datasets-groups</a>.
     * </p>
     * 
     * @return The domain associated with the dataset. When you add a dataset to a dataset group, this value and the
     *         value specified for the <code>Domain</code> parameter of the <a>CreateDatasetGroup</a> operation must
     *         match.</p>
     *         <p>
     *         The <code>Domain</code> and <code>DatasetType</code> that you choose determine the fields that must be
     *         present in the training data that you import to the dataset. For example, if you choose the
     *         <code>RETAIL</code> domain and <code>TARGET_TIME_SERIES</code> as the <code>DatasetType</code>, Amazon
     *         Forecast requires <code>item_id</code>, <code>timestamp</code>, and <code>demand</code> fields to be
     *         present in your data. For more information, see <a>howitworks-datasets-groups</a>.
     * @see Domain
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain associated with the dataset. When you add a dataset to a dataset group, this value and the value
     * specified for the <code>Domain</code> parameter of the <a>CreateDatasetGroup</a> operation must match.
     * </p>
     * <p>
     * The <code>Domain</code> and <code>DatasetType</code> that you choose determine the fields that must be present in
     * the training data that you import to the dataset. For example, if you choose the <code>RETAIL</code> domain and
     * <code>TARGET_TIME_SERIES</code> as the <code>DatasetType</code>, Amazon Forecast requires <code>item_id</code>,
     * <code>timestamp</code>, and <code>demand</code> fields to be present in your data. For more information, see
     * <a>howitworks-datasets-groups</a>.
     * </p>
     * 
     * @param domain
     *        The domain associated with the dataset. When you add a dataset to a dataset group, this value and the
     *        value specified for the <code>Domain</code> parameter of the <a>CreateDatasetGroup</a> operation must
     *        match.</p>
     *        <p>
     *        The <code>Domain</code> and <code>DatasetType</code> that you choose determine the fields that must be
     *        present in the training data that you import to the dataset. For example, if you choose the
     *        <code>RETAIL</code> domain and <code>TARGET_TIME_SERIES</code> as the <code>DatasetType</code>, Amazon
     *        Forecast requires <code>item_id</code>, <code>timestamp</code>, and <code>demand</code> fields to be
     *        present in your data. For more information, see <a>howitworks-datasets-groups</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public CreateDatasetRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The domain associated with the dataset. When you add a dataset to a dataset group, this value and the value
     * specified for the <code>Domain</code> parameter of the <a>CreateDatasetGroup</a> operation must match.
     * </p>
     * <p>
     * The <code>Domain</code> and <code>DatasetType</code> that you choose determine the fields that must be present in
     * the training data that you import to the dataset. For example, if you choose the <code>RETAIL</code> domain and
     * <code>TARGET_TIME_SERIES</code> as the <code>DatasetType</code>, Amazon Forecast requires <code>item_id</code>,
     * <code>timestamp</code>, and <code>demand</code> fields to be present in your data. For more information, see
     * <a>howitworks-datasets-groups</a>.
     * </p>
     * 
     * @param domain
     *        The domain associated with the dataset. When you add a dataset to a dataset group, this value and the
     *        value specified for the <code>Domain</code> parameter of the <a>CreateDatasetGroup</a> operation must
     *        match.</p>
     *        <p>
     *        The <code>Domain</code> and <code>DatasetType</code> that you choose determine the fields that must be
     *        present in the training data that you import to the dataset. For example, if you choose the
     *        <code>RETAIL</code> domain and <code>TARGET_TIME_SERIES</code> as the <code>DatasetType</code>, Amazon
     *        Forecast requires <code>item_id</code>, <code>timestamp</code>, and <code>demand</code> fields to be
     *        present in your data. For more information, see <a>howitworks-datasets-groups</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public CreateDatasetRequest withDomain(Domain domain) {
        this.domain = domain.toString();
        return this;
    }

    /**
     * <p>
     * The dataset type. Valid values depend on the chosen <code>Domain</code>.
     * </p>
     * 
     * @param datasetType
     *        The dataset type. Valid values depend on the chosen <code>Domain</code>.
     * @see DatasetType
     */

    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * The dataset type. Valid values depend on the chosen <code>Domain</code>.
     * </p>
     * 
     * @return The dataset type. Valid values depend on the chosen <code>Domain</code>.
     * @see DatasetType
     */

    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * <p>
     * The dataset type. Valid values depend on the chosen <code>Domain</code>.
     * </p>
     * 
     * @param datasetType
     *        The dataset type. Valid values depend on the chosen <code>Domain</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetType
     */

    public CreateDatasetRequest withDatasetType(String datasetType) {
        setDatasetType(datasetType);
        return this;
    }

    /**
     * <p>
     * The dataset type. Valid values depend on the chosen <code>Domain</code>.
     * </p>
     * 
     * @param datasetType
     *        The dataset type. Valid values depend on the chosen <code>Domain</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetType
     */

    public CreateDatasetRequest withDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
        return this;
    }

    /**
     * <p>
     * The frequency of data collection. This parameter is required for RELATED_TIME_SERIES datasets.
     * </p>
     * <p>
     * Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes),
     * 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "D" indicates every day and "15min"
     * indicates every 15 minutes.
     * </p>
     * 
     * @param dataFrequency
     *        The frequency of data collection. This parameter is required for RELATED_TIME_SERIES datasets.</p>
     *        <p>
     *        Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15
     *        minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "D" indicates every day
     *        and "15min" indicates every 15 minutes.
     */

    public void setDataFrequency(String dataFrequency) {
        this.dataFrequency = dataFrequency;
    }

    /**
     * <p>
     * The frequency of data collection. This parameter is required for RELATED_TIME_SERIES datasets.
     * </p>
     * <p>
     * Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes),
     * 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "D" indicates every day and "15min"
     * indicates every 15 minutes.
     * </p>
     * 
     * @return The frequency of data collection. This parameter is required for RELATED_TIME_SERIES datasets.</p>
     *         <p>
     *         Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15
     *         minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "D" indicates every day
     *         and "15min" indicates every 15 minutes.
     */

    public String getDataFrequency() {
        return this.dataFrequency;
    }

    /**
     * <p>
     * The frequency of data collection. This parameter is required for RELATED_TIME_SERIES datasets.
     * </p>
     * <p>
     * Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes),
     * 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "D" indicates every day and "15min"
     * indicates every 15 minutes.
     * </p>
     * 
     * @param dataFrequency
     *        The frequency of data collection. This parameter is required for RELATED_TIME_SERIES datasets.</p>
     *        <p>
     *        Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15
     *        minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "D" indicates every day
     *        and "15min" indicates every 15 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withDataFrequency(String dataFrequency) {
        setDataFrequency(dataFrequency);
        return this;
    }

    /**
     * <p>
     * The schema for the dataset. The schema attributes and their order must match the fields in your data. The dataset
     * <code>Domain</code> and <code>DatasetType</code> that you choose determine the minimum required fields in your
     * training data. For information about the required fields for a specific dataset domain and type, see
     * <a>howitworks-domains-ds-types</a>.
     * </p>
     * 
     * @param schema
     *        The schema for the dataset. The schema attributes and their order must match the fields in your data. The
     *        dataset <code>Domain</code> and <code>DatasetType</code> that you choose determine the minimum required
     *        fields in your training data. For information about the required fields for a specific dataset domain and
     *        type, see <a>howitworks-domains-ds-types</a>.
     */

    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The schema for the dataset. The schema attributes and their order must match the fields in your data. The dataset
     * <code>Domain</code> and <code>DatasetType</code> that you choose determine the minimum required fields in your
     * training data. For information about the required fields for a specific dataset domain and type, see
     * <a>howitworks-domains-ds-types</a>.
     * </p>
     * 
     * @return The schema for the dataset. The schema attributes and their order must match the fields in your data. The
     *         dataset <code>Domain</code> and <code>DatasetType</code> that you choose determine the minimum required
     *         fields in your training data. For information about the required fields for a specific dataset domain and
     *         type, see <a>howitworks-domains-ds-types</a>.
     */

    public Schema getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * The schema for the dataset. The schema attributes and their order must match the fields in your data. The dataset
     * <code>Domain</code> and <code>DatasetType</code> that you choose determine the minimum required fields in your
     * training data. For information about the required fields for a specific dataset domain and type, see
     * <a>howitworks-domains-ds-types</a>.
     * </p>
     * 
     * @param schema
     *        The schema for the dataset. The schema attributes and their order must match the fields in your data. The
     *        dataset <code>Domain</code> and <code>DatasetType</code> that you choose determine the minimum required
     *        fields in your training data. For information about the required fields for a specific dataset domain and
     *        type, see <a>howitworks-domains-ds-types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withSchema(Schema schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the key.
     * </p>
     * 
     * @param encryptionConfig
     *        An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     *        Forecast can assume to access the key.
     */

    public void setEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
    }

    /**
     * <p>
     * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the key.
     * </p>
     * 
     * @return An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     *         Forecast can assume to access the key.
     */

    public EncryptionConfig getEncryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * <p>
     * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the key.
     * </p>
     * 
     * @param encryptionConfig
     *        An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon
     *        Forecast can assume to access the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withEncryptionConfig(EncryptionConfig encryptionConfig) {
        setEncryptionConfig(encryptionConfig);
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
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getDatasetType() != null)
            sb.append("DatasetType: ").append(getDatasetType()).append(",");
        if (getDataFrequency() != null)
            sb.append("DataFrequency: ").append(getDataFrequency()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getEncryptionConfig() != null)
            sb.append("EncryptionConfig: ").append(getEncryptionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDatasetRequest == false)
            return false;
        CreateDatasetRequest other = (CreateDatasetRequest) obj;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null && other.getDatasetType().equals(this.getDatasetType()) == false)
            return false;
        if (other.getDataFrequency() == null ^ this.getDataFrequency() == null)
            return false;
        if (other.getDataFrequency() != null && other.getDataFrequency().equals(this.getDataFrequency()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getEncryptionConfig() == null ^ this.getEncryptionConfig() == null)
            return false;
        if (other.getEncryptionConfig() != null && other.getEncryptionConfig().equals(this.getEncryptionConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        hashCode = prime * hashCode + ((getDataFrequency() == null) ? 0 : getDataFrequency().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfig() == null) ? 0 : getEncryptionConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatasetRequest clone() {
        return (CreateDatasetRequest) super.clone();
    }

}
