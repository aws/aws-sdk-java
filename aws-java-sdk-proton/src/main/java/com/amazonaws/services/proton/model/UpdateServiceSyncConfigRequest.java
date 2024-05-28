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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServiceSyncConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceSyncConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the code repository branch where the Proton Ops file is found.
     * </p>
     */
    private String branch;
    /**
     * <p>
     * The path to the Proton Ops file.
     * </p>
     */
    private String filePath;
    /**
     * <p>
     * The name of the repository where the Proton Ops file is found.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The name of the repository provider where the Proton Ops file is found.
     * </p>
     */
    private String repositoryProvider;
    /**
     * <p>
     * The name of the service the Proton Ops file is for.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The name of the code repository branch where the Proton Ops file is found.
     * </p>
     * 
     * @param branch
     *        The name of the code repository branch where the Proton Ops file is found.
     */

    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * <p>
     * The name of the code repository branch where the Proton Ops file is found.
     * </p>
     * 
     * @return The name of the code repository branch where the Proton Ops file is found.
     */

    public String getBranch() {
        return this.branch;
    }

    /**
     * <p>
     * The name of the code repository branch where the Proton Ops file is found.
     * </p>
     * 
     * @param branch
     *        The name of the code repository branch where the Proton Ops file is found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceSyncConfigRequest withBranch(String branch) {
        setBranch(branch);
        return this;
    }

    /**
     * <p>
     * The path to the Proton Ops file.
     * </p>
     * 
     * @param filePath
     *        The path to the Proton Ops file.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The path to the Proton Ops file.
     * </p>
     * 
     * @return The path to the Proton Ops file.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The path to the Proton Ops file.
     * </p>
     * 
     * @param filePath
     *        The path to the Proton Ops file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceSyncConfigRequest withFilePath(String filePath) {
        setFilePath(filePath);
        return this;
    }

    /**
     * <p>
     * The name of the repository where the Proton Ops file is found.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where the Proton Ops file is found.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where the Proton Ops file is found.
     * </p>
     * 
     * @return The name of the repository where the Proton Ops file is found.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository where the Proton Ops file is found.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where the Proton Ops file is found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceSyncConfigRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The name of the repository provider where the Proton Ops file is found.
     * </p>
     * 
     * @param repositoryProvider
     *        The name of the repository provider where the Proton Ops file is found.
     * @see RepositoryProvider
     */

    public void setRepositoryProvider(String repositoryProvider) {
        this.repositoryProvider = repositoryProvider;
    }

    /**
     * <p>
     * The name of the repository provider where the Proton Ops file is found.
     * </p>
     * 
     * @return The name of the repository provider where the Proton Ops file is found.
     * @see RepositoryProvider
     */

    public String getRepositoryProvider() {
        return this.repositoryProvider;
    }

    /**
     * <p>
     * The name of the repository provider where the Proton Ops file is found.
     * </p>
     * 
     * @param repositoryProvider
     *        The name of the repository provider where the Proton Ops file is found.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryProvider
     */

    public UpdateServiceSyncConfigRequest withRepositoryProvider(String repositoryProvider) {
        setRepositoryProvider(repositoryProvider);
        return this;
    }

    /**
     * <p>
     * The name of the repository provider where the Proton Ops file is found.
     * </p>
     * 
     * @param repositoryProvider
     *        The name of the repository provider where the Proton Ops file is found.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryProvider
     */

    public UpdateServiceSyncConfigRequest withRepositoryProvider(RepositoryProvider repositoryProvider) {
        this.repositoryProvider = repositoryProvider.toString();
        return this;
    }

    /**
     * <p>
     * The name of the service the Proton Ops file is for.
     * </p>
     * 
     * @param serviceName
     *        The name of the service the Proton Ops file is for.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service the Proton Ops file is for.
     * </p>
     * 
     * @return The name of the service the Proton Ops file is for.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service the Proton Ops file is for.
     * </p>
     * 
     * @param serviceName
     *        The name of the service the Proton Ops file is for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceSyncConfigRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
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
        if (getBranch() != null)
            sb.append("Branch: ").append(getBranch()).append(",");
        if (getFilePath() != null)
            sb.append("FilePath: ").append(getFilePath()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getRepositoryProvider() != null)
            sb.append("RepositoryProvider: ").append(getRepositoryProvider()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceSyncConfigRequest == false)
            return false;
        UpdateServiceSyncConfigRequest other = (UpdateServiceSyncConfigRequest) obj;
        if (other.getBranch() == null ^ this.getBranch() == null)
            return false;
        if (other.getBranch() != null && other.getBranch().equals(this.getBranch()) == false)
            return false;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getRepositoryProvider() == null ^ this.getRepositoryProvider() == null)
            return false;
        if (other.getRepositoryProvider() != null && other.getRepositoryProvider().equals(this.getRepositoryProvider()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranch() == null) ? 0 : getBranch().hashCode());
        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getRepositoryProvider() == null) ? 0 : getRepositoryProvider().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceSyncConfigRequest clone() {
        return (UpdateServiceSyncConfigRequest) super.clone();
    }

}
