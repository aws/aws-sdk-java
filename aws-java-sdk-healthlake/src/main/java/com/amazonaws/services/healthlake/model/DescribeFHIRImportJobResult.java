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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DescribeFHIRImportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFHIRImportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The properties of the Import job request, including the ID, ARN, name, and the status of the job.
     * </p>
     */
    private ImportJobProperties importJobProperties;

    /**
     * <p>
     * The properties of the Import job request, including the ID, ARN, name, and the status of the job.
     * </p>
     * 
     * @param importJobProperties
     *        The properties of the Import job request, including the ID, ARN, name, and the status of the job.
     */

    public void setImportJobProperties(ImportJobProperties importJobProperties) {
        this.importJobProperties = importJobProperties;
    }

    /**
     * <p>
     * The properties of the Import job request, including the ID, ARN, name, and the status of the job.
     * </p>
     * 
     * @return The properties of the Import job request, including the ID, ARN, name, and the status of the job.
     */

    public ImportJobProperties getImportJobProperties() {
        return this.importJobProperties;
    }

    /**
     * <p>
     * The properties of the Import job request, including the ID, ARN, name, and the status of the job.
     * </p>
     * 
     * @param importJobProperties
     *        The properties of the Import job request, including the ID, ARN, name, and the status of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFHIRImportJobResult withImportJobProperties(ImportJobProperties importJobProperties) {
        setImportJobProperties(importJobProperties);
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
        if (getImportJobProperties() != null)
            sb.append("ImportJobProperties: ").append(getImportJobProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFHIRImportJobResult == false)
            return false;
        DescribeFHIRImportJobResult other = (DescribeFHIRImportJobResult) obj;
        if (other.getImportJobProperties() == null ^ this.getImportJobProperties() == null)
            return false;
        if (other.getImportJobProperties() != null && other.getImportJobProperties().equals(this.getImportJobProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportJobProperties() == null) ? 0 : getImportJobProperties().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFHIRImportJobResult clone() {
        try {
            return (DescribeFHIRImportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
