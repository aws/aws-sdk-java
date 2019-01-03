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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains a Lambda function association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/LambdaFunctionAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaFunctionAssociation implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the Lambda function. You must specify the ARN of a function version; you can't specify a Lambda alias
     * or $LATEST.
     * </p>
     */
    private String lambdaFunctionARN;
    /**
     * <p>
     * Specifies the event type that triggers a Lambda function invocation. You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>viewer-request</code>: The function executes when CloudFront receives a request from a viewer and before it
     * checks to see whether the requested object is in the edge cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-request</code>: The function executes only when CloudFront forwards a request to your origin. When
     * the requested object is in the edge cache, the function doesn't execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-response</code>: The function executes after CloudFront receives a response from the origin and
     * before it caches the object in the response. When the requested object is in the edge cache, the function doesn't
     * execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>viewer-response</code>: The function executes before CloudFront returns the requested object to the viewer.
     * The function executes regardless of whether the object was already in the edge cache.
     * </p>
     * <p>
     * If the origin returns an HTTP status code other than HTTP 200 (OK), the function doesn't execute.
     * </p>
     * </li>
     * </ul>
     */
    private String eventType;
    /**
     * <p>
     * A flag that allows a Lambda function to have read access to the body content. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html"
     * >Accessing the Request Body by Choosing the Include Body Option</a> in the Amazon CloudFront Developer Guide.
     * </p>
     */
    private Boolean includeBody;

    /**
     * <p>
     * The ARN of the Lambda function. You must specify the ARN of a function version; you can't specify a Lambda alias
     * or $LATEST.
     * </p>
     * 
     * @param lambdaFunctionARN
     *        The ARN of the Lambda function. You must specify the ARN of a function version; you can't specify a Lambda
     *        alias or $LATEST.
     */

    public void setLambdaFunctionARN(String lambdaFunctionARN) {
        this.lambdaFunctionARN = lambdaFunctionARN;
    }

    /**
     * <p>
     * The ARN of the Lambda function. You must specify the ARN of a function version; you can't specify a Lambda alias
     * or $LATEST.
     * </p>
     * 
     * @return The ARN of the Lambda function. You must specify the ARN of a function version; you can't specify a
     *         Lambda alias or $LATEST.
     */

    public String getLambdaFunctionARN() {
        return this.lambdaFunctionARN;
    }

    /**
     * <p>
     * The ARN of the Lambda function. You must specify the ARN of a function version; you can't specify a Lambda alias
     * or $LATEST.
     * </p>
     * 
     * @param lambdaFunctionARN
     *        The ARN of the Lambda function. You must specify the ARN of a function version; you can't specify a Lambda
     *        alias or $LATEST.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionAssociation withLambdaFunctionARN(String lambdaFunctionARN) {
        setLambdaFunctionARN(lambdaFunctionARN);
        return this;
    }

    /**
     * <p>
     * Specifies the event type that triggers a Lambda function invocation. You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>viewer-request</code>: The function executes when CloudFront receives a request from a viewer and before it
     * checks to see whether the requested object is in the edge cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-request</code>: The function executes only when CloudFront forwards a request to your origin. When
     * the requested object is in the edge cache, the function doesn't execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-response</code>: The function executes after CloudFront receives a response from the origin and
     * before it caches the object in the response. When the requested object is in the edge cache, the function doesn't
     * execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>viewer-response</code>: The function executes before CloudFront returns the requested object to the viewer.
     * The function executes regardless of whether the object was already in the edge cache.
     * </p>
     * <p>
     * If the origin returns an HTTP status code other than HTTP 200 (OK), the function doesn't execute.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventType
     *        Specifies the event type that triggers a Lambda function invocation. You can specify the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>viewer-request</code>: The function executes when CloudFront receives a request from a viewer and
     *        before it checks to see whether the requested object is in the edge cache.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin-request</code>: The function executes only when CloudFront forwards a request to your origin.
     *        When the requested object is in the edge cache, the function doesn't execute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin-response</code>: The function executes after CloudFront receives a response from the origin
     *        and before it caches the object in the response. When the requested object is in the edge cache, the
     *        function doesn't execute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>viewer-response</code>: The function executes before CloudFront returns the requested object to the
     *        viewer. The function executes regardless of whether the object was already in the edge cache.
     *        </p>
     *        <p>
     *        If the origin returns an HTTP status code other than HTTP 200 (OK), the function doesn't execute.
     *        </p>
     *        </li>
     * @see EventType
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * Specifies the event type that triggers a Lambda function invocation. You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>viewer-request</code>: The function executes when CloudFront receives a request from a viewer and before it
     * checks to see whether the requested object is in the edge cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-request</code>: The function executes only when CloudFront forwards a request to your origin. When
     * the requested object is in the edge cache, the function doesn't execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-response</code>: The function executes after CloudFront receives a response from the origin and
     * before it caches the object in the response. When the requested object is in the edge cache, the function doesn't
     * execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>viewer-response</code>: The function executes before CloudFront returns the requested object to the viewer.
     * The function executes regardless of whether the object was already in the edge cache.
     * </p>
     * <p>
     * If the origin returns an HTTP status code other than HTTP 200 (OK), the function doesn't execute.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the event type that triggers a Lambda function invocation. You can specify the following
     *         values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>viewer-request</code>: The function executes when CloudFront receives a request from a viewer and
     *         before it checks to see whether the requested object is in the edge cache.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>origin-request</code>: The function executes only when CloudFront forwards a request to your
     *         origin. When the requested object is in the edge cache, the function doesn't execute.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>origin-response</code>: The function executes after CloudFront receives a response from the origin
     *         and before it caches the object in the response. When the requested object is in the edge cache, the
     *         function doesn't execute.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>viewer-response</code>: The function executes before CloudFront returns the requested object to the
     *         viewer. The function executes regardless of whether the object was already in the edge cache.
     *         </p>
     *         <p>
     *         If the origin returns an HTTP status code other than HTTP 200 (OK), the function doesn't execute.
     *         </p>
     *         </li>
     * @see EventType
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * Specifies the event type that triggers a Lambda function invocation. You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>viewer-request</code>: The function executes when CloudFront receives a request from a viewer and before it
     * checks to see whether the requested object is in the edge cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-request</code>: The function executes only when CloudFront forwards a request to your origin. When
     * the requested object is in the edge cache, the function doesn't execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-response</code>: The function executes after CloudFront receives a response from the origin and
     * before it caches the object in the response. When the requested object is in the edge cache, the function doesn't
     * execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>viewer-response</code>: The function executes before CloudFront returns the requested object to the viewer.
     * The function executes regardless of whether the object was already in the edge cache.
     * </p>
     * <p>
     * If the origin returns an HTTP status code other than HTTP 200 (OK), the function doesn't execute.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventType
     *        Specifies the event type that triggers a Lambda function invocation. You can specify the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>viewer-request</code>: The function executes when CloudFront receives a request from a viewer and
     *        before it checks to see whether the requested object is in the edge cache.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin-request</code>: The function executes only when CloudFront forwards a request to your origin.
     *        When the requested object is in the edge cache, the function doesn't execute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin-response</code>: The function executes after CloudFront receives a response from the origin
     *        and before it caches the object in the response. When the requested object is in the edge cache, the
     *        function doesn't execute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>viewer-response</code>: The function executes before CloudFront returns the requested object to the
     *        viewer. The function executes regardless of whether the object was already in the edge cache.
     *        </p>
     *        <p>
     *        If the origin returns an HTTP status code other than HTTP 200 (OK), the function doesn't execute.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public LambdaFunctionAssociation withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * Specifies the event type that triggers a Lambda function invocation. You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>viewer-request</code>: The function executes when CloudFront receives a request from a viewer and before it
     * checks to see whether the requested object is in the edge cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-request</code>: The function executes only when CloudFront forwards a request to your origin. When
     * the requested object is in the edge cache, the function doesn't execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-response</code>: The function executes after CloudFront receives a response from the origin and
     * before it caches the object in the response. When the requested object is in the edge cache, the function doesn't
     * execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>viewer-response</code>: The function executes before CloudFront returns the requested object to the viewer.
     * The function executes regardless of whether the object was already in the edge cache.
     * </p>
     * <p>
     * If the origin returns an HTTP status code other than HTTP 200 (OK), the function doesn't execute.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventType
     *        Specifies the event type that triggers a Lambda function invocation. You can specify the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>viewer-request</code>: The function executes when CloudFront receives a request from a viewer and
     *        before it checks to see whether the requested object is in the edge cache.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin-request</code>: The function executes only when CloudFront forwards a request to your origin.
     *        When the requested object is in the edge cache, the function doesn't execute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin-response</code>: The function executes after CloudFront receives a response from the origin
     *        and before it caches the object in the response. When the requested object is in the edge cache, the
     *        function doesn't execute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>viewer-response</code>: The function executes before CloudFront returns the requested object to the
     *        viewer. The function executes regardless of whether the object was already in the edge cache.
     *        </p>
     *        <p>
     *        If the origin returns an HTTP status code other than HTTP 200 (OK), the function doesn't execute.
     *        </p>
     *        </li>
     * @see EventType
     */

    public void setEventType(EventType eventType) {
        withEventType(eventType);
    }

    /**
     * <p>
     * Specifies the event type that triggers a Lambda function invocation. You can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>viewer-request</code>: The function executes when CloudFront receives a request from a viewer and before it
     * checks to see whether the requested object is in the edge cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-request</code>: The function executes only when CloudFront forwards a request to your origin. When
     * the requested object is in the edge cache, the function doesn't execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-response</code>: The function executes after CloudFront receives a response from the origin and
     * before it caches the object in the response. When the requested object is in the edge cache, the function doesn't
     * execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>viewer-response</code>: The function executes before CloudFront returns the requested object to the viewer.
     * The function executes regardless of whether the object was already in the edge cache.
     * </p>
     * <p>
     * If the origin returns an HTTP status code other than HTTP 200 (OK), the function doesn't execute.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventType
     *        Specifies the event type that triggers a Lambda function invocation. You can specify the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>viewer-request</code>: The function executes when CloudFront receives a request from a viewer and
     *        before it checks to see whether the requested object is in the edge cache.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin-request</code>: The function executes only when CloudFront forwards a request to your origin.
     *        When the requested object is in the edge cache, the function doesn't execute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin-response</code>: The function executes after CloudFront receives a response from the origin
     *        and before it caches the object in the response. When the requested object is in the edge cache, the
     *        function doesn't execute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>viewer-response</code>: The function executes before CloudFront returns the requested object to the
     *        viewer. The function executes regardless of whether the object was already in the edge cache.
     *        </p>
     *        <p>
     *        If the origin returns an HTTP status code other than HTTP 200 (OK), the function doesn't execute.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public LambdaFunctionAssociation withEventType(EventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * A flag that allows a Lambda function to have read access to the body content. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html"
     * >Accessing the Request Body by Choosing the Include Body Option</a> in the Amazon CloudFront Developer Guide.
     * </p>
     * 
     * @param includeBody
     *        A flag that allows a Lambda function to have read access to the body content. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html">
     *        Accessing the Request Body by Choosing the Include Body Option</a> in the Amazon CloudFront Developer
     *        Guide.
     */

    public void setIncludeBody(Boolean includeBody) {
        this.includeBody = includeBody;
    }

    /**
     * <p>
     * A flag that allows a Lambda function to have read access to the body content. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html"
     * >Accessing the Request Body by Choosing the Include Body Option</a> in the Amazon CloudFront Developer Guide.
     * </p>
     * 
     * @return A flag that allows a Lambda function to have read access to the body content. For more information, see
     *         <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html"
     *         >Accessing the Request Body by Choosing the Include Body Option</a> in the Amazon CloudFront Developer
     *         Guide.
     */

    public Boolean getIncludeBody() {
        return this.includeBody;
    }

    /**
     * <p>
     * A flag that allows a Lambda function to have read access to the body content. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html"
     * >Accessing the Request Body by Choosing the Include Body Option</a> in the Amazon CloudFront Developer Guide.
     * </p>
     * 
     * @param includeBody
     *        A flag that allows a Lambda function to have read access to the body content. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html">
     *        Accessing the Request Body by Choosing the Include Body Option</a> in the Amazon CloudFront Developer
     *        Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionAssociation withIncludeBody(Boolean includeBody) {
        setIncludeBody(includeBody);
        return this;
    }

    /**
     * <p>
     * A flag that allows a Lambda function to have read access to the body content. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html"
     * >Accessing the Request Body by Choosing the Include Body Option</a> in the Amazon CloudFront Developer Guide.
     * </p>
     * 
     * @return A flag that allows a Lambda function to have read access to the body content. For more information, see
     *         <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html"
     *         >Accessing the Request Body by Choosing the Include Body Option</a> in the Amazon CloudFront Developer
     *         Guide.
     */

    public Boolean isIncludeBody() {
        return this.includeBody;
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
        if (getLambdaFunctionARN() != null)
            sb.append("LambdaFunctionARN: ").append(getLambdaFunctionARN()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getIncludeBody() != null)
            sb.append("IncludeBody: ").append(getIncludeBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaFunctionAssociation == false)
            return false;
        LambdaFunctionAssociation other = (LambdaFunctionAssociation) obj;
        if (other.getLambdaFunctionARN() == null ^ this.getLambdaFunctionARN() == null)
            return false;
        if (other.getLambdaFunctionARN() != null && other.getLambdaFunctionARN().equals(this.getLambdaFunctionARN()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getIncludeBody() == null ^ this.getIncludeBody() == null)
            return false;
        if (other.getIncludeBody() != null && other.getIncludeBody().equals(this.getIncludeBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLambdaFunctionARN() == null) ? 0 : getLambdaFunctionARN().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getIncludeBody() == null) ? 0 : getIncludeBody().hashCode());
        return hashCode;
    }

    @Override
    public LambdaFunctionAssociation clone() {
        try {
            return (LambdaFunctionAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
