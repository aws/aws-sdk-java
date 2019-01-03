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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteConferenceProvider"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteConferenceProviderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the conference provider.
     * </p>
     */
    private String conferenceProviderArn;

    /**
     * <p>
     * The ARN of the conference provider.
     * </p>
     * 
     * @param conferenceProviderArn
     *        The ARN of the conference provider.
     */

    public void setConferenceProviderArn(String conferenceProviderArn) {
        this.conferenceProviderArn = conferenceProviderArn;
    }

    /**
     * <p>
     * The ARN of the conference provider.
     * </p>
     * 
     * @return The ARN of the conference provider.
     */

    public String getConferenceProviderArn() {
        return this.conferenceProviderArn;
    }

    /**
     * <p>
     * The ARN of the conference provider.
     * </p>
     * 
     * @param conferenceProviderArn
     *        The ARN of the conference provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConferenceProviderRequest withConferenceProviderArn(String conferenceProviderArn) {
        setConferenceProviderArn(conferenceProviderArn);
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
        if (getConferenceProviderArn() != null)
            sb.append("ConferenceProviderArn: ").append(getConferenceProviderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteConferenceProviderRequest == false)
            return false;
        DeleteConferenceProviderRequest other = (DeleteConferenceProviderRequest) obj;
        if (other.getConferenceProviderArn() == null ^ this.getConferenceProviderArn() == null)
            return false;
        if (other.getConferenceProviderArn() != null && other.getConferenceProviderArn().equals(this.getConferenceProviderArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConferenceProviderArn() == null) ? 0 : getConferenceProviderArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteConferenceProviderRequest clone() {
        return (DeleteConferenceProviderRequest) super.clone();
    }

}
