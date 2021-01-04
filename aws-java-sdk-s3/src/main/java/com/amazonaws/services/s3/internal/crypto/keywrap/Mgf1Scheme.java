/*
 * Copyright 2020-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal.crypto.keywrap;

import java.security.spec.MGF1ParameterSpec;

public enum Mgf1Scheme {
    MGF1_SHA1("SHA-1"),
    MGF1_SHA256("SHA-256");

    private final String mgf1ParameterSpec;

    Mgf1Scheme(String mgf1ParameterSpec) {
        this.mgf1ParameterSpec = mgf1ParameterSpec;
    }

    public MGF1ParameterSpec getMgf1ParameterSpec() {
        return new MGF1ParameterSpec(mgf1ParameterSpec);
    }
}
