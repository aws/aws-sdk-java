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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetMeeting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMeetingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime SDK meeting information.
     * </p>
     */
    private Meeting meeting;

    /**
     * <p>
     * The Amazon Chime SDK meeting information.
     * </p>
     * 
     * @param meeting
     *        The Amazon Chime SDK meeting information.
     */

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting information.
     * </p>
     * 
     * @return The Amazon Chime SDK meeting information.
     */

    public Meeting getMeeting() {
        return this.meeting;
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting information.
     * </p>
     * 
     * @param meeting
     *        The Amazon Chime SDK meeting information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMeetingResult withMeeting(Meeting meeting) {
        setMeeting(meeting);
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
        if (getMeeting() != null)
            sb.append("Meeting: ").append(getMeeting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMeetingResult == false)
            return false;
        GetMeetingResult other = (GetMeetingResult) obj;
        if (other.getMeeting() == null ^ this.getMeeting() == null)
            return false;
        if (other.getMeeting() != null && other.getMeeting().equals(this.getMeeting()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeeting() == null) ? 0 : getMeeting().hashCode());
        return hashCode;
    }

    @Override
    public GetMeetingResult clone() {
        try {
            return (GetMeetingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
