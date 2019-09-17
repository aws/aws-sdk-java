/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.workdocs;

import com.amazonaws.annotation.NotThreadSafe;

/**
 * Fluent builder for {@link com.amazonaws.services.workdocs.ContentManager}.
 * Use of the builder is required instead of constructors of the client class.
 **/
@NotThreadSafe
public class ContentManagerBuilder {
    private AmazonWorkDocs workDocsClient;
    private String authenticationToken;

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static ContentManagerBuilder standard() {
        return new ContentManagerBuilder();
    }

    /**
     * @return Default client.
     */
    public static ContentManager defaultContentManager() {
        return standard().build();
    }

    /**
     * Sets the low level client used to make the service calls to Amazon
     * WorkDocs. If no client is specified, a default client will be created.
     *
     * @param workDocsClient
     *            Client implementation to use.
     * @return This object for method chaining.
     */
    public ContentManagerBuilder withWorkDocsClient(AmazonWorkDocs workDocsClient) {
        this.workDocsClient = workDocsClient;
        return this;
    }

    /**
     * Sets the low level client used to make the service calls to Amazon
     * WorkDocs. If no client is specified, a default client will be created.
     *
     * @param workDocsClient
     *            Client implementation to use.
     */
    public final void setWorkDocsClient(AmazonWorkDocs workDocsClient) {
        this.workDocsClient = workDocsClient;
    }
    
    /**
     * Gets WorkDocs client.
     * 
     * @return WorkDocs client implementation.
     */
    public final AmazonWorkDocs getWorkDocsClient() {
        return this.workDocsClient;
    }

    /**
     * Sets authentication token for Amazon WorkDocs calls. This is used only
     * for user-level APIs.
     *
     * @param authenticationToken
     *            Token retrieved by OAuth flow.
     * @return This object for method chaining.
     */
    public ContentManagerBuilder withAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
        return this;
    }

    /**
     * Sets authentication token for Amazon WorkDocs calls. This is used only
     * for user-level APIs.
     *
     * @param authenticationToken
     *            Token retrieved by OAuth flow.
     */
    public final void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }
    
    /**
     * Gets authentication token for Amazon WorkDocs calls.
     * 
     * @return Token retrieved by OAuth flow.
     */
    public final String getAuthenticationToken() {
        return this.authenticationToken;
    }

    /**
     * Construct ContentManager using the current builder configuration.
     * 
     * @return ContentManager object.
     */
    public ContentManager build() {
        if (this.workDocsClient == null) {
            this.workDocsClient = AmazonWorkDocsClientBuilder.defaultClient();
        }
        return new ContentManager(this);
    }
}
