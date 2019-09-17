/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.codegen.model.service;

import com.amazonaws.util.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class to process the hostPrefix value in the {@link EndpointTrait} class.
 * This is used during client generation.
 */
public final class HostPrefixProcessor {
    /**
     * Pattern to retrieve the content between the curly braces
     */
    private static final String CURLY_BRACES_PATTERN = "\\{([^}]+)}";

    private static final Pattern PATTERN = Pattern.compile(CURLY_BRACES_PATTERN);

    /**
     * This is the same as the {@link EndpointTrait#hostPrefix} expression with labels replaced by "%s"
     *
     * For example, if expression in host trait is "{Bucket}-{AccountId}-", then
     * hostWithStringSpecifier will be "%s-%s-"
     */
    private String hostWithStringSpecifier;

    /**
     * The list of member c2j names in input shape that are referenced in the host expression.
     *
     * For example, if expression in host trait is "{Bucket}-{AccountId}-", then the
     * list would contain [Bucket, AccountId].
     */
    private List<String> c2jNames;

    public HostPrefixProcessor(String hostExpression) {
        this.hostWithStringSpecifier = hostExpression;
        this.c2jNames = new ArrayList<>();
        replaceHostLabelsWithStringSpecifier(hostExpression);
    }

    /**
     * Replace all the labels in host with %s symbols and collect the input shape member names into a list
     */
    private void replaceHostLabelsWithStringSpecifier(String hostExpression) {
        if (StringUtils.isNullOrEmpty(hostExpression)) {
            throw new IllegalArgumentException("Given host prefix is either null or empty");
        }

        Matcher matcher = PATTERN.matcher(hostExpression);

        while (matcher.find()) {
            String matched = matcher.group(1);
            c2jNames.add(matched);
            hostWithStringSpecifier = hostWithStringSpecifier.replaceFirst("\\{" + matched + "}", "%s");
        }
    }

    public String getHostWithStringSpecifier() {
        return hostWithStringSpecifier;
    }

    public List<String> getC2jNames() {
        return c2jNames;
    }
}