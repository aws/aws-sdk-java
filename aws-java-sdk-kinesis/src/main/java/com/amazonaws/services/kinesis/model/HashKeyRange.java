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
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

/**
 * <p>
 * The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.
 * </p>
 */
public class HashKeyRange implements Serializable, Cloneable {

    /**
     * <p>
     * The starting hash key of the hash key range.
     * </p>
     */
    private String startingHashKey;
    /**
     * <p>
     * The ending hash key of the hash key range.
     * </p>
     */
    private String endingHashKey;

    /**
     * <p>
     * The starting hash key of the hash key range.
     * </p>
     * 
     * @param startingHashKey
     *        The starting hash key of the hash key range.
     */

    public void setStartingHashKey(String startingHashKey) {
        this.startingHashKey = startingHashKey;
    }

    /**
     * <p>
     * The starting hash key of the hash key range.
     * </p>
     * 
     * @return The starting hash key of the hash key range.
     */

    public String getStartingHashKey() {
        return this.startingHashKey;
    }

    /**
     * <p>
     * The starting hash key of the hash key range.
     * </p>
     * 
     * @param startingHashKey
     *        The starting hash key of the hash key range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HashKeyRange withStartingHashKey(String startingHashKey) {
        setStartingHashKey(startingHashKey);
        return this;
    }

    /**
     * <p>
     * The ending hash key of the hash key range.
     * </p>
     * 
     * @param endingHashKey
     *        The ending hash key of the hash key range.
     */

    public void setEndingHashKey(String endingHashKey) {
        this.endingHashKey = endingHashKey;
    }

    /**
     * <p>
     * The ending hash key of the hash key range.
     * </p>
     * 
     * @return The ending hash key of the hash key range.
     */

    public String getEndingHashKey() {
        return this.endingHashKey;
    }

    /**
     * <p>
     * The ending hash key of the hash key range.
     * </p>
     * 
     * @param endingHashKey
     *        The ending hash key of the hash key range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HashKeyRange withEndingHashKey(String endingHashKey) {
        setEndingHashKey(endingHashKey);
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
        if (getStartingHashKey() != null)
            sb.append("StartingHashKey: " + getStartingHashKey() + ",");
        if (getEndingHashKey() != null)
            sb.append("EndingHashKey: " + getEndingHashKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HashKeyRange == false)
            return false;
        HashKeyRange other = (HashKeyRange) obj;
        if (other.getStartingHashKey() == null ^ this.getStartingHashKey() == null)
            return false;
        if (other.getStartingHashKey() != null && other.getStartingHashKey().equals(this.getStartingHashKey()) == false)
            return false;
        if (other.getEndingHashKey() == null ^ this.getEndingHashKey() == null)
            return false;
        if (other.getEndingHashKey() != null && other.getEndingHashKey().equals(this.getEndingHashKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartingHashKey() == null) ? 0 : getStartingHashKey().hashCode());
        hashCode = prime * hashCode + ((getEndingHashKey() == null) ? 0 : getEndingHashKey().hashCode());
        return hashCode;
    }

    @Override
    public HashKeyRange clone() {
        try {
            return (HashKeyRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
