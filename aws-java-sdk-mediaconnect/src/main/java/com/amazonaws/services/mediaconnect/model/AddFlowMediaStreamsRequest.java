/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A request to add media streams to the flow.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowMediaStreams" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddFlowMediaStreamsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The Amazon Resource Name (ARN) of the flow. */
    private String flowArn;
    /** The media streams that you want to add to the flow. */
    private java.util.List<AddMediaStreamRequest> mediaStreams;

    /**
     * The Amazon Resource Name (ARN) of the flow.
     * 
     * @param flowArn
     *        The Amazon Resource Name (ARN) of the flow.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the flow.
     * 
     * @return The Amazon Resource Name (ARN) of the flow.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the flow.
     * 
     * @param flowArn
     *        The Amazon Resource Name (ARN) of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddFlowMediaStreamsRequest withFlowArn(String flowArn) {
        setFlowArn(flowArn);
        return this;
    }

    /**
     * The media streams that you want to add to the flow.
     * 
     * @return The media streams that you want to add to the flow.
     */

    public java.util.List<AddMediaStreamRequest> getMediaStreams() {
        return mediaStreams;
    }

    /**
     * The media streams that you want to add to the flow.
     * 
     * @param mediaStreams
     *        The media streams that you want to add to the flow.
     */

    public void setMediaStreams(java.util.Collection<AddMediaStreamRequest> mediaStreams) {
        if (mediaStreams == null) {
            this.mediaStreams = null;
            return;
        }

        this.mediaStreams = new java.util.ArrayList<AddMediaStreamRequest>(mediaStreams);
    }

    /**
     * The media streams that you want to add to the flow.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMediaStreams(java.util.Collection)} or {@link #withMediaStreams(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mediaStreams
     *        The media streams that you want to add to the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddFlowMediaStreamsRequest withMediaStreams(AddMediaStreamRequest... mediaStreams) {
        if (this.mediaStreams == null) {
            setMediaStreams(new java.util.ArrayList<AddMediaStreamRequest>(mediaStreams.length));
        }
        for (AddMediaStreamRequest ele : mediaStreams) {
            this.mediaStreams.add(ele);
        }
        return this;
    }

    /**
     * The media streams that you want to add to the flow.
     * 
     * @param mediaStreams
     *        The media streams that you want to add to the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddFlowMediaStreamsRequest withMediaStreams(java.util.Collection<AddMediaStreamRequest> mediaStreams) {
        setMediaStreams(mediaStreams);
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
        if (getFlowArn() != null)
            sb.append("FlowArn: ").append(getFlowArn()).append(",");
        if (getMediaStreams() != null)
            sb.append("MediaStreams: ").append(getMediaStreams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddFlowMediaStreamsRequest == false)
            return false;
        AddFlowMediaStreamsRequest other = (AddFlowMediaStreamsRequest) obj;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        if (other.getMediaStreams() == null ^ this.getMediaStreams() == null)
            return false;
        if (other.getMediaStreams() != null && other.getMediaStreams().equals(this.getMediaStreams()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getMediaStreams() == null) ? 0 : getMediaStreams().hashCode());
        return hashCode;
    }

    @Override
    public AddFlowMediaStreamsRequest clone() {
        return (AddFlowMediaStreamsRequest) super.clone();
    }

}
