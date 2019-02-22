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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/UpdateWebhook" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWebhookRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the AWS CodeBuild project.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * A regular expression used to determine which repository branches are built when a webhook is triggered. If the
     * name of a branch matches the regular expression, then it is built. If <code>branchFilter</code> is empty, then
     * all branches are built.
     * </p>
     * <note>
     * <p>
     * It is recommended that you use <code>filterGroups</code> instead of <code>branchFilter</code>.
     * </p>
     * </note>
     */
    private String branchFilter;
    /**
     * <p>
     * A boolean value that specifies whether the associated GitHub repository's secret token should be updated. If you
     * use Bitbucket for your repository, <code>rotateSecret</code> is ignored.
     * </p>
     */
    private Boolean rotateSecret;
    /**
     * <p>
     * An array of arrays of <code>WebhookFilter</code> objects used to determine if a webhook event can trigger a
     * build. A filter group must pcontain at least one <code>EVENT</code> <code>WebhookFilter</code>.
     * </p>
     */
    private java.util.List<java.util.List<WebhookFilter>> filterGroups;

    /**
     * <p>
     * The name of the AWS CodeBuild project.
     * </p>
     * 
     * @param projectName
     *        The name of the AWS CodeBuild project.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the AWS CodeBuild project.
     * </p>
     * 
     * @return The name of the AWS CodeBuild project.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the AWS CodeBuild project.
     * </p>
     * 
     * @param projectName
     *        The name of the AWS CodeBuild project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebhookRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * A regular expression used to determine which repository branches are built when a webhook is triggered. If the
     * name of a branch matches the regular expression, then it is built. If <code>branchFilter</code> is empty, then
     * all branches are built.
     * </p>
     * <note>
     * <p>
     * It is recommended that you use <code>filterGroups</code> instead of <code>branchFilter</code>.
     * </p>
     * </note>
     * 
     * @param branchFilter
     *        A regular expression used to determine which repository branches are built when a webhook is triggered. If
     *        the name of a branch matches the regular expression, then it is built. If <code>branchFilter</code> is
     *        empty, then all branches are built.</p> <note>
     *        <p>
     *        It is recommended that you use <code>filterGroups</code> instead of <code>branchFilter</code>.
     *        </p>
     */

    public void setBranchFilter(String branchFilter) {
        this.branchFilter = branchFilter;
    }

    /**
     * <p>
     * A regular expression used to determine which repository branches are built when a webhook is triggered. If the
     * name of a branch matches the regular expression, then it is built. If <code>branchFilter</code> is empty, then
     * all branches are built.
     * </p>
     * <note>
     * <p>
     * It is recommended that you use <code>filterGroups</code> instead of <code>branchFilter</code>.
     * </p>
     * </note>
     * 
     * @return A regular expression used to determine which repository branches are built when a webhook is triggered.
     *         If the name of a branch matches the regular expression, then it is built. If <code>branchFilter</code> is
     *         empty, then all branches are built.</p> <note>
     *         <p>
     *         It is recommended that you use <code>filterGroups</code> instead of <code>branchFilter</code>.
     *         </p>
     */

    public String getBranchFilter() {
        return this.branchFilter;
    }

    /**
     * <p>
     * A regular expression used to determine which repository branches are built when a webhook is triggered. If the
     * name of a branch matches the regular expression, then it is built. If <code>branchFilter</code> is empty, then
     * all branches are built.
     * </p>
     * <note>
     * <p>
     * It is recommended that you use <code>filterGroups</code> instead of <code>branchFilter</code>.
     * </p>
     * </note>
     * 
     * @param branchFilter
     *        A regular expression used to determine which repository branches are built when a webhook is triggered. If
     *        the name of a branch matches the regular expression, then it is built. If <code>branchFilter</code> is
     *        empty, then all branches are built.</p> <note>
     *        <p>
     *        It is recommended that you use <code>filterGroups</code> instead of <code>branchFilter</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebhookRequest withBranchFilter(String branchFilter) {
        setBranchFilter(branchFilter);
        return this;
    }

    /**
     * <p>
     * A boolean value that specifies whether the associated GitHub repository's secret token should be updated. If you
     * use Bitbucket for your repository, <code>rotateSecret</code> is ignored.
     * </p>
     * 
     * @param rotateSecret
     *        A boolean value that specifies whether the associated GitHub repository's secret token should be updated.
     *        If you use Bitbucket for your repository, <code>rotateSecret</code> is ignored.
     */

    public void setRotateSecret(Boolean rotateSecret) {
        this.rotateSecret = rotateSecret;
    }

    /**
     * <p>
     * A boolean value that specifies whether the associated GitHub repository's secret token should be updated. If you
     * use Bitbucket for your repository, <code>rotateSecret</code> is ignored.
     * </p>
     * 
     * @return A boolean value that specifies whether the associated GitHub repository's secret token should be updated.
     *         If you use Bitbucket for your repository, <code>rotateSecret</code> is ignored.
     */

    public Boolean getRotateSecret() {
        return this.rotateSecret;
    }

    /**
     * <p>
     * A boolean value that specifies whether the associated GitHub repository's secret token should be updated. If you
     * use Bitbucket for your repository, <code>rotateSecret</code> is ignored.
     * </p>
     * 
     * @param rotateSecret
     *        A boolean value that specifies whether the associated GitHub repository's secret token should be updated.
     *        If you use Bitbucket for your repository, <code>rotateSecret</code> is ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebhookRequest withRotateSecret(Boolean rotateSecret) {
        setRotateSecret(rotateSecret);
        return this;
    }

    /**
     * <p>
     * A boolean value that specifies whether the associated GitHub repository's secret token should be updated. If you
     * use Bitbucket for your repository, <code>rotateSecret</code> is ignored.
     * </p>
     * 
     * @return A boolean value that specifies whether the associated GitHub repository's secret token should be updated.
     *         If you use Bitbucket for your repository, <code>rotateSecret</code> is ignored.
     */

    public Boolean isRotateSecret() {
        return this.rotateSecret;
    }

    /**
     * <p>
     * An array of arrays of <code>WebhookFilter</code> objects used to determine if a webhook event can trigger a
     * build. A filter group must pcontain at least one <code>EVENT</code> <code>WebhookFilter</code>.
     * </p>
     * 
     * @return An array of arrays of <code>WebhookFilter</code> objects used to determine if a webhook event can trigger
     *         a build. A filter group must pcontain at least one <code>EVENT</code> <code>WebhookFilter</code>.
     */

    public java.util.List<java.util.List<WebhookFilter>> getFilterGroups() {
        return filterGroups;
    }

    /**
     * <p>
     * An array of arrays of <code>WebhookFilter</code> objects used to determine if a webhook event can trigger a
     * build. A filter group must pcontain at least one <code>EVENT</code> <code>WebhookFilter</code>.
     * </p>
     * 
     * @param filterGroups
     *        An array of arrays of <code>WebhookFilter</code> objects used to determine if a webhook event can trigger
     *        a build. A filter group must pcontain at least one <code>EVENT</code> <code>WebhookFilter</code>.
     */

    public void setFilterGroups(java.util.Collection<java.util.List<WebhookFilter>> filterGroups) {
        if (filterGroups == null) {
            this.filterGroups = null;
            return;
        }

        this.filterGroups = new java.util.ArrayList<java.util.List<WebhookFilter>>(filterGroups);
    }

    /**
     * <p>
     * An array of arrays of <code>WebhookFilter</code> objects used to determine if a webhook event can trigger a
     * build. A filter group must pcontain at least one <code>EVENT</code> <code>WebhookFilter</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterGroups(java.util.Collection)} or {@link #withFilterGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filterGroups
     *        An array of arrays of <code>WebhookFilter</code> objects used to determine if a webhook event can trigger
     *        a build. A filter group must pcontain at least one <code>EVENT</code> <code>WebhookFilter</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebhookRequest withFilterGroups(java.util.List<WebhookFilter>... filterGroups) {
        if (this.filterGroups == null) {
            setFilterGroups(new java.util.ArrayList<java.util.List<WebhookFilter>>(filterGroups.length));
        }
        for (java.util.List<WebhookFilter> ele : filterGroups) {
            this.filterGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of arrays of <code>WebhookFilter</code> objects used to determine if a webhook event can trigger a
     * build. A filter group must pcontain at least one <code>EVENT</code> <code>WebhookFilter</code>.
     * </p>
     * 
     * @param filterGroups
     *        An array of arrays of <code>WebhookFilter</code> objects used to determine if a webhook event can trigger
     *        a build. A filter group must pcontain at least one <code>EVENT</code> <code>WebhookFilter</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebhookRequest withFilterGroups(java.util.Collection<java.util.List<WebhookFilter>> filterGroups) {
        setFilterGroups(filterGroups);
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
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getBranchFilter() != null)
            sb.append("BranchFilter: ").append(getBranchFilter()).append(",");
        if (getRotateSecret() != null)
            sb.append("RotateSecret: ").append(getRotateSecret()).append(",");
        if (getFilterGroups() != null)
            sb.append("FilterGroups: ").append(getFilterGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWebhookRequest == false)
            return false;
        UpdateWebhookRequest other = (UpdateWebhookRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getBranchFilter() == null ^ this.getBranchFilter() == null)
            return false;
        if (other.getBranchFilter() != null && other.getBranchFilter().equals(this.getBranchFilter()) == false)
            return false;
        if (other.getRotateSecret() == null ^ this.getRotateSecret() == null)
            return false;
        if (other.getRotateSecret() != null && other.getRotateSecret().equals(this.getRotateSecret()) == false)
            return false;
        if (other.getFilterGroups() == null ^ this.getFilterGroups() == null)
            return false;
        if (other.getFilterGroups() != null && other.getFilterGroups().equals(this.getFilterGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getBranchFilter() == null) ? 0 : getBranchFilter().hashCode());
        hashCode = prime * hashCode + ((getRotateSecret() == null) ? 0 : getRotateSecret().hashCode());
        hashCode = prime * hashCode + ((getFilterGroups() == null) ? 0 : getFilterGroups().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWebhookRequest clone() {
        return (UpdateWebhookRequest) super.clone();
    }

}
