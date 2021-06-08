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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/CreateDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatasetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the dataset.
     * </p>
     */
    private DatasetMetadata datasetMetadata;

    /**
     * <p>
     * Information about the dataset.
     * </p>
     * 
     * @param datasetMetadata
     *        Information about the dataset.
     */

    public void setDatasetMetadata(DatasetMetadata datasetMetadata) {
        this.datasetMetadata = datasetMetadata;
    }

    /**
     * <p>
     * Information about the dataset.
     * </p>
     * 
     * @return Information about the dataset.
     */

    public DatasetMetadata getDatasetMetadata() {
        return this.datasetMetadata;
    }

    /**
     * <p>
     * Information about the dataset.
     * </p>
     * 
     * @param datasetMetadata
     *        Information about the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetResult withDatasetMetadata(DatasetMetadata datasetMetadata) {
        setDatasetMetadata(datasetMetadata);
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
        if (getDatasetMetadata() != null)
            sb.append("DatasetMetadata: ").append(getDatasetMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDatasetResult == false)
            return false;
        CreateDatasetResult other = (CreateDatasetResult) obj;
        if (other.getDatasetMetadata() == null ^ this.getDatasetMetadata() == null)
            return false;
        if (other.getDatasetMetadata() != null && other.getDatasetMetadata().equals(this.getDatasetMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetMetadata() == null) ? 0 : getDatasetMetadata().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatasetResult clone() {
        try {
            return (CreateDatasetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
