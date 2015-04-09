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
 * Container for the parameters to the {@link com.amazonaws.services.machinelearning.AmazonMachineLearning#updateDataSource(UpdateDataSourceRequest) UpdateDataSource operation}.
 * <p>
 * Updates the <code>DataSourceName</code> of a <code>DataSource</code> .
 * </p>
 * <p>
 * You can use the GetDataSource operation to view the contents of the
 * updated data element.
 * </p>
 *
 * @see com.amazonaws.services.machinelearning.AmazonMachineLearning#updateDataSource(UpdateDataSourceRequest)
 */
public class UpdateDataSourceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID assigned to the <code>DataSource</code> during creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String dataSourceId;

    /**
     * A new user-supplied name or description of the <code>DataSource</code>
     * that will replace the current description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     */
    private String dataSourceName;

    /**
     * The ID assigned to the <code>DataSource</code> during creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The ID assigned to the <code>DataSource</code> during creation.
     */
    public String getDataSourceId() {
        return dataSourceId;
    }
    
    /**
     * The ID assigned to the <code>DataSource</code> during creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param dataSourceId The ID assigned to the <code>DataSource</code> during creation.
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }
    
    /**
     * The ID assigned to the <code>DataSource</code> during creation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param dataSourceId The ID assigned to the <code>DataSource</code> during creation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateDataSourceRequest withDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * A new user-supplied name or description of the <code>DataSource</code>
     * that will replace the current description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @return A new user-supplied name or description of the <code>DataSource</code>
     *         that will replace the current description.
     */
    public String getDataSourceName() {
        return dataSourceName;
    }
    
    /**
     * A new user-supplied name or description of the <code>DataSource</code>
     * that will replace the current description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param dataSourceName A new user-supplied name or description of the <code>DataSource</code>
     *         that will replace the current description.
     */
    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }
    
    /**
     * A new user-supplied name or description of the <code>DataSource</code>
     * that will replace the current description.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param dataSourceName A new user-supplied name or description of the <code>DataSource</code>
     *         that will replace the current description.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateDataSourceRequest withDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
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
        if (getDataSourceId() != null) sb.append("DataSourceId: " + getDataSourceId() + ",");
        if (getDataSourceName() != null) sb.append("DataSourceName: " + getDataSourceName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode()); 
        hashCode = prime * hashCode + ((getDataSourceName() == null) ? 0 : getDataSourceName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateDataSourceRequest == false) return false;
        UpdateDataSourceRequest other = (UpdateDataSourceRequest)obj;
        
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null) return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false) return false; 
        if (other.getDataSourceName() == null ^ this.getDataSourceName() == null) return false;
        if (other.getDataSourceName() != null && other.getDataSourceName().equals(this.getDataSourceName()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateDataSourceRequest clone() {
        
            return (UpdateDataSourceRequest) super.clone();
    }

}
    