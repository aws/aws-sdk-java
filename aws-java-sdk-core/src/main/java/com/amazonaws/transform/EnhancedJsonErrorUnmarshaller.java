/*
 * Copyright (c) 2019. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * A JSON error unmarshaller that can unmarshall from a {@link JsonUnmarshallerContext} instead of a {@code JsonNode}.
 */
@SdkInternalApi
public abstract class EnhancedJsonErrorUnmarshaller extends JsonErrorUnmarshaller {
    /**
     * @param exceptionClass   Exception class this unmarshaller will attempt to deserialize error response into
     * @param handledErrorCode AWS error code that this unmarshaller handles. Pass null to handle all exceptions
     */
    public EnhancedJsonErrorUnmarshaller(Class<? extends AmazonServiceException> exceptionClass, String handledErrorCode) {
        super(exceptionClass, handledErrorCode);
    }

    public abstract AmazonServiceException unmarshallFromContext(JsonUnmarshallerContext context) throws Exception;
}
