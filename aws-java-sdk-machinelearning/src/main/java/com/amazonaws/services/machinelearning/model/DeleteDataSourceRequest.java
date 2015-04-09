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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.machinelearning.AmazonMachineLearning#deleteDataSource(DeleteDataSourceRequest) DeleteDataSource operation}.
 * <p>
 * Assigns the DELETED status to a <code>DataSource</code> , rendering it
 * unusable.
 * </p>
 * <p>
 * After using the <code>DeleteDataSource</code> operation, you can use
 * the GetDataSource operation to verify that the status of the
 * <code>DataSource</code> changed to DELETED.
 * </p>
 * Caution The results of the DeleteDataSource operation are
 * irreversible.
 *
 * @see com.amazonaws.services.machinelearning.AmazonMachineLearning#deleteDataSource(DeleteDataSourceRequest)
 */
public class DeleteDataSourceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A user-supplied ID that uniquely identifies the
     * <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String dataSourceId;

    /**
     * A user-supplied ID that uniquely identifies the
     * <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return A user-supplied ID that uniquely identifies the
     *         <code>DataSource</code>.
     */
    public String getDataSourceId() {
        return dataSourceId;
    }
    
    /**
     * A user-supplied ID that uniquely identifies the
     * <code>DataSource</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param dataSourceId A user-supplied ID that uniquely identifies the
     *         <code>DataSource</code>.
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }
    
    /**
     * A user-supplied ID that uniquely identifies the
     * <code>DataSource</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param dataSourceId A user-supplied ID that uniquely identifies the
     *         <code>DataSource</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteDataSourceRequest withDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
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
        if (getDataSourceId() != null) sb.append("DataSourceId: " + getDataSourceId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteDataSourceRequest == false) return false;
        DeleteDataSourceRequest other = (DeleteDataSourceRequest)obj;
        
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null) return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteDataSourceRequest clone() {
        
            return (DeleteDataSourceRequest) super.clone();
    }

}
    