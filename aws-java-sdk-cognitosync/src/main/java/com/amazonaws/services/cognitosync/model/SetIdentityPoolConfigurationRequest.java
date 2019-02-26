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
 * The input for the SetIdentityPoolConfiguration operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/SetIdentityPoolConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetIdentityPoolConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. This
     * is the ID of the pool to modify.
     * </p>
     */
    private String identityPoolId;
    /**
     * <p>
     * Options to apply to this identity pool for push synchronization.
     * </p>
     */
    private PushSync pushSync;
    /** Options to apply to this identity pool for Amazon Cognito streams. */
    private CognitoStreams cognitoStreams;

    /**
     * <p>
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. This
     * is the ID of the pool to modify.
     * </p>
     * 
     * @param identityPoolId
     *        A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *        Cognito. This is the ID of the pool to modify.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. This
     * is the ID of the pool to modify.
     * </p>
     * 
     * @return A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. This is the ID of the pool to modify.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * <p>
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. This
     * is the ID of the pool to modify.
     * </p>
     * 
     * @param identityPoolId
     *        A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *        Cognito. This is the ID of the pool to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetIdentityPoolConfigurationRequest withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * <p>
     * Options to apply to this identity pool for push synchronization.
     * </p>
     * 
     * @param pushSync
     *        Options to apply to this identity pool for push synchronization.
     */

    public void setPushSync(PushSync pushSync) {
        this.pushSync = pushSync;
    }

    /**
     * <p>
     * Options to apply to this identity pool for push synchronization.
     * </p>
     * 
     * @return Options to apply to this identity pool for push synchronization.
     */

    public PushSync getPushSync() {
        return this.pushSync;
    }

    /**
     * <p>
     * Options to apply to this identity pool for push synchronization.
     * </p>
     * 
     * @param pushSync
     *        Options to apply to this identity pool for push synchronization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetIdentityPoolConfigurationRequest withPushSync(PushSync pushSync) {
        setPushSync(pushSync);
        return this;
    }

    /**
     * Options to apply to this identity pool for Amazon Cognito streams.
     * 
     * @param cognitoStreams
     *        Options to apply to this identity pool for Amazon Cognito streams.
     */

    public void setCognitoStreams(CognitoStreams cognitoStreams) {
        this.cognitoStreams = cognitoStreams;
    }

    /**
     * Options to apply to this identity pool for Amazon Cognito streams.
     * 
     * @return Options to apply to this identity pool for Amazon Cognito streams.
     */

    public CognitoStreams getCognitoStreams() {
        return this.cognitoStreams;
    }

    /**
     * Options to apply to this identity pool for Amazon Cognito streams.
     * 
     * @param cognitoStreams
     *        Options to apply to this identity pool for Amazon Cognito streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetIdentityPoolConfigurationRequest withCognitoStreams(CognitoStreams cognitoStreams) {
        setCognitoStreams(cognitoStreams);
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
        if (getPushSync() != null)
            sb.append("PushSync: ").append(getPushSync()).append(",");
        if (getCognitoStreams() != null)
            sb.append("CognitoStreams: ").append(getCognitoStreams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetIdentityPoolConfigurationRequest == false)
            return false;
        SetIdentityPoolConfigurationRequest other = (SetIdentityPoolConfigurationRequest) obj;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getPushSync() == null ^ this.getPushSync() == null)
            return false;
        if (other.getPushSync() != null && other.getPushSync().equals(this.getPushSync()) == false)
            return false;
        if (other.getCognitoStreams() == null ^ this.getCognitoStreams() == null)
            return false;
        if (other.getCognitoStreams() != null && other.getCognitoStreams().equals(this.getCognitoStreams()) == false)
            return false;
        return true;
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
    public SetIdentityPoolConfigurationRequest clone() {
        return (SetIdentityPoolConfigurationRequest) super.clone();
    }

}
