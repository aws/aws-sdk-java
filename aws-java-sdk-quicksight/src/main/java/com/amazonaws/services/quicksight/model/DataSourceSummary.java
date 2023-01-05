/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A <code>DataSourceSummary</code> object that returns a summary of a data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataSourceSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The arn of the datasource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The unique ID of the data source.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * The name of the data source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the data source.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The date and time that the data source was created. This value is expressed in MM-DD-YYYY HH:MM:SS format.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The date and time the data source was last updated. This value is expressed in MM-DD-YYYY HH:MM:SS format.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The arn of the datasource.
     * </p>
     * 
     * @param arn
     *        The arn of the datasource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The arn of the datasource.
     * </p>
     * 
     * @return The arn of the datasource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The arn of the datasource.
     * </p>
     * 
     * @param arn
     *        The arn of the datasource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The unique ID of the data source.
     * </p>
     * 
     * @param dataSourceId
     *        The unique ID of the data source.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The unique ID of the data source.
     * </p>
     * 
     * @return The unique ID of the data source.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The unique ID of the data source.
     * </p>
     * 
     * @param dataSourceId
     *        The unique ID of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSummary withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @param name
     *        The name of the data source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @return The name of the data source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @param name
     *        The name of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * 
     * @param type
     *        The type of the data source.
     * @see DataSourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * 
     * @return The type of the data source.
     * @see DataSourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * 
     * @param type
     *        The type of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public DataSourceSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * 
     * @param type
     *        The type of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public DataSourceSummary withType(DataSourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the data source was created. This value is expressed in MM-DD-YYYY HH:MM:SS format.
     * </p>
     * 
     * @param createdTime
     *        The date and time that the data source was created. This value is expressed in MM-DD-YYYY HH:MM:SS format.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time that the data source was created. This value is expressed in MM-DD-YYYY HH:MM:SS format.
     * </p>
     * 
     * @return The date and time that the data source was created. This value is expressed in MM-DD-YYYY HH:MM:SS
     *         format.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time that the data source was created. This value is expressed in MM-DD-YYYY HH:MM:SS format.
     * </p>
     * 
     * @param createdTime
     *        The date and time that the data source was created. This value is expressed in MM-DD-YYYY HH:MM:SS format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The date and time the data source was last updated. This value is expressed in MM-DD-YYYY HH:MM:SS format.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time the data source was last updated. This value is expressed in MM-DD-YYYY HH:MM:SS format.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time the data source was last updated. This value is expressed in MM-DD-YYYY HH:MM:SS format.
     * </p>
     * 
     * @return The date and time the data source was last updated. This value is expressed in MM-DD-YYYY HH:MM:SS
     *         format.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time the data source was last updated. This value is expressed in MM-DD-YYYY HH:MM:SS format.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time the data source was last updated. This value is expressed in MM-DD-YYYY HH:MM:SS format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceSummary == false)
            return false;
        DataSourceSummary other = (DataSourceSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceSummary clone() {
        try {
            return (DataSourceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataSourceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
