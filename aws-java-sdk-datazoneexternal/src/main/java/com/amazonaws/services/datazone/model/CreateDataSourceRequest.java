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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The metadata forms that are to be attached to the assets that this data source works with.
     * </p>
     */
    private java.util.List<FormInput> assetFormsInput;
    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Specifies the configuration of the data source. It can be set to either <code>glueRunConfiguration</code> or
     * <code>redshiftRunConfiguration</code>.
     * </p>
     */
    private DataSourceConfigurationInput configuration;
    /**
     * <p>
     * The description of the data source.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the Amazon DataZone domain where the data source is created.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * Specifies whether the data source is enabled.
     * </p>
     */
    private String enableSetting;
    /**
     * <p>
     * The unique identifier of the Amazon DataZone environment to which the data source publishes assets.
     * </p>
     */
    private String environmentIdentifier;
    /**
     * <p>
     * The name of the data source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the Amazon DataZone project in which you want to add this data source.
     * </p>
     */
    private String projectIdentifier;
    /**
     * <p>
     * Specifies whether the assets that this data source creates in the inventory are to be also automatically
     * published to the catalog.
     * </p>
     */
    private Boolean publishOnImport;
    /**
     * <p>
     * Specifies whether the business name generation is to be enabled for this data source.
     * </p>
     */
    private RecommendationConfiguration recommendation;
    /**
     * <p>
     * The schedule of the data source runs.
     * </p>
     */
    private ScheduleConfiguration schedule;
    /**
     * <p>
     * The type of the data source.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The metadata forms that are to be attached to the assets that this data source works with.
     * </p>
     * 
     * @return The metadata forms that are to be attached to the assets that this data source works with.
     */

    public java.util.List<FormInput> getAssetFormsInput() {
        return assetFormsInput;
    }

    /**
     * <p>
     * The metadata forms that are to be attached to the assets that this data source works with.
     * </p>
     * 
     * @param assetFormsInput
     *        The metadata forms that are to be attached to the assets that this data source works with.
     */

    public void setAssetFormsInput(java.util.Collection<FormInput> assetFormsInput) {
        if (assetFormsInput == null) {
            this.assetFormsInput = null;
            return;
        }

        this.assetFormsInput = new java.util.ArrayList<FormInput>(assetFormsInput);
    }

    /**
     * <p>
     * The metadata forms that are to be attached to the assets that this data source works with.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetFormsInput(java.util.Collection)} or {@link #withAssetFormsInput(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param assetFormsInput
     *        The metadata forms that are to be attached to the assets that this data source works with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withAssetFormsInput(FormInput... assetFormsInput) {
        if (this.assetFormsInput == null) {
            setAssetFormsInput(new java.util.ArrayList<FormInput>(assetFormsInput.length));
        }
        for (FormInput ele : assetFormsInput) {
            this.assetFormsInput.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata forms that are to be attached to the assets that this data source works with.
     * </p>
     * 
     * @param assetFormsInput
     *        The metadata forms that are to be attached to the assets that this data source works with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withAssetFormsInput(java.util.Collection<FormInput> assetFormsInput) {
        setAssetFormsInput(assetFormsInput);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Specifies the configuration of the data source. It can be set to either <code>glueRunConfiguration</code> or
     * <code>redshiftRunConfiguration</code>.
     * </p>
     * 
     * @param configuration
     *        Specifies the configuration of the data source. It can be set to either <code>glueRunConfiguration</code>
     *        or <code>redshiftRunConfiguration</code>.
     */

    public void setConfiguration(DataSourceConfigurationInput configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Specifies the configuration of the data source. It can be set to either <code>glueRunConfiguration</code> or
     * <code>redshiftRunConfiguration</code>.
     * </p>
     * 
     * @return Specifies the configuration of the data source. It can be set to either <code>glueRunConfiguration</code>
     *         or <code>redshiftRunConfiguration</code>.
     */

    public DataSourceConfigurationInput getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Specifies the configuration of the data source. It can be set to either <code>glueRunConfiguration</code> or
     * <code>redshiftRunConfiguration</code>.
     * </p>
     * 
     * @param configuration
     *        Specifies the configuration of the data source. It can be set to either <code>glueRunConfiguration</code>
     *        or <code>redshiftRunConfiguration</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withConfiguration(DataSourceConfigurationInput configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The description of the data source.
     * </p>
     * 
     * @param description
     *        The description of the data source.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the data source.
     * </p>
     * 
     * @return The description of the data source.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the data source.
     * </p>
     * 
     * @param description
     *        The description of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain where the data source is created.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain where the data source is created.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain where the data source is created.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain where the data source is created.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain where the data source is created.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain where the data source is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies whether the data source is enabled.
     * </p>
     * 
     * @param enableSetting
     *        Specifies whether the data source is enabled.
     * @see EnableSetting
     */

    public void setEnableSetting(String enableSetting) {
        this.enableSetting = enableSetting;
    }

    /**
     * <p>
     * Specifies whether the data source is enabled.
     * </p>
     * 
     * @return Specifies whether the data source is enabled.
     * @see EnableSetting
     */

    public String getEnableSetting() {
        return this.enableSetting;
    }

    /**
     * <p>
     * Specifies whether the data source is enabled.
     * </p>
     * 
     * @param enableSetting
     *        Specifies whether the data source is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnableSetting
     */

    public CreateDataSourceRequest withEnableSetting(String enableSetting) {
        setEnableSetting(enableSetting);
        return this;
    }

    /**
     * <p>
     * Specifies whether the data source is enabled.
     * </p>
     * 
     * @param enableSetting
     *        Specifies whether the data source is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnableSetting
     */

    public CreateDataSourceRequest withEnableSetting(EnableSetting enableSetting) {
        this.enableSetting = enableSetting.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier of the Amazon DataZone environment to which the data source publishes assets.
     * </p>
     * 
     * @param environmentIdentifier
     *        The unique identifier of the Amazon DataZone environment to which the data source publishes assets.
     */

    public void setEnvironmentIdentifier(String environmentIdentifier) {
        this.environmentIdentifier = environmentIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the Amazon DataZone environment to which the data source publishes assets.
     * </p>
     * 
     * @return The unique identifier of the Amazon DataZone environment to which the data source publishes assets.
     */

    public String getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the Amazon DataZone environment to which the data source publishes assets.
     * </p>
     * 
     * @param environmentIdentifier
     *        The unique identifier of the Amazon DataZone environment to which the data source publishes assets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withEnvironmentIdentifier(String environmentIdentifier) {
        setEnvironmentIdentifier(environmentIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @param name
     *        The name of the data source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @return The name of the data source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @param name
     *        The name of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone project in which you want to add this data source.
     * </p>
     * 
     * @param projectIdentifier
     *        The identifier of the Amazon DataZone project in which you want to add this data source.
     */

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone project in which you want to add this data source.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone project in which you want to add this data source.
     */

    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone project in which you want to add this data source.
     * </p>
     * 
     * @param projectIdentifier
     *        The identifier of the Amazon DataZone project in which you want to add this data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withProjectIdentifier(String projectIdentifier) {
        setProjectIdentifier(projectIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies whether the assets that this data source creates in the inventory are to be also automatically
     * published to the catalog.
     * </p>
     * 
     * @param publishOnImport
     *        Specifies whether the assets that this data source creates in the inventory are to be also automatically
     *        published to the catalog.
     */

    public void setPublishOnImport(Boolean publishOnImport) {
        this.publishOnImport = publishOnImport;
    }

    /**
     * <p>
     * Specifies whether the assets that this data source creates in the inventory are to be also automatically
     * published to the catalog.
     * </p>
     * 
     * @return Specifies whether the assets that this data source creates in the inventory are to be also automatically
     *         published to the catalog.
     */

    public Boolean getPublishOnImport() {
        return this.publishOnImport;
    }

    /**
     * <p>
     * Specifies whether the assets that this data source creates in the inventory are to be also automatically
     * published to the catalog.
     * </p>
     * 
     * @param publishOnImport
     *        Specifies whether the assets that this data source creates in the inventory are to be also automatically
     *        published to the catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withPublishOnImport(Boolean publishOnImport) {
        setPublishOnImport(publishOnImport);
        return this;
    }

    /**
     * <p>
     * Specifies whether the assets that this data source creates in the inventory are to be also automatically
     * published to the catalog.
     * </p>
     * 
     * @return Specifies whether the assets that this data source creates in the inventory are to be also automatically
     *         published to the catalog.
     */

    public Boolean isPublishOnImport() {
        return this.publishOnImport;
    }

    /**
     * <p>
     * Specifies whether the business name generation is to be enabled for this data source.
     * </p>
     * 
     * @param recommendation
     *        Specifies whether the business name generation is to be enabled for this data source.
     */

    public void setRecommendation(RecommendationConfiguration recommendation) {
        this.recommendation = recommendation;
    }

    /**
     * <p>
     * Specifies whether the business name generation is to be enabled for this data source.
     * </p>
     * 
     * @return Specifies whether the business name generation is to be enabled for this data source.
     */

    public RecommendationConfiguration getRecommendation() {
        return this.recommendation;
    }

    /**
     * <p>
     * Specifies whether the business name generation is to be enabled for this data source.
     * </p>
     * 
     * @param recommendation
     *        Specifies whether the business name generation is to be enabled for this data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withRecommendation(RecommendationConfiguration recommendation) {
        setRecommendation(recommendation);
        return this;
    }

    /**
     * <p>
     * The schedule of the data source runs.
     * </p>
     * 
     * @param schedule
     *        The schedule of the data source runs.
     */

    public void setSchedule(ScheduleConfiguration schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule of the data source runs.
     * </p>
     * 
     * @return The schedule of the data source runs.
     */

    public ScheduleConfiguration getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule of the data source runs.
     * </p>
     * 
     * @param schedule
     *        The schedule of the data source runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withSchedule(ScheduleConfiguration schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * 
     * @param type
     *        The type of the data source.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * 
     * @return The type of the data source.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * 
     * @param type
     *        The type of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withType(String type) {
        setType(type);
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
        if (getAssetFormsInput() != null)
            sb.append("AssetFormsInput: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getEnableSetting() != null)
            sb.append("EnableSetting: ").append(getEnableSetting()).append(",");
        if (getEnvironmentIdentifier() != null)
            sb.append("EnvironmentIdentifier: ").append(getEnvironmentIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getProjectIdentifier() != null)
            sb.append("ProjectIdentifier: ").append(getProjectIdentifier()).append(",");
        if (getPublishOnImport() != null)
            sb.append("PublishOnImport: ").append(getPublishOnImport()).append(",");
        if (getRecommendation() != null)
            sb.append("Recommendation: ").append(getRecommendation()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append("***Sensitive Data Redacted***").append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataSourceRequest == false)
            return false;
        CreateDataSourceRequest other = (CreateDataSourceRequest) obj;
        if (other.getAssetFormsInput() == null ^ this.getAssetFormsInput() == null)
            return false;
        if (other.getAssetFormsInput() != null && other.getAssetFormsInput().equals(this.getAssetFormsInput()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getEnableSetting() == null ^ this.getEnableSetting() == null)
            return false;
        if (other.getEnableSetting() != null && other.getEnableSetting().equals(this.getEnableSetting()) == false)
            return false;
        if (other.getEnvironmentIdentifier() == null ^ this.getEnvironmentIdentifier() == null)
            return false;
        if (other.getEnvironmentIdentifier() != null && other.getEnvironmentIdentifier().equals(this.getEnvironmentIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProjectIdentifier() == null ^ this.getProjectIdentifier() == null)
            return false;
        if (other.getProjectIdentifier() != null && other.getProjectIdentifier().equals(this.getProjectIdentifier()) == false)
            return false;
        if (other.getPublishOnImport() == null ^ this.getPublishOnImport() == null)
            return false;
        if (other.getPublishOnImport() != null && other.getPublishOnImport().equals(this.getPublishOnImport()) == false)
            return false;
        if (other.getRecommendation() == null ^ this.getRecommendation() == null)
            return false;
        if (other.getRecommendation() != null && other.getRecommendation().equals(this.getRecommendation()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetFormsInput() == null) ? 0 : getAssetFormsInput().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnableSetting() == null) ? 0 : getEnableSetting().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentIdentifier() == null) ? 0 : getEnvironmentIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProjectIdentifier() == null) ? 0 : getProjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPublishOnImport() == null) ? 0 : getPublishOnImport().hashCode());
        hashCode = prime * hashCode + ((getRecommendation() == null) ? 0 : getRecommendation().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataSourceRequest clone() {
        return (CreateDataSourceRequest) super.clone();
    }

}
