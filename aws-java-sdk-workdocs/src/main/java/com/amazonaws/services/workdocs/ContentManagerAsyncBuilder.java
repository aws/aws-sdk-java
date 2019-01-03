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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.amazonaws.annotation.NotThreadSafe;

/**
 * Fluent builder for {@link com.amazonaws.services.workdocs.ContentManagerAsync}.
 * Use of the builder is required instead of constructors of the client class.
 **/
@NotThreadSafe
public class ContentManagerAsyncBuilder extends ContentManagerBuilder {
    private ExecutorService executorService;

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static ContentManagerAsyncBuilder standard() {
        return new ContentManagerAsyncBuilder();
    }

    /**
     * @return Default client.
     */
    public static ContentManagerAsync defaultContentManager() {
        return standard().build();
    }

    /**
     * Sets executor service used for asynchronous calls.
     *
     * @param executorService
     *            Executor service.
     * @return This object for method chaining.
     */
    public final ContentManagerAsyncBuilder withExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
        return this;
    }

    /**
     * Sets executor service used for asynchronous calls.
     *
     * @param executorService
     *            Executor service.
     */
    public final void setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
    }

    /**
     * Gets executor service used for asynchronous calls.
     *
     * @return Executor service.
     */
    public final ExecutorService getExecutorService() {
        return this.executorService;
    }

    /**
     * Sets authentication token for Amazon WorkDocs calls. This is used only
     * for user-level APIs.
     *
     * @param authenticationToken
     *            Token retrieved by OAuth flow.
     * @return This object for method chaining.
     */
    @Override
    public final ContentManagerAsyncBuilder withAuthenticationToken(String authenticationToken) {
        super.setAuthenticationToken(authenticationToken);
        return this;
    }

    /**
     * Sets the low level client used to make the service calls to Amazon
     * WorkDocs. If no client is specified, a default client will be created.
     *
     * @param workDocsClient
     *            Client implementation to use.
     * @return This object for method chaining.
     */
    @Override
    public final ContentManagerAsyncBuilder withWorkDocsClient(AmazonWorkDocs workDocsClient) {
        super.setWorkDocsClient(workDocsClient);
        return this;
    }

    /**
     * Construct ContentManager using the current builder configuration.
     * 
     * @return ContentManager object.
     */
    public ContentManagerAsync build() {
        if (this.executorService == null) {
            this.executorService = Executors.newFixedThreadPool(50);
        }
        return new ContentManagerAsync(this);
    }
}
