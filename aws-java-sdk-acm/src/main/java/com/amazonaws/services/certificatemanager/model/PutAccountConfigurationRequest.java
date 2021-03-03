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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/PutAccountConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAccountConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies expiration events associated with an account.
     * </p>
     */
    private ExpiryEventsConfiguration expiryEvents;
    /**
     * <p>
     * Customer-chosen string used to distinguish between calls to <code>PutAccountConfiguration</code>. Idempotency
     * tokens time out after one hour. If you call <code>PutAccountConfiguration</code> multiple times with the same
     * unexpired idempotency token, ACM treats it as the same request and returns the original result. If you change the
     * idempotency token for each call, ACM treats each call as a new request.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * Specifies expiration events associated with an account.
     * </p>
     * 
     * @param expiryEvents
     *        Specifies expiration events associated with an account.
     */

    public void setExpiryEvents(ExpiryEventsConfiguration expiryEvents) {
        this.expiryEvents = expiryEvents;
    }

    /**
     * <p>
     * Specifies expiration events associated with an account.
     * </p>
     * 
     * @return Specifies expiration events associated with an account.
     */

    public ExpiryEventsConfiguration getExpiryEvents() {
        return this.expiryEvents;
    }

    /**
     * <p>
     * Specifies expiration events associated with an account.
     * </p>
     * 
     * @param expiryEvents
     *        Specifies expiration events associated with an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAccountConfigurationRequest withExpiryEvents(ExpiryEventsConfiguration expiryEvents) {
        setExpiryEvents(expiryEvents);
        return this;
    }

    /**
     * <p>
     * Customer-chosen string used to distinguish between calls to <code>PutAccountConfiguration</code>. Idempotency
     * tokens time out after one hour. If you call <code>PutAccountConfiguration</code> multiple times with the same
     * unexpired idempotency token, ACM treats it as the same request and returns the original result. If you change the
     * idempotency token for each call, ACM treats each call as a new request.
     * </p>
     * 
     * @param idempotencyToken
     *        Customer-chosen string used to distinguish between calls to <code>PutAccountConfiguration</code>.
     *        Idempotency tokens time out after one hour. If you call <code>PutAccountConfiguration</code> multiple
     *        times with the same unexpired idempotency token, ACM treats it as the same request and returns the
     *        original result. If you change the idempotency token for each call, ACM treats each call as a new request.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * Customer-chosen string used to distinguish between calls to <code>PutAccountConfiguration</code>. Idempotency
     * tokens time out after one hour. If you call <code>PutAccountConfiguration</code> multiple times with the same
     * unexpired idempotency token, ACM treats it as the same request and returns the original result. If you change the
     * idempotency token for each call, ACM treats each call as a new request.
     * </p>
     * 
     * @return Customer-chosen string used to distinguish between calls to <code>PutAccountConfiguration</code>.
     *         Idempotency tokens time out after one hour. If you call <code>PutAccountConfiguration</code> multiple
     *         times with the same unexpired idempotency token, ACM treats it as the same request and returns the
     *         original result. If you change the idempotency token for each call, ACM treats each call as a new
     *         request.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * Customer-chosen string used to distinguish between calls to <code>PutAccountConfiguration</code>. Idempotency
     * tokens time out after one hour. If you call <code>PutAccountConfiguration</code> multiple times with the same
     * unexpired idempotency token, ACM treats it as the same request and returns the original result. If you change the
     * idempotency token for each call, ACM treats each call as a new request.
     * </p>
     * 
     * @param idempotencyToken
     *        Customer-chosen string used to distinguish between calls to <code>PutAccountConfiguration</code>.
     *        Idempotency tokens time out after one hour. If you call <code>PutAccountConfiguration</code> multiple
     *        times with the same unexpired idempotency token, ACM treats it as the same request and returns the
     *        original result. If you change the idempotency token for each call, ACM treats each call as a new request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAccountConfigurationRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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
            sb.append("ExpiryEvents: ").append(getExpiryEvents()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAccountConfigurationRequest == false)
            return false;
        PutAccountConfigurationRequest other = (PutAccountConfigurationRequest) obj;
        if (other.getExpiryEvents() == null ^ this.getExpiryEvents() == null)
            return false;
        if (other.getExpiryEvents() != null && other.getExpiryEvents().equals(this.getExpiryEvents()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpiryEvents() == null) ? 0 : getExpiryEvents().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public PutAccountConfigurationRequest clone() {
        return (PutAccountConfigurationRequest) super.clone();
    }

}
