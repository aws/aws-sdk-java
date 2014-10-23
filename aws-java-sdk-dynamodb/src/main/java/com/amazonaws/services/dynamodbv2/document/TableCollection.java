/*
 * Copyright 2014-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.document;

import com.amazonaws.services.dynamodbv2.document.internal.PageBasedCollection;

/**
 * A collection of <code>Table</code>'s (initialized with the respective table
 * names).
 * 
 * An <code>TableCollection</code> object maintains a cursor pointing to its
 * current pages of data. Initially the cursor is positioned before the first
 * page. The next method moves the cursor to the next row, and because it
 * returns false when there are no more rows in the <code>TableCollection</code>
 * object, it can be used in a while loop to iterate through the collection.
 * 
 * Network calls can be triggered when the collection is iterated across page
 * boundaries.
 *
 * @param <R> low level result type
 */
public abstract class TableCollection<R> extends PageBasedCollection<Table,R> {
}
