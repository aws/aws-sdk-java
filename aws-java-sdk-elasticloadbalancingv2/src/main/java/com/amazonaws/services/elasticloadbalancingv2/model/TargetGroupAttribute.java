/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about a target group attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/TargetGroupAttribute"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetGroupAttribute implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * The following attribute is supported by both Application Load Balancers and Network Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deregistration_delay.timeout_seconds</code> - The amount of time, in seconds, for Elastic Load Balancing to
     * wait before changing the state of a deregistering target from <code>draining</code> to <code>unused</code>. The
     * range is 0-3600 seconds. The default value is 300 seconds. If the target is a Lambda function, this attribute is
     * not supported.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes are supported by Application Load Balancers if the target is not a Lambda function:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>slow_start.duration_seconds</code> - The time period, in seconds, during which a newly registered target
     * receives a linearly increasing share of the traffic to the target group. After this time period ends, the target
     * receives its full share of traffic. The range is 30-900 seconds (15 minutes). Slow start mode is disabled by
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stickiness.enabled</code> - Indicates whether sticky sessions are enabled. The value is <code>true</code>
     * or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stickiness.type</code> - The type of sticky sessions. The possible value is <code>lb_cookie</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stickiness.lb_cookie.duration_seconds</code> - The time period, in seconds, during which requests from a
     * client should be routed to the same target. After this time period expires, the load balancer-generated cookie is
     * considered stale. The range is 1 second to 1 week (604800 seconds). The default value is 1 day (86400 seconds).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute is supported only if the target is a Lambda function.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>lambda.multi_value_headers.enabled</code> - Indicates whether the request and response headers exchanged
     * between the load balancer and the Lambda function include arrays of values or strings. The value is
     * <code>true</code> or <code>false</code>. The default is <code>false</code>. If the value is <code>false</code>
     * and the request contains a duplicate header field name or query parameter key, the load balancer uses the last
     * value sent by the client.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute is supported only by Network Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>proxy_protocol_v2.enabled</code> - Indicates whether Proxy Protocol version 2 is enabled. The value is
     * <code>true</code> or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String key;
    /**
     * <p>
     * The value of the attribute.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * The following attribute is supported by both Application Load Balancers and Network Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deregistration_delay.timeout_seconds</code> - The amount of time, in seconds, for Elastic Load Balancing to
     * wait before changing the state of a deregistering target from <code>draining</code> to <code>unused</code>. The
     * range is 0-3600 seconds. The default value is 300 seconds. If the target is a Lambda function, this attribute is
     * not supported.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes are supported by Application Load Balancers if the target is not a Lambda function:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>slow_start.duration_seconds</code> - The time period, in seconds, during which a newly registered target
     * receives a linearly increasing share of the traffic to the target group. After this time period ends, the target
     * receives its full share of traffic. The range is 30-900 seconds (15 minutes). Slow start mode is disabled by
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stickiness.enabled</code> - Indicates whether sticky sessions are enabled. The value is <code>true</code>
     * or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stickiness.type</code> - The type of sticky sessions. The possible value is <code>lb_cookie</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stickiness.lb_cookie.duration_seconds</code> - The time period, in seconds, during which requests from a
     * client should be routed to the same target. After this time period expires, the load balancer-generated cookie is
     * considered stale. The range is 1 second to 1 week (604800 seconds). The default value is 1 day (86400 seconds).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute is supported only if the target is a Lambda function.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>lambda.multi_value_headers.enabled</code> - Indicates whether the request and response headers exchanged
     * between the load balancer and the Lambda function include arrays of values or strings. The value is
     * <code>true</code> or <code>false</code>. The default is <code>false</code>. If the value is <code>false</code>
     * and the request contains a duplicate header field name or query parameter key, the load balancer uses the last
     * value sent by the client.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute is supported only by Network Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>proxy_protocol_v2.enabled</code> - Indicates whether Proxy Protocol version 2 is enabled. The value is
     * <code>true</code> or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param key
     *        The name of the attribute.</p>
     *        <p>
     *        The following attribute is supported by both Application Load Balancers and Network Load Balancers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>deregistration_delay.timeout_seconds</code> - The amount of time, in seconds, for Elastic Load
     *        Balancing to wait before changing the state of a deregistering target from <code>draining</code> to
     *        <code>unused</code>. The range is 0-3600 seconds. The default value is 300 seconds. If the target is a
     *        Lambda function, this attribute is not supported.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes are supported by Application Load Balancers if the target is not a Lambda
     *        function:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>slow_start.duration_seconds</code> - The time period, in seconds, during which a newly registered
     *        target receives a linearly increasing share of the traffic to the target group. After this time period
     *        ends, the target receives its full share of traffic. The range is 30-900 seconds (15 minutes). Slow start
     *        mode is disabled by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>stickiness.enabled</code> - Indicates whether sticky sessions are enabled. The value is
     *        <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>stickiness.type</code> - The type of sticky sessions. The possible value is <code>lb_cookie</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>stickiness.lb_cookie.duration_seconds</code> - The time period, in seconds, during which requests
     *        from a client should be routed to the same target. After this time period expires, the load
     *        balancer-generated cookie is considered stale. The range is 1 second to 1 week (604800 seconds). The
     *        default value is 1 day (86400 seconds).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attribute is supported only if the target is a Lambda function.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>lambda.multi_value_headers.enabled</code> - Indicates whether the request and response headers
     *        exchanged between the load balancer and the Lambda function include arrays of values or strings. The value
     *        is <code>true</code> or <code>false</code>. The default is <code>false</code>. If the value is
     *        <code>false</code> and the request contains a duplicate header field name or query parameter key, the load
     *        balancer uses the last value sent by the client.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attribute is supported only by Network Load Balancers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>proxy_protocol_v2.enabled</code> - Indicates whether Proxy Protocol version 2 is enabled. The value
     *        is <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *        </p>
     *        </li>
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * The following attribute is supported by both Application Load Balancers and Network Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deregistration_delay.timeout_seconds</code> - The amount of time, in seconds, for Elastic Load Balancing to
     * wait before changing the state of a deregistering target from <code>draining</code> to <code>unused</code>. The
     * range is 0-3600 seconds. The default value is 300 seconds. If the target is a Lambda function, this attribute is
     * not supported.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes are supported by Application Load Balancers if the target is not a Lambda function:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>slow_start.duration_seconds</code> - The time period, in seconds, during which a newly registered target
     * receives a linearly increasing share of the traffic to the target group. After this time period ends, the target
     * receives its full share of traffic. The range is 30-900 seconds (15 minutes). Slow start mode is disabled by
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stickiness.enabled</code> - Indicates whether sticky sessions are enabled. The value is <code>true</code>
     * or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stickiness.type</code> - The type of sticky sessions. The possible value is <code>lb_cookie</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stickiness.lb_cookie.duration_seconds</code> - The time period, in seconds, during which requests from a
     * client should be routed to the same target. After this time period expires, the load balancer-generated cookie is
     * considered stale. The range is 1 second to 1 week (604800 seconds). The default value is 1 day (86400 seconds).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute is supported only if the target is a Lambda function.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>lambda.multi_value_headers.enabled</code> - Indicates whether the request and response headers exchanged
     * between the load balancer and the Lambda function include arrays of values or strings. The value is
     * <code>true</code> or <code>false</code>. The default is <code>false</code>. If the value is <code>false</code>
     * and the request contains a duplicate header field name or query parameter key, the load balancer uses the last
     * value sent by the client.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute is supported only by Network Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>proxy_protocol_v2.enabled</code> - Indicates whether Proxy Protocol version 2 is enabled. The value is
     * <code>true</code> or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the attribute.</p>
     *         <p>
     *         The following attribute is supported by both Application Load Balancers and Network Load Balancers:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>deregistration_delay.timeout_seconds</code> - The amount of time, in seconds, for Elastic Load
     *         Balancing to wait before changing the state of a deregistering target from <code>draining</code> to
     *         <code>unused</code>. The range is 0-3600 seconds. The default value is 300 seconds. If the target is a
     *         Lambda function, this attribute is not supported.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attributes are supported by Application Load Balancers if the target is not a Lambda
     *         function:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>slow_start.duration_seconds</code> - The time period, in seconds, during which a newly registered
     *         target receives a linearly increasing share of the traffic to the target group. After this time period
     *         ends, the target receives its full share of traffic. The range is 30-900 seconds (15 minutes). Slow start
     *         mode is disabled by default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>stickiness.enabled</code> - Indicates whether sticky sessions are enabled. The value is
     *         <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>stickiness.type</code> - The type of sticky sessions. The possible value is <code>lb_cookie</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>stickiness.lb_cookie.duration_seconds</code> - The time period, in seconds, during which requests
     *         from a client should be routed to the same target. After this time period expires, the load
     *         balancer-generated cookie is considered stale. The range is 1 second to 1 week (604800 seconds). The
     *         default value is 1 day (86400 seconds).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attribute is supported only if the target is a Lambda function.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>lambda.multi_value_headers.enabled</code> - Indicates whether the request and response headers
     *         exchanged between the load balancer and the Lambda function include arrays of values or strings. The
     *         value is <code>true</code> or <code>false</code>. The default is <code>false</code>. If the value is
     *         <code>false</code> and the request contains a duplicate header field name or query parameter key, the
     *         load balancer uses the last value sent by the client.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attribute is supported only by Network Load Balancers:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>proxy_protocol_v2.enabled</code> - Indicates whether Proxy Protocol version 2 is enabled. The value
     *         is <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *         </p>
     *         </li>
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * The following attribute is supported by both Application Load Balancers and Network Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deregistration_delay.timeout_seconds</code> - The amount of time, in seconds, for Elastic Load Balancing to
     * wait before changing the state of a deregistering target from <code>draining</code> to <code>unused</code>. The
     * range is 0-3600 seconds. The default value is 300 seconds. If the target is a Lambda function, this attribute is
     * not supported.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes are supported by Application Load Balancers if the target is not a Lambda function:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>slow_start.duration_seconds</code> - The time period, in seconds, during which a newly registered target
     * receives a linearly increasing share of the traffic to the target group. After this time period ends, the target
     * receives its full share of traffic. The range is 30-900 seconds (15 minutes). Slow start mode is disabled by
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stickiness.enabled</code> - Indicates whether sticky sessions are enabled. The value is <code>true</code>
     * or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stickiness.type</code> - The type of sticky sessions. The possible value is <code>lb_cookie</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stickiness.lb_cookie.duration_seconds</code> - The time period, in seconds, during which requests from a
     * client should be routed to the same target. After this time period expires, the load balancer-generated cookie is
     * considered stale. The range is 1 second to 1 week (604800 seconds). The default value is 1 day (86400 seconds).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute is supported only if the target is a Lambda function.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>lambda.multi_value_headers.enabled</code> - Indicates whether the request and response headers exchanged
     * between the load balancer and the Lambda function include arrays of values or strings. The value is
     * <code>true</code> or <code>false</code>. The default is <code>false</code>. If the value is <code>false</code>
     * and the request contains a duplicate header field name or query parameter key, the load balancer uses the last
     * value sent by the client.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attribute is supported only by Network Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>proxy_protocol_v2.enabled</code> - Indicates whether Proxy Protocol version 2 is enabled. The value is
     * <code>true</code> or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param key
     *        The name of the attribute.</p>
     *        <p>
     *        The following attribute is supported by both Application Load Balancers and Network Load Balancers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>deregistration_delay.timeout_seconds</code> - The amount of time, in seconds, for Elastic Load
     *        Balancing to wait before changing the state of a deregistering target from <code>draining</code> to
     *        <code>unused</code>. The range is 0-3600 seconds. The default value is 300 seconds. If the target is a
     *        Lambda function, this attribute is not supported.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes are supported by Application Load Balancers if the target is not a Lambda
     *        function:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>slow_start.duration_seconds</code> - The time period, in seconds, during which a newly registered
     *        target receives a linearly increasing share of the traffic to the target group. After this time period
     *        ends, the target receives its full share of traffic. The range is 30-900 seconds (15 minutes). Slow start
     *        mode is disabled by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>stickiness.enabled</code> - Indicates whether sticky sessions are enabled. The value is
     *        <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>stickiness.type</code> - The type of sticky sessions. The possible value is <code>lb_cookie</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>stickiness.lb_cookie.duration_seconds</code> - The time period, in seconds, during which requests
     *        from a client should be routed to the same target. After this time period expires, the load
     *        balancer-generated cookie is considered stale. The range is 1 second to 1 week (604800 seconds). The
     *        default value is 1 day (86400 seconds).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attribute is supported only if the target is a Lambda function.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>lambda.multi_value_headers.enabled</code> - Indicates whether the request and response headers
     *        exchanged between the load balancer and the Lambda function include arrays of values or strings. The value
     *        is <code>true</code> or <code>false</code>. The default is <code>false</code>. If the value is
     *        <code>false</code> and the request contains a duplicate header field name or query parameter key, the load
     *        balancer uses the last value sent by the client.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attribute is supported only by Network Load Balancers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>proxy_protocol_v2.enabled</code> - Indicates whether Proxy Protocol version 2 is enabled. The value
     *        is <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupAttribute withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value of the attribute.
     * </p>
     * 
     * @param value
     *        The value of the attribute.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the attribute.
     * </p>
     * 
     * @return The value of the attribute.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the attribute.
     * </p>
     * 
     * @param value
     *        The value of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupAttribute withValue(String value) {
        setValue(value);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetGroupAttribute == false)
            return false;
        TargetGroupAttribute other = (TargetGroupAttribute) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public TargetGroupAttribute clone() {
        try {
            return (TargetGroupAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
