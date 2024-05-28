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
package com.amazonaws.services.kendra.model;

import javax.annotation.Generated;

/**
 * <p>
 * An error message with a list of conflicting queries used across different sets of featured results. This occurred
 * with the request for a new featured results set. Check that the queries you specified for featured results are unique
 * per featured results set for each index.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FeaturedResultsConflictException extends com.amazonaws.services.kendra.model.AWSkendraException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * A list of the conflicting queries, including the query text, the name for the featured results set, and the
     * identifier of the featured results set.
     * </p>
     */
    private java.util.List<ConflictingItem> conflictingItems;

    /**
     * Constructs a new FeaturedResultsConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public FeaturedResultsConflictException(String message) {
        super(message);
    }

    /**
     * <p>
     * A list of the conflicting queries, including the query text, the name for the featured results set, and the
     * identifier of the featured results set.
     * </p>
     * 
     * @return A list of the conflicting queries, including the query text, the name for the featured results set, and
     *         the identifier of the featured results set.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ConflictingItems")
    public java.util.List<ConflictingItem> getConflictingItems() {
        return conflictingItems;
    }

    /**
     * <p>
     * A list of the conflicting queries, including the query text, the name for the featured results set, and the
     * identifier of the featured results set.
     * </p>
     * 
     * @param conflictingItems
     *        A list of the conflicting queries, including the query text, the name for the featured results set, and
     *        the identifier of the featured results set.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ConflictingItems")
    public void setConflictingItems(java.util.Collection<ConflictingItem> conflictingItems) {
        if (conflictingItems == null) {
            this.conflictingItems = null;
            return;
        }

        this.conflictingItems = new java.util.ArrayList<ConflictingItem>(conflictingItems);
    }

    /**
     * <p>
     * A list of the conflicting queries, including the query text, the name for the featured results set, and the
     * identifier of the featured results set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConflictingItems(java.util.Collection)} or {@link #withConflictingItems(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param conflictingItems
     *        A list of the conflicting queries, including the query text, the name for the featured results set, and
     *        the identifier of the featured results set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsConflictException withConflictingItems(ConflictingItem... conflictingItems) {
        if (this.conflictingItems == null) {
            setConflictingItems(new java.util.ArrayList<ConflictingItem>(conflictingItems.length));
        }
        for (ConflictingItem ele : conflictingItems) {
            this.conflictingItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the conflicting queries, including the query text, the name for the featured results set, and the
     * identifier of the featured results set.
     * </p>
     * 
     * @param conflictingItems
     *        A list of the conflicting queries, including the query text, the name for the featured results set, and
     *        the identifier of the featured results set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsConflictException withConflictingItems(java.util.Collection<ConflictingItem> conflictingItems) {
        setConflictingItems(conflictingItems);
        return this;
    }

}
