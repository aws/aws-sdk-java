/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.neptune.model.transform;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.neptune.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateDBSubnetGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBSubnetGroupRequestMarshaller implements Marshaller<Request<CreateDBSubnetGroupRequest>, CreateDBSubnetGroupRequest> {

    public Request<CreateDBSubnetGroupRequest> marshall(CreateDBSubnetGroupRequest createDBSubnetGroupRequest) {

        if (createDBSubnetGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateDBSubnetGroupRequest> request = new DefaultRequest<CreateDBSubnetGroupRequest>(createDBSubnetGroupRequest, "AmazonNeptune");
        request.addParameter("Action", "CreateDBSubnetGroup");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (createDBSubnetGroupRequest.getDBSubnetGroupName() != null) {
            request.addParameter("DBSubnetGroupName", StringUtils.fromString(createDBSubnetGroupRequest.getDBSubnetGroupName()));
        }

        if (createDBSubnetGroupRequest.getDBSubnetGroupDescription() != null) {
            request.addParameter("DBSubnetGroupDescription", StringUtils.fromString(createDBSubnetGroupRequest.getDBSubnetGroupDescription()));
        }

        if (createDBSubnetGroupRequest.getSubnetIds() != null) {
            java.util.List<String> subnetIdsList = createDBSubnetGroupRequest.getSubnetIds();
            if (subnetIdsList.isEmpty()) {
                request.addParameter("SubnetIds", "");
            } else {
                int subnetIdsListIndex = 1;

                for (String subnetIdsListValue : subnetIdsList) {
                    if (subnetIdsListValue != null) {
                        request.addParameter("SubnetIds.SubnetIdentifier." + subnetIdsListIndex, StringUtils.fromString(subnetIdsListValue));
                    }
                    subnetIdsListIndex++;
                }
            }
        }

        if (createDBSubnetGroupRequest.getTags() != null) {
            java.util.List<Tag> tagsList = createDBSubnetGroupRequest.getTags();
            if (tagsList.isEmpty()) {
                request.addParameter("Tags", "");
            } else {
                int tagsListIndex = 1;

                for (Tag tagsListValue : tagsList) {

                    if (tagsListValue.getKey() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                    }

                    if (tagsListValue.getValue() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                    }
                    tagsListIndex++;
                }
            }
        }

        return request;
    }

}
