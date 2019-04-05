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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDataSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID assigned to the <code>DataSource</code> during creation.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * A new user-supplied name or description of the <code>DataSource</code> that will replace the current description.
     * </p>
     */
    private String dataSourceName;

    /**
     * <p>
     * The ID assigned to the <code>DataSource</code> during creation.
     * </p>
     * 
     * @param dataSourceId
     *        The ID assigned to the <code>DataSource</code> during creation.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The ID assigned to the <code>DataSource</code> during creation.
     * </p>
     * 
     * @return The ID assigned to the <code>DataSource</code> during creation.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The ID assigned to the <code>DataSource</code> during creation.
     * </p>
     * 
     * @param dataSourceId
     *        The ID assigned to the <code>DataSource</code> during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * A new user-supplied name or description of the <code>DataSource</code> that will replace the current description.
     * </p>
     * 
     * @param dataSourceName
     *        A new user-supplied name or description of the <code>DataSource</code> that will replace the current
     *        description.
     */

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    /**
     * <p>
     * A new user-supplied name or description of the <code>DataSource</code> that will replace the current description.
     * </p>
     * 
     * @return A new user-supplied name or description of the <code>DataSource</code> that will replace the current
     *         description.
     */

    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * <p>
     * A new user-supplied name or description of the <code>DataSource</code> that will replace the current description.
     * </p>
     * 
     * @param dataSourceName
     *        A new user-supplied name or description of the <code>DataSource</code> that will replace the current
     *        description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withDataSourceName(String dataSourceName) {
        setDataSourceName(dataSourceName);
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
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getDataSourceName() != null)
            sb.append("DataSourceName: ").append(getDataSourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDataSourceRequest == false)
            return false;
        UpdateDataSourceRequest other = (UpdateDataSourceRequest) obj;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getDataSourceName() == null ^ this.getDataSourceName() == null)
            return false;
        if (other.getDataSourceName() != null && other.getDataSourceName().equals(this.getDataSourceName()) == false)
            return false;
        return true;
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
    public UpdateDataSourceRequest clone() {
        return (UpdateDataSourceRequest) super.clone();
    }

}
