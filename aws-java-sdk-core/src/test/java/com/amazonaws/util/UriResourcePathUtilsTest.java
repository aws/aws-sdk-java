/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.util.UriResourcePathUtils.updateUriHost;
import static org.hamcrest.CoreMatchers.equalTo;

import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class UriResourcePathUtilsTest {

    @Test
    public void request_null_returns_null(){
     Assert.assertNull(UriResourcePathUtils.addStaticQueryParamtersToRequest(null,
             "foo"));
    }

    @Test
    public void uri_resource_path_null_returns_null(){
        Assert.assertNull(UriResourcePathUtils
                .addStaticQueryParamtersToRequest(new DefaultRequest<Object>
                                (null , null), null));
    }

    @Test
    public void uri_resource_path_doesnot_have_static_query_params_returns_uri_resource_path(){

        final String uriResourcePath = "/foo/bar";

        Assert.assertEquals(uriResourcePath, UriResourcePathUtils
                .addStaticQueryParamtersToRequest(new DefaultRequest<Object>
                        (null, null), uriResourcePath));

    }

    @Test
    public void uri_resource_path_ends_with_question_mark_returns_path_removed_with_question_mark(){

        final String expectedResourcePath = "/foo/bar";
        final String pathWithEmptyStaticQueryParams = expectedResourcePath + "?";

        Assert.assertEquals(expectedResourcePath, UriResourcePathUtils
                .addStaticQueryParamtersToRequest(new DefaultRequest<Object>
                        (null, null), pathWithEmptyStaticQueryParams));

    }

    @Test
    public void queryparam_value_empty_adds_parameter_with_empty_string_to_request() {
        final String uriResourcePath = "/foo/bar";
        final String uriResourcePathWithParams =
                uriResourcePath + "?param1=";

        final Request<Object> request = new DefaultRequest<Object>
                (null, null);

        Assert.assertEquals(uriResourcePath, UriResourcePathUtils
                .addStaticQueryParamtersToRequest(request,
                        uriResourcePathWithParams));
        Assert.assertTrue(request.getParameters().containsKey("param1"));
        Assert.assertEquals(Arrays.asList(""), request.getParameters().get("param1"));
    }

    @Test
    public void static_queryparams_in_path_added_to_request(){
        final String uriResourcePath = "/foo/bar";
        final String uriResourcePathWithParams =
                uriResourcePath + "?param1=value1&param2=value2";
        final Request<Object> request = new DefaultRequest<Object>
                (null, null);

        Assert.assertEquals(uriResourcePath, UriResourcePathUtils
                .addStaticQueryParamtersToRequest(request,
                        uriResourcePathWithParams));
        Assert.assertTrue(request.getParameters().containsKey("param1"));
        Assert.assertTrue(request.getParameters().containsKey("param2"));
        Assert.assertEquals(Arrays.asList("value1"), request.getParameters().get("param1"));
        Assert.assertEquals(Arrays.asList("value2"), request.getParameters().get("param2"));

    }

    @Test
    public void queryparam_without_value_returns_list_containing_null_value() {
        final String uriResourcePath = "/foo/bar";
        final String uriResourcePathWithParams =
                uriResourcePath + "?param";
        final Request<Object> request = new DefaultRequest<Object>(null, null);

        Assert.assertEquals(uriResourcePath, UriResourcePathUtils.addStaticQueryParamtersToRequest(request, uriResourcePathWithParams));

        Assert.assertTrue(request.getParameters().containsKey("param"));
        Assert.assertEquals(Arrays.asList((String)null), request.getParameters().get("param"));
    }

    @Test
    public void testUpdateUriHost() throws URISyntaxException {
        Assert.assertThat(updateUriHost(new URI("https://s3.amazonaws.com/index.html"), "foobar-"),
                          equalTo(new URI("https://foobar-s3.amazonaws.com/index.html")));

        Assert.assertThat(updateUriHost(new URI("http://user:pass@oldhostname/index.html"), "foobar."),
                          equalTo(new URI("http://user:pass@foobar.oldhostname/index.html")));
    }
}
