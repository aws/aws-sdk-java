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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/UpdateApplicationComponentConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationComponentConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of known component.
     * </p>
     */
    private String appType;
    /**
     * <p>
     * The ID of the application component. The ID is unique within an AWS account.
     * </p>
     */
    private String applicationComponentId;
    /**
     * <p>
     * Update the configuration request of an application component. If it is set to true, the source code and/or
     * database credentials are updated. If it is set to false, the source code and/or database credentials are updated
     * and an analysis is initiated.
     * </p>
     */
    private Boolean configureOnly;
    /**
     * <p>
     * Indicates whether the application component has been included for server recommendation or not.
     * </p>
     */
    private String inclusionStatus;
    /**
     * <p>
     * Database credentials.
     * </p>
     */
    private String secretsManagerKey;
    /**
     * <p>
     * The list of source code configurations to update for the application component.
     * </p>
     */
    private java.util.List<SourceCode> sourceCodeList;
    /**
     * <p>
     * The preferred strategy options for the application component. Use values from the
     * <a>GetApplicationComponentStrategies</a> response.
     * </p>
     */
    private StrategyOption strategyOption;

    /**
     * <p>
     * The type of known component.
     * </p>
     * 
     * @param appType
     *        The type of known component.
     * @see AppType
     */

    public void setAppType(String appType) {
        this.appType = appType;
    }

    /**
     * <p>
     * The type of known component.
     * </p>
     * 
     * @return The type of known component.
     * @see AppType
     */

    public String getAppType() {
        return this.appType;
    }

    /**
     * <p>
     * The type of known component.
     * </p>
     * 
     * @param appType
     *        The type of known component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppType
     */

    public UpdateApplicationComponentConfigRequest withAppType(String appType) {
        setAppType(appType);
        return this;
    }

    /**
     * <p>
     * The type of known component.
     * </p>
     * 
     * @param appType
     *        The type of known component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppType
     */

    public UpdateApplicationComponentConfigRequest withAppType(AppType appType) {
        this.appType = appType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the application component. The ID is unique within an AWS account.
     * </p>
     * 
     * @param applicationComponentId
     *        The ID of the application component. The ID is unique within an AWS account.
     */

    public void setApplicationComponentId(String applicationComponentId) {
        this.applicationComponentId = applicationComponentId;
    }

    /**
     * <p>
     * The ID of the application component. The ID is unique within an AWS account.
     * </p>
     * 
     * @return The ID of the application component. The ID is unique within an AWS account.
     */

    public String getApplicationComponentId() {
        return this.applicationComponentId;
    }

    /**
     * <p>
     * The ID of the application component. The ID is unique within an AWS account.
     * </p>
     * 
     * @param applicationComponentId
     *        The ID of the application component. The ID is unique within an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationComponentConfigRequest withApplicationComponentId(String applicationComponentId) {
        setApplicationComponentId(applicationComponentId);
        return this;
    }

    /**
     * <p>
     * Update the configuration request of an application component. If it is set to true, the source code and/or
     * database credentials are updated. If it is set to false, the source code and/or database credentials are updated
     * and an analysis is initiated.
     * </p>
     * 
     * @param configureOnly
     *        Update the configuration request of an application component. If it is set to true, the source code and/or
     *        database credentials are updated. If it is set to false, the source code and/or database credentials are
     *        updated and an analysis is initiated.
     */

    public void setConfigureOnly(Boolean configureOnly) {
        this.configureOnly = configureOnly;
    }

    /**
     * <p>
     * Update the configuration request of an application component. If it is set to true, the source code and/or
     * database credentials are updated. If it is set to false, the source code and/or database credentials are updated
     * and an analysis is initiated.
     * </p>
     * 
     * @return Update the configuration request of an application component. If it is set to true, the source code
     *         and/or database credentials are updated. If it is set to false, the source code and/or database
     *         credentials are updated and an analysis is initiated.
     */

    public Boolean getConfigureOnly() {
        return this.configureOnly;
    }

    /**
     * <p>
     * Update the configuration request of an application component. If it is set to true, the source code and/or
     * database credentials are updated. If it is set to false, the source code and/or database credentials are updated
     * and an analysis is initiated.
     * </p>
     * 
     * @param configureOnly
     *        Update the configuration request of an application component. If it is set to true, the source code and/or
     *        database credentials are updated. If it is set to false, the source code and/or database credentials are
     *        updated and an analysis is initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationComponentConfigRequest withConfigureOnly(Boolean configureOnly) {
        setConfigureOnly(configureOnly);
        return this;
    }

    /**
     * <p>
     * Update the configuration request of an application component. If it is set to true, the source code and/or
     * database credentials are updated. If it is set to false, the source code and/or database credentials are updated
     * and an analysis is initiated.
     * </p>
     * 
     * @return Update the configuration request of an application component. If it is set to true, the source code
     *         and/or database credentials are updated. If it is set to false, the source code and/or database
     *         credentials are updated and an analysis is initiated.
     */

    public Boolean isConfigureOnly() {
        return this.configureOnly;
    }

    /**
     * <p>
     * Indicates whether the application component has been included for server recommendation or not.
     * </p>
     * 
     * @param inclusionStatus
     *        Indicates whether the application component has been included for server recommendation or not.
     * @see InclusionStatus
     */

    public void setInclusionStatus(String inclusionStatus) {
        this.inclusionStatus = inclusionStatus;
    }

    /**
     * <p>
     * Indicates whether the application component has been included for server recommendation or not.
     * </p>
     * 
     * @return Indicates whether the application component has been included for server recommendation or not.
     * @see InclusionStatus
     */

    public String getInclusionStatus() {
        return this.inclusionStatus;
    }

    /**
     * <p>
     * Indicates whether the application component has been included for server recommendation or not.
     * </p>
     * 
     * @param inclusionStatus
     *        Indicates whether the application component has been included for server recommendation or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InclusionStatus
     */

    public UpdateApplicationComponentConfigRequest withInclusionStatus(String inclusionStatus) {
        setInclusionStatus(inclusionStatus);
        return this;
    }

    /**
     * <p>
     * Indicates whether the application component has been included for server recommendation or not.
     * </p>
     * 
     * @param inclusionStatus
     *        Indicates whether the application component has been included for server recommendation or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InclusionStatus
     */

    public UpdateApplicationComponentConfigRequest withInclusionStatus(InclusionStatus inclusionStatus) {
        this.inclusionStatus = inclusionStatus.toString();
        return this;
    }

    /**
     * <p>
     * Database credentials.
     * </p>
     * 
     * @param secretsManagerKey
     *        Database credentials.
     */

    public void setSecretsManagerKey(String secretsManagerKey) {
        this.secretsManagerKey = secretsManagerKey;
    }

    /**
     * <p>
     * Database credentials.
     * </p>
     * 
     * @return Database credentials.
     */

    public String getSecretsManagerKey() {
        return this.secretsManagerKey;
    }

    /**
     * <p>
     * Database credentials.
     * </p>
     * 
     * @param secretsManagerKey
     *        Database credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationComponentConfigRequest withSecretsManagerKey(String secretsManagerKey) {
        setSecretsManagerKey(secretsManagerKey);
        return this;
    }

    /**
     * <p>
     * The list of source code configurations to update for the application component.
     * </p>
     * 
     * @return The list of source code configurations to update for the application component.
     */

    public java.util.List<SourceCode> getSourceCodeList() {
        return sourceCodeList;
    }

    /**
     * <p>
     * The list of source code configurations to update for the application component.
     * </p>
     * 
     * @param sourceCodeList
     *        The list of source code configurations to update for the application component.
     */

    public void setSourceCodeList(java.util.Collection<SourceCode> sourceCodeList) {
        if (sourceCodeList == null) {
            this.sourceCodeList = null;
            return;
        }

        this.sourceCodeList = new java.util.ArrayList<SourceCode>(sourceCodeList);
    }

    /**
     * <p>
     * The list of source code configurations to update for the application component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceCodeList(java.util.Collection)} or {@link #withSourceCodeList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sourceCodeList
     *        The list of source code configurations to update for the application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationComponentConfigRequest withSourceCodeList(SourceCode... sourceCodeList) {
        if (this.sourceCodeList == null) {
            setSourceCodeList(new java.util.ArrayList<SourceCode>(sourceCodeList.length));
        }
        for (SourceCode ele : sourceCodeList) {
            this.sourceCodeList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of source code configurations to update for the application component.
     * </p>
     * 
     * @param sourceCodeList
     *        The list of source code configurations to update for the application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationComponentConfigRequest withSourceCodeList(java.util.Collection<SourceCode> sourceCodeList) {
        setSourceCodeList(sourceCodeList);
        return this;
    }

    /**
     * <p>
     * The preferred strategy options for the application component. Use values from the
     * <a>GetApplicationComponentStrategies</a> response.
     * </p>
     * 
     * @param strategyOption
     *        The preferred strategy options for the application component. Use values from the
     *        <a>GetApplicationComponentStrategies</a> response.
     */

    public void setStrategyOption(StrategyOption strategyOption) {
        this.strategyOption = strategyOption;
    }

    /**
     * <p>
     * The preferred strategy options for the application component. Use values from the
     * <a>GetApplicationComponentStrategies</a> response.
     * </p>
     * 
     * @return The preferred strategy options for the application component. Use values from the
     *         <a>GetApplicationComponentStrategies</a> response.
     */

    public StrategyOption getStrategyOption() {
        return this.strategyOption;
    }

    /**
     * <p>
     * The preferred strategy options for the application component. Use values from the
     * <a>GetApplicationComponentStrategies</a> response.
     * </p>
     * 
     * @param strategyOption
     *        The preferred strategy options for the application component. Use values from the
     *        <a>GetApplicationComponentStrategies</a> response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationComponentConfigRequest withStrategyOption(StrategyOption strategyOption) {
        setStrategyOption(strategyOption);
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
        if (getAppType() != null)
            sb.append("AppType: ").append(getAppType()).append(",");
        if (getApplicationComponentId() != null)
            sb.append("ApplicationComponentId: ").append(getApplicationComponentId()).append(",");
        if (getConfigureOnly() != null)
            sb.append("ConfigureOnly: ").append(getConfigureOnly()).append(",");
        if (getInclusionStatus() != null)
            sb.append("InclusionStatus: ").append(getInclusionStatus()).append(",");
        if (getSecretsManagerKey() != null)
            sb.append("SecretsManagerKey: ").append("***Sensitive Data Redacted***").append(",");
        if (getSourceCodeList() != null)
            sb.append("SourceCodeList: ").append(getSourceCodeList()).append(",");
        if (getStrategyOption() != null)
            sb.append("StrategyOption: ").append(getStrategyOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationComponentConfigRequest == false)
            return false;
        UpdateApplicationComponentConfigRequest other = (UpdateApplicationComponentConfigRequest) obj;
        if (other.getAppType() == null ^ this.getAppType() == null)
            return false;
        if (other.getAppType() != null && other.getAppType().equals(this.getAppType()) == false)
            return false;
        if (other.getApplicationComponentId() == null ^ this.getApplicationComponentId() == null)
            return false;
        if (other.getApplicationComponentId() != null && other.getApplicationComponentId().equals(this.getApplicationComponentId()) == false)
            return false;
        if (other.getConfigureOnly() == null ^ this.getConfigureOnly() == null)
            return false;
        if (other.getConfigureOnly() != null && other.getConfigureOnly().equals(this.getConfigureOnly()) == false)
            return false;
        if (other.getInclusionStatus() == null ^ this.getInclusionStatus() == null)
            return false;
        if (other.getInclusionStatus() != null && other.getInclusionStatus().equals(this.getInclusionStatus()) == false)
            return false;
        if (other.getSecretsManagerKey() == null ^ this.getSecretsManagerKey() == null)
            return false;
        if (other.getSecretsManagerKey() != null && other.getSecretsManagerKey().equals(this.getSecretsManagerKey()) == false)
            return false;
        if (other.getSourceCodeList() == null ^ this.getSourceCodeList() == null)
            return false;
        if (other.getSourceCodeList() != null && other.getSourceCodeList().equals(this.getSourceCodeList()) == false)
            return false;
        if (other.getStrategyOption() == null ^ this.getStrategyOption() == null)
            return false;
        if (other.getStrategyOption() != null && other.getStrategyOption().equals(this.getStrategyOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppType() == null) ? 0 : getAppType().hashCode());
        hashCode = prime * hashCode + ((getApplicationComponentId() == null) ? 0 : getApplicationComponentId().hashCode());
        hashCode = prime * hashCode + ((getConfigureOnly() == null) ? 0 : getConfigureOnly().hashCode());
        hashCode = prime * hashCode + ((getInclusionStatus() == null) ? 0 : getInclusionStatus().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerKey() == null) ? 0 : getSecretsManagerKey().hashCode());
        hashCode = prime * hashCode + ((getSourceCodeList() == null) ? 0 : getSourceCodeList().hashCode());
        hashCode = prime * hashCode + ((getStrategyOption() == null) ? 0 : getStrategyOption().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationComponentConfigRequest clone() {
        return (UpdateApplicationComponentConfigRequest) super.clone();
    }

}
