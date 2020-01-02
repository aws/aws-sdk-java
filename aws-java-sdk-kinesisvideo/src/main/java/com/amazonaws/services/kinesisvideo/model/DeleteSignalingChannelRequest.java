/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DeleteSignalingChannel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSignalingChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the signaling channel that you want to delete.
     * </p>
     */
    private String channelARN;
    /**
     * <p>
     * The current version of the signaling channel that you want to delete. You can obtain the current version by
     * invoking the <code>DescribeSignalingChannel</code> or <code>ListSignalingChannels</code> APIs.
     * </p>
     */
    private String currentVersion;

    /**
     * <p>
     * The ARN of the signaling channel that you want to delete.
     * </p>
     * 
     * @param channelARN
     *        The ARN of the signaling channel that you want to delete.
     */

    public void setChannelARN(String channelARN) {
        this.channelARN = channelARN;
    }

    /**
     * <p>
     * The ARN of the signaling channel that you want to delete.
     * </p>
     * 
     * @return The ARN of the signaling channel that you want to delete.
     */

    public String getChannelARN() {
        return this.channelARN;
    }

    /**
     * <p>
     * The ARN of the signaling channel that you want to delete.
     * </p>
     * 
     * @param channelARN
     *        The ARN of the signaling channel that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSignalingChannelRequest withChannelARN(String channelARN) {
        setChannelARN(channelARN);
        return this;
    }

    /**
     * <p>
     * The current version of the signaling channel that you want to delete. You can obtain the current version by
     * invoking the <code>DescribeSignalingChannel</code> or <code>ListSignalingChannels</code> APIs.
     * </p>
     * 
     * @param currentVersion
     *        The current version of the signaling channel that you want to delete. You can obtain the current version
     *        by invoking the <code>DescribeSignalingChannel</code> or <code>ListSignalingChannels</code> APIs.
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The current version of the signaling channel that you want to delete. You can obtain the current version by
     * invoking the <code>DescribeSignalingChannel</code> or <code>ListSignalingChannels</code> APIs.
     * </p>
     * 
     * @return The current version of the signaling channel that you want to delete. You can obtain the current version
     *         by invoking the <code>DescribeSignalingChannel</code> or <code>ListSignalingChannels</code> APIs.
     */

    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The current version of the signaling channel that you want to delete. You can obtain the current version by
     * invoking the <code>DescribeSignalingChannel</code> or <code>ListSignalingChannels</code> APIs.
     * </p>
     * 
     * @param currentVersion
     *        The current version of the signaling channel that you want to delete. You can obtain the current version
     *        by invoking the <code>DescribeSignalingChannel</code> or <code>ListSignalingChannels</code> APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSignalingChannelRequest withCurrentVersion(String currentVersion) {
        setCurrentVersion(currentVersion);
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
        if (getChannelARN() != null)
            sb.append("ChannelARN: ").append(getChannelARN()).append(",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSignalingChannelRequest == false)
            return false;
        DeleteSignalingChannelRequest other = (DeleteSignalingChannelRequest) obj;
        if (other.getChannelARN() == null ^ this.getChannelARN() == null)
            return false;
        if (other.getChannelARN() != null && other.getChannelARN().equals(this.getChannelARN()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelARN() == null) ? 0 : getChannelARN().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSignalingChannelRequest clone() {
        return (DeleteSignalingChannelRequest) super.clone();
    }

}
