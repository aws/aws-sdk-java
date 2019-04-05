/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.adapters.types;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.util.StringInputStream;

@SdkProtectedApi
public class StringToInputStreamAdapter implements TypeAdapter<String, InputStream> {

    @Override
    public InputStream adapt(String source) {
        if (source == null) {
            return null;
        }
        try {
            return new StringInputStream(source);
        } catch (UnsupportedEncodingException e) {
            throw new SdkClientException(e);
        }
    }
}
