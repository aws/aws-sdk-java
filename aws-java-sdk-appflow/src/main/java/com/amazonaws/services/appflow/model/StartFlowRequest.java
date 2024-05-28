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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/StartFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartFlowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     * </p>
     */
    private String flowName;
    /**
     * <p>
     * The <code>clientToken</code> parameter is an idempotency token. It ensures that your <code>StartFlow</code>
     * request completes only once. You choose the value to pass. For example, if you don't receive a response from your
     * request, you can safely retry the request with the same <code>clientToken</code> parameter value.
     * </p>
     * <p>
     * If you omit a <code>clientToken</code> value, the Amazon Web Services SDK that you are using inserts a value for
     * you. This way, the SDK can safely retry requests multiple times after a network error. You must provide your own
     * value for other use cases.
     * </p>
     * <p>
     * If you specify input parameters that differ from your first request, an error occurs for flows that run on a
     * schedule or based on an event. However, the error doesn't occur for flows that run on demand. You set the
     * conditions that initiate your flow for the <code>triggerConfig</code> parameter.
     * </p>
     * <p>
     * If you use a different value for <code>clientToken</code>, Amazon AppFlow considers it a new call to
     * <code>StartFlow</code>. The token is active for 8 hours.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     * </p>
     * 
     * @param flowName
     *        The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     */

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    /**
     * <p>
     * The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     * </p>
     * 
     * @return The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     */

    public String getFlowName() {
        return this.flowName;
    }

    /**
     * <p>
     * The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     * </p>
     * 
     * @param flowName
     *        The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFlowRequest withFlowName(String flowName) {
        setFlowName(flowName);
        return this;
    }

    /**
     * <p>
     * The <code>clientToken</code> parameter is an idempotency token. It ensures that your <code>StartFlow</code>
     * request completes only once. You choose the value to pass. For example, if you don't receive a response from your
     * request, you can safely retry the request with the same <code>clientToken</code> parameter value.
     * </p>
     * <p>
     * If you omit a <code>clientToken</code> value, the Amazon Web Services SDK that you are using inserts a value for
     * you. This way, the SDK can safely retry requests multiple times after a network error. You must provide your own
     * value for other use cases.
     * </p>
     * <p>
     * If you specify input parameters that differ from your first request, an error occurs for flows that run on a
     * schedule or based on an event. However, the error doesn't occur for flows that run on demand. You set the
     * conditions that initiate your flow for the <code>triggerConfig</code> parameter.
     * </p>
     * <p>
     * If you use a different value for <code>clientToken</code>, Amazon AppFlow considers it a new call to
     * <code>StartFlow</code>. The token is active for 8 hours.
     * </p>
     * 
     * @param clientToken
     *        The <code>clientToken</code> parameter is an idempotency token. It ensures that your
     *        <code>StartFlow</code> request completes only once. You choose the value to pass. For example, if you
     *        don't receive a response from your request, you can safely retry the request with the same
     *        <code>clientToken</code> parameter value.</p>
     *        <p>
     *        If you omit a <code>clientToken</code> value, the Amazon Web Services SDK that you are using inserts a
     *        value for you. This way, the SDK can safely retry requests multiple times after a network error. You must
     *        provide your own value for other use cases.
     *        </p>
     *        <p>
     *        If you specify input parameters that differ from your first request, an error occurs for flows that run on
     *        a schedule or based on an event. However, the error doesn't occur for flows that run on demand. You set
     *        the conditions that initiate your flow for the <code>triggerConfig</code> parameter.
     *        </p>
     *        <p>
     *        If you use a different value for <code>clientToken</code>, Amazon AppFlow considers it a new call to
     *        <code>StartFlow</code>. The token is active for 8 hours.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The <code>clientToken</code> parameter is an idempotency token. It ensures that your <code>StartFlow</code>
     * request completes only once. You choose the value to pass. For example, if you don't receive a response from your
     * request, you can safely retry the request with the same <code>clientToken</code> parameter value.
     * </p>
     * <p>
     * If you omit a <code>clientToken</code> value, the Amazon Web Services SDK that you are using inserts a value for
     * you. This way, the SDK can safely retry requests multiple times after a network error. You must provide your own
     * value for other use cases.
     * </p>
     * <p>
     * If you specify input parameters that differ from your first request, an error occurs for flows that run on a
     * schedule or based on an event. However, the error doesn't occur for flows that run on demand. You set the
     * conditions that initiate your flow for the <code>triggerConfig</code> parameter.
     * </p>
     * <p>
     * If you use a different value for <code>clientToken</code>, Amazon AppFlow considers it a new call to
     * <code>StartFlow</code>. The token is active for 8 hours.
     * </p>
     * 
     * @return The <code>clientToken</code> parameter is an idempotency token. It ensures that your
     *         <code>StartFlow</code> request completes only once. You choose the value to pass. For example, if you
     *         don't receive a response from your request, you can safely retry the request with the same
     *         <code>clientToken</code> parameter value.</p>
     *         <p>
     *         If you omit a <code>clientToken</code> value, the Amazon Web Services SDK that you are using inserts a
     *         value for you. This way, the SDK can safely retry requests multiple times after a network error. You must
     *         provide your own value for other use cases.
     *         </p>
     *         <p>
     *         If you specify input parameters that differ from your first request, an error occurs for flows that run
     *         on a schedule or based on an event. However, the error doesn't occur for flows that run on demand. You
     *         set the conditions that initiate your flow for the <code>triggerConfig</code> parameter.
     *         </p>
     *         <p>
     *         If you use a different value for <code>clientToken</code>, Amazon AppFlow considers it a new call to
     *         <code>StartFlow</code>. The token is active for 8 hours.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The <code>clientToken</code> parameter is an idempotency token. It ensures that your <code>StartFlow</code>
     * request completes only once. You choose the value to pass. For example, if you don't receive a response from your
     * request, you can safely retry the request with the same <code>clientToken</code> parameter value.
     * </p>
     * <p>
     * If you omit a <code>clientToken</code> value, the Amazon Web Services SDK that you are using inserts a value for
     * you. This way, the SDK can safely retry requests multiple times after a network error. You must provide your own
     * value for other use cases.
     * </p>
     * <p>
     * If you specify input parameters that differ from your first request, an error occurs for flows that run on a
     * schedule or based on an event. However, the error doesn't occur for flows that run on demand. You set the
     * conditions that initiate your flow for the <code>triggerConfig</code> parameter.
     * </p>
     * <p>
     * If you use a different value for <code>clientToken</code>, Amazon AppFlow considers it a new call to
     * <code>StartFlow</code>. The token is active for 8 hours.
     * </p>
     * 
     * @param clientToken
     *        The <code>clientToken</code> parameter is an idempotency token. It ensures that your
     *        <code>StartFlow</code> request completes only once. You choose the value to pass. For example, if you
     *        don't receive a response from your request, you can safely retry the request with the same
     *        <code>clientToken</code> parameter value.</p>
     *        <p>
     *        If you omit a <code>clientToken</code> value, the Amazon Web Services SDK that you are using inserts a
     *        value for you. This way, the SDK can safely retry requests multiple times after a network error. You must
     *        provide your own value for other use cases.
     *        </p>
     *        <p>
     *        If you specify input parameters that differ from your first request, an error occurs for flows that run on
     *        a schedule or based on an event. However, the error doesn't occur for flows that run on demand. You set
     *        the conditions that initiate your flow for the <code>triggerConfig</code> parameter.
     *        </p>
     *        <p>
     *        If you use a different value for <code>clientToken</code>, Amazon AppFlow considers it a new call to
     *        <code>StartFlow</code>. The token is active for 8 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFlowRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getFlowName() != null)
            sb.append("FlowName: ").append(getFlowName()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartFlowRequest == false)
            return false;
        StartFlowRequest other = (StartFlowRequest) obj;
        if (other.getFlowName() == null ^ this.getFlowName() == null)
            return false;
        if (other.getFlowName() != null && other.getFlowName().equals(this.getFlowName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowName() == null) ? 0 : getFlowName().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public StartFlowRequest clone() {
        return (StartFlowRequest) super.clone();
    }

}
