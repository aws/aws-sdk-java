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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input to the SetVisibleToAllUsers action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/SetVisibleToAllUsers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetVisibleToAllUsersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifiers of the job flows to receive the new visibility setting.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> jobFlowIds;
    /**
     * <p>
     * Whether the specified clusters are visible to all IAM users of the AWS account associated with the cluster. If
     * this value is set to True, all IAM users of that AWS account can view and, if they have the proper IAM policy
     * permissions set, manage the clusters. If it is set to False, only the IAM user that created a cluster can view
     * and manage it.
     * </p>
     */
    private Boolean visibleToAllUsers;

    /**
     * <p>
     * Identifiers of the job flows to receive the new visibility setting.
     * </p>
     * 
     * @return Identifiers of the job flows to receive the new visibility setting.
     */

    public java.util.List<String> getJobFlowIds() {
        if (jobFlowIds == null) {
            jobFlowIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return jobFlowIds;
    }

    /**
     * <p>
     * Identifiers of the job flows to receive the new visibility setting.
     * </p>
     * 
     * @param jobFlowIds
     *        Identifiers of the job flows to receive the new visibility setting.
     */

    public void setJobFlowIds(java.util.Collection<String> jobFlowIds) {
        if (jobFlowIds == null) {
            this.jobFlowIds = null;
            return;
        }

        this.jobFlowIds = new com.amazonaws.internal.SdkInternalList<String>(jobFlowIds);
    }

    /**
     * <p>
     * Identifiers of the job flows to receive the new visibility setting.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobFlowIds(java.util.Collection)} or {@link #withJobFlowIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param jobFlowIds
     *        Identifiers of the job flows to receive the new visibility setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetVisibleToAllUsersRequest withJobFlowIds(String... jobFlowIds) {
        if (this.jobFlowIds == null) {
            setJobFlowIds(new com.amazonaws.internal.SdkInternalList<String>(jobFlowIds.length));
        }
        for (String ele : jobFlowIds) {
            this.jobFlowIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Identifiers of the job flows to receive the new visibility setting.
     * </p>
     * 
     * @param jobFlowIds
     *        Identifiers of the job flows to receive the new visibility setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetVisibleToAllUsersRequest withJobFlowIds(java.util.Collection<String> jobFlowIds) {
        setJobFlowIds(jobFlowIds);
        return this;
    }

    /**
     * <p>
     * Whether the specified clusters are visible to all IAM users of the AWS account associated with the cluster. If
     * this value is set to True, all IAM users of that AWS account can view and, if they have the proper IAM policy
     * permissions set, manage the clusters. If it is set to False, only the IAM user that created a cluster can view
     * and manage it.
     * </p>
     * 
     * @param visibleToAllUsers
     *        Whether the specified clusters are visible to all IAM users of the AWS account associated with the
     *        cluster. If this value is set to True, all IAM users of that AWS account can view and, if they have the
     *        proper IAM policy permissions set, manage the clusters. If it is set to False, only the IAM user that
     *        created a cluster can view and manage it.
     */

    public void setVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
    }

    /**
     * <p>
     * Whether the specified clusters are visible to all IAM users of the AWS account associated with the cluster. If
     * this value is set to True, all IAM users of that AWS account can view and, if they have the proper IAM policy
     * permissions set, manage the clusters. If it is set to False, only the IAM user that created a cluster can view
     * and manage it.
     * </p>
     * 
     * @return Whether the specified clusters are visible to all IAM users of the AWS account associated with the
     *         cluster. If this value is set to True, all IAM users of that AWS account can view and, if they have the
     *         proper IAM policy permissions set, manage the clusters. If it is set to False, only the IAM user that
     *         created a cluster can view and manage it.
     */

    public Boolean getVisibleToAllUsers() {
        return this.visibleToAllUsers;
    }

    /**
     * <p>
     * Whether the specified clusters are visible to all IAM users of the AWS account associated with the cluster. If
     * this value is set to True, all IAM users of that AWS account can view and, if they have the proper IAM policy
     * permissions set, manage the clusters. If it is set to False, only the IAM user that created a cluster can view
     * and manage it.
     * </p>
     * 
     * @param visibleToAllUsers
     *        Whether the specified clusters are visible to all IAM users of the AWS account associated with the
     *        cluster. If this value is set to True, all IAM users of that AWS account can view and, if they have the
     *        proper IAM policy permissions set, manage the clusters. If it is set to False, only the IAM user that
     *        created a cluster can view and manage it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetVisibleToAllUsersRequest withVisibleToAllUsers(Boolean visibleToAllUsers) {
        setVisibleToAllUsers(visibleToAllUsers);
        return this;
    }

    /**
     * <p>
     * Whether the specified clusters are visible to all IAM users of the AWS account associated with the cluster. If
     * this value is set to True, all IAM users of that AWS account can view and, if they have the proper IAM policy
     * permissions set, manage the clusters. If it is set to False, only the IAM user that created a cluster can view
     * and manage it.
     * </p>
     * 
     * @return Whether the specified clusters are visible to all IAM users of the AWS account associated with the
     *         cluster. If this value is set to True, all IAM users of that AWS account can view and, if they have the
     *         proper IAM policy permissions set, manage the clusters. If it is set to False, only the IAM user that
     *         created a cluster can view and manage it.
     */

    public Boolean isVisibleToAllUsers() {
        return this.visibleToAllUsers;
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
        if (getJobFlowIds() != null)
            sb.append("JobFlowIds: ").append(getJobFlowIds()).append(",");
        if (getVisibleToAllUsers() != null)
            sb.append("VisibleToAllUsers: ").append(getVisibleToAllUsers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetVisibleToAllUsersRequest == false)
            return false;
        SetVisibleToAllUsersRequest other = (SetVisibleToAllUsersRequest) obj;
        if (other.getJobFlowIds() == null ^ this.getJobFlowIds() == null)
            return false;
        if (other.getJobFlowIds() != null && other.getJobFlowIds().equals(this.getJobFlowIds()) == false)
            return false;
        if (other.getVisibleToAllUsers() == null ^ this.getVisibleToAllUsers() == null)
            return false;
        if (other.getVisibleToAllUsers() != null && other.getVisibleToAllUsers().equals(this.getVisibleToAllUsers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobFlowIds() == null) ? 0 : getJobFlowIds().hashCode());
        hashCode = prime * hashCode + ((getVisibleToAllUsers() == null) ? 0 : getVisibleToAllUsers().hashCode());
        return hashCode;
    }

    @Override
    public SetVisibleToAllUsersRequest clone() {
        return (SetVisibleToAllUsersRequest) super.clone();
    }

}
