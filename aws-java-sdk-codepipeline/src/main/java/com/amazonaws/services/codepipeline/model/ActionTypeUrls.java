/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Returns information about URLs for web pages that display to customers as links on the pipeline view, such as an
 * external configuration page for the action type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ActionTypeUrls" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionTypeUrls implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL returned to the CodePipeline console that contains a link to the page where customers can configure the
     * external action.
     * </p>
     */
    private String configurationUrl;
    /**
     * <p>
     * The URL returned to the CodePipeline console that provides a deep link to the resources of the external system,
     * such as a status page. This link is provided as part of the action display in the pipeline.
     * </p>
     */
    private String entityUrlTemplate;
    /**
     * <p>
     * The link to an execution page for the action type in progress. For example, for a CodeDeploy action, this link is
     * shown on the pipeline view page in the CodePipeline console, and it links to a CodeDeploy status page.
     * </p>
     */
    private String executionUrlTemplate;
    /**
     * <p>
     * The URL returned to the CodePipeline console that contains a link to the page where customers can update or
     * change the configuration of the external action.
     * </p>
     */
    private String revisionUrlTemplate;

    /**
     * <p>
     * The URL returned to the CodePipeline console that contains a link to the page where customers can configure the
     * external action.
     * </p>
     * 
     * @param configurationUrl
     *        The URL returned to the CodePipeline console that contains a link to the page where customers can
     *        configure the external action.
     */

    public void setConfigurationUrl(String configurationUrl) {
        this.configurationUrl = configurationUrl;
    }

    /**
     * <p>
     * The URL returned to the CodePipeline console that contains a link to the page where customers can configure the
     * external action.
     * </p>
     * 
     * @return The URL returned to the CodePipeline console that contains a link to the page where customers can
     *         configure the external action.
     */

    public String getConfigurationUrl() {
        return this.configurationUrl;
    }

    /**
     * <p>
     * The URL returned to the CodePipeline console that contains a link to the page where customers can configure the
     * external action.
     * </p>
     * 
     * @param configurationUrl
     *        The URL returned to the CodePipeline console that contains a link to the page where customers can
     *        configure the external action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeUrls withConfigurationUrl(String configurationUrl) {
        setConfigurationUrl(configurationUrl);
        return this;
    }

    /**
     * <p>
     * The URL returned to the CodePipeline console that provides a deep link to the resources of the external system,
     * such as a status page. This link is provided as part of the action display in the pipeline.
     * </p>
     * 
     * @param entityUrlTemplate
     *        The URL returned to the CodePipeline console that provides a deep link to the resources of the external
     *        system, such as a status page. This link is provided as part of the action display in the pipeline.
     */

    public void setEntityUrlTemplate(String entityUrlTemplate) {
        this.entityUrlTemplate = entityUrlTemplate;
    }

    /**
     * <p>
     * The URL returned to the CodePipeline console that provides a deep link to the resources of the external system,
     * such as a status page. This link is provided as part of the action display in the pipeline.
     * </p>
     * 
     * @return The URL returned to the CodePipeline console that provides a deep link to the resources of the external
     *         system, such as a status page. This link is provided as part of the action display in the pipeline.
     */

    public String getEntityUrlTemplate() {
        return this.entityUrlTemplate;
    }

    /**
     * <p>
     * The URL returned to the CodePipeline console that provides a deep link to the resources of the external system,
     * such as a status page. This link is provided as part of the action display in the pipeline.
     * </p>
     * 
     * @param entityUrlTemplate
     *        The URL returned to the CodePipeline console that provides a deep link to the resources of the external
     *        system, such as a status page. This link is provided as part of the action display in the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeUrls withEntityUrlTemplate(String entityUrlTemplate) {
        setEntityUrlTemplate(entityUrlTemplate);
        return this;
    }

    /**
     * <p>
     * The link to an execution page for the action type in progress. For example, for a CodeDeploy action, this link is
     * shown on the pipeline view page in the CodePipeline console, and it links to a CodeDeploy status page.
     * </p>
     * 
     * @param executionUrlTemplate
     *        The link to an execution page for the action type in progress. For example, for a CodeDeploy action, this
     *        link is shown on the pipeline view page in the CodePipeline console, and it links to a CodeDeploy status
     *        page.
     */

    public void setExecutionUrlTemplate(String executionUrlTemplate) {
        this.executionUrlTemplate = executionUrlTemplate;
    }

    /**
     * <p>
     * The link to an execution page for the action type in progress. For example, for a CodeDeploy action, this link is
     * shown on the pipeline view page in the CodePipeline console, and it links to a CodeDeploy status page.
     * </p>
     * 
     * @return The link to an execution page for the action type in progress. For example, for a CodeDeploy action, this
     *         link is shown on the pipeline view page in the CodePipeline console, and it links to a CodeDeploy status
     *         page.
     */

    public String getExecutionUrlTemplate() {
        return this.executionUrlTemplate;
    }

    /**
     * <p>
     * The link to an execution page for the action type in progress. For example, for a CodeDeploy action, this link is
     * shown on the pipeline view page in the CodePipeline console, and it links to a CodeDeploy status page.
     * </p>
     * 
     * @param executionUrlTemplate
     *        The link to an execution page for the action type in progress. For example, for a CodeDeploy action, this
     *        link is shown on the pipeline view page in the CodePipeline console, and it links to a CodeDeploy status
     *        page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeUrls withExecutionUrlTemplate(String executionUrlTemplate) {
        setExecutionUrlTemplate(executionUrlTemplate);
        return this;
    }

    /**
     * <p>
     * The URL returned to the CodePipeline console that contains a link to the page where customers can update or
     * change the configuration of the external action.
     * </p>
     * 
     * @param revisionUrlTemplate
     *        The URL returned to the CodePipeline console that contains a link to the page where customers can update
     *        or change the configuration of the external action.
     */

    public void setRevisionUrlTemplate(String revisionUrlTemplate) {
        this.revisionUrlTemplate = revisionUrlTemplate;
    }

    /**
     * <p>
     * The URL returned to the CodePipeline console that contains a link to the page where customers can update or
     * change the configuration of the external action.
     * </p>
     * 
     * @return The URL returned to the CodePipeline console that contains a link to the page where customers can update
     *         or change the configuration of the external action.
     */

    public String getRevisionUrlTemplate() {
        return this.revisionUrlTemplate;
    }

    /**
     * <p>
     * The URL returned to the CodePipeline console that contains a link to the page where customers can update or
     * change the configuration of the external action.
     * </p>
     * 
     * @param revisionUrlTemplate
     *        The URL returned to the CodePipeline console that contains a link to the page where customers can update
     *        or change the configuration of the external action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeUrls withRevisionUrlTemplate(String revisionUrlTemplate) {
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
        if (getConfigurationUrl() != null)
            sb.append("ConfigurationUrl: ").append(getConfigurationUrl()).append(",");
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

        if (obj instanceof ActionTypeUrls == false)
            return false;
        ActionTypeUrls other = (ActionTypeUrls) obj;
        if (other.getConfigurationUrl() == null ^ this.getConfigurationUrl() == null)
            return false;
        if (other.getConfigurationUrl() != null && other.getConfigurationUrl().equals(this.getConfigurationUrl()) == false)
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

        hashCode = prime * hashCode + ((getConfigurationUrl() == null) ? 0 : getConfigurationUrl().hashCode());
        hashCode = prime * hashCode + ((getEntityUrlTemplate() == null) ? 0 : getEntityUrlTemplate().hashCode());
        hashCode = prime * hashCode + ((getExecutionUrlTemplate() == null) ? 0 : getExecutionUrlTemplate().hashCode());
        hashCode = prime * hashCode + ((getRevisionUrlTemplate() == null) ? 0 : getRevisionUrlTemplate().hashCode());
        return hashCode;
    }

    @Override
    public ActionTypeUrls clone() {
        try {
            return (ActionTypeUrls) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ActionTypeUrlsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
