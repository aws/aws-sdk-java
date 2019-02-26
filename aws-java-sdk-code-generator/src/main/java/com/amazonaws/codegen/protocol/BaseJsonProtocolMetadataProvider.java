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
package com.amazonaws.codegen.protocol;

/**
 * Base class for all JSON based protocols. This includes {@link AwsCborProtocolMetadataProvider}.
 */
public abstract class BaseJsonProtocolMetadataProvider extends BaseProtocolMetadataProvider {

    @Override
    public boolean isJsonProtocol() {
        return true;
    }

    @Override
    public String getUnmarshallerContextClassName() {
        return "JsonUnmarshallerContext";
    }

    @Override
    public String getUnmarshallerClassSuffix() {
        return "JsonUnmarshaller";
    }

    /**
     * @return Exception unmarshaller is generic in JSON based protocols and completely encapsulated
     * from the client.
     */
    @Override
    public String getExceptionUnmarshallerImpl() {
        return null;
    }

    @Override
    public String getProtocolFactoryImplFqcn() {
        return "com.amazonaws.protocol.json.SdkJsonProtocolFactory";
    }
}
