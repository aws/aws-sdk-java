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
     * Elastic Container Registry (ECR) URI in the following format:
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
     * A list of aliases created with the image version.
     * </p>
     */
    private java.util.List<String> aliases;
    /**
     * <p>
     * The stability of the image version, specified by the maintainer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOT_PROVIDED</code>: The maintainers did not provide a status for image version stability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STABLE</code>: The image version is stable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TO_BE_ARCHIVED</code>: The image version is set to be archived. Custom image versions that are set to be
     * archived are automatically archived after three months.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARCHIVED</code>: The image version is archived. Archived image versions are not searchable and are no
     * longer actively supported.
     * </p>
     * </li>
     * </ul>
     */
    private String vendorGuidance;
    /**
     * <p>
     * Indicates SageMaker job type compatibility.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TRAINING</code>: The image version is compatible with SageMaker training jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INFERENCE</code>: The image version is compatible with SageMaker inference jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTEBOOK_KERNEL</code>: The image version is compatible with SageMaker notebook kernels.
     * </p>
     * </li>
     * </ul>
     */
    private String jobType;
    /**
     * <p>
     * The machine learning framework vended in the image version.
     * </p>
     */
    private String mLFramework;
    /**
     * <p>
     * The supported programming language and its version.
     * </p>
     */
    private String programmingLang;
    /**
     * <p>
     * Indicates CPU or GPU compatibility.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CPU</code>: The image version is compatible with CPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GPU</code>: The image version is compatible with GPU.
     * </p>
     * </li>
     * </ul>
     */
    private String processor;
    /**
     * <p>
     * Indicates Horovod compatibility.
     * </p>
     */
    private Boolean horovod;
    /**
     * <p>
     * The maintainer description of the image version.
     * </p>
     */
    private String releaseNotes;

    /**
     * <p>
     * The registry path of the container image to use as the starting point for this version. The path is an Amazon
     * Elastic Container Registry (ECR) URI in the following format:
     * </p>
     * <p>
     * <code>&lt;acct-id&gt;.dkr.ecr.&lt;region&gt;.amazonaws.com/&lt;repo-name[:tag] or [@digest]&gt;</code>
     * </p>
     * 
     * @param baseImage
     *        The registry path of the container image to use as the starting point for this version. The path is an
     *        Amazon Elastic Container Registry (ECR) URI in the following format:</p>
     *        <p>
     *        <code>&lt;acct-id&gt;.dkr.ecr.&lt;region&gt;.amazonaws.com/&lt;repo-name[:tag] or [@digest]&gt;</code>
     */

    public void setBaseImage(String baseImage) {
        this.baseImage = baseImage;
    }

    /**
     * <p>
     * The registry path of the container image to use as the starting point for this version. The path is an Amazon
     * Elastic Container Registry (ECR) URI in the following format:
     * </p>
     * <p>
     * <code>&lt;acct-id&gt;.dkr.ecr.&lt;region&gt;.amazonaws.com/&lt;repo-name[:tag] or [@digest]&gt;</code>
     * </p>
     * 
     * @return The registry path of the container image to use as the starting point for this version. The path is an
     *         Amazon Elastic Container Registry (ECR) URI in the following format:</p>
     *         <p>
     *         <code>&lt;acct-id&gt;.dkr.ecr.&lt;region&gt;.amazonaws.com/&lt;repo-name[:tag] or [@digest]&gt;</code>
     */

    public String getBaseImage() {
        return this.baseImage;
    }

    /**
     * <p>
     * The registry path of the container image to use as the starting point for this version. The path is an Amazon
     * Elastic Container Registry (ECR) URI in the following format:
     * </p>
     * <p>
     * <code>&lt;acct-id&gt;.dkr.ecr.&lt;region&gt;.amazonaws.com/&lt;repo-name[:tag] or [@digest]&gt;</code>
     * </p>
     * 
     * @param baseImage
     *        The registry path of the container image to use as the starting point for this version. The path is an
     *        Amazon Elastic Container Registry (ECR) URI in the following format:</p>
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
     * <p>
     * A list of aliases created with the image version.
     * </p>
     * 
     * @return A list of aliases created with the image version.
     */

    public java.util.List<String> getAliases() {
        return aliases;
    }

    /**
     * <p>
     * A list of aliases created with the image version.
     * </p>
     * 
     * @param aliases
     *        A list of aliases created with the image version.
     */

    public void setAliases(java.util.Collection<String> aliases) {
        if (aliases == null) {
            this.aliases = null;
            return;
        }

        this.aliases = new java.util.ArrayList<String>(aliases);
    }

    /**
     * <p>
     * A list of aliases created with the image version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAliases(java.util.Collection)} or {@link #withAliases(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param aliases
     *        A list of aliases created with the image version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageVersionRequest withAliases(String... aliases) {
        if (this.aliases == null) {
            setAliases(new java.util.ArrayList<String>(aliases.length));
        }
        for (String ele : aliases) {
            this.aliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of aliases created with the image version.
     * </p>
     * 
     * @param aliases
     *        A list of aliases created with the image version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageVersionRequest withAliases(java.util.Collection<String> aliases) {
        setAliases(aliases);
        return this;
    }

    /**
     * <p>
     * The stability of the image version, specified by the maintainer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOT_PROVIDED</code>: The maintainers did not provide a status for image version stability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STABLE</code>: The image version is stable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TO_BE_ARCHIVED</code>: The image version is set to be archived. Custom image versions that are set to be
     * archived are automatically archived after three months.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARCHIVED</code>: The image version is archived. Archived image versions are not searchable and are no
     * longer actively supported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param vendorGuidance
     *        The stability of the image version, specified by the maintainer.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NOT_PROVIDED</code>: The maintainers did not provide a status for image version stability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STABLE</code>: The image version is stable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TO_BE_ARCHIVED</code>: The image version is set to be archived. Custom image versions that are set
     *        to be archived are automatically archived after three months.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARCHIVED</code>: The image version is archived. Archived image versions are not searchable and are
     *        no longer actively supported.
     *        </p>
     *        </li>
     * @see VendorGuidance
     */

    public void setVendorGuidance(String vendorGuidance) {
        this.vendorGuidance = vendorGuidance;
    }

    /**
     * <p>
     * The stability of the image version, specified by the maintainer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOT_PROVIDED</code>: The maintainers did not provide a status for image version stability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STABLE</code>: The image version is stable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TO_BE_ARCHIVED</code>: The image version is set to be archived. Custom image versions that are set to be
     * archived are automatically archived after three months.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARCHIVED</code>: The image version is archived. Archived image versions are not searchable and are no
     * longer actively supported.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The stability of the image version, specified by the maintainer.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NOT_PROVIDED</code>: The maintainers did not provide a status for image version stability.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STABLE</code>: The image version is stable.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TO_BE_ARCHIVED</code>: The image version is set to be archived. Custom image versions that are set
     *         to be archived are automatically archived after three months.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ARCHIVED</code>: The image version is archived. Archived image versions are not searchable and are
     *         no longer actively supported.
     *         </p>
     *         </li>
     * @see VendorGuidance
     */

    public String getVendorGuidance() {
        return this.vendorGuidance;
    }

    /**
     * <p>
     * The stability of the image version, specified by the maintainer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOT_PROVIDED</code>: The maintainers did not provide a status for image version stability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STABLE</code>: The image version is stable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TO_BE_ARCHIVED</code>: The image version is set to be archived. Custom image versions that are set to be
     * archived are automatically archived after three months.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARCHIVED</code>: The image version is archived. Archived image versions are not searchable and are no
     * longer actively supported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param vendorGuidance
     *        The stability of the image version, specified by the maintainer.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NOT_PROVIDED</code>: The maintainers did not provide a status for image version stability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STABLE</code>: The image version is stable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TO_BE_ARCHIVED</code>: The image version is set to be archived. Custom image versions that are set
     *        to be archived are automatically archived after three months.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARCHIVED</code>: The image version is archived. Archived image versions are not searchable and are
     *        no longer actively supported.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VendorGuidance
     */

    public CreateImageVersionRequest withVendorGuidance(String vendorGuidance) {
        setVendorGuidance(vendorGuidance);
        return this;
    }

    /**
     * <p>
     * The stability of the image version, specified by the maintainer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOT_PROVIDED</code>: The maintainers did not provide a status for image version stability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STABLE</code>: The image version is stable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TO_BE_ARCHIVED</code>: The image version is set to be archived. Custom image versions that are set to be
     * archived are automatically archived after three months.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARCHIVED</code>: The image version is archived. Archived image versions are not searchable and are no
     * longer actively supported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param vendorGuidance
     *        The stability of the image version, specified by the maintainer.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NOT_PROVIDED</code>: The maintainers did not provide a status for image version stability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STABLE</code>: The image version is stable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TO_BE_ARCHIVED</code>: The image version is set to be archived. Custom image versions that are set
     *        to be archived are automatically archived after three months.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARCHIVED</code>: The image version is archived. Archived image versions are not searchable and are
     *        no longer actively supported.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VendorGuidance
     */

    public CreateImageVersionRequest withVendorGuidance(VendorGuidance vendorGuidance) {
        this.vendorGuidance = vendorGuidance.toString();
        return this;
    }

    /**
     * <p>
     * Indicates SageMaker job type compatibility.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TRAINING</code>: The image version is compatible with SageMaker training jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INFERENCE</code>: The image version is compatible with SageMaker inference jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTEBOOK_KERNEL</code>: The image version is compatible with SageMaker notebook kernels.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobType
     *        Indicates SageMaker job type compatibility.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TRAINING</code>: The image version is compatible with SageMaker training jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INFERENCE</code>: The image version is compatible with SageMaker inference jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOTEBOOK_KERNEL</code>: The image version is compatible with SageMaker notebook kernels.
     *        </p>
     *        </li>
     * @see JobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * Indicates SageMaker job type compatibility.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TRAINING</code>: The image version is compatible with SageMaker training jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INFERENCE</code>: The image version is compatible with SageMaker inference jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTEBOOK_KERNEL</code>: The image version is compatible with SageMaker notebook kernels.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates SageMaker job type compatibility.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TRAINING</code>: The image version is compatible with SageMaker training jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INFERENCE</code>: The image version is compatible with SageMaker inference jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOTEBOOK_KERNEL</code>: The image version is compatible with SageMaker notebook kernels.
     *         </p>
     *         </li>
     * @see JobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * Indicates SageMaker job type compatibility.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TRAINING</code>: The image version is compatible with SageMaker training jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INFERENCE</code>: The image version is compatible with SageMaker inference jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTEBOOK_KERNEL</code>: The image version is compatible with SageMaker notebook kernels.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobType
     *        Indicates SageMaker job type compatibility.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TRAINING</code>: The image version is compatible with SageMaker training jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INFERENCE</code>: The image version is compatible with SageMaker inference jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOTEBOOK_KERNEL</code>: The image version is compatible with SageMaker notebook kernels.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public CreateImageVersionRequest withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * Indicates SageMaker job type compatibility.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TRAINING</code>: The image version is compatible with SageMaker training jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INFERENCE</code>: The image version is compatible with SageMaker inference jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTEBOOK_KERNEL</code>: The image version is compatible with SageMaker notebook kernels.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobType
     *        Indicates SageMaker job type compatibility.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TRAINING</code>: The image version is compatible with SageMaker training jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INFERENCE</code>: The image version is compatible with SageMaker inference jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOTEBOOK_KERNEL</code>: The image version is compatible with SageMaker notebook kernels.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public CreateImageVersionRequest withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * The machine learning framework vended in the image version.
     * </p>
     * 
     * @param mLFramework
     *        The machine learning framework vended in the image version.
     */

    public void setMLFramework(String mLFramework) {
        this.mLFramework = mLFramework;
    }

    /**
     * <p>
     * The machine learning framework vended in the image version.
     * </p>
     * 
     * @return The machine learning framework vended in the image version.
     */

    public String getMLFramework() {
        return this.mLFramework;
    }

    /**
     * <p>
     * The machine learning framework vended in the image version.
     * </p>
     * 
     * @param mLFramework
     *        The machine learning framework vended in the image version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageVersionRequest withMLFramework(String mLFramework) {
        setMLFramework(mLFramework);
        return this;
    }

    /**
     * <p>
     * The supported programming language and its version.
     * </p>
     * 
     * @param programmingLang
     *        The supported programming language and its version.
     */

    public void setProgrammingLang(String programmingLang) {
        this.programmingLang = programmingLang;
    }

    /**
     * <p>
     * The supported programming language and its version.
     * </p>
     * 
     * @return The supported programming language and its version.
     */

    public String getProgrammingLang() {
        return this.programmingLang;
    }

    /**
     * <p>
     * The supported programming language and its version.
     * </p>
     * 
     * @param programmingLang
     *        The supported programming language and its version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageVersionRequest withProgrammingLang(String programmingLang) {
        setProgrammingLang(programmingLang);
        return this;
    }

    /**
     * <p>
     * Indicates CPU or GPU compatibility.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CPU</code>: The image version is compatible with CPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GPU</code>: The image version is compatible with GPU.
     * </p>
     * </li>
     * </ul>
     * 
     * @param processor
     *        Indicates CPU or GPU compatibility.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CPU</code>: The image version is compatible with CPU.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GPU</code>: The image version is compatible with GPU.
     *        </p>
     *        </li>
     * @see Processor
     */

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    /**
     * <p>
     * Indicates CPU or GPU compatibility.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CPU</code>: The image version is compatible with CPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GPU</code>: The image version is compatible with GPU.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates CPU or GPU compatibility.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CPU</code>: The image version is compatible with CPU.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GPU</code>: The image version is compatible with GPU.
     *         </p>
     *         </li>
     * @see Processor
     */

    public String getProcessor() {
        return this.processor;
    }

    /**
     * <p>
     * Indicates CPU or GPU compatibility.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CPU</code>: The image version is compatible with CPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GPU</code>: The image version is compatible with GPU.
     * </p>
     * </li>
     * </ul>
     * 
     * @param processor
     *        Indicates CPU or GPU compatibility.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CPU</code>: The image version is compatible with CPU.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GPU</code>: The image version is compatible with GPU.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Processor
     */

    public CreateImageVersionRequest withProcessor(String processor) {
        setProcessor(processor);
        return this;
    }

    /**
     * <p>
     * Indicates CPU or GPU compatibility.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CPU</code>: The image version is compatible with CPU.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GPU</code>: The image version is compatible with GPU.
     * </p>
     * </li>
     * </ul>
     * 
     * @param processor
     *        Indicates CPU or GPU compatibility.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CPU</code>: The image version is compatible with CPU.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GPU</code>: The image version is compatible with GPU.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Processor
     */

    public CreateImageVersionRequest withProcessor(Processor processor) {
        this.processor = processor.toString();
        return this;
    }

    /**
     * <p>
     * Indicates Horovod compatibility.
     * </p>
     * 
     * @param horovod
     *        Indicates Horovod compatibility.
     */

    public void setHorovod(Boolean horovod) {
        this.horovod = horovod;
    }

    /**
     * <p>
     * Indicates Horovod compatibility.
     * </p>
     * 
     * @return Indicates Horovod compatibility.
     */

    public Boolean getHorovod() {
        return this.horovod;
    }

    /**
     * <p>
     * Indicates Horovod compatibility.
     * </p>
     * 
     * @param horovod
     *        Indicates Horovod compatibility.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageVersionRequest withHorovod(Boolean horovod) {
        setHorovod(horovod);
        return this;
    }

    /**
     * <p>
     * Indicates Horovod compatibility.
     * </p>
     * 
     * @return Indicates Horovod compatibility.
     */

    public Boolean isHorovod() {
        return this.horovod;
    }

    /**
     * <p>
     * The maintainer description of the image version.
     * </p>
     * 
     * @param releaseNotes
     *        The maintainer description of the image version.
     */

    public void setReleaseNotes(String releaseNotes) {
        this.releaseNotes = releaseNotes;
    }

    /**
     * <p>
     * The maintainer description of the image version.
     * </p>
     * 
     * @return The maintainer description of the image version.
     */

    public String getReleaseNotes() {
        return this.releaseNotes;
    }

    /**
     * <p>
     * The maintainer description of the image version.
     * </p>
     * 
     * @param releaseNotes
     *        The maintainer description of the image version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageVersionRequest withReleaseNotes(String releaseNotes) {
        setReleaseNotes(releaseNotes);
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
            sb.append("ImageName: ").append(getImageName()).append(",");
        if (getAliases() != null)
            sb.append("Aliases: ").append(getAliases()).append(",");
        if (getVendorGuidance() != null)
            sb.append("VendorGuidance: ").append(getVendorGuidance()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType()).append(",");
        if (getMLFramework() != null)
            sb.append("MLFramework: ").append(getMLFramework()).append(",");
        if (getProgrammingLang() != null)
            sb.append("ProgrammingLang: ").append(getProgrammingLang()).append(",");
        if (getProcessor() != null)
            sb.append("Processor: ").append(getProcessor()).append(",");
        if (getHorovod() != null)
            sb.append("Horovod: ").append(getHorovod()).append(",");
        if (getReleaseNotes() != null)
            sb.append("ReleaseNotes: ").append(getReleaseNotes());
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
        if (other.getAliases() == null ^ this.getAliases() == null)
            return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false)
            return false;
        if (other.getVendorGuidance() == null ^ this.getVendorGuidance() == null)
            return false;
        if (other.getVendorGuidance() != null && other.getVendorGuidance().equals(this.getVendorGuidance()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getMLFramework() == null ^ this.getMLFramework() == null)
            return false;
        if (other.getMLFramework() != null && other.getMLFramework().equals(this.getMLFramework()) == false)
            return false;
        if (other.getProgrammingLang() == null ^ this.getProgrammingLang() == null)
            return false;
        if (other.getProgrammingLang() != null && other.getProgrammingLang().equals(this.getProgrammingLang()) == false)
            return false;
        if (other.getProcessor() == null ^ this.getProcessor() == null)
            return false;
        if (other.getProcessor() != null && other.getProcessor().equals(this.getProcessor()) == false)
            return false;
        if (other.getHorovod() == null ^ this.getHorovod() == null)
            return false;
        if (other.getHorovod() != null && other.getHorovod().equals(this.getHorovod()) == false)
            return false;
        if (other.getReleaseNotes() == null ^ this.getReleaseNotes() == null)
            return false;
        if (other.getReleaseNotes() != null && other.getReleaseNotes().equals(this.getReleaseNotes()) == false)
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
        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode());
        hashCode = prime * hashCode + ((getVendorGuidance() == null) ? 0 : getVendorGuidance().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getMLFramework() == null) ? 0 : getMLFramework().hashCode());
        hashCode = prime * hashCode + ((getProgrammingLang() == null) ? 0 : getProgrammingLang().hashCode());
        hashCode = prime * hashCode + ((getProcessor() == null) ? 0 : getProcessor().hashCode());
        hashCode = prime * hashCode + ((getHorovod() == null) ? 0 : getHorovod().hashCode());
        hashCode = prime * hashCode + ((getReleaseNotes() == null) ? 0 : getReleaseNotes().hashCode());
        return hashCode;
    }

    @Override
    public CreateImageVersionRequest clone() {
        return (CreateImageVersionRequest) super.clone();
    }

}
