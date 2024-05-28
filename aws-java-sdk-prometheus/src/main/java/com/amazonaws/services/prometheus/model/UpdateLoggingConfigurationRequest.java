/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of an <code>UpdateLoggingConfiguration</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/UpdateLoggingConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLoggingConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The ARN of the CloudWatch log group to which the vended log data will be published.
     * </p>
     */
    private String logGroupArn;
    /**
     * <p>
     * The ID of the workspace to update the logging configuration for.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     * </p>
     * 
     * @return A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier that you can provide to ensure the idempotency of the request. Case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLoggingConfigurationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The ARN of the CloudWatch log group to which the vended log data will be published.
     * </p>
     * 
     * @param logGroupArn
     *        The ARN of the CloudWatch log group to which the vended log data will be published.
     */

    public void setLogGroupArn(String logGroupArn) {
        this.logGroupArn = logGroupArn;
    }

    /**
     * <p>
     * The ARN of the CloudWatch log group to which the vended log data will be published.
     * </p>
     * 
     * @return The ARN of the CloudWatch log group to which the vended log data will be published.
     */

    public String getLogGroupArn() {
        return this.logGroupArn;
    }

    /**
     * <p>
     * The ARN of the CloudWatch log group to which the vended log data will be published.
     * </p>
     * 
     * @param logGroupArn
     *        The ARN of the CloudWatch log group to which the vended log data will be published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLoggingConfigurationRequest withLogGroupArn(String logGroupArn) {
        setLogGroupArn(logGroupArn);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace to update the logging configuration for.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to update the logging configuration for.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to update the logging configuration for.
     * </p>
     * 
     * @return The ID of the workspace to update the logging configuration for.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to update the logging configuration for.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to update the logging configuration for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLoggingConfigurationRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getLogGroupArn() != null)
            sb.append("LogGroupArn: ").append(getLogGroupArn()).append(",");
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLoggingConfigurationRequest == false)
            return false;
        UpdateLoggingConfigurationRequest other = (UpdateLoggingConfigurationRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getLogGroupArn() == null ^ this.getLogGroupArn() == null)
            return false;
        if (other.getLogGroupArn() != null && other.getLogGroupArn().equals(this.getLogGroupArn()) == false)
            return false;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getLogGroupArn() == null) ? 0 : getLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLoggingConfigurationRequest clone() {
        return (UpdateLoggingConfigurationRequest) super.clone();
    }

}
