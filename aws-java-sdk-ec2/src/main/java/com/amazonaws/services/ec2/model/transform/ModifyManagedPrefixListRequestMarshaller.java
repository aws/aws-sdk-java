/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyManagedPrefixListRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyManagedPrefixListRequestMarshaller implements Marshaller<Request<ModifyManagedPrefixListRequest>, ModifyManagedPrefixListRequest> {

    public Request<ModifyManagedPrefixListRequest> marshall(ModifyManagedPrefixListRequest modifyManagedPrefixListRequest) {

        if (modifyManagedPrefixListRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyManagedPrefixListRequest> request = new DefaultRequest<ModifyManagedPrefixListRequest>(modifyManagedPrefixListRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyManagedPrefixList");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyManagedPrefixListRequest.getPrefixListId() != null) {
            request.addParameter("PrefixListId", StringUtils.fromString(modifyManagedPrefixListRequest.getPrefixListId()));
        }

        if (modifyManagedPrefixListRequest.getCurrentVersion() != null) {
            request.addParameter("CurrentVersion", StringUtils.fromLong(modifyManagedPrefixListRequest.getCurrentVersion()));
        }

        if (modifyManagedPrefixListRequest.getPrefixListName() != null) {
            request.addParameter("PrefixListName", StringUtils.fromString(modifyManagedPrefixListRequest.getPrefixListName()));
        }

        com.amazonaws.internal.SdkInternalList<AddPrefixListEntry> modifyManagedPrefixListRequestAddEntriesList = (com.amazonaws.internal.SdkInternalList<AddPrefixListEntry>) modifyManagedPrefixListRequest
                .getAddEntries();
        if (!modifyManagedPrefixListRequestAddEntriesList.isEmpty() || !modifyManagedPrefixListRequestAddEntriesList.isAutoConstruct()) {
            int addEntriesListIndex = 1;

            for (AddPrefixListEntry modifyManagedPrefixListRequestAddEntriesListValue : modifyManagedPrefixListRequestAddEntriesList) {

                if (modifyManagedPrefixListRequestAddEntriesListValue.getCidr() != null) {
                    request.addParameter("AddEntry." + addEntriesListIndex + ".Cidr",
                            StringUtils.fromString(modifyManagedPrefixListRequestAddEntriesListValue.getCidr()));
                }

                if (modifyManagedPrefixListRequestAddEntriesListValue.getDescription() != null) {
                    request.addParameter("AddEntry." + addEntriesListIndex + ".Description",
                            StringUtils.fromString(modifyManagedPrefixListRequestAddEntriesListValue.getDescription()));
                }
                addEntriesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<RemovePrefixListEntry> modifyManagedPrefixListRequestRemoveEntriesList = (com.amazonaws.internal.SdkInternalList<RemovePrefixListEntry>) modifyManagedPrefixListRequest
                .getRemoveEntries();
        if (!modifyManagedPrefixListRequestRemoveEntriesList.isEmpty() || !modifyManagedPrefixListRequestRemoveEntriesList.isAutoConstruct()) {
            int removeEntriesListIndex = 1;

            for (RemovePrefixListEntry modifyManagedPrefixListRequestRemoveEntriesListValue : modifyManagedPrefixListRequestRemoveEntriesList) {

                if (modifyManagedPrefixListRequestRemoveEntriesListValue.getCidr() != null) {
                    request.addParameter("RemoveEntry." + removeEntriesListIndex + ".Cidr",
                            StringUtils.fromString(modifyManagedPrefixListRequestRemoveEntriesListValue.getCidr()));
                }
                removeEntriesListIndex++;
            }
        }

        return request;
    }

}
