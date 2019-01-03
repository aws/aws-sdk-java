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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutConferencePreference"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutConferencePreferenceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The conference preference of a specific conference provider.
     * </p>
     */
    private ConferencePreference conferencePreference;

    /**
     * <p>
     * The conference preference of a specific conference provider.
     * </p>
     * 
     * @param conferencePreference
     *        The conference preference of a specific conference provider.
     */

    public void setConferencePreference(ConferencePreference conferencePreference) {
        this.conferencePreference = conferencePreference;
    }

    /**
     * <p>
     * The conference preference of a specific conference provider.
     * </p>
     * 
     * @return The conference preference of a specific conference provider.
     */

    public ConferencePreference getConferencePreference() {
        return this.conferencePreference;
    }

    /**
     * <p>
     * The conference preference of a specific conference provider.
     * </p>
     * 
     * @param conferencePreference
     *        The conference preference of a specific conference provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConferencePreferenceRequest withConferencePreference(ConferencePreference conferencePreference) {
        setConferencePreference(conferencePreference);
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
        if (getConferencePreference() != null)
            sb.append("ConferencePreference: ").append(getConferencePreference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutConferencePreferenceRequest == false)
            return false;
        PutConferencePreferenceRequest other = (PutConferencePreferenceRequest) obj;
        if (other.getConferencePreference() == null ^ this.getConferencePreference() == null)
            return false;
        if (other.getConferencePreference() != null && other.getConferencePreference().equals(this.getConferencePreference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConferencePreference() == null) ? 0 : getConferencePreference().hashCode());
        return hashCode;
    }

    @Override
    public PutConferencePreferenceRequest clone() {
        return (PutConferencePreferenceRequest) super.clone();
    }

}
