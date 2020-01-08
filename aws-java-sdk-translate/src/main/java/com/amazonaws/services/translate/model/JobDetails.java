/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The number of documents successfully and unsuccessfully processed during a translation job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/JobDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of documents successfully processed during a translation job.
     * </p>
     */
    private Integer translatedDocumentsCount;
    /**
     * <p>
     * The number of documents that could not be processed during a translation job.
     * </p>
     */
    private Integer documentsWithErrorsCount;
    /**
     * <p>
     * The number of documents used as input in a translation job.
     * </p>
     */
    private Integer inputDocumentsCount;

    /**
     * <p>
     * The number of documents successfully processed during a translation job.
     * </p>
     * 
     * @param translatedDocumentsCount
     *        The number of documents successfully processed during a translation job.
     */

    public void setTranslatedDocumentsCount(Integer translatedDocumentsCount) {
        this.translatedDocumentsCount = translatedDocumentsCount;
    }

    /**
     * <p>
     * The number of documents successfully processed during a translation job.
     * </p>
     * 
     * @return The number of documents successfully processed during a translation job.
     */

    public Integer getTranslatedDocumentsCount() {
        return this.translatedDocumentsCount;
    }

    /**
     * <p>
     * The number of documents successfully processed during a translation job.
     * </p>
     * 
     * @param translatedDocumentsCount
     *        The number of documents successfully processed during a translation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetails withTranslatedDocumentsCount(Integer translatedDocumentsCount) {
        setTranslatedDocumentsCount(translatedDocumentsCount);
        return this;
    }

    /**
     * <p>
     * The number of documents that could not be processed during a translation job.
     * </p>
     * 
     * @param documentsWithErrorsCount
     *        The number of documents that could not be processed during a translation job.
     */

    public void setDocumentsWithErrorsCount(Integer documentsWithErrorsCount) {
        this.documentsWithErrorsCount = documentsWithErrorsCount;
    }

    /**
     * <p>
     * The number of documents that could not be processed during a translation job.
     * </p>
     * 
     * @return The number of documents that could not be processed during a translation job.
     */

    public Integer getDocumentsWithErrorsCount() {
        return this.documentsWithErrorsCount;
    }

    /**
     * <p>
     * The number of documents that could not be processed during a translation job.
     * </p>
     * 
     * @param documentsWithErrorsCount
     *        The number of documents that could not be processed during a translation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetails withDocumentsWithErrorsCount(Integer documentsWithErrorsCount) {
        setDocumentsWithErrorsCount(documentsWithErrorsCount);
        return this;
    }

    /**
     * <p>
     * The number of documents used as input in a translation job.
     * </p>
     * 
     * @param inputDocumentsCount
     *        The number of documents used as input in a translation job.
     */

    public void setInputDocumentsCount(Integer inputDocumentsCount) {
        this.inputDocumentsCount = inputDocumentsCount;
    }

    /**
     * <p>
     * The number of documents used as input in a translation job.
     * </p>
     * 
     * @return The number of documents used as input in a translation job.
     */

    public Integer getInputDocumentsCount() {
        return this.inputDocumentsCount;
    }

    /**
     * <p>
     * The number of documents used as input in a translation job.
     * </p>
     * 
     * @param inputDocumentsCount
     *        The number of documents used as input in a translation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetails withInputDocumentsCount(Integer inputDocumentsCount) {
        setInputDocumentsCount(inputDocumentsCount);
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
        if (getTranslatedDocumentsCount() != null)
            sb.append("TranslatedDocumentsCount: ").append(getTranslatedDocumentsCount()).append(",");
        if (getDocumentsWithErrorsCount() != null)
            sb.append("DocumentsWithErrorsCount: ").append(getDocumentsWithErrorsCount()).append(",");
        if (getInputDocumentsCount() != null)
            sb.append("InputDocumentsCount: ").append(getInputDocumentsCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobDetails == false)
            return false;
        JobDetails other = (JobDetails) obj;
        if (other.getTranslatedDocumentsCount() == null ^ this.getTranslatedDocumentsCount() == null)
            return false;
        if (other.getTranslatedDocumentsCount() != null && other.getTranslatedDocumentsCount().equals(this.getTranslatedDocumentsCount()) == false)
            return false;
        if (other.getDocumentsWithErrorsCount() == null ^ this.getDocumentsWithErrorsCount() == null)
            return false;
        if (other.getDocumentsWithErrorsCount() != null && other.getDocumentsWithErrorsCount().equals(this.getDocumentsWithErrorsCount()) == false)
            return false;
        if (other.getInputDocumentsCount() == null ^ this.getInputDocumentsCount() == null)
            return false;
        if (other.getInputDocumentsCount() != null && other.getInputDocumentsCount().equals(this.getInputDocumentsCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTranslatedDocumentsCount() == null) ? 0 : getTranslatedDocumentsCount().hashCode());
        hashCode = prime * hashCode + ((getDocumentsWithErrorsCount() == null) ? 0 : getDocumentsWithErrorsCount().hashCode());
        hashCode = prime * hashCode + ((getInputDocumentsCount() == null) ? 0 : getInputDocumentsCount().hashCode());
        return hashCode;
    }

    @Override
    public JobDetails clone() {
        try {
            return (JobDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.translate.model.transform.JobDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
