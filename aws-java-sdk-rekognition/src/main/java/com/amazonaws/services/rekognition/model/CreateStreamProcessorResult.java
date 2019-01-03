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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStreamProcessorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * ARN for the newly create stream processor.
     * </p>
     */
    private String streamProcessorArn;

    /**
     * <p>
     * ARN for the newly create stream processor.
     * </p>
     * 
     * @param streamProcessorArn
     *        ARN for the newly create stream processor.
     */

    public void setStreamProcessorArn(String streamProcessorArn) {
        this.streamProcessorArn = streamProcessorArn;
    }

    /**
     * <p>
     * ARN for the newly create stream processor.
     * </p>
     * 
     * @return ARN for the newly create stream processor.
     */

    public String getStreamProcessorArn() {
        return this.streamProcessorArn;
    }

    /**
     * <p>
     * ARN for the newly create stream processor.
     * </p>
     * 
     * @param streamProcessorArn
     *        ARN for the newly create stream processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamProcessorResult withStreamProcessorArn(String streamProcessorArn) {
        setStreamProcessorArn(streamProcessorArn);
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
        if (getStreamProcessorArn() != null)
            sb.append("StreamProcessorArn: ").append(getStreamProcessorArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStreamProcessorResult == false)
            return false;
        CreateStreamProcessorResult other = (CreateStreamProcessorResult) obj;
        if (other.getStreamProcessorArn() == null ^ this.getStreamProcessorArn() == null)
            return false;
        if (other.getStreamProcessorArn() != null && other.getStreamProcessorArn().equals(this.getStreamProcessorArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamProcessorArn() == null) ? 0 : getStreamProcessorArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateStreamProcessorResult clone() {
        try {
            return (CreateStreamProcessorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
