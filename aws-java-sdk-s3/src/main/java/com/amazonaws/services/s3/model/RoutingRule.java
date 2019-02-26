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
 * Container for one routing rule that identifies a condition and a redirect
 * that applies when the condition is met.
 */
public class RoutingRule implements Serializable {

    /**
     * The condition that must be met for the specified redirect to apply. For
     * example if request is for pages in the /docs folder, redirect to the
     * /documents folder or if request results in HTTP error 4xx, redirect
     * request to another host where you might process the error.
     */
    RoutingRuleCondition condition;

    /**
     * Container for redirect information. You can redirect requests to another
     * host, to another page, or with another protocol. In the event of an
     * error, you can can specify a different error code to return.
     */
    RedirectRule redirect;

    /**
     * Set the condition that must be met for the specified redirect to apply.
     */
    public void setCondition(RoutingRuleCondition condition) {
        this.condition = condition;
    }

    /**
     * Return the condition that must be met for the specified redirect to
     * apply.
     */
    public RoutingRuleCondition getCondition() {
        return condition;
    }

    /**
     * Set the condition that must be met for the specified redirect to apply
     * and returns a reference to this object(RoutingRule) for method chaining.
     */
    public RoutingRule withCondition(RoutingRuleCondition condition) {
        setCondition(condition);
        return this;
    }

    /**
     * Set the redirect information.
     */
    public void setRedirect(RedirectRule redirect) {
        this.redirect = redirect;
    }

    /**
     * Return the redirect information.
     */
    public RedirectRule getRedirect() {
        return redirect;
    }

    /**
     * Set the redirect information and returns a reference to this
     * object(RoutingRule) for method chaining.
     */
    public RoutingRule withRedirect(RedirectRule redirect) {
        setRedirect(redirect);
        return this;
    }

}
