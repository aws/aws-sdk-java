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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateTimeToLive" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTimeToLiveResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Represents the output of an <code>UpdateTimeToLive</code> operation.
     * </p>
     */
    private TimeToLiveSpecification timeToLiveSpecification;

    /**
     * <p>
     * Represents the output of an <code>UpdateTimeToLive</code> operation.
     * </p>
     * 
     * @param timeToLiveSpecification
     *        Represents the output of an <code>UpdateTimeToLive</code> operation.
     */

    public void setTimeToLiveSpecification(TimeToLiveSpecification timeToLiveSpecification) {
        this.timeToLiveSpecification = timeToLiveSpecification;
    }

    /**
     * <p>
     * Represents the output of an <code>UpdateTimeToLive</code> operation.
     * </p>
     * 
     * @return Represents the output of an <code>UpdateTimeToLive</code> operation.
     */

    public TimeToLiveSpecification getTimeToLiveSpecification() {
        return this.timeToLiveSpecification;
    }

    /**
     * <p>
     * Represents the output of an <code>UpdateTimeToLive</code> operation.
     * </p>
     * 
     * @param timeToLiveSpecification
     *        Represents the output of an <code>UpdateTimeToLive</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTimeToLiveResult withTimeToLiveSpecification(TimeToLiveSpecification timeToLiveSpecification) {
        setTimeToLiveSpecification(timeToLiveSpecification);
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
        if (getTimeToLiveSpecification() != null)
            sb.append("TimeToLiveSpecification: ").append(getTimeToLiveSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTimeToLiveResult == false)
            return false;
        UpdateTimeToLiveResult other = (UpdateTimeToLiveResult) obj;
        if (other.getTimeToLiveSpecification() == null ^ this.getTimeToLiveSpecification() == null)
            return false;
        if (other.getTimeToLiveSpecification() != null && other.getTimeToLiveSpecification().equals(this.getTimeToLiveSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeToLiveSpecification() == null) ? 0 : getTimeToLiveSpecification().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTimeToLiveResult clone() {
        try {
            return (UpdateTimeToLiveResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
