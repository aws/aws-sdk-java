/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ContactCenterActivity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactCenterActivity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the next activity to perform after the this activity.
     * </p>
     */
    private String nextActivity;

    /**
     * <p>
     * The unique identifier for the next activity to perform after the this activity.
     * </p>
     * 
     * @param nextActivity
     *        The unique identifier for the next activity to perform after the this activity.
     */

    public void setNextActivity(String nextActivity) {
        this.nextActivity = nextActivity;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform after the this activity.
     * </p>
     * 
     * @return The unique identifier for the next activity to perform after the this activity.
     */

    public String getNextActivity() {
        return this.nextActivity;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform after the this activity.
     * </p>
     * 
     * @param nextActivity
     *        The unique identifier for the next activity to perform after the this activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactCenterActivity withNextActivity(String nextActivity) {
        setNextActivity(nextActivity);
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
        if (getNextActivity() != null)
            sb.append("NextActivity: ").append(getNextActivity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactCenterActivity == false)
            return false;
        ContactCenterActivity other = (ContactCenterActivity) obj;
        if (other.getNextActivity() == null ^ this.getNextActivity() == null)
            return false;
        if (other.getNextActivity() != null && other.getNextActivity().equals(this.getNextActivity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextActivity() == null) ? 0 : getNextActivity().hashCode());
        return hashCode;
    }

    @Override
    public ContactCenterActivity clone() {
        try {
            return (ContactCenterActivity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ContactCenterActivityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
