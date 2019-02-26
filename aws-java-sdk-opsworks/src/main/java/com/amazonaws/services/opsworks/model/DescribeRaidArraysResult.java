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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a <code>DescribeRaidArrays</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeRaidArrays" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRaidArraysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>RaidArrays</code> object that describes the specified RAID arrays.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RaidArray> raidArrays;

    /**
     * <p>
     * A <code>RaidArrays</code> object that describes the specified RAID arrays.
     * </p>
     * 
     * @return A <code>RaidArrays</code> object that describes the specified RAID arrays.
     */

    public java.util.List<RaidArray> getRaidArrays() {
        if (raidArrays == null) {
            raidArrays = new com.amazonaws.internal.SdkInternalList<RaidArray>();
        }
        return raidArrays;
    }

    /**
     * <p>
     * A <code>RaidArrays</code> object that describes the specified RAID arrays.
     * </p>
     * 
     * @param raidArrays
     *        A <code>RaidArrays</code> object that describes the specified RAID arrays.
     */

    public void setRaidArrays(java.util.Collection<RaidArray> raidArrays) {
        if (raidArrays == null) {
            this.raidArrays = null;
            return;
        }

        this.raidArrays = new com.amazonaws.internal.SdkInternalList<RaidArray>(raidArrays);
    }

    /**
     * <p>
     * A <code>RaidArrays</code> object that describes the specified RAID arrays.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRaidArrays(java.util.Collection)} or {@link #withRaidArrays(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param raidArrays
     *        A <code>RaidArrays</code> object that describes the specified RAID arrays.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRaidArraysResult withRaidArrays(RaidArray... raidArrays) {
        if (this.raidArrays == null) {
            setRaidArrays(new com.amazonaws.internal.SdkInternalList<RaidArray>(raidArrays.length));
        }
        for (RaidArray ele : raidArrays) {
            this.raidArrays.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A <code>RaidArrays</code> object that describes the specified RAID arrays.
     * </p>
     * 
     * @param raidArrays
     *        A <code>RaidArrays</code> object that describes the specified RAID arrays.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRaidArraysResult withRaidArrays(java.util.Collection<RaidArray> raidArrays) {
        setRaidArrays(raidArrays);
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
        if (getRaidArrays() != null)
            sb.append("RaidArrays: ").append(getRaidArrays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRaidArraysResult == false)
            return false;
        DescribeRaidArraysResult other = (DescribeRaidArraysResult) obj;
        if (other.getRaidArrays() == null ^ this.getRaidArrays() == null)
            return false;
        if (other.getRaidArrays() != null && other.getRaidArrays().equals(this.getRaidArrays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRaidArrays() == null) ? 0 : getRaidArrays().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRaidArraysResult clone() {
        try {
            return (DescribeRaidArraysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
