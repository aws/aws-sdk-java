/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.PartListing;

public class ListPartsHeaderHandler implements HeaderHandler<PartListing> {

    @Override
    public void handle(PartListing result, HttpResponse response) {
        result.setAbortDate(ServiceUtils.parseRfc822Date(response.getHeaders().get(Headers.ABORT_DATE)));
        result.setAbortRuleId(response.getHeaders().get(Headers.ABORT_RULE_ID));
    }
}
