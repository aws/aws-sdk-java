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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutLogEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutLogEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The next sequence token.
     * </p>
     */
    private String nextSequenceToken;
    /**
     * <p>
     * The rejected events.
     * </p>
     */
    private RejectedLogEventsInfo rejectedLogEventsInfo;

    /**
     * <p>
     * The next sequence token.
     * </p>
     * 
     * @param nextSequenceToken
     *        The next sequence token.
     */

    public void setNextSequenceToken(String nextSequenceToken) {
        this.nextSequenceToken = nextSequenceToken;
    }

    /**
     * <p>
     * The next sequence token.
     * </p>
     * 
     * @return The next sequence token.
     */

    public String getNextSequenceToken() {
        return this.nextSequenceToken;
    }

    /**
     * <p>
     * The next sequence token.
     * </p>
     * 
     * @param nextSequenceToken
     *        The next sequence token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLogEventsResult withNextSequenceToken(String nextSequenceToken) {
        setNextSequenceToken(nextSequenceToken);
        return this;
    }

    /**
     * <p>
     * The rejected events.
     * </p>
     * 
     * @param rejectedLogEventsInfo
     *        The rejected events.
     */

    public void setRejectedLogEventsInfo(RejectedLogEventsInfo rejectedLogEventsInfo) {
        this.rejectedLogEventsInfo = rejectedLogEventsInfo;
    }

    /**
     * <p>
     * The rejected events.
     * </p>
     * 
     * @return The rejected events.
     */

    public RejectedLogEventsInfo getRejectedLogEventsInfo() {
        return this.rejectedLogEventsInfo;
    }

    /**
     * <p>
     * The rejected events.
     * </p>
     * 
     * @param rejectedLogEventsInfo
     *        The rejected events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLogEventsResult withRejectedLogEventsInfo(RejectedLogEventsInfo rejectedLogEventsInfo) {
        setRejectedLogEventsInfo(rejectedLogEventsInfo);
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
        if (getNextSequenceToken() != null)
            sb.append("NextSequenceToken: ").append(getNextSequenceToken()).append(",");
        if (getRejectedLogEventsInfo() != null)
            sb.append("RejectedLogEventsInfo: ").append(getRejectedLogEventsInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLogEventsResult == false)
            return false;
        PutLogEventsResult other = (PutLogEventsResult) obj;
        if (other.getNextSequenceToken() == null ^ this.getNextSequenceToken() == null)
            return false;
        if (other.getNextSequenceToken() != null && other.getNextSequenceToken().equals(this.getNextSequenceToken()) == false)
            return false;
        if (other.getRejectedLogEventsInfo() == null ^ this.getRejectedLogEventsInfo() == null)
            return false;
        if (other.getRejectedLogEventsInfo() != null && other.getRejectedLogEventsInfo().equals(this.getRejectedLogEventsInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextSequenceToken() == null) ? 0 : getNextSequenceToken().hashCode());
        hashCode = prime * hashCode + ((getRejectedLogEventsInfo() == null) ? 0 : getRejectedLogEventsInfo().hashCode());
        return hashCode;
    }

    @Override
    public PutLogEventsResult clone() {
        try {
            return (PutLogEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
