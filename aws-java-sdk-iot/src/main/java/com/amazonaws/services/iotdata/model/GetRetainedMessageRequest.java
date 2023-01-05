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
package com.amazonaws.services.iotdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the GetRetainedMessage operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-data-2015-05-28/GetRetainedMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRetainedMessageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The topic name of the retained message to retrieve.
     * </p>
     */
    private String topic;

    /**
     * <p>
     * The topic name of the retained message to retrieve.
     * </p>
     * 
     * @param topic
     *        The topic name of the retained message to retrieve.
     */

    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * The topic name of the retained message to retrieve.
     * </p>
     * 
     * @return The topic name of the retained message to retrieve.
     */

    public String getTopic() {
        return this.topic;
    }

    /**
     * <p>
     * The topic name of the retained message to retrieve.
     * </p>
     * 
     * @param topic
     *        The topic name of the retained message to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRetainedMessageRequest withTopic(String topic) {
        setTopic(topic);
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
        if (getTopic() != null)
            sb.append("Topic: ").append(getTopic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRetainedMessageRequest == false)
            return false;
        GetRetainedMessageRequest other = (GetRetainedMessageRequest) obj;
        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        return hashCode;
    }

    @Override
    public GetRetainedMessageRequest clone() {
        return (GetRetainedMessageRequest) super.clone();
    }

}
