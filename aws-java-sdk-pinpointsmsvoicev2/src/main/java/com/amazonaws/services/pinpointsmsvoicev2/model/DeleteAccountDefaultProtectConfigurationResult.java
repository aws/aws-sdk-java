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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteAccountDefaultProtectConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAccountDefaultProtectConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account default protect configuration.
     * </p>
     */
    private String defaultProtectConfigurationArn;
    /**
     * <p>
     * The unique identifier of the account default protect configuration.
     * </p>
     */
    private String defaultProtectConfigurationId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account default protect configuration.
     * </p>
     * 
     * @param defaultProtectConfigurationArn
     *        The Amazon Resource Name (ARN) of the account default protect configuration.
     */

    public void setDefaultProtectConfigurationArn(String defaultProtectConfigurationArn) {
        this.defaultProtectConfigurationArn = defaultProtectConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account default protect configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the account default protect configuration.
     */

    public String getDefaultProtectConfigurationArn() {
        return this.defaultProtectConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account default protect configuration.
     * </p>
     * 
     * @param defaultProtectConfigurationArn
     *        The Amazon Resource Name (ARN) of the account default protect configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAccountDefaultProtectConfigurationResult withDefaultProtectConfigurationArn(String defaultProtectConfigurationArn) {
        setDefaultProtectConfigurationArn(defaultProtectConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the account default protect configuration.
     * </p>
     * 
     * @param defaultProtectConfigurationId
     *        The unique identifier of the account default protect configuration.
     */

    public void setDefaultProtectConfigurationId(String defaultProtectConfigurationId) {
        this.defaultProtectConfigurationId = defaultProtectConfigurationId;
    }

    /**
     * <p>
     * The unique identifier of the account default protect configuration.
     * </p>
     * 
     * @return The unique identifier of the account default protect configuration.
     */

    public String getDefaultProtectConfigurationId() {
        return this.defaultProtectConfigurationId;
    }

    /**
     * <p>
     * The unique identifier of the account default protect configuration.
     * </p>
     * 
     * @param defaultProtectConfigurationId
     *        The unique identifier of the account default protect configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAccountDefaultProtectConfigurationResult withDefaultProtectConfigurationId(String defaultProtectConfigurationId) {
        setDefaultProtectConfigurationId(defaultProtectConfigurationId);
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
        if (getDefaultProtectConfigurationArn() != null)
            sb.append("DefaultProtectConfigurationArn: ").append(getDefaultProtectConfigurationArn()).append(",");
        if (getDefaultProtectConfigurationId() != null)
            sb.append("DefaultProtectConfigurationId: ").append(getDefaultProtectConfigurationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAccountDefaultProtectConfigurationResult == false)
            return false;
        DeleteAccountDefaultProtectConfigurationResult other = (DeleteAccountDefaultProtectConfigurationResult) obj;
        if (other.getDefaultProtectConfigurationArn() == null ^ this.getDefaultProtectConfigurationArn() == null)
            return false;
        if (other.getDefaultProtectConfigurationArn() != null
                && other.getDefaultProtectConfigurationArn().equals(this.getDefaultProtectConfigurationArn()) == false)
            return false;
        if (other.getDefaultProtectConfigurationId() == null ^ this.getDefaultProtectConfigurationId() == null)
            return false;
        if (other.getDefaultProtectConfigurationId() != null
                && other.getDefaultProtectConfigurationId().equals(this.getDefaultProtectConfigurationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultProtectConfigurationArn() == null) ? 0 : getDefaultProtectConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getDefaultProtectConfigurationId() == null) ? 0 : getDefaultProtectConfigurationId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAccountDefaultProtectConfigurationResult clone() {
        try {
            return (DeleteAccountDefaultProtectConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
