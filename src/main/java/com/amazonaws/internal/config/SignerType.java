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

import java.lang.reflect.Constructor;

import com.amazonaws.auth.Signer;
import com.amazonaws.util.ClassLoaderHelper;

/**
 * Internal signer types.
 */
public enum SignerType {
    AWS3SignerType {
        @Override public Signer createSigner() {
            return new com.amazonaws.auth.AWS3Signer();
        }
    },
    AWS4SignerType {
        @Override public Signer createV4Signer(boolean doubleUrlEncode) {
            Class<?>[] paramTypes = { boolean.class };
            return createSignerWith(fqcn, paramTypes, doubleUrlEncode);
        }
    },
    CloudFrontSignerType,
    QueryStringSignerType {
        @Override public Signer createSigner() {
            return new com.amazonaws.auth.QueryStringSigner();
        }
    },

// TO DELETE
//    S3QueryStringSigner(_.S3_SIGNER_PACKAGE) {
//        @Override public Signer createSigner() {
//            throw new UnsupportedOperationException();
//        }
//        @Override
//        public Signer createS3QueryStringSigner(String httpVerb,
//                String resourcePath, Date expiration) {
//            Class<?>[] paramTypes = { String.class, String.class, Date.class };
//            return createSignerWith(fqcn, paramTypes, httpVerb, resourcePath,
//                    expiration);
//        }
//    },
    S3SignerType(_.S3_SIGNER_PACKAGE) {
        @Override public Signer createSigner() {
            throw new UnsupportedOperationException();
        }
        @Override
        public Signer createS3Signer(String httpVerb, String resourcePath) {
            Class<?>[] paramTypes = { String.class, String.class };
            return createSignerWith(fqcn, paramTypes, httpVerb, resourcePath );
        }
    },
    AWSS3V4SignerType
    ;

    /**
     * Fully qualified class name of the signer implementation.
     */
    final String fqcn;

    private SignerType() {
        this.fqcn = _.SIGNER_DEFAULT_PACKAGE.getName() + "." + nameWithoutType();
    }

    private String nameWithoutType() {
        String name = name();
        return name.substring(0, name.length()-4);
    }

    private SignerType(String packageName) {
        this.fqcn = packageName + "." + nameWithoutType();
    }

    Signer createSigner() {
        try {
            Class<?> c = ClassLoaderHelper.loadClass(fqcn, Signer.class);
            return (Signer)c.newInstance();
        } catch(Exception e) {
            throw toRuntimeException(e);
        }
    }

    Signer createV4Signer(boolean doubleUrlEncode) {
        throw new UnsupportedOperationException();
    }

//    public Signer createS3QueryStringSigner(String httpVerb,
//            String resourcePath, Date expiration) {
//        throw new UnsupportedOperationException();
//    }

    Signer createS3Signer(String httpVerb, String resourcePath) {
        throw new UnsupportedOperationException();
    }

    private static Signer createSignerWith(String fqcn,
            Class<?>[] ctorParamTypes, Object... ctorParams) {
        try {
            Class<?> c = ClassLoaderHelper.loadClass(fqcn, Signer.class);
            Constructor<?> ctor = c.getConstructor(ctorParamTypes);
            return (Signer)ctor.newInstance(ctorParams);
        } catch (Exception e) {
            throw toRuntimeException(e);
        }
    }
    
    private static RuntimeException toRuntimeException(Exception e) {
        return e instanceof RuntimeException ? (RuntimeException) e
                : new IllegalStateException(e);
    }

    private static class _ {
        private static final Package SIGNER_DEFAULT_PACKAGE = 
            Signer.class.getPackage();
        private static final String S3_SIGNER_PACKAGE = 
            "com.amazonaws.services.s3.internal";
    }
}