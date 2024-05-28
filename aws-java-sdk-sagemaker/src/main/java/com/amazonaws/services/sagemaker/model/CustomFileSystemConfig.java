/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The settings for assigning a custom file system to a user profile or space for an Amazon SageMaker Domain. Permitted
 * users can access this file system in Amazon SageMaker Studio.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CustomFileSystemConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomFileSystemConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The settings for a custom Amazon EFS file system.
     * </p>
     */
    private EFSFileSystemConfig eFSFileSystemConfig;

    /**
     * <p>
     * The settings for a custom Amazon EFS file system.
     * </p>
     * 
     * @param eFSFileSystemConfig
     *        The settings for a custom Amazon EFS file system.
     */

    public void setEFSFileSystemConfig(EFSFileSystemConfig eFSFileSystemConfig) {
        this.eFSFileSystemConfig = eFSFileSystemConfig;
    }

    /**
     * <p>
     * The settings for a custom Amazon EFS file system.
     * </p>
     * 
     * @return The settings for a custom Amazon EFS file system.
     */

    public EFSFileSystemConfig getEFSFileSystemConfig() {
        return this.eFSFileSystemConfig;
    }

    /**
     * <p>
     * The settings for a custom Amazon EFS file system.
     * </p>
     * 
     * @param eFSFileSystemConfig
     *        The settings for a custom Amazon EFS file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomFileSystemConfig withEFSFileSystemConfig(EFSFileSystemConfig eFSFileSystemConfig) {
        setEFSFileSystemConfig(eFSFileSystemConfig);
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
        if (getEFSFileSystemConfig() != null)
            sb.append("EFSFileSystemConfig: ").append(getEFSFileSystemConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomFileSystemConfig == false)
            return false;
        CustomFileSystemConfig other = (CustomFileSystemConfig) obj;
        if (other.getEFSFileSystemConfig() == null ^ this.getEFSFileSystemConfig() == null)
            return false;
        if (other.getEFSFileSystemConfig() != null && other.getEFSFileSystemConfig().equals(this.getEFSFileSystemConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEFSFileSystemConfig() == null) ? 0 : getEFSFileSystemConfig().hashCode());
        return hashCode;
    }

    @Override
    public CustomFileSystemConfig clone() {
        try {
            return (CustomFileSystemConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.CustomFileSystemConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
