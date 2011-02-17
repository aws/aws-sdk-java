/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.auth.AWSCredentials;

/**
 * Base class for all user facing web service request objects.
 */
public abstract class AmazonWebServiceRequest {

    /**
     * The optional credentials to use for this request - overrides the
     * default credentials set at the client level.
     */
	private AWSCredentials credentials;


	/**
	 * Sets the optional credentials to use for this request, overriding the
	 * default credentials set at the client level.
	 *
	 * @param credentials
	 *            The optional AWS security credentials to use for this request,
	 *            overriding the default credentials set at the client level.
	 */
    public void setRequestCredentials(AWSCredentials credentials) {
		this.credentials = credentials;
    }

	/**
	 * Returns the optional credentials to use to sign this request, overriding
	 * the default credentials set at the client level.
	 *
	 * @return The optional credentials to use to sign this request, overriding
	 *         the default credentials set at the client level.
	 */
    public AWSCredentials getRequestCredentials() {
    	return credentials;
    }


    /**
     * Internal only method for accessing private, internal request parameters.
     * Not intended for direct use by callers.
     *
     * @return private, internal request parameter information.
     */
    public Map<String, String> copyPrivateRequestParameters() {
        return new HashMap<String, String>();
    }

}
