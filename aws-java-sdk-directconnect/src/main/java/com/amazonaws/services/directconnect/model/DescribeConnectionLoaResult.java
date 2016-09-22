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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

/**
 * <p>
 * The response received when DescribeConnectionLoa is called.
 * </p>
 */
public class DescribeConnectionLoaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private Loa loa;

    /**
     * @param loa
     */

    public void setLoa(Loa loa) {
        this.loa = loa;
    }

    /**
     * @return
     */

    public Loa getLoa() {
        return this.loa;
    }

    /**
     * @param loa
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectionLoaResult withLoa(Loa loa) {
        setLoa(loa);
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
        if (getLoa() != null)
            sb.append("Loa: " + getLoa());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConnectionLoaResult == false)
            return false;
        DescribeConnectionLoaResult other = (DescribeConnectionLoaResult) obj;
        if (other.getLoa() == null ^ this.getLoa() == null)
            return false;
        if (other.getLoa() != null && other.getLoa().equals(this.getLoa()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoa() == null) ? 0 : getLoa().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConnectionLoaResult clone() {
        try {
            return (DescribeConnectionLoaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
