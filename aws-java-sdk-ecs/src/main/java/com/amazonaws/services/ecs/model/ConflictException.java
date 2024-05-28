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
package com.amazonaws.services.ecs.model;

import javax.annotation.Generated;

/**
 * <p>
 * The <code>RunTask</code> request could not be processed due to conflicts. The provided <code>clientToken</code> is
 * already in use with a different <code>RunTask</code> request. The <code>resourceIds</code> are the existing task ARNs
 * which are already associated with the <code>clientToken</code>.
 * </p>
 * <p>
 * To fix this issue:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Run <code>RunTask</code> with a unique <code>clientToken</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Run <code>RunTask</code> with the <code>clientToken</code> and the original set of parameters
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.ecs.model.AmazonECSException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The existing task ARNs which are already associated with the <code>clientToken</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceIds;

    /**
     * Constructs a new ConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConflictException(String message) {
        super(message);
    }

    /**
     * <p>
     * The existing task ARNs which are already associated with the <code>clientToken</code>.
     * </p>
     * 
     * @return The existing task ARNs which are already associated with the <code>clientToken</code>.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceIds")
    public java.util.List<String> getResourceIds() {
        if (resourceIds == null) {
            resourceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceIds;
    }

    /**
     * <p>
     * The existing task ARNs which are already associated with the <code>clientToken</code>.
     * </p>
     * 
     * @param resourceIds
     *        The existing task ARNs which are already associated with the <code>clientToken</code>.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceIds")
    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }

        this.resourceIds = new com.amazonaws.internal.SdkInternalList<String>(resourceIds);
    }

    /**
     * <p>
     * The existing task ARNs which are already associated with the <code>clientToken</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIds(java.util.Collection)} or {@link #withResourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceIds
     *        The existing task ARNs which are already associated with the <code>clientToken</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceIds(String... resourceIds) {
        if (this.resourceIds == null) {
            setResourceIds(new com.amazonaws.internal.SdkInternalList<String>(resourceIds.length));
        }
        for (String ele : resourceIds) {
            this.resourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The existing task ARNs which are already associated with the <code>clientToken</code>.
     * </p>
     * 
     * @param resourceIds
     *        The existing task ARNs which are already associated with the <code>clientToken</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceIds(java.util.Collection<String> resourceIds) {
        setResourceIds(resourceIds);
        return this;
    }

}
