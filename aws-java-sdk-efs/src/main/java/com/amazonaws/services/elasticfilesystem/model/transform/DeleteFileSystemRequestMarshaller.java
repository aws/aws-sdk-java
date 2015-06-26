/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticfilesystem.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticfilesystem.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DeleteFileSystemRequest Marshaller
 */
public class DeleteFileSystemRequestMarshaller implements
        Marshaller<Request<DeleteFileSystemRequest>, DeleteFileSystemRequest> {

    public Request<DeleteFileSystemRequest> marshall(
            DeleteFileSystemRequest deleteFileSystemRequest) {

        if (deleteFileSystemRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteFileSystemRequest> request = new DefaultRequest<DeleteFileSystemRequest>(
                deleteFileSystemRequest, "AmazonElasticFileSystem");

        request.setHttpMethod(HttpMethodName.DELETE);

        String uriResourcePath = "/2015-02-01/file-systems/{FileSystemId}";
        uriResourcePath = uriResourcePath.replace(
                "{FileSystemId}",
                (deleteFileSystemRequest.getFileSystemId() == null) ? ""
                        : StringUtils.fromString(deleteFileSystemRequest
                                .getFileSystemId()));
        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "binary/octet-stream");
        }

        return request;
    }

}
