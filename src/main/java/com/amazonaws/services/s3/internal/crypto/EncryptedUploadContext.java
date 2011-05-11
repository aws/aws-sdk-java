/*
 * Copyright 2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal.crypto;

import javax.crypto.SecretKey;

/**
 * State information for an in-progress, encrypted multipart upload,
 * including the envelope encryption key used to encrypt each individual
 * part in a multipart upload, and the next initialization vector (IV) for
 * the next part to encrypt.
 */
public class EncryptedUploadContext {
	private final String bucketName;
	private final String key;
	private final SecretKey envelopeEncryptionKey;
	
	private byte[] firstIV;
	private byte[] nextIV;
	private boolean hasFinalPartBeenSeen;

	public EncryptedUploadContext(String bucketName, String key, SecretKey envelopeEncryptionKey) {
		this.bucketName = bucketName;
		this.key = key;
		this.envelopeEncryptionKey = envelopeEncryptionKey;
	}

	public String getBucketName() {
		return bucketName;
	}

	public String getKey() {
		return key;
	}

	public SecretKey getEnvelopeEncryptionKey() {
		return envelopeEncryptionKey;
	}

	public void setNextInitializationVector(byte[] nextIV) {
		this.nextIV = nextIV;
	}

	public byte[] getNextInitializationVector() {
		return nextIV;
	}
	
	public boolean hasFinalPartBeenSeen() {
		return hasFinalPartBeenSeen;
	}
	
	public void setHasFinalPartBeenSeen(boolean hasFinalPartBeenSeen) {
		this.hasFinalPartBeenSeen = hasFinalPartBeenSeen;
	}

	public void setFirstInitializationVector(byte[] firstIV) {
		this.firstIV = firstIV;
	}

	public byte[] getFirstInitializationVector() {
		return firstIV;
	}
}