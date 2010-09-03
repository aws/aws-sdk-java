/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth.policy;

/**
 * A principal is an AWS account which is being allowed or denied access to a
 * resource through an access control policy. The principal is a property of the
 * {@link Statement} object, not directly the {@link Policy} object.
 * <p>
 * The principal is A in the statement
 * "A has permission to do B to C where D applies."
 * <p>
 * In an access control policy statement, you can set the principal to all
 * authenticated AWS users through the {@link Principal#AllUsers} member. This
 * is useful when you don't want to restrict access based on the identity of the
 * requester, but instead on other identifying characteristics such as the
 * requester's IP address.
 */
public class Principal {

    /**
     * Principal instance that includes all users, including anonymous users.
     * <p>
     * This is useful when you don't want to restrict access based on the
     * identity of the requester, but instead on other identifying
     * characteristics such as the requester's IP address.
     */
    public static final Principal AllUsers = new Principal("*");

    private final String id;

    /**
     * Constructs a new principal with the specified AWS account ID.
     *
     * @param accountId
     *            An AWS account ID.
     */
    public Principal(String accountId) {
        if (accountId == null) {
            throw new IllegalArgumentException("Null AWS account ID specified");
        }
        this.id = accountId.replaceAll("-", "");
    }

    /**
     * Returns the provider for this principal, which indicates in what group of
     * users this principal resides.
     *
     * @return The provider for this principal.
     */
    public String getProvider() {
        return "AWS";
    }

    /**
     * Returns the unique ID for this principal.
     *
     * @return The unique ID for this principal.
     */
    public String getId() {
        return id;
    }

}