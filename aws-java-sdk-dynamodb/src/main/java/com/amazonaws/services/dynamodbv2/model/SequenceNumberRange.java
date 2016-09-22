/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The beginning and ending sequence numbers for the stream records contained within a shard.
 * </p>
 */
public class SequenceNumberRange implements Serializable, Cloneable {

    /**
     * <p>
     * The first sequence number.
     * </p>
     */
    private String startingSequenceNumber;
    /**
     * <p>
     * The last sequence number.
     * </p>
     */
    private String endingSequenceNumber;

    /**
     * <p>
     * The first sequence number.
     * </p>
     * 
     * @param startingSequenceNumber
     *        The first sequence number.
     */

    public void setStartingSequenceNumber(String startingSequenceNumber) {
        this.startingSequenceNumber = startingSequenceNumber;
    }

    /**
     * <p>
     * The first sequence number.
     * </p>
     * 
     * @return The first sequence number.
     */

    public String getStartingSequenceNumber() {
        return this.startingSequenceNumber;
    }

    /**
     * <p>
     * The first sequence number.
     * </p>
     * 
     * @param startingSequenceNumber
     *        The first sequence number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SequenceNumberRange withStartingSequenceNumber(String startingSequenceNumber) {
        setStartingSequenceNumber(startingSequenceNumber);
        return this;
    }

    /**
     * <p>
     * The last sequence number.
     * </p>
     * 
     * @param endingSequenceNumber
     *        The last sequence number.
     */

    public void setEndingSequenceNumber(String endingSequenceNumber) {
        this.endingSequenceNumber = endingSequenceNumber;
    }

    /**
     * <p>
     * The last sequence number.
     * </p>
     * 
     * @return The last sequence number.
     */

    public String getEndingSequenceNumber() {
        return this.endingSequenceNumber;
    }

    /**
     * <p>
     * The last sequence number.
     * </p>
     * 
     * @param endingSequenceNumber
     *        The last sequence number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SequenceNumberRange withEndingSequenceNumber(String endingSequenceNumber) {
        setEndingSequenceNumber(endingSequenceNumber);
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
        if (getStartingSequenceNumber() != null)
            sb.append("StartingSequenceNumber: " + getStartingSequenceNumber() + ",");
        if (getEndingSequenceNumber() != null)
            sb.append("EndingSequenceNumber: " + getEndingSequenceNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SequenceNumberRange == false)
            return false;
        SequenceNumberRange other = (SequenceNumberRange) obj;
        if (other.getStartingSequenceNumber() == null ^ this.getStartingSequenceNumber() == null)
            return false;
        if (other.getStartingSequenceNumber() != null && other.getStartingSequenceNumber().equals(this.getStartingSequenceNumber()) == false)
            return false;
        if (other.getEndingSequenceNumber() == null ^ this.getEndingSequenceNumber() == null)
            return false;
        if (other.getEndingSequenceNumber() != null && other.getEndingSequenceNumber().equals(this.getEndingSequenceNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartingSequenceNumber() == null) ? 0 : getStartingSequenceNumber().hashCode());
        hashCode = prime * hashCode + ((getEndingSequenceNumber() == null) ? 0 : getEndingSequenceNumber().hashCode());
        return hashCode;
    }

    @Override
    public SequenceNumberRange clone() {
        try {
            return (SequenceNumberRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
