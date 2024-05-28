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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration details of a campaign.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CampaignConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CampaignConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the exploration configuration hyperparameters, including <code>explorationWeight</code> and
     * <code>explorationItemAgeCutOff</code>, you want to use to configure the amount of item exploration Amazon
     * Personalize uses when recommending items. Provide <code>itemExplorationConfig</code> data only if your solution
     * uses the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html"
     * >User-Personalization</a> recipe.
     * </p>
     */
    private java.util.Map<String, String> itemExplorationConfig;
    /**
     * <p>
     * Whether metadata with recommendations is enabled for the campaign. If enabled, you can specify the columns from
     * your Items dataset in your request for recommendations. Amazon Personalize returns this data for each item in the
     * recommendation response. For information about enabling metadata for a campaign, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-return-metadata">Enabling
     * metadata in recommendations for a campaign</a>.
     * </p>
     * <p>
     * If you enable metadata in recommendations, you will incur additional costs. For more information, see <a
     * href="https://aws.amazon.com/personalize/pricing/">Amazon Personalize pricing</a>.
     * </p>
     */
    private Boolean enableMetadataWithRecommendations;
    /**
     * <p>
     * Whether the campaign automatically updates to use the latest solution version (trained model) of a solution. If
     * you specify <code>True</code>, you must specify the ARN of your <i>solution</i> for the
     * <code>SolutionVersionArn</code> parameter. It must be in <code>SolutionArn/$LATEST</code> format. The default is
     * <code>False</code> and you must manually update the campaign to deploy the latest solution version.
     * </p>
     * <p>
     * For more information about automatic campaign updates, see <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-automatic-latest-sv-update"
     * >Enabling automatic campaign updates</a>.
     * </p>
     */
    private Boolean syncWithLatestSolutionVersion;

    /**
     * <p>
     * Specifies the exploration configuration hyperparameters, including <code>explorationWeight</code> and
     * <code>explorationItemAgeCutOff</code>, you want to use to configure the amount of item exploration Amazon
     * Personalize uses when recommending items. Provide <code>itemExplorationConfig</code> data only if your solution
     * uses the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html"
     * >User-Personalization</a> recipe.
     * </p>
     * 
     * @return Specifies the exploration configuration hyperparameters, including <code>explorationWeight</code> and
     *         <code>explorationItemAgeCutOff</code>, you want to use to configure the amount of item exploration Amazon
     *         Personalize uses when recommending items. Provide <code>itemExplorationConfig</code> data only if your
     *         solution uses the <a href=
     *         "https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html"
     *         >User-Personalization</a> recipe.
     */

    public java.util.Map<String, String> getItemExplorationConfig() {
        return itemExplorationConfig;
    }

    /**
     * <p>
     * Specifies the exploration configuration hyperparameters, including <code>explorationWeight</code> and
     * <code>explorationItemAgeCutOff</code>, you want to use to configure the amount of item exploration Amazon
     * Personalize uses when recommending items. Provide <code>itemExplorationConfig</code> data only if your solution
     * uses the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html"
     * >User-Personalization</a> recipe.
     * </p>
     * 
     * @param itemExplorationConfig
     *        Specifies the exploration configuration hyperparameters, including <code>explorationWeight</code> and
     *        <code>explorationItemAgeCutOff</code>, you want to use to configure the amount of item exploration Amazon
     *        Personalize uses when recommending items. Provide <code>itemExplorationConfig</code> data only if your
     *        solution uses the <a href=
     *        "https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html"
     *        >User-Personalization</a> recipe.
     */

    public void setItemExplorationConfig(java.util.Map<String, String> itemExplorationConfig) {
        this.itemExplorationConfig = itemExplorationConfig;
    }

    /**
     * <p>
     * Specifies the exploration configuration hyperparameters, including <code>explorationWeight</code> and
     * <code>explorationItemAgeCutOff</code>, you want to use to configure the amount of item exploration Amazon
     * Personalize uses when recommending items. Provide <code>itemExplorationConfig</code> data only if your solution
     * uses the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html"
     * >User-Personalization</a> recipe.
     * </p>
     * 
     * @param itemExplorationConfig
     *        Specifies the exploration configuration hyperparameters, including <code>explorationWeight</code> and
     *        <code>explorationItemAgeCutOff</code>, you want to use to configure the amount of item exploration Amazon
     *        Personalize uses when recommending items. Provide <code>itemExplorationConfig</code> data only if your
     *        solution uses the <a href=
     *        "https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html"
     *        >User-Personalization</a> recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignConfig withItemExplorationConfig(java.util.Map<String, String> itemExplorationConfig) {
        setItemExplorationConfig(itemExplorationConfig);
        return this;
    }

    /**
     * Add a single ItemExplorationConfig entry
     *
     * @see CampaignConfig#withItemExplorationConfig
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CampaignConfig addItemExplorationConfigEntry(String key, String value) {
        if (null == this.itemExplorationConfig) {
            this.itemExplorationConfig = new java.util.HashMap<String, String>();
        }
        if (this.itemExplorationConfig.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.itemExplorationConfig.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ItemExplorationConfig.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignConfig clearItemExplorationConfigEntries() {
        this.itemExplorationConfig = null;
        return this;
    }

    /**
     * <p>
     * Whether metadata with recommendations is enabled for the campaign. If enabled, you can specify the columns from
     * your Items dataset in your request for recommendations. Amazon Personalize returns this data for each item in the
     * recommendation response. For information about enabling metadata for a campaign, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-return-metadata">Enabling
     * metadata in recommendations for a campaign</a>.
     * </p>
     * <p>
     * If you enable metadata in recommendations, you will incur additional costs. For more information, see <a
     * href="https://aws.amazon.com/personalize/pricing/">Amazon Personalize pricing</a>.
     * </p>
     * 
     * @param enableMetadataWithRecommendations
     *        Whether metadata with recommendations is enabled for the campaign. If enabled, you can specify the columns
     *        from your Items dataset in your request for recommendations. Amazon Personalize returns this data for each
     *        item in the recommendation response. For information about enabling metadata for a campaign, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-return-metadata"
     *        >Enabling metadata in recommendations for a campaign</a>.</p>
     *        <p>
     *        If you enable metadata in recommendations, you will incur additional costs. For more information, see <a
     *        href="https://aws.amazon.com/personalize/pricing/">Amazon Personalize pricing</a>.
     */

    public void setEnableMetadataWithRecommendations(Boolean enableMetadataWithRecommendations) {
        this.enableMetadataWithRecommendations = enableMetadataWithRecommendations;
    }

    /**
     * <p>
     * Whether metadata with recommendations is enabled for the campaign. If enabled, you can specify the columns from
     * your Items dataset in your request for recommendations. Amazon Personalize returns this data for each item in the
     * recommendation response. For information about enabling metadata for a campaign, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-return-metadata">Enabling
     * metadata in recommendations for a campaign</a>.
     * </p>
     * <p>
     * If you enable metadata in recommendations, you will incur additional costs. For more information, see <a
     * href="https://aws.amazon.com/personalize/pricing/">Amazon Personalize pricing</a>.
     * </p>
     * 
     * @return Whether metadata with recommendations is enabled for the campaign. If enabled, you can specify the
     *         columns from your Items dataset in your request for recommendations. Amazon Personalize returns this data
     *         for each item in the recommendation response. For information about enabling metadata for a campaign, see
     *         <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-return-metadata"
     *         >Enabling metadata in recommendations for a campaign</a>.</p>
     *         <p>
     *         If you enable metadata in recommendations, you will incur additional costs. For more information, see <a
     *         href="https://aws.amazon.com/personalize/pricing/">Amazon Personalize pricing</a>.
     */

    public Boolean getEnableMetadataWithRecommendations() {
        return this.enableMetadataWithRecommendations;
    }

    /**
     * <p>
     * Whether metadata with recommendations is enabled for the campaign. If enabled, you can specify the columns from
     * your Items dataset in your request for recommendations. Amazon Personalize returns this data for each item in the
     * recommendation response. For information about enabling metadata for a campaign, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-return-metadata">Enabling
     * metadata in recommendations for a campaign</a>.
     * </p>
     * <p>
     * If you enable metadata in recommendations, you will incur additional costs. For more information, see <a
     * href="https://aws.amazon.com/personalize/pricing/">Amazon Personalize pricing</a>.
     * </p>
     * 
     * @param enableMetadataWithRecommendations
     *        Whether metadata with recommendations is enabled for the campaign. If enabled, you can specify the columns
     *        from your Items dataset in your request for recommendations. Amazon Personalize returns this data for each
     *        item in the recommendation response. For information about enabling metadata for a campaign, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-return-metadata"
     *        >Enabling metadata in recommendations for a campaign</a>.</p>
     *        <p>
     *        If you enable metadata in recommendations, you will incur additional costs. For more information, see <a
     *        href="https://aws.amazon.com/personalize/pricing/">Amazon Personalize pricing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignConfig withEnableMetadataWithRecommendations(Boolean enableMetadataWithRecommendations) {
        setEnableMetadataWithRecommendations(enableMetadataWithRecommendations);
        return this;
    }

    /**
     * <p>
     * Whether metadata with recommendations is enabled for the campaign. If enabled, you can specify the columns from
     * your Items dataset in your request for recommendations. Amazon Personalize returns this data for each item in the
     * recommendation response. For information about enabling metadata for a campaign, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-return-metadata">Enabling
     * metadata in recommendations for a campaign</a>.
     * </p>
     * <p>
     * If you enable metadata in recommendations, you will incur additional costs. For more information, see <a
     * href="https://aws.amazon.com/personalize/pricing/">Amazon Personalize pricing</a>.
     * </p>
     * 
     * @return Whether metadata with recommendations is enabled for the campaign. If enabled, you can specify the
     *         columns from your Items dataset in your request for recommendations. Amazon Personalize returns this data
     *         for each item in the recommendation response. For information about enabling metadata for a campaign, see
     *         <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-return-metadata"
     *         >Enabling metadata in recommendations for a campaign</a>.</p>
     *         <p>
     *         If you enable metadata in recommendations, you will incur additional costs. For more information, see <a
     *         href="https://aws.amazon.com/personalize/pricing/">Amazon Personalize pricing</a>.
     */

    public Boolean isEnableMetadataWithRecommendations() {
        return this.enableMetadataWithRecommendations;
    }

    /**
     * <p>
     * Whether the campaign automatically updates to use the latest solution version (trained model) of a solution. If
     * you specify <code>True</code>, you must specify the ARN of your <i>solution</i> for the
     * <code>SolutionVersionArn</code> parameter. It must be in <code>SolutionArn/$LATEST</code> format. The default is
     * <code>False</code> and you must manually update the campaign to deploy the latest solution version.
     * </p>
     * <p>
     * For more information about automatic campaign updates, see <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-automatic-latest-sv-update"
     * >Enabling automatic campaign updates</a>.
     * </p>
     * 
     * @param syncWithLatestSolutionVersion
     *        Whether the campaign automatically updates to use the latest solution version (trained model) of a
     *        solution. If you specify <code>True</code>, you must specify the ARN of your <i>solution</i> for the
     *        <code>SolutionVersionArn</code> parameter. It must be in <code>SolutionArn/$LATEST</code> format. The
     *        default is <code>False</code> and you must manually update the campaign to deploy the latest solution
     *        version. </p>
     *        <p>
     *        For more information about automatic campaign updates, see <a href=
     *        "https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-automatic-latest-sv-update"
     *        >Enabling automatic campaign updates</a>.
     */

    public void setSyncWithLatestSolutionVersion(Boolean syncWithLatestSolutionVersion) {
        this.syncWithLatestSolutionVersion = syncWithLatestSolutionVersion;
    }

    /**
     * <p>
     * Whether the campaign automatically updates to use the latest solution version (trained model) of a solution. If
     * you specify <code>True</code>, you must specify the ARN of your <i>solution</i> for the
     * <code>SolutionVersionArn</code> parameter. It must be in <code>SolutionArn/$LATEST</code> format. The default is
     * <code>False</code> and you must manually update the campaign to deploy the latest solution version.
     * </p>
     * <p>
     * For more information about automatic campaign updates, see <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-automatic-latest-sv-update"
     * >Enabling automatic campaign updates</a>.
     * </p>
     * 
     * @return Whether the campaign automatically updates to use the latest solution version (trained model) of a
     *         solution. If you specify <code>True</code>, you must specify the ARN of your <i>solution</i> for the
     *         <code>SolutionVersionArn</code> parameter. It must be in <code>SolutionArn/$LATEST</code> format. The
     *         default is <code>False</code> and you must manually update the campaign to deploy the latest solution
     *         version. </p>
     *         <p>
     *         For more information about automatic campaign updates, see <a href=
     *         "https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-automatic-latest-sv-update"
     *         >Enabling automatic campaign updates</a>.
     */

    public Boolean getSyncWithLatestSolutionVersion() {
        return this.syncWithLatestSolutionVersion;
    }

    /**
     * <p>
     * Whether the campaign automatically updates to use the latest solution version (trained model) of a solution. If
     * you specify <code>True</code>, you must specify the ARN of your <i>solution</i> for the
     * <code>SolutionVersionArn</code> parameter. It must be in <code>SolutionArn/$LATEST</code> format. The default is
     * <code>False</code> and you must manually update the campaign to deploy the latest solution version.
     * </p>
     * <p>
     * For more information about automatic campaign updates, see <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-automatic-latest-sv-update"
     * >Enabling automatic campaign updates</a>.
     * </p>
     * 
     * @param syncWithLatestSolutionVersion
     *        Whether the campaign automatically updates to use the latest solution version (trained model) of a
     *        solution. If you specify <code>True</code>, you must specify the ARN of your <i>solution</i> for the
     *        <code>SolutionVersionArn</code> parameter. It must be in <code>SolutionArn/$LATEST</code> format. The
     *        default is <code>False</code> and you must manually update the campaign to deploy the latest solution
     *        version. </p>
     *        <p>
     *        For more information about automatic campaign updates, see <a href=
     *        "https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-automatic-latest-sv-update"
     *        >Enabling automatic campaign updates</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignConfig withSyncWithLatestSolutionVersion(Boolean syncWithLatestSolutionVersion) {
        setSyncWithLatestSolutionVersion(syncWithLatestSolutionVersion);
        return this;
    }

    /**
     * <p>
     * Whether the campaign automatically updates to use the latest solution version (trained model) of a solution. If
     * you specify <code>True</code>, you must specify the ARN of your <i>solution</i> for the
     * <code>SolutionVersionArn</code> parameter. It must be in <code>SolutionArn/$LATEST</code> format. The default is
     * <code>False</code> and you must manually update the campaign to deploy the latest solution version.
     * </p>
     * <p>
     * For more information about automatic campaign updates, see <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-automatic-latest-sv-update"
     * >Enabling automatic campaign updates</a>.
     * </p>
     * 
     * @return Whether the campaign automatically updates to use the latest solution version (trained model) of a
     *         solution. If you specify <code>True</code>, you must specify the ARN of your <i>solution</i> for the
     *         <code>SolutionVersionArn</code> parameter. It must be in <code>SolutionArn/$LATEST</code> format. The
     *         default is <code>False</code> and you must manually update the campaign to deploy the latest solution
     *         version. </p>
     *         <p>
     *         For more information about automatic campaign updates, see <a href=
     *         "https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-automatic-latest-sv-update"
     *         >Enabling automatic campaign updates</a>.
     */

    public Boolean isSyncWithLatestSolutionVersion() {
        return this.syncWithLatestSolutionVersion;
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
        if (getItemExplorationConfig() != null)
            sb.append("ItemExplorationConfig: ").append(getItemExplorationConfig()).append(",");
        if (getEnableMetadataWithRecommendations() != null)
            sb.append("EnableMetadataWithRecommendations: ").append(getEnableMetadataWithRecommendations()).append(",");
        if (getSyncWithLatestSolutionVersion() != null)
            sb.append("SyncWithLatestSolutionVersion: ").append(getSyncWithLatestSolutionVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CampaignConfig == false)
            return false;
        CampaignConfig other = (CampaignConfig) obj;
        if (other.getItemExplorationConfig() == null ^ this.getItemExplorationConfig() == null)
            return false;
        if (other.getItemExplorationConfig() != null && other.getItemExplorationConfig().equals(this.getItemExplorationConfig()) == false)
            return false;
        if (other.getEnableMetadataWithRecommendations() == null ^ this.getEnableMetadataWithRecommendations() == null)
            return false;
        if (other.getEnableMetadataWithRecommendations() != null
                && other.getEnableMetadataWithRecommendations().equals(this.getEnableMetadataWithRecommendations()) == false)
            return false;
        if (other.getSyncWithLatestSolutionVersion() == null ^ this.getSyncWithLatestSolutionVersion() == null)
            return false;
        if (other.getSyncWithLatestSolutionVersion() != null
                && other.getSyncWithLatestSolutionVersion().equals(this.getSyncWithLatestSolutionVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItemExplorationConfig() == null) ? 0 : getItemExplorationConfig().hashCode());
        hashCode = prime * hashCode + ((getEnableMetadataWithRecommendations() == null) ? 0 : getEnableMetadataWithRecommendations().hashCode());
        hashCode = prime * hashCode + ((getSyncWithLatestSolutionVersion() == null) ? 0 : getSyncWithLatestSolutionVersion().hashCode());
        return hashCode;
    }

    @Override
    public CampaignConfig clone() {
        try {
            return (CampaignConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.CampaignConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
