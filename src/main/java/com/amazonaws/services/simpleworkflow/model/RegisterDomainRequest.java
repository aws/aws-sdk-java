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
package com.amazonaws.services.simpleworkflow.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#registerDomain(RegisterDomainRequest) RegisterDomain operation}.
 * <p>
 * Registers a new domain.
 * </p>
 *
 * @see com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#registerDomain(RegisterDomainRequest)
 */
public class RegisterDomainRequest extends AmazonWebServiceRequest {

    /**
     * Name of the domain to register. The name must be unique. <p>The
     * specified string must not start or end with whitespace. It must not
     * contain a <code>:</code> (colon), <code>/</code> (slash),
     * <code>|</code> (vertical bar), or any control characters
     * (\u0000-\u001f | \u007f - \u009f). Also, it must not contain the
     * literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String name;

    /**
     * Textual description of the domain.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String description;

    /**
     * Specifies the duration--<b><i>in days</i></b>--for which the record
     * (including the history) of workflow executions in this domain should
     * be kept by the service. After the retention period, the workflow
     * execution will not be available in the results of visibility calls. If
     * a duration of <code>NONE</code> is specified, the records for workflow
     * executions in this domain are not retained at all. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     */
    private String workflowExecutionRetentionPeriodInDays;

    /**
     * Name of the domain to register. The name must be unique. <p>The
     * specified string must not start or end with whitespace. It must not
     * contain a <code>:</code> (colon), <code>/</code> (slash),
     * <code>|</code> (vertical bar), or any control characters
     * (\u0000-\u001f | \u007f - \u009f). Also, it must not contain the
     * literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return Name of the domain to register. The name must be unique. <p>The
     *         specified string must not start or end with whitespace. It must not
     *         contain a <code>:</code> (colon), <code>/</code> (slash),
     *         <code>|</code> (vertical bar), or any control characters
     *         (\u0000-\u001f | \u007f - \u009f). Also, it must not contain the
     *         literal string "arn".
     */
    public String getName() {
        return name;
    }
    
    /**
     * Name of the domain to register. The name must be unique. <p>The
     * specified string must not start or end with whitespace. It must not
     * contain a <code>:</code> (colon), <code>/</code> (slash),
     * <code>|</code> (vertical bar), or any control characters
     * (\u0000-\u001f | \u007f - \u009f). Also, it must not contain the
     * literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name Name of the domain to register. The name must be unique. <p>The
     *         specified string must not start or end with whitespace. It must not
     *         contain a <code>:</code> (colon), <code>/</code> (slash),
     *         <code>|</code> (vertical bar), or any control characters
     *         (\u0000-\u001f | \u007f - \u009f). Also, it must not contain the
     *         literal string "arn".
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Name of the domain to register. The name must be unique. <p>The
     * specified string must not start or end with whitespace. It must not
     * contain a <code>:</code> (colon), <code>/</code> (slash),
     * <code>|</code> (vertical bar), or any control characters
     * (\u0000-\u001f | \u007f - \u009f). Also, it must not contain the
     * literal string "arn".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name Name of the domain to register. The name must be unique. <p>The
     *         specified string must not start or end with whitespace. It must not
     *         contain a <code>:</code> (colon), <code>/</code> (slash),
     *         <code>|</code> (vertical bar), or any control characters
     *         (\u0000-\u001f | \u007f - \u009f). Also, it must not contain the
     *         literal string "arn".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RegisterDomainRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * Textual description of the domain.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return Textual description of the domain.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Textual description of the domain.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description Textual description of the domain.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Textual description of the domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description Textual description of the domain.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RegisterDomainRequest withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * Specifies the duration--<b><i>in days</i></b>--for which the record
     * (including the history) of workflow executions in this domain should
     * be kept by the service. After the retention period, the workflow
     * execution will not be available in the results of visibility calls. If
     * a duration of <code>NONE</code> is specified, the records for workflow
     * executions in this domain are not retained at all. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     *
     * @return Specifies the duration--<b><i>in days</i></b>--for which the record
     *         (including the history) of workflow executions in this domain should
     *         be kept by the service. After the retention period, the workflow
     *         execution will not be available in the results of visibility calls. If
     *         a duration of <code>NONE</code> is specified, the records for workflow
     *         executions in this domain are not retained at all. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
     */
    public String getWorkflowExecutionRetentionPeriodInDays() {
        return workflowExecutionRetentionPeriodInDays;
    }
    
    /**
     * Specifies the duration--<b><i>in days</i></b>--for which the record
     * (including the history) of workflow executions in this domain should
     * be kept by the service. After the retention period, the workflow
     * execution will not be available in the results of visibility calls. If
     * a duration of <code>NONE</code> is specified, the records for workflow
     * executions in this domain are not retained at all. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     *
     * @param workflowExecutionRetentionPeriodInDays Specifies the duration--<b><i>in days</i></b>--for which the record
     *         (including the history) of workflow executions in this domain should
     *         be kept by the service. After the retention period, the workflow
     *         execution will not be available in the results of visibility calls. If
     *         a duration of <code>NONE</code> is specified, the records for workflow
     *         executions in this domain are not retained at all. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
     */
    public void setWorkflowExecutionRetentionPeriodInDays(String workflowExecutionRetentionPeriodInDays) {
        this.workflowExecutionRetentionPeriodInDays = workflowExecutionRetentionPeriodInDays;
    }
    
    /**
     * Specifies the duration--<b><i>in days</i></b>--for which the record
     * (including the history) of workflow executions in this domain should
     * be kept by the service. After the retention period, the workflow
     * execution will not be available in the results of visibility calls. If
     * a duration of <code>NONE</code> is specified, the records for workflow
     * executions in this domain are not retained at all. <p>The valid values
     * are integers greater than or equal to <code>0</code>. An integer value
     * can be used to specify the duration in seconds while <code>NONE</code>
     * can be used to specify unlimited duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     *
     * @param workflowExecutionRetentionPeriodInDays Specifies the duration--<b><i>in days</i></b>--for which the record
     *         (including the history) of workflow executions in this domain should
     *         be kept by the service. After the retention period, the workflow
     *         execution will not be available in the results of visibility calls. If
     *         a duration of <code>NONE</code> is specified, the records for workflow
     *         executions in this domain are not retained at all. <p>The valid values
     *         are integers greater than or equal to <code>0</code>. An integer value
     *         can be used to specify the duration in seconds while <code>NONE</code>
     *         can be used to specify unlimited duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RegisterDomainRequest withWorkflowExecutionRetentionPeriodInDays(String workflowExecutionRetentionPeriodInDays) {
        this.workflowExecutionRetentionPeriodInDays = workflowExecutionRetentionPeriodInDays;
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
        if (name != null) sb.append("Name: " + name + ", ");
        if (description != null) sb.append("Description: " + description + ", ");
        if (workflowExecutionRetentionPeriodInDays != null) sb.append("WorkflowExecutionRetentionPeriodInDays: " + workflowExecutionRetentionPeriodInDays + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getWorkflowExecutionRetentionPeriodInDays() == null) ? 0 : getWorkflowExecutionRetentionPeriodInDays().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof RegisterDomainRequest == false) return false;
        RegisterDomainRequest other = (RegisterDomainRequest)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getWorkflowExecutionRetentionPeriodInDays() == null ^ this.getWorkflowExecutionRetentionPeriodInDays() == null) return false;
        if (other.getWorkflowExecutionRetentionPeriodInDays() != null && other.getWorkflowExecutionRetentionPeriodInDays().equals(this.getWorkflowExecutionRetentionPeriodInDays()) == false) return false; 
        return true;
    }
    
}
    