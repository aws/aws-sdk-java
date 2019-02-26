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
package com.amazonaws.protocol.json;

import com.amazonaws.annotation.SdkProtectedApi;

/**
 * Factory interface for creating dependencies needed by generated marshallers for JSON services.
 *
 * @deprecated By {@link com.amazonaws.protocol.ProtocolRequestMarshaller}
 */
@Deprecated
@SdkProtectedApi
public interface SdkJsonMarshallerFactory {

    /**
     * Returns the {@link SdkJsonGenerator} to be used for marshalling the request.
     */
    StructuredJsonGenerator createGenerator();

    /**
     * @return Content type to send in requests.
     */
    String getContentType();
}
