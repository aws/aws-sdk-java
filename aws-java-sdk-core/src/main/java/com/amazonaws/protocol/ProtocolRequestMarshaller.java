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

import com.amazonaws.Request;
import com.amazonaws.annotation.SdkProtectedApi;

/**
 * Interface used by generated marshallers to transform a Java POJO in a {@link Request} object which represents an HTTP request.
 *
 * <p><b>Example Usage:</b></p>
 * <pre>
 * {@code
 * ProtocolRequestMarshaller<FooRequest> = createProtocolMarshaller(...);
 * protocolMarshaller.startMarshalling();
 * protocolMarshaller.marshall(obj, marshallingInfo);
 * Request<FooRequest> marshalledRequest = protocolMarshaller.finishMarshalling();
 * }
 * </pre>
 *
 * @param <OrigRequest> Type of the original request object.
 */
@SdkProtectedApi
public interface ProtocolRequestMarshaller<OrigRequest> extends ProtocolMarshaller {

    /**
     * Hook to perform an initialization that needs to happen at the start of marshalling. Must be called before
     * any call to {@link #marshall(Object, MarshallingInfo)}.
     */
    void startMarshalling();

    /**
     * Finializes the marshalling and produces a {@link Request} object that can be sent for execution. Must be the last
     * method called in the marshaller.
     *
     * @return Marshalled {@link Request} object.
     */
    Request<OrigRequest> finishMarshalling();

}
