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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDatasetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The dataset properties.
     * </p>
     */
    private DatasetProperties datasetProperties;

    /**
     * <p>
     * The dataset properties.
     * </p>
     * 
     * @param datasetProperties
     *        The dataset properties.
     */

    public void setDatasetProperties(DatasetProperties datasetProperties) {
        this.datasetProperties = datasetProperties;
    }

    /**
     * <p>
     * The dataset properties.
     * </p>
     * 
     * @return The dataset properties.
     */

    public DatasetProperties getDatasetProperties() {
        return this.datasetProperties;
    }

    /**
     * <p>
     * The dataset properties.
     * </p>
     * 
     * @param datasetProperties
     *        The dataset properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withDatasetProperties(DatasetProperties datasetProperties) {
        setDatasetProperties(datasetProperties);
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
        if (getDatasetProperties() != null)
            sb.append("DatasetProperties: ").append(getDatasetProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDatasetResult == false)
            return false;
        DescribeDatasetResult other = (DescribeDatasetResult) obj;
        if (other.getDatasetProperties() == null ^ this.getDatasetProperties() == null)
            return false;
        if (other.getDatasetProperties() != null && other.getDatasetProperties().equals(this.getDatasetProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetProperties() == null) ? 0 : getDatasetProperties().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDatasetResult clone() {
        try {
            return (DescribeDatasetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
