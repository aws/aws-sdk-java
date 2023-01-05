/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * PutManagedInsightRulesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutManagedInsightRulesRequestMarshaller implements Marshaller<Request<PutManagedInsightRulesRequest>, PutManagedInsightRulesRequest> {

    public Request<PutManagedInsightRulesRequest> marshall(PutManagedInsightRulesRequest putManagedInsightRulesRequest) {

        if (putManagedInsightRulesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutManagedInsightRulesRequest> request = new DefaultRequest<PutManagedInsightRulesRequest>(putManagedInsightRulesRequest, "AmazonCloudWatch");
        request.addParameter("Action", "PutManagedInsightRules");
        request.addParameter("Version", "2010-08-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (!putManagedInsightRulesRequest.getManagedRules().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ManagedRule>) putManagedInsightRulesRequest.getManagedRules()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ManagedRule> managedRulesList = (com.amazonaws.internal.SdkInternalList<ManagedRule>) putManagedInsightRulesRequest
                    .getManagedRules();
            int managedRulesListIndex = 1;

            for (ManagedRule managedRulesListValue : managedRulesList) {
                if (managedRulesListValue != null) {

                    if (managedRulesListValue.getTemplateName() != null) {
                        request.addParameter("ManagedRules.member." + managedRulesListIndex + ".TemplateName",
                                StringUtils.fromString(managedRulesListValue.getTemplateName()));
                    }

                    if (managedRulesListValue.getResourceARN() != null) {
                        request.addParameter("ManagedRules.member." + managedRulesListIndex + ".ResourceARN",
                                StringUtils.fromString(managedRulesListValue.getResourceARN()));
                    }

                    if (!managedRulesListValue.getTags().isEmpty()
                            || !((com.amazonaws.internal.SdkInternalList<Tag>) managedRulesListValue.getTags()).isAutoConstruct()) {
                        com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) managedRulesListValue.getTags();
                        int tagsListIndex = 1;

                        for (Tag tagsListValue : tagsList) {
                            if (tagsListValue != null) {

                                if (tagsListValue.getKey() != null) {
                                    request.addParameter("ManagedRules.member." + managedRulesListIndex + ".Tags.member." + tagsListIndex + ".Key",
                                            StringUtils.fromString(tagsListValue.getKey()));
                                }

                                if (tagsListValue.getValue() != null) {
                                    request.addParameter("ManagedRules.member." + managedRulesListIndex + ".Tags.member." + tagsListIndex + ".Value",
                                            StringUtils.fromString(tagsListValue.getValue()));
                                }
                            }
                            tagsListIndex++;
                        }
                    }
                }
                managedRulesListIndex++;
            }
        }

        return request;
    }

}
