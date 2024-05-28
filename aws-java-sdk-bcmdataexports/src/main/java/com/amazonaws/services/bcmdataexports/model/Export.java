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
package com.amazonaws.services.bcmdataexports.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details that are available for an export.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/Export" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Export implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data query for this specific data export.
     * </p>
     */
    private DataQuery dataQuery;
    /**
     * <p>
     * The description for this specific data export.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The destination configuration for this specific data export.
     * </p>
     */
    private DestinationConfigurations destinationConfigurations;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for this export.
     * </p>
     */
    private String exportArn;
    /**
     * <p>
     * The name of this specific data export.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The cadence for Amazon Web Services to update the export in your S3 bucket.
     * </p>
     */
    private RefreshCadence refreshCadence;

    /**
     * <p>
     * The data query for this specific data export.
     * </p>
     * 
     * @param dataQuery
     *        The data query for this specific data export.
     */

    public void setDataQuery(DataQuery dataQuery) {
        this.dataQuery = dataQuery;
    }

    /**
     * <p>
     * The data query for this specific data export.
     * </p>
     * 
     * @return The data query for this specific data export.
     */

    public DataQuery getDataQuery() {
        return this.dataQuery;
    }

    /**
     * <p>
     * The data query for this specific data export.
     * </p>
     * 
     * @param dataQuery
     *        The data query for this specific data export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Export withDataQuery(DataQuery dataQuery) {
        setDataQuery(dataQuery);
        return this;
    }

    /**
     * <p>
     * The description for this specific data export.
     * </p>
     * 
     * @param description
     *        The description for this specific data export.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for this specific data export.
     * </p>
     * 
     * @return The description for this specific data export.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for this specific data export.
     * </p>
     * 
     * @param description
     *        The description for this specific data export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Export withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The destination configuration for this specific data export.
     * </p>
     * 
     * @param destinationConfigurations
     *        The destination configuration for this specific data export.
     */

    public void setDestinationConfigurations(DestinationConfigurations destinationConfigurations) {
        this.destinationConfigurations = destinationConfigurations;
    }

    /**
     * <p>
     * The destination configuration for this specific data export.
     * </p>
     * 
     * @return The destination configuration for this specific data export.
     */

    public DestinationConfigurations getDestinationConfigurations() {
        return this.destinationConfigurations;
    }

    /**
     * <p>
     * The destination configuration for this specific data export.
     * </p>
     * 
     * @param destinationConfigurations
     *        The destination configuration for this specific data export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Export withDestinationConfigurations(DestinationConfigurations destinationConfigurations) {
        setDestinationConfigurations(destinationConfigurations);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for this export.
     * </p>
     * 
     * @param exportArn
     *        The Amazon Resource Name (ARN) for this export.
     */

    public void setExportArn(String exportArn) {
        this.exportArn = exportArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for this export.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for this export.
     */

    public String getExportArn() {
        return this.exportArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for this export.
     * </p>
     * 
     * @param exportArn
     *        The Amazon Resource Name (ARN) for this export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Export withExportArn(String exportArn) {
        setExportArn(exportArn);
        return this;
    }

    /**
     * <p>
     * The name of this specific data export.
     * </p>
     * 
     * @param name
     *        The name of this specific data export.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this specific data export.
     * </p>
     * 
     * @return The name of this specific data export.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of this specific data export.
     * </p>
     * 
     * @param name
     *        The name of this specific data export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Export withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The cadence for Amazon Web Services to update the export in your S3 bucket.
     * </p>
     * 
     * @param refreshCadence
     *        The cadence for Amazon Web Services to update the export in your S3 bucket.
     */

    public void setRefreshCadence(RefreshCadence refreshCadence) {
        this.refreshCadence = refreshCadence;
    }

    /**
     * <p>
     * The cadence for Amazon Web Services to update the export in your S3 bucket.
     * </p>
     * 
     * @return The cadence for Amazon Web Services to update the export in your S3 bucket.
     */

    public RefreshCadence getRefreshCadence() {
        return this.refreshCadence;
    }

    /**
     * <p>
     * The cadence for Amazon Web Services to update the export in your S3 bucket.
     * </p>
     * 
     * @param refreshCadence
     *        The cadence for Amazon Web Services to update the export in your S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Export withRefreshCadence(RefreshCadence refreshCadence) {
        setRefreshCadence(refreshCadence);
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
        if (getDataQuery() != null)
            sb.append("DataQuery: ").append(getDataQuery()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDestinationConfigurations() != null)
            sb.append("DestinationConfigurations: ").append(getDestinationConfigurations()).append(",");
        if (getExportArn() != null)
            sb.append("ExportArn: ").append(getExportArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRefreshCadence() != null)
            sb.append("RefreshCadence: ").append(getRefreshCadence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Export == false)
            return false;
        Export other = (Export) obj;
        if (other.getDataQuery() == null ^ this.getDataQuery() == null)
            return false;
        if (other.getDataQuery() != null && other.getDataQuery().equals(this.getDataQuery()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDestinationConfigurations() == null ^ this.getDestinationConfigurations() == null)
            return false;
        if (other.getDestinationConfigurations() != null && other.getDestinationConfigurations().equals(this.getDestinationConfigurations()) == false)
            return false;
        if (other.getExportArn() == null ^ this.getExportArn() == null)
            return false;
        if (other.getExportArn() != null && other.getExportArn().equals(this.getExportArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRefreshCadence() == null ^ this.getRefreshCadence() == null)
            return false;
        if (other.getRefreshCadence() != null && other.getRefreshCadence().equals(this.getRefreshCadence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataQuery() == null) ? 0 : getDataQuery().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDestinationConfigurations() == null) ? 0 : getDestinationConfigurations().hashCode());
        hashCode = prime * hashCode + ((getExportArn() == null) ? 0 : getExportArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRefreshCadence() == null) ? 0 : getRefreshCadence().hashCode());
        return hashCode;
    }

    @Override
    public Export clone() {
        try {
            return (Export) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bcmdataexports.model.transform.ExportMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
