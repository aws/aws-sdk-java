/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Response to a successful DescribeDataset request.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/DescribeDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDatasetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * Meta data for a collection of data for an identity. An identity can have multiple datasets. A dataset can be
     * general or associated with a particular entity in an application (like a saved game). Datasets are automatically
     * created if they don't exist. Data is synced by dataset, and a dataset can hold up to 1MB of key-value pairs.
     */
    private Dataset dataset;

    /**
     * Meta data for a collection of data for an identity. An identity can have multiple datasets. A dataset can be
     * general or associated with a particular entity in an application (like a saved game). Datasets are automatically
     * created if they don't exist. Data is synced by dataset, and a dataset can hold up to 1MB of key-value pairs.
     * 
     * @param dataset
     *        Meta data for a collection of data for an identity. An identity can have multiple datasets. A dataset can
     *        be general or associated with a particular entity in an application (like a saved game). Datasets are
     *        automatically created if they don't exist. Data is synced by dataset, and a dataset can hold up to 1MB of
     *        key-value pairs.
     */

    public void setDataset(Dataset dataset) {
        this.dataset = dataset;
    }

    /**
     * Meta data for a collection of data for an identity. An identity can have multiple datasets. A dataset can be
     * general or associated with a particular entity in an application (like a saved game). Datasets are automatically
     * created if they don't exist. Data is synced by dataset, and a dataset can hold up to 1MB of key-value pairs.
     * 
     * @return Meta data for a collection of data for an identity. An identity can have multiple datasets. A dataset can
     *         be general or associated with a particular entity in an application (like a saved game). Datasets are
     *         automatically created if they don't exist. Data is synced by dataset, and a dataset can hold up to 1MB of
     *         key-value pairs.
     */

    public Dataset getDataset() {
        return this.dataset;
    }

    /**
     * Meta data for a collection of data for an identity. An identity can have multiple datasets. A dataset can be
     * general or associated with a particular entity in an application (like a saved game). Datasets are automatically
     * created if they don't exist. Data is synced by dataset, and a dataset can hold up to 1MB of key-value pairs.
     * 
     * @param dataset
     *        Meta data for a collection of data for an identity. An identity can have multiple datasets. A dataset can
     *        be general or associated with a particular entity in an application (like a saved game). Datasets are
     *        automatically created if they don't exist. Data is synced by dataset, and a dataset can hold up to 1MB of
     *        key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withDataset(Dataset dataset) {
        setDataset(dataset);
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
        if (getDataset() != null)
            sb.append("Dataset: ").append(getDataset());
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
        if (other.getDataset() == null ^ this.getDataset() == null)
            return false;
        if (other.getDataset() != null && other.getDataset().equals(this.getDataset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataset() == null) ? 0 : getDataset().hashCode());
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
