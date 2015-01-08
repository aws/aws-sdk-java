/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

/**
 * <p>
 * Response to a successful DeleteDataset request.
 * </p>
 */
public class DeleteDatasetResult implements Serializable {

    /**
     * A collection of data for an identity pool. An identity pool can have
     * multiple datasets. A dataset is per identity and can be general or
     * associated with a particular entity in an application (like a saved
     * game). Datasets are automatically created if they don't exist. Data is
     * synced by dataset, and a dataset can hold up to 1MB of key-value
     * pairs.
     */
    private Dataset dataset;

    /**
     * A collection of data for an identity pool. An identity pool can have
     * multiple datasets. A dataset is per identity and can be general or
     * associated with a particular entity in an application (like a saved
     * game). Datasets are automatically created if they don't exist. Data is
     * synced by dataset, and a dataset can hold up to 1MB of key-value
     * pairs.
     *
     * @return A collection of data for an identity pool. An identity pool can have
     *         multiple datasets. A dataset is per identity and can be general or
     *         associated with a particular entity in an application (like a saved
     *         game). Datasets are automatically created if they don't exist. Data is
     *         synced by dataset, and a dataset can hold up to 1MB of key-value
     *         pairs.
     */
    public Dataset getDataset() {
        return dataset;
    }
    
    /**
     * A collection of data for an identity pool. An identity pool can have
     * multiple datasets. A dataset is per identity and can be general or
     * associated with a particular entity in an application (like a saved
     * game). Datasets are automatically created if they don't exist. Data is
     * synced by dataset, and a dataset can hold up to 1MB of key-value
     * pairs.
     *
     * @param dataset A collection of data for an identity pool. An identity pool can have
     *         multiple datasets. A dataset is per identity and can be general or
     *         associated with a particular entity in an application (like a saved
     *         game). Datasets are automatically created if they don't exist. Data is
     *         synced by dataset, and a dataset can hold up to 1MB of key-value
     *         pairs.
     */
    public void setDataset(Dataset dataset) {
        this.dataset = dataset;
    }
    
    /**
     * A collection of data for an identity pool. An identity pool can have
     * multiple datasets. A dataset is per identity and can be general or
     * associated with a particular entity in an application (like a saved
     * game). Datasets are automatically created if they don't exist. Data is
     * synced by dataset, and a dataset can hold up to 1MB of key-value
     * pairs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dataset A collection of data for an identity pool. An identity pool can have
     *         multiple datasets. A dataset is per identity and can be general or
     *         associated with a particular entity in an application (like a saved
     *         game). Datasets are automatically created if they don't exist. Data is
     *         synced by dataset, and a dataset can hold up to 1MB of key-value
     *         pairs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteDatasetResult withDataset(Dataset dataset) {
        this.dataset = dataset;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDataset() != null) sb.append("Dataset: " + getDataset() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDataset() == null) ? 0 : getDataset().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteDatasetResult == false) return false;
        DeleteDatasetResult other = (DeleteDatasetResult)obj;
        
        if (other.getDataset() == null ^ this.getDataset() == null) return false;
        if (other.getDataset() != null && other.getDataset().equals(this.getDataset()) == false) return false; 
        return true;
    }
    
}
    