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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UntagStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UntagStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to remove tags from.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * The name of the stream that you want to remove tags from.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * A list of the keys of the tags that you want to remove.
     * </p>
     */
    private java.util.List<String> tagKeyList;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to remove tags from.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream that you want to remove tags from.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to remove tags from.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the stream that you want to remove tags from.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to remove tags from.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream that you want to remove tags from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagStreamRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * The name of the stream that you want to remove tags from.
     * </p>
     * 
     * @param streamName
     *        The name of the stream that you want to remove tags from.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream that you want to remove tags from.
     * </p>
     * 
     * @return The name of the stream that you want to remove tags from.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream that you want to remove tags from.
     * </p>
     * 
     * @param streamName
     *        The name of the stream that you want to remove tags from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagStreamRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * A list of the keys of the tags that you want to remove.
     * </p>
     * 
     * @return A list of the keys of the tags that you want to remove.
     */

    public java.util.List<String> getTagKeyList() {
        return tagKeyList;
    }

    /**
     * <p>
     * A list of the keys of the tags that you want to remove.
     * </p>
     * 
     * @param tagKeyList
     *        A list of the keys of the tags that you want to remove.
     */

    public void setTagKeyList(java.util.Collection<String> tagKeyList) {
        if (tagKeyList == null) {
            this.tagKeyList = null;
            return;
        }

        this.tagKeyList = new java.util.ArrayList<String>(tagKeyList);
    }

    /**
     * <p>
     * A list of the keys of the tags that you want to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeyList(java.util.Collection)} or {@link #withTagKeyList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagKeyList
     *        A list of the keys of the tags that you want to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagStreamRequest withTagKeyList(String... tagKeyList) {
        if (this.tagKeyList == null) {
            setTagKeyList(new java.util.ArrayList<String>(tagKeyList.length));
        }
        for (String ele : tagKeyList) {
            this.tagKeyList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the keys of the tags that you want to remove.
     * </p>
     * 
     * @param tagKeyList
     *        A list of the keys of the tags that you want to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagStreamRequest withTagKeyList(java.util.Collection<String> tagKeyList) {
        setTagKeyList(tagKeyList);
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
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN()).append(",");
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getTagKeyList() != null)
            sb.append("TagKeyList: ").append(getTagKeyList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagStreamRequest == false)
            return false;
        UntagStreamRequest other = (UntagStreamRequest) obj;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getTagKeyList() == null ^ this.getTagKeyList() == null)
            return false;
        if (other.getTagKeyList() != null && other.getTagKeyList().equals(this.getTagKeyList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getTagKeyList() == null) ? 0 : getTagKeyList().hashCode());
        return hashCode;
    }

    @Override
    public UntagStreamRequest clone() {
        return (UntagStreamRequest) super.clone();
    }

}
