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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateRelay" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRelayRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Authentication for the relay destination server—specify the secretARN where the SMTP credentials are stored.
     * </p>
     */
    private RelayAuthentication authentication;
    /**
     * <p>
     * A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The unique name of the relay resource.
     * </p>
     */
    private String relayName;
    /**
     * <p>
     * The destination relay server address.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The destination relay server port.
     * </p>
     */
    private Integer serverPort;
    /**
     * <p>
     * The tags used to organize, track, or control access for the resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Authentication for the relay destination server—specify the secretARN where the SMTP credentials are stored.
     * </p>
     * 
     * @param authentication
     *        Authentication for the relay destination server—specify the secretARN where the SMTP credentials are
     *        stored.
     */

    public void setAuthentication(RelayAuthentication authentication) {
        this.authentication = authentication;
    }

    /**
     * <p>
     * Authentication for the relay destination server—specify the secretARN where the SMTP credentials are stored.
     * </p>
     * 
     * @return Authentication for the relay destination server—specify the secretARN where the SMTP credentials are
     *         stored.
     */

    public RelayAuthentication getAuthentication() {
        return this.authentication;
    }

    /**
     * <p>
     * Authentication for the relay destination server—specify the secretARN where the SMTP credentials are stored.
     * </p>
     * 
     * @param authentication
     *        Authentication for the relay destination server—specify the secretARN where the SMTP credentials are
     *        stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelayRequest withAuthentication(RelayAuthentication authentication) {
        setAuthentication(authentication);
        return this;
    }

    /**
     * <p>
     * A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     * </p>
     * 
     * @return A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelayRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The unique name of the relay resource.
     * </p>
     * 
     * @param relayName
     *        The unique name of the relay resource.
     */

    public void setRelayName(String relayName) {
        this.relayName = relayName;
    }

    /**
     * <p>
     * The unique name of the relay resource.
     * </p>
     * 
     * @return The unique name of the relay resource.
     */

    public String getRelayName() {
        return this.relayName;
    }

    /**
     * <p>
     * The unique name of the relay resource.
     * </p>
     * 
     * @param relayName
     *        The unique name of the relay resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelayRequest withRelayName(String relayName) {
        setRelayName(relayName);
        return this;
    }

    /**
     * <p>
     * The destination relay server address.
     * </p>
     * 
     * @param serverName
     *        The destination relay server address.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The destination relay server address.
     * </p>
     * 
     * @return The destination relay server address.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The destination relay server address.
     * </p>
     * 
     * @param serverName
     *        The destination relay server address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelayRequest withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The destination relay server port.
     * </p>
     * 
     * @param serverPort
     *        The destination relay server port.
     */

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    /**
     * <p>
     * The destination relay server port.
     * </p>
     * 
     * @return The destination relay server port.
     */

    public Integer getServerPort() {
        return this.serverPort;
    }

    /**
     * <p>
     * The destination relay server port.
     * </p>
     * 
     * @param serverPort
     *        The destination relay server port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelayRequest withServerPort(Integer serverPort) {
        setServerPort(serverPort);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for the resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for the resource. For example, { "tags":
     *         {"key1":"value1", "key2":"value2"} }.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for the resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for the resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for the resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for the resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelayRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for the resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for the resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelayRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAuthentication() != null)
            sb.append("Authentication: ").append(getAuthentication()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getRelayName() != null)
            sb.append("RelayName: ").append(getRelayName()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getServerPort() != null)
            sb.append("ServerPort: ").append(getServerPort()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRelayRequest == false)
            return false;
        CreateRelayRequest other = (CreateRelayRequest) obj;
        if (other.getAuthentication() == null ^ this.getAuthentication() == null)
            return false;
        if (other.getAuthentication() != null && other.getAuthentication().equals(this.getAuthentication()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getRelayName() == null ^ this.getRelayName() == null)
            return false;
        if (other.getRelayName() != null && other.getRelayName().equals(this.getRelayName()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getServerPort() == null ^ this.getServerPort() == null)
            return false;
        if (other.getServerPort() != null && other.getServerPort().equals(this.getServerPort()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthentication() == null) ? 0 : getAuthentication().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getRelayName() == null) ? 0 : getRelayName().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getServerPort() == null) ? 0 : getServerPort().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRelayRequest clone() {
        return (CreateRelayRequest) super.clone();
    }

}
