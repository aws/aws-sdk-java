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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdatePhoneNumberSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePhoneNumberSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The default outbound calling name for the account.
     * </p>
     */
    private String callingName;

    /**
     * <p>
     * The default outbound calling name for the account.
     * </p>
     * 
     * @param callingName
     *        The default outbound calling name for the account.
     */

    public void setCallingName(String callingName) {
        this.callingName = callingName;
    }

    /**
     * <p>
     * The default outbound calling name for the account.
     * </p>
     * 
     * @return The default outbound calling name for the account.
     */

    public String getCallingName() {
        return this.callingName;
    }

    /**
     * <p>
     * The default outbound calling name for the account.
     * </p>
     * 
     * @param callingName
     *        The default outbound calling name for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePhoneNumberSettingsRequest withCallingName(String callingName) {
        setCallingName(callingName);
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
        if (getCallingName() != null)
            sb.append("CallingName: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePhoneNumberSettingsRequest == false)
            return false;
        UpdatePhoneNumberSettingsRequest other = (UpdatePhoneNumberSettingsRequest) obj;
        if (other.getCallingName() == null ^ this.getCallingName() == null)
            return false;
        if (other.getCallingName() != null && other.getCallingName().equals(this.getCallingName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCallingName() == null) ? 0 : getCallingName().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePhoneNumberSettingsRequest clone() {
        return (UpdatePhoneNumberSettingsRequest) super.clone();
    }

}
