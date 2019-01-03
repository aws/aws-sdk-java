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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConsoleOutputResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The console output, base64-encoded. If you are using a command line tool, the tool decodes the output for you.
     * </p>
     */
    private String output;
    /**
     * <p>
     * The time at which the output was last updated.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConsoleOutputResult withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The console output, base64-encoded. If you are using a command line tool, the tool decodes the output for you.
     * </p>
     * 
     * @param output
     *        The console output, base64-encoded. If you are using a command line tool, the tool decodes the output for
     *        you.
     */

    public void setOutput(String output) {
        this.output = output;
    }

    /**
     * <p>
     * The console output, base64-encoded. If you are using a command line tool, the tool decodes the output for you.
     * </p>
     * 
     * @return The console output, base64-encoded. If you are using a command line tool, the tool decodes the output for
     *         you.
     */

    public String getOutput() {
        return this.output;
    }

    /**
     * <p>
     * The console output, base64-encoded. If you are using a command line tool, the tool decodes the output for you.
     * </p>
     * 
     * @param output
     *        The console output, base64-encoded. If you are using a command line tool, the tool decodes the output for
     *        you.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConsoleOutputResult withOutput(String output) {
        setOutput(output);
        return this;
    }

    /**
     * <p>
     * The time at which the output was last updated.
     * </p>
     * 
     * @param timestamp
     *        The time at which the output was last updated.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time at which the output was last updated.
     * </p>
     * 
     * @return The time at which the output was last updated.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time at which the output was last updated.
     * </p>
     * 
     * @param timestamp
     *        The time at which the output was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConsoleOutputResult withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * The decoded console output.
     *
     * @return The decoded console output.
     */
    public String getDecodedOutput() {
        byte[] bytes = com.amazonaws.util.BinaryUtils.fromBase64(output);
        return new String(bytes, com.amazonaws.util.StringUtils.UTF8);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConsoleOutputResult == false)
            return false;
        GetConsoleOutputResult other = (GetConsoleOutputResult) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public GetConsoleOutputResult clone() {
        try {
            return (GetConsoleOutputResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
