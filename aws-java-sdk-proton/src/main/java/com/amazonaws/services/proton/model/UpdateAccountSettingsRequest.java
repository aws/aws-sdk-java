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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateAccountSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccountSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Set to <code>true</code> to remove a configured pipeline repository from the account settings. Don't set this
     * field if you are updating the configured pipeline repository.
     * </p>
     */
    private Boolean deletePipelineProvisioningRepository;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role you want to use for provisioning pipelines. Proton assumes
     * this role for CodeBuild-based provisioning.
     * </p>
     */
    private String pipelineCodebuildRoleArn;
    /**
     * <p>
     * A linked repository for pipeline provisioning. Specify it if you have environments configured for self-managed
     * provisioning with services that include pipelines. A linked repository is a repository that has been registered
     * with Proton. For more information, see <a>CreateRepository</a>.
     * </p>
     * <p>
     * To remove a previously configured repository, set <code>deletePipelineProvisioningRepository</code> to
     * <code>true</code>, and don't set <code>pipelineProvisioningRepository</code>.
     * </p>
     */
    private RepositoryBranchInput pipelineProvisioningRepository;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role you want to use for provisioning pipelines. Assumed by Proton
     * for Amazon Web Services-managed provisioning, and by customer-owned automation for self-managed provisioning.
     * </p>
     * <p>
     * To remove a previously configured ARN, specify an empty string.
     * </p>
     */
    private String pipelineServiceRoleArn;

    /**
     * <p>
     * Set to <code>true</code> to remove a configured pipeline repository from the account settings. Don't set this
     * field if you are updating the configured pipeline repository.
     * </p>
     * 
     * @param deletePipelineProvisioningRepository
     *        Set to <code>true</code> to remove a configured pipeline repository from the account settings. Don't set
     *        this field if you are updating the configured pipeline repository.
     */

    public void setDeletePipelineProvisioningRepository(Boolean deletePipelineProvisioningRepository) {
        this.deletePipelineProvisioningRepository = deletePipelineProvisioningRepository;
    }

    /**
     * <p>
     * Set to <code>true</code> to remove a configured pipeline repository from the account settings. Don't set this
     * field if you are updating the configured pipeline repository.
     * </p>
     * 
     * @return Set to <code>true</code> to remove a configured pipeline repository from the account settings. Don't set
     *         this field if you are updating the configured pipeline repository.
     */

    public Boolean getDeletePipelineProvisioningRepository() {
        return this.deletePipelineProvisioningRepository;
    }

    /**
     * <p>
     * Set to <code>true</code> to remove a configured pipeline repository from the account settings. Don't set this
     * field if you are updating the configured pipeline repository.
     * </p>
     * 
     * @param deletePipelineProvisioningRepository
     *        Set to <code>true</code> to remove a configured pipeline repository from the account settings. Don't set
     *        this field if you are updating the configured pipeline repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountSettingsRequest withDeletePipelineProvisioningRepository(Boolean deletePipelineProvisioningRepository) {
        setDeletePipelineProvisioningRepository(deletePipelineProvisioningRepository);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to remove a configured pipeline repository from the account settings. Don't set this
     * field if you are updating the configured pipeline repository.
     * </p>
     * 
     * @return Set to <code>true</code> to remove a configured pipeline repository from the account settings. Don't set
     *         this field if you are updating the configured pipeline repository.
     */

    public Boolean isDeletePipelineProvisioningRepository() {
        return this.deletePipelineProvisioningRepository;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role you want to use for provisioning pipelines. Proton assumes
     * this role for CodeBuild-based provisioning.
     * </p>
     * 
     * @param pipelineCodebuildRoleArn
     *        The Amazon Resource Name (ARN) of the service role you want to use for provisioning pipelines. Proton
     *        assumes this role for CodeBuild-based provisioning.
     */

    public void setPipelineCodebuildRoleArn(String pipelineCodebuildRoleArn) {
        this.pipelineCodebuildRoleArn = pipelineCodebuildRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role you want to use for provisioning pipelines. Proton assumes
     * this role for CodeBuild-based provisioning.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service role you want to use for provisioning pipelines. Proton
     *         assumes this role for CodeBuild-based provisioning.
     */

    public String getPipelineCodebuildRoleArn() {
        return this.pipelineCodebuildRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role you want to use for provisioning pipelines. Proton assumes
     * this role for CodeBuild-based provisioning.
     * </p>
     * 
     * @param pipelineCodebuildRoleArn
     *        The Amazon Resource Name (ARN) of the service role you want to use for provisioning pipelines. Proton
     *        assumes this role for CodeBuild-based provisioning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountSettingsRequest withPipelineCodebuildRoleArn(String pipelineCodebuildRoleArn) {
        setPipelineCodebuildRoleArn(pipelineCodebuildRoleArn);
        return this;
    }

    /**
     * <p>
     * A linked repository for pipeline provisioning. Specify it if you have environments configured for self-managed
     * provisioning with services that include pipelines. A linked repository is a repository that has been registered
     * with Proton. For more information, see <a>CreateRepository</a>.
     * </p>
     * <p>
     * To remove a previously configured repository, set <code>deletePipelineProvisioningRepository</code> to
     * <code>true</code>, and don't set <code>pipelineProvisioningRepository</code>.
     * </p>
     * 
     * @param pipelineProvisioningRepository
     *        A linked repository for pipeline provisioning. Specify it if you have environments configured for
     *        self-managed provisioning with services that include pipelines. A linked repository is a repository that
     *        has been registered with Proton. For more information, see <a>CreateRepository</a>.</p>
     *        <p>
     *        To remove a previously configured repository, set <code>deletePipelineProvisioningRepository</code> to
     *        <code>true</code>, and don't set <code>pipelineProvisioningRepository</code>.
     */

    public void setPipelineProvisioningRepository(RepositoryBranchInput pipelineProvisioningRepository) {
        this.pipelineProvisioningRepository = pipelineProvisioningRepository;
    }

    /**
     * <p>
     * A linked repository for pipeline provisioning. Specify it if you have environments configured for self-managed
     * provisioning with services that include pipelines. A linked repository is a repository that has been registered
     * with Proton. For more information, see <a>CreateRepository</a>.
     * </p>
     * <p>
     * To remove a previously configured repository, set <code>deletePipelineProvisioningRepository</code> to
     * <code>true</code>, and don't set <code>pipelineProvisioningRepository</code>.
     * </p>
     * 
     * @return A linked repository for pipeline provisioning. Specify it if you have environments configured for
     *         self-managed provisioning with services that include pipelines. A linked repository is a repository that
     *         has been registered with Proton. For more information, see <a>CreateRepository</a>.</p>
     *         <p>
     *         To remove a previously configured repository, set <code>deletePipelineProvisioningRepository</code> to
     *         <code>true</code>, and don't set <code>pipelineProvisioningRepository</code>.
     */

    public RepositoryBranchInput getPipelineProvisioningRepository() {
        return this.pipelineProvisioningRepository;
    }

    /**
     * <p>
     * A linked repository for pipeline provisioning. Specify it if you have environments configured for self-managed
     * provisioning with services that include pipelines. A linked repository is a repository that has been registered
     * with Proton. For more information, see <a>CreateRepository</a>.
     * </p>
     * <p>
     * To remove a previously configured repository, set <code>deletePipelineProvisioningRepository</code> to
     * <code>true</code>, and don't set <code>pipelineProvisioningRepository</code>.
     * </p>
     * 
     * @param pipelineProvisioningRepository
     *        A linked repository for pipeline provisioning. Specify it if you have environments configured for
     *        self-managed provisioning with services that include pipelines. A linked repository is a repository that
     *        has been registered with Proton. For more information, see <a>CreateRepository</a>.</p>
     *        <p>
     *        To remove a previously configured repository, set <code>deletePipelineProvisioningRepository</code> to
     *        <code>true</code>, and don't set <code>pipelineProvisioningRepository</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountSettingsRequest withPipelineProvisioningRepository(RepositoryBranchInput pipelineProvisioningRepository) {
        setPipelineProvisioningRepository(pipelineProvisioningRepository);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role you want to use for provisioning pipelines. Assumed by Proton
     * for Amazon Web Services-managed provisioning, and by customer-owned automation for self-managed provisioning.
     * </p>
     * <p>
     * To remove a previously configured ARN, specify an empty string.
     * </p>
     * 
     * @param pipelineServiceRoleArn
     *        The Amazon Resource Name (ARN) of the service role you want to use for provisioning pipelines. Assumed by
     *        Proton for Amazon Web Services-managed provisioning, and by customer-owned automation for self-managed
     *        provisioning.</p>
     *        <p>
     *        To remove a previously configured ARN, specify an empty string.
     */

    public void setPipelineServiceRoleArn(String pipelineServiceRoleArn) {
        this.pipelineServiceRoleArn = pipelineServiceRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role you want to use for provisioning pipelines. Assumed by Proton
     * for Amazon Web Services-managed provisioning, and by customer-owned automation for self-managed provisioning.
     * </p>
     * <p>
     * To remove a previously configured ARN, specify an empty string.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service role you want to use for provisioning pipelines. Assumed by
     *         Proton for Amazon Web Services-managed provisioning, and by customer-owned automation for self-managed
     *         provisioning.</p>
     *         <p>
     *         To remove a previously configured ARN, specify an empty string.
     */

    public String getPipelineServiceRoleArn() {
        return this.pipelineServiceRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role you want to use for provisioning pipelines. Assumed by Proton
     * for Amazon Web Services-managed provisioning, and by customer-owned automation for self-managed provisioning.
     * </p>
     * <p>
     * To remove a previously configured ARN, specify an empty string.
     * </p>
     * 
     * @param pipelineServiceRoleArn
     *        The Amazon Resource Name (ARN) of the service role you want to use for provisioning pipelines. Assumed by
     *        Proton for Amazon Web Services-managed provisioning, and by customer-owned automation for self-managed
     *        provisioning.</p>
     *        <p>
     *        To remove a previously configured ARN, specify an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountSettingsRequest withPipelineServiceRoleArn(String pipelineServiceRoleArn) {
        setPipelineServiceRoleArn(pipelineServiceRoleArn);
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
        if (getDeletePipelineProvisioningRepository() != null)
            sb.append("DeletePipelineProvisioningRepository: ").append(getDeletePipelineProvisioningRepository()).append(",");
        if (getPipelineCodebuildRoleArn() != null)
            sb.append("PipelineCodebuildRoleArn: ").append(getPipelineCodebuildRoleArn()).append(",");
        if (getPipelineProvisioningRepository() != null)
            sb.append("PipelineProvisioningRepository: ").append(getPipelineProvisioningRepository()).append(",");
        if (getPipelineServiceRoleArn() != null)
            sb.append("PipelineServiceRoleArn: ").append(getPipelineServiceRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccountSettingsRequest == false)
            return false;
        UpdateAccountSettingsRequest other = (UpdateAccountSettingsRequest) obj;
        if (other.getDeletePipelineProvisioningRepository() == null ^ this.getDeletePipelineProvisioningRepository() == null)
            return false;
        if (other.getDeletePipelineProvisioningRepository() != null
                && other.getDeletePipelineProvisioningRepository().equals(this.getDeletePipelineProvisioningRepository()) == false)
            return false;
        if (other.getPipelineCodebuildRoleArn() == null ^ this.getPipelineCodebuildRoleArn() == null)
            return false;
        if (other.getPipelineCodebuildRoleArn() != null && other.getPipelineCodebuildRoleArn().equals(this.getPipelineCodebuildRoleArn()) == false)
            return false;
        if (other.getPipelineProvisioningRepository() == null ^ this.getPipelineProvisioningRepository() == null)
            return false;
        if (other.getPipelineProvisioningRepository() != null
                && other.getPipelineProvisioningRepository().equals(this.getPipelineProvisioningRepository()) == false)
            return false;
        if (other.getPipelineServiceRoleArn() == null ^ this.getPipelineServiceRoleArn() == null)
            return false;
        if (other.getPipelineServiceRoleArn() != null && other.getPipelineServiceRoleArn().equals(this.getPipelineServiceRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeletePipelineProvisioningRepository() == null) ? 0 : getDeletePipelineProvisioningRepository().hashCode());
        hashCode = prime * hashCode + ((getPipelineCodebuildRoleArn() == null) ? 0 : getPipelineCodebuildRoleArn().hashCode());
        hashCode = prime * hashCode + ((getPipelineProvisioningRepository() == null) ? 0 : getPipelineProvisioningRepository().hashCode());
        hashCode = prime * hashCode + ((getPipelineServiceRoleArn() == null) ? 0 : getPipelineServiceRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccountSettingsRequest clone() {
        return (UpdateAccountSettingsRequest) super.clone();
    }

}
