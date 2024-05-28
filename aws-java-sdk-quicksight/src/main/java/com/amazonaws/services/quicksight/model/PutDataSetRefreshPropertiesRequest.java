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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PutDataSetRefreshProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDataSetRefreshPropertiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID of the dataset.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * The dataset refresh properties.
     * </p>
     */
    private DataSetRefreshProperties dataSetRefreshProperties;

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account ID.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @return The Amazon Web Services account ID.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDataSetRefreshPropertiesRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID of the dataset.
     * </p>
     * 
     * @param dataSetId
     *        The ID of the dataset.
     */

    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The ID of the dataset.
     * </p>
     * 
     * @return The ID of the dataset.
     */

    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * <p>
     * The ID of the dataset.
     * </p>
     * 
     * @param dataSetId
     *        The ID of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDataSetRefreshPropertiesRequest withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * The dataset refresh properties.
     * </p>
     * 
     * @param dataSetRefreshProperties
     *        The dataset refresh properties.
     */

    public void setDataSetRefreshProperties(DataSetRefreshProperties dataSetRefreshProperties) {
        this.dataSetRefreshProperties = dataSetRefreshProperties;
    }

    /**
     * <p>
     * The dataset refresh properties.
     * </p>
     * 
     * @return The dataset refresh properties.
     */

    public DataSetRefreshProperties getDataSetRefreshProperties() {
        return this.dataSetRefreshProperties;
    }

    /**
     * <p>
     * The dataset refresh properties.
     * </p>
     * 
     * @param dataSetRefreshProperties
     *        The dataset refresh properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDataSetRefreshPropertiesRequest withDataSetRefreshProperties(DataSetRefreshProperties dataSetRefreshProperties) {
        setDataSetRefreshProperties(dataSetRefreshProperties);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getDataSetId() != null)
            sb.append("DataSetId: ").append(getDataSetId()).append(",");
        if (getDataSetRefreshProperties() != null)
            sb.append("DataSetRefreshProperties: ").append(getDataSetRefreshProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDataSetRefreshPropertiesRequest == false)
            return false;
        PutDataSetRefreshPropertiesRequest other = (PutDataSetRefreshPropertiesRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getDataSetRefreshProperties() == null ^ this.getDataSetRefreshProperties() == null)
            return false;
        if (other.getDataSetRefreshProperties() != null && other.getDataSetRefreshProperties().equals(this.getDataSetRefreshProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getDataSetRefreshProperties() == null) ? 0 : getDataSetRefreshProperties().hashCode());
        return hashCode;
    }

    @Override
    public PutDataSetRefreshPropertiesRequest clone() {
        return (PutDataSetRefreshPropertiesRequest) super.clone();
    }

}
