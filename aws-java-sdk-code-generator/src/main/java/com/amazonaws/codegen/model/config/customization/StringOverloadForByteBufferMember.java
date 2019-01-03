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
package com.amazonaws.codegen.model.config.customization;

import com.amazonaws.adapters.types.StringToByteBufferAdapter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Basically a facade POJO over {@link ConvenienceTypeOverload} that hides (i.e. hard codes) some
 * configuration options
 */
public class StringOverloadForByteBufferMember {

    private static final String STRING_TO_BYTE_BUFFER_ADAPTER = StringToByteBufferAdapter.class.getName();

    private final ConvenienceTypeOverload convenienceTypeOverload;

    @JsonCreator
    public StringOverloadForByteBufferMember(@JsonProperty("shapeName") String shapeName,
            @JsonProperty("memberName") String memberName) {
        convenienceTypeOverload = new ConvenienceTypeOverload().withShapeName(shapeName).withMemberName(memberName)
                .withConvenienceType("String").withTypeAdapterFqcn(STRING_TO_BYTE_BUFFER_ADAPTER);
    }

    public ConvenienceTypeOverload getConvenienceTypeOverload() {
        return convenienceTypeOverload;
    }
}
