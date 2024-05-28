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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details of Amazon Security Lake object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DataLakeConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataLakeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides encryption details of Amazon Security Lake object.
     * </p>
     */
    private DataLakeEncryptionConfiguration encryptionConfiguration;
    /**
     * <p>
     * Provides lifecycle details of Amazon Security Lake object.
     * </p>
     */
    private DataLakeLifecycleConfiguration lifecycleConfiguration;
    /**
     * <p>
     * The Amazon Web Services Regions where Security Lake is automatically enabled.
     * </p>
     */
    private String region;
    /**
     * <p>
     * Provides replication details of Amazon Security Lake object.
     * </p>
     */
    private DataLakeReplicationConfiguration replicationConfiguration;

    /**
     * <p>
     * Provides encryption details of Amazon Security Lake object.
     * </p>
     * 
     * @param encryptionConfiguration
     *        Provides encryption details of Amazon Security Lake object.
     */

    public void setEncryptionConfiguration(DataLakeEncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * Provides encryption details of Amazon Security Lake object.
     * </p>
     * 
     * @return Provides encryption details of Amazon Security Lake object.
     */

    public DataLakeEncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * Provides encryption details of Amazon Security Lake object.
     * </p>
     * 
     * @param encryptionConfiguration
     *        Provides encryption details of Amazon Security Lake object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeConfiguration withEncryptionConfiguration(DataLakeEncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides lifecycle details of Amazon Security Lake object.
     * </p>
     * 
     * @param lifecycleConfiguration
     *        Provides lifecycle details of Amazon Security Lake object.
     */

    public void setLifecycleConfiguration(DataLakeLifecycleConfiguration lifecycleConfiguration) {
        this.lifecycleConfiguration = lifecycleConfiguration;
    }

    /**
     * <p>
     * Provides lifecycle details of Amazon Security Lake object.
     * </p>
     * 
     * @return Provides lifecycle details of Amazon Security Lake object.
     */

    public DataLakeLifecycleConfiguration getLifecycleConfiguration() {
        return this.lifecycleConfiguration;
    }

    /**
     * <p>
     * Provides lifecycle details of Amazon Security Lake object.
     * </p>
     * 
     * @param lifecycleConfiguration
     *        Provides lifecycle details of Amazon Security Lake object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeConfiguration withLifecycleConfiguration(DataLakeLifecycleConfiguration lifecycleConfiguration) {
        setLifecycleConfiguration(lifecycleConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Regions where Security Lake is automatically enabled.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Regions where Security Lake is automatically enabled.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Regions where Security Lake is automatically enabled.
     * </p>
     * 
     * @return The Amazon Web Services Regions where Security Lake is automatically enabled.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Regions where Security Lake is automatically enabled.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Regions where Security Lake is automatically enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeConfiguration withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * Provides replication details of Amazon Security Lake object.
     * </p>
     * 
     * @param replicationConfiguration
     *        Provides replication details of Amazon Security Lake object.
     */

    public void setReplicationConfiguration(DataLakeReplicationConfiguration replicationConfiguration) {
        this.replicationConfiguration = replicationConfiguration;
    }

    /**
     * <p>
     * Provides replication details of Amazon Security Lake object.
     * </p>
     * 
     * @return Provides replication details of Amazon Security Lake object.
     */

    public DataLakeReplicationConfiguration getReplicationConfiguration() {
        return this.replicationConfiguration;
    }

    /**
     * <p>
     * Provides replication details of Amazon Security Lake object.
     * </p>
     * 
     * @param replicationConfiguration
     *        Provides replication details of Amazon Security Lake object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeConfiguration withReplicationConfiguration(DataLakeReplicationConfiguration replicationConfiguration) {
        setReplicationConfiguration(replicationConfiguration);
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
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration()).append(",");
        if (getLifecycleConfiguration() != null)
            sb.append("LifecycleConfiguration: ").append(getLifecycleConfiguration()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getReplicationConfiguration() != null)
            sb.append("ReplicationConfiguration: ").append(getReplicationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataLakeConfiguration == false)
            return false;
        DataLakeConfiguration other = (DataLakeConfiguration) obj;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        if (other.getLifecycleConfiguration() == null ^ this.getLifecycleConfiguration() == null)
            return false;
        if (other.getLifecycleConfiguration() != null && other.getLifecycleConfiguration().equals(this.getLifecycleConfiguration()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getReplicationConfiguration() == null ^ this.getReplicationConfiguration() == null)
            return false;
        if (other.getReplicationConfiguration() != null && other.getReplicationConfiguration().equals(this.getReplicationConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLifecycleConfiguration() == null) ? 0 : getLifecycleConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getReplicationConfiguration() == null) ? 0 : getReplicationConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DataLakeConfiguration clone() {
        try {
            return (DataLakeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.DataLakeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
