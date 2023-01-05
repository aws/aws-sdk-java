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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about an imported annotation item.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/AnnotationImportItemDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnnotationImportItemDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The item's job status.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * The source file's location in Amazon S3.
     * </p>
     */
    private String source;

    /**
     * <p>
     * The item's job status.
     * </p>
     * 
     * @param jobStatus
     *        The item's job status.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The item's job status.
     * </p>
     * 
     * @return The item's job status.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The item's job status.
     * </p>
     * 
     * @param jobStatus
     *        The item's job status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public AnnotationImportItemDetail withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The item's job status.
     * </p>
     * 
     * @param jobStatus
     *        The item's job status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public AnnotationImportItemDetail withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The source file's location in Amazon S3.
     * </p>
     * 
     * @param source
     *        The source file's location in Amazon S3.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source file's location in Amazon S3.
     * </p>
     * 
     * @return The source file's location in Amazon S3.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source file's location in Amazon S3.
     * </p>
     * 
     * @param source
     *        The source file's location in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnnotationImportItemDetail withSource(String source) {
        setSource(source);
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
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnnotationImportItemDetail == false)
            return false;
        AnnotationImportItemDetail other = (AnnotationImportItemDetail) obj;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public AnnotationImportItemDetail clone() {
        try {
            return (AnnotationImportItemDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.AnnotationImportItemDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
