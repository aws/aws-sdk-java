/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a security configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SecurityConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The time at which this security configuration was created.
     * </p>
     */
    private java.util.Date createdTimeStamp;
    /**
     * <p>
     * The encryption configuration associated with this security configuration.
     * </p>
     */
    private EncryptionConfiguration encryptionConfiguration;

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * 
     * @param name
     *        The name of the security configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * 
     * @return The name of the security configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * 
     * @param name
     *        The name of the security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The time at which this security configuration was created.
     * </p>
     * 
     * @param createdTimeStamp
     *        The time at which this security configuration was created.
     */

    public void setCreatedTimeStamp(java.util.Date createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
    }

    /**
     * <p>
     * The time at which this security configuration was created.
     * </p>
     * 
     * @return The time at which this security configuration was created.
     */

    public java.util.Date getCreatedTimeStamp() {
        return this.createdTimeStamp;
    }

    /**
     * <p>
     * The time at which this security configuration was created.
     * </p>
     * 
     * @param createdTimeStamp
     *        The time at which this security configuration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityConfiguration withCreatedTimeStamp(java.util.Date createdTimeStamp) {
        setCreatedTimeStamp(createdTimeStamp);
        return this;
    }

    /**
     * <p>
     * The encryption configuration associated with this security configuration.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption configuration associated with this security configuration.
     */

    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration associated with this security configuration.
     * </p>
     * 
     * @return The encryption configuration associated with this security configuration.
     */

    public EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration associated with this security configuration.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption configuration associated with this security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityConfiguration withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreatedTimeStamp() != null)
            sb.append("CreatedTimeStamp: ").append(getCreatedTimeStamp()).append(",");
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

        if (obj instanceof SecurityConfiguration == false)
            return false;
        SecurityConfiguration other = (SecurityConfiguration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreatedTimeStamp() == null ^ this.getCreatedTimeStamp() == null)
            return false;
        if (other.getCreatedTimeStamp() != null && other.getCreatedTimeStamp().equals(this.getCreatedTimeStamp()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimeStamp() == null) ? 0 : getCreatedTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public SecurityConfiguration clone() {
        try {
            return (SecurityConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.SecurityConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
