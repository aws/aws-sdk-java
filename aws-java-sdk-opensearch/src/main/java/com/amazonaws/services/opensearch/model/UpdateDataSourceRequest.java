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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code>UpdateDataSource</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDataSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The name of the data source to modify.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of data source.
     * </p>
     */
    private DataSourceType dataSourceType;
    /**
     * <p>
     * A new description of the data source.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The status of the data source update request.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param domainName
     *        The name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @return The name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param domainName
     *        The name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The name of the data source to modify.
     * </p>
     * 
     * @param name
     *        The name of the data source to modify.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data source to modify.
     * </p>
     * 
     * @return The name of the data source to modify.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data source to modify.
     * </p>
     * 
     * @param name
     *        The name of the data source to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of data source.
     * </p>
     * 
     * @param dataSourceType
     *        The type of data source.
     */

    public void setDataSourceType(DataSourceType dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    /**
     * <p>
     * The type of data source.
     * </p>
     * 
     * @return The type of data source.
     */

    public DataSourceType getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * <p>
     * The type of data source.
     * </p>
     * 
     * @param dataSourceType
     *        The type of data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withDataSourceType(DataSourceType dataSourceType) {
        setDataSourceType(dataSourceType);
        return this;
    }

    /**
     * <p>
     * A new description of the data source.
     * </p>
     * 
     * @param description
     *        A new description of the data source.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A new description of the data source.
     * </p>
     * 
     * @return A new description of the data source.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A new description of the data source.
     * </p>
     * 
     * @param description
     *        A new description of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The status of the data source update request.
     * </p>
     * 
     * @param status
     *        The status of the data source update request.
     * @see DataSourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the data source update request.
     * </p>
     * 
     * @return The status of the data source update request.
     * @see DataSourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the data source update request.
     * </p>
     * 
     * @param status
     *        The status of the data source update request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceStatus
     */

    public UpdateDataSourceRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the data source update request.
     * </p>
     * 
     * @param status
     *        The status of the data source update request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceStatus
     */

    public UpdateDataSourceRequest withStatus(DataSourceStatus status) {
        this.status = status.toString();
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDataSourceType() != null)
            sb.append("DataSourceType: ").append(getDataSourceType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
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
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDataSourceType() == null ^ this.getDataSourceType() == null)
            return false;
        if (other.getDataSourceType() != null && other.getDataSourceType().equals(this.getDataSourceType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDataSourceType() == null) ? 0 : getDataSourceType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDataSourceRequest clone() {
        return (UpdateDataSourceRequest) super.clone();
    }

}
