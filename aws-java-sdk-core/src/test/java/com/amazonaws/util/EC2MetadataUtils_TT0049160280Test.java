/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import org.junit.Assert;
import org.junit.Test;

import com.amazonaws.util.EC2MetadataUtils.InstanceInfo;

public class EC2MetadataUtils_TT0049160280Test {
    private static final String JSON = "{"
            + "  \"privateIp\" : \"172.31.56.174\","
            + "  \"devpayProductCodes\" : null,"
            + "  \"availabilityZone\" : \"us-east-1b\","
            + "  \"version\" : \"2010-08-31\","
            + "  \"accountId\" : \"123456789012\","
            + "  \"instanceId\" : \"i-b32c0064\","
            + "  \"billingProducts\" : [\"bp-6ba54002\" ],"
            + "  \"imageId\" : \"ami-ac3a1cc4\","
            + "  \"instanceType\" : \"t2.small\","
            + "  \"kernelId\" : null,"
            + "  \"ramdiskId\" : null,"
            + "  \"pendingTime\" : \"2015-04-13T19:57:24Z\","
            + "  \"architecture\" : \"x86_64\","
            + "  \"region\" : \"us-east-1\""
            + "}"
            ;

    @Test
    public void getRegionIntern() throws Exception {
        String region = EC2MetadataUtils.doGetEC2InstanceRegion(JSON);
        Assert.assertEquals("us-east-1", region);
    }

    @Test
    public void tt0049160280() {
        InstanceInfo info = EC2MetadataUtils.doGetInstanceInfo(JSON);
        String[] billingProducts = info.getBillingProducts();
        Assert.assertTrue(billingProducts.length == 1);
        Assert.assertEquals(billingProducts[0], "bp-6ba54002");
    }

    @Test
    public void devProductCodes() {
        final String JSON = "{"
                + "  \"privateIp\" : \"172.31.56.174\","
                + "  \"devpayProductCodes\" : [\"foo\", \"bar\"],"
                + "  \"availabilityZone\" : \"us-east-1b\","
                + "  \"version\" : \"2010-08-31\","
                + "  \"accountId\" : \"123456789012\","
                + "  \"instanceId\" : \"i-b32c0064\","
                + "  \"billingProducts\" : [\"bp-6ba54002\" ],"
                + "  \"imageId\" : \"ami-ac3a1cc4\","
                + "  \"instanceType\" : \"t2.small\","
                + "  \"kernelId\" : null,"
                + "  \"ramdiskId\" : null,"
                + "  \"pendingTime\" : \"2015-04-13T19:57:24Z\","
                + "  \"architecture\" : \"x86_64\","
                + "  \"region\" : \"us-east-1\""
                + "}"
                ;
        InstanceInfo info = EC2MetadataUtils.doGetInstanceInfo(JSON);
        String[] devpayProductCodes = info.getDevpayProductCodes();
        Assert.assertTrue(devpayProductCodes.length == 2);
        Assert.assertEquals(devpayProductCodes[0], "foo");
        Assert.assertEquals(devpayProductCodes[1], "bar");
    }
}
