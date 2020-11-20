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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeChannelModeratedByAppInstanceUser"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeChannelModeratedByAppInstanceUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the moderated channel.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The ARN of the app instance user in the moderated channel.
     * </p>
     */
    private String appInstanceUserArn;

    /**
     * <p>
     * The ARN of the moderated channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the moderated channel.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the moderated channel.
     * </p>
     * 
     * @return The ARN of the moderated channel.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The ARN of the moderated channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the moderated channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChannelModeratedByAppInstanceUserRequest withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the app instance user in the moderated channel.
     * </p>
     * 
     * @param appInstanceUserArn
     *        The ARN of the app instance user in the moderated channel.
     */

    public void setAppInstanceUserArn(String appInstanceUserArn) {
        this.appInstanceUserArn = appInstanceUserArn;
    }

    /**
     * <p>
     * The ARN of the app instance user in the moderated channel.
     * </p>
     * 
     * @return The ARN of the app instance user in the moderated channel.
     */

    public String getAppInstanceUserArn() {
        return this.appInstanceUserArn;
    }

    /**
     * <p>
     * The ARN of the app instance user in the moderated channel.
     * </p>
     * 
     * @param appInstanceUserArn
     *        The ARN of the app instance user in the moderated channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChannelModeratedByAppInstanceUserRequest withAppInstanceUserArn(String appInstanceUserArn) {
        setAppInstanceUserArn(appInstanceUserArn);
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getAppInstanceUserArn() != null)
            sb.append("AppInstanceUserArn: ").append(getAppInstanceUserArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeChannelModeratedByAppInstanceUserRequest == false)
            return false;
        DescribeChannelModeratedByAppInstanceUserRequest other = (DescribeChannelModeratedByAppInstanceUserRequest) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getAppInstanceUserArn() == null ^ this.getAppInstanceUserArn() == null)
            return false;
        if (other.getAppInstanceUserArn() != null && other.getAppInstanceUserArn().equals(this.getAppInstanceUserArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getAppInstanceUserArn() == null) ? 0 : getAppInstanceUserArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeChannelModeratedByAppInstanceUserRequest clone() {
        return (DescribeChannelModeratedByAppInstanceUserRequest) super.clone();
    }

}
