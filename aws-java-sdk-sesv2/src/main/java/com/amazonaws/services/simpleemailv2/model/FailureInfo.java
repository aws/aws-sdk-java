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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains the failure details about an import job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/FailureInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailureInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Amazon S3 presigned URL that contains all the failed records and related information.
     * </p>
     */
    private String failedRecordsS3Url;
    /**
     * <p>
     * A message about why the import job failed.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * An Amazon S3 presigned URL that contains all the failed records and related information.
     * </p>
     * 
     * @param failedRecordsS3Url
     *        An Amazon S3 presigned URL that contains all the failed records and related information.
     */

    public void setFailedRecordsS3Url(String failedRecordsS3Url) {
        this.failedRecordsS3Url = failedRecordsS3Url;
    }

    /**
     * <p>
     * An Amazon S3 presigned URL that contains all the failed records and related information.
     * </p>
     * 
     * @return An Amazon S3 presigned URL that contains all the failed records and related information.
     */

    public String getFailedRecordsS3Url() {
        return this.failedRecordsS3Url;
    }

    /**
     * <p>
     * An Amazon S3 presigned URL that contains all the failed records and related information.
     * </p>
     * 
     * @param failedRecordsS3Url
     *        An Amazon S3 presigned URL that contains all the failed records and related information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureInfo withFailedRecordsS3Url(String failedRecordsS3Url) {
        setFailedRecordsS3Url(failedRecordsS3Url);
        return this;
    }

    /**
     * <p>
     * A message about why the import job failed.
     * </p>
     * 
     * @param errorMessage
     *        A message about why the import job failed.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * A message about why the import job failed.
     * </p>
     * 
     * @return A message about why the import job failed.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * A message about why the import job failed.
     * </p>
     * 
     * @param errorMessage
     *        A message about why the import job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureInfo withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getFailedRecordsS3Url() != null)
            sb.append("FailedRecordsS3Url: ").append(getFailedRecordsS3Url()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailureInfo == false)
            return false;
        FailureInfo other = (FailureInfo) obj;
        if (other.getFailedRecordsS3Url() == null ^ this.getFailedRecordsS3Url() == null)
            return false;
        if (other.getFailedRecordsS3Url() != null && other.getFailedRecordsS3Url().equals(this.getFailedRecordsS3Url()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedRecordsS3Url() == null) ? 0 : getFailedRecordsS3Url().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public FailureInfo clone() {
        try {
            return (FailureInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.FailureInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
