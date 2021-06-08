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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for the file system and kernels in a SageMaker image running as a KernelGateway app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/KernelGatewayImageConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KernelGatewayImageConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The specification of the Jupyter kernels in the image.
     * </p>
     */
    private java.util.List<KernelSpec> kernelSpecs;
    /**
     * <p>
     * The Amazon Elastic File System (EFS) storage configuration for a SageMaker image.
     * </p>
     */
    private FileSystemConfig fileSystemConfig;

    /**
     * <p>
     * The specification of the Jupyter kernels in the image.
     * </p>
     * 
     * @return The specification of the Jupyter kernels in the image.
     */

    public java.util.List<KernelSpec> getKernelSpecs() {
        return kernelSpecs;
    }

    /**
     * <p>
     * The specification of the Jupyter kernels in the image.
     * </p>
     * 
     * @param kernelSpecs
     *        The specification of the Jupyter kernels in the image.
     */

    public void setKernelSpecs(java.util.Collection<KernelSpec> kernelSpecs) {
        if (kernelSpecs == null) {
            this.kernelSpecs = null;
            return;
        }

        this.kernelSpecs = new java.util.ArrayList<KernelSpec>(kernelSpecs);
    }

    /**
     * <p>
     * The specification of the Jupyter kernels in the image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKernelSpecs(java.util.Collection)} or {@link #withKernelSpecs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param kernelSpecs
     *        The specification of the Jupyter kernels in the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KernelGatewayImageConfig withKernelSpecs(KernelSpec... kernelSpecs) {
        if (this.kernelSpecs == null) {
            setKernelSpecs(new java.util.ArrayList<KernelSpec>(kernelSpecs.length));
        }
        for (KernelSpec ele : kernelSpecs) {
            this.kernelSpecs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The specification of the Jupyter kernels in the image.
     * </p>
     * 
     * @param kernelSpecs
     *        The specification of the Jupyter kernels in the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KernelGatewayImageConfig withKernelSpecs(java.util.Collection<KernelSpec> kernelSpecs) {
        setKernelSpecs(kernelSpecs);
        return this;
    }

    /**
     * <p>
     * The Amazon Elastic File System (EFS) storage configuration for a SageMaker image.
     * </p>
     * 
     * @param fileSystemConfig
     *        The Amazon Elastic File System (EFS) storage configuration for a SageMaker image.
     */

    public void setFileSystemConfig(FileSystemConfig fileSystemConfig) {
        this.fileSystemConfig = fileSystemConfig;
    }

    /**
     * <p>
     * The Amazon Elastic File System (EFS) storage configuration for a SageMaker image.
     * </p>
     * 
     * @return The Amazon Elastic File System (EFS) storage configuration for a SageMaker image.
     */

    public FileSystemConfig getFileSystemConfig() {
        return this.fileSystemConfig;
    }

    /**
     * <p>
     * The Amazon Elastic File System (EFS) storage configuration for a SageMaker image.
     * </p>
     * 
     * @param fileSystemConfig
     *        The Amazon Elastic File System (EFS) storage configuration for a SageMaker image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KernelGatewayImageConfig withFileSystemConfig(FileSystemConfig fileSystemConfig) {
        setFileSystemConfig(fileSystemConfig);
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
        if (getKernelSpecs() != null)
            sb.append("KernelSpecs: ").append(getKernelSpecs()).append(",");
        if (getFileSystemConfig() != null)
            sb.append("FileSystemConfig: ").append(getFileSystemConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KernelGatewayImageConfig == false)
            return false;
        KernelGatewayImageConfig other = (KernelGatewayImageConfig) obj;
        if (other.getKernelSpecs() == null ^ this.getKernelSpecs() == null)
            return false;
        if (other.getKernelSpecs() != null && other.getKernelSpecs().equals(this.getKernelSpecs()) == false)
            return false;
        if (other.getFileSystemConfig() == null ^ this.getFileSystemConfig() == null)
            return false;
        if (other.getFileSystemConfig() != null && other.getFileSystemConfig().equals(this.getFileSystemConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKernelSpecs() == null) ? 0 : getKernelSpecs().hashCode());
        hashCode = prime * hashCode + ((getFileSystemConfig() == null) ? 0 : getFileSystemConfig().hashCode());
        return hashCode;
    }

    @Override
    public KernelGatewayImageConfig clone() {
        try {
            return (KernelGatewayImageConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.KernelGatewayImageConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
