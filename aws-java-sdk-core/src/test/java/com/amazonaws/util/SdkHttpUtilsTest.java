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

import org.junit.*;

public class SdkHttpUtilsTest {
    @Test
    public void testEncodeNull() {
        Assert.assertEquals("urlEncode(null) returned something unexpected",
                            "",
                            SdkHttpUtils.urlEncode(null, false));
    }

    @Test
    public void testEncodeEmptyString() {
        Assert.assertEquals("urlEncode(\"\") returned something unexpected",
                            "",
                            SdkHttpUtils.urlEncode("", false));
    }

    @Test
    public void testNoEncoding() {
        // The un-reserved characters according to RFC 3986
        String test =
            "abcdefghijklmnopqrstuvwxyz"
            + "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "0123456789"
            + "-_.~";

        Assert.assertEquals("urlEncode(\"" + test + "\") returned something "
                            + "unexpected",
                            test,
                            SdkHttpUtils.urlEncode(test, false));
    }

    @Test
    public void testNoEncodingPath() {
        // The un-reserved characters according to RFC 3986, with the addition
        // of '/' - in path mode, we allow this through unencoded.

        String test =
            "abcdefghijklmnopqrstuvwxyz"
            + "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "0123456789"
            + "-_.~/";

        Assert.assertEquals("urlEncode(\"" + test + "\") returned something "
                            + "unexpected",
                            test,
                            SdkHttpUtils.urlEncode(test, true));
    }

    @Test
    public void testEncoding() {
        // The other ASCII printable characters, which should be encoded.
        String test =
            "\t\n\r "
            + "!\"#$"
            + "%&'("
            + ")*+,"
            + "/:;<"
            + "=>?@"
            + "[\\]^"
            + "`{|}";

        String expected =
            "%09%0A%0D%20"    // \t \n \r  <space>
            + "%21%22%23%24"  //  !  "  #  $
            + "%25%26%27%28"  //  %  &  '  (
            + "%29%2A%2B%2C"  //  )  *  +  ,
            + "%2F%3A%3B%3C"  //  /  :  ;  <
            + "%3D%3E%3F%40"  //  =  >  ?  @
            + "%5B%5C%5D%5E"  //  [  \  ]  ^
            + "%60%7B%7C%7D"; //  `  {  |  }

        Assert.assertEquals("urlEncode(\"" + test + "\") returned something "
                            + "unexpected",
                            expected,
                            SdkHttpUtils.urlEncode(test, false));
    }

    @Test
    public void testAppendUriNoPath() {
        String host = "foo.com/";
        String resourcePath = "";
        Assert.assertEquals(SdkHttpUtils.appendUri(host, resourcePath, true), "foo.com/");
    }

    @Test
    public void testAppendUriNoPathTrailingSlashAdded() {
        String host = "foo.com";
        String resourcePath = "";
        Assert.assertEquals(SdkHttpUtils.appendUri(host, resourcePath, true), "foo.com/");
    }

    @Test
    public void testAppendUriTrimExtraHostTrailingSlash() {
        String host = "foo.com/";
        String resourcePath = "bar";
        Assert.assertEquals(SdkHttpUtils.appendUri(host, resourcePath, true), "foo.com/bar");
    }

    @Test
    public void testAppendUriEscapeDoubleSlash() {
        String host = "foo.com";
        String resourcePath = "aws//java/sdk";
        Assert.assertEquals(SdkHttpUtils.appendUri(host, resourcePath, true), "foo.com/aws/%2Fjava/sdk");
    }

    @Test
    public void testAppendUriNoEscapeDoubleSlash() {
        String host = "foo.com";
        String resourcePath = "aws//java/sdk";
        Assert.assertEquals(SdkHttpUtils.appendUri(host, resourcePath, false), "foo.com/aws//java/sdk");
    }
}
