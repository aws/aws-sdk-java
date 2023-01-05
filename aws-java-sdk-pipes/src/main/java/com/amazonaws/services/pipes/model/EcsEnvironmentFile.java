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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of files containing the environment variables to pass to a container. You can specify up to ten environment
 * files. The file must have a <code>.env</code> file extension. Each line in an environment file should contain an
 * environment variable in <code>VARIABLE=VALUE</code> format. Lines beginning with <code>#</code> are treated as
 * comments and are ignored. For more information about the environment variable file syntax, see <a
 * href="https://docs.docker.com/compose/env-file/">Declare default environment variables in file</a>.
 * </p>
 * <p>
 * If there are environment variables specified using the <code>environment</code> parameter in a container definition,
 * they take precedence over the variables contained within an environment file. If multiple environment files are
 * specified that contain the same variable, they're processed from the top down. We recommend that you use unique
 * variable names. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html">Specifying environment
 * variables</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
 * </p>
 * <p>
 * This parameter is only supported for tasks hosted on Fargate using the following platform versions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Linux platform version <code>1.4.0</code> or later.
 * </p>
 * </li>
 * <li>
 * <p>
 * Windows platform version <code>1.0.0</code> or later.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/EcsEnvironmentFile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcsEnvironmentFile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file type to use. The only supported value is <code>s3</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 object containing the environment variable file.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The file type to use. The only supported value is <code>s3</code>.
     * </p>
     * 
     * @param type
     *        The file type to use. The only supported value is <code>s3</code>.
     * @see EcsEnvironmentFileType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The file type to use. The only supported value is <code>s3</code>.
     * </p>
     * 
     * @return The file type to use. The only supported value is <code>s3</code>.
     * @see EcsEnvironmentFileType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The file type to use. The only supported value is <code>s3</code>.
     * </p>
     * 
     * @param type
     *        The file type to use. The only supported value is <code>s3</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EcsEnvironmentFileType
     */

    public EcsEnvironmentFile withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The file type to use. The only supported value is <code>s3</code>.
     * </p>
     * 
     * @param type
     *        The file type to use. The only supported value is <code>s3</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EcsEnvironmentFileType
     */

    public EcsEnvironmentFile withType(EcsEnvironmentFileType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 object containing the environment variable file.
     * </p>
     * 
     * @param value
     *        The Amazon Resource Name (ARN) of the Amazon S3 object containing the environment variable file.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 object containing the environment variable file.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon S3 object containing the environment variable file.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 object containing the environment variable file.
     * </p>
     * 
     * @param value
     *        The Amazon Resource Name (ARN) of the Amazon S3 object containing the environment variable file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsEnvironmentFile withValue(String value) {
        setValue(value);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EcsEnvironmentFile == false)
            return false;
        EcsEnvironmentFile other = (EcsEnvironmentFile) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public EcsEnvironmentFile clone() {
        try {
            return (EcsEnvironmentFile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.EcsEnvironmentFileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
