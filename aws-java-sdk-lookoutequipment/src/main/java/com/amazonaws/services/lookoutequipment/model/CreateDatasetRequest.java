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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatasetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the dataset being created.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * A JSON description of the data that is in each time series dataset, including names, column names, and data
     * types.
     * </p>
     */
    private DatasetSchema datasetSchema;
    /**
     * <p>
     * Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt dataset data by Amazon Lookout
     * for Equipment.
     * </p>
     */
    private String serverSideKmsKeyId;
    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment
     * generates one.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Any tags associated with the ingested data described in the dataset.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the dataset being created.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset being created.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset being created.
     * </p>
     * 
     * @return The name of the dataset being created.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset being created.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * A JSON description of the data that is in each time series dataset, including names, column names, and data
     * types.
     * </p>
     * 
     * @param datasetSchema
     *        A JSON description of the data that is in each time series dataset, including names, column names, and
     *        data types.
     */

    public void setDatasetSchema(DatasetSchema datasetSchema) {
        this.datasetSchema = datasetSchema;
    }

    /**
     * <p>
     * A JSON description of the data that is in each time series dataset, including names, column names, and data
     * types.
     * </p>
     * 
     * @return A JSON description of the data that is in each time series dataset, including names, column names, and
     *         data types.
     */

    public DatasetSchema getDatasetSchema() {
        return this.datasetSchema;
    }

    /**
     * <p>
     * A JSON description of the data that is in each time series dataset, including names, column names, and data
     * types.
     * </p>
     * 
     * @param datasetSchema
     *        A JSON description of the data that is in each time series dataset, including names, column names, and
     *        data types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withDatasetSchema(DatasetSchema datasetSchema) {
        setDatasetSchema(datasetSchema);
        return this;
    }

    /**
     * <p>
     * Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt dataset data by Amazon Lookout
     * for Equipment.
     * </p>
     * 
     * @param serverSideKmsKeyId
     *        Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt dataset data by Amazon
     *        Lookout for Equipment.
     */

    public void setServerSideKmsKeyId(String serverSideKmsKeyId) {
        this.serverSideKmsKeyId = serverSideKmsKeyId;
    }

    /**
     * <p>
     * Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt dataset data by Amazon Lookout
     * for Equipment.
     * </p>
     * 
     * @return Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt dataset data by Amazon
     *         Lookout for Equipment.
     */

    public String getServerSideKmsKeyId() {
        return this.serverSideKmsKeyId;
    }

    /**
     * <p>
     * Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt dataset data by Amazon Lookout
     * for Equipment.
     * </p>
     * 
     * @param serverSideKmsKeyId
     *        Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt dataset data by Amazon
     *        Lookout for Equipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withServerSideKmsKeyId(String serverSideKmsKeyId) {
        setServerSideKmsKeyId(serverSideKmsKeyId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment
     * generates one.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier for the request. If you do not set the client request token, Amazon Lookout for
     *        Equipment generates one.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment
     * generates one.
     * </p>
     * 
     * @return A unique identifier for the request. If you do not set the client request token, Amazon Lookout for
     *         Equipment generates one.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment
     * generates one.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier for the request. If you do not set the client request token, Amazon Lookout for
     *        Equipment generates one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Any tags associated with the ingested data described in the dataset.
     * </p>
     * 
     * @return Any tags associated with the ingested data described in the dataset.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags associated with the ingested data described in the dataset.
     * </p>
     * 
     * @param tags
     *        Any tags associated with the ingested data described in the dataset.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags associated with the ingested data described in the dataset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags associated with the ingested data described in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags associated with the ingested data described in the dataset.
     * </p>
     * 
     * @param tags
     *        Any tags associated with the ingested data described in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDatasetSchema() != null)
            sb.append("DatasetSchema: ").append(getDatasetSchema()).append(",");
        if (getServerSideKmsKeyId() != null)
            sb.append("ServerSideKmsKeyId: ").append(getServerSideKmsKeyId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
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
        if (other.getDatasetSchema() == null ^ this.getDatasetSchema() == null)
            return false;
        if (other.getDatasetSchema() != null && other.getDatasetSchema().equals(this.getDatasetSchema()) == false)
            return false;
        if (other.getServerSideKmsKeyId() == null ^ this.getServerSideKmsKeyId() == null)
            return false;
        if (other.getServerSideKmsKeyId() != null && other.getServerSideKmsKeyId().equals(this.getServerSideKmsKeyId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getDatasetSchema() == null) ? 0 : getDatasetSchema().hashCode());
        hashCode = prime * hashCode + ((getServerSideKmsKeyId() == null) ? 0 : getServerSideKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatasetRequest clone() {
        return (CreateDatasetRequest) super.clone();
    }

}
