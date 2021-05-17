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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveFlowMediaStream" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveFlowMediaStreamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The Amazon Resource Name (ARN) of the flow. */
    private String flowArn;
    /** The name of the media stream that was removed. */
    private String mediaStreamName;

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

    public RemoveFlowMediaStreamResult withFlowArn(String flowArn) {
        setFlowArn(flowArn);
        return this;
    }

    /**
     * The name of the media stream that was removed.
     * 
     * @param mediaStreamName
     *        The name of the media stream that was removed.
     */

    public void setMediaStreamName(String mediaStreamName) {
        this.mediaStreamName = mediaStreamName;
    }

    /**
     * The name of the media stream that was removed.
     * 
     * @return The name of the media stream that was removed.
     */

    public String getMediaStreamName() {
        return this.mediaStreamName;
    }

    /**
     * The name of the media stream that was removed.
     * 
     * @param mediaStreamName
     *        The name of the media stream that was removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveFlowMediaStreamResult withMediaStreamName(String mediaStreamName) {
        setMediaStreamName(mediaStreamName);
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
        if (getMediaStreamName() != null)
            sb.append("MediaStreamName: ").append(getMediaStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveFlowMediaStreamResult == false)
            return false;
        RemoveFlowMediaStreamResult other = (RemoveFlowMediaStreamResult) obj;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        if (other.getMediaStreamName() == null ^ this.getMediaStreamName() == null)
            return false;
        if (other.getMediaStreamName() != null && other.getMediaStreamName().equals(this.getMediaStreamName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getMediaStreamName() == null) ? 0 : getMediaStreamName().hashCode());
        return hashCode;
    }

    @Override
    public RemoveFlowMediaStreamResult clone() {
        try {
            return (RemoveFlowMediaStreamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
