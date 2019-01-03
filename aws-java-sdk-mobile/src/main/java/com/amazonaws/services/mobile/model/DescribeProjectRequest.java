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
package com.amazonaws.services.mobile.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request structure used to request details about a project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/DescribeProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique project identifier.
     * </p>
     */
    private String projectId;
    /**
     * <p>
     * If set to true, causes AWS Mobile Hub to synchronize information from other services, e.g., update state of AWS
     * CloudFormation stacks in the AWS Mobile Hub project.
     * </p>
     */
    private Boolean syncFromResources;

    /**
     * <p>
     * Unique project identifier.
     * </p>
     * 
     * @param projectId
     *        Unique project identifier.
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * Unique project identifier.
     * </p>
     * 
     * @return Unique project identifier.
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * <p>
     * Unique project identifier.
     * </p>
     * 
     * @param projectId
     *        Unique project identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectRequest withProjectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * <p>
     * If set to true, causes AWS Mobile Hub to synchronize information from other services, e.g., update state of AWS
     * CloudFormation stacks in the AWS Mobile Hub project.
     * </p>
     * 
     * @param syncFromResources
     *        If set to true, causes AWS Mobile Hub to synchronize information from other services, e.g., update state
     *        of AWS CloudFormation stacks in the AWS Mobile Hub project.
     */

    public void setSyncFromResources(Boolean syncFromResources) {
        this.syncFromResources = syncFromResources;
    }

    /**
     * <p>
     * If set to true, causes AWS Mobile Hub to synchronize information from other services, e.g., update state of AWS
     * CloudFormation stacks in the AWS Mobile Hub project.
     * </p>
     * 
     * @return If set to true, causes AWS Mobile Hub to synchronize information from other services, e.g., update state
     *         of AWS CloudFormation stacks in the AWS Mobile Hub project.
     */

    public Boolean getSyncFromResources() {
        return this.syncFromResources;
    }

    /**
     * <p>
     * If set to true, causes AWS Mobile Hub to synchronize information from other services, e.g., update state of AWS
     * CloudFormation stacks in the AWS Mobile Hub project.
     * </p>
     * 
     * @param syncFromResources
     *        If set to true, causes AWS Mobile Hub to synchronize information from other services, e.g., update state
     *        of AWS CloudFormation stacks in the AWS Mobile Hub project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectRequest withSyncFromResources(Boolean syncFromResources) {
        setSyncFromResources(syncFromResources);
        return this;
    }

    /**
     * <p>
     * If set to true, causes AWS Mobile Hub to synchronize information from other services, e.g., update state of AWS
     * CloudFormation stacks in the AWS Mobile Hub project.
     * </p>
     * 
     * @return If set to true, causes AWS Mobile Hub to synchronize information from other services, e.g., update state
     *         of AWS CloudFormation stacks in the AWS Mobile Hub project.
     */

    public Boolean isSyncFromResources() {
        return this.syncFromResources;
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
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getSyncFromResources() != null)
            sb.append("SyncFromResources: ").append(getSyncFromResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProjectRequest == false)
            return false;
        DescribeProjectRequest other = (DescribeProjectRequest) obj;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getSyncFromResources() == null ^ this.getSyncFromResources() == null)
            return false;
        if (other.getSyncFromResources() != null && other.getSyncFromResources().equals(this.getSyncFromResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getSyncFromResources() == null) ? 0 : getSyncFromResources().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProjectRequest clone() {
        return (DescribeProjectRequest) super.clone();
    }

}
