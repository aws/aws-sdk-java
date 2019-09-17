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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Hls Akamai Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/HlsAkamaiSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsAkamaiSettings implements Serializable, Cloneable, StructuredPojo {

    /** Number of seconds to wait before retrying connection to the CDN if the connection is lost. */
    private Integer connectionRetryInterval;
    /** Size in seconds of file cache for streaming outputs. */
    private Integer filecacheDuration;
    /**
     * Specify whether or not to use chunked transfer encoding to Akamai. User should contact Akamai to enable this
     * feature.
     */
    private String httpTransferMode;
    /** Number of retry attempts that will be made before the Live Event is put into an error state. */
    private Integer numRetries;
    /**
     * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never
     * restart.
     */
    private Integer restartDelay;
    /** Salt for authenticated Akamai. */
    private String salt;
    /** Token parameter for authenticated akamai. If not specified, _gda_ is used. */
    private String token;

    /**
     * Number of seconds to wait before retrying connection to the CDN if the connection is lost.
     * 
     * @param connectionRetryInterval
     *        Number of seconds to wait before retrying connection to the CDN if the connection is lost.
     */

    public void setConnectionRetryInterval(Integer connectionRetryInterval) {
        this.connectionRetryInterval = connectionRetryInterval;
    }

    /**
     * Number of seconds to wait before retrying connection to the CDN if the connection is lost.
     * 
     * @return Number of seconds to wait before retrying connection to the CDN if the connection is lost.
     */

    public Integer getConnectionRetryInterval() {
        return this.connectionRetryInterval;
    }

    /**
     * Number of seconds to wait before retrying connection to the CDN if the connection is lost.
     * 
     * @param connectionRetryInterval
     *        Number of seconds to wait before retrying connection to the CDN if the connection is lost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsAkamaiSettings withConnectionRetryInterval(Integer connectionRetryInterval) {
        setConnectionRetryInterval(connectionRetryInterval);
        return this;
    }

    /**
     * Size in seconds of file cache for streaming outputs.
     * 
     * @param filecacheDuration
     *        Size in seconds of file cache for streaming outputs.
     */

    public void setFilecacheDuration(Integer filecacheDuration) {
        this.filecacheDuration = filecacheDuration;
    }

    /**
     * Size in seconds of file cache for streaming outputs.
     * 
     * @return Size in seconds of file cache for streaming outputs.
     */

    public Integer getFilecacheDuration() {
        return this.filecacheDuration;
    }

    /**
     * Size in seconds of file cache for streaming outputs.
     * 
     * @param filecacheDuration
     *        Size in seconds of file cache for streaming outputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsAkamaiSettings withFilecacheDuration(Integer filecacheDuration) {
        setFilecacheDuration(filecacheDuration);
        return this;
    }

    /**
     * Specify whether or not to use chunked transfer encoding to Akamai. User should contact Akamai to enable this
     * feature.
     * 
     * @param httpTransferMode
     *        Specify whether or not to use chunked transfer encoding to Akamai. User should contact Akamai to enable
     *        this feature.
     * @see HlsAkamaiHttpTransferMode
     */

    public void setHttpTransferMode(String httpTransferMode) {
        this.httpTransferMode = httpTransferMode;
    }

    /**
     * Specify whether or not to use chunked transfer encoding to Akamai. User should contact Akamai to enable this
     * feature.
     * 
     * @return Specify whether or not to use chunked transfer encoding to Akamai. User should contact Akamai to enable
     *         this feature.
     * @see HlsAkamaiHttpTransferMode
     */

    public String getHttpTransferMode() {
        return this.httpTransferMode;
    }

    /**
     * Specify whether or not to use chunked transfer encoding to Akamai. User should contact Akamai to enable this
     * feature.
     * 
     * @param httpTransferMode
     *        Specify whether or not to use chunked transfer encoding to Akamai. User should contact Akamai to enable
     *        this feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsAkamaiHttpTransferMode
     */

    public HlsAkamaiSettings withHttpTransferMode(String httpTransferMode) {
        setHttpTransferMode(httpTransferMode);
        return this;
    }

    /**
     * Specify whether or not to use chunked transfer encoding to Akamai. User should contact Akamai to enable this
     * feature.
     * 
     * @param httpTransferMode
     *        Specify whether or not to use chunked transfer encoding to Akamai. User should contact Akamai to enable
     *        this feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsAkamaiHttpTransferMode
     */

    public HlsAkamaiSettings withHttpTransferMode(HlsAkamaiHttpTransferMode httpTransferMode) {
        this.httpTransferMode = httpTransferMode.toString();
        return this;
    }

    /**
     * Number of retry attempts that will be made before the Live Event is put into an error state.
     * 
     * @param numRetries
     *        Number of retry attempts that will be made before the Live Event is put into an error state.
     */

    public void setNumRetries(Integer numRetries) {
        this.numRetries = numRetries;
    }

    /**
     * Number of retry attempts that will be made before the Live Event is put into an error state.
     * 
     * @return Number of retry attempts that will be made before the Live Event is put into an error state.
     */

    public Integer getNumRetries() {
        return this.numRetries;
    }

    /**
     * Number of retry attempts that will be made before the Live Event is put into an error state.
     * 
     * @param numRetries
     *        Number of retry attempts that will be made before the Live Event is put into an error state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsAkamaiSettings withNumRetries(Integer numRetries) {
        setNumRetries(numRetries);
        return this;
    }

    /**
     * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never
     * restart.
     * 
     * @param restartDelay
     *        If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means
     *        never restart.
     */

    public void setRestartDelay(Integer restartDelay) {
        this.restartDelay = restartDelay;
    }

    /**
     * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never
     * restart.
     * 
     * @return If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means
     *         never restart.
     */

    public Integer getRestartDelay() {
        return this.restartDelay;
    }

    /**
     * If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means never
     * restart.
     * 
     * @param restartDelay
     *        If a streaming output fails, number of seconds to wait until a restart is initiated. A value of 0 means
     *        never restart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsAkamaiSettings withRestartDelay(Integer restartDelay) {
        setRestartDelay(restartDelay);
        return this;
    }

    /**
     * Salt for authenticated Akamai.
     * 
     * @param salt
     *        Salt for authenticated Akamai.
     */

    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * Salt for authenticated Akamai.
     * 
     * @return Salt for authenticated Akamai.
     */

    public String getSalt() {
        return this.salt;
    }

    /**
     * Salt for authenticated Akamai.
     * 
     * @param salt
     *        Salt for authenticated Akamai.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsAkamaiSettings withSalt(String salt) {
        setSalt(salt);
        return this;
    }

    /**
     * Token parameter for authenticated akamai. If not specified, _gda_ is used.
     * 
     * @param token
     *        Token parameter for authenticated akamai. If not specified, _gda_ is used.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Token parameter for authenticated akamai. If not specified, _gda_ is used.
     * 
     * @return Token parameter for authenticated akamai. If not specified, _gda_ is used.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * Token parameter for authenticated akamai. If not specified, _gda_ is used.
     * 
     * @param token
     *        Token parameter for authenticated akamai. If not specified, _gda_ is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsAkamaiSettings withToken(String token) {
        setToken(token);
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
        if (getConnectionRetryInterval() != null)
            sb.append("ConnectionRetryInterval: ").append(getConnectionRetryInterval()).append(",");
        if (getFilecacheDuration() != null)
            sb.append("FilecacheDuration: ").append(getFilecacheDuration()).append(",");
        if (getHttpTransferMode() != null)
            sb.append("HttpTransferMode: ").append(getHttpTransferMode()).append(",");
        if (getNumRetries() != null)
            sb.append("NumRetries: ").append(getNumRetries()).append(",");
        if (getRestartDelay() != null)
            sb.append("RestartDelay: ").append(getRestartDelay()).append(",");
        if (getSalt() != null)
            sb.append("Salt: ").append(getSalt()).append(",");
        if (getToken() != null)
            sb.append("Token: ").append(getToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsAkamaiSettings == false)
            return false;
        HlsAkamaiSettings other = (HlsAkamaiSettings) obj;
        if (other.getConnectionRetryInterval() == null ^ this.getConnectionRetryInterval() == null)
            return false;
        if (other.getConnectionRetryInterval() != null && other.getConnectionRetryInterval().equals(this.getConnectionRetryInterval()) == false)
            return false;
        if (other.getFilecacheDuration() == null ^ this.getFilecacheDuration() == null)
            return false;
        if (other.getFilecacheDuration() != null && other.getFilecacheDuration().equals(this.getFilecacheDuration()) == false)
            return false;
        if (other.getHttpTransferMode() == null ^ this.getHttpTransferMode() == null)
            return false;
        if (other.getHttpTransferMode() != null && other.getHttpTransferMode().equals(this.getHttpTransferMode()) == false)
            return false;
        if (other.getNumRetries() == null ^ this.getNumRetries() == null)
            return false;
        if (other.getNumRetries() != null && other.getNumRetries().equals(this.getNumRetries()) == false)
            return false;
        if (other.getRestartDelay() == null ^ this.getRestartDelay() == null)
            return false;
        if (other.getRestartDelay() != null && other.getRestartDelay().equals(this.getRestartDelay()) == false)
            return false;
        if (other.getSalt() == null ^ this.getSalt() == null)
            return false;
        if (other.getSalt() != null && other.getSalt().equals(this.getSalt()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionRetryInterval() == null) ? 0 : getConnectionRetryInterval().hashCode());
        hashCode = prime * hashCode + ((getFilecacheDuration() == null) ? 0 : getFilecacheDuration().hashCode());
        hashCode = prime * hashCode + ((getHttpTransferMode() == null) ? 0 : getHttpTransferMode().hashCode());
        hashCode = prime * hashCode + ((getNumRetries() == null) ? 0 : getNumRetries().hashCode());
        hashCode = prime * hashCode + ((getRestartDelay() == null) ? 0 : getRestartDelay().hashCode());
        hashCode = prime * hashCode + ((getSalt() == null) ? 0 : getSalt().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        return hashCode;
    }

    @Override
    public HlsAkamaiSettings clone() {
        try {
            return (HlsAkamaiSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.HlsAkamaiSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
