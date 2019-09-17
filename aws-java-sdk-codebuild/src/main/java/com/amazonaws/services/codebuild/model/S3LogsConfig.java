/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about S3 logs for a build project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/S3LogsConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3LogsConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current status of the S3 build logs. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: S3 build logs are enabled for this build project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>: S3 build logs are not enabled for this build project.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The ARN of an S3 bucket and the path prefix for S3 logs. If your Amazon S3 bucket name is <code>my-bucket</code>,
     * and your path prefix is <code>build-log</code>, then acceptable formats are <code>my-bucket/build-log</code> or
     * <code>arn:aws:s3:::my-bucket/build-log</code>.
     * </p>
     */
    private String location;
    /**
     * <p>
     * Set to true if you do not want your S3 build log output encrypted. By default S3 build logs are encrypted.
     * </p>
     */
    private Boolean encryptionDisabled;

    /**
     * <p>
     * The current status of the S3 build logs. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: S3 build logs are enabled for this build project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>: S3 build logs are not enabled for this build project.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the S3 build logs. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code>: S3 build logs are enabled for this build project.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code>: S3 build logs are not enabled for this build project.
     *        </p>
     *        </li>
     * @see LogsConfigStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the S3 build logs. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: S3 build logs are enabled for this build project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>: S3 build logs are not enabled for this build project.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the S3 build logs. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLED</code>: S3 build logs are enabled for this build project.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code>: S3 build logs are not enabled for this build project.
     *         </p>
     *         </li>
     * @see LogsConfigStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the S3 build logs. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: S3 build logs are enabled for this build project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>: S3 build logs are not enabled for this build project.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the S3 build logs. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code>: S3 build logs are enabled for this build project.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code>: S3 build logs are not enabled for this build project.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogsConfigStatusType
     */

    public S3LogsConfig withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the S3 build logs. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: S3 build logs are enabled for this build project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>: S3 build logs are not enabled for this build project.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the S3 build logs. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code>: S3 build logs are enabled for this build project.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code>: S3 build logs are not enabled for this build project.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogsConfigStatusType
     */

    public S3LogsConfig withStatus(LogsConfigStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of an S3 bucket and the path prefix for S3 logs. If your Amazon S3 bucket name is <code>my-bucket</code>,
     * and your path prefix is <code>build-log</code>, then acceptable formats are <code>my-bucket/build-log</code> or
     * <code>arn:aws:s3:::my-bucket/build-log</code>.
     * </p>
     * 
     * @param location
     *        The ARN of an S3 bucket and the path prefix for S3 logs. If your Amazon S3 bucket name is
     *        <code>my-bucket</code>, and your path prefix is <code>build-log</code>, then acceptable formats are
     *        <code>my-bucket/build-log</code> or <code>arn:aws:s3:::my-bucket/build-log</code>.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The ARN of an S3 bucket and the path prefix for S3 logs. If your Amazon S3 bucket name is <code>my-bucket</code>,
     * and your path prefix is <code>build-log</code>, then acceptable formats are <code>my-bucket/build-log</code> or
     * <code>arn:aws:s3:::my-bucket/build-log</code>.
     * </p>
     * 
     * @return The ARN of an S3 bucket and the path prefix for S3 logs. If your Amazon S3 bucket name is
     *         <code>my-bucket</code>, and your path prefix is <code>build-log</code>, then acceptable formats are
     *         <code>my-bucket/build-log</code> or <code>arn:aws:s3:::my-bucket/build-log</code>.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The ARN of an S3 bucket and the path prefix for S3 logs. If your Amazon S3 bucket name is <code>my-bucket</code>,
     * and your path prefix is <code>build-log</code>, then acceptable formats are <code>my-bucket/build-log</code> or
     * <code>arn:aws:s3:::my-bucket/build-log</code>.
     * </p>
     * 
     * @param location
     *        The ARN of an S3 bucket and the path prefix for S3 logs. If your Amazon S3 bucket name is
     *        <code>my-bucket</code>, and your path prefix is <code>build-log</code>, then acceptable formats are
     *        <code>my-bucket/build-log</code> or <code>arn:aws:s3:::my-bucket/build-log</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3LogsConfig withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * Set to true if you do not want your S3 build log output encrypted. By default S3 build logs are encrypted.
     * </p>
     * 
     * @param encryptionDisabled
     *        Set to true if you do not want your S3 build log output encrypted. By default S3 build logs are encrypted.
     */

    public void setEncryptionDisabled(Boolean encryptionDisabled) {
        this.encryptionDisabled = encryptionDisabled;
    }

    /**
     * <p>
     * Set to true if you do not want your S3 build log output encrypted. By default S3 build logs are encrypted.
     * </p>
     * 
     * @return Set to true if you do not want your S3 build log output encrypted. By default S3 build logs are
     *         encrypted.
     */

    public Boolean getEncryptionDisabled() {
        return this.encryptionDisabled;
    }

    /**
     * <p>
     * Set to true if you do not want your S3 build log output encrypted. By default S3 build logs are encrypted.
     * </p>
     * 
     * @param encryptionDisabled
     *        Set to true if you do not want your S3 build log output encrypted. By default S3 build logs are encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3LogsConfig withEncryptionDisabled(Boolean encryptionDisabled) {
        setEncryptionDisabled(encryptionDisabled);
        return this;
    }

    /**
     * <p>
     * Set to true if you do not want your S3 build log output encrypted. By default S3 build logs are encrypted.
     * </p>
     * 
     * @return Set to true if you do not want your S3 build log output encrypted. By default S3 build logs are
     *         encrypted.
     */

    public Boolean isEncryptionDisabled() {
        return this.encryptionDisabled;
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getEncryptionDisabled() != null)
            sb.append("EncryptionDisabled: ").append(getEncryptionDisabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3LogsConfig == false)
            return false;
        S3LogsConfig other = (S3LogsConfig) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getEncryptionDisabled() == null ^ this.getEncryptionDisabled() == null)
            return false;
        if (other.getEncryptionDisabled() != null && other.getEncryptionDisabled().equals(this.getEncryptionDisabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getEncryptionDisabled() == null) ? 0 : getEncryptionDisabled().hashCode());
        return hashCode;
    }

    @Override
    public S3LogsConfig clone() {
        try {
            return (S3LogsConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.S3LogsConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
