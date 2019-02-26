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
package com.amazonaws.services.importexport.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.importexport.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * GetShippingLabelRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetShippingLabelRequestMarshaller implements Marshaller<Request<GetShippingLabelRequest>, GetShippingLabelRequest> {

    public Request<GetShippingLabelRequest> marshall(GetShippingLabelRequest getShippingLabelRequest) {

        if (getShippingLabelRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetShippingLabelRequest> request = new DefaultRequest<GetShippingLabelRequest>(getShippingLabelRequest, "AmazonImportExport");
        request.addParameter("Action", "GetShippingLabel");
        request.addParameter("Version", "2010-06-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (!getShippingLabelRequest.getJobIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) getShippingLabelRequest.getJobIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> jobIdsList = (com.amazonaws.internal.SdkInternalList<String>) getShippingLabelRequest.getJobIds();
            int jobIdsListIndex = 1;

            for (String jobIdsListValue : jobIdsList) {
                if (jobIdsListValue != null) {
                    request.addParameter("jobIds.member." + jobIdsListIndex, StringUtils.fromString(jobIdsListValue));
                }
                jobIdsListIndex++;
            }
        }

        if (getShippingLabelRequest.getName() != null) {
            request.addParameter("name", StringUtils.fromString(getShippingLabelRequest.getName()));
        }

        if (getShippingLabelRequest.getCompany() != null) {
            request.addParameter("company", StringUtils.fromString(getShippingLabelRequest.getCompany()));
        }

        if (getShippingLabelRequest.getPhoneNumber() != null) {
            request.addParameter("phoneNumber", StringUtils.fromString(getShippingLabelRequest.getPhoneNumber()));
        }

        if (getShippingLabelRequest.getCountry() != null) {
            request.addParameter("country", StringUtils.fromString(getShippingLabelRequest.getCountry()));
        }

        if (getShippingLabelRequest.getStateOrProvince() != null) {
            request.addParameter("stateOrProvince", StringUtils.fromString(getShippingLabelRequest.getStateOrProvince()));
        }

        if (getShippingLabelRequest.getCity() != null) {
            request.addParameter("city", StringUtils.fromString(getShippingLabelRequest.getCity()));
        }

        if (getShippingLabelRequest.getPostalCode() != null) {
            request.addParameter("postalCode", StringUtils.fromString(getShippingLabelRequest.getPostalCode()));
        }

        if (getShippingLabelRequest.getStreet1() != null) {
            request.addParameter("street1", StringUtils.fromString(getShippingLabelRequest.getStreet1()));
        }

        if (getShippingLabelRequest.getStreet2() != null) {
            request.addParameter("street2", StringUtils.fromString(getShippingLabelRequest.getStreet2()));
        }

        if (getShippingLabelRequest.getStreet3() != null) {
            request.addParameter("street3", StringUtils.fromString(getShippingLabelRequest.getStreet3()));
        }

        if (getShippingLabelRequest.getAPIVersion() != null) {
            request.addParameter("APIVersion", StringUtils.fromString(getShippingLabelRequest.getAPIVersion()));
        }

        return request;
    }

}
