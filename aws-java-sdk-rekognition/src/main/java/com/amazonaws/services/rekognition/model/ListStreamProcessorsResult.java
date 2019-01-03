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
public class ListStreamProcessorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of stream processors.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * List of stream processors that you have created.
     * </p>
     */
    private java.util.List<StreamProcessor> streamProcessors;

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of stream processors.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *        subsequent request to retrieve the next set of stream processors.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of stream processors.
     * </p>
     * 
     * @return If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *         subsequent request to retrieve the next set of stream processors.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent
     * request to retrieve the next set of stream processors.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Rekognition Video returns this token that you can use in the
     *        subsequent request to retrieve the next set of stream processors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamProcessorsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * List of stream processors that you have created.
     * </p>
     * 
     * @return List of stream processors that you have created.
     */

    public java.util.List<StreamProcessor> getStreamProcessors() {
        return streamProcessors;
    }

    /**
     * <p>
     * List of stream processors that you have created.
     * </p>
     * 
     * @param streamProcessors
     *        List of stream processors that you have created.
     */

    public void setStreamProcessors(java.util.Collection<StreamProcessor> streamProcessors) {
        if (streamProcessors == null) {
            this.streamProcessors = null;
            return;
        }

        this.streamProcessors = new java.util.ArrayList<StreamProcessor>(streamProcessors);
    }

    /**
     * <p>
     * List of stream processors that you have created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStreamProcessors(java.util.Collection)} or {@link #withStreamProcessors(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param streamProcessors
     *        List of stream processors that you have created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamProcessorsResult withStreamProcessors(StreamProcessor... streamProcessors) {
        if (this.streamProcessors == null) {
            setStreamProcessors(new java.util.ArrayList<StreamProcessor>(streamProcessors.length));
        }
        for (StreamProcessor ele : streamProcessors) {
            this.streamProcessors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of stream processors that you have created.
     * </p>
     * 
     * @param streamProcessors
     *        List of stream processors that you have created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamProcessorsResult withStreamProcessors(java.util.Collection<StreamProcessor> streamProcessors) {
        setStreamProcessors(streamProcessors);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStreamProcessors() != null)
            sb.append("StreamProcessors: ").append(getStreamProcessors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStreamProcessorsResult == false)
            return false;
        ListStreamProcessorsResult other = (ListStreamProcessorsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStreamProcessors() == null ^ this.getStreamProcessors() == null)
            return false;
        if (other.getStreamProcessors() != null && other.getStreamProcessors().equals(this.getStreamProcessors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStreamProcessors() == null) ? 0 : getStreamProcessors().hashCode());
        return hashCode;
    }

    @Override
    public ListStreamProcessorsResult clone() {
        try {
            return (ListStreamProcessorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
