/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DeleteContactChannel" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteContactChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact channel.
     * </p>
     */
    private String contactChannelId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact channel.
     * </p>
     * 
     * @param contactChannelId
     *        The Amazon Resource Name (ARN) of the contact channel.
     */

    public void setContactChannelId(String contactChannelId) {
        this.contactChannelId = contactChannelId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact channel.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the contact channel.
     */

    public String getContactChannelId() {
        return this.contactChannelId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact channel.
     * </p>
     * 
     * @param contactChannelId
     *        The Amazon Resource Name (ARN) of the contact channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteContactChannelRequest withContactChannelId(String contactChannelId) {
        setContactChannelId(contactChannelId);
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
        if (getContactChannelId() != null)
            sb.append("ContactChannelId: ").append(getContactChannelId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteContactChannelRequest == false)
            return false;
        DeleteContactChannelRequest other = (DeleteContactChannelRequest) obj;
        if (other.getContactChannelId() == null ^ this.getContactChannelId() == null)
            return false;
        if (other.getContactChannelId() != null && other.getContactChannelId().equals(this.getContactChannelId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactChannelId() == null) ? 0 : getContactChannelId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteContactChannelRequest clone() {
        return (DeleteContactChannelRequest) super.clone();
    }

}
