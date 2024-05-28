/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * The processing guidance for a <a>Rule</a>, used by WAF to determine whether a web request matches the rule.
 * </p>
 * <p>
 * For example specifications, see the examples section of <a>CreateWebACL</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/Statement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Statement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A rule statement that defines a string match search for WAF to apply to web requests. The byte match statement
     * provides the bytes to search for, the location in requests that you want WAF to search, and other settings. The
     * bytes to search for are typically a string that corresponds with ASCII characters. In the WAF console and the
     * developer guide, this is called a string match statement.
     * </p>
     */
    private ByteMatchStatement byteMatchStatement;
    /**
     * <p>
     * A rule statement that inspects for malicious SQL code. Attackers insert malicious SQL code into web requests to
     * do things like modify your database or extract data from it.
     * </p>
     */
    private SqliMatchStatement sqliMatchStatement;
    /**
     * <p>
     * A rule statement that inspects for cross-site scripting (XSS) attacks. In XSS attacks, the attacker uses
     * vulnerabilities in a benign website as a vehicle to inject malicious client-site scripts into other legitimate
     * web browsers.
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
     * If you configure WAF to inspect the request body, WAF inspects only the number of bytes in the body up to the
     * limit for the web ACL and protected resource type. If you know that the request body for your web requests should
     * never exceed the inspection limit, you can use a size constraint statement to block requests that have a larger
     * request body size. For more information about the inspection limits, see <code>Body</code> and
     * <code>JsonBody</code> settings for the <code>FieldToMatch</code> data type.
     * </p>
     * <p>
     * If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI counts as one
     * character. For example, the URI <code>/logo.jpg</code> is nine characters long.
     * </p>
     */
    private SizeConstraintStatement sizeConstraintStatement;
    /**
     * <p>
     * A rule statement that labels web requests by country and region and that matches against web requests based on
     * country code. A geo match rule labels every request that it inspects regardless of whether it finds a match.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To manage requests only by country, you can use this statement by itself and specify the countries that you want
     * to match against in the <code>CountryCodes</code> array.
     * </p>
     * </li>
     * <li>
     * <p>
     * Otherwise, configure your geo match rule with Count action so that it only labels requests. Then, add one or more
     * label match rules to run after the geo match rule and configure them to match against the geographic labels and
     * handle the requests as needed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * WAF labels requests using the alpha-2 country and region codes from the International Organization for
     * Standardization (ISO) 3166 standard. WAF determines the codes using either the IP address in the web request
     * origin or, if you specify it, the address in the geo match <code>ForwardedIPConfig</code>.
     * </p>
     * <p>
     * If you use the web request origin, the label formats are
     * <code>awswaf:clientip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;</code> and
     * <code>awswaf:clientip:geo:country:&lt;ISO country code&gt;</code>.
     * </p>
     * <p>
     * If you use a forwarded IP address, the label formats are
     * <code>awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;</code> and
     * <code>awswaf:forwardedip:geo:country:&lt;ISO country code&gt;</code>.
     * </p>
     * <p>
     * For additional details, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html">Geographic
     * match rule statement</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
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
     * <code>NotStatement</code> or <code>OrStatement</code>. You cannot use a rule group reference statement inside
     * another rule group. You can only reference a rule group as a top-level statement within a rule that you define in
     * a web ACL.
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
     * allows you to use the single set in multiple rules. When you update the referenced set, WAF automatically updates
     * all rules that reference it.
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
     * of your rules. This allows you to use the single set in multiple rules. When you update the referenced set, WAF
     * automatically updates all rules that reference it.
     * </p>
     */
    private RegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
    /**
     * <p>
     * A rate-based rule counts incoming requests and rate limits requests when they are coming at too fast a rate. The
     * rule categorizes requests according to your aggregation criteria, collects them into aggregation instances, and
     * counts and rate limits the requests for each instance.
     * </p>
     * <note>
     * <p>
     * If you change any of these settings in a rule that's currently in use, the change resets the rule's rate limiting
     * counts. This can pause the rule's rate limiting activities for up to a minute.
     * </p>
     * </note>
     * <p>
     * You can specify individual aggregation keys, like IP address or HTTP method. You can also specify aggregation key
     * combinations, like IP address and HTTP method, or HTTP method, query argument, and cookie.
     * </p>
     * <p>
     * Each unique set of values for the aggregation keys that you specify is a separate aggregation instance, with the
     * value from each key contributing to the aggregation instance definition.
     * </p>
     * <p>
     * For example, assume the rule evaluates web requests with the following IP address and HTTP method values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * IP address 10.1.1.1, HTTP method POST
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 10.1.1.1, HTTP method GET
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 127.0.0.0, HTTP method POST
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 10.1.1.1, HTTP method GET
     * </p>
     * </li>
     * </ul>
     * <p>
     * The rule would create different aggregation instances according to your aggregation criteria, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the aggregation criteria is just the IP address, then each individual address is an aggregation instance, and
     * WAF counts requests separately for each. The aggregation instances and request counts for our example would be
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * IP address 10.1.1.1: count 3
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 127.0.0.0: count 1
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * If the aggregation criteria is HTTP method, then each individual HTTP method is an aggregation instance. The
     * aggregation instances and request counts for our example would be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * HTTP method POST: count 2
     * </p>
     * </li>
     * <li>
     * <p>
     * HTTP method GET: count 2
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * If the aggregation criteria is IP address and HTTP method, then each IP address and each HTTP method would
     * contribute to the combined aggregation instance. The aggregation instances and request counts for our example
     * would be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * IP address 10.1.1.1, HTTP method POST: count 1
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 10.1.1.1, HTTP method GET: count 2
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 127.0.0.0, HTTP method POST: count 1
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For any n-tuple of aggregation keys, each unique combination of values for the keys defines a separate
     * aggregation instance, which WAF counts and rate-limits individually.
     * </p>
     * <p>
     * You can optionally nest another statement inside the rate-based statement, to narrow the scope of the rule so
     * that it only counts and rate limits requests that match the nested statement. You can use this nested scope-down
     * statement in conjunction with your aggregation key specifications or you can just count and rate limit all
     * requests that match the scope-down statement, without additional aggregation. When you choose to just manage all
     * requests that match a scope-down statement, the aggregation instance is singular for the rule.
     * </p>
     * <p>
     * You cannot nest a <code>RateBasedStatement</code> inside another statement, for example inside a
     * <code>NotStatement</code> or <code>OrStatement</code>. You can define a <code>RateBasedStatement</code> inside a
     * web ACL and inside a rule group.
     * </p>
     * <p>
     * For additional information about the options, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rate-based-rules.html">Rate limiting web requests
     * using rate-based rules</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * <p>
     * If you only aggregate on the individual IP address or forwarded IP address, you can retrieve the list of IP
     * addresses that WAF is currently rate limiting for a rule through the API call
     * <code>GetRateBasedStatementManagedKeys</code>. This option is not available for other aggregation configurations.
     * </p>
     * <p>
     * WAF tracks and manages web requests separately for each instance of a rate-based rule that you use. For example,
     * if you provide the same rate-based rule settings in two web ACLs, each of the two rule statements represents a
     * separate instance of the rate-based rule and gets its own tracking and management by WAF. If you define a
     * rate-based rule inside a rule group, and then use that rule group in multiple places, each use creates a separate
     * instance of the rate-based rule that gets its own tracking and management by WAF.
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
     * You cannot nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a <code>NotStatement</code>
     * or <code>OrStatement</code>. You cannot use a managed rule group inside another rule group. You can only
     * reference a managed rule group as a top-level statement within a rule that you define in a web ACL.
     * </p>
     * <note>
     * <p>
     * You are charged additional fees when you use the WAF Bot Control managed rule group
     * <code>AWSManagedRulesBotControlRuleSet</code>, the WAF Fraud Control account takeover prevention (ATP) managed
     * rule group <code>AWSManagedRulesATPRuleSet</code>, or the WAF Fraud Control account creation fraud prevention
     * (ACFP) managed rule group <code>AWSManagedRulesACFPRuleSet</code>. For more information, see <a
     * href="http://aws.amazon.com/waf/pricing/">WAF Pricing</a>.
     * </p>
     * </note>
     */
    private ManagedRuleGroupStatement managedRuleGroupStatement;
    /**
     * <p>
     * A rule statement to match against labels that have been added to the web request by rules that have already run
     * in the web ACL.
     * </p>
     * <p>
     * The label match statement provides the label or namespace string to search for. The label string can represent a
     * part or all of the fully qualified label name that had been added to the web request. Fully qualified labels have
     * a prefix, optional namespaces, and label name. The prefix identifies the rule group or web ACL context of the
     * rule that added the label. If you do not provide the fully qualified name in your label match string, WAF
     * performs the search for labels that were added in the same context as the label match statement.
     * </p>
     */
    private LabelMatchStatement labelMatchStatement;
    /**
     * <p>
     * A rule statement used to search web request components for a match against a single regular expression.
     * </p>
     */
    private RegexMatchStatement regexMatchStatement;

    /**
     * <p>
     * A rule statement that defines a string match search for WAF to apply to web requests. The byte match statement
     * provides the bytes to search for, the location in requests that you want WAF to search, and other settings. The
     * bytes to search for are typically a string that corresponds with ASCII characters. In the WAF console and the
     * developer guide, this is called a string match statement.
     * </p>
     * 
     * @param byteMatchStatement
     *        A rule statement that defines a string match search for WAF to apply to web requests. The byte match
     *        statement provides the bytes to search for, the location in requests that you want WAF to search, and
     *        other settings. The bytes to search for are typically a string that corresponds with ASCII characters. In
     *        the WAF console and the developer guide, this is called a string match statement.
     */

    public void setByteMatchStatement(ByteMatchStatement byteMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
    }

    /**
     * <p>
     * A rule statement that defines a string match search for WAF to apply to web requests. The byte match statement
     * provides the bytes to search for, the location in requests that you want WAF to search, and other settings. The
     * bytes to search for are typically a string that corresponds with ASCII characters. In the WAF console and the
     * developer guide, this is called a string match statement.
     * </p>
     * 
     * @return A rule statement that defines a string match search for WAF to apply to web requests. The byte match
     *         statement provides the bytes to search for, the location in requests that you want WAF to search, and
     *         other settings. The bytes to search for are typically a string that corresponds with ASCII characters. In
     *         the WAF console and the developer guide, this is called a string match statement.
     */

    public ByteMatchStatement getByteMatchStatement() {
        return this.byteMatchStatement;
    }

    /**
     * <p>
     * A rule statement that defines a string match search for WAF to apply to web requests. The byte match statement
     * provides the bytes to search for, the location in requests that you want WAF to search, and other settings. The
     * bytes to search for are typically a string that corresponds with ASCII characters. In the WAF console and the
     * developer guide, this is called a string match statement.
     * </p>
     * 
     * @param byteMatchStatement
     *        A rule statement that defines a string match search for WAF to apply to web requests. The byte match
     *        statement provides the bytes to search for, the location in requests that you want WAF to search, and
     *        other settings. The bytes to search for are typically a string that corresponds with ASCII characters. In
     *        the WAF console and the developer guide, this is called a string match statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withByteMatchStatement(ByteMatchStatement byteMatchStatement) {
        setByteMatchStatement(byteMatchStatement);
        return this;
    }

    /**
     * <p>
     * A rule statement that inspects for malicious SQL code. Attackers insert malicious SQL code into web requests to
     * do things like modify your database or extract data from it.
     * </p>
     * 
     * @param sqliMatchStatement
     *        A rule statement that inspects for malicious SQL code. Attackers insert malicious SQL code into web
     *        requests to do things like modify your database or extract data from it.
     */

    public void setSqliMatchStatement(SqliMatchStatement sqliMatchStatement) {
        this.sqliMatchStatement = sqliMatchStatement;
    }

    /**
     * <p>
     * A rule statement that inspects for malicious SQL code. Attackers insert malicious SQL code into web requests to
     * do things like modify your database or extract data from it.
     * </p>
     * 
     * @return A rule statement that inspects for malicious SQL code. Attackers insert malicious SQL code into web
     *         requests to do things like modify your database or extract data from it.
     */

    public SqliMatchStatement getSqliMatchStatement() {
        return this.sqliMatchStatement;
    }

    /**
     * <p>
     * A rule statement that inspects for malicious SQL code. Attackers insert malicious SQL code into web requests to
     * do things like modify your database or extract data from it.
     * </p>
     * 
     * @param sqliMatchStatement
     *        A rule statement that inspects for malicious SQL code. Attackers insert malicious SQL code into web
     *        requests to do things like modify your database or extract data from it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withSqliMatchStatement(SqliMatchStatement sqliMatchStatement) {
        setSqliMatchStatement(sqliMatchStatement);
        return this;
    }

    /**
     * <p>
     * A rule statement that inspects for cross-site scripting (XSS) attacks. In XSS attacks, the attacker uses
     * vulnerabilities in a benign website as a vehicle to inject malicious client-site scripts into other legitimate
     * web browsers.
     * </p>
     * 
     * @param xssMatchStatement
     *        A rule statement that inspects for cross-site scripting (XSS) attacks. In XSS attacks, the attacker uses
     *        vulnerabilities in a benign website as a vehicle to inject malicious client-site scripts into other
     *        legitimate web browsers.
     */

    public void setXssMatchStatement(XssMatchStatement xssMatchStatement) {
        this.xssMatchStatement = xssMatchStatement;
    }

    /**
     * <p>
     * A rule statement that inspects for cross-site scripting (XSS) attacks. In XSS attacks, the attacker uses
     * vulnerabilities in a benign website as a vehicle to inject malicious client-site scripts into other legitimate
     * web browsers.
     * </p>
     * 
     * @return A rule statement that inspects for cross-site scripting (XSS) attacks. In XSS attacks, the attacker uses
     *         vulnerabilities in a benign website as a vehicle to inject malicious client-site scripts into other
     *         legitimate web browsers.
     */

    public XssMatchStatement getXssMatchStatement() {
        return this.xssMatchStatement;
    }

    /**
     * <p>
     * A rule statement that inspects for cross-site scripting (XSS) attacks. In XSS attacks, the attacker uses
     * vulnerabilities in a benign website as a vehicle to inject malicious client-site scripts into other legitimate
     * web browsers.
     * </p>
     * 
     * @param xssMatchStatement
     *        A rule statement that inspects for cross-site scripting (XSS) attacks. In XSS attacks, the attacker uses
     *        vulnerabilities in a benign website as a vehicle to inject malicious client-site scripts into other
     *        legitimate web browsers.
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
     * If you configure WAF to inspect the request body, WAF inspects only the number of bytes in the body up to the
     * limit for the web ACL and protected resource type. If you know that the request body for your web requests should
     * never exceed the inspection limit, you can use a size constraint statement to block requests that have a larger
     * request body size. For more information about the inspection limits, see <code>Body</code> and
     * <code>JsonBody</code> settings for the <code>FieldToMatch</code> data type.
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
     *        If you configure WAF to inspect the request body, WAF inspects only the number of bytes in the body up to
     *        the limit for the web ACL and protected resource type. If you know that the request body for your web
     *        requests should never exceed the inspection limit, you can use a size constraint statement to block
     *        requests that have a larger request body size. For more information about the inspection limits, see
     *        <code>Body</code> and <code>JsonBody</code> settings for the <code>FieldToMatch</code> data type.
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
     * If you configure WAF to inspect the request body, WAF inspects only the number of bytes in the body up to the
     * limit for the web ACL and protected resource type. If you know that the request body for your web requests should
     * never exceed the inspection limit, you can use a size constraint statement to block requests that have a larger
     * request body size. For more information about the inspection limits, see <code>Body</code> and
     * <code>JsonBody</code> settings for the <code>FieldToMatch</code> data type.
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
     *         If you configure WAF to inspect the request body, WAF inspects only the number of bytes in the body up to
     *         the limit for the web ACL and protected resource type. If you know that the request body for your web
     *         requests should never exceed the inspection limit, you can use a size constraint statement to block
     *         requests that have a larger request body size. For more information about the inspection limits, see
     *         <code>Body</code> and <code>JsonBody</code> settings for the <code>FieldToMatch</code> data type.
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
     * If you configure WAF to inspect the request body, WAF inspects only the number of bytes in the body up to the
     * limit for the web ACL and protected resource type. If you know that the request body for your web requests should
     * never exceed the inspection limit, you can use a size constraint statement to block requests that have a larger
     * request body size. For more information about the inspection limits, see <code>Body</code> and
     * <code>JsonBody</code> settings for the <code>FieldToMatch</code> data type.
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
     *        If you configure WAF to inspect the request body, WAF inspects only the number of bytes in the body up to
     *        the limit for the web ACL and protected resource type. If you know that the request body for your web
     *        requests should never exceed the inspection limit, you can use a size constraint statement to block
     *        requests that have a larger request body size. For more information about the inspection limits, see
     *        <code>Body</code> and <code>JsonBody</code> settings for the <code>FieldToMatch</code> data type.
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
     * A rule statement that labels web requests by country and region and that matches against web requests based on
     * country code. A geo match rule labels every request that it inspects regardless of whether it finds a match.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To manage requests only by country, you can use this statement by itself and specify the countries that you want
     * to match against in the <code>CountryCodes</code> array.
     * </p>
     * </li>
     * <li>
     * <p>
     * Otherwise, configure your geo match rule with Count action so that it only labels requests. Then, add one or more
     * label match rules to run after the geo match rule and configure them to match against the geographic labels and
     * handle the requests as needed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * WAF labels requests using the alpha-2 country and region codes from the International Organization for
     * Standardization (ISO) 3166 standard. WAF determines the codes using either the IP address in the web request
     * origin or, if you specify it, the address in the geo match <code>ForwardedIPConfig</code>.
     * </p>
     * <p>
     * If you use the web request origin, the label formats are
     * <code>awswaf:clientip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;</code> and
     * <code>awswaf:clientip:geo:country:&lt;ISO country code&gt;</code>.
     * </p>
     * <p>
     * If you use a forwarded IP address, the label formats are
     * <code>awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;</code> and
     * <code>awswaf:forwardedip:geo:country:&lt;ISO country code&gt;</code>.
     * </p>
     * <p>
     * For additional details, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html">Geographic
     * match rule statement</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @param geoMatchStatement
     *        A rule statement that labels web requests by country and region and that matches against web requests
     *        based on country code. A geo match rule labels every request that it inspects regardless of whether it
     *        finds a match.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To manage requests only by country, you can use this statement by itself and specify the countries that
     *        you want to match against in the <code>CountryCodes</code> array.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Otherwise, configure your geo match rule with Count action so that it only labels requests. Then, add one
     *        or more label match rules to run after the geo match rule and configure them to match against the
     *        geographic labels and handle the requests as needed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        WAF labels requests using the alpha-2 country and region codes from the International Organization for
     *        Standardization (ISO) 3166 standard. WAF determines the codes using either the IP address in the web
     *        request origin or, if you specify it, the address in the geo match <code>ForwardedIPConfig</code>.
     *        </p>
     *        <p>
     *        If you use the web request origin, the label formats are
     *        <code>awswaf:clientip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;</code> and
     *        <code>awswaf:clientip:geo:country:&lt;ISO country code&gt;</code>.
     *        </p>
     *        <p>
     *        If you use a forwarded IP address, the label formats are
     *        <code>awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;</code> and
     *        <code>awswaf:forwardedip:geo:country:&lt;ISO country code&gt;</code>.
     *        </p>
     *        <p>
     *        For additional details, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html"
     *        >Geographic match rule statement</a> in the <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     */

    public void setGeoMatchStatement(GeoMatchStatement geoMatchStatement) {
        this.geoMatchStatement = geoMatchStatement;
    }

    /**
     * <p>
     * A rule statement that labels web requests by country and region and that matches against web requests based on
     * country code. A geo match rule labels every request that it inspects regardless of whether it finds a match.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To manage requests only by country, you can use this statement by itself and specify the countries that you want
     * to match against in the <code>CountryCodes</code> array.
     * </p>
     * </li>
     * <li>
     * <p>
     * Otherwise, configure your geo match rule with Count action so that it only labels requests. Then, add one or more
     * label match rules to run after the geo match rule and configure them to match against the geographic labels and
     * handle the requests as needed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * WAF labels requests using the alpha-2 country and region codes from the International Organization for
     * Standardization (ISO) 3166 standard. WAF determines the codes using either the IP address in the web request
     * origin or, if you specify it, the address in the geo match <code>ForwardedIPConfig</code>.
     * </p>
     * <p>
     * If you use the web request origin, the label formats are
     * <code>awswaf:clientip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;</code> and
     * <code>awswaf:clientip:geo:country:&lt;ISO country code&gt;</code>.
     * </p>
     * <p>
     * If you use a forwarded IP address, the label formats are
     * <code>awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;</code> and
     * <code>awswaf:forwardedip:geo:country:&lt;ISO country code&gt;</code>.
     * </p>
     * <p>
     * For additional details, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html">Geographic
     * match rule statement</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @return A rule statement that labels web requests by country and region and that matches against web requests
     *         based on country code. A geo match rule labels every request that it inspects regardless of whether it
     *         finds a match.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         To manage requests only by country, you can use this statement by itself and specify the countries that
     *         you want to match against in the <code>CountryCodes</code> array.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Otherwise, configure your geo match rule with Count action so that it only labels requests. Then, add one
     *         or more label match rules to run after the geo match rule and configure them to match against the
     *         geographic labels and handle the requests as needed.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         WAF labels requests using the alpha-2 country and region codes from the International Organization for
     *         Standardization (ISO) 3166 standard. WAF determines the codes using either the IP address in the web
     *         request origin or, if you specify it, the address in the geo match <code>ForwardedIPConfig</code>.
     *         </p>
     *         <p>
     *         If you use the web request origin, the label formats are
     *         <code>awswaf:clientip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;</code> and
     *         <code>awswaf:clientip:geo:country:&lt;ISO country code&gt;</code>.
     *         </p>
     *         <p>
     *         If you use a forwarded IP address, the label formats are
     *         <code>awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;</code> and
     *         <code>awswaf:forwardedip:geo:country:&lt;ISO country code&gt;</code>.
     *         </p>
     *         <p>
     *         For additional details, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html"
     *         >Geographic match rule statement</a> in the <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     */

    public GeoMatchStatement getGeoMatchStatement() {
        return this.geoMatchStatement;
    }

    /**
     * <p>
     * A rule statement that labels web requests by country and region and that matches against web requests based on
     * country code. A geo match rule labels every request that it inspects regardless of whether it finds a match.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To manage requests only by country, you can use this statement by itself and specify the countries that you want
     * to match against in the <code>CountryCodes</code> array.
     * </p>
     * </li>
     * <li>
     * <p>
     * Otherwise, configure your geo match rule with Count action so that it only labels requests. Then, add one or more
     * label match rules to run after the geo match rule and configure them to match against the geographic labels and
     * handle the requests as needed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * WAF labels requests using the alpha-2 country and region codes from the International Organization for
     * Standardization (ISO) 3166 standard. WAF determines the codes using either the IP address in the web request
     * origin or, if you specify it, the address in the geo match <code>ForwardedIPConfig</code>.
     * </p>
     * <p>
     * If you use the web request origin, the label formats are
     * <code>awswaf:clientip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;</code> and
     * <code>awswaf:clientip:geo:country:&lt;ISO country code&gt;</code>.
     * </p>
     * <p>
     * If you use a forwarded IP address, the label formats are
     * <code>awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;</code> and
     * <code>awswaf:forwardedip:geo:country:&lt;ISO country code&gt;</code>.
     * </p>
     * <p>
     * For additional details, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html">Geographic
     * match rule statement</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
     * </p>
     * 
     * @param geoMatchStatement
     *        A rule statement that labels web requests by country and region and that matches against web requests
     *        based on country code. A geo match rule labels every request that it inspects regardless of whether it
     *        finds a match.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To manage requests only by country, you can use this statement by itself and specify the countries that
     *        you want to match against in the <code>CountryCodes</code> array.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Otherwise, configure your geo match rule with Count action so that it only labels requests. Then, add one
     *        or more label match rules to run after the geo match rule and configure them to match against the
     *        geographic labels and handle the requests as needed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        WAF labels requests using the alpha-2 country and region codes from the International Organization for
     *        Standardization (ISO) 3166 standard. WAF determines the codes using either the IP address in the web
     *        request origin or, if you specify it, the address in the geo match <code>ForwardedIPConfig</code>.
     *        </p>
     *        <p>
     *        If you use the web request origin, the label formats are
     *        <code>awswaf:clientip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;</code> and
     *        <code>awswaf:clientip:geo:country:&lt;ISO country code&gt;</code>.
     *        </p>
     *        <p>
     *        If you use a forwarded IP address, the label formats are
     *        <code>awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;</code> and
     *        <code>awswaf:forwardedip:geo:country:&lt;ISO country code&gt;</code>.
     *        </p>
     *        <p>
     *        For additional details, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html"
     *        >Geographic match rule statement</a> in the <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF Developer Guide</a>.
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
     * <code>NotStatement</code> or <code>OrStatement</code>. You cannot use a rule group reference statement inside
     * another rule group. You can only reference a rule group as a top-level statement within a rule that you define in
     * a web ACL.
     * </p>
     * 
     * @param ruleGroupReferenceStatement
     *        A rule statement used to run the rules that are defined in a <a>RuleGroup</a>. To use this, create a rule
     *        group with your rules, then provide the ARN of the rule group in this statement.</p>
     *        <p>
     *        You cannot nest a <code>RuleGroupReferenceStatement</code>, for example for use inside a
     *        <code>NotStatement</code> or <code>OrStatement</code>. You cannot use a rule group reference statement
     *        inside another rule group. You can only reference a rule group as a top-level statement within a rule that
     *        you define in a web ACL.
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
     * <code>NotStatement</code> or <code>OrStatement</code>. You cannot use a rule group reference statement inside
     * another rule group. You can only reference a rule group as a top-level statement within a rule that you define in
     * a web ACL.
     * </p>
     * 
     * @return A rule statement used to run the rules that are defined in a <a>RuleGroup</a>. To use this, create a rule
     *         group with your rules, then provide the ARN of the rule group in this statement.</p>
     *         <p>
     *         You cannot nest a <code>RuleGroupReferenceStatement</code>, for example for use inside a
     *         <code>NotStatement</code> or <code>OrStatement</code>. You cannot use a rule group reference statement
     *         inside another rule group. You can only reference a rule group as a top-level statement within a rule
     *         that you define in a web ACL.
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
     * <code>NotStatement</code> or <code>OrStatement</code>. You cannot use a rule group reference statement inside
     * another rule group. You can only reference a rule group as a top-level statement within a rule that you define in
     * a web ACL.
     * </p>
     * 
     * @param ruleGroupReferenceStatement
     *        A rule statement used to run the rules that are defined in a <a>RuleGroup</a>. To use this, create a rule
     *        group with your rules, then provide the ARN of the rule group in this statement.</p>
     *        <p>
     *        You cannot nest a <code>RuleGroupReferenceStatement</code>, for example for use inside a
     *        <code>NotStatement</code> or <code>OrStatement</code>. You cannot use a rule group reference statement
     *        inside another rule group. You can only reference a rule group as a top-level statement within a rule that
     *        you define in a web ACL.
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
     * allows you to use the single set in multiple rules. When you update the referenced set, WAF automatically updates
     * all rules that reference it.
     * </p>
     * 
     * @param iPSetReferenceStatement
     *        A rule statement used to detect web requests coming from particular IP addresses or address ranges. To use
     *        this, create an <a>IPSet</a> that specifies the addresses you want to detect, then use the ARN of that set
     *        in this statement. To create an IP set, see <a>CreateIPSet</a>.</p>
     *        <p>
     *        Each IP set rule statement references an IP set. You create and maintain the set independent of your
     *        rules. This allows you to use the single set in multiple rules. When you update the referenced set, WAF
     *        automatically updates all rules that reference it.
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
     * allows you to use the single set in multiple rules. When you update the referenced set, WAF automatically updates
     * all rules that reference it.
     * </p>
     * 
     * @return A rule statement used to detect web requests coming from particular IP addresses or address ranges. To
     *         use this, create an <a>IPSet</a> that specifies the addresses you want to detect, then use the ARN of
     *         that set in this statement. To create an IP set, see <a>CreateIPSet</a>.</p>
     *         <p>
     *         Each IP set rule statement references an IP set. You create and maintain the set independent of your
     *         rules. This allows you to use the single set in multiple rules. When you update the referenced set, WAF
     *         automatically updates all rules that reference it.
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
     * allows you to use the single set in multiple rules. When you update the referenced set, WAF automatically updates
     * all rules that reference it.
     * </p>
     * 
     * @param iPSetReferenceStatement
     *        A rule statement used to detect web requests coming from particular IP addresses or address ranges. To use
     *        this, create an <a>IPSet</a> that specifies the addresses you want to detect, then use the ARN of that set
     *        in this statement. To create an IP set, see <a>CreateIPSet</a>.</p>
     *        <p>
     *        Each IP set rule statement references an IP set. You create and maintain the set independent of your
     *        rules. This allows you to use the single set in multiple rules. When you update the referenced set, WAF
     *        automatically updates all rules that reference it.
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
     * of your rules. This allows you to use the single set in multiple rules. When you update the referenced set, WAF
     * automatically updates all rules that reference it.
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
     *        referenced set, WAF automatically updates all rules that reference it.
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
     * of your rules. This allows you to use the single set in multiple rules. When you update the referenced set, WAF
     * automatically updates all rules that reference it.
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
     *         referenced set, WAF automatically updates all rules that reference it.
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
     * of your rules. This allows you to use the single set in multiple rules. When you update the referenced set, WAF
     * automatically updates all rules that reference it.
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
     *        referenced set, WAF automatically updates all rules that reference it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withRegexPatternSetReferenceStatement(RegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
        setRegexPatternSetReferenceStatement(regexPatternSetReferenceStatement);
        return this;
    }

    /**
     * <p>
     * A rate-based rule counts incoming requests and rate limits requests when they are coming at too fast a rate. The
     * rule categorizes requests according to your aggregation criteria, collects them into aggregation instances, and
     * counts and rate limits the requests for each instance.
     * </p>
     * <note>
     * <p>
     * If you change any of these settings in a rule that's currently in use, the change resets the rule's rate limiting
     * counts. This can pause the rule's rate limiting activities for up to a minute.
     * </p>
     * </note>
     * <p>
     * You can specify individual aggregation keys, like IP address or HTTP method. You can also specify aggregation key
     * combinations, like IP address and HTTP method, or HTTP method, query argument, and cookie.
     * </p>
     * <p>
     * Each unique set of values for the aggregation keys that you specify is a separate aggregation instance, with the
     * value from each key contributing to the aggregation instance definition.
     * </p>
     * <p>
     * For example, assume the rule evaluates web requests with the following IP address and HTTP method values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * IP address 10.1.1.1, HTTP method POST
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 10.1.1.1, HTTP method GET
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 127.0.0.0, HTTP method POST
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 10.1.1.1, HTTP method GET
     * </p>
     * </li>
     * </ul>
     * <p>
     * The rule would create different aggregation instances according to your aggregation criteria, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the aggregation criteria is just the IP address, then each individual address is an aggregation instance, and
     * WAF counts requests separately for each. The aggregation instances and request counts for our example would be
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * IP address 10.1.1.1: count 3
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 127.0.0.0: count 1
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * If the aggregation criteria is HTTP method, then each individual HTTP method is an aggregation instance. The
     * aggregation instances and request counts for our example would be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * HTTP method POST: count 2
     * </p>
     * </li>
     * <li>
     * <p>
     * HTTP method GET: count 2
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * If the aggregation criteria is IP address and HTTP method, then each IP address and each HTTP method would
     * contribute to the combined aggregation instance. The aggregation instances and request counts for our example
     * would be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * IP address 10.1.1.1, HTTP method POST: count 1
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 10.1.1.1, HTTP method GET: count 2
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 127.0.0.0, HTTP method POST: count 1
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For any n-tuple of aggregation keys, each unique combination of values for the keys defines a separate
     * aggregation instance, which WAF counts and rate-limits individually.
     * </p>
     * <p>
     * You can optionally nest another statement inside the rate-based statement, to narrow the scope of the rule so
     * that it only counts and rate limits requests that match the nested statement. You can use this nested scope-down
     * statement in conjunction with your aggregation key specifications or you can just count and rate limit all
     * requests that match the scope-down statement, without additional aggregation. When you choose to just manage all
     * requests that match a scope-down statement, the aggregation instance is singular for the rule.
     * </p>
     * <p>
     * You cannot nest a <code>RateBasedStatement</code> inside another statement, for example inside a
     * <code>NotStatement</code> or <code>OrStatement</code>. You can define a <code>RateBasedStatement</code> inside a
     * web ACL and inside a rule group.
     * </p>
     * <p>
     * For additional information about the options, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rate-based-rules.html">Rate limiting web requests
     * using rate-based rules</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * <p>
     * If you only aggregate on the individual IP address or forwarded IP address, you can retrieve the list of IP
     * addresses that WAF is currently rate limiting for a rule through the API call
     * <code>GetRateBasedStatementManagedKeys</code>. This option is not available for other aggregation configurations.
     * </p>
     * <p>
     * WAF tracks and manages web requests separately for each instance of a rate-based rule that you use. For example,
     * if you provide the same rate-based rule settings in two web ACLs, each of the two rule statements represents a
     * separate instance of the rate-based rule and gets its own tracking and management by WAF. If you define a
     * rate-based rule inside a rule group, and then use that rule group in multiple places, each use creates a separate
     * instance of the rate-based rule that gets its own tracking and management by WAF.
     * </p>
     * 
     * @param rateBasedStatement
     *        A rate-based rule counts incoming requests and rate limits requests when they are coming at too fast a
     *        rate. The rule categorizes requests according to your aggregation criteria, collects them into aggregation
     *        instances, and counts and rate limits the requests for each instance. </p> <note>
     *        <p>
     *        If you change any of these settings in a rule that's currently in use, the change resets the rule's rate
     *        limiting counts. This can pause the rule's rate limiting activities for up to a minute.
     *        </p>
     *        </note>
     *        <p>
     *        You can specify individual aggregation keys, like IP address or HTTP method. You can also specify
     *        aggregation key combinations, like IP address and HTTP method, or HTTP method, query argument, and cookie.
     *        </p>
     *        <p>
     *        Each unique set of values for the aggregation keys that you specify is a separate aggregation instance,
     *        with the value from each key contributing to the aggregation instance definition.
     *        </p>
     *        <p>
     *        For example, assume the rule evaluates web requests with the following IP address and HTTP method values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        IP address 10.1.1.1, HTTP method POST
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IP address 10.1.1.1, HTTP method GET
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IP address 127.0.0.0, HTTP method POST
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IP address 10.1.1.1, HTTP method GET
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The rule would create different aggregation instances according to your aggregation criteria, for example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the aggregation criteria is just the IP address, then each individual address is an aggregation
     *        instance, and WAF counts requests separately for each. The aggregation instances and request counts for
     *        our example would be the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        IP address 10.1.1.1: count 3
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IP address 127.0.0.0: count 1
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        If the aggregation criteria is HTTP method, then each individual HTTP method is an aggregation instance.
     *        The aggregation instances and request counts for our example would be the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        HTTP method POST: count 2
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HTTP method GET: count 2
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        If the aggregation criteria is IP address and HTTP method, then each IP address and each HTTP method would
     *        contribute to the combined aggregation instance. The aggregation instances and request counts for our
     *        example would be the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        IP address 10.1.1.1, HTTP method POST: count 1
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IP address 10.1.1.1, HTTP method GET: count 2
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IP address 127.0.0.0, HTTP method POST: count 1
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        For any n-tuple of aggregation keys, each unique combination of values for the keys defines a separate
     *        aggregation instance, which WAF counts and rate-limits individually.
     *        </p>
     *        <p>
     *        You can optionally nest another statement inside the rate-based statement, to narrow the scope of the rule
     *        so that it only counts and rate limits requests that match the nested statement. You can use this nested
     *        scope-down statement in conjunction with your aggregation key specifications or you can just count and
     *        rate limit all requests that match the scope-down statement, without additional aggregation. When you
     *        choose to just manage all requests that match a scope-down statement, the aggregation instance is singular
     *        for the rule.
     *        </p>
     *        <p>
     *        You cannot nest a <code>RateBasedStatement</code> inside another statement, for example inside a
     *        <code>NotStatement</code> or <code>OrStatement</code>. You can define a <code>RateBasedStatement</code>
     *        inside a web ACL and inside a rule group.
     *        </p>
     *        <p>
     *        For additional information about the options, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rate-based-rules.html">Rate limiting web
     *        requests using rate-based rules</a> in the <i>WAF Developer Guide</i>.
     *        </p>
     *        <p>
     *        If you only aggregate on the individual IP address or forwarded IP address, you can retrieve the list of
     *        IP addresses that WAF is currently rate limiting for a rule through the API call
     *        <code>GetRateBasedStatementManagedKeys</code>. This option is not available for other aggregation
     *        configurations.
     *        </p>
     *        <p>
     *        WAF tracks and manages web requests separately for each instance of a rate-based rule that you use. For
     *        example, if you provide the same rate-based rule settings in two web ACLs, each of the two rule statements
     *        represents a separate instance of the rate-based rule and gets its own tracking and management by WAF. If
     *        you define a rate-based rule inside a rule group, and then use that rule group in multiple places, each
     *        use creates a separate instance of the rate-based rule that gets its own tracking and management by WAF.
     */

    public void setRateBasedStatement(RateBasedStatement rateBasedStatement) {
        this.rateBasedStatement = rateBasedStatement;
    }

    /**
     * <p>
     * A rate-based rule counts incoming requests and rate limits requests when they are coming at too fast a rate. The
     * rule categorizes requests according to your aggregation criteria, collects them into aggregation instances, and
     * counts and rate limits the requests for each instance.
     * </p>
     * <note>
     * <p>
     * If you change any of these settings in a rule that's currently in use, the change resets the rule's rate limiting
     * counts. This can pause the rule's rate limiting activities for up to a minute.
     * </p>
     * </note>
     * <p>
     * You can specify individual aggregation keys, like IP address or HTTP method. You can also specify aggregation key
     * combinations, like IP address and HTTP method, or HTTP method, query argument, and cookie.
     * </p>
     * <p>
     * Each unique set of values for the aggregation keys that you specify is a separate aggregation instance, with the
     * value from each key contributing to the aggregation instance definition.
     * </p>
     * <p>
     * For example, assume the rule evaluates web requests with the following IP address and HTTP method values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * IP address 10.1.1.1, HTTP method POST
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 10.1.1.1, HTTP method GET
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 127.0.0.0, HTTP method POST
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 10.1.1.1, HTTP method GET
     * </p>
     * </li>
     * </ul>
     * <p>
     * The rule would create different aggregation instances according to your aggregation criteria, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the aggregation criteria is just the IP address, then each individual address is an aggregation instance, and
     * WAF counts requests separately for each. The aggregation instances and request counts for our example would be
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * IP address 10.1.1.1: count 3
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 127.0.0.0: count 1
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * If the aggregation criteria is HTTP method, then each individual HTTP method is an aggregation instance. The
     * aggregation instances and request counts for our example would be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * HTTP method POST: count 2
     * </p>
     * </li>
     * <li>
     * <p>
     * HTTP method GET: count 2
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * If the aggregation criteria is IP address and HTTP method, then each IP address and each HTTP method would
     * contribute to the combined aggregation instance. The aggregation instances and request counts for our example
     * would be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * IP address 10.1.1.1, HTTP method POST: count 1
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 10.1.1.1, HTTP method GET: count 2
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 127.0.0.0, HTTP method POST: count 1
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For any n-tuple of aggregation keys, each unique combination of values for the keys defines a separate
     * aggregation instance, which WAF counts and rate-limits individually.
     * </p>
     * <p>
     * You can optionally nest another statement inside the rate-based statement, to narrow the scope of the rule so
     * that it only counts and rate limits requests that match the nested statement. You can use this nested scope-down
     * statement in conjunction with your aggregation key specifications or you can just count and rate limit all
     * requests that match the scope-down statement, without additional aggregation. When you choose to just manage all
     * requests that match a scope-down statement, the aggregation instance is singular for the rule.
     * </p>
     * <p>
     * You cannot nest a <code>RateBasedStatement</code> inside another statement, for example inside a
     * <code>NotStatement</code> or <code>OrStatement</code>. You can define a <code>RateBasedStatement</code> inside a
     * web ACL and inside a rule group.
     * </p>
     * <p>
     * For additional information about the options, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rate-based-rules.html">Rate limiting web requests
     * using rate-based rules</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * <p>
     * If you only aggregate on the individual IP address or forwarded IP address, you can retrieve the list of IP
     * addresses that WAF is currently rate limiting for a rule through the API call
     * <code>GetRateBasedStatementManagedKeys</code>. This option is not available for other aggregation configurations.
     * </p>
     * <p>
     * WAF tracks and manages web requests separately for each instance of a rate-based rule that you use. For example,
     * if you provide the same rate-based rule settings in two web ACLs, each of the two rule statements represents a
     * separate instance of the rate-based rule and gets its own tracking and management by WAF. If you define a
     * rate-based rule inside a rule group, and then use that rule group in multiple places, each use creates a separate
     * instance of the rate-based rule that gets its own tracking and management by WAF.
     * </p>
     * 
     * @return A rate-based rule counts incoming requests and rate limits requests when they are coming at too fast a
     *         rate. The rule categorizes requests according to your aggregation criteria, collects them into
     *         aggregation instances, and counts and rate limits the requests for each instance. </p> <note>
     *         <p>
     *         If you change any of these settings in a rule that's currently in use, the change resets the rule's rate
     *         limiting counts. This can pause the rule's rate limiting activities for up to a minute.
     *         </p>
     *         </note>
     *         <p>
     *         You can specify individual aggregation keys, like IP address or HTTP method. You can also specify
     *         aggregation key combinations, like IP address and HTTP method, or HTTP method, query argument, and
     *         cookie.
     *         </p>
     *         <p>
     *         Each unique set of values for the aggregation keys that you specify is a separate aggregation instance,
     *         with the value from each key contributing to the aggregation instance definition.
     *         </p>
     *         <p>
     *         For example, assume the rule evaluates web requests with the following IP address and HTTP method values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         IP address 10.1.1.1, HTTP method POST
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IP address 10.1.1.1, HTTP method GET
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IP address 127.0.0.0, HTTP method POST
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IP address 10.1.1.1, HTTP method GET
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The rule would create different aggregation instances according to your aggregation criteria, for
     *         example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the aggregation criteria is just the IP address, then each individual address is an aggregation
     *         instance, and WAF counts requests separately for each. The aggregation instances and request counts for
     *         our example would be the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         IP address 10.1.1.1: count 3
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IP address 127.0.0.0: count 1
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         If the aggregation criteria is HTTP method, then each individual HTTP method is an aggregation instance.
     *         The aggregation instances and request counts for our example would be the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         HTTP method POST: count 2
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HTTP method GET: count 2
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         If the aggregation criteria is IP address and HTTP method, then each IP address and each HTTP method
     *         would contribute to the combined aggregation instance. The aggregation instances and request counts for
     *         our example would be the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         IP address 10.1.1.1, HTTP method POST: count 1
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IP address 10.1.1.1, HTTP method GET: count 2
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IP address 127.0.0.0, HTTP method POST: count 1
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         For any n-tuple of aggregation keys, each unique combination of values for the keys defines a separate
     *         aggregation instance, which WAF counts and rate-limits individually.
     *         </p>
     *         <p>
     *         You can optionally nest another statement inside the rate-based statement, to narrow the scope of the
     *         rule so that it only counts and rate limits requests that match the nested statement. You can use this
     *         nested scope-down statement in conjunction with your aggregation key specifications or you can just count
     *         and rate limit all requests that match the scope-down statement, without additional aggregation. When you
     *         choose to just manage all requests that match a scope-down statement, the aggregation instance is
     *         singular for the rule.
     *         </p>
     *         <p>
     *         You cannot nest a <code>RateBasedStatement</code> inside another statement, for example inside a
     *         <code>NotStatement</code> or <code>OrStatement</code>. You can define a <code>RateBasedStatement</code>
     *         inside a web ACL and inside a rule group.
     *         </p>
     *         <p>
     *         For additional information about the options, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rate-based-rules.html">Rate limiting web
     *         requests using rate-based rules</a> in the <i>WAF Developer Guide</i>.
     *         </p>
     *         <p>
     *         If you only aggregate on the individual IP address or forwarded IP address, you can retrieve the list of
     *         IP addresses that WAF is currently rate limiting for a rule through the API call
     *         <code>GetRateBasedStatementManagedKeys</code>. This option is not available for other aggregation
     *         configurations.
     *         </p>
     *         <p>
     *         WAF tracks and manages web requests separately for each instance of a rate-based rule that you use. For
     *         example, if you provide the same rate-based rule settings in two web ACLs, each of the two rule
     *         statements represents a separate instance of the rate-based rule and gets its own tracking and management
     *         by WAF. If you define a rate-based rule inside a rule group, and then use that rule group in multiple
     *         places, each use creates a separate instance of the rate-based rule that gets its own tracking and
     *         management by WAF.
     */

    public RateBasedStatement getRateBasedStatement() {
        return this.rateBasedStatement;
    }

    /**
     * <p>
     * A rate-based rule counts incoming requests and rate limits requests when they are coming at too fast a rate. The
     * rule categorizes requests according to your aggregation criteria, collects them into aggregation instances, and
     * counts and rate limits the requests for each instance.
     * </p>
     * <note>
     * <p>
     * If you change any of these settings in a rule that's currently in use, the change resets the rule's rate limiting
     * counts. This can pause the rule's rate limiting activities for up to a minute.
     * </p>
     * </note>
     * <p>
     * You can specify individual aggregation keys, like IP address or HTTP method. You can also specify aggregation key
     * combinations, like IP address and HTTP method, or HTTP method, query argument, and cookie.
     * </p>
     * <p>
     * Each unique set of values for the aggregation keys that you specify is a separate aggregation instance, with the
     * value from each key contributing to the aggregation instance definition.
     * </p>
     * <p>
     * For example, assume the rule evaluates web requests with the following IP address and HTTP method values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * IP address 10.1.1.1, HTTP method POST
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 10.1.1.1, HTTP method GET
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 127.0.0.0, HTTP method POST
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 10.1.1.1, HTTP method GET
     * </p>
     * </li>
     * </ul>
     * <p>
     * The rule would create different aggregation instances according to your aggregation criteria, for example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the aggregation criteria is just the IP address, then each individual address is an aggregation instance, and
     * WAF counts requests separately for each. The aggregation instances and request counts for our example would be
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * IP address 10.1.1.1: count 3
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 127.0.0.0: count 1
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * If the aggregation criteria is HTTP method, then each individual HTTP method is an aggregation instance. The
     * aggregation instances and request counts for our example would be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * HTTP method POST: count 2
     * </p>
     * </li>
     * <li>
     * <p>
     * HTTP method GET: count 2
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * If the aggregation criteria is IP address and HTTP method, then each IP address and each HTTP method would
     * contribute to the combined aggregation instance. The aggregation instances and request counts for our example
     * would be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * IP address 10.1.1.1, HTTP method POST: count 1
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 10.1.1.1, HTTP method GET: count 2
     * </p>
     * </li>
     * <li>
     * <p>
     * IP address 127.0.0.0, HTTP method POST: count 1
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For any n-tuple of aggregation keys, each unique combination of values for the keys defines a separate
     * aggregation instance, which WAF counts and rate-limits individually.
     * </p>
     * <p>
     * You can optionally nest another statement inside the rate-based statement, to narrow the scope of the rule so
     * that it only counts and rate limits requests that match the nested statement. You can use this nested scope-down
     * statement in conjunction with your aggregation key specifications or you can just count and rate limit all
     * requests that match the scope-down statement, without additional aggregation. When you choose to just manage all
     * requests that match a scope-down statement, the aggregation instance is singular for the rule.
     * </p>
     * <p>
     * You cannot nest a <code>RateBasedStatement</code> inside another statement, for example inside a
     * <code>NotStatement</code> or <code>OrStatement</code>. You can define a <code>RateBasedStatement</code> inside a
     * web ACL and inside a rule group.
     * </p>
     * <p>
     * For additional information about the options, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rate-based-rules.html">Rate limiting web requests
     * using rate-based rules</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * <p>
     * If you only aggregate on the individual IP address or forwarded IP address, you can retrieve the list of IP
     * addresses that WAF is currently rate limiting for a rule through the API call
     * <code>GetRateBasedStatementManagedKeys</code>. This option is not available for other aggregation configurations.
     * </p>
     * <p>
     * WAF tracks and manages web requests separately for each instance of a rate-based rule that you use. For example,
     * if you provide the same rate-based rule settings in two web ACLs, each of the two rule statements represents a
     * separate instance of the rate-based rule and gets its own tracking and management by WAF. If you define a
     * rate-based rule inside a rule group, and then use that rule group in multiple places, each use creates a separate
     * instance of the rate-based rule that gets its own tracking and management by WAF.
     * </p>
     * 
     * @param rateBasedStatement
     *        A rate-based rule counts incoming requests and rate limits requests when they are coming at too fast a
     *        rate. The rule categorizes requests according to your aggregation criteria, collects them into aggregation
     *        instances, and counts and rate limits the requests for each instance. </p> <note>
     *        <p>
     *        If you change any of these settings in a rule that's currently in use, the change resets the rule's rate
     *        limiting counts. This can pause the rule's rate limiting activities for up to a minute.
     *        </p>
     *        </note>
     *        <p>
     *        You can specify individual aggregation keys, like IP address or HTTP method. You can also specify
     *        aggregation key combinations, like IP address and HTTP method, or HTTP method, query argument, and cookie.
     *        </p>
     *        <p>
     *        Each unique set of values for the aggregation keys that you specify is a separate aggregation instance,
     *        with the value from each key contributing to the aggregation instance definition.
     *        </p>
     *        <p>
     *        For example, assume the rule evaluates web requests with the following IP address and HTTP method values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        IP address 10.1.1.1, HTTP method POST
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IP address 10.1.1.1, HTTP method GET
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IP address 127.0.0.0, HTTP method POST
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IP address 10.1.1.1, HTTP method GET
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The rule would create different aggregation instances according to your aggregation criteria, for example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the aggregation criteria is just the IP address, then each individual address is an aggregation
     *        instance, and WAF counts requests separately for each. The aggregation instances and request counts for
     *        our example would be the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        IP address 10.1.1.1: count 3
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IP address 127.0.0.0: count 1
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        If the aggregation criteria is HTTP method, then each individual HTTP method is an aggregation instance.
     *        The aggregation instances and request counts for our example would be the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        HTTP method POST: count 2
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HTTP method GET: count 2
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        If the aggregation criteria is IP address and HTTP method, then each IP address and each HTTP method would
     *        contribute to the combined aggregation instance. The aggregation instances and request counts for our
     *        example would be the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        IP address 10.1.1.1, HTTP method POST: count 1
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IP address 10.1.1.1, HTTP method GET: count 2
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IP address 127.0.0.0, HTTP method POST: count 1
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        For any n-tuple of aggregation keys, each unique combination of values for the keys defines a separate
     *        aggregation instance, which WAF counts and rate-limits individually.
     *        </p>
     *        <p>
     *        You can optionally nest another statement inside the rate-based statement, to narrow the scope of the rule
     *        so that it only counts and rate limits requests that match the nested statement. You can use this nested
     *        scope-down statement in conjunction with your aggregation key specifications or you can just count and
     *        rate limit all requests that match the scope-down statement, without additional aggregation. When you
     *        choose to just manage all requests that match a scope-down statement, the aggregation instance is singular
     *        for the rule.
     *        </p>
     *        <p>
     *        You cannot nest a <code>RateBasedStatement</code> inside another statement, for example inside a
     *        <code>NotStatement</code> or <code>OrStatement</code>. You can define a <code>RateBasedStatement</code>
     *        inside a web ACL and inside a rule group.
     *        </p>
     *        <p>
     *        For additional information about the options, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rate-based-rules.html">Rate limiting web
     *        requests using rate-based rules</a> in the <i>WAF Developer Guide</i>.
     *        </p>
     *        <p>
     *        If you only aggregate on the individual IP address or forwarded IP address, you can retrieve the list of
     *        IP addresses that WAF is currently rate limiting for a rule through the API call
     *        <code>GetRateBasedStatementManagedKeys</code>. This option is not available for other aggregation
     *        configurations.
     *        </p>
     *        <p>
     *        WAF tracks and manages web requests separately for each instance of a rate-based rule that you use. For
     *        example, if you provide the same rate-based rule settings in two web ACLs, each of the two rule statements
     *        represents a separate instance of the rate-based rule and gets its own tracking and management by WAF. If
     *        you define a rate-based rule inside a rule group, and then use that rule group in multiple places, each
     *        use creates a separate instance of the rate-based rule that gets its own tracking and management by WAF.
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
     * You cannot nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a <code>NotStatement</code>
     * or <code>OrStatement</code>. You cannot use a managed rule group inside another rule group. You can only
     * reference a managed rule group as a top-level statement within a rule that you define in a web ACL.
     * </p>
     * <note>
     * <p>
     * You are charged additional fees when you use the WAF Bot Control managed rule group
     * <code>AWSManagedRulesBotControlRuleSet</code>, the WAF Fraud Control account takeover prevention (ATP) managed
     * rule group <code>AWSManagedRulesATPRuleSet</code>, or the WAF Fraud Control account creation fraud prevention
     * (ACFP) managed rule group <code>AWSManagedRulesACFPRuleSet</code>. For more information, see <a
     * href="http://aws.amazon.com/waf/pricing/">WAF Pricing</a>.
     * </p>
     * </note>
     * 
     * @param managedRuleGroupStatement
     *        A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the
     *        vendor name and the name of the rule group in this statement. You can retrieve the required names by
     *        calling <a>ListAvailableManagedRuleGroups</a>.</p>
     *        <p>
     *        You cannot nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a
     *        <code>NotStatement</code> or <code>OrStatement</code>. You cannot use a managed rule group inside another
     *        rule group. You can only reference a managed rule group as a top-level statement within a rule that you
     *        define in a web ACL.
     *        </p>
     *        <note>
     *        <p>
     *        You are charged additional fees when you use the WAF Bot Control managed rule group
     *        <code>AWSManagedRulesBotControlRuleSet</code>, the WAF Fraud Control account takeover prevention (ATP)
     *        managed rule group <code>AWSManagedRulesATPRuleSet</code>, or the WAF Fraud Control account creation fraud
     *        prevention (ACFP) managed rule group <code>AWSManagedRulesACFPRuleSet</code>. For more information, see <a
     *        href="http://aws.amazon.com/waf/pricing/">WAF Pricing</a>.
     *        </p>
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
     * You cannot nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a <code>NotStatement</code>
     * or <code>OrStatement</code>. You cannot use a managed rule group inside another rule group. You can only
     * reference a managed rule group as a top-level statement within a rule that you define in a web ACL.
     * </p>
     * <note>
     * <p>
     * You are charged additional fees when you use the WAF Bot Control managed rule group
     * <code>AWSManagedRulesBotControlRuleSet</code>, the WAF Fraud Control account takeover prevention (ATP) managed
     * rule group <code>AWSManagedRulesATPRuleSet</code>, or the WAF Fraud Control account creation fraud prevention
     * (ACFP) managed rule group <code>AWSManagedRulesACFPRuleSet</code>. For more information, see <a
     * href="http://aws.amazon.com/waf/pricing/">WAF Pricing</a>.
     * </p>
     * </note>
     * 
     * @return A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the
     *         vendor name and the name of the rule group in this statement. You can retrieve the required names by
     *         calling <a>ListAvailableManagedRuleGroups</a>.</p>
     *         <p>
     *         You cannot nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a
     *         <code>NotStatement</code> or <code>OrStatement</code>. You cannot use a managed rule group inside another
     *         rule group. You can only reference a managed rule group as a top-level statement within a rule that you
     *         define in a web ACL.
     *         </p>
     *         <note>
     *         <p>
     *         You are charged additional fees when you use the WAF Bot Control managed rule group
     *         <code>AWSManagedRulesBotControlRuleSet</code>, the WAF Fraud Control account takeover prevention (ATP)
     *         managed rule group <code>AWSManagedRulesATPRuleSet</code>, or the WAF Fraud Control account creation
     *         fraud prevention (ACFP) managed rule group <code>AWSManagedRulesACFPRuleSet</code>. For more information,
     *         see <a href="http://aws.amazon.com/waf/pricing/">WAF Pricing</a>.
     *         </p>
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
     * You cannot nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a <code>NotStatement</code>
     * or <code>OrStatement</code>. You cannot use a managed rule group inside another rule group. You can only
     * reference a managed rule group as a top-level statement within a rule that you define in a web ACL.
     * </p>
     * <note>
     * <p>
     * You are charged additional fees when you use the WAF Bot Control managed rule group
     * <code>AWSManagedRulesBotControlRuleSet</code>, the WAF Fraud Control account takeover prevention (ATP) managed
     * rule group <code>AWSManagedRulesATPRuleSet</code>, or the WAF Fraud Control account creation fraud prevention
     * (ACFP) managed rule group <code>AWSManagedRulesACFPRuleSet</code>. For more information, see <a
     * href="http://aws.amazon.com/waf/pricing/">WAF Pricing</a>.
     * </p>
     * </note>
     * 
     * @param managedRuleGroupStatement
     *        A rule statement used to run the rules that are defined in a managed rule group. To use this, provide the
     *        vendor name and the name of the rule group in this statement. You can retrieve the required names by
     *        calling <a>ListAvailableManagedRuleGroups</a>.</p>
     *        <p>
     *        You cannot nest a <code>ManagedRuleGroupStatement</code>, for example for use inside a
     *        <code>NotStatement</code> or <code>OrStatement</code>. You cannot use a managed rule group inside another
     *        rule group. You can only reference a managed rule group as a top-level statement within a rule that you
     *        define in a web ACL.
     *        </p>
     *        <note>
     *        <p>
     *        You are charged additional fees when you use the WAF Bot Control managed rule group
     *        <code>AWSManagedRulesBotControlRuleSet</code>, the WAF Fraud Control account takeover prevention (ATP)
     *        managed rule group <code>AWSManagedRulesATPRuleSet</code>, or the WAF Fraud Control account creation fraud
     *        prevention (ACFP) managed rule group <code>AWSManagedRulesACFPRuleSet</code>. For more information, see <a
     *        href="http://aws.amazon.com/waf/pricing/">WAF Pricing</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withManagedRuleGroupStatement(ManagedRuleGroupStatement managedRuleGroupStatement) {
        setManagedRuleGroupStatement(managedRuleGroupStatement);
        return this;
    }

    /**
     * <p>
     * A rule statement to match against labels that have been added to the web request by rules that have already run
     * in the web ACL.
     * </p>
     * <p>
     * The label match statement provides the label or namespace string to search for. The label string can represent a
     * part or all of the fully qualified label name that had been added to the web request. Fully qualified labels have
     * a prefix, optional namespaces, and label name. The prefix identifies the rule group or web ACL context of the
     * rule that added the label. If you do not provide the fully qualified name in your label match string, WAF
     * performs the search for labels that were added in the same context as the label match statement.
     * </p>
     * 
     * @param labelMatchStatement
     *        A rule statement to match against labels that have been added to the web request by rules that have
     *        already run in the web ACL. </p>
     *        <p>
     *        The label match statement provides the label or namespace string to search for. The label string can
     *        represent a part or all of the fully qualified label name that had been added to the web request. Fully
     *        qualified labels have a prefix, optional namespaces, and label name. The prefix identifies the rule group
     *        or web ACL context of the rule that added the label. If you do not provide the fully qualified name in
     *        your label match string, WAF performs the search for labels that were added in the same context as the
     *        label match statement.
     */

    public void setLabelMatchStatement(LabelMatchStatement labelMatchStatement) {
        this.labelMatchStatement = labelMatchStatement;
    }

    /**
     * <p>
     * A rule statement to match against labels that have been added to the web request by rules that have already run
     * in the web ACL.
     * </p>
     * <p>
     * The label match statement provides the label or namespace string to search for. The label string can represent a
     * part or all of the fully qualified label name that had been added to the web request. Fully qualified labels have
     * a prefix, optional namespaces, and label name. The prefix identifies the rule group or web ACL context of the
     * rule that added the label. If you do not provide the fully qualified name in your label match string, WAF
     * performs the search for labels that were added in the same context as the label match statement.
     * </p>
     * 
     * @return A rule statement to match against labels that have been added to the web request by rules that have
     *         already run in the web ACL. </p>
     *         <p>
     *         The label match statement provides the label or namespace string to search for. The label string can
     *         represent a part or all of the fully qualified label name that had been added to the web request. Fully
     *         qualified labels have a prefix, optional namespaces, and label name. The prefix identifies the rule group
     *         or web ACL context of the rule that added the label. If you do not provide the fully qualified name in
     *         your label match string, WAF performs the search for labels that were added in the same context as the
     *         label match statement.
     */

    public LabelMatchStatement getLabelMatchStatement() {
        return this.labelMatchStatement;
    }

    /**
     * <p>
     * A rule statement to match against labels that have been added to the web request by rules that have already run
     * in the web ACL.
     * </p>
     * <p>
     * The label match statement provides the label or namespace string to search for. The label string can represent a
     * part or all of the fully qualified label name that had been added to the web request. Fully qualified labels have
     * a prefix, optional namespaces, and label name. The prefix identifies the rule group or web ACL context of the
     * rule that added the label. If you do not provide the fully qualified name in your label match string, WAF
     * performs the search for labels that were added in the same context as the label match statement.
     * </p>
     * 
     * @param labelMatchStatement
     *        A rule statement to match against labels that have been added to the web request by rules that have
     *        already run in the web ACL. </p>
     *        <p>
     *        The label match statement provides the label or namespace string to search for. The label string can
     *        represent a part or all of the fully qualified label name that had been added to the web request. Fully
     *        qualified labels have a prefix, optional namespaces, and label name. The prefix identifies the rule group
     *        or web ACL context of the rule that added the label. If you do not provide the fully qualified name in
     *        your label match string, WAF performs the search for labels that were added in the same context as the
     *        label match statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withLabelMatchStatement(LabelMatchStatement labelMatchStatement) {
        setLabelMatchStatement(labelMatchStatement);
        return this;
    }

    /**
     * <p>
     * A rule statement used to search web request components for a match against a single regular expression.
     * </p>
     * 
     * @param regexMatchStatement
     *        A rule statement used to search web request components for a match against a single regular expression.
     */

    public void setRegexMatchStatement(RegexMatchStatement regexMatchStatement) {
        this.regexMatchStatement = regexMatchStatement;
    }

    /**
     * <p>
     * A rule statement used to search web request components for a match against a single regular expression.
     * </p>
     * 
     * @return A rule statement used to search web request components for a match against a single regular expression.
     */

    public RegexMatchStatement getRegexMatchStatement() {
        return this.regexMatchStatement;
    }

    /**
     * <p>
     * A rule statement used to search web request components for a match against a single regular expression.
     * </p>
     * 
     * @param regexMatchStatement
     *        A rule statement used to search web request components for a match against a single regular expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withRegexMatchStatement(RegexMatchStatement regexMatchStatement) {
        setRegexMatchStatement(regexMatchStatement);
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
            sb.append("ManagedRuleGroupStatement: ").append(getManagedRuleGroupStatement()).append(",");
        if (getLabelMatchStatement() != null)
            sb.append("LabelMatchStatement: ").append(getLabelMatchStatement()).append(",");
        if (getRegexMatchStatement() != null)
            sb.append("RegexMatchStatement: ").append(getRegexMatchStatement());
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
        if (other.getLabelMatchStatement() == null ^ this.getLabelMatchStatement() == null)
            return false;
        if (other.getLabelMatchStatement() != null && other.getLabelMatchStatement().equals(this.getLabelMatchStatement()) == false)
            return false;
        if (other.getRegexMatchStatement() == null ^ this.getRegexMatchStatement() == null)
            return false;
        if (other.getRegexMatchStatement() != null && other.getRegexMatchStatement().equals(this.getRegexMatchStatement()) == false)
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
        hashCode = prime * hashCode + ((getLabelMatchStatement() == null) ? 0 : getLabelMatchStatement().hashCode());
        hashCode = prime * hashCode + ((getRegexMatchStatement() == null) ? 0 : getRegexMatchStatement().hashCode());
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
