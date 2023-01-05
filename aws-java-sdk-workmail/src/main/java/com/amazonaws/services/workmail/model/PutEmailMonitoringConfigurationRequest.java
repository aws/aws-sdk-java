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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutEmailMonitoringConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEmailMonitoringConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the organization for which the email monitoring configuration is set.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Role associated with the email monitoring configuration.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Log group associated with the email monitoring configuration.
     * </p>
     */
    private String logGroupArn;

    /**
     * <p>
     * The ID of the organization for which the email monitoring configuration is set.
     * </p>
     * 
     * @param organizationId
     *        The ID of the organization for which the email monitoring configuration is set.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The ID of the organization for which the email monitoring configuration is set.
     * </p>
     * 
     * @return The ID of the organization for which the email monitoring configuration is set.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The ID of the organization for which the email monitoring configuration is set.
     * </p>
     * 
     * @param organizationId
     *        The ID of the organization for which the email monitoring configuration is set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEmailMonitoringConfigurationRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Role associated with the email monitoring configuration.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM Role associated with the email monitoring configuration.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Role associated with the email monitoring configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM Role associated with the email monitoring configuration.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Role associated with the email monitoring configuration.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM Role associated with the email monitoring configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEmailMonitoringConfigurationRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Log group associated with the email monitoring configuration.
     * </p>
     * 
     * @param logGroupArn
     *        The Amazon Resource Name (ARN) of the CloudWatch Log group associated with the email monitoring
     *        configuration.
     */

    public void setLogGroupArn(String logGroupArn) {
        this.logGroupArn = logGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Log group associated with the email monitoring configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the CloudWatch Log group associated with the email monitoring
     *         configuration.
     */

    public String getLogGroupArn() {
        return this.logGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Log group associated with the email monitoring configuration.
     * </p>
     * 
     * @param logGroupArn
     *        The Amazon Resource Name (ARN) of the CloudWatch Log group associated with the email monitoring
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEmailMonitoringConfigurationRequest withLogGroupArn(String logGroupArn) {
        setLogGroupArn(logGroupArn);
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getLogGroupArn() != null)
            sb.append("LogGroupArn: ").append(getLogGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEmailMonitoringConfigurationRequest == false)
            return false;
        PutEmailMonitoringConfigurationRequest other = (PutEmailMonitoringConfigurationRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getLogGroupArn() == null ^ this.getLogGroupArn() == null)
            return false;
        if (other.getLogGroupArn() != null && other.getLogGroupArn().equals(this.getLogGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLogGroupArn() == null) ? 0 : getLogGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public PutEmailMonitoringConfigurationRequest clone() {
        return (PutEmailMonitoringConfigurationRequest) super.clone();
    }

}
