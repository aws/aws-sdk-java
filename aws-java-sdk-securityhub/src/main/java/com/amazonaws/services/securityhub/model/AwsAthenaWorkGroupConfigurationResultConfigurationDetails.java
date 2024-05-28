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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The location in Amazon Simple Storage Service (Amazon S3) where query and calculation results are stored and the
 * encryption option, if any, used for query and calculation results. These are known as client-side settings. If
 * workgroup settings override client-side settings, then the query uses the workgroup settings.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAthenaWorkGroupConfigurationResultConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAthenaWorkGroupConfigurationResultConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the method used to encrypt the user’s data stores in the Athena workgroup.
     * </p>
     */
    private AwsAthenaWorkGroupConfigurationResultConfigurationEncryptionConfigurationDetails encryptionConfiguration;

    /**
     * <p>
     * Specifies the method used to encrypt the user’s data stores in the Athena workgroup.
     * </p>
     * 
     * @param encryptionConfiguration
     *        Specifies the method used to encrypt the user’s data stores in the Athena workgroup.
     */

    public void setEncryptionConfiguration(AwsAthenaWorkGroupConfigurationResultConfigurationEncryptionConfigurationDetails encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * Specifies the method used to encrypt the user’s data stores in the Athena workgroup.
     * </p>
     * 
     * @return Specifies the method used to encrypt the user’s data stores in the Athena workgroup.
     */

    public AwsAthenaWorkGroupConfigurationResultConfigurationEncryptionConfigurationDetails getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * Specifies the method used to encrypt the user’s data stores in the Athena workgroup.
     * </p>
     * 
     * @param encryptionConfiguration
     *        Specifies the method used to encrypt the user’s data stores in the Athena workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAthenaWorkGroupConfigurationResultConfigurationDetails withEncryptionConfiguration(
            AwsAthenaWorkGroupConfigurationResultConfigurationEncryptionConfigurationDetails encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
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
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsAthenaWorkGroupConfigurationResultConfigurationDetails == false)
            return false;
        AwsAthenaWorkGroupConfigurationResultConfigurationDetails other = (AwsAthenaWorkGroupConfigurationResultConfigurationDetails) obj;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public AwsAthenaWorkGroupConfigurationResultConfigurationDetails clone() {
        try {
            return (AwsAthenaWorkGroupConfigurationResultConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAthenaWorkGroupConfigurationResultConfigurationDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
