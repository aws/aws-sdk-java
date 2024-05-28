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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateStorageVirtualMachine" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStorageVirtualMachineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies updates to an SVM's Microsoft Active Directory (AD) configuration.
     * </p>
     */
    private UpdateSvmActiveDirectoryConfiguration activeDirectoryConfiguration;

    private String clientRequestToken;
    /**
     * <p>
     * The ID of the SVM that you want to update, in the format <code>svm-0123456789abcdef0</code>.
     * </p>
     */
    private String storageVirtualMachineId;
    /**
     * <p>
     * Specifies a new SvmAdminPassword.
     * </p>
     */
    private String svmAdminPassword;

    /**
     * <p>
     * Specifies updates to an SVM's Microsoft Active Directory (AD) configuration.
     * </p>
     * 
     * @param activeDirectoryConfiguration
     *        Specifies updates to an SVM's Microsoft Active Directory (AD) configuration.
     */

    public void setActiveDirectoryConfiguration(UpdateSvmActiveDirectoryConfiguration activeDirectoryConfiguration) {
        this.activeDirectoryConfiguration = activeDirectoryConfiguration;
    }

    /**
     * <p>
     * Specifies updates to an SVM's Microsoft Active Directory (AD) configuration.
     * </p>
     * 
     * @return Specifies updates to an SVM's Microsoft Active Directory (AD) configuration.
     */

    public UpdateSvmActiveDirectoryConfiguration getActiveDirectoryConfiguration() {
        return this.activeDirectoryConfiguration;
    }

    /**
     * <p>
     * Specifies updates to an SVM's Microsoft Active Directory (AD) configuration.
     * </p>
     * 
     * @param activeDirectoryConfiguration
     *        Specifies updates to an SVM's Microsoft Active Directory (AD) configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageVirtualMachineRequest withActiveDirectoryConfiguration(UpdateSvmActiveDirectoryConfiguration activeDirectoryConfiguration) {
        setActiveDirectoryConfiguration(activeDirectoryConfiguration);
        return this;
    }

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageVirtualMachineRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The ID of the SVM that you want to update, in the format <code>svm-0123456789abcdef0</code>.
     * </p>
     * 
     * @param storageVirtualMachineId
     *        The ID of the SVM that you want to update, in the format <code>svm-0123456789abcdef0</code>.
     */

    public void setStorageVirtualMachineId(String storageVirtualMachineId) {
        this.storageVirtualMachineId = storageVirtualMachineId;
    }

    /**
     * <p>
     * The ID of the SVM that you want to update, in the format <code>svm-0123456789abcdef0</code>.
     * </p>
     * 
     * @return The ID of the SVM that you want to update, in the format <code>svm-0123456789abcdef0</code>.
     */

    public String getStorageVirtualMachineId() {
        return this.storageVirtualMachineId;
    }

    /**
     * <p>
     * The ID of the SVM that you want to update, in the format <code>svm-0123456789abcdef0</code>.
     * </p>
     * 
     * @param storageVirtualMachineId
     *        The ID of the SVM that you want to update, in the format <code>svm-0123456789abcdef0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageVirtualMachineRequest withStorageVirtualMachineId(String storageVirtualMachineId) {
        setStorageVirtualMachineId(storageVirtualMachineId);
        return this;
    }

    /**
     * <p>
     * Specifies a new SvmAdminPassword.
     * </p>
     * 
     * @param svmAdminPassword
     *        Specifies a new SvmAdminPassword.
     */

    public void setSvmAdminPassword(String svmAdminPassword) {
        this.svmAdminPassword = svmAdminPassword;
    }

    /**
     * <p>
     * Specifies a new SvmAdminPassword.
     * </p>
     * 
     * @return Specifies a new SvmAdminPassword.
     */

    public String getSvmAdminPassword() {
        return this.svmAdminPassword;
    }

    /**
     * <p>
     * Specifies a new SvmAdminPassword.
     * </p>
     * 
     * @param svmAdminPassword
     *        Specifies a new SvmAdminPassword.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageVirtualMachineRequest withSvmAdminPassword(String svmAdminPassword) {
        setSvmAdminPassword(svmAdminPassword);
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
        if (getActiveDirectoryConfiguration() != null)
            sb.append("ActiveDirectoryConfiguration: ").append(getActiveDirectoryConfiguration()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getStorageVirtualMachineId() != null)
            sb.append("StorageVirtualMachineId: ").append(getStorageVirtualMachineId()).append(",");
        if (getSvmAdminPassword() != null)
            sb.append("SvmAdminPassword: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStorageVirtualMachineRequest == false)
            return false;
        UpdateStorageVirtualMachineRequest other = (UpdateStorageVirtualMachineRequest) obj;
        if (other.getActiveDirectoryConfiguration() == null ^ this.getActiveDirectoryConfiguration() == null)
            return false;
        if (other.getActiveDirectoryConfiguration() != null && other.getActiveDirectoryConfiguration().equals(this.getActiveDirectoryConfiguration()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getStorageVirtualMachineId() == null ^ this.getStorageVirtualMachineId() == null)
            return false;
        if (other.getStorageVirtualMachineId() != null && other.getStorageVirtualMachineId().equals(this.getStorageVirtualMachineId()) == false)
            return false;
        if (other.getSvmAdminPassword() == null ^ this.getSvmAdminPassword() == null)
            return false;
        if (other.getSvmAdminPassword() != null && other.getSvmAdminPassword().equals(this.getSvmAdminPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActiveDirectoryConfiguration() == null) ? 0 : getActiveDirectoryConfiguration().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getStorageVirtualMachineId() == null) ? 0 : getStorageVirtualMachineId().hashCode());
        hashCode = prime * hashCode + ((getSvmAdminPassword() == null) ? 0 : getSvmAdminPassword().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStorageVirtualMachineRequest clone() {
        return (UpdateStorageVirtualMachineRequest) super.clone();
    }

}
