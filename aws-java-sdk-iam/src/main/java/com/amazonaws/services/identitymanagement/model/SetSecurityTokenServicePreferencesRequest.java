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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/SetSecurityTokenServicePreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetSecurityTokenServicePreferencesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The version of the global endpoint token. Version 1 tokens are valid only in AWS Regions that are available by
     * default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens
     * are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily
     * store tokens.
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating STS in an AWS Region</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private String globalEndpointTokenVersion;

    /**
     * <p>
     * The version of the global endpoint token. Version 1 tokens are valid only in AWS Regions that are available by
     * default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens
     * are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily
     * store tokens.
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating STS in an AWS Region</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param globalEndpointTokenVersion
     *        The version of the global endpoint token. Version 1 tokens are valid only in AWS Regions that are
     *        available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong
     *        Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect
     *        systems where you temporarily store tokens.</p>
     *        <p>
     *        For information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating
     *        and Deactivating STS in an AWS Region</a> in the <i>IAM User Guide</i>.
     * @see GlobalEndpointTokenVersion
     */

    public void setGlobalEndpointTokenVersion(String globalEndpointTokenVersion) {
        this.globalEndpointTokenVersion = globalEndpointTokenVersion;
    }

    /**
     * <p>
     * The version of the global endpoint token. Version 1 tokens are valid only in AWS Regions that are available by
     * default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens
     * are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily
     * store tokens.
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating STS in an AWS Region</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return The version of the global endpoint token. Version 1 tokens are valid only in AWS Regions that are
     *         available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong
     *         Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect
     *         systems where you temporarily store tokens.</p>
     *         <p>
     *         For information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     *         >Activating and Deactivating STS in an AWS Region</a> in the <i>IAM User Guide</i>.
     * @see GlobalEndpointTokenVersion
     */

    public String getGlobalEndpointTokenVersion() {
        return this.globalEndpointTokenVersion;
    }

    /**
     * <p>
     * The version of the global endpoint token. Version 1 tokens are valid only in AWS Regions that are available by
     * default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens
     * are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily
     * store tokens.
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating STS in an AWS Region</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param globalEndpointTokenVersion
     *        The version of the global endpoint token. Version 1 tokens are valid only in AWS Regions that are
     *        available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong
     *        Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect
     *        systems where you temporarily store tokens.</p>
     *        <p>
     *        For information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating
     *        and Deactivating STS in an AWS Region</a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlobalEndpointTokenVersion
     */

    public SetSecurityTokenServicePreferencesRequest withGlobalEndpointTokenVersion(String globalEndpointTokenVersion) {
        setGlobalEndpointTokenVersion(globalEndpointTokenVersion);
        return this;
    }

    /**
     * <p>
     * The version of the global endpoint token. Version 1 tokens are valid only in AWS Regions that are available by
     * default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens
     * are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily
     * store tokens.
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating STS in an AWS Region</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param globalEndpointTokenVersion
     *        The version of the global endpoint token. Version 1 tokens are valid only in AWS Regions that are
     *        available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong
     *        Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect
     *        systems where you temporarily store tokens.</p>
     *        <p>
     *        For information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating
     *        and Deactivating STS in an AWS Region</a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlobalEndpointTokenVersion
     */

    public SetSecurityTokenServicePreferencesRequest withGlobalEndpointTokenVersion(GlobalEndpointTokenVersion globalEndpointTokenVersion) {
        this.globalEndpointTokenVersion = globalEndpointTokenVersion.toString();
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
        if (getGlobalEndpointTokenVersion() != null)
            sb.append("GlobalEndpointTokenVersion: ").append(getGlobalEndpointTokenVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetSecurityTokenServicePreferencesRequest == false)
            return false;
        SetSecurityTokenServicePreferencesRequest other = (SetSecurityTokenServicePreferencesRequest) obj;
        if (other.getGlobalEndpointTokenVersion() == null ^ this.getGlobalEndpointTokenVersion() == null)
            return false;
        if (other.getGlobalEndpointTokenVersion() != null && other.getGlobalEndpointTokenVersion().equals(this.getGlobalEndpointTokenVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalEndpointTokenVersion() == null) ? 0 : getGlobalEndpointTokenVersion().hashCode());
        return hashCode;
    }

    @Override
    public SetSecurityTokenServicePreferencesRequest clone() {
        return (SetSecurityTokenServicePreferencesRequest) super.clone();
    }

}
