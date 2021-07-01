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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateImageVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateImageVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The registry path of the container image to use as the starting point for this version. The path is an Amazon
     * Container Registry (ECR) URI in the following format:
     * </p>
     * <p>
     * <code>&lt;acct-id&gt;.dkr.ecr.&lt;region&gt;.amazonaws.com/&lt;repo-name[:tag] or [@digest]&gt;</code>
     * </p>
     */
    private String baseImage;
    /**
     * <p>
     * A unique ID. If not specified, the Amazon Web Services CLI and Amazon Web Services SDKs, such as the SDK for
     * Python (Boto3), add a unique value to the call.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The <code>ImageName</code> of the <code>Image</code> to create a version of.
     * </p>
     */
    private String imageName;

    /**
     * <p>
     * The registry path of the container image to use as the starting point for this version. The path is an Amazon
     * Container Registry (ECR) URI in the following format:
     * </p>
     * <p>
     * <code>&lt;acct-id&gt;.dkr.ecr.&lt;region&gt;.amazonaws.com/&lt;repo-name[:tag] or [@digest]&gt;</code>
     * </p>
     * 
     * @param baseImage
     *        The registry path of the container image to use as the starting point for this version. The path is an
     *        Amazon Container Registry (ECR) URI in the following format:</p>
     *        <p>
     *        <code>&lt;acct-id&gt;.dkr.ecr.&lt;region&gt;.amazonaws.com/&lt;repo-name[:tag] or [@digest]&gt;</code>
     */

    public void setBaseImage(String baseImage) {
        this.baseImage = baseImage;
    }

    /**
     * <p>
     * The registry path of the container image to use as the starting point for this version. The path is an Amazon
     * Container Registry (ECR) URI in the following format:
     * </p>
     * <p>
     * <code>&lt;acct-id&gt;.dkr.ecr.&lt;region&gt;.amazonaws.com/&lt;repo-name[:tag] or [@digest]&gt;</code>
     * </p>
     * 
     * @return The registry path of the container image to use as the starting point for this version. The path is an
     *         Amazon Container Registry (ECR) URI in the following format:</p>
     *         <p>
     *         <code>&lt;acct-id&gt;.dkr.ecr.&lt;region&gt;.amazonaws.com/&lt;repo-name[:tag] or [@digest]&gt;</code>
     */

    public String getBaseImage() {
        return this.baseImage;
    }

    /**
     * <p>
     * The registry path of the container image to use as the starting point for this version. The path is an Amazon
     * Container Registry (ECR) URI in the following format:
     * </p>
     * <p>
     * <code>&lt;acct-id&gt;.dkr.ecr.&lt;region&gt;.amazonaws.com/&lt;repo-name[:tag] or [@digest]&gt;</code>
     * </p>
     * 
     * @param baseImage
     *        The registry path of the container image to use as the starting point for this version. The path is an
     *        Amazon Container Registry (ECR) URI in the following format:</p>
     *        <p>
     *        <code>&lt;acct-id&gt;.dkr.ecr.&lt;region&gt;.amazonaws.com/&lt;repo-name[:tag] or [@digest]&gt;</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageVersionRequest withBaseImage(String baseImage) {
        setBaseImage(baseImage);
        return this;
    }

    /**
     * <p>
     * A unique ID. If not specified, the Amazon Web Services CLI and Amazon Web Services SDKs, such as the SDK for
     * Python (Boto3), add a unique value to the call.
     * </p>
     * 
     * @param clientToken
     *        A unique ID. If not specified, the Amazon Web Services CLI and Amazon Web Services SDKs, such as the SDK
     *        for Python (Boto3), add a unique value to the call.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique ID. If not specified, the Amazon Web Services CLI and Amazon Web Services SDKs, such as the SDK for
     * Python (Boto3), add a unique value to the call.
     * </p>
     * 
     * @return A unique ID. If not specified, the Amazon Web Services CLI and Amazon Web Services SDKs, such as the SDK
     *         for Python (Boto3), add a unique value to the call.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique ID. If not specified, the Amazon Web Services CLI and Amazon Web Services SDKs, such as the SDK for
     * Python (Boto3), add a unique value to the call.
     * </p>
     * 
     * @param clientToken
     *        A unique ID. If not specified, the Amazon Web Services CLI and Amazon Web Services SDKs, such as the SDK
     *        for Python (Boto3), add a unique value to the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageVersionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The <code>ImageName</code> of the <code>Image</code> to create a version of.
     * </p>
     * 
     * @param imageName
     *        The <code>ImageName</code> of the <code>Image</code> to create a version of.
     */

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * <p>
     * The <code>ImageName</code> of the <code>Image</code> to create a version of.
     * </p>
     * 
     * @return The <code>ImageName</code> of the <code>Image</code> to create a version of.
     */

    public String getImageName() {
        return this.imageName;
    }

    /**
     * <p>
     * The <code>ImageName</code> of the <code>Image</code> to create a version of.
     * </p>
     * 
     * @param imageName
     *        The <code>ImageName</code> of the <code>Image</code> to create a version of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageVersionRequest withImageName(String imageName) {
        setImageName(imageName);
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
        if (getBaseImage() != null)
            sb.append("BaseImage: ").append(getBaseImage()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getImageName() != null)
            sb.append("ImageName: ").append(getImageName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateImageVersionRequest == false)
            return false;
        CreateImageVersionRequest other = (CreateImageVersionRequest) obj;
        if (other.getBaseImage() == null ^ this.getBaseImage() == null)
            return false;
        if (other.getBaseImage() != null && other.getBaseImage().equals(this.getBaseImage()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getImageName() == null ^ this.getImageName() == null)
            return false;
        if (other.getImageName() != null && other.getImageName().equals(this.getImageName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseImage() == null) ? 0 : getBaseImage().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getImageName() == null) ? 0 : getImageName().hashCode());
        return hashCode;
    }

    @Override
    public CreateImageVersionRequest clone() {
        return (CreateImageVersionRequest) super.clone();
    }

}
