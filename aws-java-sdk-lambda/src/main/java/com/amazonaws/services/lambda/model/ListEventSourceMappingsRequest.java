/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class ListEventSourceMappingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream. (This parameter is optional.)
     * </p>
     */
    private String eventSourceArn;
    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p>
     * You can specify the function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). If you
     * are using versioning, you can also provide a qualified function ARN (ARN that is qualified with function version
     * or alias name as suffix). AWS Lambda also allows you to specify only the function name with the account ID
     * qualifier (for example, <code>account-id:Thumbnail</code>). Note that the length constraint applies only to the
     * ARN. If you specify only the function name, it is limited to 64 character in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * Optional string. An opaque pagination token returned from a previous <code>ListEventSourceMappings</code>
     * operation. If present, specifies to continue the list from where the returning call left off.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Optional integer. Specifies the maximum number of event sources to return in response. This value must be greater
     * than 0.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream. (This parameter is optional.)
     * </p>
     * 
     * @param eventSourceArn
     *        The Amazon Resource Name (ARN) of the Amazon Kinesis stream. (This parameter is optional.)
     */

    public void setEventSourceArn(String eventSourceArn) {
        this.eventSourceArn = eventSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream. (This parameter is optional.)
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Kinesis stream. (This parameter is optional.)
     */

    public String getEventSourceArn() {
        return this.eventSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream. (This parameter is optional.)
     * </p>
     * 
     * @param eventSourceArn
     *        The Amazon Resource Name (ARN) of the Amazon Kinesis stream. (This parameter is optional.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventSourceMappingsRequest withEventSourceArn(String eventSourceArn) {
        setEventSourceArn(eventSourceArn);
        return this;
    }

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p>
     * You can specify the function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). If you
     * are using versioning, you can also provide a qualified function ARN (ARN that is qualified with function version
     * or alias name as suffix). AWS Lambda also allows you to specify only the function name with the account ID
     * qualifier (for example, <code>account-id:Thumbnail</code>). Note that the length constraint applies only to the
     * ARN. If you specify only the function name, it is limited to 64 character in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function.</p>
     *        <p>
     *        You can specify the function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *        Name (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). If you are using versioning, you can
     *        also provide a qualified function ARN (ARN that is qualified with function version or alias name as
     *        suffix). AWS Lambda also allows you to specify only the function name with the account ID qualifier (for
     *        example, <code>account-id:Thumbnail</code>). Note that the length constraint applies only to the ARN. If
     *        you specify only the function name, it is limited to 64 character in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p>
     * You can specify the function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). If you
     * are using versioning, you can also provide a qualified function ARN (ARN that is qualified with function version
     * or alias name as suffix). AWS Lambda also allows you to specify only the function name with the account ID
     * qualifier (for example, <code>account-id:Thumbnail</code>). Note that the length constraint applies only to the
     * ARN. If you specify only the function name, it is limited to 64 character in length.
     * </p>
     * 
     * @return The name of the Lambda function.</p>
     *         <p>
     *         You can specify the function name (for example, <code>Thumbnail</code>) or you can specify Amazon
     *         Resource Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). If you are using versioning, you
     *         can also provide a qualified function ARN (ARN that is qualified with function version or alias name as
     *         suffix). AWS Lambda also allows you to specify only the function name with the account ID qualifier (for
     *         example, <code>account-id:Thumbnail</code>). Note that the length constraint applies only to the ARN. If
     *         you specify only the function name, it is limited to 64 character in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p>
     * You can specify the function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). If you
     * are using versioning, you can also provide a qualified function ARN (ARN that is qualified with function version
     * or alias name as suffix). AWS Lambda also allows you to specify only the function name with the account ID
     * qualifier (for example, <code>account-id:Thumbnail</code>). Note that the length constraint applies only to the
     * ARN. If you specify only the function name, it is limited to 64 character in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function.</p>
     *        <p>
     *        You can specify the function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *        Name (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). If you are using versioning, you can
     *        also provide a qualified function ARN (ARN that is qualified with function version or alias name as
     *        suffix). AWS Lambda also allows you to specify only the function name with the account ID qualifier (for
     *        example, <code>account-id:Thumbnail</code>). Note that the length constraint applies only to the ARN. If
     *        you specify only the function name, it is limited to 64 character in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventSourceMappingsRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * Optional string. An opaque pagination token returned from a previous <code>ListEventSourceMappings</code>
     * operation. If present, specifies to continue the list from where the returning call left off.
     * </p>
     * 
     * @param marker
     *        Optional string. An opaque pagination token returned from a previous <code>ListEventSourceMappings</code>
     *        operation. If present, specifies to continue the list from where the returning call left off.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Optional string. An opaque pagination token returned from a previous <code>ListEventSourceMappings</code>
     * operation. If present, specifies to continue the list from where the returning call left off.
     * </p>
     * 
     * @return Optional string. An opaque pagination token returned from a previous <code>ListEventSourceMappings</code>
     *         operation. If present, specifies to continue the list from where the returning call left off.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Optional string. An opaque pagination token returned from a previous <code>ListEventSourceMappings</code>
     * operation. If present, specifies to continue the list from where the returning call left off.
     * </p>
     * 
     * @param marker
     *        Optional string. An opaque pagination token returned from a previous <code>ListEventSourceMappings</code>
     *        operation. If present, specifies to continue the list from where the returning call left off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventSourceMappingsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Optional integer. Specifies the maximum number of event sources to return in response. This value must be greater
     * than 0.
     * </p>
     * 
     * @param maxItems
     *        Optional integer. Specifies the maximum number of event sources to return in response. This value must be
     *        greater than 0.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Optional integer. Specifies the maximum number of event sources to return in response. This value must be greater
     * than 0.
     * </p>
     * 
     * @return Optional integer. Specifies the maximum number of event sources to return in response. This value must be
     *         greater than 0.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * Optional integer. Specifies the maximum number of event sources to return in response. This value must be greater
     * than 0.
     * </p>
     * 
     * @param maxItems
     *        Optional integer. Specifies the maximum number of event sources to return in response. This value must be
     *        greater than 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventSourceMappingsRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEventSourceArn() != null)
            sb.append("EventSourceArn: " + getEventSourceArn() + ",");
        if (getFunctionName() != null)
            sb.append("FunctionName: " + getFunctionName() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEventSourceMappingsRequest == false)
            return false;
        ListEventSourceMappingsRequest other = (ListEventSourceMappingsRequest) obj;
        if (other.getEventSourceArn() == null ^ this.getEventSourceArn() == null)
            return false;
        if (other.getEventSourceArn() != null && other.getEventSourceArn().equals(this.getEventSourceArn()) == false)
            return false;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventSourceArn() == null) ? 0 : getEventSourceArn().hashCode());
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListEventSourceMappingsRequest clone() {
        return (ListEventSourceMappingsRequest) super.clone();
    }
}
