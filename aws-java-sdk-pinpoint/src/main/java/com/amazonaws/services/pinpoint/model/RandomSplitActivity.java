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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the settings for a random split activity in a journey. This type of activity randomly sends specified
 * percentages of participants down one of as many as five paths in a journey, based on conditions that you specify.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/RandomSplitActivity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RandomSplitActivity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The paths for the activity, including the percentage of participants to enter each path and the activity to
     * perform for each path.
     * </p>
     */
    private java.util.List<RandomSplitEntry> branches;

    /**
     * <p>
     * The paths for the activity, including the percentage of participants to enter each path and the activity to
     * perform for each path.
     * </p>
     * 
     * @return The paths for the activity, including the percentage of participants to enter each path and the activity
     *         to perform for each path.
     */

    public java.util.List<RandomSplitEntry> getBranches() {
        return branches;
    }

    /**
     * <p>
     * The paths for the activity, including the percentage of participants to enter each path and the activity to
     * perform for each path.
     * </p>
     * 
     * @param branches
     *        The paths for the activity, including the percentage of participants to enter each path and the activity
     *        to perform for each path.
     */

    public void setBranches(java.util.Collection<RandomSplitEntry> branches) {
        if (branches == null) {
            this.branches = null;
            return;
        }

        this.branches = new java.util.ArrayList<RandomSplitEntry>(branches);
    }

    /**
     * <p>
     * The paths for the activity, including the percentage of participants to enter each path and the activity to
     * perform for each path.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBranches(java.util.Collection)} or {@link #withBranches(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param branches
     *        The paths for the activity, including the percentage of participants to enter each path and the activity
     *        to perform for each path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RandomSplitActivity withBranches(RandomSplitEntry... branches) {
        if (this.branches == null) {
            setBranches(new java.util.ArrayList<RandomSplitEntry>(branches.length));
        }
        for (RandomSplitEntry ele : branches) {
            this.branches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The paths for the activity, including the percentage of participants to enter each path and the activity to
     * perform for each path.
     * </p>
     * 
     * @param branches
     *        The paths for the activity, including the percentage of participants to enter each path and the activity
     *        to perform for each path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RandomSplitActivity withBranches(java.util.Collection<RandomSplitEntry> branches) {
        setBranches(branches);
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
        if (getBranches() != null)
            sb.append("Branches: ").append(getBranches());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RandomSplitActivity == false)
            return false;
        RandomSplitActivity other = (RandomSplitActivity) obj;
        if (other.getBranches() == null ^ this.getBranches() == null)
            return false;
        if (other.getBranches() != null && other.getBranches().equals(this.getBranches()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranches() == null) ? 0 : getBranches().hashCode());
        return hashCode;
    }

    @Override
    public RandomSplitActivity clone() {
        try {
            return (RandomSplitActivity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.RandomSplitActivityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
