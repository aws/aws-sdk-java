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
package com.amazonaws.transform;

import org.w3c.dom.Node;

import com.amazonaws.ResponseMetadata;
import com.amazonaws.util.XpathUtils;

/**
 * Xpath Unmarshaller implementation to pull the response metadata (ex: AWS
 * request ID) out of a service's response.
 * 
 * @param <T>
 *            The result type associated with the response.
 */
public class ResponseMetadataUnmarshaller<T> implements Unmarshaller<ResponseMetadata<T>, Node> {
    
    /** The Xpath location of the AWS request ID in a service's response */
    private String requestIdXpath = STANDARD_REQUEST_ID_XPATH;

    /**
     * The standard AWS request ID location. For the majority of AWS services,
     * the AWS request ID will always be in this location in the response. Some
     * services (i.e. Amazon EC2) use a non-standard location.
     */
    private final static String STANDARD_REQUEST_ID_XPATH = "ResponseMetadata/RequestId";

    /**
     * Sets the Xpath location for pulling out the AWS request ID from the
     * response metadata. This method should only be needed when dealing with
     * responses from services that store response metadata in a non-standard
     * location (i.e. Amazon EC2).
     * 
     * @param requestIdPath
     *            The Xpath location for pulling out the AWS request ID.
     */
    public void setRequestIdPath(String requestIdPath) {
        requestIdXpath = requestIdPath;
    }
    
    /**
     * @see com.amazonaws.transform.Unmarshaller#unmarshall(java.lang.Object)
     */
    public ResponseMetadata<T> unmarshall(Node in) throws Exception {
        Node rootNode = in.getFirstChild();
        String requestId = XpathUtils.asString(requestIdXpath, rootNode);

        if (requestId == null || requestId.length() == 0) {
            return null;
        }
        
        ResponseMetadata<T> metadata = new ResponseMetadata<T>();
        metadata.setRequestId(requestId);
        return metadata;
    }

}
