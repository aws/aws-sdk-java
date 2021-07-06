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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the connection between a Lambda function and an <a
 * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-filesystem.html">Amazon EFS file system</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/FileSystemConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileSystemConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon EFS access point that provides access to the file system.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The path where the function can access the file system, starting with <code>/mnt/</code>.
     * </p>
     */
    private String localMountPath;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon EFS access point that provides access to the file system.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the Amazon EFS access point that provides access to the file system.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon EFS access point that provides access to the file system.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon EFS access point that provides access to the file system.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon EFS access point that provides access to the file system.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the Amazon EFS access point that provides access to the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemConfig withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The path where the function can access the file system, starting with <code>/mnt/</code>.
     * </p>
     * 
     * @param localMountPath
     *        The path where the function can access the file system, starting with <code>/mnt/</code>.
     */

    public void setLocalMountPath(String localMountPath) {
        this.localMountPath = localMountPath;
    }

    /**
     * <p>
     * The path where the function can access the file system, starting with <code>/mnt/</code>.
     * </p>
     * 
     * @return The path where the function can access the file system, starting with <code>/mnt/</code>.
     */

    public String getLocalMountPath() {
        return this.localMountPath;
    }

    /**
     * <p>
     * The path where the function can access the file system, starting with <code>/mnt/</code>.
     * </p>
     * 
     * @param localMountPath
     *        The path where the function can access the file system, starting with <code>/mnt/</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemConfig withLocalMountPath(String localMountPath) {
        setLocalMountPath(localMountPath);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getLocalMountPath() != null)
            sb.append("LocalMountPath: ").append(getLocalMountPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileSystemConfig == false)
            return false;
        FileSystemConfig other = (FileSystemConfig) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getLocalMountPath() == null ^ this.getLocalMountPath() == null)
            return false;
        if (other.getLocalMountPath() != null && other.getLocalMountPath().equals(this.getLocalMountPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getLocalMountPath() == null) ? 0 : getLocalMountPath().hashCode());
        return hashCode;
    }

    @Override
    public FileSystemConfig clone() {
        try {
            return (FileSystemConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.FileSystemConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
