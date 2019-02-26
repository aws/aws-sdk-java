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
package utils.builder;

import com.amazonaws.client.builder.ExecutorFactory;

import java.util.concurrent.ExecutorService;

/**
 * Mock {@link ExecutorFactory} that just returns the same executor every time.
 */
public class StaticExecutorFactory implements ExecutorFactory {

    private final ExecutorService executorService;

    public StaticExecutorFactory(ExecutorService executorService) {
        this.executorService = executorService;
    }

    @Override
    public ExecutorService newExecutor() {
        return executorService;
    }
}
