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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetPhoneNumberSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPhoneNumberSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The default outbound calling name for the account.
     * </p>
     */
    private String callingName;
    /**
     * <p>
     * The updated outbound calling name timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date callingNameUpdatedTimestamp;

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

    public GetPhoneNumberSettingsResult withCallingName(String callingName) {
        setCallingName(callingName);
        return this;
    }

    /**
     * <p>
     * The updated outbound calling name timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param callingNameUpdatedTimestamp
     *        The updated outbound calling name timestamp, in ISO 8601 format.
     */

    public void setCallingNameUpdatedTimestamp(java.util.Date callingNameUpdatedTimestamp) {
        this.callingNameUpdatedTimestamp = callingNameUpdatedTimestamp;
    }

    /**
     * <p>
     * The updated outbound calling name timestamp, in ISO 8601 format.
     * </p>
     * 
     * @return The updated outbound calling name timestamp, in ISO 8601 format.
     */

    public java.util.Date getCallingNameUpdatedTimestamp() {
        return this.callingNameUpdatedTimestamp;
    }

    /**
     * <p>
     * The updated outbound calling name timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param callingNameUpdatedTimestamp
     *        The updated outbound calling name timestamp, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPhoneNumberSettingsResult withCallingNameUpdatedTimestamp(java.util.Date callingNameUpdatedTimestamp) {
        setCallingNameUpdatedTimestamp(callingNameUpdatedTimestamp);
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
            sb.append("CallingName: ").append("***Sensitive Data Redacted***").append(",");
        if (getCallingNameUpdatedTimestamp() != null)
            sb.append("CallingNameUpdatedTimestamp: ").append(getCallingNameUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPhoneNumberSettingsResult == false)
            return false;
        GetPhoneNumberSettingsResult other = (GetPhoneNumberSettingsResult) obj;
        if (other.getCallingName() == null ^ this.getCallingName() == null)
            return false;
        if (other.getCallingName() != null && other.getCallingName().equals(this.getCallingName()) == false)
            return false;
        if (other.getCallingNameUpdatedTimestamp() == null ^ this.getCallingNameUpdatedTimestamp() == null)
            return false;
        if (other.getCallingNameUpdatedTimestamp() != null && other.getCallingNameUpdatedTimestamp().equals(this.getCallingNameUpdatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCallingName() == null) ? 0 : getCallingName().hashCode());
        hashCode = prime * hashCode + ((getCallingNameUpdatedTimestamp() == null) ? 0 : getCallingNameUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public GetPhoneNumberSettingsResult clone() {
        try {
            return (GetPhoneNumberSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
