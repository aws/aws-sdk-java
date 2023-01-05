/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/TestSegmentPattern" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestSegmentPatternRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The pattern to test.
     * </p>
     */
    private String pattern;
    /**
     * <p>
     * A sample <code>evaluationContext</code> JSON block to test against the specified pattern.
     * </p>
     */
    private String payload;

    /**
     * <p>
     * The pattern to test.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param pattern
     *        The pattern to test.
     */

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * <p>
     * The pattern to test.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return The pattern to test.
     */

    public String getPattern() {
        return this.pattern;
    }

    /**
     * <p>
     * The pattern to test.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param pattern
     *        The pattern to test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSegmentPatternRequest withPattern(String pattern) {
        setPattern(pattern);
        return this;
    }

    /**
     * <p>
     * A sample <code>evaluationContext</code> JSON block to test against the specified pattern.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param payload
     *        A sample <code>evaluationContext</code> JSON block to test against the specified pattern.
     */

    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * A sample <code>evaluationContext</code> JSON block to test against the specified pattern.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return A sample <code>evaluationContext</code> JSON block to test against the specified pattern.
     */

    public String getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * A sample <code>evaluationContext</code> JSON block to test against the specified pattern.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param payload
     *        A sample <code>evaluationContext</code> JSON block to test against the specified pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSegmentPatternRequest withPayload(String payload) {
        setPayload(payload);
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
        if (getPattern() != null)
            sb.append("Pattern: ").append(getPattern()).append(",");
        if (getPayload() != null)
            sb.append("Payload: ").append(getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestSegmentPatternRequest == false)
            return false;
        TestSegmentPatternRequest other = (TestSegmentPatternRequest) obj;
        if (other.getPattern() == null ^ this.getPattern() == null)
            return false;
        if (other.getPattern() != null && other.getPattern().equals(this.getPattern()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPattern() == null) ? 0 : getPattern().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public TestSegmentPatternRequest clone() {
        return (TestSegmentPatternRequest) super.clone();
    }

}
