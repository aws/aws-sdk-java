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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.nullValue;

import org.junit.Test;

// See: https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html
public class ArnResourceTest {
    @Test
    public void fromString_slashForm_pathNoQualifier() {
        ArnResource arnResource = ArnResource.fromString("accesspoint/test/object/unit-01/finance/*");
        assertThat(arnResource.getResourceType(), equalTo("accesspoint"));
        assertThat(arnResource.getResource(), equalTo("test/object/unit-01/finance/*"));
        assertThat(arnResource.getQualifier(), nullValue());
    }

    @Test
    public void fromString_slashForm_pathWithQualifier() {
        ArnResource arnResource = ArnResource.fromString("accesspoint/test/object/unit-01/finance/file1:123");
        assertThat(arnResource.getResourceType(), equalTo("accesspoint"));
        assertThat(arnResource.getResource(), equalTo("test/object/unit-01/finance/file1"));
        assertThat(arnResource.getQualifier(), equalTo("123"));
    }

    @Test
    public void fromString_slashForm_pathEmptyQualifier() {
        ArnResource arnResource = ArnResource.fromString("accesspoint/test/object/unit-01/finance/*:");
        assertThat(arnResource.getResourceType(), equalTo("accesspoint"));
        assertThat(arnResource.getResource(), equalTo("test/object/unit-01/finance/*"));
        assertThat(arnResource.getQualifier(), isEmptyString());
    }

    @Test
    public void fromString_colonForm_pathNoQualifier() {
        ArnResource arnResource = ArnResource.fromString("accesspoint:test/object/unit-01/finance/*");
        assertThat(arnResource.getResourceType(), equalTo("accesspoint"));
        assertThat(arnResource.getResource(), equalTo("test/object/unit-01/finance/*"));
        assertThat(arnResource.getQualifier(), nullValue());
    }

    @Test
    public void fromString_colonForm_pathWithQualifier() {
        ArnResource arnResource = ArnResource.fromString("accesspoint:test/object/unit-01/finance/file1:123");
        assertThat(arnResource.getResourceType(), equalTo("accesspoint"));
        assertThat(arnResource.getResource(), equalTo("test/object/unit-01/finance/file1"));
        assertThat(arnResource.getQualifier(), equalTo("123"));
    }

    @Test
    public void fromString_colonForm_pathEmptyQualifier() {
        ArnResource arnResource = ArnResource.fromString("accesspoint:test/object/unit-01/finance/file1:");
        assertThat(arnResource.getResourceType(), equalTo("accesspoint"));
        assertThat(arnResource.getResource(), equalTo("test/object/unit-01/finance/file1"));
        assertThat(arnResource.getQualifier(), isEmptyString());
    }

    @Test
    public void fromString_slashForm_typeAndNameNoQualifier() {
        ArnResource arnResource = ArnResource.fromString("accesspoint/test");
        assertThat(arnResource.getResourceType(), equalTo("accesspoint"));
        assertThat(arnResource.getResource(), equalTo("test"));
        assertThat(arnResource.getQualifier(), nullValue());
    }

    @Test
    public void fromString_slashForm_typeAndNameWithQualifier() {
        ArnResource arnResource = ArnResource.fromString("accesspoint/test:123");
        assertThat(arnResource.getResourceType(), equalTo("accesspoint"));
        assertThat(arnResource.getResource(), equalTo("test"));
        assertThat(arnResource.getQualifier(), equalTo("123"));
    }

    @Test
    public void fromString_slashForm_typeAndNameEmptyQualifier() {
        ArnResource arnResource = ArnResource.fromString("accesspoint/test:");
        assertThat(arnResource.getResourceType(), equalTo("accesspoint"));
        assertThat(arnResource.getResource(), equalTo("test"));
        assertThat(arnResource.getQualifier(), isEmptyString());
    }

    @Test
    public void fromString_colonForm_typeAndNameNoQualifier() {
        ArnResource arnResource = ArnResource.fromString("accesspoint:test");
        assertThat(arnResource.getResourceType(), equalTo("accesspoint"));
        assertThat(arnResource.getResource(), equalTo("test"));
        assertThat(arnResource.getQualifier(), nullValue());
    }

    @Test
    public void fromString_colonForm_typeAndNameWithQualifier() {
        ArnResource arnResource = ArnResource.fromString("accesspoint:test:123");
        assertThat(arnResource.getResourceType(), equalTo("accesspoint"));
        assertThat(arnResource.getResource(), equalTo("test"));
        assertThat(arnResource.getQualifier(), equalTo("123"));
    }

    @Test
    public void fromString_colonForm_typeAndNameEmptyQualifier() {
        ArnResource arnResource = ArnResource.fromString("accesspoint:test:");
        assertThat(arnResource.getResourceType(), equalTo("accesspoint"));
        assertThat(arnResource.getResource(), equalTo("test"));
        assertThat(arnResource.getQualifier(), isEmptyString());
    }

    @Test
    public void fromString_nameOnly() {
        ArnResource arnResource = ArnResource.fromString("bob");
        assertThat(arnResource.getResourceType(), nullValue());
        assertThat(arnResource.getResource(), equalTo("bob"));
        assertThat(arnResource.getQualifier(), nullValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void fromString_colonForm_typeWithNoId() {
        ArnResource.fromString("bob:");
    }

    @Test(expected = IllegalArgumentException.class)
    public void fromString_slashForm_typeWithNoId() {
        ArnResource.fromString("bob/");
    }

    @Test
    public void hashCodeEquals_minimalProperties() {
        ArnResource arnResource = ArnResource.builder().withResource("resource").build();
        ArnResource anotherResource = ArnResource.builder().withResource("resource").build();
        assertThat(arnResource.equals(anotherResource), equalTo(true));
        assertThat(arnResource.hashCode(), equalTo(anotherResource.hashCode()));
    }
}
