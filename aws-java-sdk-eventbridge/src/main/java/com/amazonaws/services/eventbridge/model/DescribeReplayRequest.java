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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DescribeReplay" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplayRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the replay to retrieve.
     * </p>
     */
    private String replayName;

    /**
     * <p>
     * The name of the replay to retrieve.
     * </p>
     * 
     * @param replayName
     *        The name of the replay to retrieve.
     */

    public void setReplayName(String replayName) {
        this.replayName = replayName;
    }

    /**
     * <p>
     * The name of the replay to retrieve.
     * </p>
     * 
     * @return The name of the replay to retrieve.
     */

    public String getReplayName() {
        return this.replayName;
    }

    /**
     * <p>
     * The name of the replay to retrieve.
     * </p>
     * 
     * @param replayName
     *        The name of the replay to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplayRequest withReplayName(String replayName) {
        setReplayName(replayName);
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
        if (getReplayName() != null)
            sb.append("ReplayName: ").append(getReplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReplayRequest == false)
            return false;
        DescribeReplayRequest other = (DescribeReplayRequest) obj;
        if (other.getReplayName() == null ^ this.getReplayName() == null)
            return false;
        if (other.getReplayName() != null && other.getReplayName().equals(this.getReplayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplayName() == null) ? 0 : getReplayName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReplayRequest clone() {
        return (DescribeReplayRequest) super.clone();
    }

}
