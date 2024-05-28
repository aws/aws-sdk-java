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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetImportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The import job.
     * </p>
     */
    private ImportJobData importJob;

    /**
     * <p>
     * The import job.
     * </p>
     * 
     * @param importJob
     *        The import job.
     */

    public void setImportJob(ImportJobData importJob) {
        this.importJob = importJob;
    }

    /**
     * <p>
     * The import job.
     * </p>
     * 
     * @return The import job.
     */

    public ImportJobData getImportJob() {
        return this.importJob;
    }

    /**
     * <p>
     * The import job.
     * </p>
     * 
     * @param importJob
     *        The import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportJobResult withImportJob(ImportJobData importJob) {
        setImportJob(importJob);
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
        if (getImportJob() != null)
            sb.append("ImportJob: ").append(getImportJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImportJobResult == false)
            return false;
        GetImportJobResult other = (GetImportJobResult) obj;
        if (other.getImportJob() == null ^ this.getImportJob() == null)
            return false;
        if (other.getImportJob() != null && other.getImportJob().equals(this.getImportJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportJob() == null) ? 0 : getImportJob().hashCode());
        return hashCode;
    }

    @Override
    public GetImportJobResult clone() {
        try {
            return (GetImportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
