/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.arn;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ArnTest {

    @Test
    public void arnWithBasicResource_ParsesCorrectly() {
        String arnString = "arn:aws:s3:us-east-1:12345678910:myresource";
        Arn arn = Arn.fromString(arnString);
        assertThat(arn.getPartition(), equalTo("aws"));
        assertThat(arn.getService(), equalTo("s3"));
        assertThat(arn.getRegion(), equalTo("us-east-1"));
        assertThat(arn.getAccountId(), equalTo("12345678910"));
        assertThat(arn.getResourceAsString(), equalTo("myresource"));
    }

    @Test
    public void arn_ParsesBackToString() {
        String arnString = "arn:aws:s3:us-east-1:12345678910:myresource";
        Arn arn = Arn.fromString(arnString);
        assertThat(arn.toString(), equalTo(arnString));
    }

    @Test
    public void arnWithQualifiedResource_ParsesBackToString() {
        String arnString = "arn:aws:s3:us-east-1:12345678910:myresource:finks:1";
        Arn arn = Arn.fromString(arnString);
        assertThat(arn.toString(), equalTo(arnString));
        assertThat(arn.getResource().toString(), equalTo("myresource:finks:1"));
    }

    @Test
    public void arnWithResourceTypeAndResource_ParsesCorrectly() {
        String arnString = "arn:aws:s3:us-east-1:12345678910:bucket:finks";
        Arn arn = Arn.fromString(arnString);
        assertThat(arn.getPartition(), equalTo("aws"));
        assertThat(arn.getService(), equalTo("s3"));
        assertThat(arn.getRegion(), equalTo("us-east-1"));
        assertThat(arn.getResourceAsString(), equalTo("bucket:finks"));
        assertThat(arn.getResource().getResource(), equalTo("finks"));
        assertThat(arn.getResource().getResourceType(), equalTo("bucket"));
    }
    @Test
    public void arnWithResourceTypeAndResourceAndQualifier_ParsesCorrectly() {
        String arnString = "arn:aws:s3:us-east-1:12345678910:bucket:finks:1";
        Arn arn = Arn.fromString(arnString);
        assertThat(arn.getPartition(), equalTo("aws"));
        assertThat(arn.getService(), equalTo("s3"));
        assertThat(arn.getRegion(), equalTo("us-east-1"));
        assertThat(arn.getResourceAsString(), equalTo("bucket:finks:1"));
        assertThat(arn.getResource().getResource(), equalTo("finks"));
        assertThat(arn.getResource().getResourceType(), equalTo("bucket"));
        assertThat(arn.getResource().getQualifier(), equalTo("1"));
    }

    @Test
    public void arnWithResourceTypeAndResource_SlashSplitter_ParsesCorrectly() {
        String arnString = "arn:aws:s3:us-east-1:12345678910:bucket/finks";
        Arn arn = Arn.fromString(arnString);
        assertThat(arn.getPartition(), equalTo("aws"));
        assertThat(arn.getService(), equalTo("s3"));
        assertThat(arn.getRegion(), equalTo("us-east-1"));
        assertThat(arn.getResourceAsString(), equalTo("bucket/finks"));
        assertThat(arn.getResource().getResource(), equalTo("finks"));
        assertThat(arn.getResource().getResourceType(), equalTo("bucket"));
    }
    @Test
    public void arnWithResourceTypeAndResourceAndQualifier_SlashSplitter_ParsesCorrectly() {
        String arnString = "arn:aws:s3:us-east-1:12345678910:bucket/finks/1";
        Arn arn = Arn.fromString(arnString);
        assertThat(arn.getPartition(), equalTo("aws"));
        assertThat(arn.getService(), equalTo("s3"));
        assertThat(arn.getRegion(), equalTo("us-east-1"));
        assertThat(arn.getResourceAsString(), equalTo("bucket/finks/1"));
        assertThat(arn.getResource().getResource(), equalTo("finks"));
        assertThat(arn.getResource().getResourceType(), equalTo("bucket"));
        assertThat(arn.getResource().getQualifier(), equalTo("1"));
    }

    @Test
    public void oneArnEqualsEquivalentArn() {
        String arnString = "arn:aws:s3:us-east-1:12345678910:myresource:finks";
        Arn arn1 = Arn.fromString(arnString);
        Arn arn2 = Arn.fromString(arnString);
        assertThat(arn1.equals(arn2), equalTo(true));
        assertThat(arn1.getResource().equals(arn2.getResource()), equalTo(true));
    }

    @Test
    public void hashCodeEquals_minimalProperties() {
        Arn arn = Arn.builder()
                     .withPartition("aws")
                     .withService("foobar")
                     .withResource("resource")
                     .build();
        Arn anotherArn = arn.toBuilder().build();
        assertThat(arn.equals(anotherArn), equalTo(true));
        assertThat(arn.hashCode(), equalTo(anotherArn.hashCode()));
    }

    @Test
    public void arnFromBuilder_ParsesCorrectly() {
        Arn arn = Arn.builder()
                     .withPartition("aws")
                     .withService("s3")
                     .withRegion("us-east-1")
                     .withAccountId("123456789012")
                     .withResource("bucket:finks:1")
                     .build();

        assertThat(arn.getPartition(), equalTo("aws"));
        assertThat(arn.getService(), equalTo("s3"));
        assertThat(arn.getRegion(), equalTo("us-east-1"));
        assertThat(arn.getAccountId(), equalTo("123456789012"));
        assertThat(arn.getResourceAsString(), equalTo("bucket:finks:1"));
        assertThat(arn.getResource().getResource(), equalTo("finks"));
        assertThat(arn.getResource().getResourceType(), equalTo("bucket"));
        assertThat(arn.getResource().getQualifier(), equalTo("1"));
    }

    @Test
    public void arnResourceWithColonAndSlash_ParsesOnFirstSplitter() {
        Arn arn = Arn.builder()
                     .withPartition("aws")
                     .withService("s3")
                     .withRegion("us-east-1")
                     .withAccountId("123456789012")
                     .withResource("object:finks/myobjectname:1")
                     .build();

        assertThat(arn.getPartition(), equalTo("aws"));
        assertThat(arn.getService(), equalTo("s3"));
        assertThat(arn.getRegion(), equalTo("us-east-1"));
        assertThat(arn.getAccountId(), equalTo("123456789012"));
        assertThat(arn.getResourceAsString(), equalTo("object:finks/myobjectname:1"));
        assertThat(arn.getResource().getResource(), equalTo("finks/myobjectname"));
        assertThat(arn.getResource().getResourceType(), equalTo("object"));
        assertThat(arn.getResource().getQualifier(), equalTo("1"));
    }

    @Test
    public void toBuilder() {
        Arn arn1 = Arn.builder()
                     .withPartition("aws")
                     .withService("s3")
                     .withRegion("us-east-1")
                     .withAccountId("123456789012")
                     .withResource("bucket:finks:1")
                     .build();

        Arn arn2 = arn1.toBuilder().build();

        assertThat(arn1, is(arn2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void arnWithoutPartition_ThrowsIllegalArgumentException() {
        String arnString = "arn::s3:us-east-1:12345678910:myresource";
        Arn arn = Arn.fromString(arnString);
    }

    @Test(expected = IllegalArgumentException.class)
    public void arnWithoutService_ThrowsIllegalArgumentException() {
        String arnString = "arn:aws::us-east-1:12345678910:myresource";
        Arn arn = Arn.fromString(arnString);
    }

    @Test(expected = IllegalArgumentException.class)
    public void arnWithoutResource_ThrowsIllegalArgumentException() {
        String arnString = "arn:aws:s3:us-east-1:12345678910:";
        Arn arn = Arn.fromString(arnString);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidArn_ThrowsIllegalArgumentException() {
        String arnString = "arn:aws:";
        Arn arn = Arn.fromString(arnString);
    }

    @Test(expected = IllegalArgumentException.class)
    public void arnDoesntStartWithArn_ThrowsIllegalArgumentException() {
        String arnString = "fakearn:aws:";
        Arn arn = Arn.fromString(arnString);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidArnWithoutPartition_ThrowsIllegalArgumentException() {
        String arnString = "arn:";
        Arn arn = Arn.fromString(arnString);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidArnWithoutService_ThrowsIllegalArgumentException() {
        String arnString = "arn:aws:";
        Arn arn = Arn.fromString(arnString);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidArnWithoutRegion_ThrowsIllegalArgumentException() {
        String arnString = "arn:aws:s3:";
        Arn arn = Arn.fromString(arnString);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidArnWithoutAccountId_ThrowsIllegalArgumentException() {
        String arnString = "arn:aws:s3:us-east-1:";
        Arn arn = Arn.fromString(arnString);
    }
}
