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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about logs built to an S3 bucket for a build project.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCodeBuildProjectLogsConfigS3LogsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCodeBuildProjectLogsConfigS3LogsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to disable encryption of the S3 build log output.
     * </p>
     */
    private Boolean encryptionDisabled;
    /**
     * <p>
     * The ARN of the S3 bucket and the path prefix for S3 logs.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The current status of the S3 build logs.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Whether to disable encryption of the S3 build log output.
     * </p>
     * 
     * @param encryptionDisabled
     *        Whether to disable encryption of the S3 build log output.
     */

    public void setEncryptionDisabled(Boolean encryptionDisabled) {
        this.encryptionDisabled = encryptionDisabled;
    }

    /**
     * <p>
     * Whether to disable encryption of the S3 build log output.
     * </p>
     * 
     * @return Whether to disable encryption of the S3 build log output.
     */

    public Boolean getEncryptionDisabled() {
        return this.encryptionDisabled;
    }

    /**
     * <p>
     * Whether to disable encryption of the S3 build log output.
     * </p>
     * 
     * @param encryptionDisabled
     *        Whether to disable encryption of the S3 build log output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectLogsConfigS3LogsDetails withEncryptionDisabled(Boolean encryptionDisabled) {
        setEncryptionDisabled(encryptionDisabled);
        return this;
    }

    /**
     * <p>
     * Whether to disable encryption of the S3 build log output.
     * </p>
     * 
     * @return Whether to disable encryption of the S3 build log output.
     */

    public Boolean isEncryptionDisabled() {
        return this.encryptionDisabled;
    }

    /**
     * <p>
     * The ARN of the S3 bucket and the path prefix for S3 logs.
     * </p>
     * 
     * @param location
     *        The ARN of the S3 bucket and the path prefix for S3 logs.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The ARN of the S3 bucket and the path prefix for S3 logs.
     * </p>
     * 
     * @return The ARN of the S3 bucket and the path prefix for S3 logs.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The ARN of the S3 bucket and the path prefix for S3 logs.
     * </p>
     * 
     * @param location
     *        The ARN of the S3 bucket and the path prefix for S3 logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectLogsConfigS3LogsDetails withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The current status of the S3 build logs.
     * </p>
     * 
     * @param status
     *        The current status of the S3 build logs.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the S3 build logs.
     * </p>
     * 
     * @return The current status of the S3 build logs.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the S3 build logs.
     * </p>
     * 
     * @param status
     *        The current status of the S3 build logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectLogsConfigS3LogsDetails withStatus(String status) {
        setStatus(status);
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
        if (getEncryptionDisabled() != null)
            sb.append("EncryptionDisabled: ").append(getEncryptionDisabled()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCodeBuildProjectLogsConfigS3LogsDetails == false)
            return false;
        AwsCodeBuildProjectLogsConfigS3LogsDetails other = (AwsCodeBuildProjectLogsConfigS3LogsDetails) obj;
        if (other.getEncryptionDisabled() == null ^ this.getEncryptionDisabled() == null)
            return false;
        if (other.getEncryptionDisabled() != null && other.getEncryptionDisabled().equals(this.getEncryptionDisabled()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionDisabled() == null) ? 0 : getEncryptionDisabled().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AwsCodeBuildProjectLogsConfigS3LogsDetails clone() {
        try {
            return (AwsCodeBuildProjectLogsConfigS3LogsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCodeBuildProjectLogsConfigS3LogsDetailsMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
