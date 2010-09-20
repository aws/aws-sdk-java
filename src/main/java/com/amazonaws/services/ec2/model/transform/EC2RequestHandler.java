/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import org.apache.commons.codec.binary.Base64;

import com.amazonaws.Request;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.services.ec2.model.ImportKeyPairRequest;

public class EC2RequestHandler implements RequestHandler {
    public <T> Request<T> handleRequest(Request<T> request) {
        if (request.getOriginalRequest() instanceof ImportKeyPairRequest) {
            String publicKeyMaterial = request.getParameters().get("PublicKeyMaterial"); 
            String encodedKeyMaterial = new String(Base64.encodeBase64(publicKeyMaterial.getBytes()));
            request.getParameters().put("PublicKeyMaterial", encodedKeyMaterial);
        }
        return request;
    }
}
