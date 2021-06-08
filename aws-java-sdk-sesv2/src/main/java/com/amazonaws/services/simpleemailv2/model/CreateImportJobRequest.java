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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to create an import job from a data source for a data destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/CreateImportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateImportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The destination for the import job.
     * </p>
     */
    private ImportDestination importDestination;
    /**
     * <p>
     * The data source for the import job.
     * </p>
     */
    private ImportDataSource importDataSource;

    /**
     * <p>
     * The destination for the import job.
     * </p>
     * 
     * @param importDestination
     *        The destination for the import job.
     */

    public void setImportDestination(ImportDestination importDestination) {
        this.importDestination = importDestination;
    }

    /**
     * <p>
     * The destination for the import job.
     * </p>
     * 
     * @return The destination for the import job.
     */

    public ImportDestination getImportDestination() {
        return this.importDestination;
    }

    /**
     * <p>
     * The destination for the import job.
     * </p>
     * 
     * @param importDestination
     *        The destination for the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImportJobRequest withImportDestination(ImportDestination importDestination) {
        setImportDestination(importDestination);
        return this;
    }

    /**
     * <p>
     * The data source for the import job.
     * </p>
     * 
     * @param importDataSource
     *        The data source for the import job.
     */

    public void setImportDataSource(ImportDataSource importDataSource) {
        this.importDataSource = importDataSource;
    }

    /**
     * <p>
     * The data source for the import job.
     * </p>
     * 
     * @return The data source for the import job.
     */

    public ImportDataSource getImportDataSource() {
        return this.importDataSource;
    }

    /**
     * <p>
     * The data source for the import job.
     * </p>
     * 
     * @param importDataSource
     *        The data source for the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImportJobRequest withImportDataSource(ImportDataSource importDataSource) {
        setImportDataSource(importDataSource);
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
        if (getImportDestination() != null)
            sb.append("ImportDestination: ").append(getImportDestination()).append(",");
        if (getImportDataSource() != null)
            sb.append("ImportDataSource: ").append(getImportDataSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateImportJobRequest == false)
            return false;
        CreateImportJobRequest other = (CreateImportJobRequest) obj;
        if (other.getImportDestination() == null ^ this.getImportDestination() == null)
            return false;
        if (other.getImportDestination() != null && other.getImportDestination().equals(this.getImportDestination()) == false)
            return false;
        if (other.getImportDataSource() == null ^ this.getImportDataSource() == null)
            return false;
        if (other.getImportDataSource() != null && other.getImportDataSource().equals(this.getImportDataSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportDestination() == null) ? 0 : getImportDestination().hashCode());
        hashCode = prime * hashCode + ((getImportDataSource() == null) ? 0 : getImportDataSource().hashCode());
        return hashCode;
    }

    @Override
    public CreateImportJobRequest clone() {
        return (CreateImportJobRequest) super.clone();
    }

}
