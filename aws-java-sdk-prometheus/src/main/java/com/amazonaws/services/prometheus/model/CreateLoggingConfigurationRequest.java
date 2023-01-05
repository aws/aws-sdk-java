/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the input of a CreateLoggingConfiguration operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateLoggingConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLoggingConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Optional, unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The ARN of the CW log group to which the vended log data will be published.
     * </p>
     */
    private String logGroupArn;
    /**
     * <p>
     * The ID of the workspace to vend logs to.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * Optional, unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Optional, unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Optional, unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
     * </p>
     * 
     * @return Optional, unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Optional, unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Optional, unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoggingConfigurationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The ARN of the CW log group to which the vended log data will be published.
     * </p>
     * 
     * @param logGroupArn
     *        The ARN of the CW log group to which the vended log data will be published.
     */

    public void setLogGroupArn(String logGroupArn) {
        this.logGroupArn = logGroupArn;
    }

    /**
     * <p>
     * The ARN of the CW log group to which the vended log data will be published.
     * </p>
     * 
     * @return The ARN of the CW log group to which the vended log data will be published.
     */

    public String getLogGroupArn() {
        return this.logGroupArn;
    }

    /**
     * <p>
     * The ARN of the CW log group to which the vended log data will be published.
     * </p>
     * 
     * @param logGroupArn
     *        The ARN of the CW log group to which the vended log data will be published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoggingConfigurationRequest withLogGroupArn(String logGroupArn) {
        setLogGroupArn(logGroupArn);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace to vend logs to.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to vend logs to.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to vend logs to.
     * </p>
     * 
     * @return The ID of the workspace to vend logs to.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to vend logs to.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to vend logs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoggingConfigurationRequest withWorkspaceId(String workspaceId) {
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

        if (obj instanceof CreateLoggingConfigurationRequest == false)
            return false;
        CreateLoggingConfigurationRequest other = (CreateLoggingConfigurationRequest) obj;
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
    public CreateLoggingConfigurationRequest clone() {
        return (CreateLoggingConfigurationRequest) super.clone();
    }

}
