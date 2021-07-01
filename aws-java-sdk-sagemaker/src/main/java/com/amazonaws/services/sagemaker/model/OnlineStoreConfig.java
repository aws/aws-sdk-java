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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Use this to specify the Amazon Web Services Key Management Service (KMS) Key ID, or <code>KMSKeyId</code>, for at
 * rest data encryption. You can turn <code>OnlineStore</code> on or off by specifying the
 * <code>EnableOnlineStore</code> flag at General Assembly; the default value is <code>False</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/OnlineStoreConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OnlineStoreConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Use to specify KMS Key ID (<code>KMSKeyId</code>) for at-rest encryption of your <code>OnlineStore</code>.
     * </p>
     */
    private OnlineStoreSecurityConfig securityConfig;
    /**
     * <p>
     * Turn <code>OnlineStore</code> off by specifying <code>False</code> for the <code>EnableOnlineStore</code> flag.
     * Turn <code>OnlineStore</code> on by specifying <code>True</code> for the <code>EnableOnlineStore</code> flag.
     * </p>
     * <p>
     * The default value is <code>False</code>.
     * </p>
     */
    private Boolean enableOnlineStore;

    /**
     * <p>
     * Use to specify KMS Key ID (<code>KMSKeyId</code>) for at-rest encryption of your <code>OnlineStore</code>.
     * </p>
     * 
     * @param securityConfig
     *        Use to specify KMS Key ID (<code>KMSKeyId</code>) for at-rest encryption of your <code>OnlineStore</code>.
     */

    public void setSecurityConfig(OnlineStoreSecurityConfig securityConfig) {
        this.securityConfig = securityConfig;
    }

    /**
     * <p>
     * Use to specify KMS Key ID (<code>KMSKeyId</code>) for at-rest encryption of your <code>OnlineStore</code>.
     * </p>
     * 
     * @return Use to specify KMS Key ID (<code>KMSKeyId</code>) for at-rest encryption of your <code>OnlineStore</code>
     *         .
     */

    public OnlineStoreSecurityConfig getSecurityConfig() {
        return this.securityConfig;
    }

    /**
     * <p>
     * Use to specify KMS Key ID (<code>KMSKeyId</code>) for at-rest encryption of your <code>OnlineStore</code>.
     * </p>
     * 
     * @param securityConfig
     *        Use to specify KMS Key ID (<code>KMSKeyId</code>) for at-rest encryption of your <code>OnlineStore</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnlineStoreConfig withSecurityConfig(OnlineStoreSecurityConfig securityConfig) {
        setSecurityConfig(securityConfig);
        return this;
    }

    /**
     * <p>
     * Turn <code>OnlineStore</code> off by specifying <code>False</code> for the <code>EnableOnlineStore</code> flag.
     * Turn <code>OnlineStore</code> on by specifying <code>True</code> for the <code>EnableOnlineStore</code> flag.
     * </p>
     * <p>
     * The default value is <code>False</code>.
     * </p>
     * 
     * @param enableOnlineStore
     *        Turn <code>OnlineStore</code> off by specifying <code>False</code> for the <code>EnableOnlineStore</code>
     *        flag. Turn <code>OnlineStore</code> on by specifying <code>True</code> for the
     *        <code>EnableOnlineStore</code> flag. </p>
     *        <p>
     *        The default value is <code>False</code>.
     */

    public void setEnableOnlineStore(Boolean enableOnlineStore) {
        this.enableOnlineStore = enableOnlineStore;
    }

    /**
     * <p>
     * Turn <code>OnlineStore</code> off by specifying <code>False</code> for the <code>EnableOnlineStore</code> flag.
     * Turn <code>OnlineStore</code> on by specifying <code>True</code> for the <code>EnableOnlineStore</code> flag.
     * </p>
     * <p>
     * The default value is <code>False</code>.
     * </p>
     * 
     * @return Turn <code>OnlineStore</code> off by specifying <code>False</code> for the <code>EnableOnlineStore</code>
     *         flag. Turn <code>OnlineStore</code> on by specifying <code>True</code> for the
     *         <code>EnableOnlineStore</code> flag. </p>
     *         <p>
     *         The default value is <code>False</code>.
     */

    public Boolean getEnableOnlineStore() {
        return this.enableOnlineStore;
    }

    /**
     * <p>
     * Turn <code>OnlineStore</code> off by specifying <code>False</code> for the <code>EnableOnlineStore</code> flag.
     * Turn <code>OnlineStore</code> on by specifying <code>True</code> for the <code>EnableOnlineStore</code> flag.
     * </p>
     * <p>
     * The default value is <code>False</code>.
     * </p>
     * 
     * @param enableOnlineStore
     *        Turn <code>OnlineStore</code> off by specifying <code>False</code> for the <code>EnableOnlineStore</code>
     *        flag. Turn <code>OnlineStore</code> on by specifying <code>True</code> for the
     *        <code>EnableOnlineStore</code> flag. </p>
     *        <p>
     *        The default value is <code>False</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnlineStoreConfig withEnableOnlineStore(Boolean enableOnlineStore) {
        setEnableOnlineStore(enableOnlineStore);
        return this;
    }

    /**
     * <p>
     * Turn <code>OnlineStore</code> off by specifying <code>False</code> for the <code>EnableOnlineStore</code> flag.
     * Turn <code>OnlineStore</code> on by specifying <code>True</code> for the <code>EnableOnlineStore</code> flag.
     * </p>
     * <p>
     * The default value is <code>False</code>.
     * </p>
     * 
     * @return Turn <code>OnlineStore</code> off by specifying <code>False</code> for the <code>EnableOnlineStore</code>
     *         flag. Turn <code>OnlineStore</code> on by specifying <code>True</code> for the
     *         <code>EnableOnlineStore</code> flag. </p>
     *         <p>
     *         The default value is <code>False</code>.
     */

    public Boolean isEnableOnlineStore() {
        return this.enableOnlineStore;
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
        if (getSecurityConfig() != null)
            sb.append("SecurityConfig: ").append(getSecurityConfig()).append(",");
        if (getEnableOnlineStore() != null)
            sb.append("EnableOnlineStore: ").append(getEnableOnlineStore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OnlineStoreConfig == false)
            return false;
        OnlineStoreConfig other = (OnlineStoreConfig) obj;
        if (other.getSecurityConfig() == null ^ this.getSecurityConfig() == null)
            return false;
        if (other.getSecurityConfig() != null && other.getSecurityConfig().equals(this.getSecurityConfig()) == false)
            return false;
        if (other.getEnableOnlineStore() == null ^ this.getEnableOnlineStore() == null)
            return false;
        if (other.getEnableOnlineStore() != null && other.getEnableOnlineStore().equals(this.getEnableOnlineStore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityConfig() == null) ? 0 : getSecurityConfig().hashCode());
        hashCode = prime * hashCode + ((getEnableOnlineStore() == null) ? 0 : getEnableOnlineStore().hashCode());
        return hashCode;
    }

    @Override
    public OnlineStoreConfig clone() {
        try {
            return (OnlineStoreConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.OnlineStoreConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
