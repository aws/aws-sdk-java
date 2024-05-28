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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/UpdateCampaign" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCampaignRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     */
    private String campaignArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a new model to deploy. To specify the latest solution version of your solution,
     * specify the ARN of your <i>solution</i> in <code>SolutionArn/$LATEST</code> format. You must use this format if
     * you set <code>syncWithLatestSolutionVersion</code> to <code>True</code> in the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CampaignConfig.html">CampaignConfig</a>.
     * </p>
     * <p>
     * To deploy a model that isn't the latest solution version of your solution, specify the ARN of the solution
     * version.
     * </p>
     * <p>
     * For more information about automatic campaign updates, see <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-automatic-latest-sv-update"
     * >Enabling automatic campaign updates</a>.
     * </p>
     */
    private String solutionVersionArn;
    /**
     * <p>
     * Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon Personalize
     * will support. A high <code>minProvisionedTPS</code> will increase your bill. We recommend starting with 1 for
     * <code>minProvisionedTPS</code> (the default). Track your usage using Amazon CloudWatch metrics, and increase the
     * <code>minProvisionedTPS</code> as necessary.
     * </p>
     */
    private Integer minProvisionedTPS;
    /**
     * <p>
     * The configuration details of a campaign.
     * </p>
     */
    private CampaignConfig campaignConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     * 
     * @param campaignArn
     *        The Amazon Resource Name (ARN) of the campaign.
     */

    public void setCampaignArn(String campaignArn) {
        this.campaignArn = campaignArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the campaign.
     */

    public String getCampaignArn() {
        return this.campaignArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     * 
     * @param campaignArn
     *        The Amazon Resource Name (ARN) of the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCampaignRequest withCampaignArn(String campaignArn) {
        setCampaignArn(campaignArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a new model to deploy. To specify the latest solution version of your solution,
     * specify the ARN of your <i>solution</i> in <code>SolutionArn/$LATEST</code> format. You must use this format if
     * you set <code>syncWithLatestSolutionVersion</code> to <code>True</code> in the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CampaignConfig.html">CampaignConfig</a>.
     * </p>
     * <p>
     * To deploy a model that isn't the latest solution version of your solution, specify the ARN of the solution
     * version.
     * </p>
     * <p>
     * For more information about automatic campaign updates, see <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-automatic-latest-sv-update"
     * >Enabling automatic campaign updates</a>.
     * </p>
     * 
     * @param solutionVersionArn
     *        The Amazon Resource Name (ARN) of a new model to deploy. To specify the latest solution version of your
     *        solution, specify the ARN of your <i>solution</i> in <code>SolutionArn/$LATEST</code> format. You must use
     *        this format if you set <code>syncWithLatestSolutionVersion</code> to <code>True</code> in the <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/API_CampaignConfig.html">CampaignConfig</a>. </p>
     *        <p>
     *        To deploy a model that isn't the latest solution version of your solution, specify the ARN of the solution
     *        version.
     *        </p>
     *        <p>
     *        For more information about automatic campaign updates, see <a href=
     *        "https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-automatic-latest-sv-update"
     *        >Enabling automatic campaign updates</a>.
     */

    public void setSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a new model to deploy. To specify the latest solution version of your solution,
     * specify the ARN of your <i>solution</i> in <code>SolutionArn/$LATEST</code> format. You must use this format if
     * you set <code>syncWithLatestSolutionVersion</code> to <code>True</code> in the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CampaignConfig.html">CampaignConfig</a>.
     * </p>
     * <p>
     * To deploy a model that isn't the latest solution version of your solution, specify the ARN of the solution
     * version.
     * </p>
     * <p>
     * For more information about automatic campaign updates, see <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-automatic-latest-sv-update"
     * >Enabling automatic campaign updates</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a new model to deploy. To specify the latest solution version of your
     *         solution, specify the ARN of your <i>solution</i> in <code>SolutionArn/$LATEST</code> format. You must
     *         use this format if you set <code>syncWithLatestSolutionVersion</code> to <code>True</code> in the <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/API_CampaignConfig.html">CampaignConfig</a>. </p>
     *         <p>
     *         To deploy a model that isn't the latest solution version of your solution, specify the ARN of the
     *         solution version.
     *         </p>
     *         <p>
     *         For more information about automatic campaign updates, see <a href=
     *         "https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-automatic-latest-sv-update"
     *         >Enabling automatic campaign updates</a>.
     */

    public String getSolutionVersionArn() {
        return this.solutionVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a new model to deploy. To specify the latest solution version of your solution,
     * specify the ARN of your <i>solution</i> in <code>SolutionArn/$LATEST</code> format. You must use this format if
     * you set <code>syncWithLatestSolutionVersion</code> to <code>True</code> in the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CampaignConfig.html">CampaignConfig</a>.
     * </p>
     * <p>
     * To deploy a model that isn't the latest solution version of your solution, specify the ARN of the solution
     * version.
     * </p>
     * <p>
     * For more information about automatic campaign updates, see <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-automatic-latest-sv-update"
     * >Enabling automatic campaign updates</a>.
     * </p>
     * 
     * @param solutionVersionArn
     *        The Amazon Resource Name (ARN) of a new model to deploy. To specify the latest solution version of your
     *        solution, specify the ARN of your <i>solution</i> in <code>SolutionArn/$LATEST</code> format. You must use
     *        this format if you set <code>syncWithLatestSolutionVersion</code> to <code>True</code> in the <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/API_CampaignConfig.html">CampaignConfig</a>. </p>
     *        <p>
     *        To deploy a model that isn't the latest solution version of your solution, specify the ARN of the solution
     *        version.
     *        </p>
     *        <p>
     *        For more information about automatic campaign updates, see <a href=
     *        "https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html#create-campaign-automatic-latest-sv-update"
     *        >Enabling automatic campaign updates</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCampaignRequest withSolutionVersionArn(String solutionVersionArn) {
        setSolutionVersionArn(solutionVersionArn);
        return this;
    }

    /**
     * <p>
     * Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon Personalize
     * will support. A high <code>minProvisionedTPS</code> will increase your bill. We recommend starting with 1 for
     * <code>minProvisionedTPS</code> (the default). Track your usage using Amazon CloudWatch metrics, and increase the
     * <code>minProvisionedTPS</code> as necessary.
     * </p>
     * 
     * @param minProvisionedTPS
     *        Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon
     *        Personalize will support. A high <code>minProvisionedTPS</code> will increase your bill. We recommend
     *        starting with 1 for <code>minProvisionedTPS</code> (the default). Track your usage using Amazon CloudWatch
     *        metrics, and increase the <code>minProvisionedTPS</code> as necessary.
     */

    public void setMinProvisionedTPS(Integer minProvisionedTPS) {
        this.minProvisionedTPS = minProvisionedTPS;
    }

    /**
     * <p>
     * Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon Personalize
     * will support. A high <code>minProvisionedTPS</code> will increase your bill. We recommend starting with 1 for
     * <code>minProvisionedTPS</code> (the default). Track your usage using Amazon CloudWatch metrics, and increase the
     * <code>minProvisionedTPS</code> as necessary.
     * </p>
     * 
     * @return Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon
     *         Personalize will support. A high <code>minProvisionedTPS</code> will increase your bill. We recommend
     *         starting with 1 for <code>minProvisionedTPS</code> (the default). Track your usage using Amazon
     *         CloudWatch metrics, and increase the <code>minProvisionedTPS</code> as necessary.
     */

    public Integer getMinProvisionedTPS() {
        return this.minProvisionedTPS;
    }

    /**
     * <p>
     * Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon Personalize
     * will support. A high <code>minProvisionedTPS</code> will increase your bill. We recommend starting with 1 for
     * <code>minProvisionedTPS</code> (the default). Track your usage using Amazon CloudWatch metrics, and increase the
     * <code>minProvisionedTPS</code> as necessary.
     * </p>
     * 
     * @param minProvisionedTPS
     *        Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon
     *        Personalize will support. A high <code>minProvisionedTPS</code> will increase your bill. We recommend
     *        starting with 1 for <code>minProvisionedTPS</code> (the default). Track your usage using Amazon CloudWatch
     *        metrics, and increase the <code>minProvisionedTPS</code> as necessary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCampaignRequest withMinProvisionedTPS(Integer minProvisionedTPS) {
        setMinProvisionedTPS(minProvisionedTPS);
        return this;
    }

    /**
     * <p>
     * The configuration details of a campaign.
     * </p>
     * 
     * @param campaignConfig
     *        The configuration details of a campaign.
     */

    public void setCampaignConfig(CampaignConfig campaignConfig) {
        this.campaignConfig = campaignConfig;
    }

    /**
     * <p>
     * The configuration details of a campaign.
     * </p>
     * 
     * @return The configuration details of a campaign.
     */

    public CampaignConfig getCampaignConfig() {
        return this.campaignConfig;
    }

    /**
     * <p>
     * The configuration details of a campaign.
     * </p>
     * 
     * @param campaignConfig
     *        The configuration details of a campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCampaignRequest withCampaignConfig(CampaignConfig campaignConfig) {
        setCampaignConfig(campaignConfig);
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
        if (getCampaignArn() != null)
            sb.append("CampaignArn: ").append(getCampaignArn()).append(",");
        if (getSolutionVersionArn() != null)
            sb.append("SolutionVersionArn: ").append(getSolutionVersionArn()).append(",");
        if (getMinProvisionedTPS() != null)
            sb.append("MinProvisionedTPS: ").append(getMinProvisionedTPS()).append(",");
        if (getCampaignConfig() != null)
            sb.append("CampaignConfig: ").append(getCampaignConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCampaignRequest == false)
            return false;
        UpdateCampaignRequest other = (UpdateCampaignRequest) obj;
        if (other.getCampaignArn() == null ^ this.getCampaignArn() == null)
            return false;
        if (other.getCampaignArn() != null && other.getCampaignArn().equals(this.getCampaignArn()) == false)
            return false;
        if (other.getSolutionVersionArn() == null ^ this.getSolutionVersionArn() == null)
            return false;
        if (other.getSolutionVersionArn() != null && other.getSolutionVersionArn().equals(this.getSolutionVersionArn()) == false)
            return false;
        if (other.getMinProvisionedTPS() == null ^ this.getMinProvisionedTPS() == null)
            return false;
        if (other.getMinProvisionedTPS() != null && other.getMinProvisionedTPS().equals(this.getMinProvisionedTPS()) == false)
            return false;
        if (other.getCampaignConfig() == null ^ this.getCampaignConfig() == null)
            return false;
        if (other.getCampaignConfig() != null && other.getCampaignConfig().equals(this.getCampaignConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCampaignArn() == null) ? 0 : getCampaignArn().hashCode());
        hashCode = prime * hashCode + ((getSolutionVersionArn() == null) ? 0 : getSolutionVersionArn().hashCode());
        hashCode = prime * hashCode + ((getMinProvisionedTPS() == null) ? 0 : getMinProvisionedTPS().hashCode());
        hashCode = prime * hashCode + ((getCampaignConfig() == null) ? 0 : getCampaignConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCampaignRequest clone() {
        return (UpdateCampaignRequest) super.clone();
    }

}
