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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeSubscribedWorkteam"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSubscribedWorkteamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>Workteam</code> instance that contains information about the work team.
     * </p>
     */
    private SubscribedWorkteam subscribedWorkteam;

    /**
     * <p>
     * A <code>Workteam</code> instance that contains information about the work team.
     * </p>
     * 
     * @param subscribedWorkteam
     *        A <code>Workteam</code> instance that contains information about the work team.
     */

    public void setSubscribedWorkteam(SubscribedWorkteam subscribedWorkteam) {
        this.subscribedWorkteam = subscribedWorkteam;
    }

    /**
     * <p>
     * A <code>Workteam</code> instance that contains information about the work team.
     * </p>
     * 
     * @return A <code>Workteam</code> instance that contains information about the work team.
     */

    public SubscribedWorkteam getSubscribedWorkteam() {
        return this.subscribedWorkteam;
    }

    /**
     * <p>
     * A <code>Workteam</code> instance that contains information about the work team.
     * </p>
     * 
     * @param subscribedWorkteam
     *        A <code>Workteam</code> instance that contains information about the work team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubscribedWorkteamResult withSubscribedWorkteam(SubscribedWorkteam subscribedWorkteam) {
        setSubscribedWorkteam(subscribedWorkteam);
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
        if (getSubscribedWorkteam() != null)
            sb.append("SubscribedWorkteam: ").append(getSubscribedWorkteam());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSubscribedWorkteamResult == false)
            return false;
        DescribeSubscribedWorkteamResult other = (DescribeSubscribedWorkteamResult) obj;
        if (other.getSubscribedWorkteam() == null ^ this.getSubscribedWorkteam() == null)
            return false;
        if (other.getSubscribedWorkteam() != null && other.getSubscribedWorkteam().equals(this.getSubscribedWorkteam()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubscribedWorkteam() == null) ? 0 : getSubscribedWorkteam().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSubscribedWorkteamResult clone() {
        try {
            return (DescribeSubscribedWorkteamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
