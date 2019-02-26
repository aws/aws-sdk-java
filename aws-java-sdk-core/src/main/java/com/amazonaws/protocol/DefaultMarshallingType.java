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

package com.amazonaws.protocol;

/**
 * A base implementation for {@link MarshallingType}s that are the default marshallers for their respective types. This will
 * return "true" for {@link #isDefaultMarshallerForType(Class)} if the provided class is a subclass of this class's type.
 */
final class DefaultMarshallingType<T> implements MarshallingType<T> {
    private final Class<T> type;

    protected DefaultMarshallingType(Class<T> type) {
        this.type = type;
    }

    @Override
    public boolean isDefaultMarshallerForType(Class<?> type) {
        return this.type.isAssignableFrom(type);
    }
}
