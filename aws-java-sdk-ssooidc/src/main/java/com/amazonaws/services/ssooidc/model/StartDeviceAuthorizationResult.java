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
package com.amazonaws.services.ssooidc.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-oidc-2019-06-10/StartDeviceAuthorization" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDeviceAuthorizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The short-lived code that is used by the device when polling for a session token.
     * </p>
     */
    private String deviceCode;
    /**
     * <p>
     * A one-time user verification code. This is needed to authorize an in-use device.
     * </p>
     */
    private String userCode;
    /**
     * <p>
     * The URI of the verification page that takes the <code>userCode</code> to authorize the device.
     * </p>
     */
    private String verificationUri;
    /**
     * <p>
     * An alternate URL that the client can use to automatically launch a browser. This process skips the manual step in
     * which the user visits the verification page and enters their code.
     * </p>
     */
    private String verificationUriComplete;
    /**
     * <p>
     * Indicates the number of seconds in which the verification code will become invalid.
     * </p>
     */
    private Integer expiresIn;
    /**
     * <p>
     * Indicates the number of seconds the client must wait between attempts when polling for a session.
     * </p>
     */
    private Integer interval;

    /**
     * <p>
     * The short-lived code that is used by the device when polling for a session token.
     * </p>
     * 
     * @param deviceCode
     *        The short-lived code that is used by the device when polling for a session token.
     */

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    /**
     * <p>
     * The short-lived code that is used by the device when polling for a session token.
     * </p>
     * 
     * @return The short-lived code that is used by the device when polling for a session token.
     */

    public String getDeviceCode() {
        return this.deviceCode;
    }

    /**
     * <p>
     * The short-lived code that is used by the device when polling for a session token.
     * </p>
     * 
     * @param deviceCode
     *        The short-lived code that is used by the device when polling for a session token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeviceAuthorizationResult withDeviceCode(String deviceCode) {
        setDeviceCode(deviceCode);
        return this;
    }

    /**
     * <p>
     * A one-time user verification code. This is needed to authorize an in-use device.
     * </p>
     * 
     * @param userCode
     *        A one-time user verification code. This is needed to authorize an in-use device.
     */

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * <p>
     * A one-time user verification code. This is needed to authorize an in-use device.
     * </p>
     * 
     * @return A one-time user verification code. This is needed to authorize an in-use device.
     */

    public String getUserCode() {
        return this.userCode;
    }

    /**
     * <p>
     * A one-time user verification code. This is needed to authorize an in-use device.
     * </p>
     * 
     * @param userCode
     *        A one-time user verification code. This is needed to authorize an in-use device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeviceAuthorizationResult withUserCode(String userCode) {
        setUserCode(userCode);
        return this;
    }

    /**
     * <p>
     * The URI of the verification page that takes the <code>userCode</code> to authorize the device.
     * </p>
     * 
     * @param verificationUri
     *        The URI of the verification page that takes the <code>userCode</code> to authorize the device.
     */

    public void setVerificationUri(String verificationUri) {
        this.verificationUri = verificationUri;
    }

    /**
     * <p>
     * The URI of the verification page that takes the <code>userCode</code> to authorize the device.
     * </p>
     * 
     * @return The URI of the verification page that takes the <code>userCode</code> to authorize the device.
     */

    public String getVerificationUri() {
        return this.verificationUri;
    }

    /**
     * <p>
     * The URI of the verification page that takes the <code>userCode</code> to authorize the device.
     * </p>
     * 
     * @param verificationUri
     *        The URI of the verification page that takes the <code>userCode</code> to authorize the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeviceAuthorizationResult withVerificationUri(String verificationUri) {
        setVerificationUri(verificationUri);
        return this;
    }

    /**
     * <p>
     * An alternate URL that the client can use to automatically launch a browser. This process skips the manual step in
     * which the user visits the verification page and enters their code.
     * </p>
     * 
     * @param verificationUriComplete
     *        An alternate URL that the client can use to automatically launch a browser. This process skips the manual
     *        step in which the user visits the verification page and enters their code.
     */

    public void setVerificationUriComplete(String verificationUriComplete) {
        this.verificationUriComplete = verificationUriComplete;
    }

    /**
     * <p>
     * An alternate URL that the client can use to automatically launch a browser. This process skips the manual step in
     * which the user visits the verification page and enters their code.
     * </p>
     * 
     * @return An alternate URL that the client can use to automatically launch a browser. This process skips the manual
     *         step in which the user visits the verification page and enters their code.
     */

    public String getVerificationUriComplete() {
        return this.verificationUriComplete;
    }

    /**
     * <p>
     * An alternate URL that the client can use to automatically launch a browser. This process skips the manual step in
     * which the user visits the verification page and enters their code.
     * </p>
     * 
     * @param verificationUriComplete
     *        An alternate URL that the client can use to automatically launch a browser. This process skips the manual
     *        step in which the user visits the verification page and enters their code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeviceAuthorizationResult withVerificationUriComplete(String verificationUriComplete) {
        setVerificationUriComplete(verificationUriComplete);
        return this;
    }

    /**
     * <p>
     * Indicates the number of seconds in which the verification code will become invalid.
     * </p>
     * 
     * @param expiresIn
     *        Indicates the number of seconds in which the verification code will become invalid.
     */

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * <p>
     * Indicates the number of seconds in which the verification code will become invalid.
     * </p>
     * 
     * @return Indicates the number of seconds in which the verification code will become invalid.
     */

    public Integer getExpiresIn() {
        return this.expiresIn;
    }

    /**
     * <p>
     * Indicates the number of seconds in which the verification code will become invalid.
     * </p>
     * 
     * @param expiresIn
     *        Indicates the number of seconds in which the verification code will become invalid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeviceAuthorizationResult withExpiresIn(Integer expiresIn) {
        setExpiresIn(expiresIn);
        return this;
    }

    /**
     * <p>
     * Indicates the number of seconds the client must wait between attempts when polling for a session.
     * </p>
     * 
     * @param interval
     *        Indicates the number of seconds the client must wait between attempts when polling for a session.
     */

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * Indicates the number of seconds the client must wait between attempts when polling for a session.
     * </p>
     * 
     * @return Indicates the number of seconds the client must wait between attempts when polling for a session.
     */

    public Integer getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * Indicates the number of seconds the client must wait between attempts when polling for a session.
     * </p>
     * 
     * @param interval
     *        Indicates the number of seconds the client must wait between attempts when polling for a session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeviceAuthorizationResult withInterval(Integer interval) {
        setInterval(interval);
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
        if (getDeviceCode() != null)
            sb.append("DeviceCode: ").append(getDeviceCode()).append(",");
        if (getUserCode() != null)
            sb.append("UserCode: ").append(getUserCode()).append(",");
        if (getVerificationUri() != null)
            sb.append("VerificationUri: ").append(getVerificationUri()).append(",");
        if (getVerificationUriComplete() != null)
            sb.append("VerificationUriComplete: ").append(getVerificationUriComplete()).append(",");
        if (getExpiresIn() != null)
            sb.append("ExpiresIn: ").append(getExpiresIn()).append(",");
        if (getInterval() != null)
            sb.append("Interval: ").append(getInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDeviceAuthorizationResult == false)
            return false;
        StartDeviceAuthorizationResult other = (StartDeviceAuthorizationResult) obj;
        if (other.getDeviceCode() == null ^ this.getDeviceCode() == null)
            return false;
        if (other.getDeviceCode() != null && other.getDeviceCode().equals(this.getDeviceCode()) == false)
            return false;
        if (other.getUserCode() == null ^ this.getUserCode() == null)
            return false;
        if (other.getUserCode() != null && other.getUserCode().equals(this.getUserCode()) == false)
            return false;
        if (other.getVerificationUri() == null ^ this.getVerificationUri() == null)
            return false;
        if (other.getVerificationUri() != null && other.getVerificationUri().equals(this.getVerificationUri()) == false)
            return false;
        if (other.getVerificationUriComplete() == null ^ this.getVerificationUriComplete() == null)
            return false;
        if (other.getVerificationUriComplete() != null && other.getVerificationUriComplete().equals(this.getVerificationUriComplete()) == false)
            return false;
        if (other.getExpiresIn() == null ^ this.getExpiresIn() == null)
            return false;
        if (other.getExpiresIn() != null && other.getExpiresIn().equals(this.getExpiresIn()) == false)
            return false;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceCode() == null) ? 0 : getDeviceCode().hashCode());
        hashCode = prime * hashCode + ((getUserCode() == null) ? 0 : getUserCode().hashCode());
        hashCode = prime * hashCode + ((getVerificationUri() == null) ? 0 : getVerificationUri().hashCode());
        hashCode = prime * hashCode + ((getVerificationUriComplete() == null) ? 0 : getVerificationUriComplete().hashCode());
        hashCode = prime * hashCode + ((getExpiresIn() == null) ? 0 : getExpiresIn().hashCode());
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        return hashCode;
    }

    @Override
    public StartDeviceAuthorizationResult clone() {
        try {
            return (StartDeviceAuthorizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
