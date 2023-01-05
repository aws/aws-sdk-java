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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the output locations for job checkpoint data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/JobCheckpointConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobCheckpointConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * (Optional) The local directory where checkpoints are written. The default directory is
     * <code>/opt/braket/checkpoints/</code>.
     * </p>
     */
    private String localPath;
    /**
     * <p>
     * Identifies the S3 path where you want Amazon Braket to store checkpoints. For example,
     * <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     */
    private String s3Uri;

    /**
     * <p>
     * (Optional) The local directory where checkpoints are written. The default directory is
     * <code>/opt/braket/checkpoints/</code>.
     * </p>
     * 
     * @param localPath
     *        (Optional) The local directory where checkpoints are written. The default directory is
     *        <code>/opt/braket/checkpoints/</code>.
     */

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    /**
     * <p>
     * (Optional) The local directory where checkpoints are written. The default directory is
     * <code>/opt/braket/checkpoints/</code>.
     * </p>
     * 
     * @return (Optional) The local directory where checkpoints are written. The default directory is
     *         <code>/opt/braket/checkpoints/</code>.
     */

    public String getLocalPath() {
        return this.localPath;
    }

    /**
     * <p>
     * (Optional) The local directory where checkpoints are written. The default directory is
     * <code>/opt/braket/checkpoints/</code>.
     * </p>
     * 
     * @param localPath
     *        (Optional) The local directory where checkpoints are written. The default directory is
     *        <code>/opt/braket/checkpoints/</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobCheckpointConfig withLocalPath(String localPath) {
        setLocalPath(localPath);
        return this;
    }

    /**
     * <p>
     * Identifies the S3 path where you want Amazon Braket to store checkpoints. For example,
     * <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * 
     * @param s3Uri
     *        Identifies the S3 path where you want Amazon Braket to store checkpoints. For example,
     *        <code>s3://bucket-name/key-name-prefix</code>.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * Identifies the S3 path where you want Amazon Braket to store checkpoints. For example,
     * <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * 
     * @return Identifies the S3 path where you want Amazon Braket to store checkpoints. For example,
     *         <code>s3://bucket-name/key-name-prefix</code>.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * Identifies the S3 path where you want Amazon Braket to store checkpoints. For example,
     * <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * 
     * @param s3Uri
     *        Identifies the S3 path where you want Amazon Braket to store checkpoints. For example,
     *        <code>s3://bucket-name/key-name-prefix</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobCheckpointConfig withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
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
        if (getLocalPath() != null)
            sb.append("LocalPath: ").append(getLocalPath()).append(",");
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobCheckpointConfig == false)
            return false;
        JobCheckpointConfig other = (JobCheckpointConfig) obj;
        if (other.getLocalPath() == null ^ this.getLocalPath() == null)
            return false;
        if (other.getLocalPath() != null && other.getLocalPath().equals(this.getLocalPath()) == false)
            return false;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocalPath() == null) ? 0 : getLocalPath().hashCode());
        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        return hashCode;
    }

    @Override
    public JobCheckpointConfig clone() {
        try {
            return (JobCheckpointConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.braket.model.transform.JobCheckpointConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
