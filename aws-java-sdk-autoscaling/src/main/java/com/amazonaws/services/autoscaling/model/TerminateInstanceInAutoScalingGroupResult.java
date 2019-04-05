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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/TerminateInstanceInAutoScalingGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminateInstanceInAutoScalingGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A scaling activity.
     * </p>
     */
    private Activity activity;

    /**
     * <p>
     * A scaling activity.
     * </p>
     * 
     * @param activity
     *        A scaling activity.
     */

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    /**
     * <p>
     * A scaling activity.
     * </p>
     * 
     * @return A scaling activity.
     */

    public Activity getActivity() {
        return this.activity;
    }

    /**
     * <p>
     * A scaling activity.
     * </p>
     * 
     * @param activity
     *        A scaling activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateInstanceInAutoScalingGroupResult withActivity(Activity activity) {
        setActivity(activity);
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
        if (getActivity() != null)
            sb.append("Activity: ").append(getActivity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateInstanceInAutoScalingGroupResult == false)
            return false;
        TerminateInstanceInAutoScalingGroupResult other = (TerminateInstanceInAutoScalingGroupResult) obj;
        if (other.getActivity() == null ^ this.getActivity() == null)
            return false;
        if (other.getActivity() != null && other.getActivity().equals(this.getActivity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivity() == null) ? 0 : getActivity().hashCode());
        return hashCode;
    }

    @Override
    public TerminateInstanceInAutoScalingGroupResult clone() {
        try {
            return (TerminateInstanceInAutoScalingGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
