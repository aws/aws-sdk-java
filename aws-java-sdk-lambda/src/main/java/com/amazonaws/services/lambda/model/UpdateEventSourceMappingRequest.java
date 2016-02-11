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
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#updateEventSourceMapping(UpdateEventSourceMappingRequest) UpdateEventSourceMapping operation}.
 * <p>
 * You can update an event source mapping. This is useful if you want to
 * change the parameters of the existing mapping without losing your
 * position in the stream. You can change which function will receive the
 * stream records, but to change the stream itself, you must create a new
 * mapping.
 * </p>
 * <p>
 * If you are using the versioning feature, you can update the event
 * source mapping to map to a specific Lambda function version or alias
 * as described in the <code>FunctionName</code> parameter. For
 * information about the versioning feature, see
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
 * .
 * </p>
 * <p>
 * If you disable the event source mapping, AWS Lambda stops polling. If
 * you enable again, it will resume polling from the time it had stopped
 * polling, so you don't lose processing of any records. However, if you
 * delete event source mapping and create it again, it will reset.
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>lambda:UpdateEventSourceMapping</code> action.
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#updateEventSourceMapping(UpdateEventSourceMappingRequest)
 */
public class UpdateEventSourceMappingRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The event source mapping identifier.
     */
    private String uUID;

    /**
     * The Lambda function to which you want the stream records sent. <p> You
     * can specify a function name (for example, <code>Thumbnail</code>) or
     * you can specify Amazon Resource Name (ARN) of the function (for
     * example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * AWS Lambda also allows you to specify a partial ARN (for example,
     * <code>account-id:Thumbnail</code>). <p>If you are using versioning,
     * you can also provide a qualified function ARN (ARN that is qualified
     * with function version or alias name as suffix). For more information
     * about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS
     * Lambda Function Versioning and Aliases</a> <p>Note that the length
     * constraint applies only to the ARN. If you specify only the function
     * name, it is limited to 64 character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     */
    private String functionName;

    /**
     * Specifies whether AWS Lambda should actively poll the stream or not.
     * If disabled, AWS Lambda will not poll the stream.
     */
    private Boolean enabled;

    /**
     * The maximum number of stream records that can be sent to your Lambda
     * function for a single invocation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer batchSize;

    /**
     * The event source mapping identifier.
     *
     * @return The event source mapping identifier.
     */
    public String getUUID() {
        return uUID;
    }
    
    /**
     * The event source mapping identifier.
     *
     * @param uUID The event source mapping identifier.
     */
    public void setUUID(String uUID) {
        this.uUID = uUID;
    }
    
    /**
     * The event source mapping identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uUID The event source mapping identifier.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateEventSourceMappingRequest withUUID(String uUID) {
        this.uUID = uUID;
        return this;
    }

    /**
     * The Lambda function to which you want the stream records sent. <p> You
     * can specify a function name (for example, <code>Thumbnail</code>) or
     * you can specify Amazon Resource Name (ARN) of the function (for
     * example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * AWS Lambda also allows you to specify a partial ARN (for example,
     * <code>account-id:Thumbnail</code>). <p>If you are using versioning,
     * you can also provide a qualified function ARN (ARN that is qualified
     * with function version or alias name as suffix). For more information
     * about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS
     * Lambda Function Versioning and Aliases</a> <p>Note that the length
     * constraint applies only to the ARN. If you specify only the function
     * name, it is limited to 64 character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @return The Lambda function to which you want the stream records sent. <p> You
     *         can specify a function name (for example, <code>Thumbnail</code>) or
     *         you can specify Amazon Resource Name (ARN) of the function (for
     *         example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         AWS Lambda also allows you to specify a partial ARN (for example,
     *         <code>account-id:Thumbnail</code>). <p>If you are using versioning,
     *         you can also provide a qualified function ARN (ARN that is qualified
     *         with function version or alias name as suffix). For more information
     *         about versioning, see <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS
     *         Lambda Function Versioning and Aliases</a> <p>Note that the length
     *         constraint applies only to the ARN. If you specify only the function
     *         name, it is limited to 64 character in length.
     */
    public String getFunctionName() {
        return functionName;
    }
    
    /**
     * The Lambda function to which you want the stream records sent. <p> You
     * can specify a function name (for example, <code>Thumbnail</code>) or
     * you can specify Amazon Resource Name (ARN) of the function (for
     * example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * AWS Lambda also allows you to specify a partial ARN (for example,
     * <code>account-id:Thumbnail</code>). <p>If you are using versioning,
     * you can also provide a qualified function ARN (ARN that is qualified
     * with function version or alias name as suffix). For more information
     * about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS
     * Lambda Function Versioning and Aliases</a> <p>Note that the length
     * constraint applies only to the ARN. If you specify only the function
     * name, it is limited to 64 character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName The Lambda function to which you want the stream records sent. <p> You
     *         can specify a function name (for example, <code>Thumbnail</code>) or
     *         you can specify Amazon Resource Name (ARN) of the function (for
     *         example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         AWS Lambda also allows you to specify a partial ARN (for example,
     *         <code>account-id:Thumbnail</code>). <p>If you are using versioning,
     *         you can also provide a qualified function ARN (ARN that is qualified
     *         with function version or alias name as suffix). For more information
     *         about versioning, see <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS
     *         Lambda Function Versioning and Aliases</a> <p>Note that the length
     *         constraint applies only to the ARN. If you specify only the function
     *         name, it is limited to 64 character in length.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    /**
     * The Lambda function to which you want the stream records sent. <p> You
     * can specify a function name (for example, <code>Thumbnail</code>) or
     * you can specify Amazon Resource Name (ARN) of the function (for
     * example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * AWS Lambda also allows you to specify a partial ARN (for example,
     * <code>account-id:Thumbnail</code>). <p>If you are using versioning,
     * you can also provide a qualified function ARN (ARN that is qualified
     * with function version or alias name as suffix). For more information
     * about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS
     * Lambda Function Versioning and Aliases</a> <p>Note that the length
     * constraint applies only to the ARN. If you specify only the function
     * name, it is limited to 64 character in length.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName The Lambda function to which you want the stream records sent. <p> You
     *         can specify a function name (for example, <code>Thumbnail</code>) or
     *         you can specify Amazon Resource Name (ARN) of the function (for
     *         example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         AWS Lambda also allows you to specify a partial ARN (for example,
     *         <code>account-id:Thumbnail</code>). <p>If you are using versioning,
     *         you can also provide a qualified function ARN (ARN that is qualified
     *         with function version or alias name as suffix). For more information
     *         about versioning, see <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS
     *         Lambda Function Versioning and Aliases</a> <p>Note that the length
     *         constraint applies only to the ARN. If you specify only the function
     *         name, it is limited to 64 character in length.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateEventSourceMappingRequest withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * Specifies whether AWS Lambda should actively poll the stream or not.
     * If disabled, AWS Lambda will not poll the stream.
     *
     * @return Specifies whether AWS Lambda should actively poll the stream or not.
     *         If disabled, AWS Lambda will not poll the stream.
     */
    public Boolean isEnabled() {
        return enabled;
    }
    
    /**
     * Specifies whether AWS Lambda should actively poll the stream or not.
     * If disabled, AWS Lambda will not poll the stream.
     *
     * @param enabled Specifies whether AWS Lambda should actively poll the stream or not.
     *         If disabled, AWS Lambda will not poll the stream.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    /**
     * Specifies whether AWS Lambda should actively poll the stream or not.
     * If disabled, AWS Lambda will not poll the stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled Specifies whether AWS Lambda should actively poll the stream or not.
     *         If disabled, AWS Lambda will not poll the stream.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateEventSourceMappingRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Specifies whether AWS Lambda should actively poll the stream or not.
     * If disabled, AWS Lambda will not poll the stream.
     *
     * @return Specifies whether AWS Lambda should actively poll the stream or not.
     *         If disabled, AWS Lambda will not poll the stream.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * The maximum number of stream records that can be sent to your Lambda
     * function for a single invocation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return The maximum number of stream records that can be sent to your Lambda
     *         function for a single invocation.
     */
    public Integer getBatchSize() {
        return batchSize;
    }
    
    /**
     * The maximum number of stream records that can be sent to your Lambda
     * function for a single invocation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param batchSize The maximum number of stream records that can be sent to your Lambda
     *         function for a single invocation.
     */
    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }
    
    /**
     * The maximum number of stream records that can be sent to your Lambda
     * function for a single invocation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param batchSize The maximum number of stream records that can be sent to your Lambda
     *         function for a single invocation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateEventSourceMappingRequest withBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
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
        if (getUUID() != null) sb.append("UUID: " + getUUID() + ",");
        if (getFunctionName() != null) sb.append("FunctionName: " + getFunctionName() + ",");
        if (isEnabled() != null) sb.append("Enabled: " + isEnabled() + ",");
        if (getBatchSize() != null) sb.append("BatchSize: " + getBatchSize() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUUID() == null) ? 0 : getUUID().hashCode()); 
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode()); 
        hashCode = prime * hashCode + ((isEnabled() == null) ? 0 : isEnabled().hashCode()); 
        hashCode = prime * hashCode + ((getBatchSize() == null) ? 0 : getBatchSize().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateEventSourceMappingRequest == false) return false;
        UpdateEventSourceMappingRequest other = (UpdateEventSourceMappingRequest)obj;
        
        if (other.getUUID() == null ^ this.getUUID() == null) return false;
        if (other.getUUID() != null && other.getUUID().equals(this.getUUID()) == false) return false; 
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        if (other.getBatchSize() == null ^ this.getBatchSize() == null) return false;
        if (other.getBatchSize() != null && other.getBatchSize().equals(this.getBatchSize()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateEventSourceMappingRequest clone() {
        
            return (UpdateEventSourceMappingRequest) super.clone();
    }

}
    