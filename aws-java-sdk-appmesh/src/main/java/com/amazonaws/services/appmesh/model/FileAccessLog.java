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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing an access log file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/FileAccessLog" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileAccessLog implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file path to write access logs to. You can use <code>/dev/stdout</code> to send access logs to standard out
     * and configure your Envoy container to use a log driver, such as <code>awslogs</code>, to export the access logs
     * to a log storage service such as Amazon CloudWatch Logs. You can also specify a path in the Envoy container's
     * file system to write the files to disk.
     * </p>
     * <note>
     * <p>
     * The Envoy process must have write permissions to the path that you specify here. Otherwise, Envoy fails to
     * bootstrap properly.
     * </p>
     * </note>
     */
    private String path;

    /**
     * <p>
     * The file path to write access logs to. You can use <code>/dev/stdout</code> to send access logs to standard out
     * and configure your Envoy container to use a log driver, such as <code>awslogs</code>, to export the access logs
     * to a log storage service such as Amazon CloudWatch Logs. You can also specify a path in the Envoy container's
     * file system to write the files to disk.
     * </p>
     * <note>
     * <p>
     * The Envoy process must have write permissions to the path that you specify here. Otherwise, Envoy fails to
     * bootstrap properly.
     * </p>
     * </note>
     * 
     * @param path
     *        The file path to write access logs to. You can use <code>/dev/stdout</code> to send access logs to
     *        standard out and configure your Envoy container to use a log driver, such as <code>awslogs</code>, to
     *        export the access logs to a log storage service such as Amazon CloudWatch Logs. You can also specify a
     *        path in the Envoy container's file system to write the files to disk.</p> <note>
     *        <p>
     *        The Envoy process must have write permissions to the path that you specify here. Otherwise, Envoy fails to
     *        bootstrap properly.
     *        </p>
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The file path to write access logs to. You can use <code>/dev/stdout</code> to send access logs to standard out
     * and configure your Envoy container to use a log driver, such as <code>awslogs</code>, to export the access logs
     * to a log storage service such as Amazon CloudWatch Logs. You can also specify a path in the Envoy container's
     * file system to write the files to disk.
     * </p>
     * <note>
     * <p>
     * The Envoy process must have write permissions to the path that you specify here. Otherwise, Envoy fails to
     * bootstrap properly.
     * </p>
     * </note>
     * 
     * @return The file path to write access logs to. You can use <code>/dev/stdout</code> to send access logs to
     *         standard out and configure your Envoy container to use a log driver, such as <code>awslogs</code>, to
     *         export the access logs to a log storage service such as Amazon CloudWatch Logs. You can also specify a
     *         path in the Envoy container's file system to write the files to disk.</p> <note>
     *         <p>
     *         The Envoy process must have write permissions to the path that you specify here. Otherwise, Envoy fails
     *         to bootstrap properly.
     *         </p>
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The file path to write access logs to. You can use <code>/dev/stdout</code> to send access logs to standard out
     * and configure your Envoy container to use a log driver, such as <code>awslogs</code>, to export the access logs
     * to a log storage service such as Amazon CloudWatch Logs. You can also specify a path in the Envoy container's
     * file system to write the files to disk.
     * </p>
     * <note>
     * <p>
     * The Envoy process must have write permissions to the path that you specify here. Otherwise, Envoy fails to
     * bootstrap properly.
     * </p>
     * </note>
     * 
     * @param path
     *        The file path to write access logs to. You can use <code>/dev/stdout</code> to send access logs to
     *        standard out and configure your Envoy container to use a log driver, such as <code>awslogs</code>, to
     *        export the access logs to a log storage service such as Amazon CloudWatch Logs. You can also specify a
     *        path in the Envoy container's file system to write the files to disk.</p> <note>
     *        <p>
     *        The Envoy process must have write permissions to the path that you specify here. Otherwise, Envoy fails to
     *        bootstrap properly.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileAccessLog withPath(String path) {
        setPath(path);
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileAccessLog == false)
            return false;
        FileAccessLog other = (FileAccessLog) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        return hashCode;
    }

    @Override
    public FileAccessLog clone() {
        try {
            return (FileAccessLog) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.FileAccessLogMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
