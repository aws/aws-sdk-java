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
package com.amazonaws.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.ThreadSafe;
import java.lang.reflect.Constructor;

@SdkInternalApi
@ThreadSafe
public final class JsonBaseExceptionUnmarshaller<T extends AmazonServiceException> extends JsonErrorUnmarshaller<T> {
    private final Class<T> exceptionClass;

    public JsonBaseExceptionUnmarshaller(Class<T> exceptionClass) {
        super(null);
        this.exceptionClass = exceptionClass;
    }

    @Override
    public T unmarshall(JsonUnmarshallerContext in) throws Exception {
        Constructor<T> ctor = exceptionClass.getConstructor(String.class);
        ctor.setAccessible(true);
        return ctor.newInstance(new Object[]{ null });
    }
}
