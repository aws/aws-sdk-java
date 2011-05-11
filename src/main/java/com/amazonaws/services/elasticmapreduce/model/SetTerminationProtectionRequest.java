/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#setTerminationProtection(SetTerminationProtectionRequest) SetTerminationProtection operation}.
 * <p>
 * SetTerminationProtection locks a job flow so the Amazon EC2 instances
 * in the cluster cannot be terminated by user intervention, an API call,
 * or in the event of a job-flow error. The cluster still terminates upon
 * successful completion of the job flow. Calling
 * SetTerminationProtection on a job flow is analogous to calling the
 * Amazon EC2 DisableAPITermination API on all of the EC2 instances in a
 * cluster.
 * </p>
 * <p>
 * SetTerminationProtection is used to prevent accidental termination of
 * a job flow and to ensure that in the event of an error, the instances
 * will persist so you can recover any data stored in their ephemeral
 * instance storage.
 * </p>
 * <p>
 * To terminate a job flow that has been locked by setting
 * SetTerminationProtection to <code>true</code> ,
 * you must first unlock the job flow by a subsequent call to
 * SetTerminationProtection in which you set the value to
 * <code>false</code> .
 * </p>
 * <p>
 * For more information, go to <a
 * cMapReduce/latest/DeveloperGuide/UsingEMR_TerminationProtection.html">
 * Protecting a Job Flow from Termination </a> in the <i>Amazon Elastic
 * MapReduce Developer's Guide.</i>
 * </p>
 *
 * @see com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#setTerminationProtection(SetTerminationProtectionRequest)
 */
public class SetTerminationProtectionRequest extends AmazonWebServiceRequest {

    /**
     * A list of strings that uniquely identify the job flows to protect.
     * This identifier is returned by <a>RunJobFlow</a> and can also be
     * obtained from <a>DescribeJobFlows</a> .
     */
    private java.util.List<String> jobFlowIds;

    /**
     * A Boolean that indicates whether to protect the job flow and prevent
     * the Amazon EC2 instances in the cluster from shutting down due to API
     * calls, user intervention, or job-flow error.
     */
    private Boolean terminationProtected;

    /**
     * A list of strings that uniquely identify the job flows to protect.
     * This identifier is returned by <a>RunJobFlow</a> and can also be
     * obtained from <a>DescribeJobFlows</a> .
     *
     * @return A list of strings that uniquely identify the job flows to protect.
     *         This identifier is returned by <a>RunJobFlow</a> and can also be
     *         obtained from <a>DescribeJobFlows</a> .
     */
    public java.util.List<String> getJobFlowIds() {
        if (jobFlowIds == null) {
            jobFlowIds = new java.util.ArrayList<String>();
        }
        return jobFlowIds;
    }
    
    /**
     * A list of strings that uniquely identify the job flows to protect.
     * This identifier is returned by <a>RunJobFlow</a> and can also be
     * obtained from <a>DescribeJobFlows</a> .
     *
     * @param jobFlowIds A list of strings that uniquely identify the job flows to protect.
     *         This identifier is returned by <a>RunJobFlow</a> and can also be
     *         obtained from <a>DescribeJobFlows</a> .
     */
    public void setJobFlowIds(java.util.Collection<String> jobFlowIds) {
        java.util.List<String> jobFlowIdsCopy = new java.util.ArrayList<String>();
        if (jobFlowIds != null) {
            jobFlowIdsCopy.addAll(jobFlowIds);
        }
        this.jobFlowIds = jobFlowIdsCopy;
    }
    
    /**
     * A list of strings that uniquely identify the job flows to protect.
     * This identifier is returned by <a>RunJobFlow</a> and can also be
     * obtained from <a>DescribeJobFlows</a> .
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowIds A list of strings that uniquely identify the job flows to protect.
     *         This identifier is returned by <a>RunJobFlow</a> and can also be
     *         obtained from <a>DescribeJobFlows</a> .
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetTerminationProtectionRequest withJobFlowIds(String... jobFlowIds) {
        for (String value : jobFlowIds) {
            getJobFlowIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of strings that uniquely identify the job flows to protect.
     * This identifier is returned by <a>RunJobFlow</a> and can also be
     * obtained from <a>DescribeJobFlows</a> .
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowIds A list of strings that uniquely identify the job flows to protect.
     *         This identifier is returned by <a>RunJobFlow</a> and can also be
     *         obtained from <a>DescribeJobFlows</a> .
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetTerminationProtectionRequest withJobFlowIds(java.util.Collection<String> jobFlowIds) {
        java.util.List<String> jobFlowIdsCopy = new java.util.ArrayList<String>();
        if (jobFlowIds != null) {
            jobFlowIdsCopy.addAll(jobFlowIds);
        }
        this.jobFlowIds = jobFlowIdsCopy;

        return this;
    }
    
    /**
     * A Boolean that indicates whether to protect the job flow and prevent
     * the Amazon EC2 instances in the cluster from shutting down due to API
     * calls, user intervention, or job-flow error.
     *
     * @return A Boolean that indicates whether to protect the job flow and prevent
     *         the Amazon EC2 instances in the cluster from shutting down due to API
     *         calls, user intervention, or job-flow error.
     */
    public Boolean isTerminationProtected() {
        return terminationProtected;
    }
    
    /**
     * A Boolean that indicates whether to protect the job flow and prevent
     * the Amazon EC2 instances in the cluster from shutting down due to API
     * calls, user intervention, or job-flow error.
     *
     * @param terminationProtected A Boolean that indicates whether to protect the job flow and prevent
     *         the Amazon EC2 instances in the cluster from shutting down due to API
     *         calls, user intervention, or job-flow error.
     */
    public void setTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
    }
    
    /**
     * A Boolean that indicates whether to protect the job flow and prevent
     * the Amazon EC2 instances in the cluster from shutting down due to API
     * calls, user intervention, or job-flow error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminationProtected A Boolean that indicates whether to protect the job flow and prevent
     *         the Amazon EC2 instances in the cluster from shutting down due to API
     *         calls, user intervention, or job-flow error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetTerminationProtectionRequest withTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
        return this;
    }
    
    
    /**
     * A Boolean that indicates whether to protect the job flow and prevent
     * the Amazon EC2 instances in the cluster from shutting down due to API
     * calls, user intervention, or job-flow error.
     *
     * @return A Boolean that indicates whether to protect the job flow and prevent
     *         the Amazon EC2 instances in the cluster from shutting down due to API
     *         calls, user intervention, or job-flow error.
     */
    public Boolean getTerminationProtected() {
        return terminationProtected;
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
        sb.append("JobFlowIds: " + jobFlowIds + ", ");
        sb.append("TerminationProtected: " + terminationProtected + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    