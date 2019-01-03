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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about a blacklisting event that impacts one of the dedicated IP addresses that is
 * associated with your account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/BlacklistEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlacklistEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the blacklist that the IP address appears on.
     * </p>
     */
    private String rblName;
    /**
     * <p>
     * The time when the blacklisting event occurred, shown in Unix time format.
     * </p>
     */
    private java.util.Date listingTime;
    /**
     * <p>
     * Additional information about the blacklisting event, as provided by the blacklist maintainer.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the blacklist that the IP address appears on.
     * </p>
     * 
     * @param rblName
     *        The name of the blacklist that the IP address appears on.
     */

    public void setRblName(String rblName) {
        this.rblName = rblName;
    }

    /**
     * <p>
     * The name of the blacklist that the IP address appears on.
     * </p>
     * 
     * @return The name of the blacklist that the IP address appears on.
     */

    public String getRblName() {
        return this.rblName;
    }

    /**
     * <p>
     * The name of the blacklist that the IP address appears on.
     * </p>
     * 
     * @param rblName
     *        The name of the blacklist that the IP address appears on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlacklistEntry withRblName(String rblName) {
        setRblName(rblName);
        return this;
    }

    /**
     * <p>
     * The time when the blacklisting event occurred, shown in Unix time format.
     * </p>
     * 
     * @param listingTime
     *        The time when the blacklisting event occurred, shown in Unix time format.
     */

    public void setListingTime(java.util.Date listingTime) {
        this.listingTime = listingTime;
    }

    /**
     * <p>
     * The time when the blacklisting event occurred, shown in Unix time format.
     * </p>
     * 
     * @return The time when the blacklisting event occurred, shown in Unix time format.
     */

    public java.util.Date getListingTime() {
        return this.listingTime;
    }

    /**
     * <p>
     * The time when the blacklisting event occurred, shown in Unix time format.
     * </p>
     * 
     * @param listingTime
     *        The time when the blacklisting event occurred, shown in Unix time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlacklistEntry withListingTime(java.util.Date listingTime) {
        setListingTime(listingTime);
        return this;
    }

    /**
     * <p>
     * Additional information about the blacklisting event, as provided by the blacklist maintainer.
     * </p>
     * 
     * @param description
     *        Additional information about the blacklisting event, as provided by the blacklist maintainer.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Additional information about the blacklisting event, as provided by the blacklist maintainer.
     * </p>
     * 
     * @return Additional information about the blacklisting event, as provided by the blacklist maintainer.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Additional information about the blacklisting event, as provided by the blacklist maintainer.
     * </p>
     * 
     * @param description
     *        Additional information about the blacklisting event, as provided by the blacklist maintainer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlacklistEntry withDescription(String description) {
        setDescription(description);
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
        if (getRblName() != null)
            sb.append("RblName: ").append(getRblName()).append(",");
        if (getListingTime() != null)
            sb.append("ListingTime: ").append(getListingTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlacklistEntry == false)
            return false;
        BlacklistEntry other = (BlacklistEntry) obj;
        if (other.getRblName() == null ^ this.getRblName() == null)
            return false;
        if (other.getRblName() != null && other.getRblName().equals(this.getRblName()) == false)
            return false;
        if (other.getListingTime() == null ^ this.getListingTime() == null)
            return false;
        if (other.getListingTime() != null && other.getListingTime().equals(this.getListingTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRblName() == null) ? 0 : getRblName().hashCode());
        hashCode = prime * hashCode + ((getListingTime() == null) ? 0 : getListingTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public BlacklistEntry clone() {
        try {
            return (BlacklistEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.BlacklistEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
