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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about the settings for an action type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ActionTypeSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionTypeSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL of a sign-up page where users can sign up for an external service and perform initial configuration of
     * the action provided by that service.
     * </p>
     */
    private String thirdPartyConfigurationUrl;
    /**
     * <p>
     * The URL returned to the AWS CodePipeline console that provides a deep link to the resources of the external
     * system, such as the configuration page for an AWS CodeDeploy deployment group. This link is provided as part of
     * the action display within the pipeline.
     * </p>
     */
    private String entityUrlTemplate;
    /**
     * <p>
     * The URL returned to the AWS CodePipeline console that contains a link to the top-level landing page for the
     * external system, such as console page for AWS CodeDeploy. This link is shown on the pipeline view page in the AWS
     * CodePipeline console and provides a link to the execution entity of the external action.
     * </p>
     */
    private String executionUrlTemplate;
    /**
     * <p>
     * The URL returned to the AWS CodePipeline console that contains a link to the page where customers can update or
     * change the configuration of the external action.
     * </p>
     */
    private String revisionUrlTemplate;

    /**
     * <p>
     * The URL of a sign-up page where users can sign up for an external service and perform initial configuration of
     * the action provided by that service.
     * </p>
     * 
     * @param thirdPartyConfigurationUrl
     *        The URL of a sign-up page where users can sign up for an external service and perform initial
     *        configuration of the action provided by that service.
     */

    public void setThirdPartyConfigurationUrl(String thirdPartyConfigurationUrl) {
        this.thirdPartyConfigurationUrl = thirdPartyConfigurationUrl;
    }

    /**
     * <p>
     * The URL of a sign-up page where users can sign up for an external service and perform initial configuration of
     * the action provided by that service.
     * </p>
     * 
     * @return The URL of a sign-up page where users can sign up for an external service and perform initial
     *         configuration of the action provided by that service.
     */

    public String getThirdPartyConfigurationUrl() {
        return this.thirdPartyConfigurationUrl;
    }

    /**
     * <p>
     * The URL of a sign-up page where users can sign up for an external service and perform initial configuration of
     * the action provided by that service.
     * </p>
     * 
     * @param thirdPartyConfigurationUrl
     *        The URL of a sign-up page where users can sign up for an external service and perform initial
     *        configuration of the action provided by that service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeSettings withThirdPartyConfigurationUrl(String thirdPartyConfigurationUrl) {
        setThirdPartyConfigurationUrl(thirdPartyConfigurationUrl);
        return this;
    }

    /**
     * <p>
     * The URL returned to the AWS CodePipeline console that provides a deep link to the resources of the external
     * system, such as the configuration page for an AWS CodeDeploy deployment group. This link is provided as part of
     * the action display within the pipeline.
     * </p>
     * 
     * @param entityUrlTemplate
     *        The URL returned to the AWS CodePipeline console that provides a deep link to the resources of the
     *        external system, such as the configuration page for an AWS CodeDeploy deployment group. This link is
     *        provided as part of the action display within the pipeline.
     */

    public void setEntityUrlTemplate(String entityUrlTemplate) {
        this.entityUrlTemplate = entityUrlTemplate;
    }

    /**
     * <p>
     * The URL returned to the AWS CodePipeline console that provides a deep link to the resources of the external
     * system, such as the configuration page for an AWS CodeDeploy deployment group. This link is provided as part of
     * the action display within the pipeline.
     * </p>
     * 
     * @return The URL returned to the AWS CodePipeline console that provides a deep link to the resources of the
     *         external system, such as the configuration page for an AWS CodeDeploy deployment group. This link is
     *         provided as part of the action display within the pipeline.
     */

    public String getEntityUrlTemplate() {
        return this.entityUrlTemplate;
    }

    /**
     * <p>
     * The URL returned to the AWS CodePipeline console that provides a deep link to the resources of the external
     * system, such as the configuration page for an AWS CodeDeploy deployment group. This link is provided as part of
     * the action display within the pipeline.
     * </p>
     * 
     * @param entityUrlTemplate
     *        The URL returned to the AWS CodePipeline console that provides a deep link to the resources of the
     *        external system, such as the configuration page for an AWS CodeDeploy deployment group. This link is
     *        provided as part of the action display within the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeSettings withEntityUrlTemplate(String entityUrlTemplate) {
        setEntityUrlTemplate(entityUrlTemplate);
        return this;
    }

    /**
     * <p>
     * The URL returned to the AWS CodePipeline console that contains a link to the top-level landing page for the
     * external system, such as console page for AWS CodeDeploy. This link is shown on the pipeline view page in the AWS
     * CodePipeline console and provides a link to the execution entity of the external action.
     * </p>
     * 
     * @param executionUrlTemplate
     *        The URL returned to the AWS CodePipeline console that contains a link to the top-level landing page for
     *        the external system, such as console page for AWS CodeDeploy. This link is shown on the pipeline view page
     *        in the AWS CodePipeline console and provides a link to the execution entity of the external action.
     */

    public void setExecutionUrlTemplate(String executionUrlTemplate) {
        this.executionUrlTemplate = executionUrlTemplate;
    }

    /**
     * <p>
     * The URL returned to the AWS CodePipeline console that contains a link to the top-level landing page for the
     * external system, such as console page for AWS CodeDeploy. This link is shown on the pipeline view page in the AWS
     * CodePipeline console and provides a link to the execution entity of the external action.
     * </p>
     * 
     * @return The URL returned to the AWS CodePipeline console that contains a link to the top-level landing page for
     *         the external system, such as console page for AWS CodeDeploy. This link is shown on the pipeline view
     *         page in the AWS CodePipeline console and provides a link to the execution entity of the external action.
     */

    public String getExecutionUrlTemplate() {
        return this.executionUrlTemplate;
    }

    /**
     * <p>
     * The URL returned to the AWS CodePipeline console that contains a link to the top-level landing page for the
     * external system, such as console page for AWS CodeDeploy. This link is shown on the pipeline view page in the AWS
     * CodePipeline console and provides a link to the execution entity of the external action.
     * </p>
     * 
     * @param executionUrlTemplate
     *        The URL returned to the AWS CodePipeline console that contains a link to the top-level landing page for
     *        the external system, such as console page for AWS CodeDeploy. This link is shown on the pipeline view page
     *        in the AWS CodePipeline console and provides a link to the execution entity of the external action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeSettings withExecutionUrlTemplate(String executionUrlTemplate) {
        setExecutionUrlTemplate(executionUrlTemplate);
        return this;
    }

    /**
     * <p>
     * The URL returned to the AWS CodePipeline console that contains a link to the page where customers can update or
     * change the configuration of the external action.
     * </p>
     * 
     * @param revisionUrlTemplate
     *        The URL returned to the AWS CodePipeline console that contains a link to the page where customers can
     *        update or change the configuration of the external action.
     */

    public void setRevisionUrlTemplate(String revisionUrlTemplate) {
        this.revisionUrlTemplate = revisionUrlTemplate;
    }

    /**
     * <p>
     * The URL returned to the AWS CodePipeline console that contains a link to the page where customers can update or
     * change the configuration of the external action.
     * </p>
     * 
     * @return The URL returned to the AWS CodePipeline console that contains a link to the page where customers can
     *         update or change the configuration of the external action.
     */

    public String getRevisionUrlTemplate() {
        return this.revisionUrlTemplate;
    }

    /**
     * <p>
     * The URL returned to the AWS CodePipeline console that contains a link to the page where customers can update or
     * change the configuration of the external action.
     * </p>
     * 
     * @param revisionUrlTemplate
     *        The URL returned to the AWS CodePipeline console that contains a link to the page where customers can
     *        update or change the configuration of the external action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeSettings withRevisionUrlTemplate(String revisionUrlTemplate) {
        setRevisionUrlTemplate(revisionUrlTemplate);
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
        if (getThirdPartyConfigurationUrl() != null)
            sb.append("ThirdPartyConfigurationUrl: ").append(getThirdPartyConfigurationUrl()).append(",");
        if (getEntityUrlTemplate() != null)
            sb.append("EntityUrlTemplate: ").append(getEntityUrlTemplate()).append(",");
        if (getExecutionUrlTemplate() != null)
            sb.append("ExecutionUrlTemplate: ").append(getExecutionUrlTemplate()).append(",");
        if (getRevisionUrlTemplate() != null)
            sb.append("RevisionUrlTemplate: ").append(getRevisionUrlTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionTypeSettings == false)
            return false;
        ActionTypeSettings other = (ActionTypeSettings) obj;
        if (other.getThirdPartyConfigurationUrl() == null ^ this.getThirdPartyConfigurationUrl() == null)
            return false;
        if (other.getThirdPartyConfigurationUrl() != null && other.getThirdPartyConfigurationUrl().equals(this.getThirdPartyConfigurationUrl()) == false)
            return false;
        if (other.getEntityUrlTemplate() == null ^ this.getEntityUrlTemplate() == null)
            return false;
        if (other.getEntityUrlTemplate() != null && other.getEntityUrlTemplate().equals(this.getEntityUrlTemplate()) == false)
            return false;
        if (other.getExecutionUrlTemplate() == null ^ this.getExecutionUrlTemplate() == null)
            return false;
        if (other.getExecutionUrlTemplate() != null && other.getExecutionUrlTemplate().equals(this.getExecutionUrlTemplate()) == false)
            return false;
        if (other.getRevisionUrlTemplate() == null ^ this.getRevisionUrlTemplate() == null)
            return false;
        if (other.getRevisionUrlTemplate() != null && other.getRevisionUrlTemplate().equals(this.getRevisionUrlTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThirdPartyConfigurationUrl() == null) ? 0 : getThirdPartyConfigurationUrl().hashCode());
        hashCode = prime * hashCode + ((getEntityUrlTemplate() == null) ? 0 : getEntityUrlTemplate().hashCode());
        hashCode = prime * hashCode + ((getExecutionUrlTemplate() == null) ? 0 : getExecutionUrlTemplate().hashCode());
        hashCode = prime * hashCode + ((getRevisionUrlTemplate() == null) ? 0 : getRevisionUrlTemplate().hashCode());
        return hashCode;
    }

    @Override
    public ActionTypeSettings clone() {
        try {
            return (ActionTypeSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ActionTypeSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
