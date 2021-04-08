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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListModels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListModelsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of ML models.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies the maximum number of ML models to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The status of the ML model.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The beginning of the name of the ML models being listed.
     * </p>
     */
    private String modelNameBeginsWith;
    /**
     * <p>
     * The beginning of the name of the dataset of the ML models to be listed.
     * </p>
     */
    private String datasetNameBeginsWith;

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of ML models.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of ML models.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of ML models.
     * </p>
     * 
     * @return An opaque pagination token indicating where to continue the listing of ML models.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of ML models.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of ML models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of ML models to list.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of ML models to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of ML models to list.
     * </p>
     * 
     * @return Specifies the maximum number of ML models to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of ML models to list.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of ML models to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The status of the ML model.
     * </p>
     * 
     * @param status
     *        The status of the ML model.
     * @see ModelStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the ML model.
     * </p>
     * 
     * @return The status of the ML model.
     * @see ModelStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the ML model.
     * </p>
     * 
     * @param status
     *        The status of the ML model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public ListModelsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the ML model.
     * </p>
     * 
     * @param status
     *        The status of the ML model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public ListModelsRequest withStatus(ModelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The beginning of the name of the ML models being listed.
     * </p>
     * 
     * @param modelNameBeginsWith
     *        The beginning of the name of the ML models being listed.
     */

    public void setModelNameBeginsWith(String modelNameBeginsWith) {
        this.modelNameBeginsWith = modelNameBeginsWith;
    }

    /**
     * <p>
     * The beginning of the name of the ML models being listed.
     * </p>
     * 
     * @return The beginning of the name of the ML models being listed.
     */

    public String getModelNameBeginsWith() {
        return this.modelNameBeginsWith;
    }

    /**
     * <p>
     * The beginning of the name of the ML models being listed.
     * </p>
     * 
     * @param modelNameBeginsWith
     *        The beginning of the name of the ML models being listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelsRequest withModelNameBeginsWith(String modelNameBeginsWith) {
        setModelNameBeginsWith(modelNameBeginsWith);
        return this;
    }

    /**
     * <p>
     * The beginning of the name of the dataset of the ML models to be listed.
     * </p>
     * 
     * @param datasetNameBeginsWith
     *        The beginning of the name of the dataset of the ML models to be listed.
     */

    public void setDatasetNameBeginsWith(String datasetNameBeginsWith) {
        this.datasetNameBeginsWith = datasetNameBeginsWith;
    }

    /**
     * <p>
     * The beginning of the name of the dataset of the ML models to be listed.
     * </p>
     * 
     * @return The beginning of the name of the dataset of the ML models to be listed.
     */

    public String getDatasetNameBeginsWith() {
        return this.datasetNameBeginsWith;
    }

    /**
     * <p>
     * The beginning of the name of the dataset of the ML models to be listed.
     * </p>
     * 
     * @param datasetNameBeginsWith
     *        The beginning of the name of the dataset of the ML models to be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelsRequest withDatasetNameBeginsWith(String datasetNameBeginsWith) {
        setDatasetNameBeginsWith(datasetNameBeginsWith);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getModelNameBeginsWith() != null)
            sb.append("ModelNameBeginsWith: ").append(getModelNameBeginsWith()).append(",");
        if (getDatasetNameBeginsWith() != null)
            sb.append("DatasetNameBeginsWith: ").append(getDatasetNameBeginsWith());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListModelsRequest == false)
            return false;
        ListModelsRequest other = (ListModelsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getModelNameBeginsWith() == null ^ this.getModelNameBeginsWith() == null)
            return false;
        if (other.getModelNameBeginsWith() != null && other.getModelNameBeginsWith().equals(this.getModelNameBeginsWith()) == false)
            return false;
        if (other.getDatasetNameBeginsWith() == null ^ this.getDatasetNameBeginsWith() == null)
            return false;
        if (other.getDatasetNameBeginsWith() != null && other.getDatasetNameBeginsWith().equals(this.getDatasetNameBeginsWith()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getModelNameBeginsWith() == null) ? 0 : getModelNameBeginsWith().hashCode());
        hashCode = prime * hashCode + ((getDatasetNameBeginsWith() == null) ? 0 : getDatasetNameBeginsWith().hashCode());
        return hashCode;
    }

    @Override
    public ListModelsRequest clone() {
        return (ListModelsRequest) super.clone();
    }

}
