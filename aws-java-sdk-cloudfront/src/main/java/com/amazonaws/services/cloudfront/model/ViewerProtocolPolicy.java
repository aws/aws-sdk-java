/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.cloudfront.model;

/**
 * 
 */
public enum ViewerProtocolPolicy {

    AllowAll("allow-all"),
    HttpsOnly("https-only"),
    RedirectToHttps("redirect-to-https");

    private String value;

    private ViewerProtocolPolicy(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return ViewerProtocolPolicy corresponding to the value
     */
    public static ViewerProtocolPolicy fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("allow-all".equals(value)) {
            return AllowAll;
        } else if ("https-only".equals(value)) {
            return HttpsOnly;
        } else if ("redirect-to-https".equals(value)) {
            return RedirectToHttps;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}