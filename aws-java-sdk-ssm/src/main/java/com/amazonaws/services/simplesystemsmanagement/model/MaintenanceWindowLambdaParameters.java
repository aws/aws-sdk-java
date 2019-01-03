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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for a LAMBDA task type.
 * </p>
 * <p>
 * For information about specifying and updating task parameters, see <a>RegisterTaskWithMaintenanceWindow</a> and
 * <a>UpdateMaintenanceWindowTask</a>.
 * </p>
 * <note>
 * <p>
 * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
 * <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
 * <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for
 * the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
 * </p>
 * <p>
 * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead use
 * the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information about how
 * Systems Manager handles these options for the supported Maintenance Window task types, see
 * <a>MaintenanceWindowTaskInvocationParameters</a>.
 * </p>
 * <p>
 * For Lambda tasks, Systems Manager ignores any values specified for TaskParameters and LoggingInfo.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/MaintenanceWindowLambdaParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceWindowLambdaParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Pass client-specific information to the Lambda function that you are invoking. You can then process the client
     * information in your Lambda function as you choose through the context variable.
     * </p>
     */
    private String clientContext;
    /**
     * <p>
     * (Optional) Specify a Lambda function version or alias name. If you specify a function version, the action uses
     * the qualified function ARN to invoke a specific Lambda function. If you specify an alias name, the action uses
     * the alias ARN to invoke the Lambda function version to which the alias points.
     * </p>
     */
    private String qualifier;
    /**
     * <p>
     * JSON to provide to your Lambda function as input.
     * </p>
     */
    private java.nio.ByteBuffer payload;

    /**
     * <p>
     * Pass client-specific information to the Lambda function that you are invoking. You can then process the client
     * information in your Lambda function as you choose through the context variable.
     * </p>
     * 
     * @param clientContext
     *        Pass client-specific information to the Lambda function that you are invoking. You can then process the
     *        client information in your Lambda function as you choose through the context variable.
     */

    public void setClientContext(String clientContext) {
        this.clientContext = clientContext;
    }

    /**
     * <p>
     * Pass client-specific information to the Lambda function that you are invoking. You can then process the client
     * information in your Lambda function as you choose through the context variable.
     * </p>
     * 
     * @return Pass client-specific information to the Lambda function that you are invoking. You can then process the
     *         client information in your Lambda function as you choose through the context variable.
     */

    public String getClientContext() {
        return this.clientContext;
    }

    /**
     * <p>
     * Pass client-specific information to the Lambda function that you are invoking. You can then process the client
     * information in your Lambda function as you choose through the context variable.
     * </p>
     * 
     * @param clientContext
     *        Pass client-specific information to the Lambda function that you are invoking. You can then process the
     *        client information in your Lambda function as you choose through the context variable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowLambdaParameters withClientContext(String clientContext) {
        setClientContext(clientContext);
        return this;
    }

    /**
     * <p>
     * (Optional) Specify a Lambda function version or alias name. If you specify a function version, the action uses
     * the qualified function ARN to invoke a specific Lambda function. If you specify an alias name, the action uses
     * the alias ARN to invoke the Lambda function version to which the alias points.
     * </p>
     * 
     * @param qualifier
     *        (Optional) Specify a Lambda function version or alias name. If you specify a function version, the action
     *        uses the qualified function ARN to invoke a specific Lambda function. If you specify an alias name, the
     *        action uses the alias ARN to invoke the Lambda function version to which the alias points.
     */

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * <p>
     * (Optional) Specify a Lambda function version or alias name. If you specify a function version, the action uses
     * the qualified function ARN to invoke a specific Lambda function. If you specify an alias name, the action uses
     * the alias ARN to invoke the Lambda function version to which the alias points.
     * </p>
     * 
     * @return (Optional) Specify a Lambda function version or alias name. If you specify a function version, the action
     *         uses the qualified function ARN to invoke a specific Lambda function. If you specify an alias name, the
     *         action uses the alias ARN to invoke the Lambda function version to which the alias points.
     */

    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * <p>
     * (Optional) Specify a Lambda function version or alias name. If you specify a function version, the action uses
     * the qualified function ARN to invoke a specific Lambda function. If you specify an alias name, the action uses
     * the alias ARN to invoke the Lambda function version to which the alias points.
     * </p>
     * 
     * @param qualifier
     *        (Optional) Specify a Lambda function version or alias name. If you specify a function version, the action
     *        uses the qualified function ARN to invoke a specific Lambda function. If you specify an alias name, the
     *        action uses the alias ARN to invoke the Lambda function version to which the alias points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowLambdaParameters withQualifier(String qualifier) {
        setQualifier(qualifier);
        return this;
    }

    /**
     * <p>
     * JSON to provide to your Lambda function as input.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param payload
     *        JSON to provide to your Lambda function as input.
     */

    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * JSON to provide to your Lambda function as input.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return JSON to provide to your Lambda function as input.
     */

    public java.nio.ByteBuffer getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * JSON to provide to your Lambda function as input.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param payload
     *        JSON to provide to your Lambda function as input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowLambdaParameters withPayload(java.nio.ByteBuffer payload) {
        setPayload(payload);
        return this;
    }

    /**
     * <p>
     * JSON to provide to your Lambda function as input.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param payload
     *        JSON to provide to your Lambda function as input.
     */
    public void setPayload(String payload) {
        setPayload(new com.amazonaws.adapters.types.StringToByteBufferAdapter().adapt(payload));
    }

    /**
     * <p>
     * JSON to provide to your Lambda function as input.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param payload
     *        JSON to provide to your Lambda function as input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    public MaintenanceWindowLambdaParameters withPayload(String payload) {
        setPayload(new com.amazonaws.adapters.types.StringToByteBufferAdapter().adapt(payload));
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
        if (getClientContext() != null)
            sb.append("ClientContext: ").append(getClientContext()).append(",");
        if (getQualifier() != null)
            sb.append("Qualifier: ").append(getQualifier()).append(",");
        if (getPayload() != null)
            sb.append("Payload: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceWindowLambdaParameters == false)
            return false;
        MaintenanceWindowLambdaParameters other = (MaintenanceWindowLambdaParameters) obj;
        if (other.getClientContext() == null ^ this.getClientContext() == null)
            return false;
        if (other.getClientContext() != null && other.getClientContext().equals(this.getClientContext()) == false)
            return false;
        if (other.getQualifier() == null ^ this.getQualifier() == null)
            return false;
        if (other.getQualifier() != null && other.getQualifier().equals(this.getQualifier()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientContext() == null) ? 0 : getClientContext().hashCode());
        hashCode = prime * hashCode + ((getQualifier() == null) ? 0 : getQualifier().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public MaintenanceWindowLambdaParameters clone() {
        try {
            return (MaintenanceWindowLambdaParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.MaintenanceWindowLambdaParametersMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
