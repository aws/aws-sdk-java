/*
 * Copyright 2011-2012 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.internal;

import com.amazonaws.services.s3.Headers;


/**
 * Interface for service responses that receive the x-amz-server-side-encryption header.
 * 
 * @see Headers#SERVER_SIDE_ENCRYPTION
 */
public interface ServerSideEncryptionResult {

    /**
     * Returns the server-side encryption algorithm for the response, or null if none was used.
     */
    public String getServerSideEncryption();

    /**
     * Sets the server-side encryption algorithm for the response.
     * 
     * @param serverSideEncryption
     *            The server-side encryption algorithm for the response.
     */
    public void setServerSideEncryption(String serverSideEncryption);
    
}
