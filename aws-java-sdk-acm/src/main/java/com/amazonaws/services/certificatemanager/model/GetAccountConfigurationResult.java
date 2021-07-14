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
package com.amazonaws.services.certificatemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/GetAccountConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccountConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Expiration events configuration options associated with the Amazon Web Services account.
     * </p>
     */
    private ExpiryEventsConfiguration expiryEvents;

    /**
     * <p>
     * Expiration events configuration options associated with the Amazon Web Services account.
     * </p>
     * 
     * @param expiryEvents
     *        Expiration events configuration options associated with the Amazon Web Services account.
     */

    public void setExpiryEvents(ExpiryEventsConfiguration expiryEvents) {
        this.expiryEvents = expiryEvents;
    }

    /**
     * <p>
     * Expiration events configuration options associated with the Amazon Web Services account.
     * </p>
     * 
     * @return Expiration events configuration options associated with the Amazon Web Services account.
     */

    public ExpiryEventsConfiguration getExpiryEvents() {
        return this.expiryEvents;
    }

    /**
     * <p>
     * Expiration events configuration options associated with the Amazon Web Services account.
     * </p>
     * 
     * @param expiryEvents
     *        Expiration events configuration options associated with the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountConfigurationResult withExpiryEvents(ExpiryEventsConfiguration expiryEvents) {
        setExpiryEvents(expiryEvents);
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
        if (getExpiryEvents() != null)
            sb.append("ExpiryEvents: ").append(getExpiryEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccountConfigurationResult == false)
            return false;
        GetAccountConfigurationResult other = (GetAccountConfigurationResult) obj;
        if (other.getExpiryEvents() == null ^ this.getExpiryEvents() == null)
            return false;
        if (other.getExpiryEvents() != null && other.getExpiryEvents().equals(this.getExpiryEvents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpiryEvents() == null) ? 0 : getExpiryEvents().hashCode());
        return hashCode;
    }

    @Override
    public GetAccountConfigurationResult clone() {
        try {
            return (GetAccountConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
