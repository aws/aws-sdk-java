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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/RunPipelineActivity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunPipelineActivityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The enriched or transformed sample message payloads as base64-encoded strings. (The results of running the
     * pipeline activity on each input sample message payload, encoded in base64.)
     * </p>
     */
    private java.util.List<java.nio.ByteBuffer> payloads;
    /**
     * <p>
     * In case the pipeline activity fails, the log message that is generated.
     * </p>
     */
    private String logResult;

    /**
     * <p>
     * The enriched or transformed sample message payloads as base64-encoded strings. (The results of running the
     * pipeline activity on each input sample message payload, encoded in base64.)
     * </p>
     * 
     * @return The enriched or transformed sample message payloads as base64-encoded strings. (The results of running
     *         the pipeline activity on each input sample message payload, encoded in base64.)
     */

    public java.util.List<java.nio.ByteBuffer> getPayloads() {
        return payloads;
    }

    /**
     * <p>
     * The enriched or transformed sample message payloads as base64-encoded strings. (The results of running the
     * pipeline activity on each input sample message payload, encoded in base64.)
     * </p>
     * 
     * @param payloads
     *        The enriched or transformed sample message payloads as base64-encoded strings. (The results of running the
     *        pipeline activity on each input sample message payload, encoded in base64.)
     */

    public void setPayloads(java.util.Collection<java.nio.ByteBuffer> payloads) {
        if (payloads == null) {
            this.payloads = null;
            return;
        }

        this.payloads = new java.util.ArrayList<java.nio.ByteBuffer>(payloads);
    }

    /**
     * <p>
     * The enriched or transformed sample message payloads as base64-encoded strings. (The results of running the
     * pipeline activity on each input sample message payload, encoded in base64.)
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPayloads(java.util.Collection)} or {@link #withPayloads(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param payloads
     *        The enriched or transformed sample message payloads as base64-encoded strings. (The results of running the
     *        pipeline activity on each input sample message payload, encoded in base64.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunPipelineActivityResult withPayloads(java.nio.ByteBuffer... payloads) {
        if (this.payloads == null) {
            setPayloads(new java.util.ArrayList<java.nio.ByteBuffer>(payloads.length));
        }
        for (java.nio.ByteBuffer ele : payloads) {
            this.payloads.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The enriched or transformed sample message payloads as base64-encoded strings. (The results of running the
     * pipeline activity on each input sample message payload, encoded in base64.)
     * </p>
     * 
     * @param payloads
     *        The enriched or transformed sample message payloads as base64-encoded strings. (The results of running the
     *        pipeline activity on each input sample message payload, encoded in base64.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunPipelineActivityResult withPayloads(java.util.Collection<java.nio.ByteBuffer> payloads) {
        setPayloads(payloads);
        return this;
    }

    /**
     * <p>
     * In case the pipeline activity fails, the log message that is generated.
     * </p>
     * 
     * @param logResult
     *        In case the pipeline activity fails, the log message that is generated.
     */

    public void setLogResult(String logResult) {
        this.logResult = logResult;
    }

    /**
     * <p>
     * In case the pipeline activity fails, the log message that is generated.
     * </p>
     * 
     * @return In case the pipeline activity fails, the log message that is generated.
     */

    public String getLogResult() {
        return this.logResult;
    }

    /**
     * <p>
     * In case the pipeline activity fails, the log message that is generated.
     * </p>
     * 
     * @param logResult
     *        In case the pipeline activity fails, the log message that is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunPipelineActivityResult withLogResult(String logResult) {
        setLogResult(logResult);
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
        if (getPayloads() != null)
            sb.append("Payloads: ").append(getPayloads()).append(",");
        if (getLogResult() != null)
            sb.append("LogResult: ").append(getLogResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunPipelineActivityResult == false)
            return false;
        RunPipelineActivityResult other = (RunPipelineActivityResult) obj;
        if (other.getPayloads() == null ^ this.getPayloads() == null)
            return false;
        if (other.getPayloads() != null && other.getPayloads().equals(this.getPayloads()) == false)
            return false;
        if (other.getLogResult() == null ^ this.getLogResult() == null)
            return false;
        if (other.getLogResult() != null && other.getLogResult().equals(this.getLogResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPayloads() == null) ? 0 : getPayloads().hashCode());
        hashCode = prime * hashCode + ((getLogResult() == null) ? 0 : getLogResult().hashCode());
        return hashCode;
    }

    @Override
    public RunPipelineActivityResult clone() {
        try {
            return (RunPipelineActivityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
