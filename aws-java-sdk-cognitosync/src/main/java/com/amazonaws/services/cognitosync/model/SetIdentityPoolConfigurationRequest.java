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
 * Container for the parameters to the {@link com.amazonaws.services.cognitosync.AmazonCognitoSync#setIdentityPoolConfiguration(SetIdentityPoolConfigurationRequest) SetIdentityPoolConfiguration operation}.
 * <p>
 * Sets the necessary configuration for push sync.
 * </p>
 *
 * @see com.amazonaws.services.cognitosync.AmazonCognitoSync#setIdentityPoolConfiguration(SetIdentityPoolConfigurationRequest)
 */
public class SetIdentityPoolConfigurationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. This is the ID of the pool to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityPoolId;

    /**
     * Options to apply to this identity pool for push synchronization.
     */
    private PushSync pushSync;

    /**
     * Options to apply to this identity pool for Amazon Cognito streams.
     */
    private CognitoStreams cognitoStreams;

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. This is the ID of the pool to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. This is the ID of the pool to modify.
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }
    
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. This is the ID of the pool to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. This is the ID of the pool to modify.
     */
    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }
    
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. This is the ID of the pool to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. This is the ID of the pool to modify.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SetIdentityPoolConfigurationRequest withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * Options to apply to this identity pool for push synchronization.
     *
     * @return Options to apply to this identity pool for push synchronization.
     */
    public PushSync getPushSync() {
        return pushSync;
    }
    
    /**
     * Options to apply to this identity pool for push synchronization.
     *
     * @param pushSync Options to apply to this identity pool for push synchronization.
     */
    public void setPushSync(PushSync pushSync) {
        this.pushSync = pushSync;
    }
    
    /**
     * Options to apply to this identity pool for push synchronization.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pushSync Options to apply to this identity pool for push synchronization.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SetIdentityPoolConfigurationRequest withPushSync(PushSync pushSync) {
        this.pushSync = pushSync;
        return this;
    }

    /**
     * Options to apply to this identity pool for Amazon Cognito streams.
     *
     * @return Options to apply to this identity pool for Amazon Cognito streams.
     */
    public CognitoStreams getCognitoStreams() {
        return cognitoStreams;
    }
    
    /**
     * Options to apply to this identity pool for Amazon Cognito streams.
     *
     * @param cognitoStreams Options to apply to this identity pool for Amazon Cognito streams.
     */
    public void setCognitoStreams(CognitoStreams cognitoStreams) {
        this.cognitoStreams = cognitoStreams;
    }
    
    /**
     * Options to apply to this identity pool for Amazon Cognito streams.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cognitoStreams Options to apply to this identity pool for Amazon Cognito streams.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SetIdentityPoolConfigurationRequest withCognitoStreams(CognitoStreams cognitoStreams) {
        this.cognitoStreams = cognitoStreams;
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
        if (getPushSync() != null) sb.append("PushSync: " + getPushSync() + ",");
        if (getCognitoStreams() != null) sb.append("CognitoStreams: " + getCognitoStreams() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getPushSync() == null) ? 0 : getPushSync().hashCode()); 
        hashCode = prime * hashCode + ((getCognitoStreams() == null) ? 0 : getCognitoStreams().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetIdentityPoolConfigurationRequest == false) return false;
        SetIdentityPoolConfigurationRequest other = (SetIdentityPoolConfigurationRequest)obj;
        
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getPushSync() == null ^ this.getPushSync() == null) return false;
        if (other.getPushSync() != null && other.getPushSync().equals(this.getPushSync()) == false) return false; 
        if (other.getCognitoStreams() == null ^ this.getCognitoStreams() == null) return false;
        if (other.getCognitoStreams() != null && other.getCognitoStreams().equals(this.getCognitoStreams()) == false) return false; 
        return true;
    }
    
    @Override
    public SetIdentityPoolConfigurationRequest clone() {
        
            return (SetIdentityPoolConfigurationRequest) super.clone();
    }

}
    