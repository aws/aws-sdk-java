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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchCreateAttendee" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchCreateAttendeeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The attendee information, including attendees IDs and join tokens.
     * </p>
     */
    private java.util.List<Attendee> attendees;
    /**
     * <p>
     * If the action fails for one or more of the attendees in the request, a list of the attendees is returned, along
     * with error codes and error messages.
     * </p>
     */
    private java.util.List<CreateAttendeeError> errors;

    /**
     * <p>
     * The attendee information, including attendees IDs and join tokens.
     * </p>
     * 
     * @return The attendee information, including attendees IDs and join tokens.
     */

    public java.util.List<Attendee> getAttendees() {
        return attendees;
    }

    /**
     * <p>
     * The attendee information, including attendees IDs and join tokens.
     * </p>
     * 
     * @param attendees
     *        The attendee information, including attendees IDs and join tokens.
     */

    public void setAttendees(java.util.Collection<Attendee> attendees) {
        if (attendees == null) {
            this.attendees = null;
            return;
        }

        this.attendees = new java.util.ArrayList<Attendee>(attendees);
    }

    /**
     * <p>
     * The attendee information, including attendees IDs and join tokens.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttendees(java.util.Collection)} or {@link #withAttendees(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attendees
     *        The attendee information, including attendees IDs and join tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateAttendeeResult withAttendees(Attendee... attendees) {
        if (this.attendees == null) {
            setAttendees(new java.util.ArrayList<Attendee>(attendees.length));
        }
        for (Attendee ele : attendees) {
            this.attendees.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attendee information, including attendees IDs and join tokens.
     * </p>
     * 
     * @param attendees
     *        The attendee information, including attendees IDs and join tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateAttendeeResult withAttendees(java.util.Collection<Attendee> attendees) {
        setAttendees(attendees);
        return this;
    }

    /**
     * <p>
     * If the action fails for one or more of the attendees in the request, a list of the attendees is returned, along
     * with error codes and error messages.
     * </p>
     * 
     * @return If the action fails for one or more of the attendees in the request, a list of the attendees is returned,
     *         along with error codes and error messages.
     */

    public java.util.List<CreateAttendeeError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * If the action fails for one or more of the attendees in the request, a list of the attendees is returned, along
     * with error codes and error messages.
     * </p>
     * 
     * @param errors
     *        If the action fails for one or more of the attendees in the request, a list of the attendees is returned,
     *        along with error codes and error messages.
     */

    public void setErrors(java.util.Collection<CreateAttendeeError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<CreateAttendeeError>(errors);
    }

    /**
     * <p>
     * If the action fails for one or more of the attendees in the request, a list of the attendees is returned, along
     * with error codes and error messages.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        If the action fails for one or more of the attendees in the request, a list of the attendees is returned,
     *        along with error codes and error messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateAttendeeResult withErrors(CreateAttendeeError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<CreateAttendeeError>(errors.length));
        }
        for (CreateAttendeeError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the action fails for one or more of the attendees in the request, a list of the attendees is returned, along
     * with error codes and error messages.
     * </p>
     * 
     * @param errors
     *        If the action fails for one or more of the attendees in the request, a list of the attendees is returned,
     *        along with error codes and error messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateAttendeeResult withErrors(java.util.Collection<CreateAttendeeError> errors) {
        setErrors(errors);
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
        if (getAttendees() != null)
            sb.append("Attendees: ").append(getAttendees()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCreateAttendeeResult == false)
            return false;
        BatchCreateAttendeeResult other = (BatchCreateAttendeeResult) obj;
        if (other.getAttendees() == null ^ this.getAttendees() == null)
            return false;
        if (other.getAttendees() != null && other.getAttendees().equals(this.getAttendees()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttendees() == null) ? 0 : getAttendees().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchCreateAttendeeResult clone() {
        try {
            return (BatchCreateAttendeeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
