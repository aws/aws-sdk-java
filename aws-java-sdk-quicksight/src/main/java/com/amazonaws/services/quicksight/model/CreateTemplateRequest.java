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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your
     * Amazon QuickSight account.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * An ID for the template that you want to create. This template is unique per AWS Region in each AWS account.
     * </p>
     */
    private String templateId;
    /**
     * <p>
     * A display name for the template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of resource permissions to be set on the template.
     * </p>
     */
    private java.util.List<ResourcePermission> permissions;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source entity from which this template is being created. Currently, you can
     * create a template from an analysis or another template. If the ARN is for an analysis, include its dataset
     * references.
     * </p>
     */
    private TemplateSourceEntity sourceEntity;
    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the resource.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A description of the current template version being created. This API operation creates the first version of the
     * template. Every time <code>UpdateTemplate</code> is called, a new version is created. Each version of the
     * template maintains a description of the version in the <code>VersionDescription</code> field.
     * </p>
     */
    private String versionDescription;

    /**
     * <p>
     * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your
     * Amazon QuickSight account.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that
     *        contains your Amazon QuickSight account.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your
     * Amazon QuickSight account.
     * </p>
     * 
     * @return The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that
     *         contains your Amazon QuickSight account.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your
     * Amazon QuickSight account.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that
     *        contains your Amazon QuickSight account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * An ID for the template that you want to create. This template is unique per AWS Region in each AWS account.
     * </p>
     * 
     * @param templateId
     *        An ID for the template that you want to create. This template is unique per AWS Region in each AWS
     *        account.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * An ID for the template that you want to create. This template is unique per AWS Region in each AWS account.
     * </p>
     * 
     * @return An ID for the template that you want to create. This template is unique per AWS Region in each AWS
     *         account.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * An ID for the template that you want to create. This template is unique per AWS Region in each AWS account.
     * </p>
     * 
     * @param templateId
     *        An ID for the template that you want to create. This template is unique per AWS Region in each AWS
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withTemplateId(String templateId) {
        setTemplateId(templateId);
        return this;
    }

    /**
     * <p>
     * A display name for the template.
     * </p>
     * 
     * @param name
     *        A display name for the template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A display name for the template.
     * </p>
     * 
     * @return A display name for the template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A display name for the template.
     * </p>
     * 
     * @param name
     *        A display name for the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of resource permissions to be set on the template.
     * </p>
     * 
     * @return A list of resource permissions to be set on the template.
     */

    public java.util.List<ResourcePermission> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * A list of resource permissions to be set on the template.
     * </p>
     * 
     * @param permissions
     *        A list of resource permissions to be set on the template.
     */

    public void setPermissions(java.util.Collection<ResourcePermission> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<ResourcePermission>(permissions);
    }

    /**
     * <p>
     * A list of resource permissions to be set on the template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        A list of resource permissions to be set on the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withPermissions(ResourcePermission... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<ResourcePermission>(permissions.length));
        }
        for (ResourcePermission ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of resource permissions to be set on the template.
     * </p>
     * 
     * @param permissions
     *        A list of resource permissions to be set on the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withPermissions(java.util.Collection<ResourcePermission> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source entity from which this template is being created. Currently, you can
     * create a template from an analysis or another template. If the ARN is for an analysis, include its dataset
     * references.
     * </p>
     * 
     * @param sourceEntity
     *        The Amazon Resource Name (ARN) of the source entity from which this template is being created. Currently,
     *        you can create a template from an analysis or another template. If the ARN is for an analysis, include its
     *        dataset references.
     */

    public void setSourceEntity(TemplateSourceEntity sourceEntity) {
        this.sourceEntity = sourceEntity;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source entity from which this template is being created. Currently, you can
     * create a template from an analysis or another template. If the ARN is for an analysis, include its dataset
     * references.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source entity from which this template is being created. Currently,
     *         you can create a template from an analysis or another template. If the ARN is for an analysis, include
     *         its dataset references.
     */

    public TemplateSourceEntity getSourceEntity() {
        return this.sourceEntity;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source entity from which this template is being created. Currently, you can
     * create a template from an analysis or another template. If the ARN is for an analysis, include its dataset
     * references.
     * </p>
     * 
     * @param sourceEntity
     *        The Amazon Resource Name (ARN) of the source entity from which this template is being created. Currently,
     *        you can create a template from an analysis or another template. If the ARN is for an analysis, include its
     *        dataset references.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withSourceEntity(TemplateSourceEntity sourceEntity) {
        setSourceEntity(sourceEntity);
        return this;
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the resource.
     * </p>
     * 
     * @return Contains a map of the key-value pairs for the resource tag or tags assigned to the resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the resource.
     * </p>
     * 
     * @param tags
     *        Contains a map of the key-value pairs for the resource tag or tags assigned to the resource.
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
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Contains a map of the key-value pairs for the resource tag or tags assigned to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withTags(Tag... tags) {
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
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the resource.
     * </p>
     * 
     * @param tags
     *        Contains a map of the key-value pairs for the resource tag or tags assigned to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A description of the current template version being created. This API operation creates the first version of the
     * template. Every time <code>UpdateTemplate</code> is called, a new version is created. Each version of the
     * template maintains a description of the version in the <code>VersionDescription</code> field.
     * </p>
     * 
     * @param versionDescription
     *        A description of the current template version being created. This API operation creates the first version
     *        of the template. Every time <code>UpdateTemplate</code> is called, a new version is created. Each version
     *        of the template maintains a description of the version in the <code>VersionDescription</code> field.
     */

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * A description of the current template version being created. This API operation creates the first version of the
     * template. Every time <code>UpdateTemplate</code> is called, a new version is created. Each version of the
     * template maintains a description of the version in the <code>VersionDescription</code> field.
     * </p>
     * 
     * @return A description of the current template version being created. This API operation creates the first version
     *         of the template. Every time <code>UpdateTemplate</code> is called, a new version is created. Each version
     *         of the template maintains a description of the version in the <code>VersionDescription</code> field.
     */

    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * <p>
     * A description of the current template version being created. This API operation creates the first version of the
     * template. Every time <code>UpdateTemplate</code> is called, a new version is created. Each version of the
     * template maintains a description of the version in the <code>VersionDescription</code> field.
     * </p>
     * 
     * @param versionDescription
     *        A description of the current template version being created. This API operation creates the first version
     *        of the template. Every time <code>UpdateTemplate</code> is called, a new version is created. Each version
     *        of the template maintains a description of the version in the <code>VersionDescription</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withVersionDescription(String versionDescription) {
        setVersionDescription(versionDescription);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getSourceEntity() != null)
            sb.append("SourceEntity: ").append(getSourceEntity()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVersionDescription() != null)
            sb.append("VersionDescription: ").append(getVersionDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTemplateRequest == false)
            return false;
        CreateTemplateRequest other = (CreateTemplateRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getSourceEntity() == null ^ this.getSourceEntity() == null)
            return false;
        if (other.getSourceEntity() != null && other.getSourceEntity().equals(this.getSourceEntity()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVersionDescription() == null ^ this.getVersionDescription() == null)
            return false;
        if (other.getVersionDescription() != null && other.getVersionDescription().equals(this.getVersionDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getSourceEntity() == null) ? 0 : getSourceEntity().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreateTemplateRequest clone() {
        return (CreateTemplateRequest) super.clone();
    }

}
