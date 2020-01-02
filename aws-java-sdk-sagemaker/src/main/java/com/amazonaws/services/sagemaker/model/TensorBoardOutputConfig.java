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
 * Configuration of storage locations for TensorBoard output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TensorBoardOutputConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TensorBoardOutputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Path to local storage location for tensorBoard output. Defaults to <code>/opt/ml/output/tensorboard</code>.
     * </p>
     */
    private String localPath;
    /**
     * <p>
     * Path to Amazon S3 storage location for TensorBoard output.
     * </p>
     */
    private String s3OutputPath;

    /**
     * <p>
     * Path to local storage location for tensorBoard output. Defaults to <code>/opt/ml/output/tensorboard</code>.
     * </p>
     * 
     * @param localPath
     *        Path to local storage location for tensorBoard output. Defaults to <code>/opt/ml/output/tensorboard</code>
     *        .
     */

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    /**
     * <p>
     * Path to local storage location for tensorBoard output. Defaults to <code>/opt/ml/output/tensorboard</code>.
     * </p>
     * 
     * @return Path to local storage location for tensorBoard output. Defaults to
     *         <code>/opt/ml/output/tensorboard</code>.
     */

    public String getLocalPath() {
        return this.localPath;
    }

    /**
     * <p>
     * Path to local storage location for tensorBoard output. Defaults to <code>/opt/ml/output/tensorboard</code>.
     * </p>
     * 
     * @param localPath
     *        Path to local storage location for tensorBoard output. Defaults to <code>/opt/ml/output/tensorboard</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TensorBoardOutputConfig withLocalPath(String localPath) {
        setLocalPath(localPath);
        return this;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for TensorBoard output.
     * </p>
     * 
     * @param s3OutputPath
     *        Path to Amazon S3 storage location for TensorBoard output.
     */

    public void setS3OutputPath(String s3OutputPath) {
        this.s3OutputPath = s3OutputPath;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for TensorBoard output.
     * </p>
     * 
     * @return Path to Amazon S3 storage location for TensorBoard output.
     */

    public String getS3OutputPath() {
        return this.s3OutputPath;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for TensorBoard output.
     * </p>
     * 
     * @param s3OutputPath
     *        Path to Amazon S3 storage location for TensorBoard output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TensorBoardOutputConfig withS3OutputPath(String s3OutputPath) {
        setS3OutputPath(s3OutputPath);
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
        if (getS3OutputPath() != null)
            sb.append("S3OutputPath: ").append(getS3OutputPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TensorBoardOutputConfig == false)
            return false;
        TensorBoardOutputConfig other = (TensorBoardOutputConfig) obj;
        if (other.getLocalPath() == null ^ this.getLocalPath() == null)
            return false;
        if (other.getLocalPath() != null && other.getLocalPath().equals(this.getLocalPath()) == false)
            return false;
        if (other.getS3OutputPath() == null ^ this.getS3OutputPath() == null)
            return false;
        if (other.getS3OutputPath() != null && other.getS3OutputPath().equals(this.getS3OutputPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocalPath() == null) ? 0 : getLocalPath().hashCode());
        hashCode = prime * hashCode + ((getS3OutputPath() == null) ? 0 : getS3OutputPath().hashCode());
        return hashCode;
    }

    @Override
    public TensorBoardOutputConfig clone() {
        try {
            return (TensorBoardOutputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TensorBoardOutputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
