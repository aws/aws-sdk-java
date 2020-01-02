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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetAttendee" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAttendeeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime SDK attendee information.
     * </p>
     */
    private Attendee attendee;

    /**
     * <p>
     * The Amazon Chime SDK attendee information.
     * </p>
     * 
     * @param attendee
     *        The Amazon Chime SDK attendee information.
     */

    public void setAttendee(Attendee attendee) {
        this.attendee = attendee;
    }

    /**
     * <p>
     * The Amazon Chime SDK attendee information.
     * </p>
     * 
     * @return The Amazon Chime SDK attendee information.
     */

    public Attendee getAttendee() {
        return this.attendee;
    }

    /**
     * <p>
     * The Amazon Chime SDK attendee information.
     * </p>
     * 
     * @param attendee
     *        The Amazon Chime SDK attendee information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttendeeResult withAttendee(Attendee attendee) {
        setAttendee(attendee);
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
        if (getAttendee() != null)
            sb.append("Attendee: ").append(getAttendee());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAttendeeResult == false)
            return false;
        GetAttendeeResult other = (GetAttendeeResult) obj;
        if (other.getAttendee() == null ^ this.getAttendee() == null)
            return false;
        if (other.getAttendee() != null && other.getAttendee().equals(this.getAttendee()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttendee() == null) ? 0 : getAttendee().hashCode());
        return hashCode;
    }

    @Override
    public GetAttendeeResult clone() {
        try {
            return (GetAttendeeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
