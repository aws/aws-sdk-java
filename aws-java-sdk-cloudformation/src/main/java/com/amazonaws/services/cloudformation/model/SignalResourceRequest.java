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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the <a>SignalResource</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/SignalResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignalResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The stack name or unique stack ID that includes the resource that you want to signal.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The logical ID of the resource that you want to signal. The logical ID is the name of the resource that given in
     * the template.
     * </p>
     */
    private String logicalResourceId;
    /**
     * <p>
     * A unique ID of the signal. When you signal Amazon EC2 instances or Auto Scaling groups, specify the instance ID
     * that you are signaling as the unique ID. If you send multiple signals to a single resource (such as signaling a
     * wait condition), each signal requires a different unique ID.
     * </p>
     */
    private String uniqueId;
    /**
     * <p>
     * The status of the signal, which is either success or failure. A failure signal causes AWS CloudFormation to
     * immediately fail the stack creation or update.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The stack name or unique stack ID that includes the resource that you want to signal.
     * </p>
     * 
     * @param stackName
     *        The stack name or unique stack ID that includes the resource that you want to signal.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The stack name or unique stack ID that includes the resource that you want to signal.
     * </p>
     * 
     * @return The stack name or unique stack ID that includes the resource that you want to signal.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The stack name or unique stack ID that includes the resource that you want to signal.
     * </p>
     * 
     * @param stackName
     *        The stack name or unique stack ID that includes the resource that you want to signal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalResourceRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The logical ID of the resource that you want to signal. The logical ID is the name of the resource that given in
     * the template.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical ID of the resource that you want to signal. The logical ID is the name of the resource that
     *        given in the template.
     */

    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * The logical ID of the resource that you want to signal. The logical ID is the name of the resource that given in
     * the template.
     * </p>
     * 
     * @return The logical ID of the resource that you want to signal. The logical ID is the name of the resource that
     *         given in the template.
     */

    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * <p>
     * The logical ID of the resource that you want to signal. The logical ID is the name of the resource that given in
     * the template.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical ID of the resource that you want to signal. The logical ID is the name of the resource that
     *        given in the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalResourceRequest withLogicalResourceId(String logicalResourceId) {
        setLogicalResourceId(logicalResourceId);
        return this;
    }

    /**
     * <p>
     * A unique ID of the signal. When you signal Amazon EC2 instances or Auto Scaling groups, specify the instance ID
     * that you are signaling as the unique ID. If you send multiple signals to a single resource (such as signaling a
     * wait condition), each signal requires a different unique ID.
     * </p>
     * 
     * @param uniqueId
     *        A unique ID of the signal. When you signal Amazon EC2 instances or Auto Scaling groups, specify the
     *        instance ID that you are signaling as the unique ID. If you send multiple signals to a single resource
     *        (such as signaling a wait condition), each signal requires a different unique ID.
     */

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    /**
     * <p>
     * A unique ID of the signal. When you signal Amazon EC2 instances or Auto Scaling groups, specify the instance ID
     * that you are signaling as the unique ID. If you send multiple signals to a single resource (such as signaling a
     * wait condition), each signal requires a different unique ID.
     * </p>
     * 
     * @return A unique ID of the signal. When you signal Amazon EC2 instances or Auto Scaling groups, specify the
     *         instance ID that you are signaling as the unique ID. If you send multiple signals to a single resource
     *         (such as signaling a wait condition), each signal requires a different unique ID.
     */

    public String getUniqueId() {
        return this.uniqueId;
    }

    /**
     * <p>
     * A unique ID of the signal. When you signal Amazon EC2 instances or Auto Scaling groups, specify the instance ID
     * that you are signaling as the unique ID. If you send multiple signals to a single resource (such as signaling a
     * wait condition), each signal requires a different unique ID.
     * </p>
     * 
     * @param uniqueId
     *        A unique ID of the signal. When you signal Amazon EC2 instances or Auto Scaling groups, specify the
     *        instance ID that you are signaling as the unique ID. If you send multiple signals to a single resource
     *        (such as signaling a wait condition), each signal requires a different unique ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalResourceRequest withUniqueId(String uniqueId) {
        setUniqueId(uniqueId);
        return this;
    }

    /**
     * <p>
     * The status of the signal, which is either success or failure. A failure signal causes AWS CloudFormation to
     * immediately fail the stack creation or update.
     * </p>
     * 
     * @param status
     *        The status of the signal, which is either success or failure. A failure signal causes AWS CloudFormation
     *        to immediately fail the stack creation or update.
     * @see ResourceSignalStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the signal, which is either success or failure. A failure signal causes AWS CloudFormation to
     * immediately fail the stack creation or update.
     * </p>
     * 
     * @return The status of the signal, which is either success or failure. A failure signal causes AWS CloudFormation
     *         to immediately fail the stack creation or update.
     * @see ResourceSignalStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the signal, which is either success or failure. A failure signal causes AWS CloudFormation to
     * immediately fail the stack creation or update.
     * </p>
     * 
     * @param status
     *        The status of the signal, which is either success or failure. A failure signal causes AWS CloudFormation
     *        to immediately fail the stack creation or update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceSignalStatus
     */

    public SignalResourceRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the signal, which is either success or failure. A failure signal causes AWS CloudFormation to
     * immediately fail the stack creation or update.
     * </p>
     * 
     * @param status
     *        The status of the signal, which is either success or failure. A failure signal causes AWS CloudFormation
     *        to immediately fail the stack creation or update.
     * @see ResourceSignalStatus
     */

    public void setStatus(ResourceSignalStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the signal, which is either success or failure. A failure signal causes AWS CloudFormation to
     * immediately fail the stack creation or update.
     * </p>
     * 
     * @param status
     *        The status of the signal, which is either success or failure. A failure signal causes AWS CloudFormation
     *        to immediately fail the stack creation or update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceSignalStatus
     */

    public SignalResourceRequest withStatus(ResourceSignalStatus status) {
        this.status = status.toString();
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
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: ").append(getLogicalResourceId()).append(",");
        if (getUniqueId() != null)
            sb.append("UniqueId: ").append(getUniqueId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignalResourceRequest == false)
            return false;
        SignalResourceRequest other = (SignalResourceRequest) obj;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
            return false;
        if (other.getUniqueId() == null ^ this.getUniqueId() == null)
            return false;
        if (other.getUniqueId() != null && other.getUniqueId().equals(this.getUniqueId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
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
    public SignalResourceRequest clone() {
        return (SignalResourceRequest) super.clone();
    }

}
