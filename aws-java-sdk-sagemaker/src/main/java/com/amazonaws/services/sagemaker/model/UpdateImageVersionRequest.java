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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateImageVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateImageVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the image.
     * </p>
     */
    private String imageName;
    /**
     * <p>
     * The alias of the image version.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * The version of the image.
     * </p>
     */
    private Integer version;
    /**
     * <p>
     * A list of aliases to add.
     * </p>
     */
    private java.util.List<String> aliasesToAdd;
    /**
     * <p>
     * A list of aliases to delete.
     * </p>
     */
    private java.util.List<String> aliasesToDelete;
    /**
     * <p>
     * The availability of the image version specified by the maintainer.
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
     * The name of the image.
     * </p>
     * 
     * @param imageName
     *        The name of the image.
     */

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @return The name of the image.
     */

    public String getImageName() {
        return this.imageName;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @param imageName
     *        The name of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageVersionRequest withImageName(String imageName) {
        setImageName(imageName);
        return this;
    }

    /**
     * <p>
     * The alias of the image version.
     * </p>
     * 
     * @param alias
     *        The alias of the image version.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The alias of the image version.
     * </p>
     * 
     * @return The alias of the image version.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The alias of the image version.
     * </p>
     * 
     * @param alias
     *        The alias of the image version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageVersionRequest withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * The version of the image.
     * </p>
     * 
     * @param version
     *        The version of the image.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the image.
     * </p>
     * 
     * @return The version of the image.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the image.
     * </p>
     * 
     * @param version
     *        The version of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageVersionRequest withVersion(Integer version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * A list of aliases to add.
     * </p>
     * 
     * @return A list of aliases to add.
     */

    public java.util.List<String> getAliasesToAdd() {
        return aliasesToAdd;
    }

    /**
     * <p>
     * A list of aliases to add.
     * </p>
     * 
     * @param aliasesToAdd
     *        A list of aliases to add.
     */

    public void setAliasesToAdd(java.util.Collection<String> aliasesToAdd) {
        if (aliasesToAdd == null) {
            this.aliasesToAdd = null;
            return;
        }

        this.aliasesToAdd = new java.util.ArrayList<String>(aliasesToAdd);
    }

    /**
     * <p>
     * A list of aliases to add.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAliasesToAdd(java.util.Collection)} or {@link #withAliasesToAdd(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param aliasesToAdd
     *        A list of aliases to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageVersionRequest withAliasesToAdd(String... aliasesToAdd) {
        if (this.aliasesToAdd == null) {
            setAliasesToAdd(new java.util.ArrayList<String>(aliasesToAdd.length));
        }
        for (String ele : aliasesToAdd) {
            this.aliasesToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of aliases to add.
     * </p>
     * 
     * @param aliasesToAdd
     *        A list of aliases to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageVersionRequest withAliasesToAdd(java.util.Collection<String> aliasesToAdd) {
        setAliasesToAdd(aliasesToAdd);
        return this;
    }

    /**
     * <p>
     * A list of aliases to delete.
     * </p>
     * 
     * @return A list of aliases to delete.
     */

    public java.util.List<String> getAliasesToDelete() {
        return aliasesToDelete;
    }

    /**
     * <p>
     * A list of aliases to delete.
     * </p>
     * 
     * @param aliasesToDelete
     *        A list of aliases to delete.
     */

    public void setAliasesToDelete(java.util.Collection<String> aliasesToDelete) {
        if (aliasesToDelete == null) {
            this.aliasesToDelete = null;
            return;
        }

        this.aliasesToDelete = new java.util.ArrayList<String>(aliasesToDelete);
    }

    /**
     * <p>
     * A list of aliases to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAliasesToDelete(java.util.Collection)} or {@link #withAliasesToDelete(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param aliasesToDelete
     *        A list of aliases to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageVersionRequest withAliasesToDelete(String... aliasesToDelete) {
        if (this.aliasesToDelete == null) {
            setAliasesToDelete(new java.util.ArrayList<String>(aliasesToDelete.length));
        }
        for (String ele : aliasesToDelete) {
            this.aliasesToDelete.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of aliases to delete.
     * </p>
     * 
     * @param aliasesToDelete
     *        A list of aliases to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageVersionRequest withAliasesToDelete(java.util.Collection<String> aliasesToDelete) {
        setAliasesToDelete(aliasesToDelete);
        return this;
    }

    /**
     * <p>
     * The availability of the image version specified by the maintainer.
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
     *        The availability of the image version specified by the maintainer.</p>
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
     * The availability of the image version specified by the maintainer.
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
     * @return The availability of the image version specified by the maintainer.</p>
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
     * The availability of the image version specified by the maintainer.
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
     *        The availability of the image version specified by the maintainer.</p>
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

    public UpdateImageVersionRequest withVendorGuidance(String vendorGuidance) {
        setVendorGuidance(vendorGuidance);
        return this;
    }

    /**
     * <p>
     * The availability of the image version specified by the maintainer.
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
     *        The availability of the image version specified by the maintainer.</p>
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

    public UpdateImageVersionRequest withVendorGuidance(VendorGuidance vendorGuidance) {
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

    public UpdateImageVersionRequest withJobType(String jobType) {
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

    public UpdateImageVersionRequest withJobType(JobType jobType) {
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

    public UpdateImageVersionRequest withMLFramework(String mLFramework) {
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

    public UpdateImageVersionRequest withProgrammingLang(String programmingLang) {
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

    public UpdateImageVersionRequest withProcessor(String processor) {
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

    public UpdateImageVersionRequest withProcessor(Processor processor) {
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

    public UpdateImageVersionRequest withHorovod(Boolean horovod) {
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

    public UpdateImageVersionRequest withReleaseNotes(String releaseNotes) {
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
        if (getImageName() != null)
            sb.append("ImageName: ").append(getImageName()).append(",");
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getAliasesToAdd() != null)
            sb.append("AliasesToAdd: ").append(getAliasesToAdd()).append(",");
        if (getAliasesToDelete() != null)
            sb.append("AliasesToDelete: ").append(getAliasesToDelete()).append(",");
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

        if (obj instanceof UpdateImageVersionRequest == false)
            return false;
        UpdateImageVersionRequest other = (UpdateImageVersionRequest) obj;
        if (other.getImageName() == null ^ this.getImageName() == null)
            return false;
        if (other.getImageName() != null && other.getImageName().equals(this.getImageName()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getAliasesToAdd() == null ^ this.getAliasesToAdd() == null)
            return false;
        if (other.getAliasesToAdd() != null && other.getAliasesToAdd().equals(this.getAliasesToAdd()) == false)
            return false;
        if (other.getAliasesToDelete() == null ^ this.getAliasesToDelete() == null)
            return false;
        if (other.getAliasesToDelete() != null && other.getAliasesToDelete().equals(this.getAliasesToDelete()) == false)
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

        hashCode = prime * hashCode + ((getImageName() == null) ? 0 : getImageName().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getAliasesToAdd() == null) ? 0 : getAliasesToAdd().hashCode());
        hashCode = prime * hashCode + ((getAliasesToDelete() == null) ? 0 : getAliasesToDelete().hashCode());
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
    public UpdateImageVersionRequest clone() {
        return (UpdateImageVersionRequest) super.clone();
    }

}
