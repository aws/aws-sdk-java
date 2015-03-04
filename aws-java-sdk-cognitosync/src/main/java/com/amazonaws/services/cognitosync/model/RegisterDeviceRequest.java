/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cognitosync.AmazonCognitoSync#registerDevice(RegisterDeviceRequest) RegisterDevice operation}.
 * <p>
 * Registers a device to receive push sync notifications.
 * </p>
 *
 * @see com.amazonaws.services.cognitosync.AmazonCognitoSync#registerDevice(RegisterDeviceRequest)
 */
public class RegisterDeviceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. Here, the ID of the pool that the identity belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityPoolId;

    /**
     * The unique ID for this identity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityId;

    /**
     * The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APNS, APNS_SANDBOX, GCM, ADM
     */
    private String platform;

    /**
     * The push token.
     */
    private String token;

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. Here, the ID of the pool that the identity belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. Here, the ID of the pool that the identity belongs to.
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }
    
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. Here, the ID of the pool that the identity belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. Here, the ID of the pool that the identity belongs to.
     */
    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }
    
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. Here, the ID of the pool that the identity belongs to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. Here, the ID of the pool that the identity belongs to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterDeviceRequest withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * The unique ID for this identity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return The unique ID for this identity.
     */
    public String getIdentityId() {
        return identityId;
    }
    
    /**
     * The unique ID for this identity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId The unique ID for this identity.
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }
    
    /**
     * The unique ID for this identity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId The unique ID for this identity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterDeviceRequest withIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    /**
     * The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APNS, APNS_SANDBOX, GCM, ADM
     *
     * @return The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     *
     * @see Platform
     */
    public String getPlatform() {
        return platform;
    }
    
    /**
     * The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APNS, APNS_SANDBOX, GCM, ADM
     *
     * @param platform The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     *
     * @see Platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    /**
     * The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APNS, APNS_SANDBOX, GCM, ADM
     *
     * @param platform The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Platform
     */
    public RegisterDeviceRequest withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APNS, APNS_SANDBOX, GCM, ADM
     *
     * @param platform The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     *
     * @see Platform
     */
    public void setPlatform(Platform platform) {
        this.platform = platform.toString();
    }
    
    /**
     * The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APNS, APNS_SANDBOX, GCM, ADM
     *
     * @param platform The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Platform
     */
    public RegisterDeviceRequest withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * The push token.
     *
     * @return The push token.
     */
    public String getToken() {
        return token;
    }
    
    /**
     * The push token.
     *
     * @param token The push token.
     */
    public void setToken(String token) {
        this.token = token;
    }
    
    /**
     * The push token.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param token The push token.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterDeviceRequest withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityPoolId() != null) sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getIdentityId() != null) sb.append("IdentityId: " + getIdentityId() + ",");
        if (getPlatform() != null) sb.append("Platform: " + getPlatform() + ",");
        if (getToken() != null) sb.append("Token: " + getToken() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RegisterDeviceRequest == false) return false;
        RegisterDeviceRequest other = (RegisterDeviceRequest)obj;
        
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getIdentityId() == null ^ this.getIdentityId() == null) return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false) return false; 
        if (other.getPlatform() == null ^ this.getPlatform() == null) return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false) return false; 
        if (other.getToken() == null ^ this.getToken() == null) return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false) return false; 
        return true;
    }
    
    @Override
    public RegisterDeviceRequest clone() {
        
            return (RegisterDeviceRequest) super.clone();
    }

}
    