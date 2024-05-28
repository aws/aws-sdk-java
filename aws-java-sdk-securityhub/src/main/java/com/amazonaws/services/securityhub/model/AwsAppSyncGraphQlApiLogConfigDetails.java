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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the logging configuration when writing GraphQL operations and tracing to Amazon CloudWatch for an AppSync
 * GraphQL API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAppSyncGraphQlApiLogConfigDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAppSyncGraphQlApiLogConfigDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role that AppSync assumes to publish to CloudWatch Logs in your
     * account.
     * </p>
     */
    private String cloudWatchLogsRoleArn;
    /**
     * <p>
     * Set to <code>TRUE</code> to exclude sections that contain information such as headers, context, and evaluated
     * mapping templates, regardless of logging level.
     * </p>
     */
    private Boolean excludeVerboseContent;
    /**
     * <p>
     * The field logging level.
     * </p>
     */
    private String fieldLogLevel;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role that AppSync assumes to publish to CloudWatch Logs in your
     * account.
     * </p>
     * 
     * @param cloudWatchLogsRoleArn
     *        The Amazon Resource Name (ARN) of the service role that AppSync assumes to publish to CloudWatch Logs in
     *        your account.
     */

    public void setCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role that AppSync assumes to publish to CloudWatch Logs in your
     * account.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service role that AppSync assumes to publish to CloudWatch Logs in
     *         your account.
     */

    public String getCloudWatchLogsRoleArn() {
        return this.cloudWatchLogsRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service role that AppSync assumes to publish to CloudWatch Logs in your
     * account.
     * </p>
     * 
     * @param cloudWatchLogsRoleArn
     *        The Amazon Resource Name (ARN) of the service role that AppSync assumes to publish to CloudWatch Logs in
     *        your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiLogConfigDetails withCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        setCloudWatchLogsRoleArn(cloudWatchLogsRoleArn);
        return this;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to exclude sections that contain information such as headers, context, and evaluated
     * mapping templates, regardless of logging level.
     * </p>
     * 
     * @param excludeVerboseContent
     *        Set to <code>TRUE</code> to exclude sections that contain information such as headers, context, and
     *        evaluated mapping templates, regardless of logging level.
     */

    public void setExcludeVerboseContent(Boolean excludeVerboseContent) {
        this.excludeVerboseContent = excludeVerboseContent;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to exclude sections that contain information such as headers, context, and evaluated
     * mapping templates, regardless of logging level.
     * </p>
     * 
     * @return Set to <code>TRUE</code> to exclude sections that contain information such as headers, context, and
     *         evaluated mapping templates, regardless of logging level.
     */

    public Boolean getExcludeVerboseContent() {
        return this.excludeVerboseContent;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to exclude sections that contain information such as headers, context, and evaluated
     * mapping templates, regardless of logging level.
     * </p>
     * 
     * @param excludeVerboseContent
     *        Set to <code>TRUE</code> to exclude sections that contain information such as headers, context, and
     *        evaluated mapping templates, regardless of logging level.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiLogConfigDetails withExcludeVerboseContent(Boolean excludeVerboseContent) {
        setExcludeVerboseContent(excludeVerboseContent);
        return this;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to exclude sections that contain information such as headers, context, and evaluated
     * mapping templates, regardless of logging level.
     * </p>
     * 
     * @return Set to <code>TRUE</code> to exclude sections that contain information such as headers, context, and
     *         evaluated mapping templates, regardless of logging level.
     */

    public Boolean isExcludeVerboseContent() {
        return this.excludeVerboseContent;
    }

    /**
     * <p>
     * The field logging level.
     * </p>
     * 
     * @param fieldLogLevel
     *        The field logging level.
     */

    public void setFieldLogLevel(String fieldLogLevel) {
        this.fieldLogLevel = fieldLogLevel;
    }

    /**
     * <p>
     * The field logging level.
     * </p>
     * 
     * @return The field logging level.
     */

    public String getFieldLogLevel() {
        return this.fieldLogLevel;
    }

    /**
     * <p>
     * The field logging level.
     * </p>
     * 
     * @param fieldLogLevel
     *        The field logging level.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiLogConfigDetails withFieldLogLevel(String fieldLogLevel) {
        setFieldLogLevel(fieldLogLevel);
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
        if (getCloudWatchLogsRoleArn() != null)
            sb.append("CloudWatchLogsRoleArn: ").append(getCloudWatchLogsRoleArn()).append(",");
        if (getExcludeVerboseContent() != null)
            sb.append("ExcludeVerboseContent: ").append(getExcludeVerboseContent()).append(",");
        if (getFieldLogLevel() != null)
            sb.append("FieldLogLevel: ").append(getFieldLogLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsAppSyncGraphQlApiLogConfigDetails == false)
            return false;
        AwsAppSyncGraphQlApiLogConfigDetails other = (AwsAppSyncGraphQlApiLogConfigDetails) obj;
        if (other.getCloudWatchLogsRoleArn() == null ^ this.getCloudWatchLogsRoleArn() == null)
            return false;
        if (other.getCloudWatchLogsRoleArn() != null && other.getCloudWatchLogsRoleArn().equals(this.getCloudWatchLogsRoleArn()) == false)
            return false;
        if (other.getExcludeVerboseContent() == null ^ this.getExcludeVerboseContent() == null)
            return false;
        if (other.getExcludeVerboseContent() != null && other.getExcludeVerboseContent().equals(this.getExcludeVerboseContent()) == false)
            return false;
        if (other.getFieldLogLevel() == null ^ this.getFieldLogLevel() == null)
            return false;
        if (other.getFieldLogLevel() != null && other.getFieldLogLevel().equals(this.getFieldLogLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchLogsRoleArn() == null) ? 0 : getCloudWatchLogsRoleArn().hashCode());
        hashCode = prime * hashCode + ((getExcludeVerboseContent() == null) ? 0 : getExcludeVerboseContent().hashCode());
        hashCode = prime * hashCode + ((getFieldLogLevel() == null) ? 0 : getFieldLogLevel().hashCode());
        return hashCode;
    }

    @Override
    public AwsAppSyncGraphQlApiLogConfigDetails clone() {
        try {
            return (AwsAppSyncGraphQlApiLogConfigDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAppSyncGraphQlApiLogConfigDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
