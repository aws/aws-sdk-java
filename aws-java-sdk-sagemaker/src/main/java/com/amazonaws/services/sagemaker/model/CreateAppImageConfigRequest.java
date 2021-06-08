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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateAppImageConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAppImageConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the AppImageConfig. Must be unique to your account.
     * </p>
     */
    private String appImageConfigName;
    /**
     * <p>
     * A list of tags to apply to the AppImageConfig.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The KernelGatewayImageConfig.
     * </p>
     */
    private KernelGatewayImageConfig kernelGatewayImageConfig;

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

    public CreateAppImageConfigRequest withAppImageConfigName(String appImageConfigName) {
        setAppImageConfigName(appImageConfigName);
        return this;
    }

    /**
     * <p>
     * A list of tags to apply to the AppImageConfig.
     * </p>
     * 
     * @return A list of tags to apply to the AppImageConfig.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to apply to the AppImageConfig.
     * </p>
     * 
     * @param tags
     *        A list of tags to apply to the AppImageConfig.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to apply to the AppImageConfig.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to apply to the AppImageConfig.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppImageConfigRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to apply to the AppImageConfig.
     * </p>
     * 
     * @param tags
     *        A list of tags to apply to the AppImageConfig.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppImageConfigRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The KernelGatewayImageConfig.
     * </p>
     * 
     * @param kernelGatewayImageConfig
     *        The KernelGatewayImageConfig.
     */

    public void setKernelGatewayImageConfig(KernelGatewayImageConfig kernelGatewayImageConfig) {
        this.kernelGatewayImageConfig = kernelGatewayImageConfig;
    }

    /**
     * <p>
     * The KernelGatewayImageConfig.
     * </p>
     * 
     * @return The KernelGatewayImageConfig.
     */

    public KernelGatewayImageConfig getKernelGatewayImageConfig() {
        return this.kernelGatewayImageConfig;
    }

    /**
     * <p>
     * The KernelGatewayImageConfig.
     * </p>
     * 
     * @param kernelGatewayImageConfig
     *        The KernelGatewayImageConfig.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppImageConfigRequest withKernelGatewayImageConfig(KernelGatewayImageConfig kernelGatewayImageConfig) {
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateAppImageConfigRequest == false)
            return false;
        CreateAppImageConfigRequest other = (CreateAppImageConfigRequest) obj;
        if (other.getAppImageConfigName() == null ^ this.getAppImageConfigName() == null)
            return false;
        if (other.getAppImageConfigName() != null && other.getAppImageConfigName().equals(this.getAppImageConfigName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKernelGatewayImageConfig() == null) ? 0 : getKernelGatewayImageConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateAppImageConfigRequest clone() {
        return (CreateAppImageConfigRequest) super.clone();
    }

}
