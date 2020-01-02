/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a condition for a rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/RuleCondition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleCondition implements Serializable, Cloneable {

    /**
     * <p>
     * The field in the HTTP request. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http-header</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>http-request-method</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-header</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>path-pattern</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>query-string</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-ip</code>
     * </p>
     * </li>
     * </ul>
     */
    private String field;
    /**
     * <p>
     * The condition value. You can use <code>Values</code> if the rule contains only <code>host-header</code> and
     * <code>path-pattern</code> conditions. Otherwise, you can use <code>HostHeaderConfig</code> for
     * <code>host-header</code> conditions and <code>PathPatternConfig</code> for <code>path-pattern</code> conditions.
     * </p>
     * <p>
     * If <code>Field</code> is <code>host-header</code>, you can specify a single host name (for example,
     * my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain any of
     * the following characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * - .
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>Field</code> is <code>path-pattern</code>, you can specify a single path pattern (for example, /img/*).
     * A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of the following
     * characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * _ - . $ / ~ " ' @ : +
     * </p>
     * </li>
     * <li>
     * <p>
     * &amp; (using &amp;amp;)
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> values;
    /**
     * <p>
     * Information for a host header condition. Specify only when <code>Field</code> is <code>host-header</code>.
     * </p>
     */
    private HostHeaderConditionConfig hostHeaderConfig;
    /**
     * <p>
     * Information for a path pattern condition. Specify only when <code>Field</code> is <code>path-pattern</code>.
     * </p>
     */
    private PathPatternConditionConfig pathPatternConfig;
    /**
     * <p>
     * Information for an HTTP header condition. Specify only when <code>Field</code> is <code>http-header</code>.
     * </p>
     */
    private HttpHeaderConditionConfig httpHeaderConfig;
    /**
     * <p>
     * Information for a query string condition. Specify only when <code>Field</code> is <code>query-string</code>.
     * </p>
     */
    private QueryStringConditionConfig queryStringConfig;
    /**
     * <p>
     * Information for an HTTP method condition. Specify only when <code>Field</code> is
     * <code>http-request-method</code>.
     * </p>
     */
    private HttpRequestMethodConditionConfig httpRequestMethodConfig;
    /**
     * <p>
     * Information for a source IP condition. Specify only when <code>Field</code> is <code>source-ip</code>.
     * </p>
     */
    private SourceIpConditionConfig sourceIpConfig;

    /**
     * <p>
     * The field in the HTTP request. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http-header</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>http-request-method</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-header</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>path-pattern</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>query-string</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-ip</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param field
     *        The field in the HTTP request. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>http-header</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>http-request-method</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>host-header</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>path-pattern</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>query-string</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>source-ip</code>
     *        </p>
     *        </li>
     */

    public void setField(String field) {
        this.field = field;
    }

    /**
     * <p>
     * The field in the HTTP request. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http-header</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>http-request-method</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-header</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>path-pattern</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>query-string</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-ip</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The field in the HTTP request. The following are the possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>http-header</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>http-request-method</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>host-header</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>path-pattern</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>query-string</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>source-ip</code>
     *         </p>
     *         </li>
     */

    public String getField() {
        return this.field;
    }

    /**
     * <p>
     * The field in the HTTP request. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>http-header</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>http-request-method</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-header</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>path-pattern</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>query-string</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-ip</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param field
     *        The field in the HTTP request. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>http-header</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>http-request-method</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>host-header</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>path-pattern</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>query-string</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>source-ip</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleCondition withField(String field) {
        setField(field);
        return this;
    }

    /**
     * <p>
     * The condition value. You can use <code>Values</code> if the rule contains only <code>host-header</code> and
     * <code>path-pattern</code> conditions. Otherwise, you can use <code>HostHeaderConfig</code> for
     * <code>host-header</code> conditions and <code>PathPatternConfig</code> for <code>path-pattern</code> conditions.
     * </p>
     * <p>
     * If <code>Field</code> is <code>host-header</code>, you can specify a single host name (for example,
     * my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain any of
     * the following characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * - .
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>Field</code> is <code>path-pattern</code>, you can specify a single path pattern (for example, /img/*).
     * A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of the following
     * characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * _ - . $ / ~ " ' @ : +
     * </p>
     * </li>
     * <li>
     * <p>
     * &amp; (using &amp;amp;)
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The condition value. You can use <code>Values</code> if the rule contains only <code>host-header</code>
     *         and <code>path-pattern</code> conditions. Otherwise, you can use <code>HostHeaderConfig</code> for
     *         <code>host-header</code> conditions and <code>PathPatternConfig</code> for <code>path-pattern</code>
     *         conditions.</p>
     *         <p>
     *         If <code>Field</code> is <code>host-header</code>, you can specify a single host name (for example,
     *         my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain
     *         any of the following characters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A-Z, a-z, 0-9
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         - .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         (matches 0 or more characters)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ? (matches exactly 1 character)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>Field</code> is <code>path-pattern</code>, you can specify a single path pattern (for example,
     *         /img/*). A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of
     *         the following characters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A-Z, a-z, 0-9
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         _ - . $ / ~ " ' @ : +
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         &amp; (using &amp;amp;)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         (matches 0 or more characters)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ? (matches exactly 1 character)
     *         </p>
     *         </li>
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The condition value. You can use <code>Values</code> if the rule contains only <code>host-header</code> and
     * <code>path-pattern</code> conditions. Otherwise, you can use <code>HostHeaderConfig</code> for
     * <code>host-header</code> conditions and <code>PathPatternConfig</code> for <code>path-pattern</code> conditions.
     * </p>
     * <p>
     * If <code>Field</code> is <code>host-header</code>, you can specify a single host name (for example,
     * my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain any of
     * the following characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * - .
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>Field</code> is <code>path-pattern</code>, you can specify a single path pattern (for example, /img/*).
     * A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of the following
     * characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * _ - . $ / ~ " ' @ : +
     * </p>
     * </li>
     * <li>
     * <p>
     * &amp; (using &amp;amp;)
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * 
     * @param values
     *        The condition value. You can use <code>Values</code> if the rule contains only <code>host-header</code>
     *        and <code>path-pattern</code> conditions. Otherwise, you can use <code>HostHeaderConfig</code> for
     *        <code>host-header</code> conditions and <code>PathPatternConfig</code> for <code>path-pattern</code>
     *        conditions.</p>
     *        <p>
     *        If <code>Field</code> is <code>host-header</code>, you can specify a single host name (for example,
     *        my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain
     *        any of the following characters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        - .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>Field</code> is <code>path-pattern</code>, you can specify a single path pattern (for example,
     *        /img/*). A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of
     *        the following characters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        _ - . $ / ~ " ' @ : +
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        &amp; (using &amp;amp;)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The condition value. You can use <code>Values</code> if the rule contains only <code>host-header</code> and
     * <code>path-pattern</code> conditions. Otherwise, you can use <code>HostHeaderConfig</code> for
     * <code>host-header</code> conditions and <code>PathPatternConfig</code> for <code>path-pattern</code> conditions.
     * </p>
     * <p>
     * If <code>Field</code> is <code>host-header</code>, you can specify a single host name (for example,
     * my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain any of
     * the following characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * - .
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>Field</code> is <code>path-pattern</code>, you can specify a single path pattern (for example, /img/*).
     * A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of the following
     * characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * _ - . $ / ~ " ' @ : +
     * </p>
     * </li>
     * <li>
     * <p>
     * &amp; (using &amp;amp;)
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The condition value. You can use <code>Values</code> if the rule contains only <code>host-header</code>
     *        and <code>path-pattern</code> conditions. Otherwise, you can use <code>HostHeaderConfig</code> for
     *        <code>host-header</code> conditions and <code>PathPatternConfig</code> for <code>path-pattern</code>
     *        conditions.</p>
     *        <p>
     *        If <code>Field</code> is <code>host-header</code>, you can specify a single host name (for example,
     *        my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain
     *        any of the following characters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        - .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>Field</code> is <code>path-pattern</code>, you can specify a single path pattern (for example,
     *        /img/*). A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of
     *        the following characters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        _ - . $ / ~ " ' @ : +
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        &amp; (using &amp;amp;)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleCondition withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The condition value. You can use <code>Values</code> if the rule contains only <code>host-header</code> and
     * <code>path-pattern</code> conditions. Otherwise, you can use <code>HostHeaderConfig</code> for
     * <code>host-header</code> conditions and <code>PathPatternConfig</code> for <code>path-pattern</code> conditions.
     * </p>
     * <p>
     * If <code>Field</code> is <code>host-header</code>, you can specify a single host name (for example,
     * my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain any of
     * the following characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * - .
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>Field</code> is <code>path-pattern</code>, you can specify a single path pattern (for example, /img/*).
     * A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of the following
     * characters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A-Z, a-z, 0-9
     * </p>
     * </li>
     * <li>
     * <p>
     * _ - . $ / ~ " ' @ : +
     * </p>
     * </li>
     * <li>
     * <p>
     * &amp; (using &amp;amp;)
     * </p>
     * </li>
     * <li>
     * <p>
     * * (matches 0 or more characters)
     * </p>
     * </li>
     * <li>
     * <p>
     * ? (matches exactly 1 character)
     * </p>
     * </li>
     * </ul>
     * 
     * @param values
     *        The condition value. You can use <code>Values</code> if the rule contains only <code>host-header</code>
     *        and <code>path-pattern</code> conditions. Otherwise, you can use <code>HostHeaderConfig</code> for
     *        <code>host-header</code> conditions and <code>PathPatternConfig</code> for <code>path-pattern</code>
     *        conditions.</p>
     *        <p>
     *        If <code>Field</code> is <code>host-header</code>, you can specify a single host name (for example,
     *        my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain
     *        any of the following characters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        - .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>Field</code> is <code>path-pattern</code>, you can specify a single path pattern (for example,
     *        /img/*). A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of
     *        the following characters.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A-Z, a-z, 0-9
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        _ - . $ / ~ " ' @ : +
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        &amp; (using &amp;amp;)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (matches 0 or more characters)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ? (matches exactly 1 character)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleCondition withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * Information for a host header condition. Specify only when <code>Field</code> is <code>host-header</code>.
     * </p>
     * 
     * @param hostHeaderConfig
     *        Information for a host header condition. Specify only when <code>Field</code> is <code>host-header</code>.
     */

    public void setHostHeaderConfig(HostHeaderConditionConfig hostHeaderConfig) {
        this.hostHeaderConfig = hostHeaderConfig;
    }

    /**
     * <p>
     * Information for a host header condition. Specify only when <code>Field</code> is <code>host-header</code>.
     * </p>
     * 
     * @return Information for a host header condition. Specify only when <code>Field</code> is <code>host-header</code>
     *         .
     */

    public HostHeaderConditionConfig getHostHeaderConfig() {
        return this.hostHeaderConfig;
    }

    /**
     * <p>
     * Information for a host header condition. Specify only when <code>Field</code> is <code>host-header</code>.
     * </p>
     * 
     * @param hostHeaderConfig
     *        Information for a host header condition. Specify only when <code>Field</code> is <code>host-header</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleCondition withHostHeaderConfig(HostHeaderConditionConfig hostHeaderConfig) {
        setHostHeaderConfig(hostHeaderConfig);
        return this;
    }

    /**
     * <p>
     * Information for a path pattern condition. Specify only when <code>Field</code> is <code>path-pattern</code>.
     * </p>
     * 
     * @param pathPatternConfig
     *        Information for a path pattern condition. Specify only when <code>Field</code> is
     *        <code>path-pattern</code>.
     */

    public void setPathPatternConfig(PathPatternConditionConfig pathPatternConfig) {
        this.pathPatternConfig = pathPatternConfig;
    }

    /**
     * <p>
     * Information for a path pattern condition. Specify only when <code>Field</code> is <code>path-pattern</code>.
     * </p>
     * 
     * @return Information for a path pattern condition. Specify only when <code>Field</code> is
     *         <code>path-pattern</code>.
     */

    public PathPatternConditionConfig getPathPatternConfig() {
        return this.pathPatternConfig;
    }

    /**
     * <p>
     * Information for a path pattern condition. Specify only when <code>Field</code> is <code>path-pattern</code>.
     * </p>
     * 
     * @param pathPatternConfig
     *        Information for a path pattern condition. Specify only when <code>Field</code> is
     *        <code>path-pattern</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleCondition withPathPatternConfig(PathPatternConditionConfig pathPatternConfig) {
        setPathPatternConfig(pathPatternConfig);
        return this;
    }

    /**
     * <p>
     * Information for an HTTP header condition. Specify only when <code>Field</code> is <code>http-header</code>.
     * </p>
     * 
     * @param httpHeaderConfig
     *        Information for an HTTP header condition. Specify only when <code>Field</code> is <code>http-header</code>
     *        .
     */

    public void setHttpHeaderConfig(HttpHeaderConditionConfig httpHeaderConfig) {
        this.httpHeaderConfig = httpHeaderConfig;
    }

    /**
     * <p>
     * Information for an HTTP header condition. Specify only when <code>Field</code> is <code>http-header</code>.
     * </p>
     * 
     * @return Information for an HTTP header condition. Specify only when <code>Field</code> is
     *         <code>http-header</code>.
     */

    public HttpHeaderConditionConfig getHttpHeaderConfig() {
        return this.httpHeaderConfig;
    }

    /**
     * <p>
     * Information for an HTTP header condition. Specify only when <code>Field</code> is <code>http-header</code>.
     * </p>
     * 
     * @param httpHeaderConfig
     *        Information for an HTTP header condition. Specify only when <code>Field</code> is <code>http-header</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleCondition withHttpHeaderConfig(HttpHeaderConditionConfig httpHeaderConfig) {
        setHttpHeaderConfig(httpHeaderConfig);
        return this;
    }

    /**
     * <p>
     * Information for a query string condition. Specify only when <code>Field</code> is <code>query-string</code>.
     * </p>
     * 
     * @param queryStringConfig
     *        Information for a query string condition. Specify only when <code>Field</code> is
     *        <code>query-string</code>.
     */

    public void setQueryStringConfig(QueryStringConditionConfig queryStringConfig) {
        this.queryStringConfig = queryStringConfig;
    }

    /**
     * <p>
     * Information for a query string condition. Specify only when <code>Field</code> is <code>query-string</code>.
     * </p>
     * 
     * @return Information for a query string condition. Specify only when <code>Field</code> is
     *         <code>query-string</code>.
     */

    public QueryStringConditionConfig getQueryStringConfig() {
        return this.queryStringConfig;
    }

    /**
     * <p>
     * Information for a query string condition. Specify only when <code>Field</code> is <code>query-string</code>.
     * </p>
     * 
     * @param queryStringConfig
     *        Information for a query string condition. Specify only when <code>Field</code> is
     *        <code>query-string</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleCondition withQueryStringConfig(QueryStringConditionConfig queryStringConfig) {
        setQueryStringConfig(queryStringConfig);
        return this;
    }

    /**
     * <p>
     * Information for an HTTP method condition. Specify only when <code>Field</code> is
     * <code>http-request-method</code>.
     * </p>
     * 
     * @param httpRequestMethodConfig
     *        Information for an HTTP method condition. Specify only when <code>Field</code> is
     *        <code>http-request-method</code>.
     */

    public void setHttpRequestMethodConfig(HttpRequestMethodConditionConfig httpRequestMethodConfig) {
        this.httpRequestMethodConfig = httpRequestMethodConfig;
    }

    /**
     * <p>
     * Information for an HTTP method condition. Specify only when <code>Field</code> is
     * <code>http-request-method</code>.
     * </p>
     * 
     * @return Information for an HTTP method condition. Specify only when <code>Field</code> is
     *         <code>http-request-method</code>.
     */

    public HttpRequestMethodConditionConfig getHttpRequestMethodConfig() {
        return this.httpRequestMethodConfig;
    }

    /**
     * <p>
     * Information for an HTTP method condition. Specify only when <code>Field</code> is
     * <code>http-request-method</code>.
     * </p>
     * 
     * @param httpRequestMethodConfig
     *        Information for an HTTP method condition. Specify only when <code>Field</code> is
     *        <code>http-request-method</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleCondition withHttpRequestMethodConfig(HttpRequestMethodConditionConfig httpRequestMethodConfig) {
        setHttpRequestMethodConfig(httpRequestMethodConfig);
        return this;
    }

    /**
     * <p>
     * Information for a source IP condition. Specify only when <code>Field</code> is <code>source-ip</code>.
     * </p>
     * 
     * @param sourceIpConfig
     *        Information for a source IP condition. Specify only when <code>Field</code> is <code>source-ip</code>.
     */

    public void setSourceIpConfig(SourceIpConditionConfig sourceIpConfig) {
        this.sourceIpConfig = sourceIpConfig;
    }

    /**
     * <p>
     * Information for a source IP condition. Specify only when <code>Field</code> is <code>source-ip</code>.
     * </p>
     * 
     * @return Information for a source IP condition. Specify only when <code>Field</code> is <code>source-ip</code>.
     */

    public SourceIpConditionConfig getSourceIpConfig() {
        return this.sourceIpConfig;
    }

    /**
     * <p>
     * Information for a source IP condition. Specify only when <code>Field</code> is <code>source-ip</code>.
     * </p>
     * 
     * @param sourceIpConfig
     *        Information for a source IP condition. Specify only when <code>Field</code> is <code>source-ip</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleCondition withSourceIpConfig(SourceIpConditionConfig sourceIpConfig) {
        setSourceIpConfig(sourceIpConfig);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getField() != null)
            sb.append("Field: ").append(getField()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
        if (getHostHeaderConfig() != null)
            sb.append("HostHeaderConfig: ").append(getHostHeaderConfig()).append(",");
        if (getPathPatternConfig() != null)
            sb.append("PathPatternConfig: ").append(getPathPatternConfig()).append(",");
        if (getHttpHeaderConfig() != null)
            sb.append("HttpHeaderConfig: ").append(getHttpHeaderConfig()).append(",");
        if (getQueryStringConfig() != null)
            sb.append("QueryStringConfig: ").append(getQueryStringConfig()).append(",");
        if (getHttpRequestMethodConfig() != null)
            sb.append("HttpRequestMethodConfig: ").append(getHttpRequestMethodConfig()).append(",");
        if (getSourceIpConfig() != null)
            sb.append("SourceIpConfig: ").append(getSourceIpConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleCondition == false)
            return false;
        RuleCondition other = (RuleCondition) obj;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getHostHeaderConfig() == null ^ this.getHostHeaderConfig() == null)
            return false;
        if (other.getHostHeaderConfig() != null && other.getHostHeaderConfig().equals(this.getHostHeaderConfig()) == false)
            return false;
        if (other.getPathPatternConfig() == null ^ this.getPathPatternConfig() == null)
            return false;
        if (other.getPathPatternConfig() != null && other.getPathPatternConfig().equals(this.getPathPatternConfig()) == false)
            return false;
        if (other.getHttpHeaderConfig() == null ^ this.getHttpHeaderConfig() == null)
            return false;
        if (other.getHttpHeaderConfig() != null && other.getHttpHeaderConfig().equals(this.getHttpHeaderConfig()) == false)
            return false;
        if (other.getQueryStringConfig() == null ^ this.getQueryStringConfig() == null)
            return false;
        if (other.getQueryStringConfig() != null && other.getQueryStringConfig().equals(this.getQueryStringConfig()) == false)
            return false;
        if (other.getHttpRequestMethodConfig() == null ^ this.getHttpRequestMethodConfig() == null)
            return false;
        if (other.getHttpRequestMethodConfig() != null && other.getHttpRequestMethodConfig().equals(this.getHttpRequestMethodConfig()) == false)
            return false;
        if (other.getSourceIpConfig() == null ^ this.getSourceIpConfig() == null)
            return false;
        if (other.getSourceIpConfig() != null && other.getSourceIpConfig().equals(this.getSourceIpConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getHostHeaderConfig() == null) ? 0 : getHostHeaderConfig().hashCode());
        hashCode = prime * hashCode + ((getPathPatternConfig() == null) ? 0 : getPathPatternConfig().hashCode());
        hashCode = prime * hashCode + ((getHttpHeaderConfig() == null) ? 0 : getHttpHeaderConfig().hashCode());
        hashCode = prime * hashCode + ((getQueryStringConfig() == null) ? 0 : getQueryStringConfig().hashCode());
        hashCode = prime * hashCode + ((getHttpRequestMethodConfig() == null) ? 0 : getHttpRequestMethodConfig().hashCode());
        hashCode = prime * hashCode + ((getSourceIpConfig() == null) ? 0 : getSourceIpConfig().hashCode());
        return hashCode;
    }

    @Override
    public RuleCondition clone() {
        try {
            return (RuleCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
