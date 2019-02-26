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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The CloudWatch Logs configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/LogConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field logging level. Values can be NONE, ERROR, or ALL.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NONE</b>: No field-level logs are captured.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b>: Logs the following information only for the fields that are in error:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The error section in the server response.
     * </p>
     * </li>
     * <li>
     * <p>
     * Field-level errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * The generated request/response functions that got resolved for error fields.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>ALL</b>: The following information is logged for all fields in the query:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Field-level tracing information.
     * </p>
     * </li>
     * <li>
     * <p>
     * The generated request/response functions that got resolved for each field.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String fieldLogLevel;
    /**
     * <p>
     * The service role that AWS AppSync will assume to publish to Amazon CloudWatch logs in your account.
     * </p>
     */
    private String cloudWatchLogsRoleArn;

    /**
     * <p>
     * The field logging level. Values can be NONE, ERROR, or ALL.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NONE</b>: No field-level logs are captured.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b>: Logs the following information only for the fields that are in error:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The error section in the server response.
     * </p>
     * </li>
     * <li>
     * <p>
     * Field-level errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * The generated request/response functions that got resolved for error fields.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>ALL</b>: The following information is logged for all fields in the query:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Field-level tracing information.
     * </p>
     * </li>
     * <li>
     * <p>
     * The generated request/response functions that got resolved for each field.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param fieldLogLevel
     *        The field logging level. Values can be NONE, ERROR, or ALL. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NONE</b>: No field-level logs are captured.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ERROR</b>: Logs the following information only for the fields that are in error:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The error section in the server response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Field-level errors.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The generated request/response functions that got resolved for error fields.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ALL</b>: The following information is logged for all fields in the query:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Field-level tracing information.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The generated request/response functions that got resolved for each field.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @see FieldLogLevel
     */

    public void setFieldLogLevel(String fieldLogLevel) {
        this.fieldLogLevel = fieldLogLevel;
    }

    /**
     * <p>
     * The field logging level. Values can be NONE, ERROR, or ALL.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NONE</b>: No field-level logs are captured.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b>: Logs the following information only for the fields that are in error:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The error section in the server response.
     * </p>
     * </li>
     * <li>
     * <p>
     * Field-level errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * The generated request/response functions that got resolved for error fields.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>ALL</b>: The following information is logged for all fields in the query:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Field-level tracing information.
     * </p>
     * </li>
     * <li>
     * <p>
     * The generated request/response functions that got resolved for each field.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The field logging level. Values can be NONE, ERROR, or ALL. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>NONE</b>: No field-level logs are captured.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ERROR</b>: Logs the following information only for the fields that are in error:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The error section in the server response.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Field-level errors.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The generated request/response functions that got resolved for error fields.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ALL</b>: The following information is logged for all fields in the query:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Field-level tracing information.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The generated request/response functions that got resolved for each field.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @see FieldLogLevel
     */

    public String getFieldLogLevel() {
        return this.fieldLogLevel;
    }

    /**
     * <p>
     * The field logging level. Values can be NONE, ERROR, or ALL.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NONE</b>: No field-level logs are captured.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b>: Logs the following information only for the fields that are in error:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The error section in the server response.
     * </p>
     * </li>
     * <li>
     * <p>
     * Field-level errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * The generated request/response functions that got resolved for error fields.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>ALL</b>: The following information is logged for all fields in the query:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Field-level tracing information.
     * </p>
     * </li>
     * <li>
     * <p>
     * The generated request/response functions that got resolved for each field.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param fieldLogLevel
     *        The field logging level. Values can be NONE, ERROR, or ALL. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NONE</b>: No field-level logs are captured.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ERROR</b>: Logs the following information only for the fields that are in error:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The error section in the server response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Field-level errors.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The generated request/response functions that got resolved for error fields.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ALL</b>: The following information is logged for all fields in the query:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Field-level tracing information.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The generated request/response functions that got resolved for each field.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldLogLevel
     */

    public LogConfig withFieldLogLevel(String fieldLogLevel) {
        setFieldLogLevel(fieldLogLevel);
        return this;
    }

    /**
     * <p>
     * The field logging level. Values can be NONE, ERROR, or ALL.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NONE</b>: No field-level logs are captured.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b>: Logs the following information only for the fields that are in error:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The error section in the server response.
     * </p>
     * </li>
     * <li>
     * <p>
     * Field-level errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * The generated request/response functions that got resolved for error fields.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>ALL</b>: The following information is logged for all fields in the query:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Field-level tracing information.
     * </p>
     * </li>
     * <li>
     * <p>
     * The generated request/response functions that got resolved for each field.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param fieldLogLevel
     *        The field logging level. Values can be NONE, ERROR, or ALL. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NONE</b>: No field-level logs are captured.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ERROR</b>: Logs the following information only for the fields that are in error:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The error section in the server response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Field-level errors.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The generated request/response functions that got resolved for error fields.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ALL</b>: The following information is logged for all fields in the query:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Field-level tracing information.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The generated request/response functions that got resolved for each field.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldLogLevel
     */

    public LogConfig withFieldLogLevel(FieldLogLevel fieldLogLevel) {
        this.fieldLogLevel = fieldLogLevel.toString();
        return this;
    }

    /**
     * <p>
     * The service role that AWS AppSync will assume to publish to Amazon CloudWatch logs in your account.
     * </p>
     * 
     * @param cloudWatchLogsRoleArn
     *        The service role that AWS AppSync will assume to publish to Amazon CloudWatch logs in your account.
     */

    public void setCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
    }

    /**
     * <p>
     * The service role that AWS AppSync will assume to publish to Amazon CloudWatch logs in your account.
     * </p>
     * 
     * @return The service role that AWS AppSync will assume to publish to Amazon CloudWatch logs in your account.
     */

    public String getCloudWatchLogsRoleArn() {
        return this.cloudWatchLogsRoleArn;
    }

    /**
     * <p>
     * The service role that AWS AppSync will assume to publish to Amazon CloudWatch logs in your account.
     * </p>
     * 
     * @param cloudWatchLogsRoleArn
     *        The service role that AWS AppSync will assume to publish to Amazon CloudWatch logs in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogConfig withCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        setCloudWatchLogsRoleArn(cloudWatchLogsRoleArn);
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
        if (getFieldLogLevel() != null)
            sb.append("FieldLogLevel: ").append(getFieldLogLevel()).append(",");
        if (getCloudWatchLogsRoleArn() != null)
            sb.append("CloudWatchLogsRoleArn: ").append(getCloudWatchLogsRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogConfig == false)
            return false;
        LogConfig other = (LogConfig) obj;
        if (other.getFieldLogLevel() == null ^ this.getFieldLogLevel() == null)
            return false;
        if (other.getFieldLogLevel() != null && other.getFieldLogLevel().equals(this.getFieldLogLevel()) == false)
            return false;
        if (other.getCloudWatchLogsRoleArn() == null ^ this.getCloudWatchLogsRoleArn() == null)
            return false;
        if (other.getCloudWatchLogsRoleArn() != null && other.getCloudWatchLogsRoleArn().equals(this.getCloudWatchLogsRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldLogLevel() == null) ? 0 : getFieldLogLevel().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogsRoleArn() == null) ? 0 : getCloudWatchLogsRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public LogConfig clone() {
        try {
            return (LogConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.LogConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
