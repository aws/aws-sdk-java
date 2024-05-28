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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/GetManagedEndpointSessionCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetManagedEndpointSessionCredentialsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the managed endpoint for which the request is submitted.
     * </p>
     */
    private String endpointIdentifier;
    /**
     * <p>
     * The ARN of the Virtual Cluster which the Managed Endpoint belongs to.
     * </p>
     */
    private String virtualClusterIdentifier;
    /**
     * <p>
     * The IAM Execution Role ARN that will be used by the job run.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * Type of the token requested. Currently supported and default value of this field is “TOKEN.”
     * </p>
     */
    private String credentialType;
    /**
     * <p>
     * Duration in seconds for which the session token is valid. The default duration is 15 minutes and the maximum is
     * 12 hours.
     * </p>
     */
    private Integer durationInSeconds;
    /**
     * <p>
     * String identifier used to separate sections of the execution logs uploaded to S3.
     * </p>
     */
    private String logContext;
    /**
     * <p>
     * The client idempotency token of the job run request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ARN of the managed endpoint for which the request is submitted.
     * </p>
     * 
     * @param endpointIdentifier
     *        The ARN of the managed endpoint for which the request is submitted.
     */

    public void setEndpointIdentifier(String endpointIdentifier) {
        this.endpointIdentifier = endpointIdentifier;
    }

    /**
     * <p>
     * The ARN of the managed endpoint for which the request is submitted.
     * </p>
     * 
     * @return The ARN of the managed endpoint for which the request is submitted.
     */

    public String getEndpointIdentifier() {
        return this.endpointIdentifier;
    }

    /**
     * <p>
     * The ARN of the managed endpoint for which the request is submitted.
     * </p>
     * 
     * @param endpointIdentifier
     *        The ARN of the managed endpoint for which the request is submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedEndpointSessionCredentialsRequest withEndpointIdentifier(String endpointIdentifier) {
        setEndpointIdentifier(endpointIdentifier);
        return this;
    }

    /**
     * <p>
     * The ARN of the Virtual Cluster which the Managed Endpoint belongs to.
     * </p>
     * 
     * @param virtualClusterIdentifier
     *        The ARN of the Virtual Cluster which the Managed Endpoint belongs to.
     */

    public void setVirtualClusterIdentifier(String virtualClusterIdentifier) {
        this.virtualClusterIdentifier = virtualClusterIdentifier;
    }

    /**
     * <p>
     * The ARN of the Virtual Cluster which the Managed Endpoint belongs to.
     * </p>
     * 
     * @return The ARN of the Virtual Cluster which the Managed Endpoint belongs to.
     */

    public String getVirtualClusterIdentifier() {
        return this.virtualClusterIdentifier;
    }

    /**
     * <p>
     * The ARN of the Virtual Cluster which the Managed Endpoint belongs to.
     * </p>
     * 
     * @param virtualClusterIdentifier
     *        The ARN of the Virtual Cluster which the Managed Endpoint belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedEndpointSessionCredentialsRequest withVirtualClusterIdentifier(String virtualClusterIdentifier) {
        setVirtualClusterIdentifier(virtualClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The IAM Execution Role ARN that will be used by the job run.
     * </p>
     * 
     * @param executionRoleArn
     *        The IAM Execution Role ARN that will be used by the job run.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The IAM Execution Role ARN that will be used by the job run.
     * </p>
     * 
     * @return The IAM Execution Role ARN that will be used by the job run.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The IAM Execution Role ARN that will be used by the job run.
     * </p>
     * 
     * @param executionRoleArn
     *        The IAM Execution Role ARN that will be used by the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedEndpointSessionCredentialsRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * Type of the token requested. Currently supported and default value of this field is “TOKEN.”
     * </p>
     * 
     * @param credentialType
     *        Type of the token requested. Currently supported and default value of this field is “TOKEN.”
     */

    public void setCredentialType(String credentialType) {
        this.credentialType = credentialType;
    }

    /**
     * <p>
     * Type of the token requested. Currently supported and default value of this field is “TOKEN.”
     * </p>
     * 
     * @return Type of the token requested. Currently supported and default value of this field is “TOKEN.”
     */

    public String getCredentialType() {
        return this.credentialType;
    }

    /**
     * <p>
     * Type of the token requested. Currently supported and default value of this field is “TOKEN.”
     * </p>
     * 
     * @param credentialType
     *        Type of the token requested. Currently supported and default value of this field is “TOKEN.”
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedEndpointSessionCredentialsRequest withCredentialType(String credentialType) {
        setCredentialType(credentialType);
        return this;
    }

    /**
     * <p>
     * Duration in seconds for which the session token is valid. The default duration is 15 minutes and the maximum is
     * 12 hours.
     * </p>
     * 
     * @param durationInSeconds
     *        Duration in seconds for which the session token is valid. The default duration is 15 minutes and the
     *        maximum is 12 hours.
     */

    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * Duration in seconds for which the session token is valid. The default duration is 15 minutes and the maximum is
     * 12 hours.
     * </p>
     * 
     * @return Duration in seconds for which the session token is valid. The default duration is 15 minutes and the
     *         maximum is 12 hours.
     */

    public Integer getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * <p>
     * Duration in seconds for which the session token is valid. The default duration is 15 minutes and the maximum is
     * 12 hours.
     * </p>
     * 
     * @param durationInSeconds
     *        Duration in seconds for which the session token is valid. The default duration is 15 minutes and the
     *        maximum is 12 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedEndpointSessionCredentialsRequest withDurationInSeconds(Integer durationInSeconds) {
        setDurationInSeconds(durationInSeconds);
        return this;
    }

    /**
     * <p>
     * String identifier used to separate sections of the execution logs uploaded to S3.
     * </p>
     * 
     * @param logContext
     *        String identifier used to separate sections of the execution logs uploaded to S3.
     */

    public void setLogContext(String logContext) {
        this.logContext = logContext;
    }

    /**
     * <p>
     * String identifier used to separate sections of the execution logs uploaded to S3.
     * </p>
     * 
     * @return String identifier used to separate sections of the execution logs uploaded to S3.
     */

    public String getLogContext() {
        return this.logContext;
    }

    /**
     * <p>
     * String identifier used to separate sections of the execution logs uploaded to S3.
     * </p>
     * 
     * @param logContext
     *        String identifier used to separate sections of the execution logs uploaded to S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedEndpointSessionCredentialsRequest withLogContext(String logContext) {
        setLogContext(logContext);
        return this;
    }

    /**
     * <p>
     * The client idempotency token of the job run request.
     * </p>
     * 
     * @param clientToken
     *        The client idempotency token of the job run request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client idempotency token of the job run request.
     * </p>
     * 
     * @return The client idempotency token of the job run request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client idempotency token of the job run request.
     * </p>
     * 
     * @param clientToken
     *        The client idempotency token of the job run request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedEndpointSessionCredentialsRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getEndpointIdentifier() != null)
            sb.append("EndpointIdentifier: ").append(getEndpointIdentifier()).append(",");
        if (getVirtualClusterIdentifier() != null)
            sb.append("VirtualClusterIdentifier: ").append(getVirtualClusterIdentifier()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getCredentialType() != null)
            sb.append("CredentialType: ").append(getCredentialType()).append(",");
        if (getDurationInSeconds() != null)
            sb.append("DurationInSeconds: ").append(getDurationInSeconds()).append(",");
        if (getLogContext() != null)
            sb.append("LogContext: ").append(getLogContext()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetManagedEndpointSessionCredentialsRequest == false)
            return false;
        GetManagedEndpointSessionCredentialsRequest other = (GetManagedEndpointSessionCredentialsRequest) obj;
        if (other.getEndpointIdentifier() == null ^ this.getEndpointIdentifier() == null)
            return false;
        if (other.getEndpointIdentifier() != null && other.getEndpointIdentifier().equals(this.getEndpointIdentifier()) == false)
            return false;
        if (other.getVirtualClusterIdentifier() == null ^ this.getVirtualClusterIdentifier() == null)
            return false;
        if (other.getVirtualClusterIdentifier() != null && other.getVirtualClusterIdentifier().equals(this.getVirtualClusterIdentifier()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getCredentialType() == null ^ this.getCredentialType() == null)
            return false;
        if (other.getCredentialType() != null && other.getCredentialType().equals(this.getCredentialType()) == false)
            return false;
        if (other.getDurationInSeconds() == null ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null && other.getDurationInSeconds().equals(this.getDurationInSeconds()) == false)
            return false;
        if (other.getLogContext() == null ^ this.getLogContext() == null)
            return false;
        if (other.getLogContext() != null && other.getLogContext().equals(this.getLogContext()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointIdentifier() == null) ? 0 : getEndpointIdentifier().hashCode());
        hashCode = prime * hashCode + ((getVirtualClusterIdentifier() == null) ? 0 : getVirtualClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCredentialType() == null) ? 0 : getCredentialType().hashCode());
        hashCode = prime * hashCode + ((getDurationInSeconds() == null) ? 0 : getDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getLogContext() == null) ? 0 : getLogContext().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public GetManagedEndpointSessionCredentialsRequest clone() {
        return (GetManagedEndpointSessionCredentialsRequest) super.clone();
    }

}
