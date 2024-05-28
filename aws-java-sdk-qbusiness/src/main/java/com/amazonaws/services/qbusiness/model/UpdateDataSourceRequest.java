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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDataSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q Business application the data source is attached to.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of the index attached to the data source connector.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The identifier of the data source connector.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * A name of the data source connector.
     * </p>
     */
    private String displayName;

    private DataSourceVpcConfiguration vpcConfiguration;
    /**
     * <p>
     * The description of the data source connector.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The chosen update frequency for your data source.
     * </p>
     */
    private String syncSchedule;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to access the data source and required resources.
     * </p>
     */
    private String roleArn;

    private DocumentEnrichmentConfiguration documentEnrichmentConfiguration;

    /**
     * <p>
     * The identifier of the Amazon Q Business application the data source is attached to.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application the data source is attached to.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application the data source is attached to.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business application the data source is attached to.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application the data source is attached to.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application the data source is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the index attached to the data source connector.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index attached to the data source connector.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index attached to the data source connector.
     * </p>
     * 
     * @return The identifier of the index attached to the data source connector.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index attached to the data source connector.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index attached to the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The identifier of the data source connector.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source connector.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source connector.
     * </p>
     * 
     * @return The identifier of the data source connector.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source connector.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * A name of the data source connector.
     * </p>
     * 
     * @param displayName
     *        A name of the data source connector.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * A name of the data source connector.
     * </p>
     * 
     * @return A name of the data source connector.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * A name of the data source connector.
     * </p>
     * 
     * @param displayName
     *        A name of the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * @param vpcConfiguration
     */

    public void setVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * @return
     */

    public DataSourceVpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * @param vpcConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
        return this;
    }

    /**
     * <p>
     * The description of the data source connector.
     * </p>
     * 
     * @param description
     *        The description of the data source connector.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the data source connector.
     * </p>
     * 
     * @return The description of the data source connector.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the data source connector.
     * </p>
     * 
     * @param description
     *        The description of the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The chosen update frequency for your data source.
     * </p>
     * 
     * @param syncSchedule
     *        The chosen update frequency for your data source.
     */

    public void setSyncSchedule(String syncSchedule) {
        this.syncSchedule = syncSchedule;
    }

    /**
     * <p>
     * The chosen update frequency for your data source.
     * </p>
     * 
     * @return The chosen update frequency for your data source.
     */

    public String getSyncSchedule() {
        return this.syncSchedule;
    }

    /**
     * <p>
     * The chosen update frequency for your data source.
     * </p>
     * 
     * @param syncSchedule
     *        The chosen update frequency for your data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withSyncSchedule(String syncSchedule) {
        setSyncSchedule(syncSchedule);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to access the data source and required resources.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role with permission to access the data source and required
     *        resources.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to access the data source and required resources.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role with permission to access the data source and required
     *         resources.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to access the data source and required resources.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role with permission to access the data source and required
     *        resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * @param documentEnrichmentConfiguration
     */

    public void setDocumentEnrichmentConfiguration(DocumentEnrichmentConfiguration documentEnrichmentConfiguration) {
        this.documentEnrichmentConfiguration = documentEnrichmentConfiguration;
    }

    /**
     * @return
     */

    public DocumentEnrichmentConfiguration getDocumentEnrichmentConfiguration() {
        return this.documentEnrichmentConfiguration;
    }

    /**
     * @param documentEnrichmentConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withDocumentEnrichmentConfiguration(DocumentEnrichmentConfiguration documentEnrichmentConfiguration) {
        setDocumentEnrichmentConfiguration(documentEnrichmentConfiguration);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSyncSchedule() != null)
            sb.append("SyncSchedule: ").append(getSyncSchedule()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getDocumentEnrichmentConfiguration() != null)
            sb.append("DocumentEnrichmentConfiguration: ").append(getDocumentEnrichmentConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDataSourceRequest == false)
            return false;
        UpdateDataSourceRequest other = (UpdateDataSourceRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSyncSchedule() == null ^ this.getSyncSchedule() == null)
            return false;
        if (other.getSyncSchedule() != null && other.getSyncSchedule().equals(this.getSyncSchedule()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDocumentEnrichmentConfiguration() == null ^ this.getDocumentEnrichmentConfiguration() == null)
            return false;
        if (other.getDocumentEnrichmentConfiguration() != null
                && other.getDocumentEnrichmentConfiguration().equals(this.getDocumentEnrichmentConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSyncSchedule() == null) ? 0 : getSyncSchedule().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDocumentEnrichmentConfiguration() == null) ? 0 : getDocumentEnrichmentConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDataSourceRequest clone() {
        return (UpdateDataSourceRequest) super.clone();
    }

}
