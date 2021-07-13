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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes whether to apply multi-factor authentication policies for your Amazon Cognito user pool configured as a
 * part of your Amplify project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackendAuthMFAConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBackendAuthMFAConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes whether MFA should be [ON, OFF, or OPTIONAL] for authentication in your Amplify project.
     * </p>
     */
    private String mFAMode;
    /**
     * <p>
     * Describes the configuration settings and methods for your Amplify app users to use MFA.
     * </p>
     */
    private Settings settings;

    /**
     * <p>
     * Describes whether MFA should be [ON, OFF, or OPTIONAL] for authentication in your Amplify project.
     * </p>
     * 
     * @param mFAMode
     *        Describes whether MFA should be [ON, OFF, or OPTIONAL] for authentication in your Amplify project.
     * @see MFAMode
     */

    public void setMFAMode(String mFAMode) {
        this.mFAMode = mFAMode;
    }

    /**
     * <p>
     * Describes whether MFA should be [ON, OFF, or OPTIONAL] for authentication in your Amplify project.
     * </p>
     * 
     * @return Describes whether MFA should be [ON, OFF, or OPTIONAL] for authentication in your Amplify project.
     * @see MFAMode
     */

    public String getMFAMode() {
        return this.mFAMode;
    }

    /**
     * <p>
     * Describes whether MFA should be [ON, OFF, or OPTIONAL] for authentication in your Amplify project.
     * </p>
     * 
     * @param mFAMode
     *        Describes whether MFA should be [ON, OFF, or OPTIONAL] for authentication in your Amplify project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MFAMode
     */

    public CreateBackendAuthMFAConfig withMFAMode(String mFAMode) {
        setMFAMode(mFAMode);
        return this;
    }

    /**
     * <p>
     * Describes whether MFA should be [ON, OFF, or OPTIONAL] for authentication in your Amplify project.
     * </p>
     * 
     * @param mFAMode
     *        Describes whether MFA should be [ON, OFF, or OPTIONAL] for authentication in your Amplify project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MFAMode
     */

    public CreateBackendAuthMFAConfig withMFAMode(MFAMode mFAMode) {
        this.mFAMode = mFAMode.toString();
        return this;
    }

    /**
     * <p>
     * Describes the configuration settings and methods for your Amplify app users to use MFA.
     * </p>
     * 
     * @param settings
     *        Describes the configuration settings and methods for your Amplify app users to use MFA.
     */

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Describes the configuration settings and methods for your Amplify app users to use MFA.
     * </p>
     * 
     * @return Describes the configuration settings and methods for your Amplify app users to use MFA.
     */

    public Settings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * Describes the configuration settings and methods for your Amplify app users to use MFA.
     * </p>
     * 
     * @param settings
     *        Describes the configuration settings and methods for your Amplify app users to use MFA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendAuthMFAConfig withSettings(Settings settings) {
        setSettings(settings);
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
        if (getMFAMode() != null)
            sb.append("MFAMode: ").append(getMFAMode()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBackendAuthMFAConfig == false)
            return false;
        CreateBackendAuthMFAConfig other = (CreateBackendAuthMFAConfig) obj;
        if (other.getMFAMode() == null ^ this.getMFAMode() == null)
            return false;
        if (other.getMFAMode() != null && other.getMFAMode().equals(this.getMFAMode()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMFAMode() == null) ? 0 : getMFAMode().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public CreateBackendAuthMFAConfig clone() {
        try {
            return (CreateBackendAuthMFAConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifybackend.model.transform.CreateBackendAuthMFAConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
