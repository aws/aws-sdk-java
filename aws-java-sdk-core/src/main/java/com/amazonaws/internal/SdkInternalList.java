/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.internal;

import java.util.ArrayList;
import java.util.Collection;

/**
 * List with auto construct flag to indicate whether it is auto constructed by
 * Java SDK.
 */
public class SdkInternalList<T> extends ArrayList<T> {

    private static final long serialVersionUID = 1L;

    /**
    * Auto construct flag to indicate whether the list is auto constructed by
    * Java SDK.
    */
    private final boolean autoConstruct;

    public SdkInternalList() {
        super();
        autoConstruct = true;
    }

    public SdkInternalList(Collection<? extends T> c) {
        super(c);
        autoConstruct = false;
    }

    public SdkInternalList(int initialCapacity) {
        super(initialCapacity);
        autoConstruct = false;
    }

    /**
    * Return true if the list is auto constructed by Java SDK
    */
    public boolean isAutoConstruct() {
        return autoConstruct;
    }

}
