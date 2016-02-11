/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#listEventSourceMappings(ListEventSourceMappingsRequest) ListEventSourceMappings operation}.
 * <p>
 * Returns a list of event source mappings you created using the
 * <code>CreateEventSourceMapping</code> (see CreateEventSourceMapping).
 * </p>
 * <p>
 * For each mapping, the API returns configuration information. You can
 * optionally specify filters to retrieve specific event source mappings.
 * </p>
 * <p>
 * If you are using the versioning feature, you can get list of event
 * source mappings for a specific Lambda function version or an alias as
 * described in the <code>FunctionName</code> parameter. For information
 * about the versioning feature, see
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
 * .
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>lambda:ListEventSourceMappings</code> action.
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#listEventSourceMappings(ListEventSourceMappingsRequest)
 */
public class ListEventSourceMappingsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:([a-zA-Z0-9\-])+:([a-z]{2}-[a-z]+-\d{1})?:(\d{12})?:(.*)<br/>
     */
    private String eventSourceArn;

    /**
     * The name of the Lambda function. <p> You can specify the function name
     * (for example, <code>Thumbnail</code>) or you can specify Amazon
     * Resource Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * If you are using versioning, you can also provide a qualified function
     * ARN (ARN that is qualified with function version or alias name as
     * suffix). AWS Lambda also allows you to specify only the function name
     * with the account ID qualifier (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     */
    private String functionName;

    /**
     * Optional string. An opaque pagination token returned from a previous
     * <code>ListEventSourceMappings</code> operation. If present, specifies
     * to continue the list from where the returning call left off.
     */
    private String marker;

    /**
     * Optional integer. Specifies the maximum number of event sources to
     * return in response. This value must be greater than 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer maxItems;

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:([a-zA-Z0-9\-])+:([a-z]{2}-[a-z]+-\d{1})?:(\d{12})?:(.*)<br/>
     *
     * @return The Amazon Resource Name (ARN) of the Amazon Kinesis stream.
     */
    public String getEventSourceArn() {
        return eventSourceArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:([a-zA-Z0-9\-])+:([a-z]{2}-[a-z]+-\d{1})?:(\d{12})?:(.*)<br/>
     *
     * @param eventSourceArn The Amazon Resource Name (ARN) of the Amazon Kinesis stream.
     */
    public void setEventSourceArn(String eventSourceArn) {
        this.eventSourceArn = eventSourceArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:([a-zA-Z0-9\-])+:([a-z]{2}-[a-z]+-\d{1})?:(\d{12})?:(.*)<br/>
     *
     * @param eventSourceArn The Amazon Resource Name (ARN) of the Amazon Kinesis stream.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEventSourceMappingsRequest withEventSourceArn(String eventSourceArn) {
        this.eventSourceArn = eventSourceArn;
        return this;
    }

    /**
     * The name of the Lambda function. <p> You can specify the function name
     * (for example, <code>Thumbnail</code>) or you can specify Amazon
     * Resource Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * If you are using versioning, you can also provide a qualified function
     * ARN (ARN that is qualified with function version or alias name as
     * suffix). AWS Lambda also allows you to specify only the function name
     * with the account ID qualifier (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @return The name of the Lambda function. <p> You can specify the function name
     *         (for example, <code>Thumbnail</code>) or you can specify Amazon
     *         Resource Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         If you are using versioning, you can also provide a qualified function
     *         ARN (ARN that is qualified with function version or alias name as
     *         suffix). AWS Lambda also allows you to specify only the function name
     *         with the account ID qualifier (for example,
     *         <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 character in length.
     */
    public String getFunctionName() {
        return functionName;
    }
    
    /**
     * The name of the Lambda function. <p> You can specify the function name
     * (for example, <code>Thumbnail</code>) or you can specify Amazon
     * Resource Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * If you are using versioning, you can also provide a qualified function
     * ARN (ARN that is qualified with function version or alias name as
     * suffix). AWS Lambda also allows you to specify only the function name
     * with the account ID qualifier (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName The name of the Lambda function. <p> You can specify the function name
     *         (for example, <code>Thumbnail</code>) or you can specify Amazon
     *         Resource Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         If you are using versioning, you can also provide a qualified function
     *         ARN (ARN that is qualified with function version or alias name as
     *         suffix). AWS Lambda also allows you to specify only the function name
     *         with the account ID qualifier (for example,
     *         <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 character in length.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    /**
     * The name of the Lambda function. <p> You can specify the function name
     * (for example, <code>Thumbnail</code>) or you can specify Amazon
     * Resource Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * If you are using versioning, you can also provide a qualified function
     * ARN (ARN that is qualified with function version or alias name as
     * suffix). AWS Lambda also allows you to specify only the function name
     * with the account ID qualifier (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName The name of the Lambda function. <p> You can specify the function name
     *         (for example, <code>Thumbnail</code>) or you can specify Amazon
     *         Resource Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         If you are using versioning, you can also provide a qualified function
     *         ARN (ARN that is qualified with function version or alias name as
     *         suffix). AWS Lambda also allows you to specify only the function name
     *         with the account ID qualifier (for example,
     *         <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 character in length.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEventSourceMappingsRequest withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * Optional string. An opaque pagination token returned from a previous
     * <code>ListEventSourceMappings</code> operation. If present, specifies
     * to continue the list from where the returning call left off.
     *
     * @return Optional string. An opaque pagination token returned from a previous
     *         <code>ListEventSourceMappings</code> operation. If present, specifies
     *         to continue the list from where the returning call left off.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Optional string. An opaque pagination token returned from a previous
     * <code>ListEventSourceMappings</code> operation. If present, specifies
     * to continue the list from where the returning call left off.
     *
     * @param marker Optional string. An opaque pagination token returned from a previous
     *         <code>ListEventSourceMappings</code> operation. If present, specifies
     *         to continue the list from where the returning call left off.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Optional string. An opaque pagination token returned from a previous
     * <code>ListEventSourceMappings</code> operation. If present, specifies
     * to continue the list from where the returning call left off.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker Optional string. An opaque pagination token returned from a previous
     *         <code>ListEventSourceMappings</code> operation. If present, specifies
     *         to continue the list from where the returning call left off.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEventSourceMappingsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Optional integer. Specifies the maximum number of event sources to
     * return in response. This value must be greater than 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return Optional integer. Specifies the maximum number of event sources to
     *         return in response. This value must be greater than 0.
     */
    public Integer getMaxItems() {
        return maxItems;
    }
    
    /**
     * Optional integer. Specifies the maximum number of event sources to
     * return in response. This value must be greater than 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param maxItems Optional integer. Specifies the maximum number of event sources to
     *         return in response. This value must be greater than 0.
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * Optional integer. Specifies the maximum number of event sources to
     * return in response. This value must be greater than 0.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param maxItems Optional integer. Specifies the maximum number of event sources to
     *         return in response. This value must be greater than 0.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListEventSourceMappingsRequest withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEventSourceArn() != null) sb.append("EventSourceArn: " + getEventSourceArn() + ",");
        if (getFunctionName() != null) sb.append("FunctionName: " + getFunctionName() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListEventSourceMappingsRequest == false) return false;
        ListEventSourceMappingsRequest other = (ListEventSourceMappingsRequest)obj;
        
        if (other.getEventSourceArn() == null ^ this.getEventSourceArn() == null) return false;
        if (other.getEventSourceArn() != null && other.getEventSourceArn().equals(this.getEventSourceArn()) == false) return false; 
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
    @Override
    public ListEventSourceMappingsRequest clone() {
        
            return (ListEventSourceMappingsRequest) super.clone();
    }

}
    