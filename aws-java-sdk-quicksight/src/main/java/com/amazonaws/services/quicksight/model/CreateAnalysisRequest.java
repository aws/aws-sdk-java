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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateAnalysis" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAnalysisRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS account where you are creating an analysis.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID for the analysis that you're creating. This ID displays in the URL of the analysis.
     * </p>
     */
    private String analysisId;
    /**
     * <p>
     * A descriptive name for the analysis that you're creating. This name displays for the analysis in the QuickSight
     * console.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The parameter names and override values that you want to use. An analysis can have any parameter type, and some
     * parameters might accept multiple values.
     * </p>
     */
    private Parameters parameters;
    /**
     * <p>
     * A structure that describes the principals and the resource-level permissions on an analysis. You can use the
     * <code>Permissions</code> structure to grant permissions by providing a list of AWS Identity and Access Management
     * (IAM) action information for each principal listed by Amazon Resource Name (ARN).
     * </p>
     * <p>
     * To specify no permissions, omit <code>Permissions</code>.
     * </p>
     */
    private java.util.List<ResourcePermission> permissions;
    /**
     * <p>
     * A source entity to use for the analysis that you're creating. This metadata structure contains details that
     * describe a source template and one or more datasets.
     * </p>
     */
    private AnalysisSourceEntity sourceEntity;
    /**
     * <p>
     * The ARN for the theme to apply to the analysis that you're creating. To see the theme in the QuickSight console,
     * make sure that you have access to it.
     * </p>
     */
    private String themeArn;
    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the analysis.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the AWS account where you are creating an analysis.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account where you are creating an analysis.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account where you are creating an analysis.
     * </p>
     * 
     * @return The ID of the AWS account where you are creating an analysis.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account where you are creating an analysis.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account where you are creating an analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalysisRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID for the analysis that you're creating. This ID displays in the URL of the analysis.
     * </p>
     * 
     * @param analysisId
     *        The ID for the analysis that you're creating. This ID displays in the URL of the analysis.
     */

    public void setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
    }

    /**
     * <p>
     * The ID for the analysis that you're creating. This ID displays in the URL of the analysis.
     * </p>
     * 
     * @return The ID for the analysis that you're creating. This ID displays in the URL of the analysis.
     */

    public String getAnalysisId() {
        return this.analysisId;
    }

    /**
     * <p>
     * The ID for the analysis that you're creating. This ID displays in the URL of the analysis.
     * </p>
     * 
     * @param analysisId
     *        The ID for the analysis that you're creating. This ID displays in the URL of the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalysisRequest withAnalysisId(String analysisId) {
        setAnalysisId(analysisId);
        return this;
    }

    /**
     * <p>
     * A descriptive name for the analysis that you're creating. This name displays for the analysis in the QuickSight
     * console.
     * </p>
     * 
     * @param name
     *        A descriptive name for the analysis that you're creating. This name displays for the analysis in the
     *        QuickSight console.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive name for the analysis that you're creating. This name displays for the analysis in the QuickSight
     * console.
     * </p>
     * 
     * @return A descriptive name for the analysis that you're creating. This name displays for the analysis in the
     *         QuickSight console.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive name for the analysis that you're creating. This name displays for the analysis in the QuickSight
     * console.
     * </p>
     * 
     * @param name
     *        A descriptive name for the analysis that you're creating. This name displays for the analysis in the
     *        QuickSight console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalysisRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The parameter names and override values that you want to use. An analysis can have any parameter type, and some
     * parameters might accept multiple values.
     * </p>
     * 
     * @param parameters
     *        The parameter names and override values that you want to use. An analysis can have any parameter type, and
     *        some parameters might accept multiple values.
     */

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameter names and override values that you want to use. An analysis can have any parameter type, and some
     * parameters might accept multiple values.
     * </p>
     * 
     * @return The parameter names and override values that you want to use. An analysis can have any parameter type,
     *         and some parameters might accept multiple values.
     */

    public Parameters getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * The parameter names and override values that you want to use. An analysis can have any parameter type, and some
     * parameters might accept multiple values.
     * </p>
     * 
     * @param parameters
     *        The parameter names and override values that you want to use. An analysis can have any parameter type, and
     *        some parameters might accept multiple values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalysisRequest withParameters(Parameters parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * A structure that describes the principals and the resource-level permissions on an analysis. You can use the
     * <code>Permissions</code> structure to grant permissions by providing a list of AWS Identity and Access Management
     * (IAM) action information for each principal listed by Amazon Resource Name (ARN).
     * </p>
     * <p>
     * To specify no permissions, omit <code>Permissions</code>.
     * </p>
     * 
     * @return A structure that describes the principals and the resource-level permissions on an analysis. You can use
     *         the <code>Permissions</code> structure to grant permissions by providing a list of AWS Identity and
     *         Access Management (IAM) action information for each principal listed by Amazon Resource Name (ARN). </p>
     *         <p>
     *         To specify no permissions, omit <code>Permissions</code>.
     */

    public java.util.List<ResourcePermission> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * A structure that describes the principals and the resource-level permissions on an analysis. You can use the
     * <code>Permissions</code> structure to grant permissions by providing a list of AWS Identity and Access Management
     * (IAM) action information for each principal listed by Amazon Resource Name (ARN).
     * </p>
     * <p>
     * To specify no permissions, omit <code>Permissions</code>.
     * </p>
     * 
     * @param permissions
     *        A structure that describes the principals and the resource-level permissions on an analysis. You can use
     *        the <code>Permissions</code> structure to grant permissions by providing a list of AWS Identity and Access
     *        Management (IAM) action information for each principal listed by Amazon Resource Name (ARN). </p>
     *        <p>
     *        To specify no permissions, omit <code>Permissions</code>.
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
     * A structure that describes the principals and the resource-level permissions on an analysis. You can use the
     * <code>Permissions</code> structure to grant permissions by providing a list of AWS Identity and Access Management
     * (IAM) action information for each principal listed by Amazon Resource Name (ARN).
     * </p>
     * <p>
     * To specify no permissions, omit <code>Permissions</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        A structure that describes the principals and the resource-level permissions on an analysis. You can use
     *        the <code>Permissions</code> structure to grant permissions by providing a list of AWS Identity and Access
     *        Management (IAM) action information for each principal listed by Amazon Resource Name (ARN). </p>
     *        <p>
     *        To specify no permissions, omit <code>Permissions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalysisRequest withPermissions(ResourcePermission... permissions) {
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
     * A structure that describes the principals and the resource-level permissions on an analysis. You can use the
     * <code>Permissions</code> structure to grant permissions by providing a list of AWS Identity and Access Management
     * (IAM) action information for each principal listed by Amazon Resource Name (ARN).
     * </p>
     * <p>
     * To specify no permissions, omit <code>Permissions</code>.
     * </p>
     * 
     * @param permissions
     *        A structure that describes the principals and the resource-level permissions on an analysis. You can use
     *        the <code>Permissions</code> structure to grant permissions by providing a list of AWS Identity and Access
     *        Management (IAM) action information for each principal listed by Amazon Resource Name (ARN). </p>
     *        <p>
     *        To specify no permissions, omit <code>Permissions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalysisRequest withPermissions(java.util.Collection<ResourcePermission> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * A source entity to use for the analysis that you're creating. This metadata structure contains details that
     * describe a source template and one or more datasets.
     * </p>
     * 
     * @param sourceEntity
     *        A source entity to use for the analysis that you're creating. This metadata structure contains details
     *        that describe a source template and one or more datasets.
     */

    public void setSourceEntity(AnalysisSourceEntity sourceEntity) {
        this.sourceEntity = sourceEntity;
    }

    /**
     * <p>
     * A source entity to use for the analysis that you're creating. This metadata structure contains details that
     * describe a source template and one or more datasets.
     * </p>
     * 
     * @return A source entity to use for the analysis that you're creating. This metadata structure contains details
     *         that describe a source template and one or more datasets.
     */

    public AnalysisSourceEntity getSourceEntity() {
        return this.sourceEntity;
    }

    /**
     * <p>
     * A source entity to use for the analysis that you're creating. This metadata structure contains details that
     * describe a source template and one or more datasets.
     * </p>
     * 
     * @param sourceEntity
     *        A source entity to use for the analysis that you're creating. This metadata structure contains details
     *        that describe a source template and one or more datasets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalysisRequest withSourceEntity(AnalysisSourceEntity sourceEntity) {
        setSourceEntity(sourceEntity);
        return this;
    }

    /**
     * <p>
     * The ARN for the theme to apply to the analysis that you're creating. To see the theme in the QuickSight console,
     * make sure that you have access to it.
     * </p>
     * 
     * @param themeArn
     *        The ARN for the theme to apply to the analysis that you're creating. To see the theme in the QuickSight
     *        console, make sure that you have access to it.
     */

    public void setThemeArn(String themeArn) {
        this.themeArn = themeArn;
    }

    /**
     * <p>
     * The ARN for the theme to apply to the analysis that you're creating. To see the theme in the QuickSight console,
     * make sure that you have access to it.
     * </p>
     * 
     * @return The ARN for the theme to apply to the analysis that you're creating. To see the theme in the QuickSight
     *         console, make sure that you have access to it.
     */

    public String getThemeArn() {
        return this.themeArn;
    }

    /**
     * <p>
     * The ARN for the theme to apply to the analysis that you're creating. To see the theme in the QuickSight console,
     * make sure that you have access to it.
     * </p>
     * 
     * @param themeArn
     *        The ARN for the theme to apply to the analysis that you're creating. To see the theme in the QuickSight
     *        console, make sure that you have access to it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalysisRequest withThemeArn(String themeArn) {
        setThemeArn(themeArn);
        return this;
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the analysis.
     * </p>
     * 
     * @return Contains a map of the key-value pairs for the resource tag or tags assigned to the analysis.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the analysis.
     * </p>
     * 
     * @param tags
     *        Contains a map of the key-value pairs for the resource tag or tags assigned to the analysis.
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
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the analysis.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Contains a map of the key-value pairs for the resource tag or tags assigned to the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalysisRequest withTags(Tag... tags) {
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
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the analysis.
     * </p>
     * 
     * @param tags
     *        Contains a map of the key-value pairs for the resource tag or tags assigned to the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnalysisRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getAnalysisId() != null)
            sb.append("AnalysisId: ").append(getAnalysisId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getSourceEntity() != null)
            sb.append("SourceEntity: ").append(getSourceEntity()).append(",");
        if (getThemeArn() != null)
            sb.append("ThemeArn: ").append(getThemeArn()).append(",");
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

        if (obj instanceof CreateAnalysisRequest == false)
            return false;
        CreateAnalysisRequest other = (CreateAnalysisRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAnalysisId() == null ^ this.getAnalysisId() == null)
            return false;
        if (other.getAnalysisId() != null && other.getAnalysisId().equals(this.getAnalysisId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getSourceEntity() == null ^ this.getSourceEntity() == null)
            return false;
        if (other.getSourceEntity() != null && other.getSourceEntity().equals(this.getSourceEntity()) == false)
            return false;
        if (other.getThemeArn() == null ^ this.getThemeArn() == null)
            return false;
        if (other.getThemeArn() != null && other.getThemeArn().equals(this.getThemeArn()) == false)
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

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAnalysisId() == null) ? 0 : getAnalysisId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getSourceEntity() == null) ? 0 : getSourceEntity().hashCode());
        hashCode = prime * hashCode + ((getThemeArn() == null) ? 0 : getThemeArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAnalysisRequest clone() {
        return (CreateAnalysisRequest) super.clone();
    }

}
