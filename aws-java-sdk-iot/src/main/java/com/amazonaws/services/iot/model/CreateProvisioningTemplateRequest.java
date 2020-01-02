/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProvisioningTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the fleet provisioning template.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The description of the fleet provisioning template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The JSON formatted contents of the fleet provisioning template.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * True to enable the fleet provisioning template, otherwise false.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The role ARN for the role associated with the fleet provisioning template. This IoT role grants permission to
     * provision a device.
     * </p>
     */
    private String provisioningRoleArn;
    /**
     * <p>
     * Metadata which can be used to manage the fleet provisioning template.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the fleet provisioning template.
     * </p>
     * 
     * @param templateName
     *        The name of the fleet provisioning template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the fleet provisioning template.
     * </p>
     * 
     * @return The name of the fleet provisioning template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the fleet provisioning template.
     * </p>
     * 
     * @param templateName
     *        The name of the fleet provisioning template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisioningTemplateRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The description of the fleet provisioning template.
     * </p>
     * 
     * @param description
     *        The description of the fleet provisioning template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the fleet provisioning template.
     * </p>
     * 
     * @return The description of the fleet provisioning template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the fleet provisioning template.
     * </p>
     * 
     * @param description
     *        The description of the fleet provisioning template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisioningTemplateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The JSON formatted contents of the fleet provisioning template.
     * </p>
     * 
     * @param templateBody
     *        The JSON formatted contents of the fleet provisioning template.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The JSON formatted contents of the fleet provisioning template.
     * </p>
     * 
     * @return The JSON formatted contents of the fleet provisioning template.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * The JSON formatted contents of the fleet provisioning template.
     * </p>
     * 
     * @param templateBody
     *        The JSON formatted contents of the fleet provisioning template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisioningTemplateRequest withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * True to enable the fleet provisioning template, otherwise false.
     * </p>
     * 
     * @param enabled
     *        True to enable the fleet provisioning template, otherwise false.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * True to enable the fleet provisioning template, otherwise false.
     * </p>
     * 
     * @return True to enable the fleet provisioning template, otherwise false.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * True to enable the fleet provisioning template, otherwise false.
     * </p>
     * 
     * @param enabled
     *        True to enable the fleet provisioning template, otherwise false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisioningTemplateRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * True to enable the fleet provisioning template, otherwise false.
     * </p>
     * 
     * @return True to enable the fleet provisioning template, otherwise false.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The role ARN for the role associated with the fleet provisioning template. This IoT role grants permission to
     * provision a device.
     * </p>
     * 
     * @param provisioningRoleArn
     *        The role ARN for the role associated with the fleet provisioning template. This IoT role grants permission
     *        to provision a device.
     */

    public void setProvisioningRoleArn(String provisioningRoleArn) {
        this.provisioningRoleArn = provisioningRoleArn;
    }

    /**
     * <p>
     * The role ARN for the role associated with the fleet provisioning template. This IoT role grants permission to
     * provision a device.
     * </p>
     * 
     * @return The role ARN for the role associated with the fleet provisioning template. This IoT role grants
     *         permission to provision a device.
     */

    public String getProvisioningRoleArn() {
        return this.provisioningRoleArn;
    }

    /**
     * <p>
     * The role ARN for the role associated with the fleet provisioning template. This IoT role grants permission to
     * provision a device.
     * </p>
     * 
     * @param provisioningRoleArn
     *        The role ARN for the role associated with the fleet provisioning template. This IoT role grants permission
     *        to provision a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisioningTemplateRequest withProvisioningRoleArn(String provisioningRoleArn) {
        setProvisioningRoleArn(provisioningRoleArn);
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the fleet provisioning template.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * 
     * @return Metadata which can be used to manage the fleet provisioning template.</p> <note>
     *         <p>
     *         For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *         </p>
     *         <p>
     *         For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     *         </p>
     *         <p>
     *         For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the fleet provisioning template.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * 
     * @param tags
     *        Metadata which can be used to manage the fleet provisioning template.</p> <note>
     *        <p>
     *        For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *        </p>
     *        <p>
     *        For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     *        </p>
     *        <p>
     *        For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *        </p>
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata which can be used to manage the fleet provisioning template.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the fleet provisioning template.</p> <note>
     *        <p>
     *        For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *        </p>
     *        <p>
     *        For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     *        </p>
     *        <p>
     *        For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisioningTemplateRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the fleet provisioning template.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * 
     * @param tags
     *        Metadata which can be used to manage the fleet provisioning template.</p> <note>
     *        <p>
     *        For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *        </p>
     *        <p>
     *        For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..."
     *        </p>
     *        <p>
     *        For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisioningTemplateRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getProvisioningRoleArn() != null)
            sb.append("ProvisioningRoleArn: ").append(getProvisioningRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProvisioningTemplateRequest == false)
            return false;
        CreateProvisioningTemplateRequest other = (CreateProvisioningTemplateRequest) obj;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getProvisioningRoleArn() == null ^ this.getProvisioningRoleArn() == null)
            return false;
        if (other.getProvisioningRoleArn() != null && other.getProvisioningRoleArn().equals(this.getProvisioningRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getProvisioningRoleArn() == null) ? 0 : getProvisioningRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateProvisioningTemplateRequest clone() {
        return (CreateProvisioningTemplateRequest) super.clone();
    }

}
