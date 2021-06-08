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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/CreateApplicationPresignedUrl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationPresignedUrlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The type of the extension for which to create and return a URL. Currently, the only valid extension URL type is
     * <code>FLINK_DASHBOARD_URL</code>.
     * </p>
     */
    private String urlType;
    /**
     * <p>
     * The duration in seconds for which the returned URL will be valid.
     * </p>
     */
    private Long sessionExpirationDurationInSeconds;

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param applicationName
     *        The name of the application.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @return The name of the application.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param applicationName
     *        The name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationPresignedUrlRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The type of the extension for which to create and return a URL. Currently, the only valid extension URL type is
     * <code>FLINK_DASHBOARD_URL</code>.
     * </p>
     * 
     * @param urlType
     *        The type of the extension for which to create and return a URL. Currently, the only valid extension URL
     *        type is <code>FLINK_DASHBOARD_URL</code>.
     * @see UrlType
     */

    public void setUrlType(String urlType) {
        this.urlType = urlType;
    }

    /**
     * <p>
     * The type of the extension for which to create and return a URL. Currently, the only valid extension URL type is
     * <code>FLINK_DASHBOARD_URL</code>.
     * </p>
     * 
     * @return The type of the extension for which to create and return a URL. Currently, the only valid extension URL
     *         type is <code>FLINK_DASHBOARD_URL</code>.
     * @see UrlType
     */

    public String getUrlType() {
        return this.urlType;
    }

    /**
     * <p>
     * The type of the extension for which to create and return a URL. Currently, the only valid extension URL type is
     * <code>FLINK_DASHBOARD_URL</code>.
     * </p>
     * 
     * @param urlType
     *        The type of the extension for which to create and return a URL. Currently, the only valid extension URL
     *        type is <code>FLINK_DASHBOARD_URL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UrlType
     */

    public CreateApplicationPresignedUrlRequest withUrlType(String urlType) {
        setUrlType(urlType);
        return this;
    }

    /**
     * <p>
     * The type of the extension for which to create and return a URL. Currently, the only valid extension URL type is
     * <code>FLINK_DASHBOARD_URL</code>.
     * </p>
     * 
     * @param urlType
     *        The type of the extension for which to create and return a URL. Currently, the only valid extension URL
     *        type is <code>FLINK_DASHBOARD_URL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UrlType
     */

    public CreateApplicationPresignedUrlRequest withUrlType(UrlType urlType) {
        this.urlType = urlType.toString();
        return this;
    }

    /**
     * <p>
     * The duration in seconds for which the returned URL will be valid.
     * </p>
     * 
     * @param sessionExpirationDurationInSeconds
     *        The duration in seconds for which the returned URL will be valid.
     */

    public void setSessionExpirationDurationInSeconds(Long sessionExpirationDurationInSeconds) {
        this.sessionExpirationDurationInSeconds = sessionExpirationDurationInSeconds;
    }

    /**
     * <p>
     * The duration in seconds for which the returned URL will be valid.
     * </p>
     * 
     * @return The duration in seconds for which the returned URL will be valid.
     */

    public Long getSessionExpirationDurationInSeconds() {
        return this.sessionExpirationDurationInSeconds;
    }

    /**
     * <p>
     * The duration in seconds for which the returned URL will be valid.
     * </p>
     * 
     * @param sessionExpirationDurationInSeconds
     *        The duration in seconds for which the returned URL will be valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationPresignedUrlRequest withSessionExpirationDurationInSeconds(Long sessionExpirationDurationInSeconds) {
        setSessionExpirationDurationInSeconds(sessionExpirationDurationInSeconds);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getUrlType() != null)
            sb.append("UrlType: ").append(getUrlType()).append(",");
        if (getSessionExpirationDurationInSeconds() != null)
            sb.append("SessionExpirationDurationInSeconds: ").append(getSessionExpirationDurationInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationPresignedUrlRequest == false)
            return false;
        CreateApplicationPresignedUrlRequest other = (CreateApplicationPresignedUrlRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getUrlType() == null ^ this.getUrlType() == null)
            return false;
        if (other.getUrlType() != null && other.getUrlType().equals(this.getUrlType()) == false)
            return false;
        if (other.getSessionExpirationDurationInSeconds() == null ^ this.getSessionExpirationDurationInSeconds() == null)
            return false;
        if (other.getSessionExpirationDurationInSeconds() != null
                && other.getSessionExpirationDurationInSeconds().equals(this.getSessionExpirationDurationInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getUrlType() == null) ? 0 : getUrlType().hashCode());
        hashCode = prime * hashCode + ((getSessionExpirationDurationInSeconds() == null) ? 0 : getSessionExpirationDurationInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationPresignedUrlRequest clone() {
        return (CreateApplicationPresignedUrlRequest) super.clone();
    }

}
