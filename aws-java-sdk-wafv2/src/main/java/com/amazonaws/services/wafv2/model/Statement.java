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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <note>
 * <p>
 * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information, including
 * how to migrate your AWS WAF resources from the prior release, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * The processing guidance for a <a>Rule</a>, used by AWS WAF to determine whether a web request matches the rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/Statement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Statement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. The byte match
     * statement provides the bytes to search for, the location in requests that you want AWS WAF to search, and other
     * settings. The bytes to search for are typically a string that corresponds with ASCII characters. In the AWS WAF
     * console and the developer guide, this is refered to as a string match statement.
     * </p>
     */
    private ByteMatchStatement byteMatchStatement;
    /**
     * <p>
     * Attackers sometimes insert malicious SQL code into web requests in an effort to extract data from your database.
     * To allow or block web requests that appear to contain malicious SQL code, create one or more SQL injection match
     * conditions. An SQL injection match condition identifies the part of web requests, such as the URI or the query
     * string, that you want AWS WAF to inspect. Later in the process, when you create a web ACL, you specify whether to
     * allow or block requests that appear to contain malicious SQL code.
     * </p>
     */
    private SqliMatchStatement sqliMatchStatement;
    /**
     * <p>
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. XSS
     * attacks are those where the attacker uses vulnerabilities in a benign website as a vehicle to inject malicious
     * client-site scripts into other legitimate web browsers. The XSS match statement provides the location in requests
     * that you want AWS WAF to search and text transformations to use on the search area before AWS WAF searches for
     * character sequences that are likely to be malicious strings.
     * </p>
     */
    private XssMatchStatement xssMatchStatement;
    /**
     * <p>
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison
     * operator, such as greater than (&gt;) or less than (&lt;). For example, you can use a size constraint statement
     * to look for query strings that are longer than 100 bytes.
     * </p>
     * <p>
     * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the first 8192 bytes (8 KB). If the
     * request body for your web requests never exceeds 8192 bytes, you can create a size constraint condition and block
     * requests that have a request body greater than 8192 bytes.
     * </p>
     * <p>
     * If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI counts as one
     * character. For example, the URI <code>/logo.jpg</code> is nine characters long.
     * </p>
     */
    private SizeConstraintStatement sizeConstraintStatement;
    /**
     * <p>
     * A rule statement used to identify web requests based on country of origin.
     * </p>
     */
    private GeoMatchStatement geoMatchStatement;
    /**
     * <p>
     * A rule statement used to run the rules that are defined in a <a>RuleGroup</a>. To use this, create a rule group
     * with your rules, then provide the ARN of the rule group in this statement.
     * </p>
     * <p>
     * You cannot nest a <code>RuleGroupReferenceStatement</code>, for example for use inside a
     * <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement within
     * a rule.
     * </p>
     */
    private RuleGroupReferenceStatement ruleGroupReferenceStatement;
    /**
     * <p>
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. To use this,
     * create an <a>IPSet</a> that specifies the addresses you want to detect, then use the ARN of that set in this
     * statement. To create an IP set, see <a>CreateIPSet</a>.
     * </p>
     * <p>
     * Each IP set rule statement references an IP set. You create and maintain the set independent of your rules. This
     * allows you to use the single set in multiple rules. When you update the referenced set, AWS WAF automatically
     * updates all rules that reference it.
     * </p>
     */
    private IPSetReferenceStatement iPSetReferenceStatement;
    /**
     * <p>
     * A rule statement used to search web request components for matches with regular expressions. To use this, create
     * a <a>RegexPatternSet</a> that specifies the expressions that you want to detect, then use the ARN of that set in
     * this statement. A web request matches the pattern set rule statement if the request component matches any of the
     * patterns in the set. To create a regex pattern set, see <a>CreateRegexPatternSet</a>.
     * </p>
     * <p>
     * Each regex pattern set rule statement references a regex pattern set. You create and maintain the set independent
     * of your rules. This allows you to use the single set in multiple rules. When you update the referenced set, AWS
     * WAF automatically updates all rules that reference it.
     * </p>
     */
    private RegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
    /**
     * <p>
     * A rate-based rule tracks the rate of requests for each originating IP address, and triggers the rule action when
     * the rate exceeds a limit that you specify on the number of requests in any 5-minute time span. You can use this
     * to put a temporary block on requests from an IP address that is sending excessive requests.
     * </p>
     * <p>
     * When the rule action triggers, AWS WAF blocks additional requests from the IP address until the request rate
     * falls below the limit.
     * </p>
     * <p>
     * You can optionally nest another statement inside the rate-based statement, to narrow the scope of the rule so
     * that it only counts requests that match the nested statement. For example, based on recent requests that you have
     * seen from an attacker, you might create a rate-based rule with a nested AND rule statement that contains the
     * following nested statements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An IP match statement with an IP set that specified the address 192.0.2.44.
     * </p>
     * </li>
     * <li>
     * <p>
     * A string match statement that searches in the User-Agent header for the string BadBot.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In this rate-based rule, you also define a rate limit. For this example, the rate limit is 1,000. Requests that
     * meet both of the conditions in the statements are counted. If the count exceeds 1,000 requests per five minutes,
     * the rule action triggers. Requests that do not meet both conditions are not counted towards the rate limit and
     * are not affected by this rule.
     * </p>
     * <p>
     * You cannot nest a <code>RateBasedStatement</code>, for example for use inside a <code>NotStatement</code> or
     * <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
     * </p>
     */
    private RateBasedStatement rateBasedStatement;
    /**
     * <p>
     * A logical rule statement used to combine other rule statements with AND logic. You provide more than one
     * <a>Statement</a> within the <code>AndStatement</code>.
     * </p>
     */
    private AndStatement andStatement;
    /**
     * <p>
     * A logical rule statement used to combine other rule statements with OR logic. You provide more than one
     * <a>Statement</a> within the <code>OrStatement</code>.
     * </p>
     */
    private OrStatement orStatement;
    /**
     * <p>
     * A logical rule statement used to negate the results of another rule statement. You provide one <a>Statement</a>
     * within the <code>NotStatement</code>.
     * </p>
     */
    private NotStatement notStatement;
    /**
     * <p>
     * A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the vendor
     * name and the name of the rule group in this statement. You can retrieve the required names by calling
     * <a>ListAvailableManagedRuleGroups</a>.
     * </p>
     * <p>
     * You can't nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a <code>NotStatement</code>
     * or <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
     * </p>
     */
    private ManagedRuleGroupStatement managedRuleGroupStatement;

    /**
     * <p>
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. The byte match
     * statement provides the bytes to search for, the location in requests that you want AWS WAF to search, and other
     * settings. The bytes to search for are typically a string that corresponds with ASCII characters. In the AWS WAF
     * console and the developer guide, this is refered to as a string match statement.
     * </p>
     * 
     * @param byteMatchStatement
     *        A rule statement that defines a string match search for AWS WAF to apply to web requests. The byte match
     *        statement provides the bytes to search for, the location in requests that you want AWS WAF to search, and
     *        other settings. The bytes to search for are typically a string that corresponds with ASCII characters. In
     *        the AWS WAF console and the developer guide, this is refered to as a string match statement.
     */

    public void setByteMatchStatement(ByteMatchStatement byteMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
    }

    /**
     * <p>
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. The byte match
     * statement provides the bytes to search for, the location in requests that you want AWS WAF to search, and other
     * settings. The bytes to search for are typically a string that corresponds with ASCII characters. In the AWS WAF
     * console and the developer guide, this is refered to as a string match statement.
     * </p>
     * 
     * @return A rule statement that defines a string match search for AWS WAF to apply to web requests. The byte match
     *         statement provides the bytes to search for, the location in requests that you want AWS WAF to search, and
     *         other settings. The bytes to search for are typically a string that corresponds with ASCII characters. In
     *         the AWS WAF console and the developer guide, this is refered to as a string match statement.
     */

    public ByteMatchStatement getByteMatchStatement() {
        return this.byteMatchStatement;
    }

    /**
     * <p>
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. The byte match
     * statement provides the bytes to search for, the location in requests that you want AWS WAF to search, and other
     * settings. The bytes to search for are typically a string that corresponds with ASCII characters. In the AWS WAF
     * console and the developer guide, this is refered to as a string match statement.
     * </p>
     * 
     * @param byteMatchStatement
     *        A rule statement that defines a string match search for AWS WAF to apply to web requests. The byte match
     *        statement provides the bytes to search for, the location in requests that you want AWS WAF to search, and
     *        other settings. The bytes to search for are typically a string that corresponds with ASCII characters. In
     *        the AWS WAF console and the developer guide, this is refered to as a string match statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withByteMatchStatement(ByteMatchStatement byteMatchStatement) {
        setByteMatchStatement(byteMatchStatement);
        return this;
    }

    /**
     * <p>
     * Attackers sometimes insert malicious SQL code into web requests in an effort to extract data from your database.
     * To allow or block web requests that appear to contain malicious SQL code, create one or more SQL injection match
     * conditions. An SQL injection match condition identifies the part of web requests, such as the URI or the query
     * string, that you want AWS WAF to inspect. Later in the process, when you create a web ACL, you specify whether to
     * allow or block requests that appear to contain malicious SQL code.
     * </p>
     * 
     * @param sqliMatchStatement
     *        Attackers sometimes insert malicious SQL code into web requests in an effort to extract data from your
     *        database. To allow or block web requests that appear to contain malicious SQL code, create one or more SQL
     *        injection match conditions. An SQL injection match condition identifies the part of web requests, such as
     *        the URI or the query string, that you want AWS WAF to inspect. Later in the process, when you create a web
     *        ACL, you specify whether to allow or block requests that appear to contain malicious SQL code.
     */

    public void setSqliMatchStatement(SqliMatchStatement sqliMatchStatement) {
        this.sqliMatchStatement = sqliMatchStatement;
    }

    /**
     * <p>
     * Attackers sometimes insert malicious SQL code into web requests in an effort to extract data from your database.
     * To allow or block web requests that appear to contain malicious SQL code, create one or more SQL injection match
     * conditions. An SQL injection match condition identifies the part of web requests, such as the URI or the query
     * string, that you want AWS WAF to inspect. Later in the process, when you create a web ACL, you specify whether to
     * allow or block requests that appear to contain malicious SQL code.
     * </p>
     * 
     * @return Attackers sometimes insert malicious SQL code into web requests in an effort to extract data from your
     *         database. To allow or block web requests that appear to contain malicious SQL code, create one or more
     *         SQL injection match conditions. An SQL injection match condition identifies the part of web requests,
     *         such as the URI or the query string, that you want AWS WAF to inspect. Later in the process, when you
     *         create a web ACL, you specify whether to allow or block requests that appear to contain malicious SQL
     *         code.
     */

    public SqliMatchStatement getSqliMatchStatement() {
        return this.sqliMatchStatement;
    }

    /**
     * <p>
     * Attackers sometimes insert malicious SQL code into web requests in an effort to extract data from your database.
     * To allow or block web requests that appear to contain malicious SQL code, create one or more SQL injection match
     * conditions. An SQL injection match condition identifies the part of web requests, such as the URI or the query
     * string, that you want AWS WAF to inspect. Later in the process, when you create a web ACL, you specify whether to
     * allow or block requests that appear to contain malicious SQL code.
     * </p>
     * 
     * @param sqliMatchStatement
     *        Attackers sometimes insert malicious SQL code into web requests in an effort to extract data from your
     *        database. To allow or block web requests that appear to contain malicious SQL code, create one or more SQL
     *        injection match conditions. An SQL injection match condition identifies the part of web requests, such as
     *        the URI or the query string, that you want AWS WAF to inspect. Later in the process, when you create a web
     *        ACL, you specify whether to allow or block requests that appear to contain malicious SQL code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withSqliMatchStatement(SqliMatchStatement sqliMatchStatement) {
        setSqliMatchStatement(sqliMatchStatement);
        return this;
    }

    /**
     * <p>
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. XSS
     * attacks are those where the attacker uses vulnerabilities in a benign website as a vehicle to inject malicious
     * client-site scripts into other legitimate web browsers. The XSS match statement provides the location in requests
     * that you want AWS WAF to search and text transformations to use on the search area before AWS WAF searches for
     * character sequences that are likely to be malicious strings.
     * </p>
     * 
     * @param xssMatchStatement
     *        A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web
     *        requests. XSS attacks are those where the attacker uses vulnerabilities in a benign website as a vehicle
     *        to inject malicious client-site scripts into other legitimate web browsers. The XSS match statement
     *        provides the location in requests that you want AWS WAF to search and text transformations to use on the
     *        search area before AWS WAF searches for character sequences that are likely to be malicious strings.
     */

    public void setXssMatchStatement(XssMatchStatement xssMatchStatement) {
        this.xssMatchStatement = xssMatchStatement;
    }

    /**
     * <p>
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. XSS
     * attacks are those where the attacker uses vulnerabilities in a benign website as a vehicle to inject malicious
     * client-site scripts into other legitimate web browsers. The XSS match statement provides the location in requests
     * that you want AWS WAF to search and text transformations to use on the search area before AWS WAF searches for
     * character sequences that are likely to be malicious strings.
     * </p>
     * 
     * @return A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web
     *         requests. XSS attacks are those where the attacker uses vulnerabilities in a benign website as a vehicle
     *         to inject malicious client-site scripts into other legitimate web browsers. The XSS match statement
     *         provides the location in requests that you want AWS WAF to search and text transformations to use on the
     *         search area before AWS WAF searches for character sequences that are likely to be malicious strings.
     */

    public XssMatchStatement getXssMatchStatement() {
        return this.xssMatchStatement;
    }

    /**
     * <p>
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. XSS
     * attacks are those where the attacker uses vulnerabilities in a benign website as a vehicle to inject malicious
     * client-site scripts into other legitimate web browsers. The XSS match statement provides the location in requests
     * that you want AWS WAF to search and text transformations to use on the search area before AWS WAF searches for
     * character sequences that are likely to be malicious strings.
     * </p>
     * 
     * @param xssMatchStatement
     *        A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web
     *        requests. XSS attacks are those where the attacker uses vulnerabilities in a benign website as a vehicle
     *        to inject malicious client-site scripts into other legitimate web browsers. The XSS match statement
     *        provides the location in requests that you want AWS WAF to search and text transformations to use on the
     *        search area before AWS WAF searches for character sequences that are likely to be malicious strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withXssMatchStatement(XssMatchStatement xssMatchStatement) {
        setXssMatchStatement(xssMatchStatement);
        return this;
    }

    /**
     * <p>
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison
     * operator, such as greater than (&gt;) or less than (&lt;). For example, you can use a size constraint statement
     * to look for query strings that are longer than 100 bytes.
     * </p>
     * <p>
     * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the first 8192 bytes (8 KB). If the
     * request body for your web requests never exceeds 8192 bytes, you can create a size constraint condition and block
     * requests that have a request body greater than 8192 bytes.
     * </p>
     * <p>
     * If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI counts as one
     * character. For example, the URI <code>/logo.jpg</code> is nine characters long.
     * </p>
     * 
     * @param sizeConstraintStatement
     *        A rule statement that compares a number of bytes against the size of a request component, using a
     *        comparison operator, such as greater than (&gt;) or less than (&lt;). For example, you can use a size
     *        constraint statement to look for query strings that are longer than 100 bytes. </p>
     *        <p>
     *        If you configure AWS WAF to inspect the request body, AWS WAF inspects only the first 8192 bytes (8 KB).
     *        If the request body for your web requests never exceeds 8192 bytes, you can create a size constraint
     *        condition and block requests that have a request body greater than 8192 bytes.
     *        </p>
     *        <p>
     *        If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI counts as
     *        one character. For example, the URI <code>/logo.jpg</code> is nine characters long.
     */

    public void setSizeConstraintStatement(SizeConstraintStatement sizeConstraintStatement) {
        this.sizeConstraintStatement = sizeConstraintStatement;
    }

    /**
     * <p>
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison
     * operator, such as greater than (&gt;) or less than (&lt;). For example, you can use a size constraint statement
     * to look for query strings that are longer than 100 bytes.
     * </p>
     * <p>
     * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the first 8192 bytes (8 KB). If the
     * request body for your web requests never exceeds 8192 bytes, you can create a size constraint condition and block
     * requests that have a request body greater than 8192 bytes.
     * </p>
     * <p>
     * If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI counts as one
     * character. For example, the URI <code>/logo.jpg</code> is nine characters long.
     * </p>
     * 
     * @return A rule statement that compares a number of bytes against the size of a request component, using a
     *         comparison operator, such as greater than (&gt;) or less than (&lt;). For example, you can use a size
     *         constraint statement to look for query strings that are longer than 100 bytes. </p>
     *         <p>
     *         If you configure AWS WAF to inspect the request body, AWS WAF inspects only the first 8192 bytes (8 KB).
     *         If the request body for your web requests never exceeds 8192 bytes, you can create a size constraint
     *         condition and block requests that have a request body greater than 8192 bytes.
     *         </p>
     *         <p>
     *         If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI counts as
     *         one character. For example, the URI <code>/logo.jpg</code> is nine characters long.
     */

    public SizeConstraintStatement getSizeConstraintStatement() {
        return this.sizeConstraintStatement;
    }

    /**
     * <p>
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison
     * operator, such as greater than (&gt;) or less than (&lt;). For example, you can use a size constraint statement
     * to look for query strings that are longer than 100 bytes.
     * </p>
     * <p>
     * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the first 8192 bytes (8 KB). If the
     * request body for your web requests never exceeds 8192 bytes, you can create a size constraint condition and block
     * requests that have a request body greater than 8192 bytes.
     * </p>
     * <p>
     * If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI counts as one
     * character. For example, the URI <code>/logo.jpg</code> is nine characters long.
     * </p>
     * 
     * @param sizeConstraintStatement
     *        A rule statement that compares a number of bytes against the size of a request component, using a
     *        comparison operator, such as greater than (&gt;) or less than (&lt;). For example, you can use a size
     *        constraint statement to look for query strings that are longer than 100 bytes. </p>
     *        <p>
     *        If you configure AWS WAF to inspect the request body, AWS WAF inspects only the first 8192 bytes (8 KB).
     *        If the request body for your web requests never exceeds 8192 bytes, you can create a size constraint
     *        condition and block requests that have a request body greater than 8192 bytes.
     *        </p>
     *        <p>
     *        If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI counts as
     *        one character. For example, the URI <code>/logo.jpg</code> is nine characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withSizeConstraintStatement(SizeConstraintStatement sizeConstraintStatement) {
        setSizeConstraintStatement(sizeConstraintStatement);
        return this;
    }

    /**
     * <p>
     * A rule statement used to identify web requests based on country of origin.
     * </p>
     * 
     * @param geoMatchStatement
     *        A rule statement used to identify web requests based on country of origin.
     */

    public void setGeoMatchStatement(GeoMatchStatement geoMatchStatement) {
        this.geoMatchStatement = geoMatchStatement;
    }

    /**
     * <p>
     * A rule statement used to identify web requests based on country of origin.
     * </p>
     * 
     * @return A rule statement used to identify web requests based on country of origin.
     */

    public GeoMatchStatement getGeoMatchStatement() {
        return this.geoMatchStatement;
    }

    /**
     * <p>
     * A rule statement used to identify web requests based on country of origin.
     * </p>
     * 
     * @param geoMatchStatement
     *        A rule statement used to identify web requests based on country of origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withGeoMatchStatement(GeoMatchStatement geoMatchStatement) {
        setGeoMatchStatement(geoMatchStatement);
        return this;
    }

    /**
     * <p>
     * A rule statement used to run the rules that are defined in a <a>RuleGroup</a>. To use this, create a rule group
     * with your rules, then provide the ARN of the rule group in this statement.
     * </p>
     * <p>
     * You cannot nest a <code>RuleGroupReferenceStatement</code>, for example for use inside a
     * <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement within
     * a rule.
     * </p>
     * 
     * @param ruleGroupReferenceStatement
     *        A rule statement used to run the rules that are defined in a <a>RuleGroup</a>. To use this, create a rule
     *        group with your rules, then provide the ARN of the rule group in this statement.</p>
     *        <p>
     *        You cannot nest a <code>RuleGroupReferenceStatement</code>, for example for use inside a
     *        <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement
     *        within a rule.
     */

    public void setRuleGroupReferenceStatement(RuleGroupReferenceStatement ruleGroupReferenceStatement) {
        this.ruleGroupReferenceStatement = ruleGroupReferenceStatement;
    }

    /**
     * <p>
     * A rule statement used to run the rules that are defined in a <a>RuleGroup</a>. To use this, create a rule group
     * with your rules, then provide the ARN of the rule group in this statement.
     * </p>
     * <p>
     * You cannot nest a <code>RuleGroupReferenceStatement</code>, for example for use inside a
     * <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement within
     * a rule.
     * </p>
     * 
     * @return A rule statement used to run the rules that are defined in a <a>RuleGroup</a>. To use this, create a rule
     *         group with your rules, then provide the ARN of the rule group in this statement.</p>
     *         <p>
     *         You cannot nest a <code>RuleGroupReferenceStatement</code>, for example for use inside a
     *         <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement
     *         within a rule.
     */

    public RuleGroupReferenceStatement getRuleGroupReferenceStatement() {
        return this.ruleGroupReferenceStatement;
    }

    /**
     * <p>
     * A rule statement used to run the rules that are defined in a <a>RuleGroup</a>. To use this, create a rule group
     * with your rules, then provide the ARN of the rule group in this statement.
     * </p>
     * <p>
     * You cannot nest a <code>RuleGroupReferenceStatement</code>, for example for use inside a
     * <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement within
     * a rule.
     * </p>
     * 
     * @param ruleGroupReferenceStatement
     *        A rule statement used to run the rules that are defined in a <a>RuleGroup</a>. To use this, create a rule
     *        group with your rules, then provide the ARN of the rule group in this statement.</p>
     *        <p>
     *        You cannot nest a <code>RuleGroupReferenceStatement</code>, for example for use inside a
     *        <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement
     *        within a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withRuleGroupReferenceStatement(RuleGroupReferenceStatement ruleGroupReferenceStatement) {
        setRuleGroupReferenceStatement(ruleGroupReferenceStatement);
        return this;
    }

    /**
     * <p>
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. To use this,
     * create an <a>IPSet</a> that specifies the addresses you want to detect, then use the ARN of that set in this
     * statement. To create an IP set, see <a>CreateIPSet</a>.
     * </p>
     * <p>
     * Each IP set rule statement references an IP set. You create and maintain the set independent of your rules. This
     * allows you to use the single set in multiple rules. When you update the referenced set, AWS WAF automatically
     * updates all rules that reference it.
     * </p>
     * 
     * @param iPSetReferenceStatement
     *        A rule statement used to detect web requests coming from particular IP addresses or address ranges. To use
     *        this, create an <a>IPSet</a> that specifies the addresses you want to detect, then use the ARN of that set
     *        in this statement. To create an IP set, see <a>CreateIPSet</a>.</p>
     *        <p>
     *        Each IP set rule statement references an IP set. You create and maintain the set independent of your
     *        rules. This allows you to use the single set in multiple rules. When you update the referenced set, AWS
     *        WAF automatically updates all rules that reference it.
     */

    public void setIPSetReferenceStatement(IPSetReferenceStatement iPSetReferenceStatement) {
        this.iPSetReferenceStatement = iPSetReferenceStatement;
    }

    /**
     * <p>
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. To use this,
     * create an <a>IPSet</a> that specifies the addresses you want to detect, then use the ARN of that set in this
     * statement. To create an IP set, see <a>CreateIPSet</a>.
     * </p>
     * <p>
     * Each IP set rule statement references an IP set. You create and maintain the set independent of your rules. This
     * allows you to use the single set in multiple rules. When you update the referenced set, AWS WAF automatically
     * updates all rules that reference it.
     * </p>
     * 
     * @return A rule statement used to detect web requests coming from particular IP addresses or address ranges. To
     *         use this, create an <a>IPSet</a> that specifies the addresses you want to detect, then use the ARN of
     *         that set in this statement. To create an IP set, see <a>CreateIPSet</a>.</p>
     *         <p>
     *         Each IP set rule statement references an IP set. You create and maintain the set independent of your
     *         rules. This allows you to use the single set in multiple rules. When you update the referenced set, AWS
     *         WAF automatically updates all rules that reference it.
     */

    public IPSetReferenceStatement getIPSetReferenceStatement() {
        return this.iPSetReferenceStatement;
    }

    /**
     * <p>
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. To use this,
     * create an <a>IPSet</a> that specifies the addresses you want to detect, then use the ARN of that set in this
     * statement. To create an IP set, see <a>CreateIPSet</a>.
     * </p>
     * <p>
     * Each IP set rule statement references an IP set. You create and maintain the set independent of your rules. This
     * allows you to use the single set in multiple rules. When you update the referenced set, AWS WAF automatically
     * updates all rules that reference it.
     * </p>
     * 
     * @param iPSetReferenceStatement
     *        A rule statement used to detect web requests coming from particular IP addresses or address ranges. To use
     *        this, create an <a>IPSet</a> that specifies the addresses you want to detect, then use the ARN of that set
     *        in this statement. To create an IP set, see <a>CreateIPSet</a>.</p>
     *        <p>
     *        Each IP set rule statement references an IP set. You create and maintain the set independent of your
     *        rules. This allows you to use the single set in multiple rules. When you update the referenced set, AWS
     *        WAF automatically updates all rules that reference it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withIPSetReferenceStatement(IPSetReferenceStatement iPSetReferenceStatement) {
        setIPSetReferenceStatement(iPSetReferenceStatement);
        return this;
    }

    /**
     * <p>
     * A rule statement used to search web request components for matches with regular expressions. To use this, create
     * a <a>RegexPatternSet</a> that specifies the expressions that you want to detect, then use the ARN of that set in
     * this statement. A web request matches the pattern set rule statement if the request component matches any of the
     * patterns in the set. To create a regex pattern set, see <a>CreateRegexPatternSet</a>.
     * </p>
     * <p>
     * Each regex pattern set rule statement references a regex pattern set. You create and maintain the set independent
     * of your rules. This allows you to use the single set in multiple rules. When you update the referenced set, AWS
     * WAF automatically updates all rules that reference it.
     * </p>
     * 
     * @param regexPatternSetReferenceStatement
     *        A rule statement used to search web request components for matches with regular expressions. To use this,
     *        create a <a>RegexPatternSet</a> that specifies the expressions that you want to detect, then use the ARN
     *        of that set in this statement. A web request matches the pattern set rule statement if the request
     *        component matches any of the patterns in the set. To create a regex pattern set, see
     *        <a>CreateRegexPatternSet</a>.</p>
     *        <p>
     *        Each regex pattern set rule statement references a regex pattern set. You create and maintain the set
     *        independent of your rules. This allows you to use the single set in multiple rules. When you update the
     *        referenced set, AWS WAF automatically updates all rules that reference it.
     */

    public void setRegexPatternSetReferenceStatement(RegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
    }

    /**
     * <p>
     * A rule statement used to search web request components for matches with regular expressions. To use this, create
     * a <a>RegexPatternSet</a> that specifies the expressions that you want to detect, then use the ARN of that set in
     * this statement. A web request matches the pattern set rule statement if the request component matches any of the
     * patterns in the set. To create a regex pattern set, see <a>CreateRegexPatternSet</a>.
     * </p>
     * <p>
     * Each regex pattern set rule statement references a regex pattern set. You create and maintain the set independent
     * of your rules. This allows you to use the single set in multiple rules. When you update the referenced set, AWS
     * WAF automatically updates all rules that reference it.
     * </p>
     * 
     * @return A rule statement used to search web request components for matches with regular expressions. To use this,
     *         create a <a>RegexPatternSet</a> that specifies the expressions that you want to detect, then use the ARN
     *         of that set in this statement. A web request matches the pattern set rule statement if the request
     *         component matches any of the patterns in the set. To create a regex pattern set, see
     *         <a>CreateRegexPatternSet</a>.</p>
     *         <p>
     *         Each regex pattern set rule statement references a regex pattern set. You create and maintain the set
     *         independent of your rules. This allows you to use the single set in multiple rules. When you update the
     *         referenced set, AWS WAF automatically updates all rules that reference it.
     */

    public RegexPatternSetReferenceStatement getRegexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement;
    }

    /**
     * <p>
     * A rule statement used to search web request components for matches with regular expressions. To use this, create
     * a <a>RegexPatternSet</a> that specifies the expressions that you want to detect, then use the ARN of that set in
     * this statement. A web request matches the pattern set rule statement if the request component matches any of the
     * patterns in the set. To create a regex pattern set, see <a>CreateRegexPatternSet</a>.
     * </p>
     * <p>
     * Each regex pattern set rule statement references a regex pattern set. You create and maintain the set independent
     * of your rules. This allows you to use the single set in multiple rules. When you update the referenced set, AWS
     * WAF automatically updates all rules that reference it.
     * </p>
     * 
     * @param regexPatternSetReferenceStatement
     *        A rule statement used to search web request components for matches with regular expressions. To use this,
     *        create a <a>RegexPatternSet</a> that specifies the expressions that you want to detect, then use the ARN
     *        of that set in this statement. A web request matches the pattern set rule statement if the request
     *        component matches any of the patterns in the set. To create a regex pattern set, see
     *        <a>CreateRegexPatternSet</a>.</p>
     *        <p>
     *        Each regex pattern set rule statement references a regex pattern set. You create and maintain the set
     *        independent of your rules. This allows you to use the single set in multiple rules. When you update the
     *        referenced set, AWS WAF automatically updates all rules that reference it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withRegexPatternSetReferenceStatement(RegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
        setRegexPatternSetReferenceStatement(regexPatternSetReferenceStatement);
        return this;
    }

    /**
     * <p>
     * A rate-based rule tracks the rate of requests for each originating IP address, and triggers the rule action when
     * the rate exceeds a limit that you specify on the number of requests in any 5-minute time span. You can use this
     * to put a temporary block on requests from an IP address that is sending excessive requests.
     * </p>
     * <p>
     * When the rule action triggers, AWS WAF blocks additional requests from the IP address until the request rate
     * falls below the limit.
     * </p>
     * <p>
     * You can optionally nest another statement inside the rate-based statement, to narrow the scope of the rule so
     * that it only counts requests that match the nested statement. For example, based on recent requests that you have
     * seen from an attacker, you might create a rate-based rule with a nested AND rule statement that contains the
     * following nested statements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An IP match statement with an IP set that specified the address 192.0.2.44.
     * </p>
     * </li>
     * <li>
     * <p>
     * A string match statement that searches in the User-Agent header for the string BadBot.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In this rate-based rule, you also define a rate limit. For this example, the rate limit is 1,000. Requests that
     * meet both of the conditions in the statements are counted. If the count exceeds 1,000 requests per five minutes,
     * the rule action triggers. Requests that do not meet both conditions are not counted towards the rate limit and
     * are not affected by this rule.
     * </p>
     * <p>
     * You cannot nest a <code>RateBasedStatement</code>, for example for use inside a <code>NotStatement</code> or
     * <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
     * </p>
     * 
     * @param rateBasedStatement
     *        A rate-based rule tracks the rate of requests for each originating IP address, and triggers the rule
     *        action when the rate exceeds a limit that you specify on the number of requests in any 5-minute time span.
     *        You can use this to put a temporary block on requests from an IP address that is sending excessive
     *        requests.</p>
     *        <p>
     *        When the rule action triggers, AWS WAF blocks additional requests from the IP address until the request
     *        rate falls below the limit.
     *        </p>
     *        <p>
     *        You can optionally nest another statement inside the rate-based statement, to narrow the scope of the rule
     *        so that it only counts requests that match the nested statement. For example, based on recent requests
     *        that you have seen from an attacker, you might create a rate-based rule with a nested AND rule statement
     *        that contains the following nested statements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An IP match statement with an IP set that specified the address 192.0.2.44.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A string match statement that searches in the User-Agent header for the string BadBot.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In this rate-based rule, you also define a rate limit. For this example, the rate limit is 1,000. Requests
     *        that meet both of the conditions in the statements are counted. If the count exceeds 1,000 requests per
     *        five minutes, the rule action triggers. Requests that do not meet both conditions are not counted towards
     *        the rate limit and are not affected by this rule.
     *        </p>
     *        <p>
     *        You cannot nest a <code>RateBasedStatement</code>, for example for use inside a <code>NotStatement</code>
     *        or <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
     */

    public void setRateBasedStatement(RateBasedStatement rateBasedStatement) {
        this.rateBasedStatement = rateBasedStatement;
    }

    /**
     * <p>
     * A rate-based rule tracks the rate of requests for each originating IP address, and triggers the rule action when
     * the rate exceeds a limit that you specify on the number of requests in any 5-minute time span. You can use this
     * to put a temporary block on requests from an IP address that is sending excessive requests.
     * </p>
     * <p>
     * When the rule action triggers, AWS WAF blocks additional requests from the IP address until the request rate
     * falls below the limit.
     * </p>
     * <p>
     * You can optionally nest another statement inside the rate-based statement, to narrow the scope of the rule so
     * that it only counts requests that match the nested statement. For example, based on recent requests that you have
     * seen from an attacker, you might create a rate-based rule with a nested AND rule statement that contains the
     * following nested statements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An IP match statement with an IP set that specified the address 192.0.2.44.
     * </p>
     * </li>
     * <li>
     * <p>
     * A string match statement that searches in the User-Agent header for the string BadBot.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In this rate-based rule, you also define a rate limit. For this example, the rate limit is 1,000. Requests that
     * meet both of the conditions in the statements are counted. If the count exceeds 1,000 requests per five minutes,
     * the rule action triggers. Requests that do not meet both conditions are not counted towards the rate limit and
     * are not affected by this rule.
     * </p>
     * <p>
     * You cannot nest a <code>RateBasedStatement</code>, for example for use inside a <code>NotStatement</code> or
     * <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
     * </p>
     * 
     * @return A rate-based rule tracks the rate of requests for each originating IP address, and triggers the rule
     *         action when the rate exceeds a limit that you specify on the number of requests in any 5-minute time
     *         span. You can use this to put a temporary block on requests from an IP address that is sending excessive
     *         requests.</p>
     *         <p>
     *         When the rule action triggers, AWS WAF blocks additional requests from the IP address until the request
     *         rate falls below the limit.
     *         </p>
     *         <p>
     *         You can optionally nest another statement inside the rate-based statement, to narrow the scope of the
     *         rule so that it only counts requests that match the nested statement. For example, based on recent
     *         requests that you have seen from an attacker, you might create a rate-based rule with a nested AND rule
     *         statement that contains the following nested statements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         An IP match statement with an IP set that specified the address 192.0.2.44.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A string match statement that searches in the User-Agent header for the string BadBot.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         In this rate-based rule, you also define a rate limit. For this example, the rate limit is 1,000.
     *         Requests that meet both of the conditions in the statements are counted. If the count exceeds 1,000
     *         requests per five minutes, the rule action triggers. Requests that do not meet both conditions are not
     *         counted towards the rate limit and are not affected by this rule.
     *         </p>
     *         <p>
     *         You cannot nest a <code>RateBasedStatement</code>, for example for use inside a <code>NotStatement</code>
     *         or <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
     */

    public RateBasedStatement getRateBasedStatement() {
        return this.rateBasedStatement;
    }

    /**
     * <p>
     * A rate-based rule tracks the rate of requests for each originating IP address, and triggers the rule action when
     * the rate exceeds a limit that you specify on the number of requests in any 5-minute time span. You can use this
     * to put a temporary block on requests from an IP address that is sending excessive requests.
     * </p>
     * <p>
     * When the rule action triggers, AWS WAF blocks additional requests from the IP address until the request rate
     * falls below the limit.
     * </p>
     * <p>
     * You can optionally nest another statement inside the rate-based statement, to narrow the scope of the rule so
     * that it only counts requests that match the nested statement. For example, based on recent requests that you have
     * seen from an attacker, you might create a rate-based rule with a nested AND rule statement that contains the
     * following nested statements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An IP match statement with an IP set that specified the address 192.0.2.44.
     * </p>
     * </li>
     * <li>
     * <p>
     * A string match statement that searches in the User-Agent header for the string BadBot.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In this rate-based rule, you also define a rate limit. For this example, the rate limit is 1,000. Requests that
     * meet both of the conditions in the statements are counted. If the count exceeds 1,000 requests per five minutes,
     * the rule action triggers. Requests that do not meet both conditions are not counted towards the rate limit and
     * are not affected by this rule.
     * </p>
     * <p>
     * You cannot nest a <code>RateBasedStatement</code>, for example for use inside a <code>NotStatement</code> or
     * <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
     * </p>
     * 
     * @param rateBasedStatement
     *        A rate-based rule tracks the rate of requests for each originating IP address, and triggers the rule
     *        action when the rate exceeds a limit that you specify on the number of requests in any 5-minute time span.
     *        You can use this to put a temporary block on requests from an IP address that is sending excessive
     *        requests.</p>
     *        <p>
     *        When the rule action triggers, AWS WAF blocks additional requests from the IP address until the request
     *        rate falls below the limit.
     *        </p>
     *        <p>
     *        You can optionally nest another statement inside the rate-based statement, to narrow the scope of the rule
     *        so that it only counts requests that match the nested statement. For example, based on recent requests
     *        that you have seen from an attacker, you might create a rate-based rule with a nested AND rule statement
     *        that contains the following nested statements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An IP match statement with an IP set that specified the address 192.0.2.44.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A string match statement that searches in the User-Agent header for the string BadBot.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In this rate-based rule, you also define a rate limit. For this example, the rate limit is 1,000. Requests
     *        that meet both of the conditions in the statements are counted. If the count exceeds 1,000 requests per
     *        five minutes, the rule action triggers. Requests that do not meet both conditions are not counted towards
     *        the rate limit and are not affected by this rule.
     *        </p>
     *        <p>
     *        You cannot nest a <code>RateBasedStatement</code>, for example for use inside a <code>NotStatement</code>
     *        or <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withRateBasedStatement(RateBasedStatement rateBasedStatement) {
        setRateBasedStatement(rateBasedStatement);
        return this;
    }

    /**
     * <p>
     * A logical rule statement used to combine other rule statements with AND logic. You provide more than one
     * <a>Statement</a> within the <code>AndStatement</code>.
     * </p>
     * 
     * @param andStatement
     *        A logical rule statement used to combine other rule statements with AND logic. You provide more than one
     *        <a>Statement</a> within the <code>AndStatement</code>.
     */

    public void setAndStatement(AndStatement andStatement) {
        this.andStatement = andStatement;
    }

    /**
     * <p>
     * A logical rule statement used to combine other rule statements with AND logic. You provide more than one
     * <a>Statement</a> within the <code>AndStatement</code>.
     * </p>
     * 
     * @return A logical rule statement used to combine other rule statements with AND logic. You provide more than one
     *         <a>Statement</a> within the <code>AndStatement</code>.
     */

    public AndStatement getAndStatement() {
        return this.andStatement;
    }

    /**
     * <p>
     * A logical rule statement used to combine other rule statements with AND logic. You provide more than one
     * <a>Statement</a> within the <code>AndStatement</code>.
     * </p>
     * 
     * @param andStatement
     *        A logical rule statement used to combine other rule statements with AND logic. You provide more than one
     *        <a>Statement</a> within the <code>AndStatement</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withAndStatement(AndStatement andStatement) {
        setAndStatement(andStatement);
        return this;
    }

    /**
     * <p>
     * A logical rule statement used to combine other rule statements with OR logic. You provide more than one
     * <a>Statement</a> within the <code>OrStatement</code>.
     * </p>
     * 
     * @param orStatement
     *        A logical rule statement used to combine other rule statements with OR logic. You provide more than one
     *        <a>Statement</a> within the <code>OrStatement</code>.
     */

    public void setOrStatement(OrStatement orStatement) {
        this.orStatement = orStatement;
    }

    /**
     * <p>
     * A logical rule statement used to combine other rule statements with OR logic. You provide more than one
     * <a>Statement</a> within the <code>OrStatement</code>.
     * </p>
     * 
     * @return A logical rule statement used to combine other rule statements with OR logic. You provide more than one
     *         <a>Statement</a> within the <code>OrStatement</code>.
     */

    public OrStatement getOrStatement() {
        return this.orStatement;
    }

    /**
     * <p>
     * A logical rule statement used to combine other rule statements with OR logic. You provide more than one
     * <a>Statement</a> within the <code>OrStatement</code>.
     * </p>
     * 
     * @param orStatement
     *        A logical rule statement used to combine other rule statements with OR logic. You provide more than one
     *        <a>Statement</a> within the <code>OrStatement</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withOrStatement(OrStatement orStatement) {
        setOrStatement(orStatement);
        return this;
    }

    /**
     * <p>
     * A logical rule statement used to negate the results of another rule statement. You provide one <a>Statement</a>
     * within the <code>NotStatement</code>.
     * </p>
     * 
     * @param notStatement
     *        A logical rule statement used to negate the results of another rule statement. You provide one
     *        <a>Statement</a> within the <code>NotStatement</code>.
     */

    public void setNotStatement(NotStatement notStatement) {
        this.notStatement = notStatement;
    }

    /**
     * <p>
     * A logical rule statement used to negate the results of another rule statement. You provide one <a>Statement</a>
     * within the <code>NotStatement</code>.
     * </p>
     * 
     * @return A logical rule statement used to negate the results of another rule statement. You provide one
     *         <a>Statement</a> within the <code>NotStatement</code>.
     */

    public NotStatement getNotStatement() {
        return this.notStatement;
    }

    /**
     * <p>
     * A logical rule statement used to negate the results of another rule statement. You provide one <a>Statement</a>
     * within the <code>NotStatement</code>.
     * </p>
     * 
     * @param notStatement
     *        A logical rule statement used to negate the results of another rule statement. You provide one
     *        <a>Statement</a> within the <code>NotStatement</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withNotStatement(NotStatement notStatement) {
        setNotStatement(notStatement);
        return this;
    }

    /**
     * <p>
     * A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the vendor
     * name and the name of the rule group in this statement. You can retrieve the required names by calling
     * <a>ListAvailableManagedRuleGroups</a>.
     * </p>
     * <p>
     * You can't nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a <code>NotStatement</code>
     * or <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
     * </p>
     * 
     * @param managedRuleGroupStatement
     *        A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the
     *        vendor name and the name of the rule group in this statement. You can retrieve the required names by
     *        calling <a>ListAvailableManagedRuleGroups</a>.</p>
     *        <p>
     *        You can't nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a
     *        <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement
     *        within a rule.
     */

    public void setManagedRuleGroupStatement(ManagedRuleGroupStatement managedRuleGroupStatement) {
        this.managedRuleGroupStatement = managedRuleGroupStatement;
    }

    /**
     * <p>
     * A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the vendor
     * name and the name of the rule group in this statement. You can retrieve the required names by calling
     * <a>ListAvailableManagedRuleGroups</a>.
     * </p>
     * <p>
     * You can't nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a <code>NotStatement</code>
     * or <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
     * </p>
     * 
     * @return A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the
     *         vendor name and the name of the rule group in this statement. You can retrieve the required names by
     *         calling <a>ListAvailableManagedRuleGroups</a>.</p>
     *         <p>
     *         You can't nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a
     *         <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement
     *         within a rule.
     */

    public ManagedRuleGroupStatement getManagedRuleGroupStatement() {
        return this.managedRuleGroupStatement;
    }

    /**
     * <p>
     * A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the vendor
     * name and the name of the rule group in this statement. You can retrieve the required names by calling
     * <a>ListAvailableManagedRuleGroups</a>.
     * </p>
     * <p>
     * You can't nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a <code>NotStatement</code>
     * or <code>OrStatement</code>. It can only be referenced as a top-level statement within a rule.
     * </p>
     * 
     * @param managedRuleGroupStatement
     *        A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the
     *        vendor name and the name of the rule group in this statement. You can retrieve the required names by
     *        calling <a>ListAvailableManagedRuleGroups</a>.</p>
     *        <p>
     *        You can't nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a
     *        <code>NotStatement</code> or <code>OrStatement</code>. It can only be referenced as a top-level statement
     *        within a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withManagedRuleGroupStatement(ManagedRuleGroupStatement managedRuleGroupStatement) {
        setManagedRuleGroupStatement(managedRuleGroupStatement);
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
        if (getByteMatchStatement() != null)
            sb.append("ByteMatchStatement: ").append(getByteMatchStatement()).append(",");
        if (getSqliMatchStatement() != null)
            sb.append("SqliMatchStatement: ").append(getSqliMatchStatement()).append(",");
        if (getXssMatchStatement() != null)
            sb.append("XssMatchStatement: ").append(getXssMatchStatement()).append(",");
        if (getSizeConstraintStatement() != null)
            sb.append("SizeConstraintStatement: ").append(getSizeConstraintStatement()).append(",");
        if (getGeoMatchStatement() != null)
            sb.append("GeoMatchStatement: ").append(getGeoMatchStatement()).append(",");
        if (getRuleGroupReferenceStatement() != null)
            sb.append("RuleGroupReferenceStatement: ").append(getRuleGroupReferenceStatement()).append(",");
        if (getIPSetReferenceStatement() != null)
            sb.append("IPSetReferenceStatement: ").append(getIPSetReferenceStatement()).append(",");
        if (getRegexPatternSetReferenceStatement() != null)
            sb.append("RegexPatternSetReferenceStatement: ").append(getRegexPatternSetReferenceStatement()).append(",");
        if (getRateBasedStatement() != null)
            sb.append("RateBasedStatement: ").append(getRateBasedStatement()).append(",");
        if (getAndStatement() != null)
            sb.append("AndStatement: ").append(getAndStatement()).append(",");
        if (getOrStatement() != null)
            sb.append("OrStatement: ").append(getOrStatement()).append(",");
        if (getNotStatement() != null)
            sb.append("NotStatement: ").append(getNotStatement()).append(",");
        if (getManagedRuleGroupStatement() != null)
            sb.append("ManagedRuleGroupStatement: ").append(getManagedRuleGroupStatement());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Statement == false)
            return false;
        Statement other = (Statement) obj;
        if (other.getByteMatchStatement() == null ^ this.getByteMatchStatement() == null)
            return false;
        if (other.getByteMatchStatement() != null && other.getByteMatchStatement().equals(this.getByteMatchStatement()) == false)
            return false;
        if (other.getSqliMatchStatement() == null ^ this.getSqliMatchStatement() == null)
            return false;
        if (other.getSqliMatchStatement() != null && other.getSqliMatchStatement().equals(this.getSqliMatchStatement()) == false)
            return false;
        if (other.getXssMatchStatement() == null ^ this.getXssMatchStatement() == null)
            return false;
        if (other.getXssMatchStatement() != null && other.getXssMatchStatement().equals(this.getXssMatchStatement()) == false)
            return false;
        if (other.getSizeConstraintStatement() == null ^ this.getSizeConstraintStatement() == null)
            return false;
        if (other.getSizeConstraintStatement() != null && other.getSizeConstraintStatement().equals(this.getSizeConstraintStatement()) == false)
            return false;
        if (other.getGeoMatchStatement() == null ^ this.getGeoMatchStatement() == null)
            return false;
        if (other.getGeoMatchStatement() != null && other.getGeoMatchStatement().equals(this.getGeoMatchStatement()) == false)
            return false;
        if (other.getRuleGroupReferenceStatement() == null ^ this.getRuleGroupReferenceStatement() == null)
            return false;
        if (other.getRuleGroupReferenceStatement() != null && other.getRuleGroupReferenceStatement().equals(this.getRuleGroupReferenceStatement()) == false)
            return false;
        if (other.getIPSetReferenceStatement() == null ^ this.getIPSetReferenceStatement() == null)
            return false;
        if (other.getIPSetReferenceStatement() != null && other.getIPSetReferenceStatement().equals(this.getIPSetReferenceStatement()) == false)
            return false;
        if (other.getRegexPatternSetReferenceStatement() == null ^ this.getRegexPatternSetReferenceStatement() == null)
            return false;
        if (other.getRegexPatternSetReferenceStatement() != null
                && other.getRegexPatternSetReferenceStatement().equals(this.getRegexPatternSetReferenceStatement()) == false)
            return false;
        if (other.getRateBasedStatement() == null ^ this.getRateBasedStatement() == null)
            return false;
        if (other.getRateBasedStatement() != null && other.getRateBasedStatement().equals(this.getRateBasedStatement()) == false)
            return false;
        if (other.getAndStatement() == null ^ this.getAndStatement() == null)
            return false;
        if (other.getAndStatement() != null && other.getAndStatement().equals(this.getAndStatement()) == false)
            return false;
        if (other.getOrStatement() == null ^ this.getOrStatement() == null)
            return false;
        if (other.getOrStatement() != null && other.getOrStatement().equals(this.getOrStatement()) == false)
            return false;
        if (other.getNotStatement() == null ^ this.getNotStatement() == null)
            return false;
        if (other.getNotStatement() != null && other.getNotStatement().equals(this.getNotStatement()) == false)
            return false;
        if (other.getManagedRuleGroupStatement() == null ^ this.getManagedRuleGroupStatement() == null)
            return false;
        if (other.getManagedRuleGroupStatement() != null && other.getManagedRuleGroupStatement().equals(this.getManagedRuleGroupStatement()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getByteMatchStatement() == null) ? 0 : getByteMatchStatement().hashCode());
        hashCode = prime * hashCode + ((getSqliMatchStatement() == null) ? 0 : getSqliMatchStatement().hashCode());
        hashCode = prime * hashCode + ((getXssMatchStatement() == null) ? 0 : getXssMatchStatement().hashCode());
        hashCode = prime * hashCode + ((getSizeConstraintStatement() == null) ? 0 : getSizeConstraintStatement().hashCode());
        hashCode = prime * hashCode + ((getGeoMatchStatement() == null) ? 0 : getGeoMatchStatement().hashCode());
        hashCode = prime * hashCode + ((getRuleGroupReferenceStatement() == null) ? 0 : getRuleGroupReferenceStatement().hashCode());
        hashCode = prime * hashCode + ((getIPSetReferenceStatement() == null) ? 0 : getIPSetReferenceStatement().hashCode());
        hashCode = prime * hashCode + ((getRegexPatternSetReferenceStatement() == null) ? 0 : getRegexPatternSetReferenceStatement().hashCode());
        hashCode = prime * hashCode + ((getRateBasedStatement() == null) ? 0 : getRateBasedStatement().hashCode());
        hashCode = prime * hashCode + ((getAndStatement() == null) ? 0 : getAndStatement().hashCode());
        hashCode = prime * hashCode + ((getOrStatement() == null) ? 0 : getOrStatement().hashCode());
        hashCode = prime * hashCode + ((getNotStatement() == null) ? 0 : getNotStatement().hashCode());
        hashCode = prime * hashCode + ((getManagedRuleGroupStatement() == null) ? 0 : getManagedRuleGroupStatement().hashCode());
        return hashCode;
    }

    @Override
    public Statement clone() {
        try {
            return (Statement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.StatementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
