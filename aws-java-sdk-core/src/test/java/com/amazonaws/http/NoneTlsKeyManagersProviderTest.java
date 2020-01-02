/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.http;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import org.junit.Test;

public class NoneTlsKeyManagersProviderTest {
    @Test
    public void getKeyManagers_returnsNull() {
        assertThat(NoneTlsKeyManagersProvider.getInstance().getKeyManagers(), nullValue());
    }

    @Test
    public void getInstance_returnsSingletonInstance() {
        NoneTlsKeyManagersProvider instance1 = NoneTlsKeyManagersProvider.getInstance();
        NoneTlsKeyManagersProvider instance2 = NoneTlsKeyManagersProvider.getInstance();
        assertThat(instance1 == instance2, equalTo(true));
    }
}
