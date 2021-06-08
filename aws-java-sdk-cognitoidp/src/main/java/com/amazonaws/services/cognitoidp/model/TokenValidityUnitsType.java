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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The data type for TokenValidityUnits that specifics the time measurements for token validity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/TokenValidityUnitsType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TokenValidityUnitsType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours” or “days” for the value in AccessTokenValidity, defaults to hours.
     * </p>
     */
    private String accessToken;
    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours” or “days” for the value in IdTokenValidity, defaults to hours.
     * </p>
     */
    private String idToken;
    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours” or “days” for the value in RefreshTokenValidity, defaults to days.
     * </p>
     */
    private String refreshToken;

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours” or “days” for the value in AccessTokenValidity, defaults to hours.
     * </p>
     * 
     * @param accessToken
     *        A time unit in “seconds”, “minutes”, “hours” or “days” for the value in AccessTokenValidity, defaults to
     *        hours.
     * @see TimeUnitsType
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours” or “days” for the value in AccessTokenValidity, defaults to hours.
     * </p>
     * 
     * @return A time unit in “seconds”, “minutes”, “hours” or “days” for the value in AccessTokenValidity, defaults to
     *         hours.
     * @see TimeUnitsType
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours” or “days” for the value in AccessTokenValidity, defaults to hours.
     * </p>
     * 
     * @param accessToken
     *        A time unit in “seconds”, “minutes”, “hours” or “days” for the value in AccessTokenValidity, defaults to
     *        hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnitsType
     */

    public TokenValidityUnitsType withAccessToken(String accessToken) {
        setAccessToken(accessToken);
        return this;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours” or “days” for the value in AccessTokenValidity, defaults to hours.
     * </p>
     * 
     * @param accessToken
     *        A time unit in “seconds”, “minutes”, “hours” or “days” for the value in AccessTokenValidity, defaults to
     *        hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnitsType
     */

    public TokenValidityUnitsType withAccessToken(TimeUnitsType accessToken) {
        this.accessToken = accessToken.toString();
        return this;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours” or “days” for the value in IdTokenValidity, defaults to hours.
     * </p>
     * 
     * @param idToken
     *        A time unit in “seconds”, “minutes”, “hours” or “days” for the value in IdTokenValidity, defaults to
     *        hours.
     * @see TimeUnitsType
     */

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours” or “days” for the value in IdTokenValidity, defaults to hours.
     * </p>
     * 
     * @return A time unit in “seconds”, “minutes”, “hours” or “days” for the value in IdTokenValidity, defaults to
     *         hours.
     * @see TimeUnitsType
     */

    public String getIdToken() {
        return this.idToken;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours” or “days” for the value in IdTokenValidity, defaults to hours.
     * </p>
     * 
     * @param idToken
     *        A time unit in “seconds”, “minutes”, “hours” or “days” for the value in IdTokenValidity, defaults to
     *        hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnitsType
     */

    public TokenValidityUnitsType withIdToken(String idToken) {
        setIdToken(idToken);
        return this;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours” or “days” for the value in IdTokenValidity, defaults to hours.
     * </p>
     * 
     * @param idToken
     *        A time unit in “seconds”, “minutes”, “hours” or “days” for the value in IdTokenValidity, defaults to
     *        hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnitsType
     */

    public TokenValidityUnitsType withIdToken(TimeUnitsType idToken) {
        this.idToken = idToken.toString();
        return this;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours” or “days” for the value in RefreshTokenValidity, defaults to days.
     * </p>
     * 
     * @param refreshToken
     *        A time unit in “seconds”, “minutes”, “hours” or “days” for the value in RefreshTokenValidity, defaults to
     *        days.
     * @see TimeUnitsType
     */

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours” or “days” for the value in RefreshTokenValidity, defaults to days.
     * </p>
     * 
     * @return A time unit in “seconds”, “minutes”, “hours” or “days” for the value in RefreshTokenValidity, defaults to
     *         days.
     * @see TimeUnitsType
     */

    public String getRefreshToken() {
        return this.refreshToken;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours” or “days” for the value in RefreshTokenValidity, defaults to days.
     * </p>
     * 
     * @param refreshToken
     *        A time unit in “seconds”, “minutes”, “hours” or “days” for the value in RefreshTokenValidity, defaults to
     *        days.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnitsType
     */

    public TokenValidityUnitsType withRefreshToken(String refreshToken) {
        setRefreshToken(refreshToken);
        return this;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours” or “days” for the value in RefreshTokenValidity, defaults to days.
     * </p>
     * 
     * @param refreshToken
     *        A time unit in “seconds”, “minutes”, “hours” or “days” for the value in RefreshTokenValidity, defaults to
     *        days.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnitsType
     */

    public TokenValidityUnitsType withRefreshToken(TimeUnitsType refreshToken) {
        this.refreshToken = refreshToken.toString();
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
        if (getAccessToken() != null)
            sb.append("AccessToken: ").append(getAccessToken()).append(",");
        if (getIdToken() != null)
            sb.append("IdToken: ").append(getIdToken()).append(",");
        if (getRefreshToken() != null)
            sb.append("RefreshToken: ").append(getRefreshToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TokenValidityUnitsType == false)
            return false;
        TokenValidityUnitsType other = (TokenValidityUnitsType) obj;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getIdToken() == null ^ this.getIdToken() == null)
            return false;
        if (other.getIdToken() != null && other.getIdToken().equals(this.getIdToken()) == false)
            return false;
        if (other.getRefreshToken() == null ^ this.getRefreshToken() == null)
            return false;
        if (other.getRefreshToken() != null && other.getRefreshToken().equals(this.getRefreshToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getIdToken() == null) ? 0 : getIdToken().hashCode());
        hashCode = prime * hashCode + ((getRefreshToken() == null) ? 0 : getRefreshToken().hashCode());
        return hashCode;
    }

    @Override
    public TokenValidityUnitsType clone() {
        try {
            return (TokenValidityUnitsType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.TokenValidityUnitsTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
