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
package com.amazonaws.services.healthlake.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DescribeFHIRExportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFHIRExportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Displays the properties of the export job, including the ID, Arn, Name, and the status of the job.
     * </p>
     */
    private ExportJobProperties exportJobProperties;

    /**
     * <p>
     * Displays the properties of the export job, including the ID, Arn, Name, and the status of the job.
     * </p>
     * 
     * @param exportJobProperties
     *        Displays the properties of the export job, including the ID, Arn, Name, and the status of the job.
     */

    public void setExportJobProperties(ExportJobProperties exportJobProperties) {
        this.exportJobProperties = exportJobProperties;
    }

    /**
     * <p>
     * Displays the properties of the export job, including the ID, Arn, Name, and the status of the job.
     * </p>
     * 
     * @return Displays the properties of the export job, including the ID, Arn, Name, and the status of the job.
     */

    public ExportJobProperties getExportJobProperties() {
        return this.exportJobProperties;
    }

    /**
     * <p>
     * Displays the properties of the export job, including the ID, Arn, Name, and the status of the job.
     * </p>
     * 
     * @param exportJobProperties
     *        Displays the properties of the export job, including the ID, Arn, Name, and the status of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFHIRExportJobResult withExportJobProperties(ExportJobProperties exportJobProperties) {
        setExportJobProperties(exportJobProperties);
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
        if (getExportJobProperties() != null)
            sb.append("ExportJobProperties: ").append(getExportJobProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFHIRExportJobResult == false)
            return false;
        DescribeFHIRExportJobResult other = (DescribeFHIRExportJobResult) obj;
        if (other.getExportJobProperties() == null ^ this.getExportJobProperties() == null)
            return false;
        if (other.getExportJobProperties() != null && other.getExportJobProperties().equals(this.getExportJobProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportJobProperties() == null) ? 0 : getExportJobProperties().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFHIRExportJobResult clone() {
        try {
            return (DescribeFHIRExportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
