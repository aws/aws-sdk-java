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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateAppImageConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAppImageConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the AppImageConfig to update.
     * </p>
     */
    private String appImageConfigName;
    /**
     * <p>
     * The new KernelGateway app to run on the image.
     * </p>
     */
    private KernelGatewayImageConfig kernelGatewayImageConfig;

    /**
     * <p>
     * The name of the AppImageConfig to update.
     * </p>
     * 
     * @param appImageConfigName
     *        The name of the AppImageConfig to update.
     */

    public void setAppImageConfigName(String appImageConfigName) {
        this.appImageConfigName = appImageConfigName;
    }

    /**
     * <p>
     * The name of the AppImageConfig to update.
     * </p>
     * 
     * @return The name of the AppImageConfig to update.
     */

    public String getAppImageConfigName() {
        return this.appImageConfigName;
    }

    /**
     * <p>
     * The name of the AppImageConfig to update.
     * </p>
     * 
     * @param appImageConfigName
     *        The name of the AppImageConfig to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppImageConfigRequest withAppImageConfigName(String appImageConfigName) {
        setAppImageConfigName(appImageConfigName);
        return this;
    }

    /**
     * <p>
     * The new KernelGateway app to run on the image.
     * </p>
     * 
     * @param kernelGatewayImageConfig
     *        The new KernelGateway app to run on the image.
     */

    public void setKernelGatewayImageConfig(KernelGatewayImageConfig kernelGatewayImageConfig) {
        this.kernelGatewayImageConfig = kernelGatewayImageConfig;
    }

    /**
     * <p>
     * The new KernelGateway app to run on the image.
     * </p>
     * 
     * @return The new KernelGateway app to run on the image.
     */

    public KernelGatewayImageConfig getKernelGatewayImageConfig() {
        return this.kernelGatewayImageConfig;
    }

    /**
     * <p>
     * The new KernelGateway app to run on the image.
     * </p>
     * 
     * @param kernelGatewayImageConfig
     *        The new KernelGateway app to run on the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppImageConfigRequest withKernelGatewayImageConfig(KernelGatewayImageConfig kernelGatewayImageConfig) {
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
        if (getAppImageConfigName() != null)
            sb.append("AppImageConfigName: ").append(getAppImageConfigName()).append(",");
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

        if (obj instanceof UpdateAppImageConfigRequest == false)
            return false;
        UpdateAppImageConfigRequest other = (UpdateAppImageConfigRequest) obj;
        if (other.getAppImageConfigName() == null ^ this.getAppImageConfigName() == null)
            return false;
        if (other.getAppImageConfigName() != null && other.getAppImageConfigName().equals(this.getAppImageConfigName()) == false)
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

        hashCode = prime * hashCode + ((getAppImageConfigName() == null) ? 0 : getAppImageConfigName().hashCode());
        hashCode = prime * hashCode + ((getKernelGatewayImageConfig() == null) ? 0 : getKernelGatewayImageConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAppImageConfigRequest clone() {
        return (UpdateAppImageConfigRequest) super.clone();
    }

}
