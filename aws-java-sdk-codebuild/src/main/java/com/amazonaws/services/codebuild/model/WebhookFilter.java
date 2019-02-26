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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter used to determine which webhooks trigger a build.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/WebhookFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WebhookFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of webhook filter. There are five webhook filter types: <code>EVENT</code>,
     * <code>ACTOR_ACCOUNT_ID</code>, <code>HEAD_REF</code>, <code>BASE_REF</code>, and <code>FILE_PATH</code>.
     * </p>
     * <dl>
     * <dt>EVENT</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the provided <code>pattern</code> matches one of four event types:
     * <code>PUSH</code>, <code>PULL_REQUEST_CREATED</code>, <code>PULL_REQUEST_UPDATED</code>, and
     * <code>PULL_REQUEST_REOPENED</code>. The <code>EVENT</code> patterns are specified as a comma-separated string.
     * For example, <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> filters all push, pull request
     * created, and pull request updated events.
     * </p>
     * <note>
     * <p>
     * The <code>PULL_REQUEST_REOPENED</code> works with GitHub and GitHub Enterprise only.
     * </p>
     * </note></dd>
     * <dt>ACTOR_ACCOUNT_ID</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when a GitHub, GitHub Enterprise, or Bitbucket account ID matches the regular
     * expression <code>pattern</code>.
     * </p>
     * </dd>
     * <dt>HEAD_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the head reference matches the regular expression <code>pattern</code>. For
     * example, <code>refs/heads/branch-name</code> and <code>refs/tags/tag-name</code>.
     * </p>
     * <p>
     * Works with GitHub and GitHub Enterprise push, GitHub and GitHub Enterprise pull request, Bitbucket push, and
     * Bitbucket pull request events.
     * </p>
     * </dd>
     * <dt>BASE_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the base reference matches the regular expression <code>pattern</code>. For
     * example, <code>refs/heads/branch-name</code>.
     * </p>
     * <note>
     * <p>
     * Works with pull request events only.
     * </p>
     * </note></dd>
     * <dt>FILE_PATH</dt>
     * <dd>
     * <p>
     * A webhook triggers a build when the path of a changed file matches the regular expression <code>pattern</code>.
     * </p>
     * <note>
     * <p>
     * Works with GitHub and GitHub Enterprise push events only.
     * </p>
     * </note></dd>
     * </dl>
     */
    private String type;
    /**
     * <p>
     * For a <code>WebHookFilter</code> that uses <code>EVENT</code> type, a comma-separated string that specifies one
     * or more events. For example, the webhook filter <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code>
     * allows all push, pull request created, and pull request updated events to trigger a build.
     * </p>
     * <p>
     * For a <code>WebHookFilter</code> that uses any of the other filter types, a regular expression pattern. For
     * example, a <code>WebHookFilter</code> that uses <code>HEAD_REF</code> for its <code>type</code> and the pattern
     * <code>^refs/heads/</code> triggers a build when the head reference is a branch with a reference name
     * <code>refs/heads/branch-name</code>.
     * </p>
     */
    private String pattern;
    /**
     * <p>
     * Used to indicate that the <code>pattern</code> determines which webhook events do not trigger a build. If true,
     * then a webhook event that does not match the <code>pattern</code> triggers a build. If false, then a webhook
     * event that matches the <code>pattern</code> triggers a build.
     * </p>
     */
    private Boolean excludeMatchedPattern;

    /**
     * <p>
     * The type of webhook filter. There are five webhook filter types: <code>EVENT</code>,
     * <code>ACTOR_ACCOUNT_ID</code>, <code>HEAD_REF</code>, <code>BASE_REF</code>, and <code>FILE_PATH</code>.
     * </p>
     * <dl>
     * <dt>EVENT</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the provided <code>pattern</code> matches one of four event types:
     * <code>PUSH</code>, <code>PULL_REQUEST_CREATED</code>, <code>PULL_REQUEST_UPDATED</code>, and
     * <code>PULL_REQUEST_REOPENED</code>. The <code>EVENT</code> patterns are specified as a comma-separated string.
     * For example, <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> filters all push, pull request
     * created, and pull request updated events.
     * </p>
     * <note>
     * <p>
     * The <code>PULL_REQUEST_REOPENED</code> works with GitHub and GitHub Enterprise only.
     * </p>
     * </note></dd>
     * <dt>ACTOR_ACCOUNT_ID</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when a GitHub, GitHub Enterprise, or Bitbucket account ID matches the regular
     * expression <code>pattern</code>.
     * </p>
     * </dd>
     * <dt>HEAD_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the head reference matches the regular expression <code>pattern</code>. For
     * example, <code>refs/heads/branch-name</code> and <code>refs/tags/tag-name</code>.
     * </p>
     * <p>
     * Works with GitHub and GitHub Enterprise push, GitHub and GitHub Enterprise pull request, Bitbucket push, and
     * Bitbucket pull request events.
     * </p>
     * </dd>
     * <dt>BASE_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the base reference matches the regular expression <code>pattern</code>. For
     * example, <code>refs/heads/branch-name</code>.
     * </p>
     * <note>
     * <p>
     * Works with pull request events only.
     * </p>
     * </note></dd>
     * <dt>FILE_PATH</dt>
     * <dd>
     * <p>
     * A webhook triggers a build when the path of a changed file matches the regular expression <code>pattern</code>.
     * </p>
     * <note>
     * <p>
     * Works with GitHub and GitHub Enterprise push events only.
     * </p>
     * </note></dd>
     * </dl>
     * 
     * @param type
     *        The type of webhook filter. There are five webhook filter types: <code>EVENT</code>,
     *        <code>ACTOR_ACCOUNT_ID</code>, <code>HEAD_REF</code>, <code>BASE_REF</code>, and <code>FILE_PATH</code>.
     *        </p>
     *        <dl>
     *        <dt>EVENT</dt>
     *        <dd>
     *        <p>
     *        A webhook event triggers a build when the provided <code>pattern</code> matches one of four event types:
     *        <code>PUSH</code>, <code>PULL_REQUEST_CREATED</code>, <code>PULL_REQUEST_UPDATED</code>, and
     *        <code>PULL_REQUEST_REOPENED</code>. The <code>EVENT</code> patterns are specified as a comma-separated
     *        string. For example, <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> filters all push, pull
     *        request created, and pull request updated events.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>PULL_REQUEST_REOPENED</code> works with GitHub and GitHub Enterprise only.
     *        </p>
     *        </note></dd>
     *        <dt>ACTOR_ACCOUNT_ID</dt>
     *        <dd>
     *        <p>
     *        A webhook event triggers a build when a GitHub, GitHub Enterprise, or Bitbucket account ID matches the
     *        regular expression <code>pattern</code>.
     *        </p>
     *        </dd>
     *        <dt>HEAD_REF</dt>
     *        <dd>
     *        <p>
     *        A webhook event triggers a build when the head reference matches the regular expression
     *        <code>pattern</code>. For example, <code>refs/heads/branch-name</code> and <code>refs/tags/tag-name</code>
     *        .
     *        </p>
     *        <p>
     *        Works with GitHub and GitHub Enterprise push, GitHub and GitHub Enterprise pull request, Bitbucket push,
     *        and Bitbucket pull request events.
     *        </p>
     *        </dd>
     *        <dt>BASE_REF</dt>
     *        <dd>
     *        <p>
     *        A webhook event triggers a build when the base reference matches the regular expression
     *        <code>pattern</code>. For example, <code>refs/heads/branch-name</code>.
     *        </p>
     *        <note>
     *        <p>
     *        Works with pull request events only.
     *        </p>
     *        </note></dd>
     *        <dt>FILE_PATH</dt>
     *        <dd>
     *        <p>
     *        A webhook triggers a build when the path of a changed file matches the regular expression
     *        <code>pattern</code>.
     *        </p>
     *        <note>
     *        <p>
     *        Works with GitHub and GitHub Enterprise push events only.
     *        </p>
     *        </note></dd>
     * @see WebhookFilterType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of webhook filter. There are five webhook filter types: <code>EVENT</code>,
     * <code>ACTOR_ACCOUNT_ID</code>, <code>HEAD_REF</code>, <code>BASE_REF</code>, and <code>FILE_PATH</code>.
     * </p>
     * <dl>
     * <dt>EVENT</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the provided <code>pattern</code> matches one of four event types:
     * <code>PUSH</code>, <code>PULL_REQUEST_CREATED</code>, <code>PULL_REQUEST_UPDATED</code>, and
     * <code>PULL_REQUEST_REOPENED</code>. The <code>EVENT</code> patterns are specified as a comma-separated string.
     * For example, <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> filters all push, pull request
     * created, and pull request updated events.
     * </p>
     * <note>
     * <p>
     * The <code>PULL_REQUEST_REOPENED</code> works with GitHub and GitHub Enterprise only.
     * </p>
     * </note></dd>
     * <dt>ACTOR_ACCOUNT_ID</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when a GitHub, GitHub Enterprise, or Bitbucket account ID matches the regular
     * expression <code>pattern</code>.
     * </p>
     * </dd>
     * <dt>HEAD_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the head reference matches the regular expression <code>pattern</code>. For
     * example, <code>refs/heads/branch-name</code> and <code>refs/tags/tag-name</code>.
     * </p>
     * <p>
     * Works with GitHub and GitHub Enterprise push, GitHub and GitHub Enterprise pull request, Bitbucket push, and
     * Bitbucket pull request events.
     * </p>
     * </dd>
     * <dt>BASE_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the base reference matches the regular expression <code>pattern</code>. For
     * example, <code>refs/heads/branch-name</code>.
     * </p>
     * <note>
     * <p>
     * Works with pull request events only.
     * </p>
     * </note></dd>
     * <dt>FILE_PATH</dt>
     * <dd>
     * <p>
     * A webhook triggers a build when the path of a changed file matches the regular expression <code>pattern</code>.
     * </p>
     * <note>
     * <p>
     * Works with GitHub and GitHub Enterprise push events only.
     * </p>
     * </note></dd>
     * </dl>
     * 
     * @return The type of webhook filter. There are five webhook filter types: <code>EVENT</code>,
     *         <code>ACTOR_ACCOUNT_ID</code>, <code>HEAD_REF</code>, <code>BASE_REF</code>, and <code>FILE_PATH</code>.
     *         </p>
     *         <dl>
     *         <dt>EVENT</dt>
     *         <dd>
     *         <p>
     *         A webhook event triggers a build when the provided <code>pattern</code> matches one of four event types:
     *         <code>PUSH</code>, <code>PULL_REQUEST_CREATED</code>, <code>PULL_REQUEST_UPDATED</code>, and
     *         <code>PULL_REQUEST_REOPENED</code>. The <code>EVENT</code> patterns are specified as a comma-separated
     *         string. For example, <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> filters all push, pull
     *         request created, and pull request updated events.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>PULL_REQUEST_REOPENED</code> works with GitHub and GitHub Enterprise only.
     *         </p>
     *         </note></dd>
     *         <dt>ACTOR_ACCOUNT_ID</dt>
     *         <dd>
     *         <p>
     *         A webhook event triggers a build when a GitHub, GitHub Enterprise, or Bitbucket account ID matches the
     *         regular expression <code>pattern</code>.
     *         </p>
     *         </dd>
     *         <dt>HEAD_REF</dt>
     *         <dd>
     *         <p>
     *         A webhook event triggers a build when the head reference matches the regular expression
     *         <code>pattern</code>. For example, <code>refs/heads/branch-name</code> and
     *         <code>refs/tags/tag-name</code>.
     *         </p>
     *         <p>
     *         Works with GitHub and GitHub Enterprise push, GitHub and GitHub Enterprise pull request, Bitbucket push,
     *         and Bitbucket pull request events.
     *         </p>
     *         </dd>
     *         <dt>BASE_REF</dt>
     *         <dd>
     *         <p>
     *         A webhook event triggers a build when the base reference matches the regular expression
     *         <code>pattern</code>. For example, <code>refs/heads/branch-name</code>.
     *         </p>
     *         <note>
     *         <p>
     *         Works with pull request events only.
     *         </p>
     *         </note></dd>
     *         <dt>FILE_PATH</dt>
     *         <dd>
     *         <p>
     *         A webhook triggers a build when the path of a changed file matches the regular expression
     *         <code>pattern</code>.
     *         </p>
     *         <note>
     *         <p>
     *         Works with GitHub and GitHub Enterprise push events only.
     *         </p>
     *         </note></dd>
     * @see WebhookFilterType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of webhook filter. There are five webhook filter types: <code>EVENT</code>,
     * <code>ACTOR_ACCOUNT_ID</code>, <code>HEAD_REF</code>, <code>BASE_REF</code>, and <code>FILE_PATH</code>.
     * </p>
     * <dl>
     * <dt>EVENT</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the provided <code>pattern</code> matches one of four event types:
     * <code>PUSH</code>, <code>PULL_REQUEST_CREATED</code>, <code>PULL_REQUEST_UPDATED</code>, and
     * <code>PULL_REQUEST_REOPENED</code>. The <code>EVENT</code> patterns are specified as a comma-separated string.
     * For example, <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> filters all push, pull request
     * created, and pull request updated events.
     * </p>
     * <note>
     * <p>
     * The <code>PULL_REQUEST_REOPENED</code> works with GitHub and GitHub Enterprise only.
     * </p>
     * </note></dd>
     * <dt>ACTOR_ACCOUNT_ID</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when a GitHub, GitHub Enterprise, or Bitbucket account ID matches the regular
     * expression <code>pattern</code>.
     * </p>
     * </dd>
     * <dt>HEAD_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the head reference matches the regular expression <code>pattern</code>. For
     * example, <code>refs/heads/branch-name</code> and <code>refs/tags/tag-name</code>.
     * </p>
     * <p>
     * Works with GitHub and GitHub Enterprise push, GitHub and GitHub Enterprise pull request, Bitbucket push, and
     * Bitbucket pull request events.
     * </p>
     * </dd>
     * <dt>BASE_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the base reference matches the regular expression <code>pattern</code>. For
     * example, <code>refs/heads/branch-name</code>.
     * </p>
     * <note>
     * <p>
     * Works with pull request events only.
     * </p>
     * </note></dd>
     * <dt>FILE_PATH</dt>
     * <dd>
     * <p>
     * A webhook triggers a build when the path of a changed file matches the regular expression <code>pattern</code>.
     * </p>
     * <note>
     * <p>
     * Works with GitHub and GitHub Enterprise push events only.
     * </p>
     * </note></dd>
     * </dl>
     * 
     * @param type
     *        The type of webhook filter. There are five webhook filter types: <code>EVENT</code>,
     *        <code>ACTOR_ACCOUNT_ID</code>, <code>HEAD_REF</code>, <code>BASE_REF</code>, and <code>FILE_PATH</code>.
     *        </p>
     *        <dl>
     *        <dt>EVENT</dt>
     *        <dd>
     *        <p>
     *        A webhook event triggers a build when the provided <code>pattern</code> matches one of four event types:
     *        <code>PUSH</code>, <code>PULL_REQUEST_CREATED</code>, <code>PULL_REQUEST_UPDATED</code>, and
     *        <code>PULL_REQUEST_REOPENED</code>. The <code>EVENT</code> patterns are specified as a comma-separated
     *        string. For example, <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> filters all push, pull
     *        request created, and pull request updated events.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>PULL_REQUEST_REOPENED</code> works with GitHub and GitHub Enterprise only.
     *        </p>
     *        </note></dd>
     *        <dt>ACTOR_ACCOUNT_ID</dt>
     *        <dd>
     *        <p>
     *        A webhook event triggers a build when a GitHub, GitHub Enterprise, or Bitbucket account ID matches the
     *        regular expression <code>pattern</code>.
     *        </p>
     *        </dd>
     *        <dt>HEAD_REF</dt>
     *        <dd>
     *        <p>
     *        A webhook event triggers a build when the head reference matches the regular expression
     *        <code>pattern</code>. For example, <code>refs/heads/branch-name</code> and <code>refs/tags/tag-name</code>
     *        .
     *        </p>
     *        <p>
     *        Works with GitHub and GitHub Enterprise push, GitHub and GitHub Enterprise pull request, Bitbucket push,
     *        and Bitbucket pull request events.
     *        </p>
     *        </dd>
     *        <dt>BASE_REF</dt>
     *        <dd>
     *        <p>
     *        A webhook event triggers a build when the base reference matches the regular expression
     *        <code>pattern</code>. For example, <code>refs/heads/branch-name</code>.
     *        </p>
     *        <note>
     *        <p>
     *        Works with pull request events only.
     *        </p>
     *        </note></dd>
     *        <dt>FILE_PATH</dt>
     *        <dd>
     *        <p>
     *        A webhook triggers a build when the path of a changed file matches the regular expression
     *        <code>pattern</code>.
     *        </p>
     *        <note>
     *        <p>
     *        Works with GitHub and GitHub Enterprise push events only.
     *        </p>
     *        </note></dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebhookFilterType
     */

    public WebhookFilter withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of webhook filter. There are five webhook filter types: <code>EVENT</code>,
     * <code>ACTOR_ACCOUNT_ID</code>, <code>HEAD_REF</code>, <code>BASE_REF</code>, and <code>FILE_PATH</code>.
     * </p>
     * <dl>
     * <dt>EVENT</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the provided <code>pattern</code> matches one of four event types:
     * <code>PUSH</code>, <code>PULL_REQUEST_CREATED</code>, <code>PULL_REQUEST_UPDATED</code>, and
     * <code>PULL_REQUEST_REOPENED</code>. The <code>EVENT</code> patterns are specified as a comma-separated string.
     * For example, <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> filters all push, pull request
     * created, and pull request updated events.
     * </p>
     * <note>
     * <p>
     * The <code>PULL_REQUEST_REOPENED</code> works with GitHub and GitHub Enterprise only.
     * </p>
     * </note></dd>
     * <dt>ACTOR_ACCOUNT_ID</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when a GitHub, GitHub Enterprise, or Bitbucket account ID matches the regular
     * expression <code>pattern</code>.
     * </p>
     * </dd>
     * <dt>HEAD_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the head reference matches the regular expression <code>pattern</code>. For
     * example, <code>refs/heads/branch-name</code> and <code>refs/tags/tag-name</code>.
     * </p>
     * <p>
     * Works with GitHub and GitHub Enterprise push, GitHub and GitHub Enterprise pull request, Bitbucket push, and
     * Bitbucket pull request events.
     * </p>
     * </dd>
     * <dt>BASE_REF</dt>
     * <dd>
     * <p>
     * A webhook event triggers a build when the base reference matches the regular expression <code>pattern</code>. For
     * example, <code>refs/heads/branch-name</code>.
     * </p>
     * <note>
     * <p>
     * Works with pull request events only.
     * </p>
     * </note></dd>
     * <dt>FILE_PATH</dt>
     * <dd>
     * <p>
     * A webhook triggers a build when the path of a changed file matches the regular expression <code>pattern</code>.
     * </p>
     * <note>
     * <p>
     * Works with GitHub and GitHub Enterprise push events only.
     * </p>
     * </note></dd>
     * </dl>
     * 
     * @param type
     *        The type of webhook filter. There are five webhook filter types: <code>EVENT</code>,
     *        <code>ACTOR_ACCOUNT_ID</code>, <code>HEAD_REF</code>, <code>BASE_REF</code>, and <code>FILE_PATH</code>.
     *        </p>
     *        <dl>
     *        <dt>EVENT</dt>
     *        <dd>
     *        <p>
     *        A webhook event triggers a build when the provided <code>pattern</code> matches one of four event types:
     *        <code>PUSH</code>, <code>PULL_REQUEST_CREATED</code>, <code>PULL_REQUEST_UPDATED</code>, and
     *        <code>PULL_REQUEST_REOPENED</code>. The <code>EVENT</code> patterns are specified as a comma-separated
     *        string. For example, <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> filters all push, pull
     *        request created, and pull request updated events.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>PULL_REQUEST_REOPENED</code> works with GitHub and GitHub Enterprise only.
     *        </p>
     *        </note></dd>
     *        <dt>ACTOR_ACCOUNT_ID</dt>
     *        <dd>
     *        <p>
     *        A webhook event triggers a build when a GitHub, GitHub Enterprise, or Bitbucket account ID matches the
     *        regular expression <code>pattern</code>.
     *        </p>
     *        </dd>
     *        <dt>HEAD_REF</dt>
     *        <dd>
     *        <p>
     *        A webhook event triggers a build when the head reference matches the regular expression
     *        <code>pattern</code>. For example, <code>refs/heads/branch-name</code> and <code>refs/tags/tag-name</code>
     *        .
     *        </p>
     *        <p>
     *        Works with GitHub and GitHub Enterprise push, GitHub and GitHub Enterprise pull request, Bitbucket push,
     *        and Bitbucket pull request events.
     *        </p>
     *        </dd>
     *        <dt>BASE_REF</dt>
     *        <dd>
     *        <p>
     *        A webhook event triggers a build when the base reference matches the regular expression
     *        <code>pattern</code>. For example, <code>refs/heads/branch-name</code>.
     *        </p>
     *        <note>
     *        <p>
     *        Works with pull request events only.
     *        </p>
     *        </note></dd>
     *        <dt>FILE_PATH</dt>
     *        <dd>
     *        <p>
     *        A webhook triggers a build when the path of a changed file matches the regular expression
     *        <code>pattern</code>.
     *        </p>
     *        <note>
     *        <p>
     *        Works with GitHub and GitHub Enterprise push events only.
     *        </p>
     *        </note></dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebhookFilterType
     */

    public WebhookFilter withType(WebhookFilterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * For a <code>WebHookFilter</code> that uses <code>EVENT</code> type, a comma-separated string that specifies one
     * or more events. For example, the webhook filter <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code>
     * allows all push, pull request created, and pull request updated events to trigger a build.
     * </p>
     * <p>
     * For a <code>WebHookFilter</code> that uses any of the other filter types, a regular expression pattern. For
     * example, a <code>WebHookFilter</code> that uses <code>HEAD_REF</code> for its <code>type</code> and the pattern
     * <code>^refs/heads/</code> triggers a build when the head reference is a branch with a reference name
     * <code>refs/heads/branch-name</code>.
     * </p>
     * 
     * @param pattern
     *        For a <code>WebHookFilter</code> that uses <code>EVENT</code> type, a comma-separated string that
     *        specifies one or more events. For example, the webhook filter
     *        <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> allows all push, pull request created, and
     *        pull request updated events to trigger a build. </p>
     *        <p>
     *        For a <code>WebHookFilter</code> that uses any of the other filter types, a regular expression pattern.
     *        For example, a <code>WebHookFilter</code> that uses <code>HEAD_REF</code> for its <code>type</code> and
     *        the pattern <code>^refs/heads/</code> triggers a build when the head reference is a branch with a
     *        reference name <code>refs/heads/branch-name</code>.
     */

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * <p>
     * For a <code>WebHookFilter</code> that uses <code>EVENT</code> type, a comma-separated string that specifies one
     * or more events. For example, the webhook filter <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code>
     * allows all push, pull request created, and pull request updated events to trigger a build.
     * </p>
     * <p>
     * For a <code>WebHookFilter</code> that uses any of the other filter types, a regular expression pattern. For
     * example, a <code>WebHookFilter</code> that uses <code>HEAD_REF</code> for its <code>type</code> and the pattern
     * <code>^refs/heads/</code> triggers a build when the head reference is a branch with a reference name
     * <code>refs/heads/branch-name</code>.
     * </p>
     * 
     * @return For a <code>WebHookFilter</code> that uses <code>EVENT</code> type, a comma-separated string that
     *         specifies one or more events. For example, the webhook filter
     *         <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> allows all push, pull request created, and
     *         pull request updated events to trigger a build. </p>
     *         <p>
     *         For a <code>WebHookFilter</code> that uses any of the other filter types, a regular expression pattern.
     *         For example, a <code>WebHookFilter</code> that uses <code>HEAD_REF</code> for its <code>type</code> and
     *         the pattern <code>^refs/heads/</code> triggers a build when the head reference is a branch with a
     *         reference name <code>refs/heads/branch-name</code>.
     */

    public String getPattern() {
        return this.pattern;
    }

    /**
     * <p>
     * For a <code>WebHookFilter</code> that uses <code>EVENT</code> type, a comma-separated string that specifies one
     * or more events. For example, the webhook filter <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code>
     * allows all push, pull request created, and pull request updated events to trigger a build.
     * </p>
     * <p>
     * For a <code>WebHookFilter</code> that uses any of the other filter types, a regular expression pattern. For
     * example, a <code>WebHookFilter</code> that uses <code>HEAD_REF</code> for its <code>type</code> and the pattern
     * <code>^refs/heads/</code> triggers a build when the head reference is a branch with a reference name
     * <code>refs/heads/branch-name</code>.
     * </p>
     * 
     * @param pattern
     *        For a <code>WebHookFilter</code> that uses <code>EVENT</code> type, a comma-separated string that
     *        specifies one or more events. For example, the webhook filter
     *        <code>PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED</code> allows all push, pull request created, and
     *        pull request updated events to trigger a build. </p>
     *        <p>
     *        For a <code>WebHookFilter</code> that uses any of the other filter types, a regular expression pattern.
     *        For example, a <code>WebHookFilter</code> that uses <code>HEAD_REF</code> for its <code>type</code> and
     *        the pattern <code>^refs/heads/</code> triggers a build when the head reference is a branch with a
     *        reference name <code>refs/heads/branch-name</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebhookFilter withPattern(String pattern) {
        setPattern(pattern);
        return this;
    }

    /**
     * <p>
     * Used to indicate that the <code>pattern</code> determines which webhook events do not trigger a build. If true,
     * then a webhook event that does not match the <code>pattern</code> triggers a build. If false, then a webhook
     * event that matches the <code>pattern</code> triggers a build.
     * </p>
     * 
     * @param excludeMatchedPattern
     *        Used to indicate that the <code>pattern</code> determines which webhook events do not trigger a build. If
     *        true, then a webhook event that does not match the <code>pattern</code> triggers a build. If false, then a
     *        webhook event that matches the <code>pattern</code> triggers a build.
     */

    public void setExcludeMatchedPattern(Boolean excludeMatchedPattern) {
        this.excludeMatchedPattern = excludeMatchedPattern;
    }

    /**
     * <p>
     * Used to indicate that the <code>pattern</code> determines which webhook events do not trigger a build. If true,
     * then a webhook event that does not match the <code>pattern</code> triggers a build. If false, then a webhook
     * event that matches the <code>pattern</code> triggers a build.
     * </p>
     * 
     * @return Used to indicate that the <code>pattern</code> determines which webhook events do not trigger a build. If
     *         true, then a webhook event that does not match the <code>pattern</code> triggers a build. If false, then
     *         a webhook event that matches the <code>pattern</code> triggers a build.
     */

    public Boolean getExcludeMatchedPattern() {
        return this.excludeMatchedPattern;
    }

    /**
     * <p>
     * Used to indicate that the <code>pattern</code> determines which webhook events do not trigger a build. If true,
     * then a webhook event that does not match the <code>pattern</code> triggers a build. If false, then a webhook
     * event that matches the <code>pattern</code> triggers a build.
     * </p>
     * 
     * @param excludeMatchedPattern
     *        Used to indicate that the <code>pattern</code> determines which webhook events do not trigger a build. If
     *        true, then a webhook event that does not match the <code>pattern</code> triggers a build. If false, then a
     *        webhook event that matches the <code>pattern</code> triggers a build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebhookFilter withExcludeMatchedPattern(Boolean excludeMatchedPattern) {
        setExcludeMatchedPattern(excludeMatchedPattern);
        return this;
    }

    /**
     * <p>
     * Used to indicate that the <code>pattern</code> determines which webhook events do not trigger a build. If true,
     * then a webhook event that does not match the <code>pattern</code> triggers a build. If false, then a webhook
     * event that matches the <code>pattern</code> triggers a build.
     * </p>
     * 
     * @return Used to indicate that the <code>pattern</code> determines which webhook events do not trigger a build. If
     *         true, then a webhook event that does not match the <code>pattern</code> triggers a build. If false, then
     *         a webhook event that matches the <code>pattern</code> triggers a build.
     */

    public Boolean isExcludeMatchedPattern() {
        return this.excludeMatchedPattern;
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getPattern() != null)
            sb.append("Pattern: ").append(getPattern()).append(",");
        if (getExcludeMatchedPattern() != null)
            sb.append("ExcludeMatchedPattern: ").append(getExcludeMatchedPattern());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebhookFilter == false)
            return false;
        WebhookFilter other = (WebhookFilter) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPattern() == null ^ this.getPattern() == null)
            return false;
        if (other.getPattern() != null && other.getPattern().equals(this.getPattern()) == false)
            return false;
        if (other.getExcludeMatchedPattern() == null ^ this.getExcludeMatchedPattern() == null)
            return false;
        if (other.getExcludeMatchedPattern() != null && other.getExcludeMatchedPattern().equals(this.getExcludeMatchedPattern()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPattern() == null) ? 0 : getPattern().hashCode());
        hashCode = prime * hashCode + ((getExcludeMatchedPattern() == null) ? 0 : getExcludeMatchedPattern().hashCode());
        return hashCode;
    }

    @Override
    public WebhookFilter clone() {
        try {
            return (WebhookFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.WebhookFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
