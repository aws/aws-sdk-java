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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for Amazon AppIntegrations to automatically ingest content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/AppIntegrationsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppIntegrationsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AppIntegrations DataIntegration to use for ingesting content.
     * </p>
     */
    private String appIntegrationArn;
    /**
     * <p>
     * The fields from the source that are made available to your agents in Wisdom.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <a href=
     * "https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm"
     * > Salesforce</a>, you must include at least <code>Id</code>, <code>ArticleNumber</code>,
     * <code>VersionNumber</code>, <code>Title</code>, <code>PublishStatus</code>, and <code>IsDeleted</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <a href="https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api">
     * ServiceNow</a>, you must include at least <code>number</code>, <code>short_description</code>,
     * <code>sys_mod_count</code>, <code>workflow_state</code>, and <code>active</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Make sure to include additional fields. These fields are indexed and used to source recommendations.
     * </p>
     */
    private java.util.List<String> objectFields;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AppIntegrations DataIntegration to use for ingesting content.
     * </p>
     * 
     * @param appIntegrationArn
     *        The Amazon Resource Name (ARN) of the AppIntegrations DataIntegration to use for ingesting content.
     */

    public void setAppIntegrationArn(String appIntegrationArn) {
        this.appIntegrationArn = appIntegrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AppIntegrations DataIntegration to use for ingesting content.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AppIntegrations DataIntegration to use for ingesting content.
     */

    public String getAppIntegrationArn() {
        return this.appIntegrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AppIntegrations DataIntegration to use for ingesting content.
     * </p>
     * 
     * @param appIntegrationArn
     *        The Amazon Resource Name (ARN) of the AppIntegrations DataIntegration to use for ingesting content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppIntegrationsConfiguration withAppIntegrationArn(String appIntegrationArn) {
        setAppIntegrationArn(appIntegrationArn);
        return this;
    }

    /**
     * <p>
     * The fields from the source that are made available to your agents in Wisdom.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <a href=
     * "https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm"
     * > Salesforce</a>, you must include at least <code>Id</code>, <code>ArticleNumber</code>,
     * <code>VersionNumber</code>, <code>Title</code>, <code>PublishStatus</code>, and <code>IsDeleted</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <a href="https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api">
     * ServiceNow</a>, you must include at least <code>number</code>, <code>short_description</code>,
     * <code>sys_mod_count</code>, <code>workflow_state</code>, and <code>active</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Make sure to include additional fields. These fields are indexed and used to source recommendations.
     * </p>
     * 
     * @return The fields from the source that are made available to your agents in Wisdom. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For <a href=
     *         "https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm"
     *         > Salesforce</a>, you must include at least <code>Id</code>, <code>ArticleNumber</code>,
     *         <code>VersionNumber</code>, <code>Title</code>, <code>PublishStatus</code>, and <code>IsDeleted</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <a href="https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api">
     *         ServiceNow</a>, you must include at least <code>number</code>, <code>short_description</code>,
     *         <code>sys_mod_count</code>, <code>workflow_state</code>, and <code>active</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Make sure to include additional fields. These fields are indexed and used to source recommendations.
     */

    public java.util.List<String> getObjectFields() {
        return objectFields;
    }

    /**
     * <p>
     * The fields from the source that are made available to your agents in Wisdom.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <a href=
     * "https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm"
     * > Salesforce</a>, you must include at least <code>Id</code>, <code>ArticleNumber</code>,
     * <code>VersionNumber</code>, <code>Title</code>, <code>PublishStatus</code>, and <code>IsDeleted</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <a href="https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api">
     * ServiceNow</a>, you must include at least <code>number</code>, <code>short_description</code>,
     * <code>sys_mod_count</code>, <code>workflow_state</code>, and <code>active</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Make sure to include additional fields. These fields are indexed and used to source recommendations.
     * </p>
     * 
     * @param objectFields
     *        The fields from the source that are made available to your agents in Wisdom. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <a href=
     *        "https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm"
     *        > Salesforce</a>, you must include at least <code>Id</code>, <code>ArticleNumber</code>,
     *        <code>VersionNumber</code>, <code>Title</code>, <code>PublishStatus</code>, and <code>IsDeleted</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <a href="https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api">
     *        ServiceNow</a>, you must include at least <code>number</code>, <code>short_description</code>,
     *        <code>sys_mod_count</code>, <code>workflow_state</code>, and <code>active</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Make sure to include additional fields. These fields are indexed and used to source recommendations.
     */

    public void setObjectFields(java.util.Collection<String> objectFields) {
        if (objectFields == null) {
            this.objectFields = null;
            return;
        }

        this.objectFields = new java.util.ArrayList<String>(objectFields);
    }

    /**
     * <p>
     * The fields from the source that are made available to your agents in Wisdom.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <a href=
     * "https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm"
     * > Salesforce</a>, you must include at least <code>Id</code>, <code>ArticleNumber</code>,
     * <code>VersionNumber</code>, <code>Title</code>, <code>PublishStatus</code>, and <code>IsDeleted</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <a href="https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api">
     * ServiceNow</a>, you must include at least <code>number</code>, <code>short_description</code>,
     * <code>sys_mod_count</code>, <code>workflow_state</code>, and <code>active</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Make sure to include additional fields. These fields are indexed and used to source recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setObjectFields(java.util.Collection)} or {@link #withObjectFields(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param objectFields
     *        The fields from the source that are made available to your agents in Wisdom. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <a href=
     *        "https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm"
     *        > Salesforce</a>, you must include at least <code>Id</code>, <code>ArticleNumber</code>,
     *        <code>VersionNumber</code>, <code>Title</code>, <code>PublishStatus</code>, and <code>IsDeleted</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <a href="https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api">
     *        ServiceNow</a>, you must include at least <code>number</code>, <code>short_description</code>,
     *        <code>sys_mod_count</code>, <code>workflow_state</code>, and <code>active</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Make sure to include additional fields. These fields are indexed and used to source recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppIntegrationsConfiguration withObjectFields(String... objectFields) {
        if (this.objectFields == null) {
            setObjectFields(new java.util.ArrayList<String>(objectFields.length));
        }
        for (String ele : objectFields) {
            this.objectFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The fields from the source that are made available to your agents in Wisdom.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <a href=
     * "https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm"
     * > Salesforce</a>, you must include at least <code>Id</code>, <code>ArticleNumber</code>,
     * <code>VersionNumber</code>, <code>Title</code>, <code>PublishStatus</code>, and <code>IsDeleted</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <a href="https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api">
     * ServiceNow</a>, you must include at least <code>number</code>, <code>short_description</code>,
     * <code>sys_mod_count</code>, <code>workflow_state</code>, and <code>active</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Make sure to include additional fields. These fields are indexed and used to source recommendations.
     * </p>
     * 
     * @param objectFields
     *        The fields from the source that are made available to your agents in Wisdom. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <a href=
     *        "https://developer.salesforce.com/docs/atlas.en-us.knowledge_dev.meta/knowledge_dev/sforce_api_objects_knowledge__kav.htm"
     *        > Salesforce</a>, you must include at least <code>Id</code>, <code>ArticleNumber</code>,
     *        <code>VersionNumber</code>, <code>Title</code>, <code>PublishStatus</code>, and <code>IsDeleted</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <a href="https://developer.servicenow.com/dev.do#!/reference/api/rome/rest/knowledge-management-api">
     *        ServiceNow</a>, you must include at least <code>number</code>, <code>short_description</code>,
     *        <code>sys_mod_count</code>, <code>workflow_state</code>, and <code>active</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Make sure to include additional fields. These fields are indexed and used to source recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppIntegrationsConfiguration withObjectFields(java.util.Collection<String> objectFields) {
        setObjectFields(objectFields);
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
        if (getAppIntegrationArn() != null)
            sb.append("AppIntegrationArn: ").append(getAppIntegrationArn()).append(",");
        if (getObjectFields() != null)
            sb.append("ObjectFields: ").append(getObjectFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppIntegrationsConfiguration == false)
            return false;
        AppIntegrationsConfiguration other = (AppIntegrationsConfiguration) obj;
        if (other.getAppIntegrationArn() == null ^ this.getAppIntegrationArn() == null)
            return false;
        if (other.getAppIntegrationArn() != null && other.getAppIntegrationArn().equals(this.getAppIntegrationArn()) == false)
            return false;
        if (other.getObjectFields() == null ^ this.getObjectFields() == null)
            return false;
        if (other.getObjectFields() != null && other.getObjectFields().equals(this.getObjectFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppIntegrationArn() == null) ? 0 : getAppIntegrationArn().hashCode());
        hashCode = prime * hashCode + ((getObjectFields() == null) ? 0 : getObjectFields().hashCode());
        return hashCode;
    }

    @Override
    public AppIntegrationsConfiguration clone() {
        try {
            return (AppIntegrationsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.AppIntegrationsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
