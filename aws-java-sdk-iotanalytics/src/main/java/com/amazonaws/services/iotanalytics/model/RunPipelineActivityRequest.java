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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/RunPipelineActivity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunPipelineActivityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The pipeline activity that is run. This must not be a 'channel' activity or a 'datastore' activity because these
     * activities are used in a pipeline only to load the original message and to store the (possibly) transformed
     * message. If a 'lambda' activity is specified, only short-running Lambda functions (those with a timeout of less
     * than 30 seconds or less) can be used.
     * </p>
     */
    private PipelineActivity pipelineActivity;
    /**
     * <p>
     * The sample message payloads on which the pipeline activity is run.
     * </p>
     */
    private java.util.List<java.nio.ByteBuffer> payloads;

    /**
     * <p>
     * The pipeline activity that is run. This must not be a 'channel' activity or a 'datastore' activity because these
     * activities are used in a pipeline only to load the original message and to store the (possibly) transformed
     * message. If a 'lambda' activity is specified, only short-running Lambda functions (those with a timeout of less
     * than 30 seconds or less) can be used.
     * </p>
     * 
     * @param pipelineActivity
     *        The pipeline activity that is run. This must not be a 'channel' activity or a 'datastore' activity because
     *        these activities are used in a pipeline only to load the original message and to store the (possibly)
     *        transformed message. If a 'lambda' activity is specified, only short-running Lambda functions (those with
     *        a timeout of less than 30 seconds or less) can be used.
     */

    public void setPipelineActivity(PipelineActivity pipelineActivity) {
        this.pipelineActivity = pipelineActivity;
    }

    /**
     * <p>
     * The pipeline activity that is run. This must not be a 'channel' activity or a 'datastore' activity because these
     * activities are used in a pipeline only to load the original message and to store the (possibly) transformed
     * message. If a 'lambda' activity is specified, only short-running Lambda functions (those with a timeout of less
     * than 30 seconds or less) can be used.
     * </p>
     * 
     * @return The pipeline activity that is run. This must not be a 'channel' activity or a 'datastore' activity
     *         because these activities are used in a pipeline only to load the original message and to store the
     *         (possibly) transformed message. If a 'lambda' activity is specified, only short-running Lambda functions
     *         (those with a timeout of less than 30 seconds or less) can be used.
     */

    public PipelineActivity getPipelineActivity() {
        return this.pipelineActivity;
    }

    /**
     * <p>
     * The pipeline activity that is run. This must not be a 'channel' activity or a 'datastore' activity because these
     * activities are used in a pipeline only to load the original message and to store the (possibly) transformed
     * message. If a 'lambda' activity is specified, only short-running Lambda functions (those with a timeout of less
     * than 30 seconds or less) can be used.
     * </p>
     * 
     * @param pipelineActivity
     *        The pipeline activity that is run. This must not be a 'channel' activity or a 'datastore' activity because
     *        these activities are used in a pipeline only to load the original message and to store the (possibly)
     *        transformed message. If a 'lambda' activity is specified, only short-running Lambda functions (those with
     *        a timeout of less than 30 seconds or less) can be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunPipelineActivityRequest withPipelineActivity(PipelineActivity pipelineActivity) {
        setPipelineActivity(pipelineActivity);
        return this;
    }

    /**
     * <p>
     * The sample message payloads on which the pipeline activity is run.
     * </p>
     * 
     * @return The sample message payloads on which the pipeline activity is run.
     */

    public java.util.List<java.nio.ByteBuffer> getPayloads() {
        return payloads;
    }

    /**
     * <p>
     * The sample message payloads on which the pipeline activity is run.
     * </p>
     * 
     * @param payloads
     *        The sample message payloads on which the pipeline activity is run.
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
     * The sample message payloads on which the pipeline activity is run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPayloads(java.util.Collection)} or {@link #withPayloads(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param payloads
     *        The sample message payloads on which the pipeline activity is run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunPipelineActivityRequest withPayloads(java.nio.ByteBuffer... payloads) {
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
     * The sample message payloads on which the pipeline activity is run.
     * </p>
     * 
     * @param payloads
     *        The sample message payloads on which the pipeline activity is run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunPipelineActivityRequest withPayloads(java.util.Collection<java.nio.ByteBuffer> payloads) {
        setPayloads(payloads);
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
        if (getPipelineActivity() != null)
            sb.append("PipelineActivity: ").append(getPipelineActivity()).append(",");
        if (getPayloads() != null)
            sb.append("Payloads: ").append(getPayloads());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunPipelineActivityRequest == false)
            return false;
        RunPipelineActivityRequest other = (RunPipelineActivityRequest) obj;
        if (other.getPipelineActivity() == null ^ this.getPipelineActivity() == null)
            return false;
        if (other.getPipelineActivity() != null && other.getPipelineActivity().equals(this.getPipelineActivity()) == false)
            return false;
        if (other.getPayloads() == null ^ this.getPayloads() == null)
            return false;
        if (other.getPayloads() != null && other.getPayloads().equals(this.getPayloads()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineActivity() == null) ? 0 : getPipelineActivity().hashCode());
        hashCode = prime * hashCode + ((getPayloads() == null) ? 0 : getPayloads().hashCode());
        return hashCode;
    }

    @Override
    public RunPipelineActivityRequest clone() {
        return (RunPipelineActivityRequest) super.clone();
    }

}
