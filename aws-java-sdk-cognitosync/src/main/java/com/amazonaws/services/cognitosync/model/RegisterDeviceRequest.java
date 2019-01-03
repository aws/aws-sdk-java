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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to RegisterDevice.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/RegisterDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterDeviceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. Here,
     * the ID of the pool that the identity belongs to.
     * </p>
     */
    private String identityPoolId;
    /**
     * <p>
     * The unique ID for this identity.
     * </p>
     */
    private String identityId;
    /**
     * <p>
     * The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The push token.
     * </p>
     */
    private String token;

    /**
     * <p>
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. Here,
     * the ID of the pool that the identity belongs to.
     * </p>
     * 
     * @param identityPoolId
     *        A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *        Cognito. Here, the ID of the pool that the identity belongs to.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. Here,
     * the ID of the pool that the identity belongs to.
     * </p>
     * 
     * @return A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. Here, the ID of the pool that the identity belongs to.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * <p>
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. Here,
     * the ID of the pool that the identity belongs to.
     * </p>
     * 
     * @param identityPoolId
     *        A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *        Cognito. Here, the ID of the pool that the identity belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterDeviceRequest withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * <p>
     * The unique ID for this identity.
     * </p>
     * 
     * @param identityId
     *        The unique ID for this identity.
     */

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * <p>
     * The unique ID for this identity.
     * </p>
     * 
     * @return The unique ID for this identity.
     */

    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * <p>
     * The unique ID for this identity.
     * </p>
     * 
     * @param identityId
     *        The unique ID for this identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterDeviceRequest withIdentityId(String identityId) {
        setIdentityId(identityId);
        return this;
    }

    /**
     * <p>
     * The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     * </p>
     * 
     * @param platform
     *        The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     * @see Platform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     * </p>
     * 
     * @return The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     * @see Platform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     * </p>
     * 
     * @param platform
     *        The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public RegisterDeviceRequest withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     * </p>
     * 
     * @param platform
     *        The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     * @see Platform
     */

    public void setPlatform(Platform platform) {
        withPlatform(platform);
    }

    /**
     * <p>
     * The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     * </p>
     * 
     * @param platform
     *        The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public RegisterDeviceRequest withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The push token.
     * </p>
     * 
     * @param token
     *        The push token.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * The push token.
     * </p>
     * 
     * @return The push token.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * <p>
     * The push token.
     * </p>
     * 
     * @param token
     *        The push token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterDeviceRequest withToken(String token) {
        setToken(token);
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
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: ").append(getIdentityPoolId()).append(",");
        if (getIdentityId() != null)
            sb.append("IdentityId: ").append(getIdentityId()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getToken() != null)
            sb.append("Token: ").append(getToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterDeviceRequest == false)
            return false;
        RegisterDeviceRequest other = (RegisterDeviceRequest) obj;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getIdentityId() == null ^ this.getIdentityId() == null)
            return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        return hashCode;
    }

    @Override
    public RegisterDeviceRequest clone() {
        return (RegisterDeviceRequest) super.clone();
    }

}
