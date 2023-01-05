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
package com.amazonaws.services.appconfigdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfigdata-2021-11-11/StartConfigurationSession"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartConfigurationSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Token encapsulating state about the configuration session. Provide this token to the
     * <code>GetLatestConfiguration</code> API to retrieve configuration data.
     * </p>
     * <important>
     * <p>
     * This token should only be used once in your first call to <code>GetLatestConfiguration</code>. You MUST use the
     * new token in the <code>GetLatestConfiguration</code> response (<code>NextPollConfigurationToken</code>) in each
     * subsequent call to <code>GetLatestConfiguration</code>.
     * </p>
     * </important>
     */
    private String initialConfigurationToken;

    /**
     * <p>
     * Token encapsulating state about the configuration session. Provide this token to the
     * <code>GetLatestConfiguration</code> API to retrieve configuration data.
     * </p>
     * <important>
     * <p>
     * This token should only be used once in your first call to <code>GetLatestConfiguration</code>. You MUST use the
     * new token in the <code>GetLatestConfiguration</code> response (<code>NextPollConfigurationToken</code>) in each
     * subsequent call to <code>GetLatestConfiguration</code>.
     * </p>
     * </important>
     * 
     * @param initialConfigurationToken
     *        Token encapsulating state about the configuration session. Provide this token to the
     *        <code>GetLatestConfiguration</code> API to retrieve configuration data.</p> <important>
     *        <p>
     *        This token should only be used once in your first call to <code>GetLatestConfiguration</code>. You MUST
     *        use the new token in the <code>GetLatestConfiguration</code> response (
     *        <code>NextPollConfigurationToken</code>) in each subsequent call to <code>GetLatestConfiguration</code>.
     *        </p>
     */

    public void setInitialConfigurationToken(String initialConfigurationToken) {
        this.initialConfigurationToken = initialConfigurationToken;
    }

    /**
     * <p>
     * Token encapsulating state about the configuration session. Provide this token to the
     * <code>GetLatestConfiguration</code> API to retrieve configuration data.
     * </p>
     * <important>
     * <p>
     * This token should only be used once in your first call to <code>GetLatestConfiguration</code>. You MUST use the
     * new token in the <code>GetLatestConfiguration</code> response (<code>NextPollConfigurationToken</code>) in each
     * subsequent call to <code>GetLatestConfiguration</code>.
     * </p>
     * </important>
     * 
     * @return Token encapsulating state about the configuration session. Provide this token to the
     *         <code>GetLatestConfiguration</code> API to retrieve configuration data.</p> <important>
     *         <p>
     *         This token should only be used once in your first call to <code>GetLatestConfiguration</code>. You MUST
     *         use the new token in the <code>GetLatestConfiguration</code> response (
     *         <code>NextPollConfigurationToken</code>) in each subsequent call to <code>GetLatestConfiguration</code>.
     *         </p>
     */

    public String getInitialConfigurationToken() {
        return this.initialConfigurationToken;
    }

    /**
     * <p>
     * Token encapsulating state about the configuration session. Provide this token to the
     * <code>GetLatestConfiguration</code> API to retrieve configuration data.
     * </p>
     * <important>
     * <p>
     * This token should only be used once in your first call to <code>GetLatestConfiguration</code>. You MUST use the
     * new token in the <code>GetLatestConfiguration</code> response (<code>NextPollConfigurationToken</code>) in each
     * subsequent call to <code>GetLatestConfiguration</code>.
     * </p>
     * </important>
     * 
     * @param initialConfigurationToken
     *        Token encapsulating state about the configuration session. Provide this token to the
     *        <code>GetLatestConfiguration</code> API to retrieve configuration data.</p> <important>
     *        <p>
     *        This token should only be used once in your first call to <code>GetLatestConfiguration</code>. You MUST
     *        use the new token in the <code>GetLatestConfiguration</code> response (
     *        <code>NextPollConfigurationToken</code>) in each subsequent call to <code>GetLatestConfiguration</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartConfigurationSessionResult withInitialConfigurationToken(String initialConfigurationToken) {
        setInitialConfigurationToken(initialConfigurationToken);
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
        if (getInitialConfigurationToken() != null)
            sb.append("InitialConfigurationToken: ").append(getInitialConfigurationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartConfigurationSessionResult == false)
            return false;
        StartConfigurationSessionResult other = (StartConfigurationSessionResult) obj;
        if (other.getInitialConfigurationToken() == null ^ this.getInitialConfigurationToken() == null)
            return false;
        if (other.getInitialConfigurationToken() != null && other.getInitialConfigurationToken().equals(this.getInitialConfigurationToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInitialConfigurationToken() == null) ? 0 : getInitialConfigurationToken().hashCode());
        return hashCode;
    }

    @Override
    public StartConfigurationSessionResult clone() {
        try {
            return (StartConfigurationSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
