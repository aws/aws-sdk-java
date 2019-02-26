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

import com.amazonaws.AmazonServiceException;

/**
 * Base class for all {@link ProtocolMetadataProvider}. Provides convenient default implementations
 * of certain methods to reduce duplication.
 */
public abstract class BaseProtocolMetadataProvider implements ProtocolMetadataProvider {

    /**
     * Default is false, subclasses can override to indicate they are JSON protocols.
     */
    @Override
    public boolean isJsonProtocol() {
        return false;
    }

    /**
     * Default is false, subclasses can override to indicate they are XML protocols.
     */
    @Override
    public boolean isXmlProtocol() {
        return false;
    }

    /**
     * Default is false, subclasses can override to indicate they are CBOR protocols.
     */
    @Override
    public boolean isCborProtocol() {
        return false;
    }

    /**
     * Default is false, subclasses can override to indicate they are Ion protocols.
     */
    @Override
    public boolean isIonProtocol() {
        return false;
    }

    /**
     * Content type is hardcoded for very few protocols so we return null here for convenience.
     * Subclasses may override to set an explicit content type.
     */
    @Override
    public String getContentType() {
        return null;
    }

    @Override
    public String getBaseExceptionFqcn() {
        return AmazonServiceException.class.getName();
    }

    /**
     * @return The default base request class name for AWS clients.
     */
    @Override
    public String getRequestBaseFqcn() {
        return "com.amazonaws.AmazonWebServiceRequest";
    }
}
