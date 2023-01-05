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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details about any failures associated with the scanning configuration of a repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/RepositoryScanningConfigurationFailure"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryScanningConfigurationFailure implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the repository.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The failure code.
     * </p>
     */
    private String failureCode;
    /**
     * <p>
     * The reason for the failure.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @return The name of the repository.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryScanningConfigurationFailure withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @param failureCode
     *        The failure code.
     * @see ScanningConfigurationFailureCode
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @return The failure code.
     * @see ScanningConfigurationFailureCode
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @param failureCode
     *        The failure code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanningConfigurationFailureCode
     */

    public RepositoryScanningConfigurationFailure withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @param failureCode
     *        The failure code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanningConfigurationFailureCode
     */

    public RepositoryScanningConfigurationFailure withFailureCode(ScanningConfigurationFailureCode failureCode) {
        this.failureCode = failureCode.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the failure.
     * </p>
     * 
     * @param failureReason
     *        The reason for the failure.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason for the failure.
     * </p>
     * 
     * @return The reason for the failure.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason for the failure.
     * </p>
     * 
     * @param failureReason
     *        The reason for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryScanningConfigurationFailure withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryScanningConfigurationFailure == false)
            return false;
        RepositoryScanningConfigurationFailure other = (RepositoryScanningConfigurationFailure) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public RepositoryScanningConfigurationFailure clone() {
        try {
            return (RepositoryScanningConfigurationFailure) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.RepositoryScanningConfigurationFailureMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
