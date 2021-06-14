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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies one or more sets of channel messages.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ChannelMessages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelMessages implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies one or more keys that identify the Amazon Simple Storage Service (Amazon S3) objects that save your
     * channel messages.
     * </p>
     * <p>
     * You must use the full path for the key.
     * </p>
     * <p>
     * Example path:
     * <code>channel/mychannel/__dt=2020-02-29 00:00:00/1582940490000_1582940520000_123456789012_mychannel_0_2118.0.json.gz</code>
     * </p>
     */
    private java.util.List<String> s3Paths;

    /**
     * <p>
     * Specifies one or more keys that identify the Amazon Simple Storage Service (Amazon S3) objects that save your
     * channel messages.
     * </p>
     * <p>
     * You must use the full path for the key.
     * </p>
     * <p>
     * Example path:
     * <code>channel/mychannel/__dt=2020-02-29 00:00:00/1582940490000_1582940520000_123456789012_mychannel_0_2118.0.json.gz</code>
     * </p>
     * 
     * @return Specifies one or more keys that identify the Amazon Simple Storage Service (Amazon S3) objects that save
     *         your channel messages.</p>
     *         <p>
     *         You must use the full path for the key.
     *         </p>
     *         <p>
     *         Example path:
     *         <code>channel/mychannel/__dt=2020-02-29 00:00:00/1582940490000_1582940520000_123456789012_mychannel_0_2118.0.json.gz</code>
     */

    public java.util.List<String> getS3Paths() {
        return s3Paths;
    }

    /**
     * <p>
     * Specifies one or more keys that identify the Amazon Simple Storage Service (Amazon S3) objects that save your
     * channel messages.
     * </p>
     * <p>
     * You must use the full path for the key.
     * </p>
     * <p>
     * Example path:
     * <code>channel/mychannel/__dt=2020-02-29 00:00:00/1582940490000_1582940520000_123456789012_mychannel_0_2118.0.json.gz</code>
     * </p>
     * 
     * @param s3Paths
     *        Specifies one or more keys that identify the Amazon Simple Storage Service (Amazon S3) objects that save
     *        your channel messages.</p>
     *        <p>
     *        You must use the full path for the key.
     *        </p>
     *        <p>
     *        Example path:
     *        <code>channel/mychannel/__dt=2020-02-29 00:00:00/1582940490000_1582940520000_123456789012_mychannel_0_2118.0.json.gz</code>
     */

    public void setS3Paths(java.util.Collection<String> s3Paths) {
        if (s3Paths == null) {
            this.s3Paths = null;
            return;
        }

        this.s3Paths = new java.util.ArrayList<String>(s3Paths);
    }

    /**
     * <p>
     * Specifies one or more keys that identify the Amazon Simple Storage Service (Amazon S3) objects that save your
     * channel messages.
     * </p>
     * <p>
     * You must use the full path for the key.
     * </p>
     * <p>
     * Example path:
     * <code>channel/mychannel/__dt=2020-02-29 00:00:00/1582940490000_1582940520000_123456789012_mychannel_0_2118.0.json.gz</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setS3Paths(java.util.Collection)} or {@link #withS3Paths(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param s3Paths
     *        Specifies one or more keys that identify the Amazon Simple Storage Service (Amazon S3) objects that save
     *        your channel messages.</p>
     *        <p>
     *        You must use the full path for the key.
     *        </p>
     *        <p>
     *        Example path:
     *        <code>channel/mychannel/__dt=2020-02-29 00:00:00/1582940490000_1582940520000_123456789012_mychannel_0_2118.0.json.gz</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMessages withS3Paths(String... s3Paths) {
        if (this.s3Paths == null) {
            setS3Paths(new java.util.ArrayList<String>(s3Paths.length));
        }
        for (String ele : s3Paths) {
            this.s3Paths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies one or more keys that identify the Amazon Simple Storage Service (Amazon S3) objects that save your
     * channel messages.
     * </p>
     * <p>
     * You must use the full path for the key.
     * </p>
     * <p>
     * Example path:
     * <code>channel/mychannel/__dt=2020-02-29 00:00:00/1582940490000_1582940520000_123456789012_mychannel_0_2118.0.json.gz</code>
     * </p>
     * 
     * @param s3Paths
     *        Specifies one or more keys that identify the Amazon Simple Storage Service (Amazon S3) objects that save
     *        your channel messages.</p>
     *        <p>
     *        You must use the full path for the key.
     *        </p>
     *        <p>
     *        Example path:
     *        <code>channel/mychannel/__dt=2020-02-29 00:00:00/1582940490000_1582940520000_123456789012_mychannel_0_2118.0.json.gz</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMessages withS3Paths(java.util.Collection<String> s3Paths) {
        setS3Paths(s3Paths);
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
        if (getS3Paths() != null)
            sb.append("S3Paths: ").append(getS3Paths());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelMessages == false)
            return false;
        ChannelMessages other = (ChannelMessages) obj;
        if (other.getS3Paths() == null ^ this.getS3Paths() == null)
            return false;
        if (other.getS3Paths() != null && other.getS3Paths().equals(this.getS3Paths()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Paths() == null) ? 0 : getS3Paths().hashCode());
        return hashCode;
    }

    @Override
    public ChannelMessages clone() {
        try {
            return (ChannelMessages) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.ChannelMessagesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
