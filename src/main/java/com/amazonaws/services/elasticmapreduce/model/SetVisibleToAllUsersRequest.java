/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticmapreduce.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#setVisibleToAllUsers(SetVisibleToAllUsersRequest) SetVisibleToAllUsers operation}.
 * <p>
 * Sets whether all AWS Identity and Access Management (IAM) users under your account can access the specifed job flows. This action works on running job
 * flows. You can also set the visibility of a job flow when you launch it using the <code>VisibleToAllUsers</code> parameter of RunJobFlow. The
 * SetVisibleToAllUsers action can be called only by an IAM user who created the job flow or the AWS account that owns the job flow.
 * </p>
 *
 * @see com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#setVisibleToAllUsers(SetVisibleToAllUsersRequest)
 */
public class SetVisibleToAllUsersRequest extends AmazonWebServiceRequest {

    /**
     * Identifiers of the job flows to receive the new visibility setting.
     */
    private java.util.List<String> jobFlowIds;

    /**
     * Whether the specified job flows are visible to all IAM users of the
     * AWS account associated with the job flow. If this value is set to
     * True, all IAM users of that AWS account can view and, if they have the
     * proper IAM policy permissions set, manage the job flows. If it is set
     * to False, only the IAM user that created a job flow can view and
     * manage it.
     */
    private Boolean visibleToAllUsers;

    /**
     * Identifiers of the job flows to receive the new visibility setting.
     *
     * @return Identifiers of the job flows to receive the new visibility setting.
     */
    public java.util.List<String> getJobFlowIds() {
        
        if (jobFlowIds == null) {
            jobFlowIds = new java.util.ArrayList<String>();
        }
        return jobFlowIds;
    }
    
    /**
     * Identifiers of the job flows to receive the new visibility setting.
     *
     * @param jobFlowIds Identifiers of the job flows to receive the new visibility setting.
     */
    public void setJobFlowIds(java.util.Collection<String> jobFlowIds) {
        if (jobFlowIds == null) {
            this.jobFlowIds = null;
            return;
        }

        java.util.List<String> jobFlowIdsCopy = new java.util.ArrayList<String>(jobFlowIds.size());
        jobFlowIdsCopy.addAll(jobFlowIds);
        this.jobFlowIds = jobFlowIdsCopy;
    }
    
    /**
     * Identifiers of the job flows to receive the new visibility setting.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowIds Identifiers of the job flows to receive the new visibility setting.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetVisibleToAllUsersRequest withJobFlowIds(String... jobFlowIds) {
        if (getJobFlowIds() == null) setJobFlowIds(new java.util.ArrayList<String>(jobFlowIds.length));
        for (String value : jobFlowIds) {
            getJobFlowIds().add(value);
        }
        return this;
    }
    
    /**
     * Identifiers of the job flows to receive the new visibility setting.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowIds Identifiers of the job flows to receive the new visibility setting.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetVisibleToAllUsersRequest withJobFlowIds(java.util.Collection<String> jobFlowIds) {
        if (jobFlowIds == null) {
            this.jobFlowIds = null;
        } else {
            java.util.List<String> jobFlowIdsCopy = new java.util.ArrayList<String>(jobFlowIds.size());
            jobFlowIdsCopy.addAll(jobFlowIds);
            this.jobFlowIds = jobFlowIdsCopy;
        }

        return this;
    }
    
    /**
     * Whether the specified job flows are visible to all IAM users of the
     * AWS account associated with the job flow. If this value is set to
     * True, all IAM users of that AWS account can view and, if they have the
     * proper IAM policy permissions set, manage the job flows. If it is set
     * to False, only the IAM user that created a job flow can view and
     * manage it.
     *
     * @return Whether the specified job flows are visible to all IAM users of the
     *         AWS account associated with the job flow. If this value is set to
     *         True, all IAM users of that AWS account can view and, if they have the
     *         proper IAM policy permissions set, manage the job flows. If it is set
     *         to False, only the IAM user that created a job flow can view and
     *         manage it.
     */
    public Boolean isVisibleToAllUsers() {
        return visibleToAllUsers;
    }
    
    /**
     * Whether the specified job flows are visible to all IAM users of the
     * AWS account associated with the job flow. If this value is set to
     * True, all IAM users of that AWS account can view and, if they have the
     * proper IAM policy permissions set, manage the job flows. If it is set
     * to False, only the IAM user that created a job flow can view and
     * manage it.
     *
     * @param visibleToAllUsers Whether the specified job flows are visible to all IAM users of the
     *         AWS account associated with the job flow. If this value is set to
     *         True, all IAM users of that AWS account can view and, if they have the
     *         proper IAM policy permissions set, manage the job flows. If it is set
     *         to False, only the IAM user that created a job flow can view and
     *         manage it.
     */
    public void setVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
    }
    
    /**
     * Whether the specified job flows are visible to all IAM users of the
     * AWS account associated with the job flow. If this value is set to
     * True, all IAM users of that AWS account can view and, if they have the
     * proper IAM policy permissions set, manage the job flows. If it is set
     * to False, only the IAM user that created a job flow can view and
     * manage it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param visibleToAllUsers Whether the specified job flows are visible to all IAM users of the
     *         AWS account associated with the job flow. If this value is set to
     *         True, all IAM users of that AWS account can view and, if they have the
     *         proper IAM policy permissions set, manage the job flows. If it is set
     *         to False, only the IAM user that created a job flow can view and
     *         manage it.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetVisibleToAllUsersRequest withVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
        return this;
    }
    
    
    /**
     * Whether the specified job flows are visible to all IAM users of the
     * AWS account associated with the job flow. If this value is set to
     * True, all IAM users of that AWS account can view and, if they have the
     * proper IAM policy permissions set, manage the job flows. If it is set
     * to False, only the IAM user that created a job flow can view and
     * manage it.
     *
     * @return Whether the specified job flows are visible to all IAM users of the
     *         AWS account associated with the job flow. If this value is set to
     *         True, all IAM users of that AWS account can view and, if they have the
     *         proper IAM policy permissions set, manage the job flows. If it is set
     *         to False, only the IAM user that created a job flow can view and
     *         manage it.
     */
    public Boolean getVisibleToAllUsers() {
        return visibleToAllUsers;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (jobFlowIds != null) sb.append("JobFlowIds: " + jobFlowIds + ", ");
        if (visibleToAllUsers != null) sb.append("VisibleToAllUsers: " + visibleToAllUsers + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getJobFlowIds() == null) ? 0 : getJobFlowIds().hashCode()); 
        hashCode = prime * hashCode + ((isVisibleToAllUsers() == null) ? 0 : isVisibleToAllUsers().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof SetVisibleToAllUsersRequest == false) return false;
        SetVisibleToAllUsersRequest other = (SetVisibleToAllUsersRequest)obj;
        
        if (other.getJobFlowIds() == null ^ this.getJobFlowIds() == null) return false;
        if (other.getJobFlowIds() != null && other.getJobFlowIds().equals(this.getJobFlowIds()) == false) return false; 
        if (other.isVisibleToAllUsers() == null ^ this.isVisibleToAllUsers() == null) return false;
        if (other.isVisibleToAllUsers() != null && other.isVisibleToAllUsers().equals(this.isVisibleToAllUsers()) == false) return false; 
        return true;
    }
    
}
    