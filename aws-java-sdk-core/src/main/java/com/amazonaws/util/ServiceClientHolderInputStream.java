/*
 * Copyright 2011-2019 Amazon Technologies, Inc.
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
package com.amazonaws.util;

import java.io.InputStream;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.internal.SdkFilterInputStream;

/**
 * This wrapper input stream holds a reference to the service client. This is
 * mainly done to avoid the AmazonWebServiceClient object being garbage
 * collected when the client reads data from the input stream.
 * 
 */
public class ServiceClientHolderInputStream extends SdkFilterInputStream {

	
	@SuppressWarnings("unused")
	private AmazonWebServiceClient client;

	public ServiceClientHolderInputStream(InputStream in,
			AmazonWebServiceClient client) {
		super(in);
		this.client = client;
	}	
}
