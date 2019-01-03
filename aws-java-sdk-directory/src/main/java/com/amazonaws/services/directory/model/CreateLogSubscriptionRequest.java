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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateLogSubscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLogSubscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier (ID) of the directory to which you want to subscribe and receive real-time logs to your specified
     * CloudWatch log group.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The name of the CloudWatch log group where the real-time domain controller logs are forwarded.
     * </p>
     */
    private String logGroupName;

    /**
     * <p>
     * Identifier (ID) of the directory to which you want to subscribe and receive real-time logs to your specified
     * CloudWatch log group.
     * </p>
     * 
     * @param directoryId
     *        Identifier (ID) of the directory to which you want to subscribe and receive real-time logs to your
     *        specified CloudWatch log group.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * Identifier (ID) of the directory to which you want to subscribe and receive real-time logs to your specified
     * CloudWatch log group.
     * </p>
     * 
     * @return Identifier (ID) of the directory to which you want to subscribe and receive real-time logs to your
     *         specified CloudWatch log group.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * Identifier (ID) of the directory to which you want to subscribe and receive real-time logs to your specified
     * CloudWatch log group.
     * </p>
     * 
     * @param directoryId
     *        Identifier (ID) of the directory to which you want to subscribe and receive real-time logs to your
     *        specified CloudWatch log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogSubscriptionRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The name of the CloudWatch log group where the real-time domain controller logs are forwarded.
     * </p>
     * 
     * @param logGroupName
     *        The name of the CloudWatch log group where the real-time domain controller logs are forwarded.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the CloudWatch log group where the real-time domain controller logs are forwarded.
     * </p>
     * 
     * @return The name of the CloudWatch log group where the real-time domain controller logs are forwarded.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the CloudWatch log group where the real-time domain controller logs are forwarded.
     * </p>
     * 
     * @param logGroupName
     *        The name of the CloudWatch log group where the real-time domain controller logs are forwarded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogSubscriptionRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLogSubscriptionRequest == false)
            return false;
        CreateLogSubscriptionRequest other = (CreateLogSubscriptionRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        return hashCode;
    }

    @Override
    public CreateLogSubscriptionRequest clone() {
        return (CreateLogSubscriptionRequest) super.clone();
    }

}
