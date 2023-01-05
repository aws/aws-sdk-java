/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeClientAuthenticationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClientAuthenticationSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the type of client authentication for the specified directory. The following information is
     * retrieved: The date and time when the status of the client authentication type was last updated, whether the
     * client authentication type is enabled or disabled, and the type of client authentication.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClientAuthenticationSettingInfo> clientAuthenticationSettingsInfo;
    /**
     * <p>
     * The next token used to retrieve the client authentication settings if the number of setting types exceeds page
     * limit and there is another page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the type of client authentication for the specified directory. The following information is
     * retrieved: The date and time when the status of the client authentication type was last updated, whether the
     * client authentication type is enabled or disabled, and the type of client authentication.
     * </p>
     * 
     * @return Information about the type of client authentication for the specified directory. The following
     *         information is retrieved: The date and time when the status of the client authentication type was last
     *         updated, whether the client authentication type is enabled or disabled, and the type of client
     *         authentication.
     */

    public java.util.List<ClientAuthenticationSettingInfo> getClientAuthenticationSettingsInfo() {
        if (clientAuthenticationSettingsInfo == null) {
            clientAuthenticationSettingsInfo = new com.amazonaws.internal.SdkInternalList<ClientAuthenticationSettingInfo>();
        }
        return clientAuthenticationSettingsInfo;
    }

    /**
     * <p>
     * Information about the type of client authentication for the specified directory. The following information is
     * retrieved: The date and time when the status of the client authentication type was last updated, whether the
     * client authentication type is enabled or disabled, and the type of client authentication.
     * </p>
     * 
     * @param clientAuthenticationSettingsInfo
     *        Information about the type of client authentication for the specified directory. The following information
     *        is retrieved: The date and time when the status of the client authentication type was last updated,
     *        whether the client authentication type is enabled or disabled, and the type of client authentication.
     */

    public void setClientAuthenticationSettingsInfo(java.util.Collection<ClientAuthenticationSettingInfo> clientAuthenticationSettingsInfo) {
        if (clientAuthenticationSettingsInfo == null) {
            this.clientAuthenticationSettingsInfo = null;
            return;
        }

        this.clientAuthenticationSettingsInfo = new com.amazonaws.internal.SdkInternalList<ClientAuthenticationSettingInfo>(clientAuthenticationSettingsInfo);
    }

    /**
     * <p>
     * Information about the type of client authentication for the specified directory. The following information is
     * retrieved: The date and time when the status of the client authentication type was last updated, whether the
     * client authentication type is enabled or disabled, and the type of client authentication.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClientAuthenticationSettingsInfo(java.util.Collection)} or
     * {@link #withClientAuthenticationSettingsInfo(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param clientAuthenticationSettingsInfo
     *        Information about the type of client authentication for the specified directory. The following information
     *        is retrieved: The date and time when the status of the client authentication type was last updated,
     *        whether the client authentication type is enabled or disabled, and the type of client authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClientAuthenticationSettingsResult withClientAuthenticationSettingsInfo(ClientAuthenticationSettingInfo... clientAuthenticationSettingsInfo) {
        if (this.clientAuthenticationSettingsInfo == null) {
            setClientAuthenticationSettingsInfo(new com.amazonaws.internal.SdkInternalList<ClientAuthenticationSettingInfo>(
                    clientAuthenticationSettingsInfo.length));
        }
        for (ClientAuthenticationSettingInfo ele : clientAuthenticationSettingsInfo) {
            this.clientAuthenticationSettingsInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the type of client authentication for the specified directory. The following information is
     * retrieved: The date and time when the status of the client authentication type was last updated, whether the
     * client authentication type is enabled or disabled, and the type of client authentication.
     * </p>
     * 
     * @param clientAuthenticationSettingsInfo
     *        Information about the type of client authentication for the specified directory. The following information
     *        is retrieved: The date and time when the status of the client authentication type was last updated,
     *        whether the client authentication type is enabled or disabled, and the type of client authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClientAuthenticationSettingsResult withClientAuthenticationSettingsInfo(
            java.util.Collection<ClientAuthenticationSettingInfo> clientAuthenticationSettingsInfo) {
        setClientAuthenticationSettingsInfo(clientAuthenticationSettingsInfo);
        return this;
    }

    /**
     * <p>
     * The next token used to retrieve the client authentication settings if the number of setting types exceeds page
     * limit and there is another page.
     * </p>
     * 
     * @param nextToken
     *        The next token used to retrieve the client authentication settings if the number of setting types exceeds
     *        page limit and there is another page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token used to retrieve the client authentication settings if the number of setting types exceeds page
     * limit and there is another page.
     * </p>
     * 
     * @return The next token used to retrieve the client authentication settings if the number of setting types exceeds
     *         page limit and there is another page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token used to retrieve the client authentication settings if the number of setting types exceeds page
     * limit and there is another page.
     * </p>
     * 
     * @param nextToken
     *        The next token used to retrieve the client authentication settings if the number of setting types exceeds
     *        page limit and there is another page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClientAuthenticationSettingsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getClientAuthenticationSettingsInfo() != null)
            sb.append("ClientAuthenticationSettingsInfo: ").append(getClientAuthenticationSettingsInfo()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClientAuthenticationSettingsResult == false)
            return false;
        DescribeClientAuthenticationSettingsResult other = (DescribeClientAuthenticationSettingsResult) obj;
        if (other.getClientAuthenticationSettingsInfo() == null ^ this.getClientAuthenticationSettingsInfo() == null)
            return false;
        if (other.getClientAuthenticationSettingsInfo() != null
                && other.getClientAuthenticationSettingsInfo().equals(this.getClientAuthenticationSettingsInfo()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientAuthenticationSettingsInfo() == null) ? 0 : getClientAuthenticationSettingsInfo().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClientAuthenticationSettingsResult clone() {
        try {
            return (DescribeClientAuthenticationSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
