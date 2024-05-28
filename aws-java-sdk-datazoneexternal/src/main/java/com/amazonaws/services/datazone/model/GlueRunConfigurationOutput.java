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
 * The configuration details of the Amazon Web Services Glue data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GlueRunConfigurationOutput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlueRunConfigurationOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID included in the configuration details of the Amazon Web Services Glue data
     * source.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Specifies whether to automatically import data quality metrics as part of the data source run.
     * </p>
     */
    private Boolean autoImportDataQualityResult;
    /**
     * <p>
     * The data access role included in the configuration details of the Amazon Web Services Glue data source.
     * </p>
     */
    private String dataAccessRole;
    /**
     * <p>
     * The Amazon Web Services region included in the configuration details of the Amazon Web Services Glue data source.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The relational filter configurations included in the configuration details of the Amazon Web Services Glue data
     * source.
     * </p>
     */
    private java.util.List<RelationalFilterConfiguration> relationalFilterConfigurations;

    /**
     * <p>
     * The Amazon Web Services account ID included in the configuration details of the Amazon Web Services Glue data
     * source.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID included in the configuration details of the Amazon Web Services Glue
     *        data source.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID included in the configuration details of the Amazon Web Services Glue data
     * source.
     * </p>
     * 
     * @return The Amazon Web Services account ID included in the configuration details of the Amazon Web Services Glue
     *         data source.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID included in the configuration details of the Amazon Web Services Glue data
     * source.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID included in the configuration details of the Amazon Web Services Glue
     *        data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueRunConfigurationOutput withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Specifies whether to automatically import data quality metrics as part of the data source run.
     * </p>
     * 
     * @param autoImportDataQualityResult
     *        Specifies whether to automatically import data quality metrics as part of the data source run.
     */

    public void setAutoImportDataQualityResult(Boolean autoImportDataQualityResult) {
        this.autoImportDataQualityResult = autoImportDataQualityResult;
    }

    /**
     * <p>
     * Specifies whether to automatically import data quality metrics as part of the data source run.
     * </p>
     * 
     * @return Specifies whether to automatically import data quality metrics as part of the data source run.
     */

    public Boolean getAutoImportDataQualityResult() {
        return this.autoImportDataQualityResult;
    }

    /**
     * <p>
     * Specifies whether to automatically import data quality metrics as part of the data source run.
     * </p>
     * 
     * @param autoImportDataQualityResult
     *        Specifies whether to automatically import data quality metrics as part of the data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueRunConfigurationOutput withAutoImportDataQualityResult(Boolean autoImportDataQualityResult) {
        setAutoImportDataQualityResult(autoImportDataQualityResult);
        return this;
    }

    /**
     * <p>
     * Specifies whether to automatically import data quality metrics as part of the data source run.
     * </p>
     * 
     * @return Specifies whether to automatically import data quality metrics as part of the data source run.
     */

    public Boolean isAutoImportDataQualityResult() {
        return this.autoImportDataQualityResult;
    }

    /**
     * <p>
     * The data access role included in the configuration details of the Amazon Web Services Glue data source.
     * </p>
     * 
     * @param dataAccessRole
     *        The data access role included in the configuration details of the Amazon Web Services Glue data source.
     */

    public void setDataAccessRole(String dataAccessRole) {
        this.dataAccessRole = dataAccessRole;
    }

    /**
     * <p>
     * The data access role included in the configuration details of the Amazon Web Services Glue data source.
     * </p>
     * 
     * @return The data access role included in the configuration details of the Amazon Web Services Glue data source.
     */

    public String getDataAccessRole() {
        return this.dataAccessRole;
    }

    /**
     * <p>
     * The data access role included in the configuration details of the Amazon Web Services Glue data source.
     * </p>
     * 
     * @param dataAccessRole
     *        The data access role included in the configuration details of the Amazon Web Services Glue data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueRunConfigurationOutput withDataAccessRole(String dataAccessRole) {
        setDataAccessRole(dataAccessRole);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services region included in the configuration details of the Amazon Web Services Glue data source.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services region included in the configuration details of the Amazon Web Services Glue data
     *        source.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services region included in the configuration details of the Amazon Web Services Glue data source.
     * </p>
     * 
     * @return The Amazon Web Services region included in the configuration details of the Amazon Web Services Glue data
     *         source.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services region included in the configuration details of the Amazon Web Services Glue data source.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services region included in the configuration details of the Amazon Web Services Glue data
     *        source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueRunConfigurationOutput withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The relational filter configurations included in the configuration details of the Amazon Web Services Glue data
     * source.
     * </p>
     * 
     * @return The relational filter configurations included in the configuration details of the Amazon Web Services
     *         Glue data source.
     */

    public java.util.List<RelationalFilterConfiguration> getRelationalFilterConfigurations() {
        return relationalFilterConfigurations;
    }

    /**
     * <p>
     * The relational filter configurations included in the configuration details of the Amazon Web Services Glue data
     * source.
     * </p>
     * 
     * @param relationalFilterConfigurations
     *        The relational filter configurations included in the configuration details of the Amazon Web Services Glue
     *        data source.
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
     * The relational filter configurations included in the configuration details of the Amazon Web Services Glue data
     * source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelationalFilterConfigurations(java.util.Collection)} or
     * {@link #withRelationalFilterConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param relationalFilterConfigurations
     *        The relational filter configurations included in the configuration details of the Amazon Web Services Glue
     *        data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueRunConfigurationOutput withRelationalFilterConfigurations(RelationalFilterConfiguration... relationalFilterConfigurations) {
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
     * The relational filter configurations included in the configuration details of the Amazon Web Services Glue data
     * source.
     * </p>
     * 
     * @param relationalFilterConfigurations
     *        The relational filter configurations included in the configuration details of the Amazon Web Services Glue
     *        data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueRunConfigurationOutput withRelationalFilterConfigurations(java.util.Collection<RelationalFilterConfiguration> relationalFilterConfigurations) {
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
        if (getAutoImportDataQualityResult() != null)
            sb.append("AutoImportDataQualityResult: ").append(getAutoImportDataQualityResult()).append(",");
        if (getDataAccessRole() != null)
            sb.append("DataAccessRole: ").append(getDataAccessRole()).append(",");
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

        if (obj instanceof GlueRunConfigurationOutput == false)
            return false;
        GlueRunConfigurationOutput other = (GlueRunConfigurationOutput) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getAutoImportDataQualityResult() == null ^ this.getAutoImportDataQualityResult() == null)
            return false;
        if (other.getAutoImportDataQualityResult() != null && other.getAutoImportDataQualityResult().equals(this.getAutoImportDataQualityResult()) == false)
            return false;
        if (other.getDataAccessRole() == null ^ this.getDataAccessRole() == null)
            return false;
        if (other.getDataAccessRole() != null && other.getDataAccessRole().equals(this.getDataAccessRole()) == false)
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
        hashCode = prime * hashCode + ((getAutoImportDataQualityResult() == null) ? 0 : getAutoImportDataQualityResult().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRole() == null) ? 0 : getDataAccessRole().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getRelationalFilterConfigurations() == null) ? 0 : getRelationalFilterConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public GlueRunConfigurationOutput clone() {
        try {
            return (GlueRunConfigurationOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.GlueRunConfigurationOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
