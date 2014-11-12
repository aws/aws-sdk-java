/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudformation.AmazonCloudFormation#signalResource(SignalResourceRequest) SignalResource operation}.
 * <p>
 * Sends a signal to the specified resource with a success or failure
 * status. You can use the SignalResource API in conjunction with a
 * creation policy or update policy. AWS CloudFormation doesn't proceed
 * with a stack creation or update until resources receive the required
 * number of signals or the timeout period is exceeded. The
 * SignalResource API is useful in cases where you want to send signals
 * from anywhere other than an Amazon EC2 instance.
 * </p>
 *
 * @see com.amazonaws.services.cloudformation.AmazonCloudFormation#signalResource(SignalResourceRequest)
 */
public class SignalResourceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The stack name or ID that includes the resource that you want to
     * signal.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[-a-zA-Z0-9:/._+]*)<br/>
     */
    private String stackName;

    /**
     * The logical ID of the resource that you want to signal. The logical ID
     * is the name of the resource that given in the template.
     */
    private String logicalResourceId;

    /**
     * A unique ID of the signal. When you signal Amazon EC2 instances or
     * Auto Scaling groups, specify the instance ID that you are signaling as
     * the unique ID. If you send multiple signals to a single resource (such
     * as signaling a wait condition), each signal requires a different
     * unique ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String uniqueId;

    /**
     * The status of the signal, which is either success or failure. A
     * failure signal causes AWS CloudFormation to immediately fail the stack
     * creation or update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, FAILURE
     */
    private String status;

    /**
     * The stack name or ID that includes the resource that you want to
     * signal.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[-a-zA-Z0-9:/._+]*)<br/>
     *
     * @return The stack name or ID that includes the resource that you want to
     *         signal.
     */
    public String getStackName() {
        return stackName;
    }
    
    /**
     * The stack name or ID that includes the resource that you want to
     * signal.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[-a-zA-Z0-9:/._+]*)<br/>
     *
     * @param stackName The stack name or ID that includes the resource that you want to
     *         signal.
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }
    
    /**
     * The stack name or ID that includes the resource that you want to
     * signal.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[-a-zA-Z0-9:/._+]*)<br/>
     *
     * @param stackName The stack name or ID that includes the resource that you want to
     *         signal.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SignalResourceRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * The logical ID of the resource that you want to signal. The logical ID
     * is the name of the resource that given in the template.
     *
     * @return The logical ID of the resource that you want to signal. The logical ID
     *         is the name of the resource that given in the template.
     */
    public String getLogicalResourceId() {
        return logicalResourceId;
    }
    
    /**
     * The logical ID of the resource that you want to signal. The logical ID
     * is the name of the resource that given in the template.
     *
     * @param logicalResourceId The logical ID of the resource that you want to signal. The logical ID
     *         is the name of the resource that given in the template.
     */
    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }
    
    /**
     * The logical ID of the resource that you want to signal. The logical ID
     * is the name of the resource that given in the template.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logicalResourceId The logical ID of the resource that you want to signal. The logical ID
     *         is the name of the resource that given in the template.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SignalResourceRequest withLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }

    /**
     * A unique ID of the signal. When you signal Amazon EC2 instances or
     * Auto Scaling groups, specify the instance ID that you are signaling as
     * the unique ID. If you send multiple signals to a single resource (such
     * as signaling a wait condition), each signal requires a different
     * unique ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return A unique ID of the signal. When you signal Amazon EC2 instances or
     *         Auto Scaling groups, specify the instance ID that you are signaling as
     *         the unique ID. If you send multiple signals to a single resource (such
     *         as signaling a wait condition), each signal requires a different
     *         unique ID.
     */
    public String getUniqueId() {
        return uniqueId;
    }
    
    /**
     * A unique ID of the signal. When you signal Amazon EC2 instances or
     * Auto Scaling groups, specify the instance ID that you are signaling as
     * the unique ID. If you send multiple signals to a single resource (such
     * as signaling a wait condition), each signal requires a different
     * unique ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param uniqueId A unique ID of the signal. When you signal Amazon EC2 instances or
     *         Auto Scaling groups, specify the instance ID that you are signaling as
     *         the unique ID. If you send multiple signals to a single resource (such
     *         as signaling a wait condition), each signal requires a different
     *         unique ID.
     */
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
    
    /**
     * A unique ID of the signal. When you signal Amazon EC2 instances or
     * Auto Scaling groups, specify the instance ID that you are signaling as
     * the unique ID. If you send multiple signals to a single resource (such
     * as signaling a wait condition), each signal requires a different
     * unique ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param uniqueId A unique ID of the signal. When you signal Amazon EC2 instances or
     *         Auto Scaling groups, specify the instance ID that you are signaling as
     *         the unique ID. If you send multiple signals to a single resource (such
     *         as signaling a wait condition), each signal requires a different
     *         unique ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SignalResourceRequest withUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }

    /**
     * The status of the signal, which is either success or failure. A
     * failure signal causes AWS CloudFormation to immediately fail the stack
     * creation or update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, FAILURE
     *
     * @return The status of the signal, which is either success or failure. A
     *         failure signal causes AWS CloudFormation to immediately fail the stack
     *         creation or update.
     *
     * @see ResourceSignalStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the signal, which is either success or failure. A
     * failure signal causes AWS CloudFormation to immediately fail the stack
     * creation or update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, FAILURE
     *
     * @param status The status of the signal, which is either success or failure. A
     *         failure signal causes AWS CloudFormation to immediately fail the stack
     *         creation or update.
     *
     * @see ResourceSignalStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the signal, which is either success or failure. A
     * failure signal causes AWS CloudFormation to immediately fail the stack
     * creation or update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, FAILURE
     *
     * @param status The status of the signal, which is either success or failure. A
     *         failure signal causes AWS CloudFormation to immediately fail the stack
     *         creation or update.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ResourceSignalStatus
     */
    public SignalResourceRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the signal, which is either success or failure. A
     * failure signal causes AWS CloudFormation to immediately fail the stack
     * creation or update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, FAILURE
     *
     * @param status The status of the signal, which is either success or failure. A
     *         failure signal causes AWS CloudFormation to immediately fail the stack
     *         creation or update.
     *
     * @see ResourceSignalStatus
     */
    public void setStatus(ResourceSignalStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The status of the signal, which is either success or failure. A
     * failure signal causes AWS CloudFormation to immediately fail the stack
     * creation or update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCESS, FAILURE
     *
     * @param status The status of the signal, which is either success or failure. A
     *         failure signal causes AWS CloudFormation to immediately fail the stack
     *         creation or update.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ResourceSignalStatus
     */
    public SignalResourceRequest withStatus(ResourceSignalStatus status) {
        this.status = status.toString();
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
        if (getStackName() != null) sb.append("StackName: " + getStackName() + ",");
        if (getLogicalResourceId() != null) sb.append("LogicalResourceId: " + getLogicalResourceId() + ",");
        if (getUniqueId() != null) sb.append("UniqueId: " + getUniqueId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode()); 
        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getUniqueId() == null) ? 0 : getUniqueId().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SignalResourceRequest == false) return false;
        SignalResourceRequest other = (SignalResourceRequest)obj;
        
        if (other.getStackName() == null ^ this.getStackName() == null) return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false) return false; 
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null) return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false) return false; 
        if (other.getUniqueId() == null ^ this.getUniqueId() == null) return false;
        if (other.getUniqueId() != null && other.getUniqueId().equals(this.getUniqueId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    