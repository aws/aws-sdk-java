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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about a lambda function scheduled during an execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/LambdaFunctionScheduledEventDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaFunctionScheduledEventDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduled lambda function.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * The JSON data input to the lambda function.
     * </p>
     */
    private String input;
    /**
     * <p>
     * The maximum allowed duration of the lambda function.
     * </p>
     */
    private Long timeoutInSeconds;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduled lambda function.
     * </p>
     * 
     * @param resource
     *        The Amazon Resource Name (ARN) of the scheduled lambda function.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduled lambda function.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the scheduled lambda function.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduled lambda function.
     * </p>
     * 
     * @param resource
     *        The Amazon Resource Name (ARN) of the scheduled lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionScheduledEventDetails withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The JSON data input to the lambda function.
     * </p>
     * 
     * @param input
     *        The JSON data input to the lambda function.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The JSON data input to the lambda function.
     * </p>
     * 
     * @return The JSON data input to the lambda function.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The JSON data input to the lambda function.
     * </p>
     * 
     * @param input
     *        The JSON data input to the lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionScheduledEventDetails withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The maximum allowed duration of the lambda function.
     * </p>
     * 
     * @param timeoutInSeconds
     *        The maximum allowed duration of the lambda function.
     */

    public void setTimeoutInSeconds(Long timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    /**
     * <p>
     * The maximum allowed duration of the lambda function.
     * </p>
     * 
     * @return The maximum allowed duration of the lambda function.
     */

    public Long getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * <p>
     * The maximum allowed duration of the lambda function.
     * </p>
     * 
     * @param timeoutInSeconds
     *        The maximum allowed duration of the lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionScheduledEventDetails withTimeoutInSeconds(Long timeoutInSeconds) {
        setTimeoutInSeconds(timeoutInSeconds);
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
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append("***Sensitive Data Redacted***").append(",");
        if (getTimeoutInSeconds() != null)
            sb.append("TimeoutInSeconds: ").append(getTimeoutInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaFunctionScheduledEventDetails == false)
            return false;
        LambdaFunctionScheduledEventDetails other = (LambdaFunctionScheduledEventDetails) obj;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getTimeoutInSeconds() == null ^ this.getTimeoutInSeconds() == null)
            return false;
        if (other.getTimeoutInSeconds() != null && other.getTimeoutInSeconds().equals(this.getTimeoutInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInSeconds() == null) ? 0 : getTimeoutInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public LambdaFunctionScheduledEventDetails clone() {
        try {
            return (LambdaFunctionScheduledEventDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.LambdaFunctionScheduledEventDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
