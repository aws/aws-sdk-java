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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfigdata-2021-11-11/GetLatestConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLatestConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Token describing the current state of the configuration session. To obtain a token, first call the
     * <a>StartConfigurationSession</a> API. Note that every call to <code>GetLatestConfiguration</code> will return a
     * new <code>ConfigurationToken</code> (<code>NextPollConfigurationToken</code> in the response) and MUST be
     * provided to subsequent <code>GetLatestConfiguration</code> API calls.
     * </p>
     */
    private String configurationToken;

    /**
     * <p>
     * Token describing the current state of the configuration session. To obtain a token, first call the
     * <a>StartConfigurationSession</a> API. Note that every call to <code>GetLatestConfiguration</code> will return a
     * new <code>ConfigurationToken</code> (<code>NextPollConfigurationToken</code> in the response) and MUST be
     * provided to subsequent <code>GetLatestConfiguration</code> API calls.
     * </p>
     * 
     * @param configurationToken
     *        Token describing the current state of the configuration session. To obtain a token, first call the
     *        <a>StartConfigurationSession</a> API. Note that every call to <code>GetLatestConfiguration</code> will
     *        return a new <code>ConfigurationToken</code> (<code>NextPollConfigurationToken</code> in the response) and
     *        MUST be provided to subsequent <code>GetLatestConfiguration</code> API calls.
     */

    public void setConfigurationToken(String configurationToken) {
        this.configurationToken = configurationToken;
    }

    /**
     * <p>
     * Token describing the current state of the configuration session. To obtain a token, first call the
     * <a>StartConfigurationSession</a> API. Note that every call to <code>GetLatestConfiguration</code> will return a
     * new <code>ConfigurationToken</code> (<code>NextPollConfigurationToken</code> in the response) and MUST be
     * provided to subsequent <code>GetLatestConfiguration</code> API calls.
     * </p>
     * 
     * @return Token describing the current state of the configuration session. To obtain a token, first call the
     *         <a>StartConfigurationSession</a> API. Note that every call to <code>GetLatestConfiguration</code> will
     *         return a new <code>ConfigurationToken</code> (<code>NextPollConfigurationToken</code> in the response)
     *         and MUST be provided to subsequent <code>GetLatestConfiguration</code> API calls.
     */

    public String getConfigurationToken() {
        return this.configurationToken;
    }

    /**
     * <p>
     * Token describing the current state of the configuration session. To obtain a token, first call the
     * <a>StartConfigurationSession</a> API. Note that every call to <code>GetLatestConfiguration</code> will return a
     * new <code>ConfigurationToken</code> (<code>NextPollConfigurationToken</code> in the response) and MUST be
     * provided to subsequent <code>GetLatestConfiguration</code> API calls.
     * </p>
     * 
     * @param configurationToken
     *        Token describing the current state of the configuration session. To obtain a token, first call the
     *        <a>StartConfigurationSession</a> API. Note that every call to <code>GetLatestConfiguration</code> will
     *        return a new <code>ConfigurationToken</code> (<code>NextPollConfigurationToken</code> in the response) and
     *        MUST be provided to subsequent <code>GetLatestConfiguration</code> API calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLatestConfigurationRequest withConfigurationToken(String configurationToken) {
        setConfigurationToken(configurationToken);
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
        if (getConfigurationToken() != null)
            sb.append("ConfigurationToken: ").append(getConfigurationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLatestConfigurationRequest == false)
            return false;
        GetLatestConfigurationRequest other = (GetLatestConfigurationRequest) obj;
        if (other.getConfigurationToken() == null ^ this.getConfigurationToken() == null)
            return false;
        if (other.getConfigurationToken() != null && other.getConfigurationToken().equals(this.getConfigurationToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationToken() == null) ? 0 : getConfigurationToken().hashCode());
        return hashCode;
    }

    @Override
    public GetLatestConfigurationRequest clone() {
        return (GetLatestConfigurationRequest) super.clone();
    }

}
