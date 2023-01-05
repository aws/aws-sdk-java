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
 * Information about how to render the content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/RenderingConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RenderingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A URI template containing exactly one variable in <code>${variableName} </code>format. This can only be set for
     * <code>EXTERNAL</code> knowledge bases. For Salesforce and ServiceNow, the variable must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Salesforce: <code>Id</code>, <code>ArticleNumber</code>, <code>VersionNumber</code>, <code>Title</code>,
     * <code>PublishStatus</code>, or <code>IsDeleted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceNow: <code>number</code>, <code>short_description</code>, <code>sys_mod_count</code>,
     * <code>workflow_state</code>, or <code>active</code>
     * </p>
     * </li>
     * </ul>
     * 
     * <pre>
     * <code> &lt;p&gt;The variable is replaced with the actual value for a piece of content when calling &lt;a href=&quot;https://docs.aws.amazon.com/wisdom/latest/APIReference/API_GetContent.html&quot;&gt;GetContent&lt;/a&gt;. &lt;/p&gt; </code>
     * </pre>
     */
    private String templateUri;

    /**
     * <p>
     * A URI template containing exactly one variable in <code>${variableName} </code>format. This can only be set for
     * <code>EXTERNAL</code> knowledge bases. For Salesforce and ServiceNow, the variable must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Salesforce: <code>Id</code>, <code>ArticleNumber</code>, <code>VersionNumber</code>, <code>Title</code>,
     * <code>PublishStatus</code>, or <code>IsDeleted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceNow: <code>number</code>, <code>short_description</code>, <code>sys_mod_count</code>,
     * <code>workflow_state</code>, or <code>active</code>
     * </p>
     * </li>
     * </ul>
     * 
     * <pre>
     * <code> &lt;p&gt;The variable is replaced with the actual value for a piece of content when calling &lt;a href=&quot;https://docs.aws.amazon.com/wisdom/latest/APIReference/API_GetContent.html&quot;&gt;GetContent&lt;/a&gt;. &lt;/p&gt; </code>
     * </pre>
     * 
     * @param templateUri
     *        A URI template containing exactly one variable in <code>${variableName} </code>format. This can only be
     *        set for <code>EXTERNAL</code> knowledge bases. For Salesforce and ServiceNow, the variable must be one of
     *        the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Salesforce: <code>Id</code>, <code>ArticleNumber</code>, <code>VersionNumber</code>, <code>Title</code>,
     *        <code>PublishStatus</code>, or <code>IsDeleted</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ServiceNow: <code>number</code>, <code>short_description</code>, <code>sys_mod_count</code>,
     *        <code>workflow_state</code>, or <code>active</code>
     *        </p>
     *        </li>
     *        </ul>
     * 
     * <pre><code> &lt;p&gt;The variable is replaced with the actual value for a piece of content when calling &lt;a href=&quot;https://docs.aws.amazon.com/wisdom/latest/APIReference/API_GetContent.html&quot;&gt;GetContent&lt;/a&gt;. &lt;/p&gt; </code>
     */

    public void setTemplateUri(String templateUri) {
        this.templateUri = templateUri;
    }

    /**
     * <p>
     * A URI template containing exactly one variable in <code>${variableName} </code>format. This can only be set for
     * <code>EXTERNAL</code> knowledge bases. For Salesforce and ServiceNow, the variable must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Salesforce: <code>Id</code>, <code>ArticleNumber</code>, <code>VersionNumber</code>, <code>Title</code>,
     * <code>PublishStatus</code>, or <code>IsDeleted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceNow: <code>number</code>, <code>short_description</code>, <code>sys_mod_count</code>,
     * <code>workflow_state</code>, or <code>active</code>
     * </p>
     * </li>
     * </ul>
     * 
     * <pre>
     * <code> &lt;p&gt;The variable is replaced with the actual value for a piece of content when calling &lt;a href=&quot;https://docs.aws.amazon.com/wisdom/latest/APIReference/API_GetContent.html&quot;&gt;GetContent&lt;/a&gt;. &lt;/p&gt; </code>
     * </pre>
     * 
     * @return A URI template containing exactly one variable in <code>${variableName} </code>format. This can only be
     *         set for <code>EXTERNAL</code> knowledge bases. For Salesforce and ServiceNow, the variable must be one of
     *         the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Salesforce: <code>Id</code>, <code>ArticleNumber</code>, <code>VersionNumber</code>, <code>Title</code>,
     *         <code>PublishStatus</code>, or <code>IsDeleted</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ServiceNow: <code>number</code>, <code>short_description</code>, <code>sys_mod_count</code>,
     *         <code>workflow_state</code>, or <code>active</code>
     *         </p>
     *         </li>
     *         </ul>
     * 
     * <pre><code> &lt;p&gt;The variable is replaced with the actual value for a piece of content when calling &lt;a href=&quot;https://docs.aws.amazon.com/wisdom/latest/APIReference/API_GetContent.html&quot;&gt;GetContent&lt;/a&gt;. &lt;/p&gt; </code>
     */

    public String getTemplateUri() {
        return this.templateUri;
    }

    /**
     * <p>
     * A URI template containing exactly one variable in <code>${variableName} </code>format. This can only be set for
     * <code>EXTERNAL</code> knowledge bases. For Salesforce and ServiceNow, the variable must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Salesforce: <code>Id</code>, <code>ArticleNumber</code>, <code>VersionNumber</code>, <code>Title</code>,
     * <code>PublishStatus</code>, or <code>IsDeleted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceNow: <code>number</code>, <code>short_description</code>, <code>sys_mod_count</code>,
     * <code>workflow_state</code>, or <code>active</code>
     * </p>
     * </li>
     * </ul>
     * 
     * <pre>
     * <code> &lt;p&gt;The variable is replaced with the actual value for a piece of content when calling &lt;a href=&quot;https://docs.aws.amazon.com/wisdom/latest/APIReference/API_GetContent.html&quot;&gt;GetContent&lt;/a&gt;. &lt;/p&gt; </code>
     * </pre>
     * 
     * @param templateUri
     *        A URI template containing exactly one variable in <code>${variableName} </code>format. This can only be
     *        set for <code>EXTERNAL</code> knowledge bases. For Salesforce and ServiceNow, the variable must be one of
     *        the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Salesforce: <code>Id</code>, <code>ArticleNumber</code>, <code>VersionNumber</code>, <code>Title</code>,
     *        <code>PublishStatus</code>, or <code>IsDeleted</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ServiceNow: <code>number</code>, <code>short_description</code>, <code>sys_mod_count</code>,
     *        <code>workflow_state</code>, or <code>active</code>
     *        </p>
     *        </li>
     *        </ul>
     * 
     *        <pre>
     * <code> &lt;p&gt;The variable is replaced with the actual value for a piece of content when calling &lt;a href=&quot;https://docs.aws.amazon.com/wisdom/latest/APIReference/API_GetContent.html&quot;&gt;GetContent&lt;/a&gt;. &lt;/p&gt; </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenderingConfiguration withTemplateUri(String templateUri) {
        setTemplateUri(templateUri);
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
        if (getTemplateUri() != null)
            sb.append("TemplateUri: ").append(getTemplateUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RenderingConfiguration == false)
            return false;
        RenderingConfiguration other = (RenderingConfiguration) obj;
        if (other.getTemplateUri() == null ^ this.getTemplateUri() == null)
            return false;
        if (other.getTemplateUri() != null && other.getTemplateUri().equals(this.getTemplateUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateUri() == null) ? 0 : getTemplateUri().hashCode());
        return hashCode;
    }

    @Override
    public RenderingConfiguration clone() {
        try {
            return (RenderingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.RenderingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
