/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#addInstanceGroups(AddInstanceGroupsRequest) AddInstanceGroups operation}.
 * <p>
 * AddInstanceGroups adds an instance group to a running cluster.
 * </p>
 *
 * @see com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#addInstanceGroups(AddInstanceGroupsRequest)
 */
public class AddInstanceGroupsRequest extends AmazonWebServiceRequest {

    /**
     * Instance Groups to add.
     */
    private java.util.List<InstanceGroupConfig> instanceGroups;

    /**
     * Job flow in which to add the instance groups.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String jobFlowId;

    /**
     * Default constructor for a new AddInstanceGroupsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public AddInstanceGroupsRequest() {}
    
    /**
     * Constructs a new AddInstanceGroupsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceGroups Instance Groups to add.
     * @param jobFlowId Job flow in which to add the instance groups.
     */
    public AddInstanceGroupsRequest(java.util.List<InstanceGroupConfig> instanceGroups, String jobFlowId) {
        this.instanceGroups = instanceGroups;
        this.jobFlowId = jobFlowId;
    }
    
    /**
     * Instance Groups to add.
     *
     * @return Instance Groups to add.
     */
    public java.util.List<InstanceGroupConfig> getInstanceGroups() {
        if (instanceGroups == null) {
            instanceGroups = new java.util.ArrayList<InstanceGroupConfig>();
        }
        return instanceGroups;
    }
    
    /**
     * Instance Groups to add.
     *
     * @param instanceGroups Instance Groups to add.
     */
    public void setInstanceGroups(java.util.Collection<InstanceGroupConfig> instanceGroups) {
        java.util.List<InstanceGroupConfig> instanceGroupsCopy = new java.util.ArrayList<InstanceGroupConfig>();
        if (instanceGroups != null) {
            instanceGroupsCopy.addAll(instanceGroups);
        }
        this.instanceGroups = instanceGroupsCopy;
    }
    
    /**
     * Instance Groups to add.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceGroups Instance Groups to add.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddInstanceGroupsRequest withInstanceGroups(InstanceGroupConfig... instanceGroups) {
        for (InstanceGroupConfig value : instanceGroups) {
            getInstanceGroups().add(value);
        }
        return this;
    }
    
    /**
     * Instance Groups to add.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceGroups Instance Groups to add.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddInstanceGroupsRequest withInstanceGroups(java.util.Collection<InstanceGroupConfig> instanceGroups) {
        java.util.List<InstanceGroupConfig> instanceGroupsCopy = new java.util.ArrayList<InstanceGroupConfig>();
        if (instanceGroups != null) {
            instanceGroupsCopy.addAll(instanceGroups);
        }
        this.instanceGroups = instanceGroupsCopy;

        return this;
    }
    
    /**
     * Job flow in which to add the instance groups.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Job flow in which to add the instance groups.
     */
    public String getJobFlowId() {
        return jobFlowId;
    }
    
    /**
     * Job flow in which to add the instance groups.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param jobFlowId Job flow in which to add the instance groups.
     */
    public void setJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
    }
    
    /**
     * Job flow in which to add the instance groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param jobFlowId Job flow in which to add the instance groups.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddInstanceGroupsRequest withJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
        return this;
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
        sb.append("InstanceGroups: " + instanceGroups + ", ");
        sb.append("JobFlowId: " + jobFlowId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    