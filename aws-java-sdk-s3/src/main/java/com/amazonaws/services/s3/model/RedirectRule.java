/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model;
import java.io.Serializable;

/**
 * Container for redirect information. You can redirect requests to another
 * host, to another page, or with another protocol. In the event of an error,
 * you can can specify a different error code to return.
 */
public class RedirectRule implements Serializable {
    /** The protocol to use in the redirect request */
    private String protocol;

    /** The host name to use in the redirect request */
    private String hostName;

    /** The object prefix key to use in the redirect request */
    private String replaceKeyPrefixWith;

    /** The specific key to use in the redirect request */
    private String replaceKeyWith;

    /** The HTTP code to use in the redirect response */
    private String httpRedirectCode;

    /**
     * Set the protocol to use in the redirect request.
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * Return the protocol to use in the redirect request.
     */
    public String getprotocol() {
        return protocol;
    }

    /**
     * Set the protocol to use in the redirect request and and returns a
     * reference to this object(RoutingRuleRedirect) for method chaining.
     */
    public RedirectRule withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * Set the host name to use in the redirect request.
     */
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * Return the host name to use in the redirect request.
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Set the host name to use in the redirect request and returns a reference
     * to this object(RoutingRuleRedirect) for method chaining.
     */
    public RedirectRule withHostName(String hostName) {
        setHostName(hostName);
        return this;
    }

    /**
     * Set the object prefix key to use in the redirect request.
     */
    public void setReplaceKeyPrefixWith(String replaceKeyPrefixWith) {
        this.replaceKeyPrefixWith = replaceKeyPrefixWith;
    }

    /**
     * Return the object prefix key to use in the redirect request.
     */
    public String getReplaceKeyPrefixWith() {
        return replaceKeyPrefixWith;
    }

    /**
     * Set the object prefix key to use in the redirect request and returns a
     * reference to this object(RoutingRuleRedirect) for method chaining.
     */
    public RedirectRule withReplaceKeyPrefixWith(String replaceKeyPrefixWith) {
        setReplaceKeyPrefixWith(replaceKeyPrefixWith);
        return this;
    }

    /**
     * Set the specific key to use in the redirect request.
     */
    public void setReplaceKeyWith(String replaceKeyWith) {
        this.replaceKeyWith = replaceKeyWith;
    }

    /**
     * Return the specific key to use in the redirect request.
     */
    public String getReplaceKeyWith() {
        return replaceKeyWith;
    }

    /**
     * Set the specific key to use in the redirect request and returns a
     * reference to this object(RoutingRuleRedirect) for method chaining.
     */
    public RedirectRule withReplaceKeyWith(String replaceKeyWith) {
        setReplaceKeyWith(replaceKeyWith);
        return this;
    }

    /**
     * Set the HTTP code to use in the redirect response.
     */
    public void setHttpRedirectCode(String httpRedirectCode) {
        this.httpRedirectCode = httpRedirectCode;
    }

    /**
     * Return the HTTP code to use in the redirect response.
     */
    public String getHttpRedirectCode() {
        return httpRedirectCode;
    }

    /**
     * Set the HTTP code to use in the redirect response and returns a reference
     * to this object(RoutingRuleRedirect) for method chaining.
     */
    public RedirectRule withHttpRedirectCode(String httpRedirectCode) {
        this.httpRedirectCode = httpRedirectCode;
        return this;
    }
}
