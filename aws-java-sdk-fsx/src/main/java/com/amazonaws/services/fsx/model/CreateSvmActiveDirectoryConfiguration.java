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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration that Amazon FSx uses to join the ONTAP storage virtual machine (SVM) to your self-managed
 * (including on-premises) Microsoft Active Directory (AD) directory.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateSvmActiveDirectoryConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSvmActiveDirectoryConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The NetBIOS name of the Active Directory computer object that will be created for your SVM.
     * </p>
     */
    private String netBiosName;

    private SelfManagedActiveDirectoryConfiguration selfManagedActiveDirectoryConfiguration;

    /**
     * <p>
     * The NetBIOS name of the Active Directory computer object that will be created for your SVM.
     * </p>
     * 
     * @param netBiosName
     *        The NetBIOS name of the Active Directory computer object that will be created for your SVM.
     */

    public void setNetBiosName(String netBiosName) {
        this.netBiosName = netBiosName;
    }

    /**
     * <p>
     * The NetBIOS name of the Active Directory computer object that will be created for your SVM.
     * </p>
     * 
     * @return The NetBIOS name of the Active Directory computer object that will be created for your SVM.
     */

    public String getNetBiosName() {
        return this.netBiosName;
    }

    /**
     * <p>
     * The NetBIOS name of the Active Directory computer object that will be created for your SVM.
     * </p>
     * 
     * @param netBiosName
     *        The NetBIOS name of the Active Directory computer object that will be created for your SVM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSvmActiveDirectoryConfiguration withNetBiosName(String netBiosName) {
        setNetBiosName(netBiosName);
        return this;
    }

    /**
     * @param selfManagedActiveDirectoryConfiguration
     */

    public void setSelfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryConfiguration selfManagedActiveDirectoryConfiguration) {
        this.selfManagedActiveDirectoryConfiguration = selfManagedActiveDirectoryConfiguration;
    }

    /**
     * @return
     */

    public SelfManagedActiveDirectoryConfiguration getSelfManagedActiveDirectoryConfiguration() {
        return this.selfManagedActiveDirectoryConfiguration;
    }

    /**
     * @param selfManagedActiveDirectoryConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSvmActiveDirectoryConfiguration withSelfManagedActiveDirectoryConfiguration(
            SelfManagedActiveDirectoryConfiguration selfManagedActiveDirectoryConfiguration) {
        setSelfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration);
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
        if (getNetBiosName() != null)
            sb.append("NetBiosName: ").append(getNetBiosName()).append(",");
        if (getSelfManagedActiveDirectoryConfiguration() != null)
            sb.append("SelfManagedActiveDirectoryConfiguration: ").append(getSelfManagedActiveDirectoryConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSvmActiveDirectoryConfiguration == false)
            return false;
        CreateSvmActiveDirectoryConfiguration other = (CreateSvmActiveDirectoryConfiguration) obj;
        if (other.getNetBiosName() == null ^ this.getNetBiosName() == null)
            return false;
        if (other.getNetBiosName() != null && other.getNetBiosName().equals(this.getNetBiosName()) == false)
            return false;
        if (other.getSelfManagedActiveDirectoryConfiguration() == null ^ this.getSelfManagedActiveDirectoryConfiguration() == null)
            return false;
        if (other.getSelfManagedActiveDirectoryConfiguration() != null
                && other.getSelfManagedActiveDirectoryConfiguration().equals(this.getSelfManagedActiveDirectoryConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetBiosName() == null) ? 0 : getNetBiosName().hashCode());
        hashCode = prime * hashCode + ((getSelfManagedActiveDirectoryConfiguration() == null) ? 0 : getSelfManagedActiveDirectoryConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateSvmActiveDirectoryConfiguration clone() {
        try {
            return (CreateSvmActiveDirectoryConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.CreateSvmActiveDirectoryConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
