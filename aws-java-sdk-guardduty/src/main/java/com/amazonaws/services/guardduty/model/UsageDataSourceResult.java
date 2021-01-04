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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information on the result of usage based on data source type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UsageDataSourceResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageDataSourceResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data source type that generated usage.
     * </p>
     */
    private String dataSource;
    /**
     * <p>
     * Represents the total of usage for the specified data source.
     * </p>
     */
    private Total total;

    /**
     * <p>
     * The data source type that generated usage.
     * </p>
     * 
     * @param dataSource
     *        The data source type that generated usage.
     * @see DataSource
     */

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The data source type that generated usage.
     * </p>
     * 
     * @return The data source type that generated usage.
     * @see DataSource
     */

    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The data source type that generated usage.
     * </p>
     * 
     * @param dataSource
     *        The data source type that generated usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSource
     */

    public UsageDataSourceResult withDataSource(String dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The data source type that generated usage.
     * </p>
     * 
     * @param dataSource
     *        The data source type that generated usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSource
     */

    public UsageDataSourceResult withDataSource(DataSource dataSource) {
        this.dataSource = dataSource.toString();
        return this;
    }

    /**
     * <p>
     * Represents the total of usage for the specified data source.
     * </p>
     * 
     * @param total
     *        Represents the total of usage for the specified data source.
     */

    public void setTotal(Total total) {
        this.total = total;
    }

    /**
     * <p>
     * Represents the total of usage for the specified data source.
     * </p>
     * 
     * @return Represents the total of usage for the specified data source.
     */

    public Total getTotal() {
        return this.total;
    }

    /**
     * <p>
     * Represents the total of usage for the specified data source.
     * </p>
     * 
     * @param total
     *        Represents the total of usage for the specified data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageDataSourceResult withTotal(Total total) {
        setTotal(total);
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
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageDataSourceResult == false)
            return false;
        UsageDataSourceResult other = (UsageDataSourceResult) obj;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        return hashCode;
    }

    @Override
    public UsageDataSourceResult clone() {
        try {
            return (UsageDataSourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.UsageDataSourceResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
