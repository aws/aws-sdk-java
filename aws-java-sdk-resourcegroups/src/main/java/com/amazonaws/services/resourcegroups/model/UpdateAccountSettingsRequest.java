/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/UpdateAccountSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccountSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether you want to turn <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/monitor-groups.html">group lifecycle events</a> on or off.
     * </p>
     */
    private String groupLifecycleEventsDesiredStatus;

    /**
     * <p>
     * Specifies whether you want to turn <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/monitor-groups.html">group lifecycle events</a> on or off.
     * </p>
     * 
     * @param groupLifecycleEventsDesiredStatus
     *        Specifies whether you want to turn <a
     *        href="https://docs.aws.amazon.com/ARG/latest/userguide/monitor-groups.html">group lifecycle events</a> on
     *        or off.
     * @see GroupLifecycleEventsDesiredStatus
     */

    public void setGroupLifecycleEventsDesiredStatus(String groupLifecycleEventsDesiredStatus) {
        this.groupLifecycleEventsDesiredStatus = groupLifecycleEventsDesiredStatus;
    }

    /**
     * <p>
     * Specifies whether you want to turn <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/monitor-groups.html">group lifecycle events</a> on or off.
     * </p>
     * 
     * @return Specifies whether you want to turn <a
     *         href="https://docs.aws.amazon.com/ARG/latest/userguide/monitor-groups.html">group lifecycle events</a> on
     *         or off.
     * @see GroupLifecycleEventsDesiredStatus
     */

    public String getGroupLifecycleEventsDesiredStatus() {
        return this.groupLifecycleEventsDesiredStatus;
    }

    /**
     * <p>
     * Specifies whether you want to turn <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/monitor-groups.html">group lifecycle events</a> on or off.
     * </p>
     * 
     * @param groupLifecycleEventsDesiredStatus
     *        Specifies whether you want to turn <a
     *        href="https://docs.aws.amazon.com/ARG/latest/userguide/monitor-groups.html">group lifecycle events</a> on
     *        or off.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupLifecycleEventsDesiredStatus
     */

    public UpdateAccountSettingsRequest withGroupLifecycleEventsDesiredStatus(String groupLifecycleEventsDesiredStatus) {
        setGroupLifecycleEventsDesiredStatus(groupLifecycleEventsDesiredStatus);
        return this;
    }

    /**
     * <p>
     * Specifies whether you want to turn <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/monitor-groups.html">group lifecycle events</a> on or off.
     * </p>
     * 
     * @param groupLifecycleEventsDesiredStatus
     *        Specifies whether you want to turn <a
     *        href="https://docs.aws.amazon.com/ARG/latest/userguide/monitor-groups.html">group lifecycle events</a> on
     *        or off.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupLifecycleEventsDesiredStatus
     */

    public UpdateAccountSettingsRequest withGroupLifecycleEventsDesiredStatus(GroupLifecycleEventsDesiredStatus groupLifecycleEventsDesiredStatus) {
        this.groupLifecycleEventsDesiredStatus = groupLifecycleEventsDesiredStatus.toString();
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
        if (getGroupLifecycleEventsDesiredStatus() != null)
            sb.append("GroupLifecycleEventsDesiredStatus: ").append(getGroupLifecycleEventsDesiredStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccountSettingsRequest == false)
            return false;
        UpdateAccountSettingsRequest other = (UpdateAccountSettingsRequest) obj;
        if (other.getGroupLifecycleEventsDesiredStatus() == null ^ this.getGroupLifecycleEventsDesiredStatus() == null)
            return false;
        if (other.getGroupLifecycleEventsDesiredStatus() != null
                && other.getGroupLifecycleEventsDesiredStatus().equals(this.getGroupLifecycleEventsDesiredStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupLifecycleEventsDesiredStatus() == null) ? 0 : getGroupLifecycleEventsDesiredStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccountSettingsRequest clone() {
        return (UpdateAccountSettingsRequest) super.clone();
    }

}
