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

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkProtectedApi;

/**
 * Interface used by generated marshallers to marshall a Java POJO.
 */
@SdkProtectedApi
public interface ProtocolMarshaller {

    /**
     * Marshalls the value into the appropriate location based on the {@link MarshallingInfo} metadata.
     *
     * @param val             Value to marshall. May be null if the location allows it (for example, members bound to the path
     *                        must never be null or empty).
     * @param marshallingInfo Metadata about how and where to marshall the data. Must not be null.
     * @throws com.amazonaws.SdkClientException If invalid parameters or combination of parameters are provided (I.E. null value
     *                                          provided for member bound to the path).
     */
    <T> void marshall(T val, MarshallingInfo<T> marshallingInfo) throws SdkClientException;

}
