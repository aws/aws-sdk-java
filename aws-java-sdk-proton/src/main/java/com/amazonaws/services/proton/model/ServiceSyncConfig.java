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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed data of the service sync configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ServiceSyncConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceSyncConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the code repository branch that holds the service code Proton will sync with.
     * </p>
     */
    private String branch;
    /**
     * <p>
     * The file path to the service sync configuration file.
     * </p>
     */
    private String filePath;
    /**
     * <p>
     * The name of the code repository that holds the service code Proton will sync with.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The name of the repository provider that holds the repository Proton will sync with.
     * </p>
     */
    private String repositoryProvider;
    /**
     * <p>
     * The name of the service that the service instance is added to.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The name of the code repository branch that holds the service code Proton will sync with.
     * </p>
     * 
     * @param branch
     *        The name of the code repository branch that holds the service code Proton will sync with.
     */

    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * <p>
     * The name of the code repository branch that holds the service code Proton will sync with.
     * </p>
     * 
     * @return The name of the code repository branch that holds the service code Proton will sync with.
     */

    public String getBranch() {
        return this.branch;
    }

    /**
     * <p>
     * The name of the code repository branch that holds the service code Proton will sync with.
     * </p>
     * 
     * @param branch
     *        The name of the code repository branch that holds the service code Proton will sync with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSyncConfig withBranch(String branch) {
        setBranch(branch);
        return this;
    }

    /**
     * <p>
     * The file path to the service sync configuration file.
     * </p>
     * 
     * @param filePath
     *        The file path to the service sync configuration file.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The file path to the service sync configuration file.
     * </p>
     * 
     * @return The file path to the service sync configuration file.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The file path to the service sync configuration file.
     * </p>
     * 
     * @param filePath
     *        The file path to the service sync configuration file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSyncConfig withFilePath(String filePath) {
        setFilePath(filePath);
        return this;
    }

    /**
     * <p>
     * The name of the code repository that holds the service code Proton will sync with.
     * </p>
     * 
     * @param repositoryName
     *        The name of the code repository that holds the service code Proton will sync with.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the code repository that holds the service code Proton will sync with.
     * </p>
     * 
     * @return The name of the code repository that holds the service code Proton will sync with.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the code repository that holds the service code Proton will sync with.
     * </p>
     * 
     * @param repositoryName
     *        The name of the code repository that holds the service code Proton will sync with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSyncConfig withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The name of the repository provider that holds the repository Proton will sync with.
     * </p>
     * 
     * @param repositoryProvider
     *        The name of the repository provider that holds the repository Proton will sync with.
     * @see RepositoryProvider
     */

    public void setRepositoryProvider(String repositoryProvider) {
        this.repositoryProvider = repositoryProvider;
    }

    /**
     * <p>
     * The name of the repository provider that holds the repository Proton will sync with.
     * </p>
     * 
     * @return The name of the repository provider that holds the repository Proton will sync with.
     * @see RepositoryProvider
     */

    public String getRepositoryProvider() {
        return this.repositoryProvider;
    }

    /**
     * <p>
     * The name of the repository provider that holds the repository Proton will sync with.
     * </p>
     * 
     * @param repositoryProvider
     *        The name of the repository provider that holds the repository Proton will sync with.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryProvider
     */

    public ServiceSyncConfig withRepositoryProvider(String repositoryProvider) {
        setRepositoryProvider(repositoryProvider);
        return this;
    }

    /**
     * <p>
     * The name of the repository provider that holds the repository Proton will sync with.
     * </p>
     * 
     * @param repositoryProvider
     *        The name of the repository provider that holds the repository Proton will sync with.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryProvider
     */

    public ServiceSyncConfig withRepositoryProvider(RepositoryProvider repositoryProvider) {
        this.repositoryProvider = repositoryProvider.toString();
        return this;
    }

    /**
     * <p>
     * The name of the service that the service instance is added to.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that the service instance is added to.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service that the service instance is added to.
     * </p>
     * 
     * @return The name of the service that the service instance is added to.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service that the service instance is added to.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that the service instance is added to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSyncConfig withServiceName(String serviceName) {
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

        if (obj instanceof ServiceSyncConfig == false)
            return false;
        ServiceSyncConfig other = (ServiceSyncConfig) obj;
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
    public ServiceSyncConfig clone() {
        try {
            return (ServiceSyncConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.ServiceSyncConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
