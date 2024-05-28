/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/PutAppInstanceUserExpirationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAppInstanceUserExpirationSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     */
    private String appInstanceUserArn;
    /**
     * <p>
     * Settings that control the interval after which an <code>AppInstanceUser</code> is automatically deleted.
     * </p>
     */
    private ExpirationSettings expirationSettings;

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param appInstanceUserArn
     *        The ARN of the <code>AppInstanceUser</code>.
     */

    public void setAppInstanceUserArn(String appInstanceUserArn) {
        this.appInstanceUserArn = appInstanceUserArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * 
     * @return The ARN of the <code>AppInstanceUser</code>.
     */

    public String getAppInstanceUserArn() {
        return this.appInstanceUserArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param appInstanceUserArn
     *        The ARN of the <code>AppInstanceUser</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAppInstanceUserExpirationSettingsResult withAppInstanceUserArn(String appInstanceUserArn) {
        setAppInstanceUserArn(appInstanceUserArn);
        return this;
    }

    /**
     * <p>
     * Settings that control the interval after which an <code>AppInstanceUser</code> is automatically deleted.
     * </p>
     * 
     * @param expirationSettings
     *        Settings that control the interval after which an <code>AppInstanceUser</code> is automatically deleted.
     */

    public void setExpirationSettings(ExpirationSettings expirationSettings) {
        this.expirationSettings = expirationSettings;
    }

    /**
     * <p>
     * Settings that control the interval after which an <code>AppInstanceUser</code> is automatically deleted.
     * </p>
     * 
     * @return Settings that control the interval after which an <code>AppInstanceUser</code> is automatically deleted.
     */

    public ExpirationSettings getExpirationSettings() {
        return this.expirationSettings;
    }

    /**
     * <p>
     * Settings that control the interval after which an <code>AppInstanceUser</code> is automatically deleted.
     * </p>
     * 
     * @param expirationSettings
     *        Settings that control the interval after which an <code>AppInstanceUser</code> is automatically deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAppInstanceUserExpirationSettingsResult withExpirationSettings(ExpirationSettings expirationSettings) {
        setExpirationSettings(expirationSettings);
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
        if (getAppInstanceUserArn() != null)
            sb.append("AppInstanceUserArn: ").append(getAppInstanceUserArn()).append(",");
        if (getExpirationSettings() != null)
            sb.append("ExpirationSettings: ").append(getExpirationSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAppInstanceUserExpirationSettingsResult == false)
            return false;
        PutAppInstanceUserExpirationSettingsResult other = (PutAppInstanceUserExpirationSettingsResult) obj;
        if (other.getAppInstanceUserArn() == null ^ this.getAppInstanceUserArn() == null)
            return false;
        if (other.getAppInstanceUserArn() != null && other.getAppInstanceUserArn().equals(this.getAppInstanceUserArn()) == false)
            return false;
        if (other.getExpirationSettings() == null ^ this.getExpirationSettings() == null)
            return false;
        if (other.getExpirationSettings() != null && other.getExpirationSettings().equals(this.getExpirationSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppInstanceUserArn() == null) ? 0 : getAppInstanceUserArn().hashCode());
        hashCode = prime * hashCode + ((getExpirationSettings() == null) ? 0 : getExpirationSettings().hashCode());
        return hashCode;
    }

    @Override
    public PutAppInstanceUserExpirationSettingsResult clone() {
        try {
            return (PutAppInstanceUserExpirationSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
