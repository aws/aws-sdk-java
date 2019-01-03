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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/CreateWebhook" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWebhookRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     */
    private String branchFilter;

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

    public CreateWebhookRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * A regular expression used to determine which repository branches are built when a webhook is triggered. If the
     * name of a branch matches the regular expression, then it is built. If <code>branchFilter</code> is empty, then
     * all branches are built.
     * </p>
     * 
     * @param branchFilter
     *        A regular expression used to determine which repository branches are built when a webhook is triggered. If
     *        the name of a branch matches the regular expression, then it is built. If <code>branchFilter</code> is
     *        empty, then all branches are built.
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
     * 
     * @return A regular expression used to determine which repository branches are built when a webhook is triggered.
     *         If the name of a branch matches the regular expression, then it is built. If <code>branchFilter</code> is
     *         empty, then all branches are built.
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
     * 
     * @param branchFilter
     *        A regular expression used to determine which repository branches are built when a webhook is triggered. If
     *        the name of a branch matches the regular expression, then it is built. If <code>branchFilter</code> is
     *        empty, then all branches are built.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWebhookRequest withBranchFilter(String branchFilter) {
        setBranchFilter(branchFilter);
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
            sb.append("BranchFilter: ").append(getBranchFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWebhookRequest == false)
            return false;
        CreateWebhookRequest other = (CreateWebhookRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getBranchFilter() == null ^ this.getBranchFilter() == null)
            return false;
        if (other.getBranchFilter() != null && other.getBranchFilter().equals(this.getBranchFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getBranchFilter() == null) ? 0 : getBranchFilter().hashCode());
        return hashCode;
    }

    @Override
    public CreateWebhookRequest clone() {
        return (CreateWebhookRequest) super.clone();
    }

}
