/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.internal.config;

/**
 * An internal class used to build {@link SignerConfig} after this
 * class per se has been unmarshalled from JSON. This class allows us to make
 * use of Jackson without the need to write any special parser or json
 * marshaller/unmarshaller.
 */
class SignerConfigJsonHelper implements Builder<SignerConfig> {
    private String signerType;
    private boolean doubleUrlEncode;

    SignerConfigJsonHelper(SignerType signerType, boolean doubleUrlEncode) {
        this.signerType = signerType.name();
        this.doubleUrlEncode = doubleUrlEncode;
    }

    SignerConfigJsonHelper(SignerType signerType) {
        this(signerType, false);
    }

    SignerConfigJsonHelper() {}

    public String getSignerType() {
        return signerType;
    }

    public boolean isDoubleUrlEncode() {
        return doubleUrlEncode;
    }

    void setSignerType(String signerType) {
        this.signerType = signerType;
    }

    void setDoubleUrlEncode(boolean doubleUrlEncode) {
        this.doubleUrlEncode = doubleUrlEncode;
    }

    @Override public SignerConfig build() {
        SignerType signerType = SignerType.valueOf(this.signerType);
        return new SignerConfig(signerType, doubleUrlEncode);
    }
}