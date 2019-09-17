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
package com.amazonaws.protocol.json.internal;

import com.amazonaws.Request;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.protocol.MarshallingInfo;
import com.amazonaws.protocol.ProtocolRequestMarshaller;

/**
 * AWS services expect an empty body when the payload member is null instead of an explicit JSON null.
 * This implementation can be removed once CR-6541513 has been deployed to all services that use the payload trait.
 *
 * @param <OrigRequest> Type of the original request object.
 */
@SdkInternalApi
public class NullAsEmptyBodyProtocolRequestMarshaller<OrigRequest> implements ProtocolRequestMarshaller<OrigRequest> {

    private final ProtocolRequestMarshaller<OrigRequest> delegate;

    public NullAsEmptyBodyProtocolRequestMarshaller(ProtocolRequestMarshaller<OrigRequest> delegate) {
        this.delegate = delegate;
    }

    @Override
    public void startMarshalling() {
        delegate.startMarshalling();
    }

    @Override
    public <V> void marshall(V val, MarshallingInfo<V> marshallingInfo) {
        // If the payload member is null then don't marshall it (since it will become an explicit null)
        if (marshallingInfo.isExplicitPayloadMember() && val == null) {
            return;
        }
        delegate.marshall(val, marshallingInfo);
    }

    @Override
    public Request<OrigRequest> finishMarshalling() {
        return delegate.finishMarshalling();
    }
}
