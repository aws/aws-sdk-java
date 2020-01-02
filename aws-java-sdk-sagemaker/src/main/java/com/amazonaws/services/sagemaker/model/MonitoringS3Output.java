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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about where and how you want to store the results of a monitoring job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MonitoringS3Output" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringS3Output implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring
     * job.
     * </p>
     */
    private String s3Uri;
    /**
     * <p>
     * The local path to the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job.
     * LocalPath is an absolute path for the output data.
     * </p>
     */
    private String localPath;
    /**
     * <p>
     * Whether to upload the results of the monitoring job continuously or after the job completes.
     * </p>
     */
    private String s3UploadMode;

    /**
     * <p>
     * A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring
     * job.
     * </p>
     * 
     * @param s3Uri
     *        A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results of a
     *        monitoring job.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring
     * job.
     * </p>
     * 
     * @return A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results of a
     *         monitoring job.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring
     * job.
     * </p>
     * 
     * @param s3Uri
     *        A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results of a
     *        monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringS3Output withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
        return this;
    }

    /**
     * <p>
     * The local path to the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job.
     * LocalPath is an absolute path for the output data.
     * </p>
     * 
     * @param localPath
     *        The local path to the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring
     *        job. LocalPath is an absolute path for the output data.
     */

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    /**
     * <p>
     * The local path to the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job.
     * LocalPath is an absolute path for the output data.
     * </p>
     * 
     * @return The local path to the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring
     *         job. LocalPath is an absolute path for the output data.
     */

    public String getLocalPath() {
        return this.localPath;
    }

    /**
     * <p>
     * The local path to the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job.
     * LocalPath is an absolute path for the output data.
     * </p>
     * 
     * @param localPath
     *        The local path to the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring
     *        job. LocalPath is an absolute path for the output data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringS3Output withLocalPath(String localPath) {
        setLocalPath(localPath);
        return this;
    }

    /**
     * <p>
     * Whether to upload the results of the monitoring job continuously or after the job completes.
     * </p>
     * 
     * @param s3UploadMode
     *        Whether to upload the results of the monitoring job continuously or after the job completes.
     * @see ProcessingS3UploadMode
     */

    public void setS3UploadMode(String s3UploadMode) {
        this.s3UploadMode = s3UploadMode;
    }

    /**
     * <p>
     * Whether to upload the results of the monitoring job continuously or after the job completes.
     * </p>
     * 
     * @return Whether to upload the results of the monitoring job continuously or after the job completes.
     * @see ProcessingS3UploadMode
     */

    public String getS3UploadMode() {
        return this.s3UploadMode;
    }

    /**
     * <p>
     * Whether to upload the results of the monitoring job continuously or after the job completes.
     * </p>
     * 
     * @param s3UploadMode
     *        Whether to upload the results of the monitoring job continuously or after the job completes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingS3UploadMode
     */

    public MonitoringS3Output withS3UploadMode(String s3UploadMode) {
        setS3UploadMode(s3UploadMode);
        return this;
    }

    /**
     * <p>
     * Whether to upload the results of the monitoring job continuously or after the job completes.
     * </p>
     * 
     * @param s3UploadMode
     *        Whether to upload the results of the monitoring job continuously or after the job completes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingS3UploadMode
     */

    public MonitoringS3Output withS3UploadMode(ProcessingS3UploadMode s3UploadMode) {
        this.s3UploadMode = s3UploadMode.toString();
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
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri()).append(",");
        if (getLocalPath() != null)
            sb.append("LocalPath: ").append(getLocalPath()).append(",");
        if (getS3UploadMode() != null)
            sb.append("S3UploadMode: ").append(getS3UploadMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringS3Output == false)
            return false;
        MonitoringS3Output other = (MonitoringS3Output) obj;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getLocalPath() == null ^ this.getLocalPath() == null)
            return false;
        if (other.getLocalPath() != null && other.getLocalPath().equals(this.getLocalPath()) == false)
            return false;
        if (other.getS3UploadMode() == null ^ this.getS3UploadMode() == null)
            return false;
        if (other.getS3UploadMode() != null && other.getS3UploadMode().equals(this.getS3UploadMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getLocalPath() == null) ? 0 : getLocalPath().hashCode());
        hashCode = prime * hashCode + ((getS3UploadMode() == null) ? 0 : getS3UploadMode().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringS3Output clone() {
        try {
            return (MonitoringS3Output) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MonitoringS3OutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
