/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.util;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;

public class PropertyNamingStrategyTest {

    private ObjectMapper mapper = Mockito.mock(ObjectMapper.class);

    @Test
    public void testHappyCase() {
        PropertyNamingStrategyUtils.configureUpperCamelCase(mapper);
        Mockito.verify(mapper).setPropertyNamingStrategy(PropertyNamingStrategies.UPPER_CAMEL_CASE);
    }

    @Test
    public void testLinkageError() {
        Mockito.when(mapper.setPropertyNamingStrategy(PropertyNamingStrategies.UPPER_CAMEL_CASE)).thenThrow(new LinkageError());
        PropertyNamingStrategyUtils.configureUpperCamelCase(mapper);
        Mockito.verify(mapper).setPropertyNamingStrategy(PropertyNamingStrategies.UPPER_CAMEL_CASE);
        Mockito.verify(mapper).setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
    }

    @Test(expected=NullPointerException.class)
    public void nullStrategyNamesThrowsNPE() throws Exception {
        PropertyNamingStrategyUtils.getLegacyStrategy(new Exception(), null);
    }

    @Test(expected=NullPointerException.class)
    public void nullThrowableThrowsNPE() throws Exception {
        PropertyNamingStrategyUtils.getLegacyStrategy(null, "UNKNOWN_STRAT");
    }

    @Test
    public void testLegacyStrategyNotFound() throws Exception {
        final Exception e = new Exception();
        PropertyNamingStrategyUtils.getLegacyStrategy(e, "UNKNOWN_STRAT");
        Assert.assertEquals(NoSuchFieldException.class, e.getSuppressed()[0].getClass());
    }
}

