/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The body of a web request, inspected as JSON. The body immediately follows the request headers. This is used in the
 * <a>FieldToMatch</a> specification.
 * </p>
 * <p>
 * Use the specifications in this object to indicate which parts of the JSON body to inspect using the rule's inspection
 * criteria. AWS WAF inspects only the parts of the JSON that result from the matches that you indicate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/JsonBody" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JsonBody implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The patterns to look for in the JSON body. AWS WAF inspects the results of these pattern matches against the rule
     * inspection criteria.
     * </p>
     */
    private JsonMatchPattern matchPattern;
    /**
     * <p>
     * The parts of the JSON to match against using the <code>MatchPattern</code>. If you specify <code>All</code>, AWS
     * WAF matches against keys and values.
     * </p>
     */
    private String matchScope;
    /**
     * <p>
     * What AWS WAF should do if it fails to completely parse the JSON body. The options are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EVALUATE_AS_STRING</code> - Inspect the body as plain text. AWS WAF applies the text transformations and
     * inspection criteria that you defined for the JSON inspection to the body text string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MATCH</code> - Treat the web request as matching the rule statement. AWS WAF applies the rule action to the
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't provide this setting, AWS WAF parses and evaluates the content only up to the first parsing failure
     * that it encounters.
     * </p>
     * <p>
     * AWS WAF does its best to parse the entire JSON body, but might be forced to stop for reasons such as invalid
     * characters, duplicate keys, truncation, and any content whose root node isn't an object or an array.
     * </p>
     * <p>
     * AWS WAF parses the JSON in the following examples as two valid key, value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Missing comma: <code>{"key1":"value1""key2":"value2"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Missing colon: <code>{"key1":"value1","key2""value2"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Extra colons: <code>{"key1"::"value1","key2""value2"}</code>
     * </p>
     * </li>
     * </ul>
     */
    private String invalidFallbackBehavior;

    /**
     * <p>
     * The patterns to look for in the JSON body. AWS WAF inspects the results of these pattern matches against the rule
     * inspection criteria.
     * </p>
     * 
     * @param matchPattern
     *        The patterns to look for in the JSON body. AWS WAF inspects the results of these pattern matches against
     *        the rule inspection criteria.
     */

    public void setMatchPattern(JsonMatchPattern matchPattern) {
        this.matchPattern = matchPattern;
    }

    /**
     * <p>
     * The patterns to look for in the JSON body. AWS WAF inspects the results of these pattern matches against the rule
     * inspection criteria.
     * </p>
     * 
     * @return The patterns to look for in the JSON body. AWS WAF inspects the results of these pattern matches against
     *         the rule inspection criteria.
     */

    public JsonMatchPattern getMatchPattern() {
        return this.matchPattern;
    }

    /**
     * <p>
     * The patterns to look for in the JSON body. AWS WAF inspects the results of these pattern matches against the rule
     * inspection criteria.
     * </p>
     * 
     * @param matchPattern
     *        The patterns to look for in the JSON body. AWS WAF inspects the results of these pattern matches against
     *        the rule inspection criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JsonBody withMatchPattern(JsonMatchPattern matchPattern) {
        setMatchPattern(matchPattern);
        return this;
    }

    /**
     * <p>
     * The parts of the JSON to match against using the <code>MatchPattern</code>. If you specify <code>All</code>, AWS
     * WAF matches against keys and values.
     * </p>
     * 
     * @param matchScope
     *        The parts of the JSON to match against using the <code>MatchPattern</code>. If you specify
     *        <code>All</code>, AWS WAF matches against keys and values.
     * @see JsonMatchScope
     */

    public void setMatchScope(String matchScope) {
        this.matchScope = matchScope;
    }

    /**
     * <p>
     * The parts of the JSON to match against using the <code>MatchPattern</code>. If you specify <code>All</code>, AWS
     * WAF matches against keys and values.
     * </p>
     * 
     * @return The parts of the JSON to match against using the <code>MatchPattern</code>. If you specify
     *         <code>All</code>, AWS WAF matches against keys and values.
     * @see JsonMatchScope
     */

    public String getMatchScope() {
        return this.matchScope;
    }

    /**
     * <p>
     * The parts of the JSON to match against using the <code>MatchPattern</code>. If you specify <code>All</code>, AWS
     * WAF matches against keys and values.
     * </p>
     * 
     * @param matchScope
     *        The parts of the JSON to match against using the <code>MatchPattern</code>. If you specify
     *        <code>All</code>, AWS WAF matches against keys and values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JsonMatchScope
     */

    public JsonBody withMatchScope(String matchScope) {
        setMatchScope(matchScope);
        return this;
    }

    /**
     * <p>
     * The parts of the JSON to match against using the <code>MatchPattern</code>. If you specify <code>All</code>, AWS
     * WAF matches against keys and values.
     * </p>
     * 
     * @param matchScope
     *        The parts of the JSON to match against using the <code>MatchPattern</code>. If you specify
     *        <code>All</code>, AWS WAF matches against keys and values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JsonMatchScope
     */

    public JsonBody withMatchScope(JsonMatchScope matchScope) {
        this.matchScope = matchScope.toString();
        return this;
    }

    /**
     * <p>
     * What AWS WAF should do if it fails to completely parse the JSON body. The options are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EVALUATE_AS_STRING</code> - Inspect the body as plain text. AWS WAF applies the text transformations and
     * inspection criteria that you defined for the JSON inspection to the body text string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MATCH</code> - Treat the web request as matching the rule statement. AWS WAF applies the rule action to the
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't provide this setting, AWS WAF parses and evaluates the content only up to the first parsing failure
     * that it encounters.
     * </p>
     * <p>
     * AWS WAF does its best to parse the entire JSON body, but might be forced to stop for reasons such as invalid
     * characters, duplicate keys, truncation, and any content whose root node isn't an object or an array.
     * </p>
     * <p>
     * AWS WAF parses the JSON in the following examples as two valid key, value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Missing comma: <code>{"key1":"value1""key2":"value2"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Missing colon: <code>{"key1":"value1","key2""value2"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Extra colons: <code>{"key1"::"value1","key2""value2"}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param invalidFallbackBehavior
     *        What AWS WAF should do if it fails to completely parse the JSON body. The options are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EVALUATE_AS_STRING</code> - Inspect the body as plain text. AWS WAF applies the text transformations
     *        and inspection criteria that you defined for the JSON inspection to the body text string.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MATCH</code> - Treat the web request as matching the rule statement. AWS WAF applies the rule action
     *        to the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't provide this setting, AWS WAF parses and evaluates the content only up to the first parsing
     *        failure that it encounters.
     *        </p>
     *        <p>
     *        AWS WAF does its best to parse the entire JSON body, but might be forced to stop for reasons such as
     *        invalid characters, duplicate keys, truncation, and any content whose root node isn't an object or an
     *        array.
     *        </p>
     *        <p>
     *        AWS WAF parses the JSON in the following examples as two valid key, value pairs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Missing comma: <code>{"key1":"value1""key2":"value2"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Missing colon: <code>{"key1":"value1","key2""value2"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Extra colons: <code>{"key1"::"value1","key2""value2"}</code>
     *        </p>
     *        </li>
     * @see BodyParsingFallbackBehavior
     */

    public void setInvalidFallbackBehavior(String invalidFallbackBehavior) {
        this.invalidFallbackBehavior = invalidFallbackBehavior;
    }

    /**
     * <p>
     * What AWS WAF should do if it fails to completely parse the JSON body. The options are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EVALUATE_AS_STRING</code> - Inspect the body as plain text. AWS WAF applies the text transformations and
     * inspection criteria that you defined for the JSON inspection to the body text string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MATCH</code> - Treat the web request as matching the rule statement. AWS WAF applies the rule action to the
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't provide this setting, AWS WAF parses and evaluates the content only up to the first parsing failure
     * that it encounters.
     * </p>
     * <p>
     * AWS WAF does its best to parse the entire JSON body, but might be forced to stop for reasons such as invalid
     * characters, duplicate keys, truncation, and any content whose root node isn't an object or an array.
     * </p>
     * <p>
     * AWS WAF parses the JSON in the following examples as two valid key, value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Missing comma: <code>{"key1":"value1""key2":"value2"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Missing colon: <code>{"key1":"value1","key2""value2"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Extra colons: <code>{"key1"::"value1","key2""value2"}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return What AWS WAF should do if it fails to completely parse the JSON body. The options are the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>EVALUATE_AS_STRING</code> - Inspect the body as plain text. AWS WAF applies the text
     *         transformations and inspection criteria that you defined for the JSON inspection to the body text string.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MATCH</code> - Treat the web request as matching the rule statement. AWS WAF applies the rule
     *         action to the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't provide this setting, AWS WAF parses and evaluates the content only up to the first parsing
     *         failure that it encounters.
     *         </p>
     *         <p>
     *         AWS WAF does its best to parse the entire JSON body, but might be forced to stop for reasons such as
     *         invalid characters, duplicate keys, truncation, and any content whose root node isn't an object or an
     *         array.
     *         </p>
     *         <p>
     *         AWS WAF parses the JSON in the following examples as two valid key, value pairs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Missing comma: <code>{"key1":"value1""key2":"value2"}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Missing colon: <code>{"key1":"value1","key2""value2"}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Extra colons: <code>{"key1"::"value1","key2""value2"}</code>
     *         </p>
     *         </li>
     * @see BodyParsingFallbackBehavior
     */

    public String getInvalidFallbackBehavior() {
        return this.invalidFallbackBehavior;
    }

    /**
     * <p>
     * What AWS WAF should do if it fails to completely parse the JSON body. The options are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EVALUATE_AS_STRING</code> - Inspect the body as plain text. AWS WAF applies the text transformations and
     * inspection criteria that you defined for the JSON inspection to the body text string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MATCH</code> - Treat the web request as matching the rule statement. AWS WAF applies the rule action to the
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't provide this setting, AWS WAF parses and evaluates the content only up to the first parsing failure
     * that it encounters.
     * </p>
     * <p>
     * AWS WAF does its best to parse the entire JSON body, but might be forced to stop for reasons such as invalid
     * characters, duplicate keys, truncation, and any content whose root node isn't an object or an array.
     * </p>
     * <p>
     * AWS WAF parses the JSON in the following examples as two valid key, value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Missing comma: <code>{"key1":"value1""key2":"value2"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Missing colon: <code>{"key1":"value1","key2""value2"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Extra colons: <code>{"key1"::"value1","key2""value2"}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param invalidFallbackBehavior
     *        What AWS WAF should do if it fails to completely parse the JSON body. The options are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EVALUATE_AS_STRING</code> - Inspect the body as plain text. AWS WAF applies the text transformations
     *        and inspection criteria that you defined for the JSON inspection to the body text string.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MATCH</code> - Treat the web request as matching the rule statement. AWS WAF applies the rule action
     *        to the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't provide this setting, AWS WAF parses and evaluates the content only up to the first parsing
     *        failure that it encounters.
     *        </p>
     *        <p>
     *        AWS WAF does its best to parse the entire JSON body, but might be forced to stop for reasons such as
     *        invalid characters, duplicate keys, truncation, and any content whose root node isn't an object or an
     *        array.
     *        </p>
     *        <p>
     *        AWS WAF parses the JSON in the following examples as two valid key, value pairs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Missing comma: <code>{"key1":"value1""key2":"value2"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Missing colon: <code>{"key1":"value1","key2""value2"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Extra colons: <code>{"key1"::"value1","key2""value2"}</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BodyParsingFallbackBehavior
     */

    public JsonBody withInvalidFallbackBehavior(String invalidFallbackBehavior) {
        setInvalidFallbackBehavior(invalidFallbackBehavior);
        return this;
    }

    /**
     * <p>
     * What AWS WAF should do if it fails to completely parse the JSON body. The options are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EVALUATE_AS_STRING</code> - Inspect the body as plain text. AWS WAF applies the text transformations and
     * inspection criteria that you defined for the JSON inspection to the body text string.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MATCH</code> - Treat the web request as matching the rule statement. AWS WAF applies the rule action to the
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't provide this setting, AWS WAF parses and evaluates the content only up to the first parsing failure
     * that it encounters.
     * </p>
     * <p>
     * AWS WAF does its best to parse the entire JSON body, but might be forced to stop for reasons such as invalid
     * characters, duplicate keys, truncation, and any content whose root node isn't an object or an array.
     * </p>
     * <p>
     * AWS WAF parses the JSON in the following examples as two valid key, value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Missing comma: <code>{"key1":"value1""key2":"value2"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Missing colon: <code>{"key1":"value1","key2""value2"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Extra colons: <code>{"key1"::"value1","key2""value2"}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param invalidFallbackBehavior
     *        What AWS WAF should do if it fails to completely parse the JSON body. The options are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EVALUATE_AS_STRING</code> - Inspect the body as plain text. AWS WAF applies the text transformations
     *        and inspection criteria that you defined for the JSON inspection to the body text string.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MATCH</code> - Treat the web request as matching the rule statement. AWS WAF applies the rule action
     *        to the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_MATCH</code> - Treat the web request as not matching the rule statement.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't provide this setting, AWS WAF parses and evaluates the content only up to the first parsing
     *        failure that it encounters.
     *        </p>
     *        <p>
     *        AWS WAF does its best to parse the entire JSON body, but might be forced to stop for reasons such as
     *        invalid characters, duplicate keys, truncation, and any content whose root node isn't an object or an
     *        array.
     *        </p>
     *        <p>
     *        AWS WAF parses the JSON in the following examples as two valid key, value pairs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Missing comma: <code>{"key1":"value1""key2":"value2"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Missing colon: <code>{"key1":"value1","key2""value2"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Extra colons: <code>{"key1"::"value1","key2""value2"}</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BodyParsingFallbackBehavior
     */

    public JsonBody withInvalidFallbackBehavior(BodyParsingFallbackBehavior invalidFallbackBehavior) {
        this.invalidFallbackBehavior = invalidFallbackBehavior.toString();
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
        if (getMatchPattern() != null)
            sb.append("MatchPattern: ").append(getMatchPattern()).append(",");
        if (getMatchScope() != null)
            sb.append("MatchScope: ").append(getMatchScope()).append(",");
        if (getInvalidFallbackBehavior() != null)
            sb.append("InvalidFallbackBehavior: ").append(getInvalidFallbackBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JsonBody == false)
            return false;
        JsonBody other = (JsonBody) obj;
        if (other.getMatchPattern() == null ^ this.getMatchPattern() == null)
            return false;
        if (other.getMatchPattern() != null && other.getMatchPattern().equals(this.getMatchPattern()) == false)
            return false;
        if (other.getMatchScope() == null ^ this.getMatchScope() == null)
            return false;
        if (other.getMatchScope() != null && other.getMatchScope().equals(this.getMatchScope()) == false)
            return false;
        if (other.getInvalidFallbackBehavior() == null ^ this.getInvalidFallbackBehavior() == null)
            return false;
        if (other.getInvalidFallbackBehavior() != null && other.getInvalidFallbackBehavior().equals(this.getInvalidFallbackBehavior()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMatchPattern() == null) ? 0 : getMatchPattern().hashCode());
        hashCode = prime * hashCode + ((getMatchScope() == null) ? 0 : getMatchScope().hashCode());
        hashCode = prime * hashCode + ((getInvalidFallbackBehavior() == null) ? 0 : getInvalidFallbackBehavior().hashCode());
        return hashCode;
    }

    @Override
    public JsonBody clone() {
        try {
            return (JsonBody) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.JsonBodyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
