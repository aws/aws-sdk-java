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
 * The configuration for running a SageMaker image as a KernelGateway app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AppImageConfigDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppImageConfigDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AppImageConfig.
     * </p>
     */
    private String appImageConfigArn;
    /**
     * <p>
     * The name of the AppImageConfig. Must be unique to your account.
     * </p>
     */
    private String appImageConfigName;
    /**
     * <p>
     * When the AppImageConfig was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * When the AppImageConfig was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The configuration for the file system and kernels in the SageMaker image.
     * </p>
     */
    private KernelGatewayImageConfig kernelGatewayImageConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AppImageConfig.
     * </p>
     * 
     * @param appImageConfigArn
     *        The Amazon Resource Name (ARN) of the AppImageConfig.
     */

    public void setAppImageConfigArn(String appImageConfigArn) {
        this.appImageConfigArn = appImageConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AppImageConfig.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AppImageConfig.
     */

    public String getAppImageConfigArn() {
        return this.appImageConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AppImageConfig.
     * </p>
     * 
     * @param appImageConfigArn
     *        The Amazon Resource Name (ARN) of the AppImageConfig.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppImageConfigDetails withAppImageConfigArn(String appImageConfigArn) {
        setAppImageConfigArn(appImageConfigArn);
        return this;
    }

    /**
     * <p>
     * The name of the AppImageConfig. Must be unique to your account.
     * </p>
     * 
     * @param appImageConfigName
     *        The name of the AppImageConfig. Must be unique to your account.
     */

    public void setAppImageConfigName(String appImageConfigName) {
        this.appImageConfigName = appImageConfigName;
    }

    /**
     * <p>
     * The name of the AppImageConfig. Must be unique to your account.
     * </p>
     * 
     * @return The name of the AppImageConfig. Must be unique to your account.
     */

    public String getAppImageConfigName() {
        return this.appImageConfigName;
    }

    /**
     * <p>
     * The name of the AppImageConfig. Must be unique to your account.
     * </p>
     * 
     * @param appImageConfigName
     *        The name of the AppImageConfig. Must be unique to your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppImageConfigDetails withAppImageConfigName(String appImageConfigName) {
        setAppImageConfigName(appImageConfigName);
        return this;
    }

    /**
     * <p>
     * When the AppImageConfig was created.
     * </p>
     * 
     * @param creationTime
     *        When the AppImageConfig was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the AppImageConfig was created.
     * </p>
     * 
     * @return When the AppImageConfig was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the AppImageConfig was created.
     * </p>
     * 
     * @param creationTime
     *        When the AppImageConfig was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppImageConfigDetails withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * When the AppImageConfig was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the AppImageConfig was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the AppImageConfig was last modified.
     * </p>
     * 
     * @return When the AppImageConfig was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * When the AppImageConfig was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the AppImageConfig was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppImageConfigDetails withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The configuration for the file system and kernels in the SageMaker image.
     * </p>
     * 
     * @param kernelGatewayImageConfig
     *        The configuration for the file system and kernels in the SageMaker image.
     */

    public void setKernelGatewayImageConfig(KernelGatewayImageConfig kernelGatewayImageConfig) {
        this.kernelGatewayImageConfig = kernelGatewayImageConfig;
    }

    /**
     * <p>
     * The configuration for the file system and kernels in the SageMaker image.
     * </p>
     * 
     * @return The configuration for the file system and kernels in the SageMaker image.
     */

    public KernelGatewayImageConfig getKernelGatewayImageConfig() {
        return this.kernelGatewayImageConfig;
    }

    /**
     * <p>
     * The configuration for the file system and kernels in the SageMaker image.
     * </p>
     * 
     * @param kernelGatewayImageConfig
     *        The configuration for the file system and kernels in the SageMaker image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppImageConfigDetails withKernelGatewayImageConfig(KernelGatewayImageConfig kernelGatewayImageConfig) {
        setKernelGatewayImageConfig(kernelGatewayImageConfig);
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
        if (getAppImageConfigArn() != null)
            sb.append("AppImageConfigArn: ").append(getAppImageConfigArn()).append(",");
        if (getAppImageConfigName() != null)
            sb.append("AppImageConfigName: ").append(getAppImageConfigName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getKernelGatewayImageConfig() != null)
            sb.append("KernelGatewayImageConfig: ").append(getKernelGatewayImageConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppImageConfigDetails == false)
            return false;
        AppImageConfigDetails other = (AppImageConfigDetails) obj;
        if (other.getAppImageConfigArn() == null ^ this.getAppImageConfigArn() == null)
            return false;
        if (other.getAppImageConfigArn() != null && other.getAppImageConfigArn().equals(this.getAppImageConfigArn()) == false)
            return false;
        if (other.getAppImageConfigName() == null ^ this.getAppImageConfigName() == null)
            return false;
        if (other.getAppImageConfigName() != null && other.getAppImageConfigName().equals(this.getAppImageConfigName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getKernelGatewayImageConfig() == null ^ this.getKernelGatewayImageConfig() == null)
            return false;
        if (other.getKernelGatewayImageConfig() != null && other.getKernelGatewayImageConfig().equals(this.getKernelGatewayImageConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppImageConfigArn() == null) ? 0 : getAppImageConfigArn().hashCode());
        hashCode = prime * hashCode + ((getAppImageConfigName() == null) ? 0 : getAppImageConfigName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getKernelGatewayImageConfig() == null) ? 0 : getKernelGatewayImageConfig().hashCode());
        return hashCode;
    }

    @Override
    public AppImageConfigDetails clone() {
        try {
            return (AppImageConfigDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AppImageConfigDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
