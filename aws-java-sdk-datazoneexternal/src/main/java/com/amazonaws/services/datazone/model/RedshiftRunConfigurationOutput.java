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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration details of the Amazon Redshift data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RedshiftRunConfigurationOutput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftRunConfigurationOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Amazon Web Services account included in the configuration details of the Amazon Redshift data
     * source.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The data access role included in the configuration details of the Amazon Redshift data source.
     * </p>
     */
    private String dataAccessRole;

    private RedshiftCredentialConfiguration redshiftCredentialConfiguration;

    private RedshiftStorage redshiftStorage;
    /**
     * <p>
     * The Amazon Web Services region included in the configuration details of the Amazon Redshift data source.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The relational filger configurations included in the configuration details of the Amazon Redshift data source.
     * </p>
     */
    private java.util.List<RelationalFilterConfiguration> relationalFilterConfigurations;

    /**
     * <p>
     * The ID of the Amazon Web Services account included in the configuration details of the Amazon Redshift data
     * source.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account included in the configuration details of the Amazon Redshift
     *        data source.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account included in the configuration details of the Amazon Redshift data
     * source.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account included in the configuration details of the Amazon Redshift
     *         data source.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account included in the configuration details of the Amazon Redshift data
     * source.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account included in the configuration details of the Amazon Redshift
     *        data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftRunConfigurationOutput withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The data access role included in the configuration details of the Amazon Redshift data source.
     * </p>
     * 
     * @param dataAccessRole
     *        The data access role included in the configuration details of the Amazon Redshift data source.
     */

    public void setDataAccessRole(String dataAccessRole) {
        this.dataAccessRole = dataAccessRole;
    }

    /**
     * <p>
     * The data access role included in the configuration details of the Amazon Redshift data source.
     * </p>
     * 
     * @return The data access role included in the configuration details of the Amazon Redshift data source.
     */

    public String getDataAccessRole() {
        return this.dataAccessRole;
    }

    /**
     * <p>
     * The data access role included in the configuration details of the Amazon Redshift data source.
     * </p>
     * 
     * @param dataAccessRole
     *        The data access role included in the configuration details of the Amazon Redshift data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftRunConfigurationOutput withDataAccessRole(String dataAccessRole) {
        setDataAccessRole(dataAccessRole);
        return this;
    }

    /**
     * @param redshiftCredentialConfiguration
     */

    public void setRedshiftCredentialConfiguration(RedshiftCredentialConfiguration redshiftCredentialConfiguration) {
        this.redshiftCredentialConfiguration = redshiftCredentialConfiguration;
    }

    /**
     * @return
     */

    public RedshiftCredentialConfiguration getRedshiftCredentialConfiguration() {
        return this.redshiftCredentialConfiguration;
    }

    /**
     * @param redshiftCredentialConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftRunConfigurationOutput withRedshiftCredentialConfiguration(RedshiftCredentialConfiguration redshiftCredentialConfiguration) {
        setRedshiftCredentialConfiguration(redshiftCredentialConfiguration);
        return this;
    }

    /**
     * @param redshiftStorage
     */

    public void setRedshiftStorage(RedshiftStorage redshiftStorage) {
        this.redshiftStorage = redshiftStorage;
    }

    /**
     * @return
     */

    public RedshiftStorage getRedshiftStorage() {
        return this.redshiftStorage;
    }

    /**
     * @param redshiftStorage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftRunConfigurationOutput withRedshiftStorage(RedshiftStorage redshiftStorage) {
        setRedshiftStorage(redshiftStorage);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services region included in the configuration details of the Amazon Redshift data source.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services region included in the configuration details of the Amazon Redshift data source.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services region included in the configuration details of the Amazon Redshift data source.
     * </p>
     * 
     * @return The Amazon Web Services region included in the configuration details of the Amazon Redshift data source.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services region included in the configuration details of the Amazon Redshift data source.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services region included in the configuration details of the Amazon Redshift data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftRunConfigurationOutput withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The relational filger configurations included in the configuration details of the Amazon Redshift data source.
     * </p>
     * 
     * @return The relational filger configurations included in the configuration details of the Amazon Redshift data
     *         source.
     */

    public java.util.List<RelationalFilterConfiguration> getRelationalFilterConfigurations() {
        return relationalFilterConfigurations;
    }

    /**
     * <p>
     * The relational filger configurations included in the configuration details of the Amazon Redshift data source.
     * </p>
     * 
     * @param relationalFilterConfigurations
     *        The relational filger configurations included in the configuration details of the Amazon Redshift data
     *        source.
     */

    public void setRelationalFilterConfigurations(java.util.Collection<RelationalFilterConfiguration> relationalFilterConfigurations) {
        if (relationalFilterConfigurations == null) {
            this.relationalFilterConfigurations = null;
            return;
        }

        this.relationalFilterConfigurations = new java.util.ArrayList<RelationalFilterConfiguration>(relationalFilterConfigurations);
    }

    /**
     * <p>
     * The relational filger configurations included in the configuration details of the Amazon Redshift data source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelationalFilterConfigurations(java.util.Collection)} or
     * {@link #withRelationalFilterConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param relationalFilterConfigurations
     *        The relational filger configurations included in the configuration details of the Amazon Redshift data
     *        source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftRunConfigurationOutput withRelationalFilterConfigurations(RelationalFilterConfiguration... relationalFilterConfigurations) {
        if (this.relationalFilterConfigurations == null) {
            setRelationalFilterConfigurations(new java.util.ArrayList<RelationalFilterConfiguration>(relationalFilterConfigurations.length));
        }
        for (RelationalFilterConfiguration ele : relationalFilterConfigurations) {
            this.relationalFilterConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The relational filger configurations included in the configuration details of the Amazon Redshift data source.
     * </p>
     * 
     * @param relationalFilterConfigurations
     *        The relational filger configurations included in the configuration details of the Amazon Redshift data
     *        source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftRunConfigurationOutput withRelationalFilterConfigurations(java.util.Collection<RelationalFilterConfiguration> relationalFilterConfigurations) {
        setRelationalFilterConfigurations(relationalFilterConfigurations);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getDataAccessRole() != null)
            sb.append("DataAccessRole: ").append(getDataAccessRole()).append(",");
        if (getRedshiftCredentialConfiguration() != null)
            sb.append("RedshiftCredentialConfiguration: ").append(getRedshiftCredentialConfiguration()).append(",");
        if (getRedshiftStorage() != null)
            sb.append("RedshiftStorage: ").append(getRedshiftStorage()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getRelationalFilterConfigurations() != null)
            sb.append("RelationalFilterConfigurations: ").append(getRelationalFilterConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftRunConfigurationOutput == false)
            return false;
        RedshiftRunConfigurationOutput other = (RedshiftRunConfigurationOutput) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getDataAccessRole() == null ^ this.getDataAccessRole() == null)
            return false;
        if (other.getDataAccessRole() != null && other.getDataAccessRole().equals(this.getDataAccessRole()) == false)
            return false;
        if (other.getRedshiftCredentialConfiguration() == null ^ this.getRedshiftCredentialConfiguration() == null)
            return false;
        if (other.getRedshiftCredentialConfiguration() != null
                && other.getRedshiftCredentialConfiguration().equals(this.getRedshiftCredentialConfiguration()) == false)
            return false;
        if (other.getRedshiftStorage() == null ^ this.getRedshiftStorage() == null)
            return false;
        if (other.getRedshiftStorage() != null && other.getRedshiftStorage().equals(this.getRedshiftStorage()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getRelationalFilterConfigurations() == null ^ this.getRelationalFilterConfigurations() == null)
            return false;
        if (other.getRelationalFilterConfigurations() != null
                && other.getRelationalFilterConfigurations().equals(this.getRelationalFilterConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRole() == null) ? 0 : getDataAccessRole().hashCode());
        hashCode = prime * hashCode + ((getRedshiftCredentialConfiguration() == null) ? 0 : getRedshiftCredentialConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRedshiftStorage() == null) ? 0 : getRedshiftStorage().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getRelationalFilterConfigurations() == null) ? 0 : getRelationalFilterConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftRunConfigurationOutput clone() {
        try {
            return (RedshiftRunConfigurationOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.RedshiftRunConfigurationOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
