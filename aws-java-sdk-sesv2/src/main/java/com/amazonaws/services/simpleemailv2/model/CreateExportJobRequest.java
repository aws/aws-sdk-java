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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to create an export job from a data source to a data destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateExportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The data source for the export job.
     * </p>
     */
    private ExportDataSource exportDataSource;
    /**
     * <p>
     * The destination for the export job.
     * </p>
     */
    private ExportDestination exportDestination;

    /**
     * <p>
     * The data source for the export job.
     * </p>
     * 
     * @param exportDataSource
     *        The data source for the export job.
     */

    public void setExportDataSource(ExportDataSource exportDataSource) {
        this.exportDataSource = exportDataSource;
    }

    /**
     * <p>
     * The data source for the export job.
     * </p>
     * 
     * @return The data source for the export job.
     */

    public ExportDataSource getExportDataSource() {
        return this.exportDataSource;
    }

    /**
     * <p>
     * The data source for the export job.
     * </p>
     * 
     * @param exportDataSource
     *        The data source for the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExportJobRequest withExportDataSource(ExportDataSource exportDataSource) {
        setExportDataSource(exportDataSource);
        return this;
    }

    /**
     * <p>
     * The destination for the export job.
     * </p>
     * 
     * @param exportDestination
     *        The destination for the export job.
     */

    public void setExportDestination(ExportDestination exportDestination) {
        this.exportDestination = exportDestination;
    }

    /**
     * <p>
     * The destination for the export job.
     * </p>
     * 
     * @return The destination for the export job.
     */

    public ExportDestination getExportDestination() {
        return this.exportDestination;
    }

    /**
     * <p>
     * The destination for the export job.
     * </p>
     * 
     * @param exportDestination
     *        The destination for the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExportJobRequest withExportDestination(ExportDestination exportDestination) {
        setExportDestination(exportDestination);
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
        if (getExportDataSource() != null)
            sb.append("ExportDataSource: ").append(getExportDataSource()).append(",");
        if (getExportDestination() != null)
            sb.append("ExportDestination: ").append(getExportDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateExportJobRequest == false)
            return false;
        CreateExportJobRequest other = (CreateExportJobRequest) obj;
        if (other.getExportDataSource() == null ^ this.getExportDataSource() == null)
            return false;
        if (other.getExportDataSource() != null && other.getExportDataSource().equals(this.getExportDataSource()) == false)
            return false;
        if (other.getExportDestination() == null ^ this.getExportDestination() == null)
            return false;
        if (other.getExportDestination() != null && other.getExportDestination().equals(this.getExportDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportDataSource() == null) ? 0 : getExportDataSource().hashCode());
        hashCode = prime * hashCode + ((getExportDestination() == null) ? 0 : getExportDestination().hashCode());
        return hashCode;
    }

    @Override
    public CreateExportJobRequest clone() {
        return (CreateExportJobRequest) super.clone();
    }

}
