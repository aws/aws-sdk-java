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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for using a Lambda function as a target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/PipeTargetLambdaFunctionParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeTargetLambdaFunctionParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Choose from the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open until the
     * function returns a response or times out. The API response includes the function response and additional data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the function's
     * dead-letter queue (if it's configured). The API response only includes a status code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke the
     * function.
     * </p>
     * </li>
     * </ul>
     */
    private String invocationType;

    /**
     * <p>
     * Choose from the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open until the
     * function returns a response or times out. The API response includes the function response and additional data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the function's
     * dead-letter queue (if it's configured). The API response only includes a status code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke the
     * function.
     * </p>
     * </li>
     * </ul>
     * 
     * @param invocationType
     *        Choose from the following options.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open until
     *        the function returns a response or times out. The API response includes the function response and
     *        additional data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the
     *        function's dead-letter queue (if it's configured). The API response only includes a status code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke
     *        the function.
     *        </p>
     *        </li>
     * @see PipeTargetInvocationType
     */

    public void setInvocationType(String invocationType) {
        this.invocationType = invocationType;
    }

    /**
     * <p>
     * Choose from the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open until the
     * function returns a response or times out. The API response includes the function response and additional data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the function's
     * dead-letter queue (if it's configured). The API response only includes a status code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke the
     * function.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Choose from the following options.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open
     *         until the function returns a response or times out. The API response includes the function response and
     *         additional data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the
     *         function's dead-letter queue (if it's configured). The API response only includes a status code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke
     *         the function.
     *         </p>
     *         </li>
     * @see PipeTargetInvocationType
     */

    public String getInvocationType() {
        return this.invocationType;
    }

    /**
     * <p>
     * Choose from the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open until the
     * function returns a response or times out. The API response includes the function response and additional data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the function's
     * dead-letter queue (if it's configured). The API response only includes a status code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke the
     * function.
     * </p>
     * </li>
     * </ul>
     * 
     * @param invocationType
     *        Choose from the following options.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open until
     *        the function returns a response or times out. The API response includes the function response and
     *        additional data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the
     *        function's dead-letter queue (if it's configured). The API response only includes a status code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke
     *        the function.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipeTargetInvocationType
     */

    public PipeTargetLambdaFunctionParameters withInvocationType(String invocationType) {
        setInvocationType(invocationType);
        return this;
    }

    /**
     * <p>
     * Choose from the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open until the
     * function returns a response or times out. The API response includes the function response and additional data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the function's
     * dead-letter queue (if it's configured). The API response only includes a status code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke the
     * function.
     * </p>
     * </li>
     * </ul>
     * 
     * @param invocationType
     *        Choose from the following options.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RequestResponse</code> (default) - Invoke the function synchronously. Keep the connection open until
     *        the function returns a response or times out. The API response includes the function response and
     *        additional data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Event</code> - Invoke the function asynchronously. Send events that fail multiple times to the
     *        function's dead-letter queue (if it's configured). The API response only includes a status code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DryRun</code> - Validate parameter values and verify that the user or role has permission to invoke
     *        the function.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipeTargetInvocationType
     */

    public PipeTargetLambdaFunctionParameters withInvocationType(PipeTargetInvocationType invocationType) {
        this.invocationType = invocationType.toString();
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
        if (getInvocationType() != null)
            sb.append("InvocationType: ").append(getInvocationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipeTargetLambdaFunctionParameters == false)
            return false;
        PipeTargetLambdaFunctionParameters other = (PipeTargetLambdaFunctionParameters) obj;
        if (other.getInvocationType() == null ^ this.getInvocationType() == null)
            return false;
        if (other.getInvocationType() != null && other.getInvocationType().equals(this.getInvocationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvocationType() == null) ? 0 : getInvocationType().hashCode());
        return hashCode;
    }

    @Override
    public PipeTargetLambdaFunctionParameters clone() {
        try {
            return (PipeTargetLambdaFunctionParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.PipeTargetLambdaFunctionParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
