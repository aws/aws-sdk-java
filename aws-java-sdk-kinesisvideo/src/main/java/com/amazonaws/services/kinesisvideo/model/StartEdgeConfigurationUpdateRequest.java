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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/StartEdgeConfigurationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartEdgeConfigurationUpdateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream whose edge configuration you want to update. Specify either the <code>StreamName</code> or
     * the <code>StreamARN</code>.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream. Specify either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * The edge configuration details required to invoke the update process.
     * </p>
     */
    private EdgeConfig edgeConfig;

    /**
     * <p>
     * The name of the stream whose edge configuration you want to update. Specify either the <code>StreamName</code> or
     * the <code>StreamARN</code>.
     * </p>
     * 
     * @param streamName
     *        The name of the stream whose edge configuration you want to update. Specify either the
     *        <code>StreamName</code> or the <code>StreamARN</code>.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream whose edge configuration you want to update. Specify either the <code>StreamName</code> or
     * the <code>StreamARN</code>.
     * </p>
     * 
     * @return The name of the stream whose edge configuration you want to update. Specify either the
     *         <code>StreamName</code> or the <code>StreamARN</code>.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream whose edge configuration you want to update. Specify either the <code>StreamName</code> or
     * the <code>StreamARN</code>.
     * </p>
     * 
     * @param streamName
     *        The name of the stream whose edge configuration you want to update. Specify either the
     *        <code>StreamName</code> or the <code>StreamARN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEdgeConfigurationUpdateRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream. Specify either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream. Specify either the <code>StreamName</code> or the
     *        <code>StreamARN</code>.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream. Specify either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the stream. Specify either the <code>StreamName</code> or the
     *         <code>StreamARN</code>.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream. Specify either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream. Specify either the <code>StreamName</code> or the
     *        <code>StreamARN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEdgeConfigurationUpdateRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * The edge configuration details required to invoke the update process.
     * </p>
     * 
     * @param edgeConfig
     *        The edge configuration details required to invoke the update process.
     */

    public void setEdgeConfig(EdgeConfig edgeConfig) {
        this.edgeConfig = edgeConfig;
    }

    /**
     * <p>
     * The edge configuration details required to invoke the update process.
     * </p>
     * 
     * @return The edge configuration details required to invoke the update process.
     */

    public EdgeConfig getEdgeConfig() {
        return this.edgeConfig;
    }

    /**
     * <p>
     * The edge configuration details required to invoke the update process.
     * </p>
     * 
     * @param edgeConfig
     *        The edge configuration details required to invoke the update process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEdgeConfigurationUpdateRequest withEdgeConfig(EdgeConfig edgeConfig) {
        setEdgeConfig(edgeConfig);
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
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN()).append(",");
        if (getEdgeConfig() != null)
            sb.append("EdgeConfig: ").append(getEdgeConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartEdgeConfigurationUpdateRequest == false)
            return false;
        StartEdgeConfigurationUpdateRequest other = (StartEdgeConfigurationUpdateRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getEdgeConfig() == null ^ this.getEdgeConfig() == null)
            return false;
        if (other.getEdgeConfig() != null && other.getEdgeConfig().equals(this.getEdgeConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getEdgeConfig() == null) ? 0 : getEdgeConfig().hashCode());
        return hashCode;
    }

    @Override
    public StartEdgeConfigurationUpdateRequest clone() {
        return (StartEdgeConfigurationUpdateRequest) super.clone();
    }

}
