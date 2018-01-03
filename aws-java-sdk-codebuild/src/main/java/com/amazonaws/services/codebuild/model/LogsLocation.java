/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about build logs in Amazon CloudWatch Logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/LogsLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogsLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs group for the build logs.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The name of the Amazon CloudWatch Logs stream for the build logs.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The URL to an individual build log in Amazon CloudWatch Logs.
     * </p>
     */
    private String deepLink;

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs group for the build logs.
     * </p>
     * 
     * @param groupName
     *        The name of the Amazon CloudWatch Logs group for the build logs.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs group for the build logs.
     * </p>
     * 
     * @return The name of the Amazon CloudWatch Logs group for the build logs.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs group for the build logs.
     * </p>
     * 
     * @param groupName
     *        The name of the Amazon CloudWatch Logs group for the build logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogsLocation withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs stream for the build logs.
     * </p>
     * 
     * @param streamName
     *        The name of the Amazon CloudWatch Logs stream for the build logs.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs stream for the build logs.
     * </p>
     * 
     * @return The name of the Amazon CloudWatch Logs stream for the build logs.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs stream for the build logs.
     * </p>
     * 
     * @param streamName
     *        The name of the Amazon CloudWatch Logs stream for the build logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogsLocation withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The URL to an individual build log in Amazon CloudWatch Logs.
     * </p>
     * 
     * @param deepLink
     *        The URL to an individual build log in Amazon CloudWatch Logs.
     */

    public void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }

    /**
     * <p>
     * The URL to an individual build log in Amazon CloudWatch Logs.
     * </p>
     * 
     * @return The URL to an individual build log in Amazon CloudWatch Logs.
     */

    public String getDeepLink() {
        return this.deepLink;
    }

    /**
     * <p>
     * The URL to an individual build log in Amazon CloudWatch Logs.
     * </p>
     * 
     * @param deepLink
     *        The URL to an individual build log in Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogsLocation withDeepLink(String deepLink) {
        setDeepLink(deepLink);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getDeepLink() != null)
            sb.append("DeepLink: ").append(getDeepLink());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogsLocation == false)
            return false;
        LogsLocation other = (LogsLocation) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getDeepLink() == null ^ this.getDeepLink() == null)
            return false;
        if (other.getDeepLink() != null && other.getDeepLink().equals(this.getDeepLink()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getDeepLink() == null) ? 0 : getDeepLink().hashCode());
        return hashCode;
    }

    @Override
    public LogsLocation clone() {
        try {
            return (LogsLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.LogsLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
